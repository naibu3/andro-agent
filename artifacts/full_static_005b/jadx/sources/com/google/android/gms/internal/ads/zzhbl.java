package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzhbl implements zzhbc {
    final zzhbt zza;
    final int zzb;
    final zzhfg zzc;
    final boolean zzd;
    final boolean zze;

    zzhbl(zzhbt zzhbtVar, int i, zzhfg zzhfgVar, boolean z, boolean z2) {
        this.zza = zzhbtVar;
        this.zzb = i;
        this.zzc = zzhfgVar;
        this.zzd = z;
        this.zze = z2;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zzb - ((zzhbl) obj).zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhbc
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhbc
    public final zzhdd zzb(zzhdd zzhddVar, zzhde zzhdeVar) {
        ((zzhbi) zzhddVar).zzbj((zzhbo) zzhdeVar);
        return zzhddVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbc
    public final zzhdj zzc(zzhdj zzhdjVar, zzhdj zzhdjVar2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzhbc
    public final zzhfg zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhbc
    public final zzhfh zze() {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzhbc
    public final boolean zzf() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhbc
    public final boolean zzg() {
        return this.zzd;
    }
}
