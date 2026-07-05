package com.stripe.android.paymentelement.confirmation.intent;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: IntentConfirmationInterceptor.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentelement.confirmation.intent.DefaultIntentConfirmationInterceptor", f = "IntentConfirmationInterceptor.kt", i = {}, l = {TypedValues.CycleType.TYPE_WAVE_PHASE}, m = "createPaymentMethod-gIAlu-s", n = {}, s = {})
/* loaded from: classes5.dex */
final class DefaultIntentConfirmationInterceptor$createPaymentMethod$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultIntentConfirmationInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultIntentConfirmationInterceptor$createPaymentMethod$1(DefaultIntentConfirmationInterceptor defaultIntentConfirmationInterceptor, Continuation<? super DefaultIntentConfirmationInterceptor$createPaymentMethod$1> continuation) {
        super(continuation);
        this.this$0 = defaultIntentConfirmationInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8079createPaymentMethodgIAlus = this.this$0.m8079createPaymentMethodgIAlus(null, this);
        return objM8079createPaymentMethodgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8079createPaymentMethodgIAlus : Result.m9117boximpl(objM8079createPaymentMethodgIAlus);
    }
}
