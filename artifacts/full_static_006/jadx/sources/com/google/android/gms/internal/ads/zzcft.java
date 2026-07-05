package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcft extends zzcfp {
    public zzcft(zzcee zzceeVar) {
        super(zzceeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfp
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzcfp
    public final boolean zzt(String str) {
        String strZzf = com.google.android.gms.ads.internal.util.client.zzf.zzf(str);
        zzcee zzceeVar = (zzcee) this.zzc.get();
        if (zzceeVar != null && strZzf != null) {
            zzceeVar.zzt(strZzf, this);
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("VideoStreamNoopCache is doing nothing.");
        zzg(str, strZzf, "noop", "Noop cache is a noop.");
        return false;
    }
}
