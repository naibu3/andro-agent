package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzfvx extends zzfwq {
    private int zza;
    private String zzb;
    private byte zzc;

    zzfvx() {
    }

    @Override // com.google.android.gms.internal.ads.zzfwq
    public final zzfwq zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfwq
    public final zzfwq zzb(int i) {
        this.zza = i;
        this.zzc = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfwq
    public final zzfwr zzc() {
        if (this.zzc == 1) {
            return new zzfvz(this.zza, this.zzb, null);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
