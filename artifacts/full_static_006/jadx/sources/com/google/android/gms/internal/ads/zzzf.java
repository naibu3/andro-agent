package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzzf {
    public final zzde zza;
    public final int[] zzb;

    public zzzf(zzde zzdeVar, int[] iArr, int i) {
        if (iArr.length == 0) {
            zzfk.zzd("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzdeVar;
        this.zzb = iArr;
    }
}
