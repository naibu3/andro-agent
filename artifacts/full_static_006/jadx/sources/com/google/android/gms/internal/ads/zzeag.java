package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzeag implements zzgfp {
    final /* synthetic */ zzeah zza;

    zzeag(zzeah zzeahVar) {
        this.zza = zzeahVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgs)).booleanValue()) {
            Matcher matcher = zzeah.zza.matcher(th.getMessage());
            if (matcher.matches()) {
                this.zza.zzf.zzi(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfhf zzfhfVar = (zzfhf) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgs)).booleanValue()) {
            this.zza.zzf.zzi(zzfhfVar.zzb.zzb.zze);
            this.zza.zzf.zzj(zzfhfVar.zzb.zzb.zzf);
        }
    }
}
