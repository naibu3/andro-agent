package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdns implements zzdaf {
    private final zzdlt zza;
    private final zzdly zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdns(zzdlt zzdltVar, zzdly zzdlyVar, Executor executor, Executor executor2) {
        this.zza = zzdltVar;
        this.zzb = zzdlyVar;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(final zzchd zzchdVar) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdnq
            @Override // java.lang.Runnable
            public final void run() {
                zzchdVar.zzd("onSdkImpression", new ArrayMap());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdaf
    public final void zzr() {
        if (this.zzb.zzd()) {
            zzdlt zzdltVar = this.zza;
            zzehg zzehgVarZzu = zzdltVar.zzu();
            if (zzehgVarZzu == null && zzdltVar.zzw() != null && ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfi)).booleanValue()) {
                zzdlt zzdltVar2 = this.zza;
                ListenableFuture listenableFutureZzw = zzdltVar2.zzw();
                zzccn zzccnVarZzp = zzdltVar2.zzp();
                if (listenableFutureZzw == null || zzccnVarZzp == null) {
                    return;
                }
                zzgft.zzr(zzgft.zzl(listenableFutureZzw, zzccnVarZzp), new zzdnr(this), this.zzd);
                return;
            }
            if (zzehgVarZzu != null) {
                zzdlt zzdltVar3 = this.zza;
                zzchd zzchdVarZzr = zzdltVar3.zzr();
                zzchd zzchdVarZzs = zzdltVar3.zzs();
                if (zzchdVarZzr == null) {
                    zzchdVarZzr = zzchdVarZzs != null ? zzchdVarZzs : null;
                }
                if (zzchdVarZzr != null) {
                    zzb(zzchdVarZzr);
                }
            }
        }
    }
}
