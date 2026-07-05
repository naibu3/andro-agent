package com.stripe.android.paymentsheet.ui;

import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.CardDefinitionKt;
import com.stripe.android.model.Address;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.ui.core.R;
import com.stripe.android.ui.core.elements.CardBillingAddressElement;
import com.stripe.android.uicore.elements.EmailElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.NameConfig;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.elements.PhoneNumberElement;
import com.stripe.android.uicore.elements.SectionElement;
import com.stripe.android.uicore.elements.SimpleTextElement;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: BillingDetailsForm.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002J6\u0010)\u001a\u0004\u0018\u00010**\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020*0,0+2\u0006\u0010-\u001a\u00020!2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002J \u0010/\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0006\u0012\u0004\u0018\u000101002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u00062"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;", "", "billingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "addressCollectionMode", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;", "collectName", "", "collectEmail", "collectPhone", "<init>", "(Lcom/stripe/android/model/PaymentMethod$BillingDetails;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;ZZZ)V", "nameElement", "Lcom/stripe/android/uicore/elements/SimpleTextElement;", "getNameElement", "()Lcom/stripe/android/uicore/elements/SimpleTextElement;", "emailElement", "Lcom/stripe/android/uicore/elements/EmailElement;", "getEmailElement", "()Lcom/stripe/android/uicore/elements/EmailElement;", "phoneElement", "Lcom/stripe/android/uicore/elements/PhoneNumberElement;", "getPhoneElement", "()Lcom/stripe/android/uicore/elements/PhoneNumberElement;", "cardBillingAddressElement", "Lcom/stripe/android/ui/core/elements/CardBillingAddressElement;", "addressSectionElement", "Lcom/stripe/android/uicore/elements/SectionElement;", "getAddressSectionElement", "()Lcom/stripe/android/uicore/elements/SectionElement;", "hiddenElements", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getHiddenElements", "()Lkotlinx/coroutines/flow/StateFlow;", "formFieldsState", "Lkotlinx/coroutines/flow/Flow;", "Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;", "getFormFieldsState", "()Lkotlinx/coroutines/flow/Flow;", "valueOrNull", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "", "Lkotlin/Pair;", "identifierSpec", "hiddenIdentifiers", "rawAddressValues", "", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingDetailsForm {
    public static final int $stable = 0;
    private final SectionElement addressSectionElement;
    private final CardBillingAddressElement cardBillingAddressElement;
    private final EmailElement emailElement;
    private final Flow<BillingDetailsFormState> formFieldsState;
    private final StateFlow<Set<IdentifierSpec>> hiddenElements;
    private final SimpleTextElement nameElement;
    private final PhoneNumberElement phoneElement;

    public BillingDetailsForm(PaymentMethod.BillingDetails billingDetails, PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode addressCollectionMode, boolean z, boolean z2, boolean z3) {
        SimpleTextElement simpleTextElement;
        EmailElement emailElement;
        PhoneNumberElement phoneNumberElement;
        String str;
        Intrinsics.checkNotNullParameter(addressCollectionMode, "addressCollectionMode");
        if (z) {
            simpleTextElement = new SimpleTextElement(IdentifierSpec.INSTANCE.getName(), NameConfig.INSTANCE.createController(billingDetails != null ? billingDetails.name : null));
        } else {
            simpleTextElement = null;
        }
        this.nameElement = simpleTextElement;
        if (z2) {
            emailElement = new EmailElement(null, billingDetails != null ? billingDetails.email : null, null, 5, null);
        } else {
            emailElement = null;
        }
        this.emailElement = emailElement;
        if (z3) {
            phoneNumberElement = new PhoneNumberElement(IdentifierSpec.INSTANCE.getPhone(), PhoneNumberController.Companion.createPhoneNumberController$default(PhoneNumberController.INSTANCE, (billingDetails == null || (str = billingDetails.phone) == null) ? "" : str, null, null, false, false, 30, null));
        } else {
            phoneNumberElement = null;
        }
        this.phoneElement = phoneNumberElement;
        CardBillingAddressElement cardBillingAddressElement = new CardBillingAddressElement(IdentifierSpec.INSTANCE.getBillingAddress(), rawAddressValues(billingDetails), null, null, null, null, null, CardDefinitionKt.toInternal(addressCollectionMode), 12, null);
        this.cardBillingAddressElement = cardBillingAddressElement;
        this.addressSectionElement = SectionElement.INSTANCE.wrap(cardBillingAddressElement, ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_billing_details, new Object[0], null, 4, null));
        this.hiddenElements = cardBillingAddressElement.getHiddenIdentifiers();
        this.formFieldsState = formFieldsState();
    }

    public final SimpleTextElement getNameElement() {
        return this.nameElement;
    }

    public final EmailElement getEmailElement() {
        return this.emailElement;
    }

    public final PhoneNumberElement getPhoneElement() {
        return this.phoneElement;
    }

    public final SectionElement getAddressSectionElement() {
        return this.addressSectionElement;
    }

    public final StateFlow<Set<IdentifierSpec>> getHiddenElements() {
        return this.hiddenElements;
    }

    public final Flow<BillingDetailsFormState> getFormFieldsState() {
        return this.formFieldsState;
    }

    private final Flow<BillingDetailsFormState> formFieldsState() {
        StateFlow<List<Pair<IdentifierSpec, FormFieldEntry>>> formFieldValueFlow;
        StateFlow<List<Pair<IdentifierSpec, FormFieldEntry>>> formFieldValueFlow2;
        StateFlow<List<Pair<IdentifierSpec, FormFieldEntry>>> formFieldValueFlow3;
        SimpleTextElement simpleTextElement = this.nameElement;
        Flow flowFlowOf = (simpleTextElement == null || (formFieldValueFlow3 = simpleTextElement.getFormFieldValueFlow()) == null) ? FlowKt.flowOf(CollectionsKt.emptyList()) : formFieldValueFlow3;
        EmailElement emailElement = this.emailElement;
        Flow flowFlowOf2 = (emailElement == null || (formFieldValueFlow2 = emailElement.getFormFieldValueFlow()) == null) ? FlowKt.flowOf(CollectionsKt.emptyList()) : formFieldValueFlow2;
        PhoneNumberElement phoneNumberElement = this.phoneElement;
        return FlowKt.flowOn(FlowKt.combine(flowFlowOf, flowFlowOf2, (phoneNumberElement == null || (formFieldValueFlow = phoneNumberElement.getFormFieldValueFlow()) == null) ? FlowKt.flowOf(CollectionsKt.emptyList()) : formFieldValueFlow, this.cardBillingAddressElement.getFormFieldValueFlow(), this.hiddenElements, new AnonymousClass1(null)), Dispatchers.getMain());
    }

    /* compiled from: BillingDetailsForm.kt */
    @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;", "nameFormFields", "", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "emailFormFields", "phoneFormFields", "addressFormFields", "hiddenIdentifiers", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.ui.BillingDetailsForm$formFieldsState$1", f = "BillingDetailsForm.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.ui.BillingDetailsForm$formFieldsState$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function6<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>, Set<? extends IdentifierSpec>, Continuation<? super BillingDetailsFormState>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        /* synthetic */ Object L$3;
        /* synthetic */ Object L$4;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(6, continuation);
        }

        @Override // kotlin.jvm.functions.Function6
        public /* bridge */ /* synthetic */ Object invoke(List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>> list, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>> list2, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>> list3, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>> list4, Set<? extends IdentifierSpec> set, Continuation<? super BillingDetailsFormState> continuation) {
            return invoke2((List<Pair<IdentifierSpec, FormFieldEntry>>) list, (List<Pair<IdentifierSpec, FormFieldEntry>>) list2, (List<Pair<IdentifierSpec, FormFieldEntry>>) list3, (List<Pair<IdentifierSpec, FormFieldEntry>>) list4, (Set<IdentifierSpec>) set, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<Pair<IdentifierSpec, FormFieldEntry>> list, List<Pair<IdentifierSpec, FormFieldEntry>> list2, List<Pair<IdentifierSpec, FormFieldEntry>> list3, List<Pair<IdentifierSpec, FormFieldEntry>> list4, Set<IdentifierSpec> set, Continuation<? super BillingDetailsFormState> continuation) {
            AnonymousClass1 anonymousClass1 = BillingDetailsForm.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = list;
            anonymousClass1.L$1 = list2;
            anonymousClass1.L$2 = list3;
            anonymousClass1.L$3 = list4;
            anonymousClass1.L$4 = set;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object next;
            Object next2;
            Object next3;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List list = (List) this.L$0;
            List list2 = (List) this.L$1;
            List list3 = (List) this.L$2;
            List list4 = (List) this.L$3;
            Set set = (Set) this.L$4;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((Pair) next).getFirst(), IdentifierSpec.INSTANCE.getName())) {
                    break;
                }
            }
            Pair pair = (Pair) next;
            FormFieldEntry formFieldEntry = pair != null ? (FormFieldEntry) pair.getSecond() : null;
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (Intrinsics.areEqual(((Pair) next2).getFirst(), IdentifierSpec.INSTANCE.getEmail())) {
                    break;
                }
            }
            Pair pair2 = (Pair) next2;
            FormFieldEntry formFieldEntry2 = pair2 != null ? (FormFieldEntry) pair2.getSecond() : null;
            Iterator it3 = list3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it3.next();
                if (Intrinsics.areEqual(((Pair) next3).getFirst(), IdentifierSpec.INSTANCE.getPhone())) {
                    break;
                }
            }
            Pair pair3 = (Pair) next3;
            return new BillingDetailsFormState(formFieldEntry, formFieldEntry2, pair3 != null ? (FormFieldEntry) pair3.getSecond() : null, BillingDetailsForm.this.valueOrNull(list4, IdentifierSpec.INSTANCE.getLine1(), set), BillingDetailsForm.this.valueOrNull(list4, IdentifierSpec.INSTANCE.getLine2(), set), BillingDetailsForm.this.valueOrNull(list4, IdentifierSpec.INSTANCE.getCity(), set), BillingDetailsForm.this.valueOrNull(list4, IdentifierSpec.INSTANCE.getPostalCode(), set), BillingDetailsForm.this.valueOrNull(list4, IdentifierSpec.INSTANCE.getState(), set), BillingDetailsForm.this.valueOrNull(list4, IdentifierSpec.INSTANCE.getCountry(), set));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FormFieldEntry valueOrNull(List<Pair<IdentifierSpec, FormFieldEntry>> list, IdentifierSpec identifierSpec, Set<IdentifierSpec> set) {
        Object next;
        if (set.contains(identifierSpec)) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((Pair) next).getFirst(), identifierSpec)) {
                break;
            }
        }
        Pair pair = (Pair) next;
        if (pair != null) {
            return (FormFieldEntry) pair.getSecond();
        }
        return null;
    }

    private final Map<IdentifierSpec, String> rawAddressValues(PaymentMethod.BillingDetails billingDetails) {
        Address address;
        if (billingDetails == null || (address = billingDetails.address) == null) {
            return MapsKt.emptyMap();
        }
        return MapsKt.mapOf(TuplesKt.to(IdentifierSpec.INSTANCE.getLine1(), address.getLine1()), TuplesKt.to(IdentifierSpec.INSTANCE.getLine2(), address.getLine2()), TuplesKt.to(IdentifierSpec.INSTANCE.getState(), address.getState()), TuplesKt.to(IdentifierSpec.INSTANCE.getCity(), address.getCity()), TuplesKt.to(IdentifierSpec.INSTANCE.getCountry(), address.getCountry()), TuplesKt.to(IdentifierSpec.INSTANCE.getPostalCode(), address.getPostalCode()));
    }
}
