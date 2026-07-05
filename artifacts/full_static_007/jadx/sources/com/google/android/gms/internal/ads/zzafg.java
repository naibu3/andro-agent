package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzafg {
    public static int zza(int i) {
        int i2 = 0;
        while (i > 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public static zzcd zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = zzgd.zza;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                zzfk.zzf("VorbisUtil", "Failed to parse Vorbis comment: ".concat(String.valueOf(str)));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzagw.zzb(new zzfu(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    zzfk.zzg("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new zzaio(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzcd(arrayList);
    }

    public static zzafd zzc(zzfu zzfuVar, boolean z, boolean z2) throws zzch {
        if (z) {
            zzd(3, zzfuVar, false);
        }
        String strZzA = zzfuVar.zzA((int) zzfuVar.zzs(), zzfxs.zzc);
        int length = strZzA.length();
        long jZzs = zzfuVar.zzs();
        String[] strArr = new String[(int) jZzs];
        int length2 = length + 15;
        for (int i = 0; i < jZzs; i++) {
            String strZzA2 = zzfuVar.zzA((int) zzfuVar.zzs(), zzfxs.zzc);
            strArr[i] = strZzA2;
            length2 = length2 + 4 + strZzA2.length();
        }
        if (z2 && (zzfuVar.zzm() & 1) == 0) {
            throw zzch.zza("framing bit expected to be set", null);
        }
        return new zzafd(strZzA, strArr, length2 + 1);
    }

    public static boolean zzd(int i, zzfu zzfuVar, boolean z) throws zzch {
        if (zzfuVar.zzb() < 7) {
            if (z) {
                return false;
            }
            throw zzch.zza("too short header: " + zzfuVar.zzb(), null);
        }
        if (zzfuVar.zzm() != i) {
            if (z) {
                return false;
            }
            throw zzch.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i))), null);
        }
        if (zzfuVar.zzm() == 118 && zzfuVar.zzm() == 111 && zzfuVar.zzm() == 114 && zzfuVar.zzm() == 98 && zzfuVar.zzm() == 105 && zzfuVar.zzm() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw zzch.zza("expected characters 'vorbis'", null);
    }
}
