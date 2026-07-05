package com.google.android.gms.internal.ads;

import androidx.core.internal.view.SupportMenu;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzzv {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzzo[] zzd = new zzzo[100];

    public zzzv(boolean z, int i) {
    }

    public final synchronized int zza() {
        return this.zzb * 65536;
    }

    public final synchronized zzzo zzb() {
        zzzo zzzoVar;
        this.zzb++;
        int i = this.zzc;
        if (i > 0) {
            zzzo[] zzzoVarArr = this.zzd;
            int i2 = i - 1;
            this.zzc = i2;
            zzzoVar = zzzoVarArr[i2];
            if (zzzoVar == null) {
                throw null;
            }
            zzzoVarArr[i2] = null;
        } else {
            zzzoVar = new zzzo(new byte[65536], 0);
            int i3 = this.zzb;
            zzzo[] zzzoVarArr2 = this.zzd;
            int length = zzzoVarArr2.length;
            if (i3 > length) {
                this.zzd = (zzzo[]) Arrays.copyOf(zzzoVarArr2, length + length);
                return zzzoVar;
            }
        }
        return zzzoVar;
    }

    public final synchronized void zzc(zzzo zzzoVar) {
        zzzo[] zzzoVarArr = this.zzd;
        int i = this.zzc;
        this.zzc = i + 1;
        zzzoVarArr[i] = zzzoVar;
        this.zzb--;
        notifyAll();
    }

    public final synchronized void zzd(zzzp zzzpVar) {
        while (zzzpVar != null) {
            zzzo[] zzzoVarArr = this.zzd;
            int i = this.zzc;
            this.zzc = i + 1;
            zzzoVarArr[i] = zzzpVar.zzc();
            this.zzb--;
            zzzpVar = zzzpVar.zzd();
        }
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i) {
        int i2 = this.zza;
        this.zza = i;
        if (i < i2) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int i = this.zza;
        int i2 = zzgd.zza;
        int iMax = Math.max(0, ((i + SupportMenu.USER_MASK) / 65536) - this.zzb);
        int i3 = this.zzc;
        if (iMax >= i3) {
            return;
        }
        Arrays.fill(this.zzd, iMax, i3, (Object) null);
        this.zzc = iMax;
    }
}
