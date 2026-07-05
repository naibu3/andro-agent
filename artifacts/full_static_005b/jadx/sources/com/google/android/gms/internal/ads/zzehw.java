package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzehw implements zzehl {
    private final zzcrt zza;
    private final Context zzb;
    private final zzdsd zzc;
    private final zzfho zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbls zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziT)).booleanValue();
    private final zzegk zzi;

    public zzehw(zzcrt zzcrtVar, Context context, Executor executor, zzdsd zzdsdVar, zzfho zzfhoVar, VersionInfoParcel versionInfoParcel, zzbls zzblsVar, zzegk zzegkVar) {
        this.zzb = context;
        this.zza = zzcrtVar;
        this.zze = executor;
        this.zzc = zzdsdVar;
        this.zzd = zzfhoVar;
        this.zzf = versionInfoParcel;
        this.zzg = zzblsVar;
        this.zzi = zzegkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final ListenableFuture zza(final zzfhf zzfhfVar, final zzfgt zzfgtVar) {
        final zzdsh zzdshVar = new zzdsh();
        ListenableFuture listenableFutureZzn = zzgft.zzn(zzgft.zzh(null), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzehs
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzfgtVar, zzfhfVar, zzdshVar, obj);
            }
        }, this.zze);
        Objects.requireNonNull(zzdshVar);
        listenableFutureZzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeht
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
        final zzchd zzchdVarZza = this.zzc.zza(this.zzd.zze, zzfgtVar, zzfhfVar.zzb.zzb);
        zzchdVarZza.zzac(zzfgtVar.zzX);
        zzdshVar.zza(this.zzb, (View) zzchdVarZza);
        zzccn zzccnVar = new zzccn();
        final zzcrq zzcrqVarZza = this.zza.zza(new zzcvf(zzfhfVar, zzfgtVar, null), new zzdik(new zzehy(this.zzf, zzccnVar, zzfgtVar, zzchdVarZza, this.zzd, this.zzh, this.zzg, this.zzi), zzchdVarZza), new zzcrr(zzfgtVar.zzab));
        zzcrqVarZza.zzh().zzi(zzchdVarZza, false, this.zzh ? this.zzg : null);
        zzccnVar.zzc(zzcrqVarZza);
        zzcrqVarZza.zzc().zzo(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzehu
            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zzr() {
                zzchd zzchdVar = zzchdVarZza;
                if (zzchdVar.zzN() != null) {
                    zzchdVar.zzN().zzr();
                }
            }
        }, zzcci.zzf);
        String strZzb = zzfgtVar.zzt.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfc)).booleanValue() && zzcrqVarZza.zzi().zze(true)) {
            strZzb = zzcio.zzb(strZzb, zzcio.zza(zzfgtVar));
        }
        zzcrqVarZza.zzh();
        return zzgft.zzm(zzdsc.zzj(zzchdVarZza, zzfgtVar.zzt.zzb, strZzb), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzehv
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj2) {
                zzchd zzchdVar = zzchdVarZza;
                if (zzfgtVar.zzN) {
                    zzchdVar.zzah();
                }
                zzcrq zzcrqVar = zzcrqVarZza;
                zzchdVar.zzab();
                zzchdVar.onPause();
                return zzcrqVar.zza();
            }
        }, this.zze);
    }
}
