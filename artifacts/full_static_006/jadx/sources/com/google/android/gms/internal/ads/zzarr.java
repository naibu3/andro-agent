package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzarr implements zzard {
    private final Map zza = new HashMap();
    private final zzaqq zzb;
    private final BlockingQueue zzc;
    private final zzaqv zzd;

    zzarr(zzaqq zzaqqVar, BlockingQueue blockingQueue, zzaqv zzaqvVar) {
        this.zzd = zzaqvVar;
        this.zzb = zzaqqVar;
        this.zzc = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzard
    public final synchronized void zza(zzare zzareVar) {
        Map map = this.zza;
        String strZzj = zzareVar.zzj();
        List list = (List) map.remove(strZzj);
        if (list == null || list.isEmpty()) {
            return;
        }
        if (zzarq.zzb) {
            zzarq.zzd("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strZzj);
        }
        zzare zzareVar2 = (zzare) list.remove(0);
        this.zza.put(strZzj, list);
        zzareVar2.zzu(this);
        try {
            this.zzc.put(zzareVar2);
        } catch (InterruptedException e) {
            zzarq.zzb("Couldn't add request to queue. %s", e.toString());
            Thread.currentThread().interrupt();
            this.zzb.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzard
    public final void zzb(zzare zzareVar, zzark zzarkVar) {
        List list;
        zzaqn zzaqnVar = zzarkVar.zzb;
        if (zzaqnVar == null || zzaqnVar.zza(System.currentTimeMillis())) {
            zza(zzareVar);
            return;
        }
        String strZzj = zzareVar.zzj();
        synchronized (this) {
            list = (List) this.zza.remove(strZzj);
        }
        if (list != null) {
            if (zzarq.zzb) {
                zzarq.zzd("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strZzj);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.zzd.zzb((zzare) it.next(), zzarkVar, null);
            }
        }
    }

    final synchronized boolean zzc(zzare zzareVar) {
        Map map = this.zza;
        String strZzj = zzareVar.zzj();
        if (!map.containsKey(strZzj)) {
            this.zza.put(strZzj, null);
            zzareVar.zzu(this);
            if (zzarq.zzb) {
                zzarq.zza("new request, sending to network %s", strZzj);
            }
            return false;
        }
        List arrayList = (List) this.zza.get(strZzj);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        zzareVar.zzm("waiting-for-response");
        arrayList.add(zzareVar);
        this.zza.put(strZzj, arrayList);
        if (zzarq.zzb) {
            zzarq.zza("Request for cacheKey=%s is in flight, putting on hold.", strZzj);
        }
        return true;
    }
}
