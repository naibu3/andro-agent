package com.stripe.android.link.ui.wallet;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.link.ui.menu.LinkMenuItem;
import com.stripe.android.payments.financialconnections.FinancialConnectionsAvailability;
import com.stripe.android.ui.core.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddPaymentMethodOption.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000e\u0082\u0001\u0002\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption;", "Lcom/stripe/android/link/ui/menu/LinkMenuItem;", "testTag", "", "text", "Lcom/stripe/android/core/strings/ResolvableString;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;)V", "getTestTag", "()Ljava/lang/String;", "getText", "()Lcom/stripe/android/core/strings/ResolvableString;", "isDestructive", "", "()Z", "Bank", "Card", "Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Bank;", "Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Card;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AddPaymentMethodOption implements LinkMenuItem {
    public static final int $stable = 8;
    private final String testTag;
    private final ResolvableString text;

    public /* synthetic */ AddPaymentMethodOption(String str, ResolvableString resolvableString, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, resolvableString);
    }

    @Override // com.stripe.android.link.ui.menu.LinkMenuItem
    /* renamed from: isDestructive */
    public boolean getIsDestructive() {
        return false;
    }

    private AddPaymentMethodOption(String str, ResolvableString resolvableString) {
        this.testTag = str;
        this.text = resolvableString;
    }

    @Override // com.stripe.android.link.ui.menu.LinkMenuItem
    public String getTestTag() {
        return this.testTag;
    }

    @Override // com.stripe.android.link.ui.menu.LinkMenuItem
    public ResolvableString getText() {
        return this.text;
    }

    /* compiled from: AddPaymentMethodOption.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Bank;", "Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption;", "financialConnectionsAvailability", "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;", "<init>", "(Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;)V", "getFinancialConnectionsAvailability", "()Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Bank extends AddPaymentMethodOption {
        public static final int $stable = 0;
        private final FinancialConnectionsAvailability financialConnectionsAvailability;

        public static /* synthetic */ Bank copy$default(Bank bank, FinancialConnectionsAvailability financialConnectionsAvailability, int i, Object obj) {
            if ((i & 1) != 0) {
                financialConnectionsAvailability = bank.financialConnectionsAvailability;
            }
            return bank.copy(financialConnectionsAvailability);
        }

        /* renamed from: component1, reason: from getter */
        public final FinancialConnectionsAvailability getFinancialConnectionsAvailability() {
            return this.financialConnectionsAvailability;
        }

        public final Bank copy(FinancialConnectionsAvailability financialConnectionsAvailability) {
            Intrinsics.checkNotNullParameter(financialConnectionsAvailability, "financialConnectionsAvailability");
            return new Bank(financialConnectionsAvailability);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Bank) && this.financialConnectionsAvailability == ((Bank) other).financialConnectionsAvailability;
        }

        public int hashCode() {
            return this.financialConnectionsAvailability.hashCode();
        }

        public String toString() {
            return "Bank(financialConnectionsAvailability=" + this.financialConnectionsAvailability + ")";
        }

        public final FinancialConnectionsAvailability getFinancialConnectionsAvailability() {
            return this.financialConnectionsAvailability;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Bank(FinancialConnectionsAvailability financialConnectionsAvailability) {
            Intrinsics.checkNotNullParameter(financialConnectionsAvailability, "financialConnectionsAvailability");
            String str = "Bank";
            super(str, ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_payment_method_bank, new Object[0], null, 4, null), null);
            this.financialConnectionsAvailability = financialConnectionsAvailability;
        }
    }

    /* compiled from: AddPaymentMethodOption.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Card;", "Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Card extends AddPaymentMethodOption {
        public static final int $stable = 0;
        public static final Card INSTANCE = new Card();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Card)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1529239097;
        }

        public String toString() {
            return "Card";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private Card() {
            String str = "DebitOrCreditCard";
            super(str, ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_payment_method_debit_or_credit_card, new Object[0], null, 4, null), null);
        }
    }
}
