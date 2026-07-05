package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzfyo extends zzfyr {
    final /* synthetic */ zzfyp zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfyo(zzfyp zzfypVar, zzfyt zzfytVar, CharSequence charSequence) {
        super(zzfytVar, charSequence);
        this.zza = zzfypVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyr
    public final int zzc(int i) {
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzfyr
    public final int zzd(int i) {
        int i2 = i + 4000;
        if (i2 < this.zzb.length()) {
            return i2;
        }
        return -1;
    }
}
