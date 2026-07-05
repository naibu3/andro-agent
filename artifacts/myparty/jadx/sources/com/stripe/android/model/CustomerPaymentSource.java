package com.stripe.android.model;

import com.stripe.android.core.model.StripeModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: CustomerSource.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/model/CustomerPaymentSource;", "Lcom/stripe/android/core/model/StripeModel;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "tokenizationMethod", "Lcom/stripe/android/model/TokenizationMethod;", "getTokenizationMethod", "()Lcom/stripe/android/model/TokenizationMethod;", "Lcom/stripe/android/model/CustomerBankAccount;", "Lcom/stripe/android/model/CustomerCard;", "Lcom/stripe/android/model/CustomerSource;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class CustomerPaymentSource implements StripeModel {
    public static final int $stable = 0;

    public /* synthetic */ CustomerPaymentSource(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getId();

    public abstract TokenizationMethod getTokenizationMethod();

    private CustomerPaymentSource() {
    }
}
