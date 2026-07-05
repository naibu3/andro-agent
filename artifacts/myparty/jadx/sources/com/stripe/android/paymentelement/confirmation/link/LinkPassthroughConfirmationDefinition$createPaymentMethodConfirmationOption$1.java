package com.stripe.android.paymentelement.confirmation.link;

import com.facebook.imagepipeline.transcoder.JpegTranscoderUtils;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LinkPassthroughConfirmationDefinition.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentelement.confirmation.link.LinkPassthroughConfirmationDefinition", f = "LinkPassthroughConfirmationDefinition.kt", i = {}, l = {JpegTranscoderUtils.DEFAULT_JPEG_QUALITY}, m = "createPaymentMethodConfirmationOption-gIAlu-s", n = {}, s = {})
/* loaded from: classes5.dex */
final class LinkPassthroughConfirmationDefinition$createPaymentMethodConfirmationOption$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LinkPassthroughConfirmationDefinition this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LinkPassthroughConfirmationDefinition$createPaymentMethodConfirmationOption$1(LinkPassthroughConfirmationDefinition linkPassthroughConfirmationDefinition, Continuation<? super LinkPassthroughConfirmationDefinition$createPaymentMethodConfirmationOption$1> continuation) {
        super(continuation);
        this.this$0 = linkPassthroughConfirmationDefinition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8083createPaymentMethodConfirmationOptiongIAlus = this.this$0.m8083createPaymentMethodConfirmationOptiongIAlus(null, this);
        return objM8083createPaymentMethodConfirmationOptiongIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8083createPaymentMethodConfirmationOptiongIAlus : Result.m9117boximpl(objM8083createPaymentMethodConfirmationOptiongIAlus);
    }
}
