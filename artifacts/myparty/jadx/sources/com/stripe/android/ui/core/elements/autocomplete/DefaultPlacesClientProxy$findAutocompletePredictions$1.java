package com.stripe.android.ui.core.elements.autocomplete;

import androidx.appcompat.app.AppCompatDelegate;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PlacesClientProxy.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.ui.core.elements.autocomplete.DefaultPlacesClientProxy", f = "PlacesClientProxy.kt", i = {0, 0}, l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR}, m = "findAutocompletePredictions-BWLJW6A", n = {"this", "limit"}, s = {"L$0", "I$0"})
/* loaded from: classes6.dex */
final class DefaultPlacesClientProxy$findAutocompletePredictions$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultPlacesClientProxy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultPlacesClientProxy$findAutocompletePredictions$1(DefaultPlacesClientProxy defaultPlacesClientProxy, Continuation<? super DefaultPlacesClientProxy$findAutocompletePredictions$1> continuation) {
        super(continuation);
        this.this$0 = defaultPlacesClientProxy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo8668findAutocompletePredictionsBWLJW6A = this.this$0.mo8668findAutocompletePredictionsBWLJW6A(null, null, 0, this);
        return objMo8668findAutocompletePredictionsBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo8668findAutocompletePredictionsBWLJW6A : Result.m9117boximpl(objMo8668findAutocompletePredictionsBWLJW6A);
    }
}
