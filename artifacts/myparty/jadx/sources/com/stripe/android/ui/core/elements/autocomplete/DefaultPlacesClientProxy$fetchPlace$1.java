package com.stripe.android.ui.core.elements.autocomplete;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PlacesClientProxy.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.ui.core.elements.autocomplete.DefaultPlacesClientProxy", f = "PlacesClientProxy.kt", i = {0}, l = {143}, m = "fetchPlace-gIAlu-s", n = {"this"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class DefaultPlacesClientProxy$fetchPlace$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultPlacesClientProxy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultPlacesClientProxy$fetchPlace$1(DefaultPlacesClientProxy defaultPlacesClientProxy, Continuation<? super DefaultPlacesClientProxy$fetchPlace$1> continuation) {
        super(continuation);
        this.this$0 = defaultPlacesClientProxy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo8667fetchPlacegIAlus = this.this$0.mo8667fetchPlacegIAlus(null, this);
        return objMo8667fetchPlacegIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo8667fetchPlacegIAlus : Result.m9117boximpl(objMo8667fetchPlacegIAlus);
    }
}
