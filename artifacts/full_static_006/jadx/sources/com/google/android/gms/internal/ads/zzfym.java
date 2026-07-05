package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzfym extends zzfyr {
    final /* synthetic */ zzfyn zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfym(zzfyn zzfynVar, zzfyt zzfytVar, CharSequence charSequence) {
        super(zzfytVar, charSequence);
        this.zza = zzfynVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyr
    final int zzc(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfyr
    final int zzd(int i) {
        CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        zzfyg.zzb(i, length, "index");
        while (i < length) {
            zzfyn zzfynVar = this.zza;
            if (zzfynVar.zza.zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
