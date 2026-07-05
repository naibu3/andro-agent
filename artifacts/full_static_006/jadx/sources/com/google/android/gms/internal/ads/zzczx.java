package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzczx extends zzdez implements zzczp {
    public zzczx(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzczp
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzq(new zzdey() { // from class: com.google.android.gms.internal.ads.zzczw
            @Override // com.google.android.gms.internal.ads.zzdey
            public final void zza(Object obj) {
                ((zzdab) obj).zzq(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczp
    public final void zzb() {
        zzq(new zzdey() { // from class: com.google.android.gms.internal.ads.zzczv
            @Override // com.google.android.gms.internal.ads.zzdey
            public final void zza(Object obj) {
                ((zzdab) obj).zzq(zzfiq.zzd(11, null, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczp
    public final void zzc(final zzdjo zzdjoVar) {
        zzq(new zzdey() { // from class: com.google.android.gms.internal.ads.zzczu
            @Override // com.google.android.gms.internal.ads.zzdey
            public final void zza(Object obj) {
                ((zzdab) obj).zzq(zzfiq.zzd(12, zzdjoVar.getMessage(), null));
            }
        });
    }
}
