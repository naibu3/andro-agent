package expo.modules.clipboard;

import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.util.Base64;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.InterruptibleKt;
import kotlinx.coroutines.YieldKt;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* compiled from: ClipboardImage.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0080@¢\u0006\u0002\u0010\u000e\u001a\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u001a\b\u0010\u0013\u001a\u00020\u0001H\u0000\u001a&\u0010\u0014\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0080@¢\u0006\u0002\u0010\u0016\u001a\u001e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0080@¢\u0006\u0002\u0010\u0019\u001a\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\u0012\u0010\u001b\u001a\u00020\u001c*\u00020\u0012H\u0082@¢\u0006\u0002\u0010\u001d\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"PNG_PREFIX", "", "JPEG_PREFIX", "getImageFormatFromBase64", "Lexpo/modules/clipboard/ImageFormat;", "base64Image", "imageFromContentUri", "Lexpo/modules/clipboard/ImageResult;", "context", "Landroid/content/Context;", "imageUri", "Landroid/net/Uri;", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lexpo/modules/clipboard/GetImageOptions;", "(Landroid/content/Context;Landroid/net/Uri;Lexpo/modules/clipboard/GetImageOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearClipboardCache", "", "clipboardCacheDir", "Ljava/io/File;", "hashFileName", "clipDataFromBase64Image", "Landroid/content/ClipData;", "(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bitmapFromContentUriAsync", "Landroid/graphics/Bitmap;", "(Landroid/content/Context;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bitmapFromBase64String", "ensureExists", "", "(Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expo-clipboard_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ClipboardImageKt {
    public static final String JPEG_PREFIX = "/9j/";
    public static final String PNG_PREFIX = "iVBORw0K";

    /* compiled from: ClipboardImage.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageFormat.values().length];
            try {
                iArr[ImageFormat.PNG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageFormat.JPG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: ClipboardImage.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.clipboard.ClipboardImageKt", f = "ClipboardImage.kt", i = {}, l = {FacebookRequestErrorClassification.EC_INVALID_TOKEN}, m = "bitmapFromContentUriAsync", n = {}, s = {})
    /* renamed from: expo.modules.clipboard.ClipboardImageKt$bitmapFromContentUriAsync$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ClipboardImageKt.bitmapFromContentUriAsync(null, null, this);
        }
    }

    /* compiled from: ClipboardImage.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.clipboard.ClipboardImageKt", f = "ClipboardImage.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2}, l = {162, 166, 169}, m = "clipDataFromBase64Image", n = {"context", "bitmap", "format", "context", "bitmap", "format", "file", "context", "file"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
    /* renamed from: expo.modules.clipboard.ClipboardImageKt$clipDataFromBase64Image$1, reason: invalid class name and case insensitive filesystem */
    static final class C11881 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C11881(Continuation<? super C11881> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ClipboardImageKt.clipDataFromBase64Image(null, null, null, this);
        }
    }

    /* compiled from: ClipboardImage.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.clipboard.ClipboardImageKt", f = "ClipboardImage.kt", i = {0, 1, 1, 1}, l = {79, 87}, m = "imageFromContentUri", n = {SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "bitmap", "format", "outputStream"}, s = {"L$0", "L$0", "L$1", "L$2"})
    /* renamed from: expo.modules.clipboard.ClipboardImageKt$imageFromContentUri$1, reason: invalid class name and case insensitive filesystem */
    static final class C11891 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C11891(Continuation<? super C11891> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ClipboardImageKt.imageFromContentUri(null, null, null, this);
        }
    }

    public static final ImageFormat getImageFormatFromBase64(String base64Image) {
        Intrinsics.checkNotNullParameter(base64Image, "base64Image");
        String strSubstring = base64Image.substring(0, 8);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return StringsKt.startsWith$default(strSubstring, PNG_PREFIX, false, 2, (Object) null) ? ImageFormat.PNG : StringsKt.startsWith$default(strSubstring, JPEG_PREFIX, false, 2, (Object) null) ? ImageFormat.JPG : ImageFormat.JPG;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object imageFromContentUri(Context context, Uri uri, GetImageOptions getImageOptions, Continuation<? super ImageResult> continuation) {
        C11891 c11891;
        ImageFormat imageFormat;
        Bitmap bitmap;
        ByteArrayOutputStream byteArrayOutputStream;
        if (continuation instanceof C11891) {
            c11891 = (C11891) continuation;
            if ((c11891.label & Integer.MIN_VALUE) != 0) {
                c11891.label -= Integer.MIN_VALUE;
            } else {
                c11891 = new C11891(continuation);
            }
        }
        Object objBitmapFromContentUriAsync = c11891.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c11891.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objBitmapFromContentUriAsync);
            c11891.L$0 = getImageOptions;
            c11891.label = 1;
            objBitmapFromContentUriAsync = bitmapFromContentUriAsync(context, uri, c11891);
            if (objBitmapFromContentUriAsync != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteArrayOutputStream = (ByteArrayOutputStream) c11891.L$2;
            imageFormat = (ImageFormat) c11891.L$1;
            bitmap = (Bitmap) c11891.L$0;
            ResultKt.throwOnFailure(objBitmapFromContentUriAsync);
            String str = ("data:" + imageFormat.getMimeType() + ";base64,") + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
            return new ImageResult(str, bitmap.getWidth(), bitmap.getHeight());
        }
        getImageOptions = (GetImageOptions) c11891.L$0;
        ResultKt.throwOnFailure(objBitmapFromContentUriAsync);
        Bitmap bitmap2 = (Bitmap) objBitmapFromContentUriAsync;
        imageFormat = getImageOptions.getImageFormat();
        int jpegQuality = (int) (getImageOptions.getJpegQuality() * 100);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        bitmap2.compress(imageFormat.getCompressFormat(), jpegQuality, byteArrayOutputStream2);
        c11891.L$0 = bitmap2;
        c11891.L$1 = imageFormat;
        c11891.L$2 = byteArrayOutputStream2;
        c11891.label = 2;
        if (YieldKt.yield(c11891) != coroutine_suspended) {
            bitmap = bitmap2;
            byteArrayOutputStream = byteArrayOutputStream2;
            String str2 = ("data:" + imageFormat.getMimeType() + ";base64,") + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            Intrinsics.checkNotNullExpressionValue(str2, "toString(...)");
            return new ImageResult(str2, bitmap.getWidth(), bitmap.getHeight());
        }
        return coroutine_suspended;
    }

    public static final void clearClipboardCache(File clipboardCacheDir) {
        File[] fileArrListFiles;
        Intrinsics.checkNotNullParameter(clipboardCacheDir, "clipboardCacheDir");
        if (clipboardCacheDir.exists() && clipboardCacheDir.isDirectory() && (fileArrListFiles = clipboardCacheDir.listFiles()) != null) {
            for (File file : fileArrListFiles) {
                if (file.isDirectory()) {
                    Intrinsics.checkNotNull(file);
                    FilesKt.deleteRecursively(file);
                } else {
                    file.delete();
                }
            }
        }
    }

    public static final String hashFileName() throws NoSuchAlgorithmException {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        String str = "copied_image" + ArraysKt.joinToString$default(bArr, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: expo.modules.clipboard.ClipboardImageKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ClipboardImageKt.hashFileName$lambda$3(((Byte) obj).byteValue());
            }
        }, 30, (Object) null);
        MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNull(bArrDigest);
        return ArraysKt.joinToString$default(bArrDigest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: expo.modules.clipboard.ClipboardImageKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ClipboardImageKt.hashFileName$lambda$4(((Byte) obj).byteValue());
            }
        }, 30, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence hashFileName$lambda$3(byte b) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence hashFileName$lambda$4(byte b) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object clipDataFromBase64Image(Context context, String str, File file, Continuation<? super ClipData> continuation) throws NoSuchAlgorithmException, InvalidImageException {
        C11881 c11881;
        ImageFormat imageFormatFromBase64;
        String str2;
        Context context2;
        Bitmap bitmap;
        final File file2;
        BufferedOutputStream bufferedOutputStream;
        Closeable closeable;
        Function0 function0;
        File file3;
        Context context3;
        if (continuation instanceof C11881) {
            c11881 = (C11881) continuation;
            if ((c11881.label & Integer.MIN_VALUE) != 0) {
                c11881.label -= Integer.MIN_VALUE;
            } else {
                c11881 = new C11881(continuation);
            }
        }
        Object objRunInterruptible$default = c11881.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c11881.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objRunInterruptible$default);
            Bitmap bitmapBitmapFromBase64String = bitmapFromBase64String(str);
            imageFormatFromBase64 = getImageFormatFromBase64(str);
            clearClipboardCache(file);
            String strHashFileName = hashFileName();
            int i2 = WhenMappings.$EnumSwitchMapping$0[imageFormatFromBase64.ordinal()];
            if (i2 == 1) {
                str2 = strHashFileName + ".png";
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = strHashFileName + ".jpeg";
            }
            File file4 = new File(file, str2);
            c11881.L$0 = context;
            c11881.L$1 = bitmapBitmapFromBase64String;
            c11881.L$2 = imageFormatFromBase64;
            c11881.L$3 = file4;
            c11881.label = 1;
            if (ensureExists(file4, c11881) != coroutine_suspended) {
                context2 = context;
                bitmap = bitmapBitmapFromBase64String;
                file2 = file4;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) c11881.L$2;
                file3 = (File) c11881.L$1;
                context3 = (Context) c11881.L$0;
                try {
                    ResultKt.throwOnFailure(objRunInterruptible$default);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(closeable, null);
                    ClipData clipDataNewUri = ClipData.newUri(context3.getContentResolver(), "image", ClipboardFileProvider.INSTANCE.getUriForFile(context3, context3.getApplicationInfo().packageName + ".ClipboardFileProvider", file3));
                    Intrinsics.checkNotNullExpressionValue(clipDataNewUri, "newUri(...)");
                    return clipDataNewUri;
                } catch (Throwable th) {
                    th = th;
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(closeable, th);
                        throw th2;
                    }
                }
            }
            file2 = (File) c11881.L$3;
            imageFormatFromBase64 = (ImageFormat) c11881.L$2;
            bitmap = (Bitmap) c11881.L$1;
            context2 = (Context) c11881.L$0;
            ResultKt.throwOnFailure(objRunInterruptible$default);
            bufferedOutputStream = new BufferedOutputStream((FileOutputStream) objRunInterruptible$default);
            try {
                final BufferedOutputStream bufferedOutputStream2 = bufferedOutputStream;
                bitmap.compress(imageFormatFromBase64.getCompressFormat(), 100, bufferedOutputStream2);
                function0 = new Function0() { // from class: expo.modules.clipboard.ClipboardImageKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ClipboardImageKt.clipDataFromBase64Image$lambda$8$lambda$7(bufferedOutputStream2);
                    }
                };
                c11881.L$0 = context2;
                c11881.L$1 = file2;
                c11881.L$2 = bufferedOutputStream;
                c11881.L$3 = null;
                c11881.label = 3;
                if (InterruptibleKt.runInterruptible$default(null, function0, c11881, 1, null) != coroutine_suspended) {
                    file3 = file2;
                    closeable = bufferedOutputStream;
                    context3 = context2;
                    Unit unit2 = Unit.INSTANCE;
                    CloseableKt.closeFinally(closeable, null);
                    ClipData clipDataNewUri2 = ClipData.newUri(context3.getContentResolver(), "image", ClipboardFileProvider.INSTANCE.getUriForFile(context3, context3.getApplicationInfo().packageName + ".ClipboardFileProvider", file3));
                    Intrinsics.checkNotNullExpressionValue(clipDataNewUri2, "newUri(...)");
                    return clipDataNewUri2;
                }
                return coroutine_suspended;
            } catch (Throwable th3) {
                th = th3;
                closeable = bufferedOutputStream;
                throw th;
            }
        }
        file2 = (File) c11881.L$3;
        imageFormatFromBase64 = (ImageFormat) c11881.L$2;
        bitmap = (Bitmap) c11881.L$1;
        context2 = (Context) c11881.L$0;
        ResultKt.throwOnFailure(objRunInterruptible$default);
        Function0 function02 = new Function0() { // from class: expo.modules.clipboard.ClipboardImageKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClipboardImageKt.clipDataFromBase64Image$lambda$6(file2);
            }
        };
        c11881.L$0 = context2;
        c11881.L$1 = bitmap;
        c11881.L$2 = imageFormatFromBase64;
        c11881.L$3 = file2;
        c11881.label = 2;
        objRunInterruptible$default = InterruptibleKt.runInterruptible$default(null, function02, c11881, 1, null);
        if (objRunInterruptible$default != coroutine_suspended) {
            bufferedOutputStream = new BufferedOutputStream((FileOutputStream) objRunInterruptible$default);
            final BufferedOutputStream bufferedOutputStream22 = bufferedOutputStream;
            bitmap.compress(imageFormatFromBase64.getCompressFormat(), 100, bufferedOutputStream22);
            function0 = new Function0() { // from class: expo.modules.clipboard.ClipboardImageKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ClipboardImageKt.clipDataFromBase64Image$lambda$8$lambda$7(bufferedOutputStream22);
                }
            };
            c11881.L$0 = context2;
            c11881.L$1 = file2;
            c11881.L$2 = bufferedOutputStream;
            c11881.L$3 = null;
            c11881.label = 3;
            if (InterruptibleKt.runInterruptible$default(null, function0, c11881, 1, null) != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileOutputStream clipDataFromBase64Image$lambda$6(File file) {
        return new FileOutputStream(file, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clipDataFromBase64Image$lambda$8$lambda$7(BufferedOutputStream bufferedOutputStream) throws IOException {
        bufferedOutputStream.flush();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object bitmapFromContentUriAsync(final Context context, final Uri uri, Continuation<? super Bitmap> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objRunInterruptible = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objRunInterruptible);
            CoroutineDispatcher io = Dispatchers.getIO();
            Function0 function0 = new Function0() { // from class: expo.modules.clipboard.ClipboardImageKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ClipboardImageKt.bitmapFromContentUriAsync$lambda$9(context, uri);
                }
            };
            anonymousClass1.label = 1;
            objRunInterruptible = InterruptibleKt.runInterruptible(io, function0, anonymousClass1);
            if (objRunInterruptible == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRunInterruptible);
        }
        Intrinsics.checkNotNullExpressionValue(objRunInterruptible, "runInterruptible(...)");
        return objRunInterruptible;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap bitmapFromContentUriAsync$lambda$9(Context context, Uri uri) {
        ContentResolver contentResolver = context.getContentResolver();
        if (Build.VERSION.SDK_INT < 28) {
            return MediaStore.Images.Media.getBitmap(contentResolver, uri);
        }
        ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(contentResolver, uri);
        Intrinsics.checkNotNullExpressionValue(sourceCreateSource, "createSource(...)");
        return ImageDecoder.decodeBitmap(sourceCreateSource);
    }

    public static final Bitmap bitmapFromBase64String(String base64Image) throws InvalidImageException {
        Intrinsics.checkNotNullParameter(base64Image, "base64Image");
        try {
            byte[] bArrDecode = Base64.decode(base64Image, 0);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
            if (bitmapDecodeByteArray != null) {
                return bitmapDecodeByteArray;
            }
            throw new RuntimeException("Failed to convert base64 into Bitmap");
        } catch (RuntimeException e) {
            throw new InvalidImageException(base64Image, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object ensureExists(final File file, Continuation<? super Boolean> continuation) {
        return InterruptibleKt.runInterruptible(Dispatchers.getIO(), new Function0() { // from class: expo.modules.clipboard.ClipboardImageKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(ClipboardImageKt.ensureExists$lambda$10(file));
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ensureExists$lambda$10(File file) {
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        return file.createNewFile();
    }
}
