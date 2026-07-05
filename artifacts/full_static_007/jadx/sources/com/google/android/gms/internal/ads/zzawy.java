package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzawy {
    protected volatile Boolean zzb;
    private final zzaye zze;
    private static final ConditionVariable zzc = new ConditionVariable();
    protected static volatile zzftk zza = null;
    private static volatile Random zzd = null;

    public zzawy(zzaye zzayeVar) {
        this.zze = zzayeVar;
        zzayeVar.zzk().execute(new zzawx(this));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (zzd == null) {
                synchronized (zzawy.class) {
                    if (zzd == null) {
                        zzd = new Random();
                    }
                }
            }
            return zzd.nextInt();
        }
    }

    public final void zzc(int i, int i2, long j, String str, Exception exc) {
        try {
            zzc.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzasx zzasxVarZza = zzatd.zza();
            zzasxVarZza.zza(this.zze.zza.getPackageName());
            zzasxVarZza.zzf(j);
            if (str != null) {
                zzasxVarZza.zzb(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zzasxVarZza.zzg(stringWriter.toString());
                zzasxVarZza.zzd(exc.getClass().getName());
            }
            zzftj zzftjVarZza = zza.zza(((zzatd) zzasxVarZza.zzbr()).zzaV());
            zzftjVarZza.zza(i);
            if (i2 != -1) {
                zzftjVarZza.zzb(i2);
            }
            zzftjVarZza.zzc();
        } catch (Exception unused) {
        }
    }
}
