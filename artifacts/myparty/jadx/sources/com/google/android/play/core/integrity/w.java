package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes4.dex */
final class w implements aw {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f306a;
    private final com.google.android.play.integrity.internal.bb b;
    private final com.google.android.play.integrity.internal.bb c;
    private final com.google.android.play.integrity.internal.bb d;
    private final com.google.android.play.integrity.internal.bb e;
    private final com.google.android.play.integrity.internal.bb f;

    /* synthetic */ w(Context context, v vVar) {
        com.google.android.play.integrity.internal.ay ayVarB = com.google.android.play.integrity.internal.az.b(context);
        this.f306a = ayVarB;
        com.google.android.play.integrity.internal.bb bbVarB = com.google.android.play.integrity.internal.ax.b(bb.f281a);
        this.b = bbVarB;
        au auVar = new au(ayVarB, n.f302a);
        this.c = auVar;
        com.google.android.play.integrity.internal.bb bbVarB2 = com.google.android.play.integrity.internal.ax.b(new bp(ayVarB, bbVarB, auVar, n.f302a));
        this.d = bbVarB2;
        com.google.android.play.integrity.internal.bb bbVarB3 = com.google.android.play.integrity.internal.ax.b(new bu(bbVarB2));
        this.e = bbVarB3;
        this.f = com.google.android.play.integrity.internal.ax.b(new ba(bbVarB2, bbVarB3));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f.a();
    }
}
