package com.stripe.android.financialconnections.repository;

import androidx.lifecycle.SavedStateHandle;
import com.google.mlkit.common.MlKitException;
import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.domain.CachedPartnerAccount;
import com.stripe.android.financialconnections.domain.GetCachedAccountsKt;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import com.stripe.android.financialconnections.model.NetworkedAccountsList;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.model.PartnerAccountsList;
import com.stripe.android.financialconnections.model.PaymentAccountParams;
import com.stripe.android.financialconnections.model.ShareNetworkedAccountsResponse;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.network.NetworkConstants;
import com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* compiled from: FinancialConnectionsAccountsRepository.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000 42\u00020\u0001:\u00014B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0096@¢\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000fH\u0096@¢\u0006\u0002\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0002\u0010\u001cJ\u001e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001aH\u0096@¢\u0006\u0002\u0010\u001cJ6\u0010 \u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001a0#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096@¢\u0006\u0002\u0010&J(\u0010'\u001a\u00020(2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020*2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001aH\u0096@¢\u0006\u0002\u0010+J,\u0010,\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000fH\u0096@¢\u0006\u0002\u0010.J\u001c\u0010/\u001a\u00020\u00132\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001a0#H\u0096@¢\u0006\u0002\u00101J\u001e\u0010\u0012\u001a\u00020\u00132\u0006\u00102\u001a\u00020\u001a2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00150\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;", "requestExecutor", "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;", "provideApiRequestOptions", "Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;", "apiRequestFactory", "Lcom/stripe/android/core/networking/ApiRequest$Factory;", "logger", "Lcom/stripe/android/core/Logger;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/core/Logger;Landroidx/lifecycle/SavedStateHandle;)V", "getCachedAccounts", "", "Lcom/stripe/android/financialconnections/domain/CachedPartnerAccount;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCachedAccounts", "", "partnerAccountsList", "Lcom/stripe/android/financialconnections/model/PartnerAccount;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postAuthorizationSessionAccounts", "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;", "clientSecret", "", "sessionId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNetworkedAccounts", "Lcom/stripe/android/financialconnections/model/NetworkedAccountsList;", "consumerSessionClientSecret", "postShareNetworkedAccounts", "Lcom/stripe/android/financialconnections/model/ShareNetworkedAccountsResponse;", "selectedAccountIds", "", "consentAcquired", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postAttachPaymentAccountToLinkAccountSession", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "paymentAccount", "Lcom/stripe/android/financialconnections/model/PaymentAccountParams;", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/PaymentAccountParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postAuthorizationSessionSelectedAccounts", "selectAccounts", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pollAccountNumbers", "linkedAccounts", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "source", "accounts", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class FinancialConnectionsAccountsRepositoryImpl implements FinancialConnectionsAccountsRepository {
    private static final String CachedPartnerAccountsKey = "CachedPartnerAccounts";
    public static final String accountsSessionUrl = "https://api.stripe.com/v1/connections/auth_sessions/accounts";
    public static final String attachPaymentAccountUrl = "https://api.stripe.com/v1/link_account_sessions/attach_payment_account";
    public static final String authorizationSessionSelectedAccountsUrl = "https://api.stripe.com/v1/connections/auth_sessions/selected_accounts";
    public static final String networkedAccountsUrl = "https://api.stripe.com/v1/link_account_sessions/networked_accounts";
    public static final String pollAccountsNumbersUrl = "https://api.stripe.com/v1/link_account_sessions/poll_account_numbers";
    public static final String shareNetworkedAccountsUrl = "https://api.stripe.com/v1/link_account_sessions/share_networked_account";
    private final ApiRequest.Factory apiRequestFactory;
    private final Logger logger;
    private final ProvideApiRequestOptions provideApiRequestOptions;
    private final FinancialConnectionsRequestExecutor requestExecutor;
    private final SavedStateHandle savedStateHandle;

    /* compiled from: FinancialConnectionsAccountsRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepositoryImpl", f = "FinancialConnectionsAccountsRepository.kt", i = {0}, l = {141}, m = "getNetworkedAccounts", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepositoryImpl$getNetworkedAccounts$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinancialConnectionsAccountsRepositoryImpl.this.getNetworkedAccounts(null, null, this);
        }
    }

    /* compiled from: FinancialConnectionsAccountsRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepositoryImpl", f = "FinancialConnectionsAccountsRepository.kt", i = {0}, l = {120}, m = "postAuthorizationSessionAccounts", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1, reason: invalid class name and case insensitive filesystem */
    static final class C09921 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C09921(Continuation<? super C09921> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinancialConnectionsAccountsRepositoryImpl.this.postAuthorizationSessionAccounts(null, null, this);
        }
    }

    /* compiled from: FinancialConnectionsAccountsRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepositoryImpl", f = "FinancialConnectionsAccountsRepository.kt", i = {0}, l = {MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR}, m = "postAuthorizationSessionSelectedAccounts", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1, reason: invalid class name and case insensitive filesystem */
    static final class C09931 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C09931(Continuation<? super C09931> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinancialConnectionsAccountsRepositoryImpl.this.postAuthorizationSessionSelectedAccounts(null, null, null, this);
        }
    }

    public FinancialConnectionsAccountsRepositoryImpl(FinancialConnectionsRequestExecutor requestExecutor, ProvideApiRequestOptions provideApiRequestOptions, ApiRequest.Factory apiRequestFactory, Logger logger, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
        Intrinsics.checkNotNullParameter(provideApiRequestOptions, "provideApiRequestOptions");
        Intrinsics.checkNotNullParameter(apiRequestFactory, "apiRequestFactory");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.requestExecutor = requestExecutor;
        this.provideApiRequestOptions = provideApiRequestOptions;
        this.apiRequestFactory = apiRequestFactory;
        this.logger = logger;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository
    public Object getCachedAccounts(Continuation<? super List<CachedPartnerAccount>> continuation) {
        return this.savedStateHandle.get(CachedPartnerAccountsKey);
    }

    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository
    public Object updateCachedAccounts(List<PartnerAccount> list, Continuation<? super Unit> continuation) {
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        updateCachedAccounts("updateCachedAccounts", list);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object postAuthorizationSessionAccounts(String str, String str2, Continuation<? super PartnerAccountsList> continuation) throws InvalidRequestException, APIException, AuthenticationException {
        C09921 c09921;
        FinancialConnectionsAccountsRepositoryImpl financialConnectionsAccountsRepositoryImpl;
        if (continuation instanceof C09921) {
            c09921 = (C09921) continuation;
            if ((c09921.label & Integer.MIN_VALUE) != 0) {
                c09921.label -= Integer.MIN_VALUE;
            } else {
                c09921 = new C09921(continuation);
            }
        }
        Object objExecute = c09921.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c09921.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objExecute);
            ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, accountsSessionUrl, this.provideApiRequestOptions.invoke(true), MapsKt.mapOf(TuplesKt.to("id", str2), TuplesKt.to("client_secret", str), TuplesKt.to("expand", CollectionsKt.listOf("data.institution"))), false, 8, null);
            KSerializer<PartnerAccountsList> kSerializerSerializer = PartnerAccountsList.INSTANCE.serializer();
            c09921.L$0 = this;
            c09921.label = 1;
            objExecute = this.requestExecutor.execute(apiRequestCreatePost$default, kSerializerSerializer, c09921);
            if (objExecute == coroutine_suspended) {
                return coroutine_suspended;
            }
            financialConnectionsAccountsRepositoryImpl = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            financialConnectionsAccountsRepositoryImpl = (FinancialConnectionsAccountsRepositoryImpl) c09921.L$0;
            ResultKt.throwOnFailure(objExecute);
        }
        financialConnectionsAccountsRepositoryImpl.updateCachedAccounts("getOrFetchAccounts", ((PartnerAccountsList) objExecute).getData());
        return objExecute;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getNetworkedAccounts(String str, String str2, Continuation<? super NetworkedAccountsList> continuation) throws InvalidRequestException, APIException, AuthenticationException {
        AnonymousClass1 anonymousClass1;
        FinancialConnectionsAccountsRepositoryImpl financialConnectionsAccountsRepositoryImpl;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objExecute = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objExecute);
            ApiRequest apiRequestCreateGet$default = ApiRequest.Factory.createGet$default(this.apiRequestFactory, networkedAccountsUrl, this.provideApiRequestOptions.invoke(true), MapsKt.mapOf(TuplesKt.to("client_secret", str), TuplesKt.to(NetworkConstants.PARAMS_CONSUMER_CLIENT_SECRET, str2), TuplesKt.to("expand", CollectionsKt.listOf("data.institution"))), false, 8, null);
            KSerializer<NetworkedAccountsList> kSerializerSerializer = NetworkedAccountsList.INSTANCE.serializer();
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            objExecute = this.requestExecutor.execute(apiRequestCreateGet$default, kSerializerSerializer, anonymousClass1);
            if (objExecute == coroutine_suspended) {
                return coroutine_suspended;
            }
            financialConnectionsAccountsRepositoryImpl = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            financialConnectionsAccountsRepositoryImpl = (FinancialConnectionsAccountsRepositoryImpl) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objExecute);
        }
        financialConnectionsAccountsRepositoryImpl.updateCachedAccounts("getNetworkedAccounts", ((NetworkedAccountsList) objExecute).getData());
        return objExecute;
    }

    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository
    public Object postShareNetworkedAccounts(String str, String str2, Set<String> set, Boolean bool, Continuation<? super ShareNetworkedAccountsResponse> continuation) {
        ApiRequest.Factory factory = this.apiRequestFactory;
        ApiRequest.Options optionsInvoke = this.provideApiRequestOptions.invoke(true);
        int i = 0;
        Map mapFilterNotNullValues = com.stripe.android.financialconnections.utils.CollectionsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("client_secret", str), TuplesKt.to(NetworkConstants.PARAMS_CONSUMER_CLIENT_SECRET, str2), TuplesKt.to("consent_acquired", bool)));
        Set<String> set2 = set;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set2, 10));
        for (Object obj : set2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(TuplesKt.to("selected_accounts[" + i + "]", (String) obj));
            i = i2;
        }
        return this.requestExecutor.execute(ApiRequest.Factory.createPost$default(factory, shareNetworkedAccountsUrl, optionsInvoke, MapsKt.plus(mapFilterNotNullValues, arrayList), false, 8, null), ShareNetworkedAccountsResponse.INSTANCE.serializer(), continuation);
    }

    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository
    public Object postAttachPaymentAccountToLinkAccountSession(String str, PaymentAccountParams paymentAccountParams, String str2, Continuation<? super LinkAccountSessionPaymentAccount> continuation) {
        return this.requestExecutor.execute(ApiRequest.Factory.createPost$default(this.apiRequestFactory, attachPaymentAccountUrl, this.provideApiRequestOptions.invoke(true), MapsKt.plus(com.stripe.android.financialconnections.utils.CollectionsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to(NetworkConstants.PARAMS_CONSUMER_CLIENT_SECRET, str2), TuplesKt.to("client_secret", str))), paymentAccountParams.toParamMap()), false, 8, null), LinkAccountSessionPaymentAccount.INSTANCE.serializer(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object postAuthorizationSessionSelectedAccounts(String str, String str2, List<String> list, Continuation<? super PartnerAccountsList> continuation) throws InvalidRequestException, APIException, AuthenticationException {
        C09931 c09931;
        FinancialConnectionsAccountsRepositoryImpl financialConnectionsAccountsRepositoryImpl;
        if (continuation instanceof C09931) {
            c09931 = (C09931) continuation;
            if ((c09931.label & Integer.MIN_VALUE) != 0) {
                c09931.label -= Integer.MIN_VALUE;
            } else {
                c09931 = new C09931(continuation);
            }
        }
        Object objExecute = c09931.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c09931.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objExecute);
            ApiRequest.Factory factory = this.apiRequestFactory;
            ApiRequest.Options optionsInvoke = this.provideApiRequestOptions.invoke(true);
            int i2 = 0;
            Map mapMapOf = MapsKt.mapOf(TuplesKt.to("id", str2), TuplesKt.to("client_secret", str), TuplesKt.to("expand", CollectionsKt.listOf("data.institution")));
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (Object obj : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(TuplesKt.to("selected_accounts[" + i2 + "]", (String) obj));
                i2 = i3;
            }
            ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(factory, authorizationSessionSelectedAccountsUrl, optionsInvoke, MapsKt.plus(mapMapOf, arrayList), false, 8, null);
            KSerializer<PartnerAccountsList> kSerializerSerializer = PartnerAccountsList.INSTANCE.serializer();
            c09931.L$0 = this;
            c09931.label = 1;
            objExecute = this.requestExecutor.execute(apiRequestCreatePost$default, kSerializerSerializer, c09931);
            if (objExecute == coroutine_suspended) {
                return coroutine_suspended;
            }
            financialConnectionsAccountsRepositoryImpl = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            financialConnectionsAccountsRepositoryImpl = (FinancialConnectionsAccountsRepositoryImpl) c09931.L$0;
            ResultKt.throwOnFailure(objExecute);
        }
        financialConnectionsAccountsRepositoryImpl.updateCachedAccounts("postAuthorizationSessionSelectedAccounts", ((PartnerAccountsList) objExecute).getData());
        return objExecute;
    }

    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository
    public Object pollAccountNumbers(Set<String> set, Continuation<? super Unit> continuation) throws InvalidRequestException, APIException, AuthenticationException {
        Set<String> set2 = set;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set2, 10));
        int i = 0;
        for (Object obj : set2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(TuplesKt.to("linked_accounts[" + i + "]", (String) obj));
            i = i2;
        }
        Object objExecute = this.requestExecutor.execute(ApiRequest.Factory.createGet$default(this.apiRequestFactory, pollAccountsNumbersUrl, this.provideApiRequestOptions.invoke(false), MapsKt.toMap(arrayList), false, 8, null), continuation);
        return objExecute == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objExecute : Unit.INSTANCE;
    }

    private final void updateCachedAccounts(String source, List<PartnerAccount> accounts) {
        this.logger.debug("updating local partner accounts from " + source);
        this.savedStateHandle.set(CachedPartnerAccountsKey, GetCachedAccountsKt.toCachedPartnerAccounts(accounts));
    }
}
