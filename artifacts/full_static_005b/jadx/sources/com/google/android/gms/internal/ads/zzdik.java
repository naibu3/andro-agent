package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public class zzdik {
    private final zzdjp zza;
    private final zzchd zzb;

    public zzdik(zzdjp zzdjpVar, zzchd zzchdVar) {
        this.zza = zzdjpVar;
        this.zzb = zzchdVar;
    }

    public static final zzdha zzh(zzflz zzflzVar) {
        return new zzdha(zzflzVar, zzcci.zzf);
    }

    public static final zzdha zzi(zzdju zzdjuVar) {
        return new zzdha(zzdjuVar, zzcci.zzf);
    }

    public final View zza() {
        zzchd zzchdVar = this.zzb;
        if (zzchdVar == null) {
            return null;
        }
        return zzchdVar.zzG();
    }

    public final View zzb() {
        zzchd zzchdVar = this.zzb;
        if (zzchdVar != null) {
            return zzchdVar.zzG();
        }
        return null;
    }

    public final zzchd zzc() {
        return this.zzb;
    }

    public final zzdha zzd(Executor executor) {
        final zzchd zzchdVar = this.zzb;
        return new zzdha(new zzddy() { // from class: com.google.android.gms.internal.ads.zzdij
            @Override // com.google.android.gms.internal.ads.zzddy
            public final void zza() {
                com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL;
                zzchd zzchdVar2 = zzchdVar;
                if (zzchdVar2 == null || (zzmVarZzL = zzchdVar2.zzL()) == null) {
                    return;
                }
                zzmVarZzL.zzb();
            }
        }, executor);
    }

    public final zzdjp zze() {
        return this.zza;
    }

    public Set zzf(zzcyi zzcyiVar) {
        return Collections.singleton(new zzdha(zzcyiVar, zzcci.zzf));
    }

    public Set zzg(zzcyi zzcyiVar) {
        return Collections.singleton(new zzdha(zzcyiVar, zzcci.zzf));
    }
}
