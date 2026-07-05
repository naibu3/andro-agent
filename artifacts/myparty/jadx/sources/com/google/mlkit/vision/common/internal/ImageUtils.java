package com.google.mlkit.vision.common.internal;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes5.dex */
public class ImageUtils {
    private static final GmsLogger zza = new GmsLogger("MLKitImageUtils", "");
    private static final ImageUtils zzb = new ImageUtils();

    private ImageUtils() {
    }

    public static ImageUtils getInstance() {
        return zzb;
    }

    public IObjectWrapper getImageDataWrapper(InputImage inputImage) throws MlKitException {
        int format = inputImage.getFormat();
        if (format == -1) {
            return ObjectWrapper.wrap((Bitmap) Preconditions.checkNotNull(inputImage.getBitmapInternal()));
        }
        if (format != 17) {
            if (format == 35) {
                return ObjectWrapper.wrap(inputImage.getMediaImage());
            }
            if (format != 842094169) {
                throw new MlKitException("Unsupported image format: " + inputImage.getFormat(), 3);
            }
        }
        return ObjectWrapper.wrap((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer()));
    }

    public int getMobileVisionImageFormat(InputImage inputImage) {
        return inputImage.getFormat();
    }

    public int getMobileVisionImageSize(InputImage inputImage) {
        if (inputImage.getFormat() == -1) {
            return ((Bitmap) Preconditions.checkNotNull(inputImage.getBitmapInternal())).getAllocationByteCount();
        }
        if (inputImage.getFormat() == 17 || inputImage.getFormat() == 842094169) {
            return ((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer())).limit();
        }
        if (inputImage.getFormat() != 35) {
            return 0;
        }
        return (((Image.Plane[]) Preconditions.checkNotNull(inputImage.getPlanes()))[0].getBuffer().limit() * 3) / 2;
    }

