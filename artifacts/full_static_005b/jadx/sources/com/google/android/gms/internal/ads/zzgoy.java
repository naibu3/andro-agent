package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgoy {
    public static final zzgtl zza = new zzgox(null);

    public static zzgtr zza(zzgqk zzgqkVar) {
        zzghk zzghkVar;
        zzgtn zzgtnVar = new zzgtn();
        zzgtnVar.zzb(zzgqkVar.zzc());
        Iterator it = zzgqkVar.zze().iterator();
        while (it.hasNext()) {
            for (zzgqi zzgqiVar : (List) it.next()) {
                zzgwj zzgwjVarZzb = zzgqiVar.zzb();
                zzgwj zzgwjVar = zzgwj.UNKNOWN_STATUS;
                int iOrdinal = zzgwjVarZzb.ordinal();
                if (iOrdinal == 1) {
                    zzghkVar = zzghk.zza;
                } else if (iOrdinal == 2) {
                    zzghkVar = zzghk.zzb;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    zzghkVar = zzghk.zzc;
                }
                int iZza = zzgqiVar.zza();
                String strZzf = zzgqiVar.zzf();
                if (strZzf.startsWith("type.googleapis.com/google.crypto.")) {
                    strZzf = strZzf.substring(34);
                }
                zzgtnVar.zza(zzghkVar, iZza, strZzf, zzgqiVar.zzc().name());
            }
        }
        if (zzgqkVar.zzb() != null) {
            zzgtnVar.zzc(zzgqkVar.zzb().zza());
        }
        try {
            return zzgtnVar.zzd();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
