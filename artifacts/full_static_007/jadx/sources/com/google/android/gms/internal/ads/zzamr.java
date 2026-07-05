package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;
import kotlinx.coroutines.DebugKt;
import org.apache.cordova.networkinformation.NetworkManager;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzamr {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzgbh zze = zzgbh.zzp(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, NetworkManager.TYPE_NONE);
    private static final zzgbh zzf = zzgbh.zzq("dot", "sesame", "circle");
    private static final zzgbh zzg = zzgbh.zzp("filled", "open");
    private static final zzgbh zzh = zzgbh.zzq("after", "before", "outside");
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzamr(int i, int i2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzamr zza(String str) {
        boolean z;
        if (str == null) {
            return null;
        }
        String strZza = zzfxm.zza(str.trim());
        if (strZza.isEmpty()) {
            return null;
        }
        zzgbh zzgbhVarZzm = zzgbh.zzm(TextUtils.split(strZza, zzd));
        String str2 = (String) zzgbi.zza(zzgde.zzb(zzh, zzgbhVarZzm), "outside");
        int iHashCode = str2.hashCode();
        int i = -1;
        int i2 = 0;
        if (iHashCode != -1106037339) {
            z = (iHashCode == 92734940 && str2.equals("after")) ? false : -1;
        } else if (str2.equals("outside")) {
            z = true;
        }
        int i3 = z ? !z ? 1 : -2 : 2;
        zzgdd zzgddVarZzb = zzgde.zzb(zze, zzgbhVarZzm);
        if (zzgddVarZzb.isEmpty()) {
            zzgdd zzgddVarZzb2 = zzgde.zzb(zzg, zzgbhVarZzm);
            zzgdd zzgddVarZzb3 = zzgde.zzb(zzf, zzgbhVarZzm);
            if (!zzgddVarZzb2.isEmpty() || !zzgddVarZzb3.isEmpty()) {
                String str3 = (String) zzgbi.zza(zzgddVarZzb2, "filled");
                int i4 = (str3.hashCode() == 3417674 && str3.equals("open")) ? 2 : 1;
                String str4 = (String) zzgbi.zza(zzgddVarZzb3, "circle");
                int iHashCode2 = str4.hashCode();
                if (iHashCode2 != -905816648) {
                    if (iHashCode2 == 99657 && str4.equals("dot")) {
                        i = 0;
                    }
                } else if (str4.equals("sesame")) {
                    i = 1;
                }
                if (i == 0) {
                    i = 2;
                } else if (i != 1) {
                    i2 = i4;
                    i = 1;
                } else {
                    i = 3;
                }
                i2 = i4;
            }
        } else {
            String str5 = (String) zzgddVarZzb.iterator().next();
            if (str5.hashCode() == 3387192 && str5.equals(NetworkManager.TYPE_NONE)) {
                i = 0;
            }
        }
        return new zzamr(i, i2, i3);
    }
}
