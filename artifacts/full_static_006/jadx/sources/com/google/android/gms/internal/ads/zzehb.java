package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public interface zzehb {
    zzehg zza(String str, WebView webView, String str2, String str3, String str4, zzehd zzehdVar, zzehc zzehcVar, String str5);

    zzehg zzb(String str, WebView webView, String str2, String str3, String str4, String str5, zzehd zzehdVar, zzehc zzehcVar, String str6);

    zzfou zze(VersionInfoParcel versionInfoParcel, WebView webView, boolean z);

    String zzf(Context context);

    void zzg(zzfoj zzfojVar, View view);

    void zzh(zzfou zzfouVar, View view);

    void zzi(zzfoj zzfojVar);

    void zzj(zzfoj zzfojVar, View view);

    void zzk(zzfoj zzfojVar);

    boolean zzl(Context context);

    void zzm(zzfou zzfouVar, zzchs zzchsVar);
}
