package com.google.android.gms.internal.ads;

import androidx.webkit.Profile;
import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcci {
    public static final zzgge zza;
    public static final zzgge zzb;
    public static final zzgge zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzgge zze;
    public static final zzgge zzf;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0098  */
    static {
        Executor threadPoolExecutor;
        Executor executorZzc;
        Executor executorZzb;
        if (ClientLibraryUtils.isPackageSide()) {
            zzfuu.zza();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzcce(Profile.DEFAULT_PROFILE_NAME)));
        } else {
            if (com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbep.zzlm) != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbep.zzlm)).booleanValue()) {
                    if (com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbep.zzln) != null) {
                        if (com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbep.zzlo) != null) {
                            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbep.zzln)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbep.zzln)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcce(Profile.DEFAULT_PROFILE_NAME));
                            threadPoolExecutor2.allowCoreThreadTimeOut(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbep.zzlo)).booleanValue());
                            threadPoolExecutor = threadPoolExecutor2;
                        } else {
                            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcce(Profile.DEFAULT_PROFILE_NAME));
                        }
                    }
                }
            }
        }
        zzccg zzccgVar = null;
        zza = new zzcch(threadPoolExecutor, zzccgVar);
        if (ClientLibraryUtils.isPackageSide()) {
            executorZzc = zzfuu.zza().zzc(5, new zzcce("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcce("Loader"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executorZzc = threadPoolExecutor3;
        }
        zzb = new zzcch(executorZzc, zzccgVar);
        if (ClientLibraryUtils.isPackageSide()) {
            executorZzb = zzfuu.zza().zzb(new zzcce("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcce("Activeview"));
            threadPoolExecutor4.allowCoreThreadTimeOut(true);
            executorZzb = threadPoolExecutor4;
        }
        zzc = new zzcch(executorZzb, zzccgVar);
        zzd = new zzccd(3, new zzcce("Schedule"));
        zze = new zzcch(new zzccf(), zzccgVar);
        zzf = new zzcch(zzggk.zzb(), zzccgVar);
    }
}
