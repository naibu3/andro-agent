package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbdv;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzduc implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;

    public zzduc(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3, zzhlg zzhlgVar4) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
        this.zzc = zzhlgVar3;
        this.zzd = zzhlgVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setEmptySet;
        final String str = (String) this.zza.zzb();
        Context contextZza = ((zzcjj) this.zzb).zza();
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        Map mapZzb = ((zzhkt) this.zzd).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeT)).booleanValue()) {
            zzbdm zzbdmVar = new zzbdm(new zzbdu(contextZza));
            zzbdmVar.zzc(new zzbdl() { // from class: com.google.android.gms.internal.ads.zzdud
                @Override // com.google.android.gms.internal.ads.zzbdl
                public final void zza(zzbdv.zzt.zza zzaVar) {
                    zzaVar.zzO(str);
                }
            });
            setEmptySet = Collections.singleton(new zzdha(new zzduf(zzbdmVar, mapZzb), zzggeVar));
        } else {
            setEmptySet = Collections.emptySet();
        }
        zzhkx.zzb(setEmptySet);
        return setEmptySet;
    }
}
