package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzbka {
    private final com.google.android.gms.ads.formats.zzg zza;
    private final com.google.android.gms.ads.formats.zzf zzb;
    private zzbiq zzc;

    public zzbka(com.google.android.gms.ads.formats.zzg zzgVar, com.google.android.gms.ads.formats.zzf zzfVar) {
        this.zza = zzgVar;
        this.zzb = zzfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized zzbiq zzf(zzbip zzbipVar) {
        zzbiq zzbiqVar = this.zzc;
        if (zzbiqVar != null) {
            return zzbiqVar;
        }
        zzbiq zzbiqVar2 = new zzbiq(zzbipVar);
        this.zzc = zzbiqVar2;
        return zzbiqVar2;
    }

    public final zzbiz zzc() {
        zzbjw zzbjwVar = null;
        if (this.zzb == null) {
            return null;
        }
        return new zzbjx(this, zzbjwVar);
    }

    public final zzbjc zzd() {
        return new zzbjz(this, null);
    }
}
