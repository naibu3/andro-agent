package com.stripe.android.paymentsheet;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.paymentsheet.forms.FormFieldValues;
import com.stripe.android.paymentsheet.paymentdatacollection.FormArguments;
import com.stripe.android.uicore.elements.FormElement;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FormHelper.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0014J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0014\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0006j\u0002`\nH&J\u001a\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H&J\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H&J\u0014\u0010\u0012\u001a\u00020\u00132\n\u0010\t\u001a\u00060\u0006j\u0002`\nH&¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/paymentsheet/FormHelper;", "", "formElementsForCode", "", "Lcom/stripe/android/uicore/elements/FormElement;", "code", "", "createFormArguments", "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", "paymentMethodCode", "Lcom/stripe/android/model/PaymentMethodCode;", "onFormFieldValuesChanged", "", "formValues", "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;", "selectedPaymentMethodCode", "getPaymentMethodParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "formTypeForCode", "Lcom/stripe/android/paymentsheet/FormHelper$FormType;", "FormType", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FormHelper {
    FormArguments createFormArguments(String paymentMethodCode);

    List<FormElement> formElementsForCode(String code);

    FormType formTypeForCode(String paymentMethodCode);

    PaymentMethodCreateParams getPaymentMethodParams(FormFieldValues formValues, String selectedPaymentMethodCode);

    void onFormFieldValuesChanged(FormFieldValues formValues, String selectedPaymentMethodCode);

    /* compiled from: FormHelper.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/FormHelper$FormType;", "", "Empty", "MandateOnly", "UserInteractionRequired", "Lcom/stripe/android/paymentsheet/FormHelper$FormType$Empty;", "Lcom/stripe/android/paymentsheet/FormHelper$FormType$MandateOnly;", "Lcom/stripe/android/paymentsheet/FormHelper$FormType$UserInteractionRequired;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface FormType {

        /* compiled from: FormHelper.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/FormHelper$FormType$Empty;", "Lcom/stripe/android/paymentsheet/FormHelper$FormType;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Empty implements FormType {
            public static final int $stable = 0;
            public static final Empty INSTANCE = new Empty();

            private Empty() {
            }
        }

        /* compiled from: FormHelper.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/FormHelper$FormType$MandateOnly;", "Lcom/stripe/android/paymentsheet/FormHelper$FormType;", "mandate", "Lcom/stripe/android/core/strings/ResolvableString;", "<init>", "(Lcom/stripe/android/core/strings/ResolvableString;)V", "getMandate", "()Lcom/stripe/android/core/strings/ResolvableString;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class MandateOnly implements FormType {
            public static final int $stable = 8;
            private final ResolvableString mandate;

            public static /* synthetic */ MandateOnly copy$default(MandateOnly mandateOnly, ResolvableString resolvableString, int i, Object obj) {
                if ((i & 1) != 0) {
                    resolvableString = mandateOnly.mandate;
                }
                return mandateOnly.copy(resolvableString);
            }

            /* renamed from: component1, reason: from getter */
            public final ResolvableString getMandate() {
                return this.mandate;
            }

            public final MandateOnly copy(ResolvableString mandate) {
                Intrinsics.checkNotNullParameter(mandate, "mandate");
                return new MandateOnly(mandate);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MandateOnly) && Intrinsics.areEqual(this.mandate, ((MandateOnly) other).mandate);
            }

            public int hashCode() {
                return this.mandate.hashCode();
            }

            public String toString() {
                return "MandateOnly(mandate=" + this.mandate + ")";
            }

            public MandateOnly(ResolvableString mandate) {
                Intrinsics.checkNotNullParameter(mandate, "mandate");
                this.mandate = mandate;
            }

            public final ResolvableString getMandate() {
                return this.mandate;
            }
        }

        /* compiled from: FormHelper.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/FormHelper$FormType$UserInteractionRequired;", "Lcom/stripe/android/paymentsheet/FormHelper$FormType;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class UserInteractionRequired implements FormType {
            public static final int $stable = 0;
            public static final UserInteractionRequired INSTANCE = new UserInteractionRequired();

            private UserInteractionRequired() {
            }
        }
    }
}
