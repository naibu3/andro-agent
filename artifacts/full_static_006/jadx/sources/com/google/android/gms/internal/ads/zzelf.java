package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import com.qonversion.android.sdk.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzelf {
    private final Clock zza;
    private final zzelh zzb;
    private final zzfoe zzc;
    private final LinkedHashMap zzd = new LinkedHashMap();
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhb)).booleanValue();
    private final zzehq zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;

    public zzelf(Clock clock, zzelh zzelhVar, zzehq zzehqVar, zzfoe zzfoeVar) {
        this.zza = clock;
        this.zzb = zzelhVar;
        this.zzf = zzehqVar;
        this.zzc = zzfoeVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized boolean zzq(zzfgt zzfgtVar) {
        zzele zzeleVar = (zzele) this.zzd.get(zzfgtVar);
        if (zzeleVar == null) {
            return false;
        }
        return zzeleVar.zzc == 8;
    }

    public final synchronized long zza() {
        return this.zzh;
    }

    final synchronized ListenableFuture zzf(zzfhf zzfhfVar, zzfgt zzfgtVar, ListenableFuture listenableFuture, zzfoa zzfoaVar) {
        zzfgw zzfgwVar = zzfhfVar.zzb.zzb;
        long jElapsedRealtime = this.zza.elapsedRealtime();
        String str = zzfgtVar.zzx;
        if (str != null) {
            this.zzd.put(zzfgtVar, new zzele(str, zzfgtVar.zzag, 9, 0L, null));
            zzgft.zzr(listenableFuture, new zzeld(this, jElapsedRealtime, zzfgwVar, zzfgtVar, str, zzfoaVar, zzfhfVar), zzcci.zzf);
        }
        return listenableFuture;
    }

    public final synchronized String zzg() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.zzd.entrySet().iterator();
        while (it.hasNext()) {
            zzele zzeleVar = (zzele) ((Map.Entry) it.next()).getValue();
            if (zzeleVar.zzc != Integer.MAX_VALUE) {
                arrayList.add(zzeleVar.toString());
            }
        }
        return TextUtils.join(Constants.USER_ID_SEPARATOR, arrayList);
    }

    public final synchronized void zzi(zzfgt zzfgtVar) {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
        if (zzfgtVar != null) {
            this.zzf.zze(zzfgtVar);
        }
        this.zzg = true;
    }

    public final synchronized void zzj() {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
    }

    public final synchronized void zzk(List list) {
        this.zzi = this.zza.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfgt zzfgtVar = (zzfgt) it.next();
            if (!TextUtils.isEmpty(zzfgtVar.zzx)) {
                this.zzd.put(zzfgtVar, new zzele(zzfgtVar.zzx, zzfgtVar.zzag, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void zzl() {
        this.zzi = this.zza.elapsedRealtime();
    }

    public final synchronized void zzm(zzfgt zzfgtVar) {
        zzele zzeleVar = (zzele) this.zzd.get(zzfgtVar);
        if (zzeleVar == null || this.zzg) {
            return;
        }
        zzeleVar.zzc = 8;
    }
}
