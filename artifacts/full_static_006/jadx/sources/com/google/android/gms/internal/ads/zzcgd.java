package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcgd extends zzgv {
    private final Context zza;
    private final zzhb zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbcy zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private long zzn;
    private ListenableFuture zzo;
    private final AtomicLong zzp;
    private final zzcgo zzq;

    public zzcgd(Context context, zzhb zzhbVar, String str, int i, zzie zzieVar, zzcgo zzcgoVar) {
        super(false);
        this.zza = context;
        this.zzb = zzhbVar;
        this.zzq = zzcgoVar;
        this.zzc = str;
        this.zzd = i;
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = 0L;
        this.zzp = new AtomicLong(-1L);
        this.zzo = null;
        this.zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbR)).booleanValue();
        zzf(zzieVar);
    }

    private final boolean zzr() {
        if (!this.zze) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzer)).booleanValue() || this.zzl) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzes)).booleanValue() && !this.zzm;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.zzf;
        int iZza = inputStream != null ? inputStream.read(bArr, i, i2) : this.zzb.zza(bArr, i, i2);
        if (!this.zze || this.zzf != null) {
            zzg(iZza);
        }
        return iZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01dc  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.StringBuilder] */
    @Override // com.google.android.gms.internal.ads.zzhb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzhh zzhhVar) throws Throwable {
        zzbcv zzbcvVarZzb;
        Long l;
        boolean z;
        boolean z2;
        long jElapsedRealtime;
        zzbdk zzbdkVar;
        String string = "ms";
        if (this.zzg) {
            throw new IOException("Attempt to open an already open GcacheDataSource.");
        }
        boolean z3 = true;
        this.zzg = true;
        this.zzh = zzhhVar.zza;
        if (!this.zze) {
            zzj(zzhhVar);
        }
        this.zzi = zzbcy.zza(zzhhVar.zza);
        ?? sb = -1;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeo)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzhhVar.zze;
                this.zzi.zzi = zzfyv.zzc(this.zzc);
                this.zzi.zzj = this.zzd;
                zzbcvVarZzb = com.google.android.gms.ads.internal.zzu.zzc().zzb(this.zzi);
            } else {
                zzbcvVarZzb = null;
            }
            if (zzbcvVarZzb != null && zzbcvVarZzb.zze()) {
                this.zzj = zzbcvVarZzb.zzd();
                this.zzl = zzbcvVarZzb.zzg();
                this.zzm = zzbcvVarZzb.zzf();
                this.zzn = zzbcvVarZzb.zza();
                this.zzk = true;
                if (!zzr()) {
                    this.zzf = zzbcvVarZzb.zzc();
                    if (this.zze) {
                        zzj(zzhhVar);
                    }
                    return -1L;
                }
            }
        } else if (this.zzi != null) {
            this.zzi.zzh = zzhhVar.zze;
            this.zzi.zzi = zzfyv.zzc(this.zzc);
            this.zzi.zzj = this.zzd;
            if (this.zzi.zzg) {
                l = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeq);
            } else {
                l = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzep);
            }
            long jLongValue = l.longValue();
            long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
            com.google.android.gms.ads.internal.zzu.zzd();
            Future futureZza = zzbdj.zza(this.zza, this.zzi);
            try {
                try {
                    zzbdkVar = (zzbdk) futureZza.get(jLongValue, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    th = th;
                    z3 = sb;
                }
            } catch (InterruptedException unused) {
                z2 = false;
            } catch (ExecutionException | TimeoutException unused2) {
                z = false;
            } catch (Throwable th2) {
                th = th2;
                z3 = false;
            }
            try {
                this.zzj = zzbdkVar.zzd();
                this.zzl = zzbdkVar.zzf();
                this.zzm = zzbdkVar.zze();
                this.zzn = zzbdkVar.zza();
            } catch (InterruptedException unused3) {
                z2 = true;
                futureZza.cancel(true);
                Thread.currentThread().interrupt();
                jElapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - jElapsedRealtime2;
                this.zzq.zza.zzab(z2, jElapsedRealtime);
                this.zzk = z2;
                sb = new StringBuilder("Cache connection took ");
                sb.append(jElapsedRealtime);
                sb.append("ms");
                string = sb.toString();
                com.google.android.gms.ads.internal.util.zze.zza(string);
                this.zzk = false;
                if (this.zzi != null) {
                }
                return this.zzb.zzb(zzhhVar);
            } catch (ExecutionException | TimeoutException unused4) {
                z = true;
                futureZza.cancel(true);
                jElapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - jElapsedRealtime2;
                this.zzq.zza.zzab(z, jElapsedRealtime);
                this.zzk = z;
                sb = new StringBuilder("Cache connection took ");
                sb.append(jElapsedRealtime);
                sb.append("ms");
                string = sb.toString();
                com.google.android.gms.ads.internal.util.zze.zza(string);
                this.zzk = false;
                if (this.zzi != null) {
                }
                return this.zzb.zzb(zzhhVar);
            } catch (Throwable th3) {
                th = th3;
                long jElapsedRealtime3 = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - jElapsedRealtime2;
                this.zzq.zza.zzab(z3, jElapsedRealtime3);
                this.zzk = z3;
                com.google.android.gms.ads.internal.util.zze.zza("Cache connection took " + jElapsedRealtime3 + string);
                throw th;
            }
            if (!zzr()) {
                this.zzf = zzbdkVar.zzc();
                if (this.zze) {
                    zzj(zzhhVar);
                }
                long jElapsedRealtime4 = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - jElapsedRealtime2;
                this.zzq.zza.zzab(true, jElapsedRealtime4);
                this.zzk = true;
                com.google.android.gms.ads.internal.util.zze.zza("Cache connection took " + jElapsedRealtime4 + "ms");
                return -1L;
            }
            long jElapsedRealtime5 = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - jElapsedRealtime2;
            this.zzq.zza.zzab(true, jElapsedRealtime5);
            this.zzk = true;
            string = "Cache connection took " + jElapsedRealtime5 + "ms";
            com.google.android.gms.ads.internal.util.zze.zza(string);
        }
        this.zzk = false;
        if (this.zzi != null) {
            zzhf zzhfVarZza = zzhhVar.zza();
            zzhfVarZza.zzd(Uri.parse(this.zzi.zza));
            zzhhVar = zzhfVarZza.zze();
        }
        return this.zzb.zzb(zzhhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        boolean z = (this.zze && this.zzf == null) ? false : true;
        InputStream inputStream = this.zzf;
        if (inputStream != null) {
            IOUtils.closeQuietly(inputStream);
            this.zzf = null;
        } else {
            this.zzb.zzd();
        }
        if (z) {
            zzh();
        }
    }

    public final long zzk() {
        return this.zzn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long zzl() {
        if (this.zzi != null) {
            if (this.zzp.get() != -1) {
                return this.zzp.get();
            }
            synchronized (this) {
                if (this.zzo == null) {
                    this.zzo = zzcci.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcgc
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.zza.zzm();
                        }
                    });
                }
            }
            if (this.zzo.isDone()) {
                try {
                    this.zzp.compareAndSet(-1L, ((Long) this.zzo.get()).longValue());
                    return this.zzp.get();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
        return -1L;
    }

    final /* synthetic */ Long zzm() throws Exception {
        return Long.valueOf(com.google.android.gms.ads.internal.zzu.zzc().zza(this.zzi));
    }

    public final boolean zzn() {
        return this.zzj;
    }

    public final boolean zzo() {
        return this.zzm;
    }

    public final boolean zzp() {
        return this.zzl;
    }

    public final boolean zzq() {
        return this.zzk;
    }
}
