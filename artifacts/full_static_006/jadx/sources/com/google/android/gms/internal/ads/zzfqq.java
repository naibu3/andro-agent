package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzfqq extends AsyncTask {
    private zzfqr zza;
    protected final zzfqi zzd;

    public zzfqq(zzfqi zzfqiVar) {
        this.zzd = zzfqiVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzfqr zzfqrVar = this.zza;
        if (zzfqrVar != null) {
            zzfqrVar.zza(this);
        }
    }

    public final void zzb(zzfqr zzfqrVar) {
        this.zza = zzfqrVar;
    }
}
