package com.stripe.android;

import androidx.webkit.Profile;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.EphemeralKeyManager;
import com.stripe.android.EphemeralOperation;
import com.stripe.android.core.ApiVersion;
import com.stripe.android.model.parsers.EphemeralKeyJsonParser;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: EphemeralKeyManager.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u0000 *2\u00020\u0001:\u0004'()*BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0012\b\u0002\u0010\n\u001a\f\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0000¢\u0006\u0002\b\u001dJ\u001a\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0012H\u0002J \u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0012H\u0002J\u0017\u0010%\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0000¢\u0006\u0002\b&R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\f\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006+"}, d2 = {"Lcom/stripe/android/EphemeralKeyManager;", "", "ephemeralKeyProvider", "Lcom/stripe/android/EphemeralKeyProvider;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;", "operationIdFactory", "Lcom/stripe/android/OperationIdFactory;", "shouldPrefetchEphemeralKey", "", "timeSupplier", "Lkotlin/Function0;", "", "Lcom/stripe/android/TimeSupplier;", "timeBufferInSeconds", "<init>", "(Lcom/stripe/android/EphemeralKeyProvider;Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;Lcom/stripe/android/OperationIdFactory;ZLkotlin/jvm/functions/Function0;J)V", "apiVersion", "", "ephemeralKey", "Lcom/stripe/android/EphemeralKey;", "getEphemeralKey$payments_core_release", "()Lcom/stripe/android/EphemeralKey;", "setEphemeralKey$payments_core_release", "(Lcom/stripe/android/EphemeralKey;)V", "retrieveEphemeralKey", "", "operation", "Lcom/stripe/android/EphemeralOperation;", "retrieveEphemeralKey$payments_core_release", "updateKey", SDKConstants.PARAM_KEY, "updateKeyError", "operationId", "errorCode", "", "errorMessage", "shouldRefreshKey", "shouldRefreshKey$payments_core_release", "KeyManagerListener", "ClientKeyUpdateListener", "Factory", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EphemeralKeyManager {
    private static final long REFRESH_BUFFER_IN_SECONDS = 30;
    private final String apiVersion;
    private /* synthetic */ EphemeralKey ephemeralKey;
    private final EphemeralKeyProvider ephemeralKeyProvider;
    private final KeyManagerListener listener;
    private final long timeBufferInSeconds;
    private final Function0<Long> timeSupplier;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EphemeralKeyManager.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J(\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;", "", "onKeyUpdate", "", "ephemeralKey", "Lcom/stripe/android/EphemeralKey;", "operation", "Lcom/stripe/android/EphemeralOperation;", "onKeyError", "operationId", "", "errorCode", "", "errorMessage", "throwable", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface KeyManagerListener {
        void onKeyError(String operationId, int errorCode, String errorMessage, Throwable throwable);

        void onKeyUpdate(EphemeralKey ephemeralKey, EphemeralOperation operation);
    }

    public EphemeralKeyManager(EphemeralKeyProvider ephemeralKeyProvider, KeyManagerListener listener, OperationIdFactory operationIdFactory, boolean z, Function0<Long> timeSupplier, long j) {
        Intrinsics.checkNotNullParameter(ephemeralKeyProvider, "ephemeralKeyProvider");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(operationIdFactory, "operationIdFactory");
        Intrinsics.checkNotNullParameter(timeSupplier, "timeSupplier");
        this.ephemeralKeyProvider = ephemeralKeyProvider;
        this.listener = listener;
        this.timeSupplier = timeSupplier;
        this.timeBufferInSeconds = j;
        this.apiVersion = ApiVersion.INSTANCE.get().getCode();
        if (z) {
            retrieveEphemeralKey$payments_core_release(new EphemeralOperation.RetrieveKey(operationIdFactory.create(), SetsKt.emptySet()));
        }
    }

    public /* synthetic */ EphemeralKeyManager(EphemeralKeyProvider ephemeralKeyProvider, KeyManagerListener keyManagerListener, StripeOperationIdFactory stripeOperationIdFactory, boolean z, Function0 function0, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ephemeralKeyProvider, keyManagerListener, (i & 4) != 0 ? new StripeOperationIdFactory() : stripeOperationIdFactory, (i & 8) != 0 ? true : z, (i & 16) != 0 ? new Function0() { // from class: com.stripe.android.EphemeralKeyManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(EphemeralKeyManager._init_$lambda$0());
            }
        } : function0, (i & 32) != 0 ? 30L : j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long _init_$lambda$0() {
        return Calendar.getInstance().getTimeInMillis();
    }

    /* renamed from: getEphemeralKey$payments_core_release, reason: from getter */
    public final EphemeralKey getEphemeralKey() {
        return this.ephemeralKey;
    }

    public final void setEphemeralKey$payments_core_release(EphemeralKey ephemeralKey) {
        this.ephemeralKey = ephemeralKey;
    }

    public final /* synthetic */ void retrieveEphemeralKey$payments_core_release(EphemeralOperation operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        EphemeralKey ephemeralKey = this.ephemeralKey;
        if (ephemeralKey == null || shouldRefreshKey$payments_core_release(ephemeralKey)) {
            ephemeralKey = null;
        }
        if (ephemeralKey != null) {
            this.listener.onKeyUpdate(ephemeralKey, operation);
        } else {
            this.ephemeralKeyProvider.createEphemeralKey(this.apiVersion, new ClientKeyUpdateListener(this, operation));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateKey(EphemeralOperation operation, String key) {
        Object objM9118constructorimpl;
        String strTrimIndent;
        if (key == null) {
            this.listener.onKeyError(operation.getId$payments_core_release(), 500, "EphemeralKeyUpdateListener.onKeyUpdate was called with a null value", new IllegalArgumentException("EphemeralKeyUpdateListener.onKeyUpdate was called with a null value"));
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            EphemeralKeyManager ephemeralKeyManager = this;
            EphemeralKey ephemeralKey = new EphemeralKeyJsonParser().parse(new JSONObject(key));
            this.ephemeralKey = ephemeralKey;
            objM9118constructorimpl = Result.m9118constructorimpl(ephemeralKey);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl == null) {
            this.listener.onKeyUpdate((EphemeralKey) objM9118constructorimpl, operation);
            return;
        }
        if (thM9121exceptionOrNullimpl instanceof JSONException) {
            strTrimIndent = StringsKt.trimIndent("\n                        Received an ephemeral key that could not be parsed. See https://stripe.com/docs/mobile/android/basic for more details.\n                        \n                        " + thM9121exceptionOrNullimpl.getMessage() + "\n                        ");
        } else {
            strTrimIndent = StringsKt.trimIndent("\n                        Received an invalid ephemeral key. See https://stripe.com/docs/mobile/android/basic for more details.\n                        \n                        " + thM9121exceptionOrNullimpl.getMessage() + "\n                        ");
        }
        this.listener.onKeyError(operation.getId$payments_core_release(), 500, strTrimIndent, thM9121exceptionOrNullimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateKeyError(String operationId, int errorCode, String errorMessage) {
        this.ephemeralKey = null;
        this.listener.onKeyError(operationId, errorCode, errorMessage, new Exception(errorMessage));
    }

    /* compiled from: EphemeralKeyManager.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/EphemeralKeyManager$ClientKeyUpdateListener;", "Lcom/stripe/android/EphemeralKeyUpdateListener;", "ephemeralKeyManager", "Lcom/stripe/android/EphemeralKeyManager;", "operation", "Lcom/stripe/android/EphemeralOperation;", "<init>", "(Lcom/stripe/android/EphemeralKeyManager;Lcom/stripe/android/EphemeralOperation;)V", "onKeyUpdate", "", "stripeResponseJson", "", "onKeyUpdateFailure", "responseCode", "", "message", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class ClientKeyUpdateListener implements EphemeralKeyUpdateListener {
        private final EphemeralKeyManager ephemeralKeyManager;
        private final EphemeralOperation operation;

        public ClientKeyUpdateListener(EphemeralKeyManager ephemeralKeyManager, EphemeralOperation operation) {
            Intrinsics.checkNotNullParameter(ephemeralKeyManager, "ephemeralKeyManager");
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.ephemeralKeyManager = ephemeralKeyManager;
            this.operation = operation;
        }

        @Override // com.stripe.android.EphemeralKeyUpdateListener
        public void onKeyUpdate(String stripeResponseJson) {
            Intrinsics.checkNotNullParameter(stripeResponseJson, "stripeResponseJson");
            this.ephemeralKeyManager.updateKey(this.operation, stripeResponseJson);
        }

        @Override // com.stripe.android.EphemeralKeyUpdateListener
        public void onKeyUpdateFailure(int responseCode, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.ephemeralKeyManager.updateKeyError(this.operation.getId$payments_core_release(), responseCode, message);
        }
    }

    public final boolean shouldRefreshKey$payments_core_release(EphemeralKey ephemeralKey) {
        if (ephemeralKey == null) {
            return true;
        }
        return ephemeralKey.getExpires$payments_core_release() < TimeUnit.MILLISECONDS.toSeconds(this.timeSupplier.invoke().longValue()) + this.timeBufferInSeconds;
    }

    /* compiled from: EphemeralKeyManager.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bà\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/EphemeralKeyManager$Factory;", "", "create", "Lcom/stripe/android/EphemeralKeyManager;", "arg", "Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;", Profile.DEFAULT_PROFILE_NAME, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        EphemeralKeyManager create(KeyManagerListener arg);

        /* compiled from: EphemeralKeyManager.kt */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0012\b\u0002\u0010\b\u001a\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/EphemeralKeyManager$Factory$Default;", "Lcom/stripe/android/EphemeralKeyManager$Factory;", "keyProvider", "Lcom/stripe/android/EphemeralKeyProvider;", "shouldPrefetchEphemeralKey", "", "operationIdFactory", "Lcom/stripe/android/OperationIdFactory;", "timeSupplier", "Lkotlin/Function0;", "", "Lcom/stripe/android/TimeSupplier;", "<init>", "(Lcom/stripe/android/EphemeralKeyProvider;ZLcom/stripe/android/OperationIdFactory;Lkotlin/jvm/functions/Function0;)V", "create", "Lcom/stripe/android/EphemeralKeyManager;", "arg", "Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Default implements Factory {
            public static final int $stable = 0;
            private final EphemeralKeyProvider keyProvider;
            private final OperationIdFactory operationIdFactory;
            private final boolean shouldPrefetchEphemeralKey;
            private final Function0<Long> timeSupplier;

            public Default(EphemeralKeyProvider keyProvider, boolean z, OperationIdFactory operationIdFactory, Function0<Long> timeSupplier) {
                Intrinsics.checkNotNullParameter(keyProvider, "keyProvider");
                Intrinsics.checkNotNullParameter(operationIdFactory, "operationIdFactory");
                Intrinsics.checkNotNullParameter(timeSupplier, "timeSupplier");
                this.keyProvider = keyProvider;
                this.shouldPrefetchEphemeralKey = z;
                this.operationIdFactory = operationIdFactory;
                this.timeSupplier = timeSupplier;
            }

            public /* synthetic */ Default(EphemeralKeyProvider ephemeralKeyProvider, boolean z, StripeOperationIdFactory stripeOperationIdFactory, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(ephemeralKeyProvider, z, (i & 4) != 0 ? new StripeOperationIdFactory() : stripeOperationIdFactory, (i & 8) != 0 ? new Function0() { // from class: com.stripe.android.EphemeralKeyManager$Factory$Default$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Long.valueOf(EphemeralKeyManager.Factory.Default._init_$lambda$0());
                    }
                } : function0);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final long _init_$lambda$0() {
                return Calendar.getInstance().getTimeInMillis();
            }

            @Override // com.stripe.android.EphemeralKeyManager.Factory
            public /* synthetic */ EphemeralKeyManager create(KeyManagerListener arg) {
                Intrinsics.checkNotNullParameter(arg, "arg");
                return new EphemeralKeyManager(this.keyProvider, arg, this.operationIdFactory, this.shouldPrefetchEphemeralKey, this.timeSupplier, 0L, 32, null);
            }
        }
    }

    /* compiled from: EphemeralKeyManager.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/EphemeralKeyManager$Companion;", "", "<init>", "()V", "REFRESH_BUFFER_IN_SECONDS", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
