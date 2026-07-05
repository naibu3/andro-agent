package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzffw implements OnAdMetadataChangedListener, zzdaz, zzczo, zzczl, zzdab, zzdbw, zzfeh, zzdhi {
    private final zzfiy zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();

    public zzffw(zzfiy zzfiyVar) {
        this.zza = zzfiyVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzfdy.zza(this.zzb, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzffk
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) {
                ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zza() {
        this.zza.zza();
        zzfdy.zza(this.zzd, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzffs
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) throws RemoteException {
                ((zzbzd) obj).zzg();
            }
        });
        zzfdy.zza(this.zze, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzfft
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) throws RemoteException {
                ((zzbyn) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzb() {
        zzfdy.zza(this.zze, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzffu
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) throws RemoteException {
                ((zzbyn) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzc() {
        zzfdy.zza(this.zzd, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzffe
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) throws RemoteException {
                ((zzbzd) obj).zzj();
            }
        });
        zzfdy.zza(this.zze, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzfff
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) throws RemoteException {
                ((zzbyn) obj).zzj();
            }
        });
        zzfdy.zza(this.zzd, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzffg
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) throws RemoteException {
                ((zzbzd) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzdB(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        final int i = zzeVar.zza;
        zzfdy.zza(this.zzc, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzffp
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) throws RemoteException {
                ((zzbzh) obj).zzf(zzeVar);
            }
        });
        zzfdy.zza(this.zzc, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzffq
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) throws RemoteException {
                ((zzbzh) obj).zze(i);
            }
        });
        zzfdy.zza(this.zze, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzffr
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) throws RemoteException {
                ((zzbyn) obj).zzg(i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzdG() {
        zzfdy.zza(this.zzd, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzffl
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) throws RemoteException {
                ((zzbzd) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzdf() {
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzds(final zzbyh zzbyhVar, final String str, final String str2) {
        zzfdy.zza(this.zzd, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzffv
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) throws RemoteException {
                zzbyh zzbyhVar2 = zzbyhVar;
                ((zzbzd) obj).zzk(new zzbzr(zzbyhVar2.zzc(), zzbyhVar2.zzb()));
            }
        });
        zzfdy.zza(this.zzf, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzffb
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) throws RemoteException {
                zzbyh zzbyhVar2 = zzbyhVar;
                ((zzbzi) obj).zze(new zzbzr(zzbyhVar2.zzc(), zzbyhVar2.zzb()), str, str2);
            }
        });
        zzfdy.zza(this.zze, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzffc
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) throws RemoteException {
                ((zzbyn) obj).zze(zzbyhVar);
            }
        });
        zzfdy.zza(this.zzg, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzffd
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) throws RemoteException {
                ((zzbyi) obj).zze(zzbyhVar, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zze() {
        zzfdy.zza(this.zze, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzffo
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) throws RemoteException {
                ((zzbyn) obj).zzk();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzf() {
        zzfdy.zza(this.zze, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzffa
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) throws RemoteException {
                ((zzbyn) obj).zzl();
            }
        });
    }

    public final void zzg(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzb.set(onAdMetadataChangedListener);
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzfdy.zza(this.zzh, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzffh
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzdg) obj).zze(zzsVar);
            }
        });
    }

    public final void zzi(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzh.set(zzdgVar);
    }

    public final void zzj(zzbzd zzbzdVar) {
        this.zzd.set(zzbzdVar);
    }

    public final void zzk(zzbzh zzbzhVar) {
        this.zzc.set(zzbzhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfeh
    public final void zzl(zzfeh zzfehVar) {
        throw null;
    }

    @Deprecated
    public final void zzm(zzbyn zzbynVar) {
        this.zze.set(zzbynVar);
    }

    @Deprecated
    public final void zzn(zzbyi zzbyiVar) {
        this.zzg.set(zzbyiVar);
    }

    public final void zzo(zzbzi zzbziVar) {
        this.zzf.set(zzbziVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdab
    public final void zzq(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfdy.zza(this.zzd, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzffm
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) throws RemoteException {
                ((zzbzd) obj).zzi(zzeVar);
            }
        });
        zzfdy.zza(this.zzd, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzffn
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) throws RemoteException {
                ((zzbzd) obj).zzh(zzeVar.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdaz
    public final void zzs() {
        zzfdy.zza(this.zzc, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzffi
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) throws RemoteException {
                ((zzbzh) obj).zzg();
            }
        });
        zzfdy.zza(this.zze, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzffj
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) throws RemoteException {
                ((zzbyn) obj).zzi();
            }
        });
    }
}
