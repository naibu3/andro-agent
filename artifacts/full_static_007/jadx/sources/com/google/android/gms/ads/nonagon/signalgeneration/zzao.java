package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbdv;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes.dex */
public final class zzao {
    private final String zza;

    /* synthetic */ zzao(zzam zzamVar, zzan zzanVar) {
        this.zza = zzamVar.zza;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzbdv.zza.EnumC0014zza zza() {
        char c;
        String str = this.zza;
        switch (str.hashCode()) {
            case -1999289321:
                if (!str.equals("NATIVE")) {
                    c = 65535;
                    break;
                } else {
                    c = 2;
                    break;
                }
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    c = 1;
                    break;
                }
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    c = 3;
                    break;
                }
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    c = 0;
                    break;
                }
                break;
        }
        return c != 0 ? c != 1 ? c != 2 ? c != 3 ? zzbdv.zza.EnumC0014zza.AD_INITIATER_UNSPECIFIED : zzbdv.zza.EnumC0014zza.REWARD_BASED_VIDEO_AD : zzbdv.zza.EnumC0014zza.AD_LOADER : zzbdv.zza.EnumC0014zza.INTERSTITIAL : zzbdv.zza.EnumC0014zza.BANNER;
    }

    public final String zzb() {
        return this.zza.toLowerCase(Locale.ROOT);
    }

    public final Set zzc() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.zza.toLowerCase(Locale.ROOT));
        return hashSet;
    }
}
