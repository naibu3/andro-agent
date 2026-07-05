package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfre {
    public static final /* synthetic */ int zza = 0;
    private static volatile zzatc zzb = zzatc.UNKNOWN;
    private final Context zzc;
    private final Executor zzd;
    private final Task zze;
    private final boolean zzf;

    zzfre(Context context, Executor executor, Task task, boolean z) {
        this.zzc = context;
        this.zzd = executor;
        this.zze = task;
        this.zzf = z;
    }

    public static zzfre zza(final Context context, Executor executor, boolean z) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfrc
                @Override // java.lang.Runnable
                public final void run() {
                    taskCompletionSource.setResult(zzftk.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfrd
                @Override // java.lang.Runnable
                public final void run() {
                    taskCompletionSource.setResult(zzftk.zzc());
                }
            });
        }
        return new zzfre(context, executor, taskCompletionSource.getTask(), z);
    }

    static void zzg(zzatc zzatcVar) {
        zzb = zzatcVar;
    }

    private final Task zzh(final int i, long j, Exception exc, String str, Map map, String str2) {
        if (!this.zzf) {
            return this.zze.continueWith(this.zzd, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfra
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return Boolean.valueOf(task.isSuccessful());
                }
            });
        }
        Context context = this.zzc;
        final zzasx zzasxVarZza = zzatd.zza();
        zzasxVarZza.zza(context.getPackageName());
        zzasxVarZza.zzf(j);
        zzasxVarZza.zze(zzb);
        if (exc != null) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            zzasxVarZza.zzg(stringWriter.toString());
            zzasxVarZza.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            zzasxVarZza.zzb(str2);
        }
        if (str != null) {
            zzasxVarZza.zzc(str);
        }
        return this.zze.continueWith(this.zzd, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfrb
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                int i2 = zzfre.zza;
                if (!task.isSuccessful()) {
                    return false;
                }
                int i3 = i;
                zzftj zzftjVarZza = ((zzftk) task.getResult()).zza(((zzatd) zzasxVarZza.zzbr()).zzaV());
                zzftjVarZza.zza(i3);
                zzftjVarZza.zzc();
                return true;
            }
        });
    }

    public final Task zzb(int i, String str) {
        return zzh(i, 0L, null, null, null, str);
    }

    public final Task zzc(int i, long j, Exception exc) {
        return zzh(i, j, exc, null, null, null);
    }

    public final Task zzd(int i, long j) {
        return zzh(i, j, null, null, null, null);
    }

    public final Task zze(int i, long j, String str) {
        return zzh(i, j, null, null, null, str);
    }

    public final Task zzf(int i, long j, String str, Map map) {
        return zzh(i, j, null, str, null, null);
    }
}
