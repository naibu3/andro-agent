package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzhdi implements zzhdz {
    private final zzhde zza;
    private final zzheq zzb;
    private final boolean zzc;
    private final zzhaz zzd;

    private zzhdi(zzheq zzheqVar, zzhaz zzhazVar, zzhde zzhdeVar) {
        this.zzb = zzheqVar;
        this.zzc = zzhazVar.zzj(zzhdeVar);
        this.zzd = zzhazVar;
        this.zza = zzhdeVar;
    }

    static zzhdi zzc(zzheq zzheqVar, zzhaz zzhazVar, zzhde zzhdeVar) {
        return new zzhdi(zzheqVar, zzhazVar, zzhdeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final int zza(Object obj) {
        zzheq zzheqVar = this.zzb;
        int iZzb = zzheqVar.zzb(zzheqVar.zzd(obj));
        return this.zzc ? iZzb + this.zzd.zzb(obj).zzd() : iZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final int zzb(Object obj) {
        int iHashCode = this.zzb.zzd(obj).hashCode();
        return this.zzc ? (iHashCode * 53) + this.zzd.zzb(obj).zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final Object zze() {
        zzhde zzhdeVar = this.zza;
        return zzhdeVar instanceof zzhbo ? ((zzhbo) zzhdeVar).zzbj() : zzhdeVar.zzcY().zzbs();
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zzf(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final void zzg(Object obj, Object obj2) {
        zzheb.zzr(this.zzb, obj, obj2);
        if (this.zzc) {
            zzheb.zzq(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final void zzh(Object obj, zzhdr zzhdrVar, zzhay zzhayVar) throws IOException {
        boolean zZzQ;
        zzheq zzheqVar = this.zzb;
        Object objZzc = zzheqVar.zzc(obj);
        zzhaz zzhazVar = this.zzd;
        zzhbd zzhbdVarZzc = zzhazVar.zzc(obj);
        while (zzhdrVar.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = zzhdrVar.zzd();
                if (iZzd != 11) {
                    if ((iZzd & 7) == 2) {
                        Object objZzd = zzhazVar.zzd(zzhayVar, this.zza, iZzd >>> 3);
                        if (objZzd != null) {
                            zzhazVar.zzg(zzhdrVar, objZzd, zzhayVar, zzhbdVarZzc);
                        } else {
                            zZzQ = zzheqVar.zzr(objZzc, zzhdrVar);
                        }
                    } else {
                        zZzQ = zzhdrVar.zzQ();
                    }
                    if (!zZzQ) {
                        break;
                    }
                } else {
                    Object objZzd2 = null;
                    int iZzj = 0;
                    zzhac zzhacVarZzp = null;
                    while (zzhdrVar.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = zzhdrVar.zzd();
                        if (iZzd2 == 16) {
                            iZzj = zzhdrVar.zzj();
                            objZzd2 = zzhazVar.zzd(zzhayVar, this.zza, iZzj);
                        } else if (iZzd2 == 26) {
                            if (objZzd2 != null) {
                                zzhazVar.zzg(zzhdrVar, objZzd2, zzhayVar, zzhbdVarZzc);
                            } else {
                                zzhacVarZzp = zzhdrVar.zzp();
                            }
                        } else if (!zzhdrVar.zzQ()) {
                            break;
                        }
                    }
                    if (zzhdrVar.zzd() != 12) {
                        throw zzhcd.zzb();
                    }
                    if (zzhacVarZzp != null) {
                        if (objZzd2 != null) {
                            zzhazVar.zzh(zzhacVarZzp, objZzd2, zzhayVar, zzhbdVarZzc);
                        } else {
                            zzheqVar.zzk(objZzc, iZzj, zzhacVarZzp);
                        }
                    }
                }
            } finally {
                zzheqVar.zzn(obj, objZzc);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgzn zzgznVar) throws IOException {
        zzhbo zzhboVar = (zzhbo) obj;
        if (zzhboVar.zzt == zzher.zzc()) {
            zzhboVar.zzt = zzher.zzf();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final void zzj(Object obj, zzhfi zzhfiVar) throws IOException {
        Iterator itZzg = this.zzd.zzb(obj).zzg();
        while (itZzg.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzg.next();
            zzhbc zzhbcVar = (zzhbc) entry.getKey();
            if (zzhbcVar.zze() != zzhfh.MESSAGE || zzhbcVar.zzg() || zzhbcVar.zzf()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof zzhch) {
                zzhfiVar.zzw(zzhbcVar.zza(), ((zzhch) entry).zza().zzb());
            } else {
                zzhfiVar.zzw(zzhbcVar.zza(), entry.getValue());
            }
        }
        zzheq zzheqVar = this.zzb;
        zzheqVar.zzp(zzheqVar.zzd(obj), zzhfiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final boolean zzk(Object obj, Object obj2) {
        zzheq zzheqVar = this.zzb;
        if (!zzheqVar.zzd(obj).equals(zzheqVar.zzd(obj2))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zzb(obj).equals(this.zzd.zzb(obj2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final boolean zzl(Object obj) {
        return this.zzd.zzb(obj).zzl();
    }
}
