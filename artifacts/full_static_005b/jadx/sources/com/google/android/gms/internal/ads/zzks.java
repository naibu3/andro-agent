package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzks implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzaci, zzqo, zzxu, zzun, zziu, zziq {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzkw zza;

    /* synthetic */ zzks(zzkw zzkwVar, zzkr zzkrVar) {
        this.zza = zzkwVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzkw.zzP(this.zza, surfaceTexture);
        this.zza.zzaf(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.zza.zzai(null);
        this.zza.zzaf(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.zza.zzaf(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.zza.zzaf(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.zza.zzaf(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zza(Exception exc) {
        this.zza.zzr.zzv(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzb(String str, long j, long j2) {
        this.zza.zzr.zzw(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzc(String str) {
        this.zza.zzr.zzx(str);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzd(zzix zzixVar) {
        this.zza.zzr.zzy(zzixVar);
        this.zza.zzL = null;
        this.zza.zzR = null;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zze(zzix zzixVar) {
        this.zza.zzR = zzixVar;
        this.zza.zzr.zzz(zzixVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzf(zzan zzanVar, zziy zziyVar) {
        this.zza.zzL = zzanVar;
        this.zza.zzr.zzA(zzanVar, zziyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzg(long j) {
        this.zza.zzr.zzB(j);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzh(Exception exc) {
        this.zza.zzr.zzC(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzi(zzqp zzqpVar) {
        this.zza.zzr.zzD(zzqpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzj(zzqp zzqpVar) {
        this.zza.zzr.zzE(zzqpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzk(int i, long j, long j2) {
        this.zza.zzr.zzF(i, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final void zzl(int i, long j) {
        this.zza.zzr.zzG(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final void zzm(Object obj, long j) {
        this.zza.zzr.zzH(obj, j);
        zzkw zzkwVar = this.zza;
        if (zzkwVar.zzM == obj) {
            zzfh zzfhVar = zzkwVar.zzl;
            zzfhVar.zzd(26, new zzfe() { // from class: com.google.android.gms.internal.ads.zzkq
                @Override // com.google.android.gms.internal.ads.zzfe
                public final void zza(Object obj2) {
                }
            });
            zzfhVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzn(final boolean z) {
        zzkw zzkwVar = this.zza;
        if (zzkwVar.zzV == z) {
            return;
        }
        zzkwVar.zzV = z;
        zzfh zzfhVar = this.zza.zzl;
        zzfhVar.zzd(23, new zzfe() { // from class: com.google.android.gms.internal.ads.zzko
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
                int i = zzks.zzb;
                ((zzcq) obj).zzn(z);
            }
        });
        zzfhVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final void zzo(Exception exc) {
        this.zza.zzr.zzI(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final void zzp(String str, long j, long j2) {
        this.zza.zzr.zzJ(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final void zzq(String str) {
        this.zza.zzr.zzK(str);
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final void zzr(zzix zzixVar) {
        this.zza.zzr.zzL(zzixVar);
        this.zza.zzK = null;
        this.zza.zzQ = null;
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final void zzs(zzix zzixVar) {
        this.zza.zzQ = zzixVar;
        this.zza.zzr.zzM(zzixVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final void zzt(long j, int i) {
        this.zza.zzr.zzN(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final void zzu(zzan zzanVar, zziy zziyVar) {
        this.zza.zzK = zzanVar;
        this.zza.zzr.zzO(zzanVar, zziyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final void zzv(final zzdv zzdvVar) {
        this.zza.zzaa = zzdvVar;
        zzfh zzfhVar = this.zza.zzl;
        zzfhVar.zzd(25, new zzfe() { // from class: com.google.android.gms.internal.ads.zzkp
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
                int i = zzks.zzb;
                ((zzcq) obj).zzr(zzdvVar);
            }
        });
        zzfhVar.zzc();
    }
}
