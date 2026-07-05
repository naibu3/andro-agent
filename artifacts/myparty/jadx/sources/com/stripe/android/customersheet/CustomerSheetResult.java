package com.stripe.android.customersheet;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import com.facebook.internal.AnalyticsEvents;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import expo.modules.notifications.service.NotificationsService;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomerSheetResult.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \n2\u00020\u0001:\u0004\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0006\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheetResult;", "", "<init>", "()V", "toBundle", "Landroid/os/Bundle;", "toBundle$paymentsheet_release", "Selected", "Canceled", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Companion", "Lcom/stripe/android/customersheet/CustomerSheetResult$Canceled;", "Lcom/stripe/android/customersheet/CustomerSheetResult$Failed;", "Lcom/stripe/android/customersheet/CustomerSheetResult$Selected;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class CustomerSheetResult {
    public static final int $stable = 0;
    private static final String EXTRA_RESULT = "extra_activity_result";

    public /* synthetic */ CustomerSheetResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CustomerSheetResult() {
    }

    /* compiled from: CustomerSheetResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheetResult$Selected;", "Lcom/stripe/android/customersheet/CustomerSheetResult;", BaseSheetViewModel.SAVE_SELECTION, "Lcom/stripe/android/customersheet/PaymentOptionSelection;", "<init>", "(Lcom/stripe/android/customersheet/PaymentOptionSelection;)V", "getSelection", "()Lcom/stripe/android/customersheet/PaymentOptionSelection;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Selected extends CustomerSheetResult {
        public static final int $stable = 8;
        private final PaymentOptionSelection selection;

        public final PaymentOptionSelection getSelection() {
            return this.selection;
        }

        public Selected(PaymentOptionSelection paymentOptionSelection) {
            super(null);
            this.selection = paymentOptionSelection;
        }
    }

    /* compiled from: CustomerSheetResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheetResult$Canceled;", "Lcom/stripe/android/customersheet/CustomerSheetResult;", BaseSheetViewModel.SAVE_SELECTION, "Lcom/stripe/android/customersheet/PaymentOptionSelection;", "<init>", "(Lcom/stripe/android/customersheet/PaymentOptionSelection;)V", "getSelection", "()Lcom/stripe/android/customersheet/PaymentOptionSelection;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Canceled extends CustomerSheetResult {
        public static final int $stable = 8;
        private final PaymentOptionSelection selection;

        public final PaymentOptionSelection getSelection() {
            return this.selection;
        }

        public Canceled(PaymentOptionSelection paymentOptionSelection) {
            super(null);
            this.selection = paymentOptionSelection;
        }
    }

    /* compiled from: CustomerSheetResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheetResult$Failed;", "Lcom/stripe/android/customersheet/CustomerSheetResult;", NotificationsService.EXCEPTION_KEY, "", "<init>", "(Ljava/lang/Throwable;)V", "getException", "()Ljava/lang/Throwable;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Failed extends CustomerSheetResult {
        public static final int $stable = 8;
        private final Throwable exception;

        public final Throwable getException() {
            return this.exception;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(Throwable exception) {
            super(null);
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.exception = exception;
        }
    }

    public final Bundle toBundle$paymentsheet_release() {
        return BundleKt.bundleOf(TuplesKt.to("extra_activity_result", this));
    }
}
