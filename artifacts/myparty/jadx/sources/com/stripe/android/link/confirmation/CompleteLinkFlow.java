package com.stripe.android.link.confirmation;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.AnalyticsEvents;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkPaymentMethod;
import com.stripe.android.link.model.LinkAccount;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CompleteLinkFlow.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\tJ\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦B¢\u0006\u0002\u0010\b¨\u0006\n"}, d2 = {"Lcom/stripe/android/link/confirmation/CompleteLinkFlow;", "", "invoke", "Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result;", "selectedPaymentDetails", "Lcom/stripe/android/link/LinkPaymentMethod;", "linkAccount", "Lcom/stripe/android/link/model/LinkAccount;", "(Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/link/model/LinkAccount;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Result", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface CompleteLinkFlow {
    Object invoke(LinkPaymentMethod linkPaymentMethod, LinkAccount linkAccount, Continuation<? super Result> continuation);

    /* compiled from: CompleteLinkFlow.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result;", "", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_COMPLETED, "Canceled", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Canceled;", "Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Completed;", "Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Failed;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Result {

        /* compiled from: CompleteLinkFlow.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Completed;", "Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result;", "linkActivityResult", "Lcom/stripe/android/link/LinkActivityResult;", "<init>", "(Lcom/stripe/android/link/LinkActivityResult;)V", "getLinkActivityResult", "()Lcom/stripe/android/link/LinkActivityResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Completed implements Result {
            public static final int $stable = 0;
            private final LinkActivityResult linkActivityResult;

            public static /* synthetic */ Completed copy$default(Completed completed, LinkActivityResult linkActivityResult, int i, Object obj) {
                if ((i & 1) != 0) {
                    linkActivityResult = completed.linkActivityResult;
                }
                return completed.copy(linkActivityResult);
            }

            /* renamed from: component1, reason: from getter */
            public final LinkActivityResult getLinkActivityResult() {
                return this.linkActivityResult;
            }

            public final Completed copy(LinkActivityResult linkActivityResult) {
                Intrinsics.checkNotNullParameter(linkActivityResult, "linkActivityResult");
                return new Completed(linkActivityResult);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Completed) && Intrinsics.areEqual(this.linkActivityResult, ((Completed) other).linkActivityResult);
            }

            public int hashCode() {
                return this.linkActivityResult.hashCode();
            }

            public String toString() {
                return "Completed(linkActivityResult=" + this.linkActivityResult + ")";
            }

            public Completed(LinkActivityResult linkActivityResult) {
                Intrinsics.checkNotNullParameter(linkActivityResult, "linkActivityResult");
                this.linkActivityResult = linkActivityResult;
            }

            public final LinkActivityResult getLinkActivityResult() {
                return this.linkActivityResult;
            }
        }

        /* compiled from: CompleteLinkFlow.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Canceled;", "Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Canceled implements Result {
            public static final int $stable = 0;
            public static final Canceled INSTANCE = new Canceled();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Canceled)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1423085237;
            }

            public String toString() {
                return "Canceled";
            }

            private Canceled() {
            }
        }

        /* compiled from: CompleteLinkFlow.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Failed;", "Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result;", "error", "Lcom/stripe/android/core/strings/ResolvableString;", "<init>", "(Lcom/stripe/android/core/strings/ResolvableString;)V", "getError", "()Lcom/stripe/android/core/strings/ResolvableString;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Failed implements Result {
            public static final int $stable = 8;
            private final ResolvableString error;

            public static /* synthetic */ Failed copy$default(Failed failed, ResolvableString resolvableString, int i, Object obj) {
                if ((i & 1) != 0) {
                    resolvableString = failed.error;
                }
                return failed.copy(resolvableString);
            }

            /* renamed from: component1, reason: from getter */
            public final ResolvableString getError() {
                return this.error;
            }

            public final Failed copy(ResolvableString error) {
                Intrinsics.checkNotNullParameter(error, "error");
                return new Failed(error);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Failed) && Intrinsics.areEqual(this.error, ((Failed) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Failed(error=" + this.error + ")";
            }

            public Failed(ResolvableString error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public final ResolvableString getError() {
                return this.error;
            }
        }
    }
}
