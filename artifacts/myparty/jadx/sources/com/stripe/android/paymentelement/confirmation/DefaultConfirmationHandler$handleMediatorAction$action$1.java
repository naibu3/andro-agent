package com.stripe.android.paymentelement.confirmation;

import com.stripe.android.paymentelement.confirmation.ConfirmationDefinition;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.paymentelement.confirmation.ConfirmationMediator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DefaultConfirmationHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentelement.confirmation.DefaultConfirmationHandler$handleMediatorAction$action$1", f = "DefaultConfirmationHandler.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class DefaultConfirmationHandler$handleMediatorAction$action$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ConfirmationMediator.Action>, Object> {
    final /* synthetic */ ConfirmationHandler.Option $confirmationOption;
    final /* synthetic */ ConfirmationMediator<?, ?, ?, ?> $mediator;
    final /* synthetic */ ConfirmationDefinition.Parameters $parameters;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultConfirmationHandler$handleMediatorAction$action$1(ConfirmationMediator<?, ?, ?, ?> confirmationMediator, ConfirmationHandler.Option option, ConfirmationDefinition.Parameters parameters, Continuation<? super DefaultConfirmationHandler$handleMediatorAction$action$1> continuation) {
        super(2, continuation);
        this.$mediator = confirmationMediator;
        this.$confirmationOption = option;
        this.$parameters = parameters;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultConfirmationHandler$handleMediatorAction$action$1(this.$mediator, this.$confirmationOption, this.$parameters, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ConfirmationMediator.Action> continuation) {
        return ((DefaultConfirmationHandler$handleMediatorAction$action$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Object objAction = this.$mediator.action(this.$confirmationOption, this.$parameters, this);
        return objAction == coroutine_suspended ? coroutine_suspended : objAction;
    }
}
