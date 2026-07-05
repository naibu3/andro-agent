package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzanj implements Comparable {
    public final int zza;
    public final zzand zzb;

    public zzanj(int i, zzand zzandVar) {
        this.zza = i;
        this.zzb = zzandVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.zza, ((zzanj) obj).zza);
    }
}
