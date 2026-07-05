package com.stripe.android.financialconnections.lite.repository;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.di.NamedConstantsKt;
import com.stripe.android.financialconnections.lite.network.FinancialConnectionsLiteRequestExecutor;
import com.stripe.android.financialconnections.lite.repository.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* compiled from: FinancialConnectionsLiteRepository.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\b\u001a\u00020\t*\u00020\nJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u0006\u0010\u000e\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl;", "Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepository;", "requestExecutor", "Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;", "apiRequestFactory", "Lcom/stripe/android/core/networking/ApiRequest$Factory;", "<init>", "(Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Factory;)V", "apiRequestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "synchronize", "Lkotlin/Result;", "Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;", "configuration", NamedConstantsKt.APPLICATION_ID, "", "synchronize-0E7RQCE", "(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFinancialConnectionsSession", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "getFinancialConnectionsSession-gIAlu-s", "(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "financial-connections-lite_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsLiteRepositoryImpl implements FinancialConnectionsLiteRepository {
    public static final String PARAMS_APPLICATION_ID = "application_id";
    public static final String PARAMS_CLIENT_SECRET = "client_secret";
    public static final String PARAMS_FULLSCREEN = "fullscreen";
    public static final String PARAMS_HIDE_CLOSE_BUTTON = "hide_close_button";
    public static final String PARAMS_MOBILE_SDK_TYPE = "mobile_sdk_type";
    private static final String sessionReceiptUrl = "https://api.stripe.com/v1/link_account_sessions/session_receipt";
    public static final String synchronizeSessionUrl = "https://api.stripe.com/v1/financial_connections/sessions/synchronize";
    private final ApiRequest.Factory apiRequestFactory;
    private final FinancialConnectionsLiteRequestExecutor requestExecutor;

    public FinancialConnectionsLiteRepositoryImpl(FinancialConnectionsLiteRequestExecutor requestExecutor, ApiRequest.Factory apiRequestFactory) {
        Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
        Intrinsics.checkNotNullParameter(apiRequestFactory, "apiRequestFactory");
        this.requestExecutor = requestExecutor;
        this.apiRequestFactory = apiRequestFactory;
    }

    public final ApiRequest.Options apiRequestOptions(final FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration) {
        Intrinsics.checkNotNullParameter(financialConnectionsSheetConfiguration, "<this>");
        return new ApiRequest.Options(new Function0() { // from class: com.stripe.android.financialconnections.lite.repository.FinancialConnectionsLiteRepositoryImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return financialConnectionsSheetConfiguration.getPublishableKey();
            }
        }, new Function0() { // from class: com.stripe.android.financialconnections.lite.repository.FinancialConnectionsLiteRepositoryImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return financialConnectionsSheetConfiguration.getStripeAccountId();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.financialconnections.lite.repository.FinancialConnectionsLiteRepository
    /* renamed from: synchronize-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7507synchronize0E7RQCE(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, String str, Continuation<? super Result<SynchronizeSessionResponse>> continuation) {
        FinancialConnectionsLiteRepositoryImpl$synchronize$1 financialConnectionsLiteRepositoryImpl$synchronize$1;
        if (continuation instanceof FinancialConnectionsLiteRepositoryImpl$synchronize$1) {
            financialConnectionsLiteRepositoryImpl$synchronize$1 = (FinancialConnectionsLiteRepositoryImpl$synchronize$1) continuation;
            if ((financialConnectionsLiteRepositoryImpl$synchronize$1.label & Integer.MIN_VALUE) != 0) {
                financialConnectionsLiteRepositoryImpl$synchronize$1.label -= Integer.MIN_VALUE;
            } else {
                financialConnectionsLiteRepositoryImpl$synchronize$1 = new FinancialConnectionsLiteRepositoryImpl$synchronize$1(this, continuation);
            }
        }
        Object obj = financialConnectionsLiteRepositoryImpl$synchronize$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = financialConnectionsLiteRepositoryImpl$synchronize$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        FinancialConnectionsLiteRequestExecutor financialConnectionsLiteRequestExecutor = this.requestExecutor;
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, "https://api.stripe.com/v1/financial_connections/sessions/synchronize", apiRequestOptions(financialConnectionsSheetConfiguration), MapsKt.mapOf(TuplesKt.to("locale", Locale.getDefault().toLanguageTag()), TuplesKt.to("mobile", MapsKt.mapOf(TuplesKt.to("fullscreen", Boxing.boxBoolean(true)), TuplesKt.to("hide_close_button", Boxing.boxBoolean(false)), TuplesKt.to("application_id", str), TuplesKt.to(PARAMS_MOBILE_SDK_TYPE, "fc_lite"))), TuplesKt.to("client_secret", financialConnectionsSheetConfiguration.getFinancialConnectionsSessionClientSecret())), false, 8, null);
        KSerializer<SynchronizeSessionResponse> kSerializerSerializer = SynchronizeSessionResponse.INSTANCE.serializer();
        financialConnectionsLiteRepositoryImpl$synchronize$1.label = 1;
        Object objM7505execute0E7RQCE = financialConnectionsLiteRequestExecutor.m7505execute0E7RQCE(apiRequestCreatePost$default, kSerializerSerializer, financialConnectionsLiteRepositoryImpl$synchronize$1);
        return objM7505execute0E7RQCE == coroutine_suspended ? coroutine_suspended : objM7505execute0E7RQCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.financialconnections.lite.repository.FinancialConnectionsLiteRepository
    /* renamed from: getFinancialConnectionsSession-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7506getFinancialConnectionsSessiongIAlus(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, Continuation<? super Result<FinancialConnectionsSession>> continuation) {
        FinancialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1 financialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1;
        if (continuation instanceof FinancialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1) {
            financialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1 = (FinancialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1) continuation;
            if ((financialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1.label & Integer.MIN_VALUE) != 0) {
                financialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1.label -= Integer.MIN_VALUE;
            } else {
                financialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1 = new FinancialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1(this, continuation);
            }
        }
        Object obj = financialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = financialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest apiRequestCreateGet$default = ApiRequest.Factory.createGet$default(this.apiRequestFactory, sessionReceiptUrl, apiRequestOptions(financialConnectionsSheetConfiguration), MapsKt.mapOf(TuplesKt.to("client_secret", financialConnectionsSheetConfiguration.getFinancialConnectionsSessionClientSecret())), false, 8, null);
        KSerializer<FinancialConnectionsSession> kSerializerSerializer = FinancialConnectionsSession.INSTANCE.serializer();
        financialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1.label = 1;
        Object objM7505execute0E7RQCE = this.requestExecutor.m7505execute0E7RQCE(apiRequestCreateGet$default, kSerializerSerializer, financialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1);
        return objM7505execute0E7RQCE == coroutine_suspended ? coroutine_suspended : objM7505execute0E7RQCE;
    }
}
