package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzcls implements zzfdh {
    private final zzcla zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzq zzd;

    /* synthetic */ zzcls(zzcla zzclaVar, zzclr zzclrVar) {
        this.zza = zzclaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdh
    public final /* synthetic */ zzfdh zza(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        zzqVar.getClass();
        this.zzd = zzqVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfdh
    public final /* synthetic */ zzfdh zzb(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfdh
    public final /* synthetic */ zzfdh zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfdh
    public final zzfdi zzd() {
        zzhkx.zzc(this.zzb, Context.class);
        zzhkx.zzc(this.zzc, String.class);
        zzhkx.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzq.class);
        return new zzclu(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
