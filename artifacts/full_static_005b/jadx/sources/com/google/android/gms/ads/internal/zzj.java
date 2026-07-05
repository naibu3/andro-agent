package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzaww;
import com.google.android.gms.internal.ads.zzawz;
import com.google.android.gms.internal.ads.zzaxc;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzfre;
import com.google.android.gms.internal.ads.zzfsk;
import com.google.android.gms.internal.ads.zzfte;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes.dex */
public final class zzj implements Runnable, zzawz {
    protected boolean zza;
    private final boolean zzf;
    private final boolean zzg;
    private final Executor zzh;
    private final zzfre zzi;
    private Context zzj;
    private final Context zzk;
    private VersionInfoParcel zzl;
    private final VersionInfoParcel zzm;
    private final boolean zzn;
    private int zzo;
    private final List zzc = new Vector();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    final CountDownLatch zzb = new CountDownLatch(1);

    public zzj(Context context, VersionInfoParcel versionInfoParcel) {
        this.zzj = context;
        this.zzk = context;
        this.zzl = versionInfoParcel;
        this.zzm = versionInfoParcel;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.zzh = executorServiceNewCachedThreadPool;
        boolean zBooleanValue = ((Boolean) zzba.zzc().zza(zzbep.zzcr)).booleanValue();
        this.zzn = zBooleanValue;
        this.zzi = zzfre.zza(context, executorServiceNewCachedThreadPool, zBooleanValue);
        this.zzf = ((Boolean) zzba.zzc().zza(zzbep.zzcn)).booleanValue();
        this.zzg = ((Boolean) zzba.zzc().zza(zzbep.zzcs)).booleanValue();
        if (((Boolean) zzba.zzc().zza(zzbep.zzcq)).booleanValue()) {
            this.zzo = 2;
        } else {
            this.zzo = 1;
        }
        if (!((Boolean) zzba.zzc().zza(zzbep.zzdu)).booleanValue()) {
            this.zza = zzc();
        }
        if (((Boolean) zzba.zzc().zza(zzbep.zzdn)).booleanValue()) {
            zzcci.zza.execute(this);
            return;
        }
        zzay.zzb();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzv()) {
            zzcci.zza.execute(this);
        } else {
            run();
        }
    }

    private final zzawz zzm() {
        return zzi() == 2 ? (zzawz) this.zze.get() : (zzawz) this.zzd.get();
    }

    private final void zzp() {
        List list = this.zzc;
        zzawz zzawzVarZzm = zzm();
        if (list.isEmpty() || zzawzVarZzm == null) {
            return;
        }
        for (Object[] objArr : this.zzc) {
            int length = objArr.length;
            if (length == 1) {
                zzawzVarZzm.zzk((MotionEvent) objArr[0]);
            } else if (length == 3) {
                zzawzVarZzm.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.zzc.clear();
    }

    private final void zzq(boolean z) {
        this.zzd.set(zzaxc.zzu(this.zzl.afmaVersion, zzr(this.zzj), z, this.zzo));
    }

    private static final Context zzr(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) zzba.zzc().zza(zzbep.zzdu)).booleanValue()) {
                this.zza = zzc();
            }
            boolean z = this.zzl.isClientJar;
            final boolean z2 = false;
            if (!((Boolean) zzba.zzc().zza(zzbep.zzaX)).booleanValue() && z) {
                z2 = true;
            }
            if (zzi() == 1) {
                zzq(z2);
                if (this.zzo == 2) {
                    this.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzh
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzb(z2);
                        }
                    });
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    zzaww zzawwVarZza = zzaww.zza(this.zzl.afmaVersion, zzr(this.zzj), z2, this.zzn);
                    this.zze.set(zzawwVarZza);
                    if (this.zzg && !zzawwVarZza.zzr()) {
                        this.zzo = 1;
                        zzq(z2);
                    }
                } catch (NullPointerException e) {
                    this.zzo = 1;
                    zzq(z2);
                    this.zzi.zzc(2031, System.currentTimeMillis() - jCurrentTimeMillis, e);
                }
            }
        } finally {
            this.zzb.countDown();
            this.zzj = null;
            this.zzl = null;
        }
    }

    final /* synthetic */ void zzb(boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            zzaww.zza(this.zzm.afmaVersion, zzr(this.zzk), z, this.zzn).zzp();
        } catch (NullPointerException e) {
            this.zzi.zzc(2027, System.currentTimeMillis() - jCurrentTimeMillis, e);
        }
    }

    protected final boolean zzc() {
        Context context = this.zzj;
        zzi zziVar = new zzi(this);
        zzfre zzfreVar = this.zzi;
        return new zzfte(this.zzj, zzfsk.zzb(context, zzfreVar), zziVar, ((Boolean) zzba.zzc().zza(zzbep.zzco)).booleanValue()).zzd(1);
    }

    public final boolean zzd() throws InterruptedException {
        try {
            this.zzb.await();
            return true;
        } catch (InterruptedException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final String zzf(Context context, String str, View view, Activity activity) {
        if (!zzd()) {
            return "";
        }
        zzawz zzawzVarZzm = zzm();
        if (((Boolean) zzba.zzc().zza(zzbep.zzkH)).booleanValue()) {
            zzu.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzJ(view, 4, null);
        }
        if (zzawzVarZzm == null) {
            return "";
        }
        zzp();
        return zzawzVarZzm.zzf(zzr(context), str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final String zzg(Context context) {
        zzawz zzawzVarZzm;
        if (!zzd() || (zzawzVarZzm = zzm()) == null) {
            return "";
        }
        zzp();
        return zzawzVarZzm.zzg(zzr(context));
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final String zzh(Context context, View view, Activity activity) {
        if (!((Boolean) zzba.zzc().zza(zzbep.zzkG)).booleanValue()) {
            zzawz zzawzVarZzm = zzm();
            if (((Boolean) zzba.zzc().zza(zzbep.zzkH)).booleanValue()) {
                zzu.zzp();
                com.google.android.gms.ads.internal.util.zzt.zzJ(view, 2, null);
            }
            return zzawzVarZzm != null ? zzawzVarZzm.zzh(context, view, activity) : "";
        }
        if (!zzd()) {
            return "";
        }
        zzawz zzawzVarZzm2 = zzm();
        if (((Boolean) zzba.zzc().zza(zzbep.zzkH)).booleanValue()) {
            zzu.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzJ(view, 2, null);
        }
        return zzawzVarZzm2 != null ? zzawzVarZzm2.zzh(context, view, activity) : "";
    }

    protected final int zzi() {
        if (!this.zzf || this.zza) {
            return this.zzo;
        }
        return 1;
    }

    public final int zzj() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzk(MotionEvent motionEvent) {
        zzawz zzawzVarZzm = zzm();
        if (zzawzVarZzm == null) {
            this.zzc.add(new Object[]{motionEvent});
        } else {
            zzp();
            zzawzVarZzm.zzk(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzl(int i, int i2, int i3) {
        zzawz zzawzVarZzm = zzm();
        if (zzawzVarZzm == null) {
            this.zzc.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        } else {
            zzp();
            zzawzVarZzm.zzl(i, i2, i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzawz zzawzVarZzm;
        if (!zzd() || (zzawzVarZzm = zzm()) == null) {
            return;
        }
        zzawzVarZzm.zzn(stackTraceElementArr);
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzo(View view) {
        zzawz zzawzVarZzm = zzm();
        if (zzawzVarZzm != null) {
            zzawzVarZzm.zzo(view);
        }
    }
}
