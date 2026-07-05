package com.google.android.gms.internal.ads;

import androidx.core.view.InputDeviceCompat;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzapc implements zzapp {
    private final zzapb zza;
    private final zzfu zzb = new zzfu(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzapc(zzapb zzapbVar) {
        this.zza = zzapbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapp
    public final void zza(zzfu zzfuVar, int i) {
        int i2 = i & 1;
        int iZzd = i2 != 0 ? zzfuVar.zzd() + zzfuVar.zzm() : -1;
        if (this.zzf) {
            if (i2 == 0) {
                return;
            }
            this.zzf = false;
            zzfuVar.zzK(iZzd);
            this.zzd = 0;
        }
        while (zzfuVar.zzb() > 0) {
            int i3 = this.zzd;
            if (i3 < 3) {
                if (i3 == 0) {
                    int iZzm = zzfuVar.zzm();
                    zzfuVar.zzK(zzfuVar.zzd() - 1);
                    if (iZzm == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int iMin = Math.min(zzfuVar.zzb(), 3 - this.zzd);
                zzfuVar.zzG(this.zzb.zzM(), this.zzd, iMin);
                int i4 = this.zzd + iMin;
                this.zzd = i4;
                if (i4 == 3) {
                    this.zzb.zzK(0);
                    this.zzb.zzJ(3);
                    this.zzb.zzL(1);
                    zzfu zzfuVar2 = this.zzb;
                    int iZzm2 = zzfuVar2.zzm();
                    boolean z = (iZzm2 & 128) != 0;
                    int iZzm3 = zzfuVar2.zzm();
                    this.zze = z;
                    this.zzc = (iZzm3 | ((iZzm2 & 15) << 8)) + 3;
                    int iZzc = this.zzb.zzc();
                    int i5 = this.zzc;
                    if (iZzc < i5) {
                        int iZzc2 = this.zzb.zzc();
                        this.zzb.zzE(Math.min(InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i5, iZzc2 + iZzc2)));
                    }
                }
            } else {
                int iMin2 = Math.min(zzfuVar.zzb(), this.zzc - i3);
                zzfuVar.zzG(this.zzb.zzM(), this.zzd, iMin2);
                int i6 = this.zzd + iMin2;
                this.zzd = i6;
                int i7 = this.zzc;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.zze) {
                        this.zzb.zzJ(i7);
                    } else {
                        if (zzgd.zze(this.zzb.zzM(), 0, i7, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        this.zzb.zzJ(this.zzc - 4);
                    }
                    this.zzb.zzK(0);
                    this.zza.zza(this.zzb);
                    this.zzd = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapp
    public final void zzb(zzgb zzgbVar, zzadx zzadxVar, zzapo zzapoVar) {
        this.zza.zzb(zzgbVar, zzadxVar, zzapoVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzapp
    public final void zzc() {
        this.zzf = true;
    }
}
