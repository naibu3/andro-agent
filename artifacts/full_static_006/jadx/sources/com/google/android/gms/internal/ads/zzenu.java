package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzenu {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdst zzb;

    public zzenu(zzdst zzdstVar) {
        this.zzb = zzdstVar;
    }

    @CheckForNull
    public final zzbte zza(String str) {
        if (this.zza.containsKey(str)) {
            return (zzbte) this.zza.get(str);
        }
        return null;
    }

    public final void zzb(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Couldn't create RTB adapter : ", e);
        }
    }
}
