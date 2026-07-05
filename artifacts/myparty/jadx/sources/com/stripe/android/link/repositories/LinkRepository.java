package com.stripe.android.link.repositories;

import androidx.autofill.HintConstants;
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
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: LinkRepository.kt */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u000b\u0010\fJH\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0004\b\u0013\u0010\u0014JD\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001a\u001a\u00020\u001bH¦@¢\u0006\u0004\b\u001c\u0010\u001dJn\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010\u00062\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H¦@¢\u0006\u0004\b%\u0010&J@\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00032\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00062\b\u0010/\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0004\b0\u00101J.\u00102\u001a\b\u0012\u0004\u0012\u0002030\u00032\u0006\u00104\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u0006H¦@¢\u0006\u0004\b5\u00106J.\u00107\u001a\b\u0012\u0004\u0012\u0002080\u00032\u0006\u0010)\u001a\u00020*2\u0006\u00109\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u0006H¦@¢\u0006\u0004\b:\u0010;JB\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u00032\u0006\u0010.\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u00062\b\u0010@\u001a\u0004\u0018\u00010\u00062\b\u0010A\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0004\bB\u0010CJ&\u0010D\u001a\b\u0012\u0004\u0012\u00020E0\u00032\u0006\u0010.\u001a\u00020\u00062\u0006\u0010F\u001a\u00020GH¦@¢\u0006\u0004\bH\u0010IJ(\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u00032\u0006\u0010.\u001a\u00020\u00062\b\u0010L\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0004\bM\u0010\tJ(\u0010N\u001a\b\u0012\u0004\u0012\u00020K0\u00032\u0006\u0010.\u001a\u00020\u00062\b\u0010/\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0004\bO\u0010\tJ0\u0010P\u001a\b\u0012\u0004\u0012\u00020K0\u00032\u0006\u0010Q\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00062\b\u0010/\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0004\bR\u00106J6\u0010S\u001a\b\u0012\u0004\u0012\u00020T0\u00032\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00060V2\u0006\u0010.\u001a\u00020\u00062\b\u0010/\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0004\bW\u0010XJ(\u0010Y\u001a\b\u0012\u0004\u0012\u00020Z0\u00032\u0006\u0010.\u001a\u00020\u00062\b\u0010/\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0004\b[\u0010\tJ0\u0010\\\u001a\b\u0012\u0004\u0012\u00020]0\u00032\u0006\u0010>\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00062\b\u0010/\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0004\b^\u00106J0\u0010_\u001a\b\u0012\u0004\u0012\u00020T0\u00032\u0006\u0010`\u001a\u00020a2\u0006\u0010.\u001a\u00020\u00062\b\u0010/\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0004\bb\u0010cJ:\u0010d\u001a\b\u0012\u0004\u0012\u00020e0\u00032\u0006\u0010.\u001a\u00020\u00062\u0006\u0010,\u001a\u00020-2\b\u0010f\u001a\u0004\u0018\u00010g2\b\u0010/\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0004\bh\u0010i¨\u0006j"}, d2 = {"Lcom/stripe/android/link/repositories/LinkRepository;", "", "lookupConsumer", "Lkotlin/Result;", "Lcom/stripe/android/model/ConsumerSessionLookup;", "email", "", "customerId", "lookupConsumer-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lookupConsumerWithoutBackendLoggingForExposure", "lookupConsumerWithoutBackendLoggingForExposure-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mobileLookupConsumer", "emailSource", "Lcom/stripe/android/model/EmailSource;", "verificationToken", "appId", "sessionId", "mobileLookupConsumer-bMdYcbs", "(Ljava/lang/String;Lcom/stripe/android/model/EmailSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumerSignUp", "Lcom/stripe/android/model/ConsumerSessionSignup;", "phone", "country", "name", "consentAction", "Lcom/stripe/android/model/ConsumerSignUpConsentAction;", "consumerSignUp-hUnOzRk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConsumerSignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mobileSignUp", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, "", "currency", "incentiveEligibilitySession", "Lcom/stripe/android/model/IncentiveEligibilitySession;", "mobileSignUp-5p_uFSQ", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConsumerSignUpConsentAction;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/IncentiveEligibilitySession;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCardPaymentDetails", "Lcom/stripe/android/link/LinkPaymentDetails$New;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "userEmail", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "consumerSessionClientSecret", "consumerPublishableKey", "createCardPaymentDetails-hUnOzRk", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createBankAccountPaymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "bankAccountId", "createBankAccountPaymentDetails-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shareCardPaymentDetails", "Lcom/stripe/android/link/LinkPaymentDetails$Saved;", "id", "shareCardPaymentDetails-BWLJW6A", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sharePaymentDetails", "Lcom/stripe/android/model/SharePaymentDetails;", "paymentDetailsId", "expectedPaymentMethodType", "billingPhone", "cvc", "sharePaymentDetails-hUnOzRk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethod", "Lcom/stripe/android/link/LinkPaymentMethod;", "createPaymentMethod-0E7RQCE", "(Ljava/lang/String;Lcom/stripe/android/link/LinkPaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logOut", "Lcom/stripe/android/model/ConsumerSession;", "consumerAccountPublishableKey", "logOut-0E7RQCE", "startVerification", "startVerification-0E7RQCE", "confirmVerification", "verificationCode", "confirmVerification-BWLJW6A", "listPaymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails;", "paymentMethodTypes", "", "listPaymentDetails-BWLJW6A", "(Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listShippingAddresses", "Lcom/stripe/android/model/ConsumerShippingAddresses;", "listShippingAddresses-0E7RQCE", "deletePaymentDetails", "", "deletePaymentDetails-BWLJW6A", "updatePaymentDetails", "updateParams", "Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;", "updatePaymentDetails-BWLJW6A", "(Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createLinkAccountSession", "Lcom/stripe/android/model/LinkAccountSession;", "linkMode", "Lcom/stripe/android/model/LinkMode;", "createLinkAccountSession-yxL6bBk", "(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/LinkMode;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface LinkRepository {
    /* renamed from: confirmVerification-BWLJW6A */
    Object mo7747confirmVerificationBWLJW6A(String str, String str2, String str3, Continuation<? super Result<ConsumerSession>> continuation);

    /* renamed from: consumerSignUp-hUnOzRk */
    Object mo7748consumerSignUphUnOzRk(String str, String str2, String str3, String str4, ConsumerSignUpConsentAction consumerSignUpConsentAction, Continuation<? super Result<ConsumerSessionSignup>> continuation);

    /* renamed from: createBankAccountPaymentDetails-BWLJW6A */
    Object mo7749createBankAccountPaymentDetailsBWLJW6A(String str, String str2, String str3, Continuation<? super Result<? extends ConsumerPaymentDetails.PaymentDetails>> continuation);

    /* renamed from: createCardPaymentDetails-hUnOzRk */
    Object mo7750createCardPaymentDetailshUnOzRk(PaymentMethodCreateParams paymentMethodCreateParams, String str, StripeIntent stripeIntent, String str2, String str3, Continuation<? super Result<LinkPaymentDetails.New>> continuation);

    /* renamed from: createLinkAccountSession-yxL6bBk */
    Object mo7751createLinkAccountSessionyxL6bBk(String str, StripeIntent stripeIntent, LinkMode linkMode, String str2, Continuation<? super Result<LinkAccountSession>> continuation);

    /* renamed from: createPaymentMethod-0E7RQCE */
    Object mo7752createPaymentMethod0E7RQCE(String str, LinkPaymentMethod linkPaymentMethod, Continuation<? super Result<PaymentMethod>> continuation);

    /* renamed from: deletePaymentDetails-BWLJW6A */
    Object mo7753deletePaymentDetailsBWLJW6A(String str, String str2, String str3, Continuation<? super Result<Unit>> continuation);

    /* renamed from: listPaymentDetails-BWLJW6A */
    Object mo7754listPaymentDetailsBWLJW6A(Set<String> set, String str, String str2, Continuation<? super Result<ConsumerPaymentDetails>> continuation);

    /* renamed from: listShippingAddresses-0E7RQCE */
    Object mo7755listShippingAddresses0E7RQCE(String str, String str2, Continuation<? super Result<ConsumerShippingAddresses>> continuation);

    /* renamed from: logOut-0E7RQCE */
    Object mo7756logOut0E7RQCE(String str, String str2, Continuation<? super Result<ConsumerSession>> continuation);

    /* renamed from: lookupConsumer-0E7RQCE */
    Object mo7757lookupConsumer0E7RQCE(String str, String str2, Continuation<? super Result<ConsumerSessionLookup>> continuation);

    /* renamed from: lookupConsumerWithoutBackendLoggingForExposure-gIAlu-s */
    Object mo7758lookupConsumerWithoutBackendLoggingForExposuregIAlus(String str, Continuation<? super Result<ConsumerSessionLookup>> continuation);

    /* renamed from: mobileLookupConsumer-bMdYcbs */
    Object mo7759mobileLookupConsumerbMdYcbs(String str, EmailSource emailSource, String str2, String str3, String str4, String str5, Continuation<? super Result<ConsumerSessionLookup>> continuation);

    /* renamed from: mobileSignUp-5p_uFSQ */
    Object mo7760mobileSignUp5p_uFSQ(String str, String str2, String str3, String str4, ConsumerSignUpConsentAction consumerSignUpConsentAction, Long l, String str5, IncentiveEligibilitySession incentiveEligibilitySession, String str6, String str7, Continuation<? super Result<ConsumerSessionSignup>> continuation);

    /* renamed from: shareCardPaymentDetails-BWLJW6A */
    Object mo7761shareCardPaymentDetailsBWLJW6A(PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, Continuation<? super Result<LinkPaymentDetails.Saved>> continuation);

    /* renamed from: sharePaymentDetails-hUnOzRk */
    Object mo7762sharePaymentDetailshUnOzRk(String str, String str2, String str3, String str4, String str5, Continuation<? super Result<SharePaymentDetails>> continuation);

    /* renamed from: startVerification-0E7RQCE */
    Object mo7763startVerification0E7RQCE(String str, String str2, Continuation<? super Result<ConsumerSession>> continuation);

    /* renamed from: updatePaymentDetails-BWLJW6A */
    Object mo7764updatePaymentDetailsBWLJW6A(ConsumerPaymentDetailsUpdateParams consumerPaymentDetailsUpdateParams, String str, String str2, Continuation<? super Result<ConsumerPaymentDetails>> continuation);
}
