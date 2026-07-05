package com.stripe.android.utils;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResultKtx.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aG\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00030\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0005H\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"mapResult", "Lkotlin/Result;", "R", ExifInterface.GPS_DIRECTION_TRUE, ViewProps.TRANSFORM, "Lkotlin/Function1;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "payments-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResultKtxKt {
    public static final <T, R> Object mapResult(Object obj, Function1<? super T, ? extends Result<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(obj);
        if (thM9121exceptionOrNullimpl == null) {
            return transform.invoke(obj).getValue();
        }
        Result.Companion companion = Result.INSTANCE;
        return Result.m9118constructorimpl(ResultKt.createFailure(thM9121exceptionOrNullimpl));
    }
}
