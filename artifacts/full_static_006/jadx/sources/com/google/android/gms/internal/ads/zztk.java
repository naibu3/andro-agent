package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zztk {
    public final zztp zza;
    public final MediaFormat zzb;
    public final zzan zzc;
    public final Surface zzd;
    public final MediaCrypto zze = null;

    private zztk(zztp zztpVar, MediaFormat mediaFormat, zzan zzanVar, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.zza = zztpVar;
        this.zzb = mediaFormat;
        this.zzc = zzanVar;
        this.zzd = surface;
    }

    public static zztk zza(zztp zztpVar, MediaFormat mediaFormat, zzan zzanVar, MediaCrypto mediaCrypto) {
        return new zztk(zztpVar, mediaFormat, zzanVar, null, null, 0);
    }

    public static zztk zzb(zztp zztpVar, MediaFormat mediaFormat, zzan zzanVar, Surface surface, MediaCrypto mediaCrypto) {
        return new zztk(zztpVar, mediaFormat, zzanVar, surface, null, 0);
    }
}
