package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzehy implements zzdjp {
    private final VersionInfoParcel zza;
    private final ListenableFuture zzb;
    private final zzfgt zzc;
    private final zzchd zzd;
    private final zzfho zze;
    private final zzbls zzf;
    private final boolean zzg;
    private final zzegk zzh;

    zzehy(VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzfgt zzfgtVar, zzchd zzchdVar, zzfho zzfhoVar, boolean z, zzbls zzblsVar, zzegk zzegkVar) {
        this.zza = versionInfoParcel;
        this.zzb = listenableFuture;
        this.zzc = zzfgtVar;
        this.zzd = zzchdVar;
        this.zze = zzfhoVar;
        this.zzg = z;
        this.zzf = zzblsVar;
        this.zzh = zzegkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    @Override // com.google.android.gms.internal.ads.zzdjp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(boolean z, Context context, zzczy zzczyVar) throws NumberFormatException {
        zzcrq zzcrqVar = (zzcrq) zzgft.zzq(this.zzb);
        this.zzd.zzaq(true);
        boolean zZze = this.zzg ? this.zzf.zze(true) : true;
        boolean z2 = this.zzg;
        com.google.android.gms.ads.internal.zzk zzkVar = new com.google.android.gms.ads.internal.zzk(zZze, true, z2 ? this.zzf.zzd() : false, z2 ? this.zzf.zza() : 0.0f, -1, z, this.zzc.zzP, false);
        if (zzczyVar != null) {
            zzczyVar.zzf();
        }
        com.google.android.gms.ads.internal.zzu.zzi();
        zzdje zzdjeVarZzg = zzcrqVar.zzg();
        zzchd zzchdVar = this.zzd;
        int i = this.zzc.zzR;
        if (i == -1) {
            com.google.android.gms.ads.internal.client.zzw zzwVar = this.zze.zzj;
            if (zzwVar == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Error setting app open orientation; no targeting orientation available.");
                i = this.zzc.zzR;
            } else {
                int i2 = zzwVar.zza;
                if (i2 == 1) {
                    i = 7;
                } else if (i2 == 2) {
                    i = 6;
                }
            }
        }
        int i3 = i;
        VersionInfoParcel versionInfoParcel = this.zza;
        zzfgt zzfgtVar = this.zzc;
        String str = zzfgtVar.zzC;
        zzfgy zzfgyVar = zzfgtVar.zzt;
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzdjeVarZzg, (com.google.android.gms.ads.internal.overlay.zzaa) null, zzchdVar, i3, versionInfoParcel, str, zzkVar, zzfgyVar.zzb, zzfgyVar.zza, this.zze.zzf, zzczyVar, zzfgtVar.zzaj ? this.zzh : null), true);
    }
}
