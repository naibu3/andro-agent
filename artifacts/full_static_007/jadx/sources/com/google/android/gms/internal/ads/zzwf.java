package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzwf extends zzuw {
    private static final zzbu zza;
    private final zzvq[] zzb;
    private final zzdc[] zzc;
    private final ArrayList zzd;
    private zzwe zzi;
    private final zzuz zzj;
    private int zzg = -1;
    private long[][] zzh = new long[0][];
    private final Map zze = new HashMap();
    private final zzgca zzf = zzgci.zzb(8).zzb(2).zza();

    static {
        zzaw zzawVar = new zzaw();
        zzawVar.zza("MergingMediaSource");
        zza = zzawVar.zzc();
    }

    public zzwf(boolean z, boolean z2, zzuz zzuzVar, zzvq... zzvqVarArr) {
        this.zzb = zzvqVarArr;
        this.zzj = zzuzVar;
        this.zzd = new ArrayList(Arrays.asList(zzvqVarArr));
        this.zzc = new zzdc[zzvqVarArr.length];
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    protected final /* bridge */ /* synthetic */ void zzA(Object obj, zzvq zzvqVar, zzdc zzdcVar) {
        int iZzb;
        if (this.zzi != null) {
            return;
        }
        if (this.zzg == -1) {
            iZzb = zzdcVar.zzb();
            this.zzg = iZzb;
        } else {
            int iZzb2 = zzdcVar.zzb();
            int i = this.zzg;
            if (iZzb2 != i) {
                this.zzi = new zzwe(0);
                return;
            }
            iZzb = i;
        }
        if (this.zzh.length == 0) {
            this.zzh = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iZzb, this.zzc.length);
        }
        this.zzd.remove(zzvqVar);
        this.zzc[((Integer) obj).intValue()] = zzdcVar;
        if (this.zzd.isEmpty()) {
            zzo(this.zzc[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzG(zzvm zzvmVar) {
        zzwd zzwdVar = (zzwd) zzvmVar;
        int i = 0;
        while (true) {
            zzvq[] zzvqVarArr = this.zzb;
            if (i >= zzvqVarArr.length) {
                return;
            }
            zzvqVarArr[i].zzG(zzwdVar.zzn(i));
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final zzvm zzI(zzvo zzvoVar, zzzv zzzvVar, long j) {
        zzdc[] zzdcVarArr = this.zzc;
        int length = this.zzb.length;
        zzvm[] zzvmVarArr = new zzvm[length];
        int iZza = zzdcVarArr[0].zza(zzvoVar.zza);
        for (int i = 0; i < length; i++) {
            zzvmVarArr[i] = this.zzb[i].zzI(zzvoVar.zza(this.zzc[i].zzf(iZza)), zzzvVar, j - this.zzh[iZza][i]);
        }
        return new zzwd(this.zzj, this.zzh[iZza], zzvmVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final zzbu zzJ() {
        zzvq[] zzvqVarArr = this.zzb;
        return zzvqVarArr.length > 0 ? zzvqVarArr[0].zzJ() : zza;
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzuo
    protected final void zzn(zzie zzieVar) {
        super.zzn(zzieVar);
        int i = 0;
        while (true) {
            zzvq[] zzvqVarArr = this.zzb;
            if (i >= zzvqVarArr.length) {
                return;
            }
            zzB(Integer.valueOf(i), zzvqVarArr[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzuo
    protected final void zzq() {
        super.zzq();
        Arrays.fill(this.zzc, (Object) null);
        this.zzg = -1;
        this.zzi = null;
        this.zzd.clear();
        Collections.addAll(this.zzd, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzuo, com.google.android.gms.internal.ads.zzvq
    public final void zzt(zzbu zzbuVar) {
        this.zzb[0].zzt(zzbuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    protected final /* bridge */ /* synthetic */ zzvo zzy(Object obj, zzvo zzvoVar) {
        if (((Integer) obj).intValue() == 0) {
            return zzvoVar;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzvq
    public final void zzz() throws IOException {
        zzwe zzweVar = this.zzi;
        if (zzweVar != null) {
            throw zzweVar;
        }
        super.zzz();
    }
}
