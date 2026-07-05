package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzmb implements zzvy, zzsp {
    final /* synthetic */ zzmf zza;
    private final zzmd zzb;

    public zzmb(zzmf zzmfVar, zzmd zzmdVar) {
        this.zza = zzmfVar;
        this.zzb = zzmdVar;
    }

    private final Pair zzf(int i, zzvo zzvoVar) {
        zzvo zzvoVarZza;
        zzvo zzvoVar2 = null;
        if (zzvoVar != null) {
            zzmd zzmdVar = this.zzb;
            int i2 = 0;
            while (true) {
                if (i2 >= zzmdVar.zzc.size()) {
                    zzvoVarZza = null;
                    break;
                }
                if (((zzvo) zzmdVar.zzc.get(i2)).zzd == zzvoVar.zzd) {
                    zzvoVarZza = zzvoVar.zza(Pair.create(zzmdVar.zzb, zzvoVar.zza));
                    break;
                }
                i2++;
            }
            if (zzvoVarZza == null) {
                return null;
            }
            zzvoVar2 = zzvoVarZza;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zzvoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzae(int i, zzvo zzvoVar, final zzvk zzvkVar) {
        final Pair pairZzf = zzf(0, zzvoVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlz
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzh.zzae(((Integer) pair.first).intValue(), (zzvo) pair.second, zzvkVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzaf(int i, zzvo zzvoVar, final zzvf zzvfVar, final zzvk zzvkVar) {
        final Pair pairZzf = zzf(0, zzvoVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlx
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzh.zzaf(((Integer) pair.first).intValue(), (zzvo) pair.second, zzvfVar, zzvkVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzag(int i, zzvo zzvoVar, final zzvf zzvfVar, final zzvk zzvkVar) {
        final Pair pairZzf = zzf(0, zzvoVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzma
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzh.zzag(((Integer) pair.first).intValue(), (zzvo) pair.second, zzvfVar, zzvkVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzah(int i, zzvo zzvoVar, final zzvf zzvfVar, final zzvk zzvkVar, final IOException iOException, final boolean z) {
        final Pair pairZzf = zzf(0, zzvoVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlw
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzh.zzah(((Integer) pair.first).intValue(), (zzvo) pair.second, zzvfVar, zzvkVar, iOException, z);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzai(int i, zzvo zzvoVar, final zzvf zzvfVar, final zzvk zzvkVar) {
        final Pair pairZzf = zzf(0, zzvoVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzly
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzh.zzai(((Integer) pair.first).intValue(), (zzvo) pair.second, zzvfVar, zzvkVar);
                }
            });
        }
    }
}
