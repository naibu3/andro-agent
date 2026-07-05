package com.stripe.android.payments.core.authentication.threeds2;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.stripe3ds2.transaction.InitChallengeArgs;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Stripe3ds2TransactionViewModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/NextStep;", "", "<init>", "()V", "StartChallenge", "StartFallback", "Complete", "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$Complete;", "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$StartChallenge;", "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$StartFallback;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class NextStep {
    public static final int $stable = 0;

    public /* synthetic */ NextStep(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private NextStep() {
    }

    /* compiled from: Stripe3ds2TransactionViewModel.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$StartChallenge;", "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep;", CardScanActivity.ARGS, "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;", "<init>", "(Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;)V", "getArgs", "()Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StartChallenge extends NextStep {
        public static final int $stable = 8;
        private final InitChallengeArgs args;

        public static /* synthetic */ StartChallenge copy$default(StartChallenge startChallenge, InitChallengeArgs initChallengeArgs, int i, Object obj) {
            if ((i & 1) != 0) {
                initChallengeArgs = startChallenge.args;
            }
            return startChallenge.copy(initChallengeArgs);
        }

        /* renamed from: component1, reason: from getter */
        public final InitChallengeArgs getArgs() {
            return this.args;
        }

        public final StartChallenge copy(InitChallengeArgs args) {
            Intrinsics.checkNotNullParameter(args, "args");
            return new StartChallenge(args);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StartChallenge) && Intrinsics.areEqual(this.args, ((StartChallenge) other).args);
        }

        public int hashCode() {
            return this.args.hashCode();
        }

        public String toString() {
            return "StartChallenge(args=" + this.args + ")";
        }

        public final InitChallengeArgs getArgs() {
            return this.args;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartChallenge(InitChallengeArgs args) {
            super(null);
            Intrinsics.checkNotNullParameter(args, "args");
            this.args = args;
        }
    }

    /* compiled from: Stripe3ds2TransactionViewModel.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$StartFallback;", "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep;", CardScanActivity.ARGS, "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "<init>", "(Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;)V", "getArgs", "()Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StartFallback extends NextStep {
        public static final int $stable = 8;
        private final PaymentBrowserAuthContract.Args args;

        public static /* synthetic */ StartFallback copy$default(StartFallback startFallback, PaymentBrowserAuthContract.Args args, int i, Object obj) {
            if ((i & 1) != 0) {
                args = startFallback.args;
            }
            return startFallback.copy(args);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentBrowserAuthContract.Args getArgs() {
            return this.args;
        }

        public final StartFallback copy(PaymentBrowserAuthContract.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            return new StartFallback(args);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StartFallback) && Intrinsics.areEqual(this.args, ((StartFallback) other).args);
        }

        public int hashCode() {
            return this.args.hashCode();
        }

        public String toString() {
            return "StartFallback(args=" + this.args + ")";
        }

        public final PaymentBrowserAuthContract.Args getArgs() {
            return this.args;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartFallback(PaymentBrowserAuthContract.Args args) {
            super(null);
            Intrinsics.checkNotNullParameter(args, "args");
            this.args = args;
        }
    }

    /* compiled from: Stripe3ds2TransactionViewModel.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$Complete;", "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "<init>", "(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;)V", "getResult", "()Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Complete extends NextStep {
        public static final int $stable = 8;
        private final PaymentFlowResult.Unvalidated result;

        public static /* synthetic */ Complete copy$default(Complete complete, PaymentFlowResult.Unvalidated unvalidated, int i, Object obj) {
            if ((i & 1) != 0) {
                unvalidated = complete.result;
            }
            return complete.copy(unvalidated);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentFlowResult.Unvalidated getResult() {
            return this.result;
        }

        public final Complete copy(PaymentFlowResult.Unvalidated result) {
            Intrinsics.checkNotNullParameter(result, "result");
            return new Complete(result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Complete) && Intrinsics.areEqual(this.result, ((Complete) other).result);
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return "Complete(result=" + this.result + ")";
        }

        public final PaymentFlowResult.Unvalidated getResult() {
            return this.result;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Complete(PaymentFlowResult.Unvalidated result) {
            super(null);
            Intrinsics.checkNotNullParameter(result, "result");
            this.result = result;
        }
    }
}
