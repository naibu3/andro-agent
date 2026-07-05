package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzacq {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static zzacp zza(byte[] bArr) throws zzch {
        return zzb(new zzft(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ae, code lost:
    
        if (r11 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzacp zzb(zzft zzftVar, boolean z) throws zzch {
        int iZzc = zzc(zzftVar);
        int iZzd = zzd(zzftVar);
        int iZzd2 = zzftVar.zzd(4);
        String str = "mp4a.40." + iZzc;
        int i = 22;
        if (iZzc == 5 || iZzc == 29) {
            iZzd = zzd(zzftVar);
            iZzc = zzc(zzftVar);
            if (iZzc == 22) {
                iZzd2 = zzftVar.zzd(4);
            }
        }
        if (z) {
            int i2 = 3;
            if (iZzc != 1 && iZzc != 2 && iZzc != 3 && iZzc != 4 && iZzc != 6 && iZzc != 7 && iZzc != 17) {
                switch (iZzc) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw zzch.zzc("Unsupported audio object type: " + iZzc);
                }
            }
            if (zzftVar.zzo()) {
                zzfk.zzf("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (zzftVar.zzo()) {
                zzftVar.zzm(14);
            }
            boolean zZzo = zzftVar.zzo();
            if (iZzd2 == 0) {
                throw new UnsupportedOperationException();
            }
            if (iZzc == 6) {
                zzftVar.zzm(3);
                if (zZzo) {
                    if (iZzc == 22) {
                        zzftVar.zzm(16);
                    } else {
                        i = iZzc;
                    }
                    if (i == 17 || i == 19 || i == 20 || i == 23) {
                        zzftVar.zzm(3);
                    }
                    zzftVar.zzm(1);
                }
                switch (iZzc) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int iZzd3 = zzftVar.zzd(2);
                        if (iZzd3 == 2) {
                            i2 = iZzd3;
                        }
                        throw zzch.zzc("Unsupported epConfig: " + i2);
                }
            }
            if (iZzc == 20) {
                iZzc = 20;
                zzftVar.zzm(3);
            }
            if (zZzo) {
            }
            switch (iZzc) {
            }
        }
        int i3 = zzc[iZzd2];
        if (i3 != -1) {
            return new zzacp(iZzd, i3, str, null);
        }
        throw zzch.zza(null, null);
    }

    private static int zzc(zzft zzftVar) {
        int iZzd = zzftVar.zzd(5);
        return iZzd == 31 ? zzftVar.zzd(6) + 32 : iZzd;
    }

    private static int zzd(zzft zzftVar) throws zzch {
        int iZzd = zzftVar.zzd(4);
        if (iZzd == 15) {
            if (zzftVar.zza() >= 24) {
                return zzftVar.zzd(24);
            }
            throw zzch.zza("AAC header insufficient data", null);
        }
        if (iZzd < 13) {
            return zzb[iZzd];
        }
        throw zzch.zza("AAC header wrong Sampling Frequency Index", null);
    }
}
