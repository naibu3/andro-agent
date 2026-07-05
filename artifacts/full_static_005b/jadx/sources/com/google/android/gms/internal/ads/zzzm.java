package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzzm {
    private zzzl zza;
    private zzzu zzb;

    public zzmo zze() {
        throw null;
    }

    public void zzj() {
        this.zza = null;
        this.zzb = null;
    }

    public void zzk(zzk zzkVar) {
        throw null;
    }

    public boolean zzn() {
        throw null;
    }

    public abstract zzzn zzp(zzmp[] zzmpVarArr, zzxr zzxrVar, zzvo zzvoVar, zzdc zzdcVar) throws zzjh;

    public abstract void zzq(Object obj);

    protected final zzzu zzr() {
        zzzu zzzuVar = this.zzb;
        zzeq.zzb(zzzuVar);
        return zzzuVar;
    }

    public final void zzs(zzzl zzzlVar, zzzu zzzuVar) {
        this.zza = zzzlVar;
        this.zzb = zzzuVar;
    }

    protected final void zzt() {
        zzzl zzzlVar = this.zza;
        if (zzzlVar != null) {
            zzzlVar.zzj();
        }
    }
}
