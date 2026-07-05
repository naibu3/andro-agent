package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzaww implements zzawz {
    private static zzaww zzb;
    private final Context zzc;
    private final zzfsx zzd;
    private final zzfte zze;
    private final zzftg zzf;
    private final zzaxy zzg;
    private final zzfre zzh;
    private final Executor zzi;
    private final zzazw zzj;
    private final zzftd zzk;
    private final zzayn zzm;
    private final zzayf zzn;
    private final zzaxw zzo;
    private volatile boolean zzq;
    private volatile boolean zzr;
    volatile long zza = 0;
    private final Object zzp = new Object();
    private final CountDownLatch zzl = new CountDownLatch(1);

    zzaww(Context context, zzfre zzfreVar, zzfsx zzfsxVar, zzfte zzfteVar, zzftg zzftgVar, zzaxy zzaxyVar, Executor executor, zzfqx zzfqxVar, zzazw zzazwVar, zzayn zzaynVar, zzayf zzayfVar, zzaxw zzaxwVar) {
        this.zzr = false;
        this.zzc = context;
        this.zzh = zzfreVar;
        this.zzd = zzfsxVar;
        this.zze = zzfteVar;
        this.zzf = zzftgVar;
        this.zzg = zzaxyVar;
        this.zzi = executor;
        this.zzj = zzazwVar;
        this.zzm = zzaynVar;
        this.zzn = zzayfVar;
        this.zzo = zzaxwVar;
        this.zzr = false;
        this.zzk = new zzawu(this, zzfqxVar);
    }

    public static synchronized zzaww zza(String str, Context context, boolean z, boolean z2) {
        return zzb(str, context, Executors.newCachedThreadPool(), z, z2);
    }

    @Deprecated
    public static synchronized zzaww zzb(String str, Context context, Executor executor, boolean z, boolean z2) {
        if (zzb == null) {
            zzfrf zzfrfVarZza = zzfrg.zza();
            zzfrfVarZza.zza(str);
            zzfrfVarZza.zzc(z);
            zzfrg zzfrgVarZzd = zzfrfVarZza.zzd();
            zzfre zzfreVarZza = zzfre.zza(context, executor, z2);
            zzaxh zzaxhVarZzc = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdq)).booleanValue() ? zzaxh.zzc(context) : null;
            zzayn zzaynVarZzd = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdr)).booleanValue() ? zzayn.zzd(context, executor) : null;
            zzayf zzayfVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcF)).booleanValue() ? new zzayf() : null;
            zzaxw zzaxwVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcH)).booleanValue() ? new zzaxw() : null;
            zzfrx zzfrxVarZze = zzfrx.zze(context, executor, zzfreVarZza, zzfrgVarZzd);
            zzaxx zzaxxVar = new zzaxx(context);
            zzaxy zzaxyVar = new zzaxy(zzfrgVarZzd, zzfrxVarZze, new zzayl(context, zzaxxVar), zzaxxVar, zzaxhVarZzc, zzaynVarZzd, zzayfVar, zzaxwVar);
            zzazw zzazwVarZzb = zzfsk.zzb(context, zzfreVarZza);
            zzfqx zzfqxVar = new zzfqx();
            zzaww zzawwVar = new zzaww(context, zzfreVarZza, new zzfsx(context, zzazwVarZzb), new zzfte(context, zzazwVarZzb, new zzawt(zzfreVarZza), ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzco)).booleanValue()), new zzftg(context, zzaxyVar, zzfreVarZza, zzfqxVar), zzaxyVar, executor, zzfqxVar, zzazwVarZzb, zzaynVarZzd, zzayfVar, zzaxwVar);
            zzb = zzawwVar;
            zzawwVar.zzm();
            zzb.zzp();
        }
        return zzb;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f5 A[Catch: all -> 0x011c, zzhcd -> 0x011e, TryCatch #1 {zzhcd -> 0x011e, blocks: (B:6:0x0021, B:8:0x0032, B:12:0x0038, B:13:0x0044, B:15:0x0052, B:17:0x0060, B:20:0x006d, B:27:0x009c, B:31:0x00b5, B:37:0x00ce, B:38:0x00db, B:40:0x00e1, B:42:0x00e9, B:43:0x00eb, B:34:0x00bf, B:35:0x00c6, B:23:0x0074, B:25:0x008a, B:44:0x00f5, B:45:0x0102, B:46:0x010f), top: B:58:0x0021, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* bridge */ /* synthetic */ void zzj(zzaww zzawwVar) {
        String str;
        String strZzj;
        int length;
        boolean zZza;
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfsw zzfswVarZzt = zzawwVar.zzt(1);
        if (zzfswVarZzt != null) {
            String strZzk = zzfswVarZzt.zza().zzk();
            strZzj = zzfswVarZzt.zza().zzj();
            str = strZzk;
        } else {
            str = null;
            strZzj = null;
        }
        try {
            try {
                zzftb zzftbVarZza = zzfro.zza(zzawwVar.zzc, 1, zzawwVar.zzj, str, strZzj, "1", zzawwVar.zzh);
                byte[] bArr = zzftbVarZza.zzb;
                if (bArr == null || (length = bArr.length) == 0) {
                    zzawwVar.zzh.zzd(5009, System.currentTimeMillis() - jCurrentTimeMillis);
                } else {
                    try {
                        zzazz zzazzVarZzc = zzazz.zzc(zzhac.zzv(bArr, 0, length), zzhay.zza());
                        if (zzazzVarZzc.zzd().zzk().isEmpty() || zzazzVarZzc.zzd().zzj().isEmpty() || zzazzVarZzc.zze().zzB().length == 0) {
                            zzawwVar.zzh.zzd(5010, System.currentTimeMillis() - jCurrentTimeMillis);
                        } else {
                            zzfsw zzfswVarZzt2 = zzawwVar.zzt(1);
                            if (zzfswVarZzt2 != null) {
                                zzbac zzbacVarZza = zzfswVarZzt2.zza();
                                if (!zzazzVarZzc.zzd().zzk().equals(zzbacVarZza.zzk()) || !zzazzVarZzc.zzd().zzj().equals(zzbacVarZza.zzj())) {
                                }
                            }
                            zzftd zzftdVar = zzawwVar.zzk;
                            int i = zzftbVarZza.zzc;
                            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcm)).booleanValue()) {
                                zZza = zzawwVar.zzd.zza(zzazzVarZzc, zzftdVar);
                            } else if (i == 3) {
                                zZza = zzawwVar.zze.zza(zzazzVarZzc);
                            } else {
                                if (i == 4) {
                                    zZza = zzawwVar.zze.zzb(zzazzVarZzc, zzftdVar);
                                }
                                zzawwVar.zzh.zzd(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                            if (zZza) {
                                zzfsw zzfswVarZzt3 = zzawwVar.zzt(1);
                                if (zzfswVarZzt3 != null) {
                                    if (zzawwVar.zzf.zzc(zzfswVarZzt3)) {
                                        zzawwVar.zzr = true;
                                    }
                                    zzawwVar.zza = System.currentTimeMillis() / 1000;
                                }
                            } else {
                                zzawwVar.zzh.zzd(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                        }
                    } catch (NullPointerException unused) {
                        zzawwVar.zzh.zzd(2030, System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                }
            } catch (zzhcd e) {
                zzawwVar.zzh.zzc(4002, System.currentTimeMillis() - jCurrentTimeMillis, e);
            }
        } finally {
            zzawwVar.zzl.countDown();
        }
    }

    private final void zzs() {
        zzayn zzaynVar = this.zzm;
        if (zzaynVar != null) {
            zzaynVar.zzh();
        }
    }

    private final zzfsw zzt(int i) {
        if (zzfsk.zza(this.zzj)) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcm)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzc(1);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final String zzf(Context context, String str, View view, Activity activity) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcF)).booleanValue()) {
            this.zzn.zzi();
        }
        zzp();
        zzfrh zzfrhVarZza = this.zzf.zza();
        if (zzfrhVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZza = zzfrhVarZza.zza(context, null, str, view, activity);
        this.zzh.zzf(5000, System.currentTimeMillis() - jCurrentTimeMillis, strZza, null);
        return strZza;
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final String zzg(Context context) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcF)).booleanValue()) {
            this.zzn.zzj();
        }
        zzp();
        zzfrh zzfrhVarZza = this.zzf.zza();
        if (zzfrhVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzc = zzfrhVarZza.zzc(context, null);
        this.zzh.zzf(5001, System.currentTimeMillis() - jCurrentTimeMillis, strZzc, null);
        return strZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final String zzh(Context context, View view, Activity activity) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcF)).booleanValue()) {
            this.zzn.zzk(context, view);
        }
        zzp();
        zzfrh zzfrhVarZza = this.zzf.zza();
        if (zzfrhVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzb = zzfrhVarZza.zzb(context, null, view, activity);
        this.zzh.zzf(5002, System.currentTimeMillis() - jCurrentTimeMillis, strZzb, null);
        return strZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzk(MotionEvent motionEvent) {
        zzfrh zzfrhVarZza = this.zzf.zza();
        if (zzfrhVarZza != null) {
            try {
                zzfrhVarZza.zzd(null, motionEvent);
            } catch (zzftf e) {
                this.zzh.zzc(e.zza(), -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzl(int i, int i2, int i3) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlU)).booleanValue() || (displayMetrics = this.zzc.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f = i;
        float f2 = i2;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain);
        motionEventObtain.recycle();
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain2);
        motionEventObtain2.recycle();
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i3, 1, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    final synchronized void zzm() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfsw zzfswVarZzt = zzt(1);
        if (zzfswVarZzt == null) {
            this.zzh.zzd(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.zzf.zzc(zzfswVarZzt)) {
            this.zzr = true;
            this.zzl.countDown();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzaxw zzaxwVar = this.zzo;
        if (zzaxwVar != null) {
            zzaxwVar.zzb(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzo(View view) {
        this.zzg.zzd(view);
    }

    public final void zzp() {
        if (this.zzq) {
            return;
        }
        synchronized (this.zzp) {
            if (!this.zzq) {
                if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                    return;
                }
                zzfsw zzfswVarZzb = this.zzf.zzb();
                if ((zzfswVarZzb == null || zzfswVarZzb.zzd(3600L)) && zzfsk.zza(this.zzj)) {
                    this.zzi.execute(new zzawv(this));
                }
            }
        }
    }

    public final synchronized boolean zzr() {
        return this.zzr;
    }
}
