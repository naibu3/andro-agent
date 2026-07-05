package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.model.Address;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.model.PaymentMethodIncentive;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel;
import com.stripe.android.uicore.elements.IdentifierSpec;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: USBankAccountFormViewModel.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0004H\u0000\u001a\"\u0010\u0005\u001a\u00020\u0004*\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0000\u001a\f\u0010\b\u001a\u00020\u0004*\u00020\tH\u0000\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0000\u001a\u0018\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002¨\u0006\u0014"}, d2 = {"asFormFieldValues", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "", "Lcom/stripe/android/model/Address;", "fromFormFieldValues", "Lcom/stripe/android/model/Address$Companion;", "formFieldValues", "asAddressModel", "Lcom/stripe/android/paymentsheet/PaymentSheet$Address;", "customerRequestedSave", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "showCheckbox", "", "saveForFutureUse", "toInitialState", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;", "error", "Lcom/stripe/android/core/strings/ResolvableString;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class USBankAccountFormViewModelKt {
    public static final Map<IdentifierSpec, String> asFormFieldValues(Address address) {
        Intrinsics.checkNotNullParameter(address, "<this>");
        return MapsKt.mapOf(TuplesKt.to(IdentifierSpec.INSTANCE.getLine1(), address.getLine1()), TuplesKt.to(IdentifierSpec.INSTANCE.getLine2(), address.getLine2()), TuplesKt.to(IdentifierSpec.INSTANCE.getCity(), address.getCity()), TuplesKt.to(IdentifierSpec.INSTANCE.getState(), address.getState()), TuplesKt.to(IdentifierSpec.INSTANCE.getCountry(), address.getCountry()), TuplesKt.to(IdentifierSpec.INSTANCE.getPostalCode(), address.getPostalCode()));
    }

    public static final Address fromFormFieldValues(Address.Companion companion, Map<IdentifierSpec, String> formFieldValues) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(formFieldValues, "formFieldValues");
        String str = formFieldValues.get(IdentifierSpec.INSTANCE.getLine1());
        String str2 = formFieldValues.get(IdentifierSpec.INSTANCE.getLine2());
        return new Address(formFieldValues.get(IdentifierSpec.INSTANCE.getCity()), formFieldValues.get(IdentifierSpec.INSTANCE.getCountry()), str, str2, formFieldValues.get(IdentifierSpec.INSTANCE.getPostalCode()), formFieldValues.get(IdentifierSpec.INSTANCE.getState()));
    }

    public static final Address asAddressModel(PaymentSheet.Address address) {
        Intrinsics.checkNotNullParameter(address, "<this>");
        String line1 = address.getLine1();
        String line2 = address.getLine2();
        return new Address(address.getCity(), address.getCountry(), line1, line2, address.getPostalCode(), address.getState());
    }

    public static final PaymentSelection.CustomerRequestedSave customerRequestedSave(boolean z, boolean z2) {
        if (!z) {
            return PaymentSelection.CustomerRequestedSave.NoRequest;
        }
        if (z2) {
            return PaymentSelection.CustomerRequestedSave.RequestReuse;
        }
        return PaymentSelection.CustomerRequestedSave.RequestNoReuse;
    }

    static /* synthetic */ BankFormScreenState toInitialState$default(USBankAccountFormViewModel.Args args, ResolvableString resolvableString, int i, Object obj) {
        if ((i & 1) != 0) {
            resolvableString = null;
        }
        return toInitialState(args, resolvableString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BankFormScreenState toInitialState(USBankAccountFormViewModel.Args args, ResolvableString resolvableString) {
        boolean zIsPaymentFlow = args.isPaymentFlow();
        PaymentMethodIncentive incentive = args.getIncentive();
        return new BankFormScreenState(zIsPaymentFlow, incentive != null ? incentive.getDisplayText() : null, false, null, resolvableString, 12, null);
    }
}
