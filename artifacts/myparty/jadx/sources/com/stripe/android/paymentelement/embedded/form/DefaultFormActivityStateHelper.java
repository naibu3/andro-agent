package com.stripe.android.paymentelement.embedded.form;

import com.facebook.internal.ServerProtocol;
import com.stripe.android.core.injection.ViewModelScope;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentelement.EmbeddedPaymentElement;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.paymentelement.embedded.EmbeddedSelectionHolder;
import com.stripe.android.paymentelement.embedded.form.FormActivityStateHelper;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.model.IntentKt;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import com.stripe.android.paymentsheet.ui.PrimaryButtonProcessingState;
import com.stripe.android.paymentsheet.utils.ConfirmationReportingUtilsKt;
import com.stripe.android.paymentsheet.utils.PrimaryButtonUtilsKt;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.ui.core.Amount;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: FormActivityStateHelper.kt */
@Singleton
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0012\u0010 \u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010\u001fH\u0016J \u0010\"\u001a\u00020\u001a2\u0016\u0010#\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00180$H\u0016J\u0014\u0010%\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u001cH\u0002J\u0018\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J#\u0010)\u001a\u0004\u0018\u00010*2\b\u0010)\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0002\u0010.R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityStateHelper;", "Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "selectionHolder", "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;", "configuration", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;", "onClickDelegate", "Lcom/stripe/android/paymentelement/embedded/form/OnClickOverrideDelegate;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;Lcom/stripe/android/paymentelement/embedded/form/OnClickOverrideDelegate;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lkotlinx/coroutines/CoroutineScope;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;", ServerProtocol.DIALOG_PARAM_STATE, "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "usBankAccountFormPrimaryButtonUiState", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;", "updateConfirmationState", "", "confirmationState", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;", "updateMandate", "mandateText", "Lcom/stripe/android/core/strings/ResolvableString;", "updateError", "error", "updatePrimaryButton", "callback", "Lkotlin/Function1;", "updateWithConfirmationState", "primaryButtonLabel", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, "Lcom/stripe/android/ui/core/Amount;", "", "currency", "", "(Ljava/lang/Long;Ljava/lang/String;)Lcom/stripe/android/ui/core/Amount;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultFormActivityStateHelper implements FormActivityStateHelper {
    public static final int $stable = 8;
    private final MutableStateFlow<FormActivityStateHelper.State> _state;
    private final EmbeddedPaymentElement.Configuration configuration;
    private final EventReporter eventReporter;
    private final OnClickOverrideDelegate onClickDelegate;
    private final PaymentMethodMetadata paymentMethodMetadata;
    private final EmbeddedSelectionHolder selectionHolder;
    private final StateFlow<FormActivityStateHelper.State> state;
    private PrimaryButton.UIState usBankAccountFormPrimaryButtonUiState;

    /* compiled from: FormActivityStateHelper.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EmbeddedPaymentElement.FormSheetAction.values().length];
            try {
                iArr[EmbeddedPaymentElement.FormSheetAction.Continue.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EmbeddedPaymentElement.FormSheetAction.Confirm.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public DefaultFormActivityStateHelper(PaymentMethodMetadata paymentMethodMetadata, EmbeddedSelectionHolder selectionHolder, EmbeddedPaymentElement.Configuration configuration, OnClickOverrideDelegate onClickDelegate, EventReporter eventReporter, @ViewModelScope CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
        Intrinsics.checkNotNullParameter(selectionHolder, "selectionHolder");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(onClickDelegate, "onClickDelegate");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.paymentMethodMetadata = paymentMethodMetadata;
        this.selectionHolder = selectionHolder;
        this.configuration = configuration;
        this.onClickDelegate = onClickDelegate;
        this.eventReporter = eventReporter;
        MutableStateFlow<FormActivityStateHelper.State> MutableStateFlow = StateFlowKt.MutableStateFlow(new FormActivityStateHelper.State(primaryButtonLabel(paymentMethodMetadata.getStripeIntent(), configuration), false, new PrimaryButtonProcessingState.Idle(null), false, configuration.getFormSheetAction() == EmbeddedPaymentElement.FormSheetAction.Confirm, null, null, 96, null));
        this._state = MutableStateFlow;
        this.state = MutableStateFlow;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(null), 3, null);
    }

    @Override // com.stripe.android.paymentelement.embedded.form.FormActivityStateHelper
    public StateFlow<FormActivityStateHelper.State> getState() {
        return this.state;
    }

    /* compiled from: FormActivityStateHelper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentelement.embedded.form.DefaultFormActivityStateHelper$1", f = "FormActivityStateHelper.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentelement.embedded.form.DefaultFormActivityStateHelper$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultFormActivityStateHelper.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: FormActivityStateHelper.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", BaseSheetViewModel.SAVE_SELECTION, "Lcom/stripe/android/paymentsheet/model/PaymentSelection;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.paymentelement.embedded.form.DefaultFormActivityStateHelper$1$1", f = "FormActivityStateHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.paymentelement.embedded.form.DefaultFormActivityStateHelper$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01921 extends SuspendLambda implements Function2<PaymentSelection, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DefaultFormActivityStateHelper this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01921(DefaultFormActivityStateHelper defaultFormActivityStateHelper, Continuation<? super C01921> continuation) {
                super(2, continuation);
                this.this$0 = defaultFormActivityStateHelper;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C01921 c01921 = new C01921(this.this$0, continuation);
                c01921.L$0 = obj;
                return c01921;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PaymentSelection paymentSelection, Continuation<? super Unit> continuation) {
                return ((C01921) create(paymentSelection, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                FormActivityStateHelper.State state;
                boolean enabled;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    PaymentSelection paymentSelection = (PaymentSelection) this.L$0;
                    MutableStateFlow mutableStateFlow = this.this$0._state;
                    DefaultFormActivityStateHelper defaultFormActivityStateHelper = this.this$0;
                    do {
                        value = mutableStateFlow.getValue();
                        state = (FormActivityStateHelper.State) value;
                        PrimaryButton.UIState uIState = defaultFormActivityStateHelper.usBankAccountFormPrimaryButtonUiState;
                        if (uIState != null) {
                            enabled = uIState.getEnabled();
                        } else {
                            enabled = (paymentSelection == null || state.isProcessing()) ? false : true;
                        }
                    } while (!mutableStateFlow.compareAndSet(value, FormActivityStateHelper.State.copy$default(state, null, enabled, null, false, false, null, null, 125, null)));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (FlowKt.collectLatest(DefaultFormActivityStateHelper.this.selectionHolder.getSelection(), new C01921(DefaultFormActivityStateHelper.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.stripe.android.paymentelement.embedded.form.FormActivityStateHelper
    public void updateConfirmationState(ConfirmationHandler.State confirmationState) {
        FormActivityStateHelper.State value;
        Intrinsics.checkNotNullParameter(confirmationState, "confirmationState");
        MutableStateFlow<FormActivityStateHelper.State> mutableStateFlow = this._state;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, updateWithConfirmationState(value, confirmationState)));
    }

    @Override // com.stripe.android.paymentelement.embedded.form.FormActivityStateHelper
    public void updateMandate(ResolvableString mandateText) {
        MutableStateFlow<FormActivityStateHelper.State> mutableStateFlow = this._state;
        while (true) {
            FormActivityStateHelper.State value = mutableStateFlow.getValue();
            ResolvableString resolvableString = mandateText;
            if (mutableStateFlow.compareAndSet(value, FormActivityStateHelper.State.copy$default(value, null, false, null, false, false, null, resolvableString, 63, null))) {
                return;
            } else {
                mandateText = resolvableString;
            }
        }
    }

    @Override // com.stripe.android.paymentelement.embedded.form.FormActivityStateHelper
    public void updateError(ResolvableString error) {
        MutableStateFlow<FormActivityStateHelper.State> mutableStateFlow = this._state;
        while (true) {
            FormActivityStateHelper.State value = mutableStateFlow.getValue();
            ResolvableString resolvableString = error;
            if (mutableStateFlow.compareAndSet(value, FormActivityStateHelper.State.copy$default(value, null, false, null, false, false, resolvableString, null, 95, null))) {
                return;
            } else {
                error = resolvableString;
            }
        }
    }

    @Override // com.stripe.android.paymentelement.embedded.form.FormActivityStateHelper
    public void updatePrimaryButton(Function1<? super PrimaryButton.UIState, PrimaryButton.UIState> callback) {
        FormActivityStateHelper.State value;
        FormActivityStateHelper.State value2;
        Intrinsics.checkNotNullParameter(callback, "callback");
        PrimaryButton.UIState uIStateInvoke = callback.invoke(this.usBankAccountFormPrimaryButtonUiState);
        this.usBankAccountFormPrimaryButtonUiState = uIStateInvoke;
        if (uIStateInvoke != null) {
            this.onClickDelegate.set(uIStateInvoke.getOnClick());
            MutableStateFlow<FormActivityStateHelper.State> mutableStateFlow = this._state;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, FormActivityStateHelper.State.copy$default(value2, uIStateInvoke.getLabel(), uIStateInvoke.getEnabled(), null, false, false, null, null, 124, null)));
            return;
        }
        this.onClickDelegate.clear();
        MutableStateFlow<FormActivityStateHelper.State> mutableStateFlow2 = this._state;
        do {
            value = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.compareAndSet(value, FormActivityStateHelper.State.copy$default(value, primaryButtonLabel(this.paymentMethodMetadata.getStripeIntent(), this.configuration), this.selectionHolder.getSelection().getValue() != null, null, false, false, null, null, 124, null)));
    }

    private final FormActivityStateHelper.State updateWithConfirmationState(FormActivityStateHelper.State state, ConfirmationHandler.State state2) {
        if (state2 instanceof ConfirmationHandler.State.Complete) {
            ConfirmationHandler.State.Complete complete = (ConfirmationHandler.State.Complete) state2;
            ConfirmationReportingUtilsKt.reportPaymentResult(this.eventReporter, complete.getResult(), this.selectionHolder.getSelection().getValue());
            ConfirmationHandler.Result result = complete.getResult();
            if (result instanceof ConfirmationHandler.Result.Succeeded) {
                return FormActivityStateHelper.State.copy$default(state, null, false, PrimaryButtonProcessingState.Completed.INSTANCE, false, false, null, null, 121, null);
            }
            if (result instanceof ConfirmationHandler.Result.Failed) {
                return FormActivityStateHelper.State.copy$default(state, null, this.selectionHolder.getSelection().getValue() != null, new PrimaryButtonProcessingState.Idle(null), false, false, ((ConfirmationHandler.Result.Failed) complete.getResult()).getMessage(), null, 81, null);
            }
            if (!(result instanceof ConfirmationHandler.Result.Canceled)) {
                throw new NoWhenBranchMatchedException();
            }
            return FormActivityStateHelper.State.copy$default(state, null, this.selectionHolder.getSelection().getValue() != null, new PrimaryButtonProcessingState.Idle(null), false, false, null, null, 81, null);
        }
        if (state2 instanceof ConfirmationHandler.State.Confirming) {
            return FormActivityStateHelper.State.copy$default(state, null, false, PrimaryButtonProcessingState.Processing.INSTANCE, true, false, null, null, 81, null);
        }
        if (!(state2 instanceof ConfirmationHandler.State.Idle)) {
            throw new NoWhenBranchMatchedException();
        }
        return FormActivityStateHelper.State.copy$default(state, null, this.selectionHolder.getSelection().getValue() != null, new PrimaryButtonProcessingState.Idle(null), false, false, null, null, 113, null);
    }

    private final ResolvableString primaryButtonLabel(StripeIntent stripeIntent, EmbeddedPaymentElement.Configuration configuration) {
        Amount amount = amount(IntentKt.getAmount(stripeIntent), IntentKt.getCurrency(stripeIntent));
        String primaryButtonLabel$paymentsheet_release = configuration.getPrimaryButtonLabel();
        boolean z = stripeIntent instanceof PaymentIntent;
        int i = WhenMappings.$EnumSwitchMapping$0[configuration.getFormSheetAction().ordinal()];
        if (i == 1) {
            return PrimaryButtonUtilsKt.continueButtonLabel(primaryButtonLabel$paymentsheet_release);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return PrimaryButtonUtilsKt.buyButtonLabel(amount, primaryButtonLabel$paymentsheet_release, z);
    }

    private final Amount amount(Long amount, String currency) {
        if (amount == null || currency == null) {
            return null;
        }
        return new Amount(amount.longValue(), currency);
    }
}
