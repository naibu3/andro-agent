package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzbya implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbyc zzb;

    zzbya(zzbyc zzbycVar, Context context) {
        this.zza = context;
        this.zzb = zzbycVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzbxz zzbxzVarZza;
        zzbyb zzbybVar = (zzbyb) this.zzb.zza.get(this.zza);
        if (zzbybVar != null) {
            zzbxzVarZza = zzbybVar.zza + ((Long) zzbfz.zza.zze()).longValue() < com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() ? new zzbxy(this.zza).zza() : new zzbxy(this.zza, zzbybVar.zzb).zza();
        }
        zzbyc zzbycVar = this.zzb;
        zzbycVar.zza.put(this.zza, new zzbyb(zzbycVar, zzbxzVarZza));
        return zzbxzVarZza;
    }
}
