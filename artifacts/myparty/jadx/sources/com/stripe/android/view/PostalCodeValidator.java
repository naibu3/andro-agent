package com.stripe.android.view;

import androidx.autofill.HintConstants;
import com.stripe.android.core.model.CountryUtils;
import com.stripe.android.view.ShippingInfoWidget;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: PostalCodeValidator.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J;\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/view/PostalCodeValidator;", "", "<init>", "()V", "isValid", "", HintConstants.AUTOFILL_HINT_POSTAL_CODE, "", "countryCode", "optionalShippingInfoFields", "", "Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;", "hiddenShippingInfoFields", "isValid$payments_core_release", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PostalCodeValidator {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    private static final Map<String, Pattern> POSTAL_CODE_PATTERNS = MapsKt.mapOf(TuplesKt.to(Locale.US.getCountry(), Pattern.compile("^[0-9]{5}(?:-[0-9]{4})?$")));

    public final boolean isValid(String postalCode, String countryCode) {
        Matcher matcher;
        Intrinsics.checkNotNullParameter(postalCode, "postalCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Pattern pattern = POSTAL_CODE_PATTERNS.get(countryCode);
        return (pattern == null || (matcher = pattern.matcher(postalCode)) == null) ? (CountryUtils.INSTANCE.doesCountryUsePostalCode(countryCode) && StringsKt.isBlank(postalCode)) ? false : true : matcher.matches();
    }

    public final boolean isValid$payments_core_release(String postalCode, String countryCode, List<? extends ShippingInfoWidget.CustomizableShippingField> optionalShippingInfoFields, List<? extends ShippingInfoWidget.CustomizableShippingField> hiddenShippingInfoFields) {
        Matcher matcher;
        Intrinsics.checkNotNullParameter(postalCode, "postalCode");
        Intrinsics.checkNotNullParameter(optionalShippingInfoFields, "optionalShippingInfoFields");
        Intrinsics.checkNotNullParameter(hiddenShippingInfoFields, "hiddenShippingInfoFields");
        if (countryCode == null) {
            return false;
        }
        String str = postalCode;
        if (StringsKt.isBlank(str) && Companion.isPostalCodeNotRequired(optionalShippingInfoFields, hiddenShippingInfoFields)) {
            return true;
        }
        Pattern pattern = POSTAL_CODE_PATTERNS.get(countryCode);
        return (pattern == null || (matcher = pattern.matcher(str)) == null) ? (CountryUtils.INSTANCE.doesCountryUsePostalCode(countryCode) && StringsKt.isBlank(str)) ? false : true : matcher.matches();
    }

    /* compiled from: PostalCodeValidator.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002R*\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\b0\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/view/PostalCodeValidator$Companion;", "", "<init>", "()V", "POSTAL_CODE_PATTERNS", "", "", "kotlin.jvm.PlatformType", "Ljava/util/regex/Pattern;", "isPostalCodeNotRequired", "", "optionalShippingInfoFields", "", "Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;", "hiddenShippingInfoFields", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isPostalCodeNotRequired(List<? extends ShippingInfoWidget.CustomizableShippingField> optionalShippingInfoFields, List<? extends ShippingInfoWidget.CustomizableShippingField> hiddenShippingInfoFields) {
            return optionalShippingInfoFields.contains(ShippingInfoWidget.CustomizableShippingField.PostalCode) || hiddenShippingInfoFields.contains(ShippingInfoWidget.CustomizableShippingField.PostalCode);
        }
    }
}
