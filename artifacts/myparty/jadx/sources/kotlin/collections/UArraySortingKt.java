package kotlin.collections;

import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UArraySorting.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001e\u0010\u000b\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001f\u0010\u0010\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b \u0010\u0015\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b!\u0010\u001a¨\u0006\""}, d2 = {"partition", "", "array", "Lkotlin/UByteArray;", "left", "right", "partition-4UcCI2c", "([BII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort-Aa5vz7o", "([SII)V", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "quickSort-oBK06Vg", "([III)V", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "quickSort--nroSd4", "([JII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-Aa5vz7o", "sortArray-oBK06Vg", "sortArray--nroSd4", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UArraySortingKt {
    /* renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m9582partition4UcCI2c(byte[] bArr, int i, int i2) {
        int i3;
        byte bM9198getw2LRezQ = UByteArray.m9198getw2LRezQ(bArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                int iM9198getw2LRezQ = UByteArray.m9198getw2LRezQ(bArr, i) & UByte.MAX_VALUE;
                i3 = bM9198getw2LRezQ & UByte.MAX_VALUE;
                if (Intrinsics.compare(iM9198getw2LRezQ, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UByteArray.m9198getw2LRezQ(bArr, i2) & UByte.MAX_VALUE, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                byte bM9198getw2LRezQ2 = UByteArray.m9198getw2LRezQ(bArr, i);
                UByteArray.m9203setVurrAj0(bArr, i, UByteArray.m9198getw2LRezQ(bArr, i2));
                UByteArray.m9203setVurrAj0(bArr, i2, bM9198getw2LRezQ2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m9586quickSort4UcCI2c(byte[] bArr, int i, int i2) {
        int iM9582partition4UcCI2c = m9582partition4UcCI2c(bArr, i, i2);
        int i3 = iM9582partition4UcCI2c - 1;
        if (i < i3) {
            m9586quickSort4UcCI2c(bArr, i, i3);
        }
        if (iM9582partition4UcCI2c < i2) {
            m9586quickSort4UcCI2c(bArr, iM9582partition4UcCI2c, i2);
        }
    }

    /* renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m9583partitionAa5vz7o(short[] sArr, int i, int i2) {
        int i3;
        short sM9461getMh2AYeg = UShortArray.m9461getMh2AYeg(sArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                int iM9461getMh2AYeg = UShortArray.m9461getMh2AYeg(sArr, i) & UShort.MAX_VALUE;
                i3 = sM9461getMh2AYeg & UShort.MAX_VALUE;
                if (Intrinsics.compare(iM9461getMh2AYeg, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UShortArray.m9461getMh2AYeg(sArr, i2) & UShort.MAX_VALUE, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                short sM9461getMh2AYeg2 = UShortArray.m9461getMh2AYeg(sArr, i);
                UShortArray.m9466set01HTLdE(sArr, i, UShortArray.m9461getMh2AYeg(sArr, i2));
                UShortArray.m9466set01HTLdE(sArr, i2, sM9461getMh2AYeg2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m9587quickSortAa5vz7o(short[] sArr, int i, int i2) {
        int iM9583partitionAa5vz7o = m9583partitionAa5vz7o(sArr, i, i2);
        int i3 = iM9583partitionAa5vz7o - 1;
        if (i < i3) {
            m9587quickSortAa5vz7o(sArr, i, i3);
        }
        if (iM9583partitionAa5vz7o < i2) {
            m9587quickSortAa5vz7o(sArr, iM9583partitionAa5vz7o, i2);
        }
    }

    /* renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m9584partitionoBK06Vg(int[] iArr, int i, int i2) {
        int iM9277getpVg5ArA = UIntArray.m9277getpVg5ArA(iArr, (i + i2) / 2);
        while (i <= i2) {
            while (Integer.compare(UIntArray.m9277getpVg5ArA(iArr, i) ^ Integer.MIN_VALUE, iM9277getpVg5ArA ^ Integer.MIN_VALUE) < 0) {
                i++;
            }
            while (Integer.compare(UIntArray.m9277getpVg5ArA(iArr, i2) ^ Integer.MIN_VALUE, iM9277getpVg5ArA ^ Integer.MIN_VALUE) > 0) {
                i2--;
            }
            if (i <= i2) {
                int iM9277getpVg5ArA2 = UIntArray.m9277getpVg5ArA(iArr, i);
                UIntArray.m9282setVXSXFK8(iArr, i, UIntArray.m9277getpVg5ArA(iArr, i2));
                UIntArray.m9282setVXSXFK8(iArr, i2, iM9277getpVg5ArA2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m9588quickSortoBK06Vg(int[] iArr, int i, int i2) {
        int iM9584partitionoBK06Vg = m9584partitionoBK06Vg(iArr, i, i2);
        int i3 = iM9584partitionoBK06Vg - 1;
        if (i < i3) {
            m9588quickSortoBK06Vg(iArr, i, i3);
        }
        if (iM9584partitionoBK06Vg < i2) {
            m9588quickSortoBK06Vg(iArr, iM9584partitionoBK06Vg, i2);
        }
    }

    /* renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m9581partitionnroSd4(long[] jArr, int i, int i2) {
        long jM9356getsVKNKU = ULongArray.m9356getsVKNKU(jArr, (i + i2) / 2);
        while (i <= i2) {
            while (Long.compare(ULongArray.m9356getsVKNKU(jArr, i) ^ Long.MIN_VALUE, jM9356getsVKNKU ^ Long.MIN_VALUE) < 0) {
                i++;
            }
            while (Long.compare(ULongArray.m9356getsVKNKU(jArr, i2) ^ Long.MIN_VALUE, jM9356getsVKNKU ^ Long.MIN_VALUE) > 0) {
                i2--;
            }
            if (i <= i2) {
                long jM9356getsVKNKU2 = ULongArray.m9356getsVKNKU(jArr, i);
                ULongArray.m9361setk8EXiF4(jArr, i, ULongArray.m9356getsVKNKU(jArr, i2));
                ULongArray.m9361setk8EXiF4(jArr, i2, jM9356getsVKNKU2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m9585quickSortnroSd4(long[] jArr, int i, int i2) {
        int iM9581partitionnroSd4 = m9581partitionnroSd4(jArr, i, i2);
        int i3 = iM9581partitionnroSd4 - 1;
        if (i < i3) {
            m9585quickSortnroSd4(jArr, i, i3);
        }
        if (iM9581partitionnroSd4 < i2) {
            m9585quickSortnroSd4(jArr, iM9581partitionnroSd4, i2);
        }
    }

    /* renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m9590sortArray4UcCI2c(byte[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m9586quickSort4UcCI2c(array, i, i2 - 1);
    }

    /* renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m9591sortArrayAa5vz7o(short[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m9587quickSortAa5vz7o(array, i, i2 - 1);
    }

    /* renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m9592sortArrayoBK06Vg(int[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m9588quickSortoBK06Vg(array, i, i2 - 1);
    }

    /* renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m9589sortArraynroSd4(long[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m9585quickSortnroSd4(array, i, i2 - 1);
    }
}
