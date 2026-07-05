package com.stripe.android.paymentelement.embedded.manage;

import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.paymentelement.embedded.EmbeddedSelectionHolder;
import com.stripe.android.paymentelement.embedded.manage.ManageNavigator;
import com.stripe.android.paymentsheet.CustomerStateHolder;
import com.stripe.android.paymentsheet.DisplayableSavedPaymentMethod;
import com.stripe.android.paymentsheet.SavedPaymentMethodMutator;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.verticalmode.DefaultManageScreenInteractor;
import com.stripe.android.paymentsheet.verticalmode.ManageScreenInteractor;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmbeddedManageScreenInteractorFactory.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/manage/DefaultEmbeddedManageScreenInteractorFactory;", "Lcom/stripe/android/paymentelement/embedded/manage/EmbeddedManageScreenInteractorFactory;", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "customerStateHolder", "Lcom/stripe/android/paymentsheet/CustomerStateHolder;", "selectionHolder", "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;", "savedPaymentMethodMutator", "Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "manageNavigatorProvider", "Ljavax/inject/Provider;", "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;", "<init>", "(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/CustomerStateHolder;Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Ljavax/inject/Provider;)V", "createManageScreenInteractor", "Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultEmbeddedManageScreenInteractorFactory implements EmbeddedManageScreenInteractorFactory {
    public static final int $stable = 8;
    private final CustomerStateHolder customerStateHolder;
    private final EventReporter eventReporter;
    private final Provider<ManageNavigator> manageNavigatorProvider;
    private final PaymentMethodMetadata paymentMethodMetadata;
    private final SavedPaymentMethodMutator savedPaymentMethodMutator;
    private final EmbeddedSelectionHolder selectionHolder;

    @Inject
    public DefaultEmbeddedManageScreenInteractorFactory(PaymentMethodMetadata paymentMethodMetadata, CustomerStateHolder customerStateHolder, EmbeddedSelectionHolder selectionHolder, SavedPaymentMethodMutator savedPaymentMethodMutator, EventReporter eventReporter, Provider<ManageNavigator> manageNavigatorProvider) {
        Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
        Intrinsics.checkNotNullParameter(customerStateHolder, "customerStateHolder");
        Intrinsics.checkNotNullParameter(selectionHolder, "selectionHolder");
        Intrinsics.checkNotNullParameter(savedPaymentMethodMutator, "savedPaymentMethodMutator");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(manageNavigatorProvider, "manageNavigatorProvider");
        this.paymentMethodMetadata = paymentMethodMetadata;
        this.customerStateHolder = customerStateHolder;
        this.selectionHolder = selectionHolder;
        this.savedPaymentMethodMutator = savedPaymentMethodMutator;
        this.eventReporter = eventReporter;
        this.manageNavigatorProvider = manageNavigatorProvider;
    }

    @Override // com.stripe.android.paymentelement.embedded.manage.EmbeddedManageScreenInteractorFactory
    public ManageScreenInteractor createManageScreenInteractor() {
        return new DefaultManageScreenInteractor(this.customerStateHolder.getPaymentMethods(), this.paymentMethodMetadata, this.selectionHolder.getSelection(), this.savedPaymentMethodMutator.getEditing$paymentsheet_release(), this.savedPaymentMethodMutator.getCanEdit(), new AnonymousClass1(this.savedPaymentMethodMutator), this.savedPaymentMethodMutator.getProvidePaymentMethodName(), new Function1() { // from class: com.stripe.android.paymentelement.embedded.manage.DefaultEmbeddedManageScreenInteractorFactory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DefaultEmbeddedManageScreenInteractorFactory.createManageScreenInteractor$lambda$0(this.f$0, (DisplayableSavedPaymentMethod) obj);
            }
        }, new AnonymousClass3(this.savedPaymentMethodMutator), new Function1() { // from class: com.stripe.android.paymentelement.embedded.manage.DefaultEmbeddedManageScreenInteractorFactory$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DefaultEmbeddedManageScreenInteractorFactory.createManageScreenInteractor$lambda$1(this.f$0, ((Boolean) obj).booleanValue());
            }
        }, this.savedPaymentMethodMutator.getDefaultPaymentMethodId(), null, 2048, null);
    }

    /* compiled from: EmbeddedManageScreenInteractorFactory.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentelement.embedded.manage.DefaultEmbeddedManageScreenInteractorFactory$createManageScreenInteractor$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Unit> {
        AnonymousClass1(Object obj) {
            super(0, obj, SavedPaymentMethodMutator.class, "toggleEditing", "toggleEditing()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((SavedPaymentMethodMutator) this.receiver).toggleEditing();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createManageScreenInteractor$lambda$0(DefaultEmbeddedManageScreenInteractorFactory defaultEmbeddedManageScreenInteractorFactory, DisplayableSavedPaymentMethod it) {
        Intrinsics.checkNotNullParameter(it, "it");
        PaymentSelection.Saved saved = new PaymentSelection.Saved(it.getPaymentMethod(), null, null, 6, null);
        defaultEmbeddedManageScreenInteractorFactory.selectionHolder.set(saved);
        defaultEmbeddedManageScreenInteractorFactory.eventReporter.onSelectPaymentOption(saved);
        defaultEmbeddedManageScreenInteractorFactory.manageNavigatorProvider.get().performAction(new ManageNavigator.Action.Close(true));
        return Unit.INSTANCE;
    }

    /* compiled from: EmbeddedManageScreenInteractorFactory.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentelement.embedded.manage.DefaultEmbeddedManageScreenInteractorFactory$createManageScreenInteractor$3, reason: invalid class name */
    /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function1<DisplayableSavedPaymentMethod, Unit> {
        AnonymousClass3(Object obj) {
            super(1, obj, SavedPaymentMethodMutator.class, "updatePaymentMethod", "updatePaymentMethod(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DisplayableSavedPaymentMethod displayableSavedPaymentMethod) {
            invoke2(displayableSavedPaymentMethod);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DisplayableSavedPaymentMethod p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((SavedPaymentMethodMutator) this.receiver).updatePaymentMethod(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createManageScreenInteractor$lambda$1(DefaultEmbeddedManageScreenInteractorFactory defaultEmbeddedManageScreenInteractorFactory, boolean z) {
        defaultEmbeddedManageScreenInteractorFactory.manageNavigatorProvider.get().performAction(ManageNavigator.Action.Back.INSTANCE);
        return Unit.INSTANCE;
    }
}
