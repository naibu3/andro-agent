package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfjy {
    private final zzfjc zza;
    private final zzfjw zzb;
    private final zzfiy zzc;
    private zzfke zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzfjy(zzfjc zzfjcVar, zzfiy zzfiyVar, zzfjw zzfjwVar) {
        this.zza = zzfjcVar;
        this.zzc = zzfiyVar;
        this.zzb = zzfjwVar;
        zzfiyVar.zzb(new zzfjt(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzh() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgy)).booleanValue() && !com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh().zzh()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (!this.zzd.isEmpty()) {
                zzfjx zzfjxVar = (zzfjx) this.zzd.pollFirst();
                if (zzfjxVar == null || (zzfjxVar.zza() != null && this.zza.zze(zzfjxVar.zza()))) {
                    zzfke zzfkeVar = new zzfke(this.zza, this.zzb, zzfjxVar);
                    this.zze = zzfkeVar;
                    zzfkeVar.zzd(new zzfju(this, zzfjxVar));
                    return;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized ListenableFuture zza(zzfjx zzfjxVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zza(zzfjxVar);
    }

    public final synchronized void zze(zzfjx zzfjxVar) {
        this.zzd.add(zzfjxVar);
    }

    final /* synthetic */ void zzf() {
        synchronized (this) {
            this.zzf = 1;
            zzh();
        }
    }
}
