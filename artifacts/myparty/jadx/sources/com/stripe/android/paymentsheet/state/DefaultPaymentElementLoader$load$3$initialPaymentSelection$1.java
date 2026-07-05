package com.stripe.android.paymentsheet.state;

import com.stripe.android.common.model.CommonConfiguration;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SavedSelection;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader$load$3$initialPaymentSelection$1", f = "PaymentElementLoader.kt", i = {}, l = {223, 224, 221}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class DefaultPaymentElementLoader$load$3$initialPaymentSelection$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PaymentSelection>, Object> {
    final /* synthetic */ CommonConfiguration $configuration;
    final /* synthetic */ Deferred<CustomerState> $customer;
    final /* synthetic */ boolean $isGooglePayReady;
    final /* synthetic */ Deferred<PaymentMethodMetadata> $paymentMethodMetadata;
    final /* synthetic */ Deferred<SavedSelection> $savedSelection;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ DefaultPaymentElementLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DefaultPaymentElementLoader$load$3$initialPaymentSelection$1(DefaultPaymentElementLoader defaultPaymentElementLoader, Deferred<? extends SavedSelection> deferred, Deferred<PaymentMethodMetadata> deferred2, Deferred<CustomerState> deferred3, boolean z, CommonConfiguration commonConfiguration, Continuation<? super DefaultPaymentElementLoader$load$3$initialPaymentSelection$1> continuation) {
        super(2, continuation);
        this.this$0 = defaultPaymentElementLoader;
        this.$savedSelection = deferred;
        this.$paymentMethodMetadata = deferred2;
        this.$customer = deferred3;
        this.$isGooglePayReady = z;
        this.$configuration = commonConfiguration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultPaymentElementLoader$load$3$initialPaymentSelection$1(this.this$0, this.$savedSelection, this.$paymentMethodMetadata, this.$customer, this.$isGooglePayReady, this.$configuration, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PaymentSelection> continuation) {
        return ((DefaultPaymentElementLoader$load$3$initialPaymentSelection$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Deferred<SavedSelection> deferred;
        DefaultPaymentElementLoader defaultPaymentElementLoader;
        PaymentMethodMetadata paymentMethodMetadata;
        DefaultPaymentElementLoader defaultPaymentElementLoader2;
        Deferred<SavedSelection> deferred2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DefaultPaymentElementLoader defaultPaymentElementLoader3 = this.this$0;
            deferred = this.$savedSelection;
            this.L$0 = defaultPaymentElementLoader3;
            this.L$1 = deferred;
            this.label = 1;
            Object objAwait = this.$paymentMethodMetadata.await(this);
            if (objAwait != coroutine_suspended) {
                defaultPaymentElementLoader = defaultPaymentElementLoader3;
                obj = objAwait;
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            PaymentMethodMetadata paymentMethodMetadata2 = (PaymentMethodMetadata) this.L$2;
            Deferred<SavedSelection> deferred3 = (Deferred) this.L$1;
            DefaultPaymentElementLoader defaultPaymentElementLoader4 = (DefaultPaymentElementLoader) this.L$0;
            ResultKt.throwOnFailure(obj);
            deferred2 = deferred3;
            defaultPaymentElementLoader2 = defaultPaymentElementLoader4;
            paymentMethodMetadata = paymentMethodMetadata2;
            CustomerState customerState = (CustomerState) obj;
            boolean z = this.$isGooglePayReady;
            PaymentSheet.WalletButtonsConfiguration walletButtons = this.$configuration.getWalletButtons();
            boolean willDisplayExternally = walletButtons == null ? walletButtons.getWillDisplayExternally() : false;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 3;
            Object objRetrieveInitialPaymentSelection = defaultPaymentElementLoader2.retrieveInitialPaymentSelection(deferred2, paymentMethodMetadata, customerState, z, willDisplayExternally, this);
            return objRetrieveInitialPaymentSelection != coroutine_suspended ? coroutine_suspended : objRetrieveInitialPaymentSelection;
        }
        deferred = (Deferred) this.L$1;
        defaultPaymentElementLoader = (DefaultPaymentElementLoader) this.L$0;
        ResultKt.throwOnFailure(obj);
        PaymentMethodMetadata paymentMethodMetadata3 = (PaymentMethodMetadata) obj;
        this.L$0 = defaultPaymentElementLoader;
        this.L$1 = deferred;
        this.L$2 = paymentMethodMetadata3;
        this.label = 2;
        Object objAwait2 = this.$customer.await(this);
        if (objAwait2 != coroutine_suspended) {
            paymentMethodMetadata = paymentMethodMetadata3;
            obj = objAwait2;
            defaultPaymentElementLoader2 = defaultPaymentElementLoader;
            deferred2 = deferred;
            CustomerState customerState2 = (CustomerState) obj;
            boolean z2 = this.$isGooglePayReady;
            PaymentSheet.WalletButtonsConfiguration walletButtons2 = this.$configuration.getWalletButtons();
            if (walletButtons2 == null) {
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 3;
            Object objRetrieveInitialPaymentSelection2 = defaultPaymentElementLoader2.retrieveInitialPaymentSelection(deferred2, paymentMethodMetadata, customerState2, z2, willDisplayExternally, this);
            if (objRetrieveInitialPaymentSelection2 != coroutine_suspended) {
            }
        }
    }
}
