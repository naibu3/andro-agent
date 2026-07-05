package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcfv extends zzcfp implements zzie {
    private String zzd;
    private final zzced zze;
    private boolean zzf;
    private final zzcfu zzg;
    private final zzcfa zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzcfv(zzcee zzceeVar, zzced zzcedVar) {
        super(zzceeVar);
        this.zze = zzcedVar;
        this.zzg = new zzcfu();
        this.zzh = new zzcfa();
        this.zzk = new Object();
        this.zzl = (String) zzfyb.zzd(zzceeVar != null ? zzceeVar.zzr() : null).zzb("");
        this.zzm = zzceeVar != null ? zzceeVar.zzf() : 0;
    }

    protected static final String zzm(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
    }

    private final void zzv() {
        int iZza = (int) this.zzg.zza();
        int iZza2 = (int) this.zzh.zza(this.zzi);
        int iPosition = this.zzi.position();
        int iRound = Math.round(iZza2 * (iPosition / iZza));
        int iZzs = zzcdv.zzs();
        int iZzu = zzcdv.zzu();
        String str = this.zzd;
        zzn(str, zzm(str), iPosition, iZza, iRound, iZza2, iRound > 0, iZzs, iZzu);
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final void zza(zzhb zzhbVar, zzhh zzhhVar, boolean z, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final void zzb(zzhb zzhbVar, zzhh zzhhVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final void zzc(zzhb zzhbVar, zzhh zzhhVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final void zzd(zzhb zzhbVar, zzhh zzhhVar, boolean z) {
        if (zzhbVar instanceof zzhp) {
            this.zzg.zzb((zzhp) zzhbVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfp
    public final void zzf() {
        this.zzf = true;
    }

    public final String zzi() {
        return this.zzd;
    }

    public final ByteBuffer zzk() {
        synchronized (this.zzk) {
            ByteBuffer byteBuffer = this.zzi;
            if (byteBuffer != null && !this.zzj) {
                byteBuffer.flip();
                this.zzj = true;
            }
            this.zzf = true;
        }
        return this.zzi;
    }

    public final boolean zzl() {
        return this.zzn;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ae, code lost:
    
        r21.zzn = true;
        zzj(r22, r4, (int) r21.zzh.zza(r21.zzi));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00df, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:? -> B:45:0x0149). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzcfp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzt(String str) throws Throwable {
        String str2;
        String str3;
        this.zzd = str;
        String str4 = Constants.IPC_BUNDLE_KEY_SEND_ERROR;
        String strZzm = zzm(str);
        int i = 0;
        try {
            zzhk zzhkVar = new zzhk();
            zzhkVar.zzf(this.zzb);
            zzhkVar.zzc(this.zze.zzd);
            zzhkVar.zzd(this.zze.zzf);
            zzhkVar.zzb(true);
            zzhkVar.zze(this);
            zzhb zzhbVarZza = zzhkVar.zza();
            if (this.zze.zzj) {
                zzhbVarZza = new zzcey(this.zza, zzhbVarZza, this.zzl, this.zzm, null, null);
            }
            zzhbVarZza.zzb(new zzhh(Uri.parse(str), 0L, -1L, null));
            zzcee zzceeVar = (zzcee) this.zzc.get();
            if (zzceeVar != null) {
                zzceeVar.zzt(strZzm, this);
            }
            Clock clockZzB = com.google.android.gms.ads.internal.zzu.zzB();
            long jCurrentTimeMillis = clockZzB.currentTimeMillis();
            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzy)).longValue();
            long jLongValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzx)).longValue();
            this.zzi = ByteBuffer.allocate(this.zze.zzc);
            int i2 = 8192;
            byte[] bArr = new byte[8192];
            long j = jCurrentTimeMillis;
            while (true) {
                int iZza = zzhbVarZza.zza(bArr, i, Math.min(this.zzi.remaining(), i2));
                if (iZza == -1) {
                    break;
                }
                synchronized (this.zzk) {
                    try {
                        if (this.zzf) {
                            str2 = str4;
                        } else {
                            str2 = str4;
                            try {
                                this.zzi.put(bArr, 0, iZza);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        try {
                            if (this.zzi.remaining() <= 0) {
                                zzv();
                                break;
                            }
                            str3 = 1;
                            try {
                                if (this.zzf) {
                                    throw new IOException("Precache abort at " + this.zzi.limit() + " bytes");
                                }
                                long jCurrentTimeMillis2 = clockZzB.currentTimeMillis();
                                if (jCurrentTimeMillis2 - j >= jLongValue) {
                                    zzv();
                                    j = jCurrentTimeMillis2;
                                }
                                if (jCurrentTimeMillis2 - jCurrentTimeMillis > 1000 * jLongValue2) {
                                    throw new IOException("Timeout exceeded. Limit: " + jLongValue2 + " sec");
                                }
                                str4 = str2;
                                i = 0;
                                i2 = 8192;
                            } catch (Exception e) {
                                e = e;
                                String str5 = e.getClass().getCanonicalName() + ":" + e.getMessage();
                                com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to preload url " + str + " Exception: " + str5);
                                zzg(str, strZzm, str3, str5);
                                return false;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str3 = str2;
                            String str52 = e.getClass().getCanonicalName() + ":" + e.getMessage();
                            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to preload url " + str + " Exception: " + str52);
                            zzg(str, strZzm, str3, str52);
                            return false;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
        } catch (Exception e3) {
            e = e3;
            str2 = str4;
        }
    }
}
