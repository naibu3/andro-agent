package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzcay implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzcaz zza;
    private final String zzb;

    public zzcay(zzcaz zzcazVar, String str) {
        this.zza = zzcazVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.zza) {
            for (zzcax zzcaxVar : this.zza.zzb) {
                zzcaxVar.zza.zzb(zzcaxVar.zzb, sharedPreferences, this.zzb, str);
            }
        }
    }
}
