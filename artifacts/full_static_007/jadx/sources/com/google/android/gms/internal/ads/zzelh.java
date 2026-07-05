package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzelh {
    private final zzfig zza;
    private final zzdsq zzb;
    private final zzdvc zzc;

    public zzelh(zzfig zzfigVar, zzdsq zzdsqVar, zzdvc zzdvcVar) {
        this.zza = zzfigVar;
        this.zzb = zzdsqVar;
        this.zzc = zzdvcVar;
    }

    public final void zza(zzfgw zzfgwVar, zzfgt zzfgtVar, int i, @Nullable zzehp zzehpVar, long j) {
        zzdsp zzdspVarZza;
        zzdvb zzdvbVarZza = this.zzc.zza();
        zzdvbVarZza.zzd(zzfgwVar);
        zzdvbVarZza.zzc(zzfgtVar);
        zzdvbVarZza.zzb("action", "adapter_status");
        zzdvbVarZza.zzb("adapter_l", String.valueOf(j));
        zzdvbVarZza.zzb("sc", Integer.toString(i));
        if (zzehpVar != null) {
            zzdvbVarZza.zzb("arec", Integer.toString(zzehpVar.zzb().zza));
            String strZza = this.zza.zza(zzehpVar.getMessage());
            if (strZza != null) {
                zzdvbVarZza.zzb("areec", strZza);
            }
        }
        zzdsq zzdsqVar = this.zzb;
        Iterator it = zzfgtVar.zzu.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzdspVarZza = null;
                break;
            } else {
                zzdspVarZza = zzdsqVar.zza((String) it.next());
                if (zzdspVarZza != null) {
                    break;
                }
            }
        }
        if (zzdspVarZza != null) {
            zzdvbVarZza.zzb("ancn", zzdspVarZza.zza);
            zzbtt zzbttVar = zzdspVarZza.zzb;
            if (zzbttVar != null) {
                zzdvbVarZza.zzb("adapter_v", zzbttVar.toString());
            }
            zzbtt zzbttVar2 = zzdspVarZza.zzc;
            if (zzbttVar2 != null) {
                zzdvbVarZza.zzb("adapter_sv", zzbttVar2.toString());
            }
        }
        zzdvbVarZza.zzf();
    }
}
