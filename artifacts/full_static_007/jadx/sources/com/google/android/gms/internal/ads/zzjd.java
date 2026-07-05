package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzjd implements zzlk {
    private final zzzv zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;
    private final long zzg;
    private final HashMap zzh;
    private long zzi;

    public zzjd() {
        zzzv zzzvVar = new zzzv(true, 65536);
        zzk(2500, 0, "bufferForPlaybackMs", "0");
        zzk(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzk(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        zzk(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzk(50000, 50000, "maxBufferMs", "minBufferMs");
        zzk(0, 0, "backBufferDurationMs", "0");
        this.zzb = zzzvVar;
        this.zzc = zzgd.zzr(50000L);
        this.zzd = zzgd.zzr(50000L);
        this.zze = zzgd.zzr(2500L);
        this.zzf = zzgd.zzr(5000L);
        this.zzg = zzgd.zzr(0L);
        this.zzh = new HashMap();
        this.zzi = -1L;
    }

    private static void zzk(int i, int i2, String str, String str2) {
        zzeq.zze(i >= i2, str + " cannot be less than " + str2);
    }

    private final void zzl(zzpj zzpjVar) {
        if (this.zzh.remove(zzpjVar) != null) {
            zzm();
        }
    }

    private final void zzm() {
        if (this.zzh.isEmpty()) {
            this.zzb.zze();
        } else {
            this.zzb.zzf(zza());
        }
    }

    final int zza() {
        Iterator it = this.zzh.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((zzjc) it.next()).zzb;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final long zzb(zzpj zzpjVar) {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final void zzc(zzpj zzpjVar) {
        long id = Thread.currentThread().getId();
        long j = this.zzi;
        boolean z = true;
        if (j != -1 && j != id) {
            z = false;
        }
        zzeq.zzg(z, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.zzi = id;
        if (!this.zzh.containsKey(zzpjVar)) {
            this.zzh.put(zzpjVar, new zzjc(null));
        }
        zzjc zzjcVar = (zzjc) this.zzh.get(zzpjVar);
        zzjcVar.getClass();
        zzjcVar.zzb = 13107200;
        zzjcVar.zza = false;
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final void zzd(zzpj zzpjVar) {
        zzl(zzpjVar);
        if (this.zzh.isEmpty()) {
            this.zzi = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final void zze(zzpj zzpjVar) {
        zzl(zzpjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final void zzf(zzpj zzpjVar, zzdc zzdcVar, zzvo zzvoVar, zzmn[] zzmnVarArr, zzxr zzxrVar, zzzg[] zzzgVarArr) {
        zzjc zzjcVar = (zzjc) this.zzh.get(zzpjVar);
        zzjcVar.getClass();
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = zzmnVarArr.length;
            if (i >= 2) {
                zzjcVar.zzb = Math.max(13107200, i2);
                zzm();
                return;
            } else {
                if (zzzgVarArr[i] != null) {
                    i2 += zzmnVarArr[i].zzb() != 1 ? 131072000 : 13107200;
                }
                i++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final boolean zzg(zzpj zzpjVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final boolean zzh(zzpj zzpjVar, zzdc zzdcVar, zzvo zzvoVar, long j, long j2, float f) {
        zzjc zzjcVar = (zzjc) this.zzh.get(zzpjVar);
        zzjcVar.getClass();
        int iZza = this.zzb.zza();
        int iZza2 = zza();
        long jMin = this.zzc;
        if (f > 1.0f) {
            jMin = Math.min(zzgd.zzp(jMin, f), this.zzd);
        }
        if (j2 < Math.max(jMin, 500000L)) {
            boolean z = iZza < iZza2;
            zzjcVar.zza = z;
            if (!z && j2 < 500000) {
                zzfk.zzf("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.zzd || iZza >= iZza2) {
            zzjcVar.zza = false;
        }
        return zzjcVar.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final boolean zzi(zzpj zzpjVar, zzdc zzdcVar, zzvo zzvoVar, long j, float f, boolean z, long j2) {
        long jZzq = zzgd.zzq(j, f);
        long jMin = z ? this.zzf : this.zze;
        if (j2 != -9223372036854775807L) {
            jMin = Math.min(j2 / 2, jMin);
        }
        return jMin <= 0 || jZzq >= jMin || this.zzb.zza() >= zza();
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final zzzv zzj() {
        return this.zzb;
    }
}
