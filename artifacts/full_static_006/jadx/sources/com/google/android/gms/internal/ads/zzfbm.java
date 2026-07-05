package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfbm implements zzexw {
    private final zzcby zza;
    private final boolean zzb;
    private final boolean zzc;
    private final ScheduledExecutorService zzd;
    private final zzgge zze;
    private final String zzf;
    private final zzcbn zzg;

    zzfbm(zzcby zzcbyVar, boolean z, boolean z2, zzcbn zzcbnVar, zzgge zzggeVar, String str, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzcbyVar;
        this.zzb = z;
        this.zzc = z2;
        this.zzg = zzcbnVar;
        this.zze = zzggeVar;
        this.zzf = str;
        this.zzd = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 50;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final ListenableFuture zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhq)).booleanValue() && this.zzc) {
            return zzgft.zzh(null);
        }
        if (!this.zzb) {
            return zzgft.zzh(null);
        }
        return zzgft.zze(zzgft.zzo(zzgft.zzm(zzgft.zzh(null), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzfbk
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new zzfbn(str);
            }
        }, this.zze), ((Long) zzbgy.zzc.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzd), Exception.class, new zzfxu() { // from class: com.google.android.gms.internal.ads.zzfbl
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                this.zza.zzc((Exception) obj);
                return null;
            }
        }, this.zze);
    }

    final /* synthetic */ zzfbn zzc(Exception exc) {
        this.zza.zzw(exc, "TrustlessTokenSignal");
        return null;
    }
}
