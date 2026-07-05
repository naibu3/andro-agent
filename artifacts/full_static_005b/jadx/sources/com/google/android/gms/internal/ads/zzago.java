package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzago extends zzaei {
    final /* synthetic */ zzaet zza;
    final /* synthetic */ zzagp zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzago(zzagp zzagpVar, zzaet zzaetVar, zzaet zzaetVar2) {
        super(zzaetVar);
        this.zza = zzaetVar2;
        this.zzb = zzagpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaei, com.google.android.gms.internal.ads.zzaet
    public final zzaer zzg(long j) {
        zzaer zzaerVarZzg = this.zza.zzg(j);
        zzaeu zzaeuVar = zzaerVarZzg.zza;
        zzaeu zzaeuVar2 = new zzaeu(zzaeuVar.zzb, zzaeuVar.zzc + this.zzb.zzb);
        zzaeu zzaeuVar3 = zzaerVarZzg.zzb;
        return new zzaer(zzaeuVar2, new zzaeu(zzaeuVar3.zzb, zzaeuVar3.zzc + this.zzb.zzb));
    }
}
