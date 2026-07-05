package com.stripe.android.paymentsheet.ui;

import com.facebook.internal.ServerProtocol;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.lpmfoundations.luxe.SupportedPaymentMethod;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.paymentsheet.DefaultFormHelper;
import com.stripe.android.paymentsheet.FormHelper;
import com.stripe.android.paymentsheet.forms.FormFieldValues;
import com.stripe.android.paymentsheet.model.PaymentMethodIncentive;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.paymentdatacollection.FormArguments;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormArguments;
import com.stripe.android.paymentsheet.ui.AddPaymentMethodInteractor;
import com.stripe.android.paymentsheet.ui.DefaultAddPaymentMethodInteractor;
import com.stripe.android.paymentsheet.verticalmode.BankFormInteractor;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.uicore.elements.FormElement;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: AddPaymentMethodInteractor.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 12\u00020\u0001:\u00011B\u0087\u0002\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0016\u0010\u000f\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u001c\u0010\u0012\u001a\u0018\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\r0\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0016\u0010\u0017\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00160\u0010\u0012\u001a\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00160\u0019\u0012\u0016\u0010\u001b\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00160\u0010\u0012\u0016\u0010\u001c\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u001d0\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020\t¢\u0006\u0004\b!\u0010\"J\b\u0010,\u001a\u00020(H\u0002J\u0010\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020\u0016H\u0016R\u0012\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u0018\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\r0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00160\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00160\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00160\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u001d0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010#R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020(0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u00062"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;", "Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;", "initiallySelectedPaymentMethodType", "", "Lcom/stripe/android/model/PaymentMethodCode;", BaseSheetViewModel.SAVE_SELECTION, "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", BaseSheetViewModel.SAVE_PROCESSING, "", "incentive", "Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;", "supportedPaymentMethods", "", "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;", "createFormArguments", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", "formElementsForCode", "Lcom/stripe/android/uicore/elements/FormElement;", "clearErrorMessages", "Lkotlin/Function0;", "", "reportFieldInteraction", "onFormFieldValuesChanged", "Lkotlin/Function2;", "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;", "reportPaymentMethodTypeSelected", "createUSBankAccountFormArguments", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", NamedConstantsKt.IS_LIVE_MODE, "<init>", "(Ljava/lang/String;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;Z)V", "()Z", "_selectedPaymentMethodCode", "Lkotlinx/coroutines/flow/MutableStateFlow;", "selectedPaymentMethodCode", "_state", "Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;", ServerProtocol.DIALOG_PARAM_STATE, "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "getInitialState", "handleViewAction", "viewAction", "Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$ViewAction;", "close", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultAddPaymentMethodInteractor implements AddPaymentMethodInteractor {
    private final MutableStateFlow<String> _selectedPaymentMethodCode;
    private final MutableStateFlow<AddPaymentMethodInteractor.State> _state;
    private final Function0<Unit> clearErrorMessages;
    private final CoroutineScope coroutineScope;
    private final Function1<String, FormArguments> createFormArguments;
    private final Function1<String, USBankAccountFormArguments> createUSBankAccountFormArguments;
    private final Function1<String, List<FormElement>> formElementsForCode;
    private final StateFlow<PaymentMethodIncentive> incentive;
    private final String initiallySelectedPaymentMethodType;
    private final boolean isLiveMode;
    private final Function2<FormFieldValues, String, Unit> onFormFieldValuesChanged;
    private final StateFlow<Boolean> processing;
    private final Function1<String, Unit> reportFieldInteraction;
    private final Function1<String, Unit> reportPaymentMethodTypeSelected;
    private final StateFlow<String> selectedPaymentMethodCode;
    private final StateFlow<PaymentSelection> selection;
    private final StateFlow<AddPaymentMethodInteractor.State> state;
    private final List<SupportedPaymentMethod> supportedPaymentMethods;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultAddPaymentMethodInteractor(String initiallySelectedPaymentMethodType, StateFlow<? extends PaymentSelection> selection, StateFlow<Boolean> processing, StateFlow<PaymentMethodIncentive> incentive, List<SupportedPaymentMethod> supportedPaymentMethods, Function1<? super String, FormArguments> createFormArguments, Function1<? super String, ? extends List<? extends FormElement>> formElementsForCode, Function0<Unit> clearErrorMessages, Function1<? super String, Unit> reportFieldInteraction, Function2<? super FormFieldValues, ? super String, Unit> onFormFieldValuesChanged, Function1<? super String, Unit> reportPaymentMethodTypeSelected, Function1<? super String, USBankAccountFormArguments> createUSBankAccountFormArguments, CoroutineScope coroutineScope, boolean z) {
        Intrinsics.checkNotNullParameter(initiallySelectedPaymentMethodType, "initiallySelectedPaymentMethodType");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(processing, "processing");
        Intrinsics.checkNotNullParameter(incentive, "incentive");
        Intrinsics.checkNotNullParameter(supportedPaymentMethods, "supportedPaymentMethods");
        Intrinsics.checkNotNullParameter(createFormArguments, "createFormArguments");
        Intrinsics.checkNotNullParameter(formElementsForCode, "formElementsForCode");
        Intrinsics.checkNotNullParameter(clearErrorMessages, "clearErrorMessages");
        Intrinsics.checkNotNullParameter(reportFieldInteraction, "reportFieldInteraction");
        Intrinsics.checkNotNullParameter(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        Intrinsics.checkNotNullParameter(reportPaymentMethodTypeSelected, "reportPaymentMethodTypeSelected");
        Intrinsics.checkNotNullParameter(createUSBankAccountFormArguments, "createUSBankAccountFormArguments");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.initiallySelectedPaymentMethodType = initiallySelectedPaymentMethodType;
        this.selection = selection;
        this.processing = processing;
        this.incentive = incentive;
        this.supportedPaymentMethods = supportedPaymentMethods;
        this.createFormArguments = createFormArguments;
        this.formElementsForCode = formElementsForCode;
        this.clearErrorMessages = clearErrorMessages;
        this.reportFieldInteraction = reportFieldInteraction;
        this.onFormFieldValuesChanged = onFormFieldValuesChanged;
        this.reportPaymentMethodTypeSelected = reportPaymentMethodTypeSelected;
        this.createUSBankAccountFormArguments = createUSBankAccountFormArguments;
        this.coroutineScope = coroutineScope;
        this.isLiveMode = z;
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow(initiallySelectedPaymentMethodType);
        this._selectedPaymentMethodCode = MutableStateFlow;
        this.selectedPaymentMethodCode = MutableStateFlow;
        MutableStateFlow<AddPaymentMethodInteractor.State> MutableStateFlow2 = StateFlowKt.MutableStateFlow(getInitialState());
        this._state = MutableStateFlow2;
        this.state = MutableStateFlow2;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(null), 3, null);
    }

    @Override // com.stripe.android.paymentsheet.ui.AddPaymentMethodInteractor
    /* renamed from: isLiveMode, reason: from getter */
    public boolean getIsLiveMode() {
        return this.isLiveMode;
    }

    /* compiled from: AddPaymentMethodInteractor.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor$Companion;", "", "<init>", "()V", "create", "Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;", "viewModel", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AddPaymentMethodInteractor create(final BaseSheetViewModel viewModel, final PaymentMethodMetadata paymentMethodMetadata) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
            CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
            FormHelper formHelperCreate$default = DefaultFormHelper.Companion.create$default(DefaultFormHelper.INSTANCE, viewModel, paymentMethodMetadata, null, 4, null);
            final BankFormInteractor bankFormInteractorCreate = BankFormInteractor.INSTANCE.create(viewModel);
            return new DefaultAddPaymentMethodInteractor(viewModel.getInitiallySelectedPaymentMethodType(), viewModel.getSelection$paymentsheet_release(), viewModel.getProcessing(), bankFormInteractorCreate.getPaymentMethodIncentiveInteractor().getDisplayedIncentive(), paymentMethodMetadata.sortedSupportedPaymentMethods(), new DefaultAddPaymentMethodInteractor$Companion$create$1(formHelperCreate$default), new DefaultAddPaymentMethodInteractor$Companion$create$2(formHelperCreate$default), new DefaultAddPaymentMethodInteractor$Companion$create$3(viewModel), new DefaultAddPaymentMethodInteractor$Companion$create$4(viewModel.getAnalyticsListener()), new DefaultAddPaymentMethodInteractor$Companion$create$5(formHelperCreate$default), new DefaultAddPaymentMethodInteractor$Companion$create$6(viewModel.getEventReporter()), new Function1() { // from class: com.stripe.android.paymentsheet.ui.DefaultAddPaymentMethodInteractor$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultAddPaymentMethodInteractor.Companion.create$lambda$0(viewModel, paymentMethodMetadata, bankFormInteractorCreate, (String) obj);
                }
            }, CoroutineScope, paymentMethodMetadata.getStripeIntent().isLiveMode());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final USBankAccountFormArguments create$lambda$0(BaseSheetViewModel baseSheetViewModel, PaymentMethodMetadata paymentMethodMetadata, BankFormInteractor bankFormInteractor, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return USBankAccountFormArguments.INSTANCE.create(baseSheetViewModel, paymentMethodMetadata, "payment_element", it, bankFormInteractor);
        }
    }

    @Override // com.stripe.android.paymentsheet.ui.AddPaymentMethodInteractor
    public StateFlow<AddPaymentMethodInteractor.State> getState() {
        return this.state;
    }

    private final AddPaymentMethodInteractor.State getInitialState() {
        String value = this.selectedPaymentMethodCode.getValue();
        return new AddPaymentMethodInteractor.State(value, this.supportedPaymentMethods, this.createFormArguments.invoke(value), this.formElementsForCode.invoke(value), this.selection.getValue(), this.processing.getValue().booleanValue(), this.incentive.getValue(), this.createUSBankAccountFormArguments.invoke(value));
    }

    /* compiled from: AddPaymentMethodInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.ui.DefaultAddPaymentMethodInteractor$1", f = "AddPaymentMethodInteractor.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.ui.DefaultAddPaymentMethodInteractor$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultAddPaymentMethodInteractor.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlow = DefaultAddPaymentMethodInteractor.this.selection;
                final DefaultAddPaymentMethodInteractor defaultAddPaymentMethodInteractor = DefaultAddPaymentMethodInteractor.this;
                this.label = 1;
                if (stateFlow.collect(new FlowCollector() { // from class: com.stripe.android.paymentsheet.ui.DefaultAddPaymentMethodInteractor.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((PaymentSelection) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(PaymentSelection paymentSelection, Continuation<? super Unit> continuation) {
                        defaultAddPaymentMethodInteractor.clearErrorMessages.invoke();
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: AddPaymentMethodInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.ui.DefaultAddPaymentMethodInteractor$2", f = "AddPaymentMethodInteractor.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.ui.DefaultAddPaymentMethodInteractor$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultAddPaymentMethodInteractor.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlow = DefaultAddPaymentMethodInteractor.this.selectedPaymentMethodCode;
                final DefaultAddPaymentMethodInteractor defaultAddPaymentMethodInteractor = DefaultAddPaymentMethodInteractor.this;
                this.label = 1;
                if (stateFlow.collect(new FlowCollector() { // from class: com.stripe.android.paymentsheet.ui.DefaultAddPaymentMethodInteractor.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((String) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(String str, Continuation<? super Unit> continuation) {
                        defaultAddPaymentMethodInteractor._state.setValue(AddPaymentMethodInteractor.State.copy$default((AddPaymentMethodInteractor.State) defaultAddPaymentMethodInteractor._state.getValue(), str, null, (FormArguments) defaultAddPaymentMethodInteractor.createFormArguments.invoke(str), (List) defaultAddPaymentMethodInteractor.formElementsForCode.invoke(str), null, false, null, (USBankAccountFormArguments) defaultAddPaymentMethodInteractor.createUSBankAccountFormArguments.invoke(str), 114, null));
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: AddPaymentMethodInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.ui.DefaultAddPaymentMethodInteractor$3", f = "AddPaymentMethodInteractor.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.ui.DefaultAddPaymentMethodInteractor$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultAddPaymentMethodInteractor.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlow = DefaultAddPaymentMethodInteractor.this.selection;
                final DefaultAddPaymentMethodInteractor defaultAddPaymentMethodInteractor = DefaultAddPaymentMethodInteractor.this;
                this.label = 1;
                if (stateFlow.collect(new FlowCollector() { // from class: com.stripe.android.paymentsheet.ui.DefaultAddPaymentMethodInteractor.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((PaymentSelection) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(PaymentSelection paymentSelection, Continuation<? super Unit> continuation) {
                        defaultAddPaymentMethodInteractor._state.setValue(AddPaymentMethodInteractor.State.copy$default((AddPaymentMethodInteractor.State) defaultAddPaymentMethodInteractor._state.getValue(), null, null, null, null, paymentSelection, false, null, null, 239, null));
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: AddPaymentMethodInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.ui.DefaultAddPaymentMethodInteractor$4", f = "AddPaymentMethodInteractor.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.ui.DefaultAddPaymentMethodInteractor$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultAddPaymentMethodInteractor.this.new AnonymousClass4(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlow = DefaultAddPaymentMethodInteractor.this.processing;
                final DefaultAddPaymentMethodInteractor defaultAddPaymentMethodInteractor = DefaultAddPaymentMethodInteractor.this;
                this.label = 1;
                if (stateFlow.collect(new FlowCollector() { // from class: com.stripe.android.paymentsheet.ui.DefaultAddPaymentMethodInteractor.4.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        defaultAddPaymentMethodInteractor._state.setValue(AddPaymentMethodInteractor.State.copy$default((AddPaymentMethodInteractor.State) defaultAddPaymentMethodInteractor._state.getValue(), null, null, null, null, null, z, null, null, 223, null));
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Override // com.stripe.android.paymentsheet.ui.AddPaymentMethodInteractor
    public void handleViewAction(AddPaymentMethodInteractor.ViewAction viewAction) {
        Intrinsics.checkNotNullParameter(viewAction, "viewAction");
        if (viewAction instanceof AddPaymentMethodInteractor.ViewAction.ReportFieldInteraction) {
            this.reportFieldInteraction.invoke(((AddPaymentMethodInteractor.ViewAction.ReportFieldInteraction) viewAction).getCode());
            return;
        }
        if (viewAction instanceof AddPaymentMethodInteractor.ViewAction.OnFormFieldValuesChanged) {
            AddPaymentMethodInteractor.ViewAction.OnFormFieldValuesChanged onFormFieldValuesChanged = (AddPaymentMethodInteractor.ViewAction.OnFormFieldValuesChanged) viewAction;
            this.onFormFieldValuesChanged.invoke(onFormFieldValuesChanged.getFormValues(), onFormFieldValuesChanged.getSelectedPaymentMethodCode());
        } else {
            if (!(viewAction instanceof AddPaymentMethodInteractor.ViewAction.OnPaymentMethodSelected)) {
                throw new NoWhenBranchMatchedException();
            }
            AddPaymentMethodInteractor.ViewAction.OnPaymentMethodSelected onPaymentMethodSelected = (AddPaymentMethodInteractor.ViewAction.OnPaymentMethodSelected) viewAction;
            if (Intrinsics.areEqual(this.selectedPaymentMethodCode.getValue(), onPaymentMethodSelected.getCode())) {
                return;
            }
            this._selectedPaymentMethodCode.setValue(onPaymentMethodSelected.getCode());
            this.reportPaymentMethodTypeSelected.invoke(onPaymentMethodSelected.getCode());
        }
    }

    @Override // com.stripe.android.paymentsheet.ui.AddPaymentMethodInteractor
    public void close() {
        CoroutineScopeKt.cancel$default(this.coroutineScope, null, 1, null);
    }
}
