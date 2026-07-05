package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzjf implements zzlp {
    private final zzmu zza;
    private final zzje zzb;
    private zzmn zzc;
    private zzlp zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzjf(zzje zzjeVar, zzer zzerVar) {
        this.zzb = zzjeVar;
        this.zza = new zzmu(zzerVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final long zza() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(boolean z) {
        zzcl zzclVarZzc;
        zzmn zzmnVar = this.zzc;
        if (zzmnVar == null || zzmnVar.zzW() || ((z && this.zzc.zzcU() != 2) || (!this.zzc.zzX() && (z || this.zzc.zzQ())))) {
            this.zze = true;
            if (this.zzf) {
                this.zza.zzd();
            }
        } else {
            zzlp zzlpVar = this.zzd;
            zzlpVar.getClass();
            long jZza = zzlpVar.zza();
            if (!this.zze) {
                this.zza.zzb(jZza);
                zzclVarZzc = zzlpVar.zzc();
                if (!zzclVarZzc.equals(this.zza.zzc())) {
                    this.zza.zzg(zzclVarZzc);
                    this.zzb.zza(zzclVarZzc);
                }
            } else if (jZza < this.zza.zza()) {
                this.zza.zze();
            } else {
                this.zze = false;
                if (this.zzf) {
                    this.zza.zzd();
                }
                this.zza.zzb(jZza);
                zzclVarZzc = zzlpVar.zzc();
                if (!zzclVarZzc.equals(this.zza.zzc())) {
                }
            }
        }
        if (this.zze) {
            return this.zza.zza();
        }
        zzlp zzlpVar2 = this.zzd;
        zzlpVar2.getClass();
        return zzlpVar2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final zzcl zzc() {
        zzlp zzlpVar = this.zzd;
        return zzlpVar != null ? zzlpVar.zzc() : this.zza.zzc();
    }

    public final void zzd(zzmn zzmnVar) {
        if (zzmnVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final void zze(zzmn zzmnVar) throws zzjh {
        zzlp zzlpVar;
        zzlp zzlpVarZzk = zzmnVar.zzk();
        if (zzlpVarZzk == null || zzlpVarZzk == (zzlpVar = this.zzd)) {
            return;
        }
        if (zzlpVar != null) {
            throw zzjh.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.zzd = zzlpVarZzk;
        this.zzc = zzmnVar;
        zzlpVarZzk.zzg(this.zza.zzc());
    }

    public final void zzf(long j) {
        this.zza.zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final void zzg(zzcl zzclVar) {
        zzlp zzlpVar = this.zzd;
        if (zzlpVar != null) {
            zzlpVar.zzg(zzclVar);
            zzclVar = this.zzd.zzc();
        }
        this.zza.zzg(zzclVar);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final boolean zzj() {
        if (this.zze) {
            return false;
        }
        zzlp zzlpVar = this.zzd;
        zzlpVar.getClass();
        return zzlpVar.zzj();
    }
}
