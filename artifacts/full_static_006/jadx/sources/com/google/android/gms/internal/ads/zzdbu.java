package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdbu extends zzdez implements zzdaf, zzdbk {
    private final zzfgt zzb;
    private final AtomicBoolean zzc;

    public zzdbu(Set set, zzfgt zzfgtVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzfgtVar;
    }

    private final void zzb() {
        com.google.android.gms.ads.internal.client.zzs zzsVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhT)).booleanValue() && this.zzc.compareAndSet(false, true) && (zzsVar = this.zzb.zzaf) != null && zzsVar.zza == 3) {
            zzq(new zzdey() { // from class: com.google.android.gms.internal.ads.zzdbt
                @Override // com.google.android.gms.internal.ads.zzdey
                public final void zza(Object obj) throws Exception {
                    this.zza.zza((zzdbw) obj);
                }
            });
        }
    }

    final /* synthetic */ void zza(zzdbw zzdbwVar) throws Exception {
        zzdbwVar.zzh(this.zzb.zzaf);
    }

    @Override // com.google.android.gms.internal.ads.zzdbk
    public final void zzg() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdaf
    public final void zzr() {
        int i = this.zzb.zzb;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            zzb();
        }
    }
}
