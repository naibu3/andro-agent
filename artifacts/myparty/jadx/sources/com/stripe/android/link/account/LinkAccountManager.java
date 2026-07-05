package com.stripe.android.link.account;

import com.facebook.hermes.intl.Constants;
import com.stripe.android.link.ConsumerState;
import com.stripe.android.link.LinkAccountUpdate;
import com.stripe.android.link.LinkPaymentDetails;
import com.stripe.android.link.LinkPaymentMethod;
import com.stripe.android.link.model.AccountStatus;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.ui.inline.SignUpConsentAction;
import com.stripe.android.link.ui.inline.UserInput;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.ConsumerPaymentDetailsUpdateParams;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.ConsumerShippingAddresses;
import com.stripe.android.model.EmailSource;
import com.stripe.android.model.LinkAccountSession;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.SharePaymentDetails;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: LinkAccountManager.kt */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J4\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019H¦@¢\u0006\u0004\b\u001d\u0010\u001eJJ\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019H¦@¢\u0006\u0004\b$\u0010%JD\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010'\u001a\u0004\u0018\u00010\u00192\b\u0010(\u001a\u0004\u0018\u00010\u00192\b\u0010)\u001a\u0004\u0018\u00010\u00192\u0006\u0010*\u001a\u00020+H¦@¢\u0006\u0004\b,\u0010-JP\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u00192\b\u0010)\u001a\u0004\u0018\u00010\u00192\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u00192\u0006\u0010*\u001a\u00020+H¦@¢\u0006\u0004\b/\u00100J\u001e\u00101\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u00102\u001a\u000203H¦@¢\u0006\u0004\b4\u00105J\u0016\u00106\u001a\b\u0012\u0004\u0012\u0002070\u0016H¦@¢\u0006\u0004\b8\u00109J\u001e\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u00162\u0006\u0010<\u001a\u00020=H¦@¢\u0006\u0004\b>\u0010?J\u001e\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\u00162\u0006\u0010B\u001a\u00020CH¦@¢\u0006\u0004\bD\u0010EJ\u001e\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u00162\u0006\u0010H\u001a\u00020\u0019H¦@¢\u0006\u0004\bI\u0010JJ\u001e\u0010K\u001a\b\u0012\u0004\u0012\u00020L0\u00162\u0006\u0010M\u001a\u00020AH¦@¢\u0006\u0004\bN\u0010OJ:\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0\u00162\u0006\u0010R\u001a\u00020\u00192\u0006\u0010S\u001a\u00020\u00192\b\u0010T\u001a\u0004\u0018\u00010\u00192\b\u0010U\u001a\u0004\u0018\u00010\u0019H¦@¢\u0006\u0004\bV\u0010WJ \u0010X\u001a\u0004\u0018\u00010\u00172\u0006\u0010Y\u001a\u00020Z2\u0006\u0010\u001a\u001a\u00020\u001bH¦@¢\u0006\u0002\u0010[J\u0016\u0010\\\u001a\b\u0012\u0004\u0012\u00020]0\u0016H¦@¢\u0006\u0004\b^\u00109J\u0016\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H¦@¢\u0006\u0004\b`\u00109J\u001e\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010b\u001a\u00020\u0019H¦@¢\u0006\u0004\bc\u0010JJ$\u0010d\u001a\b\u0012\u0004\u0012\u00020e0\u00162\f\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00190gH¦@¢\u0006\u0004\bh\u0010iJ\u0016\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00100\u0016H¦@¢\u0006\u0004\bk\u00109J\u001e\u0010l\u001a\b\u0012\u0004\u0012\u00020m0\u00162\u0006\u0010R\u001a\u00020\u0019H¦@¢\u0006\u0004\bn\u0010JJ*\u0010o\u001a\b\u0012\u0004\u0012\u00020e0\u00162\u0006\u0010p\u001a\u00020q2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0019H¦@¢\u0006\u0004\br\u0010sR\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u0010X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006t"}, d2 = {"Lcom/stripe/android/link/account/LinkAccountManager;", "", "linkAccountInfo", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/link/LinkAccountUpdate$Value;", "getLinkAccountInfo", "()Lkotlinx/coroutines/flow/StateFlow;", "accountStatus", "Lkotlinx/coroutines/flow/Flow;", "Lcom/stripe/android/link/model/AccountStatus;", "getAccountStatus", "()Lkotlinx/coroutines/flow/Flow;", "consumerState", "Lcom/stripe/android/link/ConsumerState;", "getConsumerState", "cachedShippingAddresses", "Lcom/stripe/android/model/ConsumerShippingAddresses;", "getCachedShippingAddresses", "()Lcom/stripe/android/model/ConsumerShippingAddresses;", "setCachedShippingAddresses", "(Lcom/stripe/android/model/ConsumerShippingAddresses;)V", "lookupConsumer", "Lkotlin/Result;", "Lcom/stripe/android/link/model/LinkAccount;", "email", "", "startSession", "", "customerId", "lookupConsumer-BWLJW6A", "(Ljava/lang/String;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mobileLookupConsumer", "emailSource", "Lcom/stripe/android/model/EmailSource;", "verificationToken", "appId", "mobileLookupConsumer-bMdYcbs", "(Ljava/lang/String;Lcom/stripe/android/model/EmailSource;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "phone", "country", "name", "consentAction", "Lcom/stripe/android/link/ui/inline/SignUpConsentAction;", "signUp-hUnOzRk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/SignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mobileSignUp", "mobileSignUp-eH_QyT8", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/SignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signInWithUserInput", "userInput", "Lcom/stripe/android/link/ui/inline/UserInput;", "signInWithUserInput-gIAlu-s", "(Lcom/stripe/android/link/ui/inline/UserInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logOut", "Lcom/stripe/android/model/ConsumerSession;", "logOut-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "linkPaymentMethod", "Lcom/stripe/android/link/LinkPaymentMethod;", "createPaymentMethod-gIAlu-s", "(Lcom/stripe/android/link/LinkPaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCardPaymentDetails", "Lcom/stripe/android/link/LinkPaymentDetails$New;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "createCardPaymentDetails-gIAlu-s", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createBankAccountPaymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "bankAccountId", "createBankAccountPaymentDetails-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shareCardPaymentDetails", "Lcom/stripe/android/link/LinkPaymentDetails$Saved;", "cardPaymentDetails", "shareCardPaymentDetails-gIAlu-s", "(Lcom/stripe/android/link/LinkPaymentDetails$New;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sharePaymentDetails", "Lcom/stripe/android/model/SharePaymentDetails;", "paymentDetailsId", "expectedPaymentMethodType", "billingPhone", "cvc", "sharePaymentDetails-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setLinkAccountFromLookupResult", Constants.LOCALEMATCHER_LOOKUP, "Lcom/stripe/android/model/ConsumerSessionLookup;", "(Lcom/stripe/android/model/ConsumerSessionLookup;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createLinkAccountSession", "Lcom/stripe/android/model/LinkAccountSession;", "createLinkAccountSession-IoAF18A", "startVerification", "startVerification-IoAF18A", "confirmVerification", "code", "confirmVerification-gIAlu-s", "listPaymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails;", "paymentMethodTypes", "", "listPaymentDetails-gIAlu-s", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listShippingAddresses", "listShippingAddresses-IoAF18A", "deletePaymentDetails", "", "deletePaymentDetails-gIAlu-s", "updatePaymentDetails", "updateParams", "Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;", "updatePaymentDetails-0E7RQCE", "(Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface LinkAccountManager {
    /* renamed from: confirmVerification-gIAlu-s */
    Object mo7705confirmVerificationgIAlus(String str, Continuation<? super Result<LinkAccount>> continuation);

    /* renamed from: createBankAccountPaymentDetails-gIAlu-s */
    Object mo7706createBankAccountPaymentDetailsgIAlus(String str, Continuation<? super Result<? extends ConsumerPaymentDetails.PaymentDetails>> continuation);

    /* renamed from: createCardPaymentDetails-gIAlu-s */
    Object mo7707createCardPaymentDetailsgIAlus(PaymentMethodCreateParams paymentMethodCreateParams, Continuation<? super Result<LinkPaymentDetails.New>> continuation);

    /* renamed from: createLinkAccountSession-IoAF18A */
    Object mo7708createLinkAccountSessionIoAF18A(Continuation<? super Result<LinkAccountSession>> continuation);

    /* renamed from: createPaymentMethod-gIAlu-s */
    Object mo7709createPaymentMethodgIAlus(LinkPaymentMethod linkPaymentMethod, Continuation<? super Result<PaymentMethod>> continuation);

    /* renamed from: deletePaymentDetails-gIAlu-s */
    Object mo7710deletePaymentDetailsgIAlus(String str, Continuation<? super Result<Unit>> continuation);

    Flow<AccountStatus> getAccountStatus();

    ConsumerShippingAddresses getCachedShippingAddresses();

    StateFlow<ConsumerState> getConsumerState();

    StateFlow<LinkAccountUpdate.Value> getLinkAccountInfo();

    /* renamed from: listPaymentDetails-gIAlu-s */
    Object mo7711listPaymentDetailsgIAlus(Set<String> set, Continuation<? super Result<ConsumerPaymentDetails>> continuation);

    /* renamed from: listShippingAddresses-IoAF18A */
    Object mo7712listShippingAddressesIoAF18A(Continuation<? super Result<ConsumerShippingAddresses>> continuation);

    /* renamed from: logOut-IoAF18A */
    Object mo7713logOutIoAF18A(Continuation<? super Result<ConsumerSession>> continuation);

    /* renamed from: lookupConsumer-BWLJW6A */
    Object mo7714lookupConsumerBWLJW6A(String str, boolean z, String str2, Continuation<? super Result<LinkAccount>> continuation);

    /* renamed from: mobileLookupConsumer-bMdYcbs */
    Object mo7715mobileLookupConsumerbMdYcbs(String str, EmailSource emailSource, String str2, String str3, boolean z, String str4, Continuation<? super Result<LinkAccount>> continuation);

    /* renamed from: mobileSignUp-eH_QyT8 */
    Object mo7716mobileSignUpeH_QyT8(String str, String str2, String str3, String str4, String str5, String str6, SignUpConsentAction signUpConsentAction, Continuation<? super Result<LinkAccount>> continuation);

    void setCachedShippingAddresses(ConsumerShippingAddresses consumerShippingAddresses);

    Object setLinkAccountFromLookupResult(ConsumerSessionLookup consumerSessionLookup, boolean z, Continuation<? super LinkAccount> continuation);

    /* renamed from: shareCardPaymentDetails-gIAlu-s */
    Object mo7717shareCardPaymentDetailsgIAlus(LinkPaymentDetails.New r1, Continuation<? super Result<LinkPaymentDetails.Saved>> continuation);

    /* renamed from: sharePaymentDetails-yxL6bBk */
    Object mo7718sharePaymentDetailsyxL6bBk(String str, String str2, String str3, String str4, Continuation<? super Result<SharePaymentDetails>> continuation);

    /* renamed from: signInWithUserInput-gIAlu-s */
    Object mo7719signInWithUserInputgIAlus(UserInput userInput, Continuation<? super Result<LinkAccount>> continuation);

    /* renamed from: signUp-hUnOzRk */
    Object mo7720signUphUnOzRk(String str, String str2, String str3, String str4, SignUpConsentAction signUpConsentAction, Continuation<? super Result<LinkAccount>> continuation);

    /* renamed from: startVerification-IoAF18A */
    Object mo7721startVerificationIoAF18A(Continuation<? super Result<LinkAccount>> continuation);

    /* renamed from: updatePaymentDetails-0E7RQCE */
    Object mo7722updatePaymentDetails0E7RQCE(ConsumerPaymentDetailsUpdateParams consumerPaymentDetailsUpdateParams, String str, Continuation<? super Result<ConsumerPaymentDetails>> continuation);

    /* compiled from: LinkAccountManager.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        /* renamed from: lookupConsumer-BWLJW6A$default, reason: not valid java name */
        public static /* synthetic */ Object m7727lookupConsumerBWLJW6A$default(LinkAccountManager linkAccountManager, String str, boolean z, String str2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lookupConsumer-BWLJW6A");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            return linkAccountManager.mo7714lookupConsumerBWLJW6A(str, z, str2, continuation);
        }

        /* renamed from: updatePaymentDetails-0E7RQCE$default, reason: not valid java name */
        public static /* synthetic */ Object m7728updatePaymentDetails0E7RQCE$default(LinkAccountManager linkAccountManager, ConsumerPaymentDetailsUpdateParams consumerPaymentDetailsUpdateParams, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updatePaymentDetails-0E7RQCE");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            return linkAccountManager.mo7722updatePaymentDetails0E7RQCE(consumerPaymentDetailsUpdateParams, str, continuation);
        }
    }
}
