package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzafy extends zzade {
    public zzafy(final zzaeg zzaegVar, int i, long j, long j2) {
        long j3;
        Objects.requireNonNull(zzaegVar);
        zzadb zzadbVar = new zzadb() { // from class: com.google.android.gms.internal.ads.zzafv
            @Override // com.google.android.gms.internal.ads.zzadb
            public final long zza(long j4) {
                return zzaegVar.zzb(j4);
            }
        };
        zzafx zzafxVar = new zzafx(zzaegVar, i, null);
        long jZza = zzaegVar.zza();
        long j4 = zzaegVar.zzj;
        int i2 = zzaegVar.zzd;
        if (i2 > 0) {
            j3 = ((i2 + zzaegVar.zzc) / 2) + 1;
        } else {
            int i3 = zzaegVar.zza;
            int i4 = zzaegVar.zzb;
            long j5 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            if (i3 == i4 && i3 > 0) {
                j5 = i3;
            }
            j3 = (((j5 * zzaegVar.zzg) * zzaegVar.zzh) / 8) + 64;
        }
        super(zzadbVar, zzafxVar, jZza, 0L, j4, j, j2, j3, Math.max(6, zzaegVar.zzc));
    }
}
