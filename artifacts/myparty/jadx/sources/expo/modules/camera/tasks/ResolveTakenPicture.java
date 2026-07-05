package expo.modules.camera.tasks;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.share.internal.ShareConstants;
import expo.modules.camera.CameraExceptions;
import expo.modules.camera.PictureFormat;
import expo.modules.camera.PictureOptions;
import expo.modules.camera.PictureRef;
import expo.modules.camera.utils.CameraViewHelper;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.RuntimeContext;
import expo.modules.kotlin.exception.CodedException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: ResolveTakenPicture.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0016\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u0018J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J\u0012\u0010\u001c\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001aH\u0002J(\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"H\u0002J \u0010#\u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\"H\u0002J\u0010\u0010%\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006&"}, d2 = {"Lexpo/modules/camera/tasks/ResolveTakenPicture;", "", "imageData", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lexpo/modules/kotlin/Promise;", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lexpo/modules/camera/PictureOptions;", "mirror", "", "runtimeContext", "Lexpo/modules/kotlin/RuntimeContext;", "directory", "Ljava/io/File;", "pictureSavedDelegate", "Lexpo/modules/camera/tasks/PictureSavedDelegate;", "<init>", "([BLexpo/modules/kotlin/Promise;Lexpo/modules/camera/PictureOptions;ZLexpo/modules/kotlin/RuntimeContext;Ljava/io/File;Lexpo/modules/camera/tasks/PictureSavedDelegate;)V", "quality", "", "getQuality", "()I", "resolve", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processImage", "Landroid/os/Bundle;", "skipProcessing", "onComplete", "response", "decodeBitmap", "Landroid/graphics/Bitmap;", "orientation", "bitmapOptions", "Landroid/graphics/BitmapFactory$Options;", "decodeAndRotateBitmap", "angle", "getImageRotation", "expo-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResolveTakenPicture {
    private final File directory;
    private byte[] imageData;
    private boolean mirror;
    private PictureOptions options;
    private PictureSavedDelegate pictureSavedDelegate;
    private Promise promise;
    private final RuntimeContext runtimeContext;

    private final int getImageRotation(int orientation) {
        switch (orientation) {
            case 3:
            case 4:
                return RotationOptions.ROTATE_180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return RotationOptions.ROTATE_270;
            default:
                return 0;
        }
    }

    public ResolveTakenPicture(byte[] imageData, Promise promise, PictureOptions options, boolean z, RuntimeContext runtimeContext, File directory, PictureSavedDelegate pictureSavedDelegate) {
        Intrinsics.checkNotNullParameter(imageData, "imageData");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(runtimeContext, "runtimeContext");
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(pictureSavedDelegate, "pictureSavedDelegate");
        this.imageData = imageData;
        this.promise = promise;
        this.options = options;
        this.mirror = z;
        this.runtimeContext = runtimeContext;
        this.directory = directory;
        this.pictureSavedDelegate = pictureSavedDelegate;
    }

    private final int getQuality() {
        return (int) (this.options.getQuality() * 100);
    }

    /* compiled from: ResolveTakenPicture.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.camera.tasks.ResolveTakenPicture$resolve$2", f = "ResolveTakenPicture.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: expo.modules.camera.tasks.ResolveTakenPicture$resolve$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ResolveTakenPicture.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                Bundle bundleProcessImage = ResolveTakenPicture.this.processImage();
                if (!ResolveTakenPicture.this.options.getPictureRef()) {
                    ResolveTakenPicture.this.onComplete(bundleProcessImage);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object resolve(Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [T, android.graphics.Bitmap] */
    public final Bundle processImage() {
        if (this.options.getSkipProcessing()) {
            return skipProcessing();
        }
        try {
            ByteArrayOutputStream byteArrayInputStream = new ByteArrayInputStream(this.imageData);
            try {
                Bundle bundle = new Bundle();
                ExifInterface exifInterface = new ExifInterface(byteArrayInputStream);
                Map<String, Object> additionalExif = this.options.getAdditionalExif();
                if (additionalExif != null) {
                    CameraViewHelper.setExifData(exifInterface, additionalExif);
                }
                int attributeInt = exifInterface.getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
                if (this.mirror) {
                    exifInterface.setAttribute(ExifInterface.TAG_ORIENTATION, String.valueOf(ResolveTakenPictureKt.getMirroredOrientation(attributeInt)));
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 1;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                OutOfMemoryError outOfMemoryError = null;
                while (options.inSampleSize <= this.options.getMaxDownsampling()) {
                    try {
                        objectRef.element = decodeBitmap(this.imageData, attributeInt, this.options, options);
                        break;
                    } catch (OutOfMemoryError e) {
                        options.inSampleSize *= 2;
                        outOfMemoryError = e;
                    }
                }
                if (objectRef.element == 0) {
                    this.promise.reject("ERR_CAMERA_OUT_OF_MEMORY", "Cannot allocate enough space to process the taken picture.", outOfMemoryError);
                    CloseableKt.closeFinally(byteArrayInputStream, null);
                    return null;
                }
                if (this.options.getExif()) {
                    bundle.putBundle("exif", CameraViewHelper.getExifData(exifInterface));
                }
                bundle.putInt("width", ((Bitmap) objectRef.element).getWidth());
                bundle.putInt("height", ((Bitmap) objectRef.element).getHeight());
                if (this.options.getPictureRef()) {
                    this.promise.resolve(new PictureRef((Bitmap) objectRef.element, this.runtimeContext));
                    CloseableKt.closeFinally(byteArrayInputStream, null);
                } else {
                    byteArrayInputStream = new ByteArrayOutputStream();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = byteArrayInputStream;
                        ((Bitmap) objectRef.element).compress(this.options.getImageType() == PictureFormat.PNG ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, getQuality(), byteArrayOutputStream);
                        String strWriteStreamToFile = ResolveTakenPictureKt.writeStreamToFile(this.directory, byteArrayOutputStream, this.options.getImageType().toExtension());
                        ((Bitmap) objectRef.element).recycle();
                        if (this.options.getExif()) {
                            CameraViewHelper.addExifData(new ExifInterface(strWriteStreamToFile), exifInterface);
                        }
                        String string = Uri.fromFile(new File(strWriteStreamToFile)).toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        bundle.putString(ShareConstants.MEDIA_URI, string);
                        bundle.putString("format", this.options.getImageType().toExtension());
                        if (this.options.getBase64()) {
                            bundle.putString("base64", Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
                        }
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(byteArrayInputStream, null);
                        CloseableKt.closeFinally(byteArrayInputStream, null);
                    } finally {
                    }
                }
                return bundle;
            } finally {
            }
        } catch (Exception e2) {
            if (e2 instanceof Resources.NotFoundException) {
                this.promise.reject("E_TAKING_PICTURE_FAILED", "Documents directory of the app could not be found.", e2);
            } else if (e2 instanceof IOException) {
                this.promise.reject("E_TAKING_PICTURE_FAILED", "An unknown I/O exception has occurred.", e2);
            } else if (e2 instanceof IllegalArgumentException) {
                this.promise.reject("E_TAKING_PICTURE_FAILED", "An incompatible parameter has been passed in. ", e2);
            } else if (e2 instanceof CameraExceptions.WriteImageException) {
                this.promise.reject((CodedException) e2);
            } else {
                this.promise.reject("E_TAKING_PICTURE_FAILED", "An unknown exception has occurred.", e2);
            }
            e2.printStackTrace();
            return null;
        }
    }

    private final Bundle skipProcessing() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                byteArrayOutputStream2.write(this.imageData);
                String strWriteStreamToFile = ResolveTakenPictureKt.writeStreamToFile(this.directory, byteArrayOutputStream2, this.options.getImageType().toExtension());
                String string = Uri.fromFile(new File(strWriteStreamToFile)).toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                ExifInterface exifInterface = new ExifInterface(strWriteStreamToFile);
                Bundle bundle = new Bundle();
                bundle.putString(ShareConstants.MEDIA_URI, string);
                bundle.putInt("width", exifInterface.getAttributeInt(ExifInterface.TAG_IMAGE_WIDTH, -1));
                bundle.putInt("height", exifInterface.getAttributeInt(ExifInterface.TAG_IMAGE_LENGTH, -1));
                if (this.options.getExif()) {
                    bundle.putBundle("exif", CameraViewHelper.getExifData(exifInterface));
                }
                if (this.options.getBase64()) {
                    bundle.putString("base64", Base64.encodeToString(this.imageData, 2));
                }
                CloseableKt.closeFinally(byteArrayOutputStream, null);
                return bundle;
            } finally {
            }
        } catch (IOException e) {
            this.promise.reject("E_TAKING_PICTURE_FAILED", "An unknown I/O exception has occurred.", e);
            e.printStackTrace();
            return null;
        } catch (Exception e2) {
            this.promise.reject("E_TAKING_PICTURE_FAILED", "An unknown exception has occurred.", e2);
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onComplete(Bundle response) {
        if (response == null) {
            return;
        }
        if (this.options.getFastMode()) {
            Bundle bundle = new Bundle();
            Integer id = this.options.getId();
            if (id == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            bundle.putInt("id", id.intValue());
            bundle.putBundle("data", response);
            this.pictureSavedDelegate.onPictureSaved(bundle);
            return;
        }
        this.promise.resolve(response);
    }

    private final Bitmap decodeBitmap(byte[] imageData, int orientation, PictureOptions options, BitmapFactory.Options bitmapOptions) {
        if (!options.getExif()) {
            return decodeAndRotateBitmap(imageData, getImageRotation(orientation), bitmapOptions);
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(imageData, 0, imageData.length, bitmapOptions);
        Intrinsics.checkNotNull(bitmapDecodeByteArray);
        return bitmapDecodeByteArray;
    }

    private final Bitmap decodeAndRotateBitmap(byte[] imageData, int angle, BitmapFactory.Options options) {
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(imageData, 0, imageData.length, options);
        if (angle == 0 && !this.mirror) {
            Intrinsics.checkNotNull(bitmapDecodeByteArray);
            return bitmapDecodeByteArray;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(angle);
        if (this.mirror) {
            matrix.postScale(-1.0f, 1.0f);
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, true);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            if (!Intrinsics.areEqual(bitmapCreateBitmap, bitmapDecodeByteArray) && !bitmapDecodeByteArray.isRecycled()) {
                bitmapDecodeByteArray.recycle();
            }
            return bitmapCreateBitmap;
        } catch (OutOfMemoryError unused) {
            Intrinsics.checkNotNull(bitmapDecodeByteArray);
            return bitmapDecodeByteArray;
        }
    }
}
