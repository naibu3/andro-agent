package com.stripe.android.financialconnections.utils;

import com.stripe.android.financialconnections.ElementsSessionContext;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: BillingDetailsExtensions.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u0007\u001a\u0018\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u0007¨\u0006\u0006"}, d2 = {"toApiParams", "", "", "", "Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;", "toConsumerBillingAddressParams", "financial-connections-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BillingDetailsExtensionsKt {
    public static final Map<String, Object> toApiParams(ElementsSessionContext.BillingDetails billingDetails) {
        LinkedHashMap linkedHashMap;
        Intrinsics.checkNotNullParameter(billingDetails, "<this>");
        ElementsSessionContext.BillingDetails.Address address = billingDetails.getAddress();
        if (address != null) {
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            String line1 = address.getLine1();
            if (line1 != null) {
            }
            String line2 = address.getLine2();
            if (line2 != null) {
            }
            String postalCode = address.getPostalCode();
            if (postalCode != null) {
            }
            String city = address.getCity();
            if (city != null) {
            }
            String state = address.getState();
            if (state != null) {
            }
            String country = address.getCountry();
            if (country != null) {
                mapCreateMapBuilder.put("country", country);
            }
            Map mapBuild = MapsKt.build(mapCreateMapBuilder);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : mapBuild.entrySet()) {
                if (!StringsKt.isBlank((String) entry.getValue())) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            linkedHashMap = linkedHashMap2;
        } else {
            linkedHashMap = null;
        }
        return CollectionsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("name", billingDetails.getName()), TuplesKt.to("email", billingDetails.getEmail()), TuplesKt.to("phone", billingDetails.getPhone()), TuplesKt.to("address", linkedHashMap)));
    }

    public static final Map<String, Object> toConsumerBillingAddressParams(ElementsSessionContext.BillingDetails billingDetails) {
        String country;
        String state;
        String city;
        String postalCode;
        String line2;
        String line1;
        Intrinsics.checkNotNullParameter(billingDetails, "<this>");
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        String name = billingDetails.getName();
        if (name != null) {
            mapCreateMapBuilder.put("name", name);
        }
        Map mapBuild = MapsKt.build(mapCreateMapBuilder);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapBuild.entrySet()) {
            if (!StringsKt.isBlank((CharSequence) entry.getValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Map mapCreateMapBuilder2 = MapsKt.createMapBuilder();
        ElementsSessionContext.BillingDetails.Address address = billingDetails.getAddress();
        if (address != null && (line1 = address.getLine1()) != null) {
        }
        ElementsSessionContext.BillingDetails.Address address2 = billingDetails.getAddress();
        if (address2 != null && (line2 = address2.getLine2()) != null) {
        }
        ElementsSessionContext.BillingDetails.Address address3 = billingDetails.getAddress();
        if (address3 != null && (postalCode = address3.getPostalCode()) != null) {
        }
        ElementsSessionContext.BillingDetails.Address address4 = billingDetails.getAddress();
        if (address4 != null && (city = address4.getCity()) != null) {
        }
        ElementsSessionContext.BillingDetails.Address address5 = billingDetails.getAddress();
        if (address5 != null && (state = address5.getState()) != null) {
        }
        ElementsSessionContext.BillingDetails.Address address6 = billingDetails.getAddress();
        if (address6 != null && (country = address6.getCountry()) != null) {
            mapCreateMapBuilder2.put("country_code", country);
        }
        Map mapBuild2 = MapsKt.build(mapCreateMapBuilder2);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : mapBuild2.entrySet()) {
            if (!StringsKt.isBlank((String) entry2.getValue())) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return MapsKt.plus(linkedHashMap, linkedHashMap2);
    }
}
