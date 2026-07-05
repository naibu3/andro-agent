package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdwa implements AppEventListener, zzdcg, com.google.android.gms.ads.internal.client.zza, zzczl, zzdaf, zzdag, zzdaz, zzczo, zzflu {
    private final List zza;
    private final zzdvo zzb;
    private long zzc;

    public zzdwa(zzdvo zzdvoVar, zzcjd zzcjdVar) {
        this.zzb = zzdvoVar;
        this.zza = Collections.singletonList(zzcjdVar);
    }

    private final void zzg(Class cls, String str, Object... objArr) throws IOException {
        this.zzb.zza(this.zza, "Event-".concat(String.valueOf(cls.getSimpleName())), str, objArr);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() throws IOException {
        zzg(com.google.android.gms.ads.internal.client.zza.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) throws IOException {
        zzg(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zza() throws IOException {
        zzg(zzczl.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzb() throws IOException {
        zzg(zzczl.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzc() throws IOException {
        zzg(zzczl.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzflu
    public final void zzd(zzfln zzflnVar, String str) throws IOException {
        zzg(zzflm.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) throws IOException {
        zzg(zzczo.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzflu
    public final void zzdC(zzfln zzflnVar, String str) throws IOException {
        zzg(zzflm.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzflu
    public final void zzdD(zzfln zzflnVar, String str, Throwable th) throws IOException {
        zzg(zzflm.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzflu
    public final void zzdE(zzfln zzflnVar, String str) throws IOException {
        zzg(zzflm.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzdj(Context context) throws IOException {
        zzg(zzdag.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzdl(Context context) throws IOException {
        zzg(zzdag.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzdm(Context context) throws IOException {
        zzg(zzdag.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final void zzdn(zzbxu zzbxuVar) throws IOException {
        this.zzc = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
        zzg(zzdcg.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final void zzdo(zzfhf zzfhfVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    @ParametersAreNonnullByDefault
    public final void zzds(zzbyh zzbyhVar, String str, String str2) throws IOException {
        zzg(zzczl.class, "onRewarded", zzbyhVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zze() throws IOException {
        zzg(zzczl.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzf() throws IOException {
        zzg(zzczl.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdaf
    public final void zzr() throws IOException {
        zzg(zzdaf.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdaz
    public final void zzs() throws IOException {
        com.google.android.gms.ads.internal.util.zze.zza("Ad Request Latency : " + (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zzc));
        zzg(zzdaz.class, "onAdLoaded", new Object[0]);
    }
}
