package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdpo {
    private final zzfho zza;
    private final Executor zzb;
    private final zzdsd zzc;
    private final zzdqy zzd;
    private final Context zze;
    private final zzdvc zzf;
    private final zzfoe zzg;
    private final zzefz zzh;

    public zzdpo(zzfho zzfhoVar, Executor executor, zzdsd zzdsdVar, Context context, zzdvc zzdvcVar, zzfoe zzfoeVar, zzefz zzefzVar, zzdqy zzdqyVar) {
        this.zza = zzfhoVar;
        this.zzb = executor;
        this.zzc = zzdsdVar;
        this.zze = context;
        this.zzf = zzdvcVar;
        this.zzg = zzfoeVar;
        this.zzh = zzefzVar;
        this.zzd = zzdqyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzh(zzchd zzchdVar) {
        zzj(zzchdVar);
        zzchdVar.zzag("/video", zzblo.zzl);
        zzchdVar.zzag("/videoMeta", zzblo.zzm);
        zzchdVar.zzag("/precache", new zzcfq());
        zzchdVar.zzag("/delayPageLoaded", zzblo.zzp);
        zzchdVar.zzag("/instrument", zzblo.zzn);
        zzchdVar.zzag("/log", zzblo.zzg);
        zzchdVar.zzag("/click", new zzbkn(null, 0 == true ? 1 : 0));
        if (this.zza.zzb != null) {
            zzchdVar.zzN().zzE(true);
            zzchdVar.zzag("/open", new zzbmb(null, null, null, null, null));
        } else {
            zzchdVar.zzN().zzE(false);
        }
        if (com.google.android.gms.ads.internal.zzu.zzn().zzp(zzchdVar.getContext())) {
            Map map = new HashMap();
            if (zzchdVar.zzD() != null) {
                map = zzchdVar.zzD().zzax;
            }
            zzchdVar.zzag("/logScionEvent", new zzblv(zzchdVar.getContext(), map));
        }
    }

    private final void zzi(zzchd zzchdVar, zzccm zzccmVar) {
        if (this.zza.zza != null && zzchdVar.zzq() != null) {
            zzchdVar.zzq().zzs(this.zza.zza);
        }
        zzccmVar.zzb();
    }

    private static final void zzj(zzchd zzchdVar) {
        zzchdVar.zzag("/videoClicked", zzblo.zzh);
        zzchdVar.zzN().zzG(true);
        zzchdVar.zzag("/getNativeAdViewSignals", zzblo.zzs);
        zzchdVar.zzag("/getNativeClickMeta", zzblo.zzt);
    }

    public final ListenableFuture zza(final JSONObject jSONObject) {
        return zzgft.zzn(zzgft.zzn(zzgft.zzh(null), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzdpf
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return this.zza.zze(obj);
            }
        }, this.zzb), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzdpe
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzc(jSONObject, (zzchd) obj);
            }
        }, this.zzb);
    }

    public final ListenableFuture zzb(final String str, final String str2, final zzfgt zzfgtVar, final zzfgw zzfgwVar, final com.google.android.gms.ads.internal.client.zzq zzqVar) {
        return zzgft.zzn(zzgft.zzh(null), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzdpd
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzd(zzqVar, zzfgtVar, zzfgwVar, str, str2, obj);
            }
        }, this.zzb);
    }

    final /* synthetic */ ListenableFuture zzc(JSONObject jSONObject, final zzchd zzchdVar) throws Exception {
        final zzccm zzccmVarZza = zzccm.zza(zzchdVar);
        if (this.zza.zzb != null) {
            zzchdVar.zzaj(zzcix.zzd());
        } else {
            zzchdVar.zzaj(zzcix.zze());
        }
        zzchdVar.zzN().zzB(new zzcit() { // from class: com.google.android.gms.internal.ads.zzdpg
            @Override // com.google.android.gms.internal.ads.zzcit
            public final void zza(boolean z, int i, String str, String str2) {
                this.zza.zzf(zzchdVar, zzccmVarZza, z, i, str, str2);
            }
        });
        zzchdVar.zzl("google.afma.nativeAds.renderVideo", jSONObject);
        return zzccmVarZza;
    }

    final /* synthetic */ ListenableFuture zzd(com.google.android.gms.ads.internal.client.zzq zzqVar, zzfgt zzfgtVar, zzfgw zzfgwVar, String str, String str2, Object obj) throws Exception {
        final zzchd zzchdVarZza = this.zzc.zza(zzqVar, zzfgtVar, zzfgwVar);
        final zzccm zzccmVarZza = zzccm.zza(zzchdVarZza);
        if (this.zza.zzb != null) {
            zzh(zzchdVarZza);
            zzchdVarZza.zzaj(zzcix.zzd());
        } else {
            zzdqv zzdqvVarZzb = this.zzd.zzb();
            zzchdVarZza.zzN().zzR(zzdqvVarZzb, zzdqvVarZzb, zzdqvVarZzb, zzdqvVarZzb, zzdqvVarZzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zze, null, null), null, null, this.zzh, this.zzg, this.zzf, null, zzdqvVarZzb, null, null, null, null);
            zzj(zzchdVarZza);
        }
        zzchdVarZza.zzN().zzB(new zzcit() { // from class: com.google.android.gms.internal.ads.zzdph
            @Override // com.google.android.gms.internal.ads.zzcit
            public final void zza(boolean z, int i, String str3, String str4) {
                this.zza.zzg(zzchdVarZza, zzccmVarZza, z, i, str3, str4);
            }
        });
        zzchdVarZza.zzae(str, str2, null);
        return zzccmVarZza;
    }

    final /* synthetic */ ListenableFuture zze(Object obj) throws Exception {
        zzchd zzchdVarZza = this.zzc.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        final zzccm zzccmVarZza = zzccm.zza(zzchdVarZza);
        zzh(zzchdVarZza);
        zzchdVarZza.zzN().zzH(new zzciu() { // from class: com.google.android.gms.internal.ads.zzdpi
            @Override // com.google.android.gms.internal.ads.zzciu
            public final void zza() {
                zzccmVarZza.zzb();
            }
        });
        zzchdVarZza.loadUrl((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdM));
        return zzccmVarZza;
    }

    final /* synthetic */ void zzf(zzchd zzchdVar, zzccm zzccmVar, boolean z, int i, String str, String str2) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdU)).booleanValue()) {
            zzi(zzchdVar, zzccmVar);
            return;
        }
        if (z) {
            zzi(zzchdVar, zzccmVar);
            return;
        }
        zzccmVar.zzd(new zzelj(1, "Native Video WebView failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
    }

    final /* synthetic */ void zzg(zzchd zzchdVar, zzccm zzccmVar, boolean z, int i, String str, String str2) {
        if (z) {
            if (this.zza.zza != null && zzchdVar.zzq() != null) {
                zzchdVar.zzq().zzs(this.zza.zza);
            }
            zzccmVar.zzb();
            return;
        }
        zzccmVar.zzd(new zzelj(1, "Html video Web View failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
    }
}
