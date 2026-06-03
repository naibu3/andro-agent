package com.google.zxing.common;

import com.google.zxing.DecodeHintType;
import java.nio.charset.Charset;
import java.util.Map;

/* loaded from: classes2.dex */
public final class StringUtils {
    private static final boolean ASSUME_SHIFT_JIS;
    private static final String EUC_JP = "EUC_JP";
    public static final String GB2312 = "GB2312";
    private static final String ISO88591 = "ISO8859_1";
    private static final String PLATFORM_DEFAULT_ENCODING = Charset.defaultCharset().name();
    public static final String SHIFT_JIS = "SJIS";
    private static final String UTF8 = "UTF8";

    static {
        ASSUME_SHIFT_JIS = SHIFT_JIS.equalsIgnoreCase(PLATFORM_DEFAULT_ENCODING) || EUC_JP.equalsIgnoreCase(PLATFORM_DEFAULT_ENCODING);
    }

    private StringUtils() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0123, code lost:
    
        if (r15 < 3) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085 A[PHI: r6 r20
      0x0085: PHI (r6v6 'utf8BytesLeft' int) = (r6v1 'utf8BytesLeft' int), (r6v5 'utf8BytesLeft' int), (r6v1 'utf8BytesLeft' int) binds: [B:31:0x0068, B:39:0x0080, B:26:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0085: PHI (r20v8 'i' int) = (r20v7 'i' int), (r20v7 'i' int), (r20v9 'i' int) binds: [B:31:0x0068, B:39:0x0080, B:26:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String guessEncoding(byte[] bytes, Map<DecodeHintType, ?> hints) {
        String str;
        int i;
        if (hints != null && hints.containsKey(DecodeHintType.CHARACTER_SET)) {
            return hints.get(DecodeHintType.CHARACTER_SET).toString();
        }
        int length = bytes.length;
        boolean canBeISO88591 = true;
        boolean canBeShiftJIS = true;
        boolean canBeUTF8 = true;
        int utf8BytesLeft = 0;
        int utf2BytesChars = 0;
        int utf3BytesChars = 0;
        int utf4BytesChars = 0;
        int sjisBytesLeft = 0;
        int sjisKatakanaChars = 0;
        int sjisCurKatakanaWordLength = 0;
        int sjisCurDoubleBytesWordLength = 0;
        int sjisMaxKatakanaWordLength = 0;
        int sjisMaxDoubleBytesWordLength = 0;
        int isoHighOther = 0;
        boolean utf8bom = false;
        if (bytes.length > 3 && bytes[0] == -17 && bytes[1] == -69 && bytes[2] == -65) {
            utf8bom = true;
        }
        for (int i2 = 0; i2 < length && (canBeISO88591 || canBeShiftJIS || canBeUTF8); i2 = i + 1) {
            int value = bytes[i2] & 255;
            if (!canBeUTF8) {
                i = i2;
            } else if (utf8BytesLeft > 0) {
                i = i2;
                int i3 = value & 128;
                if (i3 != 0) {
                    utf8BytesLeft--;
                } else {
                    canBeUTF8 = false;
                }
            } else {
                i = i2;
                int i4 = value & 128;
                if (i4 != 0) {
                    if ((value & 64) != 0) {
                        utf8BytesLeft++;
                        if ((value & 32) == 0) {
                            utf2BytesChars++;
                        } else {
                            utf8BytesLeft++;
                            if ((value & 16) == 0) {
                                utf3BytesChars++;
                            } else {
                                utf8BytesLeft++;
                                if ((value & 8) == 0) {
                                    utf4BytesChars++;
                                }
                            }
                        }
                    }
                }
            }
            if (canBeISO88591) {
                if (value > 127 && value < 160) {
                    canBeISO88591 = false;
                } else if (value > 159 && (value < 192 || value == 215 || value == 247)) {
                    isoHighOther++;
                }
            }
            if (canBeShiftJIS) {
                if (sjisBytesLeft > 0) {
                    if (value < 64 || value == 127 || value > 252) {
                        canBeShiftJIS = false;
                    } else {
                        sjisBytesLeft--;
                    }
                } else if (value == 128 || value == 160 || value > 239) {
                    canBeShiftJIS = false;
                } else if (value > 160 && value < 224) {
                    sjisKatakanaChars++;
                    sjisCurKatakanaWordLength++;
                    if (sjisCurKatakanaWordLength <= sjisMaxKatakanaWordLength) {
                        sjisCurDoubleBytesWordLength = 0;
                    } else {
                        sjisMaxKatakanaWordLength = sjisCurKatakanaWordLength;
                        sjisCurDoubleBytesWordLength = 0;
                    }
                } else if (value > 127) {
                    sjisBytesLeft++;
                    sjisCurDoubleBytesWordLength++;
                    if (sjisCurDoubleBytesWordLength <= sjisMaxDoubleBytesWordLength) {
                        sjisCurKatakanaWordLength = 0;
                    } else {
                        sjisMaxDoubleBytesWordLength = sjisCurDoubleBytesWordLength;
                        sjisCurKatakanaWordLength = 0;
                    }
                } else {
                    sjisCurDoubleBytesWordLength = 0;
                    sjisCurKatakanaWordLength = 0;
                }
            }
        }
        if (canBeUTF8 && utf8BytesLeft > 0) {
            canBeUTF8 = false;
        }
        if (canBeShiftJIS && sjisBytesLeft > 0) {
            canBeShiftJIS = false;
        }
        if (canBeUTF8 && (utf8bom || utf2BytesChars + utf3BytesChars + utf4BytesChars > 0)) {
            return UTF8;
        }
        if (canBeShiftJIS) {
            if (!ASSUME_SHIFT_JIS) {
                str = UTF8;
                if (sjisMaxKatakanaWordLength < 3) {
                }
            }
            return SHIFT_JIS;
        }
        str = UTF8;
        if (canBeISO88591 && canBeShiftJIS) {
            if ((sjisMaxKatakanaWordLength == 2 && sjisKatakanaChars == 2) || isoHighOther * 10 >= length) {
                return SHIFT_JIS;
            }
            return ISO88591;
        }
        if (canBeISO88591) {
            return ISO88591;
        }
        if (canBeShiftJIS) {
            return SHIFT_JIS;
        }
        if (canBeUTF8) {
            return str;
        }
        return PLATFORM_DEFAULT_ENCODING;
    }
}
