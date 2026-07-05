package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzexh implements zzexw {
    private final zzcau zza;
    private final zzgge zzb;
    private final Context zzc;

    public zzexh(zzcau zzcauVar, zzgge zzggeVar, Context context) {
        this.zza = zzcauVar;
        this.zzb = zzggeVar;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 34;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final ListenableFuture zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzexg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ zzexi zzc() throws Exception {
        if (!this.zza.zzp(this.zzc)) {
            return new zzexi(null, null, null, null, null);
        }
        String strZzd = this.zza.zzd(this.zzc);
        String str = strZzd == null ? "" : strZzd;
        String strZzb = this.zza.zzb(this.zzc);
        String str2 = strZzb == null ? "" : strZzb;
        String strZza = this.zza.zza(this.zzc);
        String str3 = strZza == null ? "" : strZza;
        String str4 = true != this.zza.zzp(this.zzc) ? null : "fa";
        return new zzexi(str, str2, str3, str4 == null ? "" : str4, "TIME_OUT".equals(str2) ? (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzag) : null);
    }
}
