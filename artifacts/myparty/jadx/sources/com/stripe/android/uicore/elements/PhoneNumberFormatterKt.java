package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PhoneNumberFormatter.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007¨\u0006\u0004"}, d2 = {"convertPhoneNumberToE164", "", "nationalPhoneNumber", "countryCode", "stripe-ui-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PhoneNumberFormatterKt {
    public static final String convertPhoneNumberToE164(String nationalPhoneNumber, String countryCode) {
        Intrinsics.checkNotNullParameter(nationalPhoneNumber, "nationalPhoneNumber");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return PhoneNumberFormatter.INSTANCE.forCountry(countryCode).toE164Format(nationalPhoneNumber);
    }
}
