package com.stripe.android.paymentsheet;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.link.LinkConfigurationCoordinator;
import com.stripe.android.link.ui.inline.InlineSignupViewState;
import com.stripe.android.lpmfoundations.luxe.SupportedPaymentMethod;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.lpmfoundations.paymentmethod.UiDefinitionFactory;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodExtraParams;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.paymentsheet.DefaultFormHelper;
import com.stripe.android.paymentsheet.FormHelper;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.forms.FormArgumentsFactory;
import com.stripe.android.paymentsheet.forms.FormFieldValues;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.PaymentSelectionKt;
import com.stripe.android.paymentsheet.paymentdatacollection.FormArguments;
import com.stripe.android.paymentsheet.ui.AddPaymentMethodKt;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.uicore.elements.AutocompleteAddressInteractor;
import com.stripe.android.uicore.elements.FormElement;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* compiled from: DefaultFormHelper.kt */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 >2\u00020\u0001:\u0001>By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00100\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010.\u001a\u00020!H\u0016J\u0014\u0010/\u001a\u0002002\n\u00101\u001a\u00060!j\u0002`%H\u0016J\u001a\u00102\u001a\u00020\u00102\b\u00103\u001a\u0004\u0018\u00010 2\u0006\u00104\u001a\u00020!H\u0016J\u001c\u00105\u001a\u0004\u0018\u0001062\b\u00103\u001a\u0004\u0018\u00010 2\u0006\u00104\u001a\u00020!H\u0016J\u001e\u00107\u001a\u00020\u00142\u0006\u00101\u001a\u00020!2\f\u00108\u001a\b\u0012\u0004\u0012\u00020-0,H\u0002J\u0014\u00109\u001a\u00020:2\n\u00101\u001a\u00060!j\u0002`%H\u0016J\u0010\u0010;\u001a\u00020<2\u0006\u0010.\u001a\u00020!H\u0002J\u0018\u0010=\u001a\u00020\u00102\u000e\u0010.\u001a\n\u0018\u00010!j\u0004\u0018\u0001`%H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u001d\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020!0\u001f0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0#X\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010&\u001a\n\u0018\u00010!j\u0004\u0018\u0001`%2\u000e\u0010$\u001a\n\u0018\u00010!j\u0004\u0018\u0001`%8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006?"}, d2 = {"Lcom/stripe/android/paymentsheet/DefaultFormHelper;", "Lcom/stripe/android/paymentsheet/FormHelper;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "linkInlineHandler", "Lcom/stripe/android/paymentsheet/LinkInlineHandler;", "cardAccountRangeRepositoryFactory", "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "newPaymentSelectionProvider", "Lkotlin/Function0;", "Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection;", "selectionUpdater", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "", "linkConfigurationCoordinator", "Lcom/stripe/android/link/LinkConfigurationCoordinator;", "setAsDefaultMatchesSaveForFutureUse", "", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "autocompleteAddressInteractorFactory", "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/paymentsheet/LinkInlineHandler;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/link/LinkConfigurationCoordinator;ZLcom/stripe/android/paymentsheet/analytics/EventReporter;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;)V", "lastFormValues", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlin/Pair;", "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;", "", "paymentSelection", "Lkotlinx/coroutines/flow/Flow;", "value", "Lcom/stripe/android/model/PaymentMethodCode;", "previouslyCompletedForm", "getPreviouslyCompletedForm", "()Ljava/lang/String;", "setPreviouslyCompletedForm", "(Ljava/lang/String;)V", "formElementsForCode", "", "Lcom/stripe/android/uicore/elements/FormElement;", "code", "createFormArguments", "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", "paymentMethodCode", "onFormFieldValuesChanged", "formValues", "selectedPaymentMethodCode", "getPaymentMethodParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "requiresFormScreen", "formElements", "formTypeForCode", "Lcom/stripe/android/paymentsheet/FormHelper$FormType;", "supportedPaymentMethodForCode", "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;", "reportFieldCompleted", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultFormHelper implements FormHelper {
    public static final String PREVIOUSLY_COMPLETED_PAYMENT_FORM = "previously_completed_payment_form";
    private final AutocompleteAddressInteractor.Factory autocompleteAddressInteractorFactory;
    private final CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory;
    private final CoroutineScope coroutineScope;
    private final EventReporter eventReporter;
    private final MutableSharedFlow<Pair<FormFieldValues, String>> lastFormValues;
    private final LinkConfigurationCoordinator linkConfigurationCoordinator;
    private final LinkInlineHandler linkInlineHandler;
    private final Function0<NewPaymentOptionSelection> newPaymentSelectionProvider;
    private final PaymentMethodMetadata paymentMethodMetadata;
    private final Flow<PaymentSelection> paymentSelection;
    private final SavedStateHandle savedStateHandle;
    private final Function1<PaymentSelection, Unit> selectionUpdater;
    private final boolean setAsDefaultMatchesSaveForFutureUse;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultFormHelper(CoroutineScope coroutineScope, LinkInlineHandler linkInlineHandler, CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory, PaymentMethodMetadata paymentMethodMetadata, Function0<? extends NewPaymentOptionSelection> newPaymentSelectionProvider, Function1<? super PaymentSelection, Unit> selectionUpdater, LinkConfigurationCoordinator linkConfigurationCoordinator, boolean z, EventReporter eventReporter, SavedStateHandle savedStateHandle, AutocompleteAddressInteractor.Factory factory) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(linkInlineHandler, "linkInlineHandler");
        Intrinsics.checkNotNullParameter(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
        Intrinsics.checkNotNullParameter(newPaymentSelectionProvider, "newPaymentSelectionProvider");
        Intrinsics.checkNotNullParameter(selectionUpdater, "selectionUpdater");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.coroutineScope = coroutineScope;
        this.linkInlineHandler = linkInlineHandler;
        this.cardAccountRangeRepositoryFactory = cardAccountRangeRepositoryFactory;
        this.paymentMethodMetadata = paymentMethodMetadata;
        this.newPaymentSelectionProvider = newPaymentSelectionProvider;
        this.selectionUpdater = selectionUpdater;
        this.linkConfigurationCoordinator = linkConfigurationCoordinator;
        this.setAsDefaultMatchesSaveForFutureUse = z;
        this.eventReporter = eventReporter;
        this.savedStateHandle = savedStateHandle;
        this.autocompleteAddressInteractorFactory = factory;
        MutableSharedFlow<Pair<FormFieldValues, String>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.lastFormValues = mutableSharedFlowMutableSharedFlow$default;
        this.paymentSelection = FlowKt.combine(mutableSharedFlowMutableSharedFlow$default, linkInlineHandler.getLinkInlineState(), new DefaultFormHelper$paymentSelection$1(this, null));
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(null), 3, null);
    }

    /* compiled from: DefaultFormHelper.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rJ8\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/DefaultFormHelper$Companion;", "", "<init>", "()V", "PREVIOUSLY_COMPLETED_PAYMENT_FORM", "", "create", "Lcom/stripe/android/paymentsheet/FormHelper;", "viewModel", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "linkInlineHandler", "Lcom/stripe/android/paymentsheet/LinkInlineHandler;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "cardAccountRangeRepositoryFactory", "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", "autocompleteAddressInteractorFactory", "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NewPaymentOptionSelection create$lambda$2() {
            return null;
        }

        private Companion() {
        }

        public static /* synthetic */ FormHelper create$default(Companion companion, BaseSheetViewModel baseSheetViewModel, PaymentMethodMetadata paymentMethodMetadata, LinkInlineHandler linkInlineHandler, int i, Object obj) {
            if ((i & 4) != 0) {
                linkInlineHandler = LinkInlineHandler.INSTANCE.create();
            }
            return companion.create(baseSheetViewModel, paymentMethodMetadata, linkInlineHandler);
        }

        public final FormHelper create(final BaseSheetViewModel viewModel, PaymentMethodMetadata paymentMethodMetadata, LinkInlineHandler linkInlineHandler) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
            Intrinsics.checkNotNullParameter(linkInlineHandler, "linkInlineHandler");
            return new DefaultFormHelper(ViewModelKt.getViewModelScope(viewModel), linkInlineHandler, viewModel.getCardAccountRangeRepositoryFactory(), paymentMethodMetadata, new Function0() { // from class: com.stripe.android.paymentsheet.DefaultFormHelper$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return viewModel.getNewPaymentSelection();
                }
            }, new Function1() { // from class: com.stripe.android.paymentsheet.DefaultFormHelper$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultFormHelper.Companion.create$lambda$1(viewModel, (PaymentSelection) obj);
                }
            }, viewModel.getLinkHandler().getLinkConfigurationCoordinator(), viewModel.getCustomerStateHolder().getPaymentMethods().getValue().isEmpty(), viewModel.getEventReporter(), viewModel.getSavedStateHandle(), viewModel.getAutocompleteAddressInteractorFactory());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit create$lambda$1(BaseSheetViewModel baseSheetViewModel, PaymentSelection paymentSelection) {
            baseSheetViewModel.updateSelection(paymentSelection);
            return Unit.INSTANCE;
        }

        public final FormHelper create(CoroutineScope coroutineScope, CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory, AutocompleteAddressInteractor.Factory autocompleteAddressInteractorFactory, PaymentMethodMetadata paymentMethodMetadata, EventReporter eventReporter, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
            Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
            Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new DefaultFormHelper(coroutineScope, LinkInlineHandler.INSTANCE.create(), cardAccountRangeRepositoryFactory, paymentMethodMetadata, new Function0() { // from class: com.stripe.android.paymentsheet.DefaultFormHelper$Companion$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DefaultFormHelper.Companion.create$lambda$2();
                }
            }, new Function1() { // from class: com.stripe.android.paymentsheet.DefaultFormHelper$Companion$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultFormHelper.Companion.create$lambda$3((PaymentSelection) obj);
                }
            }, null, false, eventReporter, savedStateHandle, autocompleteAddressInteractorFactory);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit create$lambda$3(PaymentSelection paymentSelection) {
            return Unit.INSTANCE;
        }
    }

    private final String getPreviouslyCompletedForm() {
        return (String) this.savedStateHandle.get(PREVIOUSLY_COMPLETED_PAYMENT_FORM);
    }

    private final void setPreviouslyCompletedForm(String str) {
        this.savedStateHandle.set(PREVIOUSLY_COMPLETED_PAYMENT_FORM, str);
    }

    /* compiled from: DefaultFormHelper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.DefaultFormHelper$1", f = "DefaultFormHelper.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.DefaultFormHelper$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultFormHelper.this.new AnonymousClass1(continuation);
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
                Flow flow = DefaultFormHelper.this.paymentSelection;
                final DefaultFormHelper defaultFormHelper = DefaultFormHelper.this;
                this.label = 1;
                if (flow.collect(new FlowCollector() { // from class: com.stripe.android.paymentsheet.DefaultFormHelper.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((PaymentSelection) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(PaymentSelection paymentSelection, Continuation<? super Unit> continuation) {
                        defaultFormHelper.selectionUpdater.invoke(paymentSelection);
                        defaultFormHelper.reportFieldCompleted(paymentSelection != null ? PaymentSelectionKt.getPaymentMethodType(paymentSelection) : null);
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
            return Unit.INSTANCE;
        }
    }

    @Override // com.stripe.android.paymentsheet.FormHelper
    public List<FormElement> formElementsForCode(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        NewPaymentOptionSelection newPaymentOptionSelectionInvoke = this.newPaymentSelectionProvider.invoke();
        if (newPaymentOptionSelectionInvoke == null || !Intrinsics.areEqual(newPaymentOptionSelectionInvoke.getType(), code)) {
            newPaymentOptionSelectionInvoke = null;
        }
        PaymentMethodMetadata paymentMethodMetadata = this.paymentMethodMetadata;
        CardAccountRangeRepository.Factory factory = this.cardAccountRangeRepositoryFactory;
        LinkConfigurationCoordinator linkConfigurationCoordinator = this.linkConfigurationCoordinator;
        LinkInlineHandler linkInlineHandler = this.linkInlineHandler;
        C10981 c10981 = new C10981(this.linkInlineHandler);
        PaymentMethodCreateParams paymentMethodCreateParams = newPaymentOptionSelectionInvoke != null ? newPaymentOptionSelectionInvoke.getPaymentMethodCreateParams() : null;
        PaymentMethodOptionsParams paymentMethodOptionParams = newPaymentOptionSelectionInvoke != null ? newPaymentOptionSelectionInvoke.getPaymentMethodOptionParams() : null;
        PaymentMethodExtraParams paymentMethodExtraParams = newPaymentOptionSelectionInvoke != null ? newPaymentOptionSelectionInvoke.getPaymentMethodExtraParams() : null;
        PaymentSelection paymentSelection = newPaymentOptionSelectionInvoke != null ? newPaymentOptionSelectionInvoke.getPaymentSelection() : null;
        List<FormElement> listFormElementsForCode = paymentMethodMetadata.formElementsForCode(code, new UiDefinitionFactory.Arguments.Factory.Default(factory, linkConfigurationCoordinator, linkInlineHandler, c10981, paymentMethodCreateParams, paymentMethodOptionParams, paymentMethodExtraParams, paymentSelection instanceof PaymentSelection.New.LinkInline ? ((PaymentSelection.New.LinkInline) paymentSelection).getInput() : null, this.setAsDefaultMatchesSaveForFutureUse, this.autocompleteAddressInteractorFactory));
        return listFormElementsForCode == null ? CollectionsKt.emptyList() : listFormElementsForCode;
    }

    /* compiled from: DefaultFormHelper.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.DefaultFormHelper$formElementsForCode$1, reason: invalid class name and case insensitive filesystem */
    /* synthetic */ class C10981 extends FunctionReferenceImpl implements Function1<InlineSignupViewState, Unit> {
        C10981(Object obj) {
            super(1, obj, LinkInlineHandler.class, "onStateUpdated", "onStateUpdated(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InlineSignupViewState inlineSignupViewState) {
            invoke2(inlineSignupViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InlineSignupViewState inlineSignupViewState) {
            ((LinkInlineHandler) this.receiver).onStateUpdated(inlineSignupViewState);
        }
    }

    @Override // com.stripe.android.paymentsheet.FormHelper
    public FormArguments createFormArguments(String paymentMethodCode) {
        Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
        return FormArgumentsFactory.INSTANCE.create(paymentMethodCode, this.paymentMethodMetadata);
    }

    /* compiled from: DefaultFormHelper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.DefaultFormHelper$onFormFieldValuesChanged$1", f = "DefaultFormHelper.kt", i = {}, l = {179}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.DefaultFormHelper$onFormFieldValuesChanged$1, reason: invalid class name and case insensitive filesystem */
    static final class C10991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FormFieldValues $formValues;
        final /* synthetic */ String $selectedPaymentMethodCode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10991(FormFieldValues formFieldValues, String str, Continuation<? super C10991> continuation) {
            super(2, continuation);
            this.$formValues = formFieldValues;
            this.$selectedPaymentMethodCode = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultFormHelper.this.new C10991(this.$formValues, this.$selectedPaymentMethodCode, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DefaultFormHelper.this.lastFormValues.emit(TuplesKt.to(this.$formValues, this.$selectedPaymentMethodCode), this) == coroutine_suspended) {
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

    @Override // com.stripe.android.paymentsheet.FormHelper
    public void onFormFieldValuesChanged(FormFieldValues formValues, String selectedPaymentMethodCode) {
        Intrinsics.checkNotNullParameter(selectedPaymentMethodCode, "selectedPaymentMethodCode");
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C10991(formValues, selectedPaymentMethodCode, null), 3, null);
    }

    @Override // com.stripe.android.paymentsheet.FormHelper
    public PaymentMethodCreateParams getPaymentMethodParams(FormFieldValues formValues, String selectedPaymentMethodCode) {
        Intrinsics.checkNotNullParameter(selectedPaymentMethodCode, "selectedPaymentMethodCode");
        if (formValues != null) {
            return AddPaymentMethodKt.transformToPaymentMethodCreateParams(formValues, selectedPaymentMethodCode, this.paymentMethodMetadata);
        }
        return null;
    }

    private final boolean requiresFormScreen(String paymentMethodCode, List<? extends FormElement> formElements) {
        List<? extends FormElement> list = formElements;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((FormElement) it.next()).getAllowsUserInteraction()) {
                    return true;
                }
            }
        }
        return Intrinsics.areEqual(paymentMethodCode, PaymentMethod.Type.USBankAccount.code) || Intrinsics.areEqual(paymentMethodCode, PaymentMethod.Type.Link.code);
    }

    @Override // com.stripe.android.paymentsheet.FormHelper
    public FormHelper.FormType formTypeForCode(String paymentMethodCode) {
        ResolvableString mandateText;
        Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
        List<FormElement> listFormElementsForCode = formElementsForCode(paymentMethodCode);
        if (requiresFormScreen(paymentMethodCode, listFormElementsForCode)) {
            return FormHelper.FormType.UserInteractionRequired.INSTANCE;
        }
        Iterator<T> it = listFormElementsForCode.iterator();
        while (true) {
            if (!it.hasNext()) {
                mandateText = null;
                break;
            }
            mandateText = ((FormElement) it.next()).getMandateText();
            if (mandateText != null) {
                break;
            }
        }
        if (mandateText == null) {
            return FormHelper.FormType.Empty.INSTANCE;
        }
        return new FormHelper.FormType.MandateOnly(mandateText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SupportedPaymentMethod supportedPaymentMethodForCode(String code) {
        SupportedPaymentMethod supportedPaymentMethodSupportedPaymentMethodForCode = this.paymentMethodMetadata.supportedPaymentMethodForCode(code);
        if (supportedPaymentMethodSupportedPaymentMethodForCode != null) {
            return supportedPaymentMethodSupportedPaymentMethodForCode;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportFieldCompleted(String code) {
        if (code == null || !Intrinsics.areEqual(formTypeForCode(code), FormHelper.FormType.UserInteractionRequired.INSTANCE) || Intrinsics.areEqual(getPreviouslyCompletedForm(), code)) {
            return;
        }
        this.eventReporter.onPaymentMethodFormCompleted(code);
        setPreviouslyCompletedForm(code);
    }
}
