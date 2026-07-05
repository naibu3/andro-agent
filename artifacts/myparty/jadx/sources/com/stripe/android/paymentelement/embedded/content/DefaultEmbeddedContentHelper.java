package com.stripe.android.paymentelement.embedded.content;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.injection.UIContext;
import com.stripe.android.core.injection.ViewModelScope;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.account.LinkAccountHolder;
import com.stripe.android.link.verification.NoOpLinkInlineInteractor;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentelement.EmbeddedPaymentElement;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.paymentelement.embedded.EmbeddedFormHelperFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedRowSelectionImmediateActionHandler;
import com.stripe.android.paymentelement.embedded.EmbeddedSelectionHolder;
import com.stripe.android.paymentelement.embedded.content.EmbeddedConfirmationStateHolder;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.paymentsheet.CustomerStateHolder;
import com.stripe.android.paymentsheet.DisplayableSavedPaymentMethod;
import com.stripe.android.paymentsheet.FormHelper;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.SavedPaymentMethodMutator;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.forms.FormFieldValues;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.paymentsheet.state.CustomerState;
import com.stripe.android.paymentsheet.state.WalletsState;
import com.stripe.android.paymentsheet.ui.DefaultWalletButtonsInteractor;
import com.stripe.android.paymentsheet.ui.WalletButtonsContent;
import com.stripe.android.paymentsheet.ui.WalletButtonsInteractor;
import com.stripe.android.paymentsheet.verticalmode.DefaultPaymentMethodVerticalLayoutInteractor;
import com.stripe.android.paymentsheet.verticalmode.PaymentMethodIncentiveInteractor;
import com.stripe.android.paymentsheet.verticalmode.PaymentMethodVerticalLayoutInteractor;
import com.stripe.android.uicore.utils.StateFlowsKt;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: EmbeddedContentHelper.kt */
@Singleton
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 Q2\u00020\u0001:\u0002PQB³\u0001\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u001a\u0010\u0015\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017j\u0004\u0018\u0001`\u00190\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'¢\u0006\u0004\b(\u0010)J \u00109\u001a\u00020\u00182\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0016J\b\u0010@\u001a\u00020\u0018H\u0016J\u0010\u0010A\u001a\u00020\u00182\u0006\u00107\u001a\u000208H\u0016J\b\u0010B\u001a\u00020\u0018H\u0016J\u0010\u0010C\u001a\u00020D2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J8\u0010E\u001a\u00020F2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010:\u001a\u00020;2\u000e\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010H0+2\u0006\u0010I\u001a\u00020?2\u0006\u0010>\u001a\u00020?H\u0002J \u0010J\u001a\u00020K2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010:\u001a\u00020;2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010L\u001a\u00020\u0018H\u0002J\u0012\u0010M\u001a\u00020\u00182\b\u0010N\u001a\u0004\u0018\u00010OH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0015\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017j\u0004\u0018\u0001`\u00190\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0+X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0016\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040.X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040+X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00102R\u0010\u00107\u001a\u0004\u0018\u000108X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006R"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContentHelper;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "uiContext", "customerRepository", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", "selectionHolder", "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;", "embeddedLinkHelper", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedLinkHelper;", "rowSelectionImmediateActionHandler", "Lcom/stripe/android/paymentelement/embedded/EmbeddedRowSelectionImmediateActionHandler;", "internalRowSelectionCallback", "Ljavax/inject/Provider;", "Lkotlin/Function0;", "", "Lcom/stripe/android/paymentelement/embedded/InternalRowSelectionCallback;", "embeddedWalletsHelper", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedWalletsHelper;", "customerStateHolder", "Lcom/stripe/android/paymentsheet/CustomerStateHolder;", "embeddedFormHelperFactory", "Lcom/stripe/android/paymentelement/embedded/EmbeddedFormHelperFactory;", "confirmationHandler", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;", "confirmationStateHolder", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;", "linkPaymentLauncher", "Lcom/stripe/android/link/LinkPaymentLauncher;", "linkAccountHolder", "Lcom/stripe/android/link/account/LinkAccountHolder;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedLinkHelper;Lcom/stripe/android/paymentelement/embedded/EmbeddedRowSelectionImmediateActionHandler;Ljavax/inject/Provider;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedWalletsHelper;Lcom/stripe/android/paymentsheet/CustomerStateHolder;Lcom/stripe/android/paymentelement/embedded/EmbeddedFormHelperFactory;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;Lcom/stripe/android/link/LinkPaymentLauncher;Lcom/stripe/android/link/account/LinkAccountHolder;)V", ServerProtocol.DIALOG_PARAM_STATE, "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$State;", "_embeddedContent", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContent;", "embeddedContent", "getEmbeddedContent", "()Lkotlinx/coroutines/flow/StateFlow;", "_walletButtonsContent", "Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;", "walletButtonsContent", "getWalletButtonsContent", "sheetLauncher", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedSheetLauncher;", "dataLoaded", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "appearance", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;", "embeddedViewDisplaysMandateText", "", "clearEmbeddedContent", "setSheetLauncher", "clearSheetLauncher", "createWalletButtonsInteractor", "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor;", "createInteractor", "Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor;", "walletsState", "Lcom/stripe/android/paymentsheet/state/WalletsState;", "isImmediateAction", "createSavedPaymentMethodMutator", "Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;", "invokeRowSelectionCallback", "setSelection", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "State", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultEmbeddedContentHelper implements EmbeddedContentHelper {
    public static final String STATE_KEY_EMBEDDED_CONTENT = "STATE_KEY_EMBEDDED_CONTENT";
    private final MutableStateFlow<EmbeddedContent> _embeddedContent;
    private final MutableStateFlow<WalletButtonsContent> _walletButtonsContent;
    private final ConfirmationHandler confirmationHandler;
    private final EmbeddedConfirmationStateHolder confirmationStateHolder;
    private final CoroutineScope coroutineScope;
    private final CustomerRepository customerRepository;
    private final CustomerStateHolder customerStateHolder;
    private final StateFlow<EmbeddedContent> embeddedContent;
    private final EmbeddedFormHelperFactory embeddedFormHelperFactory;
    private final EmbeddedLinkHelper embeddedLinkHelper;
    private final EmbeddedWalletsHelper embeddedWalletsHelper;
    private final ErrorReporter errorReporter;
    private final EventReporter eventReporter;
    private final Provider<Function0<Unit>> internalRowSelectionCallback;
    private final LinkAccountHolder linkAccountHolder;
    private final LinkPaymentLauncher linkPaymentLauncher;
    private final EmbeddedRowSelectionImmediateActionHandler rowSelectionImmediateActionHandler;
    private final SavedStateHandle savedStateHandle;
    private final EmbeddedSelectionHolder selectionHolder;
    private EmbeddedSheetLauncher sheetLauncher;
    private final StateFlow<State> state;
    private final CoroutineContext uiContext;
    private final StateFlow<WalletButtonsContent> walletButtonsContent;
    private final CoroutineContext workContext;
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createInteractor$lambda$2(EmbeddedConfirmationStateHolder.State state) {
        return state != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createInteractor$lambda$3(boolean z, boolean z2) {
        return z && z2;
    }

    @Inject
    public DefaultEmbeddedContentHelper(@ViewModelScope CoroutineScope coroutineScope, SavedStateHandle savedStateHandle, EventReporter eventReporter, ErrorReporter errorReporter, @IOContext CoroutineContext workContext, @UIContext CoroutineContext uiContext, CustomerRepository customerRepository, EmbeddedSelectionHolder selectionHolder, EmbeddedLinkHelper embeddedLinkHelper, EmbeddedRowSelectionImmediateActionHandler rowSelectionImmediateActionHandler, Provider<Function0<Unit>> internalRowSelectionCallback, EmbeddedWalletsHelper embeddedWalletsHelper, CustomerStateHolder customerStateHolder, EmbeddedFormHelperFactory embeddedFormHelperFactory, ConfirmationHandler confirmationHandler, EmbeddedConfirmationStateHolder confirmationStateHolder, LinkPaymentLauncher linkPaymentLauncher, LinkAccountHolder linkAccountHolder) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(customerRepository, "customerRepository");
        Intrinsics.checkNotNullParameter(selectionHolder, "selectionHolder");
        Intrinsics.checkNotNullParameter(embeddedLinkHelper, "embeddedLinkHelper");
        Intrinsics.checkNotNullParameter(rowSelectionImmediateActionHandler, "rowSelectionImmediateActionHandler");
        Intrinsics.checkNotNullParameter(internalRowSelectionCallback, "internalRowSelectionCallback");
        Intrinsics.checkNotNullParameter(embeddedWalletsHelper, "embeddedWalletsHelper");
        Intrinsics.checkNotNullParameter(customerStateHolder, "customerStateHolder");
        Intrinsics.checkNotNullParameter(embeddedFormHelperFactory, "embeddedFormHelperFactory");
        Intrinsics.checkNotNullParameter(confirmationHandler, "confirmationHandler");
        Intrinsics.checkNotNullParameter(confirmationStateHolder, "confirmationStateHolder");
        Intrinsics.checkNotNullParameter(linkPaymentLauncher, "linkPaymentLauncher");
        Intrinsics.checkNotNullParameter(linkAccountHolder, "linkAccountHolder");
        this.coroutineScope = coroutineScope;
        this.savedStateHandle = savedStateHandle;
        this.eventReporter = eventReporter;
        this.errorReporter = errorReporter;
        this.workContext = workContext;
        this.uiContext = uiContext;
        this.customerRepository = customerRepository;
        this.selectionHolder = selectionHolder;
        this.embeddedLinkHelper = embeddedLinkHelper;
        this.rowSelectionImmediateActionHandler = rowSelectionImmediateActionHandler;
        this.internalRowSelectionCallback = internalRowSelectionCallback;
        this.embeddedWalletsHelper = embeddedWalletsHelper;
        this.customerStateHolder = customerStateHolder;
        this.embeddedFormHelperFactory = embeddedFormHelperFactory;
        this.confirmationHandler = confirmationHandler;
        this.confirmationStateHolder = confirmationStateHolder;
        this.linkPaymentLauncher = linkPaymentLauncher;
        this.linkAccountHolder = linkAccountHolder;
        this.state = savedStateHandle.getStateFlow(STATE_KEY_EMBEDDED_CONTENT, null);
        MutableStateFlow<EmbeddedContent> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._embeddedContent = MutableStateFlow;
        this.embeddedContent = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<WalletButtonsContent> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this._walletButtonsContent = MutableStateFlow2;
        this.walletButtonsContent = FlowKt.asStateFlow(MutableStateFlow2);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(null), 3, null);
    }

    @Override // com.stripe.android.paymentelement.embedded.content.EmbeddedContentHelper
    public StateFlow<EmbeddedContent> getEmbeddedContent() {
        return this.embeddedContent;
    }

    @Override // com.stripe.android.paymentelement.embedded.content.EmbeddedContentHelper
    public StateFlow<WalletButtonsContent> getWalletButtonsContent() {
        return this.walletButtonsContent;
    }

    /* compiled from: EmbeddedContentHelper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedContentHelper$1", f = "EmbeddedContentHelper.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedContentHelper$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultEmbeddedContentHelper.this.new AnonymousClass1(continuation);
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
                StateFlow stateFlow = DefaultEmbeddedContentHelper.this.state;
                final DefaultEmbeddedContentHelper defaultEmbeddedContentHelper = DefaultEmbeddedContentHelper.this;
                this.label = 1;
                if (stateFlow.collect(new FlowCollector() { // from class: com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedContentHelper.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((State) obj2, (Continuation<? super Unit>) continuation);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v5, types: [com.stripe.android.paymentelement.embedded.content.EmbeddedContent] */
                    public final Object emit(State state, Continuation<? super Unit> continuation) {
                        T embeddedContent;
                        MutableStateFlow mutableStateFlow = defaultEmbeddedContentHelper._embeddedContent;
                        if (state == null) {
                            embeddedContent = null;
                        } else {
                            boolean z = defaultEmbeddedContentHelper.internalRowSelectionCallback.get() != null;
                            DefaultEmbeddedContentHelper defaultEmbeddedContentHelper2 = defaultEmbeddedContentHelper;
                            embeddedContent = new EmbeddedContent(defaultEmbeddedContentHelper2.createInteractor(defaultEmbeddedContentHelper2.coroutineScope, state.getPaymentMethodMetadata(), defaultEmbeddedContentHelper.embeddedWalletsHelper.walletsState(state.getPaymentMethodMetadata()), z, state.getEmbeddedViewDisplaysMandateText()), state.getEmbeddedViewDisplaysMandateText(), state.getAppearance(), z);
                        }
                        mutableStateFlow.setValue(embeddedContent);
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

    /* compiled from: EmbeddedContentHelper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedContentHelper$2", f = "EmbeddedContentHelper.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedContentHelper$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultEmbeddedContentHelper.this.new AnonymousClass2(continuation);
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
                StateFlow stateFlow = DefaultEmbeddedContentHelper.this.state;
                final DefaultEmbeddedContentHelper defaultEmbeddedContentHelper = DefaultEmbeddedContentHelper.this;
                this.label = 1;
                if (stateFlow.collect(new FlowCollector() { // from class: com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedContentHelper.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((State) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(State state, Continuation<? super Unit> continuation) {
                        WalletButtonsContent walletButtonsContent;
                        MutableStateFlow mutableStateFlow = defaultEmbeddedContentHelper._walletButtonsContent;
                        if (state == null) {
                            walletButtonsContent = null;
                        } else {
                            DefaultEmbeddedContentHelper defaultEmbeddedContentHelper2 = defaultEmbeddedContentHelper;
                            walletButtonsContent = new WalletButtonsContent(defaultEmbeddedContentHelper2.createWalletButtonsInteractor(defaultEmbeddedContentHelper2.coroutineScope));
                        }
                        mutableStateFlow.setValue(walletButtonsContent);
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

    @Override // com.stripe.android.paymentelement.embedded.content.EmbeddedContentHelper
    public void dataLoaded(PaymentMethodMetadata paymentMethodMetadata, PaymentSheet.Appearance.Embedded appearance, boolean embeddedViewDisplaysMandateText) {
        Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
        Intrinsics.checkNotNullParameter(appearance, "appearance");
        this.eventReporter.onShowNewPaymentOptions();
        this.savedStateHandle.set(STATE_KEY_EMBEDDED_CONTENT, new State(paymentMethodMetadata, appearance, embeddedViewDisplaysMandateText));
    }

    @Override // com.stripe.android.paymentelement.embedded.content.EmbeddedContentHelper
    public void clearEmbeddedContent() {
        this.savedStateHandle.set(STATE_KEY_EMBEDDED_CONTENT, null);
    }

    @Override // com.stripe.android.paymentelement.embedded.content.EmbeddedContentHelper
    public void setSheetLauncher(EmbeddedSheetLauncher sheetLauncher) {
        Intrinsics.checkNotNullParameter(sheetLauncher, "sheetLauncher");
        this.sheetLauncher = sheetLauncher;
    }

    @Override // com.stripe.android.paymentelement.embedded.content.EmbeddedContentHelper
    public void clearSheetLauncher() {
        this.sheetLauncher = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WalletButtonsInteractor createWalletButtonsInteractor(CoroutineScope coroutineScope) {
        return DefaultWalletButtonsInteractor.INSTANCE.create(new NoOpLinkInlineInteractor(), this.embeddedLinkHelper, this.confirmationStateHolder, this.confirmationHandler, coroutineScope, this.errorReporter, this.linkPaymentLauncher, this.linkAccountHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentMethodVerticalLayoutInteractor createInteractor(CoroutineScope coroutineScope, final PaymentMethodMetadata paymentMethodMetadata, StateFlow<WalletsState> walletsState, boolean isImmediateAction, boolean embeddedViewDisplaysMandateText) {
        PaymentMethodIncentiveInteractor paymentMethodIncentiveInteractor = new PaymentMethodIncentiveInteractor(paymentMethodMetadata.getPaymentMethodIncentive());
        final FormHelper formHelperCreate = this.embeddedFormHelperFactory.create(coroutineScope, false, paymentMethodMetadata, this.eventReporter, new Function1() { // from class: com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedContentHelper$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DefaultEmbeddedContentHelper.createInteractor$lambda$0(this.f$0, (PaymentSelection) obj);
            }
        });
        SavedPaymentMethodMutator savedPaymentMethodMutatorCreateSavedPaymentMethodMutator = createSavedPaymentMethodMutator(coroutineScope, paymentMethodMetadata, this.customerStateHolder);
        return new DefaultPaymentMethodVerticalLayoutInteractor(paymentMethodMetadata, StateFlowsKt.combineAsStateFlow(StateFlowsKt.mapAsStateFlow(this.confirmationHandler.getState(), new Function1() { // from class: com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedContentHelper$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(DefaultEmbeddedContentHelper.createInteractor$lambda$1((ConfirmationHandler.State) obj));
            }
        }), StateFlowsKt.mapAsStateFlow(this.confirmationStateHolder.getStateFlow(), new Function1() { // from class: com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedContentHelper$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(DefaultEmbeddedContentHelper.createInteractor$lambda$2((EmbeddedConfirmationStateHolder.State) obj));
            }
        }), new Function2() { // from class: com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedContentHelper$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(DefaultEmbeddedContentHelper.createInteractor$lambda$3(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue()));
            }
        }), this.selectionHolder.getTemporarySelection(), this.selectionHolder.getSelection(), paymentMethodIncentiveInteractor, new Function1() { // from class: com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedContentHelper$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DefaultEmbeddedContentHelper.createInteractor$lambda$4(formHelperCreate, (String) obj);
            }
        }, new AnonymousClass4(formHelperCreate), new Function0() { // from class: com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedContentHelper$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DefaultEmbeddedContentHelper.createInteractor$lambda$5(this.f$0, paymentMethodMetadata);
            }
        }, new Function1() { // from class: com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedContentHelper$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DefaultEmbeddedContentHelper.createInteractor$lambda$7(this.f$0, paymentMethodMetadata, (String) obj);
            }
        }, this.customerStateHolder.getPaymentMethods(), this.customerStateHolder.getMostRecentlySelectedSavedPaymentMethod(), savedPaymentMethodMutatorCreateSavedPaymentMethodMutator.getProvidePaymentMethodName(), this.customerStateHolder.getCanRemove(), walletsState, true, false, this.customerStateHolder.getCanUpdateFullPaymentMethodDetails(), new Function2() { // from class: com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedContentHelper$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DefaultEmbeddedContentHelper.createInteractor$lambda$8(this.f$0, (PaymentSelection) obj, ((Boolean) obj2).booleanValue());
            }
        }, StateFlowsKt.stateFlowOf(true), new AnonymousClass5(this.eventReporter), new AnonymousClass6(this.eventReporter), new AnonymousClass7(savedPaymentMethodMutatorCreateSavedPaymentMethodMutator), new Function1() { // from class: com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedContentHelper$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(DefaultEmbeddedContentHelper.createInteractor$lambda$9(this.f$0, formHelperCreate, (String) obj));
            }
        }, new AnonymousClass8(this), isImmediateAction && embeddedViewDisplaysMandateText, null, null, 100663296, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createInteractor$lambda$0(DefaultEmbeddedContentHelper defaultEmbeddedContentHelper, PaymentSelection paymentSelection) {
        defaultEmbeddedContentHelper.setSelection(paymentSelection);
        defaultEmbeddedContentHelper.invokeRowSelectionCallback();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createInteractor$lambda$1(ConfirmationHandler.State it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof ConfirmationHandler.State.Confirming;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FormHelper.FormType createInteractor$lambda$4(FormHelper formHelper, String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return formHelper.formTypeForCode(code);
    }

    /* compiled from: EmbeddedContentHelper.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedContentHelper$createInteractor$4, reason: invalid class name */
    /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements Function2<FormFieldValues, String, Unit> {
        AnonymousClass4(Object obj) {
            super(2, obj, FormHelper.class, "onFormFieldValuesChanged", "onFormFieldValuesChanged(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(FormFieldValues formFieldValues, String str) {
            invoke2(formFieldValues, str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FormFieldValues formFieldValues, String p1) {
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((FormHelper) this.receiver).onFormFieldValuesChanged(formFieldValues, p1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createInteractor$lambda$5(DefaultEmbeddedContentHelper defaultEmbeddedContentHelper, PaymentMethodMetadata paymentMethodMetadata) {
        EmbeddedSheetLauncher embeddedSheetLauncher = defaultEmbeddedContentHelper.sheetLauncher;
        if (embeddedSheetLauncher != null) {
            CustomerState value = defaultEmbeddedContentHelper.customerStateHolder.getCustomer().getValue();
            if (value != null) {
                embeddedSheetLauncher.launchManage(paymentMethodMetadata, value, defaultEmbeddedContentHelper.selectionHolder.getSelection().getValue());
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createInteractor$lambda$7(DefaultEmbeddedContentHelper defaultEmbeddedContentHelper, PaymentMethodMetadata paymentMethodMetadata, String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        EmbeddedSheetLauncher embeddedSheetLauncher = defaultEmbeddedContentHelper.sheetLauncher;
        if (embeddedSheetLauncher != null) {
            List<PaymentMethod> value = defaultEmbeddedContentHelper.customerStateHolder.getPaymentMethods().getValue();
            boolean z = false;
            if (!(value instanceof Collection) || !value.isEmpty()) {
                Iterator<T> it = value.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    PaymentMethod.Type type = ((PaymentMethod) it.next()).type;
                    if (Intrinsics.areEqual(type != null ? type.code : null, code)) {
                        z = true;
                        break;
                    }
                }
            }
            embeddedSheetLauncher.launchForm(code, paymentMethodMetadata, z, defaultEmbeddedContentHelper.confirmationStateHolder.getState());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createInteractor$lambda$8(DefaultEmbeddedContentHelper defaultEmbeddedContentHelper, PaymentSelection paymentSelection, boolean z) {
        defaultEmbeddedContentHelper.setSelection(paymentSelection);
        return Unit.INSTANCE;
    }

    /* compiled from: EmbeddedContentHelper.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedContentHelper$createInteractor$5, reason: invalid class name */
    /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements Function1<String, Unit> {
        AnonymousClass5(Object obj) {
            super(1, obj, EventReporter.class, "onSelectPaymentMethod", "onSelectPaymentMethod(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EventReporter) this.receiver).onSelectPaymentMethod(p0);
        }
    }

    /* compiled from: EmbeddedContentHelper.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedContentHelper$createInteractor$6, reason: invalid class name */
    /* synthetic */ class AnonymousClass6 extends FunctionReferenceImpl implements Function1<String, Unit> {
        AnonymousClass6(Object obj) {
            super(1, obj, EventReporter.class, "onPaymentMethodFormShown", "onPaymentMethodFormShown(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EventReporter) this.receiver).onPaymentMethodFormShown(p0);
        }
    }

    /* compiled from: EmbeddedContentHelper.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedContentHelper$createInteractor$7, reason: invalid class name */
    /* synthetic */ class AnonymousClass7 extends FunctionReferenceImpl implements Function1<DisplayableSavedPaymentMethod, Unit> {
        AnonymousClass7(Object obj) {
            super(1, obj, SavedPaymentMethodMutator.class, "updatePaymentMethod", "updatePaymentMethod(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DisplayableSavedPaymentMethod displayableSavedPaymentMethod) {
            invoke2(displayableSavedPaymentMethod);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DisplayableSavedPaymentMethod p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((SavedPaymentMethodMutator) this.receiver).updatePaymentMethod(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createInteractor$lambda$9(DefaultEmbeddedContentHelper defaultEmbeddedContentHelper, FormHelper formHelper, String str) {
        EmbeddedPaymentElement.Configuration configuration;
        EmbeddedConfirmationStateHolder.State state = defaultEmbeddedContentHelper.confirmationStateHolder.getState();
        return (((state == null || (configuration = state.getConfiguration()) == null) ? null : configuration.getFormSheetAction()) == EmbeddedPaymentElement.FormSheetAction.Confirm && str != null && Intrinsics.areEqual(formHelper.formTypeForCode(str), FormHelper.FormType.UserInteractionRequired.INSTANCE)) ? false : true;
    }

    /* compiled from: EmbeddedContentHelper.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedContentHelper$createInteractor$8, reason: invalid class name */
    /* synthetic */ class AnonymousClass8 extends FunctionReferenceImpl implements Function0<Unit> {
        AnonymousClass8(Object obj) {
            super(0, obj, DefaultEmbeddedContentHelper.class, "invokeRowSelectionCallback", "invokeRowSelectionCallback()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((DefaultEmbeddedContentHelper) this.receiver).invokeRowSelectionCallback();
        }
    }

    private final SavedPaymentMethodMutator createSavedPaymentMethodMutator(CoroutineScope coroutineScope, final PaymentMethodMetadata paymentMethodMetadata, final CustomerStateHolder customerStateHolder) {
        return new SavedPaymentMethodMutator(StateFlowsKt.stateFlowOf(paymentMethodMetadata), this.eventReporter, coroutineScope, this.workContext, this.uiContext, this.customerRepository, this.selectionHolder.getSelection(), new C10801(this), customerStateHolder, new C10812(null), new Function0() { // from class: com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedContentHelper$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, new Function5() { // from class: com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedContentHelper$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function5
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return DefaultEmbeddedContentHelper.createSavedPaymentMethodMutator$lambda$11(this.f$0, paymentMethodMetadata, customerStateHolder, (DisplayableSavedPaymentMethod) obj, ((Boolean) obj2).booleanValue(), (Function1) obj3, (Function2) obj4, (Function2) obj5);
            }
        }, StateFlowsKt.stateFlowOf(Boolean.valueOf(paymentMethodMetadata.getLinkState() != null)), false);
    }

    /* compiled from: EmbeddedContentHelper.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedContentHelper$createSavedPaymentMethodMutator$1, reason: invalid class name and case insensitive filesystem */
    /* synthetic */ class C10801 extends FunctionReferenceImpl implements Function1<PaymentSelection, Unit> {
        C10801(Object obj) {
            super(1, obj, DefaultEmbeddedContentHelper.class, "setSelection", "setSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PaymentSelection paymentSelection) {
            invoke2(paymentSelection);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PaymentSelection paymentSelection) {
            ((DefaultEmbeddedContentHelper) this.receiver).setSelection(paymentSelection);
        }
    }

    /* compiled from: EmbeddedContentHelper.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedContentHelper$createSavedPaymentMethodMutator$2", f = "EmbeddedContentHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedContentHelper$createSavedPaymentMethodMutator$2, reason: invalid class name and case insensitive filesystem */
    static final class C10812 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int label;

        C10812(Continuation<? super C10812> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C10812(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C10812) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createSavedPaymentMethodMutator$lambda$11(DefaultEmbeddedContentHelper defaultEmbeddedContentHelper, PaymentMethodMetadata paymentMethodMetadata, CustomerStateHolder customerStateHolder, DisplayableSavedPaymentMethod displayableSavedPaymentMethod, boolean z, Function1 function1, Function2 function2, Function2 function22) {
        Intrinsics.checkNotNullParameter(displayableSavedPaymentMethod, "<unused var>");
        Intrinsics.checkNotNullParameter(function1, "<unused var>");
        Intrinsics.checkNotNullParameter(function2, "<unused var>");
        Intrinsics.checkNotNullParameter(function22, "<unused var>");
        EmbeddedSheetLauncher embeddedSheetLauncher = defaultEmbeddedContentHelper.sheetLauncher;
        if (embeddedSheetLauncher != null) {
            CustomerState value = customerStateHolder.getCustomer().getValue();
            if (value != null) {
                embeddedSheetLauncher.launchManage(paymentMethodMetadata, value, defaultEmbeddedContentHelper.selectionHolder.getSelection().getValue());
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invokeRowSelectionCallback() {
        this.rowSelectionImmediateActionHandler.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSelection(PaymentSelection paymentSelection) {
        this.selectionHolder.set(paymentSelection);
    }

    /* compiled from: EmbeddedContentHelper.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$State;", "Landroid/os/Parcelable;", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "appearance", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;", "embeddedViewDisplaysMandateText", "", "<init>", "(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;Z)V", "getPaymentMethodMetadata", "()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "getAppearance", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;", "getEmbeddedViewDisplaysMandateText", "()Z", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class State implements Parcelable {
        private final PaymentSheet.Appearance.Embedded appearance;
        private final boolean embeddedViewDisplaysMandateText;
        private final PaymentMethodMetadata paymentMethodMetadata;
        public static final Parcelable.Creator<State> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: EmbeddedContentHelper.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<State> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new State(PaymentMethodMetadata.CREATOR.createFromParcel(parcel), PaymentSheet.Appearance.Embedded.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.paymentMethodMetadata.writeToParcel(dest, flags);
            this.appearance.writeToParcel(dest, flags);
            dest.writeInt(this.embeddedViewDisplaysMandateText ? 1 : 0);
        }

        public State(PaymentMethodMetadata paymentMethodMetadata, PaymentSheet.Appearance.Embedded appearance, boolean z) {
            Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            this.paymentMethodMetadata = paymentMethodMetadata;
            this.appearance = appearance;
            this.embeddedViewDisplaysMandateText = z;
        }

        public final PaymentMethodMetadata getPaymentMethodMetadata() {
            return this.paymentMethodMetadata;
        }

        public final PaymentSheet.Appearance.Embedded getAppearance() {
            return this.appearance;
        }

        public final boolean getEmbeddedViewDisplaysMandateText() {
            return this.embeddedViewDisplaysMandateText;
        }
    }
}
