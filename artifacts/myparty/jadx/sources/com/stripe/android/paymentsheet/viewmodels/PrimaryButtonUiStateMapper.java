package com.stripe.android.paymentsheet.viewmodels;

import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.navigation.BuyButtonState;
import com.stripe.android.paymentsheet.navigation.PaymentSheetScreen;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import com.stripe.android.paymentsheet.utils.PrimaryButtonUtilsKt;
import com.stripe.android.ui.core.Amount;
import com.stripe.android.uicore.utils.StateFlowsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: PrimaryButtonUiStateMapper.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007\u0012\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0007\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0007\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0007J\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0007J \u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;", "", "config", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "isProcessingPayment", "", "currentScreenFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;", "buttonsEnabledFlow", "amountFlow", "Lcom/stripe/android/ui/core/Amount;", "selectionFlow", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "customPrimaryButtonUiStateFlow", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;", "cvcCompleteFlow", ViewProps.ON_CLICK, "Lkotlin/Function0;", "", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ZLkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function0;)V", "forCompleteFlow", "forCustomFlow", "cvcRecollectionCompleteOrNotRequired", "screen", "complete", BaseSheetViewModel.SAVE_SELECTION, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PrimaryButtonUiStateMapper {
    public static final int $stable = 8;
    private final StateFlow<Amount> amountFlow;
    private final StateFlow<Boolean> buttonsEnabledFlow;
    private final PaymentSheet.Configuration config;
    private final StateFlow<PaymentSheetScreen> currentScreenFlow;
    private final StateFlow<PrimaryButton.UIState> customPrimaryButtonUiStateFlow;
    private final StateFlow<Boolean> cvcCompleteFlow;
    private final boolean isProcessingPayment;
    private final Function0<Unit> onClick;
    private final StateFlow<PaymentSelection> selectionFlow;

    /* JADX INFO: Access modifiers changed from: private */
    public static final StateFlow forCompleteFlow$lambda$3(StateFlow it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PrimaryButtonUiStateMapper(PaymentSheet.Configuration config, boolean z, StateFlow<? extends PaymentSheetScreen> currentScreenFlow, StateFlow<Boolean> buttonsEnabledFlow, StateFlow<Amount> amountFlow, StateFlow<? extends PaymentSelection> selectionFlow, StateFlow<PrimaryButton.UIState> customPrimaryButtonUiStateFlow, StateFlow<Boolean> cvcCompleteFlow, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(currentScreenFlow, "currentScreenFlow");
        Intrinsics.checkNotNullParameter(buttonsEnabledFlow, "buttonsEnabledFlow");
        Intrinsics.checkNotNullParameter(amountFlow, "amountFlow");
        Intrinsics.checkNotNullParameter(selectionFlow, "selectionFlow");
        Intrinsics.checkNotNullParameter(customPrimaryButtonUiStateFlow, "customPrimaryButtonUiStateFlow");
        Intrinsics.checkNotNullParameter(cvcCompleteFlow, "cvcCompleteFlow");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.config = config;
        this.isProcessingPayment = z;
        this.currentScreenFlow = currentScreenFlow;
        this.buttonsEnabledFlow = buttonsEnabledFlow;
        this.amountFlow = amountFlow;
        this.selectionFlow = selectionFlow;
        this.customPrimaryButtonUiStateFlow = customPrimaryButtonUiStateFlow;
        this.cvcCompleteFlow = cvcCompleteFlow;
        this.onClick = onClick;
    }

    public final StateFlow<PrimaryButton.UIState> forCompleteFlow() {
        return StateFlowsKt.flatMapLatestAsStateFlow(StateFlowsKt.combineAsStateFlow(this.currentScreenFlow, this.buttonsEnabledFlow, this.amountFlow, this.selectionFlow, this.customPrimaryButtonUiStateFlow, this.cvcCompleteFlow, new Function6() { // from class: com.stripe.android.paymentsheet.viewmodels.PrimaryButtonUiStateMapper$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function6
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return PrimaryButtonUiStateMapper.forCompleteFlow$lambda$2(this.f$0, (PaymentSheetScreen) obj, ((Boolean) obj2).booleanValue(), (Amount) obj3, (PaymentSelection) obj4, (PrimaryButton.UIState) obj5, ((Boolean) obj6).booleanValue());
            }
        }), new Function1() { // from class: com.stripe.android.paymentsheet.viewmodels.PrimaryButtonUiStateMapper$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrimaryButtonUiStateMapper.forCompleteFlow$lambda$3((StateFlow) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StateFlow forCompleteFlow$lambda$2(final PrimaryButtonUiStateMapper primaryButtonUiStateMapper, final PaymentSheetScreen screen, final boolean z, final Amount amount, final PaymentSelection paymentSelection, final PrimaryButton.UIState uIState, final boolean z2) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return StateFlowsKt.mapAsStateFlow(screen.getBuyButtonState(), new Function1() { // from class: com.stripe.android.paymentsheet.viewmodels.PrimaryButtonUiStateMapper$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrimaryButtonUiStateMapper.forCompleteFlow$lambda$2$lambda$1(uIState, amount, primaryButtonUiStateMapper, z, paymentSelection, screen, z2, (BuyButtonState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PrimaryButton.UIState forCompleteFlow$lambda$2$lambda$1(PrimaryButton.UIState uIState, Amount amount, PrimaryButtonUiStateMapper primaryButtonUiStateMapper, boolean z, PaymentSelection paymentSelection, PaymentSheetScreen paymentSheetScreen, boolean z2, BuyButtonState buyButtonState) {
        ResolvableString resolvableStringBuyButtonLabel;
        Intrinsics.checkNotNullParameter(buyButtonState, "buyButtonState");
        if (uIState != null) {
            return uIState;
        }
        BuyButtonState.BuyButtonOverride buyButtonOverride = buyButtonState.getBuyButtonOverride();
        if (buyButtonOverride == null || (resolvableStringBuyButtonLabel = buyButtonOverride.getLabel()) == null) {
            resolvableStringBuyButtonLabel = PrimaryButtonUtilsKt.buyButtonLabel(amount, primaryButtonUiStateMapper.config.getPrimaryButtonLabel(), primaryButtonUiStateMapper.isProcessingPayment);
        }
        Function0<Unit> function0 = primaryButtonUiStateMapper.onClick;
        boolean z3 = z && paymentSelection != null && primaryButtonUiStateMapper.cvcRecollectionCompleteOrNotRequired(paymentSheetScreen, z2, paymentSelection);
        BuyButtonState.BuyButtonOverride buyButtonOverride2 = buyButtonState.getBuyButtonOverride();
        PrimaryButton.UIState uIState2 = new PrimaryButton.UIState(resolvableStringBuyButtonLabel, function0, z3, buyButtonOverride2 != null ? buyButtonOverride2.getLockEnabled() : true);
        if (buyButtonState.getVisible()) {
            return uIState2;
        }
        return null;
    }

    public final StateFlow<PrimaryButton.UIState> forCustomFlow() {
        return StateFlowsKt.combineAsStateFlow(this.currentScreenFlow, this.buttonsEnabledFlow, this.selectionFlow, this.customPrimaryButtonUiStateFlow, new Function4() { // from class: com.stripe.android.paymentsheet.viewmodels.PrimaryButtonUiStateMapper$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return PrimaryButtonUiStateMapper.forCustomFlow$lambda$5(this.f$0, (PaymentSheetScreen) obj, ((Boolean) obj2).booleanValue(), (PaymentSelection) obj3, (PrimaryButton.UIState) obj4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PrimaryButton.UIState forCustomFlow$lambda$5(PrimaryButtonUiStateMapper primaryButtonUiStateMapper, PaymentSheetScreen screen, boolean z, PaymentSelection paymentSelection, PrimaryButton.UIState uIState) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (uIState == null) {
            uIState = new PrimaryButton.UIState(PrimaryButtonUtilsKt.continueButtonLabel(primaryButtonUiStateMapper.config.getPrimaryButtonLabel()), primaryButtonUiStateMapper.onClick, z && paymentSelection != null, false);
            boolean z2 = paymentSelection != null && paymentSelection.getRequiresConfirmation() && screen.getShowsPaymentConfirmationMandates();
            if (!screen.getShowsContinueButton() && !z2) {
                return null;
            }
        }
        return uIState;
    }

    private final boolean cvcRecollectionCompleteOrNotRequired(PaymentSheetScreen screen, boolean complete, PaymentSelection selection) {
        PaymentMethod paymentMethod;
        PaymentMethod.Type type = null;
        PaymentSheetScreen.SelectSavedPaymentMethods selectSavedPaymentMethods = screen instanceof PaymentSheetScreen.SelectSavedPaymentMethods ? (PaymentSheetScreen.SelectSavedPaymentMethods) screen : null;
        if (!((selectSavedPaymentMethods != null ? selectSavedPaymentMethods.getCvcRecollectionState() : null) instanceof PaymentSheetScreen.SelectSavedPaymentMethods.CvcRecollectionState.Required)) {
            return true;
        }
        PaymentSelection.Saved saved = selection instanceof PaymentSelection.Saved ? (PaymentSelection.Saved) selection : null;
        if (saved != null && (paymentMethod = saved.getPaymentMethod()) != null) {
            type = paymentMethod.type;
        }
        if (type == PaymentMethod.Type.Card) {
            return complete;
        }
        return true;
    }
}
