package com.stripe.android.paymentsheet.ui;

import androidx.lifecycle.ViewModelKt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.CardBrandFilter;
import com.stripe.android.common.model.CommonConfiguration;
import com.stripe.android.common.model.CommonConfigurationKt;
import com.stripe.android.link.LinkAccountUpdate;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.LinkExpressMode;
import com.stripe.android.link.LinkLaunchMode;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.LinkPaymentMethod;
import com.stripe.android.link.account.LinkAccountHolder;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.ui.LinkButtonState;
import com.stripe.android.link.ui.verification.VerificationViewState;
import com.stripe.android.link.verification.LinkInlineInteractor;
import com.stripe.android.link.verification.LinkInlineState;
import com.stripe.android.link.verification.VerificationState;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentSheetCardBrandFilter;
import com.stripe.android.lpmfoundations.paymentmethod.WalletType;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.paymentelement.confirmation.ConfirmationOptionKtxKt;
import com.stripe.android.paymentelement.embedded.content.EmbeddedConfirmationStateHolder;
import com.stripe.android.paymentelement.embedded.content.EmbeddedLinkHelper;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.paymentsheet.LinkHandler;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetConfigurationKtxKt;
import com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController;
import com.stripe.android.paymentsheet.flowcontroller.FlowControllerConfigurationHandler;
import com.stripe.android.paymentsheet.flowcontroller.FlowControllerViewModel;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.state.LinkState;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import com.stripe.android.paymentsheet.ui.DefaultWalletButtonsInteractor;
import com.stripe.android.paymentsheet.ui.WalletButtonsInteractor;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import com.stripe.android.uicore.utils.StateFlowsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: WalletButtonsInteractor.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 ,2\u00020\u0001:\u0002+,Bj\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0004H\u0002J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0004H\u0002J\u0018\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0002\u001a\u00020\u0004H\u0002J\u001a\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\u0006\u0010\u0002\u001a\u00020\u0004H\u0002R\u0016\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006-"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;", "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor;", "arguments", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;", "confirmationHandler", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "linkInlineInteractor", "Lcom/stripe/android/link/verification/LinkInlineInteractor;", "linkPaymentLauncher", "Lcom/stripe/android/link/LinkPaymentLauncher;", "linkAccountHolder", "Lcom/stripe/android/link/account/LinkAccountHolder;", "onWalletButtonsRenderStateChanged", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isRendered", "", "<init>", "(Lkotlinx/coroutines/flow/StateFlow;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/link/verification/LinkInlineInteractor;Lcom/stripe/android/link/LinkPaymentLauncher;Lcom/stripe/android/link/account/LinkAccountHolder;Lkotlin/jvm/functions/Function1;)V", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "setupLink", CardScanActivity.ARGS, "handleViewAction", "action", "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction;", "handleLinkButtonPressed", "handleButtonPressed", "button", "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton;", "confirmationArgs", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;", BaseSheetViewModel.SAVE_SELECTION, "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "Arguments", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultWalletButtonsInteractor implements WalletButtonsInteractor {
    private final StateFlow<Arguments> arguments;
    private final ConfirmationHandler confirmationHandler;
    private final CoroutineScope coroutineScope;
    private final ErrorReporter errorReporter;
    private final LinkAccountHolder linkAccountHolder;
    private final LinkInlineInteractor linkInlineInteractor;
    private final LinkPaymentLauncher linkPaymentLauncher;
    private final Function1<Boolean, Unit> onWalletButtonsRenderStateChanged;
    private final StateFlow<WalletButtonsInteractor.State> state;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: WalletButtonsInteractor.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WalletType.values().length];
            try {
                iArr[WalletType.GooglePay.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WalletType.Link.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletType.ShopPay.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultWalletButtonsInteractor(StateFlow<Arguments> arguments, ConfirmationHandler confirmationHandler, CoroutineScope coroutineScope, ErrorReporter errorReporter, LinkInlineInteractor linkInlineInteractor, LinkPaymentLauncher linkPaymentLauncher, LinkAccountHolder linkAccountHolder, Function1<? super Boolean, Unit> onWalletButtonsRenderStateChanged) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(confirmationHandler, "confirmationHandler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(linkInlineInteractor, "linkInlineInteractor");
        Intrinsics.checkNotNullParameter(linkPaymentLauncher, "linkPaymentLauncher");
        Intrinsics.checkNotNullParameter(linkAccountHolder, "linkAccountHolder");
        Intrinsics.checkNotNullParameter(onWalletButtonsRenderStateChanged, "onWalletButtonsRenderStateChanged");
        this.arguments = arguments;
        this.confirmationHandler = confirmationHandler;
        this.coroutineScope = coroutineScope;
        this.errorReporter = errorReporter;
        this.linkInlineInteractor = linkInlineInteractor;
        this.linkPaymentLauncher = linkPaymentLauncher;
        this.linkAccountHolder = linkAccountHolder;
        this.onWalletButtonsRenderStateChanged = onWalletButtonsRenderStateChanged;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(null), 3, null);
        this.state = StateFlowsKt.combineAsStateFlow(arguments, confirmationHandler.getState(), linkInlineInteractor.getState(), linkAccountHolder.getLinkAccountInfo(), new Function4() { // from class: com.stripe.android.paymentsheet.ui.DefaultWalletButtonsInteractor$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return DefaultWalletButtonsInteractor.state$lambda$8(this.f$0, (DefaultWalletButtonsInteractor.Arguments) obj, (ConfirmationHandler.State) obj2, (LinkInlineState) obj3, (LinkAccountUpdate.Value) obj4);
            }
        });
    }

    /* compiled from: WalletButtonsInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.ui.DefaultWalletButtonsInteractor$1", f = "WalletButtonsInteractor.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.ui.DefaultWalletButtonsInteractor$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultWalletButtonsInteractor.this.new AnonymousClass1(continuation);
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
                Flow flowFilterNotNull = FlowKt.filterNotNull(DefaultWalletButtonsInteractor.this.arguments);
                final DefaultWalletButtonsInteractor defaultWalletButtonsInteractor = DefaultWalletButtonsInteractor.this;
                this.label = 1;
                if (flowFilterNotNull.collect(new FlowCollector() { // from class: com.stripe.android.paymentsheet.ui.DefaultWalletButtonsInteractor.1.1
                    public final Object emit(Arguments arguments, Continuation<? super Unit> continuation) {
                        defaultWalletButtonsInteractor.setupLink(arguments);
                        return Unit.INSTANCE;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Arguments) obj2, (Continuation<? super Unit>) continuation);
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

    @Override // com.stripe.android.paymentsheet.ui.WalletButtonsInteractor
    public StateFlow<WalletButtonsInteractor.State> getState() {
        return this.state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WalletButtonsInteractor.State state$lambda$8(DefaultWalletButtonsInteractor defaultWalletButtonsInteractor, Arguments arguments, ConfirmationHandler.State confirmationState, LinkInlineState linkEmbeddedState, LinkAccountUpdate.Value linkAccountInfo) {
        ArrayList arrayListEmptyList;
        VerificationViewState viewState;
        Object obj;
        Intrinsics.checkNotNullParameter(confirmationState, "confirmationState");
        Intrinsics.checkNotNullParameter(linkEmbeddedState, "linkEmbeddedState");
        Intrinsics.checkNotNullParameter(linkAccountInfo, "linkAccountInfo");
        WalletButtonsInteractor.State.LinkOtpState linkOtpState = null;
        if (arguments != null) {
            List<WalletType> availableWallets = arguments.getPaymentMethodMetadata().getAvailableWallets();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = availableWallets.iterator();
            while (it.hasNext()) {
                int i = WhenMappings.$EnumSwitchMapping$0[((WalletType) it.next()).ordinal()];
                if (i == 1) {
                    PaymentSheet.GooglePayConfiguration googlePay = arguments.getConfiguration().getGooglePay();
                    Object googlePay2 = new WalletButtonsInteractor.WalletButton.GooglePay(googlePay != null ? googlePay.getButtonType() : null, arguments.getConfiguration().getBillingDetailsCollectionConfiguration(), true, (CardBrandFilter) new PaymentSheetCardBrandFilter(arguments.getConfiguration().getCardBrandAcceptance()));
                    if (!arguments.getWalletsAllowedByMerchant().contains(WalletType.GooglePay)) {
                        googlePay2 = null;
                    }
                    obj = (WalletButtonsInteractor.WalletButton) googlePay2;
                } else if (i == 2) {
                    LinkState linkState = arguments.getPaymentMethodMetadata().getLinkState();
                    LinkConfiguration configuration = linkState != null ? linkState.getConfiguration() : null;
                    LinkButtonState.Companion companion = LinkButtonState.INSTANCE;
                    boolean z = false;
                    if (configuration != null && configuration.getEnableDisplayableDefaultValuesInEce()) {
                        z = true;
                    }
                    String linkEmail = arguments.getLinkEmail();
                    LinkAccount account = linkAccountInfo.getAccount();
                    Object link = new WalletButtonsInteractor.WalletButton.Link(companion.create(linkEmail, account != null ? account.getDisplayablePaymentDetails() : null, z));
                    if (!(linkEmbeddedState.getVerificationState() instanceof VerificationState.RenderButton) || !arguments.getWalletsAllowedByMerchant().contains(WalletType.Link)) {
                        link = null;
                    }
                    obj = (WalletButtonsInteractor.WalletButton) link;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Object obj2 = WalletButtonsInteractor.WalletButton.ShopPay.INSTANCE;
                    if (!arguments.getWalletsAllowedByMerchant().contains(WalletType.ShopPay)) {
                        obj2 = null;
                    }
                    obj = (WalletButtonsInteractor.WalletButton) obj2;
                }
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            arrayListEmptyList = arrayList;
        } else {
            arrayListEmptyList = CollectionsKt.emptyList();
        }
        if (arguments != null) {
            VerificationState verificationState = linkEmbeddedState.getVerificationState();
            VerificationState.Render2FA render2FA = verificationState instanceof VerificationState.Render2FA ? (VerificationState.Render2FA) verificationState : null;
            if (render2FA != null && (viewState = render2FA.getViewState()) != null) {
                WalletButtonsInteractor.State.LinkOtpState linkOtpState2 = new WalletButtonsInteractor.State.LinkOtpState(viewState, defaultWalletButtonsInteractor.linkInlineInteractor.getOtpElement());
                if (arguments.getWalletsAllowedByMerchant().contains(WalletType.Link)) {
                    linkOtpState = linkOtpState2;
                }
            }
        }
        return new WalletButtonsInteractor.State(linkOtpState, arrayListEmptyList, !(confirmationState instanceof ConfirmationHandler.State.Confirming));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupLink(Arguments args) {
        this.linkInlineInteractor.setup(args.getPaymentMethodMetadata());
    }

    @Override // com.stripe.android.paymentsheet.ui.WalletButtonsInteractor
    public void handleViewAction(WalletButtonsInteractor.ViewAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof WalletButtonsInteractor.ViewAction.OnButtonPressed) {
            Arguments value = this.arguments.getValue();
            if (value != null) {
                WalletButtonsInteractor.ViewAction.OnButtonPressed onButtonPressed = (WalletButtonsInteractor.ViewAction.OnButtonPressed) action;
                if (onButtonPressed.getButton() instanceof WalletButtonsInteractor.WalletButton.Link) {
                    handleLinkButtonPressed(value);
                    return;
                } else {
                    handleButtonPressed(onButtonPressed.getButton(), value);
                    return;
                }
            }
            ErrorReporter.DefaultImpls.report$default(this.errorReporter, ErrorReporter.UnexpectedErrorEvent.WALLET_BUTTONS_NULL_WALLET_ARGUMENTS_ON_CONFIRM, null, null, 6, null);
            return;
        }
        if (action instanceof WalletButtonsInteractor.ViewAction.OnShown) {
            this.onWalletButtonsRenderStateChanged.invoke(true);
            return;
        }
        if (action instanceof WalletButtonsInteractor.ViewAction.OnHidden) {
            this.onWalletButtonsRenderStateChanged.invoke(false);
        } else if (action instanceof WalletButtonsInteractor.ViewAction.OnResendCode) {
            this.linkInlineInteractor.resendCode();
        } else {
            if (!(action instanceof WalletButtonsInteractor.ViewAction.OnResendCodeNotificationSent)) {
                throw new NoWhenBranchMatchedException();
            }
            this.linkInlineInteractor.didShowCodeSentNotification();
        }
    }

    private final void handleLinkButtonPressed(Arguments arguments) {
        LinkState linkState = arguments.getPaymentMethodMetadata().getLinkState();
        LinkConfiguration configuration = linkState != null ? linkState.getConfiguration() : null;
        if (configuration != null) {
            PaymentSelection paymentSelection = arguments.getPaymentSelection();
            PaymentSelection.Link link = paymentSelection instanceof PaymentSelection.Link ? (PaymentSelection.Link) paymentSelection : null;
            LinkPaymentMethod selectedPayment = link != null ? link.getSelectedPayment() : null;
            this.linkPaymentLauncher.present(configuration, this.linkAccountHolder.getLinkAccountInfo().getValue(), new LinkLaunchMode.PaymentMethodSelection(selectedPayment != null ? selectedPayment.getDetails() : null, false, null, 6, null), LinkExpressMode.ENABLED);
            return;
        }
        handleButtonPressed(new WalletButtonsInteractor.WalletButton.Link(LinkButtonState.Default.INSTANCE), arguments);
    }

    private final void handleButtonPressed(WalletButtonsInteractor.WalletButton button, Arguments arguments) {
        ConfirmationHandler.Args argsConfirmationArgs = confirmationArgs(button.createSelection(), arguments);
        if (argsConfirmationArgs == null || BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new DefaultWalletButtonsInteractor$handleButtonPressed$1$1(this, argsConfirmationArgs, null), 3, null) == null) {
            ErrorReporter.DefaultImpls.report$default(this.errorReporter, ErrorReporter.UnexpectedErrorEvent.WALLET_BUTTONS_NULL_CONFIRMATION_ARGS_ON_CONFIRM, null, null, 6, null);
            Unit unit = Unit.INSTANCE;
        }
    }

    private final ConfirmationHandler.Args confirmationArgs(PaymentSelection selection, Arguments arguments) {
        CommonConfiguration configuration = arguments.getConfiguration();
        LinkState linkState = arguments.getPaymentMethodMetadata().getLinkState();
        ConfirmationHandler.Option confirmationOption = ConfirmationOptionKtxKt.toConfirmationOption(selection, configuration, linkState != null ? linkState.getConfiguration() : null);
        if (confirmationOption == null) {
            return null;
        }
        return new ConfirmationHandler.Args(arguments.getPaymentMethodMetadata().getStripeIntent(), confirmationOption, arguments.getAppearance(), arguments.getInitializationMode(), arguments.getConfiguration().getShippingDetails());
    }

    /* compiled from: WalletButtonsInteractor.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0010HÆ\u0003JY\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006/"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;", "", "linkEmail", "", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "configuration", "Lcom/stripe/android/common/model/CommonConfiguration;", "appearance", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "initializationMode", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "walletsAllowedByMerchant", "", "Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", "getLinkEmail", "()Ljava/lang/String;", "getPaymentMethodMetadata", "()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "getConfiguration", "()Lcom/stripe/android/common/model/CommonConfiguration;", "getAppearance", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "getInitializationMode", "()Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "getWalletsAllowedByMerchant", "()Ljava/util/List;", "getPaymentSelection", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Arguments {
        public static final int $stable = 8;
        private final PaymentSheet.Appearance appearance;
        private final CommonConfiguration configuration;
        private final PaymentElementLoader.InitializationMode initializationMode;
        private final String linkEmail;
        private final PaymentMethodMetadata paymentMethodMetadata;
        private final PaymentSelection paymentSelection;
        private final List<WalletType> walletsAllowedByMerchant;

        public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, PaymentMethodMetadata paymentMethodMetadata, CommonConfiguration commonConfiguration, PaymentSheet.Appearance appearance, PaymentElementLoader.InitializationMode initializationMode, List list, PaymentSelection paymentSelection, int i, Object obj) {
            if ((i & 1) != 0) {
                str = arguments.linkEmail;
            }
            if ((i & 2) != 0) {
                paymentMethodMetadata = arguments.paymentMethodMetadata;
            }
            if ((i & 4) != 0) {
                commonConfiguration = arguments.configuration;
            }
            if ((i & 8) != 0) {
                appearance = arguments.appearance;
            }
            if ((i & 16) != 0) {
                initializationMode = arguments.initializationMode;
            }
            if ((i & 32) != 0) {
                list = arguments.walletsAllowedByMerchant;
            }
            if ((i & 64) != 0) {
                paymentSelection = arguments.paymentSelection;
            }
            List list2 = list;
            PaymentSelection paymentSelection2 = paymentSelection;
            PaymentElementLoader.InitializationMode initializationMode2 = initializationMode;
            CommonConfiguration commonConfiguration2 = commonConfiguration;
            return arguments.copy(str, paymentMethodMetadata, commonConfiguration2, appearance, initializationMode2, list2, paymentSelection2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLinkEmail() {
            return this.linkEmail;
        }

        /* renamed from: component2, reason: from getter */
        public final PaymentMethodMetadata getPaymentMethodMetadata() {
            return this.paymentMethodMetadata;
        }

        /* renamed from: component3, reason: from getter */
        public final CommonConfiguration getConfiguration() {
            return this.configuration;
        }

        /* renamed from: component4, reason: from getter */
        public final PaymentSheet.Appearance getAppearance() {
            return this.appearance;
        }

        /* renamed from: component5, reason: from getter */
        public final PaymentElementLoader.InitializationMode getInitializationMode() {
            return this.initializationMode;
        }

        public final List<WalletType> component6() {
            return this.walletsAllowedByMerchant;
        }

        /* renamed from: component7, reason: from getter */
        public final PaymentSelection getPaymentSelection() {
            return this.paymentSelection;
        }

        public final Arguments copy(String linkEmail, PaymentMethodMetadata paymentMethodMetadata, CommonConfiguration configuration, PaymentSheet.Appearance appearance, PaymentElementLoader.InitializationMode initializationMode, List<? extends WalletType> walletsAllowedByMerchant, PaymentSelection paymentSelection) {
            Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Intrinsics.checkNotNullParameter(initializationMode, "initializationMode");
            Intrinsics.checkNotNullParameter(walletsAllowedByMerchant, "walletsAllowedByMerchant");
            return new Arguments(linkEmail, paymentMethodMetadata, configuration, appearance, initializationMode, walletsAllowedByMerchant, paymentSelection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Arguments)) {
                return false;
            }
            Arguments arguments = (Arguments) other;
            return Intrinsics.areEqual(this.linkEmail, arguments.linkEmail) && Intrinsics.areEqual(this.paymentMethodMetadata, arguments.paymentMethodMetadata) && Intrinsics.areEqual(this.configuration, arguments.configuration) && Intrinsics.areEqual(this.appearance, arguments.appearance) && Intrinsics.areEqual(this.initializationMode, arguments.initializationMode) && Intrinsics.areEqual(this.walletsAllowedByMerchant, arguments.walletsAllowedByMerchant) && Intrinsics.areEqual(this.paymentSelection, arguments.paymentSelection);
        }

        public int hashCode() {
            String str = this.linkEmail;
            int iHashCode = (((((((((((str == null ? 0 : str.hashCode()) * 31) + this.paymentMethodMetadata.hashCode()) * 31) + this.configuration.hashCode()) * 31) + this.appearance.hashCode()) * 31) + this.initializationMode.hashCode()) * 31) + this.walletsAllowedByMerchant.hashCode()) * 31;
            PaymentSelection paymentSelection = this.paymentSelection;
            return iHashCode + (paymentSelection != null ? paymentSelection.hashCode() : 0);
        }

        public String toString() {
            return "Arguments(linkEmail=" + this.linkEmail + ", paymentMethodMetadata=" + this.paymentMethodMetadata + ", configuration=" + this.configuration + ", appearance=" + this.appearance + ", initializationMode=" + this.initializationMode + ", walletsAllowedByMerchant=" + this.walletsAllowedByMerchant + ", paymentSelection=" + this.paymentSelection + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Arguments(String str, PaymentMethodMetadata paymentMethodMetadata, CommonConfiguration configuration, PaymentSheet.Appearance appearance, PaymentElementLoader.InitializationMode initializationMode, List<? extends WalletType> walletsAllowedByMerchant, PaymentSelection paymentSelection) {
            Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Intrinsics.checkNotNullParameter(initializationMode, "initializationMode");
            Intrinsics.checkNotNullParameter(walletsAllowedByMerchant, "walletsAllowedByMerchant");
            this.linkEmail = str;
            this.paymentMethodMetadata = paymentMethodMetadata;
            this.configuration = configuration;
            this.appearance = appearance;
            this.initializationMode = initializationMode;
            this.walletsAllowedByMerchant = walletsAllowedByMerchant;
            this.paymentSelection = paymentSelection;
        }

        public final String getLinkEmail() {
            return this.linkEmail;
        }

        public final PaymentMethodMetadata getPaymentMethodMetadata() {
            return this.paymentMethodMetadata;
        }

        public final CommonConfiguration getConfiguration() {
            return this.configuration;
        }

        public final PaymentSheet.Appearance getAppearance() {
            return this.appearance;
        }

        public final PaymentElementLoader.InitializationMode getInitializationMode() {
            return this.initializationMode;
        }

        public final List<WalletType> getWalletsAllowedByMerchant() {
            return this.walletsAllowedByMerchant;
        }

        public final PaymentSelection getPaymentSelection() {
            return this.paymentSelection;
        }
    }

    /* compiled from: WalletButtonsInteractor.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJF\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Companion;", "", "<init>", "()V", "create", "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor;", "flowControllerViewModel", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;", "walletsButtonLinkLauncher", "Lcom/stripe/android/link/LinkPaymentLauncher;", "linkInlineInteractor", "Lcom/stripe/android/link/verification/LinkInlineInteractor;", "embeddedLinkHelper", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedLinkHelper;", "confirmationStateHolder", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;", "confirmationHandler", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "linkPaymentLauncher", "linkAccountHolder", "Lcom/stripe/android/link/account/LinkAccountHolder;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final WalletButtonsInteractor create(final FlowControllerViewModel flowControllerViewModel, LinkPaymentLauncher walletsButtonLinkLauncher) {
            Intrinsics.checkNotNullParameter(flowControllerViewModel, "flowControllerViewModel");
            Intrinsics.checkNotNullParameter(walletsButtonLinkLauncher, "walletsButtonLinkLauncher");
            LinkHandler linkHandler = flowControllerViewModel.getFlowControllerStateComponent().getLinkHandler();
            ErrorReporter errorReporter = flowControllerViewModel.getFlowControllerStateComponent().getErrorReporter();
            return new DefaultWalletButtonsInteractor(StateFlowsKt.combineAsStateFlow(linkHandler.getLinkConfigurationCoordinator().getEmailFlow(), flowControllerViewModel.getStateFlow(), flowControllerViewModel.getConfigureRequest(), new Function3() { // from class: com.stripe.android.paymentsheet.ui.DefaultWalletButtonsInteractor$Companion$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return DefaultWalletButtonsInteractor.Companion.create$lambda$0(flowControllerViewModel, (String) obj, (DefaultFlowController.State) obj2, (FlowControllerConfigurationHandler.ConfigureRequest) obj3);
                }
            }), flowControllerViewModel.getFlowControllerStateComponent().getConfirmationHandler(), ViewModelKt.getViewModelScope(flowControllerViewModel), errorReporter, flowControllerViewModel.getFlowControllerStateComponent().getLinkInlineInteractor(), walletsButtonLinkLauncher, flowControllerViewModel.getFlowControllerStateComponent().getLinkAccountHolder(), new Function1() { // from class: com.stripe.android.paymentsheet.ui.DefaultWalletButtonsInteractor$Companion$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultWalletButtonsInteractor.Companion.create$lambda$1(flowControllerViewModel, ((Boolean) obj).booleanValue());
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Arguments create$lambda$0(FlowControllerViewModel flowControllerViewModel, String str, DefaultFlowController.State state, FlowControllerConfigurationHandler.ConfigureRequest configureRequest) {
            if (state == null || configureRequest == null) {
                return null;
            }
            return new Arguments(str, state.getPaymentSheetState().getPaymentMethodMetadata(), state.getPaymentSheetState().getConfig(), configureRequest.getConfiguration().getAppearance(), configureRequest.getInitializationMode(), PaymentSheetConfigurationKtxKt.getAllowedWalletTypes(configureRequest.getConfiguration().getWalletButtons$paymentsheet_release()), flowControllerViewModel.getPaymentSelection());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit create$lambda$1(FlowControllerViewModel flowControllerViewModel, boolean z) {
            flowControllerViewModel.setWalletButtonsRendered(z);
            return Unit.INSTANCE;
        }

        public final WalletButtonsInteractor create(LinkInlineInteractor linkInlineInteractor, EmbeddedLinkHelper embeddedLinkHelper, EmbeddedConfirmationStateHolder confirmationStateHolder, ConfirmationHandler confirmationHandler, CoroutineScope coroutineScope, ErrorReporter errorReporter, LinkPaymentLauncher linkPaymentLauncher, LinkAccountHolder linkAccountHolder) {
            Intrinsics.checkNotNullParameter(linkInlineInteractor, "linkInlineInteractor");
            Intrinsics.checkNotNullParameter(embeddedLinkHelper, "embeddedLinkHelper");
            Intrinsics.checkNotNullParameter(confirmationStateHolder, "confirmationStateHolder");
            Intrinsics.checkNotNullParameter(confirmationHandler, "confirmationHandler");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            Intrinsics.checkNotNullParameter(linkPaymentLauncher, "linkPaymentLauncher");
            Intrinsics.checkNotNullParameter(linkAccountHolder, "linkAccountHolder");
            return new DefaultWalletButtonsInteractor(StateFlowsKt.combineAsStateFlow(embeddedLinkHelper.getLinkEmail(), confirmationStateHolder.getStateFlow(), new Function2() { // from class: com.stripe.android.paymentsheet.ui.DefaultWalletButtonsInteractor$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DefaultWalletButtonsInteractor.Companion.create$lambda$3((String) obj, (EmbeddedConfirmationStateHolder.State) obj2);
                }
            }), confirmationHandler, coroutineScope, errorReporter, linkInlineInteractor, linkPaymentLauncher, linkAccountHolder, new Function1() { // from class: com.stripe.android.paymentsheet.ui.DefaultWalletButtonsInteractor$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultWalletButtonsInteractor.Companion.create$lambda$4(((Boolean) obj).booleanValue());
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Arguments create$lambda$3(String str, EmbeddedConfirmationStateHolder.State state) {
            if (state == null) {
                return null;
            }
            CommonConfiguration commonConfigurationAsCommonConfiguration = CommonConfigurationKt.asCommonConfiguration(state.getConfiguration());
            return new Arguments(str, state.getPaymentMethodMetadata(), commonConfigurationAsCommonConfiguration, state.getConfiguration().getAppearance(), state.getInitializationMode(), WalletType.getEntries(), state.getSelection());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit create$lambda$4(boolean z) {
            return Unit.INSTANCE;
        }
    }
}
