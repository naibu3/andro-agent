package com.stripe.android.core.networking;

import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.networking.ConnectionFactory;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: DefaultStripeNetworkClient.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B;\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@¢\u0006\u0002\u0010\u0013J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010\u0017JF\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00190\u000f\"\u0004\b\u0000\u0010\u00192\u0006\u0010\u001a\u001a\u00020\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00190\u000f0\u001eH\u0081@¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J,\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00190\u000f\"\u0004\b\u0000\u0010\u00192\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00190%2\b\u0010&\u001a\u0004\u0018\u00010\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;", "Lcom/stripe/android/core/networking/StripeNetworkClient;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "connectionFactory", "Lcom/stripe/android/core/networking/ConnectionFactory;", "retryDelaySupplier", "Lcom/stripe/android/core/networking/RetryDelaySupplier;", "maxRetries", "", "logger", "Lcom/stripe/android/core/Logger;", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/ConnectionFactory;Lcom/stripe/android/core/networking/RetryDelaySupplier;ILcom/stripe/android/core/Logger;)V", "executeRequest", "Lcom/stripe/android/core/networking/StripeResponse;", "", "request", "Lcom/stripe/android/core/networking/StripeRequest;", "(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeRequestForFile", "Ljava/io/File;", "outputFile", "(Lcom/stripe/android/core/networking/StripeRequest;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeInternal", "BodyType", "remainingRetries", "retryResponseCodes", "", "requester", "Lkotlin/Function0;", "executeInternal$stripe_core_release", "(ILjava/lang/Iterable;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makeRequest", "makeRequestForFile", "parseResponse", "connection", "Lcom/stripe/android/core/networking/StripeConnection;", "baseUrl", "Companion", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultStripeNetworkClient implements StripeNetworkClient {
    private static final Companion Companion = new Companion(null);
    private static final int DEFAULT_MAX_RETRIES = 3;
    private final ConnectionFactory connectionFactory;
    private final Logger logger;
    private final int maxRetries;
    private final RetryDelaySupplier retryDelaySupplier;
    private final CoroutineContext workContext;

    public DefaultStripeNetworkClient() {
        this(null, null, null, 0, null, 31, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultStripeNetworkClient(CoroutineContext workContext) {
        this(workContext, null, null, 0, null, 30, null);
        Intrinsics.checkNotNullParameter(workContext, "workContext");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultStripeNetworkClient(CoroutineContext workContext, ConnectionFactory connectionFactory) {
        this(workContext, connectionFactory, null, 0, null, 28, null);
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultStripeNetworkClient(CoroutineContext workContext, ConnectionFactory connectionFactory, RetryDelaySupplier retryDelaySupplier) {
        this(workContext, connectionFactory, retryDelaySupplier, 0, null, 24, null);
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
        Intrinsics.checkNotNullParameter(retryDelaySupplier, "retryDelaySupplier");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultStripeNetworkClient(CoroutineContext workContext, ConnectionFactory connectionFactory, RetryDelaySupplier retryDelaySupplier, int i) {
        this(workContext, connectionFactory, retryDelaySupplier, i, null, 16, null);
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
        Intrinsics.checkNotNullParameter(retryDelaySupplier, "retryDelaySupplier");
    }

    public DefaultStripeNetworkClient(CoroutineContext workContext, ConnectionFactory connectionFactory, RetryDelaySupplier retryDelaySupplier, int i, Logger logger) {
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
        Intrinsics.checkNotNullParameter(retryDelaySupplier, "retryDelaySupplier");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.workContext = workContext;
        this.connectionFactory = connectionFactory;
        this.retryDelaySupplier = retryDelaySupplier;
        this.maxRetries = i;
        this.logger = logger;
    }

    public /* synthetic */ DefaultStripeNetworkClient(CoroutineDispatcher coroutineDispatcher, ConnectionFactory.Default r2, ExponentialBackoffRetryDelaySupplier exponentialBackoffRetryDelaySupplier, int i, Logger logger, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Dispatchers.getIO() : coroutineDispatcher, (i2 & 2) != 0 ? ConnectionFactory.Default.INSTANCE : r2, (i2 & 4) != 0 ? new ExponentialBackoffRetryDelaySupplier() : exponentialBackoffRetryDelaySupplier, (i2 & 8) != 0 ? 3 : i, (i2 & 16) != 0 ? Logger.INSTANCE.noop() : logger);
    }

    @Override // com.stripe.android.core.networking.StripeNetworkClient
    public Object executeRequest(final StripeRequest stripeRequest, Continuation<? super StripeResponse<String>> continuation) {
        return executeInternal$stripe_core_release(this.maxRetries, stripeRequest.getRetryResponseCodes(), new Function0() { // from class: com.stripe.android.core.networking.DefaultStripeNetworkClient$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.makeRequest(stripeRequest);
            }
        }, continuation);
    }

    @Override // com.stripe.android.core.networking.StripeNetworkClient
    public Object executeRequestForFile(final StripeRequest stripeRequest, final File file, Continuation<? super StripeResponse<File>> continuation) {
        return executeInternal$stripe_core_release(this.maxRetries, stripeRequest.getRetryResponseCodes(), new Function0() { // from class: com.stripe.android.core.networking.DefaultStripeNetworkClient$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.makeRequestForFile(stripeRequest, file);
            }
        }, continuation);
    }

    public final <BodyType> Object executeInternal$stripe_core_release(int i, Iterable<Integer> iterable, Function0<StripeResponse<BodyType>> function0, Continuation<? super StripeResponse<BodyType>> continuation) {
        return BuildersKt.withContext(this.workContext, new DefaultStripeNetworkClient$executeInternal$2(function0, iterable, i, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StripeResponse<String> makeRequest(StripeRequest request) {
        return parseResponse(this.connectionFactory.create(request), request.getUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StripeResponse<File> makeRequestForFile(StripeRequest request, File outputFile) {
        return parseResponse(this.connectionFactory.createForFile(request, outputFile), request.getUrl());
    }

    private final <BodyType> StripeResponse<BodyType> parseResponse(StripeConnection<BodyType> connection, String baseUrl) throws Throwable {
        Object objM9118constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            DefaultStripeNetworkClient defaultStripeNetworkClient = this;
            StripeResponse<BodyType> response = connection.getResponse();
            this.logger.info(response.toString());
            objM9118constructorimpl = Result.m9118constructorimpl(response);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            this.logger.error("Exception while making Stripe API request", thM9121exceptionOrNullimpl);
            if (thM9121exceptionOrNullimpl instanceof IOException) {
                throw APIConnectionException.INSTANCE.create((IOException) thM9121exceptionOrNullimpl, baseUrl);
            }
            throw thM9121exceptionOrNullimpl;
        }
        return (StripeResponse) objM9118constructorimpl;
    }

    /* compiled from: DefaultStripeNetworkClient.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$Companion;", "", "<init>", "()V", "DEFAULT_MAX_RETRIES", "", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
