package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzuq implements zzwg {
    private final zzaea zza;
    private zzadu zzb;
    private zzadv zzc;

    public zzuq(zzaea zzaeaVar) {
        this.zza = zzaeaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final long zzb() {
        zzadv zzadvVar = this.zzc;
        if (zzadvVar != null) {
            return zzadvVar.zzf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final void zzc() {
        zzadu zzaduVar = this.zzb;
        if (zzaduVar != null && (zzaduVar instanceof zzajg)) {
            ((zzajg) zzaduVar).zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final void zzd(zzu zzuVar, Uri uri, Map map, long j, long j2, zzadx zzadxVar) throws IOException {
        zzadi zzadiVar = new zzadi(zzuVar, j, j2);
        this.zzc = zzadiVar;
        if (this.zzb != null) {
            return;
        }
        zzadu[] zzaduVarArrZza = this.zza.zza(uri, map);
        int length = zzaduVarArrZza.length;
        zzgaz zzgazVarZzi = zzgbc.zzi(length);
        int i = 0;
        boolean z = true;
        if (length == 1) {
            this.zzb = zzaduVarArrZza[0];
        } else {
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                zzadu zzaduVar = zzaduVarArrZza[i2];
                try {
                } catch (EOFException unused) {
                    if (this.zzb != null || zzadiVar.zzf() == j) {
                    }
                } catch (Throwable th) {
                    zzeq.zzf(this.zzb != null || zzadiVar.zzf() == j);
                    zzadiVar.zzj();
                    throw th;
                }
                if (zzaduVar.zzf(zzadiVar)) {
                    this.zzb = zzaduVar;
                    if (zzaduVar == null && zzadiVar.zzf() != j) {
                        z = false;
                    }
                    zzeq.zzf(z);
                    zzadiVar.zzj();
                } else {
                    zzgazVarZzi.zzh(zzaduVar.zzc());
                    boolean z2 = this.zzb != null || zzadiVar.zzf() == j;
                    zzeq.zzf(z2);
                    zzadiVar.zzj();
                    i2++;
                }
            }
            if (this.zzb == null) {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int length2 = zzaduVarArrZza.length;
                    if (i >= length2) {
                        throw new zzxs("None of the available extractors (" + sb.toString() + ") could read the stream.", uri, zzgazVarZzi.zzi());
                    }
                    sb.append(zzaduVarArrZza[i].getClass().getSimpleName());
                    if (i < length2 - 1) {
                        sb.append(", ");
                    }
                    i++;
                }
            }
        }
        this.zzb.zzd(zzadxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final void zze() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final int zza(zzaeq zzaeqVar) throws IOException {
        zzadu zzaduVar = this.zzb;
        zzaduVar.getClass();
        zzadv zzadvVar = this.zzc;
        zzadvVar.getClass();
        return zzaduVar.zzb(zzadvVar, zzaeqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final void zzf(long j, long j2) {
        zzadu zzaduVar = this.zzb;
        zzaduVar.getClass();
        zzaduVar.zze(j, j2);
    }
}
