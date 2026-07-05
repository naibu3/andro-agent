package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdb {
    private static final String zzA;
    private static final String zzB;
    private static final String zzC;
    private static final String zzD;
    private static final String zzE;
    private static final String zzF;

    @Deprecated
    public static final zzn zzb;
    private static final zzbu zzs;
    private static final String zzt;
    private static final String zzu;
    private static final String zzv;
    private static final String zzw;
    private static final String zzx;
    private static final String zzy;
    private static final String zzz;

    @Deprecated
    public Object zzd;
    public long zzf;
    public long zzg;
    public long zzh;
    public boolean zzi;
    public boolean zzj;

    @Deprecated
    public boolean zzk;
    public zzbk zzl;
    public boolean zzm;
    public long zzn;
    public long zzo;
    public int zzp;
    public int zzq;
    public static final Object zza = new Object();
    private static final Object zzr = new Object();
    public Object zzc = zza;
    public zzbu zze = zzs;

    static {
        zzaw zzawVar = new zzaw();
        zzawVar.zza("androidx.media3.common.Timeline");
        zzawVar.zzb(Uri.EMPTY);
        zzs = zzawVar.zzc();
        zzt = Integer.toString(1, 36);
        zzu = Integer.toString(2, 36);
        zzv = Integer.toString(3, 36);
        zzw = Integer.toString(4, 36);
        zzx = Integer.toString(5, 36);
        zzy = Integer.toString(6, 36);
        zzz = Integer.toString(7, 36);
        zzA = Integer.toString(8, 36);
        zzB = Integer.toString(9, 36);
        zzC = Integer.toString(10, 36);
        zzD = Integer.toString(11, 36);
        zzE = Integer.toString(12, 36);
        zzF = Integer.toString(13, 36);
        zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzda
        };
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            zzdb zzdbVar = (zzdb) obj;
            if (zzgd.zzG(this.zzc, zzdbVar.zzc) && zzgd.zzG(this.zze, zzdbVar.zze) && zzgd.zzG(null, null) && zzgd.zzG(this.zzl, zzdbVar.zzl) && this.zzf == zzdbVar.zzf && this.zzg == zzdbVar.zzg && this.zzh == zzdbVar.zzh && this.zzi == zzdbVar.zzi && this.zzj == zzdbVar.zzj && this.zzm == zzdbVar.zzm && this.zzo == zzdbVar.zzo && this.zzp == zzdbVar.zzp && this.zzq == zzdbVar.zzq) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.zzc.hashCode() + 217) * 31) + this.zze.hashCode();
        zzbk zzbkVar = this.zzl;
        int iHashCode2 = ((iHashCode * 961) + (zzbkVar == null ? 0 : zzbkVar.hashCode())) * 31;
        long j = this.zzf;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.zzg;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.zzh;
        int i3 = ((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzj ? 1 : 0)) * 31) + (this.zzm ? 1 : 0);
        long j4 = this.zzo;
        return ((((((i3 * 961) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.zzp) * 31) + this.zzq) * 31;
    }

    public final zzdb zza(Object obj, zzbu zzbuVar, Object obj2, long j, long j2, long j3, boolean z, boolean z2, zzbk zzbkVar, long j4, long j5, int i, int i2, long j6) {
        this.zzc = obj;
        this.zze = zzbuVar == null ? zzs : zzbuVar;
        this.zzd = null;
        this.zzf = -9223372036854775807L;
        this.zzg = -9223372036854775807L;
        this.zzh = -9223372036854775807L;
        this.zzi = z;
        this.zzj = z2;
        this.zzk = zzbkVar != null;
        this.zzl = zzbkVar;
        this.zzn = 0L;
        this.zzo = j5;
        this.zzp = 0;
        this.zzq = 0;
        this.zzm = false;
        return this;
    }

    public final boolean zzb() {
        zzeq.zzf(this.zzk == (this.zzl != null));
        return this.zzl != null;
    }
}
