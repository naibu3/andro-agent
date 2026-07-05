package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public class zzto extends zzil {
    public final zztp zza;
    public final String zzb;

    public zzto(Throwable th, zztp zztpVar) {
        super("Decoder failed: ".concat(String.valueOf(zztpVar == null ? null : zztpVar.zza)), th);
        this.zza = zztpVar;
        int i = zzgd.zza;
        this.zzb = th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null;
    }
}
