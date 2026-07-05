package com.stripe.android.customersheet;

import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;

/* compiled from: CustomerSheetResultCallback.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheetResultCallback;", "", "onCustomerSheetResult", "", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/customersheet/CustomerSheetResult;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface CustomerSheetResultCallback {
    void onCustomerSheetResult(CustomerSheetResult result);
}
