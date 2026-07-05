package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbbd {
    int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    public final zzbbc zza(boolean z) {
        synchronized (this.zzb) {
            zzbbc zzbbcVar = null;
            if (this.zzc.isEmpty()) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Queue empty");
                return null;
            }
            int i = 0;
            if (this.zzc.size() < 2) {
                zzbbc zzbbcVar2 = (zzbbc) this.zzc.get(0);
                if (z) {
                    this.zzc.remove(0);
                } else {
                    zzbbcVar2.zzi();
                }
                return zzbbcVar2;
            }
            int i2 = Integer.MIN_VALUE;
            int i3 = 0;
            for (zzbbc zzbbcVar3 : this.zzc) {
                int iZzb = zzbbcVar3.zzb();
                if (iZzb > i2) {
                    i = i3;
                }
                int i4 = iZzb > i2 ? iZzb : i2;
                if (iZzb > i2) {
                    zzbbcVar = zzbbcVar3;
                }
                i3++;
                i2 = i4;
            }
            this.zzc.remove(i);
            return zzbbcVar;
        }
    }

    public final void zzb(zzbbc zzbbcVar) {
        synchronized (this.zzb) {
            if (this.zzc.size() >= 10) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Queue is full, current size = " + this.zzc.size());
                this.zzc.remove(0);
            }
            int i = this.zza;
            this.zza = i + 1;
            zzbbcVar.zzj(i);
            zzbbcVar.zzn();
            this.zzc.add(zzbbcVar);
        }
    }

    public final boolean zzc(zzbbc zzbbcVar) {
        synchronized (this.zzb) {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                zzbbc zzbbcVar2 = (zzbbc) it.next();
                if (com.google.android.gms.ads.internal.zzu.zzo().zzi().zzP()) {
                    if (!com.google.android.gms.ads.internal.zzu.zzo().zzi().zzQ() && !zzbbcVar.equals(zzbbcVar2) && zzbbcVar2.zzf().equals(zzbbcVar.zzf())) {
                        it.remove();
                        return true;
                    }
                } else if (!zzbbcVar.equals(zzbbcVar2) && zzbbcVar2.zzd().equals(zzbbcVar.zzd())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean zzd(zzbbc zzbbcVar) {
        synchronized (this.zzb) {
            return this.zzc.contains(zzbbcVar);
        }
    }
}
