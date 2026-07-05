package com.stripe.android.paymentelement.embedded.content;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.paymentelement.EmbeddedPaymentElement;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbackIdentifier;
import com.stripe.android.paymentelement.embedded.EmbeddedResultCallbackHelper;
import com.stripe.android.paymentelement.embedded.EmbeddedRowSelectionImmediateActionHandler;
import com.stripe.android.paymentelement.embedded.EmbeddedSelectionHolder;
import com.stripe.android.paymentelement.embedded.content.EmbeddedConfirmationStateHolder;
import com.stripe.android.paymentelement.embedded.form.FormContract;
import com.stripe.android.paymentelement.embedded.form.FormResult;
import com.stripe.android.paymentelement.embedded.manage.ManageContract;
import com.stripe.android.paymentelement.embedded.manage.ManageResult;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import com.stripe.android.paymentsheet.CustomerStateHolder;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.PaymentSelectionKt;
import com.stripe.android.paymentsheet.state.CustomerState;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultEmbeddedSheetLauncher.kt */
@EmbeddedPaymentElementScope
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B_\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\"\u0010'\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedSheetLauncher;", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "selectionHolder", "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;", "rowSelectionImmediateActionHandler", "Lcom/stripe/android/paymentelement/embedded/EmbeddedRowSelectionImmediateActionHandler;", "customerStateHolder", "Lcom/stripe/android/paymentsheet/CustomerStateHolder;", "sheetStateHolder", "Lcom/stripe/android/paymentelement/embedded/content/SheetStateHolder;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "statusBarColor", "", "paymentElementCallbackIdentifier", "", "embeddedResultCallbackHelper", "Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;", "<init>", "(Landroidx/activity/result/ActivityResultCaller;Landroidx/lifecycle/LifecycleOwner;Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;Lcom/stripe/android/paymentelement/embedded/EmbeddedRowSelectionImmediateActionHandler;Lcom/stripe/android/paymentsheet/CustomerStateHolder;Lcom/stripe/android/paymentelement/embedded/content/SheetStateHolder;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Ljava/lang/Integer;Ljava/lang/String;Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;)V", "Ljava/lang/Integer;", "formActivityLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;", "manageActivityLauncher", "Lcom/stripe/android/paymentelement/embedded/manage/ManageContract$Args;", "launchForm", "", "code", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "hasSavedPaymentMethods", "", "embeddedConfirmationState", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;", "launchManage", "customerState", "Lcom/stripe/android/paymentsheet/state/CustomerState;", BaseSheetViewModel.SAVE_SELECTION, "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultEmbeddedSheetLauncher implements EmbeddedSheetLauncher {
    public static final int $stable = 8;
    private final CustomerStateHolder customerStateHolder;
    private final ErrorReporter errorReporter;
    private final ActivityResultLauncher<FormContract.Args> formActivityLauncher;
    private final ActivityResultLauncher<ManageContract.Args> manageActivityLauncher;
    private final String paymentElementCallbackIdentifier;
    private final EmbeddedRowSelectionImmediateActionHandler rowSelectionImmediateActionHandler;
    private final EmbeddedSelectionHolder selectionHolder;
    private final SheetStateHolder sheetStateHolder;
    private final Integer statusBarColor;

    @Inject
    public DefaultEmbeddedSheetLauncher(ActivityResultCaller activityResultCaller, LifecycleOwner lifecycleOwner, EmbeddedSelectionHolder selectionHolder, EmbeddedRowSelectionImmediateActionHandler rowSelectionImmediateActionHandler, CustomerStateHolder customerStateHolder, SheetStateHolder sheetStateHolder, ErrorReporter errorReporter, @Named(NamedConstantsKt.STATUS_BAR_COLOR) Integer num, @PaymentElementCallbackIdentifier String paymentElementCallbackIdentifier, final EmbeddedResultCallbackHelper embeddedResultCallbackHelper) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(selectionHolder, "selectionHolder");
        Intrinsics.checkNotNullParameter(rowSelectionImmediateActionHandler, "rowSelectionImmediateActionHandler");
        Intrinsics.checkNotNullParameter(customerStateHolder, "customerStateHolder");
        Intrinsics.checkNotNullParameter(sheetStateHolder, "sheetStateHolder");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
        Intrinsics.checkNotNullParameter(embeddedResultCallbackHelper, "embeddedResultCallbackHelper");
        this.selectionHolder = selectionHolder;
        this.rowSelectionImmediateActionHandler = rowSelectionImmediateActionHandler;
        this.customerStateHolder = customerStateHolder;
        this.sheetStateHolder = sheetStateHolder;
        this.errorReporter = errorReporter;
        this.statusBarColor = num;
        this.paymentElementCallbackIdentifier = paymentElementCallbackIdentifier;
        lifecycleOwner.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedSheetLauncher.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                DefaultEmbeddedSheetLauncher.this.formActivityLauncher.unregister();
                DefaultEmbeddedSheetLauncher.this.manageActivityLauncher.unregister();
                super.onDestroy(owner);
            }
        });
        this.formActivityLauncher = activityResultCaller.registerForActivityResult(FormContract.INSTANCE, new ActivityResultCallback() { // from class: com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedSheetLauncher$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                DefaultEmbeddedSheetLauncher.formActivityLauncher$lambda$1(this.f$0, embeddedResultCallbackHelper, (FormResult) obj);
            }
        });
        this.manageActivityLauncher = activityResultCaller.registerForActivityResult(ManageContract.INSTANCE, new ActivityResultCallback() { // from class: com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedSheetLauncher$$ExternalSyntheticLambda1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                DefaultEmbeddedSheetLauncher.manageActivityLauncher$lambda$2(this.f$0, (ManageResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void formActivityLauncher$lambda$1(DefaultEmbeddedSheetLauncher defaultEmbeddedSheetLauncher, EmbeddedResultCallbackHelper embeddedResultCallbackHelper, FormResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        defaultEmbeddedSheetLauncher.sheetStateHolder.setSheetIsOpen(false);
        defaultEmbeddedSheetLauncher.selectionHolder.setTemporary(null);
        if (result instanceof FormResult.Complete) {
            FormResult.Complete complete = (FormResult.Complete) result;
            defaultEmbeddedSheetLauncher.selectionHolder.set(complete.getSelection());
            if (complete.getHasBeenConfirmed()) {
                embeddedResultCallbackHelper.setResult(new EmbeddedPaymentElement.Result.Completed());
                return;
            } else {
                if (complete.getSelection() != null) {
                    defaultEmbeddedSheetLauncher.rowSelectionImmediateActionHandler.invoke();
                    return;
                }
                return;
            }
        }
        if (result instanceof FormResult.Cancelled) {
            embeddedResultCallbackHelper.setResult(new EmbeddedPaymentElement.Result.Canceled());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void manageActivityLauncher$lambda$2(DefaultEmbeddedSheetLauncher defaultEmbeddedSheetLauncher, ManageResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        defaultEmbeddedSheetLauncher.sheetStateHolder.setSheetIsOpen(false);
        if (result instanceof ManageResult.Error) {
            return;
        }
        if (!(result instanceof ManageResult.Complete)) {
            throw new NoWhenBranchMatchedException();
        }
        ManageResult.Complete complete = (ManageResult.Complete) result;
        defaultEmbeddedSheetLauncher.customerStateHolder.setCustomerState(complete.getCustomerState());
        defaultEmbeddedSheetLauncher.selectionHolder.set(complete.getSelection());
        if (complete.getShouldInvokeSelectionCallback() && (complete.getSelection() instanceof PaymentSelection.Saved)) {
            defaultEmbeddedSheetLauncher.rowSelectionImmediateActionHandler.invoke();
        }
    }

    @Override // com.stripe.android.paymentelement.embedded.content.EmbeddedSheetLauncher
    public void launchForm(String code, PaymentMethodMetadata paymentMethodMetadata, boolean hasSavedPaymentMethods, EmbeddedConfirmationStateHolder.State embeddedConfirmationState) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
        if (embeddedConfirmationState == null) {
            ErrorReporter.DefaultImpls.report$default(this.errorReporter, ErrorReporter.UnexpectedErrorEvent.EMBEDDED_SHEET_LAUNCHER_EMBEDDED_STATE_IS_NULL, null, null, 6, null);
            return;
        }
        if (this.sheetStateHolder.getSheetIsOpen()) {
            return;
        }
        this.sheetStateHolder.setSheetIsOpen(true);
        this.selectionHolder.setTemporary(code);
        PaymentSelection value = this.selectionHolder.getSelection().getValue();
        PaymentSelection.New r0 = value instanceof PaymentSelection.New ? (PaymentSelection.New) value : null;
        PaymentSelection.New previousNewSelection = Intrinsics.areEqual(r0 != null ? PaymentSelectionKt.getPaymentMethodType(r0) : null, code) ? r0 : null;
        if (previousNewSelection == null) {
            previousNewSelection = this.selectionHolder.getPreviousNewSelection(code);
        }
        this.formActivityLauncher.launch(new FormContract.Args(code, paymentMethodMetadata, hasSavedPaymentMethods, embeddedConfirmationState.getConfiguration(), embeddedConfirmationState.getInitializationMode(), this.paymentElementCallbackIdentifier, this.statusBarColor, previousNewSelection));
    }

    @Override // com.stripe.android.paymentelement.embedded.content.EmbeddedSheetLauncher
    public void launchManage(PaymentMethodMetadata paymentMethodMetadata, CustomerState customerState, PaymentSelection selection) {
        Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
        Intrinsics.checkNotNullParameter(customerState, "customerState");
        if (this.sheetStateHolder.getSheetIsOpen()) {
            return;
        }
        this.sheetStateHolder.setSheetIsOpen(true);
        this.manageActivityLauncher.launch(new ManageContract.Args(paymentMethodMetadata, customerState, selection, this.paymentElementCallbackIdentifier));
    }
}
