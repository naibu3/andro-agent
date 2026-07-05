package com.google.zxing.pdf417.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.pdf417.PDF417Common;
import com.google.zxing.pdf417.decoder.ec.ErrorCorrection;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Formatter;
import java.util.List;

/* loaded from: classes2.dex */
public final class PDF417ScanningDecoder {
    private static final int CODEWORD_SKEW_SIZE = 2;
    private static final int MAX_EC_CODEWORDS = 512;
    private static final int MAX_ERRORS = 3;
    private static final ErrorCorrection errorCorrection = new ErrorCorrection();

    private PDF417ScanningDecoder() {
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static DecoderResult decode(BitMatrix image, ResultPoint imageTopLeft, ResultPoint imageBottomLeft, ResultPoint imageTopRight, ResultPoint imageBottomRight, int minCodewordWidth, int maxCodewordWidth) throws NotFoundException, ChecksumException, FormatException {
        BoundingBox boundingBox;
        DetectionResultRowIndicatorColumn rightRowIndicatorColumn;
        DetectionResult detectionResult;
        DetectionResultColumn detectionResultColumn;
        int barcodeColumn;
        DetectionResultColumn detectionResultColumn2;
        int barcodeColumn2;
        Codeword codeword;
        BoundingBox boundingBox2 = new BoundingBox(image, imageTopLeft, imageBottomLeft, imageTopRight, imageBottomRight);
        DetectionResultRowIndicatorColumn rightRowIndicatorColumn2 = null;
        DetectionResult detectionResult2 = null;
        BoundingBox boundingBox3 = boundingBox2;
        DetectionResultRowIndicatorColumn leftRowIndicatorColumn = null;
        for (int i = 0; i < 2; i++) {
            if (imageTopLeft != null) {
                leftRowIndicatorColumn = getRowIndicatorColumn(image, boundingBox3, imageTopLeft, true, minCodewordWidth, maxCodewordWidth);
            }
            if (imageTopRight == null) {
                boundingBox = boundingBox3;
            } else {
                boundingBox = boundingBox3;
                rightRowIndicatorColumn2 = getRowIndicatorColumn(image, boundingBox3, imageTopRight, false, minCodewordWidth, maxCodewordWidth);
            }
            DetectionResult detectionResultMerge = merge(leftRowIndicatorColumn, rightRowIndicatorColumn2);
            detectionResult2 = detectionResultMerge;
            if (detectionResultMerge == null) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (i == 0 && detectionResult2.getBoundingBox() != null && (detectionResult2.getBoundingBox().getMinY() < boundingBox.getMinY() || detectionResult2.getBoundingBox().getMaxY() > boundingBox.getMaxY())) {
                boundingBox3 = detectionResult2.getBoundingBox();
            } else {
                detectionResult2.setBoundingBox(boundingBox);
                rightRowIndicatorColumn = rightRowIndicatorColumn2;
                detectionResult = detectionResult2;
                break;
            }
        }
        boundingBox = boundingBox3;
        rightRowIndicatorColumn = rightRowIndicatorColumn2;
        detectionResult = detectionResult2;
        int maxBarcodeColumn = detectionResult.getBarcodeColumnCount() + 1;
        detectionResult.setDetectionResultColumn(0, leftRowIndicatorColumn);
        detectionResult.setDetectionResultColumn(maxBarcodeColumn, rightRowIndicatorColumn);
        boolean leftToRight = leftRowIndicatorColumn != null;
        int previousStartColumn = maxCodewordWidth;
        Codeword codeword2 = null;
        int minCodewordWidth2 = minCodewordWidth;
        for (int barcodeColumnCount = 1; barcodeColumnCount <= maxBarcodeColumn; barcodeColumnCount++) {
            int barcodeColumn3 = leftToRight ? barcodeColumnCount : maxBarcodeColumn - barcodeColumnCount;
            if (detectionResult.getDetectionResultColumn(barcodeColumn3) == null) {
                if (barcodeColumn3 == 0 || barcodeColumn3 == maxBarcodeColumn) {
                    detectionResultColumn = new DetectionResultRowIndicatorColumn(boundingBox, barcodeColumn3 == 0);
                } else {
                    detectionResultColumn = new DetectionResultColumn(boundingBox);
                }
                detectionResult.setDetectionResultColumn(barcodeColumn3, detectionResultColumn);
                int maxCodewordWidth2 = previousStartColumn;
                int previousStartColumn2 = -1;
                Codeword codeword3 = codeword2;
                int imageRow = boundingBox.getMinY();
                while (imageRow <= boundingBox.getMaxY()) {
                    int startColumn = getStartColumn(detectionResult, barcodeColumn3, imageRow, leftToRight);
                    int startColumn2 = startColumn;
                    if (startColumn < 0 || startColumn2 > boundingBox.getMaxX()) {
                        if (previousStartColumn2 != -1) {
                            startColumn2 = previousStartColumn2;
                            int previousStartColumn3 = previousStartColumn2;
                            int previousStartColumn4 = boundingBox.getMinX();
                            barcodeColumn = barcodeColumn3;
                            barcodeColumn2 = imageRow;
                            int imageRow2 = startColumn2;
                            detectionResultColumn2 = detectionResultColumn;
                            int minCodewordWidth3 = minCodewordWidth2;
                            codeword = detectCodeword(image, previousStartColumn4, boundingBox.getMaxX(), leftToRight, imageRow2, barcodeColumn2, minCodewordWidth3, maxCodewordWidth2);
                            if (codeword != null) {
                                codeword3 = codeword;
                                minCodewordWidth2 = minCodewordWidth3;
                                previousStartColumn2 = previousStartColumn3;
                            } else {
                                detectionResultColumn2.setCodeword(barcodeColumn2, codeword);
                                previousStartColumn2 = imageRow2;
                                codeword3 = codeword;
                                minCodewordWidth2 = Math.min(minCodewordWidth3, codeword.getWidth());
                                maxCodewordWidth2 = Math.max(maxCodewordWidth2, codeword.getWidth());
                            }
                        } else {
                            barcodeColumn = barcodeColumn3;
                            detectionResultColumn2 = detectionResultColumn;
                            barcodeColumn2 = imageRow;
                        }
                    } else {
                        int previousStartColumn32 = previousStartColumn2;
                        int previousStartColumn42 = boundingBox.getMinX();
                        barcodeColumn = barcodeColumn3;
                        barcodeColumn2 = imageRow;
                        int imageRow22 = startColumn2;
                        detectionResultColumn2 = detectionResultColumn;
                        int minCodewordWidth32 = minCodewordWidth2;
                        codeword = detectCodeword(image, previousStartColumn42, boundingBox.getMaxX(), leftToRight, imageRow22, barcodeColumn2, minCodewordWidth32, maxCodewordWidth2);
                        if (codeword != null) {
                        }
                    }
                    imageRow = barcodeColumn2 + 1;
                    detectionResultColumn = detectionResultColumn2;
                    barcodeColumn3 = barcodeColumn;
                }
                previousStartColumn = maxCodewordWidth2;
                codeword2 = codeword3;
            }
        }
        return createDecoderResult(detectionResult);
    }

    private static DetectionResult merge(DetectionResultRowIndicatorColumn leftRowIndicatorColumn, DetectionResultRowIndicatorColumn rightRowIndicatorColumn) throws NotFoundException {
        BarcodeMetadata barcodeMetadata;
        if ((leftRowIndicatorColumn == null && rightRowIndicatorColumn == null) || (barcodeMetadata = getBarcodeMetadata(leftRowIndicatorColumn, rightRowIndicatorColumn)) == null) {
            return null;
        }
        BoundingBox boundingBox = BoundingBox.merge(adjustBoundingBox(leftRowIndicatorColumn), adjustBoundingBox(rightRowIndicatorColumn));
        return new DetectionResult(barcodeMetadata, boundingBox);
    }

    private static BoundingBox adjustBoundingBox(DetectionResultRowIndicatorColumn rowIndicatorColumn) throws NotFoundException {
        int[] rowHeights;
        if (rowIndicatorColumn == null || (rowHeights = rowIndicatorColumn.getRowHeights()) == null) {
            return null;
        }
        int maxRowHeight = getMax(rowHeights);
        int missingStartRows = 0;
        for (int rowHeight : rowHeights) {
            missingStartRows += maxRowHeight - rowHeight;
            if (rowHeight > 0) {
                break;
            }
        }
        Codeword[] codewords = rowIndicatorColumn.getCodewords();
        for (int row = 0; missingStartRows > 0 && codewords[row] == null; row++) {
            missingStartRows--;
        }
        int missingEndRows = 0;
        for (int row2 = rowHeights.length - 1; row2 >= 0; row2--) {
            missingEndRows += maxRowHeight - rowHeights[row2];
            if (rowHeights[row2] > 0) {
                break;
            }
        }
        int row3 = codewords.length;
        for (int row4 = row3 - 1; missingEndRows > 0 && codewords[row4] == null; row4--) {
            missingEndRows--;
        }
        return rowIndicatorColumn.getBoundingBox().addMissingRows(missingStartRows, missingEndRows, rowIndicatorColumn.isLeft());
    }

    private static int getMax(int[] values) {
        int maxValue = -1;
        for (int value : values) {
            maxValue = Math.max(maxValue, value);
        }
        return maxValue;
    }

    private static BarcodeMetadata getBarcodeMetadata(DetectionResultRowIndicatorColumn leftRowIndicatorColumn, DetectionResultRowIndicatorColumn rightRowIndicatorColumn) {
        BarcodeMetadata leftBarcodeMetadata;
        BarcodeMetadata rightBarcodeMetadata;
        if (leftRowIndicatorColumn == null || (leftBarcodeMetadata = leftRowIndicatorColumn.getBarcodeMetadata()) == null) {
            if (rightRowIndicatorColumn == null) {
                return null;
            }
            return rightRowIndicatorColumn.getBarcodeMetadata();
        }
        if (rightRowIndicatorColumn == null || (rightBarcodeMetadata = rightRowIndicatorColumn.getBarcodeMetadata()) == null || leftBarcodeMetadata.getColumnCount() == rightBarcodeMetadata.getColumnCount() || leftBarcodeMetadata.getErrorCorrectionLevel() == rightBarcodeMetadata.getErrorCorrectionLevel() || leftBarcodeMetadata.getRowCount() == rightBarcodeMetadata.getRowCount()) {
            return leftBarcodeMetadata;
        }
        return null;
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x001f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static DetectionResultRowIndicatorColumn getRowIndicatorColumn(BitMatrix image, BoundingBox boundingBox, ResultPoint startPoint, boolean leftToRight, int minCodewordWidth, int maxCodewordWidth) {
        DetectionResultRowIndicatorColumn rowIndicatorColumn = new DetectionResultRowIndicatorColumn(boundingBox, leftToRight);
        int i = 0;
        while (i < 2) {
            int increment = i == 0 ? 1 : -1;
            int startColumn = (int) startPoint.getX();
            int startColumn2 = startColumn;
            for (int imageRow = (int) startPoint.getY(); imageRow <= startColumn && imageRow >= boundingBox.getMinY(); imageRow += increment) {
                Codeword codeword = detectCodeword(image, 0, image.getWidth(), leftToRight, startColumn2, imageRow, minCodewordWidth, maxCodewordWidth);
                if (codeword != null) {
                    rowIndicatorColumn.setCodeword(imageRow, codeword);
                    if (leftToRight) {
                        startColumn2 = codeword.getStartX();
                    } else {
                        int startColumn3 = codeword.getEndX();
                        startColumn2 = startColumn3;
                    }
                }
            }
            i++;
        }
        return rowIndicatorColumn;
    }

    private static void adjustCodewordCount(DetectionResult detectionResult, BarcodeValue[][] barcodeMatrix) throws NotFoundException {
        BarcodeValue barcodeMatrix01 = barcodeMatrix[0][1];
        int[] numberOfCodewords = barcodeMatrix01.getValue();
        int calculatedNumberOfCodewords = (detectionResult.getBarcodeColumnCount() * detectionResult.getBarcodeRowCount()) - getNumberOfECCodeWords(detectionResult.getBarcodeECLevel());
        if (numberOfCodewords.length == 0) {
            if (calculatedNumberOfCodewords <= 0 || calculatedNumberOfCodewords > 928) {
                throw NotFoundException.getNotFoundInstance();
            }
            barcodeMatrix01.setValue(calculatedNumberOfCodewords);
            return;
        }
        if (numberOfCodewords[0] != calculatedNumberOfCodewords) {
            barcodeMatrix01.setValue(calculatedNumberOfCodewords);
        }
    }

    private static DecoderResult createDecoderResult(DetectionResult detectionResult) throws NotFoundException, ChecksumException, FormatException {
        BarcodeValue[][] barcodeMatrix = createBarcodeMatrix(detectionResult);
        adjustCodewordCount(detectionResult, barcodeMatrix);
        Collection<Integer> erasures = new ArrayList<>();
        int[] codewords = new int[detectionResult.getBarcodeRowCount() * detectionResult.getBarcodeColumnCount()];
        List<int[]> ambiguousIndexValuesList = new ArrayList<>();
        List<Integer> ambiguousIndexesList = new ArrayList<>();
        for (int row = 0; row < detectionResult.getBarcodeRowCount(); row++) {
            for (int column = 0; column < detectionResult.getBarcodeColumnCount(); column++) {
                int[] values = barcodeMatrix[row][column + 1].getValue();
                int codewordIndex = (detectionResult.getBarcodeColumnCount() * row) + column;
                if (values.length == 0) {
                    erasures.add(Integer.valueOf(codewordIndex));
                } else if (values.length == 1) {
                    codewords[codewordIndex] = values[0];
                } else {
                    ambiguousIndexesList.add(Integer.valueOf(codewordIndex));
                    ambiguousIndexValuesList.add(values);
                }
            }
        }
        int row2 = ambiguousIndexValuesList.size();
        int[][] ambiguousIndexValues = new int[row2][];
        for (int i = 0; i < ambiguousIndexValues.length; i++) {
            ambiguousIndexValues[i] = ambiguousIndexValuesList.get(i);
        }
        int i2 = detectionResult.getBarcodeECLevel();
        return createDecoderResultFromAmbiguousValues(i2, codewords, PDF417Common.toIntArray(erasures), PDF417Common.toIntArray(ambiguousIndexesList), ambiguousIndexValues);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
    
        r1 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static DecoderResult createDecoderResultFromAmbiguousValues(int ecLevel, int[] codewords, int[] erasureArray, int[] ambiguousIndexes, int[][] ambiguousIndexValues) throws ChecksumException, FormatException {
        int[] ambiguousIndexCount = new int[ambiguousIndexes.length];
        int i = 100;
        while (true) {
            int tries = i - 1;
            if (i > 0) {
                for (int i2 = 0; i2 < ambiguousIndexCount.length; i2++) {
                    codewords[ambiguousIndexes[i2]] = ambiguousIndexValues[i2][ambiguousIndexCount[i2]];
                }
                try {
                    return decodeCodewords(codewords, ecLevel, erasureArray);
                } catch (ChecksumException e) {
                    if (ambiguousIndexCount.length == 0) {
                        throw ChecksumException.getChecksumInstance();
                    }
                    int i3 = 0;
                    while (true) {
                        if (i3 >= ambiguousIndexCount.length) {
                            break;
                        }
                        if (ambiguousIndexCount[i3] < ambiguousIndexValues[i3].length - 1) {
                            ambiguousIndexCount[i3] = ambiguousIndexCount[i3] + 1;
                            break;
                        }
                        ambiguousIndexCount[i3] = 0;
                        if (i3 != ambiguousIndexCount.length - 1) {
                            i3++;
                        } else {
                            throw ChecksumException.getChecksumInstance();
                        }
                    }
                }
            } else {
                throw ChecksumException.getChecksumInstance();
            }
        }
    }

    private static BarcodeValue[][] createBarcodeMatrix(DetectionResult detectionResult) {
        int rowNumber;
        BarcodeValue[][] barcodeMatrix = (BarcodeValue[][]) Array.newInstance((Class<?>) BarcodeValue.class, detectionResult.getBarcodeRowCount(), detectionResult.getBarcodeColumnCount() + 2);
        for (int row = 0; row < barcodeMatrix.length; row++) {
            for (int column = 0; column < barcodeMatrix[row].length; column++) {
                barcodeMatrix[row][column] = new BarcodeValue();
            }
        }
        int column2 = 0;
        for (DetectionResultColumn detectionResultColumn : detectionResult.getDetectionResultColumns()) {
            if (detectionResultColumn != null) {
                for (Codeword codeword : detectionResultColumn.getCodewords()) {
                    if (codeword != null && (rowNumber = codeword.getRowNumber()) >= 0 && rowNumber < barcodeMatrix.length) {
                        barcodeMatrix[rowNumber][column2].setValue(codeword.getValue());
                    }
                }
            }
            column2++;
        }
        return barcodeMatrix;
    }

    private static boolean isValidBarcodeColumn(DetectionResult detectionResult, int barcodeColumn) {
        return barcodeColumn >= 0 && barcodeColumn <= detectionResult.getBarcodeColumnCount() + 1;
    }

    private static int getStartColumn(DetectionResult detectionResult, int barcodeColumn, int imageRow, boolean leftToRight) {
        int offset = leftToRight ? 1 : -1;
        Codeword codeword = null;
        if (isValidBarcodeColumn(detectionResult, barcodeColumn - offset)) {
            codeword = detectionResult.getDetectionResultColumn(barcodeColumn - offset).getCodeword(imageRow);
        }
        if (codeword != null) {
            return leftToRight ? codeword.getEndX() : codeword.getStartX();
        }
        Codeword codewordNearby = detectionResult.getDetectionResultColumn(barcodeColumn).getCodewordNearby(imageRow);
        Codeword codeword2 = codewordNearby;
        if (codewordNearby != null) {
            return leftToRight ? codeword2.getStartX() : codeword2.getEndX();
        }
        if (isValidBarcodeColumn(detectionResult, barcodeColumn - offset)) {
            codeword2 = detectionResult.getDetectionResultColumn(barcodeColumn - offset).getCodewordNearby(imageRow);
        }
        if (codeword2 != null) {
            return leftToRight ? codeword2.getEndX() : codeword2.getStartX();
        }
        int skippedColumns = 0;
        while (isValidBarcodeColumn(detectionResult, barcodeColumn - offset)) {
            barcodeColumn -= offset;
            for (Codeword previousRowCodeword : detectionResult.getDetectionResultColumn(barcodeColumn).getCodewords()) {
                if (previousRowCodeword != null) {
                    return (leftToRight ? previousRowCodeword.getEndX() : previousRowCodeword.getStartX()) + (offset * skippedColumns * (previousRowCodeword.getEndX() - previousRowCodeword.getStartX()));
                }
            }
            skippedColumns++;
        }
        BoundingBox boundingBox = detectionResult.getBoundingBox();
        return leftToRight ? boundingBox.getMinX() : boundingBox.getMaxX();
    }

    private static Codeword detectCodeword(BitMatrix bitMatrix, int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        int i7;
        int decodedValue;
        int codeword;
        int iAdjustCodewordStartColumn = adjustCodewordStartColumn(bitMatrix, i, i2, z, i3, i4);
        int[] moduleBitCount = getModuleBitCount(bitMatrix, i, i2, z, iAdjustCodewordStartColumn, i4);
        if (moduleBitCount == null) {
            return null;
        }
        int iSum = MathUtils.sum(moduleBitCount);
        if (z) {
            i7 = iAdjustCodewordStartColumn + iSum;
        } else {
            for (int i8 = 0; i8 < moduleBitCount.length / 2; i8++) {
                int i9 = moduleBitCount[i8];
                moduleBitCount[i8] = moduleBitCount[(moduleBitCount.length - 1) - i8];
                moduleBitCount[(moduleBitCount.length - 1) - i8] = i9;
            }
            iAdjustCodewordStartColumn -= iSum;
            i7 = iAdjustCodewordStartColumn;
        }
        if (!checkCodewordSkew(iSum, i5, i6) || (codeword = PDF417Common.getCodeword((decodedValue = PDF417CodewordDecoder.getDecodedValue(moduleBitCount)))) == -1) {
            return null;
        }
        return new Codeword(iAdjustCodewordStartColumn, i7, getCodewordBucketNumber(decodedValue), codeword);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int[] getModuleBitCount(BitMatrix image, int minColumn, int maxColumn, boolean leftToRight, int startColumn, int imageRow) {
        int imageColumn = startColumn;
        int[] moduleBitCount = new int[8];
        int moduleNumber = 0;
        int increment = leftToRight ? 1 : -1;
        boolean previousPixelValue = leftToRight;
        while (true) {
            if (!leftToRight) {
                if (imageColumn < minColumn) {
                    break;
                }
            } else {
                if (imageColumn >= maxColumn) {
                    break;
                }
                if (moduleNumber >= 8) {
                    break;
                }
                if (image.get(imageColumn, imageRow) == previousPixelValue) {
                    moduleBitCount[moduleNumber] = moduleBitCount[moduleNumber] + 1;
                    imageColumn += increment;
                } else {
                    moduleNumber++;
                    previousPixelValue = !previousPixelValue;
                }
            }
        }
        if (moduleNumber != 8) {
            if (imageColumn != (leftToRight ? maxColumn : minColumn) || moduleNumber != 7) {
                return null;
            }
        }
        return moduleBitCount;
    }

    private static int getNumberOfECCodeWords(int barcodeECLevel) {
        return 2 << barcodeECLevel;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int adjustCodewordStartColumn(BitMatrix image, int minColumn, int maxColumn, boolean leftToRight, int codewordStartColumn, int imageRow) {
        int correctedStartColumn = codewordStartColumn;
        int increment = leftToRight ? -1 : 1;
        for (int i = 0; i < 2; i++) {
            while (true) {
                if (!leftToRight) {
                    if (correctedStartColumn >= maxColumn) {
                        break;
                    }
                } else {
                    if (correctedStartColumn < minColumn) {
                        break;
                    }
                    if (leftToRight != image.get(correctedStartColumn, imageRow)) {
                        break;
                    }
                    if (Math.abs(codewordStartColumn - correctedStartColumn) > 2) {
                        return codewordStartColumn;
                    }
                    correctedStartColumn += increment;
                }
            }
            increment = -increment;
            leftToRight = !leftToRight;
        }
        return correctedStartColumn;
    }

    private static boolean checkCodewordSkew(int codewordSize, int minCodewordWidth, int maxCodewordWidth) {
        return minCodewordWidth + (-2) <= codewordSize && codewordSize <= maxCodewordWidth + 2;
    }

    private static DecoderResult decodeCodewords(int[] codewords, int ecLevel, int[] erasures) throws ChecksumException, FormatException {
        if (codewords.length == 0) {
            throw FormatException.getFormatInstance();
        }
        int numECCodewords = 1 << (ecLevel + 1);
        int correctedErrorsCount = correctErrors(codewords, erasures, numECCodewords);
        verifyCodewordCount(codewords, numECCodewords);
        DecoderResult decoderResult = DecodedBitStreamParser.decode(codewords, String.valueOf(ecLevel));
        decoderResult.setErrorsCorrected(Integer.valueOf(correctedErrorsCount));
        decoderResult.setErasures(Integer.valueOf(erasures.length));
        return decoderResult;
    }

    private static int correctErrors(int[] codewords, int[] erasures, int numECCodewords) throws ChecksumException {
        if ((erasures != null && erasures.length > (numECCodewords / 2) + 3) || numECCodewords < 0 || numECCodewords > 512) {
            throw ChecksumException.getChecksumInstance();
        }
        return errorCorrection.decode(codewords, numECCodewords, erasures);
    }

    private static void verifyCodewordCount(int[] codewords, int numECCodewords) throws FormatException {
        if (codewords.length < 4) {
            throw FormatException.getFormatInstance();
        }
        int numberOfCodewords = codewords[0];
        if (numberOfCodewords > codewords.length) {
            throw FormatException.getFormatInstance();
        }
        if (numberOfCodewords == 0) {
            if (numECCodewords < codewords.length) {
                codewords[0] = codewords.length - numECCodewords;
                return;
            }
            throw FormatException.getFormatInstance();
        }
    }

    private static int[] getBitCountForCodeword(int codeword) {
        int[] result = new int[8];
        int previousValue = 0;
        int i = 7;
        while (true) {
            if ((codeword & 1) != previousValue) {
                previousValue = codeword & 1;
                i--;
                if (i < 0) {
                    return result;
                }
            }
            result[i] = result[i] + 1;
            codeword >>= 1;
        }
    }

    private static int getCodewordBucketNumber(int codeword) {
        return getCodewordBucketNumber(getBitCountForCodeword(codeword));
    }

    private static int getCodewordBucketNumber(int[] moduleBitCount) {
        return ((((moduleBitCount[0] - moduleBitCount[2]) + moduleBitCount[4]) - moduleBitCount[6]) + 9) % 9;
    }

    public static String toString(BarcodeValue[][] barcodeMatrix) {
        Formatter formatter = new Formatter();
        for (int row = 0; row < barcodeMatrix.length; row++) {
            try {
                formatter.format("Row %2d: ", Integer.valueOf(row));
                for (int column = 0; column < barcodeMatrix[row].length; column++) {
                    BarcodeValue barcodeValue = barcodeMatrix[row][column];
                    if (barcodeValue.getValue().length == 0) {
                        formatter.format("        ", null);
                    } else {
                        formatter.format("%4d(%2d)", Integer.valueOf(barcodeValue.getValue()[0]), barcodeValue.getConfidence(barcodeValue.getValue()[0]));
                    }
                }
                formatter.format("%n", new Object[0]);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        formatter.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        String string = formatter.toString();
        formatter.close();
        return string;
    }
}
