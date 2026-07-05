package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzqr extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzan zzc;

    public zzqr(int i, int i2, int i3, int i4, zzan zzanVar, boolean z, Exception exc) {
        String strValueOf = String.valueOf(zzanVar);
        StringBuilder sb = new StringBuilder("AudioTrack init failed ");
        sb.append(i);
        sb.append(" Config(");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(") ");
        sb.append(strValueOf);
        sb.append(true != z ? "" : " (recoverable)");
        super(sb.toString(), exc);
        this.zza = i;
        this.zzb = z;
        this.zzc = zzanVar;
    }
}
