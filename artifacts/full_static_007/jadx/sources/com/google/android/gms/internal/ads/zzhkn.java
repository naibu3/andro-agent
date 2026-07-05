package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzhkn implements zzhkp {
    private zzhky zza;

    public static void zza(zzhky zzhkyVar, zzhky zzhkyVar2) {
        zzhkn zzhknVar = (zzhkn) zzhkyVar;
        if (zzhknVar.zza != null) {
            throw new IllegalStateException();
        }
        zzhknVar.zza = zzhkyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final Object zzb() {
        zzhky zzhkyVar = this.zza;
        if (zzhkyVar != null) {
            return zzhkyVar.zzb();
        }
        throw new IllegalStateException();
    }
}
