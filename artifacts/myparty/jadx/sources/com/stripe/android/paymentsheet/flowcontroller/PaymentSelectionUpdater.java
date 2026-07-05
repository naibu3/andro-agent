package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.state.PaymentSheetState;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.Metadata;

/* compiled from: PaymentSelectionUpdater.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001J7\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH¦\u0002¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/PaymentSelectionUpdater;", "", "invoke", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", BaseSheetViewModel.SAVE_SELECTION, "previousConfig", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "newState", "Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;", "newConfig", "walletButtonsAlreadyShown", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PaymentSelectionUpdater {
    PaymentSelection invoke(PaymentSelection selection, PaymentSheet.Configuration previousConfig, PaymentSheetState.Full newState, PaymentSheet.Configuration newConfig, boolean walletButtonsAlreadyShown);
}
