package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzaej {
    private static final Pattern zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    private final boolean zzc(String str) throws NumberFormatException {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i = zzgd.zza;
            int i2 = Integer.parseInt(strGroup, 16);
            int i3 = Integer.parseInt(matcher.group(2), 16);
            if (i2 <= 0 && i3 <= 0) {
                return false;
            }
            this.zza = i2;
            this.zzb = i3;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean zza() {
        return (this.zza == -1 || this.zzb == -1) ? false : true;
    }

    public final boolean zzb(zzcd zzcdVar) {
        for (int i = 0; i < zzcdVar.zza(); i++) {
            zzcc zzccVarZzb = zzcdVar.zzb(i);
            if (zzccVarZzb instanceof zzahk) {
                zzahk zzahkVar = (zzahk) zzccVarZzb;
                if ("iTunSMPB".equals(zzahkVar.zzb) && zzc(zzahkVar.zzc)) {
                    return true;
                }
            } else if (zzccVarZzb instanceof zzaht) {
                zzaht zzahtVar = (zzaht) zzccVarZzb;
                if ("com.apple.iTunes".equals(zzahtVar.zza) && "iTunSMPB".equals(zzahtVar.zzb) && zzc(zzahtVar.zzc)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
