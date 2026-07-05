package com.stripe.android.customersheet.data;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.customersheet.CustomerAdapter;
import com.stripe.android.customersheet.data.CustomerSheetDataResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomerSheetDataResultKtx.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0000\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0005\u001aK\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0001\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012!\u0010\b\u001a\u001d\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00070\tH\u0080\bø\u0001\u0000\u001aK\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0001\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012!\u0010\b\u001a\u001d\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00070\tH\u0080\bø\u0001\u0000\u001aK\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00070\tH\u0080\bø\u0001\u0000\u001ab\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000128\u0010\u000f\u001a4\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u0002H\u00070\u0011H\u0080\bø\u0001\u0000\u001a\u0084\u0001\u0010\u0016\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00070\t28\u0010\u0010\u001a4\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u0002H\u00070\u0011H\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u0017\u001a \u0010\u0018\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0019\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0000\u001a=\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0001\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u0002*\u0002H\u00022\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00070\t¢\u0006\u0002\b\u001cH\u0082\b¢\u0006\u0002\u0010\u001d\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001e"}, d2 = {"toCustomerSheetDataResult", "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/stripe/android/customersheet/CustomerAdapter$Result;", "Lkotlin/Result;", "(Ljava/lang/Object;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;", "map", "R", ViewProps.TRANSFORM, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "value", "mapCatching", "onSuccess", "action", "onFailure", "Lkotlin/Function2;", "", "cause", "", "displayMessage", "fold", "(Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "failureOrNull", "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;", "runCatching", "block", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CustomerSheetDataResultKtxKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> CustomerSheetDataResult<T> toCustomerSheetDataResult(CustomerAdapter.Result<T> result) {
        Intrinsics.checkNotNullParameter(result, "<this>");
        if (result instanceof CustomerAdapter.Result.Success) {
            return CustomerSheetDataResult.INSTANCE.success(((CustomerAdapter.Result.Success) result).getValue());
        }
        if (!(result instanceof CustomerAdapter.Result.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        CustomerAdapter.Result.Failure failure = (CustomerAdapter.Result.Failure) result;
        return CustomerSheetDataResult.INSTANCE.failure(failure.getCause(), failure.getDisplayMessage());
    }

    public static final <T> CustomerSheetDataResult<T> toCustomerSheetDataResult(Object obj) {
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(obj);
        if (thM9121exceptionOrNullimpl == null) {
            return CustomerSheetDataResult.INSTANCE.success(obj);
        }
        return CustomerSheetDataResult.INSTANCE.failure(thM9121exceptionOrNullimpl, null);
    }

    public static final <R, T> CustomerSheetDataResult<R> map(CustomerSheetDataResult<T> customerSheetDataResult, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(customerSheetDataResult, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (customerSheetDataResult instanceof CustomerSheetDataResult.Success) {
            return CustomerSheetDataResult.INSTANCE.success(transform.invoke((Object) ((CustomerSheetDataResult.Success) customerSheetDataResult).getValue()));
        }
        if (!(customerSheetDataResult instanceof CustomerSheetDataResult.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        CustomerSheetDataResult.Failure failure = (CustomerSheetDataResult.Failure) customerSheetDataResult;
        return CustomerSheetDataResult.INSTANCE.failure(failure.getCause(), failure.getDisplayMessage());
    }

    public static final <R, T> CustomerSheetDataResult<R> mapCatching(CustomerSheetDataResult<T> customerSheetDataResult, Function1<? super T, ? extends R> transform) {
        Object objM9118constructorimpl;
        Intrinsics.checkNotNullParameter(customerSheetDataResult, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (!(customerSheetDataResult instanceof CustomerSheetDataResult.Success)) {
            if (!(customerSheetDataResult instanceof CustomerSheetDataResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            CustomerSheetDataResult.Failure failure = (CustomerSheetDataResult.Failure) customerSheetDataResult;
            return CustomerSheetDataResult.INSTANCE.failure(failure.getCause(), failure.getDisplayMessage());
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(CustomerSheetDataResult.INSTANCE.success(transform.invoke((Object) ((CustomerSheetDataResult.Success) customerSheetDataResult).getValue())));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl == null) {
            return (CustomerSheetDataResult.Success) objM9118constructorimpl;
        }
        return CustomerSheetDataResult.INSTANCE.failure(thM9121exceptionOrNullimpl, null);
    }

    public static final <R, T> CustomerSheetDataResult<T> onSuccess(CustomerSheetDataResult<T> customerSheetDataResult, Function1<? super T, ? extends R> action) {
        Intrinsics.checkNotNullParameter(customerSheetDataResult, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        if (customerSheetDataResult instanceof CustomerSheetDataResult.Success) {
            action.invoke((Object) ((CustomerSheetDataResult.Success) customerSheetDataResult).getValue());
        }
        return customerSheetDataResult;
    }

    public static final <R, T> CustomerSheetDataResult<T> onFailure(CustomerSheetDataResult<T> customerSheetDataResult, Function2<? super Throwable, ? super String, ? extends R> action) {
        StripeError stripeError;
        Intrinsics.checkNotNullParameter(customerSheetDataResult, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        CustomerSheetDataResult.Failure failureFailureOrNull = failureOrNull(customerSheetDataResult);
        if (failureFailureOrNull != null) {
            String displayMessage = failureFailureOrNull.getDisplayMessage();
            if (displayMessage == null) {
                Throwable cause = failureFailureOrNull.getCause();
                StripeException stripeException = cause instanceof StripeException ? (StripeException) cause : null;
                displayMessage = (stripeException == null || (stripeError = stripeException.getStripeError()) == null) ? null : stripeError.getMessage();
            }
            action.invoke(failureFailureOrNull.getCause(), displayMessage);
        }
        return customerSheetDataResult;
    }

    public static final <R, T> R fold(CustomerSheetDataResult<T> customerSheetDataResult, Function1<? super T, ? extends R> onSuccess, Function2<? super Throwable, ? super String, ? extends R> onFailure) {
        Intrinsics.checkNotNullParameter(customerSheetDataResult, "<this>");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        if (customerSheetDataResult instanceof CustomerSheetDataResult.Failure) {
            CustomerSheetDataResult.Failure failure = (CustomerSheetDataResult.Failure) customerSheetDataResult;
            return onFailure.invoke(failure.getCause(), failure.getDisplayMessage());
        }
        if (!(customerSheetDataResult instanceof CustomerSheetDataResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        return onSuccess.invoke((Object) ((CustomerSheetDataResult.Success) customerSheetDataResult).getValue());
    }

    public static final <T> CustomerSheetDataResult.Failure<T> failureOrNull(CustomerSheetDataResult<T> customerSheetDataResult) {
        Intrinsics.checkNotNullParameter(customerSheetDataResult, "<this>");
        if (customerSheetDataResult instanceof CustomerSheetDataResult.Failure) {
            return (CustomerSheetDataResult.Failure) customerSheetDataResult;
        }
        return null;
    }

    private static final <R, T> CustomerSheetDataResult<R> runCatching(T t, Function1<? super T, ? extends R> function1) {
        Object objM9118constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(CustomerSheetDataResult.INSTANCE.success(function1.invoke(t)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl == null) {
            return (CustomerSheetDataResult.Success) objM9118constructorimpl;
        }
        return CustomerSheetDataResult.INSTANCE.failure(thM9121exceptionOrNullimpl, null);
    }
}
