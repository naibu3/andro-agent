package com.stripe.android.financialconnections.exception;

import kotlin.Metadata;

/* compiled from: WebAuthFlowCancelledException.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/financialconnections/exception/WebAuthFlowFailedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "reason", "", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WebAuthFlowFailedException extends Exception {
    public static final int $stable = 0;
    private final String reason;

    public final String getReason() {
        return this.reason;
    }

    public WebAuthFlowFailedException(String str, String str2) {
        super(str2 + " " + str);
        this.reason = str;
    }
}
