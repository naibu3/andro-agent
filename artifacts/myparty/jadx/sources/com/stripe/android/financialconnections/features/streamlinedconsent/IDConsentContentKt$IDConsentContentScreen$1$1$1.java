package com.stripe.android.financialconnections.features.streamlinedconsent;

import androidx.compose.ui.platform.UriHandler;
import com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: IDConsentContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentKt$IDConsentContentScreen$1$1$1", f = "IDConsentContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class IDConsentContentKt$IDConsentContentScreen$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UriHandler $uriHandler;
    final /* synthetic */ IDConsentContentState.ViewEffect $viewEffect;
    final /* synthetic */ IDConsentContentViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IDConsentContentKt$IDConsentContentScreen$1$1$1(IDConsentContentState.ViewEffect viewEffect, UriHandler uriHandler, IDConsentContentViewModel iDConsentContentViewModel, Continuation<? super IDConsentContentKt$IDConsentContentScreen$1$1$1> continuation) {
        super(2, continuation);
        this.$viewEffect = viewEffect;
        this.$uriHandler = uriHandler;
        this.$viewModel = iDConsentContentViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IDConsentContentKt$IDConsentContentScreen$1$1$1(this.$viewEffect, this.$uriHandler, this.$viewModel, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IDConsentContentKt$IDConsentContentScreen$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        IDConsentContentState.ViewEffect viewEffect = this.$viewEffect;
        if (!(viewEffect instanceof IDConsentContentState.ViewEffect.OpenUrl)) {
            throw new NoWhenBranchMatchedException();
        }
        this.$uriHandler.openUri(((IDConsentContentState.ViewEffect.OpenUrl) viewEffect).getUrl());
        this.$viewModel.onViewEffectLaunched();
        return Unit.INSTANCE;
    }
}
