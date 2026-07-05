package com.stripe.android.paymentsheet.forms;

import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.ui.core.elements.AddressSpec;
import com.stripe.android.ui.core.elements.CashAppPayMandateTextSpec;
import com.stripe.android.ui.core.elements.EmailSpec;
import com.stripe.android.ui.core.elements.FormItemSpec;
import com.stripe.android.ui.core.elements.MandateTextSpec;
import com.stripe.android.ui.core.elements.NameSpec;
import com.stripe.android.ui.core.elements.PhoneSpec;
import com.stripe.android.ui.core.elements.PlaceholderSpec;
import com.stripe.android.ui.core.elements.SepaMandateTextSpec;
import com.stripe.android.ui.core.elements.TranslationId;
import com.stripe.android.uicore.elements.AddressFieldsElement;
import com.stripe.android.uicore.elements.CountryElement;
import com.stripe.android.uicore.elements.DropdownFieldController;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.elements.PhoneNumberElement;
import com.stripe.android.uicore.elements.SectionElement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: PlaceholderHelper.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eJ#\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\u0015J5\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u00132\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\b\u0018J\u001e\u0010\u0019\u001a\u00020\u00102\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0005H\u0080@¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/paymentsheet/forms/PlaceholderHelper;", "", "<init>", "()V", "specsForConfiguration", "", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "specs", "placeholderOverrideList", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "requiresMandate", "", "configuration", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "specsForConfiguration$paymentsheet_release", "removeCorrespondingPlaceholder", "", "placeholderFields", "", "Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;", "spec", "removeCorrespondingPlaceholder$paymentsheet_release", "specForPlaceholderField", "field", "specForPlaceholderField$paymentsheet_release", "connectBillingDetailsFields", "elements", "Lcom/stripe/android/uicore/elements/FormElement;", "connectBillingDetailsFields$paymentsheet_release", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlaceholderHelper {
    public static final int $stable = 0;
    public static final PlaceholderHelper INSTANCE = new PlaceholderHelper();

    /* compiled from: PlaceholderHelper.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlaceholderSpec.PlaceholderField.values().length];
            try {
                iArr[PlaceholderSpec.PlaceholderField.BillingAddressWithoutCountry.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlaceholderSpec.PlaceholderField.Name.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlaceholderSpec.PlaceholderField.Email.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlaceholderSpec.PlaceholderField.Phone.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PlaceholderSpec.PlaceholderField.BillingAddress.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PlaceholderSpec.PlaceholderField.SepaMandate.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private PlaceholderHelper() {
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<FormItemSpec> specsForConfiguration$paymentsheet_release(List<? extends FormItemSpec> specs, List<IdentifierSpec> placeholderOverrideList, boolean requiresMandate, PaymentSheet.BillingDetailsCollectionConfiguration configuration) {
        Intrinsics.checkNotNullParameter(specs, "specs");
        Intrinsics.checkNotNullParameter(placeholderOverrideList, "placeholderOverrideList");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        List<PlaceholderSpec.PlaceholderField> listMutableListOf = CollectionsKt.mutableListOf(PlaceholderSpec.PlaceholderField.Name, PlaceholderSpec.PlaceholderField.Email, PlaceholderSpec.PlaceholderField.Phone, PlaceholderSpec.PlaceholderField.BillingAddress);
        ArrayList arrayList = new ArrayList();
        for (FormItemSpec formItemSpecSpecForPlaceholderField$paymentsheet_release : specs) {
            PlaceholderHelper placeholderHelper = INSTANCE;
            placeholderHelper.removeCorrespondingPlaceholder$paymentsheet_release(listMutableListOf, formItemSpecSpecForPlaceholderField$paymentsheet_release);
            if (formItemSpecSpecForPlaceholderField$paymentsheet_release instanceof NameSpec) {
                if (configuration.getName() == PaymentSheet.BillingDetailsCollectionConfiguration.CollectionMode.Never) {
                    formItemSpecSpecForPlaceholderField$paymentsheet_release = null;
                }
            } else if (formItemSpecSpecForPlaceholderField$paymentsheet_release instanceof EmailSpec) {
                if (configuration.getEmail() == PaymentSheet.BillingDetailsCollectionConfiguration.CollectionMode.Never) {
                }
            } else if (formItemSpecSpecForPlaceholderField$paymentsheet_release instanceof PhoneSpec) {
                if (configuration.getPhone() == PaymentSheet.BillingDetailsCollectionConfiguration.CollectionMode.Never) {
                }
            } else if (formItemSpecSpecForPlaceholderField$paymentsheet_release instanceof AddressSpec) {
                if (configuration.getAddress() == PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode.Never) {
                }
            } else if (formItemSpecSpecForPlaceholderField$paymentsheet_release instanceof PlaceholderSpec) {
                formItemSpecSpecForPlaceholderField$paymentsheet_release = placeholderHelper.specForPlaceholderField$paymentsheet_release(((PlaceholderSpec) formItemSpecSpecForPlaceholderField$paymentsheet_release).getField(), placeholderOverrideList, requiresMandate, configuration);
            }
            if (formItemSpecSpecForPlaceholderField$paymentsheet_release != null) {
                arrayList.add(formItemSpecSpecForPlaceholderField$paymentsheet_release);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = listMutableListOf.iterator();
        while (it.hasNext()) {
            FormItemSpec formItemSpecSpecForPlaceholderField$paymentsheet_release2 = INSTANCE.specForPlaceholderField$paymentsheet_release((PlaceholderSpec.PlaceholderField) it.next(), placeholderOverrideList, requiresMandate, configuration);
            if (formItemSpecSpecForPlaceholderField$paymentsheet_release2 != null) {
                arrayList3.add(formItemSpecSpecForPlaceholderField$paymentsheet_release2);
            }
        }
        List listPlus = CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList3);
        final Function2 function2 = new Function2() { // from class: com.stripe.android.paymentsheet.forms.PlaceholderHelper$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(PlaceholderHelper.specsForConfiguration$lambda$6((FormItemSpec) obj, (FormItemSpec) obj2));
            }
        };
        return CollectionsKt.sortedWith(listPlus, new Comparator() { // from class: com.stripe.android.paymentsheet.forms.PlaceholderHelper$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return PlaceholderHelper.specsForConfiguration$lambda$7(function2, obj, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int specsForConfiguration$lambda$7(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int specsForConfiguration$lambda$6(FormItemSpec formItemSpec, FormItemSpec formItemSpec2) {
        if ((formItemSpec instanceof MandateTextSpec) || (formItemSpec instanceof CashAppPayMandateTextSpec)) {
            return 1;
        }
        return ((formItemSpec2 instanceof MandateTextSpec) || (formItemSpec2 instanceof CashAppPayMandateTextSpec)) ? -1 : 0;
    }

    public final void removeCorrespondingPlaceholder$paymentsheet_release(List<PlaceholderSpec.PlaceholderField> placeholderFields, FormItemSpec spec) {
        Intrinsics.checkNotNullParameter(placeholderFields, "placeholderFields");
        Intrinsics.checkNotNullParameter(spec, "spec");
        if (spec instanceof NameSpec) {
            placeholderFields.remove(PlaceholderSpec.PlaceholderField.Name);
            return;
        }
        if (spec instanceof EmailSpec) {
            placeholderFields.remove(PlaceholderSpec.PlaceholderField.Email);
            return;
        }
        if (spec instanceof PhoneSpec) {
            placeholderFields.remove(PlaceholderSpec.PlaceholderField.Phone);
            return;
        }
        if (spec instanceof AddressSpec) {
            placeholderFields.remove(PlaceholderSpec.PlaceholderField.BillingAddress);
            return;
        }
        if (spec instanceof SepaMandateTextSpec) {
            placeholderFields.remove(PlaceholderSpec.PlaceholderField.SepaMandate);
            return;
        }
        if (spec instanceof PlaceholderSpec) {
            PlaceholderSpec placeholderSpec = (PlaceholderSpec) spec;
            if (WhenMappings.$EnumSwitchMapping$0[placeholderSpec.getField().ordinal()] == 1) {
                placeholderFields.remove(PlaceholderSpec.PlaceholderField.BillingAddress);
            } else {
                placeholderFields.remove(placeholderSpec.getField());
            }
        }
    }

    public final FormItemSpec specForPlaceholderField$paymentsheet_release(PlaceholderSpec.PlaceholderField field, List<IdentifierSpec> placeholderOverrideList, boolean requiresMandate, PaymentSheet.BillingDetailsCollectionConfiguration configuration) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(placeholderOverrideList, "placeholderOverrideList");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        switch (WhenMappings.$EnumSwitchMapping$0[field.ordinal()]) {
            case 1:
                FormItemSpec addressSpec = new AddressSpec(null, null, null, false, null, true, 31, null);
                if (configuration.getAddress() == PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode.Full || (placeholderOverrideList.contains(addressSpec.getApiPath()) && configuration.getAddress() != PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode.Never)) {
                    formItemSpec = addressSpec;
                }
                return formItemSpec;
            case 2:
                FormItemSpec nameSpec = new NameSpec((IdentifierSpec) null, (TranslationId) null, 3, (DefaultConstructorMarker) null);
                if (configuration.getName() == PaymentSheet.BillingDetailsCollectionConfiguration.CollectionMode.Always || (placeholderOverrideList.contains(nameSpec.getApiPath()) && configuration.getName() != PaymentSheet.BillingDetailsCollectionConfiguration.CollectionMode.Never)) {
                    formItemSpec = nameSpec;
                }
                return formItemSpec;
            case 3:
                FormItemSpec emailSpec = new EmailSpec((IdentifierSpec) null, 1, (DefaultConstructorMarker) null);
                if (configuration.getEmail() == PaymentSheet.BillingDetailsCollectionConfiguration.CollectionMode.Always || (placeholderOverrideList.contains(emailSpec.getApiPath()) && configuration.getEmail() != PaymentSheet.BillingDetailsCollectionConfiguration.CollectionMode.Never)) {
                    formItemSpec = emailSpec;
                }
                return formItemSpec;
            case 4:
                FormItemSpec phoneSpec = new PhoneSpec((IdentifierSpec) null, 1, (DefaultConstructorMarker) null);
                if (configuration.getPhone() == PaymentSheet.BillingDetailsCollectionConfiguration.CollectionMode.Always || (placeholderOverrideList.contains(phoneSpec.getApiPath()) && configuration.getPhone() != PaymentSheet.BillingDetailsCollectionConfiguration.CollectionMode.Never)) {
                    formItemSpec = phoneSpec;
                }
                return formItemSpec;
            case 5:
                FormItemSpec addressSpec2 = new AddressSpec(null, null, null, false, null, false, 63, null);
                if (configuration.getAddress() == PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode.Full || (placeholderOverrideList.contains(addressSpec2.getApiPath()) && configuration.getAddress() != PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode.Never)) {
                    formItemSpec = addressSpec2;
                }
                return formItemSpec;
            case 6:
                return requiresMandate ? new SepaMandateTextSpec((IdentifierSpec) null, 0, 3, (DefaultConstructorMarker) null) : null;
            default:
                return null;
        }
    }

    public final Object connectBillingDetailsFields$paymentsheet_release(List<? extends FormElement> list, Continuation<? super Unit> continuation) {
        DropdownFieldController controller;
        StateFlow<String> rawFieldValue;
        Flow flowFilterNotNull;
        List<? extends FormElement> list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (obj instanceof SectionElement) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList2, ((SectionElement) it.next()).getFields());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (obj2 instanceof PhoneNumberElement) {
                arrayList3.add(obj2);
            }
        }
        final PhoneNumberElement phoneNumberElement = (PhoneNumberElement) CollectionsKt.firstOrNull((List) arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : list2) {
            if (obj3 instanceof SectionElement) {
                arrayList4.add(obj3);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            CollectionsKt.addAll(arrayList5, ((SectionElement) it2.next()).getFields());
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj4 : arrayList5) {
            if (obj4 instanceof CountryElement) {
                arrayList6.add(obj4);
            }
        }
        CountryElement countryElement = (CountryElement) CollectionsKt.firstOrNull((List) arrayList6);
        if (countryElement == null) {
            ArrayList arrayList7 = new ArrayList();
            for (Object obj5 : list2) {
                if (obj5 instanceof SectionElement) {
                    arrayList7.add(obj5);
                }
            }
            ArrayList arrayList8 = new ArrayList();
            Iterator it3 = arrayList7.iterator();
            while (it3.hasNext()) {
                CollectionsKt.addAll(arrayList8, ((SectionElement) it3.next()).getFields());
            }
            ArrayList arrayList9 = new ArrayList();
            for (Object obj6 : arrayList8) {
                if (obj6 instanceof AddressFieldsElement) {
                    arrayList9.add(obj6);
                }
            }
            AddressFieldsElement addressFieldsElement = (AddressFieldsElement) CollectionsKt.firstOrNull((List) arrayList9);
            countryElement = addressFieldsElement != null ? addressFieldsElement.getCountryElement() : null;
        }
        if (countryElement == null || (controller = countryElement.getController()) == null || (rawFieldValue = controller.getRawFieldValue()) == null || (flowFilterNotNull = FlowKt.filterNotNull(rawFieldValue)) == null) {
            return Unit.INSTANCE;
        }
        Object objCollect = flowFilterNotNull.collect(new FlowCollector() { // from class: com.stripe.android.paymentsheet.forms.PlaceholderHelper$connectBillingDetailsFields$3
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj7, Continuation continuation2) {
                return emit((String) obj7, (Continuation<? super Unit>) continuation2);
            }

            public final Object emit(String str, Continuation<? super Unit> continuation2) {
                PhoneNumberElement phoneNumberElement2;
                PhoneNumberController controller2;
                DropdownFieldController countryDropdownController;
                PhoneNumberController controller3;
                PhoneNumberElement phoneNumberElement3 = phoneNumberElement;
                String localNumber = (phoneNumberElement3 == null || (controller3 = phoneNumberElement3.getController()) == null) ? null : controller3.getLocalNumber();
                if ((localNumber == null || StringsKt.isBlank(localNumber)) && (phoneNumberElement2 = phoneNumberElement) != null && (controller2 = phoneNumberElement2.getController()) != null && (countryDropdownController = controller2.getCountryDropdownController()) != null) {
                    countryDropdownController.onRawValueChange(str);
                }
                return Unit.INSTANCE;
            }
        }, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }
}
