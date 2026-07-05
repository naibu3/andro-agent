package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzaw {
    private String zza;
    private Uri zzb;
    private final zzay zzc = new zzay();
    private final zzbf zzd = new zzbf(null);
    private final List zze = Collections.emptyList();
    private final zzgbc zzf = zzgbc.zzm();
    private final zzbi zzg = new zzbi();
    private final zzbq zzh = zzbq.zza;

    public final zzaw zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzaw zzb(Uri uri) {
        this.zzb = uri;
        return this;
    }

    public final zzbu zzc() {
        zzbn zzbnVar;
        Uri uri = this.zzb;
        if (uri != null) {
            zzbnVar = new zzbn(uri, null, null, null, this.zze, null, this.zzf, null, -9223372036854775807L, null);
        } else {
            zzbnVar = null;
        }
        String str = this.zza;
        if (str == null) {
            str = "";
        }
        return new zzbu(str, new zzbc(this.zzc, null), zzbnVar, new zzbk(this.zzg), zzca.zza, this.zzh, null);
    }
}
