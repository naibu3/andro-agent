package com.stripe.android.financialconnections.presentation;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Async.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0004\t\n\u000b\fB\u0013\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0002\u0010\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00018\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/financialconnections/presentation/Async;", ExifInterface.GPS_DIRECTION_TRUE, "", "value", "<init>", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "invoke", "()Ljava/lang/Object;", "Uninitialized", "Loading", "Success", "Fail", "Lcom/stripe/android/financialconnections/presentation/Async$Fail;", "Lcom/stripe/android/financialconnections/presentation/Async$Loading;", "Lcom/stripe/android/financialconnections/presentation/Async$Success;", "Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class Async<T> {
    public static final int $stable = 0;
    private final T value;

    public /* synthetic */ Async(Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj);
    }

    private Async(T t) {
        this.value = t;
    }

    /* compiled from: Async.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\nHÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, d2 = {"Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;", "Lcom/stripe/android/financialconnections/presentation/Async;", "", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Uninitialized extends Async {
        public static final int $stable = 0;
        public static final Uninitialized INSTANCE = new Uninitialized();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Uninitialized)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1877812804;
        }

        public String toString() {
            return "Uninitialized";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private Uninitialized() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            super(defaultConstructorMarker, defaultConstructorMarker);
        }
    }

    /* compiled from: Async.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00018\u0001HÆ\u0003¢\u0006\u0002\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/financialconnections/presentation/Async$Loading;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/stripe/android/financialconnections/presentation/Async;", "value", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/stripe/android/financialconnections/presentation/Async$Loading;", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Loading<T> extends Async<T> {
        public static final int $stable = 0;
        private final T value;

        /* JADX WARN: Illegal instructions before constructor call */
        public Loading() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            this(defaultConstructorMarker, 1, defaultConstructorMarker);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loading copy$default(Loading loading, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = loading.value;
            }
            return loading.copy(obj);
        }

        public final T component1() {
            return this.value;
        }

        public final Loading<T> copy(T value) {
            return new Loading<>(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && Intrinsics.areEqual(this.value, ((Loading) other).value);
        }

        public int hashCode() {
            T t = this.value;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public String toString() {
            return "Loading(value=" + this.value + ")";
        }

        public Loading(T t) {
            super(t, null);
            this.value = t;
        }

        public /* synthetic */ Loading(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : obj);
        }

        public final T getValue() {
            return this.value;
        }
    }

    /* compiled from: Async.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0007\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00028\u0001HÂ\u0003¢\u0006\u0002\u0010\bJ\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0010\u0010\u0003\u001a\u00028\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/financialconnections/presentation/Async$Success;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/stripe/android/financialconnections/presentation/Async;", "value", "<init>", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "invoke", "()Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/stripe/android/financialconnections/presentation/Async$Success;", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success<T> extends Async<T> {
        public static final int $stable = 0;
        private final T value;

        private final T component1() {
            return this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = success.value;
            }
            return success.copy(obj);
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
            super(t, null);
            this.value = t;
        }

        @Override // com.stripe.android.financialconnections.presentation.Async
        public T invoke() {
            return this.value;
        }
    }

    /* compiled from: Async.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/financialconnections/presentation/Async$Fail;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/stripe/android/financialconnections/presentation/Async;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Fail<T> extends Async<T> {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ Fail copy$default(Fail fail, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = fail.error;
            }
            return fail.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final Fail<T> copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Fail<>(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Fail) && Intrinsics.areEqual(this.error, ((Fail) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Fail(error=" + this.error + ")";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Fail(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            DefaultConstructorMarker defaultConstructorMarker = null;
            super(defaultConstructorMarker, defaultConstructorMarker);
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }

    public T invoke() {
        return this.value;
    }
}
