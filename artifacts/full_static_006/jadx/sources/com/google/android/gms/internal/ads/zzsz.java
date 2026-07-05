package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzsz implements zztl {
    private final zzfyw zzb;
    private final zzfyw zzc;
    private boolean zzd;

    public zzsz(int i) {
        zzsx zzsxVar = new zzsx(i);
        zzsy zzsyVar = new zzsy(i);
        this.zzb = zzsxVar;
        this.zzc = zzsyVar;
        this.zzd = true;
    }

    static /* synthetic */ HandlerThread zza(int i) {
        return new HandlerThread(zztb.zzr(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }

    static /* synthetic */ HandlerThread zzb(int i) {
        return new HandlerThread(zztb.zzr(i, "ExoPlayer:MediaCodecQueueingThread:"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c A[Catch: Exception -> 0x0069, TryCatch #1 {Exception -> 0x0069, blocks: (B:4:0x001a, B:6:0x001e, B:9:0x0027, B:11:0x002d, B:13:0x0035, B:15:0x004c, B:14:0x003c), top: B:31:0x001a }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.zzta] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.ads.zztb] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zztb zzc(zztk zztkVar) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        zztn zztfVar;
        int i;
        String str = zztkVar.zza.zza;
        ?? r2 = 0;
        r2 = 0;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                if (this.zzd) {
                    zzan zzanVar = zztkVar.zzc;
                    if (zzgd.zza >= 34 && (zzgd.zza >= 35 || zzcg.zzh(zzanVar.zzn))) {
                        zztfVar = new zzum(mediaCodecCreateByCodecName);
                        i = 4;
                    } else {
                        zztfVar = new zztf(mediaCodecCreateByCodecName, zzb(((zzsy) this.zzc).zza));
                        i = 0;
                    }
                    zztb zztbVar = new zztb(mediaCodecCreateByCodecName, zza(((zzsx) this.zzb).zza), zztfVar, r2);
                    try {
                        Trace.endSection();
                        zztb.zzh(zztbVar, zztkVar.zzb, zztkVar.zzd, null, i);
                        return zztbVar;
                    } catch (Exception e) {
                        e = e;
                        r2 = zztbVar;
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodecCreateByCodecName = null;
        }
        if (r2 != 0) {
            r2.zzl();
        } else if (mediaCodecCreateByCodecName != null) {
            mediaCodecCreateByCodecName.release();
        }
        throw e;
    }

    @Override // com.google.android.gms.internal.ads.zztl
    public final /* bridge */ /* synthetic */ zztm zzd(zztk zztkVar) throws IOException {
        throw null;
    }

    public final void zze(boolean z) {
        this.zzd = true;
    }
}
