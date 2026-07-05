package com.stripe.android.paymentsheet.ui;

import com.facebook.internal.ServerProtocol;
import com.stripe.android.model.CardBrand;
import com.stripe.android.paymentsheet.CardUpdateParams;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.ui.EditCardDetailsInteractor;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: EditCardDetailsInteractor.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u00015Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rj\u0002`\u0010\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000f0\rj\u0002`\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\"\u001a\u0004\u0018\u00010\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\u0012\u0010#\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0018H\u0002J\u0012\u0010$\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\u0010\u0010\f\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020.H\u0016J\f\u0010/\u001a\u00020\u0018*\u00020\u0007H\u0002J\f\u00100\u001a\u00020&*\u00020\u0007H\u0002J\f\u00101\u001a\u000202*\u00020\u0007H\u0002J\n\u00103\u001a\u0004\u0018\u00010\u001cH\u0002J\u001c\u00104\u001a\u00020\u001f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rj\u0002`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0011\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000f0\rj\u0002`\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00066"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;", "Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;", "payload", "Lcom/stripe/android/paymentsheet/ui/EditCardPayload;", "billingDetailsCollectionConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "cardEditConfiguration", "Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;", "requiresModification", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "onBrandChoiceChanged", "Lkotlin/Function1;", "Lcom/stripe/android/model/CardBrand;", "", "Lcom/stripe/android/paymentsheet/ui/CardBrandCallback;", "onCardUpdateParamsChanged", "Lcom/stripe/android/paymentsheet/CardUpdateParams;", "Lcom/stripe/android/paymentsheet/ui/CardUpdateParamsCallback;", "<init>", "(Lcom/stripe/android/paymentsheet/ui/EditCardPayload;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;ZLkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "cardDetailsEntry", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;", "billingDetailsEntry", "Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;", "billingDetailsForm", "Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;", ServerProtocol.DIALOG_PARAM_STATE, "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$State;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "newCardUpdateParams", "hasCardDetailsChanged", "hasBillingDetailsChanged", "cardBrandChoice", "Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;", "onDateChanged", "text", "", "onBillingAddressFormChanged", "Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;", "handleViewAction", "viewAction", "Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$ViewAction;", "buildDefaultCardEntry", "defaultCardBrandChoice", "defaultExpiryDateState", "Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;", "defaultBillingDetailsForm", "uiState", "Factory", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultEditCardDetailsInteractor implements EditCardDetailsInteractor {
    public static final int $stable = 8;
    private final PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration;
    private final MutableStateFlow<BillingDetailsEntry> billingDetailsEntry;
    private final BillingDetailsForm billingDetailsForm;
    private final MutableStateFlow<CardDetailsEntry> cardDetailsEntry;
    private final CardEditConfiguration cardEditConfiguration;
    private final CoroutineScope coroutineScope;
    private final Function1<CardBrand, Unit> onBrandChoiceChanged;
    private final Function1<CardUpdateParams, Unit> onCardUpdateParamsChanged;
    private final EditCardPayload payload;
    private final boolean requiresModification;
    private final StateFlow<EditCardDetailsInteractor.State> state;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultEditCardDetailsInteractor(EditCardPayload payload, PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, CardEditConfiguration cardEditConfiguration, boolean z, CoroutineScope coroutineScope, Function1<? super CardBrand, Unit> onBrandChoiceChanged, Function1<? super CardUpdateParams, Unit> onCardUpdateParamsChanged) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(onBrandChoiceChanged, "onBrandChoiceChanged");
        Intrinsics.checkNotNullParameter(onCardUpdateParamsChanged, "onCardUpdateParamsChanged");
        this.payload = payload;
        this.billingDetailsCollectionConfiguration = billingDetailsCollectionConfiguration;
        this.cardEditConfiguration = cardEditConfiguration;
        this.requiresModification = z;
        this.coroutineScope = coroutineScope;
        this.onBrandChoiceChanged = onBrandChoiceChanged;
        this.onCardUpdateParamsChanged = onCardUpdateParamsChanged;
        MutableStateFlow<CardDetailsEntry> MutableStateFlow = StateFlowKt.MutableStateFlow(cardEditConfiguration != null ? buildDefaultCardEntry(cardEditConfiguration) : null);
        this.cardDetailsEntry = MutableStateFlow;
        this.billingDetailsEntry = StateFlowKt.MutableStateFlow(null);
        BillingDetailsForm billingDetailsFormDefaultBillingDetailsForm = defaultBillingDetailsForm();
        this.billingDetailsForm = billingDetailsFormDefaultBillingDetailsForm;
        this.state = FlowKt.stateIn(FlowKt.mapLatest(MutableStateFlow, new DefaultEditCardDetailsInteractor$state$1(this, null)), coroutineScope, SharingStarted.INSTANCE.getEagerly(), uiState(MutableStateFlow.getValue(), billingDetailsFormDefaultBillingDetailsForm));
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new AnonymousClass1(null), 2, null);
    }

    @Override // com.stripe.android.paymentsheet.ui.EditCardDetailsInteractor
    public StateFlow<EditCardDetailsInteractor.State> getState() {
        return this.state;
    }

    /* compiled from: EditCardDetailsInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.ui.DefaultEditCardDetailsInteractor$1", f = "EditCardDetailsInteractor.kt", i = {}, l = {230}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.ui.DefaultEditCardDetailsInteractor$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultEditCardDetailsInteractor.this.new AnonymousClass1(continuation);
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
                this.label = 1;
                if (FlowKt.collectLatest(FlowKt.combine(DefaultEditCardDetailsInteractor.this.cardDetailsEntry, DefaultEditCardDetailsInteractor.this.billingDetailsEntry, new C02151(DefaultEditCardDetailsInteractor.this, null)), new AnonymousClass2(DefaultEditCardDetailsInteractor.this, null), this) == coroutine_suspended) {
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

        /* compiled from: EditCardDetailsInteractor.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/paymentsheet/CardUpdateParams;", "cardDetailsEntry", "Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;", "billingDetailsEntry", "Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.paymentsheet.ui.DefaultEditCardDetailsInteractor$1$1", f = "EditCardDetailsInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.paymentsheet.ui.DefaultEditCardDetailsInteractor$1$1, reason: invalid class name and collision with other inner class name */
        static final class C02151 extends SuspendLambda implements Function3<CardDetailsEntry, BillingDetailsEntry, Continuation<? super CardUpdateParams>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;
            final /* synthetic */ DefaultEditCardDetailsInteractor this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02151(DefaultEditCardDetailsInteractor defaultEditCardDetailsInteractor, Continuation<? super C02151> continuation) {
                super(3, continuation);
                this.this$0 = defaultEditCardDetailsInteractor;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(CardDetailsEntry cardDetailsEntry, BillingDetailsEntry billingDetailsEntry, Continuation<? super CardUpdateParams> continuation) {
                C02151 c02151 = new C02151(this.this$0, continuation);
                c02151.L$0 = cardDetailsEntry;
                c02151.L$1 = billingDetailsEntry;
                return c02151.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    return this.this$0.newCardUpdateParams((CardDetailsEntry) this.L$0, (BillingDetailsEntry) this.L$1);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: EditCardDetailsInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "newParams", "Lcom/stripe/android/paymentsheet/CardUpdateParams;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.paymentsheet.ui.DefaultEditCardDetailsInteractor$1$2", f = "EditCardDetailsInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.paymentsheet.ui.DefaultEditCardDetailsInteractor$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CardUpdateParams, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DefaultEditCardDetailsInteractor this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(DefaultEditCardDetailsInteractor defaultEditCardDetailsInteractor, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = defaultEditCardDetailsInteractor;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CardUpdateParams cardUpdateParams, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(cardUpdateParams, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.onCardUpdateParamsChanged.invoke((CardUpdateParams) this.L$0);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CardUpdateParams newCardUpdateParams(CardDetailsEntry cardDetailsEntry, BillingDetailsEntry billingDetailsEntry) {
        boolean z = false;
        boolean z2 = hasCardDetailsChanged(cardDetailsEntry) || hasBillingDetailsChanged(billingDetailsEntry);
        if ((cardDetailsEntry == null || cardDetailsEntry.isComplete()) && (billingDetailsEntry == null || billingDetailsEntry.isComplete(this.billingDetailsCollectionConfiguration))) {
            z = true;
        }
        if ((z2 || !this.requiresModification) && z) {
            return CardDetailsEntryKt.toUpdateParams(cardDetailsEntry, billingDetailsEntry);
        }
        return null;
    }

    private final boolean hasCardDetailsChanged(CardDetailsEntry cardDetailsEntry) {
        CardEditConfiguration cardEditConfiguration = this.cardEditConfiguration;
        if (cardEditConfiguration == null || cardDetailsEntry == null) {
            return false;
        }
        return cardDetailsEntry.hasChanged(this.payload, defaultCardBrandChoice(cardEditConfiguration));
    }

    private final boolean hasBillingDetailsChanged(BillingDetailsEntry billingDetailsEntry) {
        if (billingDetailsEntry != null) {
            return billingDetailsEntry.hasChanged(this.payload.getBillingDetails(), this.billingDetailsCollectionConfiguration);
        }
        return false;
    }

    private final void onBrandChoiceChanged(CardBrandChoice cardBrandChoice) {
        CardDetailsEntry value;
        CardDetailsEntry cardDetailsEntry;
        if (this.cardEditConfiguration != null) {
            EditCardDetailsInteractor.CardDetailsState cardDetailsState = getState().getValue().getCardDetailsState();
            if (!Intrinsics.areEqual(cardBrandChoice, cardDetailsState != null ? cardDetailsState.getSelectedCardBrand() : null)) {
                this.onBrandChoiceChanged.invoke(cardBrandChoice.getBrand());
            }
            MutableStateFlow<CardDetailsEntry> mutableStateFlow = this.cardDetailsEntry;
            do {
                value = mutableStateFlow.getValue();
                cardDetailsEntry = value;
            } while (!mutableStateFlow.compareAndSet(value, cardDetailsEntry != null ? CardDetailsEntry.copy$default(cardDetailsEntry, cardBrandChoice, null, 2, null) : null));
        }
    }

    private final void onDateChanged(String text) {
        CardDetailsEntry value;
        CardDetailsEntry cardDetailsEntry;
        if (this.cardEditConfiguration != null) {
            MutableStateFlow<CardDetailsEntry> mutableStateFlow = this.cardDetailsEntry;
            do {
                value = mutableStateFlow.getValue();
                cardDetailsEntry = value;
            } while (!mutableStateFlow.compareAndSet(value, cardDetailsEntry != null ? CardDetailsEntry.copy$default(cardDetailsEntry, null, cardDetailsEntry.getExpiryDateState().onDateChanged(text), 1, null) : null));
        }
    }

    private final void onBillingAddressFormChanged(BillingDetailsFormState state) {
        this.billingDetailsEntry.setValue(new BillingDetailsEntry(state));
    }

    @Override // com.stripe.android.paymentsheet.ui.EditCardDetailsInteractor
    public void handleViewAction(EditCardDetailsInteractor.ViewAction viewAction) {
        Intrinsics.checkNotNullParameter(viewAction, "viewAction");
        if (viewAction instanceof EditCardDetailsInteractor.ViewAction.BrandChoiceChanged) {
            onBrandChoiceChanged(((EditCardDetailsInteractor.ViewAction.BrandChoiceChanged) viewAction).getCardBrandChoice());
        } else if (viewAction instanceof EditCardDetailsInteractor.ViewAction.DateChanged) {
            onDateChanged(((EditCardDetailsInteractor.ViewAction.DateChanged) viewAction).getText());
        } else {
            if (!(viewAction instanceof EditCardDetailsInteractor.ViewAction.BillingDetailsChanged)) {
                throw new NoWhenBranchMatchedException();
            }
            onBillingAddressFormChanged(((EditCardDetailsInteractor.ViewAction.BillingDetailsChanged) viewAction).getBillingDetailsFormState());
        }
    }

    private final CardDetailsEntry buildDefaultCardEntry(CardEditConfiguration cardEditConfiguration) {
        return new CardDetailsEntry(defaultCardBrandChoice(cardEditConfiguration), defaultExpiryDateState(cardEditConfiguration));
    }

    private final CardBrandChoice defaultCardBrandChoice(CardEditConfiguration cardEditConfiguration) {
        return PaymentMethodCardKtxKt.getPreferredChoice(this.payload, cardEditConfiguration.getCardBrandFilter());
    }

    private final ExpiryDateState defaultExpiryDateState(CardEditConfiguration cardEditConfiguration) {
        return ExpiryDateState.INSTANCE.create(this.payload, cardEditConfiguration.getAreExpiryDateAndAddressModificationSupported());
    }

    private final BillingDetailsForm defaultBillingDetailsForm() {
        CardEditConfiguration cardEditConfiguration = this.cardEditConfiguration;
        boolean z = true;
        boolean z2 = (cardEditConfiguration != null ? cardEditConfiguration.getAreExpiryDateAndAddressModificationSupported() : true) && this.billingDetailsCollectionConfiguration.getAddress() != PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode.Never;
        if (!this.billingDetailsCollectionConfiguration.getCollectsName$paymentsheet_release() && !this.billingDetailsCollectionConfiguration.getCollectsEmail$paymentsheet_release() && !this.billingDetailsCollectionConfiguration.getCollectsPhone$paymentsheet_release()) {
            z = false;
        }
        if (z2 || z) {
            return new BillingDetailsForm(this.payload.getBillingDetails(), this.billingDetailsCollectionConfiguration.getAddress(), this.billingDetailsCollectionConfiguration.getCollectsName$paymentsheet_release(), this.billingDetailsCollectionConfiguration.getCollectsEmail$paymentsheet_release(), this.billingDetailsCollectionConfiguration.getCollectsPhone$paymentsheet_release());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditCardDetailsInteractor.State uiState(CardDetailsEntry cardDetailsEntry, BillingDetailsForm billingDetailsForm) {
        EditCardPayload editCardPayload = this.payload;
        EditCardDetailsInteractor.CardDetailsState cardDetailsState = null;
        int savedPaymentMethodIcon$default = PaymentMethodsUiExtensionKt.getSavedPaymentMethodIcon$default(editCardPayload, true, (Boolean) null, 2, (Object) null);
        if (this.cardEditConfiguration != null && cardDetailsEntry != null) {
            cardDetailsState = new EditCardDetailsInteractor.CardDetailsState(cardDetailsEntry.getCardBrandChoice(), this.cardEditConfiguration.isCbcModifiable(), PaymentMethodCardKtxKt.getAvailableNetworks(this.payload, this.cardEditConfiguration.getCardBrandFilter()), cardDetailsEntry.getExpiryDateState());
        }
        return new EditCardDetailsInteractor.State(editCardPayload, savedPaymentMethodIcon$default, cardDetailsState, billingDetailsForm);
    }

    /* compiled from: EditCardDetailsInteractor.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jd\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011j\u0002`\u00142\u0018\u0010\u0015\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00130\u0011j\u0002`\u0017H\u0016¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor$Factory;", "Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$Factory;", "<init>", "()V", "create", "Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "cardEditConfiguration", "Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;", "requiresModification", "", "payload", "Lcom/stripe/android/paymentsheet/ui/EditCardPayload;", "billingDetailsCollectionConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "onBrandChoiceChanged", "Lkotlin/Function1;", "Lcom/stripe/android/model/CardBrand;", "", "Lcom/stripe/android/paymentsheet/ui/CardBrandCallback;", "onCardUpdateParamsChanged", "Lcom/stripe/android/paymentsheet/CardUpdateParams;", "Lcom/stripe/android/paymentsheet/ui/CardUpdateParamsCallback;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements EditCardDetailsInteractor.Factory {
        public static final int $stable = 0;

        @Override // com.stripe.android.paymentsheet.ui.EditCardDetailsInteractor.Factory
        public EditCardDetailsInteractor create(CoroutineScope coroutineScope, CardEditConfiguration cardEditConfiguration, boolean requiresModification, EditCardPayload payload, PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, Function1<? super CardBrand, Unit> onBrandChoiceChanged, Function1<? super CardUpdateParams, Unit> onCardUpdateParamsChanged) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
            Intrinsics.checkNotNullParameter(onBrandChoiceChanged, "onBrandChoiceChanged");
            Intrinsics.checkNotNullParameter(onCardUpdateParamsChanged, "onCardUpdateParamsChanged");
            return new DefaultEditCardDetailsInteractor(payload, billingDetailsCollectionConfiguration, cardEditConfiguration, requiresModification, coroutineScope, onBrandChoiceChanged, onCardUpdateParamsChanged);
        }
    }
}
