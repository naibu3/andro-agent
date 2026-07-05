package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.common.BitArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
public final class MultiFormatUPCEANReader extends OneDReader {
    private final UPCEANReader[] readers;

    public MultiFormatUPCEANReader(Map<DecodeHintType, ?> hints) {
        Collection<BarcodeFormat> possibleFormats = hints == null ? null : (Collection) hints.get(DecodeHintType.POSSIBLE_FORMATS);
        Collection<UPCEANReader> readers = new ArrayList<>();
        if (possibleFormats != null) {
            if (possibleFormats.contains(BarcodeFormat.EAN_13)) {
                readers.add(new EAN13Reader());
            } else if (possibleFormats.contains(BarcodeFormat.UPC_A)) {
                readers.add(new UPCAReader());
            }
            if (possibleFormats.contains(BarcodeFormat.EAN_8)) {
                readers.add(new EAN8Reader());
            }
            if (possibleFormats.contains(BarcodeFormat.UPC_E)) {
                readers.add(new UPCEReader());
            }
        }
        if (readers.isEmpty()) {
            readers.add(new EAN13Reader());
            readers.add(new EAN8Reader());
            readers.add(new UPCEReader());
        }
        this.readers = (UPCEANReader[]) readers.toArray(new UPCEANReader[readers.size()]);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    @Override // com.google.zxing.oned.OneDReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Result decodeRow(int rowNumber, BitArray row, Map<DecodeHintType, ?> hints) throws NotFoundException {
        int[] startGuardPattern;
        Map<DecodeHintType, ?> map = hints;
        int[] startGuardPattern2 = UPCEANReader.findStartGuardPattern(row);
        UPCEANReader[] uPCEANReaderArr = this.readers;
        int length = uPCEANReaderArr.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            UPCEANReader reader = uPCEANReaderArr[i2];
            try {
                Result result = reader.decodeRow(rowNumber, row, startGuardPattern2, map);
                if (result.getBarcodeFormat() == BarcodeFormat.EAN_13) {
                    try {
                        boolean ean13MayBeUPCA = result.getText().charAt(i) == '0';
                        Collection<BarcodeFormat> collection = map == null ? null : (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
                        Collection<BarcodeFormat> possibleFormats = collection;
                        boolean canReturnUPCA = collection == null || possibleFormats.contains(BarcodeFormat.UPC_A);
                        if (!ean13MayBeUPCA || !canReturnUPCA) {
                            return result;
                        }
                        startGuardPattern = startGuardPattern2;
                        try {
                            Result resultUPCA = new Result(result.getText().substring(1), result.getRawBytes(), result.getResultPoints(), BarcodeFormat.UPC_A);
                            try {
                                resultUPCA.putAllMetadata(result.getResultMetadata());
                                return resultUPCA;
                            } catch (ReaderException e) {
                            }
                        } catch (ReaderException e2) {
                        }
                    } catch (ReaderException e3) {
                        startGuardPattern = startGuardPattern2;
                    }
                }
            } catch (ReaderException e4) {
                startGuardPattern = startGuardPattern2;
            }
            i2++;
            map = hints;
            startGuardPattern2 = startGuardPattern;
            i = 0;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public void reset() {
        for (UPCEANReader uPCEANReader : this.readers) {
            uPCEANReader.reset();
        }
    }
}
