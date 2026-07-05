package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzarx {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    zzarx(String str, zzaqn zzaqnVar) {
        String str2 = zzaqnVar.zzb;
        long j = zzaqnVar.zzc;
        long j2 = zzaqnVar.zzd;
        long j3 = zzaqnVar.zze;
        long j4 = zzaqnVar.zzf;
        List arrayList = zzaqnVar.zzh;
        if (arrayList == null) {
            Map map = zzaqnVar.zzg;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new zzaqw((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j, j2, j3, j4, arrayList);
    }

    static zzarx zza(zzary zzaryVar) throws IOException {
        if (zzasa.zze(zzaryVar) != 538247942) {
            throw new IOException();
        }
        String strZzh = zzasa.zzh(zzaryVar);
        String strZzh2 = zzasa.zzh(zzaryVar);
        long jZzf = zzasa.zzf(zzaryVar);
        long jZzf2 = zzasa.zzf(zzaryVar);
        long jZzf3 = zzasa.zzf(zzaryVar);
        long jZzf4 = zzasa.zzf(zzaryVar);
        int iZze = zzasa.zze(zzaryVar);
        if (iZze < 0) {
            throw new IOException("readHeaderList size=" + iZze);
        }
        List listEmptyList = iZze == 0 ? Collections.emptyList() : new ArrayList();
        for (int i = 0; i < iZze; i++) {
            listEmptyList.add(new zzaqw(zzasa.zzh(zzaryVar).intern(), zzasa.zzh(zzaryVar).intern()));
        }
        return new zzarx(strZzh, strZzh2, jZzf, jZzf2, jZzf3, jZzf4, listEmptyList);
    }

    private zzarx(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = j4;
        this.zzh = list;
    }
}
