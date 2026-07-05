package com.stripe.android.core.utils;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResultUtils.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aG\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00030\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0005H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"flatMapCatching", "Lkotlin/Result;", "R", ExifInterface.GPS_DIRECTION_TRUE, ViewProps.TRANSFORM, "Lkotlin/Function1;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "stripe-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ResultUtilsKt {
    public static final <T, R> Object flatMapCatching(Object obj, Function1<? super T, ? extends Result<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (!Result.m9125isSuccessimpl(obj)) {
            return Result.m9118constructorimpl(obj);
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Object value = transform.invoke(obj).getValue();
            ResultKt.throwOnFailure(value);
            return Result.m9118constructorimpl(value);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
    }
}
