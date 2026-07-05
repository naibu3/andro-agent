package com.google.android.gms.internal.ads;

import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzaky extends zzali {
    private zzaeg zza;
    private zzakx zzb;

    zzaky() {
    }

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzali
    protected final long zza(zzfu zzfuVar) {
        if (!zzd(zzfuVar.zzM())) {
            return -1L;
        }
        int i = (zzfuVar.zzM()[2] & 255) >> 4;
        if (i == 6) {
            zzfuVar.zzL(4);
            zzfuVar.zzw();
        } else if (i == 7) {
            i = 7;
            zzfuVar.zzL(4);
            zzfuVar.zzw();
        }
        int iZza = zzaec.zza(zzfuVar, i);
        zzfuVar.zzK(0);
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzali
    protected final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzali
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzfu zzfuVar, long j, zzalf zzalfVar) {
        byte[] bArrZzM = zzfuVar.zzM();
        zzaeg zzaegVar = this.zza;
        if (zzaegVar == null) {
            zzaeg zzaegVar2 = new zzaeg(bArrZzM, 17);
            this.zza = zzaegVar2;
            zzalfVar.zza = zzaegVar2.zzc(Arrays.copyOfRange(bArrZzM, 9, zzfuVar.zze()), null);
            return true;
        }
        if ((bArrZzM[0] & 127) == 3) {
            zzaef zzaefVarZzb = zzaed.zzb(zzfuVar);
            zzaeg zzaegVarZzf = zzaegVar.zzf(zzaefVarZzb);
            this.zza = zzaegVarZzf;
            this.zzb = new zzakx(zzaegVarZzf, zzaefVarZzb);
            return true;
        }
        if (!zzd(bArrZzM)) {
            return true;
        }
        zzakx zzakxVar = this.zzb;
        if (zzakxVar != null) {
            zzakxVar.zza(j);
            zzalfVar.zzb = this.zzb;
        }
        zzalfVar.zza.getClass();
        return false;
    }
}
