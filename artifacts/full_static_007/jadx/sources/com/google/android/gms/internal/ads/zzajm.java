package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzajm extends zzajo {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzajm(int i, long j) {
        super(i);
        this.zza = j;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    public final String toString() {
        List list = this.zzb;
        return zzf(this.zzd) + " leaves: " + Arrays.toString(list.toArray()) + " containers: " + Arrays.toString(this.zzc.toArray());
    }

    public final zzajm zza(int i) {
        int size = this.zzc.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzajm zzajmVar = (zzajm) this.zzc.get(i2);
            if (zzajmVar.zzd == i) {
                return zzajmVar;
            }
        }
        return null;
    }

    public final zzajn zzb(int i) {
        int size = this.zzb.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzajn zzajnVar = (zzajn) this.zzb.get(i2);
            if (zzajnVar.zzd == i) {
                return zzajnVar;
            }
        }
        return null;
    }

    public final void zzc(zzajm zzajmVar) {
        this.zzc.add(zzajmVar);
    }

    public final void zzd(zzajn zzajnVar) {
        this.zzb.add(zzajnVar);
    }
}
