package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzemi implements zzehl {
    private final Context zza;
    private final zzdsd zzb;
    private final zzdrm zzc;
    private final zzfho zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbls zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziT)).booleanValue();
    private final zzegk zzi;

    public zzemi(Context context, VersionInfoParcel versionInfoParcel, zzfho zzfhoVar, Executor executor, zzdrm zzdrmVar, zzdsd zzdsdVar, zzbls zzblsVar, zzegk zzegkVar) {
        this.zza = context;
        this.zzd = zzfhoVar;
        this.zzc = zzdrmVar;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzdsdVar;
        this.zzg = zzblsVar;
        this.zzi = zzegkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final ListenableFuture zza(final zzfhf zzfhfVar, final zzfgt zzfgtVar) {
        final zzdsh zzdshVar = new zzdsh();
        ListenableFuture listenableFutureZzn = zzgft.zzn(zzgft.zzh(null), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzemb
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzfgtVar, zzfhfVar, zzdshVar, obj);
            }
        }, this.zze);
        Objects.requireNonNull(zzdshVar);
        listenableFutureZzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzemc
            @Override // java.lang.Runnable
            public final void run() {
                zzdshVar.zzb();
            }
        }, this.zze);
        return listenableFutureZzn;
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final boolean zzb(zzfhf zzfhfVar, zzfgt zzfgtVar) {
        zzfgy zzfgyVar = zzfgtVar.zzt;
        return (zzfgyVar == null || zzfgyVar.zza == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ ListenableFuture zzc(final zzfgt zzfgtVar, zzfhf zzfhfVar, zzdsh zzdshVar, Object obj) throws Exception {
        final zzchd zzchdVarZza = this.zzb.zza(this.zzd.zze, zzfgtVar, zzfhfVar.zzb.zzb);
        zzchdVarZza.zzac(zzfgtVar.zzX);
        zzdshVar.zza(this.zza, (View) zzchdVarZza);
        zzccn zzccnVar = new zzccn();
        final zzdri zzdriVarZze = this.zzc.zze(new zzcvf(zzfhfVar, zzfgtVar, null), new zzdrj(new zzemh(this.zza, this.zzb, this.zzd, this.zzf, zzfgtVar, zzccnVar, zzchdVarZza, this.zzg, this.zzh, this.zzi), zzchdVarZza));
        zzccnVar.zzc(zzdriVarZze);
        zzbmh.zzb(zzchdVarZza, zzdriVarZze.zzg());
        zzdriVarZze.zzc().zzo(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzemd
            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zzr() {
                zzchd zzchdVar = zzchdVarZza;
                if (zzchdVar.zzN() != null) {
                    zzchdVar.zzN().zzr();
                }
            }
        }, zzcci.zzf);
        zzdriVarZze.zzl().zzi(zzchdVarZza, true, this.zzh ? this.zzg : null);
        String strZzb = zzfgtVar.zzt.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfc)).booleanValue() && zzdriVarZze.zzm().zze(true)) {
            strZzb = zzcio.zzb(strZzb, zzcio.zza(zzfgtVar));
        }
        zzdriVarZze.zzl();
        return zzgft.zzm(zzdsc.zzj(zzchdVarZza, zzfgtVar.zzt.zzb, strZzb), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzeme
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj2) {
                zzchd zzchdVar = zzchdVarZza;
                if (zzfgtVar.zzN) {
                    zzchdVar.zzah();
                }
                zzdri zzdriVar = zzdriVarZze;
                zzchdVar.zzab();
                zzchdVar.onPause();
                return zzdriVar.zzi();
            }
        }, this.zze);
    }
}
