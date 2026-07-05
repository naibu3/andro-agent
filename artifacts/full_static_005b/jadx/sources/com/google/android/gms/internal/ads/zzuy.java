package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzuy implements zzxh {
    private final zzgbc zza;
    private long zzb;

    public zzuy(List list, List list2) {
        zzgaz zzgazVar = new zzgaz();
        zzeq.zzd(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            zzgazVar.zzf(new zzux((zzxh) list.get(i), (List) list2.get(i)));
        }
        this.zza = zzgazVar.zzi();
        this.zzb = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzxh
    public final long zzb() {
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        for (int i = 0; i < this.zza.size(); i++) {
            zzux zzuxVar = (zzux) this.zza.get(i);
            long jZzb = zzuxVar.zzb();
            if ((zzuxVar.zza().contains(1) || zzuxVar.zza().contains(2) || zzuxVar.zza().contains(4)) && jZzb != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzb);
            }
            if (jZzb != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jZzb);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            this.zzb = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.zzb;
        return j != -9223372036854775807L ? j : jMin2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzxh
    public final long zzc() {
        long jMin = Long.MAX_VALUE;
        for (int i = 0; i < this.zza.size(); i++) {
            long jZzc = ((zzux) this.zza.get(i)).zzc();
            if (jZzc != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzc);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzxh
    public final void zzm(long j) {
        for (int i = 0; i < this.zza.size(); i++) {
            ((zzux) this.zza.get(i)).zzm(j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzxh
    public final boolean zzo(zzlo zzloVar) {
        boolean zZzo;
        boolean z = false;
        do {
            long jZzc = zzc();
            if (jZzc == Long.MIN_VALUE) {
                break;
            }
            zZzo = false;
            for (int i = 0; i < this.zza.size(); i++) {
                long jZzc2 = ((zzux) this.zza.get(i)).zzc();
                boolean z2 = jZzc2 != Long.MIN_VALUE && jZzc2 <= zzloVar.zza;
                if (jZzc2 == jZzc || z2) {
                    zZzo |= ((zzux) this.zza.get(i)).zzo(zzloVar);
                }
            }
            z |= zZzo;
        } while (zZzo);
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzxh
    public final boolean zzp() {
        for (int i = 0; i < this.zza.size(); i++) {
            if (((zzux) this.zza.get(i)).zzp()) {
                return true;
            }
        }
        return false;
    }
}
