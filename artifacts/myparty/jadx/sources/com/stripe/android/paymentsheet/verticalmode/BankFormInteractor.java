package com.stripe.android.paymentsheet.verticalmode;

import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BankFormInteractor.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB%\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0004R\u001c\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/verticalmode/BankFormInteractor;", "", "updateSelection", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;", "", "paymentMethodIncentiveInteractor", "Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodIncentiveInteractor;", "<init>", "(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodIncentiveInteractor;)V", "getPaymentMethodIncentiveInteractor", "()Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodIncentiveInteractor;", "handleLinkedBankAccountChanged", BaseSheetViewModel.SAVE_SELECTION, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BankFormInteractor {
    private final PaymentMethodIncentiveInteractor paymentMethodIncentiveInteractor;
    private final Function1<PaymentSelection.New.USBankAccount, Unit> updateSelection;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public BankFormInteractor(Function1<? super PaymentSelection.New.USBankAccount, Unit> updateSelection, PaymentMethodIncentiveInteractor paymentMethodIncentiveInteractor) {
        Intrinsics.checkNotNullParameter(updateSelection, "updateSelection");
        Intrinsics.checkNotNullParameter(paymentMethodIncentiveInteractor, "paymentMethodIncentiveInteractor");
        this.updateSelection = updateSelection;
        this.paymentMethodIncentiveInteractor = paymentMethodIncentiveInteractor;
    }

    public final PaymentMethodIncentiveInteractor getPaymentMethodIncentiveInteractor() {
        return this.paymentMethodIncentiveInteractor;
    }

    public final void handleLinkedBankAccountChanged(PaymentSelection.New.USBankAccount selection) {
        this.updateSelection.invoke(selection);
        this.paymentMethodIncentiveInteractor.setEligible(selection == null);
    }

    /* compiled from: BankFormInteractor.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/verticalmode/BankFormInteractor$Companion;", "", "<init>", "()V", "create", "Lcom/stripe/android/paymentsheet/verticalmode/BankFormInteractor;", "viewModel", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BankFormInteractor create(BaseSheetViewModel viewModel) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            return new BankFormInteractor(new BankFormInteractor$Companion$create$1(viewModel), PaymentMethodIncentiveInteractor.INSTANCE.create(viewModel));
        }
    }
}
