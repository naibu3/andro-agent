package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzbkn implements zzblp {
    public final /* synthetic */ zzdhi zza;
    public final /* synthetic */ zzcqd zzb;

    public /* synthetic */ zzbkn(zzdhi zzdhiVar, zzcqd zzcqdVar) {
        this.zza = zzdhiVar;
        this.zzb = zzcqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zza(Object obj, Map map) {
        zzchd zzchdVar = (zzchd) obj;
        zzblo.zzc(map, this.zza);
        final String str = (String) map.get("u");
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("URL missing from click GMSG.");
        } else {
            final zzcqd zzcqdVar = this.zzb;
            zzgft.zzr(zzgft.zzn(zzgfk.zzu(zzblo.zza(zzchdVar, str)), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzbkp
                @Override // com.google.android.gms.internal.ads.zzgfa
                public final ListenableFuture zza(Object obj2) {
                    zzcqd zzcqdVar2;
                    String str2 = (String) obj2;
                    zzblp zzblpVar = zzblo.zza;
                    return (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzka)).booleanValue() && (zzcqdVar2 = zzcqdVar) != null && zzcqd.zzj(str)) ? zzcqdVar2.zzb(str2, com.google.android.gms.ads.internal.client.zzay.zze()) : zzgft.zzh(str2);
                }
            }, zzcci.zza), new zzbld(zzchdVar), zzcci.zza);
        }
    }
}
