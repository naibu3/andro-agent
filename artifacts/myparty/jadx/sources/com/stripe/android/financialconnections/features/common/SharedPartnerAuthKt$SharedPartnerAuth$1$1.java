package com.stripe.android.financialconnections.features.common;

import androidx.compose.runtime.State;
import com.stripe.android.financialconnections.presentation.WebAuthFlowState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SharedPartnerAuth.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$SharedPartnerAuth$1$1", f = "SharedPartnerAuth.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class SharedPartnerAuthKt$SharedPartnerAuth$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<WebAuthFlowState, Unit> $onWebAuthFlowFinished;
    final /* synthetic */ State<WebAuthFlowState> $webAuthFlow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SharedPartnerAuthKt$SharedPartnerAuth$1$1(Function1<? super WebAuthFlowState, Unit> function1, State<? extends WebAuthFlowState> state, Continuation<? super SharedPartnerAuthKt$SharedPartnerAuth$1$1> continuation) {
        super(2, continuation);
        this.$onWebAuthFlowFinished = function1;
        this.$webAuthFlow = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SharedPartnerAuthKt$SharedPartnerAuth$1$1(this.$onWebAuthFlowFinished, this.$webAuthFlow, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SharedPartnerAuthKt$SharedPartnerAuth$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$onWebAuthFlowFinished.invoke(this.$webAuthFlow.getValue());
        return Unit.INSTANCE;
    }
}
