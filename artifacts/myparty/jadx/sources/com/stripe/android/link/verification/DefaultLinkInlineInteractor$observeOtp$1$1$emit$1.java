package com.stripe.android.link.verification;

import com.stripe.android.link.verification.DefaultLinkInlineInteractor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DefaultLinkInlineInteractor.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.link.verification.DefaultLinkInlineInteractor$observeOtp$1$1", f = "DefaultLinkInlineInteractor.kt", i = {0, 0}, l = {92}, m = "emit", n = {"this", "verificationState"}, s = {"L$0", "L$1"})
/* loaded from: classes5.dex */
final class DefaultLinkInlineInteractor$observeOtp$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultLinkInlineInteractor.AnonymousClass1.C01851<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DefaultLinkInlineInteractor$observeOtp$1$1$emit$1(DefaultLinkInlineInteractor.AnonymousClass1.C01851<? super T> c01851, Continuation<? super DefaultLinkInlineInteractor$observeOtp$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = c01851;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((String) null, (Continuation<? super Unit>) this);
    }
}
