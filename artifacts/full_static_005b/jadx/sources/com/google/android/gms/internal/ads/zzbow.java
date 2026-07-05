package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbow implements zzboo, zzbom {
    private final zzchd zza;

    /* JADX WARN: Multi-variable type inference failed */
    public zzbow(Context context, VersionInfoParcel versionInfoParcel, zzaxd zzaxdVar, com.google.android.gms.ads.internal.zza zzaVar) throws zzchp {
        com.google.android.gms.ads.internal.zzu.zzz();
        zzchd zzchdVarZza = zzchq.zza(context, zzcix.zza(), "", false, false, null, null, versionInfoParcel, null, null, null, zzbdm.zza(), null, null, null, null);
        this.zza = zzchdVarZza;
        ((View) zzchdVarZza).setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        com.google.android.gms.ads.internal.client.zzay.zzb();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzv()) {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (com.google.android.gms.ads.internal.util.zzt.zza.post(runnable)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzm.zzj("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void zza(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("invokeJavascript on adWebView from js");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbos
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzm(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final /* synthetic */ void zzb(String str, String str2) {
        zzbol.zzc(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzboo
    public final void zzc() {
        this.zza.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbok
    public final /* synthetic */ void zzd(String str, Map map) {
        zzbol.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbok
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbol.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzboo
    public final void zzf(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadHtml on adWebView from html");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbot
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzn(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzboo
    public final void zzg(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadHtmlWrapper on adWebView from path: ".concat(String.valueOf(str)));
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzboq
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzo(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzboo
    public final void zzh(String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascript on adWebView from path: ".concat(String.valueOf(str)));
        final String str2 = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbou
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzp(str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzboo
    public final boolean zzi() {
        return this.zza.zzaE();
    }

    @Override // com.google.android.gms.internal.ads.zzboo
    public final zzbpv zzj() {
        return new zzbpv(this);
    }

    @Override // com.google.android.gms.internal.ads.zzboo
    public final void zzk(final zzbpc zzbpcVar) {
        zzciv zzcivVarZzN = this.zza.zzN();
        Objects.requireNonNull(zzbpcVar);
        zzcivVarZzN.zzH(new zzciu() { // from class: com.google.android.gms.internal.ads.zzbor
            @Override // com.google.android.gms.internal.ads.zzciu
            public final void zza() {
                long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
                zzbpc zzbpcVar2 = zzbpcVar;
                final long j = zzbpcVar2.zzc;
                final ArrayList arrayList = zzbpcVar2.zzb;
                arrayList.add(Long.valueOf(jCurrentTimeMillis - j));
                com.google.android.gms.ads.internal.util.zze.zza("LoadNewJavascriptEngine(onEngLoaded) latency is " + String.valueOf(arrayList.get(0)) + " ms.");
                zzfuv zzfuvVar = com.google.android.gms.ads.internal.util.zzt.zza;
                final zzbpt zzbptVar = zzbpcVar2.zza;
                final zzbps zzbpsVar = zzbpcVar2.zzd;
                final zzboo zzbooVar = zzbpcVar2.zze;
                zzfuvVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzboy
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbptVar.zzi(zzbpsVar, zzbooVar, arrayList, j);
                    }
                }, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzc)).intValue());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbol.zzd(this, str, jSONObject);
    }

    final /* synthetic */ void zzm(String str) {
        this.zza.zza(str);
    }

    final /* synthetic */ void zzn(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    final /* synthetic */ void zzo(String str) {
        this.zza.loadUrl(str);
    }

    final /* synthetic */ void zzp(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzq(String str, zzblp zzblpVar) {
        this.zza.zzag(str, new zzbov(this, zzblpVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzr(String str, final zzblp zzblpVar) {
        this.zza.zzaA(str, new Predicate() { // from class: com.google.android.gms.internal.ads.zzbop
            @Override // com.google.android.gms.common.util.Predicate
            public final boolean apply(Object obj) {
                zzblp zzblpVar2 = (zzblp) obj;
                if (zzblpVar2 instanceof zzbov) {
                    return ((zzbov) zzblpVar2).zzb.equals(zzblpVar);
                }
                return false;
            }
        });
    }
}
