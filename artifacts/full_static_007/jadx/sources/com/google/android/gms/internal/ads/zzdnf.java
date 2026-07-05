package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdnf {
    private final zzdsd zza;
    private final zzdqs zzb;
    private final zzcrk zzc;
    private final zzdmb zzd;

    public zzdnf(zzdsd zzdsdVar, zzdqs zzdqsVar, zzcrk zzcrkVar, zzdmb zzdmbVar) {
        this.zza = zzdsdVar;
        this.zzb = zzdqsVar;
        this.zzc = zzcrkVar;
        this.zzd = zzdmbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zza() throws zzchp {
        zzchd zzchdVarZza = this.zza.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        View view = (View) zzchdVarZza;
        view.setVisibility(8);
        zzchdVarZza.zzag("/sendMessageToSdk", new zzblp() { // from class: com.google.android.gms.internal.ads.zzdna
            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, Map map) {
                this.zza.zzb((zzchd) obj, map);
            }
        });
        zzchdVarZza.zzag("/adMuted", new zzblp() { // from class: com.google.android.gms.internal.ads.zzdnb
            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, Map map) {
                this.zza.zzc((zzchd) obj, map);
            }
        });
        this.zzb.zzm(new WeakReference(zzchdVarZza), "/loadHtml", new zzblp() { // from class: com.google.android.gms.internal.ads.zzdnc
            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, final Map map) {
                zzchd zzchdVar = (zzchd) obj;
                zzciv zzcivVarZzN = zzchdVar.zzN();
                final zzdnf zzdnfVar = this.zza;
                zzcivVarZzN.zzB(new zzcit() { // from class: com.google.android.gms.internal.ads.zzdmz
                    @Override // com.google.android.gms.internal.ads.zzcit
                    public final void zza(boolean z, int i, String str, String str2) {
                        zzdnfVar.zzd(map, z, i, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzchdVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzchdVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.zzb.zzm(new WeakReference(zzchdVarZza), "/showOverlay", new zzblp() { // from class: com.google.android.gms.internal.ads.zzdnd
            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, Map map) {
                this.zza.zze((zzchd) obj, map);
            }
        });
        this.zzb.zzm(new WeakReference(zzchdVarZza), "/hideOverlay", new zzblp() { // from class: com.google.android.gms.internal.ads.zzdne
            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, Map map) {
                this.zza.zzf((zzchd) obj, map);
            }
        });
        return view;
    }

    final /* synthetic */ void zzb(zzchd zzchdVar, Map map) {
        this.zzb.zzj("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void zzc(zzchd zzchdVar, Map map) {
        this.zzd.zzg();
    }

    final /* synthetic */ void zzd(Map map, boolean z, int i, String str, String str2) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "htmlLoaded");
        map2.put("id", (String) map.get("id"));
        this.zzb.zzj("sendMessageToNativeJs", map2);
    }

    final /* synthetic */ void zze(zzchd zzchdVar, Map map) {
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Showing native ads overlay.");
        zzchdVar.zzF().setVisibility(0);
        this.zzc.zze(true);
    }

    final /* synthetic */ void zzf(zzchd zzchdVar, Map map) {
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Hiding native ads overlay.");
        zzchdVar.zzF().setVisibility(8);
        this.zzc.zze(false);
    }
}
