package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes2.dex */
public final class zzbfe {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbfe(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbfb zzf() {
        return new zzbfb(com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime(), null, null);
    }

    public final zzbfd zza() {
        zzbfd zzbfdVar;
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbR)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.zzc) {
            for (zzbfb zzbfbVar : this.zza) {
                long jZza = zzbfbVar.zza();
                String strZzc = zzbfbVar.zzc();
                zzbfb zzbfbVarZzb = zzbfbVar.zzb();
                if (zzbfbVarZzb != null && jZza > 0) {
                    long jZza2 = jZza - zzbfbVarZzb.zza();
                    sb.append(strZzc);
                    sb.append('.');
                    sb.append(jZza2);
                    sb.append(',');
                    if (zBooleanValue) {
                        if (map.containsKey(Long.valueOf(zzbfbVarZzb.zza()))) {
                            StringBuilder sb2 = (StringBuilder) map.get(Long.valueOf(zzbfbVarZzb.zza()));
                            sb2.append('+');
                            sb2.append(strZzc);
                        } else {
                            map.put(Long.valueOf(zzbfbVarZzb.zza()), new StringBuilder(strZzc));
                        }
                    }
                }
            }
            this.zza.clear();
            String string = null;
            if (!TextUtils.isEmpty(null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            StringBuilder sb3 = new StringBuilder();
            if (zBooleanValue) {
                for (Map.Entry entry : map.entrySet()) {
                    sb3.append((CharSequence) entry.getValue());
                    sb3.append('.');
                    sb3.append(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() + (((Long) entry.getKey()).longValue() - com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime()));
                    sb3.append(',');
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                string = sb3.toString();
            }
            zzbfdVar = new zzbfd(sb.toString(), string);
        }
        return zzbfdVar;
    }

    public final Map zzb() {
        Map map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzu.zzo().zzg();
            map = this.zzb;
        }
        return map;
    }

    public final void zzc(zzbfe zzbfeVar) {
        synchronized (this.zzc) {
        }
    }

    public final void zzd(String str, String str2) {
        zzbeu zzbeuVarZzg;
        if (TextUtils.isEmpty(str2) || (zzbeuVarZzg = com.google.android.gms.ads.internal.zzu.zzo().zzg()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbfa zzbfaVarZza = zzbeuVarZzg.zza(str);
            Map map = this.zzb;
            map.put(str, zzbfaVarZza.zza((String) map.get(str), str2));
        }
    }

    public final boolean zze(zzbfb zzbfbVar, long j, String... strArr) {
        synchronized (this.zzc) {
            this.zza.add(new zzbfb(j, strArr[0], zzbfbVar));
        }
        return true;
    }
}
