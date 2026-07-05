package com.stripe.android.paymentelement.embedded.manage;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.injection.UIContext;
import com.stripe.android.core.injection.ViewModelScope;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.paymentelement.embedded.EmbeddedSelectionHolder;
import com.stripe.android.paymentelement.embedded.manage.ManageNavigator;
import com.stripe.android.paymentsheet.CustomerStateHolder;
import com.stripe.android.paymentsheet.DisplayableSavedPaymentMethod;
import com.stripe.android.paymentsheet.SavedPaymentMethod;
import com.stripe.android.paymentsheet.SavedPaymentMethodMutator;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.uicore.utils.StateFlowsKt;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: ManageSavedPaymentMethodMutatorFactory.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001Bk\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0013\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000b¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/manage/ManageSavedPaymentMethodMutatorFactory;", "", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "customerRepository", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", "selectionHolder", "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;", "customerStateHolder", "Lcom/stripe/android/paymentsheet/CustomerStateHolder;", "manageNavigatorProvider", "Ljavax/inject/Provider;", "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "uiContext", "viewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "updateScreenInteractorFactoryProvider", "Lcom/stripe/android/paymentelement/embedded/manage/EmbeddedUpdateScreenInteractorFactory;", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;Lcom/stripe/android/paymentsheet/CustomerStateHolder;Ljavax/inject/Provider;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineScope;Ljavax/inject/Provider;)V", "createSavedPaymentMethodMutator", "Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;", "onPaymentMethodRemoved", "", "onUpdatePaymentMethod", "displayableSavedPaymentMethod", "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ManageSavedPaymentMethodMutatorFactory {
    public static final int $stable = 8;
    private final CustomerRepository customerRepository;
    private final CustomerStateHolder customerStateHolder;
    private final EventReporter eventReporter;
    private final Provider<ManageNavigator> manageNavigatorProvider;
    private final PaymentMethodMetadata paymentMethodMetadata;
    private final EmbeddedSelectionHolder selectionHolder;
    private final CoroutineContext uiContext;
    private final Provider<EmbeddedUpdateScreenInteractorFactory> updateScreenInteractorFactoryProvider;
    private final CoroutineScope viewModelScope;
    private final CoroutineContext workContext;

    @Inject
    public ManageSavedPaymentMethodMutatorFactory(EventReporter eventReporter, CustomerRepository customerRepository, EmbeddedSelectionHolder selectionHolder, CustomerStateHolder customerStateHolder, Provider<ManageNavigator> manageNavigatorProvider, PaymentMethodMetadata paymentMethodMetadata, @IOContext CoroutineContext workContext, @UIContext CoroutineContext uiContext, @ViewModelScope CoroutineScope viewModelScope, Provider<EmbeddedUpdateScreenInteractorFactory> updateScreenInteractorFactoryProvider) {
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(customerRepository, "customerRepository");
        Intrinsics.checkNotNullParameter(selectionHolder, "selectionHolder");
        Intrinsics.checkNotNullParameter(customerStateHolder, "customerStateHolder");
        Intrinsics.checkNotNullParameter(manageNavigatorProvider, "manageNavigatorProvider");
        Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        Intrinsics.checkNotNullParameter(updateScreenInteractorFactoryProvider, "updateScreenInteractorFactoryProvider");
        this.eventReporter = eventReporter;
        this.customerRepository = customerRepository;
        this.selectionHolder = selectionHolder;
        this.customerStateHolder = customerStateHolder;
        this.manageNavigatorProvider = manageNavigatorProvider;
        this.paymentMethodMetadata = paymentMethodMetadata;
        this.workContext = workContext;
        this.uiContext = uiContext;
        this.viewModelScope = viewModelScope;
        this.updateScreenInteractorFactoryProvider = updateScreenInteractorFactoryProvider;
    }

    public final SavedPaymentMethodMutator createSavedPaymentMethodMutator() {
        return new SavedPaymentMethodMutator(StateFlowsKt.stateFlowOf(this.paymentMethodMetadata), this.eventReporter, this.viewModelScope, this.workContext, this.uiContext, this.customerRepository, this.selectionHolder.getSelection(), new AnonymousClass1(this.selectionHolder), this.customerStateHolder, new AnonymousClass2(null), new AnonymousClass3(this), new Function5() { // from class: com.stripe.android.paymentelement.embedded.manage.ManageSavedPaymentMethodMutatorFactory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function5
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return ManageSavedPaymentMethodMutatorFactory.createSavedPaymentMethodMutator$lambda$0(this.f$0, (DisplayableSavedPaymentMethod) obj, ((Boolean) obj2).booleanValue(), (Function1) obj3, (Function2) obj4, (Function2) obj5);
            }
        }, StateFlowsKt.stateFlowOf(false), false);
    }

    /* compiled from: ManageSavedPaymentMethodMutatorFactory.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentelement.embedded.manage.ManageSavedPaymentMethodMutatorFactory$createSavedPaymentMethodMutator$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<PaymentSelection, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, EmbeddedSelectionHolder.class, "set", "set(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PaymentSelection paymentSelection) {
            invoke2(paymentSelection);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PaymentSelection paymentSelection) {
            ((EmbeddedSelectionHolder) this.receiver).set(paymentSelection);
        }
    }

    /* compiled from: ManageSavedPaymentMethodMutatorFactory.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentelement.embedded.manage.ManageSavedPaymentMethodMutatorFactory$createSavedPaymentMethodMutator$2", f = "ManageSavedPaymentMethodMutatorFactory.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentelement.embedded.manage.ManageSavedPaymentMethodMutatorFactory$createSavedPaymentMethodMutator$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return ManageSavedPaymentMethodMutatorFactory.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (ManageSavedPaymentMethodMutatorFactory.this.customerStateHolder.getPaymentMethods().getValue().size() > 1) {
                    ((ManageNavigator) ManageSavedPaymentMethodMutatorFactory.this.manageNavigatorProvider.get()).performAction(ManageNavigator.Action.Back.INSTANCE);
                    this.label = 1;
                    if (BuildersKt.withContext(ManageSavedPaymentMethodMutatorFactory.this.workContext, new AnonymousClass1(null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: ManageSavedPaymentMethodMutatorFactory.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.paymentelement.embedded.manage.ManageSavedPaymentMethodMutatorFactory$createSavedPaymentMethodMutator$2$1", f = "ManageSavedPaymentMethodMutatorFactory.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.paymentelement.embedded.manage.ManageSavedPaymentMethodMutatorFactory$createSavedPaymentMethodMutator$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(continuation);
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
                    if (DelayKt.delay(600L, this) == coroutine_suspended) {
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
    }

    /* compiled from: ManageSavedPaymentMethodMutatorFactory.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentelement.embedded.manage.ManageSavedPaymentMethodMutatorFactory$createSavedPaymentMethodMutator$3, reason: invalid class name */
    /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function0<Unit> {
        AnonymousClass3(Object obj) {
            super(0, obj, ManageSavedPaymentMethodMutatorFactory.class, "onPaymentMethodRemoved", "onPaymentMethodRemoved()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((ManageSavedPaymentMethodMutatorFactory) this.receiver).onPaymentMethodRemoved();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createSavedPaymentMethodMutator$lambda$0(ManageSavedPaymentMethodMutatorFactory manageSavedPaymentMethodMutatorFactory, DisplayableSavedPaymentMethod displayableSavedPaymentMethod, boolean z, Function1 function1, Function2 function2, Function2 function22) {
        Intrinsics.checkNotNullParameter(displayableSavedPaymentMethod, "displayableSavedPaymentMethod");
        Intrinsics.checkNotNullParameter(function1, "<unused var>");
        Intrinsics.checkNotNullParameter(function2, "<unused var>");
        Intrinsics.checkNotNullParameter(function22, "<unused var>");
        manageSavedPaymentMethodMutatorFactory.onUpdatePaymentMethod(displayableSavedPaymentMethod);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPaymentMethodRemoved() {
        if (this.customerStateHolder.getPaymentMethods().getValue().isEmpty()) {
            this.manageNavigatorProvider.get().performAction(new ManageNavigator.Action.Close(false, 1, null));
        }
    }

    private final void onUpdatePaymentMethod(DisplayableSavedPaymentMethod displayableSavedPaymentMethod) {
        if (Intrinsics.areEqual(displayableSavedPaymentMethod.getSavedPaymentMethod(), SavedPaymentMethod.Unexpected.INSTANCE)) {
            return;
        }
        this.manageNavigatorProvider.get().performAction(new ManageNavigator.Action.GoToScreen(new ManageNavigator.Screen.Update(this.updateScreenInteractorFactoryProvider.get().createUpdateScreenInteractor(displayableSavedPaymentMethod))));
    }
}
