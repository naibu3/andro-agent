package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzbq {
    public final Uri zzc = null;
    public final String zzd = null;
    public final Bundle zze = null;
    public static final zzbq zza = new zzbq(new zzbp());
    private static final String zzf = Integer.toString(0, 36);
    private static final String zzg = Integer.toString(1, 36);
    private static final String zzh = Integer.toString(2, 36);

    @Deprecated
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzbo
    };

    private zzbq(zzbp zzbpVar) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbq)) {
            return false;
        }
        zzbq zzbqVar = (zzbq) obj;
        Uri uri = zzbqVar.zzc;
        if (zzgd.zzG(null, null)) {
            String str = zzbqVar.zzd;
            if (zzgd.zzG(null, null)) {
                Bundle bundle = zzbqVar.zze;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }
}
