package com.stripe.android.paymentelement.embedded.content;

import com.facebook.internal.ServerProtocol;
import com.stripe.android.paymentelement.EmbeddedPaymentElement;
import com.stripe.android.paymentelement.embedded.EmbeddedSelectionHolder;
import com.stripe.android.paymentelement.embedded.content.EmbeddedConfirmationStateHolder;
import com.stripe.android.paymentsheet.CustomerStateHolder;
import com.stripe.android.paymentsheet.PaymentSheetConfigurationKtxKt;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmbeddedStateHelper.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001BE\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u001a\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\u0004\u0018\u0001`\u000e0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\u0004\u0018\u0001`\u000e0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedStateHelper;", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;", "selectionHolder", "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;", "customerStateHolder", "Lcom/stripe/android/paymentsheet/CustomerStateHolder;", "confirmationStateHolder", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;", "embeddedContentHelper", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContentHelper;", "internalRowSelectionCallback", "Ljavax/inject/Provider;", "Lkotlin/Function0;", "", "Lcom/stripe/android/paymentelement/embedded/InternalRowSelectionCallback;", "<init>", "(Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;Lcom/stripe/android/paymentsheet/CustomerStateHolder;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContentHelper;Ljavax/inject/Provider;)V", "value", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;", ServerProtocol.DIALOG_PARAM_STATE, "getState", "()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;", "setState", "(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;)V", "handleLoadedState", "validateRowSelectionBehaviorConfiguration", "configuration", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;", "clearState", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultEmbeddedStateHelper implements EmbeddedStateHelper {
    public static final int $stable = 8;
    private final EmbeddedConfirmationStateHolder confirmationStateHolder;
    private final CustomerStateHolder customerStateHolder;
    private final EmbeddedContentHelper embeddedContentHelper;
    private final Provider<Function0<Unit>> internalRowSelectionCallback;
    private final EmbeddedSelectionHolder selectionHolder;

    @Inject
    public DefaultEmbeddedStateHelper(EmbeddedSelectionHolder selectionHolder, CustomerStateHolder customerStateHolder, EmbeddedConfirmationStateHolder confirmationStateHolder, EmbeddedContentHelper embeddedContentHelper, Provider<Function0<Unit>> internalRowSelectionCallback) {
        Intrinsics.checkNotNullParameter(selectionHolder, "selectionHolder");
        Intrinsics.checkNotNullParameter(customerStateHolder, "customerStateHolder");
        Intrinsics.checkNotNullParameter(confirmationStateHolder, "confirmationStateHolder");
        Intrinsics.checkNotNullParameter(embeddedContentHelper, "embeddedContentHelper");
        Intrinsics.checkNotNullParameter(internalRowSelectionCallback, "internalRowSelectionCallback");
        this.selectionHolder = selectionHolder;
        this.customerStateHolder = customerStateHolder;
        this.confirmationStateHolder = confirmationStateHolder;
        this.embeddedContentHelper = embeddedContentHelper;
        this.internalRowSelectionCallback = internalRowSelectionCallback;
    }

    @Override // com.stripe.android.paymentelement.embedded.content.EmbeddedStateHelper
    public EmbeddedPaymentElement.State getState() {
        EmbeddedConfirmationStateHolder.State state = this.confirmationStateHolder.getState();
        if (state != null) {
            return new EmbeddedPaymentElement.State(state, this.customerStateHolder.getCustomer().getValue(), this.selectionHolder.getPreviousNewSelections());
        }
        return null;
    }

    @Override // com.stripe.android.paymentelement.embedded.content.EmbeddedStateHelper
    public void setState(EmbeddedPaymentElement.State state) {
        if (state != null) {
            handleLoadedState(state);
        } else {
            clearState();
        }
    }

    private final void handleLoadedState(EmbeddedPaymentElement.State state) {
        validateRowSelectionBehaviorConfiguration(state.getConfirmationState().getConfiguration());
        PaymentSheetConfigurationKtxKt.parseAppearance(state.getConfirmationState().getConfiguration().getAppearance());
        this.confirmationStateHolder.setState(state.getConfirmationState());
        this.customerStateHolder.setCustomerState(state.getCustomer());
        this.selectionHolder.setPreviousNewSelections(state.getPreviousNewSelections());
        this.selectionHolder.set(state.getConfirmationState().getSelection());
        this.embeddedContentHelper.dataLoaded(state.getConfirmationState().getPaymentMethodMetadata(), state.getConfirmationState().getConfiguration().getAppearance().getEmbeddedAppearance$paymentsheet_release(), state.getConfirmationState().getConfiguration().getEmbeddedViewDisplaysMandateText());
    }

    private final void validateRowSelectionBehaviorConfiguration(EmbeddedPaymentElement.Configuration configuration) {
        boolean z = true;
        boolean z2 = this.internalRowSelectionCallback.get() != null;
        if (configuration.getGooglePay() == null && configuration.getCustomer() == null) {
            z = false;
        }
        if (z2 && configuration.getFormSheetAction() == EmbeddedPaymentElement.FormSheetAction.Confirm && z) {
            throw new IllegalArgumentException("Using RowSelectionBehavior.ImmediateAction with FormSheetAction.Confirm is not supported when Google Pay or a customer configuration is provided. Use RowSelectionBehavior.Default or disable Google Pay and saved payment methods.");
        }
    }

    private final void clearState() {
        this.embeddedContentHelper.clearEmbeddedContent();
        this.confirmationStateHolder.setState(null);
        this.selectionHolder.set(null);
        this.customerStateHolder.setCustomerState(null);
    }
}
