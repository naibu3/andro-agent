package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzwm implements zzaae, zzvd {
    final /* synthetic */ zzwr zza;
    private final Uri zzc;
    private final zzid zzd;
    private final zzwg zze;
    private final zzadx zzf;
    private final zzeu zzg;
    private volatile boolean zzi;
    private long zzk;
    private zzafa zzm;
    private boolean zzn;
    private final zzaeq zzh = new zzaeq();
    private boolean zzj = true;
    private final long zzb = zzvf.zza();
    private zzhh zzl = zzi(0);

    public zzwm(zzwr zzwrVar, Uri uri, zzhb zzhbVar, zzwg zzwgVar, zzadx zzadxVar, zzeu zzeuVar) {
        this.zza = zzwrVar;
        this.zzc = uri;
        this.zzd = new zzid(zzhbVar);
        this.zze = zzwgVar;
        this.zzf = zzadxVar;
        this.zzg = zzeuVar;
    }

    static /* bridge */ /* synthetic */ void zzf(zzwm zzwmVar, long j, long j2) {
        zzwmVar.zzh.zza = j;
        zzwmVar.zzk = j2;
        zzwmVar.zzj = true;
        zzwmVar.zzn = false;
    }

    private final zzhh zzi(long j) {
        zzhf zzhfVar = new zzhf();
        zzhfVar.zzd(this.zzc);
        zzhfVar.zzc(j);
        zzhfVar.zza(6);
        zzhfVar.zzb(zzwr.zzb);
        return zzhfVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaae
    public final void zzg() {
        this.zzi = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[LOOP:0: B:3:0x0004->B:138:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01e3 A[EDGE_INSN: B:139:0x01e3->B:92:0x01e3 BREAK  A[LOOP:1: B:80:0x01a0->B:142:0x01a0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e A[Catch: all -> 0x0208, TryCatch #2 {all -> 0x0208, blocks: (B:6:0x000b, B:16:0x003c, B:17:0x0041, B:20:0x0057, B:21:0x005d, B:30:0x0093, B:32:0x009e, B:34:0x00aa, B:36:0x00b4, B:38:0x00c0, B:40:0x00ca, B:42:0x00d6, B:44:0x00e0, B:46:0x00f2, B:48:0x00fc, B:49:0x0102, B:58:0x0132, B:59:0x0139, B:61:0x0146, B:63:0x014e, B:65:0x016b, B:52:0x010c, B:55:0x0120, B:25:0x0069, B:28:0x007f), top: B:121:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4 A[Catch: all -> 0x0208, TryCatch #2 {all -> 0x0208, blocks: (B:6:0x000b, B:16:0x003c, B:17:0x0041, B:20:0x0057, B:21:0x005d, B:30:0x0093, B:32:0x009e, B:34:0x00aa, B:36:0x00b4, B:38:0x00c0, B:40:0x00ca, B:42:0x00d6, B:44:0x00e0, B:46:0x00f2, B:48:0x00fc, B:49:0x0102, B:58:0x0132, B:59:0x0139, B:61:0x0146, B:63:0x014e, B:65:0x016b, B:52:0x010c, B:55:0x0120, B:25:0x0069, B:28:0x007f), top: B:121:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca A[Catch: all -> 0x0208, TryCatch #2 {all -> 0x0208, blocks: (B:6:0x000b, B:16:0x003c, B:17:0x0041, B:20:0x0057, B:21:0x005d, B:30:0x0093, B:32:0x009e, B:34:0x00aa, B:36:0x00b4, B:38:0x00c0, B:40:0x00ca, B:42:0x00d6, B:44:0x00e0, B:46:0x00f2, B:48:0x00fc, B:49:0x0102, B:58:0x0132, B:59:0x0139, B:61:0x0146, B:63:0x014e, B:65:0x016b, B:52:0x010c, B:55:0x0120, B:25:0x0069, B:28:0x007f), top: B:121:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0 A[Catch: all -> 0x0208, TryCatch #2 {all -> 0x0208, blocks: (B:6:0x000b, B:16:0x003c, B:17:0x0041, B:20:0x0057, B:21:0x005d, B:30:0x0093, B:32:0x009e, B:34:0x00aa, B:36:0x00b4, B:38:0x00c0, B:40:0x00ca, B:42:0x00d6, B:44:0x00e0, B:46:0x00f2, B:48:0x00fc, B:49:0x0102, B:58:0x0132, B:59:0x0139, B:61:0x0146, B:63:0x014e, B:65:0x016b, B:52:0x010c, B:55:0x0120, B:25:0x0069, B:28:0x007f), top: B:121:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fc A[Catch: all -> 0x0208, TRY_LEAVE, TryCatch #2 {all -> 0x0208, blocks: (B:6:0x000b, B:16:0x003c, B:17:0x0041, B:20:0x0057, B:21:0x005d, B:30:0x0093, B:32:0x009e, B:34:0x00aa, B:36:0x00b4, B:38:0x00c0, B:40:0x00ca, B:42:0x00d6, B:44:0x00e0, B:46:0x00f2, B:48:0x00fc, B:49:0x0102, B:58:0x0132, B:59:0x0139, B:61:0x0146, B:63:0x014e, B:65:0x016b, B:52:0x010c, B:55:0x0120, B:25:0x0069, B:28:0x007f), top: B:121:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0132 A[Catch: all -> 0x0208, TryCatch #2 {all -> 0x0208, blocks: (B:6:0x000b, B:16:0x003c, B:17:0x0041, B:20:0x0057, B:21:0x005d, B:30:0x0093, B:32:0x009e, B:34:0x00aa, B:36:0x00b4, B:38:0x00c0, B:40:0x00ca, B:42:0x00d6, B:44:0x00e0, B:46:0x00f2, B:48:0x00fc, B:49:0x0102, B:58:0x0132, B:59:0x0139, B:61:0x0146, B:63:0x014e, B:65:0x016b, B:52:0x010c, B:55:0x0120, B:25:0x0069, B:28:0x007f), top: B:121:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0146 A[Catch: all -> 0x0208, TryCatch #2 {all -> 0x0208, blocks: (B:6:0x000b, B:16:0x003c, B:17:0x0041, B:20:0x0057, B:21:0x005d, B:30:0x0093, B:32:0x009e, B:34:0x00aa, B:36:0x00b4, B:38:0x00c0, B:40:0x00ca, B:42:0x00d6, B:44:0x00e0, B:46:0x00f2, B:48:0x00fc, B:49:0x0102, B:58:0x0132, B:59:0x0139, B:61:0x0146, B:63:0x014e, B:65:0x016b, B:52:0x010c, B:55:0x0120, B:25:0x0069, B:28:0x007f), top: B:121:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0186 A[Catch: all -> 0x0205, TryCatch #1 {all -> 0x0205, blocks: (B:67:0x017b, B:69:0x0186, B:70:0x018b, B:72:0x018f), top: B:119:0x017b }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018f A[Catch: all -> 0x0205, TRY_LEAVE, TryCatch #1 {all -> 0x0205, blocks: (B:67:0x017b, B:69:0x0186, B:70:0x018b, B:72:0x018f), top: B:119:0x017b }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e8  */
    @Override // com.google.android.gms.internal.ads.zzaae
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh() throws Throwable {
        int i;
        int i2;
        long j;
        long jZzb;
        boolean z;
        int i3;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean zEquals;
        List list5;
        int i4;
        zzid zzidVar;
        zzwr zzwrVar;
        zzu zzuVar;
        int iZza;
        int i5;
        int i6;
        int i7;
        while (!this.zzi) {
            try {
                j = this.zzh.zza;
                zzhh zzhhVarZzi = zzi(j);
                this.zzl = zzhhVarZzi;
                jZzb = this.zzd.zzb(zzhhVarZzi);
            } catch (Throwable th) {
                th = th;
                i = 0;
            }
            if (this.zzi) {
                zzwg zzwgVar = this.zze;
                if (zzwgVar.zzb() != -1) {
                    this.zzh.zza = zzwgVar.zzb();
                }
                zzhd.zza(this.zzd);
                return;
            }
            if (jZzb != -1) {
                jZzb += j;
                zzwr.zzC(this.zza);
            }
            long j2 = jZzb;
            zzwr zzwrVar2 = this.zza;
            Map mapZze = this.zzd.zze();
            List list6 = (List) mapZze.get("icy-br");
            if (list6 != null) {
                String str4 = (String) list6.get(0);
                try {
                    i7 = Integer.parseInt(str4) * 1000;
                } catch (NumberFormatException unused) {
                    i7 = -1;
                }
                if (i7 > 0) {
                    i3 = i7;
                    z = true;
                    list = (List) mapZze.get("icy-genre");
                    if (list == null) {
                        str = (String) list.get(0);
                        z = true;
                    } else {
                        str = null;
                    }
                    list2 = (List) mapZze.get("icy-name");
                    if (list2 == null) {
                        str2 = (String) list2.get(0);
                        z = true;
                    } else {
                        str2 = null;
                    }
                    list3 = (List) mapZze.get("icy-url");
                    if (list3 == null) {
                        str3 = (String) list3.get(0);
                        z = true;
                    } else {
                        str3 = null;
                    }
                    list4 = (List) mapZze.get("icy-pub");
                    if (list4 == null) {
                        zEquals = ((String) list4.get(0)).equals("1");
                        z = true;
                    } else {
                        zEquals = false;
                    }
                    list5 = (List) mapZze.get("icy-metaint");
                    if (list5 == null) {
                        String str5 = (String) list5.get(0);
                        try {
                            i6 = Integer.parseInt(str5);
                        } catch (NumberFormatException unused2) {
                            i6 = -1;
                        }
                        if (i6 > 0) {
                            i4 = i6;
                            z = true;
                            zzwrVar2.zzs = z ? new zzaha(i3, str, str2, str3, zEquals, i4) : null;
                            zzidVar = this.zzd;
                            zzwrVar = this.zza;
                            if (zzwrVar.zzs != null || zzwrVar.zzs.zzf == -1) {
                                zzuVar = zzidVar;
                            } else {
                                zzu zzveVar = new zzve(zzidVar, zzwrVar.zzs.zzf, this);
                                zzafa zzafaVarZzv = this.zza.zzv();
                                this.zzm = zzafaVarZzv;
                                zzafaVarZzv.zzl(zzwr.zzc);
                                zzuVar = zzveVar;
                            }
                            try {
                                this.zze.zzd(zzuVar, this.zzc, this.zzd.zze(), j, j2, this.zzf);
                                if (this.zza.zzs != null) {
                                    this.zze.zzc();
                                }
                                if (this.zzj) {
                                    i = 0;
                                } else {
                                    this.zze.zzf(j, this.zzk);
                                    i = 0;
                                    try {
                                        this.zzj = false;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        i2 = i;
                                        if (i2 != 1) {
                                        }
                                        zzhd.zza(this.zzd);
                                        throw th;
                                    }
                                }
                                long j3 = j;
                                iZza = i;
                                while (true) {
                                    if (iZza == 0) {
                                        break;
                                    }
                                    try {
                                        if (this.zzi) {
                                            iZza = i;
                                            break;
                                        }
                                        try {
                                            this.zzg.zza();
                                            iZza = this.zze.zza(this.zzh);
                                            long jZzb2 = this.zze.zzb();
                                            if (jZzb2 > this.zza.zzj + j3) {
                                                this.zzg.zzc();
                                                zzwr zzwrVar3 = this.zza;
                                                zzwrVar3.zzp.post(zzwrVar3.zzo);
                                                j3 = jZzb2;
                                            }
                                        } catch (InterruptedException unused3) {
                                            throw new InterruptedIOException();
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        i2 = iZza;
                                    }
                                }
                                if (iZza != 1) {
                                    i5 = i;
                                } else {
                                    zzwg zzwgVar2 = this.zze;
                                    if (zzwgVar2.zzb() != -1) {
                                        this.zzh.zza = zzwgVar2.zzb();
                                    }
                                    i5 = iZza;
                                }
                                zzhd.zza(this.zzd);
                                if (i5 == 0) {
                                    return;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                i = 0;
                            }
                        } else {
                            try {
                                zzfk.zzf("IcyHeaders", "Invalid metadata interval: " + str5);
                                i4 = -1;
                            } catch (NumberFormatException unused4) {
                                zzfk.zzf("IcyHeaders", "Invalid metadata interval: ".concat(String.valueOf(str5)));
                                i4 = i6;
                                zzwrVar2.zzs = z ? new zzaha(i3, str, str2, str3, zEquals, i4) : null;
                                zzidVar = this.zzd;
                                zzwrVar = this.zza;
                                if (zzwrVar.zzs != null) {
                                }
                                if (i2 != 1) {
                                }
                                zzhd.zza(this.zzd);
                                throw th;
                            }
                            zzwrVar2.zzs = z ? new zzaha(i3, str, str2, str3, zEquals, i4) : null;
                            zzidVar = this.zzd;
                            zzwrVar = this.zza;
                            if (zzwrVar.zzs != null) {
                                zzuVar = zzidVar;
                                this.zze.zzd(zzuVar, this.zzc, this.zzd.zze(), j, j2, this.zzf);
                                if (this.zza.zzs != null) {
                                }
                                if (this.zzj) {
                                }
                                long j32 = j;
                                iZza = i;
                                while (true) {
                                    if (iZza == 0) {
                                    }
                                }
                                if (iZza != 1) {
                                }
                                zzhd.zza(this.zzd);
                                if (i5 == 0) {
                                }
                            }
                        }
                    } else {
                        i4 = -1;
                        zzwrVar2.zzs = z ? new zzaha(i3, str, str2, str3, zEquals, i4) : null;
                        zzidVar = this.zzd;
                        zzwrVar = this.zza;
                        if (zzwrVar.zzs != null) {
                        }
                    }
                } else {
                    try {
                        zzfk.zzf("IcyHeaders", "Invalid bitrate: " + str4);
                        z = false;
                        i3 = -1;
                    } catch (NumberFormatException unused5) {
                        zzfk.zzf("IcyHeaders", "Invalid bitrate header: ".concat(String.valueOf(str4)));
                        z = false;
                        i3 = i7;
                        list = (List) mapZze.get("icy-genre");
                        if (list == null) {
                        }
                        list2 = (List) mapZze.get("icy-name");
                        if (list2 == null) {
                        }
                        list3 = (List) mapZze.get("icy-url");
                        if (list3 == null) {
                        }
                        list4 = (List) mapZze.get("icy-pub");
                        if (list4 == null) {
                        }
                        list5 = (List) mapZze.get("icy-metaint");
                        if (list5 == null) {
                        }
                        if (i2 != 1) {
                        }
                        zzhd.zza(this.zzd);
                        throw th;
                    }
                    list = (List) mapZze.get("icy-genre");
                    if (list == null) {
                    }
                    list2 = (List) mapZze.get("icy-name");
                    if (list2 == null) {
                    }
                    list3 = (List) mapZze.get("icy-url");
                    if (list3 == null) {
                    }
                    list4 = (List) mapZze.get("icy-pub");
                    if (list4 == null) {
                    }
                    list5 = (List) mapZze.get("icy-metaint");
                    if (list5 == null) {
                    }
                }
            } else {
                z = false;
                i3 = -1;
                list = (List) mapZze.get("icy-genre");
                if (list == null) {
                }
                list2 = (List) mapZze.get("icy-name");
                if (list2 == null) {
                }
                list3 = (List) mapZze.get("icy-url");
                if (list3 == null) {
                }
                list4 = (List) mapZze.get("icy-pub");
                if (list4 == null) {
                }
                list5 = (List) mapZze.get("icy-metaint");
                if (list5 == null) {
                }
            }
            if (i2 != 1) {
                zzwg zzwgVar3 = this.zze;
                if (zzwgVar3.zzb() != -1) {
                    this.zzh.zza = zzwgVar3.zzb();
                }
            }
            zzhd.zza(this.zzd);
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final void zza(zzfu zzfuVar) {
        long jMax = !this.zzn ? this.zzk : Math.max(zzwr.zzr(this.zza, true), this.zzk);
        int iZzb = zzfuVar.zzb();
        zzafa zzafaVar = this.zzm;
        zzafaVar.getClass();
        zzaey.zzb(zzafaVar, zzfuVar, iZzb);
        zzafaVar.zzs(jMax, 1, iZzb, 0, null);
        this.zzn = true;
    }
}
