package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.BankFormScreenState;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import com.stripe.android.ui.core.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UsBankAccountFormArgumentsKtx.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0000\u001a2\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u000e"}, d2 = {"handleScreenStateChanged", "", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;", "screenState", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;", ViewProps.ENABLED, "", "onPrimaryButtonClick", "Lkotlin/Function0;", "updatePrimaryButton", "text", "Lcom/stripe/android/core/strings/ResolvableString;", ViewProps.ON_CLICK, "shouldShowProcessingWhenClicked", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UsBankAccountFormArgumentsKtxKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final PrimaryButton.UIState handleScreenStateChanged$lambda$1(PrimaryButton.UIState uIState) {
        return null;
    }

    public static final void handleScreenStateChanged(USBankAccountFormArguments uSBankAccountFormArguments, BankFormScreenState screenState, boolean z, Function0<Unit> onPrimaryButtonClick) {
        Intrinsics.checkNotNullParameter(uSBankAccountFormArguments, "<this>");
        Intrinsics.checkNotNullParameter(screenState, "screenState");
        Intrinsics.checkNotNullParameter(onPrimaryButtonClick, "onPrimaryButtonClick");
        ResolvableString error = screenState.getError();
        if (error != null) {
            uSBankAccountFormArguments.getOnError().invoke(error);
        }
        if (screenState.getLinkedBankAccount() == null) {
            updatePrimaryButton(uSBankAccountFormArguments, ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_continue_button_label, new Object[0], null, 4, null), onPrimaryButtonClick, uSBankAccountFormArguments.getIsCompleteFlow(), z);
        } else {
            uSBankAccountFormArguments.getOnUpdatePrimaryButtonUIState().invoke(new Function1() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.UsBankAccountFormArgumentsKtxKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UsBankAccountFormArgumentsKtxKt.handleScreenStateChanged$lambda$1((PrimaryButton.UIState) obj);
                }
            });
        }
        Function2<ResolvableString, Boolean, Unit> onMandateTextChanged = uSBankAccountFormArguments.getOnMandateTextChanged();
        BankFormScreenState.LinkedBankAccount linkedBankAccount = screenState.getLinkedBankAccount();
        onMandateTextChanged.invoke(linkedBankAccount != null ? linkedBankAccount.getMandateText() : null, false);
    }

    private static final void updatePrimaryButton(final USBankAccountFormArguments uSBankAccountFormArguments, final ResolvableString resolvableString, final Function0<Unit> function0, final boolean z, final boolean z2) {
        uSBankAccountFormArguments.getOnUpdatePrimaryButtonUIState().invoke(new Function1() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.UsBankAccountFormArgumentsKtxKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UsBankAccountFormArgumentsKtxKt.updatePrimaryButton$lambda$4(resolvableString, z2, uSBankAccountFormArguments, z, function0, (PrimaryButton.UIState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PrimaryButton.UIState updatePrimaryButton$lambda$4(ResolvableString resolvableString, boolean z, final USBankAccountFormArguments uSBankAccountFormArguments, final boolean z2, final Function0 function0, PrimaryButton.UIState uIState) {
        return new PrimaryButton.UIState(resolvableString, new Function0() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.UsBankAccountFormArgumentsKtxKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UsBankAccountFormArgumentsKtxKt.updatePrimaryButton$lambda$4$lambda$3(z2, uSBankAccountFormArguments, function0);
            }
        }, z, uSBankAccountFormArguments.getIsCompleteFlow());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updatePrimaryButton$lambda$4$lambda$3(boolean z, USBankAccountFormArguments uSBankAccountFormArguments, Function0 function0) {
        if (z) {
            uSBankAccountFormArguments.getOnUpdatePrimaryButtonState().invoke(PrimaryButton.State.StartProcessing.INSTANCE);
        }
        function0.invoke();
        uSBankAccountFormArguments.getOnUpdatePrimaryButtonUIState().invoke(new Function1() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.UsBankAccountFormArgumentsKtxKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UsBankAccountFormArgumentsKtxKt.updatePrimaryButton$lambda$4$lambda$3$lambda$2((PrimaryButton.UIState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PrimaryButton.UIState updatePrimaryButton$lambda$4$lambda$3$lambda$2(PrimaryButton.UIState uIState) {
        if (uIState != null) {
            return PrimaryButton.UIState.copy$default(uIState, null, null, false, false, 11, null);
        }
        return null;
    }
}
