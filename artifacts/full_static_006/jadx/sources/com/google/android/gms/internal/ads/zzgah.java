package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
abstract class zzgah implements Iterator {
    int zzb;
    int zzc;
    int zzd = -1;
    final /* synthetic */ zzgal zze;

    /* synthetic */ zzgah(zzgal zzgalVar, zzgag zzgagVar) {
        this.zze = zzgalVar;
        this.zzb = zzgalVar.zzf;
        this.zzc = zzgalVar.zze();
    }

    private final void zzb() {
        if (this.zze.zzf != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.zzc;
        this.zzd = i;
        Object objZza = zza(i);
        this.zzc = this.zze.zzf(this.zzc);
        return objZza;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzfyg.zzk(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i = this.zzd;
        zzgal zzgalVar = this.zze;
        zzgalVar.remove(zzgal.zzg(zzgalVar, i));
        this.zzc--;
        this.zzd = -1;
    }

    abstract Object zza(int i);
}
