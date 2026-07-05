package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzale extends zzali {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    zzale() {
    }

    public static boolean zzd(zzfu zzfuVar) {
        return zzk(zzfuVar, zza);
    }

    private static boolean zzk(zzfu zzfuVar, byte[] bArr) {
        if (zzfuVar.zzb() < 8) {
            return false;
        }
        int iZzd = zzfuVar.zzd();
        byte[] bArr2 = new byte[8];
        zzfuVar.zzG(bArr2, 0, 8);
        zzfuVar.zzK(iZzd);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzali
    protected final long zza(zzfu zzfuVar) {
        return zzg(zzaep.zzd(zzfuVar.zzM()));
    }

    @Override // com.google.android.gms.internal.ads.zzali
    protected final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzali
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzfu zzfuVar, long j, zzalf zzalfVar) throws zzch {
        if (zzk(zzfuVar, zza)) {
            byte[] bArrCopyOf = Arrays.copyOf(zzfuVar.zzM(), zzfuVar.zze());
            int i = bArrCopyOf[9] & 255;
            List listZze = zzaep.zze(bArrCopyOf);
            if (zzalfVar.zza == null) {
                zzal zzalVar = new zzal();
                zzalVar.zzX("audio/opus");
                zzalVar.zzy(i);
                zzalVar.zzY(48000);
                zzalVar.zzL(listZze);
                zzalfVar.zza = zzalVar.zzad();
                return true;
            }
        } else {
            if (!zzk(zzfuVar, zzb)) {
                zzeq.zzb(zzalfVar.zza);
                return false;
            }
            zzeq.zzb(zzalfVar.zza);
            if (!this.zzc) {
                this.zzc = true;
                zzfuVar.zzL(8);
                zzcd zzcdVarZzb = zzafg.zzb(zzgbc.zzl(zzafg.zzc(zzfuVar, false, false).zzb));
                if (zzcdVarZzb != null) {
                    zzal zzalVarZzb = zzalfVar.zza.zzb();
                    zzalVarZzb.zzQ(zzcdVarZzb.zzd(zzalfVar.zza.zzl));
                    zzalfVar.zza = zzalVarZzb.zzad();
                }
            }
        }
        return true;
    }
}
