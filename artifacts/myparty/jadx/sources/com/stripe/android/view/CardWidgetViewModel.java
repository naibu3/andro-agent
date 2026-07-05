package com.stripe.android.view;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams;
import com.stripe.android.model.MobileCardElementConfig;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.view.CardWidgetViewModel;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: CardWidgetViewModel.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001bB'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\u000e\u0010\u0019\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010\u001aR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/view/CardWidgetViewModel;", "Landroidx/lifecycle/ViewModel;", "paymentConfigProvider", "Ljavax/inject/Provider;", "Lcom/stripe/android/PaymentConfiguration;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Ljavax/inject/Provider;Lcom/stripe/android/networking/StripeRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_isCbcEligible", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isCbcEligible", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "_onBehalfOf", "", "onBehalfOf", "getOnBehalfOf", "()Ljava/lang/String;", "setOnBehalfOf", "", "getEligibility", "determineCbcEligibility", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Factory", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CardWidgetViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<Boolean> _isCbcEligible;
    private String _onBehalfOf;
    private final CoroutineDispatcher dispatcher;
    private final StateFlow<Boolean> isCbcEligible;
    private final Provider<PaymentConfiguration> paymentConfigProvider;
    private final StripeRepository stripeRepository;

    /* compiled from: CardWidgetViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.view.CardWidgetViewModel", f = "CardWidgetViewModel.kt", i = {}, l = {60}, m = "determineCbcEligibility", n = {}, s = {})
    /* renamed from: com.stripe.android.view.CardWidgetViewModel$determineCbcEligibility$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CardWidgetViewModel.this.determineCbcEligibility(this);
        }
    }

    public /* synthetic */ CardWidgetViewModel(Provider provider, StripeRepository stripeRepository, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(provider, stripeRepository, (i & 4) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    public CardWidgetViewModel(Provider<PaymentConfiguration> paymentConfigProvider, StripeRepository stripeRepository, CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(paymentConfigProvider, "paymentConfigProvider");
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.paymentConfigProvider = paymentConfigProvider;
        this.stripeRepository = stripeRepository;
        this.dispatcher = dispatcher;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(false);
        this._isCbcEligible = MutableStateFlow;
        this.isCbcEligible = MutableStateFlow;
        getEligibility();
    }

    public final StateFlow<Boolean> isCbcEligible() {
        return this.isCbcEligible;
    }

    /* renamed from: getOnBehalfOf, reason: from getter */
    public final String get_onBehalfOf() {
        return this._onBehalfOf;
    }

    public static /* synthetic */ void setOnBehalfOf$default(CardWidgetViewModel cardWidgetViewModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        cardWidgetViewModel.setOnBehalfOf(str);
    }

    public final void setOnBehalfOf(String onBehalfOf) {
        this._onBehalfOf = onBehalfOf;
        getEligibility();
    }

    /* compiled from: CardWidgetViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.view.CardWidgetViewModel$getEligibility$1", f = "CardWidgetViewModel.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.view.CardWidgetViewModel$getEligibility$1, reason: invalid class name and case insensitive filesystem */
    static final class C11711 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C11711(Continuation<? super C11711> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CardWidgetViewModel.this.new C11711(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableStateFlow mutableStateFlow;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow mutableStateFlow2 = CardWidgetViewModel.this._isCbcEligible;
                this.L$0 = mutableStateFlow2;
                this.label = 1;
                Object objDetermineCbcEligibility = CardWidgetViewModel.this.determineCbcEligibility(this);
                if (objDetermineCbcEligibility == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableStateFlow = mutableStateFlow2;
                obj = objDetermineCbcEligibility;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableStateFlow = (MutableStateFlow) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            mutableStateFlow.setValue(obj);
            return Unit.INSTANCE;
        }
    }

    private final void getEligibility() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new C11711(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object determineCbcEligibility(Continuation<? super Boolean> continuation) {
        AnonymousClass1 anonymousClass1;
        Object objMo8043retrieveCardElementConfig0E7RQCE;
        MobileCardElementConfig.CardBrandChoice cardBrandChoice;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PaymentConfiguration paymentConfiguration = this.paymentConfigProvider.get();
            StripeRepository stripeRepository = this.stripeRepository;
            ApiRequest.Options options = new ApiRequest.Options(paymentConfiguration.getPublishableKey(), paymentConfiguration.getStripeAccountId(), null, 4, null);
            String str = get_onBehalfOf();
            Map<String, String> mapMapOf = str != null ? MapsKt.mapOf(TuplesKt.to(CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_ON_BEHALF_OF, str)) : null;
            anonymousClass1.label = 1;
            objMo8043retrieveCardElementConfig0E7RQCE = stripeRepository.mo8043retrieveCardElementConfig0E7RQCE(options, mapMapOf, anonymousClass1);
            if (objMo8043retrieveCardElementConfig0E7RQCE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo8043retrieveCardElementConfig0E7RQCE = ((Result) obj).getValue();
        }
        MobileCardElementConfig mobileCardElementConfig = (MobileCardElementConfig) (Result.m9124isFailureimpl(objMo8043retrieveCardElementConfig0E7RQCE) ? null : objMo8043retrieveCardElementConfig0E7RQCE);
        return Boxing.boxBoolean((mobileCardElementConfig == null || (cardBrandChoice = mobileCardElementConfig.getCardBrandChoice()) == null) ? false : cardBrandChoice.getEligible());
    }

    /* compiled from: CardWidgetViewModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\b\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0002\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/view/CardWidgetViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements ViewModelProvider.Factory {
        public static final int $stable = 8;
        private final Context context;

        public Factory(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.context = context;
        }

        public final Context getContext() {
            return this.context;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new CardWidgetViewModel(new Provider() { // from class: com.stripe.android.view.CardWidgetViewModel$Factory$$ExternalSyntheticLambda1
                @Override // javax.inject.Provider
                public final Object get() {
                    return CardWidgetViewModel.Factory.create$lambda$1(this.f$0);
                }
            }, new StripeApiRepository(this.context, new Function0() { // from class: com.stripe.android.view.CardWidgetViewModel$Factory$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CardWidgetViewModel.Factory.create$lambda$0(this.f$0);
                }
            }, null, null, null, null, null, null, null, null, null, null, null, null, null, 32764, null), 0 == true ? 1 : 0, 4, 0 == true ? 1 : 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String create$lambda$0(Factory factory) {
            return PaymentConfiguration.INSTANCE.getInstance(factory.context).getPublishableKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PaymentConfiguration create$lambda$1(Factory factory) {
            return PaymentConfiguration.INSTANCE.getInstance(factory.context);
        }
    }
}
