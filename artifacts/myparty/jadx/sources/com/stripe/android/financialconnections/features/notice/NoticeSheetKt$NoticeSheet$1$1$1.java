package com.stripe.android.financialconnections.features.notice;

import androidx.compose.ui.platform.UriHandler;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
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

/* compiled from: NoticeSheet.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.financialconnections.features.notice.NoticeSheetKt$NoticeSheet$1$1$1", f = "NoticeSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class NoticeSheetKt$NoticeSheet$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UriHandler $uriHandler;
    final /* synthetic */ NoticeSheetState.ViewEffect $viewEffect;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NoticeSheetKt$NoticeSheet$1$1$1(NoticeSheetState.ViewEffect viewEffect, UriHandler uriHandler, Continuation<? super NoticeSheetKt$NoticeSheet$1$1$1> continuation) {
        super(2, continuation);
        this.$viewEffect = viewEffect;
        this.$uriHandler = uriHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NoticeSheetKt$NoticeSheet$1$1$1(this.$viewEffect, this.$uriHandler, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NoticeSheetKt$NoticeSheet$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        NoticeSheetState.ViewEffect viewEffect = this.$viewEffect;
        if (!(viewEffect instanceof NoticeSheetState.ViewEffect.OpenUrl)) {
            throw new NoWhenBranchMatchedException();
        }
        this.$uriHandler.openUri(((NoticeSheetState.ViewEffect.OpenUrl) viewEffect).getUrl());
        return Unit.INSTANCE;
    }
}
