package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzemh implements zzdjp {
    private final Context zza;
    private final zzdsd zzb;
    private final zzfho zzc;
    private final VersionInfoParcel zzd;
    private final zzfgt zze;
    private final ListenableFuture zzf;
    private final zzchd zzg;
    private final zzbls zzh;
    private final boolean zzi;
    private final zzegk zzj;

    zzemh(Context context, zzdsd zzdsdVar, zzfho zzfhoVar, VersionInfoParcel versionInfoParcel, zzfgt zzfgtVar, ListenableFuture listenableFuture, zzchd zzchdVar, zzbls zzblsVar, boolean z, zzegk zzegkVar) {
        this.zza = context;
        this.zzb = zzdsdVar;
        this.zzc = zzfhoVar;
        this.zzd = versionInfoParcel;
        this.zze = zzfgtVar;
        this.zzf = listenableFuture;
        this.zzg = zzchdVar;
        this.zzh = zzblsVar;
        this.zzi = z;
        this.zzj = zzegkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    @Override // com.google.android.gms.internal.ads.zzdjp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(boolean z, Context context, zzczy zzczyVar) throws NumberFormatException {
        zzchd zzchdVar;
        zzchd zzchdVar2;
        zzdri zzdriVar = (zzdri) zzgft.zzq(this.zzf);
        try {
            zzfgt zzfgtVar = this.zze;
            if (this.zzg.zzaG()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaN)).booleanValue()) {
                    final zzchd zzchdVarZza = this.zzb.zza(this.zzc.zze, null, null);
                    zzbmh.zzb(zzchdVarZza, zzdriVar.zzg());
                    final zzdsh zzdshVar = new zzdsh();
                    zzdshVar.zza(this.zza, (View) zzchdVarZza);
                    zzdriVar.zzl().zzi(zzchdVarZza, true, this.zzi ? this.zzh : null);
                    zzchdVarZza.zzN().zzB(new zzcit() { // from class: com.google.android.gms.internal.ads.zzemf
                        @Override // com.google.android.gms.internal.ads.zzcit
                        public final void zza(boolean z2, int i, String str, String str2) {
                            zzdshVar.zzb();
                            zzchd zzchdVar3 = zzchdVarZza;
                            zzchdVar3.zzab();
                            zzchdVar3.zzN().zzr();
                        }
                    });
                    zzciv zzcivVarZzN = zzchdVarZza.zzN();
                    Objects.requireNonNull(zzchdVarZza);
                    zzcivVarZzN.zzH(new zzciu() { // from class: com.google.android.gms.internal.ads.zzemg
                        @Override // com.google.android.gms.internal.ads.zzciu
                        public final void zza() {
                            zzchdVarZza.zzaa();
                        }
                    });
                    zzfgy zzfgyVar = zzfgtVar.zzt;
                    zzchdVarZza.zzae(zzfgyVar.zzb, zzfgyVar.zza, null);
                    zzchdVar = zzchdVarZza;
                    zzchdVar.zzaq(true);
                    boolean zZze = !this.zzi ? this.zzh.zze(false) : false;
                    com.google.android.gms.ads.internal.zzu.zzp();
                    Context context2 = this.zza;
                    boolean z2 = this.zzi;
                    boolean zZzI = com.google.android.gms.ads.internal.util.zzt.zzI(context2);
                    boolean zZzd = !z2 ? this.zzh.zzd() : false;
                    float fZza = !this.zzi ? this.zzh.zza() : 0.0f;
                    zzfgt zzfgtVar2 = this.zze;
                    com.google.android.gms.ads.internal.zzk zzkVar = new com.google.android.gms.ads.internal.zzk(zZze, zZzI, zZzd, fZza, -1, z, zzfgtVar2.zzP, zzfgtVar2.zzQ);
                    if (zzczyVar != null) {
                        zzczyVar.zzf();
                    }
                    com.google.android.gms.ads.internal.zzu.zzi();
                    zzdje zzdjeVarZzh = zzdriVar.zzh();
                    zzfgt zzfgtVar3 = this.zze;
                    VersionInfoParcel versionInfoParcel = this.zzd;
                    int i = zzfgtVar3.zzR;
                    String str = zzfgtVar3.zzC;
                    zzfgy zzfgyVar2 = zzfgtVar3.zzt;
                    String str2 = zzfgyVar2.zzb;
                    String str3 = zzfgyVar2.zza;
                    zzfho zzfhoVar = this.zzc;
                    com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzdjeVarZzh, (com.google.android.gms.ads.internal.overlay.zzaa) null, zzchdVar, i, versionInfoParcel, str, zzkVar, str2, str3, zzfhoVar.zzf, zzczyVar, zzfgtVar3.zzaj ? this.zzj : null), true);
                }
                zzchdVar2 = this.zzg;
            } else {
                zzchdVar2 = this.zzg;
            }
            zzchdVar = zzchdVar2;
            zzchdVar.zzaq(true);
            if (!this.zzi) {
            }
            com.google.android.gms.ads.internal.zzu.zzp();
            Context context22 = this.zza;
            boolean z22 = this.zzi;
            boolean zZzI2 = com.google.android.gms.ads.internal.util.zzt.zzI(context22);
            if (!z22) {
            }
            float fZza2 = !this.zzi ? this.zzh.zza() : 0.0f;
            zzfgt zzfgtVar22 = this.zze;
            com.google.android.gms.ads.internal.zzk zzkVar2 = new com.google.android.gms.ads.internal.zzk(zZze, zZzI2, zZzd, fZza2, -1, z, zzfgtVar22.zzP, zzfgtVar22.zzQ);
            if (zzczyVar != null) {
            }
            com.google.android.gms.ads.internal.zzu.zzi();
            zzdje zzdjeVarZzh2 = zzdriVar.zzh();
            zzfgt zzfgtVar32 = this.zze;
            VersionInfoParcel versionInfoParcel2 = this.zzd;
            int i2 = zzfgtVar32.zzR;
            String str4 = zzfgtVar32.zzC;
            zzfgy zzfgyVar22 = zzfgtVar32.zzt;
            String str22 = zzfgyVar22.zzb;
            String str32 = zzfgyVar22.zza;
            zzfho zzfhoVar2 = this.zzc;
            if (zzfgtVar32.zzaj) {
            }
            com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzdjeVarZzh2, (com.google.android.gms.ads.internal.overlay.zzaa) null, zzchdVar, i2, versionInfoParcel2, str4, zzkVar2, str22, str32, zzfhoVar2.zzf, zzczyVar, zzfgtVar32.zzaj ? this.zzj : null), true);
        } catch (zzchp e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
        }
    }
}
