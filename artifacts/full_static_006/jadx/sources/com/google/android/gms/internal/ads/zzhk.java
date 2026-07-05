package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzhk implements zzha {
    private zzie zzb;
    private String zzc;
    private boolean zzf;
    private final zzhy zza = new zzhy();
    private int zzd = 8000;
    private int zze = 8000;

    public final zzhk zzb(boolean z) {
        this.zzf = true;
        return this;
    }

    public final zzhk zzc(int i) {
        this.zzd = i;
        return this;
    }

    public final zzhk zzd(int i) {
        this.zze = i;
        return this;
    }

    public final zzhk zze(zzie zzieVar) {
        this.zzb = zzieVar;
        return this;
    }

    public final zzhk zzf(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzha
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzhp zza() {
        zzhp zzhpVar = new zzhp(this.zzc, this.zzd, this.zze, this.zzf, this.zza);
        zzie zzieVar = this.zzb;
        if (zzieVar != null) {
            zzhpVar.zzf(zzieVar);
        }
        return zzhpVar;
    }
}
