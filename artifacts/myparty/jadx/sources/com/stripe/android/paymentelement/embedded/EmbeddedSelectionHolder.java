package com.stripe.android.paymentelement.embedded;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.PaymentSelectionKt;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: EmbeddedSelectionHolder.kt */
@Singleton
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\bJ\u0016\u0010\u0015\u001a\u00020\u00132\u000e\u0010\u0016\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\u0017J\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u000fJ\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0016\u001a\u00060\fj\u0002`\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;", "", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", BaseSheetViewModel.SAVE_SELECTION, "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "getSelection", "()Lkotlinx/coroutines/flow/StateFlow;", "temporarySelection", "", "getTemporarySelection", "previousNewSelections", "Landroid/os/Bundle;", "getPreviousNewSelections", "()Landroid/os/Bundle;", "set", "", "updatedSelection", "setTemporary", "code", "Lcom/stripe/android/model/PaymentMethodCode;", "setPreviousNewSelections", "bundle", "getPreviousNewSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EmbeddedSelectionHolder {
    public static final String EMBEDDED_PREVIOUS_SELECTIONS_KEY = "EMBEDDED_PREVIOUS_SELECTIONS_KEY";
    public static final String EMBEDDED_SELECTION_KEY = "EMBEDDED_SELECTION_KEY";
    public static final String EMBEDDED_TEMPORARY_SELECTION_KEY = "EMBEDDED_TEMPORARY_SELECTION_KEY";
    private final Bundle previousNewSelections;
    private final SavedStateHandle savedStateHandle;
    private final StateFlow<PaymentSelection> selection;
    private final StateFlow<String> temporarySelection;
    public static final int $stable = 8;

    @Inject
    public EmbeddedSelectionHolder(SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
        this.selection = savedStateHandle.getStateFlow(EMBEDDED_SELECTION_KEY, null);
        this.temporarySelection = savedStateHandle.getStateFlow(EMBEDDED_TEMPORARY_SELECTION_KEY, null);
        Bundle bundle = (Bundle) savedStateHandle.get(EMBEDDED_PREVIOUS_SELECTIONS_KEY);
        this.previousNewSelections = bundle == null ? new Bundle() : bundle;
    }

    public final StateFlow<PaymentSelection> getSelection() {
        return this.selection;
    }

    public final StateFlow<String> getTemporarySelection() {
        return this.temporarySelection;
    }

    public final Bundle getPreviousNewSelections() {
        return this.previousNewSelections;
    }

    public final void set(PaymentSelection updatedSelection) {
        this.savedStateHandle.set(EMBEDDED_SELECTION_KEY, updatedSelection);
        if (updatedSelection == null || !(updatedSelection instanceof PaymentSelection.New)) {
            return;
        }
        this.previousNewSelections.putParcelable(PaymentSelectionKt.getPaymentMethodType(updatedSelection), updatedSelection);
    }

    public final void setTemporary(String code) {
        this.savedStateHandle.set(EMBEDDED_TEMPORARY_SELECTION_KEY, code);
    }

    public final void setPreviousNewSelections(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.previousNewSelections.putAll(bundle);
    }

    public final PaymentSelection.New getPreviousNewSelection(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return (PaymentSelection.New) this.previousNewSelections.getParcelable(code);
    }
}
