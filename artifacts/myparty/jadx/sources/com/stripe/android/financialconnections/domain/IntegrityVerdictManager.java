package com.stripe.android.financialconnections.domain;

import kotlin.Metadata;

/* compiled from: IntegrityVerdictManager.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\u0004\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;", "", "<init>", "()V", "verdictFailed", "", "setVerdictFailed", "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IntegrityVerdictManager {
    public static final int $stable = 8;
    private boolean verdictFailed;

    public final void setVerdictFailed() {
        this.verdictFailed = true;
    }

    /* renamed from: verdictFailed, reason: from getter */
    public final boolean getVerdictFailed() {
        return this.verdictFailed;
    }
}
