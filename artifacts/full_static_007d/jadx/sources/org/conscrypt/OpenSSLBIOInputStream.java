package org.conscrypt;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
class OpenSSLBIOInputStream extends FilterInputStream {
    private long ctx;

    public OpenSSLBIOInputStream(InputStream inputStream, boolean z2) {
        super(inputStream);
        this.ctx = NativeCrypto.create_BIO_InputStream(this, z2);
    }

    public long getBioContext() {
        return this.ctx;
    }

    public int gets(byte[] bArr) {
        int i2;
        int i3 = 0;
        if (bArr != null && bArr.length != 0) {
            while (i3 < bArr.length && (i2 = read()) != -1) {
                if (i2 != 10) {
                    bArr[i3] = (byte) i2;
                    i3++;
                } else if (i3 != 0) {
                    break;
                }
            }
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public void release() {
        NativeCrypto.BIO_free_all(this.ctx);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        if (i2 < 0 || i3 < 0 || i3 > bArr.length - i2) {
            throw new IndexOutOfBoundsException("Invalid bounds");
        }
        int i4 = 0;
        if (i3 == 0) {
            return 0;
        }
        do {
            int i5 = super.read(bArr, i2 + i4, (i3 - i4) - i2);
            if (i5 == -1) {
                break;
            }
            i4 += i5;
        } while (i2 + i4 < i3);
        if (i4 == 0) {
            return -1;
        }
        return i4;
    }
}
