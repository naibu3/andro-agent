package com.stripe.android.uicore.address.schemas;

import com.stripe.android.uicore.address.AddressSchemaDefinition;
import com.stripe.android.uicore.address.CountryAddressSchema;
import com.stripe.android.uicore.address.FieldSchema;
import com.stripe.android.uicore.address.FieldType;
import com.stripe.android.uicore.address.NameType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: BaAddressSchemaDefinition.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/uicore/address/schemas/BaAddressSchemaDefinition;", "Lcom/stripe/android/uicore/address/AddressSchemaDefinition;", "<init>", "()V", "countryCode", "", "getCountryCode", "()Ljava/lang/String;", "schemaElements", "", "Lcom/stripe/android/uicore/address/CountryAddressSchema;", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BaAddressSchemaDefinition implements AddressSchemaDefinition {
    public static final int $stable = 0;
    public static final BaAddressSchemaDefinition INSTANCE = new BaAddressSchemaDefinition();
    private static final String countryCode = "BA";

    private BaAddressSchemaDefinition() {
    }

    @Override // com.stripe.android.uicore.address.AddressSchemaDefinition
    public String getCountryCode() {
        return countryCode;
    }

    @Override // com.stripe.android.uicore.address.AddressSchemaDefinition
    public List<CountryAddressSchema> schemaElements() {
        return CollectionsKt.listOf((Object[]) new CountryAddressSchema[]{new CountryAddressSchema(FieldType.AddressLine1, true, null), new CountryAddressSchema(FieldType.AddressLine2, false, null), new CountryAddressSchema(FieldType.PostalCode, false, new FieldSchema(false, (ArrayList) null, NameType.Postal, 2, (DefaultConstructorMarker) null)), new CountryAddressSchema(FieldType.Locality, true, new FieldSchema(false, (ArrayList) null, NameType.City, 2, (DefaultConstructorMarker) null))});
    }
}
