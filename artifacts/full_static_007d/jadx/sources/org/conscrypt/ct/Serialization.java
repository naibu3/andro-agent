package org.conscrypt.ct;

import A.e;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class Serialization {
    private static final int DER_LENGTH_LONG_FORM_FLAG = 128;
    private static final int DER_TAG_MASK = 63;
    private static final int DER_TAG_OCTET_STRING = 4;

    private Serialization() {
    }

    public static byte readByte(InputStream inputStream) throws IOException, SerializationException {
        try {
            int i2 = inputStream.read();
            if (i2 != -1) {
                return (byte) i2;
            }
            throw new SerializationException("Premature end of input, could not read byte.");
        } catch (IOException e2) {
            throw new SerializationException(e2);
        }
    }

    public static byte[] readDEROctetString(byte[] bArr) {
        return readDEROctetString(new ByteArrayInputStream(bArr));
    }

    public static byte[] readFixedBytes(InputStream inputStream, int i2) throws IOException, SerializationException {
        try {
            if (i2 < 0) {
                throw new SerializationException("Negative length: " + i2);
            }
            byte[] bArr = new byte[i2];
            int i3 = inputStream.read(bArr);
            if (i3 >= i2) {
                return bArr;
            }
            throw new SerializationException("Premature end of input, expected " + i2 + " bytes, only read " + i3);
        } catch (IOException e2) {
            throw new SerializationException(e2);
        }
    }

    public static byte[][] readList(byte[] bArr, int i2, int i3) {
        return readList(new ByteArrayInputStream(bArr), i2, i3);
    }

    public static long readLong(InputStream inputStream, int i2) {
        if (i2 > 8 || i2 < 0) {
            throw new IllegalArgumentException(e.a("Invalid width: ", i2));
        }
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = (j2 << 8) | (readByte(inputStream) & 255);
        }
        return j2;
    }

    public static int readNumber(InputStream inputStream, int i2) throws SerializationException {
        if (i2 > DER_TAG_OCTET_STRING || i2 < 0) {
            throw new SerializationException(e.a("Invalid width: ", i2));
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 << 8) | (readByte(inputStream) & 255);
        }
        return i3;
    }

    public static byte[] readVariableBytes(InputStream inputStream, int i2) {
        return readFixedBytes(inputStream, readNumber(inputStream, i2));
    }

    public static void writeFixedBytes(OutputStream outputStream, byte[] bArr) throws IOException, SerializationException {
        try {
            outputStream.write(bArr);
        } catch (IOException e2) {
            throw new SerializationException(e2);
        }
    }

    public static void writeNumber(OutputStream outputStream, long j2, int i2) throws IOException, SerializationException {
        if (i2 < 0) {
            throw new SerializationException(e.a("Negative width: ", i2));
        }
        if (i2 < 8 && j2 >= (1 << (i2 * 8))) {
            throw new SerializationException("Number too large, " + j2 + " does not fit in " + i2 + " bytes");
        }
        while (i2 > 0) {
            if ((i2 - 1) * 8 < 64) {
                try {
                    outputStream.write((byte) ((j2 >> ((int) r0)) & 255));
                } catch (IOException e2) {
                    throw new SerializationException(e2);
                }
            } else {
                outputStream.write(0);
            }
            i2--;
        }
    }

    public static void writeVariableBytes(OutputStream outputStream, byte[] bArr, int i2) throws IOException, SerializationException {
        writeNumber(outputStream, bArr.length, i2);
        writeFixedBytes(outputStream, bArr);
    }

    public static byte[] readDEROctetString(InputStream inputStream) throws SerializationException {
        int i2 = readByte(inputStream) & 63;
        if (i2 != DER_TAG_OCTET_STRING) {
            throw new SerializationException(e.a("Wrong DER tag, expected OCTET STRING, got ", i2));
        }
        int number = readNumber(inputStream, 1);
        if ((number & 128) != 0) {
            number = readNumber(inputStream, number & (-129));
        }
        return readFixedBytes(inputStream, number);
    }

    public static byte[][] readList(InputStream inputStream, int i2, int i3) throws SerializationException {
        ArrayList arrayList = new ArrayList();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(readVariableBytes(inputStream, i2));
        while (byteArrayInputStream.available() > 0) {
            try {
                arrayList.add(readVariableBytes(byteArrayInputStream, i3));
            } catch (IOException e2) {
                throw new SerializationException(e2);
            }
        }
        return (byte[][]) arrayList.toArray(new byte[arrayList.size()][]);
    }
}
