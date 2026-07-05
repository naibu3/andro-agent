package com.stripe.android.link.account;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.hermes.intl.Constants;
import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.link.ConsumerState;
import com.stripe.android.link.LinkAccountUpdate;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.LinkPaymentDetails;
import com.stripe.android.link.LinkPaymentMethod;
import com.stripe.android.link.NoLinkAccountFoundException;
import com.stripe.android.link.analytics.LinkEventsReporter;
import com.stripe.android.link.model.AccountStatus;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.repositories.LinkRepository;
import com.stripe.android.link.ui.inline.SignUpConsentAction;
import com.stripe.android.link.ui.inline.UserInput;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.ConsumerPaymentDetailsUpdateParams;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.ConsumerSessionSignup;
import com.stripe.android.model.ConsumerShippingAddresses;
import com.stripe.android.model.ConsumerSignUpConsentAction;
import com.stripe.android.model.DisplayablePaymentDetails;
import com.stripe.android.model.EmailSource;
import com.stripe.android.model.LinkAccountSession;
import com.stripe.android.model.LinkMode;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.SharePaymentDetails;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.paymentsheet.model.IntentKt;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: DefaultLinkAccountManager.kt */
@Metadata(d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ2\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010'H\u0096@¢\u0006\u0004\b+\u0010,JJ\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u0006\u0010&\u001a\u00020'2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020'2\u0006\u00101\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010'H\u0096@¢\u0006\u0004\b2\u00103J\u0016\u00104\u001a\b\u0012\u0004\u0012\u0002050$H\u0096@¢\u0006\u0004\b6\u00107J\u001e\u00108\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u00109\u001a\u00020:H\u0096@¢\u0006\u0004\b;\u0010<J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u00020>0$H\u0096@¢\u0006\u0004\b?\u00107JD\u0010@\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010&\u001a\u00020'2\b\u0010A\u001a\u0004\u0018\u00010'2\b\u0010B\u001a\u0004\u0018\u00010'2\b\u0010C\u001a\u0004\u0018\u00010'2\u0006\u0010D\u001a\u00020EH\u0082@¢\u0006\u0004\bF\u0010GJD\u0010H\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010&\u001a\u00020'2\b\u0010A\u001a\u0004\u0018\u00010'2\b\u0010B\u001a\u0004\u0018\u00010'2\b\u0010C\u001a\u0004\u0018\u00010'2\u0006\u0010D\u001a\u00020EH\u0096@¢\u0006\u0004\bI\u0010GJP\u0010J\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010&\u001a\u00020'2\u0006\u0010A\u001a\u00020'2\u0006\u0010B\u001a\u00020'2\b\u0010C\u001a\u0004\u0018\u00010'2\u0006\u00100\u001a\u00020'2\u0006\u00101\u001a\u00020'2\u0006\u0010D\u001a\u00020EH\u0096@¢\u0006\u0004\bK\u0010LJ\u001e\u0010M\u001a\b\u0012\u0004\u0012\u00020N0$2\u0006\u0010O\u001a\u00020PH\u0096@¢\u0006\u0004\bQ\u0010RJ\u001e\u0010S\u001a\b\u0012\u0004\u0012\u00020T0$2\u0006\u0010U\u001a\u00020VH\u0096@¢\u0006\u0004\bW\u0010XJ\u001e\u0010Y\u001a\b\u0012\u0004\u0012\u00020Z0$2\u0006\u0010[\u001a\u00020TH\u0096@¢\u0006\u0004\b\\\u0010]J\u001e\u0010^\u001a\b\u0012\u0004\u0012\u00020_0$2\u0006\u0010`\u001a\u00020'H\u0096@¢\u0006\u0004\ba\u0010bJ:\u0010c\u001a\b\u0012\u0004\u0012\u00020d0$2\u0006\u0010e\u001a\u00020'2\u0006\u0010f\u001a\u00020'2\b\u0010g\u001a\u0004\u0018\u00010'2\b\u0010h\u001a\u0004\u0018\u00010'H\u0096@¢\u0006\u0004\bi\u0010jJ*\u0010k\u001a\u00020%2\u0006\u0010l\u001a\u00020>2\b\u0010m\u001a\u0004\u0018\u00010'2\b\u0010n\u001a\u0004\u0018\u00010oH\u0082@¢\u0006\u0002\u0010pJ \u0010q\u001a\u0004\u0018\u00010%2\u0006\u0010r\u001a\u00020s2\u0006\u0010(\u001a\u00020)H\u0096@¢\u0006\u0002\u0010tJ\u0016\u0010u\u001a\b\u0012\u0004\u0012\u00020%0$H\u0096@¢\u0006\u0004\bv\u00107J\u001e\u0010w\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010x\u001a\u00020'H\u0096@¢\u0006\u0004\by\u0010bJ$\u0010z\u001a\b\u0012\u0004\u0012\u00020{0$2\f\u0010|\u001a\b\u0012\u0004\u0012\u00020'0}H\u0096@¢\u0006\u0004\b~\u0010\u007fJ\u0018\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u00190$H\u0096@¢\u0006\u0005\b\u0081\u0001\u00107J!\u0010\u0082\u0001\u001a\t\u0012\u0005\u0012\u00030\u0083\u00010$2\u0006\u0010e\u001a\u00020'H\u0096@¢\u0006\u0005\b\u0084\u0001\u0010bJ-\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020{0$2\b\u0010\u0086\u0001\u001a\u00030\u0087\u00012\b\u0010A\u001a\u0004\u0018\u00010'H\u0096@¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J#\u0010!\u001a\u00020 2\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010%2\u0007\u0010\u008b\u0001\u001a\u00020)H\u0082@¢\u0006\u0003\u0010\u008c\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001c\u0010\u008d\u0001\u001a\u00030\u008e\u0001*\u00020E8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001¨\u0006\u0091\u0001"}, d2 = {"Lcom/stripe/android/link/account/DefaultLinkAccountManager;", "Lcom/stripe/android/link/account/LinkAccountManager;", "linkAccountHolder", "Lcom/stripe/android/link/account/LinkAccountHolder;", "config", "Lcom/stripe/android/link/LinkConfiguration;", "linkRepository", "Lcom/stripe/android/link/repositories/LinkRepository;", "linkEventsReporter", "Lcom/stripe/android/link/analytics/LinkEventsReporter;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "<init>", "(Lcom/stripe/android/link/account/LinkAccountHolder;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/repositories/LinkRepository;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V", "linkAccountInfo", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/link/LinkAccountUpdate$Value;", "getLinkAccountInfo", "()Lkotlinx/coroutines/flow/StateFlow;", "_consumerState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/link/ConsumerState;", "consumerState", "getConsumerState", "cachedShippingAddresses", "Lcom/stripe/android/model/ConsumerShippingAddresses;", "getCachedShippingAddresses", "()Lcom/stripe/android/model/ConsumerShippingAddresses;", "setCachedShippingAddresses", "(Lcom/stripe/android/model/ConsumerShippingAddresses;)V", "accountStatus", "Lkotlinx/coroutines/flow/Flow;", "Lcom/stripe/android/link/model/AccountStatus;", "getAccountStatus", "()Lkotlinx/coroutines/flow/Flow;", "lookupConsumer", "Lkotlin/Result;", "Lcom/stripe/android/link/model/LinkAccount;", "email", "", "startSession", "", "customerId", "lookupConsumer-BWLJW6A", "(Ljava/lang/String;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mobileLookupConsumer", "emailSource", "Lcom/stripe/android/model/EmailSource;", "verificationToken", "appId", "mobileLookupConsumer-bMdYcbs", "(Ljava/lang/String;Lcom/stripe/android/model/EmailSource;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createLinkAccountSession", "Lcom/stripe/android/model/LinkAccountSession;", "createLinkAccountSession-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signInWithUserInput", "userInput", "Lcom/stripe/android/link/ui/inline/UserInput;", "signInWithUserInput-gIAlu-s", "(Lcom/stripe/android/link/ui/inline/UserInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logOut", "Lcom/stripe/android/model/ConsumerSession;", "logOut-IoAF18A", "signUpIfValidSessionState", "phone", "country", "name", "consentAction", "Lcom/stripe/android/link/ui/inline/SignUpConsentAction;", "signUpIfValidSessionState-hUnOzRk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/SignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "signUp-hUnOzRk", "mobileSignUp", "mobileSignUp-eH_QyT8", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/SignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "linkPaymentMethod", "Lcom/stripe/android/link/LinkPaymentMethod;", "createPaymentMethod-gIAlu-s", "(Lcom/stripe/android/link/LinkPaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCardPaymentDetails", "Lcom/stripe/android/link/LinkPaymentDetails$New;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "createCardPaymentDetails-gIAlu-s", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shareCardPaymentDetails", "Lcom/stripe/android/link/LinkPaymentDetails$Saved;", "cardPaymentDetails", "shareCardPaymentDetails-gIAlu-s", "(Lcom/stripe/android/link/LinkPaymentDetails$New;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createBankAccountPaymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "bankAccountId", "createBankAccountPaymentDetails-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sharePaymentDetails", "Lcom/stripe/android/model/SharePaymentDetails;", "paymentDetailsId", "expectedPaymentMethodType", "billingPhone", "cvc", "sharePaymentDetails-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setAccount", "consumerSession", "publishableKey", "displayablePaymentDetails", "Lcom/stripe/android/model/DisplayablePaymentDetails;", "(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setLinkAccountFromLookupResult", Constants.LOCALEMATCHER_LOOKUP, "Lcom/stripe/android/model/ConsumerSessionLookup;", "(Lcom/stripe/android/model/ConsumerSessionLookup;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startVerification", "startVerification-IoAF18A", "confirmVerification", "code", "confirmVerification-gIAlu-s", "listPaymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails;", "paymentMethodTypes", "", "listPaymentDetails-gIAlu-s", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listShippingAddresses", "listShippingAddresses-IoAF18A", "deletePaymentDetails", "", "deletePaymentDetails-gIAlu-s", "updatePaymentDetails", "updateParams", "Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;", "updatePaymentDetails-0E7RQCE", "(Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "linkAccount", "canLookupCustomerEmail", "(Lcom/stripe/android/link/model/LinkAccount;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumerAction", "Lcom/stripe/android/model/ConsumerSignUpConsentAction;", "getConsumerAction", "(Lcom/stripe/android/link/ui/inline/SignUpConsentAction;)Lcom/stripe/android/model/ConsumerSignUpConsentAction;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultLinkAccountManager implements LinkAccountManager {
    public static final int $stable = 8;
    private final MutableStateFlow<ConsumerState> _consumerState;
    private final Flow<AccountStatus> accountStatus;
    private ConsumerShippingAddresses cachedShippingAddresses;
    private final LinkConfiguration config;
    private final StateFlow<ConsumerState> consumerState;
    private final ErrorReporter errorReporter;
    private final LinkAccountHolder linkAccountHolder;
    private final LinkEventsReporter linkEventsReporter;
    private final LinkRepository linkRepository;

    /* compiled from: DefaultLinkAccountManager.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AccountStatus.values().length];
            try {
                iArr[AccountStatus.Verified.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountStatus.NeedsVerification.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountStatus.VerificationStarted.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountStatus.SignedOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AccountStatus.Error.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SignUpConsentAction.values().length];
            try {
                iArr2[SignUpConsentAction.Checkbox.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SignUpConsentAction.CheckboxWithPrefilledEmail.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[SignUpConsentAction.CheckboxWithPrefilledEmailAndPhone.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[SignUpConsentAction.Implied.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[SignUpConsentAction.ImpliedWithPrefilledEmail.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[SignUpConsentAction.DefaultOptInWithAllPrefilled.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[SignUpConsentAction.DefaultOptInWithSomePrefilled.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[SignUpConsentAction.DefaultOptInWithNonePrefilled.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[SignUpConsentAction.SignUpOptInMobileChecked.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[SignUpConsentAction.SignUpOptInMobilePrechecked.ordinal()] = 10;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: DefaultLinkAccountManager.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.account.DefaultLinkAccountManager", f = "DefaultLinkAccountManager.kt", i = {}, l = {TypedValues.PositionType.TYPE_SIZE_PERCENT}, m = "getAccountStatus", n = {}, s = {})
    /* renamed from: com.stripe.android.link.account.DefaultLinkAccountManager$getAccountStatus$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultLinkAccountManager.this.getAccountStatus(null, false, this);
        }
    }

    /* compiled from: DefaultLinkAccountManager.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.account.DefaultLinkAccountManager", f = "DefaultLinkAccountManager.kt", i = {0}, l = {374}, m = "setAccount", n = {"newAccount"}, s = {"L$0"})
    /* renamed from: com.stripe.android.link.account.DefaultLinkAccountManager$setAccount$1, reason: invalid class name and case insensitive filesystem */
    static final class C10351 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C10351(Continuation<? super C10351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultLinkAccountManager.this.setAccount(null, null, null, this);
        }
    }

    @Inject
    public DefaultLinkAccountManager(LinkAccountHolder linkAccountHolder, LinkConfiguration config, LinkRepository linkRepository, LinkEventsReporter linkEventsReporter, ErrorReporter errorReporter) {
        Intrinsics.checkNotNullParameter(linkAccountHolder, "linkAccountHolder");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(linkRepository, "linkRepository");
        Intrinsics.checkNotNullParameter(linkEventsReporter, "linkEventsReporter");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        this.linkAccountHolder = linkAccountHolder;
        this.config = config;
        this.linkRepository = linkRepository;
        this.linkEventsReporter = linkEventsReporter;
        this.errorReporter = errorReporter;
        MutableStateFlow<ConsumerState> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._consumerState = MutableStateFlow;
        this.consumerState = FlowKt.asStateFlow(MutableStateFlow);
        final StateFlow<LinkAccountUpdate.Value> linkAccountInfo = linkAccountHolder.getLinkAccountInfo();
        this.accountStatus = new Flow<AccountStatus>() { // from class: com.stripe.android.link.account.DefaultLinkAccountManager$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.stripe.android.link.account.DefaultLinkAccountManager$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ DefaultLinkAccountManager this$0;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.stripe.android.link.account.DefaultLinkAccountManager$special$$inlined$map$1$2", f = "DefaultLinkAccountManager.kt", i = {}, l = {56, 50}, m = "emit", n = {}, s = {})
                /* renamed from: com.stripe.android.link.account.DefaultLinkAccountManager$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, DefaultLinkAccountManager defaultLinkAccountManager) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = defaultLinkAccountManager;
                }

                /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
                
                    if (r8.emit(r9, r0) == r1) goto L29;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    FlowCollector flowCollector;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = anonymousClass1.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector2 = this.$this_unsafeFlow;
                        LinkAccountUpdate.Value value = (LinkAccountUpdate.Value) obj;
                        boolean z = (value.getLastUpdateReason() == LinkAccountUpdate.Value.UpdateReason.LoggedOut && this.this$0.config.getAllowUserEmailEdits()) ? false : true;
                        DefaultLinkAccountManager defaultLinkAccountManager = this.this$0;
                        LinkAccount account = value.getAccount();
                        anonymousClass1.L$0 = flowCollector2;
                        anonymousClass1.label = 1;
                        Object accountStatus = defaultLinkAccountManager.getAccountStatus(account, z, anonymousClass1);
                        if (accountStatus != coroutine_suspended) {
                            obj2 = accountStatus;
                            flowCollector = flowCollector2;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                        return Unit.INSTANCE;
                    }
                    FlowCollector flowCollector3 = (FlowCollector) anonymousClass1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    flowCollector = flowCollector3;
                    anonymousClass1.L$0 = null;
                    anonymousClass1.label = 2;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super AccountStatus> flowCollector, Continuation continuation) {
                Object objCollect = linkAccountInfo.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.stripe.android.link.account.LinkAccountManager
    public StateFlow<LinkAccountUpdate.Value> getLinkAccountInfo() {
        return this.linkAccountHolder.getLinkAccountInfo();
    }

    @Override // com.stripe.android.link.account.LinkAccountManager
    public StateFlow<ConsumerState> getConsumerState() {
        return this.consumerState;
    }

    @Override // com.stripe.android.link.account.LinkAccountManager
    public ConsumerShippingAddresses getCachedShippingAddresses() {
        return this.cachedShippingAddresses;
    }

    @Override // com.stripe.android.link.account.LinkAccountManager
    public void setCachedShippingAddresses(ConsumerShippingAddresses consumerShippingAddresses) {
        this.cachedShippingAddresses = consumerShippingAddresses;
    }

    @Override // com.stripe.android.link.account.LinkAccountManager
    public Flow<AccountStatus> getAccountStatus() {
        return this.accountStatus;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.link.account.LinkAccountManager
    /* renamed from: lookupConsumer-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7714lookupConsumerBWLJW6A(String str, boolean z, String str2, Continuation<? super Result<LinkAccount>> continuation) {
        DefaultLinkAccountManager$lookupConsumer$1 defaultLinkAccountManager$lookupConsumer$1;
        Object objMo7757lookupConsumer0E7RQCE;
        DefaultLinkAccountManager defaultLinkAccountManager;
        if (continuation instanceof DefaultLinkAccountManager$lookupConsumer$1) {
            defaultLinkAccountManager$lookupConsumer$1 = (DefaultLinkAccountManager$lookupConsumer$1) continuation;
            if ((defaultLinkAccountManager$lookupConsumer$1.label & Integer.MIN_VALUE) != 0) {
                defaultLinkAccountManager$lookupConsumer$1.label -= Integer.MIN_VALUE;
            } else {
                defaultLinkAccountManager$lookupConsumer$1 = new DefaultLinkAccountManager$lookupConsumer$1(this, continuation);
            }
        }
        Object linkAccountFromLookupResult = defaultLinkAccountManager$lookupConsumer$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = defaultLinkAccountManager$lookupConsumer$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(linkAccountFromLookupResult);
            LinkRepository linkRepository = this.linkRepository;
            defaultLinkAccountManager$lookupConsumer$1.L$0 = this;
            defaultLinkAccountManager$lookupConsumer$1.Z$0 = z;
            defaultLinkAccountManager$lookupConsumer$1.label = 1;
            objMo7757lookupConsumer0E7RQCE = linkRepository.mo7757lookupConsumer0E7RQCE(str, str2, defaultLinkAccountManager$lookupConsumer$1);
            if (objMo7757lookupConsumer0E7RQCE != coroutine_suspended) {
                defaultLinkAccountManager = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(linkAccountFromLookupResult);
            return Result.m9118constructorimpl((LinkAccount) linkAccountFromLookupResult);
        }
        z = defaultLinkAccountManager$lookupConsumer$1.Z$0;
        defaultLinkAccountManager = (DefaultLinkAccountManager) defaultLinkAccountManager$lookupConsumer$1.L$0;
        ResultKt.throwOnFailure(linkAccountFromLookupResult);
        objMo7757lookupConsumer0E7RQCE = ((Result) linkAccountFromLookupResult).getValue();
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo7757lookupConsumer0E7RQCE);
        if (thM9121exceptionOrNullimpl != null) {
            defaultLinkAccountManager.linkEventsReporter.onAccountLookupFailure(thM9121exceptionOrNullimpl);
        }
        if (!Result.m9125isSuccessimpl(objMo7757lookupConsumer0E7RQCE)) {
            return Result.m9118constructorimpl(objMo7757lookupConsumer0E7RQCE);
        }
        Result.Companion companion = Result.INSTANCE;
        defaultLinkAccountManager$lookupConsumer$1.L$0 = null;
        defaultLinkAccountManager$lookupConsumer$1.label = 2;
        linkAccountFromLookupResult = defaultLinkAccountManager.setLinkAccountFromLookupResult((ConsumerSessionLookup) objMo7757lookupConsumer0E7RQCE, z, defaultLinkAccountManager$lookupConsumer$1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        if (r0 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.stripe.android.link.account.LinkAccountManager
    /* renamed from: mobileLookupConsumer-bMdYcbs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7715mobileLookupConsumerbMdYcbs(String str, EmailSource emailSource, String str2, String str3, boolean z, String str4, Continuation<? super Result<LinkAccount>> continuation) {
        DefaultLinkAccountManager$mobileLookupConsumer$1 defaultLinkAccountManager$mobileLookupConsumer$1;
        Object objMo7759mobileLookupConsumerbMdYcbs;
        DefaultLinkAccountManager defaultLinkAccountManager;
        boolean z2;
        if (continuation instanceof DefaultLinkAccountManager$mobileLookupConsumer$1) {
            defaultLinkAccountManager$mobileLookupConsumer$1 = (DefaultLinkAccountManager$mobileLookupConsumer$1) continuation;
            if ((defaultLinkAccountManager$mobileLookupConsumer$1.label & Integer.MIN_VALUE) != 0) {
                defaultLinkAccountManager$mobileLookupConsumer$1.label -= Integer.MIN_VALUE;
            } else {
                defaultLinkAccountManager$mobileLookupConsumer$1 = new DefaultLinkAccountManager$mobileLookupConsumer$1(this, continuation);
            }
        }
        DefaultLinkAccountManager$mobileLookupConsumer$1 defaultLinkAccountManager$mobileLookupConsumer$12 = defaultLinkAccountManager$mobileLookupConsumer$1;
        Object linkAccountFromLookupResult = defaultLinkAccountManager$mobileLookupConsumer$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = defaultLinkAccountManager$mobileLookupConsumer$12.label;
        if (i == 0) {
            ResultKt.throwOnFailure(linkAccountFromLookupResult);
            LinkRepository linkRepository = this.linkRepository;
            String elementsSessionId = this.config.getElementsSessionId();
            defaultLinkAccountManager$mobileLookupConsumer$12.L$0 = this;
            defaultLinkAccountManager$mobileLookupConsumer$12.Z$0 = z;
            defaultLinkAccountManager$mobileLookupConsumer$12.label = 1;
            objMo7759mobileLookupConsumerbMdYcbs = linkRepository.mo7759mobileLookupConsumerbMdYcbs(str, emailSource, str2, str3, elementsSessionId, str4, defaultLinkAccountManager$mobileLookupConsumer$12);
            if (objMo7759mobileLookupConsumerbMdYcbs != coroutine_suspended) {
                defaultLinkAccountManager = this;
                z2 = z;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(linkAccountFromLookupResult);
            return Result.m9118constructorimpl((LinkAccount) linkAccountFromLookupResult);
        }
        z2 = defaultLinkAccountManager$mobileLookupConsumer$12.Z$0;
        defaultLinkAccountManager = (DefaultLinkAccountManager) defaultLinkAccountManager$mobileLookupConsumer$12.L$0;
        ResultKt.throwOnFailure(linkAccountFromLookupResult);
        objMo7759mobileLookupConsumerbMdYcbs = ((Result) linkAccountFromLookupResult).getValue();
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo7759mobileLookupConsumerbMdYcbs);
        if (thM9121exceptionOrNullimpl != null) {
            defaultLinkAccountManager.linkEventsReporter.onAccountLookupFailure(thM9121exceptionOrNullimpl);
        }
        if (!Result.m9125isSuccessimpl(objMo7759mobileLookupConsumerbMdYcbs)) {
            return Result.m9118constructorimpl(objMo7759mobileLookupConsumerbMdYcbs);
        }
        Result.Companion companion = Result.INSTANCE;
        defaultLinkAccountManager$mobileLookupConsumer$12.L$0 = null;
        defaultLinkAccountManager$mobileLookupConsumer$12.label = 2;
        linkAccountFromLookupResult = defaultLinkAccountManager.setLinkAccountFromLookupResult((ConsumerSessionLookup) objMo7759mobileLookupConsumerbMdYcbs, z2, defaultLinkAccountManager$mobileLookupConsumer$12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.link.account.LinkAccountManager
    /* renamed from: createLinkAccountSession-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7708createLinkAccountSessionIoAF18A(Continuation<? super Result<LinkAccountSession>> continuation) {
        DefaultLinkAccountManager$createLinkAccountSession$1 defaultLinkAccountManager$createLinkAccountSession$1;
        Object objMo7751createLinkAccountSessionyxL6bBk;
        if (continuation instanceof DefaultLinkAccountManager$createLinkAccountSession$1) {
            defaultLinkAccountManager$createLinkAccountSession$1 = (DefaultLinkAccountManager$createLinkAccountSession$1) continuation;
            if ((defaultLinkAccountManager$createLinkAccountSession$1.label & Integer.MIN_VALUE) != 0) {
                defaultLinkAccountManager$createLinkAccountSession$1.label -= Integer.MIN_VALUE;
            } else {
                defaultLinkAccountManager$createLinkAccountSession$1 = new DefaultLinkAccountManager$createLinkAccountSession$1(this, continuation);
            }
        }
        DefaultLinkAccountManager$createLinkAccountSession$1 defaultLinkAccountManager$createLinkAccountSession$12 = defaultLinkAccountManager$createLinkAccountSession$1;
        Object obj = defaultLinkAccountManager$createLinkAccountSession$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = defaultLinkAccountManager$createLinkAccountSession$12.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Result.Companion companion = Result.INSTANCE;
                DefaultLinkAccountManager defaultLinkAccountManager = this;
                LinkAccount account = this.linkAccountHolder.getLinkAccountInfo().getValue().getAccount();
                if (account == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                LinkRepository linkRepository = this.linkRepository;
                String clientSecret = account.getClientSecret();
                StripeIntent stripeIntent = this.config.getStripeIntent();
                LinkMode linkMode = this.config.getLinkMode();
                String consumerPublishableKey = account.getConsumerPublishableKey();
                defaultLinkAccountManager$createLinkAccountSession$12.label = 1;
                objMo7751createLinkAccountSessionyxL6bBk = linkRepository.mo7751createLinkAccountSessionyxL6bBk(clientSecret, stripeIntent, linkMode, consumerPublishableKey, defaultLinkAccountManager$createLinkAccountSession$12);
                if (objMo7751createLinkAccountSessionyxL6bBk == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo7751createLinkAccountSessionyxL6bBk = ((Result) obj).getValue();
            }
            ResultKt.throwOnFailure(objMo7751createLinkAccountSessionyxL6bBk);
            return Result.m9118constructorimpl((LinkAccountSession) objMo7751createLinkAccountSessionyxL6bBk);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (r9 == r0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.link.account.LinkAccountManager
    /* renamed from: signInWithUserInput-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7719signInWithUserInputgIAlus(UserInput userInput, Continuation<? super Result<LinkAccount>> continuation) {
        DefaultLinkAccountManager$signInWithUserInput$1 defaultLinkAccountManager$signInWithUserInput$1;
        Object objMo7714lookupConsumerBWLJW6A;
        if (continuation instanceof DefaultLinkAccountManager$signInWithUserInput$1) {
            defaultLinkAccountManager$signInWithUserInput$1 = (DefaultLinkAccountManager$signInWithUserInput$1) continuation;
            if ((defaultLinkAccountManager$signInWithUserInput$1.label & Integer.MIN_VALUE) != 0) {
                defaultLinkAccountManager$signInWithUserInput$1.label -= Integer.MIN_VALUE;
            } else {
                defaultLinkAccountManager$signInWithUserInput$1 = new DefaultLinkAccountManager$signInWithUserInput$1(this, continuation);
            }
        }
        DefaultLinkAccountManager$signInWithUserInput$1 defaultLinkAccountManager$signInWithUserInput$12 = defaultLinkAccountManager$signInWithUserInput$1;
        Object obj = defaultLinkAccountManager$signInWithUserInput$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = defaultLinkAccountManager$signInWithUserInput$12.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (userInput instanceof UserInput.SignIn) {
                String email = ((UserInput.SignIn) userInput).getEmail();
                String customerIdForEceDefaultValues = this.config.getCustomerIdForEceDefaultValues();
                defaultLinkAccountManager$signInWithUserInput$12.label = 1;
                objMo7714lookupConsumerBWLJW6A = mo7714lookupConsumerBWLJW6A(email, true, customerIdForEceDefaultValues, defaultLinkAccountManager$signInWithUserInput$12);
            } else {
                if (!(userInput instanceof UserInput.SignUp)) {
                    throw new NoWhenBranchMatchedException();
                }
                UserInput.SignUp signUp = (UserInput.SignUp) userInput;
                String email2 = signUp.getEmail();
                String country = signUp.getCountry();
                String phone = signUp.getPhone();
                String name = signUp.getName();
                SignUpConsentAction consentAction = signUp.getConsentAction();
                defaultLinkAccountManager$signInWithUserInput$12.label = 2;
                Object objM7704signUpIfValidSessionStatehUnOzRk = m7704signUpIfValidSessionStatehUnOzRk(email2, phone, country, name, consentAction, defaultLinkAccountManager$signInWithUserInput$12);
                if (objM7704signUpIfValidSessionStatehUnOzRk != coroutine_suspended) {
                    return objM7704signUpIfValidSessionStatehUnOzRk;
                }
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        objMo7714lookupConsumerBWLJW6A = ((Result) obj).getValue();
        if (!Result.m9125isSuccessimpl(objMo7714lookupConsumerBWLJW6A)) {
            return Result.m9118constructorimpl(objMo7714lookupConsumerBWLJW6A);
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            LinkAccount linkAccount = (LinkAccount) objMo7714lookupConsumerBWLJW6A;
            if (linkAccount != null) {
                return Result.m9118constructorimpl(linkAccount);
            }
            throw new IllegalArgumentException("Error fetching user account".toString());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9 A[Catch: all -> 0x010e, TryCatch #3 {all -> 0x010e, blocks: (B:38:0x00b2, B:40:0x00b9, B:41:0x00d5, B:43:0x00db, B:44:0x0104, B:37:0x00a8, B:28:0x007d), top: B:55:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00db A[Catch: all -> 0x010e, TryCatch #3 {all -> 0x010e, blocks: (B:38:0x00b2, B:40:0x00b9, B:41:0x00d5, B:43:0x00db, B:44:0x0104, B:37:0x00a8, B:28:0x007d), top: B:55:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.stripe.android.link.account.LinkAccountManager
    /* renamed from: logOut-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7713logOutIoAF18A(Continuation<? super Result<ConsumerSession>> continuation) {
        DefaultLinkAccountManager$logOut$1 defaultLinkAccountManager$logOut$1;
        Object objM9118constructorimpl;
        DefaultLinkAccountManager defaultLinkAccountManager;
        Object objMo7756logOut0E7RQCE;
        LinkAccount account;
        Object objM9118constructorimpl2;
        Throwable thM9121exceptionOrNullimpl;
        if (continuation instanceof DefaultLinkAccountManager$logOut$1) {
            defaultLinkAccountManager$logOut$1 = (DefaultLinkAccountManager$logOut$1) continuation;
            if ((defaultLinkAccountManager$logOut$1.label & Integer.MIN_VALUE) != 0) {
                defaultLinkAccountManager$logOut$1.label -= Integer.MIN_VALUE;
            } else {
                defaultLinkAccountManager$logOut$1 = new DefaultLinkAccountManager$logOut$1(this, continuation);
            }
        }
        DefaultLinkAccountManager$logOut$1 defaultLinkAccountManager$logOut$12 = defaultLinkAccountManager$logOut$1;
        Object obj = defaultLinkAccountManager$logOut$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = defaultLinkAccountManager$logOut$12.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                Result.Companion companion = Result.INSTANCE;
                DefaultLinkAccountManager defaultLinkAccountManager2 = this;
                account = this.linkAccountHolder.getLinkAccountInfo().getValue().getAccount();
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            if (account != null) {
                objM9118constructorimpl = Result.m9118constructorimpl(account);
                if (!Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                    return Result.m9118constructorimpl(objM9118constructorimpl);
                }
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    LinkAccount linkAccount = (LinkAccount) objM9118constructorimpl;
                    try {
                        Result.Companion companion4 = Result.INSTANCE;
                        DefaultLinkAccountManager defaultLinkAccountManager3 = this;
                        LinkRepository linkRepository = this.linkRepository;
                        String clientSecret = linkAccount.getClientSecret();
                        String consumerPublishableKey = linkAccount.getConsumerPublishableKey();
                        defaultLinkAccountManager$logOut$12.L$0 = this;
                        defaultLinkAccountManager$logOut$12.label = 1;
                        objMo7756logOut0E7RQCE = linkRepository.mo7756logOut0E7RQCE(clientSecret, consumerPublishableKey, defaultLinkAccountManager$logOut$12);
                        if (objMo7756logOut0E7RQCE == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultLinkAccountManager = this;
                    } catch (Throwable th2) {
                        th = th2;
                        defaultLinkAccountManager = this;
                        Result.Companion companion5 = Result.INSTANCE;
                        objM9118constructorimpl2 = Result.m9118constructorimpl(ResultKt.createFailure(th));
                        if (Result.m9125isSuccessimpl(objM9118constructorimpl2)) {
                        }
                        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl2);
                        if (thM9121exceptionOrNullimpl != null) {
                        }
                        ResultKt.throwOnFailure(objM9118constructorimpl2);
                        return Result.m9118constructorimpl((ConsumerSession) objM9118constructorimpl2);
                    }
                } catch (Throwable th3) {
                    Result.Companion companion6 = Result.INSTANCE;
                    return Result.m9118constructorimpl(ResultKt.createFailure(th3));
                }
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defaultLinkAccountManager = (DefaultLinkAccountManager) defaultLinkAccountManager$logOut$12.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                objMo7756logOut0E7RQCE = ((Result) obj).getValue();
            } catch (Throwable th4) {
                th = th4;
                Result.Companion companion52 = Result.INSTANCE;
                objM9118constructorimpl2 = Result.m9118constructorimpl(ResultKt.createFailure(th));
                if (Result.m9125isSuccessimpl(objM9118constructorimpl2)) {
                }
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl2);
                if (thM9121exceptionOrNullimpl != null) {
                }
                ResultKt.throwOnFailure(objM9118constructorimpl2);
                return Result.m9118constructorimpl((ConsumerSession) objM9118constructorimpl2);
            }
        }
        ResultKt.throwOnFailure(objMo7756logOut0E7RQCE);
        objM9118constructorimpl2 = Result.m9118constructorimpl((ConsumerSession) objMo7756logOut0E7RQCE);
        if (Result.m9125isSuccessimpl(objM9118constructorimpl2)) {
            ErrorReporter.DefaultImpls.report$default(defaultLinkAccountManager.errorReporter, ErrorReporter.SuccessEvent.LINK_LOG_OUT_SUCCESS, null, null, 6, null);
            Logger.INSTANCE.getInstance(false).debug("Logged out of Link successfully");
        }
        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl2);
        if (thM9121exceptionOrNullimpl != null) {
            ErrorReporter.DefaultImpls.report$default(defaultLinkAccountManager.errorReporter, ErrorReporter.ExpectedErrorEvent.LINK_LOG_OUT_FAILURE, StripeException.INSTANCE.create(thM9121exceptionOrNullimpl), null, 4, null);
            Logger.INSTANCE.getInstance(false).warning("Failed to log out of Link: " + thM9121exceptionOrNullimpl);
        }
        ResultKt.throwOnFailure(objM9118constructorimpl2);
        return Result.m9118constructorimpl((ConsumerSession) objM9118constructorimpl2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: signUpIfValidSessionState-hUnOzRk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7704signUpIfValidSessionStatehUnOzRk(String str, String str2, String str3, String str4, SignUpConsentAction signUpConsentAction, Continuation<? super Result<LinkAccount>> continuation) {
        DefaultLinkAccountManager$signUpIfValidSessionState$1 defaultLinkAccountManager$signUpIfValidSessionState$1;
        String email;
        String str5;
        int i;
        String str6;
        String str7;
        DefaultLinkAccountManager defaultLinkAccountManager;
        Object objMo7720signUphUnOzRk;
        DefaultLinkAccountManager defaultLinkAccountManager2;
        Throwable thM9121exceptionOrNullimpl;
        if (continuation instanceof DefaultLinkAccountManager$signUpIfValidSessionState$1) {
            defaultLinkAccountManager$signUpIfValidSessionState$1 = (DefaultLinkAccountManager$signUpIfValidSessionState$1) continuation;
            if ((defaultLinkAccountManager$signUpIfValidSessionState$1.label & Integer.MIN_VALUE) != 0) {
                defaultLinkAccountManager$signUpIfValidSessionState$1.label -= Integer.MIN_VALUE;
            } else {
                defaultLinkAccountManager$signUpIfValidSessionState$1 = new DefaultLinkAccountManager$signUpIfValidSessionState$1(this, continuation);
            }
        }
        DefaultLinkAccountManager$signUpIfValidSessionState$1 defaultLinkAccountManager$signUpIfValidSessionState$12 = defaultLinkAccountManager$signUpIfValidSessionState$1;
        Object accountStatus = defaultLinkAccountManager$signUpIfValidSessionState$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = defaultLinkAccountManager$signUpIfValidSessionState$12.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(accountStatus);
            LinkAccount account = this.linkAccountHolder.getLinkAccountInfo().getValue().getAccount();
            if (account == null || (email = account.getEmail()) == null) {
                email = this.config.getCustomerInfo().getEmail();
            }
            defaultLinkAccountManager$signUpIfValidSessionState$12.L$0 = this;
            defaultLinkAccountManager$signUpIfValidSessionState$12.L$1 = str;
            defaultLinkAccountManager$signUpIfValidSessionState$12.L$2 = str2;
            defaultLinkAccountManager$signUpIfValidSessionState$12.L$3 = str3;
            defaultLinkAccountManager$signUpIfValidSessionState$12.L$4 = str4;
            defaultLinkAccountManager$signUpIfValidSessionState$12.L$5 = signUpConsentAction;
            defaultLinkAccountManager$signUpIfValidSessionState$12.L$6 = email;
            defaultLinkAccountManager$signUpIfValidSessionState$12.label = 1;
            accountStatus = getAccountStatus(account, true, defaultLinkAccountManager$signUpIfValidSessionState$12);
            if (accountStatus != coroutine_suspended) {
                str5 = str2;
                i = 2;
                str6 = str;
                str7 = email;
                defaultLinkAccountManager = this;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defaultLinkAccountManager2 = (DefaultLinkAccountManager) defaultLinkAccountManager$signUpIfValidSessionState$12.L$0;
            ResultKt.throwOnFailure(accountStatus);
            objMo7720signUphUnOzRk = ((Result) accountStatus).getValue();
            if (Result.m9125isSuccessimpl(objMo7720signUphUnOzRk)) {
                defaultLinkAccountManager2.linkEventsReporter.onSignupCompleted(true);
            }
            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo7720signUphUnOzRk);
            if (thM9121exceptionOrNullimpl != null) {
                defaultLinkAccountManager2.linkEventsReporter.onSignupFailure(true, thM9121exceptionOrNullimpl);
            }
            return objMo7720signUphUnOzRk;
        }
        str7 = (String) defaultLinkAccountManager$signUpIfValidSessionState$12.L$6;
        signUpConsentAction = (SignUpConsentAction) defaultLinkAccountManager$signUpIfValidSessionState$12.L$5;
        str4 = (String) defaultLinkAccountManager$signUpIfValidSessionState$12.L$4;
        str3 = (String) defaultLinkAccountManager$signUpIfValidSessionState$12.L$3;
        String str8 = (String) defaultLinkAccountManager$signUpIfValidSessionState$12.L$2;
        String str9 = (String) defaultLinkAccountManager$signUpIfValidSessionState$12.L$1;
        DefaultLinkAccountManager defaultLinkAccountManager3 = (DefaultLinkAccountManager) defaultLinkAccountManager$signUpIfValidSessionState$12.L$0;
        ResultKt.throwOnFailure(accountStatus);
        str5 = str8;
        i = 2;
        str6 = str9;
        defaultLinkAccountManager = defaultLinkAccountManager3;
        String str10 = str3;
        String str11 = str4;
        SignUpConsentAction signUpConsentAction2 = signUpConsentAction;
        AccountStatus accountStatus2 = (AccountStatus) accountStatus;
        int i3 = WhenMappings.$EnumSwitchMapping$0[accountStatus2.ordinal()];
        if (i3 == 1) {
            defaultLinkAccountManager.linkEventsReporter.onInvalidSessionState(LinkEventsReporter.SessionState.Verified);
            Result.Companion companion = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(new AlreadyLoggedInLinkException(str7, accountStatus2)));
        }
        if (i3 == i || i3 == 3) {
            defaultLinkAccountManager.linkEventsReporter.onInvalidSessionState(LinkEventsReporter.SessionState.RequiresVerification);
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(new AlreadyLoggedInLinkException(str7, accountStatus2)));
        }
        if (i3 != 4 && i3 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        defaultLinkAccountManager$signUpIfValidSessionState$12.L$0 = defaultLinkAccountManager;
        defaultLinkAccountManager$signUpIfValidSessionState$12.L$1 = null;
        defaultLinkAccountManager$signUpIfValidSessionState$12.L$2 = null;
        defaultLinkAccountManager$signUpIfValidSessionState$12.L$3 = null;
        defaultLinkAccountManager$signUpIfValidSessionState$12.L$4 = null;
        defaultLinkAccountManager$signUpIfValidSessionState$12.L$5 = null;
        defaultLinkAccountManager$signUpIfValidSessionState$12.L$6 = null;
        defaultLinkAccountManager$signUpIfValidSessionState$12.label = i;
        objMo7720signUphUnOzRk = defaultLinkAccountManager.mo7720signUphUnOzRk(str6, str5, str10, str11, signUpConsentAction2, defaultLinkAccountManager$signUpIfValidSessionState$12);
        if (objMo7720signUphUnOzRk != coroutine_suspended) {
            defaultLinkAccountManager2 = defaultLinkAccountManager;
            if (Result.m9125isSuccessimpl(objMo7720signUphUnOzRk)) {
            }
            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo7720signUphUnOzRk);
            if (thM9121exceptionOrNullimpl != null) {
            }
            return objMo7720signUphUnOzRk;
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r15 == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.link.account.LinkAccountManager
    /* renamed from: signUp-hUnOzRk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7720signUphUnOzRk(String str, String str2, String str3, String str4, SignUpConsentAction signUpConsentAction, Continuation<? super Result<LinkAccount>> continuation) {
        DefaultLinkAccountManager$signUp$1 defaultLinkAccountManager$signUp$1;
        Object objMo7748consumerSignUphUnOzRk;
        DefaultLinkAccountManager defaultLinkAccountManager;
        if (continuation instanceof DefaultLinkAccountManager$signUp$1) {
            defaultLinkAccountManager$signUp$1 = (DefaultLinkAccountManager$signUp$1) continuation;
            if ((defaultLinkAccountManager$signUp$1.label & Integer.MIN_VALUE) != 0) {
                defaultLinkAccountManager$signUp$1.label -= Integer.MIN_VALUE;
            } else {
                defaultLinkAccountManager$signUp$1 = new DefaultLinkAccountManager$signUp$1(this, continuation);
            }
        }
        DefaultLinkAccountManager$signUp$1 defaultLinkAccountManager$signUp$12 = defaultLinkAccountManager$signUp$1;
        Object account = defaultLinkAccountManager$signUp$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = defaultLinkAccountManager$signUp$12.label;
        if (i == 0) {
            ResultKt.throwOnFailure(account);
            LinkRepository linkRepository = this.linkRepository;
            ConsumerSignUpConsentAction consumerAction = getConsumerAction(signUpConsentAction);
            defaultLinkAccountManager$signUp$12.L$0 = this;
            defaultLinkAccountManager$signUp$12.label = 1;
            objMo7748consumerSignUphUnOzRk = linkRepository.mo7748consumerSignUphUnOzRk(str, str2, str3, str4, consumerAction, defaultLinkAccountManager$signUp$12);
            if (objMo7748consumerSignUphUnOzRk != coroutine_suspended) {
                defaultLinkAccountManager = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(account);
            return Result.m9118constructorimpl((LinkAccount) account);
        }
        defaultLinkAccountManager = (DefaultLinkAccountManager) defaultLinkAccountManager$signUp$12.L$0;
        ResultKt.throwOnFailure(account);
        objMo7748consumerSignUphUnOzRk = ((Result) account).getValue();
        if (!Result.m9125isSuccessimpl(objMo7748consumerSignUphUnOzRk)) {
            return Result.m9118constructorimpl(objMo7748consumerSignUphUnOzRk);
        }
        Result.Companion companion = Result.INSTANCE;
        ConsumerSessionSignup consumerSessionSignup = (ConsumerSessionSignup) objMo7748consumerSignUphUnOzRk;
        ConsumerSession consumerSession = consumerSessionSignup.getConsumerSession();
        String publishableKey = consumerSessionSignup.getPublishableKey();
        defaultLinkAccountManager$signUp$12.L$0 = null;
        defaultLinkAccountManager$signUp$12.label = 2;
        account = defaultLinkAccountManager.setAccount(consumerSession, publishableKey, null, defaultLinkAccountManager$signUp$12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
    
        if (r1 == r2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @Override // com.stripe.android.link.account.LinkAccountManager
    /* renamed from: mobileSignUp-eH_QyT8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7716mobileSignUpeH_QyT8(String str, String str2, String str3, String str4, String str5, String str6, SignUpConsentAction signUpConsentAction, Continuation<? super Result<LinkAccount>> continuation) {
        DefaultLinkAccountManager$mobileSignUp$1 defaultLinkAccountManager$mobileSignUp$1;
        Object objMo7760mobileSignUp5p_uFSQ;
        DefaultLinkAccountManager defaultLinkAccountManager;
        if (continuation instanceof DefaultLinkAccountManager$mobileSignUp$1) {
            defaultLinkAccountManager$mobileSignUp$1 = (DefaultLinkAccountManager$mobileSignUp$1) continuation;
            if ((defaultLinkAccountManager$mobileSignUp$1.label & Integer.MIN_VALUE) != 0) {
                defaultLinkAccountManager$mobileSignUp$1.label -= Integer.MIN_VALUE;
            } else {
                defaultLinkAccountManager$mobileSignUp$1 = new DefaultLinkAccountManager$mobileSignUp$1(this, continuation);
            }
        }
        DefaultLinkAccountManager$mobileSignUp$1 defaultLinkAccountManager$mobileSignUp$12 = defaultLinkAccountManager$mobileSignUp$1;
        Object account = defaultLinkAccountManager$mobileSignUp$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = defaultLinkAccountManager$mobileSignUp$12.label;
        if (i == 0) {
            ResultKt.throwOnFailure(account);
            LinkRepository linkRepository = this.linkRepository;
            ConsumerSignUpConsentAction consumerAction = getConsumerAction(signUpConsentAction);
            Long amount = IntentKt.getAmount(this.config.getStripeIntent());
            String currency = IntentKt.getCurrency(this.config.getStripeIntent());
            defaultLinkAccountManager$mobileSignUp$12.L$0 = this;
            defaultLinkAccountManager$mobileSignUp$12.label = 1;
            objMo7760mobileSignUp5p_uFSQ = linkRepository.mo7760mobileSignUp5p_uFSQ(str4, str, str2, str3, consumerAction, amount, currency, null, str5, str6, defaultLinkAccountManager$mobileSignUp$12);
            if (objMo7760mobileSignUp5p_uFSQ != coroutine_suspended) {
                defaultLinkAccountManager = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(account);
            return Result.m9118constructorimpl((LinkAccount) account);
        }
        defaultLinkAccountManager = (DefaultLinkAccountManager) defaultLinkAccountManager$mobileSignUp$12.L$0;
        ResultKt.throwOnFailure(account);
        objMo7760mobileSignUp5p_uFSQ = ((Result) account).getValue();
        if (!Result.m9125isSuccessimpl(objMo7760mobileSignUp5p_uFSQ)) {
            return Result.m9118constructorimpl(objMo7760mobileSignUp5p_uFSQ);
        }
        Result.Companion companion = Result.INSTANCE;
        ConsumerSessionSignup consumerSessionSignup = (ConsumerSessionSignup) objMo7760mobileSignUp5p_uFSQ;
        ConsumerSession consumerSession = consumerSessionSignup.getConsumerSession();
        String publishableKey = consumerSessionSignup.getPublishableKey();
        defaultLinkAccountManager$mobileSignUp$12.L$0 = null;
        defaultLinkAccountManager$mobileSignUp$12.label = 2;
        account = defaultLinkAccountManager.setAccount(consumerSession, publishableKey, null, defaultLinkAccountManager$mobileSignUp$12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.link.account.LinkAccountManager
    /* renamed from: createPaymentMethod-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7709createPaymentMethodgIAlus(LinkPaymentMethod linkPaymentMethod, Continuation<? super Result<PaymentMethod>> continuation) {
        DefaultLinkAccountManager$createPaymentMethod$1 defaultLinkAccountManager$createPaymentMethod$1;
        Object objM9118constructorimpl;
        Object objMo7752createPaymentMethod0E7RQCE;
        LinkAccount account;
        if (continuation instanceof DefaultLinkAccountManager$createPaymentMethod$1) {
            defaultLinkAccountManager$createPaymentMethod$1 = (DefaultLinkAccountManager$createPaymentMethod$1) continuation;
            if ((defaultLinkAccountManager$createPaymentMethod$1.label & Integer.MIN_VALUE) != 0) {
                defaultLinkAccountManager$createPaymentMethod$1.label -= Integer.MIN_VALUE;
            } else {
                defaultLinkAccountManager$createPaymentMethod$1 = new DefaultLinkAccountManager$createPaymentMethod$1(this, continuation);
            }
        }
        Object obj = defaultLinkAccountManager$createPaymentMethod$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = defaultLinkAccountManager$createPaymentMethod$1.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    Result.Companion companion = Result.INSTANCE;
                    DefaultLinkAccountManager defaultLinkAccountManager = this;
                    account = this.linkAccountHolder.getLinkAccountInfo().getValue().getAccount();
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                }
                if (account != null) {
                    objM9118constructorimpl = Result.m9118constructorimpl(account);
                    if (!Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                        return Result.m9118constructorimpl(objM9118constructorimpl);
                    }
                    Result.Companion companion3 = Result.INSTANCE;
                    LinkRepository linkRepository = this.linkRepository;
                    String clientSecret = ((LinkAccount) objM9118constructorimpl).getClientSecret();
                    defaultLinkAccountManager$createPaymentMethod$1.label = 1;
                    objMo7752createPaymentMethod0E7RQCE = linkRepository.mo7752createPaymentMethod0E7RQCE(clientSecret, linkPaymentMethod, defaultLinkAccountManager$createPaymentMethod$1);
                    if (objMo7752createPaymentMethod0E7RQCE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo7752createPaymentMethod0E7RQCE = ((Result) obj).getValue();
            }
            ResultKt.throwOnFailure(objMo7752createPaymentMethod0E7RQCE);
            return Result.m9118constructorimpl((PaymentMethod) objMo7752createPaymentMethod0E7RQCE);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.link.account.LinkAccountManager
    /* renamed from: createCardPaymentDetails-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7707createCardPaymentDetailsgIAlus(PaymentMethodCreateParams paymentMethodCreateParams, Continuation<? super Result<LinkPaymentDetails.New>> continuation) {
        DefaultLinkAccountManager$createCardPaymentDetails$1 defaultLinkAccountManager$createCardPaymentDetails$1;
        Object objMo7750createCardPaymentDetailshUnOzRk;
        DefaultLinkAccountManager defaultLinkAccountManager;
        if (continuation instanceof DefaultLinkAccountManager$createCardPaymentDetails$1) {
            defaultLinkAccountManager$createCardPaymentDetails$1 = (DefaultLinkAccountManager$createCardPaymentDetails$1) continuation;
            if ((defaultLinkAccountManager$createCardPaymentDetails$1.label & Integer.MIN_VALUE) != 0) {
                defaultLinkAccountManager$createCardPaymentDetails$1.label -= Integer.MIN_VALUE;
            } else {
                defaultLinkAccountManager$createCardPaymentDetails$1 = new DefaultLinkAccountManager$createCardPaymentDetails$1(this, continuation);
            }
        }
        DefaultLinkAccountManager$createCardPaymentDetails$1 defaultLinkAccountManager$createCardPaymentDetails$12 = defaultLinkAccountManager$createCardPaymentDetails$1;
        Object obj = defaultLinkAccountManager$createCardPaymentDetails$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = defaultLinkAccountManager$createCardPaymentDetails$12.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LinkAccount account = this.linkAccountHolder.getLinkAccountInfo().getValue().getAccount();
            if (account != null) {
                LinkRepository linkRepository = this.linkRepository;
                String email = account.getEmail();
                StripeIntent stripeIntent = this.config.getStripeIntent();
                String clientSecret = account.getClientSecret();
                String consumerPublishableKey = account.getConsumerPublishableKey();
                if (this.config.getPassthroughModeEnabled()) {
                    consumerPublishableKey = null;
                }
                defaultLinkAccountManager$createCardPaymentDetails$12.L$0 = this;
                defaultLinkAccountManager$createCardPaymentDetails$12.label = 1;
                objMo7750createCardPaymentDetailshUnOzRk = linkRepository.mo7750createCardPaymentDetailshUnOzRk(paymentMethodCreateParams, email, stripeIntent, clientSecret, consumerPublishableKey, defaultLinkAccountManager$createCardPaymentDetails$12);
                if (objMo7750createCardPaymentDetailshUnOzRk == coroutine_suspended) {
                    return coroutine_suspended;
                }
                defaultLinkAccountManager = this;
            } else {
                ErrorReporter.DefaultImpls.report$default(this.errorReporter, ErrorReporter.UnexpectedErrorEvent.LINK_ATTACH_CARD_WITH_NULL_ACCOUNT, null, null, 6, null);
                Result.Companion companion = Result.INSTANCE;
                return Result.m9118constructorimpl(ResultKt.createFailure(new IllegalStateException("A non-null Link account is needed to create payment details")));
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defaultLinkAccountManager = (DefaultLinkAccountManager) defaultLinkAccountManager$createCardPaymentDetails$12.L$0;
            ResultKt.throwOnFailure(obj);
            objMo7750createCardPaymentDetailshUnOzRk = ((Result) obj).getValue();
        }
        if (Result.m9125isSuccessimpl(objMo7750createCardPaymentDetailshUnOzRk)) {
            ErrorReporter.DefaultImpls.report$default(defaultLinkAccountManager.errorReporter, ErrorReporter.SuccessEvent.LINK_CREATE_CARD_SUCCESS, null, null, 6, null);
        }
        return objMo7750createCardPaymentDetailshUnOzRk;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.link.account.LinkAccountManager
    /* renamed from: shareCardPaymentDetails-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7717shareCardPaymentDetailsgIAlus(LinkPaymentDetails.New r6, Continuation<? super Result<LinkPaymentDetails.Saved>> continuation) {
        DefaultLinkAccountManager$shareCardPaymentDetails$1 defaultLinkAccountManager$shareCardPaymentDetails$1;
        Object objM9118constructorimpl;
        Object objMo7761shareCardPaymentDetailsBWLJW6A;
        LinkAccount account;
        if (continuation instanceof DefaultLinkAccountManager$shareCardPaymentDetails$1) {
            defaultLinkAccountManager$shareCardPaymentDetails$1 = (DefaultLinkAccountManager$shareCardPaymentDetails$1) continuation;
            if ((defaultLinkAccountManager$shareCardPaymentDetails$1.label & Integer.MIN_VALUE) != 0) {
                defaultLinkAccountManager$shareCardPaymentDetails$1.label -= Integer.MIN_VALUE;
            } else {
                defaultLinkAccountManager$shareCardPaymentDetails$1 = new DefaultLinkAccountManager$shareCardPaymentDetails$1(this, continuation);
            }
        }
        Object obj = defaultLinkAccountManager$shareCardPaymentDetails$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = defaultLinkAccountManager$shareCardPaymentDetails$1.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    Result.Companion companion = Result.INSTANCE;
                    DefaultLinkAccountManager defaultLinkAccountManager = this;
                    account = this.linkAccountHolder.getLinkAccountInfo().getValue().getAccount();
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                }
                if (account != null) {
                    objM9118constructorimpl = Result.m9118constructorimpl(account);
                    if (!Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                        return Result.m9118constructorimpl(objM9118constructorimpl);
                    }
                    Result.Companion companion3 = Result.INSTANCE;
                    ConsumerPaymentDetails.PaymentDetails paymentDetails = r6.getPaymentDetails();
                    PaymentMethodCreateParams originalParams = r6.getOriginalParams();
                    LinkRepository linkRepository = this.linkRepository;
                    String id = paymentDetails.getId();
                    String clientSecret = ((LinkAccount) objM9118constructorimpl).getClientSecret();
                    defaultLinkAccountManager$shareCardPaymentDetails$1.label = 1;
                    objMo7761shareCardPaymentDetailsBWLJW6A = linkRepository.mo7761shareCardPaymentDetailsBWLJW6A(originalParams, id, clientSecret, defaultLinkAccountManager$shareCardPaymentDetails$1);
                    if (objMo7761shareCardPaymentDetailsBWLJW6A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo7761shareCardPaymentDetailsBWLJW6A = ((Result) obj).getValue();
            }
            ResultKt.throwOnFailure(objMo7761shareCardPaymentDetailsBWLJW6A);
            return Result.m9118constructorimpl((LinkPaymentDetails.Saved) objMo7761shareCardPaymentDetailsBWLJW6A);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.link.account.LinkAccountManager
    /* renamed from: createBankAccountPaymentDetails-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7706createBankAccountPaymentDetailsgIAlus(String str, Continuation<? super Result<? extends ConsumerPaymentDetails.PaymentDetails>> continuation) {
        DefaultLinkAccountManager$createBankAccountPaymentDetails$1 defaultLinkAccountManager$createBankAccountPaymentDetails$1;
        if (continuation instanceof DefaultLinkAccountManager$createBankAccountPaymentDetails$1) {
            defaultLinkAccountManager$createBankAccountPaymentDetails$1 = (DefaultLinkAccountManager$createBankAccountPaymentDetails$1) continuation;
            if ((defaultLinkAccountManager$createBankAccountPaymentDetails$1.label & Integer.MIN_VALUE) != 0) {
                defaultLinkAccountManager$createBankAccountPaymentDetails$1.label -= Integer.MIN_VALUE;
            } else {
                defaultLinkAccountManager$createBankAccountPaymentDetails$1 = new DefaultLinkAccountManager$createBankAccountPaymentDetails$1(this, continuation);
            }
        }
        Object obj = defaultLinkAccountManager$createBankAccountPaymentDetails$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = defaultLinkAccountManager$createBankAccountPaymentDetails$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        LinkAccount account = this.linkAccountHolder.getLinkAccountInfo().getValue().getAccount();
        if (account != null) {
            LinkRepository linkRepository = this.linkRepository;
            String email = account.getEmail();
            String clientSecret = account.getClientSecret();
            defaultLinkAccountManager$createBankAccountPaymentDetails$1.label = 1;
            Object objMo7749createBankAccountPaymentDetailsBWLJW6A = linkRepository.mo7749createBankAccountPaymentDetailsBWLJW6A(str, email, clientSecret, defaultLinkAccountManager$createBankAccountPaymentDetails$1);
            return objMo7749createBankAccountPaymentDetailsBWLJW6A == coroutine_suspended ? coroutine_suspended : objMo7749createBankAccountPaymentDetailsBWLJW6A;
        }
        ErrorReporter.DefaultImpls.report$default(this.errorReporter, ErrorReporter.UnexpectedErrorEvent.LINK_ATTACH_BANK_ACCOUNT_WITH_NULL_ACCOUNT, null, null, 6, null);
        Result.Companion companion = Result.INSTANCE;
        return Result.m9118constructorimpl(ResultKt.createFailure(new IllegalStateException("A non-null Link account is needed to create payment details")));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.link.account.LinkAccountManager
    /* renamed from: sharePaymentDetails-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7718sharePaymentDetailsyxL6bBk(String str, String str2, String str3, String str4, Continuation<? super Result<SharePaymentDetails>> continuation) {
        DefaultLinkAccountManager$sharePaymentDetails$1 defaultLinkAccountManager$sharePaymentDetails$1;
        Object objM9118constructorimpl;
        Object objMo7762sharePaymentDetailshUnOzRk;
        LinkAccount account;
        if (continuation instanceof DefaultLinkAccountManager$sharePaymentDetails$1) {
            defaultLinkAccountManager$sharePaymentDetails$1 = (DefaultLinkAccountManager$sharePaymentDetails$1) continuation;
            if ((defaultLinkAccountManager$sharePaymentDetails$1.label & Integer.MIN_VALUE) != 0) {
                defaultLinkAccountManager$sharePaymentDetails$1.label -= Integer.MIN_VALUE;
            } else {
                defaultLinkAccountManager$sharePaymentDetails$1 = new DefaultLinkAccountManager$sharePaymentDetails$1(this, continuation);
            }
        }
        DefaultLinkAccountManager$sharePaymentDetails$1 defaultLinkAccountManager$sharePaymentDetails$12 = defaultLinkAccountManager$sharePaymentDetails$1;
        Object obj = defaultLinkAccountManager$sharePaymentDetails$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = defaultLinkAccountManager$sharePaymentDetails$12.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    Result.Companion companion = Result.INSTANCE;
                    DefaultLinkAccountManager defaultLinkAccountManager = this;
                    account = this.linkAccountHolder.getLinkAccountInfo().getValue().getAccount();
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                }
                if (account != null) {
                    objM9118constructorimpl = Result.m9118constructorimpl(account);
                    if (!Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                        return Result.m9118constructorimpl(objM9118constructorimpl);
                    }
                    Result.Companion companion3 = Result.INSTANCE;
                    LinkRepository linkRepository = this.linkRepository;
                    String clientSecret = ((LinkAccount) objM9118constructorimpl).getClientSecret();
                    defaultLinkAccountManager$sharePaymentDetails$12.label = 1;
                    objMo7762sharePaymentDetailshUnOzRk = linkRepository.mo7762sharePaymentDetailshUnOzRk(clientSecret, str, str2, str3, str4, defaultLinkAccountManager$sharePaymentDetails$12);
                    if (objMo7762sharePaymentDetailshUnOzRk == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo7762sharePaymentDetailshUnOzRk = ((Result) obj).getValue();
            }
            ResultKt.throwOnFailure(objMo7762sharePaymentDetailshUnOzRk);
            return Result.m9118constructorimpl((SharePaymentDetails) objMo7762sharePaymentDetailshUnOzRk);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setAccount(ConsumerSession consumerSession, String str, DisplayablePaymentDetails displayablePaymentDetails, Continuation<? super LinkAccount> continuation) {
        C10351 c10351;
        if (continuation instanceof C10351) {
            c10351 = (C10351) continuation;
            if ((c10351.label & Integer.MIN_VALUE) != 0) {
                c10351.label -= Integer.MIN_VALUE;
            } else {
                c10351 = new C10351(continuation);
            }
        }
        Object obj = c10351.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c10351.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            LinkAccount linkAccount = (LinkAccount) c10351.L$0;
            ResultKt.throwOnFailure(obj);
            return linkAccount;
        }
        ResultKt.throwOnFailure(obj);
        LinkAccount account = this.linkAccountHolder.getLinkAccountInfo().getValue().getAccount();
        if (str == null && (account == null || (str = account.getConsumerPublishableKey()) == null || !Intrinsics.areEqual(account.getEmail(), consumerSession.getEmailAddress()))) {
            str = null;
        }
        if (displayablePaymentDetails == null && (account == null || (displayablePaymentDetails = account.getDisplayablePaymentDetails()) == null || !Intrinsics.areEqual(account.getEmail(), consumerSession.getEmailAddress()))) {
            displayablePaymentDetails = null;
        }
        LinkAccount linkAccount2 = new LinkAccount(consumerSession, str, displayablePaymentDetails);
        MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(linkAccount2, null);
        c10351.L$0 = linkAccount2;
        c10351.label = 1;
        return BuildersKt.withContext(immediate, anonymousClass2, c10351) == coroutine_suspended ? coroutine_suspended : linkAccount2;
    }

    /* compiled from: DefaultLinkAccountManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.account.DefaultLinkAccountManager$setAccount$2", f = "DefaultLinkAccountManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.link.account.DefaultLinkAccountManager$setAccount$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LinkAccount $newAccount;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(LinkAccount linkAccount, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$newAccount = linkAccount;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultLinkAccountManager.this.new AnonymousClass2(this.$newAccount, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                DefaultLinkAccountManager.this.linkAccountHolder.set(new LinkAccountUpdate.Value(this.$newAccount, null, 2, null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.stripe.android.link.account.LinkAccountManager
    public Object setLinkAccountFromLookupResult(ConsumerSessionLookup consumerSessionLookup, boolean z, Continuation<? super LinkAccount> continuation) {
        ConsumerSession consumerSession = consumerSessionLookup.getConsumerSession();
        if (consumerSession == null) {
            return null;
        }
        if (z) {
            Object account = setAccount(consumerSession, consumerSessionLookup.getPublishableKey(), consumerSessionLookup.getDisplayablePaymentDetails(), continuation);
            return account == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? account : (LinkAccount) account;
        }
        return new LinkAccount(consumerSession, consumerSessionLookup.getPublishableKey(), consumerSessionLookup.getDisplayablePaymentDetails());
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
    
        if (r7 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.link.account.LinkAccountManager
    /* renamed from: startVerification-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7721startVerificationIoAF18A(Continuation<? super Result<LinkAccount>> continuation) {
        DefaultLinkAccountManager$startVerification$1 defaultLinkAccountManager$startVerification$1;
        Object objMo7763startVerification0E7RQCE;
        DefaultLinkAccountManager defaultLinkAccountManager;
        if (continuation instanceof DefaultLinkAccountManager$startVerification$1) {
            defaultLinkAccountManager$startVerification$1 = (DefaultLinkAccountManager$startVerification$1) continuation;
            if ((defaultLinkAccountManager$startVerification$1.label & Integer.MIN_VALUE) != 0) {
                defaultLinkAccountManager$startVerification$1.label -= Integer.MIN_VALUE;
            } else {
                defaultLinkAccountManager$startVerification$1 = new DefaultLinkAccountManager$startVerification$1(this, continuation);
            }
        }
        Object account = defaultLinkAccountManager$startVerification$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = defaultLinkAccountManager$startVerification$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(account);
            LinkAccount account2 = this.linkAccountHolder.getLinkAccountInfo().getValue().getAccount();
            if (account2 == null) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m9118constructorimpl(ResultKt.createFailure(new NoLinkAccountFoundException()));
            }
            this.linkEventsReporter.on2FAStart();
            LinkRepository linkRepository = this.linkRepository;
            String clientSecret = account2.getClientSecret();
            String consumerPublishableKey = account2.getConsumerPublishableKey();
            defaultLinkAccountManager$startVerification$1.L$0 = this;
            defaultLinkAccountManager$startVerification$1.label = 1;
            objMo7763startVerification0E7RQCE = linkRepository.mo7763startVerification0E7RQCE(clientSecret, consumerPublishableKey, defaultLinkAccountManager$startVerification$1);
            if (objMo7763startVerification0E7RQCE != coroutine_suspended) {
                defaultLinkAccountManager = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(account);
            return Result.m9118constructorimpl((LinkAccount) account);
        }
        defaultLinkAccountManager = (DefaultLinkAccountManager) defaultLinkAccountManager$startVerification$1.L$0;
        ResultKt.throwOnFailure(account);
        objMo7763startVerification0E7RQCE = ((Result) account).getValue();
        if (Result.m9121exceptionOrNullimpl(objMo7763startVerification0E7RQCE) != null) {
            defaultLinkAccountManager.linkEventsReporter.on2FAStartFailure();
        }
        if (!Result.m9125isSuccessimpl(objMo7763startVerification0E7RQCE)) {
            return Result.m9118constructorimpl(objMo7763startVerification0E7RQCE);
        }
        Result.Companion companion2 = Result.INSTANCE;
        defaultLinkAccountManager$startVerification$1.L$0 = null;
        defaultLinkAccountManager$startVerification$1.label = 2;
        account = defaultLinkAccountManager.setAccount((ConsumerSession) objMo7763startVerification0E7RQCE, null, null, defaultLinkAccountManager$startVerification$1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ad, code lost:
    
        if (r8 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.link.account.LinkAccountManager
    /* renamed from: confirmVerification-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7705confirmVerificationgIAlus(String str, Continuation<? super Result<LinkAccount>> continuation) {
        DefaultLinkAccountManager$confirmVerification$1 defaultLinkAccountManager$confirmVerification$1;
        Object objMo7747confirmVerificationBWLJW6A;
        DefaultLinkAccountManager defaultLinkAccountManager;
        if (continuation instanceof DefaultLinkAccountManager$confirmVerification$1) {
            defaultLinkAccountManager$confirmVerification$1 = (DefaultLinkAccountManager$confirmVerification$1) continuation;
            if ((defaultLinkAccountManager$confirmVerification$1.label & Integer.MIN_VALUE) != 0) {
                defaultLinkAccountManager$confirmVerification$1.label -= Integer.MIN_VALUE;
            } else {
                defaultLinkAccountManager$confirmVerification$1 = new DefaultLinkAccountManager$confirmVerification$1(this, continuation);
            }
        }
        Object account = defaultLinkAccountManager$confirmVerification$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = defaultLinkAccountManager$confirmVerification$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(account);
            LinkAccount account2 = this.linkAccountHolder.getLinkAccountInfo().getValue().getAccount();
            if (account2 == null) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m9118constructorimpl(ResultKt.createFailure(new NoLinkAccountFoundException()));
            }
            LinkRepository linkRepository = this.linkRepository;
            String clientSecret = account2.getClientSecret();
            String consumerPublishableKey = account2.getConsumerPublishableKey();
            defaultLinkAccountManager$confirmVerification$1.L$0 = this;
            defaultLinkAccountManager$confirmVerification$1.label = 1;
            objMo7747confirmVerificationBWLJW6A = linkRepository.mo7747confirmVerificationBWLJW6A(str, clientSecret, consumerPublishableKey, defaultLinkAccountManager$confirmVerification$1);
            if (objMo7747confirmVerificationBWLJW6A != coroutine_suspended) {
                defaultLinkAccountManager = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(account);
            return Result.m9118constructorimpl((LinkAccount) account);
        }
        defaultLinkAccountManager = (DefaultLinkAccountManager) defaultLinkAccountManager$confirmVerification$1.L$0;
        ResultKt.throwOnFailure(account);
        objMo7747confirmVerificationBWLJW6A = ((Result) account).getValue();
        if (Result.m9125isSuccessimpl(objMo7747confirmVerificationBWLJW6A)) {
            defaultLinkAccountManager.linkEventsReporter.on2FAComplete();
        }
        if (Result.m9121exceptionOrNullimpl(objMo7747confirmVerificationBWLJW6A) != null) {
            defaultLinkAccountManager.linkEventsReporter.on2FAFailure();
        }
        if (!Result.m9125isSuccessimpl(objMo7747confirmVerificationBWLJW6A)) {
            return Result.m9118constructorimpl(objMo7747confirmVerificationBWLJW6A);
        }
        Result.Companion companion2 = Result.INSTANCE;
        defaultLinkAccountManager$confirmVerification$1.L$0 = null;
        defaultLinkAccountManager$confirmVerification$1.label = 2;
        account = defaultLinkAccountManager.setAccount((ConsumerSession) objMo7747confirmVerificationBWLJW6A, null, null, defaultLinkAccountManager$confirmVerification$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.link.account.LinkAccountManager
    /* renamed from: listPaymentDetails-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7711listPaymentDetailsgIAlus(Set<String> set, Continuation<? super Result<ConsumerPaymentDetails>> continuation) {
        DefaultLinkAccountManager$listPaymentDetails$1 defaultLinkAccountManager$listPaymentDetails$1;
        Object objMo7754listPaymentDetailsBWLJW6A;
        DefaultLinkAccountManager defaultLinkAccountManager;
        ConsumerState consumerStateFromResponse;
        if (continuation instanceof DefaultLinkAccountManager$listPaymentDetails$1) {
            defaultLinkAccountManager$listPaymentDetails$1 = (DefaultLinkAccountManager$listPaymentDetails$1) continuation;
            if ((defaultLinkAccountManager$listPaymentDetails$1.label & Integer.MIN_VALUE) != 0) {
                defaultLinkAccountManager$listPaymentDetails$1.label -= Integer.MIN_VALUE;
            } else {
                defaultLinkAccountManager$listPaymentDetails$1 = new DefaultLinkAccountManager$listPaymentDetails$1(this, continuation);
            }
        }
        Object obj = defaultLinkAccountManager$listPaymentDetails$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = defaultLinkAccountManager$listPaymentDetails$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LinkAccount account = this.linkAccountHolder.getLinkAccountInfo().getValue().getAccount();
            if (account == null) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m9118constructorimpl(ResultKt.createFailure(new NoLinkAccountFoundException()));
            }
            LinkRepository linkRepository = this.linkRepository;
            String clientSecret = account.getClientSecret();
            String consumerPublishableKey = account.getConsumerPublishableKey();
            defaultLinkAccountManager$listPaymentDetails$1.L$0 = this;
            defaultLinkAccountManager$listPaymentDetails$1.label = 1;
            objMo7754listPaymentDetailsBWLJW6A = linkRepository.mo7754listPaymentDetailsBWLJW6A(set, clientSecret, consumerPublishableKey, defaultLinkAccountManager$listPaymentDetails$1);
            if (objMo7754listPaymentDetailsBWLJW6A == coroutine_suspended) {
                return coroutine_suspended;
            }
            defaultLinkAccountManager = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defaultLinkAccountManager = (DefaultLinkAccountManager) defaultLinkAccountManager$listPaymentDetails$1.L$0;
            ResultKt.throwOnFailure(obj);
            objMo7754listPaymentDetailsBWLJW6A = ((Result) obj).getValue();
        }
        if (Result.m9125isSuccessimpl(objMo7754listPaymentDetailsBWLJW6A)) {
            ConsumerPaymentDetails consumerPaymentDetails = (ConsumerPaymentDetails) objMo7754listPaymentDetailsBWLJW6A;
            MutableStateFlow<ConsumerState> mutableStateFlow = defaultLinkAccountManager._consumerState;
            ConsumerState value = mutableStateFlow.getValue();
            if (value == null || (consumerStateFromResponse = value.withPaymentDetailsResponse(consumerPaymentDetails)) == null) {
                consumerStateFromResponse = ConsumerState.INSTANCE.fromResponse(consumerPaymentDetails);
            }
            mutableStateFlow.setValue(consumerStateFromResponse);
        }
        return objMo7754listPaymentDetailsBWLJW6A;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.link.account.LinkAccountManager
    /* renamed from: listShippingAddresses-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7712listShippingAddressesIoAF18A(Continuation<? super Result<ConsumerShippingAddresses>> continuation) {
        DefaultLinkAccountManager$listShippingAddresses$1 defaultLinkAccountManager$listShippingAddresses$1;
        if (continuation instanceof DefaultLinkAccountManager$listShippingAddresses$1) {
            defaultLinkAccountManager$listShippingAddresses$1 = (DefaultLinkAccountManager$listShippingAddresses$1) continuation;
            if ((defaultLinkAccountManager$listShippingAddresses$1.label & Integer.MIN_VALUE) != 0) {
                defaultLinkAccountManager$listShippingAddresses$1.label -= Integer.MIN_VALUE;
            } else {
                defaultLinkAccountManager$listShippingAddresses$1 = new DefaultLinkAccountManager$listShippingAddresses$1(this, continuation);
            }
        }
        Object obj = defaultLinkAccountManager$listShippingAddresses$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = defaultLinkAccountManager$listShippingAddresses$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        LinkAccount account = this.linkAccountHolder.getLinkAccountInfo().getValue().getAccount();
        if (account == null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(new NoLinkAccountFoundException()));
        }
        LinkRepository linkRepository = this.linkRepository;
        String clientSecret = account.getClientSecret();
        String consumerPublishableKey = account.getConsumerPublishableKey();
        defaultLinkAccountManager$listShippingAddresses$1.label = 1;
        Object objMo7755listShippingAddresses0E7RQCE = linkRepository.mo7755listShippingAddresses0E7RQCE(clientSecret, consumerPublishableKey, defaultLinkAccountManager$listShippingAddresses$1);
        return objMo7755listShippingAddresses0E7RQCE == coroutine_suspended ? coroutine_suspended : objMo7755listShippingAddresses0E7RQCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.link.account.LinkAccountManager
    /* renamed from: deletePaymentDetails-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7710deletePaymentDetailsgIAlus(String str, Continuation<? super Result<Unit>> continuation) {
        DefaultLinkAccountManager$deletePaymentDetails$1 defaultLinkAccountManager$deletePaymentDetails$1;
        if (continuation instanceof DefaultLinkAccountManager$deletePaymentDetails$1) {
            defaultLinkAccountManager$deletePaymentDetails$1 = (DefaultLinkAccountManager$deletePaymentDetails$1) continuation;
            if ((defaultLinkAccountManager$deletePaymentDetails$1.label & Integer.MIN_VALUE) != 0) {
                defaultLinkAccountManager$deletePaymentDetails$1.label -= Integer.MIN_VALUE;
            } else {
                defaultLinkAccountManager$deletePaymentDetails$1 = new DefaultLinkAccountManager$deletePaymentDetails$1(this, continuation);
            }
        }
        Object obj = defaultLinkAccountManager$deletePaymentDetails$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = defaultLinkAccountManager$deletePaymentDetails$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        LinkAccount account = this.linkAccountHolder.getLinkAccountInfo().getValue().getAccount();
        if (account == null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(new NoLinkAccountFoundException()));
        }
        LinkRepository linkRepository = this.linkRepository;
        String clientSecret = account.getClientSecret();
        String consumerPublishableKey = account.getConsumerPublishableKey();
        defaultLinkAccountManager$deletePaymentDetails$1.label = 1;
        Object objMo7753deletePaymentDetailsBWLJW6A = linkRepository.mo7753deletePaymentDetailsBWLJW6A(str, clientSecret, consumerPublishableKey, defaultLinkAccountManager$deletePaymentDetails$1);
        return objMo7753deletePaymentDetailsBWLJW6A == coroutine_suspended ? coroutine_suspended : objMo7753deletePaymentDetailsBWLJW6A;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.link.account.LinkAccountManager
    /* renamed from: updatePaymentDetails-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7722updatePaymentDetails0E7RQCE(ConsumerPaymentDetailsUpdateParams consumerPaymentDetailsUpdateParams, String str, Continuation<? super Result<ConsumerPaymentDetails>> continuation) {
        DefaultLinkAccountManager$updatePaymentDetails$1 defaultLinkAccountManager$updatePaymentDetails$1;
        Object objMo7764updatePaymentDetailsBWLJW6A;
        DefaultLinkAccountManager defaultLinkAccountManager;
        if (continuation instanceof DefaultLinkAccountManager$updatePaymentDetails$1) {
            defaultLinkAccountManager$updatePaymentDetails$1 = (DefaultLinkAccountManager$updatePaymentDetails$1) continuation;
            if ((defaultLinkAccountManager$updatePaymentDetails$1.label & Integer.MIN_VALUE) != 0) {
                defaultLinkAccountManager$updatePaymentDetails$1.label -= Integer.MIN_VALUE;
            } else {
                defaultLinkAccountManager$updatePaymentDetails$1 = new DefaultLinkAccountManager$updatePaymentDetails$1(this, continuation);
            }
        }
        Object obj = defaultLinkAccountManager$updatePaymentDetails$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = defaultLinkAccountManager$updatePaymentDetails$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LinkAccount account = this.linkAccountHolder.getLinkAccountInfo().getValue().getAccount();
            if (account == null) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m9118constructorimpl(ResultKt.createFailure(new NoLinkAccountFoundException()));
            }
            LinkRepository linkRepository = this.linkRepository;
            String clientSecret = account.getClientSecret();
            String consumerPublishableKey = account.getConsumerPublishableKey();
            defaultLinkAccountManager$updatePaymentDetails$1.L$0 = this;
            defaultLinkAccountManager$updatePaymentDetails$1.L$1 = str;
            defaultLinkAccountManager$updatePaymentDetails$1.label = 1;
            objMo7764updatePaymentDetailsBWLJW6A = linkRepository.mo7764updatePaymentDetailsBWLJW6A(consumerPaymentDetailsUpdateParams, clientSecret, consumerPublishableKey, defaultLinkAccountManager$updatePaymentDetails$1);
            if (objMo7764updatePaymentDetailsBWLJW6A == coroutine_suspended) {
                return coroutine_suspended;
            }
            defaultLinkAccountManager = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) defaultLinkAccountManager$updatePaymentDetails$1.L$1;
            defaultLinkAccountManager = (DefaultLinkAccountManager) defaultLinkAccountManager$updatePaymentDetails$1.L$0;
            ResultKt.throwOnFailure(obj);
            objMo7764updatePaymentDetailsBWLJW6A = ((Result) obj).getValue();
        }
        if (!Result.m9125isSuccessimpl(objMo7764updatePaymentDetailsBWLJW6A)) {
            return Result.m9118constructorimpl(objMo7764updatePaymentDetailsBWLJW6A);
        }
        Result.Companion companion2 = Result.INSTANCE;
        ConsumerPaymentDetails consumerPaymentDetails = (ConsumerPaymentDetails) objMo7764updatePaymentDetailsBWLJW6A;
        MutableStateFlow<ConsumerState> mutableStateFlow = defaultLinkAccountManager._consumerState;
        ConsumerState value = mutableStateFlow.getValue();
        mutableStateFlow.setValue(value != null ? value.withUpdatedPaymentDetail((ConsumerPaymentDetails.PaymentDetails) CollectionsKt.first((List) consumerPaymentDetails.getPaymentDetails()), str) : null);
        return Result.m9118constructorimpl(consumerPaymentDetails);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAccountStatus(LinkAccount linkAccount, boolean z, Continuation<? super AccountStatus> continuation) {
        AnonymousClass1 anonymousClass1;
        Object objMo7714lookupConsumerBWLJW6A;
        Object objM9118constructorimpl;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (linkAccount != null) {
                return linkAccount.getAccountStatus();
            }
            String email = this.config.getCustomerInfo().getEmail();
            if (email != null) {
                if (!z) {
                    email = null;
                }
                if (email != null) {
                    String customerIdForEceDefaultValues = this.config.getCustomerIdForEceDefaultValues();
                    anonymousClass1.label = 1;
                    objMo7714lookupConsumerBWLJW6A = mo7714lookupConsumerBWLJW6A(email, true, customerIdForEceDefaultValues, anonymousClass1);
                    if (objMo7714lookupConsumerBWLJW6A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return AccountStatus.SignedOut;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        objMo7714lookupConsumerBWLJW6A = ((Result) obj).getValue();
        if (Result.m9125isSuccessimpl(objMo7714lookupConsumerBWLJW6A)) {
            Result.Companion companion = Result.INSTANCE;
            LinkAccount linkAccount2 = (LinkAccount) objMo7714lookupConsumerBWLJW6A;
            objM9118constructorimpl = Result.m9118constructorimpl(linkAccount2 != null ? linkAccount2.getAccountStatus() : null);
        } else {
            objM9118constructorimpl = Result.m9118constructorimpl(objMo7714lookupConsumerBWLJW6A);
        }
        if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl) != null) {
            objM9118constructorimpl = AccountStatus.Error;
        }
        AccountStatus accountStatus = (AccountStatus) objM9118constructorimpl;
        if (accountStatus != null) {
            return accountStatus;
        }
        return AccountStatus.SignedOut;
    }

    private final ConsumerSignUpConsentAction getConsumerAction(SignUpConsentAction signUpConsentAction) {
        switch (WhenMappings.$EnumSwitchMapping$1[signUpConsentAction.ordinal()]) {
            case 1:
                return ConsumerSignUpConsentAction.Checkbox;
            case 2:
                return ConsumerSignUpConsentAction.CheckboxWithPrefilledEmail;
            case 3:
                return ConsumerSignUpConsentAction.CheckboxWithPrefilledEmailAndPhone;
            case 4:
                return ConsumerSignUpConsentAction.Implied;
            case 5:
                return ConsumerSignUpConsentAction.ImpliedWithPrefilledEmail;
            case 6:
                return ConsumerSignUpConsentAction.PrecheckedOptInBoxPrefilledAll;
            case 7:
                return ConsumerSignUpConsentAction.PrecheckedOptInBoxPrefilledSome;
            case 8:
                return ConsumerSignUpConsentAction.PrecheckedOptInBoxPrefilledNone;
            case 9:
                return ConsumerSignUpConsentAction.SignUpOptInMobileChecked;
            case 10:
                return ConsumerSignUpConsentAction.SignUpOptInMobilePrechecked;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
