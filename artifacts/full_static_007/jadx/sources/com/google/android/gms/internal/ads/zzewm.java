package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzewm implements zzexv {
    private zzfvd zza;
    private zzfvd zzb;
    private boolean zzc;
    private boolean zzd;
    private final boolean zze = false;
    private final boolean zzf;

    public zzewm(zzfvd zzfvdVar, zzfvd zzfvdVar2, boolean z, boolean z2, boolean z3) {
        this.zza = zzfvdVar;
        this.zzb = zzfvdVar2;
        this.zzc = z;
        this.zzd = z2;
        this.zzf = z3;
    }

    public zzewm(boolean z) {
        this.zzf = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.google.android.gms.internal.ads.zzexv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.zze) {
            return;
        }
        Bundle bundleZza = zzfic.zza(bundle, "pii");
        if (!this.zzf) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcS)).booleanValue()) {
                if (this.zzf) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcU)).booleanValue()) {
                        if (this.zza.zzc()) {
                            bundleZza.putString("paidv1_id_android", this.zza.zzb());
                            bundleZza.putLong("paidv1_creation_time_android", this.zza.zza());
                        }
                    }
                }
            }
        }
        if (!this.zzf) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcT)).booleanValue()) {
                if (this.zzf) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcV)).booleanValue()) {
                        if (this.zzb.zzc()) {
                            bundleZza.putString("paidv2_id_android", this.zzb.zzb());
                            bundleZza.putLong("paidv2_creation_time_android", this.zzb.zza());
                        }
                        bundleZza.putBoolean("paidv2_pub_option_android", this.zzc);
                        bundleZza.putBoolean("paidv2_user_option_android", this.zzd);
                    }
                }
            }
        }
        if (bundleZza.isEmpty()) {
            return;
        }
        bundle.putBundle("pii", bundleZza);
    }
}
