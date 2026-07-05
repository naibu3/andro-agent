package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzhli extends CustomTabsServiceConnection {
    private final WeakReference zza;

    public zzhli(zzbfm zzbfmVar) {
        this.zza = new WeakReference(zzbfmVar);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        zzbfm zzbfmVar = (zzbfm) this.zza.get();
        if (zzbfmVar != null) {
            zzbfmVar.zzc(customTabsClient);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbfm zzbfmVar = (zzbfm) this.zza.get();
        if (zzbfmVar != null) {
            zzbfmVar.zzd();
        }
    }
}
