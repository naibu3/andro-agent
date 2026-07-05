package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcyp;
import com.google.android.gms.internal.ads.zzcyq;
import com.google.android.gms.internal.ads.zzdhx;
import com.google.android.gms.internal.ads.zzfky;
import com.google.android.gms.internal.ads.zzfln;
import com.google.android.gms.internal.ads.zzflt;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes.dex */
public final class zzat implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;

    public zzat(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3, zzhlg zzhlgVar4) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
        this.zzc = zzhlgVar3;
        this.zzd = zzhlgVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzflt zzfltVar = (zzflt) this.zza.zzb();
        zzav zzavVarZzb = ((zzaw) this.zzb).zzb();
        zzcyp zzcypVarZzb = ((zzcyq) this.zzc).zzb();
        zzdhx zzdhxVar = (zzdhx) this.zzd.zzb();
        zzfky zzfkyVarZza = zzfltVar.zzb(zzfln.GENERATE_SIGNALS, zzcypVarZzb.zzc()).zzf(zzavVarZzb).zzi(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfF)).intValue(), TimeUnit.SECONDS).zza();
        zzgft.zzr(zzfkyVarZza, new zzal(zzdhxVar), zzcci.zza);
        return zzfkyVarZza;
    }
}
