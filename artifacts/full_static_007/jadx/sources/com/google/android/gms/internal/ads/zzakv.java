package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzakv implements zzaet {
    final /* synthetic */ zzakw zza;

    /* synthetic */ zzakv(zzakw zzakwVar, zzaku zzakuVar) {
        this.zza = zzakwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final long zza() {
        zzakw zzakwVar = this.zza;
        return zzakwVar.zzd.zzf(zzakwVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final zzaer zzg(long j) {
        zzakw zzakwVar = this.zza;
        long jZzg = zzakwVar.zzd.zzg(j);
        long j2 = zzakwVar.zzb;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(jZzg);
        zzakw zzakwVar2 = this.zza;
        long jLongValue = j2 + bigIntegerValueOf.multiply(BigInteger.valueOf(zzakwVar2.zzc - zzakwVar2.zzb)).divide(BigInteger.valueOf(this.zza.zzf)).longValue();
        zzaeu zzaeuVar = new zzaeu(j, Math.max(this.zza.zzb, Math.min(jLongValue - 30000, r0.zzc - 1)));
        return new zzaer(zzaeuVar, zzaeuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final boolean zzh() {
        return true;
    }
}
