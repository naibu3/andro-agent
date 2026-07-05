package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzpd implements zzph {
    public static final zzfyw zza = new zzfyw() { // from class: com.google.android.gms.internal.ads.zzpb
        @Override // com.google.android.gms.internal.ads.zzfyw
        public final Object zza() {
            return zzpd.zzn();
        }
    };
    private static final Random zzb = new Random();
    private final zzdb zzc;
    private final zzcz zzd;
    private final HashMap zze;
    private final zzfyw zzf;
    private zzpg zzg;
    private zzdc zzh;
    private String zzi;
    private long zzj;

    public zzpd() {
        throw null;
    }

    public zzpd(zzfyw zzfywVar) {
        this.zzf = zzfywVar;
        this.zzc = new zzdb();
        this.zzd = new zzcz();
        this.zze = new HashMap();
        this.zzh = zzdc.zza;
        this.zzj = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzl() {
        zzpc zzpcVar = (zzpc) this.zze.get(this.zzi);
        return (zzpcVar == null || zzpcVar.zzd == -1) ? this.zzj + 1 : zzpcVar.zzd;
    }

    private final zzpc zzm(int i, zzvo zzvoVar) {
        long j = Long.MAX_VALUE;
        zzpc zzpcVar = null;
        for (zzpc zzpcVar2 : this.zze.values()) {
            zzpcVar2.zzg(i, zzvoVar);
            if (zzpcVar2.zzj(i, zzvoVar)) {
                long j2 = zzpcVar2.zzd;
                if (j2 == -1 || j2 < j) {
                    zzpcVar = zzpcVar2;
                    j = j2;
                } else if (j2 == j) {
                    int i2 = zzgd.zza;
                    if (zzpcVar.zze != null && zzpcVar2.zze != null) {
                        zzpcVar = zzpcVar2;
                    }
                }
            }
        }
        if (zzpcVar != null) {
            return zzpcVar;
        }
        String strZzn = zzn();
        zzpc zzpcVar3 = new zzpc(this, strZzn, i, zzvoVar);
        this.zze.put(strZzn, zzpcVar3);
        return zzpcVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzn() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void zzo(zzpc zzpcVar) {
        if (zzpcVar.zzd != -1) {
            this.zzj = zzpcVar.zzd;
        }
        this.zzi = null;
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private final void zzp(zzmy zzmyVar) {
        if (zzmyVar.zzb.zzo()) {
            String str = this.zzi;
            if (str != null) {
                zzpc zzpcVar = (zzpc) this.zze.get(str);
                zzpcVar.getClass();
                zzo(zzpcVar);
                return;
            }
            return;
        }
        zzpc zzpcVar2 = (zzpc) this.zze.get(this.zzi);
        zzpc zzpcVarZzm = zzm(zzmyVar.zzc, zzmyVar.zzd);
        this.zzi = zzpcVarZzm.zzb;
        zzi(zzmyVar);
        zzvo zzvoVar = zzmyVar.zzd;
        if (zzvoVar == null || !zzvoVar.zzb()) {
            return;
        }
        if (zzpcVar2 != null) {
            if (zzpcVar2.zzd == zzvoVar.zzd && zzpcVar2.zze != null && zzpcVar2.zze.zzb == zzmyVar.zzd.zzb && zzpcVar2.zze.zzc == zzmyVar.zzd.zzc) {
                return;
            }
        }
        zzvo zzvoVar2 = zzmyVar.zzd;
        String unused = zzm(zzmyVar.zzc, new zzvo(zzvoVar2.zza, zzvoVar2.zzd)).zzb;
        String unused2 = zzpcVarZzm.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzph
    public final synchronized String zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzph
    public final synchronized String zzf(zzdc zzdcVar, zzvo zzvoVar) {
        return zzm(zzdcVar.zzn(zzvoVar.zza, this.zzd).zzd, zzvoVar).zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzph
    public final synchronized void zzg(zzmy zzmyVar) {
        zzpg zzpgVar;
        String str = this.zzi;
        if (str != null) {
            zzpc zzpcVar = (zzpc) this.zze.get(str);
            if (zzpcVar == null) {
                throw null;
            }
            zzo(zzpcVar);
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzpc zzpcVar2 = (zzpc) it.next();
            it.remove();
            if (zzpcVar2.zzf && (zzpgVar = this.zzg) != null) {
                zzpgVar.zzd(zzmyVar, zzpcVar2.zzb, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzph
    public final void zzh(zzpg zzpgVar) {
        this.zzg = zzpgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b A[Catch: all -> 0x00c7, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:18:0x003b, B:20:0x0047, B:21:0x004d, B:23:0x0052, B:25:0x0058, B:27:0x006f, B:28:0x0097, B:30:0x009d, B:31:0x00a3, B:33:0x00af, B:35:0x00b5, B:41:0x00c6), top: B:45:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzph
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzi(zzmy zzmyVar) {
        zzpc zzpcVar;
        if (this.zzg == null) {
            throw null;
        }
        if (!zzmyVar.zzb.zzo()) {
            zzvo zzvoVar = zzmyVar.zzd;
            if (zzvoVar != null) {
                if (zzvoVar.zzd >= zzl() && ((zzpcVar = (zzpc) this.zze.get(this.zzi)) == null || zzpcVar.zzd != -1 || zzpcVar.zzc == zzmyVar.zzc)) {
                    zzpc zzpcVarZzm = zzm(zzmyVar.zzc, zzmyVar.zzd);
                    if (this.zzi == null) {
                        this.zzi = zzpcVarZzm.zzb;
                    }
                    zzvo zzvoVar2 = zzmyVar.zzd;
                    if (zzvoVar2 != null && zzvoVar2.zzb()) {
                        zzpc zzpcVarZzm2 = zzm(zzmyVar.zzc, new zzvo(zzvoVar2.zza, zzvoVar2.zzd, zzvoVar2.zzb));
                        if (!zzpcVarZzm2.zzf) {
                            zzpcVarZzm2.zzf = true;
                            zzmyVar.zzb.zzn(zzmyVar.zzd.zza, this.zzd);
                            this.zzd.zzi(zzmyVar.zzd.zzb);
                            Math.max(0L, zzgd.zzu(0L) + zzgd.zzu(0L));
                            String unused = zzpcVarZzm2.zzb;
                        }
                    }
                    if (!zzpcVarZzm.zzf) {
                        zzpcVarZzm.zzf = true;
                        String unused2 = zzpcVarZzm.zzb;
                    }
                    if (zzpcVarZzm.zzb.equals(this.zzi) && !zzpcVarZzm.zzg) {
                        zzpcVarZzm.zzg = true;
                        this.zzg.zzc(zzmyVar, zzpcVarZzm.zzb);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzph
    public final synchronized void zzj(zzmy zzmyVar, int i) {
        if (this.zzg == null) {
            throw null;
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzpc zzpcVar = (zzpc) it.next();
            if (zzpcVar.zzk(zzmyVar)) {
                it.remove();
                if (zzpcVar.zzf) {
                    boolean zEquals = zzpcVar.zzb.equals(this.zzi);
                    boolean z = false;
                    if (i == 0 && zEquals && zzpcVar.zzg) {
                        z = true;
                    }
                    if (zEquals) {
                        zzo(zzpcVar);
                    }
                    this.zzg.zzd(zzmyVar, zzpcVar.zzb, z);
                }
            }
        }
        zzp(zzmyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzph
    public final synchronized void zzk(zzmy zzmyVar) {
        if (this.zzg == null) {
            throw null;
        }
        zzdc zzdcVar = this.zzh;
        this.zzh = zzmyVar.zzb;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzpc zzpcVar = (zzpc) it.next();
            if (!zzpcVar.zzl(zzdcVar, this.zzh) || zzpcVar.zzk(zzmyVar)) {
                it.remove();
                if (zzpcVar.zzf) {
                    if (zzpcVar.zzb.equals(this.zzi)) {
                        zzo(zzpcVar);
                    }
                    this.zzg.zzd(zzmyVar, zzpcVar.zzb, false);
                }
            }
        }
        zzp(zzmyVar);
    }
}
