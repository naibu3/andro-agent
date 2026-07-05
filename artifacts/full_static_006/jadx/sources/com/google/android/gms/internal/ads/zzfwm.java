package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzfwm extends zzfvp {
    final /* synthetic */ zzfwn zza;
    private final zzfws zzb;

    zzfwm(zzfwn zzfwnVar, zzfws zzfwsVar) {
        this.zza = zzfwnVar;
        this.zzb = zzfwsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvq
    public final void zzb(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        zzfwq zzfwqVarZzc = zzfwr.zzc();
        zzfwqVarZzc.zzb(i);
        if (string != null) {
            zzfwqVarZzc.zza(string);
        }
        this.zzb.zza(zzfwqVarZzc.zzc());
        if (i == 8157) {
            this.zza.zzc();
        }
    }
}
