package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzejn implements zzdjp {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final ListenableFuture zzc;
    private final zzfgt zzd;
    private final zzchd zze;
    private final zzfho zzf;
    private final zzbls zzg;
    private final boolean zzh;
    private final zzegk zzi;

    zzejn(Context context, VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzfgt zzfgtVar, zzchd zzchdVar, zzfho zzfhoVar, boolean z, zzbls zzblsVar, zzegk zzegkVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = listenableFuture;
        this.zzd = zzfgtVar;
        this.zze = zzchdVar;
        this.zzf = zzfhoVar;
        this.zzg = zzblsVar;
        this.zzh = z;
        this.zzi = zzegkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdjp
    public final void zza(boolean z, Context context, zzczy zzczyVar) throws NumberFormatException {
        zzdih zzdihVar = (zzdih) zzgft.zzq(this.zzc);
        this.zze.zzaq(true);
        boolean zZze = this.zzh ? this.zzg.zze(false) : false;
        com.google.android.gms.ads.internal.zzu.zzp();
        com.google.android.gms.ads.internal.zzk zzkVar = new com.google.android.gms.ads.internal.zzk(zZze, com.google.android.gms.ads.internal.util.zzt.zzI(this.zza), this.zzh ? this.zzg.zzd() : false, this.zzh ? this.zzg.zza() : 0.0f, -1, z, this.zzd.zzP, false);
        if (zzczyVar != null) {
            zzczyVar.zzf();
        }
        com.google.android.gms.ads.internal.zzu.zzi();
        zzdje zzdjeVarZzh = zzdihVar.zzh();
        zzchd zzchdVar = this.zze;
        zzfgt zzfgtVar = this.zzd;
        VersionInfoParcel versionInfoParcel = this.zzb;
        int i = zzfgtVar.zzR;
        String str = zzfgtVar.zzC;
        zzfgy zzfgyVar = zzfgtVar.zzt;
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzdjeVarZzh, (com.google.android.gms.ads.internal.overlay.zzaa) null, zzchdVar, i, versionInfoParcel, str, zzkVar, zzfgyVar.zzb, zzfgyVar.zza, this.zzf.zzf, zzczyVar, zzfgtVar.zzaj ? this.zzi : null), true);
    }
}
