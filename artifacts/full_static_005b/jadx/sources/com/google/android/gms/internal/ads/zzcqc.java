package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzcqc implements zzgfp {
    final /* synthetic */ zzfoe zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcqd zzc;

    zzcqc(zzcqd zzcqdVar, zzfoe zzfoeVar, String str) {
        this.zza = zzfoeVar;
        this.zzb = str;
        this.zzc = zzcqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(final Throwable th) {
        zzgge zzggeVar = this.zzc.zzg;
        final zzfoe zzfoeVar = this.zza;
        final String str = this.zzb;
        zzggeVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqa
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzko)).booleanValue();
                zzcqc zzcqcVar = this.zza;
                Throwable th2 = th;
                if (zBooleanValue) {
                    zzcqd zzcqdVar = zzcqcVar.zzc;
                    zzcqdVar.zzb = zzbwj.zzc(zzcqdVar.zzc);
                    zzcqcVar.zzc.zzb.zzh(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    zzcqd zzcqdVar2 = zzcqcVar.zzc;
                    zzcqdVar2.zza = zzbwj.zza(zzcqdVar2.zzc);
                    zzcqcVar.zzc.zza.zzh(th2, "AttributionReportingSampled.registerSourceAndPingClickUrl");
                }
                zzfoeVar.zzc(str, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcqd zzcqdVar = this.zzc;
        final zzfoe zzfoeVar = this.zza;
        final String str = (String) obj;
        zzcqdVar.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqb
            @Override // java.lang.Runnable
            public final void run() {
                zzfoeVar.zzc(str, null);
            }
        });
    }
}
