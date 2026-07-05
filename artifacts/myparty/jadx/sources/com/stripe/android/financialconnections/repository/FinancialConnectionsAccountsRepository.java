package com.stripe.android.financialconnections.repository;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.domain.CachedPartnerAccount;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import com.stripe.android.financialconnections.model.NetworkedAccountsList;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.model.PartnerAccountsList;
import com.stripe.android.financialconnections.model.PaymentAccountParams;
import com.stripe.android.financialconnections.model.ShareNetworkedAccountsResponse;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsAccountsRepository.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b`\u0018\u0000 &2\u00020\u0001:\u0001&J\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H¦@¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003H¦@¢\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH¦@¢\u0006\u0002\u0010\u0010J(\u0010\u0014\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH¦@¢\u0006\u0002\u0010\u0018J,\u0010\u0019\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003H¦@¢\u0006\u0002\u0010\u001bJ6\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H¦@¢\u0006\u0002\u0010\"J\u001c\u0010#\u001a\u00020\u00072\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001fH¦@¢\u0006\u0002\u0010%¨\u0006'"}, d2 = {"Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;", "", "getCachedAccounts", "", "Lcom/stripe/android/financialconnections/domain/CachedPartnerAccount;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCachedAccounts", "", "partnerAccountsList", "Lcom/stripe/android/financialconnections/model/PartnerAccount;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postAuthorizationSessionAccounts", "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;", "clientSecret", "", "sessionId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNetworkedAccounts", "Lcom/stripe/android/financialconnections/model/NetworkedAccountsList;", "consumerSessionClientSecret", "postAttachPaymentAccountToLinkAccountSession", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "paymentAccount", "Lcom/stripe/android/financialconnections/model/PaymentAccountParams;", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/PaymentAccountParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postAuthorizationSessionSelectedAccounts", "selectAccounts", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postShareNetworkedAccounts", "Lcom/stripe/android/financialconnections/model/ShareNetworkedAccountsResponse;", "selectedAccountIds", "", "consentAcquired", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pollAccountNumbers", "linkedAccounts", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface FinancialConnectionsAccountsRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Object getCachedAccounts(Continuation<? super List<CachedPartnerAccount>> continuation);

    Object getNetworkedAccounts(String str, String str2, Continuation<? super NetworkedAccountsList> continuation);

    Object pollAccountNumbers(Set<String> set, Continuation<? super Unit> continuation);

    Object postAttachPaymentAccountToLinkAccountSession(String str, PaymentAccountParams paymentAccountParams, String str2, Continuation<? super LinkAccountSessionPaymentAccount> continuation);

    Object postAuthorizationSessionAccounts(String str, String str2, Continuation<? super PartnerAccountsList> continuation);

    Object postAuthorizationSessionSelectedAccounts(String str, String str2, List<String> list, Continuation<? super PartnerAccountsList> continuation);

    Object postShareNetworkedAccounts(String str, String str2, Set<String> set, Boolean bool, Continuation<? super ShareNetworkedAccountsResponse> continuation);

    Object updateCachedAccounts(List<PartnerAccount> list, Continuation<? super Unit> continuation);

    /* compiled from: FinancialConnectionsAccountsRepository.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\u0002¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository$Companion;", "", "<init>", "()V", "invoke", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;", "requestExecutor", "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;", "provideApiRequestOptions", "Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;", "apiRequestFactory", "Lcom/stripe/android/core/networking/ApiRequest$Factory;", "logger", "Lcom/stripe/android/core/Logger;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final FinancialConnectionsAccountsRepository invoke(FinancialConnectionsRequestExecutor requestExecutor, ProvideApiRequestOptions provideApiRequestOptions, ApiRequest.Factory apiRequestFactory, Logger logger, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
            Intrinsics.checkNotNullParameter(provideApiRequestOptions, "provideApiRequestOptions");
            Intrinsics.checkNotNullParameter(apiRequestFactory, "apiRequestFactory");
            Intrinsics.checkNotNullParameter(logger, "logger");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new FinancialConnectionsAccountsRepositoryImpl(requestExecutor, provideApiRequestOptions, apiRequestFactory, logger, savedStateHandle);
        }
    }
}
