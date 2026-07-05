package com.stripe.android.googlepaylauncher;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.PaymentData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GooglePayPaymentMethodLauncherActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/wallet/PaymentData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$onCreate$2$1$1", f = "GooglePayPaymentMethodLauncherActivity.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class GooglePayPaymentMethodLauncherActivity$onCreate$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Task<PaymentData>>, Object> {
    int label;
    final /* synthetic */ GooglePayPaymentMethodLauncherActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GooglePayPaymentMethodLauncherActivity$onCreate$2$1$1(GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity, Continuation<? super GooglePayPaymentMethodLauncherActivity$onCreate$2$1$1> continuation) {
        super(2, continuation);
        this.this$0 = googlePayPaymentMethodLauncherActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GooglePayPaymentMethodLauncherActivity$onCreate$2$1$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Task<PaymentData>> continuation) {
        return ((GooglePayPaymentMethodLauncherActivity$onCreate$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        this.label = 1;
        Object objLoadPaymentData = this.this$0.getViewModel().loadPaymentData(this);
        return objLoadPaymentData == coroutine_suspended ? coroutine_suspended : objLoadPaymentData;
    }
}
