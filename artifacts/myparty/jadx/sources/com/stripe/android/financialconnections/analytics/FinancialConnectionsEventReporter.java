package com.stripe.android.financialconnections.analytics;

import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import kotlin.Metadata;

/* compiled from: FinancialConnectionsEventReporter.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;", "", "onPresented", "", "onResult", "sessionId", "", "financialConnectionsSheetResult", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface FinancialConnectionsEventReporter {
    void onPresented();

    void onResult(String sessionId, FinancialConnectionsSheetActivityResult financialConnectionsSheetResult);
}
