package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzamx {
    public static zzamy zza(zzamy zzamyVar, String[] strArr, Map map) {
        int length;
        int i = 0;
        if (zzamyVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (zzamy) map.get(strArr[0]);
            }
            if (length2 > 1) {
                zzamy zzamyVar2 = new zzamy();
                while (i < length2) {
                    zzamyVar2.zzl((zzamy) map.get(strArr[i]));
                    i++;
                }
                return zzamyVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                zzamyVar.zzl((zzamy) map.get(strArr[0]));
                return zzamyVar;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i < length) {
                    zzamyVar.zzl((zzamy) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return zzamyVar;
    }
}
