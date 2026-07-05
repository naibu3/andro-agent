package com.stripe.android.core.networking;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.core.AppInfo;
import com.stripe.android.core.model.StripeFileParams;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.core.networking.StripeRequest;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: FileUploadRequest.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 42\u00020\u0001:\u00014B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J\u0018\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\tH\u0004J\u0010\u0010/\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\rR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0 X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R(\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010 X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\"\"\u0004\b%\u0010&R\u0011\u00100\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b1\u0010\rR\u0011\u00102\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b3\u0010\r¨\u00065"}, d2 = {"Lcom/stripe/android/core/networking/FileUploadRequest;", "Lcom/stripe/android/core/networking/StripeRequest;", "fileParams", "Lcom/stripe/android/core/model/StripeFileParams;", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lcom/stripe/android/core/networking/ApiRequest$Options;", "appInfo", "Lcom/stripe/android/core/AppInfo;", "boundary", "", "<init>", "(Lcom/stripe/android/core/model/StripeFileParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/AppInfo;Ljava/lang/String;)V", "getBoundary", "()Ljava/lang/String;", "headersFactory", "Lcom/stripe/android/core/networking/RequestHeadersFactory;", "method", "Lcom/stripe/android/core/networking/StripeRequest$Method;", "getMethod", "()Lcom/stripe/android/core/networking/StripeRequest$Method;", "mimeType", "Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "getMimeType", "()Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "url", "getUrl", "retryResponseCodes", "", "", "getRetryResponseCodes", "()Ljava/lang/Iterable;", "headers", "", "getHeaders", "()Ljava/util/Map;", "postHeaders", "getPostHeaders", "setPostHeaders", "(Ljava/util/Map;)V", "writePostBody", "", "outputStream", "Ljava/io/OutputStream;", "writeString", "writer", "Ljava/io/PrintWriter;", "contents", "writeFile", "fileMetadata", "getFileMetadata", "purposeContents", "getPurposeContents", "Companion", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public class FileUploadRequest extends StripeRequest {
    protected static final Companion Companion = new Companion(null);
    private static final String HOST = "https://files.stripe.com/v1/files";
    public static final String LINE_BREAK = "\r\n";
    private final String boundary;
    private final StripeFileParams fileParams;
    private final Map<String, String> headers;
    private final RequestHeadersFactory headersFactory;
    private final StripeRequest.Method method;
    private final StripeRequest.MimeType mimeType;
    private Map<String, String> postHeaders;
    private final Iterable<Integer> retryResponseCodes;
    private final String url;

    public /* synthetic */ FileUploadRequest(StripeFileParams stripeFileParams, ApiRequest.Options options, AppInfo appInfo, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stripeFileParams, options, (i & 4) != 0 ? null : appInfo, (i & 8) != 0 ? Companion.createBoundary() : str);
    }

    protected final String getBoundary() {
        return this.boundary;
    }

    public FileUploadRequest(StripeFileParams fileParams, ApiRequest.Options options, AppInfo appInfo, String boundary) {
        Intrinsics.checkNotNullParameter(fileParams, "fileParams");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        this.fileParams = fileParams;
        this.boundary = boundary;
        RequestHeadersFactory.FileUpload fileUpload = new RequestHeadersFactory.FileUpload(options, appInfo, null, null, null, boundary, 28, null);
        this.headersFactory = fileUpload;
        this.method = StripeRequest.Method.POST;
        this.mimeType = StripeRequest.MimeType.MultipartForm;
        this.url = HOST;
        this.retryResponseCodes = NetworkConstantsKt.getDEFAULT_RETRY_CODES();
        this.headers = fileUpload.create();
        this.postHeaders = fileUpload.createPostHeader();
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public StripeRequest.Method getMethod() {
        return this.method;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public StripeRequest.MimeType getMimeType() {
        return this.mimeType;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public String getUrl() {
        return this.url;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public Iterable<Integer> getRetryResponseCodes() {
        return this.retryResponseCodes;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public Map<String, String> getPostHeaders() {
        return this.postHeaders;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public void setPostHeaders(Map<String, String> map) {
        this.postHeaders = map;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public void writePostBody(OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        PrintWriter outputStreamWriter = new OutputStreamWriter(outputStream, Charsets.UTF_8);
        try {
            outputStreamWriter = new PrintWriter((Writer) outputStreamWriter, true);
            try {
                PrintWriter printWriter = outputStreamWriter;
                writeString(printWriter, getPurposeContents());
                writeString(printWriter, getFileMetadata());
                writeFile(outputStream);
                printWriter.write("\r\n");
                printWriter.write("--" + this.boundary + "--");
                printWriter.flush();
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(outputStreamWriter, null);
                Unit unit2 = Unit.INSTANCE;
                CloseableKt.closeFinally(outputStreamWriter, null);
            } finally {
            }
        } finally {
        }
    }

    protected final void writeString(PrintWriter writer, String contents) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(contents, "contents");
        writer.write(StringsKt.replace$default(contents, "\n", "\r\n", false, 4, (Object) null));
        writer.flush();
    }

    protected final void writeFile(OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        ByteStreamsKt.copyTo$default(new FileInputStream(this.fileParams.getFile$stripe_core_release()), outputStream, 0, 2, null);
    }

    public final String getFileMetadata() {
        String name = this.fileParams.getFile$stripe_core_release().getName();
        return StringsKt.trimIndent("\n                --" + this.boundary + "\n                Content-Disposition: form-data; name=\"file\"; filename=\"" + name + "\"\n                Content-Type: " + URLConnection.guessContentTypeFromName(name) + "\n                Content-Transfer-Encoding: binary\n\n\n            ");
    }

    public final String getPurposeContents() {
        return StringsKt.trimIndent("\n                --" + this.boundary + "\n                Content-Disposition: form-data; name=\"purpose\"\n\n                " + this.fileParams.getPurpose$stripe_core_release().getCode() + "\n\n            ");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: FileUploadRequest.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0085\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/stripe/android/core/networking/FileUploadRequest$Companion;", "", "<init>", "()V", "LINE_BREAK", "", "HOST", "createBoundary", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String createBoundary() {
            return String.valueOf(Random.INSTANCE.nextLong(0L, Long.MAX_VALUE));
        }
    }
}
