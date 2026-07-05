package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzxo extends zzvc {
    private final zzbu zzd;

    public zzxo(zzdc zzdcVar, zzbu zzbuVar) {
        super(zzdcVar);
        this.zzd = zzbuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvc, com.google.android.gms.internal.ads.zzdc
    public final zzdb zze(int i, zzdb zzdbVar, long j) {
        this.zzc.zze(i, zzdbVar, j);
        zzbu zzbuVar = this.zzd;
        zzdbVar.zze = zzbuVar;
        zzbn zzbnVar = zzbuVar.zzd;
        zzdbVar.zzd = null;
        return zzdbVar;
    }
}
