package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzgaf extends AbstractSet {
    final /* synthetic */ zzgal zza;

    zzgaf(zzgal zzgalVar) {
        this.zza = zzgalVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        Map mapZzl = this.zza.zzl();
        if (mapZzl != null) {
            return mapZzl.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iZzw = this.zza.zzw(entry.getKey());
            if (iZzw != -1 && zzfya.zza(zzgal.zzj(this.zza, iZzw), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzgal zzgalVar = this.zza;
        Map mapZzl = zzgalVar.zzl();
        return mapZzl != null ? mapZzl.entrySet().iterator() : new zzgad(zzgalVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        Map mapZzl = this.zza.zzl();
        if (mapZzl != null) {
            return mapZzl.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        zzgal zzgalVar = this.zza;
        if (zzgalVar.zzr()) {
            return false;
        }
        int iZzv = zzgalVar.zzv();
        Object key = entry.getKey();
        Object value = entry.getValue();
        zzgal zzgalVar2 = this.zza;
        int iZzb = zzgam.zzb(key, value, iZzv, Objects.requireNonNull(zzgalVar2.zze), zzgalVar2.zzA(), zzgalVar2.zzB(), zzgalVar2.zzC());
        if (iZzb == -1) {
            return false;
        }
        this.zza.zzq(iZzb, iZzv);
        zzgal zzgalVar3 = this.zza;
        zzgalVar3.zzg--;
        this.zza.zzo();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
