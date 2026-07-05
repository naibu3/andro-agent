package com.stripe.android.customersheet;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.customersheet.CustomerAdapter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomerAdapterResultKtx.kt */
@Metadata(d1 = {"\u0000:\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0000¢\u0006\u0002\u0010\u0003\u001aB\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0002\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00020\u0007H\u0080\fø\u0001\u0000\u001aK\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0002\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u0011H\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u0002H\u00050\u0007H\u0080\bø\u0001\u0000\u001aK\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0002\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u0011H\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u0002H\u00050\u0007H\u0080\bø\u0001\u0000\u001a=\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0002\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0001*\u0002H\u00012\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00050\u0007¢\u0006\u0002\b\u000fH\u0082\b¢\u0006\u0002\u0010\u0010\u001a\u0084\u0001\u0010\u0011\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u0011H\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u0002H\u00050\u000728\u0010\u0013\u001a4\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0016\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u0002H\u00050\u0014H\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u0019\u001aK\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0002\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u0011H\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u0002H\u00050\u0007H\u0080\bø\u0001\u0000\u001ab\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0002\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u000228\u0010\u001a\u001a4\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0016\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u0002H\u00050\u0014H\u0080\bø\u0001\u0000\u001a \u0010\u001b\u001a\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\u001c\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d"}, d2 = {"getOrNull", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/stripe/android/customersheet/CustomerAdapter$Result;", "(Lcom/stripe/android/customersheet/CustomerAdapter$Result;)Ljava/lang/Object;", "flatMap", "R", ViewProps.TRANSFORM, "Lkotlin/Function1;", "map", "Lkotlin/ParameterName;", "name", "value", "mapCatching", "runCatching", "block", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/customersheet/CustomerAdapter$Result;", "fold", "onSuccess", "onFailure", "Lkotlin/Function2;", "", "cause", "", "displayMessage", "(Lcom/stripe/android/customersheet/CustomerAdapter$Result;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "action", "failureOrNull", "Lcom/stripe/android/customersheet/CustomerAdapter$Result$Failure;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CustomerAdapterResultKtxKt {
    public static final <T> T getOrNull(CustomerAdapter.Result<T> result) {
        Intrinsics.checkNotNullParameter(result, "<this>");
        if (result instanceof CustomerAdapter.Result.Failure) {
            return null;
        }
        if (result instanceof CustomerAdapter.Result.Success) {
            return (T) ((CustomerAdapter.Result.Success) result).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <R, T> CustomerAdapter.Result<R> flatMap(CustomerAdapter.Result<T> result, Function1<? super T, ? extends CustomerAdapter.Result<R>> transform) {
        Intrinsics.checkNotNullParameter(result, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (result instanceof CustomerAdapter.Result.Success) {
            return transform.invoke((Object) ((CustomerAdapter.Result.Success) result).getValue());
        }
        if (!(result instanceof CustomerAdapter.Result.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        CustomerAdapter.Result.Failure failure = (CustomerAdapter.Result.Failure) result;
        return CustomerAdapter.Result.INSTANCE.failure(failure.getCause(), failure.getDisplayMessage());
    }

    public static final <R, T> CustomerAdapter.Result<R> map(CustomerAdapter.Result<T> result, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(result, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (result instanceof CustomerAdapter.Result.Success) {
            return CustomerAdapter.Result.INSTANCE.success(transform.invoke((Object) ((CustomerAdapter.Result.Success) result).getValue()));
        }
        if (!(result instanceof CustomerAdapter.Result.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        CustomerAdapter.Result.Failure failure = (CustomerAdapter.Result.Failure) result;
        return CustomerAdapter.Result.INSTANCE.failure(failure.getCause(), failure.getDisplayMessage());
    }

    public static final <R, T> CustomerAdapter.Result<R> mapCatching(CustomerAdapter.Result<T> result, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(result, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (!(result instanceof CustomerAdapter.Result.Success)) {
            if (!(result instanceof CustomerAdapter.Result.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            CustomerAdapter.Result.Failure failure = (CustomerAdapter.Result.Failure) result;
            return CustomerAdapter.Result.INSTANCE.failure(failure.getCause(), failure.getDisplayMessage());
        }
        try {
            return CustomerAdapter.Result.INSTANCE.success(transform.invoke((Object) ((CustomerAdapter.Result.Success) result).getValue()));
        } catch (Throwable th) {
            return CustomerAdapter.Result.INSTANCE.failure(th, null);
        }
    }

    private static final <R, T> CustomerAdapter.Result<R> runCatching(T t, Function1<? super T, ? extends R> function1) {
        try {
            return CustomerAdapter.Result.INSTANCE.success(function1.invoke(t));
        } catch (Throwable th) {
            return CustomerAdapter.Result.INSTANCE.failure(th, null);
        }
    }

    public static final <R, T> R fold(CustomerAdapter.Result<T> result, Function1<? super T, ? extends R> onSuccess, Function2<? super Throwable, ? super String, ? extends R> onFailure) {
        Intrinsics.checkNotNullParameter(result, "<this>");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        if (result instanceof CustomerAdapter.Result.Failure) {
            CustomerAdapter.Result.Failure failure = (CustomerAdapter.Result.Failure) result;
            return onFailure.invoke(failure.getCause(), failure.getDisplayMessage());
        }
        if (!(result instanceof CustomerAdapter.Result.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        return onSuccess.invoke((Object) ((CustomerAdapter.Result.Success) result).getValue());
    }

    public static final <R, T> CustomerAdapter.Result<T> onSuccess(CustomerAdapter.Result<T> result, Function1<? super T, ? extends R> action) {
        Intrinsics.checkNotNullParameter(result, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        if (result instanceof CustomerAdapter.Result.Success) {
            action.invoke((Object) ((CustomerAdapter.Result.Success) result).getValue());
        }
        return result;
    }

    public static final <R, T> CustomerAdapter.Result<T> onFailure(CustomerAdapter.Result<T> result, Function2<? super Throwable, ? super String, ? extends R> action) {
        StripeError stripeError;
        Intrinsics.checkNotNullParameter(result, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        CustomerAdapter.Result.Failure failureFailureOrNull = failureOrNull(result);
        if (failureFailureOrNull != null) {
            String displayMessage = failureFailureOrNull.getDisplayMessage();
            if (displayMessage == null) {
                Throwable cause = failureFailureOrNull.getCause();
                StripeException stripeException = cause instanceof StripeException ? (StripeException) cause : null;
                displayMessage = (stripeException == null || (stripeError = stripeException.getStripeError()) == null) ? null : stripeError.getMessage();
            }
            action.invoke(failureFailureOrNull.getCause(), displayMessage);
        }
        return result;
    }

    public static final <T> CustomerAdapter.Result.Failure<T> failureOrNull(CustomerAdapter.Result<T> result) {
        Intrinsics.checkNotNullParameter(result, "<this>");
        if (result instanceof CustomerAdapter.Result.Failure) {
            return (CustomerAdapter.Result.Failure) result;
        }
        return null;
    }
}
