package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes4.dex */
final class z {

    /* renamed from: a, reason: collision with root package name */
    private static s f308a;

    static synchronized s a(Context context) {
        if (f308a == null) {
            q qVar = new q(null);
            qVar.a(com.google.android.play.integrity.internal.ag.a(context));
            f308a = qVar.b();
        }
        return f308a;
    }
}
