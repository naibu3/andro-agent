package com.stripe.android.common.analytics.experiment;

import com.facebook.internal.ServerProtocol;
import com.stripe.android.common.analytics.experiment.LoggableExperiment;
import com.stripe.android.common.model.CommonConfiguration;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.LinkConfigurationCoordinator;
import com.stripe.android.link.repositories.LinkRepository;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.injection.LinkDisabledApiRepository;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.paymentsheet.state.CustomerState;
import com.stripe.android.paymentsheet.state.LinkState;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import com.stripe.android.paymentsheet.state.RetrieveCustomerEmail;
import javax.inject.Inject;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: LogLinkHoldbackExperiment.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001BE\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0096\u0002J&\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010\u001bJ\f\u0010\u001c\u001a\u00020\u001d*\u00020\u0019H\u0002J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0086@¢\u0006\u0002\u0010\"J\u0014\u0010#\u001a\u00020\u001f*\u00020\u00172\u0006\u0010$\u001a\u00020\u001fH\u0002J\u0014\u0010%\u001a\u0004\u0018\u00010!*\u00020\u0019H\u0082@¢\u0006\u0002\u0010&R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;", "Lcom/stripe/android/common/analytics/experiment/LogLinkHoldbackExperiment;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "linkDisabledApiRepository", "Lcom/stripe/android/link/repositories/LinkRepository;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "retrieveCustomerEmail", "Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;", "linkConfigurationCoordinator", "Lcom/stripe/android/link/LinkConfigurationCoordinator;", "mode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "logger", "Lcom/stripe/android/core/Logger;", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/link/repositories/LinkRepository;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;Lcom/stripe/android/link/LinkConfigurationCoordinator;Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/core/Logger;)V", "invoke", "", "experimentAssignment", "Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;", "elementsSession", "Lcom/stripe/android/model/ElementsSession;", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;", "logExposure", "(Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDefaultValues", "Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;", "isReturningUser", "", "email", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isSpmEnabled", "linkEnabled", "getEmail", "(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultLogLinkHoldbackExperiment implements LogLinkHoldbackExperiment {
    public static final int $stable = 8;
    private final EventReporter eventReporter;
    private final LinkConfigurationCoordinator linkConfigurationCoordinator;
    private final LinkRepository linkDisabledApiRepository;
    private final Logger logger;
    private final EventReporter.Mode mode;
    private final RetrieveCustomerEmail retrieveCustomerEmail;
    private final CoroutineContext workContext;

    /* compiled from: LogLinkHoldbackExperiment.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.common.analytics.experiment.DefaultLogLinkHoldbackExperiment", f = "LogLinkHoldbackExperiment.kt", i = {0}, l = {131}, m = "isReturningUser", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.common.analytics.experiment.DefaultLogLinkHoldbackExperiment$isReturningUser$1, reason: invalid class name and case insensitive filesystem */
    static final class C08011 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C08011(Continuation<? super C08011> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultLogLinkHoldbackExperiment.this.isReturningUser(null, this);
        }
    }

    /* compiled from: LogLinkHoldbackExperiment.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.common.analytics.experiment.DefaultLogLinkHoldbackExperiment", f = "LogLinkHoldbackExperiment.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {79, 83}, m = "logExposure", n = {"this", "elementsSession", ServerProtocol.DIALOG_PARAM_STATE, "experimentAssignment", "experimentsData", "experimentGroup", "this", "elementsSession", ServerProtocol.DIALOG_PARAM_STATE, "experimentAssignment", "experimentsData", "experimentGroup", "customerEmail", "defaultValues"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"})
    /* renamed from: com.stripe.android.common.analytics.experiment.DefaultLogLinkHoldbackExperiment$logExposure$1, reason: invalid class name and case insensitive filesystem */
    static final class C08021 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        C08021(Continuation<? super C08021> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultLogLinkHoldbackExperiment.this.logExposure(null, null, null, this);
        }
    }

    @Inject
    public DefaultLogLinkHoldbackExperiment(EventReporter eventReporter, @LinkDisabledApiRepository LinkRepository linkDisabledApiRepository, @IOContext CoroutineContext workContext, RetrieveCustomerEmail retrieveCustomerEmail, LinkConfigurationCoordinator linkConfigurationCoordinator, EventReporter.Mode mode, Logger logger) {
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(linkDisabledApiRepository, "linkDisabledApiRepository");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(retrieveCustomerEmail, "retrieveCustomerEmail");
        Intrinsics.checkNotNullParameter(linkConfigurationCoordinator, "linkConfigurationCoordinator");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.eventReporter = eventReporter;
        this.linkDisabledApiRepository = linkDisabledApiRepository;
        this.workContext = workContext;
        this.retrieveCustomerEmail = retrieveCustomerEmail;
        this.linkConfigurationCoordinator = linkConfigurationCoordinator;
        this.mode = mode;
        this.logger = logger;
    }

    /* compiled from: LogLinkHoldbackExperiment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.common.analytics.experiment.DefaultLogLinkHoldbackExperiment$invoke$1", f = "LogLinkHoldbackExperiment.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.common.analytics.experiment.DefaultLogLinkHoldbackExperiment$invoke$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ElementsSession $elementsSession;
        final /* synthetic */ ElementsSession.ExperimentAssignment $experimentAssignment;
        final /* synthetic */ PaymentElementLoader.State $state;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ElementsSession elementsSession, PaymentElementLoader.State state, ElementsSession.ExperimentAssignment experimentAssignment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$elementsSession = elementsSession;
            this.$state = state;
            this.$experimentAssignment = experimentAssignment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = DefaultLogLinkHoldbackExperiment.this.new AnonymousClass1(this.$elementsSession, this.$state, this.$experimentAssignment, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM9118constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    DefaultLogLinkHoldbackExperiment defaultLogLinkHoldbackExperiment = DefaultLogLinkHoldbackExperiment.this;
                    ElementsSession elementsSession = this.$elementsSession;
                    PaymentElementLoader.State state = this.$state;
                    ElementsSession.ExperimentAssignment experimentAssignment = this.$experimentAssignment;
                    Result.Companion companion = Result.INSTANCE;
                    this.label = 1;
                    if (defaultLogLinkHoldbackExperiment.logExposure(elementsSession, state, experimentAssignment, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            DefaultLogLinkHoldbackExperiment defaultLogLinkHoldbackExperiment2 = DefaultLogLinkHoldbackExperiment.this;
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl != null) {
                defaultLogLinkHoldbackExperiment2.logger.error("Failed to log Global holdback exposure", thM9121exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.stripe.android.common.analytics.experiment.LogLinkHoldbackExperiment
    public void invoke(ElementsSession.ExperimentAssignment experimentAssignment, ElementsSession elementsSession, PaymentElementLoader.State state) {
        Intrinsics.checkNotNullParameter(experimentAssignment, "experimentAssignment");
        Intrinsics.checkNotNullParameter(elementsSession, "elementsSession");
        Intrinsics.checkNotNullParameter(state, "state");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.workContext), null, null, new AnonymousClass1(elementsSession, state, experimentAssignment, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object logExposure(ElementsSession elementsSession, PaymentElementLoader.State state, ElementsSession.ExperimentAssignment experimentAssignment, Continuation<? super Unit> continuation) {
        C08021 c08021;
        String str;
        ElementsSession.ExperimentsData experimentsData;
        ElementsSession elementsSession2;
        DefaultLogLinkHoldbackExperiment defaultLogLinkHoldbackExperiment;
        String str2;
        LoggableExperiment.LinkHoldback.ProvidedDefaultValues defaultValues;
        ElementsSession.ExperimentAssignment experimentAssignment2;
        String str3;
        String str4;
        ElementsSession.ExperimentsData experimentsData2;
        DefaultLogLinkHoldbackExperiment defaultLogLinkHoldbackExperiment2;
        PaymentElementLoader.State state2;
        LoggableExperiment.LinkHoldback.ProvidedDefaultValues providedDefaultValues;
        ElementsSession.ExperimentAssignment experimentAssignment3;
        String str5;
        boolean z;
        LoggableExperiment.LinkHoldback.ProvidedDefaultValues providedDefaultValues2;
        LinkConfiguration configuration;
        PaymentElementLoader.State state3 = state;
        ElementsSession.ExperimentAssignment experimentAssignment4 = experimentAssignment;
        if (continuation instanceof C08021) {
            c08021 = (C08021) continuation;
            if ((c08021.label & Integer.MIN_VALUE) != 0) {
                c08021.label -= Integer.MIN_VALUE;
            } else {
                c08021 = new C08021(continuation);
            }
        }
        Object obj = c08021.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c08021.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (Intrinsics.areEqual(elementsSession.getFlags().get(ElementsSession.Flag.ELEMENTS_DISABLE_LINK_GLOBAL_HOLDBACK_LOOKUP), Boxing.boxBoolean(true))) {
                return Unit.INSTANCE;
            }
            ElementsSession.ExperimentsData experimentsData3 = elementsSession.getExperimentsData();
            if (experimentsData3 == null) {
                throw new IllegalArgumentException("Experiments data required to log exposures".toString());
            }
            ElementsSession.ExperimentsData experimentsData4 = elementsSession.getExperimentsData();
            if (experimentsData4 == null || (str = experimentsData4.getExperimentAssignments().get(experimentAssignment4)) == null) {
                str = "control";
            }
            c08021.L$0 = this;
            c08021.L$1 = elementsSession;
            c08021.L$2 = state3;
            c08021.L$3 = experimentAssignment4;
            c08021.L$4 = experimentsData3;
            c08021.L$5 = str;
            c08021.label = 1;
            Object email = getEmail(state3, c08021);
            if (email != coroutine_suspended) {
                experimentsData = experimentsData3;
                obj = email;
                elementsSession2 = elementsSession;
                defaultLogLinkHoldbackExperiment = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            providedDefaultValues = (LoggableExperiment.LinkHoldback.ProvidedDefaultValues) c08021.L$7;
            str3 = (String) c08021.L$6;
            str4 = (String) c08021.L$5;
            experimentsData2 = (ElementsSession.ExperimentsData) c08021.L$4;
            experimentAssignment2 = (ElementsSession.ExperimentAssignment) c08021.L$3;
            state2 = (PaymentElementLoader.State) c08021.L$2;
            elementsSession2 = (ElementsSession) c08021.L$1;
            defaultLogLinkHoldbackExperiment2 = (DefaultLogLinkHoldbackExperiment) c08021.L$0;
            ResultKt.throwOnFailure(obj);
            if (!((Boolean) obj).booleanValue()) {
                providedDefaultValues2 = providedDefaultValues;
                str5 = str4;
                experimentAssignment3 = experimentAssignment2;
                z = true;
                LinkState linkState = state2.getPaymentMethodMetadata().getLinkState();
                boolean z2 = (linkState == null || (configuration = linkState.getConfiguration()) == null || !defaultLogLinkHoldbackExperiment2.linkConfigurationCoordinator.linkGate(configuration).getUseNativeLink()) ? false : true;
                LoggableExperiment.LinkHoldback.EmailRecognitionSource emailRecognitionSource = LoggableExperiment.LinkHoldback.EmailRecognitionSource.EMAIL;
                if (str3 == null) {
                    emailRecognitionSource = null;
                }
                LoggableExperiment.LinkHoldback.EmailRecognitionSource emailRecognitionSource2 = emailRecognitionSource;
                boolean z3 = state2.getPaymentMethodMetadata().getLinkState() != null;
                defaultLogLinkHoldbackExperiment2.eventReporter.onExperimentExposure(new LoggableExperiment.LinkHoldback(experimentsData2.getArbId(), str5, experimentAssignment3, z, z2, emailRecognitionSource2, providedDefaultValues2, defaultLogLinkHoldbackExperiment2.isSpmEnabled(elementsSession2, z3), defaultLogLinkHoldbackExperiment2.mode.getCode(), z3));
                return Unit.INSTANCE;
            }
            defaultValues = providedDefaultValues;
            str2 = str3;
            defaultLogLinkHoldbackExperiment = defaultLogLinkHoldbackExperiment2;
            experimentAssignment4 = experimentAssignment2;
            state3 = state2;
            experimentsData = experimentsData2;
            str = str4;
            experimentAssignment3 = experimentAssignment4;
            str3 = str2;
            str5 = str;
            z = false;
            experimentsData2 = experimentsData;
            defaultLogLinkHoldbackExperiment2 = defaultLogLinkHoldbackExperiment;
            providedDefaultValues2 = defaultValues;
            state2 = state3;
            LinkState linkState2 = state2.getPaymentMethodMetadata().getLinkState();
            if (linkState2 == null) {
            }
            LoggableExperiment.LinkHoldback.EmailRecognitionSource emailRecognitionSource3 = LoggableExperiment.LinkHoldback.EmailRecognitionSource.EMAIL;
            if (str3 == null) {
            }
            LoggableExperiment.LinkHoldback.EmailRecognitionSource emailRecognitionSource22 = emailRecognitionSource3;
            if (state2.getPaymentMethodMetadata().getLinkState() != null) {
            }
            defaultLogLinkHoldbackExperiment2.eventReporter.onExperimentExposure(new LoggableExperiment.LinkHoldback(experimentsData2.getArbId(), str5, experimentAssignment3, z, z2, emailRecognitionSource22, providedDefaultValues2, defaultLogLinkHoldbackExperiment2.isSpmEnabled(elementsSession2, z3), defaultLogLinkHoldbackExperiment2.mode.getCode(), z3));
            return Unit.INSTANCE;
        }
        String str6 = (String) c08021.L$5;
        ElementsSession.ExperimentsData experimentsData5 = (ElementsSession.ExperimentsData) c08021.L$4;
        ElementsSession.ExperimentAssignment experimentAssignment5 = (ElementsSession.ExperimentAssignment) c08021.L$3;
        PaymentElementLoader.State state4 = (PaymentElementLoader.State) c08021.L$2;
        elementsSession2 = (ElementsSession) c08021.L$1;
        defaultLogLinkHoldbackExperiment = (DefaultLogLinkHoldbackExperiment) c08021.L$0;
        ResultKt.throwOnFailure(obj);
        str = str6;
        state3 = state4;
        experimentsData = experimentsData5;
        experimentAssignment4 = experimentAssignment5;
        str2 = (String) obj;
        defaultValues = defaultLogLinkHoldbackExperiment.getDefaultValues(state3);
        if (str2 != null) {
            c08021.L$0 = defaultLogLinkHoldbackExperiment;
            c08021.L$1 = elementsSession2;
            c08021.L$2 = state3;
            c08021.L$3 = experimentAssignment4;
            c08021.L$4 = experimentsData;
            c08021.L$5 = str;
            c08021.L$6 = str2;
            c08021.L$7 = defaultValues;
            c08021.label = 2;
            Object objIsReturningUser = defaultLogLinkHoldbackExperiment.isReturningUser(str2, c08021);
            if (objIsReturningUser != coroutine_suspended) {
                experimentAssignment2 = experimentAssignment4;
                str3 = str2;
                obj = objIsReturningUser;
                str4 = str;
                experimentsData2 = experimentsData;
                defaultLogLinkHoldbackExperiment2 = defaultLogLinkHoldbackExperiment;
                state2 = state3;
                providedDefaultValues = defaultValues;
                if (!((Boolean) obj).booleanValue()) {
                }
            }
            return coroutine_suspended;
        }
        experimentAssignment3 = experimentAssignment4;
        str3 = str2;
        str5 = str;
        z = false;
        experimentsData2 = experimentsData;
        defaultLogLinkHoldbackExperiment2 = defaultLogLinkHoldbackExperiment;
        providedDefaultValues2 = defaultValues;
        state2 = state3;
        LinkState linkState22 = state2.getPaymentMethodMetadata().getLinkState();
        if (linkState22 == null) {
        }
        LoggableExperiment.LinkHoldback.EmailRecognitionSource emailRecognitionSource32 = LoggableExperiment.LinkHoldback.EmailRecognitionSource.EMAIL;
        if (str3 == null) {
        }
        LoggableExperiment.LinkHoldback.EmailRecognitionSource emailRecognitionSource222 = emailRecognitionSource32;
        if (state2.getPaymentMethodMetadata().getLinkState() != null) {
        }
        defaultLogLinkHoldbackExperiment2.eventReporter.onExperimentExposure(new LoggableExperiment.LinkHoldback(experimentsData2.getArbId(), str5, experimentAssignment3, z, z2, emailRecognitionSource222, providedDefaultValues2, defaultLogLinkHoldbackExperiment2.isSpmEnabled(elementsSession2, z3), defaultLogLinkHoldbackExperiment2.mode.getCode(), z3));
        return Unit.INSTANCE;
    }

    private final LoggableExperiment.LinkHoldback.ProvidedDefaultValues getDefaultValues(PaymentElementLoader.State state) {
        PaymentSheet.BillingDetails defaultBillingDetails = state.getConfig().getDefaultBillingDetails();
        return new LoggableExperiment.LinkHoldback.ProvidedDefaultValues((defaultBillingDetails != null ? defaultBillingDetails.getEmail() : null) != null, (defaultBillingDetails != null ? defaultBillingDetails.getName() : null) != null, (defaultBillingDetails != null ? defaultBillingDetails.getPhone() : null) != null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isReturningUser(String str, Continuation<? super Boolean> continuation) {
        C08011 c08011;
        Object objMo7758lookupConsumerWithoutBackendLoggingForExposuregIAlus;
        DefaultLogLinkHoldbackExperiment defaultLogLinkHoldbackExperiment;
        if (continuation instanceof C08011) {
            c08011 = (C08011) continuation;
            if ((c08011.label & Integer.MIN_VALUE) != 0) {
                c08011.label -= Integer.MIN_VALUE;
            } else {
                c08011 = new C08011(continuation);
            }
        }
        Object obj = c08011.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c08011.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LinkRepository linkRepository = this.linkDisabledApiRepository;
            c08011.L$0 = this;
            c08011.label = 1;
            objMo7758lookupConsumerWithoutBackendLoggingForExposuregIAlus = linkRepository.mo7758lookupConsumerWithoutBackendLoggingForExposuregIAlus(str, c08011);
            if (objMo7758lookupConsumerWithoutBackendLoggingForExposuregIAlus == coroutine_suspended) {
                return coroutine_suspended;
            }
            defaultLogLinkHoldbackExperiment = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defaultLogLinkHoldbackExperiment = (DefaultLogLinkHoldbackExperiment) c08011.L$0;
            ResultKt.throwOnFailure(obj);
            objMo7758lookupConsumerWithoutBackendLoggingForExposuregIAlus = ((Result) obj).getValue();
        }
        if (Result.m9125isSuccessimpl(objMo7758lookupConsumerWithoutBackendLoggingForExposuregIAlus)) {
            Result.Companion companion = Result.INSTANCE;
            objMo7758lookupConsumerWithoutBackendLoggingForExposuregIAlus = Boxing.boxBoolean(((ConsumerSessionLookup) objMo7758lookupConsumerWithoutBackendLoggingForExposuregIAlus).getExists());
        }
        Object objM9118constructorimpl = Result.m9118constructorimpl(objMo7758lookupConsumerWithoutBackendLoggingForExposuregIAlus);
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            defaultLogLinkHoldbackExperiment.logger.error("Failed to check if user is returning", thM9121exceptionOrNullimpl);
        }
        ResultKt.throwOnFailure(objM9118constructorimpl);
        return objM9118constructorimpl;
    }

    private final boolean isSpmEnabled(ElementsSession elementsSession, boolean z) {
        ElementsSession.Customer.Session session;
        ElementsSession.Customer.Components components;
        ElementsSession.Customer customer = elementsSession.getCustomer();
        ElementsSession.Customer.Components.MobilePaymentElement mobilePaymentElement = (customer == null || (session = customer.getSession()) == null || (components = session.getComponents()) == null) ? null : components.getMobilePaymentElement();
        return ((mobilePaymentElement instanceof ElementsSession.Customer.Components.MobilePaymentElement.Enabled) && ((ElementsSession.Customer.Components.MobilePaymentElement.Enabled) mobilePaymentElement).isPaymentMethodSaveEnabled()) && (!z || Intrinsics.areEqual((Object) elementsSession.getFlags().get(ElementsSession.Flag.ELEMENTS_ENABLE_LINK_SPM), (Object) true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getEmail(PaymentElementLoader.State state, Continuation<? super String> continuation) {
        LinkConfiguration configuration;
        LinkConfiguration.CustomerInfo customerInfo;
        String email;
        LinkState linkState = state.getPaymentMethodMetadata().getLinkState();
        if (linkState != null && (configuration = linkState.getConfiguration()) != null && (customerInfo = configuration.getCustomerInfo()) != null && (email = customerInfo.getEmail()) != null) {
            return email;
        }
        RetrieveCustomerEmail retrieveCustomerEmail = this.retrieveCustomerEmail;
        CommonConfiguration config = state.getConfig();
        CustomerState customer = state.getCustomer();
        return retrieveCustomerEmail.invoke(config, customer != null ? new CustomerRepository.CustomerInfo(customer.getId(), customer.getEphemeralKeySecret(), customer.getCustomerSessionClientSecret()) : null, continuation);
    }
}
