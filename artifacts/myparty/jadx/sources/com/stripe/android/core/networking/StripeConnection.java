package com.stripe.android.core.networking;

import androidx.webkit.Profile;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeConnection.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u000f\u0010\u0011J\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rH&¢\u0006\u0002\u0010\u000eR\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/core/networking/StripeConnection;", "ResponseBodyType", "Ljava/io/Closeable;", "responseCode", "", InAppPurchaseConstants.METHOD_GET_RESPONSE_CODE, "()I", "response", "Lcom/stripe/android/core/networking/StripeResponse;", "getResponse", "()Lcom/stripe/android/core/networking/StripeResponse;", "createBodyFromResponseStream", "responseStream", "Ljava/io/InputStream;", "(Ljava/io/InputStream;)Ljava/lang/Object;", "AbstractConnection", Profile.DEFAULT_PROFILE_NAME, "FileConnection", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface StripeConnection<ResponseBodyType> extends Closeable {
    ResponseBodyType createBodyFromResponseStream(InputStream responseStream);

    StripeResponse<ResponseBodyType> getResponse();

    int getResponseCode();

    /* compiled from: StripeConnection.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u0015*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;", "ResponseBodyType", "Lcom/stripe/android/core/networking/StripeConnection;", "conn", "Ljavax/net/ssl/HttpsURLConnection;", "<init>", "(Ljavax/net/ssl/HttpsURLConnection;)V", "responseCode", "", InAppPurchaseConstants.METHOD_GET_RESPONSE_CODE, "()I", "response", "Lcom/stripe/android/core/networking/StripeResponse;", "getResponse", "()Lcom/stripe/android/core/networking/StripeResponse;", "responseStream", "Ljava/io/InputStream;", "getResponseStream", "()Ljava/io/InputStream;", "close", "", "Companion", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class AbstractConnection<ResponseBodyType> implements StripeConnection<ResponseBodyType> {
        private final HttpsURLConnection conn;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final String CHARSET = StandardCharsets.UTF_8.name();

        public AbstractConnection(HttpsURLConnection conn) {
            Intrinsics.checkNotNullParameter(conn, "conn");
            this.conn = conn;
        }

        @Override // com.stripe.android.core.networking.StripeConnection
        public /* synthetic */ int getResponseCode() {
            return this.conn.getResponseCode();
        }

        @Override // com.stripe.android.core.networking.StripeConnection
        public /* synthetic */ StripeResponse getResponse() throws IOException {
            int responseCode = getResponseCode();
            ResponseBodyType responsebodytypeCreateBodyFromResponseStream = createBodyFromResponseStream(getResponseStream());
            Map headerFields = this.conn.getHeaderFields();
            Intrinsics.checkNotNullExpressionValue(headerFields, "getHeaderFields(...)");
            return new StripeResponse(responseCode, responsebodytypeCreateBodyFromResponseStream, headerFields);
        }

        private final InputStream getResponseStream() throws IOException {
            int responseCode = getResponseCode();
            if (200 <= responseCode && responseCode < 300) {
                return this.conn.getInputStream();
            }
            return this.conn.getErrorStream();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            InputStream responseStream = getResponseStream();
            if (responseStream != null) {
                responseStream.close();
            }
            this.conn.disconnect();
        }

        /* compiled from: StripeConnection.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection$Companion;", "", "<init>", "()V", "CHARSET", "", "kotlin.jvm.PlatformType", "getCHARSET$stripe_core_release", "()Ljava/lang/String;", "Ljava/lang/String;", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final String getCHARSET$stripe_core_release() {
                return AbstractConnection.CHARSET;
            }
        }
    }

    /* compiled from: StripeConnection.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"Lcom/stripe/android/core/networking/StripeConnection$Default;", "Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;", "", "conn", "Ljavax/net/ssl/HttpsURLConnection;", "<init>", "(Ljavax/net/ssl/HttpsURLConnection;)V", "createBodyFromResponseStream", "responseStream", "Ljava/io/InputStream;", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Default extends AbstractConnection<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Default(HttpsURLConnection conn) {
            super(conn);
            Intrinsics.checkNotNullParameter(conn, "conn");
        }

        @Override // com.stripe.android.core.networking.StripeConnection
        public String createBodyFromResponseStream(InputStream responseStream) throws IOException {
            if (responseStream == null) {
                return null;
            }
            InputStream inputStream = responseStream;
            try {
                Scanner scannerUseDelimiter = new Scanner(responseStream, AbstractConnection.INSTANCE.getCHARSET$stripe_core_release()).useDelimiter("\\A");
                String next = scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : null;
                CloseableKt.closeFinally(inputStream, null);
                return next;
            } finally {
            }
        }
    }

    /* compiled from: StripeConnection.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/core/networking/StripeConnection$FileConnection;", "Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;", "Ljava/io/File;", "conn", "Ljavax/net/ssl/HttpsURLConnection;", "outputFile", "<init>", "(Ljavax/net/ssl/HttpsURLConnection;Ljava/io/File;)V", "createBodyFromResponseStream", "responseStream", "Ljava/io/InputStream;", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FileConnection extends AbstractConnection<File> {
        private final File outputFile;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FileConnection(HttpsURLConnection conn, File outputFile) {
            super(conn);
            Intrinsics.checkNotNullParameter(conn, "conn");
            Intrinsics.checkNotNullParameter(outputFile, "outputFile");
            this.outputFile = outputFile;
        }

        @Override // com.stripe.android.core.networking.StripeConnection
        public File createBodyFromResponseStream(InputStream responseStream) throws IOException {
            if (responseStream == null) {
                return null;
            }
            FileOutputStream fileOutputStream = responseStream;
            try {
                InputStream inputStream = fileOutputStream;
                fileOutputStream = new FileOutputStream(this.outputFile);
                try {
                    ByteStreamsKt.copyTo$default(inputStream, fileOutputStream, 0, 2, null);
                    CloseableKt.closeFinally(fileOutputStream, null);
                    CloseableKt.closeFinally(fileOutputStream, null);
                    return this.outputFile;
                } finally {
                }
            } finally {
            }
        }
    }
}
