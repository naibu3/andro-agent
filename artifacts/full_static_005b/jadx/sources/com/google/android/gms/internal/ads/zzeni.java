package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzeni implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ zzccn zza;
    final /* synthetic */ zzfhf zzb;
    final /* synthetic */ zzfgt zzc;
    final /* synthetic */ zzeno zzd;
    final /* synthetic */ zzenj zze;

    zzeni(zzenj zzenjVar, zzccn zzccnVar, zzfhf zzfhfVar, zzfgt zzfgtVar, zzeno zzenoVar) {
        this.zza = zzccnVar;
        this.zzb = zzfhfVar;
        this.zzc = zzfgtVar;
        this.zzd = zzenoVar;
        this.zze = zzenjVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(View view) {
        this.zza.zzc(this.zze.zzd.zza(this.zzb, this.zzc, view, this.zzd));
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
    }
}
