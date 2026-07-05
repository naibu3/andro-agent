package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzmf {
    private final zzpj zza;
    private final zzme zze;
    private final zzmx zzh;
    private final zzfb zzi;
    private boolean zzj;
    private zzie zzk;
    private zzxi zzl = new zzxi(0);
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final List zzb = new ArrayList();
    private final HashMap zzf = new HashMap();
    private final Set zzg = new HashSet();

    public zzmf(zzme zzmeVar, zzmx zzmxVar, zzfb zzfbVar, zzpj zzpjVar) {
        this.zza = zzpjVar;
        this.zze = zzmeVar;
        this.zzh = zzmxVar;
        this.zzi = zzfbVar;
    }

    private final void zzr(int i, int i2) {
        while (i < this.zzb.size()) {
            ((zzmd) this.zzb.get(i)).zzd += i2;
            i++;
        }
    }

    private final void zzs(zzmd zzmdVar) {
        zzmc zzmcVar = (zzmc) this.zzf.get(zzmdVar);
        if (zzmcVar != null) {
            zzmcVar.zza.zzi(zzmcVar.zzb);
        }
    }

    private final void zzt() {
        Iterator it = this.zzg.iterator();
        while (it.hasNext()) {
            zzmd zzmdVar = (zzmd) it.next();
            if (zzmdVar.zzc.isEmpty()) {
                zzs(zzmdVar);
                it.remove();
            }
        }
    }

    private final void zzu(zzmd zzmdVar) {
        if (zzmdVar.zze && zzmdVar.zzc.isEmpty()) {
            zzmc zzmcVar = (zzmc) this.zzf.remove(zzmdVar);
            zzmcVar.getClass();
            zzmcVar.zza.zzp(zzmcVar.zzb);
            zzmcVar.zza.zzs(zzmcVar.zzc);
            zzmcVar.zza.zzr(zzmcVar.zzc);
            this.zzg.remove(zzmdVar);
        }
    }

    private final void zzv(zzmd zzmdVar) {
        zzvj zzvjVar = zzmdVar.zza;
        zzvp zzvpVar = new zzvp() { // from class: com.google.android.gms.internal.ads.zzlv
            @Override // com.google.android.gms.internal.ads.zzvp
            public final void zza(zzvq zzvqVar, zzdc zzdcVar) {
                this.zza.zzf(zzvqVar, zzdcVar);
            }
        };
        zzmb zzmbVar = new zzmb(this, zzmdVar);
        this.zzf.put(zzmdVar, new zzmc(zzvjVar, zzvpVar, zzmbVar));
        zzvjVar.zzh(new Handler(zzgd.zzy(), null), zzmbVar);
        zzvjVar.zzg(new Handler(zzgd.zzy(), null), zzmbVar);
        zzvjVar.zzm(zzvpVar, this.zzk, this.zza);
    }

    private final void zzw(int i, int i2) {
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            zzmd zzmdVar = (zzmd) this.zzb.remove(i2);
            this.zzd.remove(zzmdVar.zzb);
            zzr(i2, -zzmdVar.zza.zzC().zzc());
            zzmdVar.zze = true;
            if (this.zzj) {
                zzu(zzmdVar);
            }
        }
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final zzdc zzb() {
        if (this.zzb.isEmpty()) {
            return zzdc.zza;
        }
        int iZzc = 0;
        for (int i = 0; i < this.zzb.size(); i++) {
            zzmd zzmdVar = (zzmd) this.zzb.get(i);
            zzmdVar.zzd = iZzc;
            iZzc += zzmdVar.zza.zzC().zzc();
        }
        return new zzml(this.zzb, this.zzl);
    }

    public final zzdc zzc(int i, int i2, List list) {
        zzeq.zzd(i >= 0 && i <= i2 && i2 <= zza());
        zzeq.zzd(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((zzmd) this.zzb.get(i3)).zza.zzt((zzbu) list.get(i3 - i));
        }
        return zzb();
    }

    final /* synthetic */ void zzf(zzvq zzvqVar, zzdc zzdcVar) {
        this.zze.zzh();
    }

    public final void zzg(zzie zzieVar) {
        zzeq.zzf(!this.zzj);
        this.zzk = zzieVar;
        for (int i = 0; i < this.zzb.size(); i++) {
            zzmd zzmdVar = (zzmd) this.zzb.get(i);
            zzv(zzmdVar);
            this.zzg.add(zzmdVar);
        }
        this.zzj = true;
    }

    public final void zzh() {
        for (zzmc zzmcVar : this.zzf.values()) {
            try {
                zzmcVar.zza.zzp(zzmcVar.zzb);
            } catch (RuntimeException e) {
                zzfk.zzd("MediaSourceList", "Failed to release child source.", e);
            }
            zzmcVar.zza.zzs(zzmcVar.zzc);
            zzmcVar.zza.zzr(zzmcVar.zzc);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final void zzi(zzvm zzvmVar) {
        zzmd zzmdVar = (zzmd) this.zzc.remove(zzvmVar);
        zzmdVar.getClass();
        zzmdVar.zza.zzG(zzvmVar);
        zzmdVar.zzc.remove(((zzvg) zzvmVar).zza);
        if (!this.zzc.isEmpty()) {
            zzt();
        }
        zzu(zzmdVar);
    }

    public final boolean zzj() {
        return this.zzj;
    }

    public final zzdc zzk(int i, List list, zzxi zzxiVar) {
        if (!list.isEmpty()) {
            this.zzl = zzxiVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                zzmd zzmdVar = (zzmd) list.get(i2 - i);
                if (i2 > 0) {
                    zzmd zzmdVar2 = (zzmd) this.zzb.get(i2 - 1);
                    zzmdVar.zzc(zzmdVar2.zzd + zzmdVar2.zza.zzC().zzc());
                } else {
                    zzmdVar.zzc(0);
                }
                zzr(i2, zzmdVar.zza.zzC().zzc());
                this.zzb.add(i2, zzmdVar);
                this.zzd.put(zzmdVar.zzb, zzmdVar);
                if (this.zzj) {
                    zzv(zzmdVar);
                    if (this.zzc.isEmpty()) {
                        this.zzg.add(zzmdVar);
                    } else {
                        zzs(zzmdVar);
                    }
                }
            }
        }
        return zzb();
    }

    public final zzdc zzl(int i, int i2, int i3, zzxi zzxiVar) {
        zzeq.zzd(zza() >= 0);
        this.zzl = null;
        return zzb();
    }

    public final zzdc zzm(int i, int i2, zzxi zzxiVar) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= zza()) {
            z = true;
        }
        zzeq.zzd(z);
        this.zzl = zzxiVar;
        zzw(i, i2);
        return zzb();
    }

    public final zzdc zzn(List list, zzxi zzxiVar) {
        zzw(0, this.zzb.size());
        return zzk(this.zzb.size(), list, zzxiVar);
    }

    public final zzdc zzo(zzxi zzxiVar) {
        int iZza = zza();
        if (zzxiVar.zzc() != iZza) {
            zzxiVar = zzxiVar.zzf().zzg(0, iZza);
        }
        this.zzl = zzxiVar;
        return zzb();
    }

    public final zzvm zzp(zzvo zzvoVar, zzzv zzzvVar, long j) {
        int i = zzml.zzc;
        Object obj = ((Pair) zzvoVar.zza).first;
        zzvo zzvoVarZza = zzvoVar.zza(((Pair) zzvoVar.zza).second);
        zzmd zzmdVar = (zzmd) this.zzd.get(obj);
        zzmdVar.getClass();
        this.zzg.add(zzmdVar);
        zzmc zzmcVar = (zzmc) this.zzf.get(zzmdVar);
        if (zzmcVar != null) {
            zzmcVar.zza.zzk(zzmcVar.zzb);
        }
        zzmdVar.zzc.add(zzvoVarZza);
        zzvg zzvgVarZzH = zzmdVar.zza.zzI(zzvoVarZza, zzzvVar, j);
        this.zzc.put(zzvgVarZzH, zzmdVar);
        zzt();
        return zzvgVarZzH;
    }

    public final zzxi zzq() {
        return this.zzl;
    }
}
