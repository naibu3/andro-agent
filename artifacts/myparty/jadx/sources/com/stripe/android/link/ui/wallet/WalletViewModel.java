package com.stripe.android.link.ui.wallet;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.InputDeviceCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.facebook.GraphResponse;
import com.stripe.android.common.exception.ExceptionKtKt;
import com.stripe.android.core.Logger;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.utils.FeatureFlags;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.link.ConsumerState;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.LinkDismissalCoordinator;
import com.stripe.android.link.LinkLaunchMode;
import com.stripe.android.link.LinkPaymentMethod;
import com.stripe.android.link.LinkScreen;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.account.LinkAccountUtilKt;
import com.stripe.android.link.confirmation.CompleteLinkFlow;
import com.stripe.android.link.confirmation.DefaultCompleteLinkFlow;
import com.stripe.android.link.confirmation.LinkConfirmationHandler;
import com.stripe.android.link.injection.NativeLinkComponent;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.model.SupportedPaymentMethodTypesKt;
import com.stripe.android.link.ui.PrimaryButtonKt;
import com.stripe.android.link.ui.wallet.AddBankAccountState;
import com.stripe.android.link.ui.wallet.AddPaymentMethodOption;
import com.stripe.android.link.ui.wallet.WalletViewModel;
import com.stripe.android.link.utils.LinkBillingDetailsUtilsKt;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.ConsumerPaymentDetailsUpdateParams;
import com.stripe.android.model.LinkAccountSession;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.ui.core.elements.CvcController;
import com.stripe.android.uicore.elements.DateConfig;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import com.stripe.android.uicore.forms.FormFieldEntry;
import com.stripe.android.uicore.navigation.NavigationManager;
import com.stripe.android.uicore.utils.StateFlowsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: WalletViewModel.kt */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 g2\u00020\u0001:\u0001gB\u0080\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00180\u0013\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00180\u0013¢\u0006\u0004\b\u001b\u0010\u001cJ\"\u00106\u001a\u00020\u00182\b\u0010%\u001a\u0004\u0018\u00010!2\b\b\u0002\u00107\u001a\u000208H\u0082@¢\u0006\u0002\u00109J\u0010\u0010:\u001a\u00020\u00182\u0006\u0010;\u001a\u00020<H\u0002J\b\u0010=\u001a\u000208H\u0002J\u001c\u0010>\u001a\u00020\u00182\f\u0010?\u001a\b\u0012\u0004\u0012\u00020A0@H\u0082@¢\u0006\u0002\u0010BJ\f\u0010C\u001a\u000208*\u00020DH\u0002J\u000e\u0010E\u001a\u00020\u00182\u0006\u0010F\u001a\u00020DJ\u000e\u0010G\u001a\u00020\u00182\u0006\u0010H\u001a\u000208J\u0006\u0010I\u001a\u00020\u0018J\u001c\u0010J\u001a\u00020\u00182\u0006\u0010K\u001a\u0002082\n\b\u0002\u0010L\u001a\u0004\u0018\u00010MH\u0002J\u0016\u0010N\u001a\u00020\u00182\u0006\u0010O\u001a\u00020DH\u0082@¢\u0006\u0002\u0010PJ\u0010\u0010Q\u001a\u00020\u00182\u0006\u0010R\u001a\u00020<H\u0002J\u0016\u0010S\u001a\u00020\u00182\u0006\u0010T\u001a\u00020DH\u0082@¢\u0006\u0002\u0010PJ\u0006\u0010U\u001a\u00020\u0018J\u000e\u0010V\u001a\u00020\u00182\u0006\u0010F\u001a\u00020DJ\u000e\u0010W\u001a\u00020\u00182\u0006\u0010F\u001a\u00020DJ\u000e\u0010X\u001a\u00020\u00182\u0006\u0010F\u001a\u00020DJ\u000e\u0010Y\u001a\u00020\u00182\u0006\u0010Z\u001a\u00020[J\b\u0010\\\u001a\u00020\u0018H\u0002J\u000e\u0010]\u001a\u00020\u00182\u0006\u0010^\u001a\u000208J\u000e\u0010_\u001a\u00020\u00182\u0006\u0010`\u001a\u00020aJ\u0006\u0010b\u001a\u00020\u0018J\u0018\u0010c\u001a\u00020\u00182\u0006\u0010R\u001a\u00020<2\u0006\u0010d\u001a\u00020!H\u0002J\u0018\u0010e\u001a\u00020\u00182\u0006\u0010R\u001a\u00020<2\u0006\u0010d\u001a\u00020!H\u0002J\u000e\u0010f\u001a\b\u0012\u0004\u0012\u00020[0@H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00180\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00180\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010%\u001a\u0004\u0018\u00010!*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\u0004\u0018\u00010!*\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020$0+¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010.\u001a\u00020/¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u00102\u001a\u000203¢\u0006\b\n\u0000\u001a\u0004\b4\u00105¨\u0006h"}, d2 = {"Lcom/stripe/android/link/ui/wallet/WalletViewModel;", "Landroidx/lifecycle/ViewModel;", "configuration", "Lcom/stripe/android/link/LinkConfiguration;", "linkAccount", "Lcom/stripe/android/link/model/LinkAccount;", "linkAccountManager", "Lcom/stripe/android/link/account/LinkAccountManager;", "completeLinkFlow", "Lcom/stripe/android/link/confirmation/CompleteLinkFlow;", "logger", "Lcom/stripe/android/core/Logger;", "navigationManager", "Lcom/stripe/android/uicore/navigation/NavigationManager;", "linkLaunchMode", "Lcom/stripe/android/link/LinkLaunchMode;", "dismissalCoordinator", "Lcom/stripe/android/link/LinkDismissalCoordinator;", "navigateAndClearStack", "Lkotlin/Function1;", "Lcom/stripe/android/link/LinkScreen;", "Lkotlin/ParameterName;", "name", "route", "", "dismissWithResult", "Lcom/stripe/android/link/LinkActivityResult;", "<init>", "(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/confirmation/CompleteLinkFlow;Lcom/stripe/android/core/Logger;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/link/LinkDismissalCoordinator;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "supportedPaymentMethodTypes", "", "", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/link/ui/wallet/WalletUiState;", "selectedItemId", "getSelectedItemId", "(Lcom/stripe/android/link/LinkLaunchMode;)Ljava/lang/String;", "paymentSelectionHint", "getPaymentSelectionHint", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "expiryDateController", "Lcom/stripe/android/uicore/elements/SimpleTextFieldController;", "getExpiryDateController", "()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;", "cvcController", "Lcom/stripe/android/ui/core/elements/CvcController;", "getCvcController", "()Lcom/stripe/android/ui/core/elements/CvcController;", "loadPaymentDetails", "isAfterAdding", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onFatal", "fatalError", "", "shouldAutoSelectDefaultPaymentMethod", "handleAutoSelection", "paymentDetails", "", "Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isReadyForUse", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "onItemSelected", "item", "onExpandedChanged", "expanded", "onPrimaryButtonClicked", "setProcessingState", "isProcessing", "errorMessage", "Lcom/stripe/android/core/strings/ResolvableString;", "handleExpiredCard", "paymentDetail", "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleUpdateError", "error", "performPaymentConfirmation", "selectedPaymentDetails", "onPayAnotherWayClicked", "onRemoveClicked", "onUpdateClicked", "onSetDefaultClicked", "onAddPaymentMethodOptionClicked", "option", "Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption;", "onAddBankAccountClicked", "onPresentFinancialConnections", GraphResponse.SUCCESS_KEY, "onFinancialConnectionsResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;", "onDismissAlert", "updateErrorMessageAndStopProcessing", "loggerMessage", "onAddBankAccountError", "getAddPaymentMethodOptions", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WalletViewModel extends ViewModel {
    private final MutableStateFlow<WalletUiState> _uiState;
    private final CompleteLinkFlow completeLinkFlow;
    private final LinkConfiguration configuration;
    private final CvcController cvcController;
    private final Function1<LinkActivityResult, Unit> dismissWithResult;
    private final LinkDismissalCoordinator dismissalCoordinator;
    private final SimpleTextFieldController expiryDateController;
    private final LinkAccount linkAccount;
    private final LinkAccountManager linkAccountManager;
    private final LinkLaunchMode linkLaunchMode;
    private final Logger logger;
    private final Function1<LinkScreen, Unit> navigateAndClearStack;
    private final NavigationManager navigationManager;
    private final StripeIntent stripeIntent;
    private final Set<String> supportedPaymentMethodTypes;
    private final StateFlow<WalletUiState> uiState;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: WalletViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.wallet.WalletViewModel", f = "WalletViewModel.kt", i = {0, 0, 0, 0}, l = {295, 299}, m = "handleExpiredCard", n = {"this", "paymentDetail", "$this$withDismissalDisabled$iv", "originalDismissible$iv"}, s = {"L$0", "L$1", "L$2", "Z$0"})
    /* renamed from: com.stripe.android.link.ui.wallet.WalletViewModel$handleExpiredCard$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WalletViewModel.this.handleExpiredCard(null, this);
        }
    }

    /* compiled from: WalletViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.wallet.WalletViewModel", f = "WalletViewModel.kt", i = {0, 0, 0}, l = {170}, m = "loadPaymentDetails", n = {"this", "selectedItemId", "isAfterAdding"}, s = {"L$0", "L$1", "Z$0"})
    /* renamed from: com.stripe.android.link.ui.wallet.WalletViewModel$loadPaymentDetails$1, reason: invalid class name and case insensitive filesystem */
    static final class C10601 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C10601(Continuation<? super C10601> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WalletViewModel.this.loadPaymentDetails(null, false, this);
        }
    }

    /* compiled from: WalletViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.wallet.WalletViewModel", f = "WalletViewModel.kt", i = {0}, l = {342}, m = "performPaymentConfirmation", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.link.ui.wallet.WalletViewModel$performPaymentConfirmation$1, reason: invalid class name and case insensitive filesystem */
    static final class C10661 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C10661(Continuation<? super C10661> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WalletViewModel.this.performPaymentConfirmation(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public WalletViewModel(LinkConfiguration configuration, LinkAccount linkAccount, LinkAccountManager linkAccountManager, CompleteLinkFlow completeLinkFlow, Logger logger, NavigationManager navigationManager, LinkLaunchMode linkLaunchMode, LinkDismissalCoordinator dismissalCoordinator, Function1<? super LinkScreen, Unit> navigateAndClearStack, Function1<? super LinkActivityResult, Unit> dismissWithResult) {
        WalletUiState value;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(linkAccount, "linkAccount");
        Intrinsics.checkNotNullParameter(linkAccountManager, "linkAccountManager");
        Intrinsics.checkNotNullParameter(completeLinkFlow, "completeLinkFlow");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(linkLaunchMode, "linkLaunchMode");
        Intrinsics.checkNotNullParameter(dismissalCoordinator, "dismissalCoordinator");
        Intrinsics.checkNotNullParameter(navigateAndClearStack, "navigateAndClearStack");
        Intrinsics.checkNotNullParameter(dismissWithResult, "dismissWithResult");
        this.configuration = configuration;
        this.linkAccount = linkAccount;
        this.linkAccountManager = linkAccountManager;
        this.completeLinkFlow = completeLinkFlow;
        this.logger = logger;
        this.navigationManager = navigationManager;
        this.linkLaunchMode = linkLaunchMode;
        this.dismissalCoordinator = dismissalCoordinator;
        this.navigateAndClearStack = navigateAndClearStack;
        this.dismissWithResult = dismissWithResult;
        StripeIntent stripeIntent = configuration.getStripeIntent();
        this.stripeIntent = stripeIntent;
        this.supportedPaymentMethodTypes = SupportedPaymentMethodTypesKt.supportedPaymentMethodTypes(stripeIntent, linkAccount);
        List listEmptyList = CollectionsKt.emptyList();
        String email = linkAccount.getEmail();
        boolean zIsSetupForFutureUsage = WalletViewModelKt.isSetupForFutureUsage(stripeIntent, configuration.getPassthroughModeEnabled());
        String merchantName = configuration.getMerchantName();
        MutableStateFlow<WalletUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(new WalletUiState(listEmptyList, email, configuration.getCardBrandFilter(), null, false, zIsSetupForFutureUsage, merchantName, PrimaryButtonKt.completePaymentButtonLabel(configuration.getStripeIntent(), linkLaunchMode), WalletViewModelKt.secondaryButtonLabel(configuration.getStripeIntent(), linkLaunchMode), false, getAddPaymentMethodOptions(), configuration.getCollectMissingBillingDetailsForExistingPaymentMethods(), Boolean.valueOf(getSelectedItemId(linkLaunchMode) != null), null, null, null, null, null, null, getPaymentSelectionHint(linkLaunchMode), shouldAutoSelectDefaultPaymentMethod(), false, 2613248, null));
        this._uiState = MutableStateFlow;
        StateFlow<WalletUiState> stateFlowAsStateFlow = FlowKt.asStateFlow(MutableStateFlow);
        this.uiState = stateFlowAsStateFlow;
        this.expiryDateController = new SimpleTextFieldController(new DateConfig(), false, null, null, 14, null);
        this.cvcController = new CvcController(null, StateFlowsKt.mapAsStateFlow(stateFlowAsStateFlow, new Function1() { // from class: com.stripe.android.link.ui.wallet.WalletViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WalletViewModel.cvcController$lambda$1((WalletUiState) obj);
            }
        }), null, false, 13, null);
        do {
            value = MutableStateFlow.getValue();
        } while (!MutableStateFlow.compareAndSet(value, WalletUiState.copy$default(value, null, null, null, null, true, false, null, null, null, false, null, false, null, null, null, null, null, null, null, null, false, false, 4194287, null)));
        WalletViewModel walletViewModel = this;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(walletViewModel), null, null, new AnonymousClass2(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(walletViewModel), null, null, new AnonymousClass3(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(walletViewModel), null, null, new AnonymousClass4(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(walletViewModel), null, null, new AnonymousClass5(null), 3, null);
    }

    public final String getSelectedItemId(LinkLaunchMode linkLaunchMode) {
        Intrinsics.checkNotNullParameter(linkLaunchMode, "<this>");
        if ((linkLaunchMode instanceof LinkLaunchMode.Full) || (linkLaunchMode instanceof LinkLaunchMode.Confirmation)) {
            return null;
        }
        if (!(linkLaunchMode instanceof LinkLaunchMode.PaymentMethodSelection)) {
            if (linkLaunchMode instanceof LinkLaunchMode.Authentication) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        ConsumerPaymentDetails.PaymentDetails selectedPayment = ((LinkLaunchMode.PaymentMethodSelection) linkLaunchMode).getSelectedPayment();
        if (selectedPayment != null) {
            return selectedPayment.getId();
        }
        return null;
    }

    private final String getPaymentSelectionHint(LinkLaunchMode linkLaunchMode) {
        String hint;
        LinkLaunchMode.PaymentMethodSelection paymentMethodSelection = linkLaunchMode instanceof LinkLaunchMode.PaymentMethodSelection ? (LinkLaunchMode.PaymentMethodSelection) linkLaunchMode : null;
        if (paymentMethodSelection == null || (hint = paymentMethodSelection.getHint()) == null) {
            return null;
        }
        if (this.configuration.getEnableLinkPaymentSelectionHint() || FeatureFlags.INSTANCE.getForceEnableLinkPaymentSelectionHint().isEnabled()) {
            return hint;
        }
        return null;
    }

    public final StateFlow<WalletUiState> getUiState() {
        return this.uiState;
    }

    public final SimpleTextFieldController getExpiryDateController() {
        return this.expiryDateController;
    }

    public final CvcController getCvcController() {
        return this.cvcController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardBrand cvcController$lambda$1(WalletUiState it) {
        CardBrand brand;
        Intrinsics.checkNotNullParameter(it, "it");
        ConsumerPaymentDetails.PaymentDetails selectedItem = it.getSelectedItem();
        ConsumerPaymentDetails.Card card = selectedItem instanceof ConsumerPaymentDetails.Card ? (ConsumerPaymentDetails.Card) selectedItem : null;
        return (card == null || (brand = card.getBrand()) == null) ? CardBrand.Unknown : brand;
    }

    /* compiled from: WalletViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.wallet.WalletViewModel$2", f = "WalletViewModel.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.link.ui.wallet.WalletViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WalletViewModel.this.new AnonymousClass2(continuation);
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
                WalletViewModel walletViewModel = WalletViewModel.this;
                this.label = 1;
                if (WalletViewModel.loadPaymentDetails$default(walletViewModel, walletViewModel.getSelectedItemId(walletViewModel.linkLaunchMode), false, this, 2, null) == coroutine_suspended) {
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

    /* compiled from: WalletViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.wallet.WalletViewModel$3", f = "WalletViewModel.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.link.ui.wallet.WalletViewModel$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WalletViewModel.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: WalletViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "paymentDetailsState", "Lcom/stripe/android/link/ConsumerState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.link.ui.wallet.WalletViewModel$3$1", f = "WalletViewModel.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.link.ui.wallet.WalletViewModel$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<ConsumerState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ WalletViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(WalletViewModel walletViewModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = walletViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ConsumerState consumerState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(consumerState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                WalletUiState walletUiStateUpdateWithResponse;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ConsumerState consumerState = (ConsumerState) this.L$0;
                    if (consumerState.getPaymentDetails().isEmpty()) {
                        this.this$0.navigateAndClearStack.invoke(LinkScreen.PaymentMethod.INSTANCE);
                    } else {
                        MutableStateFlow mutableStateFlow = this.this$0._uiState;
                        do {
                            value = mutableStateFlow.getValue();
                            walletUiStateUpdateWithResponse = ((WalletUiState) value).updateWithResponse(consumerState.getPaymentDetails());
                        } while (!mutableStateFlow.compareAndSet(value, walletUiStateUpdateWithResponse));
                        if (this.this$0.shouldAutoSelectDefaultPaymentMethod() && !walletUiStateUpdateWithResponse.getHasAttemptedAutoSelection()) {
                            this.label = 1;
                            if (this.this$0.handleAutoSelection(consumerState.getPaymentDetails(), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (FlowKt.collectLatest(FlowKt.filterNotNull(WalletViewModel.this.linkAccountManager.getConsumerState()), new AnonymousClass1(WalletViewModel.this, null), this) == coroutine_suspended) {
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

    /* compiled from: WalletViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.wallet.WalletViewModel$4", f = "WalletViewModel.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.link.ui.wallet.WalletViewModel$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WalletViewModel.this.new AnonymousClass4(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: WalletViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "input", "Lcom/stripe/android/uicore/forms/FormFieldEntry;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.link.ui.wallet.WalletViewModel$4$1", f = "WalletViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.link.ui.wallet.WalletViewModel$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<FormFieldEntry, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ WalletViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(WalletViewModel walletViewModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = walletViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FormFieldEntry formFieldEntry, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(formFieldEntry, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    FormFieldEntry formFieldEntry = (FormFieldEntry) this.L$0;
                    MutableStateFlow mutableStateFlow = this.this$0._uiState;
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value, WalletUiState.copy$default((WalletUiState) value, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, formFieldEntry, null, null, null, null, false, false, 4161535, null)));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (FlowKt.collectLatest(WalletViewModel.this.getExpiryDateController().getFormFieldValue(), new AnonymousClass1(WalletViewModel.this, null), this) == coroutine_suspended) {
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

    /* compiled from: WalletViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.wallet.WalletViewModel$5", f = "WalletViewModel.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.link.ui.wallet.WalletViewModel$5, reason: invalid class name */
    static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WalletViewModel.this.new AnonymousClass5(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: WalletViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "input", "Lcom/stripe/android/uicore/forms/FormFieldEntry;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.link.ui.wallet.WalletViewModel$5$1", f = "WalletViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.link.ui.wallet.WalletViewModel$5$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<FormFieldEntry, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ WalletViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(WalletViewModel walletViewModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = walletViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FormFieldEntry formFieldEntry, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(formFieldEntry, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    FormFieldEntry formFieldEntry = (FormFieldEntry) this.L$0;
                    MutableStateFlow mutableStateFlow = this.this$0._uiState;
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value, WalletUiState.copy$default((WalletUiState) value, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, formFieldEntry, null, null, null, false, false, 4128767, null)));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (FlowKt.collectLatest(WalletViewModel.this.getCvcController().getFormFieldValue(), new AnonymousClass1(WalletViewModel.this, null), this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadPaymentDetails(String str, boolean z, Continuation<? super Unit> continuation) {
        C10601 c10601;
        Object objMo7711listPaymentDetailsgIAlus;
        WalletViewModel walletViewModel;
        String str2;
        boolean z2;
        ConsumerPaymentDetails consumerPaymentDetails;
        if (continuation instanceof C10601) {
            c10601 = (C10601) continuation;
            if ((c10601.label & Integer.MIN_VALUE) != 0) {
                c10601.label -= Integer.MIN_VALUE;
            } else {
                c10601 = new C10601(continuation);
            }
        }
        Object obj = c10601.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c10601.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LinkAccountManager linkAccountManager = this.linkAccountManager;
            Set<String> setSupportedPaymentMethodTypes = SupportedPaymentMethodTypesKt.supportedPaymentMethodTypes(this.stripeIntent, this.linkAccount);
            c10601.L$0 = this;
            c10601.L$1 = str;
            c10601.Z$0 = z;
            c10601.label = 1;
            objMo7711listPaymentDetailsgIAlus = linkAccountManager.mo7711listPaymentDetailsgIAlus(setSupportedPaymentMethodTypes, c10601);
            if (objMo7711listPaymentDetailsgIAlus == coroutine_suspended) {
                return coroutine_suspended;
            }
            walletViewModel = this;
            str2 = str;
            z2 = z;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = c10601.Z$0;
            String str3 = (String) c10601.L$1;
            walletViewModel = (WalletViewModel) c10601.L$0;
            ResultKt.throwOnFailure(obj);
            objMo7711listPaymentDetailsgIAlus = ((Result) obj).getValue();
            str2 = str3;
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo7711listPaymentDetailsgIAlus);
        if (thM9121exceptionOrNullimpl == null) {
            ConsumerPaymentDetails consumerPaymentDetails2 = (ConsumerPaymentDetails) objMo7711listPaymentDetailsgIAlus;
            MutableStateFlow<WalletUiState> mutableStateFlow = walletViewModel._uiState;
            while (true) {
                WalletUiState value = mutableStateFlow.getValue();
                MutableStateFlow<WalletUiState> mutableStateFlow2 = mutableStateFlow;
                WalletUiState walletUiState = value;
                consumerPaymentDetails = consumerPaymentDetails2;
                if (mutableStateFlow2.compareAndSet(value, WalletUiState.copy$default(walletUiState, null, null, null, str2, false, false, null, null, null, false, null, false, z2 ? Boxing.boxBoolean(false) : walletUiState.getUserSetIsExpanded(), null, z2 ? null : walletUiState.getErrorMessage(), null, null, z2 ? AddBankAccountState.Idle.INSTANCE : walletUiState.getAddBankAccountState(), null, null, false, false, 4042743, null))) {
                    break;
                }
                consumerPaymentDetails2 = consumerPaymentDetails;
                mutableStateFlow = mutableStateFlow2;
            }
            if (consumerPaymentDetails.getPaymentDetails().isEmpty()) {
                walletViewModel.navigateAndClearStack.invoke(LinkScreen.PaymentMethod.INSTANCE);
            }
        } else {
            walletViewModel.onFatal(thM9121exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object loadPaymentDetails$default(WalletViewModel walletViewModel, String str, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return walletViewModel.loadPaymentDetails(str, z, continuation);
    }

    private final void onFatal(Throwable fatalError) {
        this.logger.error("WalletViewModel Fatal error: ", fatalError);
        this.dismissWithResult.invoke(new LinkActivityResult.Failed(fatalError, LinkAccountUtilKt.getLinkAccountUpdate(this.linkAccountManager)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldAutoSelectDefaultPaymentMethod() {
        LinkLaunchMode linkLaunchMode = this.linkLaunchMode;
        return (linkLaunchMode instanceof LinkLaunchMode.PaymentMethodSelection) && ((LinkLaunchMode.PaymentMethodSelection) linkLaunchMode).getSelectedPayment() == null && this.configuration.getSkipWalletInFlowController();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleAutoSelection(List<LinkPaymentMethod.ConsumerPaymentDetails> list, Continuation<? super Unit> continuation) {
        Object next;
        WalletUiState value;
        WalletUiState value2;
        WalletUiState value3;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((LinkPaymentMethod.ConsumerPaymentDetails) next).getDetails().getIsDefault()) {
                break;
            }
        }
        LinkPaymentMethod.ConsumerPaymentDetails consumerPaymentDetails = (LinkPaymentMethod.ConsumerPaymentDetails) next;
        if (consumerPaymentDetails == null) {
            consumerPaymentDetails = (LinkPaymentMethod.ConsumerPaymentDetails) CollectionsKt.singleOrNull((List) list);
        }
        ConsumerPaymentDetails.PaymentDetails details = consumerPaymentDetails != null ? consumerPaymentDetails.getDetails() : null;
        MutableStateFlow<WalletUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, WalletUiState.copy$default(value, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, null, null, false, true, 2097151, null)));
        if (details != null && isReadyForUse(details)) {
            MutableStateFlow<WalletUiState> mutableStateFlow2 = this._uiState;
            do {
                value3 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value3, WalletUiState.copy$default(value3, null, null, null, details.getId(), false, false, null, null, null, false, null, false, null, null, null, null, null, null, null, null, false, false, 4194295, null)));
            Object objPerformPaymentConfirmation = performPaymentConfirmation(details, continuation);
            return objPerformPaymentConfirmation == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformPaymentConfirmation : Unit.INSTANCE;
        }
        MutableStateFlow<WalletUiState> mutableStateFlow3 = this._uiState;
        do {
            value2 = mutableStateFlow3.getValue();
        } while (!mutableStateFlow3.compareAndSet(value2, WalletUiState.copy$default(value2, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, null, null, false, false, 3145727, null)));
        return Unit.INSTANCE;
    }

    private final boolean isReadyForUse(ConsumerPaymentDetails.PaymentDetails paymentDetails) {
        ConsumerPaymentDetails.Card card = paymentDetails instanceof ConsumerPaymentDetails.Card ? (ConsumerPaymentDetails.Card) paymentDetails : null;
        return ((card != null && card.getRequiresCardDetailsRecollection()) || (!LinkBillingDetailsUtilsKt.supports(paymentDetails, this.configuration.getBillingDetailsCollectionConfiguration(), this.linkAccount) && this._uiState.getValue().getCollectMissingBillingDetailsForExistingPaymentMethods())) ? false : true;
    }

    public final void onItemSelected(ConsumerPaymentDetails.PaymentDetails item) {
        WalletUiState value;
        Intrinsics.checkNotNullParameter(item, "item");
        if (!Intrinsics.areEqual(item, this.uiState.getValue().getSelectedItem())) {
            this.expiryDateController.onRawValueChange("");
            this.cvcController.onRawValueChange("");
        }
        MutableStateFlow<WalletUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, WalletUiState.copy$default(value, null, null, null, item.getId(), false, false, null, null, null, false, null, false, null, null, null, null, null, null, null, null, false, false, 4190199, null)));
    }

    public final void onExpandedChanged(boolean expanded) {
        WalletUiState value;
        MutableStateFlow<WalletUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, WalletUiState.copy$default(value, null, null, null, null, false, false, null, null, null, false, null, false, Boolean.valueOf(expanded), null, null, null, null, null, null, null, false, false, 4190207, null)));
    }

    public final void onPrimaryButtonClicked() {
        ConsumerPaymentDetails.PaymentDetails selectedItem = this._uiState.getValue().getSelectedItem();
        if (selectedItem == null) {
            return;
        }
        setProcessingState$default(this, true, null, 2, null);
        ConsumerPaymentDetails.Card card = selectedItem instanceof ConsumerPaymentDetails.Card ? (ConsumerPaymentDetails.Card) selectedItem : null;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C10631(card != null && card.isExpired(), this, selectedItem, null), 3, null);
    }

    /* compiled from: WalletViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.wallet.WalletViewModel$onPrimaryButtonClicked$1", f = "WalletViewModel.kt", i = {}, l = {272, 273}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.link.ui.wallet.WalletViewModel$onPrimaryButtonClicked$1, reason: invalid class name and case insensitive filesystem */
    static final class C10631 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isExpired;
        final /* synthetic */ ConsumerPaymentDetails.PaymentDetails $paymentDetail;
        int label;
        final /* synthetic */ WalletViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10631(boolean z, WalletViewModel walletViewModel, ConsumerPaymentDetails.PaymentDetails paymentDetails, Continuation<? super C10631> continuation) {
            super(2, continuation);
            this.$isExpired = z;
            this.this$0 = walletViewModel;
            this.$paymentDetail = paymentDetails;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C10631(this.$isExpired, this.this$0, this.$paymentDetail, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
        
            if (r4.this$0.handleExpiredCard(r4.$paymentDetail, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        
            if (r4.this$0.performPaymentConfirmation(r4.$paymentDetail, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$isExpired) {
                    this.label = 1;
                } else {
                    this.label = 2;
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static /* synthetic */ void setProcessingState$default(WalletViewModel walletViewModel, boolean z, ResolvableString resolvableString, int i, Object obj) {
        if ((i & 2) != 0) {
            resolvableString = null;
        }
        walletViewModel.setProcessingState(z, resolvableString);
    }

    private final void setProcessingState(boolean isProcessing, ResolvableString errorMessage) {
        WalletUiState value;
        MutableStateFlow<WalletUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, WalletUiState.copy$default(value, null, null, null, null, isProcessing, false, null, null, null, false, null, false, null, null, errorMessage, null, null, null, null, null, false, false, 4177903, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ea, code lost:
    
        if (r3.performPaymentConfirmation((com.stripe.android.model.ConsumerPaymentDetails.PaymentDetails) r1, r4) == r0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleExpiredCard(ConsumerPaymentDetails.PaymentDetails paymentDetails, Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Throwable th;
        LinkDismissalCoordinator linkDismissalCoordinator;
        boolean z;
        Object objM7728updatePaymentDetails0E7RQCE$default;
        WalletViewModel walletViewModel;
        ConsumerPaymentDetails.PaymentDetails paymentDetails2;
        Throwable thM9121exceptionOrNullimpl;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        AnonymousClass1 anonymousClass12 = anonymousClass1;
        Object obj = anonymousClass12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass12.label;
        boolean z2 = false;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PaymentMethodCreateParams paymentMethodCreateParams = WalletViewModelKt.toPaymentMethodCreateParams(this.uiState.getValue());
            LinkDismissalCoordinator linkDismissalCoordinator2 = this.dismissalCoordinator;
            boolean z3 = linkDismissalCoordinator2.get_canDismiss();
            linkDismissalCoordinator2.setDismissible(false);
            try {
                ConsumerPaymentDetailsUpdateParams consumerPaymentDetailsUpdateParams = new ConsumerPaymentDetailsUpdateParams(paymentDetails.getId(), Boxing.boxBoolean(paymentDetails.getIsDefault()), paymentMethodCreateParams.toParamMap());
                LinkAccountManager linkAccountManager = this.linkAccountManager;
                anonymousClass12.L$0 = this;
                anonymousClass12.L$1 = paymentDetails;
                anonymousClass12.L$2 = linkDismissalCoordinator2;
                anonymousClass12.Z$0 = z3;
                anonymousClass12.label = 1;
                objM7728updatePaymentDetails0E7RQCE$default = LinkAccountManager.DefaultImpls.m7728updatePaymentDetails0E7RQCE$default(linkAccountManager, consumerPaymentDetailsUpdateParams, null, anonymousClass12, 2, null);
                if (objM7728updatePaymentDetails0E7RQCE$default != coroutine_suspended) {
                    walletViewModel = this;
                    paymentDetails2 = paymentDetails;
                    linkDismissalCoordinator = linkDismissalCoordinator2;
                    z = z3;
                    linkDismissalCoordinator.setDismissible(z);
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM7728updatePaymentDetails0E7RQCE$default);
                    if (thM9121exceptionOrNullimpl == null) {
                    }
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            } catch (Throwable th2) {
                th = th2;
                linkDismissalCoordinator = linkDismissalCoordinator2;
                z = z3;
                linkDismissalCoordinator.setDismissible(z);
                throw th;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        z = anonymousClass12.Z$0;
        linkDismissalCoordinator = (LinkDismissalCoordinator) anonymousClass12.L$2;
        paymentDetails2 = (ConsumerPaymentDetails.PaymentDetails) anonymousClass12.L$1;
        walletViewModel = (WalletViewModel) anonymousClass12.L$0;
        try {
            ResultKt.throwOnFailure(obj);
            objM7728updatePaymentDetails0E7RQCE$default = ((Result) obj).getValue();
            linkDismissalCoordinator.setDismissible(z);
            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM7728updatePaymentDetails0E7RQCE$default);
            if (thM9121exceptionOrNullimpl == null) {
                walletViewModel.handleUpdateError(thM9121exceptionOrNullimpl);
            } else {
                Object obj2 = null;
                for (Object obj3 : ((ConsumerPaymentDetails) objM7728updatePaymentDetails0E7RQCE$default).getPaymentDetails()) {
                    if (Intrinsics.areEqual(((ConsumerPaymentDetails.PaymentDetails) obj3).getId(), paymentDetails2.getId())) {
                        if (z2) {
                            throw new IllegalArgumentException("Collection contains more than one matching element.");
                        }
                        obj2 = obj3;
                        z2 = true;
                    }
                }
                if (z2) {
                    anonymousClass12.L$0 = null;
                    anonymousClass12.L$1 = null;
                    anonymousClass12.L$2 = null;
                    anonymousClass12.label = 2;
                } else {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            th = th3;
            linkDismissalCoordinator.setDismissible(z);
            throw th;
        }
    }

    private final void handleUpdateError(Throwable error) {
        WalletUiState value;
        MutableStateFlow<WalletUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, WalletUiState.copy$default(value, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, ExceptionKtKt.stripeErrorMessage(error), null, false, false, 3932143, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performPaymentConfirmation(ConsumerPaymentDetails.PaymentDetails paymentDetails, Continuation<? super Unit> continuation) {
        C10661 c10661;
        String unredactedPhoneNumber;
        WalletViewModel walletViewModel;
        List<LinkPaymentMethod.ConsumerPaymentDetails> paymentDetails2;
        WalletUiState value;
        WalletUiState value2;
        if (continuation instanceof C10661) {
            c10661 = (C10661) continuation;
            if ((c10661.label & Integer.MIN_VALUE) != 0) {
                c10661.label -= Integer.MIN_VALUE;
            } else {
                c10661 = new C10661(continuation);
            }
        }
        Object objInvoke = c10661.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c10661.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objInvoke);
            LinkPaymentMethod.ConsumerPaymentDetails consumerPaymentDetails = null;
            Object obj = null;
            consumerPaymentDetails = null;
            if (!LinkBillingDetailsUtilsKt.supports(paymentDetails, this.configuration.getBillingDetailsCollectionConfiguration(), this.linkAccount) && this._uiState.getValue().getCollectMissingBillingDetailsForExistingPaymentMethods()) {
                setProcessingState$default(this, false, null, 2, null);
                FormFieldEntry value3 = this.cvcController.getFormFieldValue().getValue();
                if (!value3.isComplete()) {
                    value3 = null;
                }
                FormFieldEntry formFieldEntry = value3;
                NavigationManager.DefaultImpls.tryNavigateTo$default(this.navigationManager, LinkScreen.UpdateCard.INSTANCE.invoke(paymentDetails.getId(), new LinkScreen.UpdateCard.BillingDetailsUpdateFlow(formFieldEntry != null ? formFieldEntry.getValue() : null)), null, false, 6, null);
                return Unit.INSTANCE;
            }
            FormFieldEntry value4 = this.cvcController.getFormFieldValue().getValue();
            if (!value4.isComplete()) {
                value4 = null;
            }
            FormFieldEntry formFieldEntry2 = value4;
            String value5 = formFieldEntry2 != null ? formFieldEntry2.getValue() : null;
            ConsumerState value6 = this.linkAccountManager.getConsumerState().getValue();
            if (value6 != null && (paymentDetails2 = value6.getPaymentDetails()) != null) {
                Iterator<T> it = paymentDetails2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (Intrinsics.areEqual(((LinkPaymentMethod.ConsumerPaymentDetails) next).getDetails().getId(), paymentDetails.getId())) {
                        obj = next;
                        break;
                    }
                }
                consumerPaymentDetails = (LinkPaymentMethod.ConsumerPaymentDetails) obj;
            }
            CompleteLinkFlow completeLinkFlow = this.completeLinkFlow;
            if (consumerPaymentDetails == null || (unredactedPhoneNumber = consumerPaymentDetails.getBillingPhone()) == null) {
                unredactedPhoneNumber = this.linkAccount.getUnredactedPhoneNumber();
            }
            LinkPaymentMethod.ConsumerPaymentDetails consumerPaymentDetails2 = new LinkPaymentMethod.ConsumerPaymentDetails(paymentDetails, value5, unredactedPhoneNumber);
            LinkAccount linkAccount = this.linkAccount;
            c10661.L$0 = this;
            c10661.label = 1;
            objInvoke = completeLinkFlow.invoke(consumerPaymentDetails2, linkAccount, c10661);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            walletViewModel = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            walletViewModel = (WalletViewModel) c10661.L$0;
            ResultKt.throwOnFailure(objInvoke);
        }
        CompleteLinkFlow.Result result = (CompleteLinkFlow.Result) objInvoke;
        if (result instanceof CompleteLinkFlow.Result.Canceled) {
            MutableStateFlow<WalletUiState> mutableStateFlow = walletViewModel._uiState;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, WalletUiState.copy$default(value2, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, null, null, false, false, 4194287, null)));
        } else if (result instanceof CompleteLinkFlow.Result.Failed) {
            MutableStateFlow<WalletUiState> mutableStateFlow2 = walletViewModel._uiState;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, WalletUiState.copy$default(value, null, null, null, null, false, false, null, null, null, false, null, false, null, null, ((CompleteLinkFlow.Result.Failed) result).getError(), null, null, null, null, null, false, false, 4177903, null)));
        } else {
            if (!(result instanceof CompleteLinkFlow.Result.Completed)) {
                throw new NoWhenBranchMatchedException();
            }
            walletViewModel.dismissWithResult.invoke(((CompleteLinkFlow.Result.Completed) result).getLinkActivityResult());
        }
        return Unit.INSTANCE;
    }

    public final void onPayAnotherWayClicked() {
        this.dismissWithResult.invoke(new LinkActivityResult.Canceled(LinkActivityResult.Canceled.Reason.PayAnotherWay, LinkAccountUtilKt.getLinkAccountUpdate(this.linkAccountManager)));
    }

    public final void onRemoveClicked(ConsumerPaymentDetails.PaymentDetails item) {
        WalletUiState value;
        Intrinsics.checkNotNullParameter(item, "item");
        MutableStateFlow<WalletUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, WalletUiState.copy$default(value, null, null, null, null, false, false, null, null, null, false, null, false, null, item.getId(), null, null, null, null, null, null, false, false, 4186111, null)));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C10642(item, null), 3, null);
    }

    /* compiled from: WalletViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.wallet.WalletViewModel$onRemoveClicked$2", f = "WalletViewModel.kt", i = {}, l = {383, 385}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.link.ui.wallet.WalletViewModel$onRemoveClicked$2, reason: invalid class name and case insensitive filesystem */
    static final class C10642 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ConsumerPaymentDetails.PaymentDetails $item;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10642(ConsumerPaymentDetails.PaymentDetails paymentDetails, Continuation<? super C10642> continuation) {
            super(2, continuation);
            this.$item = paymentDetails;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WalletViewModel.this.new C10642(this.$item, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10642) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
        
            if (com.stripe.android.link.ui.wallet.WalletViewModel.loadPaymentDetails$default(r2, r0, false, r29, 2, null) == r6) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objMo7710deletePaymentDetailsgIAlus;
            MutableStateFlow mutableStateFlow;
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objMo7710deletePaymentDetailsgIAlus = WalletViewModel.this.linkAccountManager.mo7710deletePaymentDetailsgIAlus(this.$item.getId(), this);
                if (objMo7710deletePaymentDetailsgIAlus != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                mutableStateFlow = WalletViewModel.this._uiState;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, WalletUiState.copy$default((WalletUiState) value, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, null, null, false, false, 4186111, null)));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            objMo7710deletePaymentDetailsgIAlus = ((Result) obj).getValue();
            WalletViewModel walletViewModel = WalletViewModel.this;
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo7710deletePaymentDetailsgIAlus);
            if (thM9121exceptionOrNullimpl != null) {
                walletViewModel.updateErrorMessageAndStopProcessing(thM9121exceptionOrNullimpl, "Failed to delete payment method");
            } else {
                ConsumerPaymentDetails.PaymentDetails selectedItem = walletViewModel.getUiState().getValue().getSelectedItem();
                String id = selectedItem != null ? selectedItem.getId() : null;
                this.label = 2;
            }
            mutableStateFlow = WalletViewModel.this._uiState;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, WalletUiState.copy$default((WalletUiState) value, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, null, null, false, false, 4186111, null)));
            return Unit.INSTANCE;
        }
    }

    public final void onUpdateClicked(ConsumerPaymentDetails.PaymentDetails item) {
        Intrinsics.checkNotNullParameter(item, "item");
        NavigationManager.DefaultImpls.tryNavigateTo$default(this.navigationManager, LinkScreen.UpdateCard.INSTANCE.invoke(item.getId(), null), null, false, 6, null);
    }

    public final void onSetDefaultClicked(ConsumerPaymentDetails.PaymentDetails item) {
        WalletUiState value;
        Intrinsics.checkNotNullParameter(item, "item");
        MutableStateFlow<WalletUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, WalletUiState.copy$default(value, null, null, null, null, false, false, null, null, null, false, null, false, null, item.getId(), null, null, null, null, null, null, false, false, 4186111, null)));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C10652(item, this, null), 3, null);
    }

    /* compiled from: WalletViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.wallet.WalletViewModel$onSetDefaultClicked$2", f = "WalletViewModel.kt", i = {}, l = {TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.link.ui.wallet.WalletViewModel$onSetDefaultClicked$2, reason: invalid class name and case insensitive filesystem */
    static final class C10652 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ConsumerPaymentDetails.PaymentDetails $item;
        int label;
        final /* synthetic */ WalletViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10652(ConsumerPaymentDetails.PaymentDetails paymentDetails, WalletViewModel walletViewModel, Continuation<? super C10652> continuation) {
            super(2, continuation);
            this.$item = paymentDetails;
            this.this$0 = walletViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C10652(this.$item, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10652) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            WalletUiState walletUiState;
            ArrayList arrayList;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ConsumerPaymentDetailsUpdateParams consumerPaymentDetailsUpdateParams = new ConsumerPaymentDetailsUpdateParams(this.$item.getId(), Boxing.boxBoolean(true), null);
                this.label = 1;
                Object objM7728updatePaymentDetails0E7RQCE$default = LinkAccountManager.DefaultImpls.m7728updatePaymentDetails0E7RQCE$default(this.this$0.linkAccountManager, consumerPaymentDetailsUpdateParams, null, this, 2, null);
                if (objM7728updatePaymentDetails0E7RQCE$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                value = objM7728updatePaymentDetails0E7RQCE$default;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                value = ((Result) obj).getValue();
            }
            WalletViewModel walletViewModel = this.this$0;
            ConsumerPaymentDetails.PaymentDetails paymentDetails = this.$item;
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(value);
            if (thM9121exceptionOrNullimpl == null) {
                MutableStateFlow mutableStateFlow = walletViewModel._uiState;
                do {
                    value2 = mutableStateFlow.getValue();
                    walletUiState = (WalletUiState) value2;
                    List<ConsumerPaymentDetails.PaymentDetails> paymentDetailsList = walletUiState.getPaymentDetailsList();
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(paymentDetailsList, 10));
                    for (ConsumerPaymentDetails.Card cardCopy$default : paymentDetailsList) {
                        if (cardCopy$default instanceof ConsumerPaymentDetails.BankAccount) {
                            ConsumerPaymentDetails.BankAccount bankAccount = (ConsumerPaymentDetails.BankAccount) cardCopy$default;
                            cardCopy$default = ConsumerPaymentDetails.BankAccount.copy$default(bankAccount, null, null, Intrinsics.areEqual(paymentDetails.getId(), bankAccount.getId()), null, null, null, null, null, 251, null);
                        } else if (cardCopy$default instanceof ConsumerPaymentDetails.Card) {
                            ConsumerPaymentDetails.Card card = (ConsumerPaymentDetails.Card) cardCopy$default;
                            cardCopy$default = ConsumerPaymentDetails.Card.copy$default(card, null, null, Intrinsics.areEqual(paymentDetails.getId(), card.getId()), null, null, null, 0, 0, null, null, null, null, 4091, null);
                        } else if (!(cardCopy$default instanceof ConsumerPaymentDetails.Passthrough)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        arrayList.add(cardCopy$default);
                    }
                } while (!mutableStateFlow.compareAndSet(value2, WalletUiState.copy$default(walletUiState, arrayList, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, null, null, false, false, 4186110, null)));
            } else {
                walletViewModel.updateErrorMessageAndStopProcessing(thM9121exceptionOrNullimpl, "Failed to set payment method as default");
            }
            return Unit.INSTANCE;
        }
    }

    public final void onAddPaymentMethodOptionClicked(AddPaymentMethodOption option) {
        Intrinsics.checkNotNullParameter(option, "option");
        if (option instanceof AddPaymentMethodOption.Bank) {
            onAddBankAccountClicked();
        } else {
            if (!Intrinsics.areEqual(option, AddPaymentMethodOption.Card.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            NavigationManager.DefaultImpls.tryNavigateTo$default(this.navigationManager, LinkScreen.PaymentMethod.INSTANCE.getRoute(), null, false, 6, null);
        }
    }

    private final void onAddBankAccountClicked() {
        WalletUiState value;
        MutableStateFlow<WalletUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, WalletUiState.copy$default(value, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, new AddBankAccountState.Processing(null, 1, null), null, null, false, false, 4063231, null)));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C10612(null), 3, null);
    }

    /* compiled from: WalletViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.wallet.WalletViewModel$onAddBankAccountClicked$2", f = "WalletViewModel.kt", i = {}, l = {468}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.link.ui.wallet.WalletViewModel$onAddBankAccountClicked$2, reason: invalid class name and case insensitive filesystem */
    static final class C10612 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C10612(Continuation<? super C10612> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WalletViewModel.this.new C10612(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10612) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objCreateFailure;
            Object objM9118constructorimpl;
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                Object objMo7708createLinkAccountSessionIoAF18A = WalletViewModel.this.linkAccountManager.mo7708createLinkAccountSessionIoAF18A(this);
                if (objMo7708createLinkAccountSessionIoAF18A == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objCreateFailure = objMo7708createLinkAccountSessionIoAF18A;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objCreateFailure = ((Result) obj).getValue();
            }
            WalletViewModel walletViewModel = WalletViewModel.this;
            if (Result.m9125isSuccessimpl(objCreateFailure)) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    String clientSecret = ((LinkAccountSession) objCreateFailure).getClientSecret();
                    String consumerPublishableKey = walletViewModel.linkAccount.getConsumerPublishableKey();
                    Intrinsics.checkNotNull(consumerPublishableKey);
                    objM9118constructorimpl = Result.m9118constructorimpl(new FinancialConnectionsSheetConfiguration(clientSecret, consumerPublishableKey, null, 4, null));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objCreateFailure = ResultKt.createFailure(th);
                }
            } else {
                objM9118constructorimpl = Result.m9118constructorimpl(objCreateFailure);
            }
            WalletViewModel walletViewModel2 = WalletViewModel.this;
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl == null) {
                FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration = (FinancialConnectionsSheetConfiguration) objM9118constructorimpl;
                MutableStateFlow mutableStateFlow = walletViewModel2._uiState;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, WalletUiState.copy$default((WalletUiState) value, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, new AddBankAccountState.Processing(financialConnectionsSheetConfiguration), null, null, false, false, 4063231, null)));
            } else {
                walletViewModel2.onAddBankAccountError(thM9121exceptionOrNullimpl, "Failed to create Link account session");
            }
            return Unit.INSTANCE;
        }
    }

    public final void onPresentFinancialConnections(boolean success) {
        WalletUiState value;
        WalletUiState value2;
        if (success) {
            MutableStateFlow<WalletUiState> mutableStateFlow = this._uiState;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, WalletUiState.copy$default(value2, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, new AddBankAccountState.Processing(null), null, null, false, false, 4063231, null)));
        } else {
            this.logger.warning("WalletViewModel: Failed to present Financial Connections");
            MutableStateFlow<WalletUiState> mutableStateFlow2 = this._uiState;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, WalletUiState.copy$default(value, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, AddBankAccountState.Idle.INSTANCE, null, null, false, false, 4063231, null)));
        }
    }

    /* compiled from: WalletViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.wallet.WalletViewModel$onFinancialConnectionsResult$1", f = "WalletViewModel.kt", i = {}, l = {FrameMetricsAggregator.EVERY_DURATION, InputDeviceCompat.SOURCE_DPAD}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.link.ui.wallet.WalletViewModel$onFinancialConnectionsResult$1, reason: invalid class name and case insensitive filesystem */
    static final class C10621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FinancialConnectionsSheetResult $result;
        int label;
        final /* synthetic */ WalletViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10621(FinancialConnectionsSheetResult financialConnectionsSheetResult, WalletViewModel walletViewModel, Continuation<? super C10621> continuation) {
            super(2, continuation);
            this.$result = financialConnectionsSheetResult;
            this.this$0 = walletViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C10621(this.$result, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
        
            if (r5.loadPaymentDetails(r2, true, r28) == r0) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM9118constructorimpl;
            Throwable thM9121exceptionOrNullimpl;
            Object value;
            Object value2;
            Object objMo7706createBankAccountPaymentDetailsgIAlus;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FinancialConnectionsSheetResult financialConnectionsSheetResult = this.$result;
                if (financialConnectionsSheetResult instanceof FinancialConnectionsSheetResult.Completed) {
                    FinancialConnectionsAccount financialConnectionsAccount = (FinancialConnectionsAccount) CollectionsKt.firstOrNull((List) ((FinancialConnectionsSheetResult.Completed) financialConnectionsSheetResult).getFinancialConnectionsSession().getAccounts().getData());
                    String id = financialConnectionsAccount != null ? financialConnectionsAccount.getId() : null;
                    if (id != null) {
                        this.label = 1;
                        objMo7706createBankAccountPaymentDetailsgIAlus = this.this$0.linkAccountManager.mo7706createBankAccountPaymentDetailsgIAlus(id, this);
                        if (objMo7706createBankAccountPaymentDetailsgIAlus != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    MutableStateFlow mutableStateFlow = this.this$0._uiState;
                    do {
                        value2 = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value2, WalletUiState.copy$default((WalletUiState) value2, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, AddBankAccountState.Idle.INSTANCE, null, null, false, false, 4063231, null)));
                } else if (Intrinsics.areEqual(financialConnectionsSheetResult, FinancialConnectionsSheetResult.Canceled.INSTANCE)) {
                    MutableStateFlow mutableStateFlow2 = this.this$0._uiState;
                    do {
                        value = mutableStateFlow2.getValue();
                    } while (!mutableStateFlow2.compareAndSet(value, WalletUiState.copy$default((WalletUiState) value, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, AddBankAccountState.Idle.INSTANCE, null, null, false, false, 4063231, null)));
                } else if (financialConnectionsSheetResult instanceof FinancialConnectionsSheetResult.Failed) {
                    this.this$0.onAddBankAccountError(((FinancialConnectionsSheetResult.Failed) this.$result).getError(), "Failed to get Financial Connections result");
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
                WalletViewModel walletViewModel = this.this$0;
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                    walletViewModel.onAddBankAccountError(thM9121exceptionOrNullimpl, "Failed to create/load bank account");
                }
                Result.m9117boximpl(objM9118constructorimpl);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            objMo7706createBankAccountPaymentDetailsgIAlus = ((Result) obj).getValue();
            WalletViewModel walletViewModel2 = this.this$0;
            if (Result.m9125isSuccessimpl(objMo7706createBankAccountPaymentDetailsgIAlus)) {
                Result.Companion companion2 = Result.INSTANCE;
                String id2 = ((ConsumerPaymentDetails.PaymentDetails) objMo7706createBankAccountPaymentDetailsgIAlus).getId();
                this.label = 2;
            } else {
                objM9118constructorimpl = Result.m9118constructorimpl(objMo7706createBankAccountPaymentDetailsgIAlus);
                WalletViewModel walletViewModel3 = this.this$0;
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                }
                Result.m9117boximpl(objM9118constructorimpl);
                return Unit.INSTANCE;
            }
        }
    }

    public final void onFinancialConnectionsResult(FinancialConnectionsSheetResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C10621(result, this, null), 3, null);
    }

    public final void onDismissAlert() {
        WalletUiState value;
        MutableStateFlow<WalletUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, WalletUiState.copy$default(value, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, null, null, false, false, 3932159, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateErrorMessageAndStopProcessing(Throwable error, String loggerMessage) {
        WalletUiState value;
        this.logger.error("WalletViewModel: " + loggerMessage, error);
        MutableStateFlow<WalletUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, WalletUiState.copy$default(value, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, ExceptionKtKt.stripeErrorMessage(error), null, false, false, 3923951, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAddBankAccountError(Throwable error, String loggerMessage) {
        WalletUiState value;
        this.logger.error("WalletViewModel: " + loggerMessage, error);
        MutableStateFlow<WalletUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, WalletUiState.copy$default(value, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, AddBankAccountState.Idle.INSTANCE, ExceptionKtKt.stripeErrorMessage(error), null, false, false, 3801087, null)));
    }

    private final List<AddPaymentMethodOption> getAddPaymentMethodOptions() {
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        if (this.linkAccount.getConsumerPublishableKey() != null && this.configuration.getFinancialConnectionsAvailability() != null && this.supportedPaymentMethodTypes.contains("bank_account")) {
            listCreateListBuilder.add(new AddPaymentMethodOption.Bank(this.configuration.getFinancialConnectionsAvailability()));
        }
        if (this.supportedPaymentMethodTypes.contains("card")) {
            listCreateListBuilder.add(AddPaymentMethodOption.Card.INSTANCE);
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    /* compiled from: WalletViewModel.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00100\u000b¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/link/ui/wallet/WalletViewModel$Companion;", "", "<init>", "()V", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "parentComponent", "Lcom/stripe/android/link/injection/NativeLinkComponent;", "linkAccount", "Lcom/stripe/android/link/model/LinkAccount;", "navigateAndClearStack", "Lkotlin/Function1;", "Lcom/stripe/android/link/LinkScreen;", "Lkotlin/ParameterName;", "name", "route", "", "dismissWithResult", "Lcom/stripe/android/link/LinkActivityResult;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final WalletViewModel factory$lambda$1$lambda$0(NativeLinkComponent nativeLinkComponent, LinkAccount linkAccount, Function1 function1, Function1 function12, CreationExtras initializer) {
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            LinkConfirmationHandler linkConfirmationHandlerCreate = nativeLinkComponent.getLinkConfirmationHandlerFactory().create(nativeLinkComponent.getViewModel().getConfirmationHandler());
            LinkConfiguration configuration = nativeLinkComponent.getConfiguration();
            LinkAccountManager linkAccountManager = nativeLinkComponent.getLinkAccountManager();
            DefaultCompleteLinkFlow defaultCompleteLinkFlow = new DefaultCompleteLinkFlow(linkConfirmationHandlerCreate, nativeLinkComponent.getLinkAccountManager(), nativeLinkComponent.getDismissalCoordinator(), nativeLinkComponent.getLinkLaunchMode());
            return new WalletViewModel(configuration, linkAccount, linkAccountManager, defaultCompleteLinkFlow, nativeLinkComponent.getLogger(), nativeLinkComponent.getNavigationManager(), nativeLinkComponent.getLinkLaunchMode(), nativeLinkComponent.getDismissalCoordinator(), function1, function12);
        }

        public final ViewModelProvider.Factory factory(final NativeLinkComponent parentComponent, final LinkAccount linkAccount, final Function1<? super LinkScreen, Unit> navigateAndClearStack, final Function1<? super LinkActivityResult, Unit> dismissWithResult) {
            Intrinsics.checkNotNullParameter(parentComponent, "parentComponent");
            Intrinsics.checkNotNullParameter(linkAccount, "linkAccount");
            Intrinsics.checkNotNullParameter(navigateAndClearStack, "navigateAndClearStack");
            Intrinsics.checkNotNullParameter(dismissWithResult, "dismissWithResult");
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(WalletViewModel.class), new Function1() { // from class: com.stripe.android.link.ui.wallet.WalletViewModel$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WalletViewModel.Companion.factory$lambda$1$lambda$0(parentComponent, linkAccount, navigateAndClearStack, dismissWithResult, (CreationExtras) obj);
                }
            });
            return initializerViewModelFactoryBuilder.build();
        }
    }
}
