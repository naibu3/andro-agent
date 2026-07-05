package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzftg {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfth zzc;
    private final zzfre zzd;
    private final zzfqx zze;
    private zzfsv zzf;
    private final Object zzg = new Object();

    public zzftg(Context context, zzfth zzfthVar, zzfre zzfreVar, zzfqx zzfqxVar) {
        this.zzb = context;
        this.zzc = zzfthVar;
        this.zzd = zzfreVar;
        this.zze = zzfqxVar;
    }

    private final synchronized Class zzd(zzfsw zzfswVar) throws zzftf {
        String strZzk = zzfswVar.zza().zzk();
        HashMap map = zza;
        Class cls = (Class) map.get(strZzk);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.zze.zza(zzfswVar.zzc())) {
                throw new zzftf(2026, "VM did not pass signature verification");
            }
            try {
                File fileZzb = zzfswVar.zzb();
                if (!fileZzb.exists()) {
                    fileZzb.mkdirs();
                }
                Class clsLoadClass = new DexClassLoader(zzfswVar.zzc().getAbsolutePath(), fileZzb.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                map.put(strZzk, clsLoadClass);
                return clsLoadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                throw new zzftf(2008, e);
            }
        } catch (GeneralSecurityException e2) {
            throw new zzftf(2026, e2);
        }
    }

    public final zzfrh zza() {
        zzfsv zzfsvVar;
        synchronized (this.zzg) {
            zzfsvVar = this.zzf;
        }
        return zzfsvVar;
    }

    public final zzfsw zzb() {
        synchronized (this.zzg) {
            zzfsv zzfsvVar = this.zzf;
            if (zzfsvVar == null) {
                return null;
            }
            return zzfsvVar.zzf();
        }
    }

    public final boolean zzc(zzfsw zzfswVar) throws zzftf {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfsv zzfsvVar = new zzfsv(zzd(zzfswVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfswVar.zze(), null, new Bundle(), 2), zzfswVar, this.zzc, this.zzd);
                if (!zzfsvVar.zzh()) {
                    throw new zzftf(4000, "init failed");
                }
                int iZze = zzfsvVar.zze();
                if (iZze != 0) {
                    throw new zzftf(4001, "ci: " + iZze);
                }
                synchronized (this.zzg) {
                    zzfsv zzfsvVar2 = this.zzf;
                    if (zzfsvVar2 != null) {
                        try {
                            zzfsvVar2.zzg();
                        } catch (zzftf e) {
                            this.zzd.zzc(e.zza(), -1L, e);
                        }
                        this.zzf = zzfsvVar;
                    } else {
                        this.zzf = zzfsvVar;
                    }
                }
                this.zzd.zzd(PathInterpolatorCompat.MAX_NUM_POINTS, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e2) {
                throw new zzftf(2004, e2);
            }
        } catch (zzftf e3) {
            this.zzd.zzc(e3.zza(), System.currentTimeMillis() - jCurrentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.zzd.zzc(4010, System.currentTimeMillis() - jCurrentTimeMillis, e4);
            return false;
        }
    }
}
