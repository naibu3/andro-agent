package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzhac implements Iterable<Byte>, Serializable {
    private static final Comparator zza;
    public static final zzhac zzb = new zzgzy(zzhcb.zzd);
    private static final zzhab zzd;
    private int zzc = 0;

    static {
        int i = zzgzm.zza;
        zzd = new zzhab(null);
        zza = new zzgzs();
    }

    zzhac() {
    }

    public static zzgzz zzt() {
        return new zzgzz(128);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzhac zzu(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = iterable.size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zzb : zzc(iterable.iterator(), size);
    }

    public static zzhac zzv(byte[] bArr, int i, int i2) {
        zzq(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzgzy(bArr2);
    }

    public static zzhac zzw(String str) {
        return new zzgzy(str.getBytes(zzhcb.zzb));
    }

    static void zzz(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzi = this.zzc;
        if (iZzi == 0) {
            int iZzd = zzd();
            iZzi = zzi(iZzd, 0, iZzd);
            if (iZzi == 0) {
                iZzi = 1;
            }
            this.zzc = iZzi;
        }
        return iZzi;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzd()), zzd() <= 50 ? zzheo.zza(this) : zzheo.zza(zzk(0, 47)).concat("..."));
    }

    @Deprecated
    public final void zzA(byte[] bArr, int i, int i2, int i3) {
        zzq(0, i3, zzd());
        zzq(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            zze(bArr, 0, i2, i3);
        }
    }

    public final byte[] zzB() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return zzhcb.zzd;
        }
        byte[] bArr = new byte[iZzd];
        zze(bArr, 0, 0, iZzd);
        return bArr;
    }

    public abstract byte zza(int i);

    abstract byte zzb(int i);

    public abstract int zzd();

    protected abstract void zze(byte[] bArr, int i, int i2, int i3);

    protected abstract int zzf();

    protected abstract boolean zzh();

    protected abstract int zzi(int i, int i2, int i3);

    protected abstract int zzj(int i, int i2, int i3);

    public abstract zzhac zzk(int i, int i2);

    public abstract zzham zzl();

    protected abstract String zzm(Charset charset);

    public abstract ByteBuffer zzn();

    abstract void zzo(zzgzq zzgzqVar) throws IOException;

    public abstract boolean zzp();

    protected final int zzr() {
        return this.zzc;
    }

    @Override // java.lang.Iterable
    /* renamed from: zzs, reason: merged with bridge method [inline-methods] */
    public zzgzv iterator() {
        return new zzgzr(this);
    }

    public final String zzx(Charset charset) {
        return zzd() == 0 ? "" : zzm(charset);
    }

    public final String zzy() {
        return zzx(zzhcb.zzb);
    }

    private static zzhac zzc(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
        }
        if (i == 1) {
            return (zzhac) it.next();
        }
        int i2 = i >>> 1;
        zzhac zzhacVarZzc = zzc(it, i2);
        zzhac zzhacVarZzc2 = zzc(it, i - i2);
        if (Integer.MAX_VALUE - zzhacVarZzc.zzd() >= zzhacVarZzc2.zzd()) {
            return zzhdy.zzD(zzhacVarZzc, zzhacVarZzc2);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + zzhacVarZzc.zzd() + "+" + zzhacVarZzc2.zzd());
    }

    static int zzq(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        }
        throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
    }
}
