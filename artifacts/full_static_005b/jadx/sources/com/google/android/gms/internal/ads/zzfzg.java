package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzfzg extends zzgbv {
    final /* synthetic */ zzfzi zza;

    zzfzg(zzfzi zzfziVar) {
        this.zza = zzfziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgbv, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return zzgab.zza(this.zza.zza.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzfzh(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgbv, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) Objects.requireNonNull((Map.Entry) obj);
        zzfzi zzfziVar = this.zza;
        zzfzv.zzo(zzfziVar.zzb, entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgbv
    final Map zza() {
        return this.zza;
    }
}
