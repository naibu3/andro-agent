package com.stripe.android.paymentsheet.state;

import com.stripe.android.common.model.CommonConfiguration;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentSheetCardBrandFilter;
import com.stripe.android.paymentsheet.model.SavedSelection;
import com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* compiled from: PaymentElementLoader.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/paymentsheet/state/CustomerState;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader$load$3$customer$1", f = "PaymentElementLoader.kt", i = {}, l = {214, 212}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class DefaultPaymentElementLoader$load$3$customer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CustomerState>, Object> {
    final /* synthetic */ CommonConfiguration $configuration;
    final /* synthetic */ DefaultPaymentElementLoader.CustomerInfo $customerInfo;
    final /* synthetic */ Deferred<PaymentMethodMetadata> $paymentMethodMetadata;
    final /* synthetic */ Deferred<SavedSelection> $savedSelection;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DefaultPaymentElementLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DefaultPaymentElementLoader$load$3$customer$1(DefaultPaymentElementLoader defaultPaymentElementLoader, DefaultPaymentElementLoader.CustomerInfo customerInfo, Deferred<PaymentMethodMetadata> deferred, Deferred<? extends SavedSelection> deferred2, CommonConfiguration commonConfiguration, Continuation<? super DefaultPaymentElementLoader$load$3$customer$1> continuation) {
        super(2, continuation);
        this.this$0 = defaultPaymentElementLoader;
        this.$customerInfo = customerInfo;
        this.$paymentMethodMetadata = deferred;
        this.$savedSelection = deferred2;
        this.$configuration = commonConfiguration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultPaymentElementLoader$load$3$customer$1(this.this$0, this.$customerInfo, this.$paymentMethodMetadata, this.$savedSelection, this.$configuration, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CustomerState> continuation) {
        return ((DefaultPaymentElementLoader$load$3$customer$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DefaultPaymentElementLoader.CustomerInfo customerInfo;
        DefaultPaymentElementLoader defaultPaymentElementLoader;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DefaultPaymentElementLoader defaultPaymentElementLoader2 = this.this$0;
            customerInfo = this.$customerInfo;
            this.L$0 = defaultPaymentElementLoader2;
            this.L$1 = customerInfo;
            this.label = 1;
            Object objAwait = this.$paymentMethodMetadata.await(this);
            if (objAwait != coroutine_suspended) {
                defaultPaymentElementLoader = defaultPaymentElementLoader2;
                obj = objAwait;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        customerInfo = (DefaultPaymentElementLoader.CustomerInfo) this.L$1;
        defaultPaymentElementLoader = (DefaultPaymentElementLoader) this.L$0;
        ResultKt.throwOnFailure(obj);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        Object objCreateCustomerState = defaultPaymentElementLoader.createCustomerState(customerInfo, (PaymentMethodMetadata) obj, this.$savedSelection, new PaymentSheetCardBrandFilter(this.$configuration.getCardBrandAcceptance()), this);
        return objCreateCustomerState == coroutine_suspended ? coroutine_suspended : objCreateCustomerState;
    }
}
