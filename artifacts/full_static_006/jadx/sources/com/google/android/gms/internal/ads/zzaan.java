package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzaan {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzaaj
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((zzaam) obj).zza - ((zzaam) obj2).zza;
        }
    };
    private static final Comparator zzb = new Comparator() { // from class: com.google.android.gms.internal.ads.zzaak
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((zzaam) obj).zzc, ((zzaam) obj2).zzc);
        }
    };
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzaam[] zzd = new zzaam[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzaan(int i) {
    }

    public final float zza(float f) {
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f2 = this.zzg;
        int i = 0;
        for (int i2 = 0; i2 < this.zzc.size(); i2++) {
            float f3 = 0.5f * f2;
            zzaam zzaamVar = (zzaam) this.zzc.get(i2);
            i += zzaamVar.zzb;
            if (i >= f3) {
                return zzaamVar.zzc;
            }
        }
        if (this.zzc.isEmpty()) {
            return Float.NaN;
        }
        return ((zzaam) this.zzc.get(r6.size() - 1)).zzc;
    }

    public final void zzb(int i, float f) {
        zzaam zzaamVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i2 = this.zzh;
        if (i2 > 0) {
            zzaam[] zzaamVarArr = this.zzd;
            int i3 = i2 - 1;
            this.zzh = i3;
            zzaamVar = zzaamVarArr[i3];
        } else {
            zzaamVar = new zzaam(null);
        }
        int i4 = this.zzf;
        this.zzf = i4 + 1;
        zzaamVar.zza = i4;
        zzaamVar.zzb = i;
        zzaamVar.zzc = f;
        this.zzc.add(zzaamVar);
        this.zzg += i;
        while (true) {
            int i5 = this.zzg;
            if (i5 <= 2000) {
                return;
            }
            int i6 = i5 - 2000;
            zzaam zzaamVar2 = (zzaam) this.zzc.get(0);
            int i7 = zzaamVar2.zzb;
            if (i7 <= i6) {
                this.zzg -= i7;
                this.zzc.remove(0);
                int i8 = this.zzh;
                if (i8 < 5) {
                    zzaam[] zzaamVarArr2 = this.zzd;
                    this.zzh = i8 + 1;
                    zzaamVarArr2[i8] = zzaamVar2;
                }
            } else {
                zzaamVar2.zzb = i7 - i6;
                this.zzg -= i6;
            }
        }
    }

    public final void zzc() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }
}
