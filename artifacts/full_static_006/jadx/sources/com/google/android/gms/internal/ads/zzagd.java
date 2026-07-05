package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzagd implements zzadu {
    public static final zzaea zza = new zzaea() { // from class: com.google.android.gms.internal.ads.zzagc
        @Override // com.google.android.gms.internal.ads.zzaea
        public final /* synthetic */ zzadu[] zza(Uri uri, Map map) {
            return new zzadu[]{new zzagd()};
        }
    };
    private zzadx zzg;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private boolean zzo;
    private zzagb zzp;
    private zzagh zzq;
    private final zzfu zzb = new zzfu(4);
    private final zzfu zzc = new zzfu(9);
    private final zzfu zzd = new zzfu(11);
    private final zzfu zze = new zzfu();
    private final zzage zzf = new zzage();
    private int zzh = 1;

    private final zzfu zza(zzadv zzadvVar) throws IOException {
        if (this.zzm > this.zze.zzc()) {
            zzfu zzfuVar = this.zze;
            int iZzc = zzfuVar.zzc();
            zzfuVar.zzI(new byte[Math.max(iZzc + iZzc, this.zzm)], 0);
        } else {
            this.zze.zzK(0);
        }
        this.zze.zzJ(this.zzm);
        ((zzadi) zzadvVar).zzn(this.zze.zzM(), 0, this.zzm, false);
        return this.zze;
    }

    @RequiresNonNull({"extractorOutput"})
    private final void zzg() {
        if (this.zzo) {
            return;
        }
        this.zzg.zzO(new zzaes(-9223372036854775807L, 0L));
        this.zzo = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzadu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzadv zzadvVar, zzaeq zzaeqVar) throws IOException {
        boolean zZzf;
        boolean z;
        zzeq.zzb(this.zzg);
        while (true) {
            int i = this.zzh;
            int i2 = 8;
            if (i != 1) {
                if (i == 2) {
                    ((zzadi) zzadvVar).zzo(this.zzk, false);
                    this.zzk = 0;
                    this.zzh = 3;
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    long j = this.zzi ? this.zzj + this.zzn : this.zzf.zzc() == -9223372036854775807L ? 0L : this.zzn;
                    int i3 = this.zzl;
                    if (i3 == 8) {
                        if (this.zzp != null) {
                            zzg();
                            zZzf = this.zzp.zzf(zza(zzadvVar), j);
                        }
                        z = true;
                        if (!this.zzi && zZzf) {
                            this.zzi = true;
                            this.zzj = this.zzf.zzc() != -9223372036854775807L ? -this.zzn : 0L;
                        }
                        this.zzk = 4;
                        this.zzh = 2;
                        if (!z) {
                            return 0;
                        }
                    } else {
                        i2 = i3;
                    }
                    if (i2 == 9) {
                        if (this.zzq != null) {
                            zzg();
                            zZzf = this.zzq.zzf(zza(zzadvVar), j);
                            z = true;
                        }
                        ((zzadi) zzadvVar).zzo(this.zzm, false);
                        zZzf = false;
                        z = false;
                    } else {
                        if (i2 == 18 && !this.zzo) {
                            zZzf = this.zzf.zzf(zza(zzadvVar), j);
                            zzage zzageVar = this.zzf;
                            long jZzc = zzageVar.zzc();
                            if (jZzc != -9223372036854775807L) {
                                this.zzg.zzO(new zzaem(zzageVar.zzd(), zzageVar.zze(), jZzc));
                                this.zzo = true;
                            }
                            z = true;
                        }
                        ((zzadi) zzadvVar).zzo(this.zzm, false);
                        zZzf = false;
                        z = false;
                    }
                    if (!this.zzi) {
                        this.zzi = true;
                        this.zzj = this.zzf.zzc() != -9223372036854775807L ? -this.zzn : 0L;
                    }
                    this.zzk = 4;
                    this.zzh = 2;
                    if (!z) {
                    }
                } else {
                    if (!zzadvVar.zzn(this.zzd.zzM(), 0, 11, true)) {
                        return -1;
                    }
                    this.zzd.zzK(0);
                    this.zzl = this.zzd.zzm();
                    this.zzm = this.zzd.zzo();
                    this.zzn = this.zzd.zzo();
                    this.zzn = ((this.zzd.zzm() << 24) | this.zzn) * 1000;
                    this.zzd.zzL(3);
                    this.zzh = 4;
                }
            } else {
                if (!zzadvVar.zzn(this.zzc.zzM(), 0, 9, true)) {
                    return -1;
                }
                this.zzc.zzK(0);
                this.zzc.zzL(4);
                int iZzm = this.zzc.zzm();
                int i4 = iZzm & 4;
                int i5 = iZzm & 1;
                if (i4 != 0 && this.zzp == null) {
                    this.zzp = new zzagb(this.zzg.zzw(8, 1));
                }
                if (i5 != 0 && this.zzq == null) {
                    this.zzq = new zzagh(this.zzg.zzw(9, 2));
                }
                this.zzg.zzD();
                this.zzk = this.zzc.zzg() - 5;
                this.zzh = 2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzd(zzadx zzadxVar) {
        this.zzg = zzadxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zze(long j, long j2) {
        if (j == 0) {
            this.zzh = 1;
            this.zzi = false;
        } else {
            this.zzh = 3;
        }
        this.zzk = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzf(zzadv zzadvVar) throws IOException {
        zzadi zzadiVar = (zzadi) zzadvVar;
        zzadiVar.zzm(this.zzb.zzM(), 0, 3, false);
        this.zzb.zzK(0);
        if (this.zzb.zzo() != 4607062) {
            return false;
        }
        zzadiVar.zzm(this.zzb.zzM(), 0, 2, false);
        this.zzb.zzK(0);
        if ((this.zzb.zzq() & ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) != 0) {
            return false;
        }
        zzadiVar.zzm(this.zzb.zzM(), 0, 4, false);
        this.zzb.zzK(0);
        int iZzg = this.zzb.zzg();
        zzadvVar.zzj();
        zzadiVar.zzl(iZzg, false);
        zzadiVar.zzm(this.zzb.zzM(), 0, 4, false);
        this.zzb.zzK(0);
        return this.zzb.zzg() == 0;
    }
}
