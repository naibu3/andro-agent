package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.address.AddressSchemaDefinition;
import com.stripe.android.uicore.address.AddressSchemaRegistry;
import com.stripe.android.uicore.address.TransformAddressToElementKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddressElementUiRegistry.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000bR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/uicore/elements/AddressElementUiRegistry;", "", "schemaRegistry", "Lcom/stripe/android/uicore/address/AddressSchemaRegistry;", "<init>", "(Lcom/stripe/android/uicore/address/AddressSchemaRegistry;)V", "defaultElements", "", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "elements", "", "", "get", "countryCode", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressElementUiRegistry {
    public static final int $stable = 8;
    private final List<SectionFieldElement> defaultElements;
    private final Map<String, List<SectionFieldElement>> elements;

    public AddressElementUiRegistry(AddressSchemaRegistry schemaRegistry) {
        Intrinsics.checkNotNullParameter(schemaRegistry, "schemaRegistry");
        this.defaultElements = TransformAddressToElementKt.transformToElementList(schemaRegistry.getDefaultSchema$stripe_ui_core_release().schemaElements(), schemaRegistry.getDefaultSchema$stripe_ui_core_release().getCountryCode());
        Map<String, AddressSchemaDefinition> all$stripe_ui_core_release = schemaRegistry.getAll$stripe_ui_core_release();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(all$stripe_ui_core_release.size()));
        Iterator<T> it = all$stripe_ui_core_release.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), TransformAddressToElementKt.transformToElementList(((AddressSchemaDefinition) entry.getValue()).schemaElements(), (String) entry.getKey()));
        }
        this.elements = linkedHashMap;
    }

    public final List<SectionFieldElement> get(String countryCode) {
        if (countryCode != null) {
            return this.elements.get(countryCode);
        }
        return this.defaultElements;
    }
}
