package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzoz {
    private final zzcz zza;
    private zzgbc zzb = zzgbc.zzm();
    private zzgbf zzc = zzgbf.zzd();
    private zzvo zzd;
    private zzvo zze;
    private zzvo zzf;

    public zzoz(zzcz zzczVar) {
        this.zza = zzczVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static zzvo zzj(zzct zzctVar, zzgbc zzgbcVar, zzvo zzvoVar, zzcz zzczVar) {
        zzdc zzdcVarZzn = zzctVar.zzn();
        int iZze = zzctVar.zze();
        Object objZzf = zzdcVarZzn.zzo() ? null : zzdcVarZzn.zzf(iZze);
        int iZzc = (zzctVar.zzx() || zzdcVarZzn.zzo()) ? -1 : zzdcVarZzn.zzd(iZze, zzczVar, false).zzc(zzgd.zzr(zzctVar.zzk()));
        for (int i = 0; i < zzgbcVar.size(); i++) {
            zzvo zzvoVar2 = (zzvo) zzgbcVar.get(i);
            if (zzm(zzvoVar2, objZzf, zzctVar.zzx(), zzctVar.zzb(), zzctVar.zzc(), iZzc)) {
                return zzvoVar2;
            }
        }
        if (zzgbcVar.isEmpty() && zzvoVar != null) {
            if (zzm(zzvoVar, objZzf, zzctVar.zzx(), zzctVar.zzb(), zzctVar.zzc(), iZzc)) {
                return zzvoVar;
            }
        }
        return null;
    }

    private final void zzk(zzgbe zzgbeVar, zzvo zzvoVar, zzdc zzdcVar) {
        if (zzvoVar == null) {
            return;
        }
        if (zzdcVar.zza(zzvoVar.zza) != -1) {
            zzgbeVar.zza(zzvoVar, zzdcVar);
            return;
        }
        zzdc zzdcVar2 = (zzdc) this.zzc.get(zzvoVar);
        if (zzdcVar2 != null) {
            zzgbeVar.zza(zzvoVar, zzdcVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzl(zzdc zzdcVar) {
        zzgbe zzgbeVar = new zzgbe();
        if (this.zzb.isEmpty()) {
            zzk(zzgbeVar, this.zze, zzdcVar);
            if (!zzfya.zza(this.zzf, this.zze)) {
                zzk(zzgbeVar, this.zzf, zzdcVar);
            }
            if (!zzfya.zza(this.zzd, this.zze) && !zzfya.zza(this.zzd, this.zzf)) {
                zzk(zzgbeVar, this.zzd, zzdcVar);
            }
        } else {
            for (int i = 0; i < this.zzb.size(); i++) {
                zzk(zzgbeVar, (zzvo) this.zzb.get(i), zzdcVar);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzgbeVar, this.zzd, zzdcVar);
            }
        }
        this.zzc = zzgbeVar.zzc();
    }

    private static boolean zzm(zzvo zzvoVar, Object obj, boolean z, int i, int i2, int i3) {
        if (!zzvoVar.zza.equals(obj)) {
            return false;
        }
        if (z) {
            if (zzvoVar.zzb != i || zzvoVar.zzc != i2) {
                return false;
            }
        } else if (zzvoVar.zzb != -1 || zzvoVar.zze != i3) {
            return false;
        }
        return true;
    }

    public final zzdc zza(zzvo zzvoVar) {
        return (zzdc) this.zzc.get(zzvoVar);
    }

    public final zzvo zzb() {
        return this.zzd;
    }

    public final zzvo zzc() {
        Object next;
        Object obj;
        if (this.zzb.isEmpty()) {
            return null;
        }
        zzgbc zzgbcVar = this.zzb;
        if (!(zzgbcVar instanceof List)) {
            Iterator<E> it = zzgbcVar.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        } else {
            if (zzgbcVar.isEmpty()) {
                throw new NoSuchElementException();
            }
            obj = zzgbcVar.get(zzgbcVar.size() - 1);
        }
        return (zzvo) obj;
    }

    public final zzvo zzd() {
        return this.zze;
    }

    public final zzvo zze() {
        return this.zzf;
    }

    public final void zzg(zzct zzctVar) {
        this.zzd = zzj(zzctVar, this.zzb, this.zze, this.zza);
    }

    public final void zzh(List list, zzvo zzvoVar, zzct zzctVar) {
        this.zzb = zzgbc.zzk(list);
        if (!list.isEmpty()) {
            this.zze = (zzvo) list.get(0);
            zzvoVar.getClass();
            this.zzf = zzvoVar;
        }
        if (this.zzd == null) {
            this.zzd = zzj(zzctVar, this.zzb, this.zze, this.zza);
        }
        zzl(zzctVar.zzn());
    }

    public final void zzi(zzct zzctVar) {
        this.zzd = zzj(zzctVar, this.zzb, this.zze, this.zza);
        zzl(zzctVar.zzn());
    }
}
