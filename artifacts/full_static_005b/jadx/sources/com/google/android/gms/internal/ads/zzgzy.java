package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
class zzgzy extends zzgzx {
    protected final byte[] zza;

    zzgzy(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhac) || zzd() != ((zzhac) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzgzy)) {
            return obj.equals(this);
        }
        zzgzy zzgzyVar = (zzgzy) obj;
        int iZzr = zzr();
        int iZzr2 = zzgzyVar.zzr();
        if (iZzr == 0 || iZzr2 == 0 || iZzr == iZzr2) {
            return zzg(zzgzyVar, 0, zzd());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    byte zzb(int i) {
        return this.zza[i];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    protected void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgzx
    final boolean zzg(zzhac zzhacVar, int i, int i2) {
        if (i2 > zzhacVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + i2 + zzd());
        }
        int i3 = i + i2;
        if (i3 > zzhacVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + zzhacVar.zzd());
        }
        if (!(zzhacVar instanceof zzgzy)) {
            return zzhacVar.zzk(i, i3).equals(zzk(0, i2));
        }
        zzgzy zzgzyVar = (zzgzy) zzhacVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzgzyVar.zza;
        int iZzc = zzc() + i2;
        int iZzc2 = zzc();
        int iZzc3 = zzgzyVar.zzc() + i;
        while (iZzc2 < iZzc) {
            if (bArr[iZzc2] != bArr2[iZzc3]) {
                return false;
            }
            iZzc2++;
            iZzc3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    protected final int zzi(int i, int i2, int i3) {
        return zzhcb.zzb(i, this.zza, zzc() + i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    protected final int zzj(int i, int i2, int i3) {
        int iZzc = zzc() + i2;
        return zzhff.zzf(i, this.zza, iZzc, i3 + iZzc);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final zzhac zzk(int i, int i2) {
        int iZzq = zzq(i, i2, zzd());
        return iZzq == 0 ? zzhac.zzb : new zzgzu(this.zza, zzc() + i, iZzq);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final zzham zzl() {
        return zzham.zzJ(this.zza, zzc(), zzd(), true);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    protected final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    final void zzo(zzgzq zzgzqVar) throws IOException {
        zzgzqVar.zza(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final boolean zzp() {
        int iZzc = zzc();
        return zzhff.zzj(this.zza, iZzc, zzd() + iZzc);
    }
}
