package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgqx {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    /* synthetic */ zzgqx(zzgqr zzgqrVar, zzgqw zzgqwVar) {
        this.zza = new HashMap(zzgqrVar.zza);
        this.zzb = new HashMap(zzgqrVar.zzb);
        this.zzc = new HashMap(zzgqrVar.zzc);
        this.zzd = new HashMap(zzgqrVar.zzd);
    }

    public final zzghi zza(zzgqq zzgqqVar, @Nullable zzgic zzgicVar) throws GeneralSecurityException {
        zzgqt zzgqtVar = new zzgqt(zzgqqVar.getClass(), zzgqqVar.zzd(), null);
        if (this.zzb.containsKey(zzgqtVar)) {
            return ((zzgon) this.zzb.get(zzgqtVar)).zza(zzgqqVar, zzgicVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + zzgqtVar.toString() + " available");
    }

    public final zzghx zzb(zzgqq zzgqqVar) throws GeneralSecurityException {
        zzgqt zzgqtVar = new zzgqt(zzgqqVar.getClass(), zzgqqVar.zzd(), null);
        if (this.zzd.containsKey(zzgqtVar)) {
            return ((zzgpq) this.zzd.get(zzgqtVar)).zza(zzgqqVar);
        }
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + zzgqtVar.toString() + " available");
    }

    public final zzgqq zzc(zzghi zzghiVar, Class cls, @Nullable zzgic zzgicVar) throws GeneralSecurityException {
        zzgqv zzgqvVar = new zzgqv(zzghiVar.getClass(), cls, null);
        if (this.zza.containsKey(zzgqvVar)) {
            return ((zzgor) this.zza.get(zzgqvVar)).zza(zzghiVar, zzgicVar);
        }
        throw new GeneralSecurityException("No Key serializer for " + zzgqvVar.toString() + " available");
    }

    public final zzgqq zzd(zzghx zzghxVar, Class cls) throws GeneralSecurityException {
        zzgqv zzgqvVar = new zzgqv(zzghxVar.getClass(), cls, null);
        if (this.zzc.containsKey(zzgqvVar)) {
            return ((zzgpu) this.zzc.get(zzgqvVar)).zza(zzghxVar);
        }
        throw new GeneralSecurityException("No Key Format serializer for " + zzgqvVar.toString() + " available");
    }

    public final boolean zzi(zzgqq zzgqqVar) {
        return this.zzb.containsKey(new zzgqt(zzgqqVar.getClass(), zzgqqVar.zzd(), null));
    }

    public final boolean zzj(zzgqq zzgqqVar) {
        return this.zzd.containsKey(new zzgqt(zzgqqVar.getClass(), zzgqqVar.zzd(), null));
    }
}
