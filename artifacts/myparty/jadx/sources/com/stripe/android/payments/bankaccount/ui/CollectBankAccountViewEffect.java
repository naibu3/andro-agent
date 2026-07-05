package com.stripe.android.payments.bankaccount.ui;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResultInternal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollectBankAccountViewEffect.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;", "", "<init>", "()V", "OpenConnectionsFlow", "FinishWithResult", "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$FinishWithResult;", "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class CollectBankAccountViewEffect {
    public static final int $stable = 0;

    public /* synthetic */ CollectBankAccountViewEffect(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CollectBankAccountViewEffect() {
    }

    /* compiled from: CollectBankAccountViewEffect.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;", "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;", "publishableKey", "", "financialConnectionsSessionSecret", NamedConstantsKt.STRIPE_ACCOUNT_ID, "elementsSessionContext", "Lcom/stripe/android/financialconnections/ElementsSessionContext;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/ElementsSessionContext;)V", "getPublishableKey", "()Ljava/lang/String;", "getFinancialConnectionsSessionSecret", "getStripeAccountId", "getElementsSessionContext", "()Lcom/stripe/android/financialconnections/ElementsSessionContext;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OpenConnectionsFlow extends CollectBankAccountViewEffect {
        public static final int $stable = 8;
        private final ElementsSessionContext elementsSessionContext;
        private final String financialConnectionsSessionSecret;
        private final String publishableKey;
        private final String stripeAccountId;

        public static /* synthetic */ OpenConnectionsFlow copy$default(OpenConnectionsFlow openConnectionsFlow, String str, String str2, String str3, ElementsSessionContext elementsSessionContext, int i, Object obj) {
            if ((i & 1) != 0) {
                str = openConnectionsFlow.publishableKey;
            }
            if ((i & 2) != 0) {
                str2 = openConnectionsFlow.financialConnectionsSessionSecret;
            }
            if ((i & 4) != 0) {
                str3 = openConnectionsFlow.stripeAccountId;
            }
            if ((i & 8) != 0) {
                elementsSessionContext = openConnectionsFlow.elementsSessionContext;
            }
            return openConnectionsFlow.copy(str, str2, str3, elementsSessionContext);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPublishableKey() {
            return this.publishableKey;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFinancialConnectionsSessionSecret() {
            return this.financialConnectionsSessionSecret;
        }

        /* renamed from: component3, reason: from getter */
        public final String getStripeAccountId() {
            return this.stripeAccountId;
        }

        /* renamed from: component4, reason: from getter */
        public final ElementsSessionContext getElementsSessionContext() {
            return this.elementsSessionContext;
        }

        public final OpenConnectionsFlow copy(String publishableKey, String financialConnectionsSessionSecret, String stripeAccountId, ElementsSessionContext elementsSessionContext) {
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(financialConnectionsSessionSecret, "financialConnectionsSessionSecret");
            return new OpenConnectionsFlow(publishableKey, financialConnectionsSessionSecret, stripeAccountId, elementsSessionContext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpenConnectionsFlow)) {
                return false;
            }
            OpenConnectionsFlow openConnectionsFlow = (OpenConnectionsFlow) other;
            return Intrinsics.areEqual(this.publishableKey, openConnectionsFlow.publishableKey) && Intrinsics.areEqual(this.financialConnectionsSessionSecret, openConnectionsFlow.financialConnectionsSessionSecret) && Intrinsics.areEqual(this.stripeAccountId, openConnectionsFlow.stripeAccountId) && Intrinsics.areEqual(this.elementsSessionContext, openConnectionsFlow.elementsSessionContext);
        }

        public int hashCode() {
            int iHashCode = ((this.publishableKey.hashCode() * 31) + this.financialConnectionsSessionSecret.hashCode()) * 31;
            String str = this.stripeAccountId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
            return iHashCode2 + (elementsSessionContext != null ? elementsSessionContext.hashCode() : 0);
        }

        public String toString() {
            return "OpenConnectionsFlow(publishableKey=" + this.publishableKey + ", financialConnectionsSessionSecret=" + this.financialConnectionsSessionSecret + ", stripeAccountId=" + this.stripeAccountId + ", elementsSessionContext=" + this.elementsSessionContext + ")";
        }

        public final String getPublishableKey() {
            return this.publishableKey;
        }

        public final String getFinancialConnectionsSessionSecret() {
            return this.financialConnectionsSessionSecret;
        }

        public final String getStripeAccountId() {
            return this.stripeAccountId;
        }

        public final ElementsSessionContext getElementsSessionContext() {
            return this.elementsSessionContext;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenConnectionsFlow(String publishableKey, String financialConnectionsSessionSecret, String str, ElementsSessionContext elementsSessionContext) {
            super(null);
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(financialConnectionsSessionSecret, "financialConnectionsSessionSecret");
            this.publishableKey = publishableKey;
            this.financialConnectionsSessionSecret = financialConnectionsSessionSecret;
            this.stripeAccountId = str;
            this.elementsSessionContext = elementsSessionContext;
        }
    }

    /* compiled from: CollectBankAccountViewEffect.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$FinishWithResult;", "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;", "<init>", "(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;)V", "getResult", "()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FinishWithResult extends CollectBankAccountViewEffect {
        public static final int $stable = 0;
        private final CollectBankAccountResultInternal result;

        public static /* synthetic */ FinishWithResult copy$default(FinishWithResult finishWithResult, CollectBankAccountResultInternal collectBankAccountResultInternal, int i, Object obj) {
            if ((i & 1) != 0) {
                collectBankAccountResultInternal = finishWithResult.result;
            }
            return finishWithResult.copy(collectBankAccountResultInternal);
        }

        /* renamed from: component1, reason: from getter */
        public final CollectBankAccountResultInternal getResult() {
            return this.result;
        }

        public final FinishWithResult copy(CollectBankAccountResultInternal result) {
            Intrinsics.checkNotNullParameter(result, "result");
            return new FinishWithResult(result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FinishWithResult) && Intrinsics.areEqual(this.result, ((FinishWithResult) other).result);
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return "FinishWithResult(result=" + this.result + ")";
        }

        public final CollectBankAccountResultInternal getResult() {
            return this.result;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FinishWithResult(CollectBankAccountResultInternal result) {
            super(null);
            Intrinsics.checkNotNullParameter(result, "result");
            this.result = result;
        }
    }
}
