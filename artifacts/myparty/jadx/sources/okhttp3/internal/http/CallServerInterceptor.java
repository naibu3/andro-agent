package okhttp3.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http2.ConnectionShutdownException;
import okio.BufferedSink;
import okio.Okio;

/* compiled from: CallServerInterceptor.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "forWebSocket", "", "(Z)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "shouldIgnoreAndWaitForRealResponse", "code", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    private final boolean shouldIgnoreAndWaitForRealResponse(int code) {
        if (code == 100) {
            return true;
        }
        return 102 <= code && code < 200;
    }

    public CallServerInterceptor(boolean z) {
        this.forWebSocket = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2 A[Catch: IOException -> 0x019f, TryCatch #1 {IOException -> 0x019f, blocks: (B:39:0x00ab, B:41:0x00b4, B:42:0x00b8, B:44:0x00e2, B:46:0x00eb, B:47:0x00ee, B:48:0x0112, B:52:0x011d, B:54:0x013c, B:56:0x014a, B:63:0x0160, B:65:0x0166, B:69:0x0173, B:71:0x018a, B:72:0x0192, B:73:0x019d, B:58:0x0155, B:53:0x012c), top: B:84:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012c A[Catch: IOException -> 0x019f, TryCatch #1 {IOException -> 0x019f, blocks: (B:39:0x00ab, B:41:0x00b4, B:42:0x00b8, B:44:0x00e2, B:46:0x00eb, B:47:0x00ee, B:48:0x0112, B:52:0x011d, B:54:0x013c, B:56:0x014a, B:63:0x0160, B:65:0x0166, B:69:0x0173, B:71:0x018a, B:72:0x0192, B:73:0x019d, B:58:0x0155, B:53:0x012c), top: B:84:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0155 A[Catch: IOException -> 0x019f, TryCatch #1 {IOException -> 0x019f, blocks: (B:39:0x00ab, B:41:0x00b4, B:42:0x00b8, B:44:0x00e2, B:46:0x00eb, B:47:0x00ee, B:48:0x0112, B:52:0x011d, B:54:0x013c, B:56:0x014a, B:63:0x0160, B:65:0x0166, B:69:0x0173, B:71:0x018a, B:72:0x0192, B:73:0x019d, B:58:0x0155, B:53:0x012c), top: B:84:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0160 A[Catch: IOException -> 0x019f, TryCatch #1 {IOException -> 0x019f, blocks: (B:39:0x00ab, B:41:0x00b4, B:42:0x00b8, B:44:0x00e2, B:46:0x00eb, B:47:0x00ee, B:48:0x0112, B:52:0x011d, B:54:0x013c, B:56:0x014a, B:63:0x0160, B:65:0x0166, B:69:0x0173, B:71:0x018a, B:72:0x0192, B:73:0x019d, B:58:0x0155, B:53:0x012c), top: B:84:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0166 A[Catch: IOException -> 0x019f, TryCatch #1 {IOException -> 0x019f, blocks: (B:39:0x00ab, B:41:0x00b4, B:42:0x00b8, B:44:0x00e2, B:46:0x00eb, B:47:0x00ee, B:48:0x0112, B:52:0x011d, B:54:0x013c, B:56:0x014a, B:63:0x0160, B:65:0x0166, B:69:0x0173, B:71:0x018a, B:72:0x0192, B:73:0x019d, B:58:0x0155, B:53:0x012c), top: B:84:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0173 A[Catch: IOException -> 0x019f, TryCatch #1 {IOException -> 0x019f, blocks: (B:39:0x00ab, B:41:0x00b4, B:42:0x00b8, B:44:0x00e2, B:46:0x00eb, B:47:0x00ee, B:48:0x0112, B:52:0x011d, B:54:0x013c, B:56:0x014a, B:63:0x0160, B:65:0x0166, B:69:0x0173, B:71:0x018a, B:72:0x0192, B:73:0x019d, B:58:0x0155, B:53:0x012c), top: B:84:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v21, types: [okhttp3.Response$Builder] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Response intercept(Interceptor.Chain chain) throws IOException {
        boolean z;
        ?? PermitsRequestBody;
        Response.Builder responseHeaders;
        Response responseBuild;
        int iCode;
        Response responseBuild2;
        ResponseBody responseBodyBody;
        Object obj;
        Intrinsics.checkNotNullParameter(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Exchange exchange = realInterceptorChain.getExchange();
        Intrinsics.checkNotNull(exchange);
        Request request = realInterceptorChain.getRequest();
        RequestBody requestBodyBody = request.body();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            exchange.writeRequestHeaders(request);
            PermitsRequestBody = HttpMethod.permitsRequestBody(request.method());
            try {
                if (PermitsRequestBody != 0 && requestBodyBody != null) {
                    if (StringsKt.equals("100-continue", request.header("Expect"), true)) {
                        exchange.flushRequest();
                        PermitsRequestBody = exchange.readResponseHeaders(true);
                        try {
                            exchange.responseHeadersStart();
                            z = false;
                            obj = PermitsRequestBody;
                        } catch (IOException e) {
                            e = e;
                            z = true;
                            if (e instanceof ConnectionShutdownException) {
                                throw e;
                            }
                            responseHeaders = PermitsRequestBody;
                            if (!exchange.getHasFailure()) {
                                throw e;
                            }
                            if (responseHeaders == null) {
                            }
                            responseBuild = responseHeaders.request(request).handshake(exchange.getConnection().getHandshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
                            iCode = responseBuild.code();
                            if (shouldIgnoreAndWaitForRealResponse(iCode)) {
                            }
                            exchange.responseHeadersEnd(responseBuild);
                            if (!this.forWebSocket) {
                                responseBuild2 = responseBuild.newBuilder().body(exchange.openResponseBody(responseBuild)).build();
                            }
                            if (!StringsKt.equals("close", responseBuild2.request().header("Connection"), true)) {
                                exchange.noNewExchangesOnConnection();
                            }
                            if (iCode != 204) {
                                responseBodyBody = responseBuild2.body();
                                if ((responseBodyBody == null ? responseBodyBody.getContentLength() : -1L) > 0) {
                                }
                            }
                            return responseBuild2;
                        }
                    } else {
                        z = true;
                        obj = null;
                    }
                    if (obj == null) {
                        if (requestBodyBody.isDuplex()) {
                            exchange.flushRequest();
                            requestBodyBody.writeTo(Okio.buffer(exchange.createRequestBody(request, true)));
                            PermitsRequestBody = obj;
                        } else {
                            BufferedSink bufferedSinkBuffer = Okio.buffer(exchange.createRequestBody(request, false));
                            requestBodyBody.writeTo(bufferedSinkBuffer);
                            bufferedSinkBuffer.close();
                            PermitsRequestBody = obj;
                        }
                    } else {
                        exchange.noRequestBody();
                        PermitsRequestBody = obj;
                        if (!exchange.getConnection().isMultiplexed$okhttp()) {
                            exchange.noNewExchangesOnConnection();
                            PermitsRequestBody = obj;
                        }
                    }
                } else {
                    exchange.noRequestBody();
                    z = true;
                    PermitsRequestBody = 0;
                }
                if (requestBodyBody == null || !requestBodyBody.isDuplex()) {
                    exchange.finishRequest();
                }
                e = null;
                responseHeaders = PermitsRequestBody;
            } catch (IOException e2) {
                e = e2;
            }
        } catch (IOException e3) {
            e = e3;
            z = true;
            PermitsRequestBody = 0;
        }
        if (responseHeaders == null) {
            try {
                responseHeaders = exchange.readResponseHeaders(false);
                Intrinsics.checkNotNull(responseHeaders);
                if (z) {
                    exchange.responseHeadersStart();
                    z = false;
                }
            } catch (IOException e4) {
                if (e != null) {
                    ExceptionsKt.addSuppressed(e, e4);
                    throw e;
                }
                throw e4;
            }
        }
        responseBuild = responseHeaders.request(request).handshake(exchange.getConnection().getHandshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        iCode = responseBuild.code();
        if (shouldIgnoreAndWaitForRealResponse(iCode)) {
            Response.Builder responseHeaders2 = exchange.readResponseHeaders(false);
            Intrinsics.checkNotNull(responseHeaders2);
            if (z) {
                exchange.responseHeadersStart();
            }
            responseBuild = responseHeaders2.request(request).handshake(exchange.getConnection().getHandshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            iCode = responseBuild.code();
        }
        exchange.responseHeadersEnd(responseBuild);
        if (!this.forWebSocket && iCode == 101) {
            responseBuild2 = responseBuild.newBuilder().body(Util.EMPTY_RESPONSE).build();
        } else {
            responseBuild2 = responseBuild.newBuilder().body(exchange.openResponseBody(responseBuild)).build();
        }
        if (!StringsKt.equals("close", responseBuild2.request().header("Connection"), true) || StringsKt.equals("close", Response.header$default(responseBuild2, "Connection", null, 2, null), true)) {
            exchange.noNewExchangesOnConnection();
        }
        if (iCode != 204 || iCode == 205) {
            responseBodyBody = responseBuild2.body();
            if ((responseBodyBody == null ? responseBodyBody.getContentLength() : -1L) > 0) {
                StringBuilder sbAppend = new StringBuilder("HTTP ").append(iCode).append(" had non-zero Content-Length: ");
                ResponseBody responseBodyBody2 = responseBuild2.body();
                throw new ProtocolException(sbAppend.append(responseBodyBody2 != null ? Long.valueOf(responseBodyBody2.getContentLength()) : null).toString());
            }
        }
        return responseBuild2;
    }
}
