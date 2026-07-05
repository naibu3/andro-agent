package expo.modules.imagepicker.exporters;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.net.UriKt;
import expo.modules.imagepicker.FailedToReadFileException;
import expo.modules.imagepicker.FailedToWriteFileException;
import expo.modules.imagepicker.ImagePickerUtilsKt;
import expo.modules.imagepicker.MissingModuleException;
import expo.modules.interfaces.imageloader.ImageLoaderInterface;
import expo.modules.kotlin.providers.AppContextProvider;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterruptibleKt;

/* compiled from: CompressionImageExporter.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010\u0015J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0082@¢\u0006\u0002\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lexpo/modules/imagepicker/exporters/CompressionImageExporter;", "Lexpo/modules/imagepicker/exporters/ImageExporter;", "appContextProvider", "Lexpo/modules/kotlin/providers/AppContextProvider;", "quality", "", "<init>", "(Lexpo/modules/kotlin/providers/AppContextProvider;D)V", "compressQuality", "", "exportAsync", "Lexpo/modules/imagepicker/exporters/ImageExportResult;", "source", "Landroid/net/Uri;", "output", "Ljava/io/File;", "contentResolver", "Landroid/content/ContentResolver;", "(Landroid/net/Uri;Ljava/io/File;Landroid/content/ContentResolver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readBitmap", "Landroid/graphics/Bitmap;", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeImage", "", "bitmap", "compressFormat", "Landroid/graphics/Bitmap$CompressFormat;", "(Landroid/graphics/Bitmap;Ljava/io/File;Landroid/graphics/Bitmap$CompressFormat;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expo-image-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CompressionImageExporter implements ImageExporter {
    private final AppContextProvider appContextProvider;
    private final int compressQuality;

    /* compiled from: CompressionImageExporter.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.imagepicker.exporters.CompressionImageExporter", f = "CompressionImageExporter.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2}, l = {34, 36, 37}, m = "exportAsync", n = {"source", "output", "contentResolver", "source", "output", "contentResolver", "bitmap", "output", "bitmap"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
    /* renamed from: expo.modules.imagepicker.exporters.CompressionImageExporter$exportAsync$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CompressionImageExporter.this.exportAsync(null, null, null, this);
        }
    }

    /* compiled from: CompressionImageExporter.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.imagepicker.exporters.CompressionImageExporter", f = "CompressionImageExporter.kt", i = {}, l = {52}, m = "readBitmap", n = {}, s = {})
    /* renamed from: expo.modules.imagepicker.exporters.CompressionImageExporter$readBitmap$1, reason: invalid class name and case insensitive filesystem */
    static final class C11941 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C11941(Continuation<? super C11941> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CompressionImageExporter.this.readBitmap(null, this);
        }
    }

    public CompressionImageExporter(AppContextProvider appContextProvider, double d) {
        Intrinsics.checkNotNullParameter(appContextProvider, "appContextProvider");
        this.appContextProvider = appContextProvider;
        this.compressQuality = (int) (d * 100);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a6, code lost:
    
        if (expo.modules.imagepicker.ImagePickerUtilsKt.copyExifData(r2, r11, r12, r0) != r1) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // expo.modules.imagepicker.exporters.ImageExporter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object exportAsync(Uri uri, File file, ContentResolver contentResolver, Continuation<? super ImageExportResult> continuation) {
        AnonymousClass1 anonymousClass1;
        Uri uri2;
        Bitmap bitmap;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object bitmap2 = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(bitmap2);
            anonymousClass1.L$0 = uri;
            anonymousClass1.L$1 = file;
            anonymousClass1.L$2 = contentResolver;
            anonymousClass1.label = 1;
            bitmap2 = readBitmap(uri, anonymousClass1);
            if (bitmap2 != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            contentResolver = (ContentResolver) anonymousClass1.L$2;
            file = (File) anonymousClass1.L$1;
            uri = (Uri) anonymousClass1.L$0;
            ResultKt.throwOnFailure(bitmap2);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bitmap = (Bitmap) anonymousClass1.L$1;
                file = (File) anonymousClass1.L$0;
                ResultKt.throwOnFailure(bitmap2);
                final Bitmap bitmap3 = bitmap;
                return new ImageExportResult(file, bitmap3.getWidth(), bitmap3.getHeight()) { // from class: expo.modules.imagepicker.exporters.CompressionImageExporter.exportAsync.2
                    @Override // expo.modules.imagepicker.exporters.ImageExportResult
                    public Object data(ContentResolver contentResolver2, Continuation<? super ByteArrayOutputStream> continuation2) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmap3.compress(Bitmap.CompressFormat.JPEG, this.compressQuality, byteArrayOutputStream);
                        return byteArrayOutputStream;
                    }
                };
            }
            bitmap = (Bitmap) anonymousClass1.L$3;
            ContentResolver contentResolver2 = (ContentResolver) anonymousClass1.L$2;
            File file2 = (File) anonymousClass1.L$1;
            uri2 = (Uri) anonymousClass1.L$0;
            ResultKt.throwOnFailure(bitmap2);
            contentResolver = contentResolver2;
            file = file2;
            anonymousClass1.L$0 = file;
            anonymousClass1.L$1 = bitmap;
            anonymousClass1.L$2 = null;
            anonymousClass1.L$3 = null;
            anonymousClass1.label = 3;
        }
        Bitmap bitmap4 = (Bitmap) bitmap2;
        Bitmap.CompressFormat bitmapCompressFormat = ImagePickerUtilsKt.toBitmapCompressFormat(file);
        anonymousClass1.L$0 = uri;
        anonymousClass1.L$1 = file;
        anonymousClass1.L$2 = contentResolver;
        anonymousClass1.L$3 = bitmap4;
        anonymousClass1.label = 2;
        if (writeImage(bitmap4, file, bitmapCompressFormat, anonymousClass1) != coroutine_suspended) {
            uri2 = uri;
            bitmap = bitmap4;
            anonymousClass1.L$0 = file;
            anonymousClass1.L$1 = bitmap;
            anonymousClass1.L$2 = null;
            anonymousClass1.L$3 = null;
            anonymousClass1.label = 3;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readBitmap(final Uri uri, Continuation<? super Bitmap> continuation) {
        C11941 c11941;
        if (continuation instanceof C11941) {
            c11941 = (C11941) continuation;
            if ((c11941.label & Integer.MIN_VALUE) != 0) {
                c11941.label -= Integer.MIN_VALUE;
            } else {
                c11941 = new C11941(continuation);
            }
        }
        Object objRunInterruptible$default = c11941.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c11941.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objRunInterruptible$default);
            Function0 function0 = new Function0() { // from class: expo.modules.imagepicker.exporters.CompressionImageExporter$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CompressionImageExporter.readBitmap$lambda$0(this.f$0, uri);
                }
            };
            c11941.label = 1;
            objRunInterruptible$default = InterruptibleKt.runInterruptible$default(null, function0, c11941, 1, null);
            if (objRunInterruptible$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRunInterruptible$default);
        }
        Intrinsics.checkNotNull(objRunInterruptible$default);
        return objRunInterruptible$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap readBitmap$lambda$0(CompressionImageExporter compressionImageExporter, Uri uri) throws MissingModuleException, FailedToReadFileException {
        Future<Bitmap> futureLoadImageForManipulationFromURL;
        ImageLoaderInterface imageLoader = compressionImageExporter.appContextProvider.getAppContext().getImageLoader();
        if (imageLoader == null || (futureLoadImageForManipulationFromURL = imageLoader.loadImageForManipulationFromURL(uri.toString())) == null) {
            throw new MissingModuleException("ImageLoader");
        }
        try {
            return futureLoadImageForManipulationFromURL.get();
        } catch (ExecutionException e) {
            throw new FailedToReadFileException(UriKt.toFile(uri), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object writeImage(final Bitmap bitmap, final File file, final Bitmap.CompressFormat compressFormat, Continuation<? super Boolean> continuation) {
        return InterruptibleKt.runInterruptible$default(null, new Function0() { // from class: expo.modules.imagepicker.exporters.CompressionImageExporter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(CompressionImageExporter.writeImage$lambda$2(file, bitmap, compressFormat, this));
            }
        }, continuation, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean writeImage$lambda$2(File file, Bitmap bitmap, Bitmap.CompressFormat compressFormat, CompressionImageExporter compressionImageExporter) throws FailedToWriteFileException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                boolean zCompress = bitmap.compress(compressFormat, compressionImageExporter.compressQuality, fileOutputStream);
                CloseableKt.closeFinally(fileOutputStream, null);
                return zCompress;
            } finally {
            }
        } catch (FileNotFoundException e) {
            throw new FailedToWriteFileException(file, e);
        }
    }
}
