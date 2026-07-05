package com.stripe.android.uicore.image;

import com.facebook.soloader.Elf64;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StripeImageLoader.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.uicore.image.StripeImageLoader", f = "StripeImageLoader.kt", i = {}, l = {Elf64.Ehdr.E_SHENTSIZE}, m = "load-gIAlu-s", n = {}, s = {})
/* loaded from: classes6.dex */
final class StripeImageLoader$load$3 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripeImageLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StripeImageLoader$load$3(StripeImageLoader stripeImageLoader, Continuation<? super StripeImageLoader$load$3> continuation) {
        super(continuation);
        this.this$0 = stripeImageLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8887loadgIAlus = this.this$0.m8887loadgIAlus(null, this);
        return objM8887loadgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8887loadgIAlus : Result.m9117boximpl(objM8887loadgIAlus);
    }
}
