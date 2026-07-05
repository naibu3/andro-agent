package com.stripe.android.repository;

import com.facebook.internal.NativeProtocol;
import com.stripe.android.core.AppInfo;
import com.stripe.android.core.model.parsers.StripeErrorJsonParser;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.RequestExecutorKt;
import com.stripe.android.core.networking.StripeNetworkClient;
import com.stripe.android.financialconnections.network.NetworkConstants;
import com.stripe.android.model.AttachConsumerToLinkAccountSession;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.ConsumerPaymentDetailsCreateParams;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.ConsumerSessionSignup;
import com.stripe.android.model.CustomEmailType;
import com.stripe.android.model.EmailSource;
import com.stripe.android.model.LinkAccountSession;
import com.stripe.android.model.LinkMode;
import com.stripe.android.model.SharePaymentDetails;
import com.stripe.android.model.SignUpParams;
import com.stripe.android.model.UpdateAvailableIncentives;
import com.stripe.android.model.VerificationType;
import com.stripe.android.model.parsers.AttachConsumerToLinkAccountSessionJsonParser;
import com.stripe.android.model.parsers.ConsumerPaymentDetailsJsonParser;
import com.stripe.android.model.parsers.ConsumerSessionJsonParser;
import com.stripe.android.model.parsers.ConsumerSessionLookupJsonParser;
import com.stripe.android.model.parsers.ConsumerSessionSignupJsonParser;
import com.stripe.android.model.parsers.LinkAccountSessionJsonParser;
import com.stripe.android.model.parsers.SharePaymentDetailsJsonParser;
import com.stripe.android.model.parsers.UpdateAvailableIncentivesJsonParser;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConsumersApiService.kt */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 V2\u00020\u0001:\u0001VB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0019\u0010\u0017J8\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0096@¢\u0006\u0002\u0010!JP\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010#\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0096@¢\u0006\u0002\u0010(JJ\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020-2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u00103J6\u00104\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010.\u001a\u00020/2\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u00106J.\u00107\u001a\u0002082\u0006\u0010+\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010:J6\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\u00102\u0006\u0010+\u001a\u00020\u00052\u0006\u0010=\u001a\u00020>2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b?\u0010@J^\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\u00102\u0006\u0010+\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u00052\b\u0010E\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0014\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010H0GH\u0096@¢\u0006\u0004\bI\u0010JJ>\u0010K\u001a\b\u0012\u0004\u0012\u00020L0\u00102\u0006\u0010'\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@¢\u0006\u0004\bM\u0010NJB\u0010O\u001a\b\u0012\u0004\u0012\u00020P0\u00102\u0006\u0010+\u001a\u00020\u00052\b\u0010Q\u001a\u0004\u0018\u00010\u00052\b\u0010R\u001a\u0004\u0018\u00010S2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@¢\u0006\u0004\bT\u0010UR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006W"}, d2 = {"Lcom/stripe/android/repository/ConsumersApiServiceImpl;", "Lcom/stripe/android/repository/ConsumersApiService;", "stripeNetworkClient", "Lcom/stripe/android/core/networking/StripeNetworkClient;", "apiVersion", "", "sdkVersion", "appInfo", "Lcom/stripe/android/core/AppInfo;", "<init>", "(Lcom/stripe/android/core/networking/StripeNetworkClient;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/AppInfo;)V", "stripeErrorJsonParser", "Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;", "apiRequestFactory", "Lcom/stripe/android/core/networking/ApiRequest$Factory;", "signUp", "Lkotlin/Result;", "Lcom/stripe/android/model/ConsumerSessionSignup;", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/stripe/android/model/SignUpParams;", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "signUp-0E7RQCE", "(Lcom/stripe/android/model/SignUpParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mobileSignUp", "mobileSignUp-0E7RQCE", "lookupConsumerSession", "Lcom/stripe/android/model/ConsumerSessionLookup;", "email", "requestSurface", "doNotLogConsumerFunnelEvent", "", "customerId", "(Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/core/networking/ApiRequest$Options;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mobileLookupConsumerSession", "emailSource", "Lcom/stripe/android/model/EmailSource;", "verificationToken", "appId", "sessionId", "(Ljava/lang/String;Lcom/stripe/android/model/EmailSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startConsumerVerification", "Lcom/stripe/android/model/ConsumerSession;", "consumerSessionClientSecret", "locale", "Ljava/util/Locale;", "type", "Lcom/stripe/android/model/VerificationType;", "customEmailType", "Lcom/stripe/android/model/CustomEmailType;", "connectionsMerchantName", "(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Lcom/stripe/android/model/VerificationType;Lcom/stripe/android/model/CustomEmailType;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmConsumerVerification", "verificationCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/VerificationType;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attachLinkConsumerToLinkAccountSession", "Lcom/stripe/android/model/AttachConsumerToLinkAccountSession;", "clientSecret", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails;", "paymentDetailsCreateParams", "Lcom/stripe/android/model/ConsumerPaymentDetailsCreateParams;", "createPaymentDetails-yxL6bBk", "(Ljava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetailsCreateParams;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sharePaymentDetails", "Lcom/stripe/android/model/SharePaymentDetails;", "paymentDetailsId", "expectedPaymentMethodType", "billingPhone", "extraParams", "", "", "sharePaymentDetails-eH_QyT8", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAvailableIncentives", "Lcom/stripe/android/model/UpdateAvailableIncentives;", "updateAvailableIncentives-hUnOzRk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createLinkAccountSession", "Lcom/stripe/android/model/LinkAccountSession;", "intentToken", "linkMode", "Lcom/stripe/android/model/LinkMode;", "createLinkAccountSession-hUnOzRk", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConsumersApiServiceImpl implements ConsumersApiService {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final String attachLinkConsumerToLinkAccountSession;
    private static final String confirmConsumerVerificationUrl;
    private static final String consumerAccountsSignUpUrl;
    private static final String consumerMobileSignUpUrl;
    private static final String consumerSessionLookupUrl;
    private static final String createLinkAccountSession;
    private static final String createPaymentDetails;
    private static final String mobileConsumerSessionLookupUrl;
    private static final String sharePaymentDetails;
    private static final String startConsumerVerificationUrl;
    private static final String updateAvailableIncentivesUrl;
    private final ApiRequest.Factory apiRequestFactory;
    private final StripeErrorJsonParser stripeErrorJsonParser;
    private final StripeNetworkClient stripeNetworkClient;

    public ConsumersApiServiceImpl(StripeNetworkClient stripeNetworkClient, String apiVersion, String sdkVersion, AppInfo appInfo) {
        Intrinsics.checkNotNullParameter(stripeNetworkClient, "stripeNetworkClient");
        Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        this.stripeNetworkClient = stripeNetworkClient;
        this.stripeErrorJsonParser = new StripeErrorJsonParser();
        this.apiRequestFactory = new ApiRequest.Factory(appInfo, apiVersion, sdkVersion);
    }

    public /* synthetic */ ConsumersApiServiceImpl(StripeNetworkClient stripeNetworkClient, String str, String str2, AppInfo appInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stripeNetworkClient, str, (i & 4) != 0 ? "AndroidBindings/21.22.2" : str2, appInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.repository.ConsumersApiService
    /* renamed from: signUp-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8602signUp0E7RQCE(SignUpParams signUpParams, ApiRequest.Options options, Continuation<? super Result<ConsumerSessionSignup>> continuation) {
        ConsumersApiServiceImpl$signUp$1 consumersApiServiceImpl$signUp$1;
        if (continuation instanceof ConsumersApiServiceImpl$signUp$1) {
            consumersApiServiceImpl$signUp$1 = (ConsumersApiServiceImpl$signUp$1) continuation;
            if ((consumersApiServiceImpl$signUp$1.label & Integer.MIN_VALUE) != 0) {
                consumersApiServiceImpl$signUp$1.label -= Integer.MIN_VALUE;
            } else {
                consumersApiServiceImpl$signUp$1 = new ConsumersApiServiceImpl$signUp$1(this, continuation);
            }
        }
        Object obj = consumersApiServiceImpl$signUp$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = consumersApiServiceImpl$signUp$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        StripeErrorJsonParser stripeErrorJsonParser = this.stripeErrorJsonParser;
        StripeNetworkClient stripeNetworkClient = this.stripeNetworkClient;
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, consumerAccountsSignUpUrl, options, signUpParams.toParamMap(), false, 8, null);
        ConsumerSessionSignupJsonParser consumerSessionSignupJsonParser = ConsumerSessionSignupJsonParser.INSTANCE;
        consumersApiServiceImpl$signUp$1.label = 1;
        Object objExecuteRequestWithResultParser = RequestExecutorKt.executeRequestWithResultParser(stripeNetworkClient, stripeErrorJsonParser, apiRequestCreatePost$default, consumerSessionSignupJsonParser, consumersApiServiceImpl$signUp$1);
        return objExecuteRequestWithResultParser == coroutine_suspended ? coroutine_suspended : objExecuteRequestWithResultParser;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.repository.ConsumersApiService
    /* renamed from: mobileSignUp-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8600mobileSignUp0E7RQCE(SignUpParams signUpParams, ApiRequest.Options options, Continuation<? super Result<ConsumerSessionSignup>> continuation) {
        ConsumersApiServiceImpl$mobileSignUp$1 consumersApiServiceImpl$mobileSignUp$1;
        if (continuation instanceof ConsumersApiServiceImpl$mobileSignUp$1) {
            consumersApiServiceImpl$mobileSignUp$1 = (ConsumersApiServiceImpl$mobileSignUp$1) continuation;
            if ((consumersApiServiceImpl$mobileSignUp$1.label & Integer.MIN_VALUE) != 0) {
                consumersApiServiceImpl$mobileSignUp$1.label -= Integer.MIN_VALUE;
            } else {
                consumersApiServiceImpl$mobileSignUp$1 = new ConsumersApiServiceImpl$mobileSignUp$1(this, continuation);
            }
        }
        Object obj = consumersApiServiceImpl$mobileSignUp$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = consumersApiServiceImpl$mobileSignUp$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        StripeErrorJsonParser stripeErrorJsonParser = this.stripeErrorJsonParser;
        StripeNetworkClient stripeNetworkClient = this.stripeNetworkClient;
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, consumerMobileSignUpUrl, options, signUpParams.toParamMap(), false, 8, null);
        ConsumerSessionSignupJsonParser consumerSessionSignupJsonParser = ConsumerSessionSignupJsonParser.INSTANCE;
        consumersApiServiceImpl$mobileSignUp$1.label = 1;
        Object objExecuteRequestWithResultParser = RequestExecutorKt.executeRequestWithResultParser(stripeNetworkClient, stripeErrorJsonParser, apiRequestCreatePost$default, consumerSessionSignupJsonParser, consumersApiServiceImpl$mobileSignUp$1);
        return objExecuteRequestWithResultParser == coroutine_suspended ? coroutine_suspended : objExecuteRequestWithResultParser;
    }

    @Override // com.stripe.android.repository.ConsumersApiService
    public Object lookupConsumerSession(String str, String str2, boolean z, ApiRequest.Options options, String str3, Continuation<? super ConsumerSessionLookup> continuation) {
        Map mapEmptyMap;
        if (z) {
            mapEmptyMap = MapsKt.mapOf(TuplesKt.to("do_not_log_consumer_funnel_event", Boxing.boxBoolean(true)));
        } else {
            mapEmptyMap = MapsKt.emptyMap();
        }
        StripeErrorJsonParser stripeErrorJsonParser = this.stripeErrorJsonParser;
        StripeNetworkClient stripeNetworkClient = this.stripeNetworkClient;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String str4 = consumerSessionLookupUrl;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to("request_surface", str2), TuplesKt.to("email_address", lowerCase), TuplesKt.to("customer_id", str3));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapMapOf.entrySet()) {
            if (((String) entry.getValue()) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return RequestExecutorKt.executeRequestWithModelJsonParser(stripeNetworkClient, stripeErrorJsonParser, ApiRequest.Factory.createPost$default(factory, str4, options, MapsKt.plus(linkedHashMap, mapEmptyMap), false, 8, null), new ConsumerSessionLookupJsonParser(), continuation);
    }

    @Override // com.stripe.android.repository.ConsumersApiService
    public Object mobileLookupConsumerSession(String str, EmailSource emailSource, String str2, String str3, String str4, ApiRequest.Options options, String str5, String str6, Continuation<? super ConsumerSessionLookup> continuation) {
        StripeErrorJsonParser stripeErrorJsonParser = this.stripeErrorJsonParser;
        StripeNetworkClient stripeNetworkClient = this.stripeNetworkClient;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String str7 = mobileConsumerSessionLookupUrl;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to("request_surface", str2), TuplesKt.to("email_address", lowerCase), TuplesKt.to("android_verification_token", str3), TuplesKt.to("session_id", str5), TuplesKt.to("email_source", emailSource.getBackendValue()), TuplesKt.to("app_id", str4), TuplesKt.to("customer_id", str6));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapMapOf.entrySet()) {
            if (((String) entry.getValue()) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return RequestExecutorKt.executeRequestWithModelJsonParser(stripeNetworkClient, stripeErrorJsonParser, ApiRequest.Factory.createPost$default(factory, str7, options, linkedHashMap, false, 8, null), new ConsumerSessionLookupJsonParser(), continuation);
    }

    @Override // com.stripe.android.repository.ConsumersApiService
    public Object startConsumerVerification(String str, Locale locale, String str2, VerificationType verificationType, CustomEmailType customEmailType, String str3, ApiRequest.Options options, Continuation<? super ConsumerSession> continuation) {
        StripeErrorJsonParser stripeErrorJsonParser = this.stripeErrorJsonParser;
        StripeNetworkClient stripeNetworkClient = this.stripeNetworkClient;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String str4 = startConsumerVerificationUrl;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = TuplesKt.to("request_surface", str2);
        pairArr[1] = TuplesKt.to("credentials", MapsKt.mapOf(TuplesKt.to(NetworkConstants.PARAMS_CONSUMER_CLIENT_SECRET, str)));
        pairArr[2] = TuplesKt.to("type", verificationType.getValue());
        pairArr[3] = TuplesKt.to("custom_email_type", customEmailType != null ? customEmailType.getValue() : null);
        pairArr[4] = TuplesKt.to("connections_merchant_name", str3);
        pairArr[5] = TuplesKt.to("locale", locale.toLanguageTag());
        Map mapMapOf = MapsKt.mapOf(pairArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapMapOf.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return RequestExecutorKt.executeRequestWithModelJsonParser(stripeNetworkClient, stripeErrorJsonParser, ApiRequest.Factory.createPost$default(factory, str4, options, linkedHashMap, false, 8, null), new ConsumerSessionJsonParser(), continuation);
    }

    @Override // com.stripe.android.repository.ConsumersApiService
    public Object confirmConsumerVerification(String str, String str2, String str3, VerificationType verificationType, ApiRequest.Options options, Continuation<? super ConsumerSession> continuation) {
        return RequestExecutorKt.executeRequestWithModelJsonParser(this.stripeNetworkClient, this.stripeErrorJsonParser, ApiRequest.Factory.createPost$default(this.apiRequestFactory, confirmConsumerVerificationUrl, options, MapsKt.mapOf(TuplesKt.to("request_surface", str3), TuplesKt.to("credentials", MapsKt.mapOf(TuplesKt.to(NetworkConstants.PARAMS_CONSUMER_CLIENT_SECRET, str))), TuplesKt.to("type", verificationType.getValue()), TuplesKt.to("code", str2)), false, 8, null), new ConsumerSessionJsonParser(), continuation);
    }

    @Override // com.stripe.android.repository.ConsumersApiService
    public Object attachLinkConsumerToLinkAccountSession(String str, String str2, String str3, ApiRequest.Options options, Continuation<? super AttachConsumerToLinkAccountSession> continuation) {
        return RequestExecutorKt.executeRequestWithModelJsonParser(this.stripeNetworkClient, this.stripeErrorJsonParser, ApiRequest.Factory.createPost$default(this.apiRequestFactory, attachLinkConsumerToLinkAccountSession, options, MapsKt.mapOf(TuplesKt.to("request_surface", str3), TuplesKt.to("credentials", MapsKt.mapOf(TuplesKt.to(NetworkConstants.PARAMS_CONSUMER_CLIENT_SECRET, str))), TuplesKt.to("link_account_session", str2)), false, 8, null), AttachConsumerToLinkAccountSessionJsonParser.INSTANCE, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.stripe.android.repository.ConsumersApiService
    /* renamed from: createPaymentDetails-yxL6bBk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8599createPaymentDetailsyxL6bBk(String str, ConsumerPaymentDetailsCreateParams consumerPaymentDetailsCreateParams, String str2, ApiRequest.Options options, Continuation<? super Result<ConsumerPaymentDetails>> continuation) {
        ConsumersApiServiceImpl$createPaymentDetails$1 consumersApiServiceImpl$createPaymentDetails$1;
        if (continuation instanceof ConsumersApiServiceImpl$createPaymentDetails$1) {
            consumersApiServiceImpl$createPaymentDetails$1 = (ConsumersApiServiceImpl$createPaymentDetails$1) continuation;
            if ((consumersApiServiceImpl$createPaymentDetails$1.label & Integer.MIN_VALUE) != 0) {
                consumersApiServiceImpl$createPaymentDetails$1.label -= Integer.MIN_VALUE;
            } else {
                consumersApiServiceImpl$createPaymentDetails$1 = new ConsumersApiServiceImpl$createPaymentDetails$1(this, continuation);
            }
        }
        Object obj = consumersApiServiceImpl$createPaymentDetails$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = consumersApiServiceImpl$createPaymentDetails$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        StripeErrorJsonParser stripeErrorJsonParser = this.stripeErrorJsonParser;
        StripeNetworkClient stripeNetworkClient = this.stripeNetworkClient;
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, createPaymentDetails, options, MapsKt.plus(MapsKt.mapOf(TuplesKt.to("request_surface", str2), TuplesKt.to("credentials", MapsKt.mapOf(TuplesKt.to(NetworkConstants.PARAMS_CONSUMER_CLIENT_SECRET, str)))), consumerPaymentDetailsCreateParams.toParamMap()), false, 8, null);
        ConsumerPaymentDetailsJsonParser consumerPaymentDetailsJsonParser = ConsumerPaymentDetailsJsonParser.INSTANCE;
        consumersApiServiceImpl$createPaymentDetails$1.label = 1;
        Object objExecuteRequestWithResultParser = RequestExecutorKt.executeRequestWithResultParser(stripeNetworkClient, stripeErrorJsonParser, apiRequestCreatePost$default, consumerPaymentDetailsJsonParser, consumersApiServiceImpl$createPaymentDetails$1);
        return objExecuteRequestWithResultParser == coroutine_suspended ? coroutine_suspended : objExecuteRequestWithResultParser;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.stripe.android.repository.ConsumersApiService
    /* renamed from: sharePaymentDetails-eH_QyT8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8601sharePaymentDetailseH_QyT8(String str, String str2, String str3, String str4, String str5, ApiRequest.Options options, Map<String, ? extends Object> map, Continuation<? super Result<SharePaymentDetails>> continuation) {
        ConsumersApiServiceImpl$sharePaymentDetails$1 consumersApiServiceImpl$sharePaymentDetails$1;
        if (continuation instanceof ConsumersApiServiceImpl$sharePaymentDetails$1) {
            consumersApiServiceImpl$sharePaymentDetails$1 = (ConsumersApiServiceImpl$sharePaymentDetails$1) continuation;
            if ((consumersApiServiceImpl$sharePaymentDetails$1.label & Integer.MIN_VALUE) != 0) {
                consumersApiServiceImpl$sharePaymentDetails$1.label -= Integer.MIN_VALUE;
            } else {
                consumersApiServiceImpl$sharePaymentDetails$1 = new ConsumersApiServiceImpl$sharePaymentDetails$1(this, continuation);
            }
        }
        Object obj = consumersApiServiceImpl$sharePaymentDetails$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = consumersApiServiceImpl$sharePaymentDetails$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        StripeErrorJsonParser stripeErrorJsonParser = this.stripeErrorJsonParser;
        StripeNetworkClient stripeNetworkClient = this.stripeNetworkClient;
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, sharePaymentDetails, options, MapsKt.plus(MapsKt.mapOf(TuplesKt.to("request_surface", str5), TuplesKt.to("id", str2), TuplesKt.to("expected_payment_method_type", str3), TuplesKt.to("credentials", MapsKt.mapOf(TuplesKt.to(NetworkConstants.PARAMS_CONSUMER_CLIENT_SECRET, str))), TuplesKt.to("billing_phone", str4)), map), false, 8, null);
        SharePaymentDetailsJsonParser sharePaymentDetailsJsonParser = SharePaymentDetailsJsonParser.INSTANCE;
        consumersApiServiceImpl$sharePaymentDetails$1.label = 1;
        Object objExecuteRequestWithResultParser = RequestExecutorKt.executeRequestWithResultParser(stripeNetworkClient, stripeErrorJsonParser, apiRequestCreatePost$default, sharePaymentDetailsJsonParser, consumersApiServiceImpl$sharePaymentDetails$1);
        return objExecuteRequestWithResultParser == coroutine_suspended ? coroutine_suspended : objExecuteRequestWithResultParser;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.stripe.android.repository.ConsumersApiService
    /* renamed from: updateAvailableIncentives-hUnOzRk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8603updateAvailableIncentiveshUnOzRk(String str, String str2, String str3, String str4, ApiRequest.Options options, Continuation<? super Result<UpdateAvailableIncentives>> continuation) {
        ConsumersApiServiceImpl$updateAvailableIncentives$1 consumersApiServiceImpl$updateAvailableIncentives$1;
        if (continuation instanceof ConsumersApiServiceImpl$updateAvailableIncentives$1) {
            consumersApiServiceImpl$updateAvailableIncentives$1 = (ConsumersApiServiceImpl$updateAvailableIncentives$1) continuation;
            if ((consumersApiServiceImpl$updateAvailableIncentives$1.label & Integer.MIN_VALUE) != 0) {
                consumersApiServiceImpl$updateAvailableIncentives$1.label -= Integer.MIN_VALUE;
            } else {
                consumersApiServiceImpl$updateAvailableIncentives$1 = new ConsumersApiServiceImpl$updateAvailableIncentives$1(this, continuation);
            }
        }
        Object obj = consumersApiServiceImpl$updateAvailableIncentives$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = consumersApiServiceImpl$updateAvailableIncentives$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        StripeErrorJsonParser stripeErrorJsonParser = this.stripeErrorJsonParser;
        StripeNetworkClient stripeNetworkClient = this.stripeNetworkClient;
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, updateAvailableIncentivesUrl, options, MapsKt.mapOf(TuplesKt.to("request_surface", str4), TuplesKt.to("session_id", str), TuplesKt.to("payment_details_id", str2), TuplesKt.to("credentials", MapsKt.mapOf(TuplesKt.to(NetworkConstants.PARAMS_CONSUMER_CLIENT_SECRET, str3)))), false, 8, null);
        UpdateAvailableIncentivesJsonParser updateAvailableIncentivesJsonParser = UpdateAvailableIncentivesJsonParser.INSTANCE;
        consumersApiServiceImpl$updateAvailableIncentives$1.label = 1;
        Object objExecuteRequestWithResultParser = RequestExecutorKt.executeRequestWithResultParser(stripeNetworkClient, stripeErrorJsonParser, apiRequestCreatePost$default, updateAvailableIncentivesJsonParser, consumersApiServiceImpl$updateAvailableIncentives$1);
        return objExecuteRequestWithResultParser == coroutine_suspended ? coroutine_suspended : objExecuteRequestWithResultParser;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.stripe.android.repository.ConsumersApiService
    /* renamed from: createLinkAccountSession-hUnOzRk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8598createLinkAccountSessionhUnOzRk(String str, String str2, LinkMode linkMode, String str3, ApiRequest.Options options, Continuation<? super Result<LinkAccountSession>> continuation) {
        ConsumersApiServiceImpl$createLinkAccountSession$1 consumersApiServiceImpl$createLinkAccountSession$1;
        if (continuation instanceof ConsumersApiServiceImpl$createLinkAccountSession$1) {
            consumersApiServiceImpl$createLinkAccountSession$1 = (ConsumersApiServiceImpl$createLinkAccountSession$1) continuation;
            if ((consumersApiServiceImpl$createLinkAccountSession$1.label & Integer.MIN_VALUE) != 0) {
                consumersApiServiceImpl$createLinkAccountSession$1.label -= Integer.MIN_VALUE;
            } else {
                consumersApiServiceImpl$createLinkAccountSession$1 = new ConsumersApiServiceImpl$createLinkAccountSession$1(this, continuation);
            }
        }
        Object obj = consumersApiServiceImpl$createLinkAccountSession$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = consumersApiServiceImpl$createLinkAccountSession$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        StripeErrorJsonParser stripeErrorJsonParser = this.stripeErrorJsonParser;
        StripeNetworkClient stripeNetworkClient = this.stripeNetworkClient;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String str4 = createLinkAccountSession;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = TuplesKt.to("credentials", MapsKt.mapOf(TuplesKt.to(NetworkConstants.PARAMS_CONSUMER_CLIENT_SECRET, str)));
        pairArr[1] = TuplesKt.to("intent_token", str2);
        pairArr[2] = TuplesKt.to("link_mode", linkMode != null ? linkMode.getValue() : null);
        pairArr[3] = TuplesKt.to("request_surface", str3);
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(factory, str4, options, MapsKt.mapOf(pairArr), false, 8, null);
        LinkAccountSessionJsonParser linkAccountSessionJsonParser = LinkAccountSessionJsonParser.INSTANCE;
        consumersApiServiceImpl$createLinkAccountSession$1.label = 1;
        Object objExecuteRequestWithResultParser = RequestExecutorKt.executeRequestWithResultParser(stripeNetworkClient, stripeErrorJsonParser, apiRequestCreatePost$default, linkAccountSessionJsonParser, consumersApiServiceImpl$createLinkAccountSession$1);
        return objExecuteRequestWithResultParser == coroutine_suspended ? coroutine_suspended : objExecuteRequestWithResultParser;
    }

    /* compiled from: ConsumersApiService.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;", "", "<init>", "()V", "consumerAccountsSignUpUrl", "", "getConsumerAccountsSignUpUrl$payments_model_release", "()Ljava/lang/String;", "consumerMobileSignUpUrl", "getConsumerMobileSignUpUrl$payments_model_release", "consumerSessionLookupUrl", "getConsumerSessionLookupUrl$payments_model_release", "mobileConsumerSessionLookupUrl", "getMobileConsumerSessionLookupUrl$payments_model_release", "startConsumerVerificationUrl", "getStartConsumerVerificationUrl$payments_model_release", "confirmConsumerVerificationUrl", "getConfirmConsumerVerificationUrl$payments_model_release", "attachLinkConsumerToLinkAccountSession", "getAttachLinkConsumerToLinkAccountSession$payments_model_release", "createPaymentDetails", "createLinkAccountSession", "sharePaymentDetails", "updateAvailableIncentivesUrl", "getApiUrl", "path", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getConsumerAccountsSignUpUrl$payments_model_release() {
            return ConsumersApiServiceImpl.consumerAccountsSignUpUrl;
        }

        public final String getConsumerMobileSignUpUrl$payments_model_release() {
            return ConsumersApiServiceImpl.consumerMobileSignUpUrl;
        }

        public final String getConsumerSessionLookupUrl$payments_model_release() {
            return ConsumersApiServiceImpl.consumerSessionLookupUrl;
        }

        public final String getMobileConsumerSessionLookupUrl$payments_model_release() {
            return ConsumersApiServiceImpl.mobileConsumerSessionLookupUrl;
        }

        public final String getStartConsumerVerificationUrl$payments_model_release() {
            return ConsumersApiServiceImpl.startConsumerVerificationUrl;
        }

        public final String getConfirmConsumerVerificationUrl$payments_model_release() {
            return ConsumersApiServiceImpl.confirmConsumerVerificationUrl;
        }

        public final String getAttachLinkConsumerToLinkAccountSession$payments_model_release() {
            return ConsumersApiServiceImpl.attachLinkConsumerToLinkAccountSession;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getApiUrl(String path) {
            return "https://api.stripe.com/v1/" + path;
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        consumerAccountsSignUpUrl = companion.getApiUrl("consumers/accounts/sign_up");
        consumerMobileSignUpUrl = companion.getApiUrl("consumers/mobile/sign_up");
        consumerSessionLookupUrl = companion.getApiUrl("consumers/sessions/lookup");
        mobileConsumerSessionLookupUrl = companion.getApiUrl("consumers/mobile/sessions/lookup");
        startConsumerVerificationUrl = companion.getApiUrl("consumers/sessions/start_verification");
        confirmConsumerVerificationUrl = companion.getApiUrl("consumers/sessions/confirm_verification");
        attachLinkConsumerToLinkAccountSession = companion.getApiUrl("consumers/attach_link_consumer_to_link_account_session");
        createPaymentDetails = companion.getApiUrl("consumers/payment_details");
        createLinkAccountSession = companion.getApiUrl("consumers/link_account_sessions");
        sharePaymentDetails = companion.getApiUrl("consumers/payment_details/share");
        updateAvailableIncentivesUrl = companion.getApiUrl("consumers/incentives/update_available");
    }
}
