package com.stripe.android.uicore.address;

import java.util.List;
import kotlin.Metadata;

/* compiled from: AddressSchemaDefinition.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/stripe/android/uicore/address/AddressSchemaDefinition;", "", "countryCode", "", "getCountryCode", "()Ljava/lang/String;", "schemaElements", "", "Lcom/stripe/android/uicore/address/CountryAddressSchema;", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AddressSchemaDefinition {
    String getCountryCode();

    List<CountryAddressSchema> schemaElements();
}
