package com.stripe.android.common.coroutines;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: Single.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a<\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0080@¢\u0006\u0004\b\t\u0010\n\u001a \u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\fH\u0000¨\u0006\r"}, d2 = {"awaitWithTimeout", "Lkotlin/Result;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/stripe/android/common/coroutines/Single;", "timeout", "Lkotlin/time/Duration;", "timeoutMessage", "Lkotlin/Function0;", "", "awaitWithTimeout-dWUq8MI", "(Lcom/stripe/android/common/coroutines/Single;JLkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "asSingle", "Lkotlinx/coroutines/flow/StateFlow;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SingleKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: awaitWithTimeout-dWUq8MI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object m7214awaitWithTimeoutdWUq8MI(Single<T> single, long j, Function0<String> function0, Continuation<? super Result<? extends T>> continuation) {
        SingleKt$awaitWithTimeout$1 singleKt$awaitWithTimeout$1;
        if (continuation instanceof SingleKt$awaitWithTimeout$1) {
            singleKt$awaitWithTimeout$1 = (SingleKt$awaitWithTimeout$1) continuation;
            if ((singleKt$awaitWithTimeout$1.label & Integer.MIN_VALUE) != 0) {
                singleKt$awaitWithTimeout$1.label -= Integer.MIN_VALUE;
            } else {
                singleKt$awaitWithTimeout$1 = new SingleKt$awaitWithTimeout$1(continuation);
            }
        }
        Object objM10637withTimeoutOrNullKLykuaI = singleKt$awaitWithTimeout$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = singleKt$awaitWithTimeout$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objM10637withTimeoutOrNullKLykuaI);
            SingleKt$awaitWithTimeout$result$1 singleKt$awaitWithTimeout$result$1 = new SingleKt$awaitWithTimeout$result$1(single, null);
            singleKt$awaitWithTimeout$1.L$0 = function0;
            singleKt$awaitWithTimeout$1.label = 1;
            objM10637withTimeoutOrNullKLykuaI = TimeoutKt.m10637withTimeoutOrNullKLykuaI(j, singleKt$awaitWithTimeout$result$1, singleKt$awaitWithTimeout$1);
            if (objM10637withTimeoutOrNullKLykuaI == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function0 = (Function0) singleKt$awaitWithTimeout$1.L$0;
            ResultKt.throwOnFailure(objM10637withTimeoutOrNullKLykuaI);
        }
        if (objM10637withTimeoutOrNullKLykuaI != null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m9118constructorimpl(objM10637withTimeoutOrNullKLykuaI);
        }
        Result.Companion companion2 = Result.INSTANCE;
        return Result.m9118constructorimpl(ResultKt.createFailure(new IllegalStateException(function0.invoke())));
    }

    public static final <T> Single<T> asSingle(final StateFlow<? extends T> stateFlow) {
        Intrinsics.checkNotNullParameter(stateFlow, "<this>");
        return new Single() { // from class: com.stripe.android.common.coroutines.SingleKt.asSingle.1
            @Override // com.stripe.android.common.coroutines.Single
            public final Object await(Continuation<? super T> continuation) {
                T value = stateFlow.getValue();
                return value == null ? FlowKt.first(FlowKt.filterNotNull(stateFlow), continuation) : value;
            }
        };
    }
}
