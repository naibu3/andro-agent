package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzqu extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzan zzc;

    public zzqu(int i, zzan zzanVar, boolean z) {
        super("AudioTrack write failed: " + i);
        this.zzb = z;
        this.zza = i;
        this.zzc = zzanVar;
    }
}
