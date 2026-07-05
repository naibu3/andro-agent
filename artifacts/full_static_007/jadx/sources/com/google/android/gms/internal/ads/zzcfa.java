package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcfa {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzasu zzasuVar;
        zzast zzastVar;
        long j = this.zza;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            Iterator it = new zzasp(new zzcez(byteBufferDuplicate), zzcfc.zzb).zze().iterator();
            while (true) {
                zzasuVar = null;
                if (!it.hasNext()) {
                    zzastVar = null;
                    break;
                }
                zzasr zzasrVar = (zzasr) it.next();
                if (zzasrVar instanceof zzast) {
                    zzastVar = (zzast) zzasrVar;
                    break;
                }
            }
            Iterator it2 = zzastVar.zze().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzasr zzasrVar2 = (zzasr) it2.next();
                if (zzasrVar2 instanceof zzasu) {
                    zzasuVar = (zzasu) zzasrVar2;
                    break;
                }
            }
            long jZzd = (zzasuVar.zzd() * 1000) / zzasuVar.zze();
            this.zza = jZzd;
            return jZzd;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
