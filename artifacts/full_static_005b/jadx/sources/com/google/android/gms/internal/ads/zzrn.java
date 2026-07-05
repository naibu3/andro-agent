package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzrn {
    private final zzdz[] zza;
    private final zzsh zzb;
    private final zzec zzc;

    public zzrn(zzdz... zzdzVarArr) {
        zzsh zzshVar = new zzsh();
        zzec zzecVar = new zzec();
        zzdz[] zzdzVarArr2 = {zzshVar, zzecVar};
        this.zza = zzdzVarArr2;
        System.arraycopy(zzdzVarArr, 0, zzdzVarArr2, 0, 0);
        this.zzb = zzshVar;
        this.zzc = zzecVar;
    }

    public final long zza(long j) {
        return this.zzc.zzi(j);
    }

    public final long zzb() {
        return this.zzb.zzo();
    }

    public final zzcl zzc(zzcl zzclVar) {
        this.zzc.zzk(zzclVar.zzc);
        this.zzc.zzj(zzclVar.zzd);
        return zzclVar;
    }

    public final boolean zzd(boolean z) {
        this.zzb.zzp(z);
        return z;
    }

    public final zzdz[] zze() {
        return this.zza;
    }
}
