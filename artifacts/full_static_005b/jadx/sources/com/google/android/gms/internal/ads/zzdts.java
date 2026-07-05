package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdts implements zzdcg, zzdaz, zzczo, zzdaf, com.google.android.gms.ads.internal.client.zza, zzdes {
    private final zzbdm zza;
    private boolean zzb = false;

    public zzdts(zzbdm zzbdmVar, @Nullable zzfeo zzfeoVar) {
        this.zza = zzbdmVar;
        zzbdmVar.zzb(zzbdo.AD_REQUEST);
        if (zzfeoVar != null) {
            zzbdmVar.zzb(zzbdo.REQUEST_IS_PREFETCH);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (this.zzb) {
            this.zza.zzb(zzbdo.AD_SUBSEQUENT_CLICK);
        } else {
            this.zza.zzb(zzbdo.AD_FIRST_CLICK);
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
        switch (zzeVar.zza) {
            case 1:
                this.zza.zzb(zzbdo.AD_FAILED_TO_LOAD_INVALID_REQUEST);
                break;
            case 2:
                this.zza.zzb(zzbdo.AD_FAILED_TO_LOAD_NETWORK_ERROR);
                break;
            case 3:
                this.zza.zzb(zzbdo.AD_FAILED_TO_LOAD_NO_FILL);
                break;
            case 4:
                this.zza.zzb(zzbdo.AD_FAILED_TO_LOAD_TIMEOUT);
                break;
            case 5:
                this.zza.zzb(zzbdo.AD_FAILED_TO_LOAD_CANCELLED);
                break;
            case 6:
                this.zza.zzb(zzbdo.AD_FAILED_TO_LOAD_NO_ERROR);
                break;
            case 7:
                this.zza.zzb(zzbdo.AD_FAILED_TO_LOAD_NOT_FOUND);
                break;
            default:
                this.zza.zzb(zzbdo.AD_FAILED_TO_LOAD);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final void zzdn(zzbxu zzbxuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final void zzdo(final zzfhf zzfhfVar) {
        this.zza.zzc(new zzbdl() { // from class: com.google.android.gms.internal.ads.zzdto
            @Override // com.google.android.gms.internal.ads.zzbdl
            public final void zza(zzbdv.zzt.zza zzaVar) {
                zzbdv.zza.zzb zzbVarZzcZ = zzaVar.zze().zzcZ();
                zzbdv.zzi.zza zzaVarZzcZ = zzaVar.zze().zzad().zzcZ();
                zzaVarZzcZ.zzo(zzfhfVar.zzb.zzb.zzb);
                zzbVarZzcZ.zzT(zzaVarZzcZ);
                zzaVar.zzG(zzbVarZzcZ);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdes
    public final void zzh() {
        this.zza.zzb(zzbdo.REQUEST_FAILED_TO_LOAD_FROM_CACHE);
    }

    @Override // com.google.android.gms.internal.ads.zzdes
    public final void zzi(final zzbdv.zzb zzbVar) {
        this.zza.zzc(new zzbdl() { // from class: com.google.android.gms.internal.ads.zzdtr
            @Override // com.google.android.gms.internal.ads.zzbdl
            public final void zza(zzbdv.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbVar);
            }
        });
        this.zza.zzb(zzbdo.REQUEST_LOADED_FROM_CACHE);
    }

    @Override // com.google.android.gms.internal.ads.zzdes
    public final void zzj(final zzbdv.zzb zzbVar) {
        this.zza.zzc(new zzbdl() { // from class: com.google.android.gms.internal.ads.zzdtp
            @Override // com.google.android.gms.internal.ads.zzbdl
            public final void zza(zzbdv.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbVar);
            }
        });
        this.zza.zzb(zzbdo.REQUEST_SAVED_TO_CACHE);
    }

    @Override // com.google.android.gms.internal.ads.zzdes
    public final void zzl(boolean z) {
        this.zza.zzb(z ? zzbdo.NOTIFIED_CACHE_HIT_TO_SERVICE_SUCCEEDED : zzbdo.NOTIFIED_CACHE_HIT_TO_SERVICE_FAILED);
    }

    @Override // com.google.android.gms.internal.ads.zzdes
    public final void zzm(final zzbdv.zzb zzbVar) {
        this.zza.zzc(new zzbdl() { // from class: com.google.android.gms.internal.ads.zzdtq
            @Override // com.google.android.gms.internal.ads.zzbdl
            public final void zza(zzbdv.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbVar);
            }
        });
        this.zza.zzb(zzbdo.REQUEST_PREFETCH_INTERCEPTED);
    }

    @Override // com.google.android.gms.internal.ads.zzdes
    public final void zzn(boolean z) {
        this.zza.zzb(z ? zzbdo.REQUESTED_CACHE_KEY_FROM_SERVICE_SUCCEEDED : zzbdo.REQUESTED_CACHE_KEY_FROM_SERVICE_FAILED);
    }

    @Override // com.google.android.gms.internal.ads.zzdaf
    public final synchronized void zzr() {
        this.zza.zzb(zzbdo.AD_IMPRESSION);
    }

    @Override // com.google.android.gms.internal.ads.zzdaz
    public final void zzs() {
        this.zza.zzb(zzbdo.AD_LOADED);
    }
}
