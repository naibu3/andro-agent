package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzhds extends zzgzt {
    final zzhdw zza;
    zzgzv zzb = zzb();
    final /* synthetic */ zzhdy zzc;

    zzhds(zzhdy zzhdyVar) {
        this.zzc = zzhdyVar;
        this.zza = new zzhdw(zzhdyVar, null);
    }

    private final zzgzv zzb() {
        zzhdw zzhdwVar = this.zza;
        if (zzhdwVar.hasNext()) {
            return zzhdwVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final byte zza() {
        zzgzv zzgzvVar = this.zzb;
        if (zzgzvVar == null) {
            throw new NoSuchElementException();
        }
        byte bZza = zzgzvVar.zza();
        if (!this.zzb.hasNext()) {
            this.zzb = zzb();
        }
        return bZza;
    }
}
