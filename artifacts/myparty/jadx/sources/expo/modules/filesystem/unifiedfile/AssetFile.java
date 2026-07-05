package expo.modules.filesystem.unifiedfile;

import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.facebook.share.internal.ShareConstants;
import expo.modules.kotlin.AppContext;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.apache.commons.io.IOUtils;

/* compiled from: AssetFile.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000bH\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001d\u001a\u00020\u000bH\u0016J\b\u0010\u001f\u001a\u00020\u000fH\u0016J\b\u0010 \u001a\u00020\u000fH\u0016J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\"H\u0016J\u000f\u0010%\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0002\u0010'J\b\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020&H\u0016J\u000e\u00101\u001a\b\u0012\u0004\u0012\u00020\u000002H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010#\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\rR\u0016\u0010(\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\rR\u0016\u0010*\u001a\u0004\u0018\u00010&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010'¨\u00063"}, d2 = {"Lexpo/modules/filesystem/unifiedfile/AssetFile;", "Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "context", "Landroid/content/Context;", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "<init>", "(Landroid/content/Context;Landroid/net/Uri;)V", "getUri", "()Landroid/net/Uri;", "path", "", "getPath", "()Ljava/lang/String;", "exists", "", "isDirectory", "isFile", "contentUri", "getContentUri", "setContentUri", "(Landroid/net/Uri;)V", "appContext", "Lexpo/modules/kotlin/AppContext;", "parentFile", "getParentFile", "()Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "createFile", "mimeType", "displayName", "createDirectory", "delete", "deleteRecursively", "listFilesAsUnified", "", "type", "getType", "lastModified", "", "()Ljava/lang/Long;", "fileName", "getFileName", "creationTime", "getCreationTime", "outputStream", "Ljava/io/OutputStream;", "inputStream", "Ljava/io/InputStream;", "length", "walkTopDown", "Lkotlin/sequences/Sequence;", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AssetFile implements UnifiedFileInterface {
    private Uri contentUri;
    private final Context context;
    private final String path;
    private final Uri uri;

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public Long getCreationTime() {
        return null;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public Long lastModified() {
        return null;
    }

    public AssetFile(Context context, Uri uri) {
        String strTrimStart;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.context = context;
        this.uri = uri;
        String path = getUri().getPath();
        if (path == null || (strTrimStart = StringsKt.trimStart(path, IOUtils.DIR_SEPARATOR_UNIX)) == null) {
            throw new IllegalArgumentException("Invalid asset URI: " + getUri());
        }
        this.path = strTrimStart;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public Uri getUri() {
        return this.uri;
    }

    public final String getPath() {
        return this.path;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public boolean exists() {
        return isDirectory() || isFile();
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public boolean isDirectory() throws IOException {
        String[] list = this.context.getAssets().list(this.path);
        if (list != null) {
            if (!(list.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public boolean isFile() {
        Object objM9118constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            AssetFile assetFile = this;
            InputStream inputStreamOpen = this.context.getAssets().open(this.path);
            try {
                InputStream inputStream = inputStreamOpen;
                CloseableKt.closeFinally(inputStreamOpen, null);
                objM9118constructorimpl = Result.m9118constructorimpl(true);
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl) != null) {
            objM9118constructorimpl = false;
        }
        return ((Boolean) objM9118constructorimpl).booleanValue();
    }

    public final Uri getContentUri() {
        return this.contentUri;
    }

    public final void setContentUri(Uri uri) {
        this.contentUri = uri;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public Uri getContentUri(AppContext appContext) throws IOException {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        FileOutputStream fileOutputStreamInputStream = inputStream();
        try {
            InputStream inputStream = fileOutputStreamInputStream;
            File file = new File(this.context.getCacheDir(), "expo_shared_assets/" + getFileName());
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            fileOutputStreamInputStream = new FileOutputStream(file);
            try {
                ByteStreamsKt.copyTo$default(inputStream, fileOutputStreamInputStream, 0, 2, null);
                CloseableKt.closeFinally(fileOutputStreamInputStream, null);
                Uri contentUri = new JavaFile(Uri.fromFile(file)).getContentUri(appContext);
                this.contentUri = contentUri;
                CloseableKt.closeFinally(fileOutputStreamInputStream, null);
                return contentUri;
            } finally {
            }
        } finally {
        }
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public UnifiedFileInterface getParentFile() {
        String path = getUri().getPath();
        if (path == null) {
            path = "";
        }
        if (path.length() == 0) {
            return null;
        }
        return new AssetFile(this.context, Uri.parse("asset://" + StringsKt.substringBeforeLast$default(path, IOUtils.DIR_SEPARATOR_UNIX, (String) null, 2, (Object) null)));
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public UnifiedFileInterface createFile(String mimeType, String displayName) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        throw new UnsupportedOperationException("Asset files are not writable and cannot be created");
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public UnifiedFileInterface createDirectory(String displayName) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        throw new UnsupportedOperationException("Asset directories are not writable and cannot be created");
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public boolean delete() {
        throw new UnsupportedOperationException("Asset files are not writable and cannot be deleted");
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public boolean deleteRecursively() {
        throw new UnsupportedOperationException("Asset files are not writable and cannot be deleted");
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public List<UnifiedFileInterface> listFilesAsUnified() throws IOException {
        String[] list = this.context.getAssets().list(this.path);
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(list.length);
        for (String str : list) {
            arrayList.add(new AssetFile(this.context, Uri.fromFile(new File(this.path, str))));
        }
        return arrayList;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public String getType() {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(getUri().toString());
        Intrinsics.checkNotNull(fileExtensionFromUrl);
        if (fileExtensionFromUrl.length() <= 0) {
            return null;
        }
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String lowerCase = fileExtensionFromUrl.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return singleton.getMimeTypeFromExtension(lowerCase);
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public String getFileName() {
        return getUri().getLastPathSegment();
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public OutputStream outputStream() {
        throw new UnsupportedOperationException("Asset files are not writable");
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public InputStream inputStream() throws IOException {
        InputStream inputStreamOpen = this.context.getAssets().open(this.path);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
        return inputStreamOpen;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public long length() {
        InputStream inputStreamOpen;
        long length;
        try {
            Result.Companion companion = Result.INSTANCE;
            AssetFile assetFile = this;
            inputStreamOpen = this.context.getAssets().openFd(this.path);
            try {
                length = inputStreamOpen.getLength();
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        if (length > 0) {
            CloseableKt.closeFinally(inputStreamOpen, null);
            return length;
        }
        Unit unit = Unit.INSTANCE;
        CloseableKt.closeFinally(inputStreamOpen, null);
        Result.m9118constructorimpl(Unit.INSTANCE);
        try {
            Result.Companion companion3 = Result.INSTANCE;
            AssetFile assetFile2 = this;
            inputStreamOpen = this.context.getAssets().open(this.path);
            try {
                InputStream inputStream = inputStreamOpen;
                byte[] bArr = new byte[8192];
                long j = 0;
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        Unit unit2 = Unit.INSTANCE;
                        CloseableKt.closeFinally(inputStreamOpen, null);
                        return j;
                    }
                    j += i;
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.m9118constructorimpl(ResultKt.createFailure(th2));
            return 0L;
        }
    }

    /* compiled from: AssetFile.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lexpo/modules/filesystem/unifiedfile/AssetFile;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.filesystem.unifiedfile.AssetFile$walkTopDown$1", f = "AssetFile.kt", i = {0, 1, 1}, l = {130, 136}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "$this$forEach$iv"}, s = {"L$0", "L$0", "L$1"})
    /* renamed from: expo.modules.filesystem.unifiedfile.AssetFile$walkTopDown$1, reason: invalid class name */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super AssetFile>, Continuation<? super Unit>, Object> {
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = AssetFile.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super AssetFile> sequenceScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
        
            if (r1.yield(r14.this$0, r14) == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00be, code lost:
        
            if (r7.yieldAll(r15, r14) == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00c0, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00be -> B:22:0x00c1). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            SequenceScope sequenceScope;
            String[] list;
            SequenceScope sequenceScope2;
            int length;
            AssetFile assetFile;
            int i;
            String[] strArr;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                sequenceScope = (SequenceScope) this.L$0;
                this.L$0 = sequenceScope;
                this.label = 1;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    length = this.I$1;
                    i = this.I$0;
                    assetFile = (AssetFile) this.L$2;
                    strArr = (String[]) this.L$1;
                    sequenceScope2 = (SequenceScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    i++;
                    if (i < length) {
                        Sequence<AssetFile> sequenceWalkTopDown = new AssetFile(assetFile.context, Uri.parse(StringsKt.replace$default(assetFile.getUri() + "/" + strArr[i], "//", "/", false, 4, (Object) null))).walkTopDown();
                        this.L$0 = sequenceScope2;
                        this.L$1 = strArr;
                        this.L$2 = assetFile;
                        this.I$0 = i;
                        this.I$1 = length;
                        this.label = 2;
                    }
                    return Unit.INSTANCE;
                }
                sequenceScope = (SequenceScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            if (AssetFile.this.isDirectory() && (list = AssetFile.this.context.getAssets().list(AssetFile.this.getPath())) != null) {
                AssetFile assetFile2 = AssetFile.this;
                sequenceScope2 = sequenceScope;
                length = list.length;
                assetFile = assetFile2;
                i = 0;
                strArr = list;
                if (i < length) {
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public Sequence<AssetFile> walkTopDown() {
        return SequencesKt.sequence(new AnonymousClass1(null));
    }
}
