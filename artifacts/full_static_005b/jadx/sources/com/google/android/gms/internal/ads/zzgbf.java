package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzgbf implements Map, Serializable {

    @CheckForNull
    private transient zzgbh zza;

    @CheckForNull
    private transient zzgbh zzb;

    @CheckForNull
    private transient zzgax zzc;

    zzgbf() {
    }

    public static zzgbf zzc(Map map) {
        Set setEntrySet = map.entrySet();
        zzgbe zzgbeVar = new zzgbe(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        zzgbeVar.zzb(setEntrySet);
        return zzgbeVar.zzc();
    }

    public static zzgbf zzd() {
        return zzgct.zza;
    }

    public static zzgbf zze(Object obj, Object obj2) {
        zzfzz.zzb("dialog_not_shown_reason", obj2);
        return zzgct.zzj(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        return zzgbz.zzb(this, obj);
    }

    @Override // java.util.Map
    @CheckForNull
    public abstract Object get(@CheckForNull Object obj);

    @Override // java.util.Map
    @CheckForNull
    public final Object getOrDefault(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzgde.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final Object remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzfzz.zza(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    abstract zzgax zza();

    @Override // java.util.Map
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzgax values() {
        zzgax zzgaxVar = this.zzc;
        if (zzgaxVar != null) {
            return zzgaxVar;
        }
        zzgax zzgaxVarZza = zza();
        this.zzc = zzgaxVarZza;
        return zzgaxVarZza;
    }

    abstract zzgbh zzf();

    abstract zzgbh zzg();

    @Override // java.util.Map
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzgbh entrySet() {
        zzgbh zzgbhVar = this.zza;
        if (zzgbhVar != null) {
            return zzgbhVar;
        }
        zzgbh zzgbhVarZzf = zzf();
        this.zza = zzgbhVarZzf;
        return zzgbhVarZzf;
    }

    @Override // java.util.Map
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final zzgbh keySet() {
        zzgbh zzgbhVar = this.zzb;
        if (zzgbhVar != null) {
            return zzgbhVar;
        }
        zzgbh zzgbhVarZzg = zzg();
        this.zzb = zzgbhVarZzg;
        return zzgbhVarZzg;
    }
}
