package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzalb {
    private final zzalc zza = new zzalc();
    private final zzfu zzb = new zzfu(new byte[65025], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    zzalb() {
    }

    private final int zzf(int i) {
        int i2;
        int i3 = 0;
        this.zzd = 0;
        do {
            int i4 = this.zzd;
            int i5 = i + i4;
            zzalc zzalcVar = this.zza;
            if (i5 >= zzalcVar.zzc) {
                break;
            }
            this.zzd = i4 + 1;
            i2 = zzalcVar.zzf[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final zzfu zza() {
        return this.zzb;
    }

    public final zzalc zzb() {
        return this.zza;
    }

    public final void zzc() {
        this.zza.zza();
        this.zzb.zzH(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final void zzd() {
        zzfu zzfuVar = this.zzb;
        if (zzfuVar.zzM().length == 65025) {
            return;
        }
        zzfuVar.zzI(Arrays.copyOf(zzfuVar.zzM(), Math.max(65025, zzfuVar.zze())), this.zzb.zze());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zze(zzadv zzadvVar) throws IOException {
        if (this.zze) {
            this.zze = false;
            this.zzb.zzH(0);
        }
        while (true) {
            if (this.zze) {
                return true;
            }
            int i = this.zzc;
            if (i < 0) {
                if (!this.zza.zzc(zzadvVar, -1L) || !this.zza.zzb(zzadvVar, true)) {
                    break;
                }
                zzalc zzalcVar = this.zza;
                int iZzf = zzalcVar.zzd;
                if ((zzalcVar.zza & 1) == 1 && this.zzb.zze() == 0) {
                    iZzf += zzf(0);
                    i = this.zzd;
                } else {
                    i = 0;
                }
                if (!zzady.zze(zzadvVar, iZzf)) {
                    return false;
                }
                this.zzc = i;
            }
            int iZzf2 = zzf(i);
            int i2 = this.zzc + this.zzd;
            if (iZzf2 > 0) {
                zzfu zzfuVar = this.zzb;
                zzfuVar.zzE(zzfuVar.zze() + iZzf2);
                zzfu zzfuVar2 = this.zzb;
                if (!zzady.zzd(zzadvVar, zzfuVar2.zzM(), zzfuVar2.zze(), iZzf2)) {
                    return false;
                }
                zzfu zzfuVar3 = this.zzb;
                zzfuVar3.zzJ(zzfuVar3.zze() + iZzf2);
                this.zze = this.zza.zzf[i2 + (-1)] != 255;
            }
            if (i2 == this.zza.zzc) {
                i2 = -1;
            }
            this.zzc = i2;
        }
    }
}
