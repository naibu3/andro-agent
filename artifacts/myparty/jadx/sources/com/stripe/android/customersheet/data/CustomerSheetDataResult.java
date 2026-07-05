package com.stripe.android.customersheet.data;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.GraphResponse;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.login.LoginLogger;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomerSheetDataResult.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000 \t*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0007\b\tJ\u0015\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;", ExifInterface.GPS_DIRECTION_TRUE, "", "toResult", "Lkotlin/Result;", "toResult-d1pmJ48", "()Ljava/lang/Object;", "Success", "Failure", "Companion", "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;", "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface CustomerSheetDataResult<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* renamed from: toResult-d1pmJ48, reason: not valid java name */
    Object mo7270toResultd1pmJ48();

    /* compiled from: CustomerSheetDataResult.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;", "value", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success<T> implements CustomerSheetDataResult<T> {
        public static final int $stable = 0;
        private final T value;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = success.value;
            }
            return success.copy(obj);
        }

        public final T component1() {
            return this.value;
        }

        public final Success<T> copy(T value) {
            return new Success<>(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.value, ((Success) other).value);
        }

        public int hashCode() {
            T t = this.value;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public String toString() {
            return "Success(value=" + this.value + ")";
        }

        public Success(T t) {
            this.value = t;
        }

        public final T getValue() {
            return this.value;
        }

        @Override // com.stripe.android.customersheet.data.CustomerSheetDataResult
        /* renamed from: toResult-d1pmJ48 */
        public Object mo7270toResultd1pmJ48() {
            return DefaultImpls.m7271toResultd1pmJ48(this);
        }
    }

    /* compiled from: CustomerSheetDataResult.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;", "cause", "", "displayMessage", "", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "getCause", "()Ljava/lang/Throwable;", "getDisplayMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Failure<T> implements CustomerSheetDataResult<T> {
        public static final int $stable = 8;
        private final Throwable cause;
        private final String displayMessage;

        public static /* synthetic */ Failure copy$default(Failure failure, Throwable th, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failure.cause;
            }
            if ((i & 2) != 0) {
                str = failure.displayMessage;
            }
            return failure.copy(th, str);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDisplayMessage() {
            return this.displayMessage;
        }

        public final Failure<T> copy(Throwable cause, String displayMessage) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            return new Failure<>(cause, displayMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) other;
            return Intrinsics.areEqual(this.cause, failure.cause) && Intrinsics.areEqual(this.displayMessage, failure.displayMessage);
        }

        public int hashCode() {
            int iHashCode = this.cause.hashCode() * 31;
            String str = this.displayMessage;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Failure(cause=" + this.cause + ", displayMessage=" + this.displayMessage + ")";
        }

        public Failure(Throwable cause, String str) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.cause = cause;
            this.displayMessage = str;
        }

        public /* synthetic */ Failure(Throwable th, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(th, (i & 2) != 0 ? null : str);
        }

        @Override // com.stripe.android.customersheet.data.CustomerSheetDataResult
        /* renamed from: toResult-d1pmJ48 */
        public Object mo7270toResultd1pmJ48() {
            return DefaultImpls.m7271toResultd1pmJ48(this);
        }

        public final Throwable getCause() {
            return this.cause;
        }

        public final String getDisplayMessage() {
            return this.displayMessage;
        }
    }

    /* compiled from: CustomerSheetDataResult.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        /* renamed from: toResult-d1pmJ48, reason: not valid java name */
        public static <T> Object m7271toResultd1pmJ48(CustomerSheetDataResult<T> customerSheetDataResult) {
            if (customerSheetDataResult instanceof Success) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m9118constructorimpl(((Success) customerSheetDataResult).getValue());
            }
            if (!(customerSheetDataResult instanceof Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(((Failure) customerSheetDataResult).getCause()));
        }
    }

    /* compiled from: CustomerSheetDataResult.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u00062\u0006\u0010\u0007\u001a\u0002H\u0006¢\u0006\u0002\u0010\bJ$\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n\"\u0004\b\u0001\u0010\u00062\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Companion;", "", "<init>", "()V", GraphResponse.SUCCESS_KEY, "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;", ExifInterface.GPS_DIRECTION_TRUE, "value", "(Ljava/lang/Object;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;", LoginLogger.EVENT_EXTRAS_FAILURE, "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;", "cause", "", "displayMessage", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final <T> Success<T> success(T value) {
            return new Success<>(value);
        }

        public final <T> Failure<T> failure(Throwable cause, String displayMessage) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            return new Failure<>(cause, displayMessage);
        }
    }
}
