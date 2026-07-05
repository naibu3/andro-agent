package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzeja implements zzehl {
    private final Context zza;
    private final zzdjh zzb;
    private final Executor zzc;
    private final zzfgs zzd;

    public zzeja(Context context, Executor executor, zzdjh zzdjhVar, zzfgs zzfgsVar) {
        this.zza = context;
        this.zzb = zzdjhVar;
        this.zzc = executor;
        this.zzd = zzfgsVar;
    }

    private static String zzd(zzfgt zzfgtVar) {
        try {
            return zzfgtVar.zzw.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final ListenableFuture zza(final zzfhf zzfhfVar, final zzfgt zzfgtVar) {
        String strZzd = zzd(zzfgtVar);
        final Uri uri = strZzd != null ? Uri.parse(strZzd) : null;
        return zzgft.zzn(zzgft.zzh(null), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzeiy
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzc(uri, zzfhfVar, zzfgtVar, obj);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final boolean zzb(zzfhf zzfhfVar, zzfgt zzfgtVar) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbfm.zzg(context) && !TextUtils.isEmpty(zzd(zzfgtVar));
    }

    final /* synthetic */ ListenableFuture zzc(Uri uri, zzfhf zzfhfVar, zzfgt zzfgtVar, Object obj) throws Exception {
        try {
            CustomTabsIntent customTabsIntentBuild = new CustomTabsIntent.Builder().build();
            customTabsIntentBuild.intent.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(customTabsIntentBuild.intent, null);
            final zzccn zzccnVar = new zzccn();
            zzdih zzdihVarZze = this.zzb.zze(new zzcvf(zzfhfVar, zzfgtVar, null), new zzdik(new zzdjp() { // from class: com.google.android.gms.internal.ads.zzeiz
                @Override // com.google.android.gms.internal.ads.zzdjp
                public final void zza(boolean z, Context context, zzczy zzczyVar) {
                    zzccn zzccnVar2 = zzccnVar;
                    try {
                        com.google.android.gms.ads.internal.zzu.zzi();
                        com.google.android.gms.ads.internal.overlay.zzn.zza(context, (AdOverlayInfoParcel) zzccnVar2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }, null));
            zzccnVar.zzc(new AdOverlayInfoParcel(zzcVar, null, zzdihVarZze.zza(), null, new VersionInfoParcel(0, 0, false), null, null));
            this.zzd.zza();
            return zzgft.zzh(zzdihVarZze.zzg());
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
