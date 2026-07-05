package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzhdu {
    private final ArrayDeque zza = new ArrayDeque();

    private zzhdu() {
    }

    static /* bridge */ /* synthetic */ zzhac zza(zzhdu zzhduVar, zzhac zzhacVar, zzhac zzhacVar2) {
        zzhduVar.zzb(zzhacVar);
        zzhduVar.zzb(zzhacVar2);
        zzhac zzhdyVar = (zzhac) zzhduVar.zza.pop();
        while (!zzhduVar.zza.isEmpty()) {
            zzhdyVar = new zzhdy((zzhac) zzhduVar.zza.pop(), zzhdyVar);
        }
        return zzhdyVar;
    }

    private final void zzb(zzhac zzhacVar) {
        zzhdx zzhdxVar;
        if (!zzhacVar.zzh()) {
            if (!(zzhacVar instanceof zzhdy)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(zzhacVar.getClass()))));
            }
            zzhdy zzhdyVar = (zzhdy) zzhacVar;
            zzb(zzhdyVar.zzd);
            zzb(zzhdyVar.zze);
            return;
        }
        int iZzc = zzc(zzhacVar.zzd());
        ArrayDeque arrayDeque = this.zza;
        int iZzc2 = zzhdy.zzc(iZzc + 1);
        if (arrayDeque.isEmpty() || ((zzhac) this.zza.peek()).zzd() >= iZzc2) {
            this.zza.push(zzhacVar);
            return;
        }
        int iZzc3 = zzhdy.zzc(iZzc);
        zzhac zzhdyVar2 = (zzhac) this.zza.pop();
        while (true) {
            zzhdxVar = null;
            if (this.zza.isEmpty() || ((zzhac) this.zza.peek()).zzd() >= iZzc3) {
                break;
            } else {
                zzhdyVar2 = new zzhdy((zzhac) this.zza.pop(), zzhdyVar2);
            }
        }
        zzhdy zzhdyVar3 = new zzhdy(zzhdyVar2, zzhacVar);
        while (!this.zza.isEmpty()) {
            int iZzc4 = zzc(zzhdyVar3.zzd()) + 1;
            ArrayDeque arrayDeque2 = this.zza;
            if (((zzhac) arrayDeque2.peek()).zzd() >= zzhdy.zzc(iZzc4)) {
                break;
            } else {
                zzhdyVar3 = new zzhdy((zzhac) this.zza.pop(), zzhdyVar3);
            }
        }
        this.zza.push(zzhdyVar3);
    }

    private static final int zzc(int i) {
        int iBinarySearch = Arrays.binarySearch(zzhdy.zza, i);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }

    /* synthetic */ zzhdu(zzhdt zzhdtVar) {
    }
}
