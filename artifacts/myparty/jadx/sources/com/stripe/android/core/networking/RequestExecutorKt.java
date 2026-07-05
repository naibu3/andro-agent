package com.stripe.android.core.networking;

import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.core.model.parsers.StripeErrorJsonParser;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RequestExecutor.kt */
@Metadata(d1 = {"\u0000*\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a>\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nH\u0087@¢\u0006\u0002\u0010\u000b\u001aD\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00010\r\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nH\u0087@¢\u0006\u0002\u0010\u000b¨\u0006\u000e"}, d2 = {"executeRequestWithModelJsonParser", "Response", "Lcom/stripe/android/core/model/StripeModel;", "stripeNetworkClient", "Lcom/stripe/android/core/networking/StripeNetworkClient;", "stripeErrorJsonParser", "Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;", "request", "Lcom/stripe/android/core/networking/StripeRequest;", "responseJsonParser", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "(Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;Lcom/stripe/android/core/networking/StripeRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeRequestWithResultParser", "Lkotlin/Result;", "stripe-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RequestExecutorKt {

    /* compiled from: RequestExecutor.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.core.networking.RequestExecutorKt", f = "RequestExecutor.kt", i = {0, 0, 0}, l = {20}, m = "executeRequestWithModelJsonParser", n = {"stripeErrorJsonParser", "request", "responseJsonParser"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.stripe.android.core.networking.RequestExecutorKt$executeRequestWithModelJsonParser$1, reason: invalid class name */
    static final class AnonymousClass1<Response extends StripeModel> extends ContinuationImpl {
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
            return RequestExecutorKt.executeRequestWithModelJsonParser(null, null, null, null, this);
        }
    }

    /* compiled from: RequestExecutor.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.core.networking.RequestExecutorKt", f = "RequestExecutor.kt", i = {0, 0, 0}, l = {54}, m = "executeRequestWithResultParser", n = {"stripeErrorJsonParser", "request", "responseJsonParser"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.stripe.android.core.networking.RequestExecutorKt$executeRequestWithResultParser$1, reason: invalid class name and case insensitive filesystem */
    static final class C08071<Response extends StripeModel> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C08071(Continuation<? super C08071> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objExecuteRequestWithResultParser = RequestExecutorKt.executeRequestWithResultParser(null, null, null, null, this);
            return objExecuteRequestWithResultParser == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objExecuteRequestWithResultParser : Result.m9117boximpl(objExecuteRequestWithResultParser);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <Response extends StripeModel> Object executeRequestWithModelJsonParser(StripeNetworkClient stripeNetworkClient, StripeErrorJsonParser stripeErrorJsonParser, StripeRequest stripeRequest, ModelJsonParser<? extends Response> modelJsonParser, Continuation<? super Response> continuation) throws APIConnectionException, APIException {
        AnonymousClass1 anonymousClass1;
        Object objM9118constructorimpl;
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
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(objExecuteRequest);
                Result.Companion companion = Result.INSTANCE;
                anonymousClass1.L$0 = stripeErrorJsonParser;
                anonymousClass1.L$1 = stripeRequest;
                anonymousClass1.L$2 = modelJsonParser;
                anonymousClass1.label = 1;
                objExecuteRequest = stripeNetworkClient.executeRequest(stripeRequest, anonymousClass1);
                if (objExecuteRequest == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                modelJsonParser = (ModelJsonParser) anonymousClass1.L$2;
                stripeRequest = (StripeRequest) anonymousClass1.L$1;
                stripeErrorJsonParser = (StripeErrorJsonParser) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objExecuteRequest);
            }
            objM9118constructorimpl = Result.m9118constructorimpl((StripeResponse) objExecuteRequest);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl == null) {
            StripeResponse stripeResponse = (StripeResponse) objM9118constructorimpl;
            if (stripeResponse.getIsError()) {
                StripeError stripeError = stripeErrorJsonParser.parse(ResponseJsonKt.responseJson(stripeResponse));
                RequestId requestId = stripeResponse.getRequestId();
                throw new APIException(stripeError, requestId != null ? requestId.getValue() : null, stripeResponse.getCode(), null, null, 24, null);
            }
            StripeModel stripeModel = modelJsonParser.parse(ResponseJsonKt.responseJson(stripeResponse));
            if (stripeModel != null) {
                return stripeModel;
            }
            throw new APIException(null, null, 0, modelJsonParser + " returns null for " + ResponseJsonKt.responseJson(stripeResponse), null, 23, null);
        }
        throw new APIConnectionException("Failed to execute " + stripeRequest, thM9121exceptionOrNullimpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <Response extends StripeModel> Object executeRequestWithResultParser(StripeNetworkClient stripeNetworkClient, StripeErrorJsonParser stripeErrorJsonParser, StripeRequest stripeRequest, ModelJsonParser<? extends Response> modelJsonParser, Continuation<? super Result<? extends Response>> continuation) {
        C08071 c08071;
        Object objM9118constructorimpl;
        Object objM9118constructorimpl2;
        if (continuation instanceof C08071) {
            c08071 = (C08071) continuation;
            if ((c08071.label & Integer.MIN_VALUE) != 0) {
                c08071.label -= Integer.MIN_VALUE;
            } else {
                c08071 = new C08071(continuation);
            }
        }
        Object objExecuteRequest = c08071.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c08071.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(objExecuteRequest);
                Result.Companion companion = Result.INSTANCE;
                c08071.L$0 = stripeErrorJsonParser;
                c08071.L$1 = stripeRequest;
                c08071.L$2 = modelJsonParser;
                c08071.label = 1;
                objExecuteRequest = stripeNetworkClient.executeRequest(stripeRequest, c08071);
                if (objExecuteRequest == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                modelJsonParser = (ModelJsonParser) c08071.L$2;
                stripeRequest = (StripeRequest) c08071.L$1;
                stripeErrorJsonParser = (StripeErrorJsonParser) c08071.L$0;
                ResultKt.throwOnFailure(objExecuteRequest);
            }
            objM9118constructorimpl = Result.m9118constructorimpl((StripeResponse) objExecuteRequest);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl == null) {
            StripeResponse stripeResponse = (StripeResponse) objM9118constructorimpl;
            if (stripeResponse.getIsError()) {
                Result.Companion companion3 = Result.INSTANCE;
                StripeError stripeError = stripeErrorJsonParser.parse(ResponseJsonKt.responseJson(stripeResponse));
                RequestId requestId = stripeResponse.getRequestId();
                return Result.m9118constructorimpl(ResultKt.createFailure(new APIException(stripeError, requestId != null ? requestId.getValue() : null, stripeResponse.getCode(), null, null, 24, null)));
            }
            try {
                Result.Companion companion4 = Result.INSTANCE;
                objM9118constructorimpl2 = Result.m9118constructorimpl(modelJsonParser.parse(ResponseJsonKt.responseJson(stripeResponse)));
            } catch (Throwable th2) {
                Result.Companion companion5 = Result.INSTANCE;
                objM9118constructorimpl2 = Result.m9118constructorimpl(ResultKt.createFailure(th2));
            }
            StripeModel stripeModel = (StripeModel) (Result.m9124isFailureimpl(objM9118constructorimpl2) ? null : objM9118constructorimpl2);
            if (stripeModel != null) {
                Result.Companion companion6 = Result.INSTANCE;
                return Result.m9118constructorimpl(stripeModel);
            }
            Result.Companion companion7 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(new APIException(null, null, 0, modelJsonParser + " returns null for " + ResponseJsonKt.responseJson(stripeResponse), null, 23, null)));
        }
        Result.Companion companion8 = Result.INSTANCE;
        return Result.m9118constructorimpl(ResultKt.createFailure(new APIConnectionException("Failed to execute " + stripeRequest, thM9121exceptionOrNullimpl)));
    }
}
