package expo.modules.filesystem.unifiedfile;

import android.content.Context;
import android.net.Uri;
import androidx.documentfile.provider.DocumentFile;
import com.facebook.share.internal.ShareConstants;
import expo.modules.kotlin.AppContext;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;

/* compiled from: SAFDocumentFile.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u000fH\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001dH\u0016J\u000f\u0010!\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0002\u0010#J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020\"H\u0016J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00020\u000001H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010 R\u0016\u0010)\u001a\u0004\u0018\u00010\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010#¨\u00062"}, d2 = {"Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;", "Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "context", "Landroid/content/Context;", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "<init>", "(Landroid/content/Context;Landroid/net/Uri;)V", "getUri", "()Landroid/net/Uri;", "documentFile", "Landroidx/documentfile/provider/DocumentFile;", "getDocumentFile", "()Landroidx/documentfile/provider/DocumentFile;", "exists", "", "isDirectory", "isFile", "parentFile", "getParentFile", "()Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "createFile", "mimeType", "", "displayName", "createDirectory", "delete", "deleteRecursively", "listFilesAsUnified", "", "type", "getType", "()Ljava/lang/String;", "lastModified", "", "()Ljava/lang/Long;", "fileName", "getFileName", "getContentUri", "appContext", "Lexpo/modules/kotlin/AppContext;", "creationTime", "getCreationTime", "outputStream", "Ljava/io/OutputStream;", "inputStream", "Ljava/io/InputStream;", "length", "walkTopDown", "Lkotlin/sequences/Sequence;", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SAFDocumentFile implements UnifiedFileInterface {
    private final Context context;
    private final Uri uri;

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public Long getCreationTime() {
        return null;
    }

    public SAFDocumentFile(Context context, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.context = context;
        this.uri = uri;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public Uri getUri() {
        return this.uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DocumentFile getDocumentFile() {
        List<String> pathSegments = getUri().getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        String str = (String) CollectionsKt.getOrNull(pathSegments, 0);
        if (str == null) {
            str = "tree";
        }
        if (Intrinsics.areEqual(str, "document")) {
            return DocumentFile.fromSingleUri(this.context, getUri());
        }
        return DocumentFile.fromTreeUri(this.context, getUri());
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public boolean exists() {
        DocumentFile documentFile = getDocumentFile();
        return documentFile != null && documentFile.exists();
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public boolean isDirectory() {
        DocumentFile documentFile = getDocumentFile();
        return documentFile != null && documentFile.isDirectory();
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public boolean isFile() {
        DocumentFile documentFile = getDocumentFile();
        return documentFile != null && documentFile.isFile();
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public UnifiedFileInterface getParentFile() {
        DocumentFile parentFile;
        Uri uri;
        DocumentFile documentFile = getDocumentFile();
        return (documentFile == null || (parentFile = documentFile.getParentFile()) == null || (uri = parentFile.getUri()) == null) ? null : new SAFDocumentFile(this.context, uri);
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public UnifiedFileInterface createFile(String mimeType, String displayName) {
        Uri uri;
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        DocumentFile documentFile = getDocumentFile();
        SAFDocumentFile sAFDocumentFile = null;
        DocumentFile documentFileCreateFile = documentFile != null ? documentFile.createFile(mimeType, displayName) : null;
        if (documentFileCreateFile != null && (uri = documentFileCreateFile.getUri()) != null) {
            sAFDocumentFile = new SAFDocumentFile(this.context, uri);
        }
        return sAFDocumentFile;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public UnifiedFileInterface createDirectory(String displayName) {
        Uri uri;
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        DocumentFile documentFile = getDocumentFile();
        SAFDocumentFile sAFDocumentFile = null;
        DocumentFile documentFileCreateDirectory = documentFile != null ? documentFile.createDirectory(displayName) : null;
        if (documentFileCreateDirectory != null && (uri = documentFileCreateDirectory.getUri()) != null) {
            sAFDocumentFile = new SAFDocumentFile(this.context, uri);
        }
        return sAFDocumentFile;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public boolean delete() {
        DocumentFile documentFile = getDocumentFile();
        return documentFile != null && documentFile.delete();
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public boolean deleteRecursively() {
        DocumentFile documentFile = getDocumentFile();
        return documentFile != null && SAFDocumentFileKt.deleteRecursively(documentFile);
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public List<UnifiedFileInterface> listFilesAsUnified() {
        DocumentFile[] documentFileArrListFiles;
        DocumentFile documentFile = getDocumentFile();
        if (documentFile == null || (documentFileArrListFiles = documentFile.listFiles()) == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(documentFileArrListFiles.length);
        for (DocumentFile documentFile2 : documentFileArrListFiles) {
            Context context = this.context;
            Uri uri = documentFile2.getUri();
            Intrinsics.checkNotNullExpressionValue(uri, "getUri(...)");
            arrayList.add(new SAFDocumentFile(context, uri));
        }
        return arrayList;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public String getType() {
        DocumentFile documentFile = getDocumentFile();
        if (documentFile != null) {
            return documentFile.getType();
        }
        return null;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public Long lastModified() {
        DocumentFile documentFile = getDocumentFile();
        if (documentFile != null) {
            return Long.valueOf(documentFile.lastModified());
        }
        return null;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public String getFileName() {
        DocumentFile documentFile = getDocumentFile();
        if (documentFile != null) {
            return documentFile.getName();
        }
        return null;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public Uri getContentUri(AppContext appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        return getUri();
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public OutputStream outputStream() throws FileNotFoundException {
        OutputStream outputStreamOpenOutputStream = this.context.getContentResolver().openOutputStream(getUri());
        if (outputStreamOpenOutputStream != null) {
            return outputStreamOpenOutputStream;
        }
        throw new IllegalStateException("Unable to open output stream for URI: " + getUri());
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public InputStream inputStream() throws FileNotFoundException {
        InputStream inputStreamOpenInputStream = this.context.getContentResolver().openInputStream(getUri());
        if (inputStreamOpenInputStream != null) {
            return inputStreamOpenInputStream;
        }
        throw new IllegalStateException("Unable to open output stream for URI: " + getUri());
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public long length() {
        DocumentFile documentFile = getDocumentFile();
        if (documentFile != null) {
            return documentFile.length();
        }
        return 0L;
    }

    /* compiled from: SAFDocumentFile.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.filesystem.unifiedfile.SAFDocumentFile$walkTopDown$1", f = "SAFDocumentFile.kt", i = {0, 1, 1}, l = {89, 92}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "$this$forEach$iv"}, s = {"L$0", "L$0", "L$1"})
    /* renamed from: expo.modules.filesystem.unifiedfile.SAFDocumentFile$walkTopDown$1, reason: invalid class name */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super SAFDocumentFile>, Continuation<? super Unit>, Object> {
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
            AnonymousClass1 anonymousClass1 = SAFDocumentFile.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super SAFDocumentFile> sequenceScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
        
            if (r1.yield(r11.this$0, r11) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0094, code lost:
        
            if (r7.yieldAll(r12, r11) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0094 -> B:24:0x0097). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            SequenceScope sequenceScope;
            DocumentFile documentFile;
            DocumentFile[] documentFileArrListFiles;
            SequenceScope sequenceScope2;
            int length;
            SAFDocumentFile sAFDocumentFile;
            int i;
            DocumentFile[] documentFileArr;
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
                    sAFDocumentFile = (SAFDocumentFile) this.L$2;
                    documentFileArr = (DocumentFile[]) this.L$1;
                    sequenceScope2 = (SequenceScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    i++;
                    if (i < length) {
                        DocumentFile documentFile2 = documentFileArr[i];
                        Context context = sAFDocumentFile.context;
                        Uri uri = documentFile2.getUri();
                        Intrinsics.checkNotNullExpressionValue(uri, "getUri(...)");
                        Sequence<SAFDocumentFile> sequenceWalkTopDown = new SAFDocumentFile(context, uri).walkTopDown();
                        this.L$0 = sequenceScope2;
                        this.L$1 = documentFileArr;
                        this.L$2 = sAFDocumentFile;
                        this.I$0 = i;
                        this.I$1 = length;
                        this.label = 2;
                    }
                    return Unit.INSTANCE;
                }
                sequenceScope = (SequenceScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            if (SAFDocumentFile.this.isDirectory() && (documentFile = SAFDocumentFile.this.getDocumentFile()) != null && (documentFileArrListFiles = documentFile.listFiles()) != null) {
                SAFDocumentFile sAFDocumentFile2 = SAFDocumentFile.this;
                sequenceScope2 = sequenceScope;
                length = documentFileArrListFiles.length;
                sAFDocumentFile = sAFDocumentFile2;
                i = 0;
                documentFileArr = documentFileArrListFiles;
                if (i < length) {
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public Sequence<SAFDocumentFile> walkTopDown() {
        return SequencesKt.sequence(new AnonymousClass1(null));
    }
}
