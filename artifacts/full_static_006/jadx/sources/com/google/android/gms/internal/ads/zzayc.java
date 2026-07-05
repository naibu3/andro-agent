package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzayc implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzaye zzb;

    zzayc(zzaye zzayeVar, int i, boolean z) {
        this.zza = i;
        this.zzb = zzayeVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        zzaus zzausVarZza;
        int i = this.zza;
        zzaye zzayeVar = this.zzb;
        if (i > 0) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = zzayeVar.zza.getPackageManager().getPackageInfo(zzayeVar.zza.getPackageName(), 0);
            Context context = zzayeVar.zza;
            zzausVarZza = zzfrm.zza(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            zzausVarZza = null;
        }
        this.zzb.zzm = zzausVarZza;
        if (this.zza < 4) {
            if (zzausVarZza != null && zzausVarZza.zzar() && !zzausVarZza.zzi().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzausVarZza.zzas() && zzausVarZza.zzg().zze() && zzausVarZza.zzg().zza() != -2) {
                return;
            }
            this.zzb.zzo(this.zza + 1, true);
        }
    }
}
