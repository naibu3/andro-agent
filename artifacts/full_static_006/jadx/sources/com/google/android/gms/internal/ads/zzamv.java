package com.google.android.gms.internal.ads;

import admob.plus.cordova.Generated;
import android.text.Layout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.messaging.Constants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.cordova.networkinformation.NetworkManager;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzamv implements zzalv {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzamt zzh = new zzamt(30.0f, 1, 1);

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static long zzc(String str, zzamt zzamtVar) throws NumberFormatException, zzalr {
        double d;
        double d2;
        Matcher matcher = zzc.matcher(str);
        char c = 2;
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            long j = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            long j2 = Long.parseLong(strGroup2) * 60;
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d3 = j + j2;
            double d4 = Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d5 = strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d;
            double d6 = d3 + d4;
            return (long) ((d6 + d5 + (matcher.group(5) != null ? Long.parseLong(r13) / zzamtVar.zza : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / zzamtVar.zzb) / zzamtVar.zza : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = zzd.matcher(str);
        if (!matcher2.matches()) {
            throw new zzalr("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String strGroup5 = matcher2.group(1);
        strGroup5.getClass();
        double d7 = Double.parseDouble(strGroup5);
        String strGroup6 = matcher2.group(2);
        strGroup6.getClass();
        int iHashCode = strGroup6.hashCode();
        if (iHashCode != 102) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 3494) {
                        if (iHashCode != 115) {
                            c = (iHashCode == 116 && strGroup6.equals("t")) ? (char) 5 : (char) 65535;
                        } else if (!strGroup6.equals("s")) {
                        }
                    } else if (strGroup6.equals("ms")) {
                        c = 3;
                    }
                } else if (strGroup6.equals("m")) {
                    c = 1;
                }
            } else if (strGroup6.equals("h")) {
                c = 0;
            }
        } else if (strGroup6.equals("f")) {
            c = 4;
        }
        if (c == 0) {
            d = 3600.0d;
        } else {
            if (c != 1) {
                if (c == 3) {
                    d2 = 1000.0d;
                } else {
                    if (c != 4) {
                        if (c == 5) {
                            d2 = zzamtVar.zzc;
                        }
                        return (long) (d7 * 1000000.0d);
                    }
                    d2 = zzamtVar.zza;
                }
                d7 /= d2;
                return (long) (d7 * 1000000.0d);
            }
            d = 60.0d;
        }
        d7 *= d;
        return (long) (d7 * 1000000.0d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Layout.Alignment zzd(String str) {
        char c;
        String strZza = zzfxm.zza(str);
        switch (strZza.hashCode()) {
            case -1364013995:
                if (!strZza.equals("center")) {
                    c = 65535;
                    break;
                } else {
                    c = 4;
                    break;
                }
            case 100571:
                if (strZza.equals("end")) {
                    c = 3;
                    break;
                }
                break;
            case 3317767:
                if (strZza.equals("left")) {
                    c = 0;
                    break;
                }
                break;
            case 108511772:
                if (strZza.equals("right")) {
                    c = 2;
                    break;
                }
                break;
            case 109757538:
                if (strZza.equals(Generated.Actions.START)) {
                    c = 1;
                    break;
                }
                break;
        }
        if (c == 0 || c == 1) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (c == 2 || c == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (c != 4) {
            return null;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private static zzamy zze(zzamy zzamyVar) {
        return zzamyVar == null ? new zzamy() : zzamyVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v67 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzamy zzf(XmlPullParser xmlPullParser, zzamy zzamyVar) throws zzalr {
        ?? r6;
        Matcher matcher;
        int attributeCount = xmlPullParser.getAttributeCount();
        boolean z = false;
        zzamy zzamyVarZze = zzamyVar;
        int i = 0;
        while (i < attributeCount) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            ?? r10 = -1;
             = -1;
             = -1;
             = -1;
             = -1;
            ?? r102 = -1;
             = -1;
             = -1;
            ?? r103 = -1;
             = -1;
             = -1;
             = -1;
             = -1;
             = -1;
             = -1;
            ?? r104 = -1;
             = -1;
             = -1;
            ?? r105 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (!attributeName.equals("fontStyle")) {
                        r6 = -1;
                        break;
                    } else {
                        r6 = 6;
                        break;
                    }
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        r6 = 3;
                        break;
                    }
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        r6 = 7;
                        break;
                    }
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        r6 = 12;
                        break;
                    }
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        r6 = 5;
                        break;
                    }
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        r6 = z;
                        break;
                    }
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        r6 = 10;
                        break;
                    }
                    break;
                case 94842723:
                    if (attributeName.equals(TypedValues.Custom.S_COLOR)) {
                        r6 = 2;
                        break;
                    }
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        r6 = 14;
                        break;
                    }
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        r6 = 9;
                        break;
                    }
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        r6 = 4;
                        break;
                    }
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        r6 = 13;
                        break;
                    }
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        r6 = 11;
                        break;
                    }
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        r6 = 1;
                        break;
                    }
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        r6 = 8;
                        break;
                    }
                    break;
            }
            switch (r6) {
                case 0:
                    if (!"style".equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        zzamyVarZze = zze(zzamyVarZze);
                        zzamyVarZze.zzs(attributeValue);
                        break;
                    }
                case 1:
                    zzamyVarZze = zze(zzamyVarZze);
                    try {
                        zzamyVarZze.zzm(zzet.zzb(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        zzfk.zzf("TtmlParser", "Failed parsing background value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 2:
                    zzamyVarZze = zze(zzamyVarZze);
                    try {
                        zzamyVarZze.zzo(zzet.zzb(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused2) {
                        zzfk.zzf("TtmlParser", "Failed parsing color value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 3:
                    zzamyVarZze = zze(zzamyVarZze);
                    zzamyVarZze.zzp(attributeValue);
                    break;
                case 4:
                    try {
                        zzamyVarZze = zze(zzamyVarZze);
                        int i2 = zzgd.zza;
                        String[] strArrSplit = attributeValue.split("\\s+", -1);
                        int length = strArrSplit.length;
                        if (length == 1) {
                            matcher = zze.matcher(attributeValue);
                        } else {
                            if (length != 2) {
                                throw new zzalr("Invalid number of entries for fontSize: " + length + ".");
                            }
                            matcher = zze.matcher(strArrSplit[1]);
                            zzfk.zzf("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                        }
                        if (!matcher.matches()) {
                            throw new zzalr("Invalid expression for fontSize: '" + attributeValue + "'.");
                        }
                        String strGroup = matcher.group(3);
                        if (strGroup == null) {
                            throw null;
                        }
                        int iHashCode = strGroup.hashCode();
                        if (iHashCode != 37) {
                            if (iHashCode != 3240) {
                                if (iHashCode == 3592 && strGroup.equals("px")) {
                                    r10 = 0;
                                }
                            } else if (strGroup.equals("em")) {
                                r10 = 1;
                            }
                        } else if (strGroup.equals("%")) {
                            r10 = 2;
                        }
                        if (r10 == 0) {
                            zzamyVarZze.zzr(1);
                        } else if (r10 == 1) {
                            zzamyVarZze.zzr(2);
                        } else {
                            if (r10 != 2) {
                                throw new zzalr("Invalid unit for fontSize: '" + strGroup + "'.");
                            }
                            zzamyVarZze.zzr(3);
                        }
                        String strGroup2 = matcher.group(1);
                        if (strGroup2 == null) {
                            throw null;
                        }
                        zzamyVarZze.zzq(Float.parseFloat(strGroup2));
                        break;
                    } catch (zzalr unused3) {
                        zzfk.zzf("TtmlParser", "Failed parsing fontSize value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                    break;
                case 5:
                    zzamyVarZze = zze(zzamyVarZze);
                    zzamyVarZze.zzn("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 6:
                    zzamyVarZze = zze(zzamyVarZze);
                    zzamyVarZze.zzt("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 7:
                    zzamyVarZze = zze(zzamyVarZze);
                    zzamyVarZze.zzz(zzd(attributeValue));
                    break;
                case 8:
                    zzamyVarZze = zze(zzamyVarZze);
                    zzamyVarZze.zzv(zzd(attributeValue));
                    break;
                case 9:
                    String strZza = zzfxm.zza(attributeValue);
                    int iHashCode2 = strZza.hashCode();
                    if (iHashCode2 != 96673) {
                        if (iHashCode2 == 3387192 && strZza.equals(NetworkManager.TYPE_NONE)) {
                            r105 = z;
                        }
                    } else if (strZza.equals("all")) {
                        r105 = 1;
                    }
                    if (r105 == 0) {
                        zzamyVarZze = zze(zzamyVarZze);
                        zzamyVarZze.zzA(z);
                        break;
                    } else if (r105 == 1) {
                        zzamyVarZze = zze(zzamyVarZze);
                        zzamyVarZze.zzA(true);
                        break;
                    } else {
                        break;
                    }
                    break;
                case 10:
                    String strZza2 = zzfxm.zza(attributeValue);
                    switch (strZza2.hashCode()) {
                        case -618561360:
                            if (strZza2.equals("baseContainer")) {
                                r104 = 2;
                                break;
                            }
                            break;
                        case -410956671:
                            if (strZza2.equals("container")) {
                                r104 = z;
                                break;
                            }
                            break;
                        case -250518009:
                            if (strZza2.equals("delimiter")) {
                                r104 = 5;
                                break;
                            }
                            break;
                        case -136074796:
                            if (strZza2.equals("textContainer")) {
                                r104 = 4;
                                break;
                            }
                            break;
                        case 3016401:
                            if (strZza2.equals("base")) {
                                r104 = 1;
                                break;
                            }
                            break;
                        case 3556653:
                            if (strZza2.equals("text")) {
                                r104 = 3;
                                break;
                            }
                            break;
                    }
                    if (r104 == 0) {
                        zzamyVarZze = zze(zzamyVarZze);
                        zzamyVarZze.zzx(1);
                        break;
                    } else if (r104 != 1 && r104 != 2) {
                        if (r104 != 3 && r104 != 4) {
                            if (r104 == 5) {
                                zzamyVarZze = zze(zzamyVarZze);
                                zzamyVarZze.zzx(4);
                                break;
                            } else {
                                break;
                            }
                        } else {
                            zzamyVarZze = zze(zzamyVarZze);
                            zzamyVarZze.zzx(3);
                            break;
                        }
                    } else {
                        zzamyVarZze = zze(zzamyVarZze);
                        zzamyVarZze.zzx(2);
                        break;
                    }
                case 11:
                    String strZza3 = zzfxm.zza(attributeValue);
                    int iHashCode3 = strZza3.hashCode();
                    if (iHashCode3 != -1392885889) {
                        if (iHashCode3 == 92734940 && strZza3.equals("after")) {
                            r103 = 1;
                        }
                    } else if (strZza3.equals("before")) {
                        r103 = z;
                    }
                    if (r103 == 0) {
                        zzamyVarZze = zze(zzamyVarZze);
                        zzamyVarZze.zzw(1);
                        break;
                    } else if (r103 == 1) {
                        zzamyVarZze = zze(zzamyVarZze);
                        zzamyVarZze.zzw(2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    String strZza4 = zzfxm.zza(attributeValue);
                    switch (strZza4.hashCode()) {
                        case -1461280213:
                            if (strZza4.equals("nounderline")) {
                                r102 = 3;
                                break;
                            }
                            break;
                        case -1026963764:
                            if (strZza4.equals("underline")) {
                                r102 = 2;
                                break;
                            }
                            break;
                        case 913457136:
                            if (strZza4.equals("nolinethrough")) {
                                r102 = 1;
                                break;
                            }
                            break;
                        case 1679736913:
                            if (strZza4.equals("linethrough")) {
                                r102 = z;
                                break;
                            }
                            break;
                    }
                    if (r102 == 0) {
                        zzamyVarZze = zze(zzamyVarZze);
                        zzamyVarZze.zzu(true);
                        break;
                    } else if (r102 == 1) {
                        zzamyVarZze = zze(zzamyVarZze);
                        zzamyVarZze.zzu(z);
                        break;
                    } else if (r102 == 2) {
                        zzamyVarZze = zze(zzamyVarZze);
                        zzamyVarZze.zzC(true);
                        break;
                    } else if (r102 == 3) {
                        zzamyVarZze = zze(zzamyVarZze);
                        zzamyVarZze.zzC(z);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    zzamyVarZze = zze(zzamyVarZze);
                    zzamyVarZze.zzB(zzamr.zza(attributeValue));
                    break;
                case 14:
                    zzamy zzamyVarZze2 = zze(zzamyVarZze);
                    Matcher matcher2 = zza.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (matcher2.matches()) {
                        try {
                            String strGroup3 = matcher2.group(1);
                            if (strGroup3 == null) {
                                throw null;
                                break;
                            } else {
                                fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup3)));
                            }
                        } catch (NumberFormatException e) {
                            zzfk.zzg("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e);
                        }
                    } else {
                        zzfk.zzf("TtmlParser", "Invalid value for shear: ".concat(String.valueOf(attributeValue)));
                    }
                    zzamyVarZze2.zzy(fMin);
                    zzamyVarZze = zzamyVarZze2;
                    break;
            }
            i++;
            z = false;
        }
        return zzamyVarZze;
    }

    private static String[] zzg(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new String[0];
        }
        int i = zzgd.zza;
        return strTrim.split("\\s+", -1);
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void zza(byte[] bArr, int i, int i2, zzalu zzaluVar, zzev zzevVar) {
        zzalp.zza(zzb(bArr, i, i2), zzaluVar, zzevVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0386 A[Catch: IOException -> 0x06d0, XmlPullParserException -> 0x06da, TRY_LEAVE, TryCatch #17 {IOException -> 0x06d0, XmlPullParserException -> 0x06da, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:64:0x0181, B:84:0x01da, B:87:0x01e8, B:89:0x01ee, B:91:0x01f6, B:93:0x01fe, B:95:0x0206, B:97:0x020e, B:99:0x0216, B:101:0x021c, B:103:0x0224, B:105:0x022c, B:107:0x0232, B:109:0x0238, B:111:0x0240, B:113:0x0248, B:116:0x0251, B:409:0x06b7, B:117:0x0275, B:119:0x027b, B:121:0x0284, B:123:0x0293, B:125:0x029d, B:127:0x02b1, B:129:0x02b7, B:273:0x04f1, B:130:0x02bb, B:133:0x02c5, B:135:0x02cb, B:137:0x02d6, B:139:0x02dc, B:140:0x02e3, B:143:0x02ef, B:272:0x04ec, B:147:0x02fc, B:149:0x0304, B:153:0x031d, B:155:0x0323, B:157:0x0330, B:175:0x037e, B:177:0x0386, B:180:0x0395, B:182:0x039b, B:184:0x03a8, B:202:0x03f9, B:204:0x0401, B:225:0x0447, B:227:0x044f, B:254:0x0498, B:186:0x03b4, B:188:0x03b6, B:189:0x03b7, B:190:0x03c2, B:193:0x03ca, B:196:0x03d6, B:198:0x03dc, B:200:0x03e7, B:257:0x04a5, B:259:0x04a7, B:260:0x04a8, B:261:0x04b3, B:262:0x04be, B:159:0x033a, B:161:0x033c, B:162:0x033d, B:163:0x0347, B:166:0x0351, B:169:0x035c, B:171:0x0362, B:173:0x036d, B:265:0x04c6, B:267:0x04c8, B:268:0x04c9, B:269:0x04d4, B:270:0x04df, B:279:0x0507, B:282:0x0524, B:335:0x05c6, B:316:0x0580, B:319:0x0589, B:381:0x0645, B:322:0x0593, B:325:0x059d, B:332:0x05b2, B:333:0x05b7, B:334:0x05bf, B:342:0x05da, B:346:0x05e4, B:350:0x05ed, B:360:0x0601, B:368:0x0616, B:370:0x0624, B:372:0x0629, B:362:0x0608, B:67:0x018b, B:69:0x0197, B:72:0x01a2, B:74:0x01a8, B:76:0x01b3, B:78:0x01be, B:80:0x01c0, B:81:0x01c1, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x0129, B:48:0x0134, B:54:0x014a, B:56:0x0151, B:63:0x0177, B:58:0x016c, B:60:0x0172, B:385:0x0663, B:387:0x0670, B:390:0x0674, B:392:0x067e, B:394:0x0688, B:398:0x0694, B:396:0x068f, B:402:0x06a8, B:406:0x06b0, B:414:0x06cf), top: B:447:0x0006, inners: #1, #2, #4, #12, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0401 A[Catch: IOException -> 0x06d0, XmlPullParserException -> 0x06da, TRY_LEAVE, TryCatch #17 {IOException -> 0x06d0, XmlPullParserException -> 0x06da, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:64:0x0181, B:84:0x01da, B:87:0x01e8, B:89:0x01ee, B:91:0x01f6, B:93:0x01fe, B:95:0x0206, B:97:0x020e, B:99:0x0216, B:101:0x021c, B:103:0x0224, B:105:0x022c, B:107:0x0232, B:109:0x0238, B:111:0x0240, B:113:0x0248, B:116:0x0251, B:409:0x06b7, B:117:0x0275, B:119:0x027b, B:121:0x0284, B:123:0x0293, B:125:0x029d, B:127:0x02b1, B:129:0x02b7, B:273:0x04f1, B:130:0x02bb, B:133:0x02c5, B:135:0x02cb, B:137:0x02d6, B:139:0x02dc, B:140:0x02e3, B:143:0x02ef, B:272:0x04ec, B:147:0x02fc, B:149:0x0304, B:153:0x031d, B:155:0x0323, B:157:0x0330, B:175:0x037e, B:177:0x0386, B:180:0x0395, B:182:0x039b, B:184:0x03a8, B:202:0x03f9, B:204:0x0401, B:225:0x0447, B:227:0x044f, B:254:0x0498, B:186:0x03b4, B:188:0x03b6, B:189:0x03b7, B:190:0x03c2, B:193:0x03ca, B:196:0x03d6, B:198:0x03dc, B:200:0x03e7, B:257:0x04a5, B:259:0x04a7, B:260:0x04a8, B:261:0x04b3, B:262:0x04be, B:159:0x033a, B:161:0x033c, B:162:0x033d, B:163:0x0347, B:166:0x0351, B:169:0x035c, B:171:0x0362, B:173:0x036d, B:265:0x04c6, B:267:0x04c8, B:268:0x04c9, B:269:0x04d4, B:270:0x04df, B:279:0x0507, B:282:0x0524, B:335:0x05c6, B:316:0x0580, B:319:0x0589, B:381:0x0645, B:322:0x0593, B:325:0x059d, B:332:0x05b2, B:333:0x05b7, B:334:0x05bf, B:342:0x05da, B:346:0x05e4, B:350:0x05ed, B:360:0x0601, B:368:0x0616, B:370:0x0624, B:372:0x0629, B:362:0x0608, B:67:0x018b, B:69:0x0197, B:72:0x01a2, B:74:0x01a8, B:76:0x01b3, B:78:0x01be, B:80:0x01c0, B:81:0x01c1, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x0129, B:48:0x0134, B:54:0x014a, B:56:0x0151, B:63:0x0177, B:58:0x016c, B:60:0x0172, B:385:0x0663, B:387:0x0670, B:390:0x0674, B:392:0x067e, B:394:0x0688, B:398:0x0694, B:396:0x068f, B:402:0x06a8, B:406:0x06b0, B:414:0x06cf), top: B:447:0x0006, inners: #1, #2, #4, #12, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x044f A[Catch: IOException -> 0x06d0, XmlPullParserException -> 0x06da, TRY_LEAVE, TryCatch #17 {IOException -> 0x06d0, XmlPullParserException -> 0x06da, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:64:0x0181, B:84:0x01da, B:87:0x01e8, B:89:0x01ee, B:91:0x01f6, B:93:0x01fe, B:95:0x0206, B:97:0x020e, B:99:0x0216, B:101:0x021c, B:103:0x0224, B:105:0x022c, B:107:0x0232, B:109:0x0238, B:111:0x0240, B:113:0x0248, B:116:0x0251, B:409:0x06b7, B:117:0x0275, B:119:0x027b, B:121:0x0284, B:123:0x0293, B:125:0x029d, B:127:0x02b1, B:129:0x02b7, B:273:0x04f1, B:130:0x02bb, B:133:0x02c5, B:135:0x02cb, B:137:0x02d6, B:139:0x02dc, B:140:0x02e3, B:143:0x02ef, B:272:0x04ec, B:147:0x02fc, B:149:0x0304, B:153:0x031d, B:155:0x0323, B:157:0x0330, B:175:0x037e, B:177:0x0386, B:180:0x0395, B:182:0x039b, B:184:0x03a8, B:202:0x03f9, B:204:0x0401, B:225:0x0447, B:227:0x044f, B:254:0x0498, B:186:0x03b4, B:188:0x03b6, B:189:0x03b7, B:190:0x03c2, B:193:0x03ca, B:196:0x03d6, B:198:0x03dc, B:200:0x03e7, B:257:0x04a5, B:259:0x04a7, B:260:0x04a8, B:261:0x04b3, B:262:0x04be, B:159:0x033a, B:161:0x033c, B:162:0x033d, B:163:0x0347, B:166:0x0351, B:169:0x035c, B:171:0x0362, B:173:0x036d, B:265:0x04c6, B:267:0x04c8, B:268:0x04c9, B:269:0x04d4, B:270:0x04df, B:279:0x0507, B:282:0x0524, B:335:0x05c6, B:316:0x0580, B:319:0x0589, B:381:0x0645, B:322:0x0593, B:325:0x059d, B:332:0x05b2, B:333:0x05b7, B:334:0x05bf, B:342:0x05da, B:346:0x05e4, B:350:0x05ed, B:360:0x0601, B:368:0x0616, B:370:0x0624, B:372:0x0629, B:362:0x0608, B:67:0x018b, B:69:0x0197, B:72:0x01a2, B:74:0x01a8, B:76:0x01b3, B:78:0x01be, B:80:0x01c0, B:81:0x01c1, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x0129, B:48:0x0134, B:54:0x014a, B:56:0x0151, B:63:0x0177, B:58:0x016c, B:60:0x0172, B:385:0x0663, B:387:0x0670, B:390:0x0674, B:392:0x067e, B:394:0x0688, B:398:0x0694, B:396:0x068f, B:402:0x06a8, B:406:0x06b0, B:414:0x06cf), top: B:447:0x0006, inners: #1, #2, #4, #12, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04be A[Catch: IOException -> 0x06d0, XmlPullParserException -> 0x06da, TRY_LEAVE, TryCatch #17 {IOException -> 0x06d0, XmlPullParserException -> 0x06da, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:64:0x0181, B:84:0x01da, B:87:0x01e8, B:89:0x01ee, B:91:0x01f6, B:93:0x01fe, B:95:0x0206, B:97:0x020e, B:99:0x0216, B:101:0x021c, B:103:0x0224, B:105:0x022c, B:107:0x0232, B:109:0x0238, B:111:0x0240, B:113:0x0248, B:116:0x0251, B:409:0x06b7, B:117:0x0275, B:119:0x027b, B:121:0x0284, B:123:0x0293, B:125:0x029d, B:127:0x02b1, B:129:0x02b7, B:273:0x04f1, B:130:0x02bb, B:133:0x02c5, B:135:0x02cb, B:137:0x02d6, B:139:0x02dc, B:140:0x02e3, B:143:0x02ef, B:272:0x04ec, B:147:0x02fc, B:149:0x0304, B:153:0x031d, B:155:0x0323, B:157:0x0330, B:175:0x037e, B:177:0x0386, B:180:0x0395, B:182:0x039b, B:184:0x03a8, B:202:0x03f9, B:204:0x0401, B:225:0x0447, B:227:0x044f, B:254:0x0498, B:186:0x03b4, B:188:0x03b6, B:189:0x03b7, B:190:0x03c2, B:193:0x03ca, B:196:0x03d6, B:198:0x03dc, B:200:0x03e7, B:257:0x04a5, B:259:0x04a7, B:260:0x04a8, B:261:0x04b3, B:262:0x04be, B:159:0x033a, B:161:0x033c, B:162:0x033d, B:163:0x0347, B:166:0x0351, B:169:0x035c, B:171:0x0362, B:173:0x036d, B:265:0x04c6, B:267:0x04c8, B:268:0x04c9, B:269:0x04d4, B:270:0x04df, B:279:0x0507, B:282:0x0524, B:335:0x05c6, B:316:0x0580, B:319:0x0589, B:381:0x0645, B:322:0x0593, B:325:0x059d, B:332:0x05b2, B:333:0x05b7, B:334:0x05bf, B:342:0x05da, B:346:0x05e4, B:350:0x05ed, B:360:0x0601, B:368:0x0616, B:370:0x0624, B:372:0x0629, B:362:0x0608, B:67:0x018b, B:69:0x0197, B:72:0x01a2, B:74:0x01a8, B:76:0x01b3, B:78:0x01be, B:80:0x01c0, B:81:0x01c1, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x0129, B:48:0x0134, B:54:0x014a, B:56:0x0151, B:63:0x0177, B:58:0x016c, B:60:0x0172, B:385:0x0663, B:387:0x0670, B:390:0x0674, B:392:0x067e, B:394:0x0688, B:398:0x0694, B:396:0x068f, B:402:0x06a8, B:406:0x06b0, B:414:0x06cf), top: B:447:0x0006, inners: #1, #2, #4, #12, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04ec A[Catch: IOException -> 0x06d0, XmlPullParserException -> 0x06da, TryCatch #17 {IOException -> 0x06d0, XmlPullParserException -> 0x06da, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:64:0x0181, B:84:0x01da, B:87:0x01e8, B:89:0x01ee, B:91:0x01f6, B:93:0x01fe, B:95:0x0206, B:97:0x020e, B:99:0x0216, B:101:0x021c, B:103:0x0224, B:105:0x022c, B:107:0x0232, B:109:0x0238, B:111:0x0240, B:113:0x0248, B:116:0x0251, B:409:0x06b7, B:117:0x0275, B:119:0x027b, B:121:0x0284, B:123:0x0293, B:125:0x029d, B:127:0x02b1, B:129:0x02b7, B:273:0x04f1, B:130:0x02bb, B:133:0x02c5, B:135:0x02cb, B:137:0x02d6, B:139:0x02dc, B:140:0x02e3, B:143:0x02ef, B:272:0x04ec, B:147:0x02fc, B:149:0x0304, B:153:0x031d, B:155:0x0323, B:157:0x0330, B:175:0x037e, B:177:0x0386, B:180:0x0395, B:182:0x039b, B:184:0x03a8, B:202:0x03f9, B:204:0x0401, B:225:0x0447, B:227:0x044f, B:254:0x0498, B:186:0x03b4, B:188:0x03b6, B:189:0x03b7, B:190:0x03c2, B:193:0x03ca, B:196:0x03d6, B:198:0x03dc, B:200:0x03e7, B:257:0x04a5, B:259:0x04a7, B:260:0x04a8, B:261:0x04b3, B:262:0x04be, B:159:0x033a, B:161:0x033c, B:162:0x033d, B:163:0x0347, B:166:0x0351, B:169:0x035c, B:171:0x0362, B:173:0x036d, B:265:0x04c6, B:267:0x04c8, B:268:0x04c9, B:269:0x04d4, B:270:0x04df, B:279:0x0507, B:282:0x0524, B:335:0x05c6, B:316:0x0580, B:319:0x0589, B:381:0x0645, B:322:0x0593, B:325:0x059d, B:332:0x05b2, B:333:0x05b7, B:334:0x05bf, B:342:0x05da, B:346:0x05e4, B:350:0x05ed, B:360:0x0601, B:368:0x0616, B:370:0x0624, B:372:0x0629, B:362:0x0608, B:67:0x018b, B:69:0x0197, B:72:0x01a2, B:74:0x01a8, B:76:0x01b3, B:78:0x01be, B:80:0x01c0, B:81:0x01c1, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x0129, B:48:0x0134, B:54:0x014a, B:56:0x0151, B:63:0x0177, B:58:0x016c, B:60:0x0172, B:385:0x0663, B:387:0x0670, B:390:0x0674, B:392:0x067e, B:394:0x0688, B:398:0x0694, B:396:0x068f, B:402:0x06a8, B:406:0x06b0, B:414:0x06cf), top: B:447:0x0006, inners: #1, #2, #4, #12, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04fd A[LOOP:1: B:119:0x027b->B:277:0x04fd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x04f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018b A[Catch: IOException -> 0x06d0, XmlPullParserException -> 0x06da, TryCatch #17 {IOException -> 0x06d0, XmlPullParserException -> 0x06da, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:64:0x0181, B:84:0x01da, B:87:0x01e8, B:89:0x01ee, B:91:0x01f6, B:93:0x01fe, B:95:0x0206, B:97:0x020e, B:99:0x0216, B:101:0x021c, B:103:0x0224, B:105:0x022c, B:107:0x0232, B:109:0x0238, B:111:0x0240, B:113:0x0248, B:116:0x0251, B:409:0x06b7, B:117:0x0275, B:119:0x027b, B:121:0x0284, B:123:0x0293, B:125:0x029d, B:127:0x02b1, B:129:0x02b7, B:273:0x04f1, B:130:0x02bb, B:133:0x02c5, B:135:0x02cb, B:137:0x02d6, B:139:0x02dc, B:140:0x02e3, B:143:0x02ef, B:272:0x04ec, B:147:0x02fc, B:149:0x0304, B:153:0x031d, B:155:0x0323, B:157:0x0330, B:175:0x037e, B:177:0x0386, B:180:0x0395, B:182:0x039b, B:184:0x03a8, B:202:0x03f9, B:204:0x0401, B:225:0x0447, B:227:0x044f, B:254:0x0498, B:186:0x03b4, B:188:0x03b6, B:189:0x03b7, B:190:0x03c2, B:193:0x03ca, B:196:0x03d6, B:198:0x03dc, B:200:0x03e7, B:257:0x04a5, B:259:0x04a7, B:260:0x04a8, B:261:0x04b3, B:262:0x04be, B:159:0x033a, B:161:0x033c, B:162:0x033d, B:163:0x0347, B:166:0x0351, B:169:0x035c, B:171:0x0362, B:173:0x036d, B:265:0x04c6, B:267:0x04c8, B:268:0x04c9, B:269:0x04d4, B:270:0x04df, B:279:0x0507, B:282:0x0524, B:335:0x05c6, B:316:0x0580, B:319:0x0589, B:381:0x0645, B:322:0x0593, B:325:0x059d, B:332:0x05b2, B:333:0x05b7, B:334:0x05bf, B:342:0x05da, B:346:0x05e4, B:350:0x05ed, B:360:0x0601, B:368:0x0616, B:370:0x0624, B:372:0x0629, B:362:0x0608, B:67:0x018b, B:69:0x0197, B:72:0x01a2, B:74:0x01a8, B:76:0x01b3, B:78:0x01be, B:80:0x01c0, B:81:0x01c1, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x0129, B:48:0x0134, B:54:0x014a, B:56:0x0151, B:63:0x0177, B:58:0x016c, B:60:0x0172, B:385:0x0663, B:387:0x0670, B:390:0x0674, B:392:0x067e, B:394:0x0688, B:398:0x0694, B:396:0x068f, B:402:0x06a8, B:406:0x06b0, B:414:0x06cf), top: B:447:0x0006, inners: #1, #2, #4, #12, #15 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzalq zzb(byte[] bArr, int i, int i2) throws XmlPullParserException, NumberFormatException, IOException, zzalr {
        String str;
        String str2;
        HashMap map;
        ArrayDeque arrayDeque;
        zzamz zzamzVar;
        int i3;
        ArrayDeque arrayDeque2;
        zzamz zzamzVar2;
        int i4;
        zzamu zzamuVar;
        int i5;
        HashMap map2;
        int i6;
        zzalr zzalrVar;
        zzams zzamsVar;
        long j;
        char c;
        zzamt zzamtVar;
        String str3;
        float f;
        float f2;
        String strZza;
        float f3;
        float f4;
        String strZza2;
        float f5;
        int i7;
        String strZza3;
        zzamw zzamwVar;
        char c2;
        char c3;
        String strGroup;
        String strZza4;
        float f6;
        int i8;
        zzamt zzamtVar2;
        String strGroup2;
        boolean z;
        StringBuilder sb;
        String strZza5;
        String strGroup3;
        String str4 = "";
        String str5 = "http://www.w3.org/ns/ttml#parameter";
        try {
            XmlPullParser xmlPullParserNewPullParser = this.zzi.newPullParser();
            HashMap map3 = new HashMap();
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            map4.put("", new zzamw("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque3 = new ArrayDeque();
            int eventType = xmlPullParserNewPullParser.getEventType();
            zzamt zzamtVar3 = zzh;
            zzamz zzamzVar3 = null;
            zzamu zzamuVar2 = null;
            int i9 = 0;
            int i10 = 15;
            while (eventType != 1) {
                zzams zzamsVar2 = (zzams) arrayDeque3.peek();
                if (i9 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    str = str4;
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            String attributeValue = xmlPullParserNewPullParser.getAttributeValue(str5, "frameRate");
                            int i11 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
                            String attributeValue2 = xmlPullParserNewPullParser.getAttributeValue(str5, "frameRateMultiplier");
                            if (attributeValue2 != null) {
                                int i12 = zzgd.zza;
                                zzamzVar2 = zzamzVar3;
                                i4 = i9;
                                zzeq.zze(attributeValue2.split(" ", -1).length == 2, "frameRateMultiplier doesn't have 2 parts");
                                f6 = Integer.parseInt(r11[0]) / Integer.parseInt(r11[1]);
                            } else {
                                zzamzVar2 = zzamzVar3;
                                i4 = i9;
                                f6 = 1.0f;
                            }
                            zzamt zzamtVar4 = zzh;
                            int i13 = zzamtVar4.zzb;
                            String attributeValue3 = xmlPullParserNewPullParser.getAttributeValue(str5, "subFrameRate");
                            int i14 = attributeValue3 != null ? Integer.parseInt(attributeValue3) : i13;
                            int i15 = zzamtVar4.zzc;
                            String attributeValue4 = xmlPullParserNewPullParser.getAttributeValue(str5, "tickRate");
                            if (attributeValue4 != null) {
                                i8 = Integer.parseInt(attributeValue4);
                                arrayDeque2 = arrayDeque3;
                            } else {
                                arrayDeque2 = arrayDeque3;
                                i8 = i15;
                            }
                            zzamt zzamtVar5 = new zzamt(i11 * f6, i14, i8);
                            String attributeValue5 = xmlPullParserNewPullParser.getAttributeValue(str5, "cellResolution");
                            if (attributeValue5 == null) {
                                str2 = str5;
                                zzamtVar2 = zzamtVar5;
                                i5 = 15;
                                strZza5 = zzge.zza(xmlPullParserNewPullParser, "extent");
                                if (strZza5 == null) {
                                    zzamuVar = null;
                                    zzamtVar3 = zzamtVar2;
                                } else {
                                    Matcher matcher = zzf.matcher(strZza5);
                                    if (matcher.matches()) {
                                        try {
                                            strGroup3 = matcher.group(1);
                                        } catch (NumberFormatException unused) {
                                            zzfk.zzf("TtmlParser", "Ignoring malformed tts extent: ".concat(strZza5));
                                        }
                                        if (strGroup3 == null) {
                                            throw null;
                                        }
                                        int i16 = Integer.parseInt(strGroup3);
                                        String strGroup4 = matcher.group(2);
                                        if (strGroup4 == null) {
                                            throw null;
                                        }
                                        zzamuVar = new zzamu(i16, Integer.parseInt(strGroup4));
                                        zzamtVar3 = zzamtVar2;
                                    } else {
                                        zzfk.zzf("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strZza5));
                                    }
                                    zzamuVar = null;
                                    zzamtVar3 = zzamtVar2;
                                }
                            } else {
                                Matcher matcher2 = zzg.matcher(attributeValue5);
                                if (matcher2.matches()) {
                                    try {
                                        strGroup2 = matcher2.group(1);
                                    } catch (NumberFormatException unused2) {
                                        str2 = str5;
                                    }
                                    if (strGroup2 == null) {
                                        throw null;
                                    }
                                    int i17 = Integer.parseInt(strGroup2);
                                    String strGroup5 = matcher2.group(2);
                                    if (strGroup5 == null) {
                                        throw null;
                                    }
                                    int i18 = Integer.parseInt(strGroup5);
                                    if (i17 == 0) {
                                        str2 = str5;
                                        i5 = i18;
                                        z = false;
                                    } else if (i18 != 0) {
                                        str2 = str5;
                                        i5 = i18;
                                        z = true;
                                    } else {
                                        str2 = str5;
                                        z = false;
                                        i5 = 0;
                                    }
                                    try {
                                        sb = new StringBuilder();
                                        zzamtVar2 = zzamtVar5;
                                    } catch (NumberFormatException unused3) {
                                        zzamtVar2 = zzamtVar5;
                                        zzfk.zzf("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                        i5 = 15;
                                        strZza5 = zzge.zza(xmlPullParserNewPullParser, "extent");
                                        if (strZza5 == null) {
                                        }
                                        xmlPullParserNewPullParser.next();
                                        eventType = xmlPullParserNewPullParser.getEventType();
                                        arrayDeque3 = arrayDeque;
                                        map3 = map;
                                        str4 = str;
                                        str5 = str2;
                                    }
                                    try {
                                        sb.append("Invalid cell resolution ");
                                        sb.append(i17);
                                        sb.append(" ");
                                        sb.append(i5);
                                        zzeq.zze(z, sb.toString());
                                    } catch (NumberFormatException unused4) {
                                        zzfk.zzf("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                        i5 = 15;
                                        strZza5 = zzge.zza(xmlPullParserNewPullParser, "extent");
                                        if (strZza5 == null) {
                                        }
                                        xmlPullParserNewPullParser.next();
                                        eventType = xmlPullParserNewPullParser.getEventType();
                                        arrayDeque3 = arrayDeque;
                                        map3 = map;
                                        str4 = str;
                                        str5 = str2;
                                    }
                                    strZza5 = zzge.zza(xmlPullParserNewPullParser, "extent");
                                    if (strZza5 == null) {
                                    }
                                } else {
                                    zzfk.zzf("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                    str2 = str5;
                                    zzamtVar2 = zzamtVar5;
                                    i5 = 15;
                                    strZza5 = zzge.zza(xmlPullParserNewPullParser, "extent");
                                    if (strZza5 == null) {
                                    }
                                }
                            }
                            xmlPullParserNewPullParser.next();
                            eventType = xmlPullParserNewPullParser.getEventType();
                            arrayDeque3 = arrayDeque;
                            map3 = map;
                            str4 = str;
                            str5 = str2;
                        } else {
                            str2 = str5;
                            arrayDeque2 = arrayDeque3;
                            zzamzVar2 = zzamzVar3;
                            i4 = i9;
                            zzamuVar = zzamuVar2;
                            i5 = i10;
                        }
                        String str6 = "metadata";
                        if (name.equals("tt") || name.equals("head") || name.equals("body") || name.equals("div") || name.equals("p") || name.equals("span") || name.equals("br") || name.equals("style") || name.equals("styling") || name.equals("layout") || name.equals("region") || name.equals("metadata") || name.equals("image") || name.equals(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) || name.equals("information")) {
                            if ("head".equals(name)) {
                                while (true) {
                                    xmlPullParserNewPullParser.next();
                                    if (zzge.zzc(xmlPullParserNewPullParser, "style")) {
                                        String strZza6 = zzge.zza(xmlPullParserNewPullParser, "style");
                                        zzamy zzamyVarZzf = zzf(xmlPullParserNewPullParser, new zzamy());
                                        if (strZza6 != null) {
                                            String[] strArrZzg = zzg(strZza6);
                                            zzamtVar = zzamtVar3;
                                            int i19 = 0;
                                            for (int length = strArrZzg.length; i19 < length; length = length) {
                                                zzamyVarZzf.zzl((zzamy) map3.get(strArrZzg[i19]));
                                                i19++;
                                            }
                                        } else {
                                            zzamtVar = zzamtVar3;
                                        }
                                        String strZzE = zzamyVarZzf.zzE();
                                        if (strZzE != null) {
                                            map3.put(strZzE, zzamyVarZzf);
                                        }
                                    } else {
                                        zzamtVar = zzamtVar3;
                                        if (zzge.zzc(xmlPullParserNewPullParser, "region")) {
                                            String strZza7 = zzge.zza(xmlPullParserNewPullParser, "id");
                                            if (strZza7 == null) {
                                                str3 = str6;
                                                map2 = map3;
                                            } else {
                                                String strZza8 = zzge.zza(xmlPullParserNewPullParser, "origin");
                                                if (strZza8 != null) {
                                                    Pattern pattern = zzb;
                                                    Matcher matcher3 = pattern.matcher(strZza8);
                                                    Pattern pattern2 = zzf;
                                                    str3 = str6;
                                                    Matcher matcher4 = pattern2.matcher(strZza8);
                                                    if (matcher3.matches()) {
                                                        map2 = map3;
                                                        try {
                                                            strGroup = matcher3.group(1);
                                                        } catch (NumberFormatException unused5) {
                                                            zzfk.zzf("TtmlParser", "Ignoring region with malformed origin: ".concat(strZza8));
                                                        }
                                                        if (strGroup == null) {
                                                            throw null;
                                                        }
                                                        float f7 = Float.parseFloat(strGroup) / 100.0f;
                                                        String strGroup6 = matcher3.group(2);
                                                        if (strGroup6 == null) {
                                                            throw null;
                                                        }
                                                        f2 = Float.parseFloat(strGroup6) / 100.0f;
                                                        f = f7;
                                                        strZza = zzge.zza(xmlPullParserNewPullParser, "extent");
                                                        if (strZza == null) {
                                                            Matcher matcher5 = pattern.matcher(strZza);
                                                            Matcher matcher6 = pattern2.matcher(strZza);
                                                            if (matcher5.matches()) {
                                                                try {
                                                                    String strGroup7 = matcher5.group(1);
                                                                    if (strGroup7 == null) {
                                                                        throw null;
                                                                    }
                                                                    float f8 = Float.parseFloat(strGroup7) / 100.0f;
                                                                    String strGroup8 = matcher5.group(2);
                                                                    if (strGroup8 == null) {
                                                                        throw null;
                                                                    }
                                                                    f3 = Float.parseFloat(strGroup8) / 100.0f;
                                                                    f4 = f8;
                                                                    strZza2 = zzge.zza(xmlPullParserNewPullParser, "displayAlign");
                                                                    if (strZza2 == null) {
                                                                        String strZza9 = zzfxm.zza(strZza2);
                                                                        int iHashCode = strZza9.hashCode();
                                                                        if (iHashCode != -1364013995) {
                                                                            c3 = (iHashCode == 92734940 && strZza9.equals("after")) ? (char) 1 : (char) 65535;
                                                                            if (c3 != 0) {
                                                                                f5 = f2 + (f3 / 2.0f);
                                                                                i7 = 1;
                                                                            } else if (c3 != 1) {
                                                                                f5 = f2;
                                                                                i7 = 0;
                                                                            } else {
                                                                                f5 = f2 + f3;
                                                                                i7 = 2;
                                                                            }
                                                                            float f9 = 1.0f / i5;
                                                                            strZza3 = zzge.zza(xmlPullParserNewPullParser, "writingMode");
                                                                            if (strZza3 == null) {
                                                                                String strZza10 = zzfxm.zza(strZza3);
                                                                                int iHashCode2 = strZza10.hashCode();
                                                                                if (iHashCode2 == 3694) {
                                                                                    if (strZza10.equals("tb")) {
                                                                                        c2 = 0;
                                                                                    }
                                                                                    if (c2 == 0) {
                                                                                    }
                                                                                } else if (iHashCode2 != 3553396) {
                                                                                    c2 = (iHashCode2 == 3553576 && strZza10.equals("tbrl")) ? (char) 2 : (char) 65535;
                                                                                    int i20 = (c2 == 0 || c2 == 1) ? 2 : c2 != 2 ? Integer.MIN_VALUE : 1;
                                                                                    zzamwVar = new zzamw(strZza7, f, f5, 0, i7, f4, f3, 1, f9, i20);
                                                                                } else {
                                                                                    if (strZza10.equals("tblr")) {
                                                                                        c2 = 1;
                                                                                    }
                                                                                    if (c2 == 0) {
                                                                                        zzamwVar = new zzamw(strZza7, f, f5, 0, i7, f4, f3, 1, f9, i20);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            if (strZza9.equals("center")) {
                                                                                c3 = 0;
                                                                            }
                                                                            if (c3 != 0) {
                                                                            }
                                                                            float f92 = 1.0f / i5;
                                                                            strZza3 = zzge.zza(xmlPullParserNewPullParser, "writingMode");
                                                                            if (strZza3 == null) {
                                                                            }
                                                                        }
                                                                    }
                                                                } catch (NumberFormatException unused6) {
                                                                    zzfk.zzf("TtmlParser", "Ignoring region with malformed extent: ".concat(strZza8));
                                                                }
                                                            } else if (!matcher6.matches()) {
                                                                zzfk.zzf("TtmlParser", "Ignoring region with unsupported extent: ".concat(strZza8));
                                                            } else if (zzamuVar == null) {
                                                                zzfk.zzf("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZza8));
                                                            } else {
                                                                try {
                                                                    String strGroup9 = matcher6.group(1);
                                                                    if (strGroup9 == null) {
                                                                        throw null;
                                                                    }
                                                                    int i21 = Integer.parseInt(strGroup9);
                                                                    String strGroup10 = matcher6.group(2);
                                                                    if (strGroup10 == null) {
                                                                        throw null;
                                                                    }
                                                                    float f10 = i21 / zzamuVar.zza;
                                                                    f3 = Integer.parseInt(strGroup10) / zzamuVar.zzb;
                                                                    f4 = f10;
                                                                    strZza2 = zzge.zza(xmlPullParserNewPullParser, "displayAlign");
                                                                    if (strZza2 == null) {
                                                                    }
                                                                } catch (NumberFormatException unused7) {
                                                                    zzfk.zzf("TtmlParser", "Ignoring region with malformed extent: ".concat(strZza8));
                                                                }
                                                            }
                                                            if (zzamwVar != null) {
                                                                map4.put(zzamwVar.zza, zzamwVar);
                                                            }
                                                            zzamtVar3 = zzamtVar;
                                                            if (zzge.zzb(xmlPullParserNewPullParser, "head")) {
                                                                arrayDeque = arrayDeque2;
                                                            } else {
                                                                str6 = str3;
                                                                map3 = map2;
                                                            }
                                                        } else {
                                                            zzfk.zzf("TtmlParser", "Ignoring region without an extent");
                                                        }
                                                    } else {
                                                        map2 = map3;
                                                        if (!matcher4.matches()) {
                                                            zzfk.zzf("TtmlParser", "Ignoring region with unsupported origin: ".concat(strZza8));
                                                        } else if (zzamuVar == null) {
                                                            zzfk.zzf("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZza8));
                                                        } else {
                                                            try {
                                                                String strGroup11 = matcher4.group(1);
                                                                if (strGroup11 == null) {
                                                                    throw null;
                                                                }
                                                                int i22 = Integer.parseInt(strGroup11);
                                                                String strGroup12 = matcher4.group(2);
                                                                if (strGroup12 == null) {
                                                                    throw null;
                                                                }
                                                                f = i22 / zzamuVar.zza;
                                                                f2 = Integer.parseInt(strGroup12) / zzamuVar.zzb;
                                                                strZza = zzge.zza(xmlPullParserNewPullParser, "extent");
                                                                if (strZza == null) {
                                                                }
                                                            } catch (NumberFormatException unused8) {
                                                                zzfk.zzf("TtmlParser", "Ignoring region with malformed origin: ".concat(strZza8));
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    str3 = str6;
                                                    map2 = map3;
                                                    zzfk.zzf("TtmlParser", "Ignoring region without an origin");
                                                }
                                            }
                                            zzamwVar = null;
                                            if (zzamwVar != null) {
                                            }
                                            zzamtVar3 = zzamtVar;
                                            if (zzge.zzb(xmlPullParserNewPullParser, "head")) {
                                            }
                                        } else if (zzge.zzc(xmlPullParserNewPullParser, str6)) {
                                            do {
                                                xmlPullParserNewPullParser.next();
                                                if (zzge.zzc(xmlPullParserNewPullParser, "image") && (strZza4 = zzge.zza(xmlPullParserNewPullParser, "id")) != null) {
                                                    map5.put(strZza4, xmlPullParserNewPullParser.nextText());
                                                }
                                            } while (!zzge.zzb(xmlPullParserNewPullParser, str6));
                                        }
                                    }
                                    str3 = str6;
                                    map2 = map3;
                                    zzamtVar3 = zzamtVar;
                                    if (zzge.zzb(xmlPullParserNewPullParser, "head")) {
                                    }
                                }
                            } else {
                                map2 = map3;
                                zzamt zzamtVar6 = zzamtVar3;
                                try {
                                    int attributeCount = xmlPullParserNewPullParser.getAttributeCount();
                                    zzamy zzamyVarZzf2 = zzf(xmlPullParserNewPullParser, null);
                                    String str7 = str;
                                    long jZzc = -9223372036854775807L;
                                    long jZzc2 = -9223372036854775807L;
                                    long jZzc3 = -9223372036854775807L;
                                    int i23 = 0;
                                    String[] strArr = null;
                                    String strSubstring = null;
                                    while (i23 < attributeCount) {
                                        try {
                                            String attributeName = xmlPullParserNewPullParser.getAttributeName(i23);
                                            String attributeValue6 = xmlPullParserNewPullParser.getAttributeValue(i23);
                                            switch (attributeName.hashCode()) {
                                                case -934795532:
                                                    if (attributeName.equals("region")) {
                                                        c = 4;
                                                        break;
                                                    } else {
                                                        c = 65535;
                                                        break;
                                                    }
                                                case 99841:
                                                    if (attributeName.equals("dur")) {
                                                        c = 2;
                                                        break;
                                                    }
                                                    break;
                                                case 100571:
                                                    if (attributeName.equals("end")) {
                                                        c = 1;
                                                        break;
                                                    }
                                                    break;
                                                case 93616297:
                                                    if (attributeName.equals("begin")) {
                                                        c = 0;
                                                        break;
                                                    }
                                                    break;
                                                case 109780401:
                                                    if (attributeName.equals("style")) {
                                                        c = 3;
                                                        break;
                                                    }
                                                    break;
                                                case 1292595405:
                                                    if (attributeName.equals("backgroundImage")) {
                                                        c = 5;
                                                        break;
                                                    }
                                                    break;
                                            }
                                            if (c == 0) {
                                                zzamtVar3 = zzamtVar6;
                                                i6 = 1;
                                                jZzc2 = zzc(attributeValue6, zzamtVar3);
                                            } else if (c == 1) {
                                                i6 = 1;
                                                zzamtVar3 = zzamtVar6;
                                                jZzc = zzc(attributeValue6, zzamtVar3);
                                            } else if (c != 2) {
                                                if (c == 3) {
                                                    i6 = 1;
                                                    String[] strArrZzg2 = zzg(attributeValue6);
                                                    if (strArrZzg2.length > 0) {
                                                        strArr = strArrZzg2;
                                                    }
                                                } else if (c == 4) {
                                                    i6 = 1;
                                                    if (map4.containsKey(attributeValue6)) {
                                                        str7 = attributeValue6;
                                                    }
                                                } else if (c != 5) {
                                                    i6 = 1;
                                                } else {
                                                    try {
                                                        if (attributeValue6.startsWith("#")) {
                                                            i6 = 1;
                                                            try {
                                                                strSubstring = attributeValue6.substring(1);
                                                            } catch (zzalr e) {
                                                                e = e;
                                                                zzalrVar = e;
                                                                zzamtVar3 = zzamtVar6;
                                                                arrayDeque = arrayDeque2;
                                                                zzfk.zzg("TtmlParser", "Suppressing parser error", zzalrVar);
                                                                zzamuVar2 = zzamuVar;
                                                                i10 = i5;
                                                                zzamzVar3 = zzamzVar2;
                                                                map = map2;
                                                                i9 = i6;
                                                                xmlPullParserNewPullParser.next();
                                                                eventType = xmlPullParserNewPullParser.getEventType();
                                                                arrayDeque3 = arrayDeque;
                                                                map3 = map;
                                                                str4 = str;
                                                                str5 = str2;
                                                            }
                                                        }
                                                    } catch (zzalr e2) {
                                                        e = e2;
                                                        i6 = 1;
                                                    }
                                                }
                                                zzamtVar3 = zzamtVar6;
                                            } else {
                                                zzamtVar3 = zzamtVar6;
                                                i6 = 1;
                                                try {
                                                    jZzc3 = zzc(attributeValue6, zzamtVar3);
                                                } catch (zzalr e3) {
                                                    e = e3;
                                                    zzalrVar = e;
                                                    arrayDeque = arrayDeque2;
                                                    zzfk.zzg("TtmlParser", "Suppressing parser error", zzalrVar);
                                                    zzamuVar2 = zzamuVar;
                                                    i10 = i5;
                                                    zzamzVar3 = zzamzVar2;
                                                    map = map2;
                                                    i9 = i6;
                                                    xmlPullParserNewPullParser.next();
                                                    eventType = xmlPullParserNewPullParser.getEventType();
                                                    arrayDeque3 = arrayDeque;
                                                    map3 = map;
                                                    str4 = str;
                                                    str5 = str2;
                                                }
                                            }
                                            i23++;
                                            zzamtVar6 = zzamtVar3;
                                        } catch (zzalr e4) {
                                            e = e4;
                                            zzamtVar3 = zzamtVar6;
                                            i6 = 1;
                                        }
                                    }
                                    zzamtVar3 = zzamtVar6;
                                    i6 = 1;
                                    if (zzamsVar2 != null) {
                                        long j2 = zzamsVar2.zzd;
                                        if (j2 == -9223372036854775807L) {
                                            zzamsVar = zzamsVar2;
                                        } else {
                                            jZzc2 = jZzc2 != -9223372036854775807L ? jZzc2 + j2 : -9223372036854775807L;
                                            if (jZzc != -9223372036854775807L) {
                                                jZzc += j2;
                                                zzamsVar = zzamsVar2;
                                            } else {
                                                zzamsVar = zzamsVar2;
                                                jZzc = -9223372036854775807L;
                                            }
                                        }
                                    } else {
                                        zzamsVar = null;
                                    }
                                    if (jZzc != -9223372036854775807L) {
                                        j = jZzc;
                                    } else if (jZzc3 != -9223372036854775807L) {
                                        j = jZzc2 + jZzc3;
                                    } else if (zzamsVar != null) {
                                        long j3 = zzamsVar.zze;
                                        j = j3 != -9223372036854775807L ? j3 : -9223372036854775807L;
                                    }
                                    try {
                                        zzams zzamsVarZzb = zzams.zzb(xmlPullParserNewPullParser.getName(), jZzc2, j, zzamyVarZzf2, strArr, str7, strSubstring, zzamsVar);
                                        arrayDeque = arrayDeque2;
                                        try {
                                            arrayDeque.push(zzamsVarZzb);
                                            if (zzamsVar2 != null) {
                                                zzamsVar2.zzf(zzamsVarZzb);
                                            }
                                        } catch (zzalr e5) {
                                            e = e5;
                                            zzalrVar = e;
                                            zzfk.zzg("TtmlParser", "Suppressing parser error", zzalrVar);
                                            zzamuVar2 = zzamuVar;
                                            i10 = i5;
                                            zzamzVar3 = zzamzVar2;
                                            map = map2;
                                            i9 = i6;
                                            xmlPullParserNewPullParser.next();
                                            eventType = xmlPullParserNewPullParser.getEventType();
                                            arrayDeque3 = arrayDeque;
                                            map3 = map;
                                            str4 = str;
                                            str5 = str2;
                                        }
                                    } catch (zzalr e6) {
                                        e = e6;
                                        arrayDeque = arrayDeque2;
                                    }
                                } catch (zzalr e7) {
                                    e = e7;
                                    zzamtVar3 = zzamtVar6;
                                    arrayDeque = arrayDeque2;
                                    i6 = 1;
                                }
                            }
                            zzamuVar2 = zzamuVar;
                            i10 = i5;
                            zzamzVar3 = zzamzVar2;
                            i9 = i4;
                            map = map2;
                        } else {
                            zzfk.zze("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            map = map3;
                            zzamuVar2 = zzamuVar;
                            i10 = i5;
                            zzamzVar3 = zzamzVar2;
                            arrayDeque = arrayDeque2;
                            i9 = 1;
                        }
                        xmlPullParserNewPullParser.next();
                        eventType = xmlPullParserNewPullParser.getEventType();
                        arrayDeque3 = arrayDeque;
                        map3 = map;
                        str4 = str;
                        str5 = str2;
                    } else {
                        str2 = str5;
                        HashMap map6 = map3;
                        arrayDeque = arrayDeque3;
                        zzamzVar = zzamzVar3;
                        i3 = i9;
                        if (eventType == 4) {
                            if (zzamsVar2 == null) {
                                throw null;
                            }
                            zzamsVar2.zzf(zzams.zzc(xmlPullParserNewPullParser.getText()));
                        } else if (eventType == 3) {
                            if (xmlPullParserNewPullParser.getName().equals("tt")) {
                                zzams zzamsVar3 = (zzams) arrayDeque.peek();
                                if (zzamsVar3 == null) {
                                    throw null;
                                }
                                map = map6;
                                zzamzVar3 = new zzamz(zzamsVar3, map, map4, map5);
                            } else {
                                map = map6;
                                zzamzVar3 = zzamzVar;
                            }
                            arrayDeque.pop();
                        }
                        map = map6;
                        zzamzVar3 = zzamzVar;
                    }
                } else {
                    str = str4;
                    str2 = str5;
                    map = map3;
                    arrayDeque = arrayDeque3;
                    zzamzVar = zzamzVar3;
                    i3 = i9;
                    if (eventType == 2) {
                        i9 = i3 + 1;
                    } else {
                        if (eventType == 3) {
                            i9 = i3 - 1;
                        }
                        zzamzVar3 = zzamzVar;
                    }
                    zzamzVar3 = zzamzVar;
                    xmlPullParserNewPullParser.next();
                    eventType = xmlPullParserNewPullParser.getEventType();
                    arrayDeque3 = arrayDeque;
                    map3 = map;
                    str4 = str;
                    str5 = str2;
                }
                i9 = i3;
                xmlPullParserNewPullParser.next();
                eventType = xmlPullParserNewPullParser.getEventType();
                arrayDeque3 = arrayDeque;
                map3 = map;
                str4 = str;
                str5 = str2;
            }
            zzamz zzamzVar4 = zzamzVar3;
            if (zzamzVar4 != null) {
                return zzamzVar4;
            }
            throw null;
        } catch (IOException e8) {
            throw new IllegalStateException("Unexpected error when reading input.", e8);
        } catch (XmlPullParserException e9) {
            throw new IllegalStateException("Unable to decode source", e9);
        }
    }

    public zzamv() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.zzi = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }
}
