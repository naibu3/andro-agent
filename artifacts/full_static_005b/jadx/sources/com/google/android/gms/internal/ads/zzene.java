package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzene implements zzehl {
    private final Context zza;
    private final zzctg zzb;
    private final zzbfk zzc;
    private final zzgge zzd;
    private final zzflt zze;

    public zzene(Context context, zzctg zzctgVar, zzflt zzfltVar, zzgge zzggeVar, zzbfk zzbfkVar) {
        this.zza = context;
        this.zzb = zzctgVar;
        this.zze = zzfltVar;
        this.zzd = zzggeVar;
        this.zzc = zzbfkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final ListenableFuture zza(zzfhf zzfhfVar, zzfgt zzfgtVar) {
        zzenc zzencVar = new zzenc(this, new View(this.zza), null, new zzcun() { // from class: com.google.android.gms.internal.ads.zzena
            @Override // com.google.android.gms.internal.ads.zzcun
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return null;
            }
        }, (zzfgu) zzfgtVar.zzv.get(0));
        zzcsg zzcsgVarZza = this.zzb.zza(new zzcvf(zzfhfVar, zzfgtVar, null), zzencVar);
        zzend zzendVarZzl = zzcsgVarZza.zzl();
        zzfgy zzfgyVar = zzfgtVar.zzt;
        final zzbff zzbffVar = new zzbff(zzendVarZzl, zzfgyVar.zzb, zzfgyVar.zza);
        zzfln zzflnVar = zzfln.CUSTOM_RENDER_SYN;
        return zzfld.zzd(new zzfkx() { // from class: com.google.android.gms.internal.ads.zzenb
            @Override // com.google.android.gms.internal.ads.zzfkx
            public final void zza() throws Exception {
                this.zza.zzc(zzbffVar);
            }
        }, this.zzd, zzflnVar, this.zze).zzb(zzfln.CUSTOM_RENDER_ACK).zzd(zzgft.zzh(zzcsgVarZza.zza())).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final boolean zzb(zzfhf zzfhfVar, zzfgt zzfgtVar) {
        zzfgy zzfgyVar;
        return (this.zzc == null || (zzfgyVar = zzfgtVar.zzt) == null || zzfgyVar.zza == null) ? false : true;
    }

    final /* synthetic */ void zzc(zzbff zzbffVar) throws Exception {
        this.zzc.zze(zzbffVar);
    }
}
