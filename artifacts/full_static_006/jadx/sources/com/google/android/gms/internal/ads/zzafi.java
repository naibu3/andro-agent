package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzafi implements zzadu {
    public static final zzaea zza = new zzaea() { // from class: com.google.android.gms.internal.ads.zzafh
        @Override // com.google.android.gms.internal.ads.zzaea
        public final /* synthetic */ zzadu[] zza(Uri uri, Map map) {
            zzaea zzaeaVar = zzafi.zza;
            return new zzadu[]{new zzafi(0)};
        }
    };
    private static final int[] zzb = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final int zzf;
    private final byte[] zzg;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private zzadx zzp;
    private zzafa zzq;
    private zzaet zzr;
    private boolean zzs;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        zzc = iArr;
        int i = zzgd.zza;
        zzd = "#!AMR\n".getBytes(zzfxs.zzc);
        zze = "#!AMR-WB\n".getBytes(zzfxs.zzc);
        zzf = iArr[8];
    }

    public zzafi() {
        throw null;
    }

    public zzafi(int i) {
        this.zzg = new byte[1];
        this.zzm = -1;
    }

    private static boolean zzg(zzadv zzadvVar, byte[] bArr) throws IOException {
        zzadvVar.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((zzadi) zzadvVar).zzm(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean zzh(zzadv zzadvVar) throws IOException {
        byte[] bArr = zzd;
        if (zzg(zzadvVar, bArr)) {
            this.zzh = false;
            ((zzadi) zzadvVar).zzo(bArr.length, false);
            return true;
        }
        byte[] bArr2 = zze;
        if (!zzg(zzadvVar, bArr2)) {
            return false;
        }
        this.zzh = true;
        ((zzadi) zzadvVar).zzo(bArr2.length, false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final int zzb(zzadv zzadvVar, zzaeq zzaeqVar) throws IOException {
        zzeq.zzb(this.zzq);
        int i = zzgd.zza;
        if (zzadvVar.zzf() == 0 && !zzh(zzadvVar)) {
            throw zzch.zza("Could not find AMR header.", null);
        }
        if (!this.zzs) {
            this.zzs = true;
            boolean z = this.zzh;
            String str = true != z ? "audio/3gpp" : "audio/amr-wb";
            int i2 = true != z ? 8000 : 16000;
            zzafa zzafaVar = this.zzq;
            zzal zzalVar = new zzal();
            zzalVar.zzX(str);
            zzalVar.zzP(zzf);
            zzalVar.zzy(1);
            zzalVar.zzY(i2);
            zzafaVar.zzl(zzalVar.zzad());
        }
        int iZza = zza(zzadvVar);
        if (this.zzl) {
            return iZza;
        }
        zzaes zzaesVar = new zzaes(-9223372036854775807L, 0L);
        this.zzr = zzaesVar;
        this.zzp.zzO(zzaesVar);
        this.zzl = true;
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzd(zzadx zzadxVar) {
        this.zzp = zzadxVar;
        this.zzq = zzadxVar.zzw(0, 1);
        zzadxVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zze(long j, long j2) {
        this.zzi = 0L;
        this.zzj = 0;
        this.zzk = 0;
        this.zzo = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzf(zzadv zzadvVar) throws IOException {
        return zzh(zzadvVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e A[Catch: EOFException -> 0x00b0, TryCatch #0 {EOFException -> 0x00b0, blocks: (B:5:0x000c, B:7:0x0020, B:21:0x003e, B:23:0x0047, B:22:0x0043, B:40:0x0086, B:41:0x009e, B:42:0x009f, B:43:0x00af), top: B:45:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043 A[Catch: EOFException -> 0x00b0, TryCatch #0 {EOFException -> 0x00b0, blocks: (B:5:0x000c, B:7:0x0020, B:21:0x003e, B:23:0x0047, B:22:0x0043, B:40:0x0086, B:41:0x009e, B:42:0x009f, B:43:0x00af), top: B:45:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    @RequiresNonNull({"trackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zza(zzadv zzadvVar) throws IOException {
        int i;
        int i2 = this.zzk;
        if (i2 == 0) {
            try {
                zzadvVar.zzj();
                ((zzadi) zzadvVar).zzm(this.zzg, 0, 1, false);
                byte b = this.zzg[0];
                if ((b & 131) > 0) {
                    throw zzch.zza("Invalid padding bits for frame header " + ((int) b), null);
                }
                int i3 = b >> 3;
                boolean z = this.zzh;
                int i4 = i3 & 15;
                if (!z) {
                    if (!z) {
                        if (i4 >= 12 && i4 <= 14) {
                        }
                        i2 = !z ? zzc[i4] : zzb[i4];
                        this.zzj = i2;
                        this.zzk = i2;
                        i = this.zzm;
                        if (i == -1) {
                            this.zzm = i2;
                            i = i2;
                        }
                        if (i == i2) {
                            this.zzn++;
                        }
                    }
                    throw zzch.zza("Illegal AMR " + (true != z ? "NB" : "WB") + " frame type " + i4, null);
                }
                if (i4 >= 10 && i4 <= 13) {
                }
                i2 = !z ? zzc[i4] : zzb[i4];
                this.zzj = i2;
                this.zzk = i2;
                i = this.zzm;
                if (i == -1) {
                }
                if (i == i2) {
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iZza = zzaey.zza(this.zzq, zzadvVar, i2, true);
        if (iZza == -1) {
            return -1;
        }
        int i5 = this.zzk - iZza;
        this.zzk = i5;
        if (i5 > 0) {
            return 0;
        }
        this.zzq.zzs(this.zzi, 1, this.zzj, 0, null);
        this.zzi += 20000;
        return 0;
    }
}
