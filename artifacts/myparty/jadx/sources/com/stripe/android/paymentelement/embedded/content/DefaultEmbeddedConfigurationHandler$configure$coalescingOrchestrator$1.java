package com.stripe.android.paymentelement.embedded.content;

import com.stripe.android.common.model.CommonConfiguration;
import com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedConfigurationHandler;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EmbeddedConfigurationHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedConfigurationHandler$configure$coalescingOrchestrator$1", f = "EmbeddedConfigurationHandler.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class DefaultEmbeddedConfigurationHandler$configure$coalescingOrchestrator$1 extends SuspendLambda implements Function1<Continuation<? super Result<? extends PaymentElementLoader.State>>, Object> {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ PaymentElementLoader.InitializationMode.DeferredIntent $initializationMode;
    final /* synthetic */ PaymentSheet.IntentConfiguration $intentConfiguration;
    final /* synthetic */ CommonConfiguration $targetConfiguration;
    int label;
    final /* synthetic */ DefaultEmbeddedConfigurationHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultEmbeddedConfigurationHandler$configure$coalescingOrchestrator$1(CoroutineScope coroutineScope, DefaultEmbeddedConfigurationHandler defaultEmbeddedConfigurationHandler, PaymentElementLoader.InitializationMode.DeferredIntent deferredIntent, CommonConfiguration commonConfiguration, PaymentSheet.IntentConfiguration intentConfiguration, Continuation<? super DefaultEmbeddedConfigurationHandler$configure$coalescingOrchestrator$1> continuation) {
        super(1, continuation);
        this.$coroutineScope = coroutineScope;
        this.this$0 = defaultEmbeddedConfigurationHandler;
        this.$initializationMode = deferredIntent;
        this.$targetConfiguration = commonConfiguration;
        this.$intentConfiguration = intentConfiguration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DefaultEmbeddedConfigurationHandler$configure$coalescingOrchestrator$1(this.$coroutineScope, this.this$0, this.$initializationMode, this.$targetConfiguration, this.$intentConfiguration, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Result<? extends PaymentElementLoader.State>> continuation) {
        return invoke2((Continuation<? super Result<PaymentElementLoader.State>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super Result<PaymentElementLoader.State>> continuation) {
        return ((DefaultEmbeddedConfigurationHandler$configure$coalescingOrchestrator$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: EmbeddedConfigurationHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedConfigurationHandler$configure$coalescingOrchestrator$1$1", f = "EmbeddedConfigurationHandler.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedConfigurationHandler$configure$coalescingOrchestrator$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends PaymentElementLoader.State>>, Object> {
        final /* synthetic */ PaymentElementLoader.InitializationMode.DeferredIntent $initializationMode;
        final /* synthetic */ PaymentSheet.IntentConfiguration $intentConfiguration;
        final /* synthetic */ CommonConfiguration $targetConfiguration;
        int label;
        final /* synthetic */ DefaultEmbeddedConfigurationHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DefaultEmbeddedConfigurationHandler defaultEmbeddedConfigurationHandler, PaymentElementLoader.InitializationMode.DeferredIntent deferredIntent, CommonConfiguration commonConfiguration, PaymentSheet.IntentConfiguration intentConfiguration, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = defaultEmbeddedConfigurationHandler;
            this.$initializationMode = deferredIntent;
            this.$targetConfiguration = commonConfiguration;
            this.$intentConfiguration = intentConfiguration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$initializationMode, this.$targetConfiguration, this.$intentConfiguration, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends PaymentElementLoader.State>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Result<PaymentElementLoader.State>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<PaymentElementLoader.State>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objMo8425loadBWLJW6A;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objMo8425loadBWLJW6A = this.this$0.paymentElementLoader.mo8425loadBWLJW6A(this.$initializationMode, this.$targetConfiguration, new PaymentElementLoader.Metadata(false, true), this);
                if (objMo8425loadBWLJW6A == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo8425loadBWLJW6A = ((Result) obj).getValue();
            }
            DefaultEmbeddedConfigurationHandler defaultEmbeddedConfigurationHandler = this.this$0;
            PaymentSheet.IntentConfiguration intentConfiguration = this.$intentConfiguration;
            CommonConfiguration commonConfiguration = this.$targetConfiguration;
            if (Result.m9125isSuccessimpl(objMo8425loadBWLJW6A)) {
                defaultEmbeddedConfigurationHandler.setCache(new DefaultEmbeddedConfigurationHandler.ConfigurationCache(new DefaultEmbeddedConfigurationHandler.Arguments(intentConfiguration, commonConfiguration), (PaymentElementLoader.State) objMo8425loadBWLJW6A));
            }
            Result resultM9117boximpl = Result.m9117boximpl(objMo8425loadBWLJW6A);
            DefaultEmbeddedConfigurationHandler defaultEmbeddedConfigurationHandler2 = this.this$0;
            resultM9117boximpl.getValue();
            defaultEmbeddedConfigurationHandler2.inFlightRequest = null;
            return resultM9117boximpl;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        this.label = 1;
        Object objAwait = BuildersKt__Builders_commonKt.async$default(this.$coroutineScope, null, null, new AnonymousClass1(this.this$0, this.$initializationMode, this.$targetConfiguration, this.$intentConfiguration, null), 3, null).await(this);
        return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
    }
}
