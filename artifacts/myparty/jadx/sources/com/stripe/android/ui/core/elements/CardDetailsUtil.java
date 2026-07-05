package com.stripe.android.ui.core.elements;

import com.stripe.android.uicore.elements.ConvertTo4DigitDateKt;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CardDetailsUtil.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0015\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\nJ\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/ui/core/elements/CardDetailsUtil;", "", "<init>", "()V", "createExpiryDateFormFieldValues", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "entry", "getExpiryMonthFormFieldEntry", "getExpiryMonthFormFieldEntry$payments_ui_core_release", "getExpiryYearFormFieldEntry", "getExpiryYearFormFieldEntry$payments_ui_core_release", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CardDetailsUtil {
    public static final int $stable = 0;
    public static final CardDetailsUtil INSTANCE = new CardDetailsUtil();

    private CardDetailsUtil() {
    }

    public final Map<IdentifierSpec, FormFieldEntry> createExpiryDateFormFieldValues(FormFieldEntry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        return MapsKt.mapOf(TuplesKt.to(IdentifierSpec.INSTANCE.getCardExpMonth(), getExpiryMonthFormFieldEntry$payments_ui_core_release(entry)), TuplesKt.to(IdentifierSpec.INSTANCE.getCardExpYear(), getExpiryYearFormFieldEntry$payments_ui_core_release(entry)));
    }

    public final FormFieldEntry getExpiryMonthFormFieldEntry$payments_ui_core_release(FormFieldEntry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        String value = entry.getValue();
        int iIntValue = -1;
        if (value != null) {
            String strConvertTo4DigitDate = ConvertTo4DigitDateKt.convertTo4DigitDate(value);
            if (strConvertTo4DigitDate.length() == 4) {
                Integer intOrNull = StringsKt.toIntOrNull(StringsKt.take(strConvertTo4DigitDate, 2));
                if (intOrNull == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                iIntValue = intOrNull.intValue();
            }
        }
        return FormFieldEntry.copy$default(entry, StringsKt.padStart(String.valueOf(iIntValue), 2, '0'), false, 2, null);
    }

    public final FormFieldEntry getExpiryYearFormFieldEntry$payments_ui_core_release(FormFieldEntry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        String value = entry.getValue();
        int iIntValue = -1;
        if (value != null) {
            String strConvertTo4DigitDate = ConvertTo4DigitDateKt.convertTo4DigitDate(value);
            if (strConvertTo4DigitDate.length() == 4) {
                Integer intOrNull = StringsKt.toIntOrNull(StringsKt.takeLast(strConvertTo4DigitDate, 2));
                if (intOrNull == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                iIntValue = intOrNull.intValue() + 2000;
            }
        }
        return FormFieldEntry.copy$default(entry, String.valueOf(iIntValue), false, 2, null);
    }
}
