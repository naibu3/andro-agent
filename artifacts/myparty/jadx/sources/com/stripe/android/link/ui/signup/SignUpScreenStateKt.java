package com.stripe.android.link.ui.signup;

import com.stripe.android.core.model.CountryCode;
import com.stripe.android.link.LinkConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: SignUpScreenState.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0000\u001a\u00020\u0001H\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"requiresNameCollection", "", "Lcom/stripe/android/link/LinkConfiguration;", "getRequiresNameCollection", "(Lcom/stripe/android/link/LinkConfiguration;)Z", "isComplete", "Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SignUpScreenStateKt {
    public static final boolean getRequiresNameCollection(LinkConfiguration linkConfiguration) {
        Intrinsics.checkNotNullParameter(linkConfiguration, "<this>");
        return !Intrinsics.areEqual(linkConfiguration.getStripeIntent().getCountryCode(), CountryCode.INSTANCE.getUS().getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isComplete(LinkConfiguration.CustomerInfo customerInfo, boolean z) {
        String phone;
        String email = customerInfo.getEmail();
        if (email == null || StringsKt.isBlank(email) || (phone = customerInfo.getPhone()) == null || StringsKt.isBlank(phone)) {
            return false;
        }
        if (!z) {
            return true;
        }
        String name = customerInfo.getName();
        return (name == null || StringsKt.isBlank(name)) ? false : true;
    }
}
