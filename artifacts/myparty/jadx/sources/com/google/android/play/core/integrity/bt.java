package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes4.dex */
final class bt {

    /* renamed from: a, reason: collision with root package name */
    private final bn f293a;

    bt(bn bnVar) {
        this.f293a = bnVar;
    }

    final /* synthetic */ Task a(long j, long j2, int i, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
        return this.f293a.d(standardIntegrityTokenRequest, j, j2, 0);
    }
}
