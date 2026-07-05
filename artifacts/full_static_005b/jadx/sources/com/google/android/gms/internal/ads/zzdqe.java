package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdqe implements zzblp {
    private final zzbiz zza;
    private final zzdqs zzb;
    private final zzhkj zzc;

    public zzdqe(zzdme zzdmeVar, zzdlt zzdltVar, zzdqs zzdqsVar, zzhkj zzhkjVar) {
        this.zza = zzdmeVar.zzc(zzdltVar.zzA());
        this.zzb = zzdqsVar;
        this.zzc = zzhkjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzbip) this.zzc.zzb(), str);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call onCustomClick for asset " + str + ".", e);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzl("/nativeAdCustomClick", this);
    }
}
