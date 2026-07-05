package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzmz {
    private final zzah zza;
    private final SparseArray zzb;

    public zzmz(zzah zzahVar, SparseArray sparseArray) {
        this.zza = zzahVar;
        SparseArray sparseArray2 = new SparseArray(zzahVar.zzb());
        for (int i = 0; i < zzahVar.zzb(); i++) {
            int iZza = zzahVar.zza(i);
            zzmy zzmyVar = (zzmy) sparseArray.get(iZza);
            zzmyVar.getClass();
            sparseArray2.append(iZza, zzmyVar);
        }
        this.zzb = sparseArray2;
    }

    public final int zza(int i) {
        return this.zza.zza(i);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzmy zzc(int i) {
        zzmy zzmyVar = (zzmy) this.zzb.get(i);
        zzmyVar.getClass();
        return zzmyVar;
    }

    public final boolean zzd(int i) {
        return this.zza.zzc(i);
    }
}
