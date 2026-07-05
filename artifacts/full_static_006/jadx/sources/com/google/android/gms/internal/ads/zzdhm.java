package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdhm {
    private final List zza;
    private final zzfoe zzb;
    private boolean zzc;

    public zzdhm(zzfgt zzfgtVar, zzfoe zzfoeVar) {
        this.zza = zzfgtVar.zzq;
        this.zzb = zzfoeVar;
    }

    public final void zza() {
        if (this.zzc) {
            return;
        }
        this.zzb.zzd(this.zza);
        this.zzc = true;
    }
}
