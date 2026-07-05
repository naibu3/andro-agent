package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public class zzade {
    protected final zzacy zza;
    protected final zzadd zzb;
    protected zzada zzc;
    private final int zzd;

    protected zzade(zzadb zzadbVar, zzadd zzaddVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.zzb = zzaddVar;
        this.zzd = i;
        this.zza = new zzacy(zzadbVar, j, 0L, j3, j4, j5, j6);
    }

    protected static final int zzf(zzadv zzadvVar, long j, zzaeq zzaeqVar) {
        if (j == zzadvVar.zzf()) {
            return 0;
        }
        zzaeqVar.zza = j;
        return 1;
    }

    protected static final boolean zzg(zzadv zzadvVar, long j) throws IOException {
        long jZzf = j - zzadvVar.zzf();
        if (jZzf < 0 || jZzf > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        ((zzadi) zzadvVar).zzo((int) jZzf, false);
        return true;
    }

    public final int zza(zzadv zzadvVar, zzaeq zzaeqVar) throws IOException {
        while (true) {
            zzada zzadaVar = this.zzc;
            zzeq.zzb(zzadaVar);
            long j = zzadaVar.zzf;
            long j2 = zzadaVar.zzg - j;
            int i = this.zzd;
            long j3 = zzadaVar.zzh;
            if (j2 <= i) {
                zzc(false, j);
                return zzf(zzadvVar, j, zzaeqVar);
            }
            if (!zzg(zzadvVar, j3)) {
                return zzf(zzadvVar, j3, zzaeqVar);
            }
            zzadvVar.zzj();
            zzadc zzadcVarZza = this.zzb.zza(zzadvVar, zzadaVar.zzb);
            int i2 = zzadcVarZza.zzb;
            if (i2 == -3) {
                zzc(false, j3);
                return zzf(zzadvVar, j3, zzaeqVar);
            }
            if (i2 == -2) {
                zzada.zzh(zzadaVar, zzadcVarZza.zzc, zzadcVarZza.zzd);
            } else {
                if (i2 != -1) {
                    zzg(zzadvVar, zzadcVarZza.zzd);
                    zzc(true, zzadcVarZza.zzd);
                    return zzf(zzadvVar, zzadcVarZza.zzd, zzaeqVar);
                }
                zzada.zzg(zzadaVar, zzadcVarZza.zzc, zzadcVarZza.zzd);
            }
        }
    }

    public final zzaet zzb() {
        return this.zza;
    }

    protected final void zzc(boolean z, long j) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j) {
        zzada zzadaVar = this.zzc;
        if (zzadaVar == null || zzadaVar.zza != j) {
            zzacy zzacyVar = this.zza;
            this.zzc = new zzada(j, zzacyVar.zzf(j), 0L, zzacyVar.zzc, zzacyVar.zzd, zzacyVar.zze, zzacyVar.zzf);
        }
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}
