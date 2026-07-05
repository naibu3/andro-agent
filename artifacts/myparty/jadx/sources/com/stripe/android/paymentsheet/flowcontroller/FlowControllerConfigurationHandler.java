package com.stripe.android.paymentsheet.flowcontroller;

import androidx.appcompat.app.AppCompatDelegate;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.ServerProtocol;
import com.nimbusds.jose.crypto.impl.AESGCM;
import com.stripe.android.common.model.CommonConfiguration;
import com.stripe.android.common.model.CommonConfigurationKt;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.injection.UIContext;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetConfigurationKtxKt;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEventKt;
import com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import com.stripe.android.paymentsheet.state.PaymentSheetLoadingException;
import com.stripe.android.paymentsheet.state.PaymentSheetState;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: FlowControllerConfigurationHandler.kt */
@Singleton
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001+BC\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020!J.\u0010\"\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020!H\u0082@¢\u0006\u0002\u0010#J&\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020(H\u0082@¢\u0006\u0002\u0010)J\b\u0010*\u001a\u00020\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006,"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;", "", "paymentElementLoader", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader;", "uiContext", "Lkotlin/coroutines/CoroutineContext;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "viewModel", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;", "paymentSelectionUpdater", "Lcom/stripe/android/paymentsheet/flowcontroller/PaymentSelectionUpdater;", "isLiveModeProvider", "Lkotlin/Function0;", "", "<init>", "(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;Lcom/stripe/android/paymentsheet/flowcontroller/PaymentSelectionUpdater;Lkotlin/jvm/functions/Function0;)V", "job", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlinx/coroutines/Job;", "didLastConfigurationFail", "isConfigured", "()Z", "configure", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "initializationMode", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "configuration", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "initializedViaCompose", "callback", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;", "configureInternal", "(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ZLcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onInitSuccess", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;", "configureRequest", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;", "(Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetJob", "ConfigureRequest", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FlowControllerConfigurationHandler {
    public static final int $stable = 8;
    private boolean didLastConfigurationFail;
    private final EventReporter eventReporter;
    private final Function0<Boolean> isLiveModeProvider;
    private final AtomicReference<Job> job;
    private final PaymentElementLoader paymentElementLoader;
    private final PaymentSelectionUpdater paymentSelectionUpdater;
    private final CoroutineContext uiContext;
    private final FlowControllerViewModel viewModel;

    /* compiled from: FlowControllerConfigurationHandler.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.flowcontroller.FlowControllerConfigurationHandler", f = "FlowControllerConfigurationHandler.kt", i = {2, 2, 2, 2, 4, 4}, l = {82, 90, AESGCM.IV_BIT_LENGTH, 106, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 110, 114}, m = "configureInternal", n = {"this", "configuration", "callback", "configureRequest", "this", "callback"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
    /* renamed from: com.stripe.android.paymentsheet.flowcontroller.FlowControllerConfigurationHandler$configureInternal$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowControllerConfigurationHandler.this.configureInternal(null, null, false, null, this);
        }
    }

    @Inject
    public FlowControllerConfigurationHandler(PaymentElementLoader paymentElementLoader, @UIContext CoroutineContext uiContext, EventReporter eventReporter, FlowControllerViewModel viewModel, PaymentSelectionUpdater paymentSelectionUpdater, @Named(NamedConstantsKt.IS_LIVE_MODE) Function0<Boolean> isLiveModeProvider) {
        Intrinsics.checkNotNullParameter(paymentElementLoader, "paymentElementLoader");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(paymentSelectionUpdater, "paymentSelectionUpdater");
        Intrinsics.checkNotNullParameter(isLiveModeProvider, "isLiveModeProvider");
        this.paymentElementLoader = paymentElementLoader;
        this.uiContext = uiContext;
        this.eventReporter = eventReporter;
        this.viewModel = viewModel;
        this.paymentSelectionUpdater = paymentSelectionUpdater;
        this.isLiveModeProvider = isLiveModeProvider;
        this.job = new AtomicReference<>(null);
    }

    public final boolean isConfigured() {
        Job job = this.job.get();
        return ((job != null ? job.isCompleted() ^ true : false) || this.didLastConfigurationFail) ? false : true;
    }

    public final void configure(CoroutineScope scope, PaymentElementLoader.InitializationMode initializationMode, PaymentSheet.Configuration configuration, boolean initializedViaCompose, PaymentSheet.FlowController.ConfigCallback callback) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(initializationMode, "initializationMode");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Job andSet = this.job.getAndSet(BuildersKt__Builders_commonKt.launch$default(scope, null, null, new FlowControllerConfigurationHandler$configure$oldJob$1(this, initializationMode, configuration, initializedViaCompose, callback, null), 3, null));
        if (andSet != null) {
            Job.DefaultImpls.cancel$default(andSet, (CancellationException) null, 1, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ae, code lost:
    
        if (configureInternal$onConfigured$default(r8, r12, null, r4, 4, null) == r7) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0103, code lost:
    
        if (configureInternal$onConfigured(r10, r2, r9, r4) == r7) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0131, code lost:
    
        if (configureInternal$onConfigured$default(r10, r2, null, r4, 4, null) != r7) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0143, code lost:
    
        if (configureInternal$onConfigured(r10, r2, r0, r4) == r7) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0156, code lost:
    
        if (configureInternal$onConfigured(r8, r12, r0, r4) != r7) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object configureInternal(PaymentElementLoader.InitializationMode initializationMode, PaymentSheet.Configuration configuration, boolean z, PaymentSheet.FlowController.ConfigCallback configCallback, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        PaymentSheet.FlowController.ConfigCallback configCallback2;
        Object value;
        ConfigureRequest configureRequest;
        PaymentSheet.Configuration configuration2;
        FlowControllerConfigurationHandler flowControllerConfigurationHandler;
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
        switch (anonymousClass12.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                try {
                    initializationMode.validate();
                    CommonConfigurationKt.asCommonConfiguration(configuration).validate(this.isLiveModeProvider.invoke().booleanValue());
                    PaymentSheetConfigurationKtxKt.parseAppearance(configuration.getAppearance());
                    ConfigureRequest configureRequest2 = new ConfigureRequest(initializationMode, configuration);
                    if (Intrinsics.areEqual(this.viewModel.getPreviousConfigureRequest(), configureRequest2)) {
                        anonymousClass12.label = 2;
                        break;
                    } else {
                        configCallback2 = configCallback;
                        this.viewModel.resetSession();
                        PaymentElementLoader paymentElementLoader = this.paymentElementLoader;
                        CommonConfiguration commonConfigurationAsCommonConfiguration = CommonConfigurationKt.asCommonConfiguration(configuration);
                        PaymentElementLoader.Metadata metadata = new PaymentElementLoader.Metadata(false, z);
                        anonymousClass12.L$0 = this;
                        anonymousClass12.L$1 = configuration;
                        anonymousClass12.L$2 = configCallback2;
                        anonymousClass12.L$3 = configureRequest2;
                        anonymousClass12.label = 3;
                        Object objMo8425loadBWLJW6A = paymentElementLoader.mo8425loadBWLJW6A(initializationMode, commonConfigurationAsCommonConfiguration, metadata, anonymousClass12);
                        if (objMo8425loadBWLJW6A != coroutine_suspended) {
                            value = objMo8425loadBWLJW6A;
                            configureRequest = configureRequest2;
                            configuration2 = configuration;
                            flowControllerConfigurationHandler = this;
                            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(value);
                            if (thM9121exceptionOrNullimpl != null) {
                                PaymentElementLoader.State state = (PaymentElementLoader.State) value;
                                if (state.getValidationError() != null) {
                                    PaymentSheetLoadingException validationError = state.getValidationError();
                                    anonymousClass12.L$0 = null;
                                    anonymousClass12.L$1 = null;
                                    anonymousClass12.L$2 = null;
                                    anonymousClass12.L$3 = null;
                                    anonymousClass12.label = 4;
                                    break;
                                } else {
                                    flowControllerConfigurationHandler.viewModel.setPreviousConfigureRequest(configureRequest);
                                    PaymentSheetState.Full full = new PaymentSheetState.Full(state);
                                    anonymousClass12.L$0 = flowControllerConfigurationHandler;
                                    anonymousClass12.L$1 = configCallback2;
                                    anonymousClass12.L$2 = null;
                                    anonymousClass12.L$3 = null;
                                    anonymousClass12.label = 5;
                                    if (flowControllerConfigurationHandler.onInitSuccess(full, configuration2, configureRequest, anonymousClass12) != coroutine_suspended) {
                                        anonymousClass12.L$0 = null;
                                        anonymousClass12.L$1 = null;
                                        anonymousClass12.label = 6;
                                        break;
                                    }
                                }
                            } else {
                                anonymousClass12.L$0 = null;
                                anonymousClass12.L$1 = null;
                                anonymousClass12.L$2 = null;
                                anonymousClass12.L$3 = null;
                                anonymousClass12.label = 7;
                                break;
                            }
                        }
                    }
                } catch (IllegalArgumentException e) {
                    anonymousClass12.label = 1;
                    break;
                }
                return coroutine_suspended;
            case 1:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 2:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 3:
                configureRequest = (ConfigureRequest) anonymousClass12.L$3;
                PaymentSheet.FlowController.ConfigCallback configCallback3 = (PaymentSheet.FlowController.ConfigCallback) anonymousClass12.L$2;
                PaymentSheet.Configuration configuration3 = (PaymentSheet.Configuration) anonymousClass12.L$1;
                FlowControllerConfigurationHandler flowControllerConfigurationHandler2 = (FlowControllerConfigurationHandler) anonymousClass12.L$0;
                ResultKt.throwOnFailure(obj);
                value = ((Result) obj).getValue();
                configuration2 = configuration3;
                flowControllerConfigurationHandler = flowControllerConfigurationHandler2;
                configCallback2 = configCallback3;
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(value);
                if (thM9121exceptionOrNullimpl != null) {
                }
                break;
            case 4:
            case 6:
            case 7:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 5:
                PaymentSheet.FlowController.ConfigCallback configCallback4 = (PaymentSheet.FlowController.ConfigCallback) anonymousClass12.L$1;
                flowControllerConfigurationHandler = (FlowControllerConfigurationHandler) anonymousClass12.L$0;
                ResultKt.throwOnFailure(obj);
                configCallback2 = configCallback4;
                anonymousClass12.L$0 = null;
                anonymousClass12.L$1 = null;
                anonymousClass12.label = 6;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static /* synthetic */ Object configureInternal$onConfigured$default(FlowControllerConfigurationHandler flowControllerConfigurationHandler, PaymentSheet.FlowController.ConfigCallback configCallback, Throwable th, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        return configureInternal$onConfigured(flowControllerConfigurationHandler, configCallback, th, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object configureInternal$onConfigured(FlowControllerConfigurationHandler flowControllerConfigurationHandler, PaymentSheet.FlowController.ConfigCallback configCallback, Throwable th, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(flowControllerConfigurationHandler.uiContext, new FlowControllerConfigurationHandler$configureInternal$onConfigured$2(flowControllerConfigurationHandler, th, configCallback, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onInitSuccess(PaymentSheetState.Full full, PaymentSheet.Configuration configuration, ConfigureRequest configureRequest, Continuation<? super Unit> continuation) {
        boolean z = configureRequest.getInitializationMode() instanceof PaymentElementLoader.InitializationMode.DeferredIntent;
        this.eventReporter.onInit(CommonConfigurationKt.asCommonConfiguration(configuration), configuration.getAppearance(), Boxing.boxBoolean(PaymentSheetEventKt.primaryButtonColorUsage(configuration)), new PaymentSheetEvent.ConfigurationSpecificPayload.PaymentSheet(configuration), z);
        FlowControllerViewModel flowControllerViewModel = this.viewModel;
        PaymentSelectionUpdater paymentSelectionUpdater = this.paymentSelectionUpdater;
        PaymentSelection paymentSelection = flowControllerViewModel.getPaymentSelection();
        DefaultFlowController.State state = this.viewModel.getState();
        flowControllerViewModel.setPaymentSelection(paymentSelectionUpdater.invoke(paymentSelection, state != null ? state.getConfig() : null, full, configuration, this.viewModel.getWalletButtonsRendered()));
        Object objWithContext = BuildersKt.withContext(this.uiContext, new AnonymousClass2(full, configuration, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* compiled from: FlowControllerConfigurationHandler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.flowcontroller.FlowControllerConfigurationHandler$onInitSuccess$2", f = "FlowControllerConfigurationHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.flowcontroller.FlowControllerConfigurationHandler$onInitSuccess$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PaymentSheet.Configuration $configuration;
        final /* synthetic */ PaymentSheetState.Full $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PaymentSheetState.Full full, PaymentSheet.Configuration configuration, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$state = full;
            this.$configuration = configuration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FlowControllerConfigurationHandler.this.new AnonymousClass2(this.$state, this.$configuration, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                FlowControllerConfigurationHandler.this.viewModel.setState(new DefaultFlowController.State(this.$state, this.$configuration, false, 4, null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetJob() {
        this.job.set(null);
    }

    /* compiled from: FlowControllerConfigurationHandler.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;", "", "initializationMode", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "configuration", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "<init>", "(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V", "getInitializationMode", "()Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "getConfiguration", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConfigureRequest {
        public static final int $stable = 8;
        private final PaymentSheet.Configuration configuration;
        private final PaymentElementLoader.InitializationMode initializationMode;

        public static /* synthetic */ ConfigureRequest copy$default(ConfigureRequest configureRequest, PaymentElementLoader.InitializationMode initializationMode, PaymentSheet.Configuration configuration, int i, Object obj) {
            if ((i & 1) != 0) {
                initializationMode = configureRequest.initializationMode;
            }
            if ((i & 2) != 0) {
                configuration = configureRequest.configuration;
            }
            return configureRequest.copy(initializationMode, configuration);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentElementLoader.InitializationMode getInitializationMode() {
            return this.initializationMode;
        }

        /* renamed from: component2, reason: from getter */
        public final PaymentSheet.Configuration getConfiguration() {
            return this.configuration;
        }

        public final ConfigureRequest copy(PaymentElementLoader.InitializationMode initializationMode, PaymentSheet.Configuration configuration) {
            Intrinsics.checkNotNullParameter(initializationMode, "initializationMode");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return new ConfigureRequest(initializationMode, configuration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConfigureRequest)) {
                return false;
            }
            ConfigureRequest configureRequest = (ConfigureRequest) other;
            return Intrinsics.areEqual(this.initializationMode, configureRequest.initializationMode) && Intrinsics.areEqual(this.configuration, configureRequest.configuration);
        }

        public int hashCode() {
            return (this.initializationMode.hashCode() * 31) + this.configuration.hashCode();
        }

        public String toString() {
            return "ConfigureRequest(initializationMode=" + this.initializationMode + ", configuration=" + this.configuration + ")";
        }

        public ConfigureRequest(PaymentElementLoader.InitializationMode initializationMode, PaymentSheet.Configuration configuration) {
            Intrinsics.checkNotNullParameter(initializationMode, "initializationMode");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.initializationMode = initializationMode;
            this.configuration = configuration;
        }

        public final PaymentElementLoader.InitializationMode getInitializationMode() {
            return this.initializationMode;
        }

        public final PaymentSheet.Configuration getConfiguration() {
            return this.configuration;
        }
    }
}
