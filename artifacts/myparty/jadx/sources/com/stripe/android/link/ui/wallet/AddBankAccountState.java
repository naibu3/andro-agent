package com.stripe.android.link.ui.wallet;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddBankAccountState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/link/ui/wallet/AddBankAccountState;", "", "Idle", "Processing", "Lcom/stripe/android/link/ui/wallet/AddBankAccountState$Idle;", "Lcom/stripe/android/link/ui/wallet/AddBankAccountState$Processing;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface AddBankAccountState {

    /* compiled from: AddBankAccountState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/link/ui/wallet/AddBankAccountState$Idle;", "Lcom/stripe/android/link/ui/wallet/AddBankAccountState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Idle implements AddBankAccountState {
        public static final int $stable = 0;
        public static final Idle INSTANCE = new Idle();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Idle)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 134792893;
        }

        public String toString() {
            return "Idle";
        }

        private Idle() {
        }
    }

    /* compiled from: AddBankAccountState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/link/ui/wallet/AddBankAccountState$Processing;", "Lcom/stripe/android/link/ui/wallet/AddBankAccountState;", "configToPresent", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "<init>", "(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;)V", "getConfigToPresent", "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Processing implements AddBankAccountState {
        public static final int $stable = 8;
        private final FinancialConnectionsSheetConfiguration configToPresent;

        /* JADX WARN: Multi-variable type inference failed */
        public Processing() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Processing copy$default(Processing processing, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, int i, Object obj) {
            if ((i & 1) != 0) {
                financialConnectionsSheetConfiguration = processing.configToPresent;
            }
            return processing.copy(financialConnectionsSheetConfiguration);
        }

        /* renamed from: component1, reason: from getter */
        public final FinancialConnectionsSheetConfiguration getConfigToPresent() {
            return this.configToPresent;
        }

        public final Processing copy(FinancialConnectionsSheetConfiguration configToPresent) {
            return new Processing(configToPresent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Processing) && Intrinsics.areEqual(this.configToPresent, ((Processing) other).configToPresent);
        }

        public int hashCode() {
            FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration = this.configToPresent;
            if (financialConnectionsSheetConfiguration == null) {
                return 0;
            }
            return financialConnectionsSheetConfiguration.hashCode();
        }

        public String toString() {
            return "Processing(configToPresent=" + this.configToPresent + ")";
        }

        public Processing(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration) {
            this.configToPresent = financialConnectionsSheetConfiguration;
        }

        public /* synthetic */ Processing(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : financialConnectionsSheetConfiguration);
        }

        public final FinancialConnectionsSheetConfiguration getConfigToPresent() {
            return this.configToPresent;
        }
    }
}
