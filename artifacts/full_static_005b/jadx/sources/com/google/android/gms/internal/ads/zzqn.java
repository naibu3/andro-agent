package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzqn {
    private final Handler zza;
    private final zzqo zzb;

    public zzqn(Handler handler, zzqo zzqoVar) {
        this.zza = zzqoVar == null ? null : handler;
        this.zzb = zzqoVar;
    }

    public final void zza(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqh
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj(exc);
                }
            });
        }
    }

    public final void zzb(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqi
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzk(exc);
                }
            });
        }
    }

    public final void zzc(final zzqp zzqpVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqf
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzl(zzqpVar);
                }
            });
        }
    }

    public final void zzd(final zzqp zzqpVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqg
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzm(zzqpVar);
                }
            });
        }
    }

    public final void zze(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzql
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzn(str, j, j2);
                }
            });
        }
    }

    public final void zzf(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqm
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzo(str);
                }
            });
        }
    }

    public final void zzg(final zzix zzixVar) {
        zzixVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqc
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzp(zzixVar);
                }
            });
        }
    }

    public final void zzh(final zzix zzixVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqb
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzq(zzixVar);
                }
            });
        }
    }

    public final void zzi(final zzan zzanVar, final zziy zziyVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqj
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzr(zzanVar, zziyVar);
                }
            });
        }
    }

    final /* synthetic */ void zzj(Exception exc) {
        int i = zzgd.zza;
        this.zzb.zza(exc);
    }

    final /* synthetic */ void zzk(Exception exc) {
        int i = zzgd.zza;
        this.zzb.zzh(exc);
    }

    final /* synthetic */ void zzl(zzqp zzqpVar) {
        int i = zzgd.zza;
        this.zzb.zzi(zzqpVar);
    }

    final /* synthetic */ void zzm(zzqp zzqpVar) {
        int i = zzgd.zza;
        this.zzb.zzj(zzqpVar);
    }

    final /* synthetic */ void zzn(String str, long j, long j2) {
        int i = zzgd.zza;
        this.zzb.zzb(str, j, j2);
    }

    final /* synthetic */ void zzo(String str) {
        int i = zzgd.zza;
        this.zzb.zzc(str);
    }

    final /* synthetic */ void zzp(zzix zzixVar) {
        zzixVar.zza();
        int i = zzgd.zza;
        this.zzb.zzd(zzixVar);
    }

    final /* synthetic */ void zzq(zzix zzixVar) {
        int i = zzgd.zza;
        this.zzb.zze(zzixVar);
    }

    final /* synthetic */ void zzr(zzan zzanVar, zziy zziyVar) {
        int i = zzgd.zza;
        this.zzb.zzf(zzanVar, zziyVar);
    }

    final /* synthetic */ void zzs(long j) {
        int i = zzgd.zza;
        this.zzb.zzg(j);
    }

    final /* synthetic */ void zzt(boolean z) {
        int i = zzgd.zza;
        this.zzb.zzn(z);
    }

    final /* synthetic */ void zzu(int i, long j, long j2) {
        int i2 = zzgd.zza;
        this.zzb.zzk(i, j, j2);
    }

    public final void zzv(final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqd
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzs(j);
                }
            });
        }
    }

    public final void zzw(final boolean z) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqk
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzt(z);
                }
            });
        }
    }

    public final void zzx(final int i, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqe
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzu(i, j, j2);
                }
            });
        }
    }
}
