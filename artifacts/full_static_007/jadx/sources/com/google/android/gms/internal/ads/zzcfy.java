package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.messaging.Constants;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcfy extends zzcfp implements zzcdu {
    public static final /* synthetic */ int zzd = 0;
    private zzcdv zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzcfh zzi;
    private long zzj;
    private long zzk;

    public zzcfy(zzcee zzceeVar, zzced zzcedVar) {
        super(zzceeVar);
        zzcgq zzcgqVar = new zzcgq(zzceeVar.getContext(), zzcedVar, (zzcee) this.zzc.get(), null);
        com.google.android.gms.ads.internal.util.client.zzm.zzi("ExoPlayerAdapter initialized.");
        this.zze = zzcgqVar;
        zzcgqVar.zzL(this);
    }

    protected static final String zzc(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
    }

    private static String zzd(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void zzx(long j) {
        com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfx
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.zza.zzb();
            }
        }, j);
    }

    @Override // com.google.android.gms.internal.ads.zzcfp, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzcdv zzcdvVar = this.zze;
        if (zzcdvVar != null) {
            zzcdvVar.zzL(null);
            this.zze.zzH();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzD(int i, int i2) {
    }

    public final zzcdv zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzL(null);
        zzcdv zzcdvVar = this.zze;
        this.zze = null;
        return zzcdvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [long] */
    /* JADX WARN: Type inference failed for: r3v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [com.google.android.gms.internal.ads.zzcfp, com.google.android.gms.internal.ads.zzcfy] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26, types: [com.google.android.gms.internal.ads.zzcfy] */
    /* JADX WARN: Type inference failed for: r3v31 */
    final /* synthetic */ void zzb() throws Throwable {
        String str;
        zzcfy zzcfyVarBooleanValue;
        zzcfy zzcfyVar;
        ?? LongValue;
        long jIntValue;
        zzcfy zzcfyVar2;
        long j;
        long j2;
        String str2;
        long j3;
        String strZzc = zzc(this.zzf);
        String str3 = Constants.IPC_BUNDLE_KEY_SEND_ERROR;
        try {
            LongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzx)).longValue() * 1000;
            jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzw)).intValue();
            zzcfyVarBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbR)).booleanValue();
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
            str = strZzc;
            zzcfyVarBooleanValue = this;
        }
        synchronized (this) {
            try {
                long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
                long j4 = this.zzj;
                if (jCurrentTimeMillis - j4 <= LongValue) {
                    try {
                        if (this.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (!this.zzh) {
                            if (!this.zze.zzV()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            long jZzz = this.zze.zzz();
                            if (jZzz > 0) {
                                long jZzv = this.zze.zzv();
                                if (jZzv != this.zzk) {
                                    try {
                                        j2 = jIntValue;
                                        str2 = strZzc;
                                        try {
                                            zzo(this.zzf, strZzc, jZzv, jZzz, jZzv > 0, zzcfyVarBooleanValue != 0 ? this.zze.zzA() : -1L, zzcfyVarBooleanValue != 0 ? this.zze.zzx() : -1L, zzcfyVarBooleanValue != 0 ? this.zze.zzB() : -1L, zzcdv.zzs(), zzcdv.zzu());
                                            zzcfyVarBooleanValue = this;
                                            j = jZzv;
                                            try {
                                                zzcfyVarBooleanValue.zzk = j;
                                                j3 = jZzz;
                                                zzcfyVarBooleanValue = zzcfyVarBooleanValue;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                str = str2;
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            zzcfyVarBooleanValue = this;
                                            str = str2;
                                            throw th;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        str2 = strZzc;
                                        zzcfyVarBooleanValue = this;
                                    }
                                } else {
                                    j = jZzv;
                                    j2 = jIntValue;
                                    str2 = strZzc;
                                    zzcfyVarBooleanValue = this;
                                    j3 = jZzz;
                                }
                                if (j >= j3) {
                                    zzcfyVarBooleanValue.zzj(zzcfyVarBooleanValue.zzf, str2, j3);
                                    zzcfyVar = zzcfyVarBooleanValue;
                                } else {
                                    long jZzw = zzcfyVarBooleanValue.zze.zzw();
                                    zzcfyVar2 = zzcfyVarBooleanValue;
                                    if (jZzw >= j2) {
                                        zzcfyVar2 = zzcfyVarBooleanValue;
                                        if (j > 0) {
                                            zzcfyVar = zzcfyVarBooleanValue;
                                        }
                                    }
                                }
                            } else {
                                zzcfyVar2 = this;
                            }
                            zzcfyVar2.zzx(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzy)).longValue());
                            return;
                        }
                        zzcfyVar = this;
                        com.google.android.gms.ads.internal.zzu.zzy().zzc(zzcfyVar.zzi);
                    } catch (Throwable th5) {
                        th = th5;
                        str3 = LongValue;
                        str = j4;
                    }
                } else {
                    str = strZzc;
                    zzcfyVarBooleanValue = this;
                    try {
                        throw new IOException("Timeout reached. Limit: " + ((long) LongValue) + " ms");
                    } catch (Throwable th6) {
                        th = th6;
                        str3 = "downloadTimeout";
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                str = strZzc;
                zzcfyVarBooleanValue = this;
            }
            try {
                throw th;
            } catch (Exception e2) {
                e = e2;
                String str4 = str3;
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to preload url " + zzcfyVarBooleanValue.zzf + " Exception: " + e.getMessage());
                com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "VideoStreamExoPlayerCache.preload");
                release();
                zzcfyVarBooleanValue.zzg(zzcfyVarBooleanValue.zzf, str, str4, zzd(str4, e));
                zzcfyVar = zzcfyVarBooleanValue;
                com.google.android.gms.ads.internal.zzu.zzy().zzc(zzcfyVar.zzi);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfp
    public final void zzf() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzg(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzi(final boolean z, final long j) {
        final zzcee zzceeVar = (zzcee) this.zzc.get();
        if (zzceeVar != null) {
            zzcci.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfw
                @Override // java.lang.Runnable
                public final void run() {
                    int i = zzcfy.zzd;
                    zzceeVar.zzv(z, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzk(String str, Exception exc) {
        com.google.android.gms.ads.internal.util.client.zzm.zzk("Precache error", exc);
        com.google.android.gms.ads.internal.zzu.zzo().zzv(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzl(String str, Exception exc) {
        com.google.android.gms.ads.internal.util.client.zzm.zzk("Precache exception", exc);
        com.google.android.gms.ads.internal.zzu.zzo().zzv(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzm(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcfp
    public final void zzp(int i) {
        this.zze.zzJ(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcfp
    public final void zzq(int i) {
        this.zze.zzK(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcfp
    public final void zzr(int i) {
        this.zze.zzM(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcfp
    public final void zzs(int i) {
        this.zze.zzN(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcfp
    public final boolean zzt(String str) {
        return zzu(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzcfp] */
    /* JADX WARN: Type inference failed for: r5v10, types: [int] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // com.google.android.gms.internal.ads.zzcfp
    public final boolean zzu(String str, String[] strArr) throws Throwable {
        ?? r6;
        String str2;
        ?? r5;
        long j;
        long j2;
        long j3;
        ?? r1;
        long j4;
        String str3;
        long j5;
        long j6;
        zzcfy zzcfyVar = this;
        String str4 = str;
        zzcfyVar.zzf = str4;
        String str5 = Constants.IPC_BUNDLE_KEY_SEND_ERROR;
        String strZzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            zzcfyVar.zze.zzF(uriArr, zzcfyVar.zzb);
            zzcee zzceeVar = (zzcee) zzcfyVar.zzc.get();
            if (zzceeVar != null) {
                zzceeVar.zzt(strZzc, zzcfyVar);
            }
            Clock clockZzB = com.google.android.gms.ads.internal.zzu.zzB();
            long jCurrentTimeMillis = clockZzB.currentTimeMillis();
            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzy)).longValue();
            long jLongValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzx)).longValue() * 1000;
            long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzw)).intValue();
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbR)).booleanValue();
            long j7 = -1;
            long j8 = jIntValue;
            while (true) {
                synchronized (this) {
                    try {
                        if (clockZzB.currentTimeMillis() - jCurrentTimeMillis > jLongValue2) {
                            throw new IOException("Timeout reached. Limit: " + jLongValue2 + " ms");
                        }
                        if (zzcfyVar.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (zzcfyVar.zzh) {
                            break;
                        }
                        if (!zzcfyVar.zze.zzV()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long jZzz = zzcfyVar.zze.zzz();
                        if (jZzz > 0) {
                            long jZzv = zzcfyVar.zze.zzv();
                            if (jZzv != j7) {
                                try {
                                    j = j8;
                                    long j9 = jZzz;
                                    j2 = jLongValue2;
                                    j4 = jLongValue;
                                    str3 = strZzc;
                                    try {
                                        zzo(str, strZzc, jZzv, j9, jZzv > 0, zBooleanValue ? zzcfyVar.zze.zzA() : -1L, zBooleanValue ? zzcfyVar.zze.zzx() : -1L, zBooleanValue ? zzcfyVar.zze.zzB() : -1L, zzcdv.zzs(), zzcdv.zzu());
                                        j6 = jZzv;
                                        j5 = jZzz;
                                        r6 = j9;
                                    } catch (Throwable th) {
                                        th = th;
                                        r5 = this;
                                        r6 = str;
                                        str2 = str3;
                                        try {
                                            throw th;
                                        } catch (Exception e) {
                                            e = e;
                                            String str6 = str5;
                                            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to preload url " + r6 + " Exception: " + e.getMessage());
                                            com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "VideoStreamExoPlayerCache.preload");
                                            release();
                                            r5.zzg(r6, str2, str6, zzd(str6, e));
                                            return false;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    str3 = strZzc;
                                }
                            } else {
                                j = j8;
                                j2 = jLongValue2;
                                j4 = jLongValue;
                                str3 = strZzc;
                                j5 = jZzz;
                                j6 = j7;
                                r6 = j8;
                            }
                            r5 = (jZzv > j5 ? 1 : (jZzv == j5 ? 0 : -1));
                            if (r5 >= 0) {
                                zzj(str, str3, j5);
                            } else {
                                try {
                                    zzcfy zzcfyVar2 = this;
                                    r6 = str;
                                    str2 = str3;
                                    if (zzcfyVar2.zze.zzw() < j || jZzv <= 0) {
                                        j3 = j4;
                                        r1 = j6;
                                        r5 = zzcfyVar2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    throw th;
                                }
                            }
                        } else {
                            j = j8;
                            j2 = jLongValue2;
                            r6 = str4;
                            str2 = strZzc;
                            r5 = zzcfyVar;
                            j3 = jLongValue;
                            r1 = j7;
                        }
                        try {
                            try {
                                r5.wait(j3);
                            } catch (InterruptedException unused) {
                                throw new IOException("Wait interrupted.");
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            str5 = r1;
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        r6 = str4;
                        str2 = strZzc;
                        r5 = zzcfyVar;
                    }
                }
                jLongValue = j3;
                zzcfyVar = r5;
                str4 = r6;
                strZzc = str2;
                j8 = j;
                jLongValue2 = j2;
                j7 = r1;
            }
            return true;
        } catch (Exception e2) {
            e = e2;
            r6 = str4;
            str2 = strZzc;
            r5 = zzcfyVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzv() {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.zzcfp
    public final boolean zzw(String str, String[] strArr, zzcfh zzcfhVar) {
        this.zzf = str;
        this.zzi = zzcfhVar;
        String strZzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.zze.zzF(uriArr, this.zzb);
            zzcee zzceeVar = (zzcee) this.zzc.get();
            if (zzceeVar != null) {
                zzceeVar.zzt(strZzc, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
            this.zzk = -1L;
            zzx(0L);
            return true;
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to preload url " + str + " Exception: " + e.getMessage());
            com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzg(str, strZzc, Constants.IPC_BUNDLE_KEY_SEND_ERROR, zzd(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e));
            return false;
        }
    }
}
