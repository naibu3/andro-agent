package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfen implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;

    public zzfen(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
        this.zzc = zzhlgVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfek zzb() {
        Context context = (Context) this.zza.zzb();
        zzfiy zzfiyVar = (zzfiy) this.zzb.zzb();
        zzfjq zzfjqVar = (zzfjq) this.zzc.zzb();
        zzcbs zzcbsVarZzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgA)).booleanValue() ? com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh() : com.google.android.gms.ads.internal.zzu.zzo().zzi().zzi();
        boolean z = false;
        if (zzcbsVarZzh != null && zzcbsVarZzh.zzh()) {
            z = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgC)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgz)).booleanValue() || z) {
                zzfjp zzfjpVarZza = zzfjqVar.zza(zzfjg.Rewarded, context, zzfiyVar, new zzfdo(new zzfdl()));
                return new zzfdq(new zzfea(new zzfdz()), new zzfdw(zzfjpVarZza.zza, zzcci.zza), zzfjpVarZza.zzb, zzfjpVarZza.zza.zza().zzf, zzcci.zza);
            }
        }
        return new zzfdz();
    }
}
