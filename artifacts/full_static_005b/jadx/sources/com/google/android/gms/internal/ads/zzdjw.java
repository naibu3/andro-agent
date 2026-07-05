package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzdjw implements zzcus {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzhlg zzd;
    private final zzdme zze;

    zzdjw(Map map, Map map2, Map map3, zzhlg zzhlgVar, zzdme zzdmeVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzhlgVar;
        this.zze = zzdmeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcus
    public final zzehl zza(int i, String str) {
        zzehl zzehlVarZza;
        zzehl zzehlVar = (zzehl) this.zza.get(str);
        if (zzehlVar != null) {
            return zzehlVar;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            zzejz zzejzVar = (zzejz) this.zzc.get(str);
            if (zzejzVar != null) {
                return new zzehm(zzejzVar, new zzfxu() { // from class: com.google.android.gms.internal.ads.zzcuu
                    @Override // com.google.android.gms.internal.ads.zzfxu
                    public final Object apply(Object obj) {
                        return new zzcux((List) obj);
                    }
                });
            }
            zzehlVarZza = (zzehl) this.zzb.get(str);
            if (zzehlVarZza == null) {
                return null;
            }
        } else if (this.zze.zze() == null || (zzehlVarZza = ((zzcus) this.zzd.zzb()).zza(i, str)) == null) {
            return null;
        }
        return new zzehm(zzehlVarZza, new zzfxu() { // from class: com.google.android.gms.internal.ads.zzcuv
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                return new zzcux((zzcup) obj);
            }
        });
    }
}
