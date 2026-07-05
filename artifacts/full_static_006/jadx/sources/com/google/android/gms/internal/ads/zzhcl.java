package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzhcl extends zzgzl implements RandomAccess, zzhcm {

    @Deprecated
    public static final zzhcm zza;
    private static final zzhcl zzb;
    private final List zzc;

    static {
        zzhcl zzhclVar = new zzhcl(false);
        zzb = zzhclVar;
        zza = zzhclVar;
    }

    public zzhcl() {
        this(10);
    }

    private static String zzj(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzhac ? ((zzhac) obj).zzx(zzhcb.zzb) : zzhcb.zzd((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        zzdJ();
        this.zzc.add(i, (String) obj);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        zzdJ();
        if (collection instanceof zzhcm) {
            collection = ((zzhcm) collection).zzh();
        }
        boolean zAddAll = this.zzc.addAll(i, collection);
        this.modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzdJ();
        this.zzc.clear();
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzdJ();
        Object objRemove = this.zzc.remove(i);
        this.modCount++;
        return zzj(objRemove);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        zzdJ();
        return zzj(this.zzc.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    public final zzhcm zzd() {
        return zzc() ? new zzhev(this) : this;
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    public final Object zze(int i) {
        return this.zzc.get(i);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final /* bridge */ /* synthetic */ zzhca zzf(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.zzc);
        return new zzhcl(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        Object obj = this.zzc.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzhac) {
            zzhac zzhacVar = (zzhac) obj;
            String strZzx = zzhacVar.zzx(zzhcb.zzb);
            if (zzhacVar.zzp()) {
                this.zzc.set(i, strZzx);
            }
            return strZzx;
        }
        byte[] bArr = (byte[]) obj;
        String strZzd = zzhcb.zzd(bArr);
        if (zzhff.zzi(bArr)) {
            this.zzc.set(i, strZzd);
        }
        return strZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    public final void zzi(zzhac zzhacVar) {
        zzdJ();
        this.zzc.add(zzhacVar);
        this.modCount++;
    }

    public zzhcl(int i) {
        ArrayList arrayList = new ArrayList(i);
        super(true);
        this.zzc = arrayList;
    }

    private zzhcl(ArrayList arrayList) {
        super(true);
        this.zzc = arrayList;
    }

    private zzhcl(boolean z) {
        super(false);
        this.zzc = Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
