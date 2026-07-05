package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdsq {
    private final Map zza = new HashMap();

    zzdsq() {
    }

    @Nullable
    public final synchronized zzdsp zza(String str) {
        return (zzdsp) this.zza.get(str);
    }

    public final String zzb(String str) {
        zzbtt zzbttVar;
        zzdsp zzdspVarZza = zza(str);
        return (zzdspVarZza == null || (zzbttVar = zzdspVarZza.zzb) == null) ? "" : zzbttVar.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0019 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final synchronized void zzc(String str, @Nullable zzfim zzfimVar) {
        zzbtt zzbttVarZze;
        if (this.zza.containsKey(str)) {
            return;
        }
        zzbtt zzbttVarZzf = null;
        if (zzfimVar != null) {
            try {
                zzbttVarZze = zzfimVar.zze();
            } catch (zzfhv unused) {
            }
            if (zzfimVar != null) {
            }
            boolean z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjr)).booleanValue()) {
            }
            this.zza.put(str, new zzdsp(str, zzbttVarZze, zzbttVarZzf, z));
            return;
        }
        zzbttVarZze = null;
        if (zzfimVar != null) {
            try {
                zzbttVarZzf = zzfimVar.zzf();
            } catch (zzfhv unused2) {
            }
        }
        boolean z2 = true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjr)).booleanValue()) {
            if (zzfimVar == null) {
                z2 = false;
            } else {
                try {
                    zzfimVar.zzC();
                } catch (zzfhv unused3) {
                }
            }
        }
        this.zza.put(str, new zzdsp(str, zzbttVarZze, zzbttVarZzf, z2));
        return;
    }

    final synchronized void zzd(String str, zzbte zzbteVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdsp(str, zzbteVar.zzf(), zzbteVar.zzg(), true));
        } catch (Throwable unused) {
        }
    }
}
