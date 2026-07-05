package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfia {
    private final zzfgt zza;
    private final zzfgw zzb;
    private final zzefz zzc;
    private final zzfoe zzd;
    private final zzfmn zze;
    private final zzcqd zzf;

    public zzfia(zzefz zzefzVar, zzfoe zzfoeVar, zzfgt zzfgtVar, zzfgw zzfgwVar, zzcqd zzcqdVar, zzfmn zzfmnVar) {
        this.zza = zzfgtVar;
        this.zzb = zzfgwVar;
        this.zzc = zzefzVar;
        this.zzd = zzfoeVar;
        this.zzf = zzcqdVar;
        this.zze = zzfmnVar;
    }

    public final void zza(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), 2);
        }
    }

    public final void zzb(String str, int i) {
        if (!this.zza.zzaj) {
            this.zzd.zzc(str, this.zze);
        } else {
            this.zzc.zzd(new zzegb(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis(), this.zzb.zzb, str, i));
        }
    }

    public final void zzc(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zzgft.zzr((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzka)).booleanValue() && zzcqd.zzj(str)) ? this.zzf.zzb(str, com.google.android.gms.ads.internal.client.zzay.zze()) : zzgft.zzh(str), new zzfhz(this, i), zzcci.zza);
        }
    }
}
