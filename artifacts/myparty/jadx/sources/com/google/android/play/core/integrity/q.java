package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes4.dex */
final class q implements x {

    /* renamed from: a, reason: collision with root package name */
    private Context f303a;

    private q() {
        throw null;
    }

    /* synthetic */ q(p pVar) {
    }

    @Override // com.google.android.play.core.integrity.x
    public final s b() {
        com.google.android.play.integrity.internal.ba.a(this.f303a, Context.class);
        return new s(this.f303a, null);
    }

    public final q a(Context context) {
        context.getClass();
        this.f303a = context;
        return this;
    }
}
