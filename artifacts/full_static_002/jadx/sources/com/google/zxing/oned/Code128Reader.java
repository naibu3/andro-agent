package com.google.zxing.oned;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Code128Reader extends OneDReader {
    private static final int CODE_CODE_A = 101;
    private static final int CODE_CODE_B = 100;
    private static final int CODE_CODE_C = 99;
    private static final int CODE_FNC_1 = 102;
    private static final int CODE_FNC_2 = 97;
    private static final int CODE_FNC_3 = 96;
    private static final int CODE_FNC_4_A = 101;
    private static final int CODE_FNC_4_B = 100;
    static final int[][] CODE_PATTERNS = {new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};
    private static final int CODE_SHIFT = 98;
    private static final int CODE_START_A = 103;
    private static final int CODE_START_B = 104;
    private static final int CODE_START_C = 105;
    private static final int CODE_STOP = 106;
    private static final float MAX_AVG_VARIANCE = 0.25f;
    private static final float MAX_INDIVIDUAL_VARIANCE = 0.7f;

    private static int[] findStartPattern(BitArray row) throws NotFoundException {
        int width = row.getSize();
        int rowOffset = row.getNextSet(0);
        int counterPosition = 0;
        int[] counters = new int[6];
        int patternStart = rowOffset;
        boolean isWhite = false;
        for (int i = rowOffset; i < width; i++) {
            if (row.get(i) != isWhite) {
                counters[counterPosition] = counters[counterPosition] + 1;
            } else {
                if (counterPosition == 5) {
                    float bestVariance = MAX_AVG_VARIANCE;
                    int bestMatch = -1;
                    for (int startCode = CODE_START_A; startCode <= CODE_START_C; startCode++) {
                        float variance = patternMatchVariance(counters, CODE_PATTERNS[startCode], MAX_INDIVIDUAL_VARIANCE);
                        if (variance < bestVariance) {
                            bestVariance = variance;
                            bestMatch = startCode;
                        }
                    }
                    if (bestMatch >= 0 && row.isRange(Math.max(0, patternStart - ((i - patternStart) / 2)), patternStart, false)) {
                        return new int[]{patternStart, i, bestMatch};
                    }
                    patternStart += counters[0] + counters[1];
                    System.arraycopy(counters, 2, counters, 0, counterPosition - 1);
                    counters[counterPosition - 1] = 0;
                    counters[counterPosition] = 0;
                    counterPosition--;
                } else {
                    counterPosition++;
                }
                counters[counterPosition] = 1;
                isWhite = isWhite ? false : true;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int decodeCode(BitArray row, int[] counters, int rowOffset) throws NotFoundException {
        recordPattern(row, rowOffset, counters);
        float bestVariance = MAX_AVG_VARIANCE;
        int bestMatch = -1;
        for (int d = 0; d < CODE_PATTERNS.length; d++) {
            int[] pattern = CODE_PATTERNS[d];
            float variance = patternMatchVariance(counters, pattern, MAX_INDIVIDUAL_VARIANCE);
            if (variance < bestVariance) {
                bestVariance = variance;
                bestMatch = d;
            }
        }
        if (bestMatch >= 0) {
            return bestMatch;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a0 A[PHI: r21
      0x01a0: PHI (r21v7 boolean) = (r21v5 boolean), (r21v5 boolean), (r21v5 boolean), (r21v8 boolean), (r21v8 boolean), (r21v8 boolean) binds: [B:71:0x0152, B:78:0x0165, B:77:0x0161, B:44:0x00db, B:51:0x00ef, B:50:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.zxing.oned.OneDReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Result decodeRow(int i, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        char c;
        boolean z;
        boolean z2 = false;
        boolean z3 = map != null && map.containsKey(DecodeHintType.ASSUME_GS1);
        int[] iArrFindStartPattern = findStartPattern(bitArray);
        int i2 = iArrFindStartPattern[2];
        ArrayList arrayList = new ArrayList(20);
        arrayList.add(Byte.valueOf((byte) i2));
        switch (i2) {
            case CODE_START_A /* 103 */:
                c = 'e';
                break;
            case 104:
                c = 'd';
                break;
            case CODE_START_C /* 105 */:
                c = 'c';
                break;
            default:
                throw FormatException.getFormatInstance();
        }
        StringBuilder sb = new StringBuilder(20);
        int i3 = 6;
        int[] iArr = new int[6];
        char c2 = c;
        int i4 = iArrFindStartPattern[0];
        int i5 = iArrFindStartPattern[1];
        char c3 = c2;
        int i6 = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i7 = 0;
        int i8 = 0;
        boolean z7 = true;
        while (!z5) {
            int iDecodeCode = decodeCode(bitArray, iArr, i5);
            arrayList.add(Byte.valueOf((byte) iDecodeCode));
            if (iDecodeCode != CODE_STOP) {
                z7 = true;
            }
            if (iDecodeCode != CODE_STOP) {
                i8++;
                i2 += i8 * iDecodeCode;
            }
            int i9 = i5;
            for (int i10 = 0; i10 < i3; i10++) {
                i9 += iArr[i10];
            }
            switch (iDecodeCode) {
                case CODE_START_A /* 103 */:
                case 104:
                case CODE_START_C /* 105 */:
                    throw FormatException.getFormatInstance();
                default:
                    switch (c3) {
                        case CODE_CODE_C /* 99 */:
                            if (iDecodeCode < 100) {
                                if (iDecodeCode < 10) {
                                    sb.append('0');
                                }
                                sb.append(iDecodeCode);
                            } else {
                                if (iDecodeCode != CODE_STOP) {
                                    z7 = false;
                                }
                                switch (iDecodeCode) {
                                    case 100:
                                        z = false;
                                        c3 = 'd';
                                        break;
                                    case TypedValues.TYPE_TARGET /* 101 */:
                                        z = false;
                                        c3 = 'e';
                                        break;
                                    case 102:
                                        if (z3) {
                                            if (sb.length() == 0) {
                                                sb.append("]C1");
                                            } else {
                                                sb.append((char) 29);
                                            }
                                        }
                                    case CODE_START_A /* 103 */:
                                    case 104:
                                    case CODE_START_C /* 105 */:
                                    default:
                                        z = false;
                                        break;
                                    case CODE_STOP /* 106 */:
                                        z = false;
                                        z5 = true;
                                        break;
                                }
                            }
                            z = false;
                        case 'd':
                            if (iDecodeCode < CODE_FNC_3) {
                                if (z4 == z2) {
                                    sb.append((char) (iDecodeCode + 32));
                                } else {
                                    sb.append((char) (iDecodeCode + 32 + 128));
                                }
                                z4 = false;
                                z = false;
                                break;
                            } else {
                                if (iDecodeCode != CODE_STOP) {
                                    z7 = false;
                                }
                                switch (iDecodeCode) {
                                    case CODE_FNC_3 /* 96 */:
                                    case CODE_FNC_2 /* 97 */:
                                        z = false;
                                        break;
                                    case CODE_SHIFT /* 98 */:
                                        z = true;
                                        c3 = 'e';
                                        break;
                                    case CODE_CODE_C /* 99 */:
                                        z = false;
                                        c3 = 'c';
                                        break;
                                    case 100:
                                        if (!z2 && z4) {
                                            z2 = true;
                                            z4 = false;
                                            z = false;
                                            break;
                                        } else if (z2 && z4) {
                                            z2 = false;
                                            z4 = false;
                                            z = false;
                                            break;
                                        } else {
                                            z4 = true;
                                            z = false;
                                            break;
                                        }
                                    case TypedValues.TYPE_TARGET /* 101 */:
                                        z = false;
                                        c3 = 'e';
                                        break;
                                    case 102:
                                        if (z3) {
                                            if (sb.length() == 0) {
                                                sb.append("]C1");
                                            } else {
                                                sb.append((char) 29);
                                            }
                                            z = false;
                                            break;
                                        }
                                        z = false;
                                        break;
                                    case CODE_STOP /* 106 */:
                                        z5 = true;
                                    case CODE_START_A /* 103 */:
                                    case 104:
                                    case CODE_START_C /* 105 */:
                                    default:
                                        z = false;
                                        break;
                                }
                            }
                        case TypedValues.TYPE_TARGET /* 101 */:
                            if (iDecodeCode < 64) {
                                if (z4 == z2) {
                                    sb.append((char) (iDecodeCode + 32));
                                } else {
                                    sb.append((char) (iDecodeCode + 32 + 128));
                                }
                                z4 = false;
                                z = false;
                                break;
                            } else if (iDecodeCode < CODE_FNC_3) {
                                if (z4 == z2) {
                                    sb.append((char) (iDecodeCode - 64));
                                } else {
                                    sb.append((char) (iDecodeCode + 64));
                                }
                                z4 = false;
                                z = false;
                                break;
                            } else {
                                if (iDecodeCode != CODE_STOP) {
                                    z7 = false;
                                }
                                switch (iDecodeCode) {
                                    case CODE_FNC_3 /* 96 */:
                                    case CODE_FNC_2 /* 97 */:
                                        break;
                                    case CODE_SHIFT /* 98 */:
                                        z = true;
                                        c3 = 'd';
                                        break;
                                    case CODE_CODE_C /* 99 */:
                                        z = false;
                                        c3 = 'c';
                                        break;
                                    case 100:
                                        z = false;
                                        c3 = 'd';
                                        break;
                                    case TypedValues.TYPE_TARGET /* 101 */:
                                        if (!z2 && z4) {
                                            z2 = true;
                                            z4 = false;
                                            z = false;
                                            break;
                                        } else if (z2 && z4) {
                                            z2 = false;
                                            z4 = false;
                                            z = false;
                                            break;
                                        } else {
                                            z4 = true;
                                            z = false;
                                            break;
                                        }
                                    case 102:
                                        if (z3) {
                                            if (sb.length() == 0) {
                                                sb.append("]C1");
                                            } else {
                                                sb.append((char) 29);
                                            }
                                            z = false;
                                            break;
                                        }
                                        z = false;
                                        break;
                                    case CODE_STOP /* 106 */:
                                        z5 = true;
                                    case CODE_START_A /* 103 */:
                                    case 104:
                                    case CODE_START_C /* 105 */:
                                    default:
                                        z = false;
                                        break;
                                }
                            }
                        default:
                            z = false;
                            break;
                    }
                    if (z6) {
                        c3 = c3 == 'e' ? 'd' : 'e';
                    }
                    int i11 = i7;
                    i7 = iDecodeCode;
                    i6 = i11;
                    i4 = i5;
                    z6 = z;
                    i5 = i9;
                    i3 = 6;
            }
            while (!z5) {
            }
        }
        int i12 = i5 - i4;
        int nextUnset = bitArray.getNextUnset(i5);
        if (!bitArray.isRange(nextUnset, Math.min(bitArray.getSize(), ((nextUnset - i4) / 2) + nextUnset), false)) {
            throw NotFoundException.getNotFoundInstance();
        }
        if ((i2 - (i8 * i6)) % CODE_START_A != i6) {
            throw ChecksumException.getChecksumInstance();
        }
        int length = sb.length();
        if (length == 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (length > 0 && z7) {
            if (c3 == CODE_CODE_C) {
                sb.delete(length - 2, length);
            } else {
                sb.delete(length - 1, length);
            }
        }
        float f = (iArrFindStartPattern[1] + iArrFindStartPattern[0]) / 2.0f;
        float f2 = i4 + (i12 / 2.0f);
        int size = arrayList.size();
        byte[] bArr = new byte[size];
        for (int i13 = 0; i13 < size; i13++) {
            bArr[i13] = ((Byte) arrayList.get(i13)).byteValue();
        }
        float f3 = i;
        return new Result(sb.toString(), bArr, new ResultPoint[]{new ResultPoint(f, f3), new ResultPoint(f2, f3)}, BarcodeFormat.CODE_128);
    }
}
