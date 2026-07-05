package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzpn {
    public static final zzpn zza;
    public final int zzb;
    public final int zzc;
    private final zzgbh zzd;

    static {
        zzpn zzpnVar;
        if (zzgd.zza >= 33) {
            zzgbg zzgbgVar = new zzgbg();
            for (int i = 1; i <= 10; i++) {
                zzgbgVar.zzf(Integer.valueOf(zzgd.zzh(i)));
            }
            zzpnVar = new zzpn(2, zzgbgVar.zzi());
        } else {
            zzpnVar = new zzpn(2, 10);
        }
        zza = zzpnVar;
    }

    public zzpn(int i, int i2) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = null;
    }

    public zzpn(int i, Set set) {
        this.zzb = i;
        zzgbh zzgbhVarZzl = zzgbh.zzl(set);
        this.zzd = zzgbhVarZzl;
        zzgdi it = zzgbhVarZzl.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.zzc = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzpn)) {
            return false;
        }
        zzpn zzpnVar = (zzpn) obj;
        return this.zzb == zzpnVar.zzb && this.zzc == zzpnVar.zzc && zzgd.zzG(this.zzd, zzpnVar.zzd);
    }

    public final int hashCode() {
        zzgbh zzgbhVar = this.zzd;
        return (((this.zzb * 31) + this.zzc) * 31) + (zzgbhVar == null ? 0 : zzgbhVar.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.zzb + ", maxChannelCount=" + this.zzc + ", channelMasks=" + String.valueOf(this.zzd) + "]";
    }

    public final int zza(int i, zzk zzkVar) {
        if (this.zzd != null) {
            return this.zzc;
        }
        if (zzgd.zza >= 29) {
            return zzpl.zza(this.zzb, i, zzkVar);
        }
        Integer num = (Integer) zzpp.zzb.getOrDefault(Integer.valueOf(this.zzb), 0);
        num.getClass();
        return num.intValue();
    }

    public final boolean zzb(int i) {
        if (this.zzd == null) {
            return i <= this.zzc;
        }
        int iZzh = zzgd.zzh(i);
        if (iZzh == 0) {
            return false;
        }
        return this.zzd.contains(Integer.valueOf(iZzh));
    }
}
