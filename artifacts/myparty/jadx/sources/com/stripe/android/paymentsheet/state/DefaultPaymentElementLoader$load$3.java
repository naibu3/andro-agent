package com.stripe.android.paymentsheet.state;

import com.facebook.internal.ServerProtocol;
import com.stripe.android.common.model.CommonConfiguration;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SavedSelection;
import com.stripe.android.paymentsheet.model.StripeIntentValidatorKt;
import com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import com.stripe.android.paymentsheet.state.PaymentSheetLoadingException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* compiled from: PaymentElementLoader.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader$load$3", f = "PaymentElementLoader.kt", i = {0, 1, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6}, l = {167, 168, 181, 231, 242, 243, 257}, m = "invokeSuspend", n = {"$this$runCatching", "$this$runCatching", "$this$runCatching", "elementsSession", "customerInfo", "elementsSession", "customerInfo", "customer", "initialPaymentSelection", "stripeIntent", "elementsSession", "customerInfo", "initialPaymentSelection", "stripeIntent", "pmMetadata", "elementsSession", "customerInfo", "stripeIntent", "pmMetadata", "customerInfo", "pmMetadata", ServerProtocol.DIALOG_PARAM_STATE}, s = {"L$0", "L$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
final class DefaultPaymentElementLoader$load$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PaymentElementLoader.State>, Object> {
    final /* synthetic */ CommonConfiguration $configuration;
    final /* synthetic */ PaymentElementLoader.InitializationMode $initializationMode;
    final /* synthetic */ PaymentElementLoader.Metadata $metadata;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    int label;
    final /* synthetic */ DefaultPaymentElementLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultPaymentElementLoader$load$3(DefaultPaymentElementLoader defaultPaymentElementLoader, PaymentElementLoader.Metadata metadata, CommonConfiguration commonConfiguration, PaymentElementLoader.InitializationMode initializationMode, Continuation<? super DefaultPaymentElementLoader$load$3> continuation) {
        super(2, continuation);
        this.this$0 = defaultPaymentElementLoader;
        this.$metadata = metadata;
        this.$configuration = commonConfiguration;
        this.$initializationMode = initializationMode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefaultPaymentElementLoader$load$3 defaultPaymentElementLoader$load$3 = new DefaultPaymentElementLoader$load$3(this.this$0, this.$metadata, this.$configuration, this.$initializationMode, continuation);
        defaultPaymentElementLoader$load$3.L$0 = obj;
        return defaultPaymentElementLoader$load$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PaymentElementLoader.State> continuation) {
        return ((DefaultPaymentElementLoader$load$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b3 A[PHI: r2 r3 r4 r5
      0x00b3: PHI (r2v11 com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader$CustomerInfo) = 
      (r2v8 com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader$CustomerInfo)
      (r2v16 com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader$CustomerInfo)
     binds: [B:27:0x014e, B:11:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x00b3: PHI (r3v17 com.stripe.android.model.ElementsSession) = (r3v13 com.stripe.android.model.ElementsSession), (r3v20 com.stripe.android.model.ElementsSession) binds: [B:27:0x014e, B:11:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x00b3: PHI (r4v5 kotlinx.coroutines.CoroutineScope) = (r4v4 kotlinx.coroutines.CoroutineScope), (r4v9 kotlinx.coroutines.CoroutineScope) binds: [B:27:0x014e, B:11:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x00b3: PHI (r5v6 java.lang.Object) = (r5v5 java.lang.Object), (r5v11 java.lang.Object) binds: [B:27:0x014e, B:11:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c6 A[PHI: r2 r3
      0x00c6: PHI (r2v6 kotlinx.coroutines.CoroutineScope) = (r2v3 kotlinx.coroutines.CoroutineScope), (r2v10 kotlinx.coroutines.CoroutineScope) binds: [B:24:0x0129, B:13:0x00b7] A[DONT_GENERATE, DONT_INLINE]
      0x00c6: PHI (r3v12 java.lang.Object) = (r3v9 java.lang.Object), (r3v16 java.lang.Object) binds: [B:24:0x0129, B:13:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0294  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws PaymentSheetLoadingException.NoPaymentMethodTypesAvailable {
        CoroutineScope coroutineScope;
        Object objRetrieveSavedPaymentMethodSelection;
        Object objM8424retrieveElementsSessionhUnOzRk;
        CoroutineScope coroutineScope2;
        ElementsSession elementsSession;
        DefaultPaymentElementLoader.CustomerInfo customerInfoCreateCustomerInfo;
        Object objIsGooglePayReady;
        DefaultPaymentElementLoader.CustomerInfo customerInfo;
        Deferred deferred;
        Object objAwait;
        Deferred deferred2;
        StripeIntent stripeIntent;
        ElementsSession elementsSession2;
        PaymentMethodMetadata paymentMethodMetadata;
        CommonConfiguration commonConfiguration;
        Object objAwait2;
        Object objAwait3;
        CommonConfiguration commonConfiguration2;
        ElementsSession elementsSession3;
        CustomerState customerState;
        DefaultPaymentElementLoader.CustomerInfo customerInfo2;
        PaymentMethodMetadata paymentMethodMetadata2;
        Object objIsGooglePaySupported;
        DefaultPaymentElementLoader defaultPaymentElementLoader;
        DefaultPaymentElementLoader.CustomerInfo customerInfo3;
        PaymentElementLoader.State state;
        PaymentMethodMetadata paymentMethodMetadata3;
        boolean z;
        PaymentElementLoader.State state2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                this.this$0.eventReporter.onLoadStarted(this.$metadata.getInitializedViaCompose());
                this.L$0 = coroutineScope;
                this.label = 1;
                objRetrieveSavedPaymentMethodSelection = this.this$0.retrieveSavedPaymentMethodSelection(this.$configuration, this);
                if (objRetrieveSavedPaymentMethodSelection != coroutine_suspended) {
                    SavedSelection.PaymentMethod paymentMethod = (SavedSelection.PaymentMethod) objRetrieveSavedPaymentMethodSelection;
                    DefaultPaymentElementLoader defaultPaymentElementLoader2 = this.this$0;
                    PaymentElementLoader.InitializationMode initializationMode = this.$initializationMode;
                    PaymentSheet.CustomerConfiguration customer = this.$configuration.getCustomer();
                    List<PaymentSheet.CustomPaymentMethod> customPaymentMethods = this.$configuration.getCustomPaymentMethods();
                    List<String> externalPaymentMethods = this.$configuration.getExternalPaymentMethods();
                    String id = paymentMethod == null ? paymentMethod.getId() : null;
                    this.L$0 = coroutineScope;
                    this.label = 2;
                    objM8424retrieveElementsSessionhUnOzRk = defaultPaymentElementLoader2.m8424retrieveElementsSessionhUnOzRk(initializationMode, customer, customPaymentMethods, externalPaymentMethods, id, this);
                    if (objM8424retrieveElementsSessionhUnOzRk != coroutine_suspended) {
                        coroutineScope2 = coroutineScope;
                        ResultKt.throwOnFailure(objM8424retrieveElementsSessionhUnOzRk);
                        elementsSession = (ElementsSession) objM8424retrieveElementsSessionhUnOzRk;
                        customerInfoCreateCustomerInfo = this.this$0.createCustomerInfo(this.$configuration, elementsSession);
                        this.L$0 = coroutineScope2;
                        this.L$1 = elementsSession;
                        this.L$2 = customerInfoCreateCustomerInfo;
                        this.label = 3;
                        objIsGooglePayReady = this.this$0.isGooglePayReady(this.$configuration, elementsSession, this);
                        if (objIsGooglePayReady != coroutine_suspended) {
                            DefaultPaymentElementLoader.CustomerInfo customerInfo4 = customerInfoCreateCustomerInfo;
                            ElementsSession elementsSession4 = elementsSession;
                            boolean zBooleanValue = ((Boolean) objIsGooglePayReady).booleanValue();
                            CoroutineScope coroutineScope3 = coroutineScope2;
                            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new DefaultPaymentElementLoader$load$3$savedSelection$1(this.this$0, this.$configuration, zBooleanValue, elementsSession4, null), 3, null);
                            DefaultPaymentElementLoader$load$3$paymentMethodMetadata$1 defaultPaymentElementLoader$load$3$paymentMethodMetadata$1 = new DefaultPaymentElementLoader$load$3$paymentMethodMetadata$1(BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new DefaultPaymentElementLoader$load$3$linkState$1(this.$configuration, this.this$0, elementsSession4, customerInfo4, this.$initializationMode, null), 3, null), this.this$0, this.$configuration, elementsSession4, customerInfo4, zBooleanValue, null);
                            customerInfo = customerInfo4;
                            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, defaultPaymentElementLoader$load$3$paymentMethodMetadata$1, 3, null);
                            Deferred deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new DefaultPaymentElementLoader$load$3$customer$1(this.this$0, customerInfo, deferredAsync$default2, deferredAsync$default, this.$configuration, null), 3, null);
                            DefaultPaymentElementLoader$load$3$initialPaymentSelection$1 defaultPaymentElementLoader$load$3$initialPaymentSelection$1 = new DefaultPaymentElementLoader$load$3$initialPaymentSelection$1(this.this$0, deferredAsync$default, deferredAsync$default2, deferredAsync$default3, zBooleanValue, this.$configuration, null);
                            deferred = deferredAsync$default3;
                            Deferred deferredAsync$default4 = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, defaultPaymentElementLoader$load$3$initialPaymentSelection$1, 3, null);
                            StripeIntent stripeIntent2 = elementsSession4.getStripeIntent();
                            this.L$0 = elementsSession4;
                            this.L$1 = customerInfo;
                            this.L$2 = deferred;
                            this.L$3 = deferredAsync$default4;
                            this.L$4 = stripeIntent2;
                            this.label = 4;
                            objAwait = deferredAsync$default2.await(this);
                            if (objAwait != coroutine_suspended) {
                                deferred2 = deferredAsync$default4;
                                stripeIntent = stripeIntent2;
                                elementsSession2 = elementsSession4;
                                paymentMethodMetadata = (PaymentMethodMetadata) objAwait;
                                this.this$0.warnUnactivatedIfNeeded(stripeIntent);
                                if (this.this$0.supportsIntent(paymentMethodMetadata)) {
                                    throw new PaymentSheetLoadingException.NoPaymentMethodTypesAvailable(CollectionsKt.joinToString$default(stripeIntent.getPaymentMethodTypes(), ", ", null, null, 0, null, null, 62, null));
                                }
                                commonConfiguration = this.$configuration;
                                this.L$0 = elementsSession2;
                                this.L$1 = customerInfo;
                                this.L$2 = deferred2;
                                this.L$3 = stripeIntent;
                                this.L$4 = paymentMethodMetadata;
                                this.L$5 = commonConfiguration;
                                this.label = 5;
                                objAwait2 = deferred.await(this);
                                if (objAwait2 != coroutine_suspended) {
                                    CustomerState customerState2 = (CustomerState) objAwait2;
                                    this.L$0 = elementsSession2;
                                    this.L$1 = customerInfo;
                                    this.L$2 = stripeIntent;
                                    this.L$3 = paymentMethodMetadata;
                                    this.L$4 = commonConfiguration;
                                    this.L$5 = customerState2;
                                    this.label = 6;
                                    objAwait3 = deferred2.await(this);
                                    if (objAwait3 != coroutine_suspended) {
                                        ElementsSession elementsSession5 = elementsSession2;
                                        commonConfiguration2 = commonConfiguration;
                                        elementsSession3 = elementsSession5;
                                        DefaultPaymentElementLoader.CustomerInfo customerInfo5 = customerInfo;
                                        customerState = customerState2;
                                        customerInfo2 = customerInfo5;
                                        paymentMethodMetadata2 = paymentMethodMetadata;
                                        PaymentElementLoader.State state3 = new PaymentElementLoader.State(commonConfiguration2, customerState, (PaymentSelection) objAwait3, StripeIntentValidatorKt.validate(stripeIntent), paymentMethodMetadata2);
                                        this.this$0.logLinkExperimentExposures(elementsSession3, state3);
                                        DefaultPaymentElementLoader defaultPaymentElementLoader3 = this.this$0;
                                        boolean zIsReloadingAfterProcessDeath = this.$metadata.isReloadingAfterProcessDeath();
                                        this.L$0 = customerInfo2;
                                        this.L$1 = paymentMethodMetadata2;
                                        this.L$2 = state3;
                                        this.L$3 = defaultPaymentElementLoader3;
                                        this.L$4 = elementsSession3;
                                        this.L$5 = state3;
                                        this.Z$0 = zIsReloadingAfterProcessDeath;
                                        this.label = 7;
                                        objIsGooglePaySupported = this.this$0.isGooglePaySupported(this);
                                        if (objIsGooglePaySupported != coroutine_suspended) {
                                            defaultPaymentElementLoader = defaultPaymentElementLoader3;
                                            customerInfo3 = customerInfo2;
                                            state = state3;
                                            paymentMethodMetadata3 = paymentMethodMetadata2;
                                            z = zIsReloadingAfterProcessDeath;
                                            state2 = state;
                                            defaultPaymentElementLoader.reportSuccessfulLoad(elementsSession3, state, z, ((Boolean) objIsGooglePaySupported).booleanValue(), this.$configuration.getLink().getDisplay(), this.$initializationMode, customerInfo3, paymentMethodMetadata3);
                                            return state2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutine_suspended;
            case 1:
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                objRetrieveSavedPaymentMethodSelection = obj;
                SavedSelection.PaymentMethod paymentMethod2 = (SavedSelection.PaymentMethod) objRetrieveSavedPaymentMethodSelection;
                DefaultPaymentElementLoader defaultPaymentElementLoader22 = this.this$0;
                PaymentElementLoader.InitializationMode initializationMode2 = this.$initializationMode;
                PaymentSheet.CustomerConfiguration customer2 = this.$configuration.getCustomer();
                List<PaymentSheet.CustomPaymentMethod> customPaymentMethods2 = this.$configuration.getCustomPaymentMethods();
                List<String> externalPaymentMethods2 = this.$configuration.getExternalPaymentMethods();
                if (paymentMethod2 == null) {
                }
                this.L$0 = coroutineScope;
                this.label = 2;
                objM8424retrieveElementsSessionhUnOzRk = defaultPaymentElementLoader22.m8424retrieveElementsSessionhUnOzRk(initializationMode2, customer2, customPaymentMethods2, externalPaymentMethods2, id, this);
                if (objM8424retrieveElementsSessionhUnOzRk != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 2:
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                objM8424retrieveElementsSessionhUnOzRk = ((Result) obj).getValue();
                coroutineScope2 = coroutineScope;
                ResultKt.throwOnFailure(objM8424retrieveElementsSessionhUnOzRk);
                elementsSession = (ElementsSession) objM8424retrieveElementsSessionhUnOzRk;
                customerInfoCreateCustomerInfo = this.this$0.createCustomerInfo(this.$configuration, elementsSession);
                this.L$0 = coroutineScope2;
                this.L$1 = elementsSession;
                this.L$2 = customerInfoCreateCustomerInfo;
                this.label = 3;
                objIsGooglePayReady = this.this$0.isGooglePayReady(this.$configuration, elementsSession, this);
                if (objIsGooglePayReady != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 3:
                customerInfoCreateCustomerInfo = (DefaultPaymentElementLoader.CustomerInfo) this.L$2;
                elementsSession = (ElementsSession) this.L$1;
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                objIsGooglePayReady = obj;
                DefaultPaymentElementLoader.CustomerInfo customerInfo42 = customerInfoCreateCustomerInfo;
                ElementsSession elementsSession42 = elementsSession;
                boolean zBooleanValue2 = ((Boolean) objIsGooglePayReady).booleanValue();
                CoroutineScope coroutineScope32 = coroutineScope2;
                Deferred deferredAsync$default5 = BuildersKt__Builders_commonKt.async$default(coroutineScope32, null, null, new DefaultPaymentElementLoader$load$3$savedSelection$1(this.this$0, this.$configuration, zBooleanValue2, elementsSession42, null), 3, null);
                DefaultPaymentElementLoader$load$3$paymentMethodMetadata$1 defaultPaymentElementLoader$load$3$paymentMethodMetadata$12 = new DefaultPaymentElementLoader$load$3$paymentMethodMetadata$1(BuildersKt__Builders_commonKt.async$default(coroutineScope32, null, null, new DefaultPaymentElementLoader$load$3$linkState$1(this.$configuration, this.this$0, elementsSession42, customerInfo42, this.$initializationMode, null), 3, null), this.this$0, this.$configuration, elementsSession42, customerInfo42, zBooleanValue2, null);
                customerInfo = customerInfo42;
                Deferred deferredAsync$default22 = BuildersKt__Builders_commonKt.async$default(coroutineScope32, null, null, defaultPaymentElementLoader$load$3$paymentMethodMetadata$12, 3, null);
                Deferred deferredAsync$default32 = BuildersKt__Builders_commonKt.async$default(coroutineScope32, null, null, new DefaultPaymentElementLoader$load$3$customer$1(this.this$0, customerInfo, deferredAsync$default22, deferredAsync$default5, this.$configuration, null), 3, null);
                DefaultPaymentElementLoader$load$3$initialPaymentSelection$1 defaultPaymentElementLoader$load$3$initialPaymentSelection$12 = new DefaultPaymentElementLoader$load$3$initialPaymentSelection$1(this.this$0, deferredAsync$default5, deferredAsync$default22, deferredAsync$default32, zBooleanValue2, this.$configuration, null);
                deferred = deferredAsync$default32;
                Deferred deferredAsync$default42 = BuildersKt__Builders_commonKt.async$default(coroutineScope32, null, null, defaultPaymentElementLoader$load$3$initialPaymentSelection$12, 3, null);
                StripeIntent stripeIntent22 = elementsSession42.getStripeIntent();
                this.L$0 = elementsSession42;
                this.L$1 = customerInfo;
                this.L$2 = deferred;
                this.L$3 = deferredAsync$default42;
                this.L$4 = stripeIntent22;
                this.label = 4;
                objAwait = deferredAsync$default22.await(this);
                if (objAwait != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 4:
                stripeIntent = (StripeIntent) this.L$4;
                Deferred deferred3 = (Deferred) this.L$3;
                deferred = (Deferred) this.L$2;
                DefaultPaymentElementLoader.CustomerInfo customerInfo6 = (DefaultPaymentElementLoader.CustomerInfo) this.L$1;
                ElementsSession elementsSession6 = (ElementsSession) this.L$0;
                ResultKt.throwOnFailure(obj);
                customerInfo = customerInfo6;
                elementsSession2 = elementsSession6;
                objAwait = obj;
                deferred2 = deferred3;
                paymentMethodMetadata = (PaymentMethodMetadata) objAwait;
                this.this$0.warnUnactivatedIfNeeded(stripeIntent);
                if (this.this$0.supportsIntent(paymentMethodMetadata)) {
                }
                break;
            case 5:
                CommonConfiguration commonConfiguration3 = (CommonConfiguration) this.L$5;
                PaymentMethodMetadata paymentMethodMetadata4 = (PaymentMethodMetadata) this.L$4;
                StripeIntent stripeIntent3 = (StripeIntent) this.L$3;
                deferred2 = (Deferred) this.L$2;
                DefaultPaymentElementLoader.CustomerInfo customerInfo7 = (DefaultPaymentElementLoader.CustomerInfo) this.L$1;
                elementsSession2 = (ElementsSession) this.L$0;
                ResultKt.throwOnFailure(obj);
                customerInfo = customerInfo7;
                paymentMethodMetadata = paymentMethodMetadata4;
                commonConfiguration = commonConfiguration3;
                stripeIntent = stripeIntent3;
                objAwait2 = obj;
                CustomerState customerState22 = (CustomerState) objAwait2;
                this.L$0 = elementsSession2;
                this.L$1 = customerInfo;
                this.L$2 = stripeIntent;
                this.L$3 = paymentMethodMetadata;
                this.L$4 = commonConfiguration;
                this.L$5 = customerState22;
                this.label = 6;
                objAwait3 = deferred2.await(this);
                if (objAwait3 != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 6:
                CustomerState customerState3 = (CustomerState) this.L$5;
                CommonConfiguration commonConfiguration4 = (CommonConfiguration) this.L$4;
                PaymentMethodMetadata paymentMethodMetadata5 = (PaymentMethodMetadata) this.L$3;
                StripeIntent stripeIntent4 = (StripeIntent) this.L$2;
                DefaultPaymentElementLoader.CustomerInfo customerInfo8 = (DefaultPaymentElementLoader.CustomerInfo) this.L$1;
                ElementsSession elementsSession7 = (ElementsSession) this.L$0;
                ResultKt.throwOnFailure(obj);
                commonConfiguration2 = commonConfiguration4;
                elementsSession3 = elementsSession7;
                customerState = customerState3;
                paymentMethodMetadata2 = paymentMethodMetadata5;
                stripeIntent = stripeIntent4;
                customerInfo2 = customerInfo8;
                objAwait3 = obj;
                PaymentElementLoader.State state32 = new PaymentElementLoader.State(commonConfiguration2, customerState, (PaymentSelection) objAwait3, StripeIntentValidatorKt.validate(stripeIntent), paymentMethodMetadata2);
                this.this$0.logLinkExperimentExposures(elementsSession3, state32);
                DefaultPaymentElementLoader defaultPaymentElementLoader32 = this.this$0;
                boolean zIsReloadingAfterProcessDeath2 = this.$metadata.isReloadingAfterProcessDeath();
                this.L$0 = customerInfo2;
                this.L$1 = paymentMethodMetadata2;
                this.L$2 = state32;
                this.L$3 = defaultPaymentElementLoader32;
                this.L$4 = elementsSession3;
                this.L$5 = state32;
                this.Z$0 = zIsReloadingAfterProcessDeath2;
                this.label = 7;
                objIsGooglePaySupported = this.this$0.isGooglePaySupported(this);
                if (objIsGooglePaySupported != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 7:
                boolean z2 = this.Z$0;
                PaymentElementLoader.State state4 = (PaymentElementLoader.State) this.L$5;
                elementsSession3 = (ElementsSession) this.L$4;
                DefaultPaymentElementLoader defaultPaymentElementLoader4 = (DefaultPaymentElementLoader) this.L$3;
                state2 = (PaymentElementLoader.State) this.L$2;
                PaymentMethodMetadata paymentMethodMetadata6 = (PaymentMethodMetadata) this.L$1;
                DefaultPaymentElementLoader.CustomerInfo customerInfo9 = (DefaultPaymentElementLoader.CustomerInfo) this.L$0;
                ResultKt.throwOnFailure(obj);
                z = z2;
                state = state4;
                defaultPaymentElementLoader = defaultPaymentElementLoader4;
                paymentMethodMetadata3 = paymentMethodMetadata6;
                customerInfo3 = customerInfo9;
                objIsGooglePaySupported = obj;
                defaultPaymentElementLoader.reportSuccessfulLoad(elementsSession3, state, z, ((Boolean) objIsGooglePaySupported).booleanValue(), this.$configuration.getLink().getDisplay(), this.$initializationMode, customerInfo3, paymentMethodMetadata3);
                return state2;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
