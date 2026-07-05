package com.stripe.android.link;

import com.facebook.imageutils.TiffUtil;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LinkActivityViewModel.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.link.LinkActivityViewModel", f = "LinkActivityViewModel.kt", i = {0, 1}, l = {TiffUtil.TIFF_TAG_ORIENTATION, 280}, m = "confirmLinkPayment-gIAlu-s", n = {"this", "this"}, s = {"L$0", "L$0"})
/* loaded from: classes5.dex */
final class LinkActivityViewModel$confirmLinkPayment$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LinkActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LinkActivityViewModel$confirmLinkPayment$1(LinkActivityViewModel linkActivityViewModel, Continuation<? super LinkActivityViewModel$confirmLinkPayment$1> continuation) {
        super(continuation);
        this.this$0 = linkActivityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7678confirmLinkPaymentgIAlus = this.this$0.m7678confirmLinkPaymentgIAlus(null, this);
        return objM7678confirmLinkPaymentgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM7678confirmLinkPaymentgIAlus : Result.m9117boximpl(objM7678confirmLinkPaymentgIAlus);
    }
}
