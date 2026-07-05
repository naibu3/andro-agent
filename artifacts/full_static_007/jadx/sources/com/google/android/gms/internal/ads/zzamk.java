package com.google.android.gms.internal.ads;

import admob.plus.cordova.Generated;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzamk {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzamk(int i, int i2, int i3, int i4, int i5) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzamk zza(String str) {
        char c;
        zzeq.zzd(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                if (i2 == -1 || i3 == -1 || i5 == -1) {
                    return null;
                }
                return new zzamk(i2, i3, i4, i5, length);
            }
            String strZza = zzfxm.zza(strArrSplit[i].trim());
            switch (strZza.hashCode()) {
                case 100571:
                    if (!strZza.equals("end")) {
                        c = 65535;
                        break;
                    } else {
                        c = 1;
                        break;
                    }
                case 3556653:
                    if (strZza.equals("text")) {
                        c = 3;
                        break;
                    }
                    break;
                case 109757538:
                    if (strZza.equals(Generated.Actions.START)) {
                        c = 0;
                        break;
                    }
                    break;
                case 109780401:
                    if (strZza.equals("style")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                i2 = i;
            } else if (c == 1) {
                i3 = i;
            } else if (c == 2) {
                i4 = i;
            } else if (c == 3) {
                i5 = i;
            }
            i++;
        }
    }
}
