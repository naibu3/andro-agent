package com.stripe.android.paymentsheet.addresselement;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;

/* compiled from: AddressElementDefaults.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"AUTOCOMPLETE_DEFAULT_COUNTRIES", "", "", "getAUTOCOMPLETE_DEFAULT_COUNTRIES", "()Ljava/util/Set;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressElementDefaultsKt {
    private static final Set<String> AUTOCOMPLETE_DEFAULT_COUNTRIES = SetsKt.setOf((Object[]) new String[]{"AU", "BE", "BR", "CA", "CH", "DE", "ES", "FR", "GB", "IE", "IT", "MX", "NO", "NL", "PL", "RU", "SE", "TR", "US", "ZA"});

    public static final Set<String> getAUTOCOMPLETE_DEFAULT_COUNTRIES() {
        return AUTOCOMPLETE_DEFAULT_COUNTRIES;
    }
}
