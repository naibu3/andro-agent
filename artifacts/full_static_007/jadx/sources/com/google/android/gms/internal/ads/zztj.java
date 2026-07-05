package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.Trace;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zztj implements zztl {
    private final Context zzb;

    @Deprecated
    public zztj() {
        this.zzb = null;
    }

    public zztj(Context context) {
        this.zzb = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.zzuk] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3 */
    @Override // com.google.android.gms.internal.ads.zztl
    public final zztm zzd(zztk zztkVar) throws Throwable {
        MediaCodec mediaCodecCreateByCodecName;
        Context context;
        int i = zzgd.zza;
        if (i >= 23 && (i >= 31 || ((context = this.zzb) != null && zzgd.zza >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            int iZzb = zzcg.zzb(zztkVar.zzc.zzn);
            zzfk.zze("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(zzgd.zzC(iZzb)));
            zzsz zzszVar = new zzsz(iZzb);
            zzszVar.zze(true);
            return zzszVar.zzc(zztkVar);
        }
        MediaCodec mediaCodec = 0;
        mediaCodec = 0;
        try {
            String str = zztkVar.zza.zza;
            Trace.beginSection("createCodec:".concat(str));
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            Trace.endSection();
        } catch (IOException e) {
            e = e;
        } catch (RuntimeException e2) {
            e = e2;
        }
        try {
            Trace.beginSection("configureCodec");
            mediaCodecCreateByCodecName.configure(zztkVar.zzb, zztkVar.zzd, (MediaCrypto) null, 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodecCreateByCodecName.start();
            Trace.endSection();
            return new zzul(mediaCodecCreateByCodecName, mediaCodec);
        } catch (IOException | RuntimeException e3) {
            e = e3;
            mediaCodec = mediaCodecCreateByCodecName;
            if (mediaCodec != 0) {
                mediaCodec.release();
            }
            throw e;
        }
    }
}
