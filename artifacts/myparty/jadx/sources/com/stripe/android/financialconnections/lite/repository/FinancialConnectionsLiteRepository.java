package com.stripe.android.financialconnections.lite.repository;

import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.di.NamedConstantsKt;
import com.stripe.android.financialconnections.lite.repository.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

/* compiled from: FinancialConnectionsLiteRepository.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH¦@¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepository;", "", "synchronize", "Lkotlin/Result;", "Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", NamedConstantsKt.APPLICATION_ID, "", "synchronize-0E7RQCE", "(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFinancialConnectionsSession", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "getFinancialConnectionsSession-gIAlu-s", "(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections-lite_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface FinancialConnectionsLiteRepository {
    /* renamed from: getFinancialConnectionsSession-gIAlu-s, reason: not valid java name */
    Object mo7506getFinancialConnectionsSessiongIAlus(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, Continuation<? super Result<FinancialConnectionsSession>> continuation);

    /* renamed from: synchronize-0E7RQCE, reason: not valid java name */
    Object mo7507synchronize0E7RQCE(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, String str, Continuation<? super Result<SynchronizeSessionResponse>> continuation);
}
