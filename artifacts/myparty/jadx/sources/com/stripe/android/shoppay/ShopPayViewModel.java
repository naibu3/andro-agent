package com.stripe.android.shoppay;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.webkit.WebViewAssetLoader;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.stripe.android.core.exception.GenericStripeException;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.injection.UIContext;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.Address;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.RadarSessionWithHCaptcha;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentelement.PreparePaymentMethodHandler;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.addresselement.AddressDetails;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.shoppay.ShopPayActivityResult;
import com.stripe.android.shoppay.ShopPayViewModel;
import com.stripe.android.shoppay.bridge.ECEFullAddress;
import com.stripe.android.shoppay.bridge.ECEShippingAddressData;
import com.stripe.android.shoppay.bridge.ShopPayBridgeHandler;
import com.stripe.android.shoppay.bridge.ShopPayConfirmationState;
import com.stripe.android.shoppay.di.DaggerShopPayComponent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* compiled from: ShopPayViewModel.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u0000 52\u00020\u0001:\u000256BK\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u001e\u001a\u00020\u001fH\u0082@¢\u0006\u0002\u0010 J\u0016\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#H\u0082@¢\u0006\u0002\u0010$J\u0016\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020'H\u0082@¢\u0006\u0002\u0010(J\u0006\u0010)\u001a\u00020\u001fJ\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-J\u0016\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202J\u000e\u00103\u001a\u00020\u001f2\u0006\u00104\u001a\u000200R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/stripe/android/shoppay/ShopPayViewModel;", "Landroidx/lifecycle/ViewModel;", "bridgeHandler", "Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;", "stripeApiRepository", "Lcom/stripe/android/networking/StripeRepository;", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "preparePaymentMethodHandlerProvider", "Ljavax/inject/Provider;", "Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljavax/inject/Provider;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V", "getBridgeHandler", "()Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;", "_paymentResult", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/stripe/android/shoppay/ShopPayActivityResult;", "paymentResult", "Lkotlinx/coroutines/flow/Flow;", "getPaymentResult", "()Lkotlinx/coroutines/flow/Flow;", "didReceiveECEClick", "", "listenToConfirmationState", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleSuccessfulPayment", "confirmationState", "Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;", "(Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createRadarSessionIfPossible", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "(Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "closePopup", "assetLoader", "Landroidx/webkit/WebViewAssetLoader;", "context", "Landroid/content/Context;", "onPageLoaded", ViewHierarchyConstants.VIEW_KEY, "Landroid/webkit/WebView;", "url", "", "loadUrl", "webView", "Companion", "NoArgsException", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShopPayViewModel extends ViewModel {
    private final MutableSharedFlow<ShopPayActivityResult> _paymentResult;
    private final ShopPayBridgeHandler bridgeHandler;
    private boolean didReceiveECEClick;
    private final ErrorReporter errorReporter;
    private final EventReporter eventReporter;
    private final Flow<ShopPayActivityResult> paymentResult;
    private final Provider<PreparePaymentMethodHandler> preparePaymentMethodHandlerProvider;
    private final ApiRequest.Options requestOptions;
    private final StripeRepository stripeApiRepository;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ShopPayViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.shoppay.ShopPayViewModel", f = "ShopPayViewModel.kt", i = {0}, l = {149}, m = "createRadarSessionIfPossible", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.shoppay.ShopPayViewModel$createRadarSessionIfPossible$1, reason: invalid class name and case insensitive filesystem */
    static final class C11581 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C11581(Continuation<? super C11581> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ShopPayViewModel.this.createRadarSessionIfPossible(null, this);
        }
    }

    /* compiled from: ShopPayViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.shoppay.ShopPayViewModel", f = "ShopPayViewModel.kt", i = {0, 0, 1, 1, 1}, l = {111, 115, 121}, m = "handleSuccessfulPayment", n = {"this", "shippingAddressData", "this", "shippingAddressData", "paymentMethod"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    /* renamed from: com.stripe.android.shoppay.ShopPayViewModel$handleSuccessfulPayment$1, reason: invalid class name and case insensitive filesystem */
    static final class C11591 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C11591(Continuation<? super C11591> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ShopPayViewModel.this.handleSuccessfulPayment(null, this);
        }
    }

    public final ShopPayBridgeHandler getBridgeHandler() {
        return this.bridgeHandler;
    }

    public /* synthetic */ ShopPayViewModel(ShopPayBridgeHandler shopPayBridgeHandler, StripeRepository stripeRepository, ApiRequest.Options options, Provider provider, EventReporter eventReporter, ErrorReporter errorReporter, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(shopPayBridgeHandler, stripeRepository, options, provider, eventReporter, errorReporter, (i & 64) != 0 ? Dispatchers.getMain() : coroutineContext);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public ShopPayViewModel(ShopPayBridgeHandler bridgeHandler, StripeRepository stripeApiRepository, ApiRequest.Options requestOptions, Provider<PreparePaymentMethodHandler> preparePaymentMethodHandlerProvider, EventReporter eventReporter, ErrorReporter errorReporter, @UIContext CoroutineContext workContext) {
        super(CoroutineScopeKt.CoroutineScope(workContext.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null))));
        Intrinsics.checkNotNullParameter(bridgeHandler, "bridgeHandler");
        Intrinsics.checkNotNullParameter(stripeApiRepository, "stripeApiRepository");
        Intrinsics.checkNotNullParameter(requestOptions, "requestOptions");
        Intrinsics.checkNotNullParameter(preparePaymentMethodHandlerProvider, "preparePaymentMethodHandlerProvider");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.bridgeHandler = bridgeHandler;
        this.stripeApiRepository = stripeApiRepository;
        this.requestOptions = requestOptions;
        this.preparePaymentMethodHandlerProvider = preparePaymentMethodHandlerProvider;
        this.eventReporter = eventReporter;
        this.errorReporter = errorReporter;
        MutableSharedFlow<ShopPayActivityResult> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._paymentResult = mutableSharedFlowMutableSharedFlow$default;
        this.paymentResult = mutableSharedFlowMutableSharedFlow$default;
        bridgeHandler.setOnECEClickCallback(new Function0() { // from class: com.stripe.android.shoppay.ShopPayViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShopPayViewModel._init_$lambda$0(this.f$0);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass2(null), 3, null);
    }

    public final Flow<ShopPayActivityResult> getPaymentResult() {
        return this.paymentResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(ShopPayViewModel shopPayViewModel) {
        shopPayViewModel.didReceiveECEClick = true;
        return Unit.INSTANCE;
    }

    /* compiled from: ShopPayViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.shoppay.ShopPayViewModel$2", f = "ShopPayViewModel.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.shoppay.ShopPayViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ShopPayViewModel.this.new AnonymousClass2(continuation);
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
                this.label = 1;
                if (ShopPayViewModel.this.listenToConfirmationState(this) == coroutine_suspended) {
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

    /* compiled from: ShopPayViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "confirmationState", "Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.shoppay.ShopPayViewModel$listenToConfirmationState$2", f = "ShopPayViewModel.kt", i = {}, l = {76, 80, 84}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.shoppay.ShopPayViewModel$listenToConfirmationState$2, reason: invalid class name and case insensitive filesystem */
    static final class C11602 extends SuspendLambda implements Function2<ShopPayConfirmationState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C11602(Continuation<? super C11602> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11602 c11602 = ShopPayViewModel.this.new C11602(continuation);
            c11602.L$0 = obj;
            return c11602;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ShopPayConfirmationState shopPayConfirmationState, Continuation<? super Unit> continuation) {
            return ((C11602) create(shopPayConfirmationState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
        
            if (r5.this$0._paymentResult.emit(new com.stripe.android.shoppay.ShopPayActivityResult.Failed(((com.stripe.android.shoppay.bridge.ShopPayConfirmationState.Failure) r6).getCause()), r5) == r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
        
            if (r5.this$0._paymentResult.emit(r6, r5) != r0) goto L32;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ShopPayActivityResult shopPayActivityResult;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ShopPayConfirmationState shopPayConfirmationState = (ShopPayConfirmationState) this.L$0;
                if (!(shopPayConfirmationState instanceof ShopPayConfirmationState.Failure)) {
                    if (!Intrinsics.areEqual(shopPayConfirmationState, ShopPayConfirmationState.Pending.INSTANCE)) {
                        if (shopPayConfirmationState instanceof ShopPayConfirmationState.Success) {
                            this.label = 2;
                            obj = ShopPayViewModel.this.handleSuccessfulPayment((ShopPayConfirmationState.Success) shopPayConfirmationState, this);
                            if (obj != coroutine_suspended) {
                                shopPayActivityResult = (ShopPayActivityResult) obj;
                                if (shopPayActivityResult instanceof ShopPayActivityResult.Completed) {
                                }
                                this.label = 3;
                            }
                            return coroutine_suspended;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return Unit.INSTANCE;
                }
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        shopPayActivityResult = (ShopPayActivityResult) obj;
                        if (shopPayActivityResult instanceof ShopPayActivityResult.Completed) {
                            ShopPayViewModel.this.eventReporter.onShopPayWebViewConfirmSuccess();
                        }
                        this.label = 3;
                    } else if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object listenToConfirmationState(Continuation<? super Unit> continuation) {
        Object objCollectLatest = FlowKt.collectLatest(this.bridgeHandler.getConfirmationState(), new C11602(null), continuation);
        return objCollectLatest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectLatest : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0160, code lost:
    
        if (r1.onPreparePaymentMethod(r4, r9, r2) == r3) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0171 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleSuccessfulPayment(ShopPayConfirmationState.Success success, Continuation<? super ShopPayActivityResult> continuation) {
        C11591 c11591;
        ECEShippingAddressData shippingAddressData;
        ShopPayActivityResult.Failed failedMo8025createPaymentMethod0E7RQCE;
        ShopPayViewModel shopPayViewModel;
        ECEShippingAddressData eCEShippingAddressData;
        PaymentMethod paymentMethod;
        PreparePaymentMethodHandler preparePaymentMethodHandler;
        AddressDetails addressDetails;
        if (continuation instanceof C11591) {
            c11591 = (C11591) continuation;
            if ((c11591.label & Integer.MIN_VALUE) != 0) {
                c11591.label -= Integer.MIN_VALUE;
            } else {
                c11591 = new C11591(continuation);
            }
        }
        Object obj = c11591.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c11591.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ECEFullAddress address = success.getBillingDetails().getAddress();
            shippingAddressData = success.getShippingAddressData();
            PaymentMethodCreateParams paymentMethodCreateParamsCreateShopPay = PaymentMethodCreateParams.INSTANCE.createShopPay(success.getExternalSourceId(), new PaymentMethod.BillingDetails(new Address(address != null ? address.getCity() : null, address != null ? address.getCountry() : null, address != null ? address.getLine1() : null, address != null ? address.getLine2() : null, address != null ? address.getPostalCode() : null, address != null ? address.getState() : null), success.getBillingDetails().getEmail(), success.getBillingDetails().getName(), success.getBillingDetails().getPhone()));
            StripeRepository stripeRepository = this.stripeApiRepository;
            ApiRequest.Options options = this.requestOptions;
            c11591.L$0 = this;
            c11591.L$1 = shippingAddressData;
            c11591.label = 1;
            failedMo8025createPaymentMethod0E7RQCE = stripeRepository.mo8025createPaymentMethod0E7RQCE(paymentMethodCreateParamsCreateShopPay, options, c11591);
            if (failedMo8025createPaymentMethod0E7RQCE != coroutine_suspended) {
                shopPayViewModel = this;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            shippingAddressData = (ECEShippingAddressData) c11591.L$1;
            shopPayViewModel = (ShopPayViewModel) c11591.L$0;
            ResultKt.throwOnFailure(obj);
            failedMo8025createPaymentMethod0E7RQCE = ((Result) obj).getValue();
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                failedMo8025createPaymentMethod0E7RQCE = ShopPayActivityResult.Completed.INSTANCE;
                Object objM9118constructorimpl = Result.m9118constructorimpl(failedMo8025createPaymentMethod0E7RQCE);
                Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                return thM9121exceptionOrNullimpl == null ? objM9118constructorimpl : new ShopPayActivityResult.Failed(thM9121exceptionOrNullimpl);
            }
            paymentMethod = (PaymentMethod) c11591.L$2;
            eCEShippingAddressData = (ECEShippingAddressData) c11591.L$1;
            shopPayViewModel = (ShopPayViewModel) c11591.L$0;
            ResultKt.throwOnFailure(obj);
            preparePaymentMethodHandler = shopPayViewModel.preparePaymentMethodHandlerProvider.get();
            if (preparePaymentMethodHandler != null) {
                failedMo8025createPaymentMethod0E7RQCE = new ShopPayActivityResult.Failed(new IllegalStateException("PreparePaymentMethodHandler is required for ShopPay"));
                Object objM9118constructorimpl2 = Result.m9118constructorimpl(failedMo8025createPaymentMethod0E7RQCE);
                Throwable thM9121exceptionOrNullimpl2 = Result.m9121exceptionOrNullimpl(objM9118constructorimpl2);
                if (thM9121exceptionOrNullimpl2 == null) {
                }
            } else {
                if (eCEShippingAddressData != null) {
                    String name = eCEShippingAddressData.getName();
                    ECEFullAddress address2 = eCEShippingAddressData.getAddress();
                    addressDetails = new AddressDetails(name, address2 != null ? new PaymentSheet.Address(address2.getCity(), address2.getCountry(), address2.getLine1(), address2.getLine2(), address2.getPostalCode(), address2.getState()) : null, null, null, 12, null);
                } else {
                    addressDetails = null;
                }
                c11591.L$0 = null;
                c11591.L$1 = null;
                c11591.L$2 = null;
                c11591.label = 3;
            }
        }
        if (Result.m9125isSuccessimpl(failedMo8025createPaymentMethod0E7RQCE)) {
            Result.Companion companion = Result.INSTANCE;
            PaymentMethod paymentMethod2 = (PaymentMethod) failedMo8025createPaymentMethod0E7RQCE;
            c11591.L$0 = shopPayViewModel;
            c11591.L$1 = shippingAddressData;
            c11591.L$2 = paymentMethod2;
            c11591.label = 2;
            if (shopPayViewModel.createRadarSessionIfPossible(paymentMethod2, c11591) != coroutine_suspended) {
                eCEShippingAddressData = shippingAddressData;
                paymentMethod = paymentMethod2;
                preparePaymentMethodHandler = shopPayViewModel.preparePaymentMethodHandlerProvider.get();
                if (preparePaymentMethodHandler != null) {
                }
            }
            return coroutine_suspended;
        }
        Object objM9118constructorimpl22 = Result.m9118constructorimpl(failedMo8025createPaymentMethod0E7RQCE);
        Throwable thM9121exceptionOrNullimpl22 = Result.m9121exceptionOrNullimpl(objM9118constructorimpl22);
        if (thM9121exceptionOrNullimpl22 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createRadarSessionIfPossible(PaymentMethod paymentMethod, Continuation<? super Unit> continuation) {
        C11581 c11581;
        Throwable th;
        ShopPayViewModel shopPayViewModel;
        Object objMo8027createSavedPaymentMethodRadarSession0E7RQCE;
        Object objM9118constructorimpl;
        Throwable thM9121exceptionOrNullimpl;
        if (continuation instanceof C11581) {
            c11581 = (C11581) continuation;
            if ((c11581.label & Integer.MIN_VALUE) != 0) {
                c11581.label -= Integer.MIN_VALUE;
            } else {
                c11581 = new C11581(continuation);
            }
        }
        Object obj = c11581.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c11581.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                Result.Companion companion = Result.INSTANCE;
                ShopPayViewModel shopPayViewModel2 = this;
                StripeRepository stripeRepository = this.stripeApiRepository;
                String str = paymentMethod.id;
                if (str == null) {
                    throw new GenericStripeException(new IllegalStateException("No payment method ID was found for provided 'PaymentMethod' object!"), "noPaymentMethodId");
                }
                ApiRequest.Options options = this.requestOptions;
                c11581.L$0 = this;
                c11581.label = 1;
                objMo8027createSavedPaymentMethodRadarSession0E7RQCE = stripeRepository.mo8027createSavedPaymentMethodRadarSession0E7RQCE(str, options, c11581);
                if (objMo8027createSavedPaymentMethodRadarSession0E7RQCE == coroutine_suspended) {
                    return coroutine_suspended;
                }
                shopPayViewModel = this;
            } catch (Throwable th2) {
                th = th2;
                shopPayViewModel = this;
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            shopPayViewModel = (ShopPayViewModel) c11581.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                objMo8027createSavedPaymentMethodRadarSession0E7RQCE = ((Result) obj).getValue();
            } catch (Throwable th3) {
                th = th3;
                Result.Companion companion22 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
        }
        ResultKt.throwOnFailure(objMo8027createSavedPaymentMethodRadarSession0E7RQCE);
        objM9118constructorimpl = Result.m9118constructorimpl((RadarSessionWithHCaptcha) objMo8027createSavedPaymentMethodRadarSession0E7RQCE);
        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            ErrorReporter.DefaultImpls.report$default(shopPayViewModel.errorReporter, ErrorReporter.ExpectedErrorEvent.SAVED_PAYMENT_METHOD_RADAR_SESSION_FAILURE, StripeException.INSTANCE.create(thM9121exceptionOrNullimpl), null, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: ShopPayViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.shoppay.ShopPayViewModel$closePopup$1", f = "ShopPayViewModel.kt", i = {}, l = {170}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.shoppay.ShopPayViewModel$closePopup$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ShopPayViewModel.this.new AnonymousClass1(continuation);
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
                if (ShopPayViewModel.this._paymentResult.emit(ShopPayActivityResult.Canceled.INSTANCE, this) == coroutine_suspended) {
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

    public final void closePopup() {
        this.eventReporter.onShopPayWebViewCancelled(this.didReceiveECEClick);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final WebViewAssetLoader assetLoader(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        WebViewAssetLoader webViewAssetLoaderBuild = new WebViewAssetLoader.Builder().setDomain("pay.stripe.com").addPathHandler("/assets/", new WebViewAssetLoader.AssetsPathHandler(context)).build();
        Intrinsics.checkNotNullExpressionValue(webViewAssetLoaderBuild, "build(...)");
        return webViewAssetLoaderBuild;
    }

    public final void onPageLoaded(WebView view, String url) throws IOException {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        InputStream inputStreamOpen = view.getContext().getAssets().open("www/native.js");
        Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
        Reader inputStreamReader = new InputStreamReader(inputStreamOpen, Charsets.UTF_8);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        try {
            String text = TextStreamsKt.readText(bufferedReader);
            CloseableKt.closeFinally(bufferedReader, null);
            view.evaluateJavascript(text, null);
            if (StringsKt.contains$default((CharSequence) url, (CharSequence) "pay.stripe.com", false, 2, (Object) null)) {
                view.evaluateJavascript("initializeApp()", new ValueCallback() { // from class: com.stripe.android.shoppay.ShopPayViewModel$$ExternalSyntheticLambda0
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        ShopPayViewModel.onPageLoaded$lambda$7((String) obj);
                    }
                });
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(bufferedReader, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPageLoaded$lambda$7(String str) {
        Log.d("WebViewBridge", "initializeApp() => " + str);
    }

    public final void loadUrl(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.eventReporter.onShopPayWebViewLoadAttempt();
        webView.loadUrl("https://pay.stripe.com/assets/www/index.html");
    }

    /* compiled from: ShopPayViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/shoppay/ShopPayViewModel$Companion;", "", "<init>", "()V", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ ViewModelProvider.Factory factory$default(Companion companion, SavedStateHandle savedStateHandle, int i, Object obj) {
            if ((i & 1) != 0) {
                savedStateHandle = null;
            }
            return companion.factory(savedStateHandle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ShopPayViewModel factory$lambda$3$lambda$2(SavedStateHandle savedStateHandle, CreationExtras initializer) {
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            if (savedStateHandle == null) {
                savedStateHandle = SavedStateHandleSupport.createSavedStateHandle(initializer);
            }
            Object obj = initializer.get(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.app.Application");
            Application application = (Application) obj;
            final ShopPayArgs args$paymentsheet_release = ShopPayActivity.INSTANCE.getArgs$paymentsheet_release(savedStateHandle);
            if (args$paymentsheet_release == null) {
                throw new NoArgsException();
            }
            return DaggerShopPayComponent.builder().context(application).paymentElementCallbackIdentifier(args$paymentsheet_release.getPaymentElementCallbackIdentifier()).shopPayArgs(args$paymentsheet_release).stripeAccountIdProvider(new Function0() { // from class: com.stripe.android.shoppay.ShopPayViewModel$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return args$paymentsheet_release.getStripeAccountId();
                }
            }).publishableKeyProvider(new Function0() { // from class: com.stripe.android.shoppay.ShopPayViewModel$Companion$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return args$paymentsheet_release.getPublishableKey();
                }
            }).build().getViewModel();
        }

        public final ViewModelProvider.Factory factory(final SavedStateHandle savedStateHandle) {
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(ShopPayViewModel.class), new Function1() { // from class: com.stripe.android.shoppay.ShopPayViewModel$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ShopPayViewModel.Companion.factory$lambda$3$lambda$2(savedStateHandle, (CreationExtras) obj);
                }
            });
            return initializerViewModelFactoryBuilder.build();
        }
    }

    /* compiled from: ShopPayViewModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/shoppay/ShopPayViewModel$NoArgsException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoArgsException extends IllegalArgumentException {
        public static final int $stable = 0;

        public NoArgsException() {
            super("No args found");
        }
    }
}
