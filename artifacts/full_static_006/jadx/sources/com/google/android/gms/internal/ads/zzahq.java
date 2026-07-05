package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzahq {
    public static final zzaho zza = new zzaho() { // from class: com.google.android.gms.internal.ads.zzahn
    };

    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final zzcd zza(byte[] bArr, int i, zzaho zzahoVar, zzagr zzagrVar) {
        zzahp zzahpVar;
        ArrayList arrayList = new ArrayList();
        zzfu zzfuVar = new zzfu(bArr, i);
        boolean z = false;
        if (zzfuVar.zzb() < 10) {
            zzfk.zzf("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iZzo = zzfuVar.zzo();
            if (iZzo == 4801587) {
                int iZzm = zzfuVar.zzm();
                zzfuVar.zzL(1);
                int iZzm2 = zzfuVar.zzm();
                int iZzl = zzfuVar.zzl();
                if (iZzm == 2) {
                    if ((iZzm2 & 64) != 0) {
                        zzfk.zzf("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    zzahpVar = new zzahp(iZzm, iZzm >= 4 && (iZzm2 & 128) != 0, iZzl);
                } else {
                    if (iZzm == 3) {
                        if ((iZzm2 & 64) != 0) {
                            int iZzg = zzfuVar.zzg();
                            zzfuVar.zzL(iZzg);
                            iZzl -= iZzg + 4;
                        }
                    } else if (iZzm == 4) {
                        if ((iZzm2 & 64) != 0) {
                            int iZzl2 = zzfuVar.zzl();
                            zzfuVar.zzL(iZzl2 - 4);
                            iZzl -= iZzl2;
                        }
                        if ((iZzm2 & 16) != 0) {
                            iZzl -= 10;
                        }
                    } else {
                        zzfk.zzf("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + iZzm);
                    }
                    if (iZzm >= 4) {
                        zzahpVar = new zzahp(iZzm, iZzm >= 4 && (iZzm2 & 128) != 0, iZzl);
                    }
                }
                if (zzahpVar != null) {
                    return null;
                }
                int iZzd = zzfuVar.zzd();
                int i2 = zzahpVar.zza == 2 ? 6 : 10;
                int iZze = zzahpVar.zzc;
                if (zzahpVar.zzb) {
                    iZze = zze(zzfuVar, zzahpVar.zzc);
                }
                zzfuVar.zzJ(iZzd + iZze);
                if (!zzk(zzfuVar, zzahpVar.zza, i2, false)) {
                    if (zzahpVar.zza != 4 || !zzk(zzfuVar, 4, i2, true)) {
                        zzfk.zzf("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + zzahpVar.zza);
                        return null;
                    }
                    z = true;
                }
                while (zzfuVar.zzb() >= i2) {
                    zzahr zzahrVarZzf = zzf(zzahpVar.zza, zzfuVar, z, i2, zzahoVar);
                    if (zzahrVarZzf != null) {
                        arrayList.add(zzahrVarZzf);
                    }
                }
                return new zzcd(arrayList);
            }
            zzfk.zzf("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.valueOf(String.format("%06X", Integer.valueOf(iZzo)))));
        }
        zzahpVar = null;
        if (zzahpVar != null) {
        }
    }

    private static int zzb(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static int zzc(byte[] bArr, int i, int i2) {
        int iZzd = zzd(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iZzd;
        }
        while (true) {
            int length = bArr.length;
            if (iZzd >= length - 1) {
                return length;
            }
            int i3 = iZzd + 1;
            if ((iZzd - i) % 2 == 0 && bArr[i3] == 0) {
                return iZzd;
            }
            iZzd = zzd(bArr, i3);
        }
    }

    private static int zzd(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    private static int zze(zzfu zzfuVar, int i) {
        byte[] bArrZzM = zzfuVar.zzM();
        int iZzd = zzfuVar.zzd();
        int i2 = iZzd;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= iZzd + i) {
                return i;
            }
            if ((bArrZzM[i2] & 255) == 255 && bArrZzM[i3] == 0) {
                System.arraycopy(bArrZzM, i2 + 2, bArrZzM, i3, (i - (i2 - iZzd)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private static com.google.android.gms.internal.ads.zzahr zzf(int r35, com.google.android.gms.internal.ads.zzfu r36, boolean r37, int r38, com.google.android.gms.internal.ads.zzaho r39) {
        /*
            Method dump skipped, instructions count: 1526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahq.zzf(int, com.google.android.gms.internal.ads.zzfu, boolean, int, com.google.android.gms.internal.ads.zzaho):com.google.android.gms.internal.ads.zzahr");
    }

    private static zzgbc zzg(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return zzgbc.zzn("");
        }
        zzgaz zzgazVar = new zzgaz();
        int iZzc = zzc(bArr, i2, i);
        while (i2 < iZzc) {
            zzgazVar.zzf(new String(bArr, i2, iZzc - i2, zzj(i)));
            i2 = zzb(i) + iZzc;
            iZzc = zzc(bArr, i2, i);
        }
        zzgbc zzgbcVarZzi = zzgazVar.zzi();
        return zzgbcVarZzi.isEmpty() ? zzgbc.zzn("") : zzgbcVarZzi;
    }

    private static String zzh(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    private static String zzi(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[Catch: all -> 0x00a8, TryCatch #0 {all -> 0x00a8, blocks: (B:3:0x0008, B:7:0x0015, B:18:0x003d, B:21:0x0048, B:23:0x006a, B:27:0x0070, B:39:0x008c, B:40:0x008e, B:43:0x0094, B:46:0x009e, B:29:0x007a, B:33:0x0081, B:8:0x0022), top: B:53:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008c A[Catch: all -> 0x00a8, TryCatch #0 {all -> 0x00a8, blocks: (B:3:0x0008, B:7:0x0015, B:18:0x003d, B:21:0x0048, B:23:0x006a, B:27:0x0070, B:39:0x008c, B:40:0x008e, B:43:0x0094, B:46:0x009e, B:29:0x007a, B:33:0x0081, B:8:0x0022), top: B:53:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean zzk(zzfu zzfuVar, int i, int i2, boolean z) {
        boolean z2;
        int iZzo;
        long jZzo;
        int iZzq;
        int i3;
        int iZzd = zzfuVar.zzd();
        while (true) {
            try {
                z2 = true;
                z2 = true;
                int i4 = 1;
                int i5 = 1;
                if (zzfuVar.zzb() >= i2) {
                    if (i >= 3) {
                        iZzo = zzfuVar.zzg();
                        jZzo = zzfuVar.zzu();
                        iZzq = zzfuVar.zzq();
                    } else {
                        iZzo = zzfuVar.zzo();
                        jZzo = zzfuVar.zzo();
                        iZzq = 0;
                    }
                    if (iZzo == 0 && jZzo == 0 && iZzq == 0) {
                        break;
                    }
                    if (i != 4 || z) {
                        if (i != 4) {
                            if ((iZzq & 64) == 0) {
                                i4 = 0;
                            }
                            int i6 = i4;
                            i5 = iZzq & 1;
                            i3 = i6;
                        } else if (i == 3) {
                            i3 = (iZzq & 32) != 0 ? 1 : 0;
                            if ((iZzq & 128) == 0) {
                                i5 = 0;
                            }
                        } else {
                            i3 = 0;
                            i5 = 0;
                        }
                        if (i5 != 0) {
                            i3 += 4;
                        }
                        if (jZzo < i3 && zzfuVar.zzb() >= jZzo) {
                            zzfuVar.zzL((int) jZzo);
                        }
                    } else {
                        if ((8421504 & jZzo) != 0) {
                            break;
                        }
                        jZzo = ((jZzo >> 24) << 21) | (((jZzo >> 16) & 255) << 14) | (jZzo & 255) | (((jZzo >> 8) & 255) << 7);
                        if (i != 4) {
                        }
                        if (i5 != 0) {
                        }
                        if (jZzo < i3) {
                            break;
                        }
                        zzfuVar.zzL((int) jZzo);
                    }
                } else {
                    break;
                }
            } finally {
                zzfuVar.zzK(iZzd);
            }
        }
        z2 = false;
        return z2;
    }

    private static byte[] zzl(byte[] bArr, int i, int i2) {
        return i2 <= i ? zzgd.zzf : Arrays.copyOfRange(bArr, i, i2);
    }

    private static Charset zzj(int i) {
        return i != 1 ? i != 2 ? i != 3 ? zzfxs.zzb : zzfxs.zzc : zzfxs.zzd : zzfxs.zzf;
    }
}
