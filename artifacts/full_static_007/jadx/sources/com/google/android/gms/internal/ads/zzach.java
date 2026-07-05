package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzach {
    private final Handler zza;
    private final zzaci zzb;

    public zzach(Handler handler, zzaci zzaciVar) {
        this.zza = zzaciVar == null ? null : handler;
        this.zzb = zzaciVar;
    }

    public final void zza(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabx
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzg(str, j, j2);
                }
            });
        }
    }

    public final void zzb(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacg
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzh(str);
                }
            });
        }
    }

    public final void zzc(final zzix zzixVar) {
        zzixVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacf
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzi(zzixVar);
                }
            });
        }
    }

    public final void zzd(final int i, final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabz
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj(i, j);
                }
            });
        }
    }

    public final void zze(final zzix zzixVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacd
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzk(zzixVar);
                }
            });
        }
    }

    public final void zzf(final zzan zzanVar, final zziy zziyVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzace
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzl(zzanVar, zziyVar);
                }
            });
        }
    }

    final /* synthetic */ void zzg(String str, long j, long j2) {
        int i = zzgd.zza;
        this.zzb.zzp(str, j, j2);
    }

    final /* synthetic */ void zzh(String str) {
        int i = zzgd.zza;
        this.zzb.zzq(str);
    }

    final /* synthetic */ void zzi(zzix zzixVar) {
        zzixVar.zza();
        int i = zzgd.zza;
        this.zzb.zzr(zzixVar);
    }

    final /* synthetic */ void zzj(int i, long j) {
        int i2 = zzgd.zza;
        this.zzb.zzl(i, j);
    }

    final /* synthetic */ void zzk(zzix zzixVar) {
        int i = zzgd.zza;
        this.zzb.zzs(zzixVar);
    }

    final /* synthetic */ void zzl(zzan zzanVar, zziy zziyVar) {
        int i = zzgd.zza;
        this.zzb.zzu(zzanVar, zziyVar);
    }

    final /* synthetic */ void zzm(Object obj, long j) {
        int i = zzgd.zza;
        this.zzb.zzm(obj, j);
    }

    final /* synthetic */ void zzn(long j, int i) {
        int i2 = zzgd.zza;
        this.zzb.zzt(j, i);
    }

    final /* synthetic */ void zzo(Exception exc) {
        int i = zzgd.zza;
        this.zzb.zzo(exc);
    }

    final /* synthetic */ void zzp(zzdv zzdvVar) {
        int i = zzgd.zza;
        this.zzb.zzv(zzdvVar);
    }

    public final void zzq(final Object obj) {
        Handler handler = this.zza;
        if (handler != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaca
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzm(obj, jElapsedRealtime);
                }
            });
        }
    }

    public final void zzr(final long j, final int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacb
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzn(j, i);
                }
            });
        }
    }

    public final void zzs(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacc
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzo(exc);
                }
            });
        }
    }

    public final void zzt(final zzdv zzdvVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaby
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzp(zzdvVar);
                }
            });
        }
    }
}
