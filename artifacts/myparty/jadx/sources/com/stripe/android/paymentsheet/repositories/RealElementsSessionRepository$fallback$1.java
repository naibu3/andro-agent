package com.stripe.android.paymentsheet.repositories;

import com.facebook.imagepipeline.transcoder.JpegTranscoderUtils;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ElementsSessionRepository.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.repositories.RealElementsSessionRepository", f = "ElementsSessionRepository.kt", i = {}, l = {JpegTranscoderUtils.DEFAULT_JPEG_QUALITY}, m = "fallback-0E7RQCE", n = {}, s = {})
/* loaded from: classes6.dex */
final class RealElementsSessionRepository$fallback$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RealElementsSessionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealElementsSessionRepository$fallback$1(RealElementsSessionRepository realElementsSessionRepository, Continuation<? super RealElementsSessionRepository$fallback$1> continuation) {
        super(continuation);
        this.this$0 = realElementsSessionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8422fallback0E7RQCE = this.this$0.m8422fallback0E7RQCE(null, null, this);
        return objM8422fallback0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8422fallback0E7RQCE : Result.m9117boximpl(objM8422fallback0E7RQCE);
    }
}
