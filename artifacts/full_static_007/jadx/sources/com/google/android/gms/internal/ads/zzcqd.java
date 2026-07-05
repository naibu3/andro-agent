package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcqd {
    zzbwl zza;
    zzbwl zzb;
    private final Context zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzehh zze;
    private final zzdsi zzf;
    private final zzgge zzg;
    private final Executor zzh;
    private final ScheduledExecutorService zzi;

    zzcqd(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar, zzehh zzehhVar, zzdsi zzdsiVar, zzgge zzggeVar, zzgge zzggeVar2, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = context;
        this.zzd = zzgVar;
        this.zze = zzehhVar;
        this.zzf = zzdsiVar;
        this.zzg = zzggeVar;
        this.zzh = zzggeVar2;
        this.zzi = scheduledExecutorService;
    }

    public static boolean zzj(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkh));
    }

    private final ListenableFuture zzk(final String str, @Nullable final InputEvent inputEvent, Random random) {
        try {
            if (!str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkh)) || this.zzd.zzS()) {
                return zzgft.zzh(str);
            }
            final Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzki), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
            if (inputEvent != null) {
                return zzgft.zzf(zzgft.zzn(zzgfk.zzu(this.zze.zza()), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzcpx
                    @Override // com.google.android.gms.internal.ads.zzgfa
                    public final ListenableFuture zza(Object obj) {
                        return this.zza.zzd(builderBuildUpon, str, inputEvent, (Integer) obj);
                    }
                }, this.zzh), Throwable.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzcpy
                    @Override // com.google.android.gms.internal.ads.zzgfa
                    public final ListenableFuture zza(Object obj) {
                        return this.zza.zze(builderBuildUpon, (Throwable) obj);
                    }
                }, this.zzg);
            }
            builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkj), "11");
            return zzgft.zzh(builderBuildUpon.toString());
        } catch (Exception e) {
            return zzgft.zzg(e);
        }
    }

    public final ListenableFuture zzb(final String str, Random random) {
        return TextUtils.isEmpty(str) ? zzgft.zzh(str) : zzgft.zzf(zzk(str, this.zzf.zza(), random), Throwable.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzcpu
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzc(str, (Throwable) obj);
            }
        }, this.zzg);
    }

    final /* synthetic */ ListenableFuture zzc(String str, final Throwable th) throws Exception {
        this.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpw
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzg(th);
            }
        });
        return zzgft.zzh(str);
    }

    final /* synthetic */ ListenableFuture zzd(final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) throws Exception {
        if (num.intValue() != 1) {
            builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkj), "10");
            return zzgft.zzh(builder.toString());
        }
        Uri.Builder builderBuildUpon = builder.build().buildUpon();
        builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkk), "1");
        builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkj), "12");
        if (str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkl))) {
            builderBuildUpon.authority((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkm));
        }
        return zzgft.zzn(zzgfk.zzu(this.zze.zzb(builderBuildUpon.build(), inputEvent)), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzcpz
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkj);
                Uri.Builder builder2 = builder;
                builder2.appendQueryParameter(str2, "12");
                return zzgft.zzh(builder2.toString());
            }
        }, this.zzh);
    }

    final /* synthetic */ ListenableFuture zze(Uri.Builder builder, final Throwable th) throws Exception {
        this.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpv
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzh(th);
            }
        });
        builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkj), "9");
        return zzgft.zzh(builder.toString());
    }

    final /* synthetic */ void zzg(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzko)).booleanValue()) {
            zzbwl zzbwlVarZzc = zzbwj.zzc(this.zzc);
            this.zzb = zzbwlVarZzc;
            zzbwlVarZzc.zzh(th, "AttributionReporting.getUpdatedUrlAndRegisterSource");
        } else {
            zzbwl zzbwlVarZza = zzbwj.zza(this.zzc);
            this.zza = zzbwlVarZza;
            zzbwlVarZza.zzh(th, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
        }
    }

    final /* synthetic */ void zzh(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzko)).booleanValue()) {
            zzbwl zzbwlVarZzc = zzbwj.zzc(this.zzc);
            this.zzb = zzbwlVarZzc;
            zzbwlVarZzc.zzh(th, "AttributionReporting");
        } else {
            zzbwl zzbwlVarZza = zzbwj.zza(this.zzc);
            this.zza = zzbwlVarZza;
            zzbwlVarZza.zzh(th, "AttributionReportingSampled");
        }
    }

    public final void zzi(String str, zzfoe zzfoeVar, Random random) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzgft.zzr(zzgft.zzo(zzk(str, this.zzf.zza(), random), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkn)).intValue(), TimeUnit.MILLISECONDS, this.zzi), new zzcqc(this, zzfoeVar, str), this.zzg);
    }
}
