package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzanc {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzfu zzc = new zzfu();
    private final StringBuilder zzd = new StringBuilder();

    static String zza(zzfu zzfuVar, StringBuilder sb) {
        zzc(zzfuVar);
        if (zzfuVar.zzb() == 0) {
            return null;
        }
        String strZzd = zzd(zzfuVar, sb);
        if (!"".equals(strZzd)) {
            return strZzd;
        }
        char cZzm = (char) zzfuVar.zzm();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cZzm);
        return sb2.toString();
    }

    static void zzc(zzfu zzfuVar) {
        while (true) {
            for (boolean z = true; zzfuVar.zzb() > 0 && z; z = false) {
                char c = (char) zzfuVar.zzM()[zzfuVar.zzd()];
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    zzfuVar.zzL(1);
                } else {
                    int iZzd = zzfuVar.zzd();
                    int iZze = zzfuVar.zze();
                    byte[] bArrZzM = zzfuVar.zzM();
                    if (iZzd + 2 <= iZze) {
                        int i = iZzd + 1;
                        if (bArrZzM[iZzd] == 47) {
                            int i2 = iZzd + 2;
                            if (bArrZzM[i] == 42) {
                                while (true) {
                                    int i3 = i2 + 1;
                                    if (i3 >= iZze) {
                                        break;
                                    }
                                    if (((char) bArrZzM[i2]) == '*' && ((char) bArrZzM[i3]) == '/') {
                                        iZze = i2 + 2;
                                        i2 = iZze;
                                    } else {
                                        i2 = i3;
                                    }
                                }
                                zzfuVar.zzL(iZze - zzfuVar.zzd());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    private static String zzd(zzfu zzfuVar, StringBuilder sb) {
        boolean z;
        char c;
        sb.setLength(0);
        int iZzd = zzfuVar.zzd();
        int iZze = zzfuVar.zze();
        loop0: while (true) {
            for (false; iZzd < iZze && !z; true) {
                c = (char) zzfuVar.zzM()[iZzd];
                z = (c < 'A' || c > 'Z') && (c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_');
            }
            sb.append(c);
            iZzd++;
        }
        zzfuVar.zzL(iZzd - zzfuVar.zzd());
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x0317, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzb(zzfu zzfuVar) {
        String strTrim;
        String string;
        char c;
        int i = 0;
        this.zzd.setLength(0);
        int iZzd = zzfuVar.zzd();
        while (!TextUtils.isEmpty(zzfuVar.zzy(zzfxs.zzc))) {
        }
        this.zzc.zzI(zzfuVar.zzM(), zzfuVar.zzd());
        this.zzc.zzK(iZzd);
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzfu zzfuVar2 = this.zzc;
            StringBuilder sb = this.zzd;
            zzc(zzfuVar2);
            if (zzfuVar2.zzb() >= 5 && "::cue".equals(zzfuVar2.zzA(5, zzfxs.zzc))) {
                int iZzd2 = zzfuVar2.zzd();
                String strZza = zza(zzfuVar2, sb);
                if (strZza != null) {
                    if ("{".equals(strZza)) {
                        zzfuVar2.zzK(iZzd2);
                        strTrim = "";
                    } else {
                        if ("(".equals(strZza)) {
                            int iZzd3 = zzfuVar2.zzd();
                            int iZze = zzfuVar2.zze();
                            int i2 = i;
                            while (iZzd3 < iZze && i2 == 0) {
                                int i3 = iZzd3 + 1;
                                i2 = ((char) zzfuVar2.zzM()[iZzd3]) == ')' ? 1 : i;
                                iZzd3 = i3;
                            }
                            strTrim = zzfuVar2.zzA((iZzd3 - 1) - zzfuVar2.zzd(), zzfxs.zzc).trim();
                        } else {
                            strTrim = null;
                        }
                        if (!")".equals(zza(zzfuVar2, sb))) {
                            strTrim = null;
                        }
                    }
                }
            }
            if (strTrim == null || !"{".equals(zza(this.zzc, this.zzd))) {
                break;
            }
            zzand zzandVar = new zzand();
            if (!"".equals(strTrim)) {
                int iIndexOf = strTrim.indexOf(91);
                if (iIndexOf != -1) {
                    Matcher matcher = zza.matcher(strTrim.substring(iIndexOf));
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        strGroup.getClass();
                        zzandVar.zzv(strGroup);
                    }
                    strTrim = strTrim.substring(i, iIndexOf);
                }
                int i4 = zzgd.zza;
                String[] strArrSplit = strTrim.split("\\.", -1);
                String str = strArrSplit[i];
                int iIndexOf2 = str.indexOf(35);
                if (iIndexOf2 != -1) {
                    zzandVar.zzu(str.substring(i, iIndexOf2));
                    zzandVar.zzt(str.substring(iIndexOf2 + 1));
                } else {
                    zzandVar.zzu(str);
                }
                int length = strArrSplit.length;
                if (length > 1) {
                    zzandVar.zzs((String[]) Arrays.copyOfRange(strArrSplit, 1, length));
                }
            }
            int i5 = i;
            String strZza2 = null;
            while (i5 == 0) {
                zzfu zzfuVar3 = this.zzc;
                StringBuilder sb2 = this.zzd;
                int iZzd4 = zzfuVar3.zzd();
                strZza2 = zza(zzfuVar3, sb2);
                i5 = (strZza2 == null || "}".equals(strZza2)) ? 1 : i;
                if (i5 == 0) {
                    this.zzc.zzK(iZzd4);
                    zzfu zzfuVar4 = this.zzc;
                    StringBuilder sb3 = this.zzd;
                    zzc(zzfuVar4);
                    String strZzd = zzd(zzfuVar4, sb3);
                    if (!"".equals(strZzd) && ":".equals(zza(zzfuVar4, sb3))) {
                        zzc(zzfuVar4);
                        StringBuilder sb4 = new StringBuilder();
                        int i6 = i;
                        while (true) {
                            if (i6 != 0) {
                                string = sb4.toString();
                                break;
                            }
                            int iZzd5 = zzfuVar4.zzd();
                            String strZza3 = zza(zzfuVar4, sb3);
                            if (strZza3 == null) {
                                string = null;
                                break;
                            }
                            if ("}".equals(strZza3) || ";".equals(strZza3)) {
                                zzfuVar4.zzK(iZzd5);
                                i6 = 1;
                            } else {
                                sb4.append(strZza3);
                            }
                        }
                        if (string != null && !"".equals(string)) {
                            int iZzd6 = zzfuVar4.zzd();
                            String strZza4 = zza(zzfuVar4, sb3);
                            if (";".equals(strZza4)) {
                                if (!TypedValues.Custom.S_COLOR.equals(strZzd)) {
                                }
                            } else if ("}".equals(strZza4)) {
                                zzfuVar4.zzK(iZzd6);
                                if (!TypedValues.Custom.S_COLOR.equals(strZzd)) {
                                    zzandVar.zzk(zzet.zza(string));
                                } else if ("background-color".equals(strZzd)) {
                                    zzandVar.zzh(zzet.zza(string));
                                } else if ("ruby-position".equals(strZzd)) {
                                    if ("over".equals(string)) {
                                        zzandVar.zzp(1);
                                    } else if ("under".equals(string)) {
                                        zzandVar.zzp(2);
                                    }
                                } else if ("text-combine-upright".equals(strZzd)) {
                                    zzandVar.zzj("all".equals(string) || string.startsWith("digits"));
                                } else if ("text-decoration".equals(strZzd)) {
                                    if ("underline".equals(string)) {
                                        zzandVar.zzq(true);
                                    }
                                } else if ("font-family".equals(strZzd)) {
                                    zzandVar.zzl(string);
                                } else if ("font-weight".equals(strZzd)) {
                                    if ("bold".equals(string)) {
                                        zzandVar.zzi(true);
                                    }
                                } else if ("font-style".equals(strZzd)) {
                                    if ("italic".equals(string)) {
                                        zzandVar.zzo(true);
                                    }
                                } else if ("font-size".equals(strZzd)) {
                                    Matcher matcher2 = zzb.matcher(zzfxm.zza(string));
                                    if (matcher2.matches()) {
                                        String strGroup2 = matcher2.group(2);
                                        strGroup2.getClass();
                                        int iHashCode = strGroup2.hashCode();
                                        if (iHashCode == 37) {
                                            if (strGroup2.equals("%")) {
                                                c = 2;
                                            }
                                            if (c == 0) {
                                            }
                                            String strGroup3 = matcher2.group(1);
                                            strGroup3.getClass();
                                            zzandVar.zzm(Float.parseFloat(strGroup3));
                                        } else if (iHashCode != 3240) {
                                            c = (iHashCode == 3592 && strGroup2.equals("px")) ? (char) 0 : (char) 65535;
                                            if (c == 0) {
                                                zzandVar.zzn(1);
                                            } else if (c == 1) {
                                                zzandVar.zzn(2);
                                            } else {
                                                if (c != 2) {
                                                    throw new IllegalStateException();
                                                }
                                                zzandVar.zzn(3);
                                            }
                                            String strGroup32 = matcher2.group(1);
                                            strGroup32.getClass();
                                            zzandVar.zzm(Float.parseFloat(strGroup32));
                                        } else {
                                            if (strGroup2.equals("em")) {
                                                c = 1;
                                            }
                                            if (c == 0) {
                                            }
                                            String strGroup322 = matcher2.group(1);
                                            strGroup322.getClass();
                                            zzandVar.zzm(Float.parseFloat(strGroup322));
                                        }
                                    } else {
                                        zzfk.zzf("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i = 0;
            }
            if ("}".equals(strZza2)) {
                arrayList.add(zzandVar);
            }
            i = 0;
        }
    }
}
