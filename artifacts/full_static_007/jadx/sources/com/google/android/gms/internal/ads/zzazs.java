package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzazs implements Callable {
    protected final String zza = getClass().getSimpleName();
    protected final zzaye zzb;
    protected final String zzc;
    protected final String zzd;
    protected final zzatp zze;
    protected Method zzf;
    protected final int zzg;
    protected final int zzh;

    public zzazs(zzaye zzayeVar, String str, String str2, zzatp zzatpVar, int i, int i2) {
        this.zzb = zzayeVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzatpVar;
        this.zzg = i;
        this.zzh = i2;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() throws Exception {
        zzl();
        return null;
    }

    protected abstract void zza() throws IllegalAccessException, InvocationTargetException;

    public Void zzl() throws Exception {
        int i;
        try {
            long jNanoTime = System.nanoTime();
            Method methodZzj = this.zzb.zzj(this.zzc, this.zzd);
            this.zzf = methodZzj;
            if (methodZzj == null) {
                return null;
            }
            zza();
            zzawy zzawyVarZzd = this.zzb.zzd();
            if (zzawyVarZzd == null || (i = this.zzg) == Integer.MIN_VALUE) {
                return null;
            }
            zzawyVarZzd.zzc(this.zzh, i, (System.nanoTime() - jNanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
