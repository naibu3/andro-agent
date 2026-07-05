package com.stripe.android.paymentsheet.flowcontroller;

import com.facebook.internal.ServerProtocol;
import com.stripe.android.common.model.CommonConfigurationKt;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.lpmfoundations.paymentmethod.WalletType;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetConfigurationKtxKt;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.state.CustomerState;
import com.stripe.android.paymentsheet.state.PaymentSheetState;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentSelectionUpdater.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0096\u0002J2\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J*\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/DefaultPaymentSelectionUpdater;", "Lcom/stripe/android/paymentsheet/flowcontroller/PaymentSelectionUpdater;", "<init>", "()V", "invoke", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", BaseSheetViewModel.SAVE_SELECTION, "previousConfig", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "newState", "Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;", "newConfig", "walletButtonsAlreadyShown", "", "canUseSelection", "potentialSelection", ServerProtocol.DIALOG_PARAM_STATE, "configuration", "walletCanBeUsed", "shouldAskForMandate", "currentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "metadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultPaymentSelectionUpdater implements PaymentSelectionUpdater {
    public static final int $stable = 0;

    @Inject
    public DefaultPaymentSelectionUpdater() {
    }

    @Override // com.stripe.android.paymentsheet.flowcontroller.PaymentSelectionUpdater
    public PaymentSelection invoke(PaymentSelection selection, PaymentSheet.Configuration previousConfig, PaymentSheetState.Full newState, PaymentSheet.Configuration newConfig, boolean walletButtonsAlreadyShown) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        PaymentSelection paymentSelection = selection == null ? newState.getPaymentSelection() : selection;
        if (paymentSelection == null || !canUseSelection(paymentSelection, newState, newConfig, walletButtonsAlreadyShown, selection) || (previousConfig != null && CommonConfigurationKt.containsVolatileDifferences(CommonConfigurationKt.asCommonConfiguration(previousConfig), CommonConfigurationKt.asCommonConfiguration(newConfig)))) {
            return null;
        }
        return paymentSelection;
    }

    private final boolean canUseSelection(PaymentSelection potentialSelection, PaymentSheetState.Full state, PaymentSheet.Configuration configuration, boolean walletButtonsAlreadyShown, PaymentSelection selection) {
        List<PaymentMethod> listEmptyList;
        List<String> listSupportedPaymentMethodTypes = state.getPaymentMethodMetadata().supportedPaymentMethodTypes();
        if (potentialSelection instanceof PaymentSelection.New) {
            PaymentSelection.New r5 = (PaymentSelection.New) potentialSelection;
            return listSupportedPaymentMethodTypes.contains(r5.getPaymentMethodCreateParams().getTypeCode()) && !shouldAskForMandate(r5, state.getPaymentMethodMetadata());
        }
        if (potentialSelection instanceof PaymentSelection.Saved) {
            PaymentMethod paymentMethod = ((PaymentSelection.Saved) potentialSelection).getPaymentMethod();
            PaymentMethod.Type type = paymentMethod.type;
            if (CollectionsKt.contains(listSupportedPaymentMethodTypes, type != null ? type.code : null)) {
                CustomerState customer = state.getCustomer();
                if (customer == null || (listEmptyList = customer.getPaymentMethods()) == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                if (listEmptyList.contains(paymentMethod)) {
                    return true;
                }
            }
            return false;
        }
        if (potentialSelection instanceof PaymentSelection.GooglePay) {
            return state.getPaymentMethodMetadata().isGooglePayReady() && walletCanBeUsed(potentialSelection, configuration, walletButtonsAlreadyShown, selection);
        }
        if (potentialSelection instanceof PaymentSelection.Link) {
            return state.getPaymentMethodMetadata().getLinkState() != null && walletCanBeUsed(potentialSelection, configuration, walletButtonsAlreadyShown, selection);
        }
        if (potentialSelection instanceof PaymentSelection.ExternalPaymentMethod) {
            return state.getPaymentMethodMetadata().isExternalPaymentMethod(((PaymentSelection.ExternalPaymentMethod) potentialSelection).getType());
        }
        if (potentialSelection instanceof PaymentSelection.CustomPaymentMethod) {
            return state.getPaymentMethodMetadata().isCustomPaymentMethod(((PaymentSelection.CustomPaymentMethod) potentialSelection).getId());
        }
        if (potentialSelection instanceof PaymentSelection.ShopPay) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final boolean walletCanBeUsed(PaymentSelection potentialSelection, PaymentSheet.Configuration configuration, boolean walletButtonsAlreadyShown, PaymentSelection selection) {
        WalletType walletType;
        if (!configuration.getWalletButtons$paymentsheet_release().getWillDisplayExternally() && !walletButtonsAlreadyShown) {
            return true;
        }
        List<WalletType> allowedWalletTypes = PaymentSheetConfigurationKtxKt.getAllowedWalletTypes(configuration.getWalletButtons$paymentsheet_release());
        if (potentialSelection instanceof PaymentSelection.GooglePay) {
            walletType = WalletType.GooglePay;
        } else {
            walletType = potentialSelection instanceof PaymentSelection.Link ? WalletType.Link : null;
        }
        if (Intrinsics.areEqual(potentialSelection, selection) && CollectionsKt.contains(allowedWalletTypes, walletType) && !configuration.getWalletButtons$paymentsheet_release().getWalletsToShow().isEmpty()) {
            return true;
        }
        return (walletType == null || allowedWalletTypes.contains(walletType)) ? false : true;
    }

    private final boolean shouldAskForMandate(PaymentSelection.New currentSelection, PaymentMethodMetadata metadata) {
        return metadata.requiresMandate(currentSelection.getPaymentMethodCreateParams().getTypeCode()) && !PaymentSelectionUpdaterKt.getCustomerAcknowledgedMandate(currentSelection);
    }
}
