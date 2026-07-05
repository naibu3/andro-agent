package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes4.dex */
final class u implements av {

    /* renamed from: a, reason: collision with root package name */
    private Context f305a;

    private u() {
        throw null;
    }

    /* synthetic */ u(t tVar) {
    }

    @Override // com.google.android.play.core.integrity.av
    public final aw b() {
        com.google.android.play.integrity.internal.ba.a(this.f305a, Context.class);
        return new w(this.f305a, null);
    }

    public final u a(Context context) {
        context.getClass();
        this.f305a = context;
        return this;
    }
}
