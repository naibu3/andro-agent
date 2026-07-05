package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzzn {
    public final int zza;
    public final zzmq[] zzb;
    public final zzzg[] zzc;
    public final zzdp zzd;
    public final Object zze;

    public zzzn(zzmq[] zzmqVarArr, zzzg[] zzzgVarArr, zzdp zzdpVar, Object obj) {
        this.zzb = zzmqVarArr;
        this.zzc = (zzzg[]) zzzgVarArr.clone();
        this.zzd = zzdpVar;
        this.zze = obj;
        this.zza = zzmqVarArr.length;
    }

    public final boolean zza(zzzn zzznVar, int i) {
        return zzznVar != null && zzgd.zzG(this.zzb[i], zzznVar.zzb[i]) && zzgd.zzG(this.zzc[i], zzznVar.zzc[i]);
    }

    public final boolean zzb(int i) {
        return this.zzb[i] != null;
    }
}
