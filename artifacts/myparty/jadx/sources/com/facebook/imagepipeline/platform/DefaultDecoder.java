package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import androidx.core.util.Pools;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import com.facebook.common.memory.DecodeBufferHelper;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.ResourceReleaser;
import com.facebook.common.streams.LimitedInputStream;
import com.facebook.common.streams.TailAppendingInputStream;
import com.facebook.imagepipeline.bitmaps.SimpleBitmapReleaser;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.memory.BitmapPool;
import com.facebook.imagepipeline.memory.DummyBitmapPool;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;

/* loaded from: classes4.dex */
public abstract class DefaultDecoder implements PlatformDecoder {
    private boolean mAvoidPoolGet;
    private boolean mAvoidPoolRelease;
    private final BitmapPool mBitmapPool;
    final Pools.Pool<ByteBuffer> mDecodeBuffers;

    @Nullable
    private final PreverificationHelper mPreverificationHelper;
    private static final Class<?> TAG = DefaultDecoder.class;
    private static final byte[] EOI_TAIL = {-1, -39};

    public abstract int getBitmapSize(int i, int i2, BitmapFactory.Options options);

    public DefaultDecoder(BitmapPool bitmapPool, Pools.Pool<ByteBuffer> pool, PlatformDecoderOptions platformDecoderOptions) {
        this.mPreverificationHelper = Build.VERSION.SDK_INT >= 26 ? new PreverificationHelper() : null;
        this.mBitmapPool = bitmapPool;
        if (bitmapPool instanceof DummyBitmapPool) {
            this.mAvoidPoolGet = platformDecoderOptions.getAvoidPoolGet();
            this.mAvoidPoolRelease = platformDecoderOptions.getAvoidPoolRelease();
        }
        this.mDecodeBuffers = pool;
    }

    @Override // com.facebook.imagepipeline.platform.PlatformDecoder
    @Nullable
    public CloseableReference<Bitmap> decodeFromEncodedImage(EncodedImage encodedImage, Bitmap.Config config, @Nullable Rect rect) {
        return decodeFromEncodedImageWithColorSpace(encodedImage, config, rect, null);
    }

    @Override // com.facebook.imagepipeline.platform.PlatformDecoder
    @Nullable
    public CloseableReference<Bitmap> decodeJPEGFromEncodedImage(EncodedImage encodedImage, Bitmap.Config config, @Nullable Rect rect, int i) {
        return decodeJPEGFromEncodedImageWithColorSpace(encodedImage, config, rect, i, null);
    }

