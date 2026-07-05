package org.conscrypt;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class BufferUtils {
    private BufferUtils() {
    }

    public static void checkNotNull(ByteBuffer[] byteBufferArr) {
        for (ByteBuffer byteBuffer : byteBufferArr) {
            if (byteBuffer == null) {
                throw new IllegalArgumentException("Null buffer in array");
            }
        }
    }

    public static void consume(ByteBuffer[] byteBufferArr, int i2) {
        for (ByteBuffer byteBuffer : byteBufferArr) {
            int iMin = Math.min(byteBuffer.remaining(), i2);
            if (iMin > 0) {
                byteBuffer.position(byteBuffer.position() + iMin);
                i2 -= iMin;
                if (i2 == 0) {
                    break;
                }
            }
        }
        if (i2 > 0) {
            throw new IllegalArgumentException("toConsume > data size");
        }
    }

    public static ByteBuffer copyNoConsume(ByteBuffer[] byteBufferArr, ByteBuffer byteBuffer, int i2) {
        Preconditions.checkArgument(byteBuffer.remaining() >= i2, "Destination buffer too small");
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            int iRemaining = byteBuffer2.remaining();
            if (iRemaining > 0) {
                int iPosition = byteBuffer2.position();
                if (iRemaining <= i2) {
                    byteBuffer.put(byteBuffer2);
                    i2 -= iRemaining;
                } else {
                    int iLimit = byteBuffer2.limit();
                    byteBuffer2.limit(byteBuffer2.position() + i2);
                    byteBuffer.put(byteBuffer2);
                    byteBuffer2.limit(iLimit);
                    i2 = 0;
                }
                byteBuffer2.position(iPosition);
                if (i2 == 0) {
                    break;
                }
            }
        }
        byteBuffer.flip();
        return byteBuffer;
    }

    public static ByteBuffer getBufferLargerThan(ByteBuffer[] byteBufferArr, int i2) {
        int length = byteBufferArr.length;
        int i3 = 0;
        while (i3 < length) {
            ByteBuffer byteBuffer = byteBufferArr[i3];
            int iRemaining = byteBuffer.remaining();
            if (iRemaining > 0) {
                if (iRemaining >= i2) {
                    return byteBuffer;
                }
                do {
                    i3++;
                    if (i3 >= length) {
                        return byteBuffer;
                    }
                } while (byteBufferArr[i3].remaining() <= 0);
                return null;
            }
            i3++;
        }
        return null;
    }

    public static long remaining(ByteBuffer[] byteBufferArr) {
        long jRemaining = 0;
        for (ByteBuffer byteBuffer : byteBufferArr) {
            jRemaining += byteBuffer.remaining();
        }
        return jRemaining;
    }
}
