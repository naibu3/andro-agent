package com.stripe.android.payments.bankaccount.ui;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.core.Logger;
import com.stripe.android.core.utils.CreationExtrasKtxKt;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetInstantDebitsResult;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.FinancialConnectionsSession;
import com.stripe.android.model.LinkMode;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.parsers.PaymentMethodJsonParser;
import com.stripe.android.payments.bankaccount.CollectBankAccountConfiguration;
import com.stripe.android.payments.bankaccount.di.DaggerCollectBankAccountComponent;
import com.stripe.android.payments.bankaccount.domain.AttachFinancialConnectionsSession;
import com.stripe.android.payments.bankaccount.domain.CreateFinancialConnectionsSession;
import com.stripe.android.payments.bankaccount.domain.RetrieveStripeIntent;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResponseInternal;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResultInternal;
import com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewEffect;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.json.JSONObject;

/* compiled from: CollectBankAccountViewModel.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0001\u0018\u0000 ;2\u00020\u0001:\u0002:;BG\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0007\u001a\u00020\u001eH\u0082@¢\u0006\u0002\u0010\u001fJ\u000e\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020$J\u0016\u0010%\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020&H\u0082@¢\u0006\u0002\u0010'J\u0010\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010+\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020,H\u0002J\u000e\u0010-\u001a\u0004\u0018\u00010.*\u00020/H\u0002J\u001e\u00100\u001a\u00020\u001e2\u0014\u00101\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000103\u0012\u0004\u0012\u00020402H\u0002J\u0010\u00105\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*H\u0002J\u0016\u00106\u001a\u00020\u001e2\u0006\u00107\u001a\u000208H\u0082@¢\u0006\u0002\u00109R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00148B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006<"}, d2 = {"Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;", "Landroidx/lifecycle/ViewModel;", CardScanActivity.ARGS, "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "_viewEffect", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;", "createFinancialConnectionsSession", "Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;", "attachFinancialConnectionsSession", "Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;", "retrieveStripeIntent", "Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "logger", "Lcom/stripe/android/core/Logger;", "<init>", "(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;Lkotlinx/coroutines/flow/MutableSharedFlow;Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/core/Logger;)V", "value", "", "hasLaunched", "getHasLaunched", "()Z", "setHasLaunched", "(Z)V", "viewEffect", "Lkotlinx/coroutines/flow/SharedFlow;", "getViewEffect", "()Lkotlinx/coroutines/flow/SharedFlow;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onConnectionsForACHResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;", "onConnectionsForInstantDebitsResult", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetInstantDebitsResult;", "finishWithResult", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;", "(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "finishWithSession", "financialConnectionsSession", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "finishWithPaymentMethodId", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetInstantDebitsResult$Completed;", "parsePaymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "", "finishWithRefreshedIntent", "action", "Lkotlin/Function1;", "Lcom/stripe/android/model/StripeIntent;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;", "attachSessionToIntent", "finishWithError", "throwable", "", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Factory", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CollectBankAccountViewModel extends ViewModel {
    private static final String KEY_HAS_LAUNCHED = "key_has_launched";
    private final MutableSharedFlow<CollectBankAccountViewEffect> _viewEffect;
    private final CollectBankAccountContract.Args args;
    private final AttachFinancialConnectionsSession attachFinancialConnectionsSession;
    private final CreateFinancialConnectionsSession createFinancialConnectionsSession;
    private final Logger logger;
    private final RetrieveStripeIntent retrieveStripeIntent;
    private final SavedStateHandle savedStateHandle;
    private final SharedFlow<CollectBankAccountViewEffect> viewEffect;
    public static final int $stable = 8;

    /* compiled from: CollectBankAccountViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel", f = "CollectBankAccountViewModel.kt", i = {0, 1, 2, 3, 4}, l = {72, 88, 103, OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, WebSocketProtocol.PAYLOAD_SHORT, 135}, m = "createFinancialConnectionsSession", n = {"this", "this", "this", "this", "this"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0"})
    /* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$createFinancialConnectionsSession$1, reason: invalid class name and case insensitive filesystem */
    static final class C10881 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C10881(Continuation<? super C10881> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CollectBankAccountViewModel.this.createFinancialConnectionsSession(this);
        }
    }

    @Inject
    public CollectBankAccountViewModel(CollectBankAccountContract.Args args, MutableSharedFlow<CollectBankAccountViewEffect> _viewEffect, CreateFinancialConnectionsSession createFinancialConnectionsSession, AttachFinancialConnectionsSession attachFinancialConnectionsSession, RetrieveStripeIntent retrieveStripeIntent, SavedStateHandle savedStateHandle, Logger logger) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(_viewEffect, "_viewEffect");
        Intrinsics.checkNotNullParameter(createFinancialConnectionsSession, "createFinancialConnectionsSession");
        Intrinsics.checkNotNullParameter(attachFinancialConnectionsSession, "attachFinancialConnectionsSession");
        Intrinsics.checkNotNullParameter(retrieveStripeIntent, "retrieveStripeIntent");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.args = args;
        this._viewEffect = _viewEffect;
        this.createFinancialConnectionsSession = createFinancialConnectionsSession;
        this.attachFinancialConnectionsSession = attachFinancialConnectionsSession;
        this.retrieveStripeIntent = retrieveStripeIntent;
        this.savedStateHandle = savedStateHandle;
        this.logger = logger;
        this.viewEffect = _viewEffect;
        if (getHasLaunched()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    private final boolean getHasLaunched() {
        return Intrinsics.areEqual(this.savedStateHandle.get(KEY_HAS_LAUNCHED), (Object) true);
    }

    private final void setHasLaunched(boolean z) {
        this.savedStateHandle.set(KEY_HAS_LAUNCHED, Boolean.valueOf(z));
    }

    public final SharedFlow<CollectBankAccountViewEffect> getViewEffect() {
        return this.viewEffect;
    }

    /* compiled from: CollectBankAccountViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$1", f = "CollectBankAccountViewModel.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CollectBankAccountViewModel.this.new AnonymousClass1(continuation);
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
                this.label = 1;
                if (CollectBankAccountViewModel.this.createFinancialConnectionsSession(this) == coroutine_suspended) {
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
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c5, code lost:
    
        if (r0 == r2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c9, code lost:
    
        r3 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0127, code lost:
    
        if (r0 == r2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0161, code lost:
    
        if (r0 == r2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x019b, code lost:
    
        if (r0 == r2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x022f, code lost:
    
        if (r5.finishWithError(r0, r14) == r2) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createFinancialConnectionsSession(Continuation<? super Unit> continuation) {
        C10881 c10881;
        Object objM8164forSetupIntenthUnOzRk;
        CollectBankAccountViewModel collectBankAccountViewModel;
        String clientSecret;
        Object objM9118constructorimpl;
        Object obj;
        Throwable thM9121exceptionOrNullimpl;
        if (continuation instanceof C10881) {
            c10881 = (C10881) continuation;
            if ((c10881.label & Integer.MIN_VALUE) != 0) {
                c10881.label -= Integer.MIN_VALUE;
            } else {
                c10881 = new C10881(continuation);
            }
        }
        C10881 c108812 = c10881;
        Object obj2 = c108812.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c108812.label) {
            case 0:
                ResultKt.throwOnFailure(obj2);
                CollectBankAccountContract.Args args = this.args;
                if (args instanceof CollectBankAccountContract.Args.ForDeferredPaymentIntent) {
                    ElementsSessionContext elementsSessionContextRetrieveElementsSessionContext = CollectBankAccountViewModelKt.retrieveElementsSessionContext(((CollectBankAccountContract.Args.ForDeferredPaymentIntent) args).getConfiguration());
                    CreateFinancialConnectionsSession createFinancialConnectionsSession = this.createFinancialConnectionsSession;
                    String publishableKey = ((CollectBankAccountContract.Args.ForDeferredPaymentIntent) this.args).getPublishableKey();
                    String stripeAccountId = ((CollectBankAccountContract.Args.ForDeferredPaymentIntent) this.args).getStripeAccountId();
                    String hostedSurface = ((CollectBankAccountContract.Args.ForDeferredPaymentIntent) this.args).getHostedSurface();
                    String elementsSessionId = ((CollectBankAccountContract.Args.ForDeferredPaymentIntent) this.args).getElementsSessionId();
                    String customerId = ((CollectBankAccountContract.Args.ForDeferredPaymentIntent) this.args).getCustomerId();
                    String onBehalfOf = ((CollectBankAccountContract.Args.ForDeferredPaymentIntent) this.args).getOnBehalfOf();
                    LinkMode linkMode = elementsSessionContextRetrieveElementsSessionContext != null ? elementsSessionContextRetrieveElementsSessionContext.getLinkMode() : null;
                    Integer amount = ((CollectBankAccountContract.Args.ForDeferredPaymentIntent) this.args).getAmount();
                    String currency = ((CollectBankAccountContract.Args.ForDeferredPaymentIntent) this.args).getCurrency();
                    String product = this.args.getProduct();
                    c108812.L$0 = this;
                    c108812.label = 1;
                    objM8164forSetupIntenthUnOzRk = createFinancialConnectionsSession.m8162forDeferredIntent5p_uFSQ(publishableKey, stripeAccountId, elementsSessionId, customerId, onBehalfOf, hostedSurface, linkMode, amount, currency, product, c108812);
                    break;
                } else if (args instanceof CollectBankAccountContract.Args.ForDeferredSetupIntent) {
                    ElementsSessionContext elementsSessionContextRetrieveElementsSessionContext2 = CollectBankAccountViewModelKt.retrieveElementsSessionContext(((CollectBankAccountContract.Args.ForDeferredSetupIntent) args).getConfiguration());
                    CreateFinancialConnectionsSession createFinancialConnectionsSession2 = this.createFinancialConnectionsSession;
                    String publishableKey2 = ((CollectBankAccountContract.Args.ForDeferredSetupIntent) this.args).getPublishableKey();
                    String stripeAccountId2 = ((CollectBankAccountContract.Args.ForDeferredSetupIntent) this.args).getStripeAccountId();
                    String hostedSurface2 = ((CollectBankAccountContract.Args.ForDeferredSetupIntent) this.args).getHostedSurface();
                    String elementsSessionId2 = ((CollectBankAccountContract.Args.ForDeferredSetupIntent) this.args).getElementsSessionId();
                    String customerId2 = ((CollectBankAccountContract.Args.ForDeferredSetupIntent) this.args).getCustomerId();
                    String onBehalfOf2 = ((CollectBankAccountContract.Args.ForDeferredSetupIntent) this.args).getOnBehalfOf();
                    LinkMode linkMode2 = elementsSessionContextRetrieveElementsSessionContext2 != null ? elementsSessionContextRetrieveElementsSessionContext2.getLinkMode() : null;
                    String product2 = this.args.getProduct();
                    c108812.L$0 = this;
                    c108812.label = 2;
                    objM8164forSetupIntenthUnOzRk = createFinancialConnectionsSession2.m8162forDeferredIntent5p_uFSQ(publishableKey2, stripeAccountId2, elementsSessionId2, customerId2, onBehalfOf2, hostedSurface2, linkMode2, null, null, product2, c108812);
                    break;
                } else if (args instanceof CollectBankAccountContract.Args.ForPaymentIntent) {
                    CreateFinancialConnectionsSession createFinancialConnectionsSession3 = this.createFinancialConnectionsSession;
                    String publishableKey3 = ((CollectBankAccountContract.Args.ForPaymentIntent) args).getPublishableKey();
                    String stripeAccountId3 = ((CollectBankAccountContract.Args.ForPaymentIntent) this.args).getStripeAccountId();
                    String hostedSurface3 = ((CollectBankAccountContract.Args.ForPaymentIntent) this.args).getHostedSurface();
                    String clientSecret2 = ((CollectBankAccountContract.Args.ForPaymentIntent) this.args).getClientSecret();
                    CollectBankAccountConfiguration configuration = ((CollectBankAccountContract.Args.ForPaymentIntent) this.args).getConfiguration();
                    c108812.L$0 = this;
                    c108812.label = 3;
                    objM8164forSetupIntenthUnOzRk = createFinancialConnectionsSession3.m8163forPaymentIntenthUnOzRk(publishableKey3, clientSecret2, stripeAccountId3, hostedSurface3, configuration, c108812);
                    break;
                } else {
                    if (!(args instanceof CollectBankAccountContract.Args.ForSetupIntent)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CreateFinancialConnectionsSession createFinancialConnectionsSession4 = this.createFinancialConnectionsSession;
                    String publishableKey4 = ((CollectBankAccountContract.Args.ForSetupIntent) args).getPublishableKey();
                    String stripeAccountId4 = ((CollectBankAccountContract.Args.ForSetupIntent) this.args).getStripeAccountId();
                    String hostedSurface4 = ((CollectBankAccountContract.Args.ForSetupIntent) this.args).getHostedSurface();
                    String clientSecret3 = ((CollectBankAccountContract.Args.ForSetupIntent) this.args).getClientSecret();
                    CollectBankAccountConfiguration configuration2 = ((CollectBankAccountContract.Args.ForSetupIntent) this.args).getConfiguration();
                    c108812.L$0 = this;
                    c108812.label = 4;
                    objM8164forSetupIntenthUnOzRk = createFinancialConnectionsSession4.m8164forSetupIntenthUnOzRk(publishableKey4, clientSecret3, stripeAccountId4, hostedSurface4, configuration2, c108812);
                    break;
                }
                collectBankAccountViewModel = collectBankAccountViewModel;
                if (Result.m9125isSuccessimpl(objM8164forSetupIntenthUnOzRk)) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        clientSecret = ((FinancialConnectionsSession) objM8164forSetupIntenthUnOzRk).getClientSecret();
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM8164forSetupIntenthUnOzRk = ResultKt.createFailure(th);
                    }
                    if (clientSecret == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    objM9118constructorimpl = Result.m9118constructorimpl(clientSecret);
                    obj = objM9118constructorimpl;
                    if (Result.m9125isSuccessimpl(obj)) {
                        String str = (String) obj;
                        collectBankAccountViewModel.logger.debug("Bank account session created! " + str + ".");
                        collectBankAccountViewModel.setHasLaunched(true);
                        ElementsSessionContext elementsSessionContextRetrieveElementsSessionContext3 = CollectBankAccountViewModelKt.retrieveElementsSessionContext(collectBankAccountViewModel.args.getConfiguration());
                        MutableSharedFlow<CollectBankAccountViewEffect> mutableSharedFlow = collectBankAccountViewModel._viewEffect;
                        CollectBankAccountViewEffect.OpenConnectionsFlow openConnectionsFlow = new CollectBankAccountViewEffect.OpenConnectionsFlow(collectBankAccountViewModel.args.getPublishableKey(), str, collectBankAccountViewModel.args.getStripeAccountId(), elementsSessionContextRetrieveElementsSessionContext3);
                        c108812.L$0 = collectBankAccountViewModel;
                        c108812.L$1 = obj;
                        c108812.label = 5;
                        if (mutableSharedFlow.emit(openConnectionsFlow, c108812) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(obj);
                    if (thM9121exceptionOrNullimpl != null) {
                        c108812.L$0 = obj;
                        c108812.L$1 = null;
                        c108812.label = 6;
                        break;
                    }
                    return Unit.INSTANCE;
                }
                objM9118constructorimpl = Result.m9118constructorimpl(objM8164forSetupIntenthUnOzRk);
                obj = objM9118constructorimpl;
                if (Result.m9125isSuccessimpl(obj)) {
                }
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(obj);
                if (thM9121exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 1:
            case 2:
            case 3:
            case 4:
                CollectBankAccountViewModel collectBankAccountViewModel2 = (CollectBankAccountViewModel) c108812.L$0;
                ResultKt.throwOnFailure(obj2);
                objM8164forSetupIntenthUnOzRk = ((Result) obj2).getValue();
                collectBankAccountViewModel = collectBankAccountViewModel2;
                if (Result.m9125isSuccessimpl(objM8164forSetupIntenthUnOzRk)) {
                }
                objM9118constructorimpl = Result.m9118constructorimpl(objM8164forSetupIntenthUnOzRk);
                obj = objM9118constructorimpl;
                if (Result.m9125isSuccessimpl(obj)) {
                }
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(obj);
                if (thM9121exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 5:
                obj = c108812.L$1;
                collectBankAccountViewModel = (CollectBankAccountViewModel) c108812.L$0;
                ResultKt.throwOnFailure(obj2);
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(obj);
                if (thM9121exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 6:
                Object obj3 = c108812.L$0;
                ResultKt.throwOnFailure(obj2);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: CollectBankAccountViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$onConnectionsForACHResult$1", f = "CollectBankAccountViewModel.kt", i = {}, l = {142, 144}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$onConnectionsForACHResult$1, reason: invalid class name and case insensitive filesystem */
    static final class C10901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FinancialConnectionsSheetResult $result;
        int label;
        final /* synthetic */ CollectBankAccountViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10901(FinancialConnectionsSheetResult financialConnectionsSheetResult, CollectBankAccountViewModel collectBankAccountViewModel, Continuation<? super C10901> continuation) {
            super(2, continuation);
            this.$result = financialConnectionsSheetResult;
            this.this$0 = collectBankAccountViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C10901(this.$result, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        
            if (r4.this$0.finishWithResult(com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResultInternal.Cancelled.INSTANCE, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        
            if (r4.this$0.finishWithError(((com.stripe.android.financialconnections.FinancialConnectionsSheetResult.Failed) r5).getError(), r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        
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
                FinancialConnectionsSheetResult financialConnectionsSheetResult = this.$result;
                if (financialConnectionsSheetResult instanceof FinancialConnectionsSheetResult.Canceled) {
                    this.label = 1;
                } else if (financialConnectionsSheetResult instanceof FinancialConnectionsSheetResult.Failed) {
                    this.label = 2;
                } else if (financialConnectionsSheetResult instanceof FinancialConnectionsSheetResult.Completed) {
                    if (this.this$0.args.getAttachToIntent()) {
                        this.this$0.attachSessionToIntent(((FinancialConnectionsSheetResult.Completed) this.$result).getFinancialConnectionsSession());
                    } else {
                        this.this$0.finishWithSession(((FinancialConnectionsSheetResult.Completed) this.$result).getFinancialConnectionsSession());
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
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

    public final void onConnectionsForACHResult(FinancialConnectionsSheetResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        setHasLaunched(false);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C10901(result, this, null), 3, null);
    }

    /* compiled from: CollectBankAccountViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$onConnectionsForInstantDebitsResult$1", f = "CollectBankAccountViewModel.kt", i = {}, l = {159, 162}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$onConnectionsForInstantDebitsResult$1, reason: invalid class name and case insensitive filesystem */
    static final class C10911 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FinancialConnectionsSheetInstantDebitsResult $result;
        int label;
        final /* synthetic */ CollectBankAccountViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10911(FinancialConnectionsSheetInstantDebitsResult financialConnectionsSheetInstantDebitsResult, CollectBankAccountViewModel collectBankAccountViewModel, Continuation<? super C10911> continuation) {
            super(2, continuation);
            this.$result = financialConnectionsSheetInstantDebitsResult;
            this.this$0 = collectBankAccountViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C10911(this.$result, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        
            if (r4.this$0.finishWithResult(com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResultInternal.Cancelled.INSTANCE, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        
            if (r4.this$0.finishWithError(((com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetInstantDebitsResult.Failed) r5).getError(), r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        
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
                FinancialConnectionsSheetInstantDebitsResult financialConnectionsSheetInstantDebitsResult = this.$result;
                if (financialConnectionsSheetInstantDebitsResult instanceof FinancialConnectionsSheetInstantDebitsResult.Canceled) {
                    this.label = 1;
                } else if (financialConnectionsSheetInstantDebitsResult instanceof FinancialConnectionsSheetInstantDebitsResult.Failed) {
                    this.label = 2;
                } else if (financialConnectionsSheetInstantDebitsResult instanceof FinancialConnectionsSheetInstantDebitsResult.Completed) {
                    this.this$0.finishWithPaymentMethodId((FinancialConnectionsSheetInstantDebitsResult.Completed) financialConnectionsSheetInstantDebitsResult);
                } else {
                    throw new NoWhenBranchMatchedException();
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

    public final void onConnectionsForInstantDebitsResult(FinancialConnectionsSheetInstantDebitsResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        setHasLaunched(false);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C10911(result, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object finishWithResult(CollectBankAccountResultInternal collectBankAccountResultInternal, Continuation<? super Unit> continuation) {
        Object objEmit = this._viewEffect.emit(new CollectBankAccountViewEffect.FinishWithResult(collectBankAccountResultInternal), continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithSession(final com.stripe.android.financialconnections.model.FinancialConnectionsSession financialConnectionsSession) {
        finishWithRefreshedIntent(new Function1() { // from class: com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CollectBankAccountViewModel.finishWithSession$lambda$3(financialConnectionsSession, (StripeIntent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CollectBankAccountResponseInternal finishWithSession$lambda$3(com.stripe.android.financialconnections.model.FinancialConnectionsSession financialConnectionsSession, StripeIntent stripeIntent) {
        return new CollectBankAccountResponseInternal(stripeIntent, new CollectBankAccountResponseInternal.USBankAccountData(financialConnectionsSession), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithPaymentMethodId(final FinancialConnectionsSheetInstantDebitsResult.Completed result) {
        finishWithRefreshedIntent(new Function1() { // from class: com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CollectBankAccountViewModel.finishWithPaymentMethodId$lambda$5(this.f$0, result, (StripeIntent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CollectBankAccountResponseInternal finishWithPaymentMethodId$lambda$5(CollectBankAccountViewModel collectBankAccountViewModel, FinancialConnectionsSheetInstantDebitsResult.Completed completed, StripeIntent stripeIntent) {
        PaymentMethod paymentMethod = collectBankAccountViewModel.parsePaymentMethod(completed.getEncodedPaymentMethod());
        return new CollectBankAccountResponseInternal(stripeIntent, null, paymentMethod != null ? new CollectBankAccountResponseInternal.InstantDebitsData(paymentMethod, completed.getLast4(), completed.getBankName(), completed.getEligibleForIncentive()) : null);
    }

    private final PaymentMethod parsePaymentMethod(String str) {
        try {
            return new PaymentMethodJsonParser().parse(new JSONObject(str));
        } catch (Exception e) {
            this.logger.error("Failed to parse PaymentMethod", e);
            return null;
        }
    }

    /* compiled from: CollectBankAccountViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$finishWithRefreshedIntent$1", f = "CollectBankAccountViewModel.kt", i = {}, l = {229, 233, 236}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$finishWithRefreshedIntent$1, reason: invalid class name and case insensitive filesystem */
    static final class C10891 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<StripeIntent, CollectBankAccountResponseInternal> $action;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C10891(Function1<? super StripeIntent, CollectBankAccountResponseInternal> function1, Continuation<? super C10891> continuation) {
            super(2, continuation);
            this.$action = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CollectBankAccountViewModel.this.new C10891(this.$action, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
        
            if (r3.finishWithResult(r4, r7) == r0) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM8165invoke0E7RQCE;
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String clientSecret = CollectBankAccountViewModel.this.args.getClientSecret();
                if (clientSecret != null) {
                    this.label = 1;
                    objM8165invoke0E7RQCE = CollectBankAccountViewModel.this.retrieveStripeIntent.m8165invoke0E7RQCE(CollectBankAccountViewModel.this.args.getPublishableKey(), clientSecret, this);
                    if (objM8165invoke0E7RQCE != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                Result.Companion companion = Result.INSTANCE;
                objM8165invoke0E7RQCE = Result.m9118constructorimpl(null);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    obj2 = this.L$0;
                    ResultKt.throwOnFailure(obj);
                    Function1<StripeIntent, CollectBankAccountResponseInternal> function1 = this.$action;
                    CollectBankAccountViewModel collectBankAccountViewModel = CollectBankAccountViewModel.this;
                    if (Result.m9125isSuccessimpl(obj2)) {
                        CollectBankAccountResultInternal.Completed completed = new CollectBankAccountResultInternal.Completed(function1.invoke((StripeIntent) obj2));
                        this.L$0 = obj2;
                        this.label = 3;
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                objM8165invoke0E7RQCE = ((Result) obj).getValue();
            }
            obj2 = objM8165invoke0E7RQCE;
            CollectBankAccountViewModel collectBankAccountViewModel2 = CollectBankAccountViewModel.this;
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(obj2);
            if (thM9121exceptionOrNullimpl != null) {
                this.L$0 = obj2;
                this.label = 2;
                if (collectBankAccountViewModel2.finishWithError(thM9121exceptionOrNullimpl, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            Function1<StripeIntent, CollectBankAccountResponseInternal> function12 = this.$action;
            CollectBankAccountViewModel collectBankAccountViewModel3 = CollectBankAccountViewModel.this;
            if (Result.m9125isSuccessimpl(obj2)) {
            }
            return Unit.INSTANCE;
        }
    }

    private final void finishWithRefreshedIntent(Function1<? super StripeIntent, CollectBankAccountResponseInternal> action) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C10891(action, null), 3, null);
    }

    /* compiled from: CollectBankAccountViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$attachSessionToIntent$1", f = "CollectBankAccountViewModel.kt", i = {}, l = {249, 257, 275, 277}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$attachSessionToIntent$1, reason: invalid class name and case insensitive filesystem */
    static final class C10871 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ com.stripe.android.financialconnections.model.FinancialConnectionsSession $financialConnectionsSession;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10871(com.stripe.android.financialconnections.model.FinancialConnectionsSession financialConnectionsSession, Continuation<? super C10871> continuation) {
            super(2, continuation);
            this.$financialConnectionsSession = financialConnectionsSession;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CollectBankAccountViewModel.this.new C10871(this.$financialConnectionsSession, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x0124, code lost:
        
            if (r13.finishWithError(r3, r12) == r1) goto L43;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x011c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM8161forSetupIntentyxL6bBk;
            Object objM9118constructorimpl;
            Object obj2;
            Throwable thM9121exceptionOrNullimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CollectBankAccountContract.Args args = CollectBankAccountViewModel.this.args;
                if ((args instanceof CollectBankAccountContract.Args.ForDeferredPaymentIntent) || (args instanceof CollectBankAccountContract.Args.ForDeferredSetupIntent)) {
                    throw new IllegalStateException("Attach requires client secret".toString());
                }
                if (args instanceof CollectBankAccountContract.Args.ForPaymentIntent) {
                    AttachFinancialConnectionsSession attachFinancialConnectionsSession = CollectBankAccountViewModel.this.attachFinancialConnectionsSession;
                    String publishableKey = ((CollectBankAccountContract.Args.ForPaymentIntent) CollectBankAccountViewModel.this.args).getPublishableKey();
                    String stripeAccountId = ((CollectBankAccountContract.Args.ForPaymentIntent) CollectBankAccountViewModel.this.args).getStripeAccountId();
                    String clientSecret = ((CollectBankAccountContract.Args.ForPaymentIntent) CollectBankAccountViewModel.this.args).getClientSecret();
                    this.label = 1;
                    objM8161forSetupIntentyxL6bBk = attachFinancialConnectionsSession.m8160forPaymentIntentyxL6bBk(publishableKey, this.$financialConnectionsSession.getId(), clientSecret, stripeAccountId, this);
                    if (objM8161forSetupIntentyxL6bBk != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (args instanceof CollectBankAccountContract.Args.ForSetupIntent) {
                    AttachFinancialConnectionsSession attachFinancialConnectionsSession2 = CollectBankAccountViewModel.this.attachFinancialConnectionsSession;
                    String publishableKey2 = ((CollectBankAccountContract.Args.ForSetupIntent) CollectBankAccountViewModel.this.args).getPublishableKey();
                    String stripeAccountId2 = ((CollectBankAccountContract.Args.ForSetupIntent) CollectBankAccountViewModel.this.args).getStripeAccountId();
                    String clientSecret2 = ((CollectBankAccountContract.Args.ForSetupIntent) CollectBankAccountViewModel.this.args).getClientSecret();
                    this.label = 2;
                    objM8161forSetupIntentyxL6bBk = attachFinancialConnectionsSession2.m8161forSetupIntentyxL6bBk(publishableKey2, this.$financialConnectionsSession.getId(), clientSecret2, stripeAccountId2, this);
                    if (objM8161forSetupIntentyxL6bBk != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                obj2 = this.L$0;
                ResultKt.throwOnFailure(obj);
                CollectBankAccountViewModel collectBankAccountViewModel = CollectBankAccountViewModel.this;
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(obj2);
                if (thM9121exceptionOrNullimpl != null) {
                    this.L$0 = obj2;
                    this.label = 4;
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            objM8161forSetupIntentyxL6bBk = ((Result) obj).getValue();
            com.stripe.android.financialconnections.model.FinancialConnectionsSession financialConnectionsSession = this.$financialConnectionsSession;
            if (Result.m9125isSuccessimpl(objM8161forSetupIntentyxL6bBk)) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(new CollectBankAccountResultInternal.Completed(new CollectBankAccountResponseInternal((StripeIntent) objM8161forSetupIntentyxL6bBk, new CollectBankAccountResponseInternal.USBankAccountData(financialConnectionsSession), null)));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM8161forSetupIntentyxL6bBk = ResultKt.createFailure(th);
                }
                obj2 = objM9118constructorimpl;
                CollectBankAccountViewModel collectBankAccountViewModel2 = CollectBankAccountViewModel.this;
                if (Result.m9125isSuccessimpl(obj2)) {
                    collectBankAccountViewModel2.logger.debug("Bank account session attached to intent!!");
                    this.L$0 = obj2;
                    this.label = 3;
                    if (collectBankAccountViewModel2.finishWithResult((CollectBankAccountResultInternal.Completed) obj2, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                CollectBankAccountViewModel collectBankAccountViewModel3 = CollectBankAccountViewModel.this;
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(obj2);
                if (thM9121exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
            objM9118constructorimpl = Result.m9118constructorimpl(objM8161forSetupIntentyxL6bBk);
            obj2 = objM9118constructorimpl;
            CollectBankAccountViewModel collectBankAccountViewModel22 = CollectBankAccountViewModel.this;
            if (Result.m9125isSuccessimpl(obj2)) {
            }
            CollectBankAccountViewModel collectBankAccountViewModel32 = CollectBankAccountViewModel.this;
            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(obj2);
            if (thM9121exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attachSessionToIntent(com.stripe.android.financialconnections.model.FinancialConnectionsSession financialConnectionsSession) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C10871(financialConnectionsSession, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object finishWithError(Throwable th, Continuation<? super Unit> continuation) {
        this.logger.error("Error", new Exception(th));
        Object objFinishWithResult = finishWithResult(new CollectBankAccountResultInternal.Failed(th), continuation);
        return objFinishWithResult == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objFinishWithResult : Unit.INSTANCE;
    }

    /* compiled from: CollectBankAccountViewModel.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000eR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "argsSupplier", "Lkotlin/Function0;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements ViewModelProvider.Factory {
        public static final int $stable = 0;
        private final Function0<CollectBankAccountContract.Args> argsSupplier;

        /* JADX WARN: Multi-variable type inference failed */
        public Factory(Function0<? extends CollectBankAccountContract.Args> argsSupplier) {
            Intrinsics.checkNotNullParameter(argsSupplier, "argsSupplier");
            this.argsSupplier = argsSupplier;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            CollectBankAccountViewModel viewModel = DaggerCollectBankAccountComponent.builder().savedStateHandle(SavedStateHandleSupport.createSavedStateHandle(extras)).application(CreationExtrasKtxKt.requireApplication(extras)).viewEffect(SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null)).configuration(this.argsSupplier.invoke()).build().getViewModel();
            Intrinsics.checkNotNull(viewModel, "null cannot be cast to non-null type T of com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel.Factory.create");
            return viewModel;
        }
    }
}
