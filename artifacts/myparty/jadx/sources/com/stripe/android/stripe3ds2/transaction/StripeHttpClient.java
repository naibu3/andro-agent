package com.stripe.android.stripe3ds2.transaction;

import androidx.browser.trusted.sharing.ShareTarget;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: StripeHttpClient.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0002\"#B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\rH\u0096@¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0096@¢\u0006\u0002\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0002J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0002\b\u0018J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\rH\u0002J\u0018\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0002J\b\u0010 \u001a\u00020\u0017H\u0002J\b\u0010!\u001a\u00020\u0017H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeHttpClient;", "Lcom/stripe/android/stripe3ds2/transaction/HttpClient;", "url", "", "connectionFactory", "Lcom/stripe/android/stripe3ds2/transaction/StripeHttpClient$ConnectionFactory;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/StripeHttpClient$ConnectionFactory;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V", "doGetRequest", "Ljava/io/InputStream;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doPostRequest", "Lcom/stripe/android/stripe3ds2/transaction/HttpResponse;", "requestBody", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_CONTENT_TYPE_KEY, "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doPostRequestInternal", "handlePostResponse", "conn", "Ljava/net/HttpURLConnection;", "handlePostResponse$3ds2sdk_release", "isSuccessfulResponse", "", "responseCode", "", "getResponseBody", "inputStream", "createPostConnection", "createGetConnection", "createConnection", "ConnectionFactory", "DefaultConnectionFactory", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StripeHttpClient implements HttpClient {
    private final ConnectionFactory connectionFactory;
    private final ErrorReporter errorReporter;
    private final String url;
    private final CoroutineContext workContext;

    /* compiled from: StripeHttpClient.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeHttpClient$ConnectionFactory;", "", "create", "Ljava/net/HttpURLConnection;", "url", "", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ConnectionFactory {
        HttpURLConnection create(String url);
    }

    private final boolean isSuccessfulResponse(int responseCode) {
        return 200 <= responseCode && responseCode < 300;
    }

    public StripeHttpClient(String url, ConnectionFactory connectionFactory, ErrorReporter errorReporter, CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.url = url;
        this.connectionFactory = connectionFactory;
        this.errorReporter = errorReporter;
        this.workContext = workContext;
    }

    public /* synthetic */ StripeHttpClient(String str, DefaultConnectionFactory defaultConnectionFactory, ErrorReporter errorReporter, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new DefaultConnectionFactory() : defaultConnectionFactory, errorReporter, coroutineContext);
    }

    /* compiled from: StripeHttpClient.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Ljava/io/InputStream;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.stripe3ds2.transaction.StripeHttpClient$doGetRequest$2", f = "StripeHttpClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.stripe3ds2.transaction.StripeHttpClient$doGetRequest$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InputStream>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = StripeHttpClient.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InputStream> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM9118constructorimpl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            StripeHttpClient stripeHttpClient = StripeHttpClient.this;
            try {
                Result.Companion companion = Result.INSTANCE;
                HttpURLConnection httpURLConnectionCreateGetConnection = stripeHttpClient.createGetConnection();
                httpURLConnectionCreateGetConnection.connect();
                objM9118constructorimpl = Result.m9118constructorimpl(httpURLConnectionCreateGetConnection.getResponseCode() == 200 ? httpURLConnectionCreateGetConnection.getInputStream() : null);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            StripeHttpClient stripeHttpClient2 = StripeHttpClient.this;
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl != null) {
                stripeHttpClient2.errorReporter.reportError(thM9121exceptionOrNullimpl);
            }
            if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
                return null;
            }
            return objM9118constructorimpl;
        }
    }

    @Override // com.stripe.android.stripe3ds2.transaction.HttpClient
    public Object doGetRequest(Continuation<? super InputStream> continuation) {
        return BuildersKt.withContext(this.workContext, new AnonymousClass2(null), continuation);
    }

    /* compiled from: StripeHttpClient.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/stripe3ds2/transaction/HttpResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.stripe3ds2.transaction.StripeHttpClient$doPostRequest$2", f = "StripeHttpClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.stripe3ds2.transaction.StripeHttpClient$doPostRequest$2, reason: invalid class name and case insensitive filesystem */
    static final class C11622 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HttpResponse>, Object> {
        final /* synthetic */ String $contentType;
        final /* synthetic */ String $requestBody;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11622(String str, String str2, Continuation<? super C11622> continuation) {
            super(2, continuation);
            this.$requestBody = str;
            this.$contentType = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11622 c11622 = StripeHttpClient.this.new C11622(this.$requestBody, this.$contentType, continuation);
            c11622.L$0 = obj;
            return c11622;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super HttpResponse> continuation) {
            return ((C11622) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM9118constructorimpl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            StripeHttpClient stripeHttpClient = StripeHttpClient.this;
            String str = this.$requestBody;
            String str2 = this.$contentType;
            try {
                Result.Companion companion = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(stripeHttpClient.doPostRequestInternal(str, str2));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            StripeHttpClient stripeHttpClient2 = StripeHttpClient.this;
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl != null) {
                stripeHttpClient2.errorReporter.reportError(thM9121exceptionOrNullimpl);
            }
            Throwable thM9121exceptionOrNullimpl2 = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl2 == null) {
                return objM9118constructorimpl;
            }
            throw new SDKRuntimeException(thM9121exceptionOrNullimpl2);
        }
    }

    @Override // com.stripe.android.stripe3ds2.transaction.HttpClient
    public Object doPostRequest(String str, String str2, Continuation<? super HttpResponse> continuation) {
        return BuildersKt.withContext(this.workContext, new C11622(str, str2, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HttpResponse doPostRequestInternal(String requestBody, String contentType) throws ProtocolException {
        HttpURLConnection httpURLConnectionCreatePostConnection = createPostConnection(requestBody, contentType);
        OutputStreamWriter outputStream = httpURLConnectionCreatePostConnection.getOutputStream();
        try {
            OutputStream outputStream2 = outputStream;
            Intrinsics.checkNotNull(outputStream2);
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            outputStream = new OutputStreamWriter(outputStream2, UTF_8);
            try {
                OutputStreamWriter outputStreamWriter = outputStream;
                outputStreamWriter.write(requestBody);
                outputStreamWriter.flush();
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(outputStream, null);
                Unit unit2 = Unit.INSTANCE;
                CloseableKt.closeFinally(outputStream, null);
                httpURLConnectionCreatePostConnection.connect();
                return handlePostResponse$3ds2sdk_release(httpURLConnectionCreatePostConnection);
            } finally {
            }
        } finally {
        }
    }

    public final HttpResponse handlePostResponse$3ds2sdk_release(HttpURLConnection conn) throws IOException {
        Intrinsics.checkNotNullParameter(conn, "conn");
        int responseCode = conn.getResponseCode();
        if (!isSuccessfulResponse(responseCode)) {
            throw new SDKRuntimeException("Unsuccessful response code from " + this.url + ": " + responseCode, null, 2, null);
        }
        InputStream inputStream = conn.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        return new HttpResponse(getResponseBody(inputStream), conn.getContentType());
    }

    private final String getResponseBody(InputStream inputStream) {
        Object objM9118constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            StripeHttpClient stripeHttpClient = this;
            Reader inputStreamReader = new InputStreamReader(inputStream, Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                String text = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                objM9118constructorimpl = Result.m9118constructorimpl(text);
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        String str = (String) (Result.m9124isFailureimpl(objM9118constructorimpl) ? null : objM9118constructorimpl);
        return str == null ? "" : str;
    }

    private final HttpURLConnection createPostConnection(String requestBody, String contentType) throws ProtocolException {
        HttpURLConnection httpURLConnectionCreateConnection = createConnection();
        httpURLConnectionCreateConnection.setRequestMethod(ShareTarget.METHOD_POST);
        httpURLConnectionCreateConnection.setDoOutput(true);
        httpURLConnectionCreateConnection.setRequestProperty("Content-Type", contentType);
        httpURLConnectionCreateConnection.setRequestProperty("Content-Length", String.valueOf(requestBody.length()));
        return httpURLConnectionCreateConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HttpURLConnection createGetConnection() {
        HttpURLConnection httpURLConnectionCreateConnection = createConnection();
        httpURLConnectionCreateConnection.setDoInput(true);
        return httpURLConnectionCreateConnection;
    }

    private final HttpURLConnection createConnection() {
        return this.connectionFactory.create(this.url);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: StripeHttpClient.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeHttpClient$DefaultConnectionFactory;", "Lcom/stripe/android/stripe3ds2/transaction/StripeHttpClient$ConnectionFactory;", "<init>", "()V", "create", "Ljava/net/HttpURLConnection;", "url", "", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultConnectionFactory implements ConnectionFactory {
        @Override // com.stripe.android.stripe3ds2.transaction.StripeHttpClient.ConnectionFactory
        public HttpURLConnection create(String url) throws IOException {
            Intrinsics.checkNotNullParameter(url, "url");
            URLConnection uRLConnectionOpenConnection = new URL(url).openConnection();
            Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            return (HttpURLConnection) uRLConnectionOpenConnection;
        }
    }
}
