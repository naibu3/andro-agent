package com.stripe.android.core.networking;

import androidx.webkit.Profile;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.networking.ConnectionFactory;
import com.stripe.android.core.networking.StripeConnection;
import com.stripe.android.core.networking.StripeRequest;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConnectionFactory.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \f2\u00020\u0001:\u0003\n\u000b\fJ\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¨\u0006\r"}, d2 = {"Lcom/stripe/android/core/networking/ConnectionFactory;", "", "create", "Lcom/stripe/android/core/networking/StripeConnection;", "", "request", "Lcom/stripe/android/core/networking/StripeRequest;", "createForFile", "Ljava/io/File;", "outputFile", "ConnectionOpener", Profile.DEFAULT_PROFILE_NAME, "Companion", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ConnectionFactory {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final /* synthetic */ Companion INSTANCE = Companion.$$INSTANCE;

    StripeConnection<String> create(StripeRequest request) throws InvalidRequestException, IOException;

    StripeConnection<File> createForFile(StripeRequest request, File outputFile) throws InvalidRequestException, IOException;

    /* compiled from: ConnectionFactory.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bç\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\rJ>\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052,\u0010\u0006\u001a(\u0012\u0004\u0012\u00020\b\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0002\b\fH&¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener;", "", "open", "Ljavax/net/ssl/HttpsURLConnection;", "request", "Lcom/stripe/android/core/networking/StripeRequest;", "callback", "Lkotlin/Function2;", "Ljava/net/HttpURLConnection;", "Lkotlin/ParameterName;", "name", "", "Lkotlin/ExtensionFunctionType;", Profile.DEFAULT_PROFILE_NAME, "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ConnectionOpener {
        HttpsURLConnection open(StripeRequest request, Function2<? super HttpURLConnection, ? super StripeRequest, Unit> callback);

        /* compiled from: ConnectionFactory.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072,\u0010\b\u001a(\u0012\u0004\u0012\u00020\n\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0002\b\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener$Default;", "Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener;", "<init>", "()V", "open", "Ljavax/net/ssl/HttpsURLConnection;", "request", "Lcom/stripe/android/core/networking/StripeRequest;", "callback", "Lkotlin/Function2;", "Ljava/net/HttpURLConnection;", "Lkotlin/ParameterName;", "name", "", "Lkotlin/ExtensionFunctionType;", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Default implements ConnectionOpener {
            public static final Default INSTANCE = new Default();

            private Default() {
            }

            @Override // com.stripe.android.core.networking.ConnectionFactory.ConnectionOpener
            public HttpsURLConnection open(StripeRequest request, Function2<? super HttpURLConnection, ? super StripeRequest, Unit> callback) throws IOException {
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(callback, "callback");
                URLConnection uRLConnectionOpenConnection = new URL(request.getUrl()).openConnection();
                Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                callback.invoke(httpsURLConnection, request);
                return httpsURLConnection;
            }
        }
    }

    /* compiled from: ConnectionFactory.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eH\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/core/networking/ConnectionFactory$Default;", "Lcom/stripe/android/core/networking/ConnectionFactory;", "<init>", "()V", "connectionOpener", "Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener;", "getConnectionOpener", "()Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener;", "setConnectionOpener", "(Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener;)V", "create", "Lcom/stripe/android/core/networking/StripeConnection;", "", "request", "Lcom/stripe/android/core/networking/StripeRequest;", "createForFile", "Ljava/io/File;", "outputFile", "openConnectionAndApplyFields", "Ljavax/net/ssl/HttpsURLConnection;", "originalRequest", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Default implements ConnectionFactory {
        public static final Default INSTANCE = new Default();
        private static volatile ConnectionOpener connectionOpener = ConnectionOpener.Default.INSTANCE;

        private Default() {
        }

        public final ConnectionOpener getConnectionOpener() {
            return connectionOpener;
        }

        public final void setConnectionOpener(ConnectionOpener connectionOpener2) {
            Intrinsics.checkNotNullParameter(connectionOpener2, "<set-?>");
            connectionOpener = connectionOpener2;
        }

        @Override // com.stripe.android.core.networking.ConnectionFactory
        public /* synthetic */ StripeConnection create(StripeRequest request) throws InvalidRequestException, IOException {
            Intrinsics.checkNotNullParameter(request, "request");
            return new StripeConnection.Default(openConnectionAndApplyFields(request));
        }

        @Override // com.stripe.android.core.networking.ConnectionFactory
        public StripeConnection<File> createForFile(StripeRequest request, File outputFile) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(outputFile, "outputFile");
            return new StripeConnection.FileConnection(openConnectionAndApplyFields(request), outputFile);
        }

        private final HttpsURLConnection openConnectionAndApplyFields(StripeRequest originalRequest) {
            return connectionOpener.open(originalRequest, new Function2() { // from class: com.stripe.android.core.networking.ConnectionFactory$Default$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConnectionFactory.Default.openConnectionAndApplyFields$lambda$3((HttpURLConnection) obj, (StripeRequest) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit openConnectionAndApplyFields$lambda$3(HttpURLConnection open, StripeRequest request) throws ProtocolException {
            Intrinsics.checkNotNullParameter(open, "$this$open");
            Intrinsics.checkNotNullParameter(request, "request");
            open.setConnectTimeout(Companion.CONNECT_TIMEOUT);
            open.setReadTimeout(Companion.READ_TIMEOUT);
            open.setUseCaches(request.getShouldCache());
            open.setRequestMethod(request.getMethod().getCode());
            for (Map.Entry<String, String> entry : request.getHeaders().entrySet()) {
                open.setRequestProperty(entry.getKey(), entry.getValue());
            }
            if (StripeRequest.Method.POST == request.getMethod()) {
                open.setDoOutput(true);
                Map<String, String> postHeaders = request.getPostHeaders();
                if (postHeaders != null) {
                    for (Map.Entry<String, String> entry2 : postHeaders.entrySet()) {
                        open.setRequestProperty(entry2.getKey(), entry2.getValue());
                    }
                }
                OutputStream outputStream = open.getOutputStream();
                try {
                    OutputStream outputStream2 = outputStream;
                    Intrinsics.checkNotNull(outputStream2);
                    request.writePostBody(outputStream2);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(outputStream, null);
                } finally {
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ConnectionFactory.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/core/networking/ConnectionFactory$Companion;", "", "<init>", "()V", "CONNECT_TIMEOUT", "", "READ_TIMEOUT", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int CONNECT_TIMEOUT = (int) TimeUnit.SECONDS.toMillis(30);
        private static final int READ_TIMEOUT = (int) TimeUnit.SECONDS.toMillis(80);

        private Companion() {
        }
    }
}
