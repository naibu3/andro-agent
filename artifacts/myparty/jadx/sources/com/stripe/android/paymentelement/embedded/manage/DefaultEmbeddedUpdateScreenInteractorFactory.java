package com.stripe.android.paymentelement.embedded.manage;

import com.facebook.soloader.Elf64;
import com.stripe.android.CardBrandFilter;
import com.stripe.android.lpmfoundations.paymentmethod.CustomerMetadata;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentelement.embedded.EmbeddedSelectionHolder;
import com.stripe.android.paymentelement.embedded.manage.DefaultEmbeddedUpdateScreenInteractorFactory;
import com.stripe.android.paymentelement.embedded.manage.ManageNavigator;
import com.stripe.android.paymentsheet.CardUpdateParams;
import com.stripe.android.paymentsheet.CustomerStateHolder;
import com.stripe.android.paymentsheet.DisplayableSavedPaymentMethod;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.SavedPaymentMethodMutator;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.state.CustomerState;
import com.stripe.android.paymentsheet.ui.DefaultUpdatePaymentMethodInteractor;
import com.stripe.android.paymentsheet.ui.UpdatePaymentMethodInteractor;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmbeddedUpdateScreenInteractorFactory.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001BE\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/manage/DefaultEmbeddedUpdateScreenInteractorFactory;", "Lcom/stripe/android/paymentelement/embedded/manage/EmbeddedUpdateScreenInteractorFactory;", "savedPaymentMethodMutatorProvider", "Ljavax/inject/Provider;", "Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "customerStateHolder", "Lcom/stripe/android/paymentsheet/CustomerStateHolder;", "selectionHolder", "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "manageNavigatorProvider", "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;", "<init>", "(Ljavax/inject/Provider;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/CustomerStateHolder;Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Ljavax/inject/Provider;)V", "createUpdateScreenInteractor", "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;", "displayableSavedPaymentMethod", "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultEmbeddedUpdateScreenInteractorFactory implements EmbeddedUpdateScreenInteractorFactory {
    public static final int $stable = 8;
    private final CustomerStateHolder customerStateHolder;
    private final EventReporter eventReporter;
    private final Provider<ManageNavigator> manageNavigatorProvider;
    private final PaymentMethodMetadata paymentMethodMetadata;
    private final Provider<SavedPaymentMethodMutator> savedPaymentMethodMutatorProvider;
    private final EmbeddedSelectionHolder selectionHolder;

    @Inject
    public DefaultEmbeddedUpdateScreenInteractorFactory(Provider<SavedPaymentMethodMutator> savedPaymentMethodMutatorProvider, PaymentMethodMetadata paymentMethodMetadata, CustomerStateHolder customerStateHolder, EmbeddedSelectionHolder selectionHolder, EventReporter eventReporter, Provider<ManageNavigator> manageNavigatorProvider) {
        Intrinsics.checkNotNullParameter(savedPaymentMethodMutatorProvider, "savedPaymentMethodMutatorProvider");
        Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
        Intrinsics.checkNotNullParameter(customerStateHolder, "customerStateHolder");
        Intrinsics.checkNotNullParameter(selectionHolder, "selectionHolder");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(manageNavigatorProvider, "manageNavigatorProvider");
        this.savedPaymentMethodMutatorProvider = savedPaymentMethodMutatorProvider;
        this.paymentMethodMetadata = paymentMethodMetadata;
        this.customerStateHolder = customerStateHolder;
        this.selectionHolder = selectionHolder;
        this.eventReporter = eventReporter;
        this.manageNavigatorProvider = manageNavigatorProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0054  */
    @Override // com.stripe.android.paymentelement.embedded.manage.EmbeddedUpdateScreenInteractorFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UpdatePaymentMethodInteractor createUpdateScreenInteractor(DisplayableSavedPaymentMethod displayableSavedPaymentMethod) {
        boolean z;
        Intrinsics.checkNotNullParameter(displayableSavedPaymentMethod, "displayableSavedPaymentMethod");
        boolean zIsLiveMode = this.paymentMethodMetadata.getStripeIntent().isLiveMode();
        boolean zBooleanValue = this.customerStateHolder.getCanRemove().getValue().booleanValue();
        boolean zBooleanValue2 = this.customerStateHolder.getCanUpdateFullPaymentMethodDetails().getValue().booleanValue();
        CardBrandFilter cardBrandFilter = this.paymentMethodMetadata.getCardBrandFilter();
        PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode address = this.paymentMethodMetadata.getBillingDetailsCollectionConfiguration().getAddress();
        CustomerMetadata customerMetadata = this.paymentMethodMetadata.getCustomerMetadata();
        if (customerMetadata != null) {
            z = customerMetadata.isPaymentMethodSetAsDefaultEnabled();
        }
        CustomerState value = this.customerStateHolder.getCustomer().getValue();
        return new DefaultUpdatePaymentMethodInteractor(zIsLiveMode, zBooleanValue, displayableSavedPaymentMethod, cardBrandFilter, address, zBooleanValue2, displayableSavedPaymentMethod.isDefaultPaymentMethod(value != null ? value.getDefaultPaymentMethodId() : null), z, new AnonymousClass1(null), new AnonymousClass2(null), new AnonymousClass3(null), new Function1() { // from class: com.stripe.android.paymentelement.embedded.manage.DefaultEmbeddedUpdateScreenInteractorFactory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DefaultEmbeddedUpdateScreenInteractorFactory.createUpdateScreenInteractor$lambda$0(this.f$0, (CardBrand) obj);
            }
        }, new Function0() { // from class: com.stripe.android.paymentelement.embedded.manage.DefaultEmbeddedUpdateScreenInteractorFactory$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DefaultEmbeddedUpdateScreenInteractorFactory.createUpdateScreenInteractor$lambda$1(this.f$0);
            }
        }, null, 8192, null);
    }

    /* compiled from: EmbeddedUpdateScreenInteractorFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "method", "Lcom/stripe/android/model/PaymentMethod;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentelement.embedded.manage.DefaultEmbeddedUpdateScreenInteractorFactory$createUpdateScreenInteractor$1", f = "EmbeddedUpdateScreenInteractorFactory.kt", i = {0}, l = {40}, m = "invokeSuspend", n = {"method"}, s = {"L$0"})
    /* renamed from: com.stripe.android.paymentelement.embedded.manage.DefaultEmbeddedUpdateScreenInteractorFactory$createUpdateScreenInteractor$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<PaymentMethod, Continuation<? super Throwable>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = DefaultEmbeddedUpdateScreenInteractorFactory.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaymentMethod paymentMethod, Continuation<? super Throwable> continuation) {
            return ((AnonymousClass1) create(paymentMethod, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            PaymentMethod paymentMethod;
            PaymentMethod paymentMethod2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PaymentMethod paymentMethod3 = (PaymentMethod) this.L$0;
                this.L$0 = paymentMethod3;
                this.label = 1;
                Object objRemovePaymentMethodInEditScreen = ((SavedPaymentMethodMutator) DefaultEmbeddedUpdateScreenInteractorFactory.this.savedPaymentMethodMutatorProvider.get()).removePaymentMethodInEditScreen(paymentMethod3, this);
                if (objRemovePaymentMethodInEditScreen == coroutine_suspended) {
                    return coroutine_suspended;
                }
                paymentMethod = paymentMethod3;
                obj = objRemovePaymentMethodInEditScreen;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                paymentMethod = (PaymentMethod) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            Throwable th = (Throwable) obj;
            if (th == null) {
                PaymentSelection value = DefaultEmbeddedUpdateScreenInteractorFactory.this.selectionHolder.getSelection().getValue();
                String str = paymentMethod.id;
                PaymentSelection.Saved saved = value instanceof PaymentSelection.Saved ? (PaymentSelection.Saved) value : null;
                if (Intrinsics.areEqual(str, (saved == null || (paymentMethod2 = saved.getPaymentMethod()) == null) ? null : paymentMethod2.id)) {
                    DefaultEmbeddedUpdateScreenInteractorFactory.this.selectionHolder.set(null);
                }
            }
            return th;
        }
    }

    /* compiled from: EmbeddedUpdateScreenInteractorFactory.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/model/PaymentMethod;", "method", "cardUpdateParams", "Lcom/stripe/android/paymentsheet/CardUpdateParams;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentelement.embedded.manage.DefaultEmbeddedUpdateScreenInteractorFactory$createUpdateScreenInteractor$2", f = "EmbeddedUpdateScreenInteractorFactory.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentelement.embedded.manage.DefaultEmbeddedUpdateScreenInteractorFactory$createUpdateScreenInteractor$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function3<PaymentMethod, CardUpdateParams, Continuation<? super Result<? extends PaymentMethod>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(3, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(PaymentMethod paymentMethod, CardUpdateParams cardUpdateParams, Continuation<? super Result<PaymentMethod>> continuation) {
            AnonymousClass2 anonymousClass2 = DefaultEmbeddedUpdateScreenInteractorFactory.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = paymentMethod;
            anonymousClass2.L$1 = cardUpdateParams;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(PaymentMethod paymentMethod, CardUpdateParams cardUpdateParams, Continuation<? super Result<? extends PaymentMethod>> continuation) {
            return invoke2(paymentMethod, cardUpdateParams, (Continuation<? super Result<PaymentMethod>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM8236modifyCardPaymentMethodBWLJW6A;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PaymentMethod paymentMethod = (PaymentMethod) this.L$0;
                CardUpdateParams cardUpdateParams = (CardUpdateParams) this.L$1;
                SavedPaymentMethodMutator savedPaymentMethodMutator = (SavedPaymentMethodMutator) DefaultEmbeddedUpdateScreenInteractorFactory.this.savedPaymentMethodMutatorProvider.get();
                final DefaultEmbeddedUpdateScreenInteractorFactory defaultEmbeddedUpdateScreenInteractorFactory = DefaultEmbeddedUpdateScreenInteractorFactory.this;
                this.L$0 = null;
                this.label = 1;
                objM8236modifyCardPaymentMethodBWLJW6A = savedPaymentMethodMutator.m8236modifyCardPaymentMethodBWLJW6A(paymentMethod, cardUpdateParams, new Function1() { // from class: com.stripe.android.paymentelement.embedded.manage.DefaultEmbeddedUpdateScreenInteractorFactory$createUpdateScreenInteractor$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return DefaultEmbeddedUpdateScreenInteractorFactory.AnonymousClass2.invokeSuspend$lambda$0(defaultEmbeddedUpdateScreenInteractorFactory, (PaymentMethod) obj2);
                    }
                }, this);
                if (objM8236modifyCardPaymentMethodBWLJW6A == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM8236modifyCardPaymentMethodBWLJW6A = ((Result) obj).getValue();
            }
            return Result.m9117boximpl(objM8236modifyCardPaymentMethodBWLJW6A);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(DefaultEmbeddedUpdateScreenInteractorFactory defaultEmbeddedUpdateScreenInteractorFactory, PaymentMethod paymentMethod) {
            PaymentMethod paymentMethod2;
            PaymentSelection value = defaultEmbeddedUpdateScreenInteractorFactory.selectionHolder.getSelection().getValue();
            String str = paymentMethod.id;
            String str2 = null;
            PaymentSelection.Saved saved = value instanceof PaymentSelection.Saved ? (PaymentSelection.Saved) value : null;
            if (saved != null && (paymentMethod2 = saved.getPaymentMethod()) != null) {
                str2 = paymentMethod2.id;
            }
            if (Intrinsics.areEqual(str, str2)) {
                defaultEmbeddedUpdateScreenInteractorFactory.selectionHolder.set(new PaymentSelection.Saved(paymentMethod, null, null, 6, null));
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: EmbeddedUpdateScreenInteractorFactory.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "method", "Lcom/stripe/android/model/PaymentMethod;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentelement.embedded.manage.DefaultEmbeddedUpdateScreenInteractorFactory$createUpdateScreenInteractor$3", f = "EmbeddedUpdateScreenInteractorFactory.kt", i = {}, l = {Elf64.Ehdr.E_SHSTRNDX}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentelement.embedded.manage.DefaultEmbeddedUpdateScreenInteractorFactory$createUpdateScreenInteractor$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<PaymentMethod, Continuation<? super Result<? extends Unit>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = DefaultEmbeddedUpdateScreenInteractorFactory.this.new AnonymousClass3(continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(PaymentMethod paymentMethod, Continuation<? super Result<Unit>> continuation) {
            return ((AnonymousClass3) create(paymentMethod, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(PaymentMethod paymentMethod, Continuation<? super Result<? extends Unit>> continuation) {
            return invoke2(paymentMethod, (Continuation<? super Result<Unit>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM8237setDefaultPaymentMethodgIAlus$paymentsheet_release;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PaymentMethod paymentMethod = (PaymentMethod) this.L$0;
                this.label = 1;
                objM8237setDefaultPaymentMethodgIAlus$paymentsheet_release = ((SavedPaymentMethodMutator) DefaultEmbeddedUpdateScreenInteractorFactory.this.savedPaymentMethodMutatorProvider.get()).m8237setDefaultPaymentMethodgIAlus$paymentsheet_release(paymentMethod, this);
                if (objM8237setDefaultPaymentMethodgIAlus$paymentsheet_release == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM8237setDefaultPaymentMethodgIAlus$paymentsheet_release = ((Result) obj).getValue();
            }
            return Result.m9117boximpl(objM8237setDefaultPaymentMethodgIAlus$paymentsheet_release);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createUpdateScreenInteractor$lambda$0(DefaultEmbeddedUpdateScreenInteractorFactory defaultEmbeddedUpdateScreenInteractorFactory, CardBrand it) {
        Intrinsics.checkNotNullParameter(it, "it");
        defaultEmbeddedUpdateScreenInteractorFactory.eventReporter.onBrandChoiceSelected(EventReporter.CardBrandChoiceEventSource.Edit, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createUpdateScreenInteractor$lambda$1(DefaultEmbeddedUpdateScreenInteractorFactory defaultEmbeddedUpdateScreenInteractorFactory) {
        defaultEmbeddedUpdateScreenInteractorFactory.manageNavigatorProvider.get().performAction(ManageNavigator.Action.Back.INSTANCE);
        return Unit.INSTANCE;
    }
}
