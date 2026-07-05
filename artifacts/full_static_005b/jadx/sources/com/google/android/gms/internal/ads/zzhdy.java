package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzhdy extends zzhac {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzhac zzd;
    private final zzhac zze;
    private final int zzf;
    private final int zzg;

    private zzhdy(zzhac zzhacVar, zzhac zzhacVar2) {
        this.zzd = zzhacVar;
        this.zze = zzhacVar2;
        int iZzd = zzhacVar.zzd();
        this.zzf = iZzd;
        this.zzc = iZzd + zzhacVar2.zzd();
        this.zzg = Math.max(zzhacVar.zzf(), zzhacVar2.zzf()) + 1;
    }

    static zzhac zzD(zzhac zzhacVar, zzhac zzhacVar2) {
        if (zzhacVar2.zzd() == 0) {
            return zzhacVar;
        }
        if (zzhacVar.zzd() == 0) {
            return zzhacVar2;
        }
        int iZzd = zzhacVar.zzd() + zzhacVar2.zzd();
        if (iZzd < 128) {
            return zzE(zzhacVar, zzhacVar2);
        }
        if (zzhacVar instanceof zzhdy) {
            zzhdy zzhdyVar = (zzhdy) zzhacVar;
            if (zzhdyVar.zze.zzd() + zzhacVar2.zzd() < 128) {
                return new zzhdy(zzhdyVar.zzd, zzE(zzhdyVar.zze, zzhacVar2));
            }
            if (zzhdyVar.zzd.zzf() > zzhdyVar.zze.zzf() && zzhdyVar.zzg > zzhacVar2.zzf()) {
                return new zzhdy(zzhdyVar.zzd, new zzhdy(zzhdyVar.zze, zzhacVar2));
            }
        }
        return iZzd >= zzc(Math.max(zzhacVar.zzf(), zzhacVar2.zzf()) + 1) ? new zzhdy(zzhacVar, zzhacVar2) : zzhdu.zza(new zzhdu(null), zzhacVar, zzhacVar2);
    }

    private static zzhac zzE(zzhac zzhacVar, zzhac zzhacVar2) {
        int iZzd = zzhacVar.zzd();
        int iZzd2 = zzhacVar2.zzd();
        byte[] bArr = new byte[iZzd + iZzd2];
        zzhacVar.zzA(bArr, 0, 0, iZzd);
        zzhacVar2.zzA(bArr, 0, iZzd, iZzd2);
        return new zzgzy(bArr);
    }

    static int zzc(int i) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhac)) {
            return false;
        }
        zzhac zzhacVar = (zzhac) obj;
        if (this.zzc != zzhacVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int iZzr = zzr();
        int iZzr2 = zzhacVar.zzr();
        if (iZzr != 0 && iZzr2 != 0 && iZzr != iZzr2) {
            return false;
        }
        zzhdv zzhdvVar = null;
        zzhdw zzhdwVar = new zzhdw(this, zzhdvVar);
        zzgzx zzgzxVarZza = zzhdwVar.next();
        zzhdw zzhdwVar2 = new zzhdw(zzhacVar, zzhdvVar);
        zzgzx zzgzxVarZza2 = zzhdwVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int iZzd = zzgzxVarZza.zzd() - i;
            int iZzd2 = zzgzxVarZza2.zzd() - i2;
            int iMin = Math.min(iZzd, iZzd2);
            if (!(i == 0 ? zzgzxVarZza.zzg(zzgzxVarZza2, i2, iMin) : zzgzxVarZza2.zzg(zzgzxVarZza, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.zzc;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iZzd) {
                zzgzxVarZza = zzhdwVar.next();
                i = 0;
            } else {
                i += iMin;
                zzgzxVarZza = zzgzxVarZza;
            }
            if (iMin == iZzd2) {
                zzgzxVarZza2 = zzhdwVar2.next();
                i2 = 0;
            } else {
                i2 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhac, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzhds(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final byte zza(int i) {
        zzz(i, this.zzc);
        return zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    final byte zzb(int i) {
        int i2 = this.zzf;
        return i < i2 ? this.zzd.zzb(i) : this.zze.zzb(i - i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    protected final void zze(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            this.zzd.zze(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.zze.zze(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.zzd.zze(bArr, i, i2, i6);
            this.zze.zze(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    protected final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    protected final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    protected final int zzi(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            return this.zzd.zzi(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zze.zzi(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zze.zzi(this.zzd.zzi(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    protected final int zzj(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            return this.zzd.zzj(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zze.zzj(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zze.zzj(this.zzd.zzj(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final zzhac zzk(int i, int i2) {
        int iZzq = zzq(i, i2, this.zzc);
        if (iZzq == 0) {
            return zzhac.zzb;
        }
        if (iZzq == this.zzc) {
            return this;
        }
        int i3 = this.zzf;
        if (i2 <= i3) {
            return this.zzd.zzk(i, i2);
        }
        if (i >= i3) {
            return this.zze.zzk(i - i3, i2 - i3);
        }
        zzhac zzhacVar = this.zzd;
        return new zzhdy(zzhacVar.zzk(i, zzhacVar.zzd()), this.zze.zzk(0, i2 - this.zzf));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzhac
    public final zzham zzl() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        Object[] objArr = 0;
        zzhdw zzhdwVar = new zzhdw(this, null);
        while (zzhdwVar.hasNext()) {
            arrayList.add(zzhdwVar.next().zzn());
        }
        int i = zzham.zzd;
        int i2 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            iRemaining += byteBuffer.remaining();
            i2 = byteBuffer.hasArray() ? i2 | 1 : byteBuffer.isDirect() ? i2 | 2 : i2 | 4;
        }
        return i2 == 2 ? new zzhag(arrayList, iRemaining, true, objArr == true ? 1 : 0) : zzham.zzI(new zzhce(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    protected final String zzm(Charset charset) {
        return new String(zzB(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final ByteBuffer zzn() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    final void zzo(zzgzq zzgzqVar) throws IOException {
        this.zzd.zzo(zzgzqVar);
        this.zze.zzo(zzgzqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final boolean zzp() {
        zzhac zzhacVar = this.zzd;
        zzhac zzhacVar2 = this.zze;
        return zzhacVar2.zzj(zzhacVar.zzj(0, 0, this.zzf), 0, zzhacVar2.zzd()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    /* renamed from: zzs */
    public final zzgzv iterator() {
        return new zzhds(this);
    }
}
