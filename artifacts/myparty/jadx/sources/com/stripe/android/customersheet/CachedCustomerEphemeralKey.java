package com.stripe.android.customersheet;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.customersheet.CustomerAdapter;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeCustomerAdapter.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/customersheet/CachedCustomerEphemeralKey;", "", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/customersheet/CustomerAdapter$Result;", "Lcom/stripe/android/customersheet/CustomerEphemeralKey;", "date", "", "<init>", "(Lcom/stripe/android/customersheet/CustomerAdapter$Result;J)V", "getResult", "()Lcom/stripe/android/customersheet/CustomerAdapter$Result;", "getDate", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* data */ class CachedCustomerEphemeralKey {
    private final long date;
    private final CustomerAdapter.Result<CustomerEphemeralKey> result;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CachedCustomerEphemeralKey copy$default(CachedCustomerEphemeralKey cachedCustomerEphemeralKey, CustomerAdapter.Result result, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            result = cachedCustomerEphemeralKey.result;
        }
        if ((i & 2) != 0) {
            j = cachedCustomerEphemeralKey.date;
        }
        return cachedCustomerEphemeralKey.copy(result, j);
    }

    public final CustomerAdapter.Result<CustomerEphemeralKey> component1() {
        return this.result;
    }

    /* renamed from: component2, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    public final CachedCustomerEphemeralKey copy(CustomerAdapter.Result<CustomerEphemeralKey> result, long date) {
        Intrinsics.checkNotNullParameter(result, "result");
        return new CachedCustomerEphemeralKey(result, date);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CachedCustomerEphemeralKey)) {
            return false;
        }
        CachedCustomerEphemeralKey cachedCustomerEphemeralKey = (CachedCustomerEphemeralKey) other;
        return Intrinsics.areEqual(this.result, cachedCustomerEphemeralKey.result) && this.date == cachedCustomerEphemeralKey.date;
    }

    public int hashCode() {
        return (this.result.hashCode() * 31) + Long.hashCode(this.date);
    }

    public String toString() {
        return "CachedCustomerEphemeralKey(result=" + this.result + ", date=" + this.date + ")";
    }

    public CachedCustomerEphemeralKey(CustomerAdapter.Result<CustomerEphemeralKey> result, long j) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.result = result;
        this.date = j;
    }

    public final CustomerAdapter.Result<CustomerEphemeralKey> getResult() {
        return this.result;
    }

    public final long getDate() {
        return this.date;
    }
}
