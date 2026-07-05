package expo.modules.imagepicker;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.share.internal.ShareConstants;
import com.facebook.soloader.Elf64;
import com.google.android.material.internal.ViewUtils;
import expo.modules.imagepicker.exporters.CompressionImageExporter;
import expo.modules.imagepicker.exporters.ImageExportResult;
import expo.modules.imagepicker.exporters.RawImageExporter;
import expo.modules.kotlin.providers.AppContextProvider;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: MediaHandler.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\n\u001a\u00020\u000b2\u001e\u0010\f\u001a\u001a\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\rj\u0002`\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0080@¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0082@¢\u0006\u0002\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u0010H\u0002J\u0016\u0010!\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\"R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0016\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006#"}, d2 = {"Lexpo/modules/imagepicker/MediaHandler;", "", "appContextProvider", "Lexpo/modules/kotlin/providers/AppContextProvider;", "<init>", "(Lexpo/modules/kotlin/providers/AppContextProvider;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "readExtras", "Lexpo/modules/imagepicker/ImagePickerResponse;", "bareResult", "", "Lkotlin/Pair;", "Lexpo/modules/imagepicker/MediaType;", "Landroid/net/Uri;", "Lexpo/modules/imagepicker/contracts/MediaList;", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lexpo/modules/imagepicker/ImagePickerOptions;", "readExtras$expo_image_picker_release", "(Ljava/util/List;Lexpo/modules/imagepicker/ImagePickerOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cacheDirectory", "Ljava/io/File;", "getCacheDirectory", "()Ljava/io/File;", "handleImage", "Lexpo/modules/imagepicker/ImagePickerAsset;", "sourceUri", "(Landroid/net/Uri;Lexpo/modules/imagepicker/ImagePickerOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAdditionalFileData", "Lexpo/modules/imagepicker/AdditionalFileData;", ShareConstants.MEDIA_URI, "handleVideo", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expo-image-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MediaHandler {
    private final AppContextProvider appContextProvider;

    /* compiled from: MediaHandler.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaType.values().length];
            try {
                iArr[MediaType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaType.IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: MediaHandler.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.imagepicker.MediaHandler", f = "MediaHandler.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {Elf64.Ehdr.E_SHENTSIZE, 60, 63}, m = "handleImage", n = {"sourceUri", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "mimeType", "outputFile", "sourceUri", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "mimeType", "outputFile", "exportedImage", "sourceUri", "mimeType", "outputFile", "exportedImage", "base64"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    /* renamed from: expo.modules.imagepicker.MediaHandler$handleImage$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MediaHandler.this.handleImage(null, null, this);
        }
    }

    /* compiled from: MediaHandler.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.imagepicker.MediaHandler", f = "MediaHandler.kt", i = {0, 0}, l = {102}, m = "handleVideo", n = {"sourceUri", "outputFile"}, s = {"L$0", "L$1"})
    /* renamed from: expo.modules.imagepicker.MediaHandler$handleVideo$1, reason: invalid class name and case insensitive filesystem */
    static final class C11931 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C11931(Continuation<? super C11931> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MediaHandler.this.handleVideo(null, this);
        }
    }

    public MediaHandler(AppContextProvider appContextProvider) {
        Intrinsics.checkNotNullParameter(appContextProvider, "appContextProvider");
        this.appContextProvider = appContextProvider;
    }

    private final Context getContext() {
        Context reactContext = this.appContextProvider.getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new IllegalArgumentException("React Application Context is null".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b6 -> B:30:0x00b9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00d9 -> B:39:0x0100). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readExtras$expo_image_picker_release(List<? extends Pair<? extends MediaType, ? extends Uri>> list, ImagePickerOptions imagePickerOptions, Continuation<? super ImagePickerResponse> continuation) throws IOException, SecurityException, FailedToCreateFileException, IllegalArgumentException, FailedToExtractVideoMetadataException {
        MediaHandler$readExtras$1 mediaHandler$readExtras$1;
        ArrayList arrayList;
        Iterator it;
        ImagePickerOptions imagePickerOptions2;
        ImagePickerOptions imagePickerOptions3;
        Collection collection;
        ImagePickerAsset imagePickerAsset;
        if (continuation instanceof MediaHandler$readExtras$1) {
            mediaHandler$readExtras$1 = (MediaHandler$readExtras$1) continuation;
            if ((mediaHandler$readExtras$1.label & Integer.MIN_VALUE) != 0) {
                mediaHandler$readExtras$1.label -= Integer.MIN_VALUE;
            } else {
                mediaHandler$readExtras$1 = new MediaHandler$readExtras$1(this, continuation);
            }
        }
        Object obj = mediaHandler$readExtras$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = mediaHandler$readExtras$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List<? extends Pair<? extends MediaType, ? extends Uri>> list2 = list;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            it = list2.iterator();
            imagePickerOptions2 = imagePickerOptions;
            if (!it.hasNext()) {
            }
        } else if (i == 1) {
            arrayList = (Collection) mediaHandler$readExtras$1.L$3;
            it = (Iterator) mediaHandler$readExtras$1.L$2;
            collection = (Collection) mediaHandler$readExtras$1.L$1;
            imagePickerOptions3 = (ImagePickerOptions) mediaHandler$readExtras$1.L$0;
            ResultKt.throwOnFailure(obj);
            imagePickerAsset = (ImagePickerAsset) obj;
            arrayList.add(imagePickerAsset);
            arrayList = collection;
            imagePickerOptions2 = imagePickerOptions3;
            if (!it.hasNext()) {
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = (Collection) mediaHandler$readExtras$1.L$3;
            it = (Iterator) mediaHandler$readExtras$1.L$2;
            collection = (Collection) mediaHandler$readExtras$1.L$1;
            imagePickerOptions3 = (ImagePickerOptions) mediaHandler$readExtras$1.L$0;
            ResultKt.throwOnFailure(obj);
            imagePickerAsset = (ImagePickerAsset) obj;
            arrayList.add(imagePickerAsset);
            arrayList = collection;
            imagePickerOptions2 = imagePickerOptions3;
            if (!it.hasNext()) {
                Pair pair = (Pair) it.next();
                MediaType mediaType = (MediaType) pair.component1();
                Uri uri = (Uri) pair.component2();
                int i2 = mediaType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[mediaType.ordinal()];
                if (i2 != -1) {
                    if (i2 == 1) {
                        mediaHandler$readExtras$1.L$0 = imagePickerOptions2;
                        mediaHandler$readExtras$1.L$1 = arrayList;
                        mediaHandler$readExtras$1.L$2 = it;
                        mediaHandler$readExtras$1.L$3 = arrayList;
                        mediaHandler$readExtras$1.label = 1;
                        Object objHandleVideo = handleVideo(uri, mediaHandler$readExtras$1);
                        if (objHandleVideo != coroutine_suspended) {
                            imagePickerOptions3 = imagePickerOptions2;
                            collection = arrayList;
                            imagePickerAsset = (ImagePickerAsset) objHandleVideo;
                        }
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        mediaHandler$readExtras$1.L$0 = imagePickerOptions2;
                        mediaHandler$readExtras$1.L$1 = arrayList;
                        mediaHandler$readExtras$1.L$2 = it;
                        mediaHandler$readExtras$1.L$3 = arrayList;
                        mediaHandler$readExtras$1.label = 2;
                        Object objHandleImage = handleImage(uri, imagePickerOptions2, mediaHandler$readExtras$1);
                        if (objHandleImage != coroutine_suspended) {
                            imagePickerOptions3 = imagePickerOptions2;
                            obj = objHandleImage;
                            collection = arrayList;
                            imagePickerAsset = (ImagePickerAsset) obj;
                        }
                    }
                    return coroutine_suspended;
                }
                String string = uri.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                imagePickerOptions3 = imagePickerOptions2;
                collection = arrayList;
                imagePickerAsset = new ImagePickerAsset(null, null, string, 0, 0, null, null, null, null, null, null, null, 4089, null);
                arrayList.add(imagePickerAsset);
                arrayList = collection;
                imagePickerOptions2 = imagePickerOptions3;
                if (!it.hasNext()) {
                    return new ImagePickerResponse(false, (List) arrayList);
                }
            }
        }
    }

    private final File getCacheDirectory() {
        return this.appContextProvider.getAppContext().getCacheDirectory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleImage(Uri uri, ImagePickerOptions imagePickerOptions, Continuation<? super ImagePickerAsset> continuation) throws IOException, FailedToCreateFileException {
        AnonymousClass1 anonymousClass1;
        CompressionImageExporter compressionImageExporter;
        ImagePickerOptions imagePickerOptions2;
        String str;
        File file;
        ImageExportResult imageExportResult;
        Uri uri2;
        ImageExportResult imageExportResult2;
        ImagePickerOptions imagePickerOptions3;
        String str2;
        Boolean boolBoxBoolean;
        String str3;
        ImageExportResult imageExportResult3;
        String str4;
        Uri uri3;
        ByteArrayOutputStream byteArrayOutputStream;
        AdditionalFileData additionalFileData;
        String name;
        Long fileSize;
        Uri uri4 = uri;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objExportAsync = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        Bundle bundle = null;
        if (i == 0) {
            ResultKt.throwOnFailure(objExportAsync);
            if (imagePickerOptions.getQuality() == 1.0d) {
                compressionImageExporter = new RawImageExporter();
            } else {
                compressionImageExporter = new CompressionImageExporter(this.appContextProvider, imagePickerOptions.getQuality());
            }
            ContentResolver contentResolver = getContext().getContentResolver();
            Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
            String type = ImagePickerUtilsKt.getType(contentResolver, uri4);
            if (type == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            File fileCreateOutputFile = ImagePickerUtilsKt.createOutputFile(getCacheDirectory(), ImagePickerUtilsKt.toImageFileExtension(type));
            ContentResolver contentResolver2 = getContext().getContentResolver();
            Intrinsics.checkNotNullExpressionValue(contentResolver2, "getContentResolver(...)");
            anonymousClass1.L$0 = uri4;
            imagePickerOptions2 = imagePickerOptions;
            anonymousClass1.L$1 = imagePickerOptions2;
            anonymousClass1.L$2 = type;
            anonymousClass1.L$3 = fileCreateOutputFile;
            anonymousClass1.label = 1;
            objExportAsync = compressionImageExporter.exportAsync(uri4, fileCreateOutputFile, contentResolver2, anonymousClass1);
            if (objExportAsync != coroutine_suspended) {
                str = type;
                file = fileCreateOutputFile;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            File file2 = (File) anonymousClass1.L$3;
            String str5 = (String) anonymousClass1.L$2;
            ImagePickerOptions imagePickerOptions4 = (ImagePickerOptions) anonymousClass1.L$1;
            Uri uri5 = (Uri) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objExportAsync);
            imagePickerOptions2 = imagePickerOptions4;
            str = str5;
            file = file2;
            uri4 = uri5;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) anonymousClass1.L$4;
                imageExportResult3 = (ImageExportResult) anonymousClass1.L$3;
                file = (File) anonymousClass1.L$2;
                str4 = (String) anonymousClass1.L$1;
                uri3 = (Uri) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objExportAsync);
                bundle = (Bundle) objExportAsync;
                uri2 = uri3;
                imageExportResult = imageExportResult3;
                str3 = str4;
                String str6 = str2;
                Bundle bundle2 = bundle;
                additionalFileData = getAdditionalFileData(uri2);
                MediaType mediaType = MediaType.IMAGE;
                String string = Uri.fromFile(file).toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                int width = imageExportResult.getWidth();
                int height = imageExportResult.getHeight();
                if (additionalFileData == null || (name = additionalFileData.getFileName()) == null) {
                    name = file.getName();
                }
                return new ImagePickerAsset(ImagePickerUtilsKt.getMediaStoreAssetId(uri2), mediaType, string, width, height, name, Boxing.boxLong((additionalFileData == null || (fileSize = additionalFileData.getFileSize()) == null) ? file.length() : fileSize.longValue()), str3, str6, bundle2, null, null, 3072, null);
            }
            imageExportResult2 = (ImageExportResult) anonymousClass1.L$4;
            file = (File) anonymousClass1.L$3;
            str = (String) anonymousClass1.L$2;
            imagePickerOptions3 = (ImagePickerOptions) anonymousClass1.L$1;
            uri2 = (Uri) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objExportAsync);
            byteArrayOutputStream = (ByteArrayOutputStream) objExportAsync;
            if (byteArrayOutputStream == null) {
                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                imageExportResult = imageExportResult2;
                str2 = strEncodeToString;
                boolBoxBoolean = Boxing.boxBoolean(imagePickerOptions3.getExif());
                if (!boolBoxBoolean.booleanValue()) {
                    boolBoxBoolean = null;
                }
                if (boolBoxBoolean != null) {
                    boolBoxBoolean.booleanValue();
                    ContentResolver contentResolver3 = getContext().getContentResolver();
                    Intrinsics.checkNotNullExpressionValue(contentResolver3, "getContentResolver(...)");
                    anonymousClass1.L$0 = uri2;
                    anonymousClass1.L$1 = str;
                    anonymousClass1.L$2 = file;
                    anonymousClass1.L$3 = imageExportResult;
                    anonymousClass1.L$4 = str2;
                    anonymousClass1.label = 3;
                    Object objExif = imageExportResult.exif(contentResolver3, anonymousClass1);
                    if (objExif != coroutine_suspended) {
                        imageExportResult3 = imageExportResult;
                        objExportAsync = objExif;
                        str4 = str;
                        uri3 = uri2;
                        bundle = (Bundle) objExportAsync;
                        uri2 = uri3;
                        imageExportResult = imageExportResult3;
                        str3 = str4;
                        String str62 = str2;
                        Bundle bundle22 = bundle;
                        additionalFileData = getAdditionalFileData(uri2);
                        MediaType mediaType2 = MediaType.IMAGE;
                        String string2 = Uri.fromFile(file).toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                        int width2 = imageExportResult.getWidth();
                        int height2 = imageExportResult.getHeight();
                        if (additionalFileData == null) {
                            name = file.getName();
                        }
                        return new ImagePickerAsset(ImagePickerUtilsKt.getMediaStoreAssetId(uri2), mediaType2, string2, width2, height2, name, Boxing.boxLong((additionalFileData == null || (fileSize = additionalFileData.getFileSize()) == null) ? file.length() : fileSize.longValue()), str3, str62, bundle22, null, null, 3072, null);
                    }
                    return coroutine_suspended;
                }
                str3 = str;
                String str622 = str2;
                Bundle bundle222 = bundle;
                additionalFileData = getAdditionalFileData(uri2);
                MediaType mediaType22 = MediaType.IMAGE;
                String string22 = Uri.fromFile(file).toString();
                Intrinsics.checkNotNullExpressionValue(string22, "toString(...)");
                int width22 = imageExportResult.getWidth();
                int height22 = imageExportResult.getHeight();
                if (additionalFileData == null) {
                }
                return new ImagePickerAsset(ImagePickerUtilsKt.getMediaStoreAssetId(uri2), mediaType22, string22, width22, height22, name, Boxing.boxLong((additionalFileData == null || (fileSize = additionalFileData.getFileSize()) == null) ? file.length() : fileSize.longValue()), str3, str622, bundle222, null, null, 3072, null);
            }
            imageExportResult = imageExportResult2;
            imagePickerOptions2 = imagePickerOptions3;
            uri4 = uri2;
            uri2 = uri4;
            str2 = null;
            imagePickerOptions3 = imagePickerOptions2;
            boolBoxBoolean = Boxing.boxBoolean(imagePickerOptions3.getExif());
            if (!boolBoxBoolean.booleanValue()) {
            }
            if (boolBoxBoolean != null) {
            }
        }
        imageExportResult = (ImageExportResult) objExportAsync;
        Boolean boolBoxBoolean2 = Boxing.boxBoolean(imagePickerOptions2.getBase64());
        if (!boolBoxBoolean2.booleanValue()) {
            boolBoxBoolean2 = null;
        }
        if (boolBoxBoolean2 != null) {
            boolBoxBoolean2.booleanValue();
            ContentResolver contentResolver4 = getContext().getContentResolver();
            Intrinsics.checkNotNullExpressionValue(contentResolver4, "getContentResolver(...)");
            anonymousClass1.L$0 = uri4;
            anonymousClass1.L$1 = imagePickerOptions2;
            anonymousClass1.L$2 = str;
            anonymousClass1.L$3 = file;
            anonymousClass1.L$4 = imageExportResult;
            anonymousClass1.label = 2;
            Object objData = imageExportResult.data(contentResolver4, anonymousClass1);
            if (objData != coroutine_suspended) {
                uri2 = uri4;
                imageExportResult2 = imageExportResult;
                objExportAsync = objData;
                imagePickerOptions3 = imagePickerOptions2;
                byteArrayOutputStream = (ByteArrayOutputStream) objExportAsync;
                if (byteArrayOutputStream == null) {
                }
            }
            return coroutine_suspended;
        }
        uri2 = uri4;
        str2 = null;
        imagePickerOptions3 = imagePickerOptions2;
        boolBoxBoolean = Boxing.boxBoolean(imagePickerOptions3.getExif());
        if (!boolBoxBoolean.booleanValue()) {
        }
        if (boolBoxBoolean != null) {
        }
    }

    private final AdditionalFileData getAdditionalFileData(Uri uri) {
        Object objM9118constructorimpl;
        Cursor cursorQuery = getContext().getContentResolver().query(uri, (String[]) CollectionsKt.listOf((Object[]) new String[]{"_display_name", "_size"}).toArray(new String[0]), null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        Cursor cursor = cursorQuery;
        try {
            Cursor cursor2 = cursor;
            if (!cursor2.moveToFirst()) {
                CloseableKt.closeFinally(cursor, null);
                return null;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                MediaHandler mediaHandler = this;
                Integer numValueOf = Integer.valueOf(cursor2.getColumnIndex("_display_name"));
                if (numValueOf.intValue() == -1) {
                    numValueOf = null;
                }
                String string = numValueOf != null ? cursor2.getString(numValueOf.intValue()) : null;
                Integer numValueOf2 = Integer.valueOf(cursor2.getColumnIndex("_size"));
                if (numValueOf2.intValue() == -1) {
                    numValueOf2 = null;
                }
                objM9118constructorimpl = Result.m9118constructorimpl(new AdditionalFileData(string, numValueOf2 != null ? Long.valueOf(cursor2.getLong(numValueOf2.intValue())) : null));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
                objM9118constructorimpl = null;
            }
            AdditionalFileData additionalFileData = (AdditionalFileData) objM9118constructorimpl;
            CloseableKt.closeFinally(cursor, null);
            return additionalFileData;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleVideo(Uri uri, Continuation<? super ImagePickerAsset> continuation) throws SecurityException, IOException, FailedToCreateFileException, IllegalArgumentException, FailedToExtractVideoMetadataException {
        C11931 c11931;
        File fileCreateOutputFile;
        Uri uri2 = uri;
        if (continuation instanceof C11931) {
            c11931 = (C11931) continuation;
            if ((c11931.label & Integer.MIN_VALUE) != 0) {
                c11931.label -= Integer.MIN_VALUE;
            } else {
                c11931 = new C11931(continuation);
            }
        }
        Object obj = c11931.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c11931.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            fileCreateOutputFile = ImagePickerUtilsKt.createOutputFile(getCacheDirectory(), ".mp4");
            ContentResolver contentResolver = getContext().getContentResolver();
            Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
            c11931.L$0 = uri2;
            c11931.L$1 = fileCreateOutputFile;
            c11931.label = 1;
            if (ImagePickerUtilsKt.copyFile(uri2, fileCreateOutputFile, contentResolver, c11931) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            File file = (File) c11931.L$1;
            Uri uri3 = (Uri) c11931.L$0;
            ResultKt.throwOnFailure(obj);
            fileCreateOutputFile = file;
            uri2 = uri3;
        }
        Uri uriFromFile = Uri.fromFile(fileCreateOutputFile);
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(getContext(), uriFromFile);
            AdditionalFileData additionalFileData = getAdditionalFileData(uri2);
            ContentResolver contentResolver2 = getContext().getContentResolver();
            Intrinsics.checkNotNullExpressionValue(contentResolver2, "getContentResolver(...)");
            String type = ImagePickerUtilsKt.getType(contentResolver2, uri2);
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = ImagePickerUtilsKt.extractInt(mediaMetadataRetriever, 18);
            Ref.IntRef intRef2 = new Ref.IntRef();
            intRef2.element = ImagePickerUtilsKt.extractInt(mediaMetadataRetriever, 19);
            int iExtractInt = ImagePickerUtilsKt.extractInt(mediaMetadataRetriever, 24);
            if (iExtractInt % RotationOptions.ROTATE_180 != 0) {
                int i2 = intRef2.element;
                intRef2.element = intRef.element;
                intRef.element = i2;
            }
            MediaType mediaType = MediaType.VIDEO;
            String string = uriFromFile.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return new ImagePickerAsset(ImagePickerUtilsKt.getMediaStoreAssetId(uri2), mediaType, string, intRef.element, intRef2.element, additionalFileData != null ? additionalFileData.getFileName() : null, additionalFileData != null ? additionalFileData.getFileSize() : null, type, null, null, Boxing.boxInt(ImagePickerUtilsKt.extractInt(mediaMetadataRetriever, 9)), Boxing.boxInt(iExtractInt), ViewUtils.EDGE_TO_EDGE_FLAGS, null);
        } catch (FailedToExtractVideoMetadataException e) {
            throw new FailedToExtractVideoMetadataException(fileCreateOutputFile, e);
        }
    }
}
