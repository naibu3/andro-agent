package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzecf {
    private final zzgge zza;
    private final zzgge zzb;
    private final zzecx zzc;

    zzecf(zzgge zzggeVar, zzgge zzggeVar2, zzecx zzecxVar) {
        this.zza = zzggeVar;
        this.zzb = zzggeVar2;
        this.zzc = zzecxVar;
    }

    final /* synthetic */ ListenableFuture zza(zzbwv zzbwvVar) throws Exception {
        return this.zzc.zza(zzbwvVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlC)).longValue());
    }

    public final ListenableFuture zzb(final zzbwv zzbwvVar) {
        String str = zzbwvVar.zzb;
        com.google.android.gms.ads.internal.zzu.zzp();
        return zzgft.zzn(zzgft.zzf(zzgfk.zzu(com.google.android.gms.ads.internal.util.zzt.zzC(str) ? zzgft.zzg(new zzebh(1, "Ads signal service force local")) : zzgft.zzf(zzgft.zzk(new zzgez() { // from class: com.google.android.gms.internal.ads.zzecb
            @Override // com.google.android.gms.internal.ads.zzgez
            public final ListenableFuture zza() {
                return this.zza.zza(zzbwvVar);
            }
        }, this.zza), ExecutionException.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzecc
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                ExecutionException executionException = (ExecutionException) obj;
                Throwable cause = executionException.getCause();
                Throwable cause2 = executionException;
                if (cause != null) {
                    cause2 = executionException.getCause();
                }
                return zzgft.zzg(cause2);
            }
        }, this.zzb)), zzebh.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzecd
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return zzgft.zzh(null);
            }
        }, this.zzb), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzece
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                InputStream inputStream = (InputStream) obj;
                JSONObject jSONObject = new JSONObject();
                if (inputStream == null) {
                    return zzgft.zzh(jSONObject);
                }
                try {
                    com.google.android.gms.ads.internal.zzu.zzp();
                    jSONObject = new JSONObject(com.google.android.gms.ads.internal.util.zzt.zzN(new InputStreamReader(inputStream)));
                } catch (IOException | JSONException e) {
                    com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "AdsServiceSignalTask.startAdsServiceSignalTask");
                }
                return zzgft.zzh(jSONObject);
            }
        }, this.zzb);
    }
}
