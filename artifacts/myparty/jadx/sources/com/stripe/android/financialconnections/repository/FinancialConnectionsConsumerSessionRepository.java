package com.stripe.android.financialconnections.repository;

import androidx.autofill.HintConstants;
import com.stripe.android.core.Logger;
import com.stripe.android.core.frauddetection.FraudDetectionDataRepository;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.domain.IsLinkWithStripe;
import com.stripe.android.financialconnections.repository.api.FinancialConnectionsConsumersApiService;
import com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions;
import com.stripe.android.model.AttachConsumerToLinkAccountSession;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.ConsumerSessionSignup;
import com.stripe.android.model.CustomEmailType;
import com.stripe.android.model.EmailSource;
import com.stripe.android.model.SharePaymentDetails;
import com.stripe.android.model.UpdateAvailableIncentives;
import com.stripe.android.model.VerificationType;
import com.stripe.android.repository.ConsumersApiService;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsConsumerSessionRepository.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 72\u00020\u0001:\u00017J\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003H¦@¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0002\u0010\nJ6\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH¦@¢\u0006\u0002\u0010\u0011J&\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH¦@¢\u0006\u0002\u0010\u0016J6\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH¦@¢\u0006\u0002\u0010\u0018J2\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H¦@¢\u0006\u0002\u0010!J&\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001eH¦@¢\u0006\u0002\u0010$J\u001e\u0010%\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0002\u0010\nJ(\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010+H¦@¢\u0006\u0002\u0010,J0\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u00100\u001a\u00020\b2\b\u00101\u001a\u0004\u0018\u00010\bH¦@¢\u0006\u0002\u00102J.\u00103\u001a\b\u0012\u0004\u0012\u000205042\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\bH¦@¢\u0006\u0004\b6\u0010\u0016¨\u00068"}, d2 = {"Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;", "", "getCachedConsumerSession", "Lcom/stripe/android/financialconnections/repository/CachedConsumerSession;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postConsumerSession", "Lcom/stripe/android/model/ConsumerSessionLookup;", "email", "", "clientSecret", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mobileLookupConsumerSession", "emailSource", "Lcom/stripe/android/model/EmailSource;", "verificationToken", "sessionId", "appId", "(Ljava/lang/String;Lcom/stripe/android/model/EmailSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "Lcom/stripe/android/model/ConsumerSessionSignup;", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "country", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mobileSignUp", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startConsumerVerification", "Lcom/stripe/android/model/ConsumerSession;", "consumerSessionClientSecret", "connectionsMerchantName", "type", "Lcom/stripe/android/model/VerificationType;", "customEmailType", "Lcom/stripe/android/model/CustomEmailType;", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/VerificationType;Lcom/stripe/android/model/CustomEmailType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmConsumerVerification", "verificationCode", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/VerificationType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attachLinkConsumerToLinkAccountSession", "Lcom/stripe/android/model/AttachConsumerToLinkAccountSession;", "createPaymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails;", "bankAccountId", "billingDetails", "Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sharePaymentDetails", "Lcom/stripe/android/model/SharePaymentDetails;", "paymentDetailsId", "expectedPaymentMethodType", "billingPhone", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAvailableIncentives", "Lkotlin/Result;", "Lcom/stripe/android/model/UpdateAvailableIncentives;", "updateAvailableIncentives-BWLJW6A", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface FinancialConnectionsConsumerSessionRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Object attachLinkConsumerToLinkAccountSession(String str, String str2, Continuation<? super AttachConsumerToLinkAccountSession> continuation);

    Object confirmConsumerVerification(String str, String str2, VerificationType verificationType, Continuation<? super ConsumerSession> continuation);

    Object createPaymentDetails(String str, String str2, ElementsSessionContext.BillingDetails billingDetails, Continuation<? super ConsumerPaymentDetails> continuation);

    Object getCachedConsumerSession(Continuation<? super CachedConsumerSession> continuation);

    Object mobileLookupConsumerSession(String str, EmailSource emailSource, String str2, String str3, String str4, Continuation<? super ConsumerSessionLookup> continuation);

    Object mobileSignUp(String str, String str2, String str3, String str4, String str5, Continuation<? super ConsumerSessionSignup> continuation);

    Object postConsumerSession(String str, String str2, Continuation<? super ConsumerSessionLookup> continuation);

    Object sharePaymentDetails(String str, String str2, String str3, String str4, Continuation<? super SharePaymentDetails> continuation);

    Object signUp(String str, String str2, String str3, Continuation<? super ConsumerSessionSignup> continuation);

    Object startConsumerVerification(String str, String str2, VerificationType verificationType, CustomEmailType customEmailType, Continuation<? super ConsumerSession> continuation);

    /* renamed from: updateAvailableIncentives-BWLJW6A, reason: not valid java name */
    Object mo7548updateAvailableIncentivesBWLJW6A(String str, String str2, String str3, Continuation<? super Result<UpdateAvailableIncentives>> continuation);

    /* compiled from: FinancialConnectionsConsumerSessionRepository.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0086\u0002¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository$Companion;", "", "<init>", "()V", "invoke", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;", "consumersApiService", "Lcom/stripe/android/repository/ConsumersApiService;", "provideApiRequestOptions", "Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;", "consumerSessionRepository", "Lcom/stripe/android/financialconnections/repository/ConsumerSessionRepository;", "financialConnectionsConsumersApiService", "Lcom/stripe/android/financialconnections/repository/api/FinancialConnectionsConsumersApiService;", "locale", "Ljava/util/Locale;", "logger", "Lcom/stripe/android/core/Logger;", "isLinkWithStripe", "Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;", "fraudDetectionDataRepository", "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;", "elementsSessionContext", "Lcom/stripe/android/financialconnections/ElementsSessionContext;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final FinancialConnectionsConsumerSessionRepository invoke(ConsumersApiService consumersApiService, ProvideApiRequestOptions provideApiRequestOptions, ConsumerSessionRepository consumerSessionRepository, FinancialConnectionsConsumersApiService financialConnectionsConsumersApiService, Locale locale, Logger logger, IsLinkWithStripe isLinkWithStripe, FraudDetectionDataRepository fraudDetectionDataRepository, ElementsSessionContext elementsSessionContext) {
            Intrinsics.checkNotNullParameter(consumersApiService, "consumersApiService");
            Intrinsics.checkNotNullParameter(provideApiRequestOptions, "provideApiRequestOptions");
            Intrinsics.checkNotNullParameter(consumerSessionRepository, "consumerSessionRepository");
            Intrinsics.checkNotNullParameter(financialConnectionsConsumersApiService, "financialConnectionsConsumersApiService");
            Intrinsics.checkNotNullParameter(logger, "logger");
            Intrinsics.checkNotNullParameter(isLinkWithStripe, "isLinkWithStripe");
            Intrinsics.checkNotNullParameter(fraudDetectionDataRepository, "fraudDetectionDataRepository");
            return new FinancialConnectionsConsumerSessionRepositoryImpl(financialConnectionsConsumersApiService, consumersApiService, consumerSessionRepository, provideApiRequestOptions, locale, logger, fraudDetectionDataRepository, elementsSessionContext, isLinkWithStripe);
        }
    }
}
