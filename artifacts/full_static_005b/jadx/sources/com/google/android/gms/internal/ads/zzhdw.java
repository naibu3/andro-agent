package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzhdw implements Iterator {
    private final ArrayDeque zza;
    private zzgzx zzb;

    /* synthetic */ zzhdw(zzhac zzhacVar, zzhdv zzhdvVar) {
        if (!(zzhacVar instanceof zzhdy)) {
            this.zza = null;
            this.zzb = (zzgzx) zzhacVar;
            return;
        }
        zzhdy zzhdyVar = (zzhdy) zzhacVar;
        ArrayDeque arrayDeque = new ArrayDeque(zzhdyVar.zzf());
        this.zza = arrayDeque;
        arrayDeque.push(zzhdyVar);
        this.zzb = zzb(zzhdyVar.zzd);
    }

    private final zzgzx zzb(zzhac zzhacVar) {
        while (zzhacVar instanceof zzhdy) {
            zzhdy zzhdyVar = (zzhdy) zzhacVar;
            this.zza.push(zzhdyVar);
            zzhacVar = zzhdyVar.zzd;
        }
        return (zzgzx) zzhacVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzgzx next() {
        zzgzx zzgzxVarZzb;
        zzgzx zzgzxVar = this.zzb;
        if (zzgzxVar == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zzgzxVarZzb = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzgzxVarZzb = zzb(((zzhdy) this.zza.pop()).zze);
        } while (zzgzxVarZzb.zzd() == 0);
        this.zzb = zzgzxVarZzb;
        return zzgzxVar;
    }
}
