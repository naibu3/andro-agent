package com.stripe.android.financialconnections.domain;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.launcher.InstantDebitsResult;
import com.stripe.android.financialconnections.repository.CachedConsumerSession;
import com.stripe.android.financialconnections.repository.ConsumerSessionProvider;
import com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.IncentiveEligibilitySession;
import com.stripe.android.model.LinkMode;
import com.stripe.android.model.SharePaymentDetails;
import com.stripe.android.model.UpdateAvailableIncentives;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateInstantDebitsResult.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096B¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult;", "Lcom/stripe/android/financialconnections/domain/CreateInstantDebitsResult;", "consumerRepository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;", "repository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;", "consumerSessionProvider", "Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;", "elementsSessionContext", "Lcom/stripe/android/financialconnections/ElementsSessionContext;", "<init>", "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;Lcom/stripe/android/financialconnections/ElementsSessionContext;)V", "invoke", "Lcom/stripe/android/financialconnections/launcher/InstantDebitsResult;", "bankAccountId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RealCreateInstantDebitsResult implements CreateInstantDebitsResult {
    public static final int $stable = 8;
    private final FinancialConnectionsConsumerSessionRepository consumerRepository;
    private final ConsumerSessionProvider consumerSessionProvider;
    private final ElementsSessionContext elementsSessionContext;
    private final FinancialConnectionsRepository repository;

    /* compiled from: CreateInstantDebitsResult.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.RealCreateInstantDebitsResult", f = "CreateInstantDebitsResult.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3}, l = {36, 46, ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE, ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT}, m = "invoke", n = {"this", "clientSecret", "billingDetails", "this", "clientSecret", "paymentDetails", "this", "clientSecret", "paymentDetails", "paymentDetails", "paymentMethod"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1"})
    /* renamed from: com.stripe.android.financialconnections.domain.RealCreateInstantDebitsResult$invoke$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
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
            return RealCreateInstantDebitsResult.this.invoke(null, this);
        }
    }

    @Inject
    public RealCreateInstantDebitsResult(FinancialConnectionsConsumerSessionRepository consumerRepository, FinancialConnectionsRepository repository, ConsumerSessionProvider consumerSessionProvider, ElementsSessionContext elementsSessionContext) {
        Intrinsics.checkNotNullParameter(consumerRepository, "consumerRepository");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(consumerSessionProvider, "consumerSessionProvider");
        this.consumerRepository = consumerRepository;
        this.repository = repository;
        this.consumerSessionProvider = consumerSessionProvider;
        this.elementsSessionContext = elementsSessionContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @Override // com.stripe.android.financialconnections.domain.CreateInstantDebitsResult
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(String str, Continuation<? super InstantDebitsResult> continuation) {
        AnonymousClass1 anonymousClass1;
        String clientSecret;
        ElementsSessionContext.BillingDetails billingDetails;
        RealCreateInstantDebitsResult realCreateInstantDebitsResult;
        ConsumerPaymentDetails.BankAccount bankAccount;
        String str2;
        RealCreateInstantDebitsResult realCreateInstantDebitsResult2;
        ElementsSessionContext.BillingDetails billingDetails2;
        String encodedPaymentMethod;
        String id;
        String str3;
        Object objBoxBoolean;
        IncentiveEligibilitySession incentiveEligibilitySession;
        Object objM9118constructorimpl;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        AnonymousClass1 anonymousClass12 = anonymousClass1;
        Object objCreatePaymentDetails = anonymousClass12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass12.label;
        boolean zBooleanValue = false;
        if (i == 0) {
            ResultKt.throwOnFailure(objCreatePaymentDetails);
            CachedConsumerSession cachedConsumerSessionProvideConsumerSession = this.consumerSessionProvider.provideConsumerSession();
            clientSecret = cachedConsumerSessionProvideConsumerSession != null ? cachedConsumerSessionProvideConsumerSession.getClientSecret() : null;
            if (clientSecret == null) {
                throw new IllegalArgumentException("Consumer session client secret cannot be null".toString());
            }
            ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
            billingDetails = elementsSessionContext != null ? elementsSessionContext.getBillingDetails() : null;
            FinancialConnectionsConsumerSessionRepository financialConnectionsConsumerSessionRepository = this.consumerRepository;
            anonymousClass12.L$0 = this;
            anonymousClass12.L$1 = clientSecret;
            anonymousClass12.L$2 = billingDetails;
            anonymousClass12.label = 1;
            objCreatePaymentDetails = financialConnectionsConsumerSessionRepository.createPaymentDetails(str, clientSecret, billingDetails, anonymousClass12);
            if (objCreatePaymentDetails != coroutine_suspended) {
                realCreateInstantDebitsResult = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i == 2) {
                bankAccount = (ConsumerPaymentDetails.BankAccount) anonymousClass12.L$2;
                str2 = (String) anonymousClass12.L$1;
                realCreateInstantDebitsResult2 = (RealCreateInstantDebitsResult) anonymousClass12.L$0;
                ResultKt.throwOnFailure(objCreatePaymentDetails);
                encodedPaymentMethod = ((SharePaymentDetails) objCreatePaymentDetails).getEncodedPaymentMethod();
                ElementsSessionContext elementsSessionContext2 = realCreateInstantDebitsResult2.elementsSessionContext;
                if (elementsSessionContext2 != null) {
                    if (id != null) {
                    }
                }
                return new InstantDebitsResult(encodedPaymentMethod, bankAccount.getLast4(), bankAccount.getBankName(), zBooleanValue);
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str3 = (String) anonymousClass12.L$1;
                bankAccount = (ConsumerPaymentDetails.BankAccount) anonymousClass12.L$0;
                ResultKt.throwOnFailure(objCreatePaymentDetails);
                objBoxBoolean = ((Result) objCreatePaymentDetails).getValue();
                if (Result.m9125isSuccessimpl(objBoxBoolean)) {
                    Result.Companion companion = Result.INSTANCE;
                    objBoxBoolean = Boxing.boxBoolean(!((UpdateAvailableIncentives) objBoxBoolean).getData().isEmpty());
                }
                objM9118constructorimpl = Result.m9118constructorimpl(objBoxBoolean);
                Boolean boolBoxBoolean = Boxing.boxBoolean(false);
                if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
                    objM9118constructorimpl = boolBoxBoolean;
                }
                zBooleanValue = ((Boolean) objM9118constructorimpl).booleanValue();
                encodedPaymentMethod = str3;
                return new InstantDebitsResult(encodedPaymentMethod, bankAccount.getLast4(), bankAccount.getBankName(), zBooleanValue);
            }
            bankAccount = (ConsumerPaymentDetails.BankAccount) anonymousClass12.L$2;
            str2 = (String) anonymousClass12.L$1;
            realCreateInstantDebitsResult2 = (RealCreateInstantDebitsResult) anonymousClass12.L$0;
            ResultKt.throwOnFailure(objCreatePaymentDetails);
            encodedPaymentMethod = (String) objCreatePaymentDetails;
            ElementsSessionContext elementsSessionContext22 = realCreateInstantDebitsResult2.elementsSessionContext;
            id = (elementsSessionContext22 != null || (incentiveEligibilitySession = elementsSessionContext22.getIncentiveEligibilitySession()) == null) ? null : incentiveEligibilitySession.getId();
            if (id != null) {
                FinancialConnectionsConsumerSessionRepository financialConnectionsConsumerSessionRepository2 = realCreateInstantDebitsResult2.consumerRepository;
                String id2 = bankAccount.getId();
                anonymousClass12.L$0 = bankAccount;
                anonymousClass12.L$1 = encodedPaymentMethod;
                anonymousClass12.L$2 = null;
                anonymousClass12.label = 4;
                Object objMo7548updateAvailableIncentivesBWLJW6A = financialConnectionsConsumerSessionRepository2.mo7548updateAvailableIncentivesBWLJW6A(id, id2, str2, anonymousClass12);
                if (objMo7548updateAvailableIncentivesBWLJW6A != coroutine_suspended) {
                    str3 = encodedPaymentMethod;
                    objBoxBoolean = objMo7548updateAvailableIncentivesBWLJW6A;
                    if (Result.m9125isSuccessimpl(objBoxBoolean)) {
                    }
                    objM9118constructorimpl = Result.m9118constructorimpl(objBoxBoolean);
                    Boolean boolBoxBoolean2 = Boxing.boxBoolean(false);
                    if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
                    }
                    zBooleanValue = ((Boolean) objM9118constructorimpl).booleanValue();
                    encodedPaymentMethod = str3;
                }
                return coroutine_suspended;
            }
            return new InstantDebitsResult(encodedPaymentMethod, bankAccount.getLast4(), bankAccount.getBankName(), zBooleanValue);
        }
        billingDetails = (ElementsSessionContext.BillingDetails) anonymousClass12.L$2;
        clientSecret = (String) anonymousClass12.L$1;
        RealCreateInstantDebitsResult realCreateInstantDebitsResult3 = (RealCreateInstantDebitsResult) anonymousClass12.L$0;
        ResultKt.throwOnFailure(objCreatePaymentDetails);
        realCreateInstantDebitsResult = realCreateInstantDebitsResult3;
        List<ConsumerPaymentDetails.PaymentDetails> paymentDetails = ((ConsumerPaymentDetails) objCreatePaymentDetails).getPaymentDetails();
        ArrayList arrayList = new ArrayList();
        for (Object obj : paymentDetails) {
            if (obj instanceof ConsumerPaymentDetails.BankAccount) {
                arrayList.add(obj);
            }
        }
        ConsumerPaymentDetails.BankAccount bankAccount2 = (ConsumerPaymentDetails.BankAccount) CollectionsKt.first((List) arrayList);
        ElementsSessionContext elementsSessionContext3 = realCreateInstantDebitsResult.elementsSessionContext;
        LinkMode linkMode = elementsSessionContext3 != null ? elementsSessionContext3.getLinkMode() : null;
        if (linkMode == LinkMode.LinkCardBrand) {
            FinancialConnectionsConsumerSessionRepository financialConnectionsConsumerSessionRepository3 = realCreateInstantDebitsResult.consumerRepository;
            String id3 = bankAccount2.getId();
            String expectedPaymentMethodType = linkMode.getExpectedPaymentMethodType();
            ElementsSessionContext elementsSessionContext4 = realCreateInstantDebitsResult.elementsSessionContext;
            String phone = (elementsSessionContext4 == null || (billingDetails2 = elementsSessionContext4.getBillingDetails()) == null) ? null : billingDetails2.getPhone();
            anonymousClass12.L$0 = realCreateInstantDebitsResult;
            anonymousClass12.L$1 = clientSecret;
            anonymousClass12.L$2 = bankAccount2;
            anonymousClass12.label = 2;
            String str4 = clientSecret;
            Object objSharePaymentDetails = financialConnectionsConsumerSessionRepository3.sharePaymentDetails(id3, str4, expectedPaymentMethodType, phone, anonymousClass12);
            if (objSharePaymentDetails != coroutine_suspended) {
                bankAccount = bankAccount2;
                objCreatePaymentDetails = objSharePaymentDetails;
                str2 = str4;
                realCreateInstantDebitsResult2 = realCreateInstantDebitsResult;
                encodedPaymentMethod = ((SharePaymentDetails) objCreatePaymentDetails).getEncodedPaymentMethod();
                ElementsSessionContext elementsSessionContext222 = realCreateInstantDebitsResult2.elementsSessionContext;
                if (elementsSessionContext222 != null) {
                }
                return new InstantDebitsResult(encodedPaymentMethod, bankAccount.getLast4(), bankAccount.getBankName(), zBooleanValue);
            }
        } else {
            String str5 = clientSecret;
            FinancialConnectionsRepository financialConnectionsRepository = realCreateInstantDebitsResult.repository;
            String id4 = bankAccount2.getId();
            anonymousClass12.L$0 = realCreateInstantDebitsResult;
            anonymousClass12.L$1 = str5;
            anonymousClass12.L$2 = bankAccount2;
            anonymousClass12.label = 3;
            Object objCreatePaymentMethod = financialConnectionsRepository.createPaymentMethod(id4, str5, billingDetails, anonymousClass12);
            if (objCreatePaymentMethod != coroutine_suspended) {
                bankAccount = bankAccount2;
                objCreatePaymentDetails = objCreatePaymentMethod;
                str2 = str5;
                realCreateInstantDebitsResult2 = realCreateInstantDebitsResult;
                encodedPaymentMethod = (String) objCreatePaymentDetails;
                ElementsSessionContext elementsSessionContext2222 = realCreateInstantDebitsResult2.elementsSessionContext;
                if (elementsSessionContext2222 != null) {
                }
                return new InstantDebitsResult(encodedPaymentMethod, bankAccount.getLast4(), bankAccount.getBankName(), zBooleanValue);
            }
        }
        return coroutine_suspended;
    }
}