    @Override // com.facebook.imagepipeline.platform.PlatformDecoder
    @Nullable
    public CloseableReference<Bitmap> decodeFromEncodedImageWithColorSpace(EncodedImage encodedImage, Bitmap.Config config, @Nullable Rect rect, @Nullable ColorSpace colorSpace) {
        BitmapFactory.Options decodeOptionsForStream = getDecodeOptionsForStream(encodedImage, config, this.mAvoidPoolGet);
        boolean z = decodeOptionsForStream.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return decodeFromStream((InputStream) Preconditions.checkNotNull(encodedImage.getInputStream()), decodeOptionsForStream, rect, colorSpace);
        } catch (RuntimeException e) {
            if (z) {
                return decodeFromEncodedImageWithColorSpace(encodedImage, Bitmap.Config.ARGB_8888, rect, colorSpace);
            }
            throw e;
        }
    }

    @Override // com.facebook.imagepipeline.platform.PlatformDecoder
    @Nullable
    public CloseableReference<Bitmap> decodeJPEGFromEncodedImageWithColorSpace(EncodedImage encodedImage, Bitmap.Config config, @Nullable Rect rect, int i, @Nullable ColorSpace colorSpace) throws IOException {
        boolean zIsCompleteAt = encodedImage.isCompleteAt(i);
        BitmapFactory.Options decodeOptionsForStream = getDecodeOptionsForStream(encodedImage, config, this.mAvoidPoolGet);
        InputStream inputStream = encodedImage.getInputStream();
        Preconditions.checkNotNull(inputStream);
        if (encodedImage.getSize() > i) {
            inputStream = new LimitedInputStream(inputStream, i);
        }
        if (!zIsCompleteAt) {
            inputStream = new TailAppendingInputStream(inputStream, EOI_TAIL);
        }
        boolean z = decodeOptionsForStream.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            try {
                CloseableReference<Bitmap> closeableReferenceDecodeFromStream = decodeFromStream(inputStream, decodeOptionsForStream, rect, colorSpace);
                try {
                    inputStream.close();
                    return closeableReferenceDecodeFromStream;
                } catch (IOException e) {
                    e.printStackTrace();
                    return closeableReferenceDecodeFromStream;
                }
            } catch (RuntimeException e2) {
                if (z) {
                    CloseableReference<Bitmap> closeableReferenceDecodeJPEGFromEncodedImageWithColorSpace = decodeJPEGFromEncodedImageWithColorSpace(encodedImage, Bitmap.Config.ARGB_8888, rect, i, colorSpace);
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                    return closeableReferenceDecodeJPEGFromEncodedImageWithColorSpace;
                }
                throw e2;
            }
        } finally {
        }
    }

    @Nullable
    protected CloseableReference<Bitmap> decodeStaticImageFromStream(InputStream inputStream, BitmapFactory.Options options, @Nullable Rect rect) {
        return decodeFromStream(inputStream, options, rect, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c0 A[Catch: all -> 0x00f1, RuntimeException -> 0x00f3, IllegalArgumentException -> 0x00fc, TRY_LEAVE, TryCatch #5 {RuntimeException -> 0x00f3, blocks: (B:36:0x007c, B:39:0x0086, B:47:0x009d, B:62:0x00c0, B:54:0x00b1, B:58:0x00b9, B:59:0x00bc), top: B:96:0x007c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ea  */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private CloseableReference<Bitmap> decodeFromStream(InputStream inputStream, BitmapFactory.Options options, @Nullable Rect rect, @Nullable ColorSpace colorSpace) {
        Bitmap bitmap;
        ByteBuffer byteBufferAcquire;
        Bitmap bitmapDecodeStream;
        BitmapRegionDecoder bitmapRegionDecoderNewInstance;
        PreverificationHelper preverificationHelper;
        Preconditions.checkNotNull(inputStream);
        int i = options.outWidth;
        int iHeight = options.outHeight;
        ?? r0 = i;
        if (rect != null) {
            int iWidth = rect.width() / options.inSampleSize;
            iHeight = rect.height() / options.inSampleSize;
            r0 = iWidth;
        }
        boolean z = Build.VERSION.SDK_INT >= 26 && (preverificationHelper = this.mPreverificationHelper) != null && preverificationHelper.shouldUseHardwareBitmapConfig(options.inPreferredConfig);
        BitmapRegionDecoder bitmapRegionDecoder = null;
        try {
            try {
                try {
                    if (rect == null && z) {
                        options.inMutable = false;
                    } else {
                        if (rect != null && z) {
                            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        }
                        if (!this.mAvoidPoolGet) {
                            Bitmap bitmap2 = this.mBitmapPool.get(getBitmapSize(r0, iHeight, options));
                            bitmap = bitmap2;
                            if (bitmap2 == null) {
                                throw new NullPointerException("BitmapPool.get returned null");
                            }
                        }
                        options.inBitmap = bitmap;
                        if (Build.VERSION.SDK_INT >= 26) {
                            if (colorSpace == null) {
                                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                            }
                            options.inPreferredColorSpace = colorSpace;
                        }
                        byteBufferAcquire = this.mDecodeBuffers.acquire();
                        if (byteBufferAcquire == null) {
                            byteBufferAcquire = ByteBuffer.allocate(DecodeBufferHelper.getRecommendedDecodeBufferSize());
                        }
                        options.inTempStorage = byteBufferAcquire.array();
                        if (rect != null || bitmap == 0) {
                            bitmapDecodeStream = null;
                        } else {
                            try {
                                if (options.inPreferredConfig != null) {
                                    try {
                                        bitmap.reconfigure(r0, iHeight, options.inPreferredConfig);
                                        bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStream, true);
                                        if (bitmapRegionDecoderNewInstance != null) {
                                            try {
                                                bitmapDecodeStream = bitmapRegionDecoderNewInstance.decodeRegion(rect, options);
                                            } catch (IOException unused) {
                                                FLog.e(TAG, "Could not decode region %s, decoding full bitmap instead.", rect);
                                                if (bitmapRegionDecoderNewInstance != null) {
                                                    bitmapRegionDecoderNewInstance.recycle();
                                                }
                                                bitmapDecodeStream = null;
                                                if (bitmapDecodeStream == null) {
                                                }
                                                this.mDecodeBuffers.release(byteBufferAcquire);
                                                if (bitmap == 0) {
                                                }
                                                if (this.mAvoidPoolRelease) {
                                                }
                                            }
                                        } else {
                                            bitmapDecodeStream = null;
                                        }
                                        if (bitmapRegionDecoderNewInstance != null) {
                                            bitmapRegionDecoderNewInstance.recycle();
                                        }
                                    } catch (IOException unused2) {
                                        bitmapRegionDecoderNewInstance = null;
                                    } catch (Throwable th) {
                                        th = th;
                                        if (bitmapRegionDecoder != null) {
                                            bitmapRegionDecoder.recycle();
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                bitmapRegionDecoder = r0;
                            }
                        }
                        if (bitmapDecodeStream == null) {
                            bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                        }
                        this.mDecodeBuffers.release(byteBufferAcquire);
                        if (bitmap == 0 && bitmap != bitmapDecodeStream) {
                            this.mBitmapPool.release(bitmap);
                            if (bitmapDecodeStream != null) {
                                bitmapDecodeStream.recycle();
                            }
                            throw new IllegalStateException();
                        }
                        if (this.mAvoidPoolRelease) {
                            return CloseableReference.of(bitmapDecodeStream, NoOpResourceReleaser.INSTANCE);
                        }
                        return CloseableReference.of(bitmapDecodeStream, this.mBitmapPool);
                    }
                    options.inTempStorage = byteBufferAcquire.array();
                    if (rect != null) {
                        bitmapDecodeStream = null;
                    }
                    if (bitmapDecodeStream == null) {
                    }
                    this.mDecodeBuffers.release(byteBufferAcquire);
                    if (bitmap == 0) {
                    }
                    if (this.mAvoidPoolRelease) {
                    }
                } catch (Throwable th3) {
                    this.mDecodeBuffers.release(byteBufferAcquire);
                    throw th3;
                }
            } catch (RuntimeException e) {
                if (bitmap != 0) {
                    this.mBitmapPool.release(bitmap);
                }
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            if (bitmap != 0) {
                this.mBitmapPool.release(bitmap);
            }
            try {
                inputStream.reset();
                Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(inputStream);
                if (bitmapDecodeStream2 == null) {
                    throw e2;
                }
                CloseableReference<Bitmap> closeableReferenceOf = CloseableReference.of(bitmapDecodeStream2, SimpleBitmapReleaser.getInstance());
                this.mDecodeBuffers.release(byteBufferAcquire);
                return closeableReferenceOf;
            } catch (IOException unused3) {
                throw e2;
            }
        }
        bitmap = 0;
        options.inBitmap = bitmap;
        if (Build.VERSION.SDK_INT >= 26) {
        }
        byteBufferAcquire = this.mDecodeBuffers.acquire();
        if (byteBufferAcquire == null) {
        }
    }

    private static BitmapFactory.Options getDecodeOptionsForStream(EncodedImage encodedImage, Bitmap.Config config, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = encodedImage.getSampleSize();
        options.inJustDecodeBounds = true;
        options.inDither = true;
        boolean z2 = Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
        if (!z2) {
            options.inPreferredConfig = config;
        }
        options.inMutable = true;
        if (!z) {
            BitmapFactory.decodeStream(encodedImage.getInputStream(), null, options);
            if (options.outWidth == -1 || options.outHeight == -1) {
                throw new IllegalArgumentException();
            }
        }
        if (z2) {
            options.inPreferredConfig = config;
        }
        options.inJustDecodeBounds = false;
        return options;
    }

    private static final class NoOpResourceReleaser implements ResourceReleaser<Bitmap> {
        private static final NoOpResourceReleaser INSTANCE = new NoOpResourceReleaser();

        @Override // com.facebook.common.references.ResourceReleaser
        public void release(Bitmap bitmap) {
        }

        private NoOpResourceReleaser() {
        }
    }
}
