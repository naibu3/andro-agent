package com.stripe.android.paymentsheet.verticalmode;

import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.model.parsers.MobileCardElementConfigParser;
import com.stripe.android.paymentsheet.model.PaymentMethodIncentive;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: PaymentMethodIncentiveInteractor.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodIncentiveInteractor;", "", "incentive", "Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;", "<init>", "(Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;)V", "_displayedIncentive", "Lkotlinx/coroutines/flow/MutableStateFlow;", "displayedIncentive", "Lkotlinx/coroutines/flow/StateFlow;", "getDisplayedIncentive", "()Lkotlinx/coroutines/flow/StateFlow;", "setEligible", "", MobileCardElementConfigParser.FIELD_ELIGIBLE, "", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentMethodIncentiveInteractor {
    private final MutableStateFlow<PaymentMethodIncentive> _displayedIncentive;
    private final StateFlow<PaymentMethodIncentive> displayedIncentive;
    private final PaymentMethodIncentive incentive;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public PaymentMethodIncentiveInteractor(PaymentMethodIncentive paymentMethodIncentive) {
        this.incentive = paymentMethodIncentive;
        MutableStateFlow<PaymentMethodIncentive> MutableStateFlow = StateFlowKt.MutableStateFlow(paymentMethodIncentive);
        this._displayedIncentive = MutableStateFlow;
        this.displayedIncentive = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final StateFlow<PaymentMethodIncentive> getDisplayedIncentive() {
        return this.displayedIncentive;
    }

    public final void setEligible(boolean eligible) {
        this._displayedIncentive.setValue(eligible ? this.incentive : null);
    }

    /* compiled from: PaymentMethodIncentiveInteractor.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodIncentiveInteractor$Companion;", "", "<init>", "()V", "create", "Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodIncentiveInteractor;", "viewModel", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PaymentMethodIncentiveInteractor create(BaseSheetViewModel viewModel) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            PaymentMethodMetadata value = viewModel.getPaymentMethodMetadata$paymentsheet_release().getValue();
            return new PaymentMethodIncentiveInteractor(value != null ? value.getPaymentMethodIncentive() : null);
        }
    }
}
