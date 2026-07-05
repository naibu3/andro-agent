package com.stripe.android.googlepaylauncher;

import androidx.core.location.LocationRequestCompat;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GooglePayLauncherViewModel.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel", f = "GooglePayLauncherViewModel.kt", i = {0, 0, 1, 1}, l = {LocationRequestCompat.QUALITY_LOW_POWER, 116}, m = "createPaymentDataRequest-gIAlu-s", n = {"this", CardScanActivity.ARGS, "this", CardScanActivity.ARGS}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes5.dex */
final class GooglePayLauncherViewModel$createPaymentDataRequest$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GooglePayLauncherViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GooglePayLauncherViewModel$createPaymentDataRequest$1(GooglePayLauncherViewModel googlePayLauncherViewModel, Continuation<? super GooglePayLauncherViewModel$createPaymentDataRequest$1> continuation) {
        super(continuation);
        this.this$0 = googlePayLauncherViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7663createPaymentDataRequestgIAlus = this.this$0.m7663createPaymentDataRequestgIAlus(null, this);
        return objM7663createPaymentDataRequestgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM7663createPaymentDataRequestgIAlus : Result.m9117boximpl(objM7663createPaymentDataRequestgIAlus);
    }
}
