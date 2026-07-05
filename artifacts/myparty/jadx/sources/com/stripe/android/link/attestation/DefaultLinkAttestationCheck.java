package com.stripe.android.link.attestation;

import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.account.LinkAuth;
import com.stripe.android.link.account.LinkAuthResult;
import com.stripe.android.link.attestation.LinkAttestationCheck;
import com.stripe.android.link.gate.LinkGate;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.model.EmailSource;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.attestation.IntegrityRequestManager;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DefaultLinkAttestationCheck.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u0013H\u0096@¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck;", "Lcom/stripe/android/link/attestation/LinkAttestationCheck;", "linkGate", "Lcom/stripe/android/link/gate/LinkGate;", "linkAuth", "Lcom/stripe/android/link/account/LinkAuth;", "integrityRequestManager", "Lcom/stripe/attestation/IntegrityRequestManager;", "linkAccountManager", "Lcom/stripe/android/link/account/LinkAccountManager;", "linkConfiguration", "Lcom/stripe/android/link/LinkConfiguration;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lcom/stripe/android/link/gate/LinkGate;Lcom/stripe/android/link/account/LinkAuth;Lcom/stripe/attestation/IntegrityRequestManager;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V", "invoke", "Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleLookupResult", "lookupResult", "Lcom/stripe/android/link/account/LinkAuthResult;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultLinkAttestationCheck implements LinkAttestationCheck {
    public static final int $stable = 8;
    private final ErrorReporter errorReporter;
    private final IntegrityRequestManager integrityRequestManager;
    private final LinkAccountManager linkAccountManager;
    private final LinkAuth linkAuth;
    private final LinkConfiguration linkConfiguration;
    private final LinkGate linkGate;
    private final CoroutineContext workContext;

    @Inject
    public DefaultLinkAttestationCheck(LinkGate linkGate, LinkAuth linkAuth, IntegrityRequestManager integrityRequestManager, LinkAccountManager linkAccountManager, LinkConfiguration linkConfiguration, ErrorReporter errorReporter, @IOContext CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(linkGate, "linkGate");
        Intrinsics.checkNotNullParameter(linkAuth, "linkAuth");
        Intrinsics.checkNotNullParameter(integrityRequestManager, "integrityRequestManager");
        Intrinsics.checkNotNullParameter(linkAccountManager, "linkAccountManager");
        Intrinsics.checkNotNullParameter(linkConfiguration, "linkConfiguration");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.linkGate = linkGate;
        this.linkAuth = linkAuth;
        this.integrityRequestManager = integrityRequestManager;
        this.linkAccountManager = linkAccountManager;
        this.linkConfiguration = linkConfiguration;
        this.errorReporter = errorReporter;
        this.workContext = workContext;
    }

    /* compiled from: DefaultLinkAttestationCheck.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.attestation.DefaultLinkAttestationCheck$invoke$2", f = "DefaultLinkAttestationCheck.kt", i = {}, l = {29, 35}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.link.attestation.DefaultLinkAttestationCheck$invoke$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LinkAttestationCheck.Result>, Object> {
        Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultLinkAttestationCheck.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LinkAttestationCheck.Result> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objMo8934prepareIoAF18A;
            String email;
            DefaultLinkAttestationCheck defaultLinkAttestationCheck;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objMo8934prepareIoAF18A = DefaultLinkAttestationCheck.this.integrityRequestManager.mo8934prepareIoAF18A(this);
                if (objMo8934prepareIoAF18A != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defaultLinkAttestationCheck = (DefaultLinkAttestationCheck) this.L$0;
                ResultKt.throwOnFailure(obj);
                return defaultLinkAttestationCheck.handleLookupResult((LinkAuthResult) obj);
            }
            ResultKt.throwOnFailure(obj);
            objMo8934prepareIoAF18A = ((Result) obj).getValue();
            DefaultLinkAttestationCheck defaultLinkAttestationCheck2 = DefaultLinkAttestationCheck.this;
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8934prepareIoAF18A);
            if (thM9121exceptionOrNullimpl == null) {
                LinkAccount account = defaultLinkAttestationCheck2.linkAccountManager.getLinkAccountInfo().getValue().getAccount();
                if (account == null || (email = account.getEmail()) == null) {
                    email = defaultLinkAttestationCheck2.linkConfiguration.getCustomerInfo().getEmail();
                }
                String str = email;
                if (str != null) {
                    LinkAuth linkAuth = defaultLinkAttestationCheck2.linkAuth;
                    EmailSource emailSource = EmailSource.CUSTOMER_OBJECT;
                    String customerIdForEceDefaultValues = defaultLinkAttestationCheck2.linkConfiguration.getCustomerIdForEceDefaultValues();
                    this.L$0 = defaultLinkAttestationCheck2;
                    this.label = 2;
                    obj = linkAuth.lookUp(str, emailSource, false, customerIdForEceDefaultValues, this);
                    if (obj != coroutine_suspended) {
                        defaultLinkAttestationCheck = defaultLinkAttestationCheck2;
                        return defaultLinkAttestationCheck.handleLookupResult((LinkAuthResult) obj);
                    }
                    return coroutine_suspended;
                }
                return LinkAttestationCheck.Result.Successful.INSTANCE;
            }
            ErrorReporter.DefaultImpls.report$default(defaultLinkAttestationCheck2.errorReporter, ErrorReporter.ExpectedErrorEvent.LINK_NATIVE_FAILED_TO_PREPARE_INTEGRITY_MANAGER, StripeException.INSTANCE.create(thM9121exceptionOrNullimpl), null, 4, null);
            return new LinkAttestationCheck.Result.AttestationFailed(thM9121exceptionOrNullimpl);
        }
    }

    @Override // com.stripe.android.link.attestation.LinkAttestationCheck
    public Object invoke(Continuation<? super LinkAttestationCheck.Result> continuation) {
        return !this.linkGate.getUseAttestationEndpoints() ? LinkAttestationCheck.Result.Successful.INSTANCE : BuildersKt.withContext(this.workContext, new AnonymousClass2(null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinkAttestationCheck.Result handleLookupResult(LinkAuthResult lookupResult) {
        if (lookupResult instanceof LinkAuthResult.AttestationFailed) {
            return new LinkAttestationCheck.Result.AttestationFailed(((LinkAuthResult.AttestationFailed) lookupResult).getError());
        }
        if (lookupResult instanceof LinkAuthResult.Error) {
            return new LinkAttestationCheck.Result.Error(((LinkAuthResult.Error) lookupResult).getError());
        }
        if (lookupResult instanceof LinkAuthResult.AccountError) {
            return new LinkAttestationCheck.Result.AccountError(((LinkAuthResult.AccountError) lookupResult).getError());
        }
        if (!Intrinsics.areEqual(lookupResult, LinkAuthResult.NoLinkAccountFound.INSTANCE) && !(lookupResult instanceof LinkAuthResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        return LinkAttestationCheck.Result.Successful.INSTANCE;
    }
}
