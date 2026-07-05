package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdzo implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzdzo(zzhlg zzhlgVar, zzhlg zzhlgVar2) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* synthetic */ Object zzb() {
        zzflt zzfltVar = (zzflt) this.zza.zzb();
        final CookieManager cookieManagerZza = com.google.android.gms.ads.internal.zzu.zzq().zza((Context) this.zzb.zzb());
        zzflk zzflkVarZzi = zzfld.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdzl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = cookieManagerZza;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaO));
            }
        }, zzfln.WEBVIEW_COOKIE, zzfltVar).zzi(1L, TimeUnit.SECONDS);
        final zzfkw zzfkwVar = new zzfkw() { // from class: com.google.android.gms.internal.ads.zzdzm
            @Override // com.google.android.gms.internal.ads.zzfkw
            public final Object zza(Object obj) {
                return "";
            }
        };
        return zzflkVarZzi.zzc(Exception.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzfle
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return zzgft.zzh("");
            }
        }).zza();
    }
}
