package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzbn {
    public final Uri zzb;
    public final String zzc;
    public final zzbg zzd;
    public final zzav zze;
    public final List zzf;
    public final String zzg;
    public final zzgbc zzh;

    @Deprecated
    public final List zzi;
    public final Object zzj;
    public final long zzk;
    private static final String zzl = Integer.toString(0, 36);
    private static final String zzm = Integer.toString(1, 36);
    private static final String zzn = Integer.toString(2, 36);
    private static final String zzo = Integer.toString(3, 36);
    private static final String zzp = Integer.toString(4, 36);
    private static final String zzq = Integer.toString(5, 36);
    private static final String zzr = Integer.toString(6, 36);
    private static final String zzs = Integer.toString(7, 36);

    @Deprecated
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzbl
    };

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ zzbn(Uri uri, String str, zzbg zzbgVar, zzav zzavVar, List list, String str2, zzgbc zzgbcVar, Object obj, long j, zzbm zzbmVar) {
        this.zzb = uri;
        int i = zzcg.zza;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzf = list;
        this.zzg = null;
        this.zzh = zzgbcVar;
        zzgaz zzgazVar = new zzgaz();
        if (zzgbcVar.size() > 0) {
            throw null;
        }
        this.zzi = zzgazVar.zzi();
        this.zzj = null;
        this.zzk = -9223372036854775807L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbn)) {
            return false;
        }
        zzbn zzbnVar = (zzbn) obj;
        if (this.zzb.equals(zzbnVar.zzb)) {
            String str = zzbnVar.zzc;
            if (zzgd.zzG(null, null)) {
                zzbg zzbgVar = zzbnVar.zzd;
                if (zzgd.zzG(null, null)) {
                    zzav zzavVar = zzbnVar.zze;
                    if (zzgd.zzG(null, null) && this.zzf.equals(zzbnVar.zzf)) {
                        String str2 = zzbnVar.zzg;
                        if (zzgd.zzG(null, null) && this.zzh.equals(zzbnVar.zzh)) {
                            Object obj2 = zzbnVar.zzj;
                            if (zzgd.zzG(null, null)) {
                                long j = zzbnVar.zzk;
                                if (zzgd.zzG(-9223372036854775807L, -9223372036854775807L)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) (((((((this.zzb.hashCode() * 923521) + this.zzf.hashCode()) * 961) + this.zzh.hashCode()) * 31) * 31) - Long.MAX_VALUE);
    }
}
