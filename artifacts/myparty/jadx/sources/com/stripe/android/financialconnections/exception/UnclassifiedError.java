package com.stripe.android.financialconnections.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnclassifiedError.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/exception/UnclassifiedError;", "Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;", "name", "", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UnclassifiedError extends FinancialConnectionsError {
    public static final int $stable = 0;

    public /* synthetic */ UnclassifiedError(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnclassifiedError(String name, String str) {
        super(name, null, null, 0, null, str, 30, null);
        Intrinsics.checkNotNullParameter(name, "name");
    }
}
