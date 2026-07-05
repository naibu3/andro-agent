package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zztt extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zztp zzc;
    public final String zzd;
    public final zztt zze;

    public zztt(zzan zzanVar, Throwable th, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + zzanVar.toString(), th, zzanVar.zzn, false, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_" + Math.abs(i), null);
    }

    static /* bridge */ /* synthetic */ zztt zza(zztt zzttVar, zztt zzttVar2) {
        return new zztt(zzttVar.getMessage(), zzttVar.getCause(), zzttVar.zza, false, zzttVar.zzc, zzttVar.zzd, zzttVar2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zztt(zzan zzanVar, Throwable th, boolean z, zztp zztpVar) {
        String str = "Decoder init failed: " + zztpVar.zza + ", " + zzanVar.toString();
        String str2 = zzanVar.zzn;
        int i = zzgd.zza;
        this(str, th, str2, false, zztpVar, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
    }

    private zztt(String str, Throwable th, String str2, boolean z, zztp zztpVar, String str3, zztt zzttVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zztpVar;
        this.zzd = str3;
        this.zze = zzttVar;
    }
}
