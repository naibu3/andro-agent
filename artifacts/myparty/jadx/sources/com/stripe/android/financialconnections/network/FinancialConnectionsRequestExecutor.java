package com.stripe.android.financialconnections.network;

import com.stripe.android.core.Logger;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.exception.PermissionException;
import com.stripe.android.core.exception.RateLimitException;
import com.stripe.android.core.model.parsers.StripeErrorJsonParser;
import com.stripe.android.core.networking.RequestId;
import com.stripe.android.core.networking.ResponseJsonKt;
import com.stripe.android.core.networking.StripeNetworkClient;
import com.stripe.android.core.networking.StripeRequest;
import com.stripe.android.core.networking.StripeResponse;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsResponseEventEmitter;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;

/* compiled from: FinancialConnectionsRequestExecutor.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0010J*\u0010\f\u001a\u0002H\u0011\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0013H\u0086@¢\u0006\u0002\u0010\u0014J0\u0010\u0015\u001a\u0002H\u0011\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u0002H\u00110\u0017H\u0082@¢\u0006\u0002\u0010\u0018J\u001a\u0010\u0019\u001a\u00060\u001aj\u0002`\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001dH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;", "", "stripeNetworkClient", "Lcom/stripe/android/core/networking/StripeNetworkClient;", "eventEmitter", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter;", "json", "Lkotlinx/serialization/json/Json;", "logger", "Lcom/stripe/android/core/Logger;", "<init>", "(Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter;Lkotlinx/serialization/json/Json;Lcom/stripe/android/core/Logger;)V", "execute", "", "request", "Lcom/stripe/android/core/networking/StripeRequest;", "(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Response", "responseSerializer", "Lkotlinx/serialization/KSerializer;", "(Lcom/stripe/android/core/networking/StripeRequest;Lkotlinx/serialization/KSerializer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeInternal", "decodeResponse", "Lkotlin/Function1;", "(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleApiError", "Ljava/lang/Exception;", "Lkotlin/Exception;", "response", "Lcom/stripe/android/core/networking/StripeResponse;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsRequestExecutor {
    public static final int $stable = 8;
    private final FinancialConnectionsResponseEventEmitter eventEmitter;
    private final Json json;
    private final Logger logger;
    private final StripeNetworkClient stripeNetworkClient;

    /* compiled from: FinancialConnectionsRequestExecutor.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor", f = "FinancialConnectionsRequestExecutor.kt", i = {0, 0, 0}, l = {64}, m = "executeInternal", n = {"this", "request", "decodeResponse"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor$executeInternal$1, reason: invalid class name */
    static final class AnonymousClass1<Response> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinancialConnectionsRequestExecutor.this.executeInternal(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$0(String body) {
        Intrinsics.checkNotNullParameter(body, "body");
        return body;
    }

    @Inject
    public FinancialConnectionsRequestExecutor(StripeNetworkClient stripeNetworkClient, FinancialConnectionsResponseEventEmitter eventEmitter, Json json, Logger logger) {
        Intrinsics.checkNotNullParameter(stripeNetworkClient, "stripeNetworkClient");
        Intrinsics.checkNotNullParameter(eventEmitter, "eventEmitter");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.stripeNetworkClient = stripeNetworkClient;
        this.eventEmitter = eventEmitter;
        this.json = json;
        this.logger = logger;
    }

    public final Object execute(StripeRequest stripeRequest, Continuation<? super String> continuation) throws InvalidRequestException, APIException, AuthenticationException {
        return executeInternal(stripeRequest, new Function1() { // from class: com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FinancialConnectionsRequestExecutor.execute$lambda$0((String) obj);
            }
        }, continuation);
    }

    public final <Response> Object execute(StripeRequest stripeRequest, final KSerializer<Response> kSerializer, Continuation<? super Response> continuation) throws InvalidRequestException, APIException, AuthenticationException {
        return executeInternal(stripeRequest, new Function1() { // from class: com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FinancialConnectionsRequestExecutor.execute$lambda$1(this.f$0, kSerializer, (String) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object execute$lambda$1(FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor, KSerializer kSerializer, String body) {
        Intrinsics.checkNotNullParameter(body, "body");
        return financialConnectionsRequestExecutor.json.decodeFromString(kSerializer, body);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <Response> Object executeInternal(StripeRequest stripeRequest, Function1<? super String, ? extends Response> function1, Continuation<? super Response> continuation) throws Exception {
        AnonymousClass1 anonymousClass1;
        FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor;
        Object objM9118constructorimpl;
        Throwable thM9121exceptionOrNullimpl;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objExecuteRequest = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objExecuteRequest);
            try {
                Result.Companion companion = Result.INSTANCE;
                FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor2 = this;
                this.logger.debug("Executing " + stripeRequest.getMethod().getCode() + " request to " + stripeRequest.getUrl());
                StripeNetworkClient stripeNetworkClient = this.stripeNetworkClient;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = stripeRequest;
                anonymousClass1.L$2 = function1;
                anonymousClass1.label = 1;
                objExecuteRequest = stripeNetworkClient.executeRequest(stripeRequest, anonymousClass1);
                if (objExecuteRequest == coroutine_suspended) {
                    return coroutine_suspended;
                }
                financialConnectionsRequestExecutor = this;
            } catch (Throwable th) {
                th = th;
                financialConnectionsRequestExecutor = this;
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl == null) {
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function1 = (Function1) anonymousClass1.L$2;
            stripeRequest = (StripeRequest) anonymousClass1.L$1;
            financialConnectionsRequestExecutor = (FinancialConnectionsRequestExecutor) anonymousClass1.L$0;
            try {
                ResultKt.throwOnFailure(objExecuteRequest);
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion22 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl == null) {
                }
            }
        }
        objM9118constructorimpl = Result.m9118constructorimpl((StripeResponse) objExecuteRequest);
        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl == null) {
            StripeResponse<String> stripeResponse = (StripeResponse) objM9118constructorimpl;
            financialConnectionsRequestExecutor.eventEmitter.emitIfPresent(stripeResponse);
            if (stripeResponse.getCode() == 202) {
                throw financialConnectionsRequestExecutor.handleApiError(stripeResponse);
            }
            if (stripeResponse.getIsError()) {
                throw financialConnectionsRequestExecutor.handleApiError(stripeResponse);
            }
            String body = stripeResponse.getBody();
            if (body != null) {
                return function1.invoke(body);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new APIConnectionException("Failed to execute " + stripeRequest, thM9121exceptionOrNullimpl);
    }

    private final Exception handleApiError(StripeResponse<String> response) throws InvalidRequestException, PermissionException, RateLimitException, APIException, AuthenticationException {
        RequestId requestId = response.getRequestId();
        String value = requestId != null ? requestId.getValue() : null;
        int code = response.getCode();
        StripeError stripeError = new StripeErrorJsonParser().parse(ResponseJsonKt.responseJson(response));
        if (code != 202) {
            if (code == 429) {
                throw new RateLimitException(stripeError, value, null, null, 12, null);
            }
            if (code != 400) {
                if (code == 401) {
                    throw new AuthenticationException(stripeError, value);
                }
                if (code == 403) {
                    throw new PermissionException(stripeError, value);
                }
                if (code != 404) {
                    throw new APIException(stripeError, value, code, null, null, 24, null);
                }
            }
        }
        throw new InvalidRequestException(stripeError, value, code, null, null, 24, null);
    }
}
