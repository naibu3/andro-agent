package com.google.zxing.aztec;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.aztec.decoder.Decoder;
import com.google.zxing.aztec.detector.Detector;
import com.google.zxing.common.DecoderResult;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class AztecReader implements Reader {
    @Override // com.google.zxing.Reader
    public void reset() {
    }

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap) throws NotFoundException, FormatException {
        return decode(binaryBitmap, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062 A[LOOP:0: B:34:0x0060->B:35:0x0062, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    @Override // com.google.zxing.Reader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        ResultPoint[] points;
        NotFoundException notFoundException;
        ResultPoint[] resultPointArr;
        FormatException formatException;
        ResultPoint[] resultPointArr2;
        List<byte[]> byteSegments;
        String eCLevel;
        ResultPointCallback resultPointCallback;
        Detector detector = new Detector(binaryBitmap.getBlackMatrix());
        DecoderResult decoderResultDecode = null;
        try {
            AztecDetectorResult aztecDetectorResultDetect = detector.detect(false);
            points = aztecDetectorResultDetect.getPoints();
            try {
                formatException = null;
                decoderResultDecode = new Decoder().decode(aztecDetectorResultDetect);
                resultPointArr = points;
                notFoundException = null;
            } catch (FormatException e) {
                e = e;
                formatException = e;
                resultPointArr = points;
                notFoundException = null;
                if (decoderResultDecode == null) {
                }
                if (map != null) {
                    while (i < r0) {
                    }
                }
                Result result = new Result(decoderResultDecode.getText(), decoderResultDecode.getRawBytes(), decoderResultDecode.getNumBits(), resultPointArr2, BarcodeFormat.AZTEC, System.currentTimeMillis());
                byteSegments = decoderResultDecode.getByteSegments();
                if (byteSegments != null) {
                }
                eCLevel = decoderResultDecode.getECLevel();
                if (eCLevel != null) {
                }
                return result;
            } catch (NotFoundException e2) {
                e = e2;
                ResultPoint[] resultPointArr3 = points;
                notFoundException = e;
                resultPointArr = resultPointArr3;
                formatException = null;
                if (decoderResultDecode == null) {
                }
                if (map != null) {
                }
                Result result2 = new Result(decoderResultDecode.getText(), decoderResultDecode.getRawBytes(), decoderResultDecode.getNumBits(), resultPointArr2, BarcodeFormat.AZTEC, System.currentTimeMillis());
                byteSegments = decoderResultDecode.getByteSegments();
                if (byteSegments != null) {
                }
                eCLevel = decoderResultDecode.getECLevel();
                if (eCLevel != null) {
                }
                return result2;
            }
        } catch (FormatException e3) {
            e = e3;
            points = null;
        } catch (NotFoundException e4) {
            e = e4;
            points = null;
        }
        if (decoderResultDecode == null) {
            try {
                AztecDetectorResult aztecDetectorResultDetect2 = detector.detect(true);
                ResultPoint[] points2 = aztecDetectorResultDetect2.getPoints();
                decoderResultDecode = new Decoder().decode(aztecDetectorResultDetect2);
                resultPointArr2 = points2;
            } catch (FormatException | NotFoundException e5) {
                if (notFoundException != null) {
                    throw notFoundException;
                }
                if (formatException != null) {
                    throw formatException;
                }
                throw e5;
            }
        } else {
            resultPointArr2 = resultPointArr;
        }
        if (map != null && (resultPointCallback = (ResultPointCallback) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK)) != null) {
            for (ResultPoint resultPoint : resultPointArr2) {
                resultPointCallback.foundPossibleResultPoint(resultPoint);
            }
        }
        Result result22 = new Result(decoderResultDecode.getText(), decoderResultDecode.getRawBytes(), decoderResultDecode.getNumBits(), resultPointArr2, BarcodeFormat.AZTEC, System.currentTimeMillis());
        byteSegments = decoderResultDecode.getByteSegments();
        if (byteSegments != null) {
            result22.putMetadata(ResultMetadataType.BYTE_SEGMENTS, byteSegments);
        }
        eCLevel = decoderResultDecode.getECLevel();
        if (eCLevel != null) {
            result22.putMetadata(ResultMetadataType.ERROR_CORRECTION_LEVEL, eCLevel);
        }
        return result22;
    }
}
