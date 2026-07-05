package com.stripe.android.paymentsheet.forms;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FormFieldValues.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/forms/FormFieldValues;", "", "fieldValuePairs", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "userRequestedReuse", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "<init>", "(Ljava/util/Map;Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;)V", "getFieldValuePairs", "()Ljava/util/Map;", "getUserRequestedReuse", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class FormFieldValues {
    public static final int $stable = 8;
    private final Map<IdentifierSpec, FormFieldEntry> fieldValuePairs;
    private final PaymentSelection.CustomerRequestedSave userRequestedReuse;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormFieldValues copy$default(FormFieldValues formFieldValues, Map map, PaymentSelection.CustomerRequestedSave customerRequestedSave, int i, Object obj) {
        if ((i & 1) != 0) {
            map = formFieldValues.fieldValuePairs;
        }
        if ((i & 2) != 0) {
            customerRequestedSave = formFieldValues.userRequestedReuse;
        }
        return formFieldValues.copy(map, customerRequestedSave);
    }

    public final Map<IdentifierSpec, FormFieldEntry> component1() {
        return this.fieldValuePairs;
    }

    /* renamed from: component2, reason: from getter */
    public final PaymentSelection.CustomerRequestedSave getUserRequestedReuse() {
        return this.userRequestedReuse;
    }

    public final FormFieldValues copy(Map<IdentifierSpec, FormFieldEntry> fieldValuePairs, PaymentSelection.CustomerRequestedSave userRequestedReuse) {
        Intrinsics.checkNotNullParameter(fieldValuePairs, "fieldValuePairs");
        Intrinsics.checkNotNullParameter(userRequestedReuse, "userRequestedReuse");
        return new FormFieldValues(fieldValuePairs, userRequestedReuse);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormFieldValues)) {
            return false;
        }
        FormFieldValues formFieldValues = (FormFieldValues) other;
        return Intrinsics.areEqual(this.fieldValuePairs, formFieldValues.fieldValuePairs) && this.userRequestedReuse == formFieldValues.userRequestedReuse;
    }

    public int hashCode() {
        return (this.fieldValuePairs.hashCode() * 31) + this.userRequestedReuse.hashCode();
    }

    public String toString() {
        return "FormFieldValues(fieldValuePairs=" + this.fieldValuePairs + ", userRequestedReuse=" + this.userRequestedReuse + ")";
    }

    public FormFieldValues(Map<IdentifierSpec, FormFieldEntry> fieldValuePairs, PaymentSelection.CustomerRequestedSave userRequestedReuse) {
        Intrinsics.checkNotNullParameter(fieldValuePairs, "fieldValuePairs");
        Intrinsics.checkNotNullParameter(userRequestedReuse, "userRequestedReuse");
        this.fieldValuePairs = fieldValuePairs;
        this.userRequestedReuse = userRequestedReuse;
    }

    public /* synthetic */ FormFieldValues(Map map, PaymentSelection.CustomerRequestedSave customerRequestedSave, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt.emptyMap() : map, customerRequestedSave);
    }

    public final Map<IdentifierSpec, FormFieldEntry> getFieldValuePairs() {
        return this.fieldValuePairs;
    }

    public final PaymentSelection.CustomerRequestedSave getUserRequestedReuse() {
        return this.userRequestedReuse;
    }
}
