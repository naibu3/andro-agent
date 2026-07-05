package com.stripe.android.paymentelement.embedded.form;

import com.stripe.android.core.injection.ViewModelScope;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.lpmfoundations.luxe.SupportedPaymentMethod;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentelement.embedded.EmbeddedFormHelperFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedSelectionHolder;
import com.stripe.android.paymentelement.embedded.form.FormActivityStateHelper;
import com.stripe.android.paymentsheet.FormHelper;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.forms.FormFieldValues;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.paymentdatacollection.FormArguments;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormArguments;
import com.stripe.android.paymentsheet.ui.AddPaymentMethodKt;
import com.stripe.android.paymentsheet.verticalmode.DefaultVerticalModeFormInteractor;
import com.stripe.android.paymentsheet.verticalmode.PaymentMethodIncentiveInteractor;
import com.stripe.android.uicore.utils.StateFlowsKt;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EmbeddedFormInteractorFactory.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001BO\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;", "", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "paymentMethodCode", "", "Lcom/stripe/android/model/PaymentMethodCode;", "hasSavedPaymentMethods", "", "embeddedSelectionHolder", "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;", "embeddedFormHelperFactory", "Lcom/stripe/android/paymentelement/embedded/EmbeddedFormHelperFactory;", "viewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "formActivityStateHelper", "Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "<init>", "(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Ljava/lang/String;ZLcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;Lcom/stripe/android/paymentelement/embedded/EmbeddedFormHelperFactory;Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;Lcom/stripe/android/paymentsheet/analytics/EventReporter;)V", "create", "Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EmbeddedFormInteractorFactory {
    public static final int $stable = 8;
    private final EmbeddedFormHelperFactory embeddedFormHelperFactory;
    private final EmbeddedSelectionHolder embeddedSelectionHolder;
    private final EventReporter eventReporter;
    private final FormActivityStateHelper formActivityStateHelper;
    private final boolean hasSavedPaymentMethods;
    private final String paymentMethodCode;
    private final PaymentMethodMetadata paymentMethodMetadata;
    private final CoroutineScope viewModelScope;

    @Inject
    public EmbeddedFormInteractorFactory(PaymentMethodMetadata paymentMethodMetadata, String paymentMethodCode, boolean z, EmbeddedSelectionHolder embeddedSelectionHolder, EmbeddedFormHelperFactory embeddedFormHelperFactory, @ViewModelScope CoroutineScope viewModelScope, FormActivityStateHelper formActivityStateHelper, EventReporter eventReporter) {
        Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
        Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
        Intrinsics.checkNotNullParameter(embeddedSelectionHolder, "embeddedSelectionHolder");
        Intrinsics.checkNotNullParameter(embeddedFormHelperFactory, "embeddedFormHelperFactory");
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        Intrinsics.checkNotNullParameter(formActivityStateHelper, "formActivityStateHelper");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        this.paymentMethodMetadata = paymentMethodMetadata;
        this.paymentMethodCode = paymentMethodCode;
        this.hasSavedPaymentMethods = z;
        this.embeddedSelectionHolder = embeddedSelectionHolder;
        this.embeddedFormHelperFactory = embeddedFormHelperFactory;
        this.viewModelScope = viewModelScope;
        this.formActivityStateHelper = formActivityStateHelper;
        this.eventReporter = eventReporter;
    }

    public final DefaultVerticalModeFormInteractor create() {
        FormHelper formHelperCreate = this.embeddedFormHelperFactory.create(this.viewModelScope, !this.hasSavedPaymentMethods, this.paymentMethodMetadata, this.eventReporter, new Function1() { // from class: com.stripe.android.paymentelement.embedded.form.EmbeddedFormInteractorFactory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmbeddedFormInteractorFactory.create$lambda$0(this.f$0, (PaymentSelection) obj);
            }
        });
        USBankAccountFormArguments uSBankAccountFormArgumentsCreateForEmbedded = USBankAccountFormArguments.INSTANCE.createForEmbedded(this.paymentMethodMetadata, this.paymentMethodCode, "payment_element", new EmbeddedFormInteractorFactory$create$usBankAccountFormArguments$1(this.embeddedSelectionHolder), this.hasSavedPaymentMethods, new Function2() { // from class: com.stripe.android.paymentelement.embedded.form.EmbeddedFormInteractorFactory$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EmbeddedFormInteractorFactory.create$lambda$1(this.f$0, (ResolvableString) obj, ((Boolean) obj2).booleanValue());
            }
        }, new EmbeddedFormInteractorFactory$create$usBankAccountFormArguments$2(this.eventReporter), new EmbeddedFormInteractorFactory$create$usBankAccountFormArguments$3(this.formActivityStateHelper), new EmbeddedFormInteractorFactory$create$usBankAccountFormArguments$4(this.formActivityStateHelper), new Function0() { // from class: com.stripe.android.paymentelement.embedded.form.EmbeddedFormInteractorFactory$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EmbeddedFormInteractorFactory.create$lambda$2(this.f$0);
            }
        });
        FormHelper.FormType formTypeFormTypeForCode = formHelperCreate.formTypeForCode(this.paymentMethodCode);
        FormArguments formArgumentsCreateFormArguments = formHelperCreate.createFormArguments(this.paymentMethodCode);
        if (formTypeFormTypeForCode instanceof FormHelper.FormType.MandateOnly) {
            EmbeddedSelectionHolder embeddedSelectionHolder = this.embeddedSelectionHolder;
            FormFieldValues formFieldValuesNoUserInteractionFormFieldValues = formArgumentsCreateFormArguments.noUserInteractionFormFieldValues();
            SupportedPaymentMethod supportedPaymentMethodSupportedPaymentMethodForCode = this.paymentMethodMetadata.supportedPaymentMethodForCode(this.paymentMethodCode);
            if (supportedPaymentMethodSupportedPaymentMethodForCode != null) {
                embeddedSelectionHolder.set(AddPaymentMethodKt.transformToPaymentSelection(formFieldValuesNoUserInteractionFormFieldValues, supportedPaymentMethodSupportedPaymentMethodForCode, this.paymentMethodMetadata));
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        String str = this.paymentMethodCode;
        return new DefaultVerticalModeFormInteractor(str, formArgumentsCreateFormArguments, formHelperCreate.formElementsForCode(str), new AnonymousClass1(formHelperCreate), uSBankAccountFormArgumentsCreateForEmbedded, new AnonymousClass2(this.eventReporter), this.paymentMethodMetadata.formHeaderInformationForCode(this.paymentMethodCode, this.hasSavedPaymentMethods), this.paymentMethodMetadata.getStripeIntent().isLiveMode(), StateFlowsKt.mapAsStateFlow(this.formActivityStateHelper.getState(), new Function1() { // from class: com.stripe.android.paymentelement.embedded.form.EmbeddedFormInteractorFactory$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(EmbeddedFormInteractorFactory.create$lambda$3((FormActivityStateHelper.State) obj));
            }
        }), new PaymentMethodIncentiveInteractor(this.paymentMethodMetadata.getPaymentMethodIncentive()).getDisplayedIncentive(), this.viewModelScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit create$lambda$0(EmbeddedFormInteractorFactory embeddedFormInteractorFactory, PaymentSelection paymentSelection) {
        embeddedFormInteractorFactory.embeddedSelectionHolder.set(paymentSelection);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit create$lambda$1(EmbeddedFormInteractorFactory embeddedFormInteractorFactory, ResolvableString resolvableString, boolean z) {
        embeddedFormInteractorFactory.formActivityStateHelper.updateMandate(resolvableString);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit create$lambda$2(EmbeddedFormInteractorFactory embeddedFormInteractorFactory) {
        embeddedFormInteractorFactory.eventReporter.onPaymentMethodFormCompleted(PaymentMethod.Type.USBankAccount.code);
        return Unit.INSTANCE;
    }

    /* compiled from: EmbeddedFormInteractorFactory.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentelement.embedded.form.EmbeddedFormInteractorFactory$create$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<FormFieldValues, String, Unit> {
        AnonymousClass1(Object obj) {
            super(2, obj, FormHelper.class, "onFormFieldValuesChanged", "onFormFieldValuesChanged(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(FormFieldValues formFieldValues, String str) {
            invoke2(formFieldValues, str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FormFieldValues formFieldValues, String p1) {
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((FormHelper) this.receiver).onFormFieldValuesChanged(formFieldValues, p1);
        }
    }

    /* compiled from: EmbeddedFormInteractorFactory.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentelement.embedded.form.EmbeddedFormInteractorFactory$create$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<String, Unit> {
        AnonymousClass2(Object obj) {
            super(1, obj, EventReporter.class, "onPaymentMethodFormInteraction", "onPaymentMethodFormInteraction(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EventReporter) this.receiver).onPaymentMethodFormInteraction(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean create$lambda$3(FormActivityStateHelper.State it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.isProcessing();
    }
}
