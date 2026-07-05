package com.stripe.android.financialconnections.repository;

import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccountList;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.model.GetFinancialConnectionsAcccountsParams;
import com.stripe.android.financialconnections.model.MixedOAuthParams;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: FinancialConnectionsRepository.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH¦@¢\u0006\u0002\u0010\u000bJ \u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\nH¦@¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH¦@¢\u0006\u0002\u0010\u000eJ(\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H¦@¢\u0006\u0002\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;", "", "getFinancialConnectionsAccounts", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;", "getFinancialConnectionsAcccountsParams", "Lcom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams;", "(Lcom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFinancialConnectionsSession", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "clientSecret", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postCompleteFinancialConnectionsSessions", "terminalError", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postAuthorizationSessionOAuthResults", "Lcom/stripe/android/financialconnections/model/MixedOAuthParams;", "sessionId", "createPaymentMethod", "paymentDetailsId", "consumerSessionClientSecret", "billingDetails", "Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface FinancialConnectionsRepository {
    Object createPaymentMethod(String str, String str2, ElementsSessionContext.BillingDetails billingDetails, Continuation<? super String> continuation);

    Object getFinancialConnectionsAccounts(GetFinancialConnectionsAcccountsParams getFinancialConnectionsAcccountsParams, Continuation<? super FinancialConnectionsAccountList> continuation) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException;

    Object getFinancialConnectionsSession(String str, Continuation<? super FinancialConnectionsSession> continuation) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException;

    Object postAuthorizationSessionOAuthResults(String str, String str2, Continuation<? super MixedOAuthParams> continuation);

    Object postCompleteFinancialConnectionsSessions(String str, String str2, Continuation<? super FinancialConnectionsSession> continuation) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException;
}
