package com.stripe.android.paymentsheet;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateIntentCallback.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/CreateIntentResult;", "", "Success", "Failure", "Lcom/stripe/android/paymentsheet/CreateIntentResult$Failure;", "Lcom/stripe/android/paymentsheet/CreateIntentResult$Success;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CreateIntentResult {

    /* compiled from: CreateIntentCallback.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/CreateIntentResult$Success;", "Lcom/stripe/android/paymentsheet/CreateIntentResult;", "clientSecret", "", "<init>", "(Ljava/lang/String;)V", "getClientSecret$paymentsheet_release", "()Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Success implements CreateIntentResult {
        public static final int $stable = 0;
        private final String clientSecret;

        public Success(String clientSecret) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
        }

        /* renamed from: getClientSecret$paymentsheet_release, reason: from getter */
        public final String getClientSecret() {
            return this.clientSecret;
        }
    }

    /* compiled from: CreateIntentCallback.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/paymentsheet/CreateIntentResult$Failure;", "Lcom/stripe/android/paymentsheet/CreateIntentResult;", "cause", "Ljava/lang/Exception;", "Lkotlin/Exception;", "displayMessage", "", "<init>", "(Ljava/lang/Exception;Ljava/lang/String;)V", "getCause$paymentsheet_release", "()Ljava/lang/Exception;", "getDisplayMessage$paymentsheet_release", "()Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Failure implements CreateIntentResult {
        public static final int $stable = 8;
        private final Exception cause;
        private final String displayMessage;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Failure(Exception cause) {
            this(cause, null, 2, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(cause, "cause");
        }

        public Failure(Exception cause, String str) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.cause = cause;
            this.displayMessage = str;
        }

        public /* synthetic */ Failure(Exception exc, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(exc, (i & 2) != 0 ? null : str);
        }

        /* renamed from: getCause$paymentsheet_release, reason: from getter */
        public final Exception getCause() {
            return this.cause;
        }

        /* renamed from: getDisplayMessage$paymentsheet_release, reason: from getter */
        public final String getDisplayMessage() {
            return this.displayMessage;
        }
    }
}
