package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzanh {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzanf
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((zzanh) obj).zzb.zzb, ((zzanh) obj2).zzb.zzb);
        }
    };
    private final zzani zzb;
    private final int zzc;

    /* synthetic */ zzanh(zzani zzaniVar, int i, zzang zzangVar) {
        this.zzb = zzaniVar;
        this.zzc = i;
    }
}
