package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdhx extends zzdez {
    zzdhx(Set set) {
        super(set);
    }

    public final synchronized void zza(final com.google.android.gms.ads.nonagon.signalgeneration.zzax zzaxVar) {
        zzq(new zzdey() { // from class: com.google.android.gms.internal.ads.zzdhv
            @Override // com.google.android.gms.internal.ads.zzdey
            public final void zza(Object obj) {
                ((zzdhu) obj).zze(zzaxVar);
            }
        });
    }

    public final synchronized void zzb(final String str) {
        zzq(new zzdey() { // from class: com.google.android.gms.internal.ads.zzdhw
            @Override // com.google.android.gms.internal.ads.zzdey
            public final void zza(Object obj) {
                ((zzdhu) obj).zzf(str);
            }
        });
    }
}
