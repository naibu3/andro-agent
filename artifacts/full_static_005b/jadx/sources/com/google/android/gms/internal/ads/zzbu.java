package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzbu {
    public final String zzc;
    public final zzbn zzd;

    @Deprecated
    public final zzbn zze;
    public final zzbk zzf;
    public final zzca zzg;
    public final zzba zzh;

    @Deprecated
    public final zzbc zzi;
    public final zzbq zzj;
    public static final zzbu zza = new zzaw().zzc();
    private static final String zzk = Integer.toString(0, 36);
    private static final String zzl = Integer.toString(1, 36);
    private static final String zzm = Integer.toString(2, 36);
    private static final String zzn = Integer.toString(3, 36);
    private static final String zzo = Integer.toString(4, 36);
    private static final String zzp = Integer.toString(5, 36);

    @Deprecated
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzat
    };

    /* synthetic */ zzbu(String str, zzbc zzbcVar, zzbn zzbnVar, zzbk zzbkVar, zzca zzcaVar, zzbq zzbqVar, zzbt zzbtVar) {
        this.zzc = str;
        this.zzd = zzbnVar;
        this.zze = zzbnVar;
        this.zzf = zzbkVar;
        this.zzg = zzcaVar;
        this.zzh = zzbcVar;
        this.zzi = zzbcVar;
        this.zzj = zzbqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbu)) {
            return false;
        }
        zzbu zzbuVar = (zzbu) obj;
        return zzgd.zzG(this.zzc, zzbuVar.zzc) && this.zzh.equals(zzbuVar.zzh) && zzgd.zzG(this.zzd, zzbuVar.zzd) && zzgd.zzG(this.zzf, zzbuVar.zzf) && zzgd.zzG(this.zzg, zzbuVar.zzg) && zzgd.zzG(this.zzj, zzbuVar.zzj);
    }

    public final int hashCode() {
        int iHashCode = this.zzc.hashCode() * 31;
        zzbn zzbnVar = this.zzd;
        return (((((((iHashCode + (zzbnVar != null ? zzbnVar.hashCode() : 0)) * 31) + this.zzf.hashCode()) * 31) + this.zzh.hashCode()) * 31) + this.zzg.hashCode()) * 31;
    }
}
