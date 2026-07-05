package com.stripe.android.link.repositories;

import android.app.Application;
import androidx.autofill.HintConstants;
import com.stripe.android.PaymentsFraudDetectionDataRepositoryFactoryKt;
import com.stripe.android.core.frauddetection.DefaultFraudDetectionDataRepository;
import com.stripe.android.core.frauddetection.FraudDetectionDataRepository;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.link.LinkPaymentDetails;
import com.stripe.android.link.LinkPaymentMethod;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.ConsumerPaymentDetailsUpdateParams;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.ConsumerSessionSignup;
import com.stripe.android.model.ConsumerShippingAddresses;
import com.stripe.android.model.ConsumerSignUpConsentAction;
import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams;
import com.stripe.android.model.EmailSource;
import com.stripe.android.model.IncentiveEligibilitySession;
import com.stripe.android.model.LinkAccountSession;
import com.stripe.android.model.LinkMode;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.SharePaymentDetails;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.VerificationType;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.repository.ConsumersApiService;
import java.util.Locale;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* compiled from: LinkApiRepository.kt */
@Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u007f2\u00020\u0001:\u0001\u007fB_\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJH\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b&\u0010'JD\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u00172\u0006\u0010\u0019\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010\u00062\b\u0010+\u001a\u0004\u0018\u00010\u00062\b\u0010,\u001a\u0004\u0018\u00010\u00062\u0006\u0010-\u001a\u00020.H\u0096@¢\u0006\u0004\b/\u00100Jn\u00101\u001a\b\u0012\u0004\u0012\u00020)0\u00172\b\u0010,\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u0006\u0010-\u001a\u00020.2\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u00010\u00062\b\u00106\u001a\u0004\u0018\u0001072\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b8\u00109J@\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u00172\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u00062\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u00062\b\u0010B\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\bC\u0010DJ.\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\u00172\u0006\u0010G\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u0006H\u0096@¢\u0006\u0004\bH\u0010IJ.\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u00172\u0006\u0010<\u001a\u00020=2\u0006\u0010L\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u0006H\u0096@¢\u0006\u0004\bM\u0010NJB\u0010O\u001a\b\u0012\u0004\u0012\u00020P0\u00172\u0006\u0010A\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u00062\u0006\u0010R\u001a\u00020\u00062\b\u0010S\u001a\u0004\u0018\u00010\u00062\b\u0010T\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\bU\u0010VJ&\u0010W\u001a\b\u0012\u0004\u0012\u00020X0\u00172\u0006\u0010A\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020ZH\u0096@¢\u0006\u0004\b[\u0010\\J(\u0010]\u001a\b\u0012\u0004\u0012\u00020^0\u00172\u0006\u0010A\u001a\u00020\u00062\b\u0010_\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b`\u0010\u001cJ(\u0010a\u001a\b\u0012\u0004\u0012\u00020^0\u00172\u0006\u0010A\u001a\u00020\u00062\b\u0010B\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\bb\u0010\u001cJ0\u0010c\u001a\b\u0012\u0004\u0012\u00020^0\u00172\u0006\u0010d\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u00062\b\u0010B\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\be\u0010IJ6\u0010f\u001a\b\u0012\u0004\u0012\u00020g0\u00172\f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00060i2\u0006\u0010A\u001a\u00020\u00062\b\u0010B\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\bj\u0010kJ(\u0010l\u001a\b\u0012\u0004\u0012\u00020m0\u00172\u0006\u0010A\u001a\u00020\u00062\b\u0010B\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\bn\u0010\u001cJ0\u0010o\u001a\b\u0012\u0004\u0012\u00020p0\u00172\u0006\u0010Q\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u00062\b\u0010B\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\bq\u0010IJ0\u0010r\u001a\b\u0012\u0004\u0012\u00020g0\u00172\u0006\u0010s\u001a\u00020t2\u0006\u0010A\u001a\u00020\u00062\b\u0010B\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\bu\u0010vJ:\u0010w\u001a\b\u0012\u0004\u0012\u00020x0\u00172\u0006\u0010A\u001a\u00020\u00062\u0006\u0010?\u001a\u00020@2\b\u0010y\u001a\u0004\u0018\u00010z2\b\u0010B\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b{\u0010|J\u0014\u0010}\u001a\u00020~2\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\u0006H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0080\u0001"}, d2 = {"Lcom/stripe/android/link/repositories/LinkApiRepository;", "Lcom/stripe/android/link/repositories/LinkRepository;", "application", "Landroid/app/Application;", "publishableKeyProvider", "Lkotlin/Function0;", "", "stripeAccountIdProvider", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "consumersApiService", "Lcom/stripe/android/repository/ConsumersApiService;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "locale", "Ljava/util/Locale;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "<init>", "(Landroid/app/Application;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/repository/ConsumersApiService;Lkotlin/coroutines/CoroutineContext;Ljava/util/Locale;Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V", "fraudDetectionDataRepository", "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;", "lookupConsumer", "Lkotlin/Result;", "Lcom/stripe/android/model/ConsumerSessionLookup;", "email", "customerId", "lookupConsumer-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lookupConsumerWithoutBackendLoggingForExposure", "lookupConsumerWithoutBackendLoggingForExposure-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mobileLookupConsumer", "emailSource", "Lcom/stripe/android/model/EmailSource;", "verificationToken", "appId", "sessionId", "mobileLookupConsumer-bMdYcbs", "(Ljava/lang/String;Lcom/stripe/android/model/EmailSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumerSignUp", "Lcom/stripe/android/model/ConsumerSessionSignup;", "phone", "country", "name", "consentAction", "Lcom/stripe/android/model/ConsumerSignUpConsentAction;", "consumerSignUp-hUnOzRk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConsumerSignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mobileSignUp", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, "", "currency", "incentiveEligibilitySession", "Lcom/stripe/android/model/IncentiveEligibilitySession;", "mobileSignUp-5p_uFSQ", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConsumerSignUpConsentAction;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/IncentiveEligibilitySession;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCardPaymentDetails", "Lcom/stripe/android/link/LinkPaymentDetails$New;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "userEmail", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "consumerSessionClientSecret", "consumerPublishableKey", "createCardPaymentDetails-hUnOzRk", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createBankAccountPaymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "bankAccountId", "createBankAccountPaymentDetails-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shareCardPaymentDetails", "Lcom/stripe/android/link/LinkPaymentDetails$Saved;", "id", "shareCardPaymentDetails-BWLJW6A", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sharePaymentDetails", "Lcom/stripe/android/model/SharePaymentDetails;", "paymentDetailsId", "expectedPaymentMethodType", "billingPhone", "cvc", "sharePaymentDetails-hUnOzRk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethod", "Lcom/stripe/android/link/LinkPaymentMethod;", "createPaymentMethod-0E7RQCE", "(Ljava/lang/String;Lcom/stripe/android/link/LinkPaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logOut", "Lcom/stripe/android/model/ConsumerSession;", "consumerAccountPublishableKey", "logOut-0E7RQCE", "startVerification", "startVerification-0E7RQCE", "confirmVerification", "verificationCode", "confirmVerification-BWLJW6A", "listPaymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails;", "paymentMethodTypes", "", "listPaymentDetails-BWLJW6A", "(Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listShippingAddresses", "Lcom/stripe/android/model/ConsumerShippingAddresses;", "listShippingAddresses-0E7RQCE", "deletePaymentDetails", "", "deletePaymentDetails-BWLJW6A", "updatePaymentDetails", "updateParams", "Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;", "updatePaymentDetails-BWLJW6A", "(Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createLinkAccountSession", "Lcom/stripe/android/model/LinkAccountSession;", "linkMode", "Lcom/stripe/android/model/LinkMode;", "createLinkAccountSession-yxL6bBk", "(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/LinkMode;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildRequestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkApiRepository implements LinkRepository {

    @Deprecated
    public static final String ALLOW_REDISPLAY_PARAM = "allow_redisplay";

    @Deprecated
    public static final String REQUEST_SURFACE = "android_payment_element";
    private final ConsumersApiService consumersApiService;
    private final ErrorReporter errorReporter;
    private final FraudDetectionDataRepository fraudDetectionDataRepository;
    private final Locale locale;
    private final Function0<String> publishableKeyProvider;
    private final Function0<String> stripeAccountIdProvider;
    private final StripeRepository stripeRepository;
    private final CoroutineContext workContext;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Inject
    public LinkApiRepository(Application application, @Named("publishableKey") Function0<String> publishableKeyProvider, @Named(NamedConstantsKt.STRIPE_ACCOUNT_ID) Function0<String> stripeAccountIdProvider, StripeRepository stripeRepository, ConsumersApiService consumersApiService, @IOContext CoroutineContext workContext, Locale locale, ErrorReporter errorReporter) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(stripeAccountIdProvider, "stripeAccountIdProvider");
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(consumersApiService, "consumersApiService");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        this.publishableKeyProvider = publishableKeyProvider;
        this.stripeAccountIdProvider = stripeAccountIdProvider;
        this.stripeRepository = stripeRepository;
        this.consumersApiService = consumersApiService;
        this.workContext = workContext;
        this.locale = locale;
        this.errorReporter = errorReporter;
        DefaultFraudDetectionDataRepository DefaultFraudDetectionDataRepository = PaymentsFraudDetectionDataRepositoryFactoryKt.DefaultFraudDetectionDataRepository(application, workContext);
        this.fraudDetectionDataRepository = DefaultFraudDetectionDataRepository;
        DefaultFraudDetectionDataRepository.refresh();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: lookupConsumer-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7757lookupConsumer0E7RQCE(String str, String str2, Continuation<? super Result<ConsumerSessionLookup>> continuation) {
        LinkApiRepository$lookupConsumer$1 linkApiRepository$lookupConsumer$1;
        if (continuation instanceof LinkApiRepository$lookupConsumer$1) {
            linkApiRepository$lookupConsumer$1 = (LinkApiRepository$lookupConsumer$1) continuation;
            if ((linkApiRepository$lookupConsumer$1.label & Integer.MIN_VALUE) != 0) {
                linkApiRepository$lookupConsumer$1.label -= Integer.MIN_VALUE;
            } else {
                linkApiRepository$lookupConsumer$1 = new LinkApiRepository$lookupConsumer$1(this, continuation);
            }
        }
        Object objWithContext = linkApiRepository$lookupConsumer$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = linkApiRepository$lookupConsumer$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContext = this.workContext;
            LinkApiRepository$lookupConsumer$2 linkApiRepository$lookupConsumer$2 = new LinkApiRepository$lookupConsumer$2(this, str, str2, null);
            linkApiRepository$lookupConsumer$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, linkApiRepository$lookupConsumer$2, linkApiRepository$lookupConsumer$1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: lookupConsumerWithoutBackendLoggingForExposure-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7758lookupConsumerWithoutBackendLoggingForExposuregIAlus(String str, Continuation<? super Result<ConsumerSessionLookup>> continuation) {
        LinkApiRepository$lookupConsumerWithoutBackendLoggingForExposure$1 linkApiRepository$lookupConsumerWithoutBackendLoggingForExposure$1;
        if (continuation instanceof LinkApiRepository$lookupConsumerWithoutBackendLoggingForExposure$1) {
            linkApiRepository$lookupConsumerWithoutBackendLoggingForExposure$1 = (LinkApiRepository$lookupConsumerWithoutBackendLoggingForExposure$1) continuation;
            if ((linkApiRepository$lookupConsumerWithoutBackendLoggingForExposure$1.label & Integer.MIN_VALUE) != 0) {
                linkApiRepository$lookupConsumerWithoutBackendLoggingForExposure$1.label -= Integer.MIN_VALUE;
            } else {
                linkApiRepository$lookupConsumerWithoutBackendLoggingForExposure$1 = new LinkApiRepository$lookupConsumerWithoutBackendLoggingForExposure$1(this, continuation);
            }
        }
        Object objWithContext = linkApiRepository$lookupConsumerWithoutBackendLoggingForExposure$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = linkApiRepository$lookupConsumerWithoutBackendLoggingForExposure$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContext = this.workContext;
            LinkApiRepository$lookupConsumerWithoutBackendLoggingForExposure$2 linkApiRepository$lookupConsumerWithoutBackendLoggingForExposure$2 = new LinkApiRepository$lookupConsumerWithoutBackendLoggingForExposure$2(this, str, null);
            linkApiRepository$lookupConsumerWithoutBackendLoggingForExposure$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, linkApiRepository$lookupConsumerWithoutBackendLoggingForExposure$2, linkApiRepository$lookupConsumerWithoutBackendLoggingForExposure$1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: mobileLookupConsumer-bMdYcbs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7759mobileLookupConsumerbMdYcbs(String str, EmailSource emailSource, String str2, String str3, String str4, String str5, Continuation<? super Result<ConsumerSessionLookup>> continuation) {
        LinkApiRepository$mobileLookupConsumer$1 linkApiRepository$mobileLookupConsumer$1;
        if (continuation instanceof LinkApiRepository$mobileLookupConsumer$1) {
            linkApiRepository$mobileLookupConsumer$1 = (LinkApiRepository$mobileLookupConsumer$1) continuation;
            if ((linkApiRepository$mobileLookupConsumer$1.label & Integer.MIN_VALUE) != 0) {
                linkApiRepository$mobileLookupConsumer$1.label -= Integer.MIN_VALUE;
            } else {
                linkApiRepository$mobileLookupConsumer$1 = new LinkApiRepository$mobileLookupConsumer$1(this, continuation);
            }
        }
        LinkApiRepository$mobileLookupConsumer$1 linkApiRepository$mobileLookupConsumer$12 = linkApiRepository$mobileLookupConsumer$1;
        Object objWithContext = linkApiRepository$mobileLookupConsumer$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = linkApiRepository$mobileLookupConsumer$12.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContext = this.workContext;
            LinkApiRepository$mobileLookupConsumer$2 linkApiRepository$mobileLookupConsumer$2 = new LinkApiRepository$mobileLookupConsumer$2(this, str, emailSource, str2, str3, str4, str5, null);
            linkApiRepository$mobileLookupConsumer$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, linkApiRepository$mobileLookupConsumer$2, linkApiRepository$mobileLookupConsumer$12);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: consumerSignUp-hUnOzRk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7748consumerSignUphUnOzRk(String str, String str2, String str3, String str4, ConsumerSignUpConsentAction consumerSignUpConsentAction, Continuation<? super Result<ConsumerSessionSignup>> continuation) {
        LinkApiRepository$consumerSignUp$1 linkApiRepository$consumerSignUp$1;
        if (continuation instanceof LinkApiRepository$consumerSignUp$1) {
            linkApiRepository$consumerSignUp$1 = (LinkApiRepository$consumerSignUp$1) continuation;
            if ((linkApiRepository$consumerSignUp$1.label & Integer.MIN_VALUE) != 0) {
                linkApiRepository$consumerSignUp$1.label -= Integer.MIN_VALUE;
            } else {
                linkApiRepository$consumerSignUp$1 = new LinkApiRepository$consumerSignUp$1(this, continuation);
            }
        }
        LinkApiRepository$consumerSignUp$1 linkApiRepository$consumerSignUp$12 = linkApiRepository$consumerSignUp$1;
        Object objWithContext = linkApiRepository$consumerSignUp$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = linkApiRepository$consumerSignUp$12.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContext = this.workContext;
            LinkApiRepository$consumerSignUp$2 linkApiRepository$consumerSignUp$2 = new LinkApiRepository$consumerSignUp$2(this, str, str2, str3, str4, consumerSignUpConsentAction, null);
            linkApiRepository$consumerSignUp$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, linkApiRepository$consumerSignUp$2, linkApiRepository$consumerSignUp$12);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: mobileSignUp-5p_uFSQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7760mobileSignUp5p_uFSQ(String str, String str2, String str3, String str4, ConsumerSignUpConsentAction consumerSignUpConsentAction, Long l, String str5, IncentiveEligibilitySession incentiveEligibilitySession, String str6, String str7, Continuation<? super Result<ConsumerSessionSignup>> continuation) {
        LinkApiRepository$mobileSignUp$1 linkApiRepository$mobileSignUp$1;
        if (continuation instanceof LinkApiRepository$mobileSignUp$1) {
            linkApiRepository$mobileSignUp$1 = (LinkApiRepository$mobileSignUp$1) continuation;
            if ((linkApiRepository$mobileSignUp$1.label & Integer.MIN_VALUE) != 0) {
                linkApiRepository$mobileSignUp$1.label -= Integer.MIN_VALUE;
            } else {
                linkApiRepository$mobileSignUp$1 = new LinkApiRepository$mobileSignUp$1(this, continuation);
            }
        }
        LinkApiRepository$mobileSignUp$1 linkApiRepository$mobileSignUp$12 = linkApiRepository$mobileSignUp$1;
        Object objWithContext = linkApiRepository$mobileSignUp$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = linkApiRepository$mobileSignUp$12.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContext = this.workContext;
            LinkApiRepository$mobileSignUp$2 linkApiRepository$mobileSignUp$2 = new LinkApiRepository$mobileSignUp$2(this, str2, str3, str4, str, l, str5, incentiveEligibilitySession, consumerSignUpConsentAction, str6, str7, null);
            linkApiRepository$mobileSignUp$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, linkApiRepository$mobileSignUp$2, linkApiRepository$mobileSignUp$12);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: createCardPaymentDetails-hUnOzRk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7750createCardPaymentDetailshUnOzRk(PaymentMethodCreateParams paymentMethodCreateParams, String str, StripeIntent stripeIntent, String str2, String str3, Continuation<? super Result<LinkPaymentDetails.New>> continuation) {
        LinkApiRepository$createCardPaymentDetails$1 linkApiRepository$createCardPaymentDetails$1;
        if (continuation instanceof LinkApiRepository$createCardPaymentDetails$1) {
            linkApiRepository$createCardPaymentDetails$1 = (LinkApiRepository$createCardPaymentDetails$1) continuation;
            if ((linkApiRepository$createCardPaymentDetails$1.label & Integer.MIN_VALUE) != 0) {
                linkApiRepository$createCardPaymentDetails$1.label -= Integer.MIN_VALUE;
            } else {
                linkApiRepository$createCardPaymentDetails$1 = new LinkApiRepository$createCardPaymentDetails$1(this, continuation);
            }
        }
        Object objWithContext = linkApiRepository$createCardPaymentDetails$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = linkApiRepository$createCardPaymentDetails$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContext = this.workContext;
            LinkApiRepository$createCardPaymentDetails$2 linkApiRepository$createCardPaymentDetails$2 = new LinkApiRepository$createCardPaymentDetails$2(this, str2, paymentMethodCreateParams, str, str3, null);
            linkApiRepository$createCardPaymentDetails$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, linkApiRepository$createCardPaymentDetails$2, linkApiRepository$createCardPaymentDetails$1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: createBankAccountPaymentDetails-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7749createBankAccountPaymentDetailsBWLJW6A(String str, String str2, String str3, Continuation<? super Result<? extends ConsumerPaymentDetails.PaymentDetails>> continuation) {
        LinkApiRepository$createBankAccountPaymentDetails$1 linkApiRepository$createBankAccountPaymentDetails$1;
        if (continuation instanceof LinkApiRepository$createBankAccountPaymentDetails$1) {
            linkApiRepository$createBankAccountPaymentDetails$1 = (LinkApiRepository$createBankAccountPaymentDetails$1) continuation;
            if ((linkApiRepository$createBankAccountPaymentDetails$1.label & Integer.MIN_VALUE) != 0) {
                linkApiRepository$createBankAccountPaymentDetails$1.label -= Integer.MIN_VALUE;
            } else {
                linkApiRepository$createBankAccountPaymentDetails$1 = new LinkApiRepository$createBankAccountPaymentDetails$1(this, continuation);
            }
        }
        Object objWithContext = linkApiRepository$createBankAccountPaymentDetails$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = linkApiRepository$createBankAccountPaymentDetails$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContext = this.workContext;
            LinkApiRepository$createBankAccountPaymentDetails$2 linkApiRepository$createBankAccountPaymentDetails$2 = new LinkApiRepository$createBankAccountPaymentDetails$2(this, str3, str, str2, null);
            linkApiRepository$createBankAccountPaymentDetails$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, linkApiRepository$createBankAccountPaymentDetails$2, linkApiRepository$createBankAccountPaymentDetails$1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: shareCardPaymentDetails-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7761shareCardPaymentDetailsBWLJW6A(PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, Continuation<? super Result<LinkPaymentDetails.Saved>> continuation) {
        LinkApiRepository$shareCardPaymentDetails$1 linkApiRepository$shareCardPaymentDetails$1;
        if (continuation instanceof LinkApiRepository$shareCardPaymentDetails$1) {
            linkApiRepository$shareCardPaymentDetails$1 = (LinkApiRepository$shareCardPaymentDetails$1) continuation;
            if ((linkApiRepository$shareCardPaymentDetails$1.label & Integer.MIN_VALUE) != 0) {
                linkApiRepository$shareCardPaymentDetails$1.label -= Integer.MIN_VALUE;
            } else {
                linkApiRepository$shareCardPaymentDetails$1 = new LinkApiRepository$shareCardPaymentDetails$1(this, continuation);
            }
        }
        Object objWithContext = linkApiRepository$shareCardPaymentDetails$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = linkApiRepository$shareCardPaymentDetails$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContext = this.workContext;
            LinkApiRepository$shareCardPaymentDetails$2 linkApiRepository$shareCardPaymentDetails$2 = new LinkApiRepository$shareCardPaymentDetails$2(paymentMethodCreateParams, this, str2, str, null);
            linkApiRepository$shareCardPaymentDetails$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, linkApiRepository$shareCardPaymentDetails$2, linkApiRepository$shareCardPaymentDetails$1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: sharePaymentDetails-hUnOzRk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7762sharePaymentDetailshUnOzRk(String str, String str2, String str3, String str4, String str5, Continuation<? super Result<SharePaymentDetails>> continuation) {
        LinkApiRepository$sharePaymentDetails$1 linkApiRepository$sharePaymentDetails$1;
        if (continuation instanceof LinkApiRepository$sharePaymentDetails$1) {
            linkApiRepository$sharePaymentDetails$1 = (LinkApiRepository$sharePaymentDetails$1) continuation;
            if ((linkApiRepository$sharePaymentDetails$1.label & Integer.MIN_VALUE) != 0) {
                linkApiRepository$sharePaymentDetails$1.label -= Integer.MIN_VALUE;
            } else {
                linkApiRepository$sharePaymentDetails$1 = new LinkApiRepository$sharePaymentDetails$1(this, continuation);
            }
        }
        LinkApiRepository$sharePaymentDetails$1 linkApiRepository$sharePaymentDetails$12 = linkApiRepository$sharePaymentDetails$1;
        Object objWithContext = linkApiRepository$sharePaymentDetails$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = linkApiRepository$sharePaymentDetails$12.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContext = this.workContext;
            LinkApiRepository$sharePaymentDetails$2 linkApiRepository$sharePaymentDetails$2 = new LinkApiRepository$sharePaymentDetails$2(this, str5, str, str2, str3, str4, null);
            linkApiRepository$sharePaymentDetails$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, linkApiRepository$sharePaymentDetails$2, linkApiRepository$sharePaymentDetails$12);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: createPaymentMethod-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7752createPaymentMethod0E7RQCE(String str, LinkPaymentMethod linkPaymentMethod, Continuation<? super Result<PaymentMethod>> continuation) {
        LinkApiRepository$createPaymentMethod$1 linkApiRepository$createPaymentMethod$1;
        if (continuation instanceof LinkApiRepository$createPaymentMethod$1) {
            linkApiRepository$createPaymentMethod$1 = (LinkApiRepository$createPaymentMethod$1) continuation;
            if ((linkApiRepository$createPaymentMethod$1.label & Integer.MIN_VALUE) != 0) {
                linkApiRepository$createPaymentMethod$1.label -= Integer.MIN_VALUE;
            } else {
                linkApiRepository$createPaymentMethod$1 = new LinkApiRepository$createPaymentMethod$1(this, continuation);
            }
        }
        Object objWithContext = linkApiRepository$createPaymentMethod$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = linkApiRepository$createPaymentMethod$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContext = this.workContext;
            LinkApiRepository$createPaymentMethod$2 linkApiRepository$createPaymentMethod$2 = new LinkApiRepository$createPaymentMethod$2(linkPaymentMethod, str, this, null);
            linkApiRepository$createPaymentMethod$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, linkApiRepository$createPaymentMethod$2, linkApiRepository$createPaymentMethod$1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: logOut-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7756logOut0E7RQCE(String str, String str2, Continuation<? super Result<ConsumerSession>> continuation) {
        LinkApiRepository$logOut$1 linkApiRepository$logOut$1;
        if (continuation instanceof LinkApiRepository$logOut$1) {
            linkApiRepository$logOut$1 = (LinkApiRepository$logOut$1) continuation;
            if ((linkApiRepository$logOut$1.label & Integer.MIN_VALUE) != 0) {
                linkApiRepository$logOut$1.label -= Integer.MIN_VALUE;
            } else {
                linkApiRepository$logOut$1 = new LinkApiRepository$logOut$1(this, continuation);
            }
        }
        Object objWithContext = linkApiRepository$logOut$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = linkApiRepository$logOut$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContext = this.workContext;
            LinkApiRepository$logOut$2 linkApiRepository$logOut$2 = new LinkApiRepository$logOut$2(this, str, str2, null);
            linkApiRepository$logOut$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, linkApiRepository$logOut$2, linkApiRepository$logOut$1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: startVerification-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7763startVerification0E7RQCE(String str, String str2, Continuation<? super Result<ConsumerSession>> continuation) {
        LinkApiRepository$startVerification$1 linkApiRepository$startVerification$1;
        ApiRequest.Options options;
        if (continuation instanceof LinkApiRepository$startVerification$1) {
            linkApiRepository$startVerification$1 = (LinkApiRepository$startVerification$1) continuation;
            if ((linkApiRepository$startVerification$1.label & Integer.MIN_VALUE) != 0) {
                linkApiRepository$startVerification$1.label -= Integer.MIN_VALUE;
            } else {
                linkApiRepository$startVerification$1 = new LinkApiRepository$startVerification$1(this, continuation);
            }
        }
        LinkApiRepository$startVerification$1 linkApiRepository$startVerification$12 = linkApiRepository$startVerification$1;
        Object objStartConsumerVerification = linkApiRepository$startVerification$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = linkApiRepository$startVerification$12.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(objStartConsumerVerification);
                Result.Companion companion = Result.INSTANCE;
                LinkApiRepository linkApiRepository = this;
                ConsumersApiService consumersApiService = this.consumersApiService;
                Locale locale = this.locale;
                if (locale == null) {
                    locale = Locale.US;
                }
                Locale locale2 = locale;
                Intrinsics.checkNotNull(locale2);
                VerificationType verificationType = VerificationType.SMS;
                if (str2 != null) {
                    options = new ApiRequest.Options(str2, null, null, 6, null);
                } else {
                    options = new ApiRequest.Options(this.publishableKeyProvider.invoke(), this.stripeAccountIdProvider.invoke(), null, 4, null);
                }
                ApiRequest.Options options2 = options;
                linkApiRepository$startVerification$12.label = 1;
                objStartConsumerVerification = consumersApiService.startConsumerVerification(str, locale2, REQUEST_SURFACE, verificationType, null, null, options2, linkApiRepository$startVerification$12);
                if (objStartConsumerVerification == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objStartConsumerVerification);
            }
            if (objStartConsumerVerification != null) {
                return Result.m9118constructorimpl((ConsumerSession) objStartConsumerVerification);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: confirmVerification-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7747confirmVerificationBWLJW6A(String str, String str2, String str3, Continuation<? super Result<ConsumerSession>> continuation) {
        LinkApiRepository$confirmVerification$1 linkApiRepository$confirmVerification$1;
        ApiRequest.Options options;
        if (continuation instanceof LinkApiRepository$confirmVerification$1) {
            linkApiRepository$confirmVerification$1 = (LinkApiRepository$confirmVerification$1) continuation;
            if ((linkApiRepository$confirmVerification$1.label & Integer.MIN_VALUE) != 0) {
                linkApiRepository$confirmVerification$1.label -= Integer.MIN_VALUE;
            } else {
                linkApiRepository$confirmVerification$1 = new LinkApiRepository$confirmVerification$1(this, continuation);
            }
        }
        LinkApiRepository$confirmVerification$1 linkApiRepository$confirmVerification$12 = linkApiRepository$confirmVerification$1;
        Object objConfirmConsumerVerification = linkApiRepository$confirmVerification$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = linkApiRepository$confirmVerification$12.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(objConfirmConsumerVerification);
                Result.Companion companion = Result.INSTANCE;
                LinkApiRepository linkApiRepository = this;
                ConsumersApiService consumersApiService = this.consumersApiService;
                VerificationType verificationType = VerificationType.SMS;
                if (str3 != null) {
                    options = new ApiRequest.Options(str3, null, null, 6, null);
                } else {
                    options = new ApiRequest.Options(this.publishableKeyProvider.invoke(), this.stripeAccountIdProvider.invoke(), null, 4, null);
                }
                ApiRequest.Options options2 = options;
                linkApiRepository$confirmVerification$12.label = 1;
                objConfirmConsumerVerification = consumersApiService.confirmConsumerVerification(str2, str, REQUEST_SURFACE, verificationType, options2, linkApiRepository$confirmVerification$12);
                if (objConfirmConsumerVerification == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objConfirmConsumerVerification);
            }
            if (objConfirmConsumerVerification != null) {
                return Result.m9118constructorimpl((ConsumerSession) objConfirmConsumerVerification);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: listPaymentDetails-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7754listPaymentDetailsBWLJW6A(Set<String> set, String str, String str2, Continuation<? super Result<ConsumerPaymentDetails>> continuation) {
        LinkApiRepository$listPaymentDetails$1 linkApiRepository$listPaymentDetails$1;
        ApiRequest.Options options;
        if (continuation instanceof LinkApiRepository$listPaymentDetails$1) {
            linkApiRepository$listPaymentDetails$1 = (LinkApiRepository$listPaymentDetails$1) continuation;
            if ((linkApiRepository$listPaymentDetails$1.label & Integer.MIN_VALUE) != 0) {
                linkApiRepository$listPaymentDetails$1.label -= Integer.MIN_VALUE;
            } else {
                linkApiRepository$listPaymentDetails$1 = new LinkApiRepository$listPaymentDetails$1(this, continuation);
            }
        }
        Object obj = linkApiRepository$listPaymentDetails$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = linkApiRepository$listPaymentDetails$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        StripeRepository stripeRepository = this.stripeRepository;
        if (str2 != null) {
            options = new ApiRequest.Options(str2, null, null, 6, null);
        } else {
            options = new ApiRequest.Options(this.publishableKeyProvider.invoke(), this.stripeAccountIdProvider.invoke(), null, 4, null);
        }
        linkApiRepository$listPaymentDetails$1.label = 1;
        Object objMo8038listPaymentDetailsBWLJW6A = stripeRepository.mo8038listPaymentDetailsBWLJW6A(str, set, options, linkApiRepository$listPaymentDetails$1);
        return objMo8038listPaymentDetailsBWLJW6A == coroutine_suspended ? coroutine_suspended : objMo8038listPaymentDetailsBWLJW6A;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: listShippingAddresses-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7755listShippingAddresses0E7RQCE(String str, String str2, Continuation<? super Result<ConsumerShippingAddresses>> continuation) {
        LinkApiRepository$listShippingAddresses$1 linkApiRepository$listShippingAddresses$1;
        ApiRequest.Options options;
        if (continuation instanceof LinkApiRepository$listShippingAddresses$1) {
            linkApiRepository$listShippingAddresses$1 = (LinkApiRepository$listShippingAddresses$1) continuation;
            if ((linkApiRepository$listShippingAddresses$1.label & Integer.MIN_VALUE) != 0) {
                linkApiRepository$listShippingAddresses$1.label -= Integer.MIN_VALUE;
            } else {
                linkApiRepository$listShippingAddresses$1 = new LinkApiRepository$listShippingAddresses$1(this, continuation);
            }
        }
        Object obj = linkApiRepository$listShippingAddresses$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = linkApiRepository$listShippingAddresses$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        StripeRepository stripeRepository = this.stripeRepository;
        if (str2 != null) {
            options = new ApiRequest.Options(str2, null, null, 6, null);
        } else {
            options = new ApiRequest.Options(this.publishableKeyProvider.invoke(), this.stripeAccountIdProvider.invoke(), null, 4, null);
        }
        linkApiRepository$listShippingAddresses$1.label = 1;
        Object objMo8039listShippingAddresses0E7RQCE = stripeRepository.mo8039listShippingAddresses0E7RQCE(str, options, linkApiRepository$listShippingAddresses$1);
        return objMo8039listShippingAddresses0E7RQCE == coroutine_suspended ? coroutine_suspended : objMo8039listShippingAddresses0E7RQCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: deletePaymentDetails-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7753deletePaymentDetailsBWLJW6A(String str, String str2, String str3, Continuation<? super Result<Unit>> continuation) {
        LinkApiRepository$deletePaymentDetails$1 linkApiRepository$deletePaymentDetails$1;
        ApiRequest.Options options;
        if (continuation instanceof LinkApiRepository$deletePaymentDetails$1) {
            linkApiRepository$deletePaymentDetails$1 = (LinkApiRepository$deletePaymentDetails$1) continuation;
            if ((linkApiRepository$deletePaymentDetails$1.label & Integer.MIN_VALUE) != 0) {
                linkApiRepository$deletePaymentDetails$1.label -= Integer.MIN_VALUE;
            } else {
                linkApiRepository$deletePaymentDetails$1 = new LinkApiRepository$deletePaymentDetails$1(this, continuation);
            }
        }
        Object obj = linkApiRepository$deletePaymentDetails$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = linkApiRepository$deletePaymentDetails$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        StripeRepository stripeRepository = this.stripeRepository;
        if (str3 != null) {
            options = new ApiRequest.Options(str3, null, null, 6, null);
        } else {
            options = new ApiRequest.Options(this.publishableKeyProvider.invoke(), this.stripeAccountIdProvider.invoke(), null, 4, null);
        }
        linkApiRepository$deletePaymentDetails$1.label = 1;
        Object objMo8032deletePaymentDetailsBWLJW6A = stripeRepository.mo8032deletePaymentDetailsBWLJW6A(str2, str, options, linkApiRepository$deletePaymentDetails$1);
        return objMo8032deletePaymentDetailsBWLJW6A == coroutine_suspended ? coroutine_suspended : objMo8032deletePaymentDetailsBWLJW6A;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: updatePaymentDetails-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7764updatePaymentDetailsBWLJW6A(ConsumerPaymentDetailsUpdateParams consumerPaymentDetailsUpdateParams, String str, String str2, Continuation<? super Result<ConsumerPaymentDetails>> continuation) {
        LinkApiRepository$updatePaymentDetails$1 linkApiRepository$updatePaymentDetails$1;
        ApiRequest.Options options;
        if (continuation instanceof LinkApiRepository$updatePaymentDetails$1) {
            linkApiRepository$updatePaymentDetails$1 = (LinkApiRepository$updatePaymentDetails$1) continuation;
            if ((linkApiRepository$updatePaymentDetails$1.label & Integer.MIN_VALUE) != 0) {
                linkApiRepository$updatePaymentDetails$1.label -= Integer.MIN_VALUE;
            } else {
                linkApiRepository$updatePaymentDetails$1 = new LinkApiRepository$updatePaymentDetails$1(this, continuation);
            }
        }
        Object obj = linkApiRepository$updatePaymentDetails$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = linkApiRepository$updatePaymentDetails$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        StripeRepository stripeRepository = this.stripeRepository;
        if (str2 != null) {
            options = new ApiRequest.Options(str2, null, null, 6, null);
        } else {
            options = new ApiRequest.Options(this.publishableKeyProvider.invoke(), this.stripeAccountIdProvider.invoke(), null, 4, null);
        }
        linkApiRepository$updatePaymentDetails$1.label = 1;
        Object objMo8059updatePaymentDetailsBWLJW6A = stripeRepository.mo8059updatePaymentDetailsBWLJW6A(str, consumerPaymentDetailsUpdateParams, options, linkApiRepository$updatePaymentDetails$1);
        return objMo8059updatePaymentDetailsBWLJW6A == coroutine_suspended ? coroutine_suspended : objMo8059updatePaymentDetailsBWLJW6A;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: createLinkAccountSession-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7751createLinkAccountSessionyxL6bBk(String str, StripeIntent stripeIntent, LinkMode linkMode, String str2, Continuation<? super Result<LinkAccountSession>> continuation) {
        LinkApiRepository$createLinkAccountSession$1 linkApiRepository$createLinkAccountSession$1;
        ApiRequest.Options options;
        if (continuation instanceof LinkApiRepository$createLinkAccountSession$1) {
            linkApiRepository$createLinkAccountSession$1 = (LinkApiRepository$createLinkAccountSession$1) continuation;
            if ((linkApiRepository$createLinkAccountSession$1.label & Integer.MIN_VALUE) != 0) {
                linkApiRepository$createLinkAccountSession$1.label -= Integer.MIN_VALUE;
            } else {
                linkApiRepository$createLinkAccountSession$1 = new LinkApiRepository$createLinkAccountSession$1(this, continuation);
            }
        }
        LinkApiRepository$createLinkAccountSession$1 linkApiRepository$createLinkAccountSession$12 = linkApiRepository$createLinkAccountSession$1;
        Object obj = linkApiRepository$createLinkAccountSession$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = linkApiRepository$createLinkAccountSession$12.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ConsumersApiService consumersApiService = this.consumersApiService;
        String clientSecret = stripeIntent.getClientSecret();
        if (str2 != null) {
            options = new ApiRequest.Options(str2, null, null, 6, null);
        } else {
            options = new ApiRequest.Options(this.publishableKeyProvider.invoke(), this.stripeAccountIdProvider.invoke(), null, 4, null);
        }
        linkApiRepository$createLinkAccountSession$12.label = 1;
        Object objMo8598createLinkAccountSessionhUnOzRk = consumersApiService.mo8598createLinkAccountSessionhUnOzRk(str, clientSecret, linkMode, REQUEST_SURFACE, options, linkApiRepository$createLinkAccountSession$12);
        return objMo8598createLinkAccountSessionhUnOzRk == coroutine_suspended ? coroutine_suspended : objMo8598createLinkAccountSessionhUnOzRk;
    }

    static /* synthetic */ ApiRequest.Options buildRequestOptions$default(LinkApiRepository linkApiRepository, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return linkApiRepository.buildRequestOptions(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ApiRequest.Options buildRequestOptions(String consumerAccountPublishableKey) {
        String strInvoke = consumerAccountPublishableKey == null ? this.publishableKeyProvider.invoke() : consumerAccountPublishableKey;
        String strInvoke2 = this.stripeAccountIdProvider.invoke();
        if (consumerAccountPublishableKey != null) {
            strInvoke2 = null;
        }
        return new ApiRequest.Options(strInvoke, strInvoke2, null, 4, null);
    }

    /* compiled from: LinkApiRepository.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/link/repositories/LinkApiRepository$Companion;", "", "<init>", "()V", "REQUEST_SURFACE", "", "ALLOW_REDISPLAY_PARAM", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
