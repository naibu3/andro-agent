package com.stripe.android.link;

import com.stripe.android.link.LinkAccountUpdate;
import com.stripe.android.link.LinkPaymentDetails;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.attestation.LinkAttestationCheck;
import com.stripe.android.link.gate.LinkGate;
import com.stripe.android.link.injection.LinkComponent;
import com.stripe.android.link.model.AccountStatus;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.ui.inline.UserInput;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.uicore.utils.StateFlowsKt;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: LinkConfigurationCoordinator.kt */
@Singleton
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ&\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00192\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"H\u0096@¢\u0006\u0004\b#\u0010$J\u001e\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00192\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006*"}, d2 = {"Lcom/stripe/android/link/RealLinkConfigurationCoordinator;", "Lcom/stripe/android/link/LinkConfigurationCoordinator;", "linkComponentBuilder", "Lcom/stripe/android/link/injection/LinkComponent$Builder;", "<init>", "(Lcom/stripe/android/link/injection/LinkComponent$Builder;)V", "componentFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/link/injection/LinkComponent;", "emailFlow", "Lkotlinx/coroutines/flow/StateFlow;", "", "getEmailFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "getComponent", "configuration", "Lcom/stripe/android/link/LinkConfiguration;", "getAccountStatusFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/stripe/android/link/model/AccountStatus;", "linkGate", "Lcom/stripe/android/link/gate/LinkGate;", "linkAttestationCheck", "Lcom/stripe/android/link/attestation/LinkAttestationCheck;", "signInWithUserInput", "Lkotlin/Result;", "", "userInput", "Lcom/stripe/android/link/ui/inline/UserInput;", "signInWithUserInput-0E7RQCE", "(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/ui/inline/UserInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attachNewCardToAccount", "Lcom/stripe/android/link/LinkPaymentDetails;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "attachNewCardToAccount-0E7RQCE", "(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logOut", "Lcom/stripe/android/model/ConsumerSession;", "logOut-gIAlu-s", "(Lcom/stripe/android/link/LinkConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLinkPaymentLauncherComponent", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RealLinkConfigurationCoordinator implements LinkConfigurationCoordinator {
    public static final int $stable = 8;
    private final MutableStateFlow<LinkComponent> componentFlow;
    private final StateFlow<String> emailFlow;
    private final LinkComponent.Builder linkComponentBuilder;

    @Inject
    public RealLinkConfigurationCoordinator(LinkComponent.Builder linkComponentBuilder) {
        Intrinsics.checkNotNullParameter(linkComponentBuilder, "linkComponentBuilder");
        this.linkComponentBuilder = linkComponentBuilder;
        MutableStateFlow<LinkComponent> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.componentFlow = MutableStateFlow;
        this.emailFlow = StateFlowsKt.mapAsStateFlow(StateFlowsKt.flatMapLatestAsStateFlow(MutableStateFlow, new Function1() { // from class: com.stripe.android.link.RealLinkConfigurationCoordinator$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RealLinkConfigurationCoordinator.emailFlow$lambda$1((LinkComponent) obj);
            }
        }), new Function1() { // from class: com.stripe.android.link.RealLinkConfigurationCoordinator$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RealLinkConfigurationCoordinator.emailFlow$lambda$2((LinkAccount) obj);
            }
        });
    }

    @Override // com.stripe.android.link.LinkConfigurationCoordinator
    public StateFlow<String> getEmailFlow() {
        return this.emailFlow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StateFlow emailFlow$lambda$1(LinkComponent linkComponent) {
        LinkAccountManager linkAccountManager$paymentsheet_release;
        if (((linkComponent == null || (linkAccountManager$paymentsheet_release = linkComponent.getLinkAccountManager$paymentsheet_release()) == null) ? null : linkAccountManager$paymentsheet_release.getLinkAccountInfo()) != null) {
            return StateFlowsKt.mapAsStateFlow(linkComponent.getLinkAccountManager$paymentsheet_release().getLinkAccountInfo(), new Function1() { // from class: com.stripe.android.link.RealLinkConfigurationCoordinator$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RealLinkConfigurationCoordinator.emailFlow$lambda$1$lambda$0((LinkAccountUpdate.Value) obj);
                }
            });
        }
        return StateFlowsKt.stateFlowOf(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkAccount emailFlow$lambda$1$lambda$0(LinkAccountUpdate.Value it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getAccount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String emailFlow$lambda$2(LinkAccount linkAccount) {
        if (linkAccount != null) {
            return linkAccount.getEmail();
        }
        return null;
    }

    @Override // com.stripe.android.link.LinkConfigurationCoordinator
    public LinkComponent getComponent(LinkConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return getLinkPaymentLauncherComponent(configuration);
    }

    @Override // com.stripe.android.link.LinkConfigurationCoordinator
    public Flow<AccountStatus> getAccountStatusFlow(LinkConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return getLinkPaymentLauncherComponent(configuration).getLinkAccountManager$paymentsheet_release().getAccountStatus();
    }

    @Override // com.stripe.android.link.LinkConfigurationCoordinator
    public LinkGate linkGate(LinkConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return getLinkPaymentLauncherComponent(configuration).getLinkGate$paymentsheet_release();
    }

    @Override // com.stripe.android.link.LinkConfigurationCoordinator
    public LinkAttestationCheck linkAttestationCheck(LinkConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return getLinkPaymentLauncherComponent(configuration).getLinkAttestationCheck$paymentsheet_release();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.link.LinkConfigurationCoordinator
    /* renamed from: signInWithUserInput-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7681signInWithUserInput0E7RQCE(LinkConfiguration linkConfiguration, UserInput userInput, Continuation<? super Result<Boolean>> continuation) {
        RealLinkConfigurationCoordinator$signInWithUserInput$1 realLinkConfigurationCoordinator$signInWithUserInput$1;
        Object objMo7719signInWithUserInputgIAlus;
        if (continuation instanceof RealLinkConfigurationCoordinator$signInWithUserInput$1) {
            realLinkConfigurationCoordinator$signInWithUserInput$1 = (RealLinkConfigurationCoordinator$signInWithUserInput$1) continuation;
            if ((realLinkConfigurationCoordinator$signInWithUserInput$1.label & Integer.MIN_VALUE) != 0) {
                realLinkConfigurationCoordinator$signInWithUserInput$1.label -= Integer.MIN_VALUE;
            } else {
                realLinkConfigurationCoordinator$signInWithUserInput$1 = new RealLinkConfigurationCoordinator$signInWithUserInput$1(this, continuation);
            }
        }
        Object obj = realLinkConfigurationCoordinator$signInWithUserInput$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = realLinkConfigurationCoordinator$signInWithUserInput$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LinkAccountManager linkAccountManager$paymentsheet_release = getLinkPaymentLauncherComponent(linkConfiguration).getLinkAccountManager$paymentsheet_release();
            realLinkConfigurationCoordinator$signInWithUserInput$1.label = 1;
            objMo7719signInWithUserInputgIAlus = linkAccountManager$paymentsheet_release.mo7719signInWithUserInputgIAlus(userInput, realLinkConfigurationCoordinator$signInWithUserInput$1);
            if (objMo7719signInWithUserInputgIAlus == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo7719signInWithUserInputgIAlus = ((Result) obj).getValue();
        }
        if (!Result.m9125isSuccessimpl(objMo7719signInWithUserInputgIAlus)) {
            return Result.m9118constructorimpl(objMo7719signInWithUserInputgIAlus);
        }
        Result.Companion companion = Result.INSTANCE;
        return Result.m9118constructorimpl(Boxing.boxBoolean(true));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.link.LinkConfigurationCoordinator
    /* renamed from: attachNewCardToAccount-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7679attachNewCardToAccount0E7RQCE(LinkConfiguration linkConfiguration, PaymentMethodCreateParams paymentMethodCreateParams, Continuation<? super Result<? extends LinkPaymentDetails>> continuation) {
        RealLinkConfigurationCoordinator$attachNewCardToAccount$1 realLinkConfigurationCoordinator$attachNewCardToAccount$1;
        LinkAccountManager linkAccountManager$paymentsheet_release;
        Object objMo7707createCardPaymentDetailsgIAlus;
        LinkPaymentDetails.New r7;
        Object objMo7717shareCardPaymentDetailsgIAlus;
        if (continuation instanceof RealLinkConfigurationCoordinator$attachNewCardToAccount$1) {
            realLinkConfigurationCoordinator$attachNewCardToAccount$1 = (RealLinkConfigurationCoordinator$attachNewCardToAccount$1) continuation;
            if ((realLinkConfigurationCoordinator$attachNewCardToAccount$1.label & Integer.MIN_VALUE) != 0) {
                realLinkConfigurationCoordinator$attachNewCardToAccount$1.label -= Integer.MIN_VALUE;
            } else {
                realLinkConfigurationCoordinator$attachNewCardToAccount$1 = new RealLinkConfigurationCoordinator$attachNewCardToAccount$1(this, continuation);
            }
        }
        Object obj = realLinkConfigurationCoordinator$attachNewCardToAccount$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = realLinkConfigurationCoordinator$attachNewCardToAccount$1.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                linkAccountManager$paymentsheet_release = getLinkPaymentLauncherComponent(linkConfiguration).getLinkAccountManager$paymentsheet_release();
                realLinkConfigurationCoordinator$attachNewCardToAccount$1.L$0 = linkConfiguration;
                realLinkConfigurationCoordinator$attachNewCardToAccount$1.L$1 = linkAccountManager$paymentsheet_release;
                realLinkConfigurationCoordinator$attachNewCardToAccount$1.label = 1;
                objMo7707createCardPaymentDetailsgIAlus = linkAccountManager$paymentsheet_release.mo7707createCardPaymentDetailsgIAlus(paymentMethodCreateParams, realLinkConfigurationCoordinator$attachNewCardToAccount$1);
                if (objMo7707createCardPaymentDetailsgIAlus != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo7717shareCardPaymentDetailsgIAlus = ((Result) obj).getValue();
                ResultKt.throwOnFailure(objMo7717shareCardPaymentDetailsgIAlus);
                r7 = (LinkPaymentDetails) objMo7717shareCardPaymentDetailsgIAlus;
                return Result.m9118constructorimpl(r7);
            }
            LinkAccountManager linkAccountManager = (LinkAccountManager) realLinkConfigurationCoordinator$attachNewCardToAccount$1.L$1;
            LinkConfiguration linkConfiguration2 = (LinkConfiguration) realLinkConfigurationCoordinator$attachNewCardToAccount$1.L$0;
            ResultKt.throwOnFailure(obj);
            Object value = ((Result) obj).getValue();
            linkAccountManager$paymentsheet_release = linkAccountManager;
            linkConfiguration = linkConfiguration2;
            objMo7707createCardPaymentDetailsgIAlus = value;
            if (!Result.m9125isSuccessimpl(objMo7707createCardPaymentDetailsgIAlus)) {
                return Result.m9118constructorimpl(objMo7707createCardPaymentDetailsgIAlus);
            }
            Result.Companion companion = Result.INSTANCE;
            LinkPaymentDetails.New r8 = (LinkPaymentDetails.New) objMo7707createCardPaymentDetailsgIAlus;
            if (linkConfiguration.getPassthroughModeEnabled()) {
                realLinkConfigurationCoordinator$attachNewCardToAccount$1.L$0 = null;
                realLinkConfigurationCoordinator$attachNewCardToAccount$1.L$1 = null;
                realLinkConfigurationCoordinator$attachNewCardToAccount$1.label = 2;
                objMo7717shareCardPaymentDetailsgIAlus = linkAccountManager$paymentsheet_release.mo7717shareCardPaymentDetailsgIAlus(r8, realLinkConfigurationCoordinator$attachNewCardToAccount$1);
            } else {
                r7 = r8;
                return Result.m9118constructorimpl(r7);
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.link.LinkConfigurationCoordinator
    /* renamed from: logOut-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7680logOutgIAlus(LinkConfiguration linkConfiguration, Continuation<? super Result<ConsumerSession>> continuation) {
        RealLinkConfigurationCoordinator$logOut$1 realLinkConfigurationCoordinator$logOut$1;
        if (continuation instanceof RealLinkConfigurationCoordinator$logOut$1) {
            realLinkConfigurationCoordinator$logOut$1 = (RealLinkConfigurationCoordinator$logOut$1) continuation;
            if ((realLinkConfigurationCoordinator$logOut$1.label & Integer.MIN_VALUE) != 0) {
                realLinkConfigurationCoordinator$logOut$1.label -= Integer.MIN_VALUE;
            } else {
                realLinkConfigurationCoordinator$logOut$1 = new RealLinkConfigurationCoordinator$logOut$1(this, continuation);
            }
        }
        Object obj = realLinkConfigurationCoordinator$logOut$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = realLinkConfigurationCoordinator$logOut$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        LinkAccountManager linkAccountManager$paymentsheet_release = getLinkPaymentLauncherComponent(linkConfiguration).getLinkAccountManager$paymentsheet_release();
        realLinkConfigurationCoordinator$logOut$1.label = 1;
        Object objMo7713logOutIoAF18A = linkAccountManager$paymentsheet_release.mo7713logOutIoAF18A(realLinkConfigurationCoordinator$logOut$1);
        return objMo7713logOutIoAF18A == coroutine_suspended ? coroutine_suspended : objMo7713logOutIoAF18A;
    }

    private final LinkComponent getLinkPaymentLauncherComponent(LinkConfiguration configuration) {
        LinkComponent value = this.componentFlow.getValue();
        if (value != null) {
            if (!Intrinsics.areEqual(value.getConfiguration$paymentsheet_release(), configuration)) {
                value = null;
            }
            if (value != null) {
                return value;
            }
        }
        LinkComponent linkComponentBuild = this.linkComponentBuilder.configuration(configuration).build();
        this.componentFlow.setValue(linkComponentBuild);
        return linkComponentBuild;
    }
}
