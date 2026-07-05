package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzejq implements zzdjp {
    private final zzfgt zza;
    private final zzbte zzb;
    private final AdFormat zzc;
    private zzdad zzd = null;

    zzejq(zzfgt zzfgtVar, zzbte zzbteVar, AdFormat adFormat) {
        this.zza = zzfgtVar;
        this.zzb = zzbteVar;
        this.zzc = adFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzdjp
    public final void zza(boolean z, Context context, zzczy zzczyVar) throws zzdjo {
        boolean zZzs;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int iOrdinal = this.zzc.ordinal();
            if (iOrdinal == 1) {
                zZzs = this.zzb.zzs(ObjectWrapper.wrap(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 5) {
                        zZzs = this.zzb.zzr(ObjectWrapper.wrap(context));
                    }
                    throw new zzdjo("Adapter failed to show.");
                }
                zZzs = this.zzb.zzt(ObjectWrapper.wrap(context));
            }
            if (zZzs) {
                if (this.zzd == null) {
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbx)).booleanValue() || this.zza.zzZ != 2) {
                    return;
                }
                this.zzd.zza();
                return;
            }
            throw new zzdjo("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdjo(th);
        }
    }

    public final void zzb(zzdad zzdadVar) {
        this.zzd = zzdadVar;
    }
}
