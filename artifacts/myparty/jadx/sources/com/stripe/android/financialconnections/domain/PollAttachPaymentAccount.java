package com.stripe.android.financialconnections.domain;

import com.facebook.internal.NativeProtocol;
import com.facebook.react.bridge.BaseJavaModule;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.exception.AccountNumberRetrievalError;
import com.stripe.android.financialconnections.features.common.ManifestExtensionsKt;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import com.stripe.android.financialconnections.model.PaymentAccountParams;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.repository.AttachedPaymentAccountRepository;
import com.stripe.android.financialconnections.repository.CachedConsumerSession;
import com.stripe.android.financialconnections.repository.ConsumerSessionProvider;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository;
import com.stripe.android.financialconnections.utils.ErrorsKt;
import com.stripe.android.financialconnections.utils.PollTimingOptions;
import expo.modules.notifications.service.NotificationsService;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* compiled from: PollAttachPaymentAccount.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0086B¢\u0006\u0002\u0010\u0014J\u001e\u0010\u0015\u001a\u00020\u0016*\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;", "", "repository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;", "consumerSessionProvider", "Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;", "attachedPaymentAccountRepository", "Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "<init>", "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;)V", "invoke", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", BaseJavaModule.METHOD_TYPE_SYNC, "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "activeInstitution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/stripe/android/financialconnections/model/PaymentAccountParams;", "(Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/PaymentAccountParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toDomainException", "Lcom/stripe/android/core/exception/StripeException;", "institution", "showManualEntry", "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PollAttachPaymentAccount {
    public static final int $stable = 8;
    private final AttachedPaymentAccountRepository attachedPaymentAccountRepository;
    private final FinancialConnectionsSheetConfiguration configuration;
    private final ConsumerSessionProvider consumerSessionProvider;
    private final FinancialConnectionsAccountsRepository repository;

    @Inject
    public PollAttachPaymentAccount(FinancialConnectionsAccountsRepository repository, ConsumerSessionProvider consumerSessionProvider, AttachedPaymentAccountRepository attachedPaymentAccountRepository, FinancialConnectionsSheetConfiguration configuration) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(consumerSessionProvider, "consumerSessionProvider");
        Intrinsics.checkNotNullParameter(attachedPaymentAccountRepository, "attachedPaymentAccountRepository");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.repository = repository;
        this.consumerSessionProvider = consumerSessionProvider;
        this.attachedPaymentAccountRepository = attachedPaymentAccountRepository;
        this.configuration = configuration;
    }

    public final Object invoke(SynchronizeSessionResponse synchronizeSessionResponse, FinancialConnectionsInstitution financialConnectionsInstitution, PaymentAccountParams paymentAccountParams, Continuation<? super LinkAccountSessionPaymentAccount> continuation) {
        Duration.Companion companion = Duration.INSTANCE;
        return ErrorsKt.retryOnException(new PollTimingOptions(Duration.m10493getInWholeMillisecondsimpl(DurationKt.toDuration(1, DurationUnit.SECONDS)), 0, 0L, 6, null), new AnonymousClass2(null), new AnonymousClass3(paymentAccountParams, financialConnectionsInstitution, synchronizeSessionResponse, null), continuation);
    }

    /* compiled from: PollAttachPaymentAccount.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", NotificationsService.EXCEPTION_KEY, ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.PollAttachPaymentAccount$invoke$2", f = "PollAttachPaymentAccount.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.domain.PollAttachPaymentAccount$invoke$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<Throwable, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Throwable th, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass2) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(ErrorsKt.getShouldRetry((Throwable) this.L$0));
        }
    }

    /* compiled from: PollAttachPaymentAccount.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.PollAttachPaymentAccount$invoke$3", f = "PollAttachPaymentAccount.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.domain.PollAttachPaymentAccount$invoke$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function1<Continuation<? super LinkAccountSessionPaymentAccount>, Object> {
        final /* synthetic */ FinancialConnectionsInstitution $activeInstitution;
        final /* synthetic */ PaymentAccountParams $params;
        final /* synthetic */ SynchronizeSessionResponse $sync;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(PaymentAccountParams paymentAccountParams, FinancialConnectionsInstitution financialConnectionsInstitution, SynchronizeSessionResponse synchronizeSessionResponse, Continuation<? super AnonymousClass3> continuation) {
            super(1, continuation);
            this.$params = paymentAccountParams;
            this.$activeInstitution = financialConnectionsInstitution;
            this.$sync = synchronizeSessionResponse;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return PollAttachPaymentAccount.this.new AnonymousClass3(this.$params, this.$activeInstitution, this.$sync, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super LinkAccountSessionPaymentAccount> continuation) {
            return ((AnonymousClass3) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws StripeException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    FinancialConnectionsAccountsRepository financialConnectionsAccountsRepository = PollAttachPaymentAccount.this.repository;
                    String financialConnectionsSessionClientSecret = PollAttachPaymentAccount.this.configuration.getFinancialConnectionsSessionClientSecret();
                    PaymentAccountParams paymentAccountParams = this.$params;
                    CachedConsumerSession cachedConsumerSessionProvideConsumerSession = PollAttachPaymentAccount.this.consumerSessionProvider.provideConsumerSession();
                    String clientSecret = cachedConsumerSessionProvideConsumerSession != null ? cachedConsumerSessionProvideConsumerSession.getClientSecret() : null;
                    this.label = 1;
                    obj = financialConnectionsAccountsRepository.postAttachPaymentAccountToLinkAccountSession(financialConnectionsSessionClientSecret, paymentAccountParams, clientSecret, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                PollAttachPaymentAccount.this.attachedPaymentAccountRepository.set(this.$params);
                return (LinkAccountSessionPaymentAccount) obj;
            } catch (StripeException e) {
                throw PollAttachPaymentAccount.this.toDomainException(e, this.$activeInstitution, ManifestExtensionsKt.showManualEntryInErrors(this.$sync));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StripeException toDomainException(StripeException stripeException, FinancialConnectionsInstitution financialConnectionsInstitution, boolean z) {
        Map<String, String> extraFields;
        if (financialConnectionsInstitution != null) {
            StripeError stripeError = stripeException.getStripeError();
            if (Intrinsics.areEqual((stripeError == null || (extraFields = stripeError.getExtraFields()) == null) ? null : extraFields.get("reason"), "account_number_retrieval_failed")) {
                return new AccountNumberRetrievalError(z, financialConnectionsInstitution, stripeException);
            }
        }
        return stripeException;
    }
}
