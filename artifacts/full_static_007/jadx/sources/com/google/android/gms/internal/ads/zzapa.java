package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzapa implements zzadu {
    public static final zzaea zza = new zzaea() { // from class: com.google.android.gms.internal.ads.zzaoy
        @Override // com.google.android.gms.internal.ads.zzaea
        public final /* synthetic */ zzadu[] zza(Uri uri, Map map) {
            return new zzadu[]{new zzapa()};
        }
    };
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private long zzi;
    private zzaow zzj;
    private zzadx zzk;
    private boolean zzl;
    private final zzgb zzb = new zzgb(0);
    private final zzfu zzd = new zzfu(4096);
    private final SparseArray zzc = new SparseArray();
    private final zzaox zze = new zzaox();

    /* JADX WARN: Removed duplicated region for block: B:64:0x014f  */
    @Override // com.google.android.gms.internal.ads.zzadu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzadv zzadvVar, zzaeq zzaeqVar) throws IOException {
        zzaoc zzaoeVar;
        zzeq.zzb(this.zzk);
        long jZzd = zzadvVar.zzd();
        if (jZzd != -1) {
            zzaox zzaoxVar = this.zze;
            if (!zzaoxVar.zze()) {
                return zzaoxVar.zza(zzadvVar, zzaeqVar);
            }
        }
        if (!this.zzl) {
            this.zzl = true;
            zzaox zzaoxVar2 = this.zze;
            if (zzaoxVar2.zzb() != -9223372036854775807L) {
                zzaow zzaowVar = new zzaow(zzaoxVar2.zzd(), zzaoxVar2.zzb(), jZzd);
                this.zzj = zzaowVar;
                this.zzk.zzO(zzaowVar.zzb());
            } else {
                this.zzk.zzO(new zzaes(zzaoxVar2.zzb(), 0L));
            }
        }
        zzaow zzaowVar2 = this.zzj;
        if (zzaowVar2 != null && zzaowVar2.zze()) {
            return zzaowVar2.zza(zzadvVar, zzaeqVar);
        }
        zzadvVar.zzj();
        long jZze = jZzd != -1 ? jZzd - zzadvVar.zze() : -1L;
        if ((jZze != -1 && jZze < 4) || !zzadvVar.zzm(this.zzd.zzM(), 0, 4, true)) {
            return -1;
        }
        this.zzd.zzK(0);
        int iZzg = this.zzd.zzg();
        if (iZzg == 441) {
            return -1;
        }
        if (iZzg == 442) {
            zzadi zzadiVar = (zzadi) zzadvVar;
            zzadiVar.zzm(this.zzd.zzM(), 0, 10, false);
            this.zzd.zzK(9);
            zzadiVar.zzo((this.zzd.zzm() & 7) + 14, false);
            return 0;
        }
        if (iZzg == 443) {
            zzadi zzadiVar2 = (zzadi) zzadvVar;
            zzadiVar2.zzm(this.zzd.zzM(), 0, 2, false);
            this.zzd.zzK(0);
            zzadiVar2.zzo(this.zzd.zzq() + 6, false);
            return 0;
        }
        if ((iZzg >> 8) != 1) {
            ((zzadi) zzadvVar).zzo(1, false);
            return 0;
        }
        int i = iZzg & 255;
        zzaoz zzaozVar = (zzaoz) this.zzc.get(i);
        if (!this.zzf) {
            if (zzaozVar == null) {
                zzaoc zzaocVar = null;
                if (i == 189) {
                    zzaoeVar = new zzans(null, 0);
                    this.zzg = true;
                    this.zzi = zzadvVar.zzf();
                } else if ((iZzg & 224) == 192) {
                    zzaoeVar = new zzaoq(null, 0);
                    this.zzg = true;
                    this.zzi = zzadvVar.zzf();
                } else {
                    if ((iZzg & 240) == 224) {
                        zzaoeVar = new zzaoe(null);
                        this.zzh = true;
                        this.zzi = zzadvVar.zzf();
                    }
                    if (zzaocVar != null) {
                        zzaocVar.zzb(this.zzk, new zzapo(Integer.MIN_VALUE, i, 256));
                        zzaozVar = new zzaoz(zzaocVar, this.zzb);
                        this.zzc.put(i, zzaozVar);
                    }
                }
                zzaocVar = zzaoeVar;
                if (zzaocVar != null) {
                }
            }
            boolean z = this.zzg;
            long j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            if (z && this.zzh) {
                j = PlaybackStateCompat.ACTION_PLAY_FROM_URI + this.zzi;
            }
            if (zzadvVar.zzf() > j) {
                this.zzf = true;
                this.zzk.zzD();
            }
        }
        zzadi zzadiVar3 = (zzadi) zzadvVar;
        zzadiVar3.zzm(this.zzd.zzM(), 0, 2, false);
        this.zzd.zzK(0);
        int iZzq = this.zzd.zzq() + 6;
        if (zzaozVar == null) {
            zzadiVar3.zzo(iZzq, false);
        } else {
            this.zzd.zzH(iZzq);
            zzadiVar3.zzn(this.zzd.zzM(), 0, iZzq, false);
            this.zzd.zzK(6);
            zzaozVar.zza(this.zzd);
            zzfu zzfuVar = this.zzd;
            zzfuVar.zzJ(zzfuVar.zzc());
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzd(zzadx zzadxVar) {
        this.zzk = zzadxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    @Override // com.google.android.gms.internal.ads.zzadu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zze(long j, long j2) {
        zzgb zzgbVar = this.zzb;
        if (zzgbVar.zzf() != -9223372036854775807L) {
            long jZzd = zzgbVar.zzd();
            if (jZzd != -9223372036854775807L && jZzd != 0 && jZzd != j2) {
                zzgbVar.zzi(j2);
            }
        }
        zzaow zzaowVar = this.zzj;
        if (zzaowVar != null) {
            zzaowVar.zzd(j2);
        }
        for (int i = 0; i < this.zzc.size(); i++) {
            ((zzaoz) this.zzc.valueAt(i)).zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzf(zzadv zzadvVar) throws IOException {
        byte[] bArr = new byte[14];
        zzadi zzadiVar = (zzadi) zzadvVar;
        zzadiVar.zzm(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zzadiVar.zzl(bArr[13] & 7, false);
        zzadiVar.zzm(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }
}
