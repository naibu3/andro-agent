package com.stripe.android.paymentsheet.state;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.AnalyticsEvents;
import com.stripe.android.core.strings.ResolvableString;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WalletsProcessingState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/state/WalletsProcessingState;", "", "Idle", "Processing", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_COMPLETED, "Lcom/stripe/android/paymentsheet/state/WalletsProcessingState$Completed;", "Lcom/stripe/android/paymentsheet/state/WalletsProcessingState$Idle;", "Lcom/stripe/android/paymentsheet/state/WalletsProcessingState$Processing;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface WalletsProcessingState {

    /* compiled from: WalletsProcessingState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/state/WalletsProcessingState$Idle;", "Lcom/stripe/android/paymentsheet/state/WalletsProcessingState;", "error", "Lcom/stripe/android/core/strings/ResolvableString;", "<init>", "(Lcom/stripe/android/core/strings/ResolvableString;)V", "getError", "()Lcom/stripe/android/core/strings/ResolvableString;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Idle implements WalletsProcessingState {
        public static final int $stable = 8;
        private final ResolvableString error;

        public static /* synthetic */ Idle copy$default(Idle idle, ResolvableString resolvableString, int i, Object obj) {
            if ((i & 1) != 0) {
                resolvableString = idle.error;
            }
            return idle.copy(resolvableString);
        }

        /* renamed from: component1, reason: from getter */
        public final ResolvableString getError() {
            return this.error;
        }

        public final Idle copy(ResolvableString error) {
            return new Idle(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Idle) && Intrinsics.areEqual(this.error, ((Idle) other).error);
        }

        public int hashCode() {
            ResolvableString resolvableString = this.error;
            if (resolvableString == null) {
                return 0;
            }
            return resolvableString.hashCode();
        }

        public String toString() {
            return "Idle(error=" + this.error + ")";
        }

        public Idle(ResolvableString resolvableString) {
            this.error = resolvableString;
        }

        public final ResolvableString getError() {
            return this.error;
        }
    }

    /* compiled from: WalletsProcessingState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/state/WalletsProcessingState$Processing;", "Lcom/stripe/android/paymentsheet/state/WalletsProcessingState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Processing implements WalletsProcessingState {
        public static final int $stable = 0;
        public static final Processing INSTANCE = new Processing();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Processing)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -295978178;
        }

        public String toString() {
            return "Processing";
        }

        private Processing() {
        }
    }

    /* compiled from: WalletsProcessingState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/state/WalletsProcessingState$Completed;", "Lcom/stripe/android/paymentsheet/state/WalletsProcessingState;", "onComplete", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "getOnComplete", "()Lkotlin/jvm/functions/Function0;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Completed implements WalletsProcessingState {
        public static final int $stable = 0;
        private final Function0<Unit> onComplete;

        public Completed(Function0<Unit> onComplete) {
            Intrinsics.checkNotNullParameter(onComplete, "onComplete");
            this.onComplete = onComplete;
        }

        public final Function0<Unit> getOnComplete() {
            return this.onComplete;
        }
    }
}