    public Matrix getUprightRotationMatrix(int i, int i2, int i3) {
        if (i3 == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate((-i) / 2.0f, (-i2) / 2.0f);
        matrix.postRotate(i3 * 90);
        int i4 = i3 % 2;
        int i5 = i4 != 0 ? i2 : i;
        if (i4 == 0) {
            i = i2;
        }
        matrix.postTranslate(i5 / 2.0f, i / 2.0f);
        return matrix;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0072 A[Catch: FileNotFoundException -> 0x00d4, TryCatch #3 {FileNotFoundException -> 0x00d4, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0016, B:35:0x0078, B:36:0x008d, B:47:0x00be, B:49:0x00c7, B:38:0x0092, B:39:0x0096, B:40:0x009d, B:41:0x00a1, B:42:0x00a8, B:43:0x00ac, B:45:0x00b3, B:34:0x0072, B:31:0x005c, B:51:0x00cc, B:52:0x00d3), top: B:62:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090 A[PHI: r4
      0x0090: PHI (r4v3 android.graphics.Matrix) = (r4v0 android.graphics.Matrix), (r4v1 android.graphics.Matrix) binds: [B:36:0x008d, B:45:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092 A[Catch: FileNotFoundException -> 0x00d4, TryCatch #3 {FileNotFoundException -> 0x00d4, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0016, B:35:0x0078, B:36:0x008d, B:47:0x00be, B:49:0x00c7, B:38:0x0092, B:39:0x0096, B:40:0x009d, B:41:0x00a1, B:42:0x00a8, B:43:0x00ac, B:45:0x00b3, B:34:0x0072, B:31:0x005c, B:51:0x00cc, B:52:0x00d3), top: B:62:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096 A[Catch: FileNotFoundException -> 0x00d4, TryCatch #3 {FileNotFoundException -> 0x00d4, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0016, B:35:0x0078, B:36:0x008d, B:47:0x00be, B:49:0x00c7, B:38:0x0092, B:39:0x0096, B:40:0x009d, B:41:0x00a1, B:42:0x00a8, B:43:0x00ac, B:45:0x00b3, B:34:0x0072, B:31:0x005c, B:51:0x00cc, B:52:0x00d3), top: B:62:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d A[Catch: FileNotFoundException -> 0x00d4, TryCatch #3 {FileNotFoundException -> 0x00d4, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0016, B:35:0x0078, B:36:0x008d, B:47:0x00be, B:49:0x00c7, B:38:0x0092, B:39:0x0096, B:40:0x009d, B:41:0x00a1, B:42:0x00a8, B:43:0x00ac, B:45:0x00b3, B:34:0x0072, B:31:0x005c, B:51:0x00cc, B:52:0x00d3), top: B:62:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1 A[Catch: FileNotFoundException -> 0x00d4, TryCatch #3 {FileNotFoundException -> 0x00d4, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0016, B:35:0x0078, B:36:0x008d, B:47:0x00be, B:49:0x00c7, B:38:0x0092, B:39:0x0096, B:40:0x009d, B:41:0x00a1, B:42:0x00a8, B:43:0x00ac, B:45:0x00b3, B:34:0x0072, B:31:0x005c, B:51:0x00cc, B:52:0x00d3), top: B:62:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8 A[Catch: FileNotFoundException -> 0x00d4, TryCatch #3 {FileNotFoundException -> 0x00d4, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0016, B:35:0x0078, B:36:0x008d, B:47:0x00be, B:49:0x00c7, B:38:0x0092, B:39:0x0096, B:40:0x009d, B:41:0x00a1, B:42:0x00a8, B:43:0x00ac, B:45:0x00b3, B:34:0x0072, B:31:0x005c, B:51:0x00cc, B:52:0x00d3), top: B:62:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac A[Catch: FileNotFoundException -> 0x00d4, TryCatch #3 {FileNotFoundException -> 0x00d4, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0016, B:35:0x0078, B:36:0x008d, B:47:0x00be, B:49:0x00c7, B:38:0x0092, B:39:0x0096, B:40:0x009d, B:41:0x00a1, B:42:0x00a8, B:43:0x00ac, B:45:0x00b3, B:34:0x0072, B:31:0x005c, B:51:0x00cc, B:52:0x00d3), top: B:62:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3 A[Catch: FileNotFoundException -> 0x00d4, TryCatch #3 {FileNotFoundException -> 0x00d4, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0016, B:35:0x0078, B:36:0x008d, B:47:0x00be, B:49:0x00c7, B:38:0x0092, B:39:0x0096, B:40:0x009d, B:41:0x00a1, B:42:0x00a8, B:43:0x00ac, B:45:0x00b3, B:34:0x0072, B:31:0x005c, B:51:0x00cc, B:52:0x00d3), top: B:62:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap zza(ContentResolver contentResolver, Uri uri) throws IllegalAccessException, NoSuchMethodException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        IOException iOException;
        ExifInterface exifInterface;
        Matrix matrix;
        Bitmap bitmapCreateBitmap;
        try {
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(contentResolver, uri);
            if (bitmap == null) {
                throw new IOException("The image Uri could not be resolved.");
            }
            int attributeInt = 0;
            Matrix matrix2 = null;
            if (UriUtil.LOCAL_CONTENT_SCHEME.equals(uri.getScheme()) || "file".equals(uri.getScheme())) {
                try {
                    InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            exifInterface = new ExifInterface(inputStreamOpenInputStream);
                        } finally {
                        }
                    } else {
                        exifInterface = null;
                    }
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException e) {
                            iOException = e;
                            zza.e("MLKitImageUtils", "failed to open file to read rotation meta data: ".concat(String.valueOf(String.valueOf(uri))), iOException);
                            if (exifInterface == null) {
                            }
                            Matrix matrix3 = new Matrix();
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            switch (attributeInt) {
                            }
                            return matrix == null ? bitmap : bitmap;
                        }
                    }
                } catch (IOException e2) {
                    iOException = e2;
                    exifInterface = null;
                }
                if (exifInterface == null) {
                    attributeInt = exifInterface.getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
                }
            }
            Matrix matrix32 = new Matrix();
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            switch (attributeInt) {
                case 2:
                    matrix2 = new Matrix();
                    matrix2.postScale(-1.0f, 1.0f);
                    matrix = matrix2;
                    break;
                case 3:
                    matrix32.postRotate(180.0f);
                    matrix = matrix32;
                    break;
                case 4:
                    matrix32.postScale(1.0f, -1.0f);
                    matrix = matrix32;
                    break;
                case 5:
                    matrix32.postRotate(90.0f);
                    matrix32.postScale(-1.0f, 1.0f);
                    matrix = matrix32;
                    break;
                case 6:
                    matrix32.postRotate(90.0f);
                    matrix = matrix32;
                    break;
                case 7:
                    matrix32.postRotate(-90.0f);
                    matrix32.postScale(-1.0f, 1.0f);
                    matrix = matrix32;
                    break;
                case 8:
                    matrix32.postRotate(-90.0f);
                    matrix = matrix32;
                    break;
                default:
                    matrix = matrix2;
                    break;
            }
            if (matrix == null && bitmap != (bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width2, height2, matrix, true))) {
                bitmap.recycle();
                return bitmapCreateBitmap;
            }
        } catch (FileNotFoundException e3) {
            zza.e("MLKitImageUtils", "Could not open file: ".concat(String.valueOf(String.valueOf(uri))), e3);
            throw e3;
        }
    }
}
