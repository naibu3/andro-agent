package com.stripe.android.link;

import com.stripe.android.link.attestation.LinkAttestationCheck;
import com.stripe.android.link.gate.LinkGate;
import com.stripe.android.link.injection.LinkComponent;
import com.stripe.android.link.model.AccountStatus;
import com.stripe.android.link.ui.inline.UserInput;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.PaymentMethodCreateParams;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: LinkConfigurationCoordinator.kt */
@Singleton
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nH&J&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016H¦@¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cH¦@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00132\u0006\u0010\t\u001a\u00020\nH¦@¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006#"}, d2 = {"Lcom/stripe/android/link/LinkConfigurationCoordinator;", "", "emailFlow", "Lkotlinx/coroutines/flow/StateFlow;", "", "getEmailFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "getComponent", "Lcom/stripe/android/link/injection/LinkComponent;", "configuration", "Lcom/stripe/android/link/LinkConfiguration;", "getAccountStatusFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/stripe/android/link/model/AccountStatus;", "linkGate", "Lcom/stripe/android/link/gate/LinkGate;", "linkAttestationCheck", "Lcom/stripe/android/link/attestation/LinkAttestationCheck;", "signInWithUserInput", "Lkotlin/Result;", "", "userInput", "Lcom/stripe/android/link/ui/inline/UserInput;", "signInWithUserInput-0E7RQCE", "(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/ui/inline/UserInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attachNewCardToAccount", "Lcom/stripe/android/link/LinkPaymentDetails;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "attachNewCardToAccount-0E7RQCE", "(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logOut", "Lcom/stripe/android/model/ConsumerSession;", "logOut-gIAlu-s", "(Lcom/stripe/android/link/LinkConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface LinkConfigurationCoordinator {
    /* renamed from: attachNewCardToAccount-0E7RQCE, reason: not valid java name */
    Object mo7679attachNewCardToAccount0E7RQCE(LinkConfiguration linkConfiguration, PaymentMethodCreateParams paymentMethodCreateParams, Continuation<? super Result<? extends LinkPaymentDetails>> continuation);

    Flow<AccountStatus> getAccountStatusFlow(LinkConfiguration configuration);

    LinkComponent getComponent(LinkConfiguration configuration);

    StateFlow<String> getEmailFlow();

    LinkAttestationCheck linkAttestationCheck(LinkConfiguration configuration);

    LinkGate linkGate(LinkConfiguration configuration);

    /* renamed from: logOut-gIAlu-s, reason: not valid java name */
    Object mo7680logOutgIAlus(LinkConfiguration linkConfiguration, Continuation<? super Result<ConsumerSession>> continuation);

    /* renamed from: signInWithUserInput-0E7RQCE, reason: not valid java name */
    Object mo7681signInWithUserInput0E7RQCE(LinkConfiguration linkConfiguration, UserInput userInput, Continuation<? super Result<Boolean>> continuation);
}
