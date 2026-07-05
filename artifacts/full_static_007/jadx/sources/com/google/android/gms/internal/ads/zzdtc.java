package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbdv;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdtc implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;

    public zzdtc(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3, zzhlg zzhlgVar4, zzhlg zzhlgVar5) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
        this.zzc = zzhlgVar3;
        this.zzd = zzhlgVar4;
        this.zze = zzhlgVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = ((zzcjj) this.zza).zza();
        final String strZzb = ((zzdzv) this.zzb).zzb();
        VersionInfoParcel versionInfoParcelZza = ((zzcjv) this.zzc).zza();
        final zzbdv.zza.EnumC0014zza enumC0014zza = (zzbdv.zza.EnumC0014zza) this.zzd.zzb();
        final String str = (String) this.zze.zzb();
        zzbdm zzbdmVar = new zzbdm(new zzbdu(contextZza));
        zzbdv.zzar.zza zzaVarZzd = zzbdv.zzar.zzd();
        zzaVarZzd.zzg(versionInfoParcelZza.buddyApkVersion);
        zzaVarZzd.zzi(versionInfoParcelZza.clientJarVersion);
        zzaVarZzd.zzh(true != versionInfoParcelZza.isClientJar ? 2 : 0);
        final zzbdv.zzar zzarVarZzbr = zzaVarZzd.zzbr();
        zzbdmVar.zzc(new zzbdl() { // from class: com.google.android.gms.internal.ads.zzdtb
            @Override // com.google.android.gms.internal.ads.zzbdl
            public final void zza(zzbdv.zzt.zza zzaVar) {
                zzbdv.zza.zzb zzbVarZzcZ = zzaVar.zze().zzcZ();
                zzbVarZzcZ.zzH(enumC0014zza);
                zzaVar.zzG(zzbVarZzcZ);
                zzbdv.zzm.zza zzaVarZzcZ = zzaVar.zzg().zzcZ();
                zzaVarZzcZ.zzm(strZzb);
                zzaVarZzcZ.zzw(zzarVarZzbr);
                zzaVar.zzK(zzaVarZzcZ);
                zzaVar.zzO(str);
            }
        });
        return zzbdmVar;
    }
}
