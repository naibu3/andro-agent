package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzuj {
    public static final /* synthetic */ int zza = 0;
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap zzc = new HashMap();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair zza(zzan zzanVar) {
        int i;
        int i2;
        int i3;
        int i4;
        Pair pair;
        int i5;
        Integer num;
        Pair pair2;
        int i6;
        int i7;
        int i8;
        Integer num2;
        Integer num3;
        String str = zzanVar.zzk;
        if (str != null) {
            String[] strArrSplit = str.split("\\.");
            int i9 = 3;
            int i10 = 2;
            if (!"video/dolby-vision".equals(zzanVar.zzn)) {
                switch (strArrSplit[0]) {
                    case "avc1":
                    case "avc2":
                        String str2 = zzanVar.zzk;
                        int length = strArrSplit.length;
                        if (length >= 2) {
                            try {
                                if (strArrSplit[1].length() != 6) {
                                    i = 16;
                                    if (length < 3) {
                                        zzfk.zzf("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str2);
                                        break;
                                    } else {
                                        i2 = Integer.parseInt(strArrSplit[1]);
                                        i3 = Integer.parseInt(strArrSplit[2]);
                                    }
                                } else {
                                    i = 16;
                                    i2 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                                    i3 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                                }
                                if (i2 == 66) {
                                    i10 = 1;
                                } else if (i2 != 77) {
                                    i10 = i2 != 88 ? i2 != 100 ? i2 != 110 ? i2 != 122 ? i2 != 244 ? -1 : 64 : 32 : i : 8 : 4;
                                }
                                if (i10 == -1) {
                                    zzfk.zzf("MediaCodecUtil", "Unknown AVC profile: " + i2);
                                    break;
                                } else {
                                    switch (i3) {
                                        case 10:
                                            i4 = 1;
                                            break;
                                        case 11:
                                            i4 = 4;
                                            break;
                                        case 12:
                                            i4 = 8;
                                            break;
                                        case 13:
                                            i4 = i;
                                            break;
                                        default:
                                            switch (i3) {
                                                case 20:
                                                    i4 = 32;
                                                    break;
                                                case 21:
                                                    i4 = 64;
                                                    break;
                                                case 22:
                                                    i4 = 128;
                                                    break;
                                                default:
                                                    switch (i3) {
                                                        case 30:
                                                            i4 = 256;
                                                            break;
                                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                                                            i4 = 512;
                                                            break;
                                                        case 32:
                                                            i4 = 1024;
                                                            break;
                                                        default:
                                                            switch (i3) {
                                                                case 40:
                                                                    i4 = 2048;
                                                                    break;
                                                                case 41:
                                                                    i4 = 4096;
                                                                    break;
                                                                case 42:
                                                                    i4 = 8192;
                                                                    break;
                                                                default:
                                                                    switch (i3) {
                                                                        case 50:
                                                                            i4 = 16384;
                                                                            break;
                                                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                                                                            i4 = 32768;
                                                                            break;
                                                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                                                                            i4 = 65536;
                                                                            break;
                                                                        default:
                                                                            i4 = -1;
                                                                            break;
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                                    if (i4 != -1) {
                                        pair = new Pair(Integer.valueOf(i10), Integer.valueOf(i4));
                                        return pair;
                                    }
                                    zzfk.zzf("MediaCodecUtil", "Unknown AVC level: " + i3);
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                zzfk.zzf("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str2)));
                                break;
                            }
                        } else {
                            zzfk.zzf("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str2)));
                            break;
                        }
                    case "vp09":
                        String str3 = zzanVar.zzk;
                        if (strArrSplit.length >= 3) {
                            try {
                                int i11 = Integer.parseInt(strArrSplit[1]);
                                int i12 = Integer.parseInt(strArrSplit[2]);
                                int i13 = i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? -1 : 8 : 4 : 2 : 1;
                                if (i13 == -1) {
                                    zzfk.zzf("MediaCodecUtil", "Unknown VP9 profile: " + i11);
                                    break;
                                } else {
                                    if (i12 == 10) {
                                        i10 = 1;
                                    } else if (i12 != 11) {
                                        if (i12 == 20) {
                                            i10 = 4;
                                        } else if (i12 == 21) {
                                            i10 = 8;
                                        } else if (i12 == 30) {
                                            i10 = 16;
                                        } else if (i12 == 31) {
                                            i10 = 32;
                                        } else if (i12 == 40) {
                                            i10 = 64;
                                        } else if (i12 == 41) {
                                            i10 = 128;
                                        } else if (i12 == 50) {
                                            i10 = 256;
                                        } else if (i12 != 51) {
                                            switch (i12) {
                                                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                                                    i10 = 2048;
                                                    break;
                                                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                                    i10 = 4096;
                                                    break;
                                                case 62:
                                                    i10 = 8192;
                                                    break;
                                                default:
                                                    i10 = -1;
                                                    break;
                                            }
                                        } else {
                                            i10 = 512;
                                        }
                                    }
                                    if (i10 != -1) {
                                        pair = new Pair(Integer.valueOf(i13), Integer.valueOf(i10));
                                        return pair;
                                    }
                                    zzfk.zzf("MediaCodecUtil", "Unknown VP9 level: " + i12);
                                    break;
                                }
                            } catch (NumberFormatException unused2) {
                                zzfk.zzf("MediaCodecUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str3)));
                                break;
                            }
                        } else {
                            zzfk.zzf("MediaCodecUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str3)));
                            break;
                        }
                    case "hev1":
                    case "hvc1":
                        String str4 = zzanVar.zzk;
                        zzt zztVar = zzanVar.zzz;
                        if (strArrSplit.length < 4) {
                            zzfk.zzf("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str4)));
                            break;
                        } else {
                            Matcher matcher = zzb.matcher(strArrSplit[1]);
                            if (!matcher.matches()) {
                                zzfk.zzf("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str4)));
                                break;
                            } else {
                                String strGroup = matcher.group(1);
                                if (!"1".equals(strGroup)) {
                                    if (!"2".equals(strGroup)) {
                                        zzfk.zzf("MediaCodecUtil", "Unknown HEVC profile string: ".concat(String.valueOf(strGroup)));
                                        break;
                                    } else {
                                        i5 = (zztVar == null || zztVar.zzf != 6) ? 2 : 4096;
                                    }
                                } else {
                                    i5 = 1;
                                }
                                String str5 = strArrSplit[3];
                                if (str5 != null) {
                                    switch (str5.hashCode()) {
                                        case 70821:
                                            if (!str5.equals("H30")) {
                                                i9 = -1;
                                                break;
                                            } else {
                                                i9 = 13;
                                                break;
                                            }
                                        case 70914:
                                            if (str5.equals("H60")) {
                                                i9 = 14;
                                                break;
                                            }
                                            break;
                                        case 70917:
                                            if (str5.equals("H63")) {
                                                i9 = 15;
                                                break;
                                            }
                                            break;
                                        case 71007:
                                            if (str5.equals("H90")) {
                                                i9 = 16;
                                                break;
                                            }
                                            break;
                                        case 71010:
                                            if (str5.equals("H93")) {
                                                i9 = 17;
                                                break;
                                            }
                                            break;
                                        case 74665:
                                            if (str5.equals("L30")) {
                                                i9 = 0;
                                                break;
                                            }
                                            break;
                                        case 74758:
                                            if (str5.equals("L60")) {
                                                i9 = 1;
                                                break;
                                            }
                                            break;
                                        case 74761:
                                            if (str5.equals("L63")) {
                                                i9 = 2;
                                                break;
                                            }
                                            break;
                                        case 74851:
                                            if (!str5.equals("L90")) {
                                            }
                                            break;
                                        case 74854:
                                            if (str5.equals("L93")) {
                                                i9 = 4;
                                                break;
                                            }
                                            break;
                                        case 2193639:
                                            if (str5.equals("H120")) {
                                                i9 = 18;
                                                break;
                                            }
                                            break;
                                        case 2193642:
                                            if (str5.equals("H123")) {
                                                i9 = 19;
                                                break;
                                            }
                                            break;
                                        case 2193732:
                                            if (str5.equals("H150")) {
                                                i9 = 20;
                                                break;
                                            }
                                            break;
                                        case 2193735:
                                            if (str5.equals("H153")) {
                                                i9 = 21;
                                                break;
                                            }
                                            break;
                                        case 2193738:
                                            if (str5.equals("H156")) {
                                                i9 = 22;
                                                break;
                                            }
                                            break;
                                        case 2193825:
                                            if (str5.equals("H180")) {
                                                i9 = 23;
                                                break;
                                            }
                                            break;
                                        case 2193828:
                                            if (str5.equals("H183")) {
                                                i9 = 24;
                                                break;
                                            }
                                            break;
                                        case 2193831:
                                            if (str5.equals("H186")) {
                                                i9 = 25;
                                                break;
                                            }
                                            break;
                                        case 2312803:
                                            if (str5.equals("L120")) {
                                                i9 = 5;
                                                break;
                                            }
                                            break;
                                        case 2312806:
                                            if (str5.equals("L123")) {
                                                i9 = 6;
                                                break;
                                            }
                                            break;
                                        case 2312896:
                                            if (str5.equals("L150")) {
                                                i9 = 7;
                                                break;
                                            }
                                            break;
                                        case 2312899:
                                            if (str5.equals("L153")) {
                                                i9 = 8;
                                                break;
                                            }
                                            break;
                                        case 2312902:
                                            if (str5.equals("L156")) {
                                                i9 = 9;
                                                break;
                                            }
                                            break;
                                        case 2312989:
                                            if (str5.equals("L180")) {
                                                i9 = 10;
                                                break;
                                            }
                                            break;
                                        case 2312992:
                                            if (str5.equals("L183")) {
                                                i9 = 11;
                                                break;
                                            }
                                            break;
                                        case 2312995:
                                            if (str5.equals("L186")) {
                                                i9 = 12;
                                                break;
                                            }
                                            break;
                                    }
                                    switch (i9) {
                                        case 0:
                                            num = 1;
                                            break;
                                        case 1:
                                            num = 4;
                                            break;
                                        case 2:
                                            num = 16;
                                            break;
                                        case 3:
                                            num = 64;
                                            break;
                                        case 4:
                                            num = 256;
                                            break;
                                        case 5:
                                            num = 1024;
                                            break;
                                        case 6:
                                            num = 4096;
                                            break;
                                        case 7:
                                            num = 16384;
                                            break;
                                        case 8:
                                            num = 65536;
                                            break;
                                        case 9:
                                            num = 262144;
                                            break;
                                        case 10:
                                            num = 1048576;
                                            break;
                                        case 11:
                                            num = 4194304;
                                            break;
                                        case 12:
                                            num = 16777216;
                                            break;
                                        case 13:
                                            num = 2;
                                            break;
                                        case 14:
                                            num = 8;
                                            break;
                                        case 15:
                                            num = 32;
                                            break;
                                        case 16:
                                            num = 128;
                                            break;
                                        case 17:
                                            num = 512;
                                            break;
                                        case 18:
                                            num = 2048;
                                            break;
                                        case 19:
                                            num = 8192;
                                            break;
                                        case 20:
                                            num = 32768;
                                            break;
                                        case 21:
                                            num = 131072;
                                            break;
                                        case 22:
                                            num = 524288;
                                            break;
                                        case 23:
                                            num = 2097152;
                                            break;
                                        case 24:
                                            num = 8388608;
                                            break;
                                        case 25:
                                            num = 33554432;
                                            break;
                                    }
                                    if (num == null) {
                                        pair2 = new Pair(Integer.valueOf(i5), num);
                                        return pair2;
                                    }
                                    zzfk.zzf("MediaCodecUtil", "Unknown HEVC level string: ".concat(String.valueOf(str5)));
                                    break;
                                }
                                num = null;
                                if (num == null) {
                                }
                            }
                        }
                        break;
                    case "av01":
                        String str6 = zzanVar.zzk;
                        zzt zztVar2 = zzanVar.zzz;
                        if (strArrSplit.length >= 4) {
                            try {
                                int i14 = Integer.parseInt(strArrSplit[1]);
                                int i15 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                                int i16 = Integer.parseInt(strArrSplit[3]);
                                if (i14 != 0) {
                                    zzfk.zzf("MediaCodecUtil", "Unknown AV1 profile: " + i14);
                                    break;
                                } else {
                                    if (i16 == 8) {
                                        i6 = 1;
                                    } else if (i16 != 10) {
                                        zzfk.zzf("MediaCodecUtil", "Unknown AV1 bit depth: " + i16);
                                        break;
                                    } else {
                                        i6 = (zztVar2 == null || !(zztVar2.zzg != null || (i8 = zztVar2.zzf) == 7 || i8 == 6)) ? 2 : 4096;
                                    }
                                    switch (i15) {
                                        case 0:
                                            i7 = 1;
                                            break;
                                        case 1:
                                            i7 = 2;
                                            break;
                                        case 2:
                                            i7 = 4;
                                            break;
                                        case 3:
                                            i7 = 8;
                                            break;
                                        case 4:
                                            i7 = 16;
                                            break;
                                        case 5:
                                            i7 = 32;
                                            break;
                                        case 6:
                                            i7 = 64;
                                            break;
                                        case 7:
                                            i7 = 128;
                                            break;
                                        case 8:
                                            i7 = 256;
                                            break;
                                        case 9:
                                            i7 = 512;
                                            break;
                                        case 10:
                                            i7 = 1024;
                                            break;
                                        case 11:
                                            i7 = 2048;
                                            break;
                                        case 12:
                                            i7 = 4096;
                                            break;
                                        case 13:
                                            i7 = 8192;
                                            break;
                                        case 14:
                                            i7 = 16384;
                                            break;
                                        case 15:
                                            i7 = 32768;
                                            break;
                                        case 16:
                                            i7 = 65536;
                                            break;
                                        case 17:
                                            i7 = 131072;
                                            break;
                                        case 18:
                                            i7 = 262144;
                                            break;
                                        case 19:
                                            i7 = 524288;
                                            break;
                                        case 20:
                                            i7 = 1048576;
                                            break;
                                        case 21:
                                            i7 = 2097152;
                                            break;
                                        case 22:
                                            i7 = 4194304;
                                            break;
                                        case 23:
                                            i7 = 8388608;
                                            break;
                                        default:
                                            i7 = -1;
                                            break;
                                    }
                                    if (i7 != -1) {
                                        return new Pair(Integer.valueOf(i6), Integer.valueOf(i7));
                                    }
                                    zzfk.zzf("MediaCodecUtil", "Unknown AV1 level: " + i15);
                                    break;
                                }
                            } catch (NumberFormatException unused3) {
                                zzfk.zzf("MediaCodecUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str6)));
                                break;
                            }
                        } else {
                            zzfk.zzf("MediaCodecUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str6)));
                            break;
                        }
                        break;
                    case "mp4a":
                        String str7 = zzanVar.zzk;
                        if (strArrSplit.length == 3) {
                            try {
                                if ("audio/mp4a-latm".equals(zzcg.zzd(Integer.parseInt(strArrSplit[1], 16)))) {
                                    int i17 = Integer.parseInt(strArrSplit[2]);
                                    if (i17 == 17) {
                                        i9 = 17;
                                    } else if (i17 == 20) {
                                        i9 = 20;
                                    } else if (i17 == 23) {
                                        i9 = 23;
                                    } else if (i17 == 29) {
                                        i9 = 29;
                                    } else if (i17 == 39) {
                                        i9 = 39;
                                    } else if (i17 != 42) {
                                        switch (i17) {
                                            case 1:
                                                i9 = 1;
                                                break;
                                            case 2:
                                                i9 = 2;
                                                break;
                                            case 3:
                                                break;
                                            case 4:
                                                i9 = 4;
                                                break;
                                            case 5:
                                                i9 = 5;
                                                break;
                                            case 6:
                                                i9 = 6;
                                                break;
                                            default:
                                                i9 = -1;
                                                break;
                                        }
                                    } else {
                                        i9 = 42;
                                    }
                                    if (i9 != -1) {
                                        pair2 = new Pair(Integer.valueOf(i9), 0);
                                        return pair2;
                                    }
                                }
                            } catch (NumberFormatException unused4) {
                                zzfk.zzf("MediaCodecUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str7)));
                                break;
                            }
                        } else {
                            zzfk.zzf("MediaCodecUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str7)));
                            break;
                        }
                        break;
                }
            } else {
                String str8 = zzanVar.zzk;
                if (strArrSplit.length < 3) {
                    zzfk.zzf("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: ".concat(String.valueOf(str8)));
                } else {
                    Matcher matcher2 = zzb.matcher(strArrSplit[1]);
                    if (matcher2.matches()) {
                        String strGroup2 = matcher2.group(1);
                        if (strGroup2 != null) {
                            int iHashCode = strGroup2.hashCode();
                            if (iHashCode != 1567) {
                                switch (iHashCode) {
                                    case 1536:
                                        if (!strGroup2.equals("00")) {
                                            num2 = null;
                                            break;
                                        } else {
                                            num2 = 1;
                                            break;
                                        }
                                    case 1537:
                                        if (strGroup2.equals("01")) {
                                            num2 = 2;
                                            break;
                                        }
                                        break;
                                    case 1538:
                                        if (strGroup2.equals("02")) {
                                            num2 = 4;
                                            break;
                                        }
                                        break;
                                    case 1539:
                                        if (strGroup2.equals("03")) {
                                            num2 = 8;
                                            break;
                                        }
                                        break;
                                    case 1540:
                                        if (strGroup2.equals("04")) {
                                            num2 = 16;
                                            break;
                                        }
                                        break;
                                    case 1541:
                                        if (strGroup2.equals("05")) {
                                            num2 = 32;
                                            break;
                                        }
                                        break;
                                    case 1542:
                                        if (strGroup2.equals("06")) {
                                            num2 = 64;
                                            break;
                                        }
                                        break;
                                    case 1543:
                                        if (strGroup2.equals("07")) {
                                            num2 = 128;
                                            break;
                                        }
                                        break;
                                    case 1544:
                                        if (strGroup2.equals("08")) {
                                            num2 = 256;
                                            break;
                                        }
                                        break;
                                    case 1545:
                                        if (strGroup2.equals("09")) {
                                            num2 = 512;
                                            break;
                                        }
                                        break;
                                }
                                if (num2 != null) {
                                    zzfk.zzf("MediaCodecUtil", "Unknown Dolby Vision profile string: ".concat(String.valueOf(strGroup2)));
                                } else {
                                    String str9 = strArrSplit[2];
                                    if (str9 == null) {
                                        num3 = null;
                                        if (num3 == null) {
                                            return new Pair(num2, num3);
                                        }
                                        zzfk.zzf("MediaCodecUtil", "Unknown Dolby Vision level string: ".concat(String.valueOf(str9)));
                                    } else {
                                        int iHashCode2 = str9.hashCode();
                                        switch (iHashCode2) {
                                            case 1537:
                                                if (str9.equals("01")) {
                                                    num3 = 1;
                                                    break;
                                                }
                                                break;
                                            case 1538:
                                                if (str9.equals("02")) {
                                                    num3 = 2;
                                                    break;
                                                }
                                                break;
                                            case 1539:
                                                if (str9.equals("03")) {
                                                    num3 = 4;
                                                    break;
                                                }
                                                break;
                                            case 1540:
                                                if (str9.equals("04")) {
                                                    num3 = 8;
                                                    break;
                                                }
                                                break;
                                            case 1541:
                                                if (str9.equals("05")) {
                                                    num3 = 16;
                                                    break;
                                                }
                                                break;
                                            case 1542:
                                                if (str9.equals("06")) {
                                                    num3 = 32;
                                                    break;
                                                }
                                                break;
                                            case 1543:
                                                if (str9.equals("07")) {
                                                    num3 = 64;
                                                    break;
                                                }
                                                break;
                                            case 1544:
                                                if (str9.equals("08")) {
                                                    num3 = 128;
                                                    break;
                                                }
                                                break;
                                            case 1545:
                                                if (str9.equals("09")) {
                                                    num3 = 256;
                                                    break;
                                                }
                                                break;
                                            default:
                                                switch (iHashCode2) {
                                                    case 1567:
                                                        if (str9.equals("10")) {
                                                            num3 = 512;
                                                            break;
                                                        }
                                                        break;
                                                    case 1568:
                                                        if (str9.equals("11")) {
                                                            num3 = 1024;
                                                            break;
                                                        }
                                                        break;
                                                    case 1569:
                                                        if (str9.equals("12")) {
                                                            num3 = 2048;
                                                            break;
                                                        }
                                                        break;
                                                    case 1570:
                                                        if (str9.equals("13")) {
                                                            num3 = 4096;
                                                            break;
                                                        }
                                                        break;
                                                }
                                        }
                                        if (num3 == null) {
                                        }
                                    }
                                }
                            } else {
                                if (strGroup2.equals("10")) {
                                    num2 = 1024;
                                }
                                if (num2 != null) {
                                }
                            }
                        }
                    } else {
                        zzfk.zzf("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: ".concat(String.valueOf(str8)));
                    }
                }
            }
        }
        return null;
    }

    public static zztp zzb() throws zzud {
        List listZze = zze("audio/raw", false, false);
        if (listZze.isEmpty()) {
            return null;
        }
        return (zztp) listZze.get(0);
    }

    public static String zzc(zzan zzanVar) {
        Pair pairZza;
        if ("audio/eac3-joc".equals(zzanVar.zzn)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(zzanVar.zzn) || (pairZza = zza(zzanVar)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairZza.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static List zzd(zztx zztxVar, zzan zzanVar, boolean z, boolean z2) throws zzud {
        String strZzc = zzc(zzanVar);
        return strZzc == null ? zzgbc.zzm() : zze(strZzc, z, z2);
    }

    public static synchronized List zze(String str, boolean z, boolean z2) throws zzud {
        zzub zzubVar = new zzub(str, z, z2);
        HashMap map = zzc;
        List list = (List) map.get(zzubVar);
        if (list != null) {
            return list;
        }
        int i = zzgd.zza;
        ArrayList arrayListZzh = zzh(zzubVar, new zzuh(z, z2));
        if (z && arrayListZzh.isEmpty() && zzgd.zza <= 23) {
            arrayListZzh = zzh(zzubVar, new zzug(null));
            if (!arrayListZzh.isEmpty()) {
                zzfk.zzf("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((zztp) arrayListZzh.get(0)).zza);
            }
        }
        if ("audio/raw".equals(str)) {
            if (zzgd.zza < 26 && zzgd.zzb.equals("R9") && arrayListZzh.size() == 1 && ((zztp) arrayListZzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayListZzh.add(zztp.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            zzi(arrayListZzh, new zzui() { // from class: com.google.android.gms.internal.ads.zztz
                @Override // com.google.android.gms.internal.ads.zzui
                public final int zza(Object obj) {
                    int i2 = zzuj.zza;
                    String str2 = ((zztp) obj).zza;
                    if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                        return 1;
                    }
                    return (zzgd.zza >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                }
            });
        }
        if (zzgd.zza < 32 && arrayListZzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zztp) arrayListZzh.get(0)).zza)) {
            arrayListZzh.add((zztp) arrayListZzh.remove(0));
        }
        zzgbc zzgbcVarZzk = zzgbc.zzk(arrayListZzh);
        map.put(zzubVar, zzgbcVarZzk);
        return zzgbcVarZzk;
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    public static List zzf(zztx zztxVar, zzan zzanVar, boolean z, boolean z2) throws zzud {
        List listZze = zze(zzanVar.zzn, z, z2);
        List listZzd = zzd(zztxVar, zzanVar, z, z2);
        zzgaz zzgazVar = new zzgaz();
        zzgazVar.zzh(listZze);
        zzgazVar.zzh(listZzd);
        return zzgazVar.zzi();
    }

    public static List zzg(List list, final zzan zzanVar) {
        ArrayList arrayList = new ArrayList(list);
        zzi(arrayList, new zzui() { // from class: com.google.android.gms.internal.ads.zzua
            @Override // com.google.android.gms.internal.ads.zzui
            public final int zza(Object obj) {
                int i = zzuj.zza;
                return ((zztp) obj).zzd(zzanVar) ? 1 : 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0192 A[Catch: Exception -> 0x0225, TryCatch #2 {Exception -> 0x0225, blocks: (B:80:0x0145, B:86:0x015c, B:92:0x0171, B:94:0x0177, B:99:0x0188, B:101:0x0192, B:111:0x01be, B:102:0x0197, B:104:0x01a7, B:106:0x01af, B:95:0x017d), top: B:155:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0197 A[Catch: Exception -> 0x0225, TryCatch #2 {Exception -> 0x0225, blocks: (B:80:0x0145, B:86:0x015c, B:92:0x0171, B:94:0x0177, B:99:0x0188, B:101:0x0192, B:111:0x01be, B:102:0x0197, B:104:0x01a7, B:106:0x01af, B:95:0x017d), top: B:155:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0234 A[Catch: Exception -> 0x0282, TRY_ENTER, TryCatch #5 {Exception -> 0x0282, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:10:0x0034, B:14:0x0042, B:16:0x0048, B:18:0x004e, B:20:0x0056, B:22:0x005e, B:24:0x0068, B:26:0x0072, B:28:0x007c, B:30:0x0086, B:32:0x0090, B:34:0x009a, B:36:0x00a4, B:38:0x00ae, B:40:0x00b8, B:42:0x00be, B:44:0x00c6, B:46:0x00ce, B:48:0x00d7, B:138:0x022c, B:141:0x0234, B:143:0x023a, B:144:0x0254, B:145:0x0275, B:51:0x00e0, B:52:0x00e3, B:54:0x00eb, B:57:0x00f6, B:59:0x00fe, B:62:0x0109, B:64:0x0111, B:67:0x011c, B:69:0x0124, B:72:0x012f, B:74:0x0137), top: B:161:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0254 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0177 A[Catch: Exception -> 0x0225, TryCatch #2 {Exception -> 0x0225, blocks: (B:80:0x0145, B:86:0x015c, B:92:0x0171, B:94:0x0177, B:99:0x0188, B:101:0x0192, B:111:0x01be, B:102:0x0197, B:104:0x01a7, B:106:0x01af, B:95:0x017d), top: B:155:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017d A[Catch: Exception -> 0x0225, TryCatch #2 {Exception -> 0x0225, blocks: (B:80:0x0145, B:86:0x015c, B:92:0x0171, B:94:0x0177, B:99:0x0188, B:101:0x0192, B:111:0x01be, B:102:0x0197, B:104:0x01a7, B:106:0x01af, B:95:0x017d), top: B:155:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ArrayList zzh(zzub zzubVar, zzue zzueVar) throws Exception {
        String str;
        String str2;
        int i;
        int i2;
        String str3;
        boolean zIsVendor;
        String str4;
        zzub zzubVar2 = zzubVar;
        zzue zzueVar2 = zzueVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str5 = zzubVar2.zza;
            int iZza = zzueVar.zza();
            boolean zZze = zzueVar.zze();
            int i3 = 0;
            while (i3 < iZza) {
                MediaCodecInfo mediaCodecInfoZzb = zzueVar2.zzb(i3);
                if (zzgd.zza < 29 || !mediaCodecInfoZzb.isAlias()) {
                    String name = mediaCodecInfoZzb.getName();
                    if (mediaCodecInfoZzb.isEncoder() || ((!zZze && name.endsWith(".secure")) || ((zzgd.zza < 24 && (("OMX.SEC.aac.dec".equals(name) || "OMX.Exynos.AAC.Decoder".equals(name)) && "samsung".equals(zzgd.zzc) && (zzgd.zzb.startsWith("zeroflte") || zzgd.zzb.startsWith("zerolte") || zzgd.zzb.startsWith("zenlte") || "SC-05G".equals(zzgd.zzb) || "marinelteatt".equals(zzgd.zzb) || "404SC".equals(zzgd.zzb) || "SC-04G".equals(zzgd.zzb) || "SCV31".equals(zzgd.zzb)))) || (zzgd.zza <= 23 && "audio/eac3-joc".equals(str5) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(name))))) {
                        i = i3;
                        i2 = iZza;
                        str3 = str5;
                    } else {
                        String[] supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length) {
                                str = supportedTypes[i4];
                                if (str.equalsIgnoreCase(str5)) {
                                    break;
                                }
                                i4++;
                            } else if (str5.equals("video/dolby-vision")) {
                                str = "OMX.MS.HEVCDV.Decoder".equals(name) ? "video/hevcdv" : ("OMX.RTK.video.decoder".equals(name) || "OMX.realtek.video.decoder.tunneled".equals(name)) ? "video/dv_hevc" : null;
                            } else if (str5.equals("audio/alac") && "OMX.lge.alac.decoder".equals(name)) {
                                str = "audio/x-lg-alac";
                            } else if (str5.equals("audio/flac") && "OMX.lge.flac.decoder".equals(name)) {
                                str = "audio/x-lg-flac";
                            } else if (str5.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(name)) {
                                str = "audio/lg-ac3";
                            }
                        }
                        if (str != null) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                boolean zZzd = zzueVar2.zzd("tunneled-playback", str, capabilitiesForType);
                                boolean zZzc = zzueVar2.zzc("tunneled-playback", str, capabilitiesForType);
                                if (zzubVar2.zzc) {
                                    if (zZzd) {
                                        boolean zZzd2 = zzueVar2.zzd("secure-playback", str, capabilitiesForType);
                                        boolean zZzc2 = zzueVar2.zzc("secure-playback", str, capabilitiesForType);
                                        if (zzubVar2.zzb) {
                                        }
                                    }
                                    i = i3;
                                    i2 = iZza;
                                    str3 = str5;
                                } else {
                                    if (!zZzc) {
                                        boolean zZzd22 = zzueVar2.zzd("secure-playback", str, capabilitiesForType);
                                        boolean zZzc22 = zzueVar2.zzc("secure-playback", str, capabilitiesForType);
                                        if (zzubVar2.zzb) {
                                            if (!zZzc22) {
                                                boolean zIsHardwareAccelerated = zzgd.zza < 29 ? mediaCodecInfoZzb.isHardwareAccelerated() : !zzj(mediaCodecInfoZzb, str5);
                                                boolean zZzj = zzj(mediaCodecInfoZzb, str5);
                                                if (zzgd.zza < 29) {
                                                    zIsVendor = mediaCodecInfoZzb.isVendor();
                                                } else {
                                                    String strZza = zzfxm.zza(mediaCodecInfoZzb.getName());
                                                    zIsVendor = (strZza.startsWith("omx.google.") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) ? false : true;
                                                }
                                                if (zZze || zzubVar2.zzb != zZzd22) {
                                                    if (!zZze) {
                                                        try {
                                                            if (!zzubVar2.zzb) {
                                                                str4 = name;
                                                                i = i3;
                                                                i2 = iZza;
                                                                str3 = str5;
                                                                try {
                                                                    arrayList.add(zztp.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzj, zIsVendor, false, false));
                                                                } catch (Exception e) {
                                                                    e = e;
                                                                    str2 = str4;
                                                                    if (zzgd.zza > 23) {
                                                                    }
                                                                    zzfk.zzc("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                                    throw e;
                                                                }
                                                            }
                                                        } catch (Exception e2) {
                                                            e = e2;
                                                            str4 = name;
                                                            i = i3;
                                                            i2 = iZza;
                                                            str3 = str5;
                                                            str2 = str4;
                                                            if (zzgd.zza > 23) {
                                                            }
                                                            zzfk.zzc("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                            throw e;
                                                        }
                                                    }
                                                    i = i3;
                                                    i2 = iZza;
                                                    str3 = str5;
                                                    if (!zZze && zZzd22) {
                                                        StringBuilder sb = new StringBuilder();
                                                        try {
                                                            sb.append(name);
                                                            sb.append(".secure");
                                                            str2 = name;
                                                            try {
                                                                arrayList.add(zztp.zzc(sb.toString(), str3, str, capabilitiesForType, zIsHardwareAccelerated, zZzj, zIsVendor, false, true));
                                                                break;
                                                            } catch (Exception e3) {
                                                                e = e3;
                                                                if (zzgd.zza > 23 || arrayList.isEmpty()) {
                                                                    zzfk.zzc("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                                    throw e;
                                                                }
                                                                zzfk.zzc("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                                                i3 = i + 1;
                                                                zzubVar2 = zzubVar;
                                                                str5 = str3;
                                                                iZza = i2;
                                                                zzueVar2 = zzueVar;
                                                            }
                                                        } catch (Exception e4) {
                                                            e = e4;
                                                            str2 = name;
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (zZzd22) {
                                            zZzd22 = true;
                                            if (zzgd.zza < 29) {
                                            }
                                            boolean zZzj2 = zzj(mediaCodecInfoZzb, str5);
                                            if (zzgd.zza < 29) {
                                            }
                                            if (zZze) {
                                                if (!zZze) {
                                                }
                                                i = i3;
                                                i2 = iZza;
                                                str3 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                    i = i3;
                                    i2 = iZza;
                                    str3 = str5;
                                }
                            } catch (Exception e5) {
                                e = e5;
                                str2 = name;
                                i = i3;
                                i2 = iZza;
                                str3 = str5;
                            }
                        }
                    }
                }
                i3 = i + 1;
                zzubVar2 = zzubVar;
                str5 = str3;
                iZza = i2;
                zzueVar2 = zzueVar;
            }
            return arrayList;
        } catch (Exception e6) {
            throw new zzud(e6, null);
        }
    }

    private static void zzi(List list, final zzui zzuiVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzty
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i = zzuj.zza;
                zzui zzuiVar2 = zzuiVar;
                return zzuiVar2.zza(obj2) - zzuiVar2.zza(obj);
            }
        });
    }

    private static boolean zzj(MediaCodecInfo mediaCodecInfo, String str) {
        if (zzgd.zza >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzcg.zzg(str)) {
            return true;
        }
        String strZza = zzfxm.zza(mediaCodecInfo.getName());
        if (strZza.startsWith("arc.")) {
            return false;
        }
        if (strZza.startsWith("omx.google.") || strZza.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strZza.startsWith("omx.sec.") && strZza.contains(".sw.")) || strZza.equals("omx.qcom.video.decoder.hevcswvdec") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
            return true;
        }
        return (strZza.startsWith("omx.") || strZza.startsWith("c2.")) ? false : true;
    }
}
