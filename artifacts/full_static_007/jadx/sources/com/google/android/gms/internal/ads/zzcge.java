package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzcge implements zzhb {
    private final zzhb zza;
    private final long zzb;
    private final zzhb zzc;
    private long zzd;
    private Uri zze;

    zzcge(zzhb zzhbVar, int i, zzhb zzhbVar2) {
        this.zza = zzhbVar;
        this.zzb = i;
        this.zzc = zzhbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.zzd;
        long j2 = this.zzb;
        if (j < j2) {
            int iZza = this.zza.zza(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.zzd + iZza;
            this.zzd = j3;
            i3 = iZza;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < this.zzb) {
            return i3;
        }
        int iZza2 = this.zzc.zza(bArr, i + i3, i2 - i3);
        int i4 = i3 + iZza2;
        this.zzd += iZza2;
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhh zzhhVar) throws IOException {
        zzhh zzhhVar2;
        this.zze = zzhhVar.zza;
        long j = zzhhVar.zze;
        long j2 = this.zzb;
        zzhh zzhhVar3 = null;
        if (j >= j2) {
            zzhhVar2 = null;
        } else {
            long j3 = zzhhVar.zzf;
            long jMin = j2 - j;
            if (j3 != -1) {
                jMin = Math.min(j3, jMin);
            }
            zzhhVar2 = new zzhh(zzhhVar.zza, j, jMin, null);
        }
        long j4 = zzhhVar.zzf;
        if (j4 == -1 || zzhhVar.zze + j4 > this.zzb) {
            long jMax = Math.max(this.zzb, zzhhVar.zze);
            long j5 = zzhhVar.zzf;
            zzhhVar3 = new zzhh(zzhhVar.zza, jMax, j5 != -1 ? Math.min(j5, (zzhhVar.zze + j5) - this.zzb) : -1L, null);
        }
        long jZzb = zzhhVar2 != null ? this.zza.zzb(zzhhVar2) : 0L;
        long jZzb2 = zzhhVar3 != null ? this.zzc.zzb(zzhhVar3) : 0L;
        this.zzd = zzhhVar.zze;
        if (jZzb == -1 || jZzb2 == -1) {
            return -1L;
        }
        return jZzb + jZzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Map zze() {
        return zzgbf.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzf(zzie zzieVar) {
    }
}
