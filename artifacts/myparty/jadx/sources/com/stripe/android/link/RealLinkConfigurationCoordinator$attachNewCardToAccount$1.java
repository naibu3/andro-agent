package com.stripe.android.link;

import androidx.appcompat.app.AppCompatDelegate;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LinkConfigurationCoordinator.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.link.RealLinkConfigurationCoordinator", f = "LinkConfigurationCoordinator.kt", i = {0, 0}, l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, 111}, m = "attachNewCardToAccount-0E7RQCE", n = {"configuration", "accountManager"}, s = {"L$0", "L$1"})
/* loaded from: classes5.dex */
final class RealLinkConfigurationCoordinator$attachNewCardToAccount$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RealLinkConfigurationCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealLinkConfigurationCoordinator$attachNewCardToAccount$1(RealLinkConfigurationCoordinator realLinkConfigurationCoordinator, Continuation<? super RealLinkConfigurationCoordinator$attachNewCardToAccount$1> continuation) {
        super(continuation);
        this.this$0 = realLinkConfigurationCoordinator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo7679attachNewCardToAccount0E7RQCE = this.this$0.mo7679attachNewCardToAccount0E7RQCE(null, null, this);
        return objMo7679attachNewCardToAccount0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo7679attachNewCardToAccount0E7RQCE : Result.m9117boximpl(objMo7679attachNewCardToAccount0E7RQCE);
    }
}
