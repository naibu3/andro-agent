package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfdl implements zzfek {
    private zzcys zza;
    private final Executor zzb = zzggk.zzb();

    public final zzcys zza() {
        return this.zza;
    }

    public final ListenableFuture zzb(zzfel zzfelVar, zzfej zzfejVar, zzcys zzcysVar) {
        zzcyr zzcyrVarZza = zzfejVar.zza(zzfelVar.zzb);
        zzcyrVarZza.zzb(new zzfeo(true));
        zzcys zzcysVar2 = (zzcys) zzcyrVarZza.zzh();
        this.zza = zzcysVar2;
        final zzcvx zzcvxVarZzb = zzcysVar2.zzb();
        final zzfjl zzfjlVar = new zzfjl();
        return zzgft.zzm(zzgft.zzn(zzgfk.zzu(zzcvxVarZzb.zzj()), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzfdj
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                zzfhf zzfhfVar = (zzfhf) obj;
                zzfjlVar.zzb = zzfhfVar;
                Iterator it = zzfhfVar.zzb.zza.iterator();
                boolean z = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        Iterator it2 = ((zzfgt) it.next()).zza.iterator();
                        while (it2.hasNext()) {
                            if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z = true;
                        }
                    } else if (z) {
                        return zzcvxVarZzb.zzi(zzgft.zzh(zzfhfVar));
                    }
                }
                return zzgft.zzh(null);
            }
        }, this.zzb), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzfdk
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                zzfjl zzfjlVar2 = zzfjlVar;
                zzfjlVar2.zzc = (zzcup) obj;
                return zzfjlVar2;
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfek
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfel zzfelVar, zzfej zzfejVar, Object obj) {
        return zzb(zzfelVar, zzfejVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfek
    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
