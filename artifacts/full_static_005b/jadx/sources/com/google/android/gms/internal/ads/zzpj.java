package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzpj {
    public static final zzpj zza;
    public final String zzb;
    private final zzpi zzc;
    private final Object zzd;

    static {
        zza = zzgd.zza < 31 ? new zzpj("") : new zzpj(zzpi.zza, "");
    }

    public zzpj(LogSessionId logSessionId, String str) {
        this(new zzpi(logSessionId), str);
    }

    private zzpj(zzpi zzpiVar, String str) {
        this.zzc = zzpiVar;
        this.zzb = str;
        this.zzd = new Object();
    }

    public zzpj(String str) {
        zzeq.zzf(zzgd.zza < 31);
        this.zzb = str;
        this.zzc = null;
        this.zzd = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzpj)) {
            return false;
        }
        zzpj zzpjVar = (zzpj) obj;
        return Objects.equals(this.zzb, zzpjVar.zzb) && Objects.equals(this.zzc, zzpjVar.zzc) && Objects.equals(this.zzd, zzpjVar.zzd);
    }

    public final int hashCode() {
        return Objects.hash(this.zzb, this.zzc, this.zzd);
    }

    public final LogSessionId zza() {
        zzpi zzpiVar = this.zzc;
        zzpiVar.getClass();
        return zzpiVar.zzb;
    }
}
