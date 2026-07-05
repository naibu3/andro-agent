package com.stripe.android.financialconnections.domain;

import com.facebook.react.bridge.BaseJavaModule;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.exception.AccountLoadError;
import com.stripe.android.financialconnections.features.common.ManifestExtensionsKt;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.PartnerAccountsList;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository;
import com.stripe.android.financialconnections.utils.ErrorsKt;
import com.stripe.android.financialconnections.utils.PollTimingOptions;
import expo.modules.notifications.service.NotificationsService;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PollAuthorizationSessionAccounts.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086B¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;", "", "repository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "<init>", "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;)V", "invoke", "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;", "canRetry", "", BaseJavaModule.METHOD_TYPE_SYNC, "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "(ZLcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PollAuthorizationSessionAccounts {
    public static final int $stable = 8;
    private final FinancialConnectionsSheetConfiguration configuration;
    private final FinancialConnectionsAccountsRepository repository;

    /* compiled from: PollAuthorizationSessionAccounts.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.PollAuthorizationSessionAccounts", f = "PollAuthorizationSessionAccounts.kt", i = {0, 0}, l = {37}, m = "invoke", n = {BaseJavaModule.METHOD_TYPE_SYNC, "canRetry"}, s = {"L$0", "Z$0"})
    /* renamed from: com.stripe.android.financialconnections.domain.PollAuthorizationSessionAccounts$invoke$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PollAuthorizationSessionAccounts.this.invoke(false, null, this);
        }
    }

    @Inject
    public PollAuthorizationSessionAccounts(FinancialConnectionsAccountsRepository repository, FinancialConnectionsSheetConfiguration configuration) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.repository = repository;
        this.configuration = configuration;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(boolean z, SynchronizeSessionResponse synchronizeSessionResponse, Continuation<? super PartnerAccountsList> continuation) throws StripeException {
        AnonymousClass1 anonymousClass1;
        PollAuthorizationSessionAccounts pollAuthorizationSessionAccounts;
        boolean z2;
        SynchronizeSessionResponse synchronizeSessionResponse2;
        FinancialConnectionsAuthorizationSession.Flow next;
        SynchronizeSessionResponse synchronizeSessionResponse3;
        boolean z3;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
                pollAuthorizationSessionAccounts = this;
            } else {
                pollAuthorizationSessionAccounts = this;
                anonymousClass1 = pollAuthorizationSessionAccounts.new AnonymousClass1(continuation);
            }
        }
        Object objRetryOnException = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objRetryOnException);
            try {
                FinancialConnectionsSessionManifest manifest = synchronizeSessionResponse.getManifest();
                try {
                    if (manifest == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    FinancialConnectionsAuthorizationSession activeAuthSession = manifest.getActiveAuthSession();
                    if (activeAuthSession == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    Iterator<FinancialConnectionsAuthorizationSession.Flow> it = FinancialConnectionsAuthorizationSession.Flow.getEntries().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.areEqual(next.getValue(), activeAuthSession.getFlow())) {
                            break;
                        }
                    }
                    PollTimingOptions pollTimingOptions = new PollTimingOptions(PollAuthorizationSessionAccountsKt.toPollIntervalMs(next), 0, 0L, 6, null);
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(null);
                    AnonymousClass4 anonymousClass4 = pollAuthorizationSessionAccounts.new AnonymousClass4(activeAuthSession, manifest, synchronizeSessionResponse, z, null);
                    synchronizeSessionResponse2 = synchronizeSessionResponse;
                    try {
                        anonymousClass1.L$0 = synchronizeSessionResponse2;
                        anonymousClass1.Z$0 = z;
                        anonymousClass1.label = 1;
                        objRetryOnException = ErrorsKt.retryOnException(pollTimingOptions, anonymousClass3, anonymousClass4, anonymousClass1);
                        if (objRetryOnException == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        synchronizeSessionResponse3 = synchronizeSessionResponse2;
                        z3 = z;
                    } catch (StripeException e) {
                        e = e;
                        z2 = z;
                        throw PollAuthorizationSessionAccountsKt.toDomainException(e, synchronizeSessionResponse2.getManifest().getActiveInstitution(), ManifestExtensionsKt.getBusinessName(synchronizeSessionResponse2.getManifest()), z2, ManifestExtensionsKt.showManualEntryInErrors(synchronizeSessionResponse2));
                    }
                } catch (StripeException e2) {
                    e = e2;
                }
            } catch (StripeException e3) {
                e = e3;
                z2 = z;
                synchronizeSessionResponse2 = synchronizeSessionResponse;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z3 = anonymousClass1.Z$0;
            synchronizeSessionResponse3 = (SynchronizeSessionResponse) anonymousClass1.L$0;
            try {
                ResultKt.throwOnFailure(objRetryOnException);
            } catch (StripeException e4) {
                e = e4;
                synchronizeSessionResponse2 = synchronizeSessionResponse3;
                z2 = z3;
                throw PollAuthorizationSessionAccountsKt.toDomainException(e, synchronizeSessionResponse2.getManifest().getActiveInstitution(), ManifestExtensionsKt.getBusinessName(synchronizeSessionResponse2.getManifest()), z2, ManifestExtensionsKt.showManualEntryInErrors(synchronizeSessionResponse2));
            }
        }
        return (PartnerAccountsList) objRetryOnException;
    }

    /* compiled from: PollAuthorizationSessionAccounts.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", NotificationsService.EXCEPTION_KEY, ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.PollAuthorizationSessionAccounts$invoke$3", f = "PollAuthorizationSessionAccounts.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.domain.PollAuthorizationSessionAccounts$invoke$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<Throwable, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Throwable th, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass3) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
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

    /* compiled from: PollAuthorizationSessionAccounts.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.PollAuthorizationSessionAccounts$invoke$4", f = "PollAuthorizationSessionAccounts.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.domain.PollAuthorizationSessionAccounts$invoke$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements Function1<Continuation<? super PartnerAccountsList>, Object> {
        final /* synthetic */ FinancialConnectionsAuthorizationSession $activeAuthSession;
        final /* synthetic */ boolean $canRetry;
        final /* synthetic */ FinancialConnectionsSessionManifest $manifest;
        final /* synthetic */ SynchronizeSessionResponse $sync;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession, FinancialConnectionsSessionManifest financialConnectionsSessionManifest, SynchronizeSessionResponse synchronizeSessionResponse, boolean z, Continuation<? super AnonymousClass4> continuation) {
            super(1, continuation);
            this.$activeAuthSession = financialConnectionsAuthorizationSession;
            this.$manifest = financialConnectionsSessionManifest;
            this.$sync = synchronizeSessionResponse;
            this.$canRetry = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return PollAuthorizationSessionAccounts.this.new AnonymousClass4(this.$activeAuthSession, this.$manifest, this.$sync, this.$canRetry, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super PartnerAccountsList> continuation) {
            return ((AnonymousClass4) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws AccountLoadError {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = PollAuthorizationSessionAccounts.this.repository.postAuthorizationSessionAccounts(PollAuthorizationSessionAccounts.this.configuration.getFinancialConnectionsSessionClientSecret(), this.$activeAuthSession.getId(), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            PartnerAccountsList partnerAccountsList = (PartnerAccountsList) obj;
            if (!partnerAccountsList.getData().isEmpty()) {
                return partnerAccountsList;
            }
            FinancialConnectionsInstitution activeInstitution = this.$manifest.getActiveInstitution();
            if (activeInstitution == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new AccountLoadError(ManifestExtensionsKt.showManualEntryInErrors(this.$sync), this.$canRetry, activeInstitution, new APIException(null, null, 0, null, null, 31, null));
        }
    }
}
