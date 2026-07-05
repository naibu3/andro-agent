package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbdv;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzfjd implements zzfjc {
    private final ConcurrentHashMap zza;
    private final zzfjj zzb;
    private final zzfjf zzc = new zzfjf();

    public zzfjd(zzfjj zzfjjVar) {
        this.zza = new ConcurrentHashMap(zzfjjVar.zzd);
        this.zzb = zzfjjVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfjj> creator = zzfjj.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgB)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.zzb.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzb());
            int i = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzfjm) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((zzfjb) entry.getValue()).zzb(); i2++) {
                    sb.append("[O]");
                }
                for (int iZzb = ((zzfjb) entry.getValue()).zzb(); iZzb < this.zzb.zzd; iZzb++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzfjb) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i < this.zzb.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            com.google.android.gms.ads.internal.util.client.zzm.zze(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjc
    public final zzfjj zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfjc
    public final synchronized zzfjl zzb(zzfjm zzfjmVar) {
        zzfjl zzfjlVarZze;
        zzfjb zzfjbVar = (zzfjb) this.zza.get(zzfjmVar);
        if (zzfjbVar != null) {
            zzfjlVarZze = zzfjbVar.zze();
            if (zzfjlVarZze == null) {
                this.zzc.zze();
            }
            zzfjz zzfjzVarZzf = zzfjbVar.zzf();
            if (zzfjlVarZze != null) {
                zzbdv.zzb.zzc zzcVarZzd = zzbdv.zzb.zzd();
                zzbdv.zzb.zza.C0017zza c0017zzaZza = zzbdv.zzb.zza.zza();
                c0017zzaZza.zzf(zzbdv.zzb.zzd.IN_MEMORY);
                zzbdv.zzb.zze.zza zzaVarZzc = zzbdv.zzb.zze.zzc();
                zzaVarZzc.zzd(zzfjzVarZzf.zza);
                zzaVarZzc.zze(zzfjzVarZzf.zzb);
                c0017zzaZza.zzg(zzaVarZzc);
                zzcVarZzd.zzd(c0017zzaZza);
                zzfjlVarZze.zza.zzb().zzc().zzi(zzcVarZzd.zzbr());
            }
            zzf();
        } else {
            this.zzc.zzf();
            zzf();
            zzfjlVarZze = null;
        }
        return zzfjlVarZze;
    }

    @Override // com.google.android.gms.internal.ads.zzfjc
    @Deprecated
    public final zzfjm zzc(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, com.google.android.gms.ads.internal.client.zzw zzwVar) {
        return new zzfjn(zzlVar, str, new zzbxy(this.zzb.zza).zza().zzk, this.zzb.zzf, zzwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfjc
    public final synchronized boolean zzd(zzfjm zzfjmVar, zzfjl zzfjlVar) {
        boolean zZzh;
        zzfjb zzfjbVar = (zzfjb) this.zza.get(zzfjmVar);
        zzfjlVar.zzd = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
        if (zzfjbVar == null) {
            zzfjj zzfjjVar = this.zzb;
            zzfjb zzfjbVar2 = new zzfjb(zzfjjVar.zzd, zzfjjVar.zze * 1000);
            if (this.zza.size() == this.zzb.zzc) {
                int i = this.zzb.zzg;
                int i2 = i - 1;
                zzfjm zzfjmVar2 = null;
                if (i == 0) {
                    throw null;
                }
                long jZzc = Long.MAX_VALUE;
                if (i2 == 0) {
                    for (Map.Entry entry : this.zza.entrySet()) {
                        if (((zzfjb) entry.getValue()).zzc() < jZzc) {
                            jZzc = ((zzfjb) entry.getValue()).zzc();
                            zzfjmVar2 = (zzfjm) entry.getKey();
                        }
                    }
                    if (zzfjmVar2 != null) {
                        this.zza.remove(zzfjmVar2);
                    }
                } else if (i2 == 1) {
                    for (Map.Entry entry2 : this.zza.entrySet()) {
                        if (((zzfjb) entry2.getValue()).zzd() < jZzc) {
                            jZzc = ((zzfjb) entry2.getValue()).zzd();
                            zzfjmVar2 = (zzfjm) entry2.getKey();
                        }
                    }
                    if (zzfjmVar2 != null) {
                        this.zza.remove(zzfjmVar2);
                    }
                } else if (i2 == 2) {
                    int iZza = Integer.MAX_VALUE;
                    for (Map.Entry entry3 : this.zza.entrySet()) {
                        if (((zzfjb) entry3.getValue()).zza() < iZza) {
                            iZza = ((zzfjb) entry3.getValue()).zza();
                            zzfjmVar2 = (zzfjm) entry3.getKey();
                        }
                    }
                    if (zzfjmVar2 != null) {
                        this.zza.remove(zzfjmVar2);
                    }
                }
                this.zzc.zzg();
            }
            this.zza.put(zzfjmVar, zzfjbVar2);
            this.zzc.zzd();
            zzfjbVar = zzfjbVar2;
        }
        zZzh = zzfjbVar.zzh(zzfjlVar);
        this.zzc.zzc();
        zzfje zzfjeVarZza = this.zzc.zza();
        zzfjz zzfjzVarZzf = zzfjbVar.zzf();
        if (zzfjlVar != null) {
            zzbdv.zzb.zzc zzcVarZzd = zzbdv.zzb.zzd();
            zzbdv.zzb.zza.C0017zza c0017zzaZza = zzbdv.zzb.zza.zza();
            c0017zzaZza.zzf(zzbdv.zzb.zzd.IN_MEMORY);
            zzbdv.zzb.zzg.zza zzaVarZzc = zzbdv.zzb.zzg.zzc();
            zzaVarZzc.zze(zzfjeVarZza.zza);
            zzaVarZzc.zzf(zzfjeVarZza.zzb);
            zzaVarZzc.zzg(zzfjzVarZzf.zzb);
            c0017zzaZza.zzi(zzaVarZzc);
            zzcVarZzd.zzd(c0017zzaZza);
            zzfjlVar.zza.zzb().zzc().zzj(zzcVarZzd.zzbr());
        }
        zzf();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfjc
    public final synchronized boolean zze(zzfjm zzfjmVar) {
        zzfjb zzfjbVar = (zzfjb) this.zza.get(zzfjmVar);
        if (zzfjbVar == null) {
            return true;
        }
        return zzfjbVar.zzb() < this.zzb.zzd;
    }
}
