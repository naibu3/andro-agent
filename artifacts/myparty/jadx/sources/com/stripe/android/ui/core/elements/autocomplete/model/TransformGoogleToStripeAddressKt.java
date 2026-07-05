package com.stripe.android.ui.core.elements.autocomplete.model;

import android.content.Context;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.model.Address;
import com.stripe.android.ui.core.elements.autocomplete.model.Place;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: TransformGoogleToStripeAddress.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000\u001a \u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a,\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\f\u0010\u0014\u001a\u00020\u0010*\u00020\u0010H\u0000\u001a\u0014\u0010\u0015\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0007H\u0000\u001a\u0014\u0010\u0017\u001a\u00020\u0018*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0007\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0019"}, d2 = {"STREET_NAME_FIRST_COUNTRIES", "", "", "getSTREET_NAME_FIRST_COUNTRIES", "()Ljava/util/Set;", ViewProps.FILTER, "Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;", "Lcom/stripe/android/ui/core/elements/autocomplete/model/Place;", "type", "Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;", "composeAddressLine1", "context", "Landroid/content/Context;", "addressLine1", "Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressLine1;", "address", "Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;", "composeJapaneseAddressLine1", "localityComponent", "premiseComponent", "combineDependentLocalityWithLine2", "modifyStripeAddressByCountry", "place", "transformGoogleToStripeAddress", "Lcom/stripe/android/model/Address;", "payments-ui-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransformGoogleToStripeAddressKt {
    private static final Set<String> STREET_NAME_FIRST_COUNTRIES = SetsKt.setOf((Object[]) new String[]{"BE", "BR", "CH", "DE", "ES", "ID", "IT", "MX", "NL", "NO", "PL", "RU", "SE"});

    public static final Set<String> getSTREET_NAME_FIRST_COUNTRIES() {
        return STREET_NAME_FIRST_COUNTRIES;
    }

    public static final AddressComponent filter(Place place, Place.Type type) {
        Intrinsics.checkNotNullParameter(place, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        List<AddressComponent> addressComponents = place.getAddressComponents();
        Object obj = null;
        if (addressComponents == null) {
            return null;
        }
        Iterator<T> it = addressComponents.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((AddressComponent) next).getTypes().contains(type.getValue())) {
                obj = next;
                break;
            }
        }
        return (AddressComponent) obj;
    }

    public static final String composeAddressLine1(Context context, AddressLine1 addressLine1, Address address) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(addressLine1, "addressLine1");
        Intrinsics.checkNotNullParameter(address, "address");
        String streetNumber = addressLine1.getStreetNumber();
        if (streetNumber == null) {
            streetNumber = "";
        }
        String route = addressLine1.getRoute();
        if (route == null) {
            route = "";
        }
        String locality = address.getLocality();
        String country = address.getCountry();
        if (Intrinsics.areEqual(country, "JP")) {
            return composeJapaneseAddressLine1(context, addressLine1, locality, address.getAddressLine2());
        }
        if (StringsKt.isBlank(streetNumber) && StringsKt.isBlank(route)) {
            return "";
        }
        if (CollectionsKt.contains(STREET_NAME_FIRST_COUNTRIES, country)) {
            return StringsKt.trim((CharSequence) (route + " " + streetNumber)).toString();
        }
        return StringsKt.trim((CharSequence) (streetNumber + " " + route)).toString();
    }

    public static final String composeJapaneseAddressLine1(Context context, AddressLine1 addressLine1, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(addressLine1, "addressLine1");
        boolean z = (addressLine1.getSubLocalityLevel2() == null || addressLine1.getSubLocalityLevel3() == null || addressLine1.getSubLocalityLevel4() == null) ? false : true;
        String subLocalityLevel3 = addressLine1.getSubLocalityLevel3();
        String subLocalityLevel4 = addressLine1.getSubLocalityLevel4();
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (str == null) {
            str = "";
        }
        String subLocalityLevel2 = addressLine1.getSubLocalityLevel2();
        if (Intrinsics.areEqual(context.getResources().getConfiguration().getLocales().get(0), Locale.JAPANESE)) {
            if (z) {
                str3 = subLocalityLevel3 + subLocalityLevel4 + "-" + str2;
            }
            return str + subLocalityLevel2 + str3;
        }
        if (z) {
            str3 = subLocalityLevel3 + "-" + subLocalityLevel4 + "-" + str2;
        }
        return str3 + " " + subLocalityLevel2 + " " + str;
    }

    public static final Address combineDependentLocalityWithLine2(Address address) {
        String dependentLocality;
        Intrinsics.checkNotNullParameter(address, "<this>");
        Address addressCopy$default = Address.copy$default(address, null, null, null, null, null, null, null, 127, null);
        if (address.getDependentLocality() != null) {
            if (address.getAddressLine2() != null) {
                dependentLocality = address.getAddressLine2() + ", " + address.getDependentLocality();
            } else {
                dependentLocality = address.getDependentLocality();
            }
            addressCopy$default.setAddressLine2(dependentLocality);
        }
        return addressCopy$default;
    }

    public static final Address modifyStripeAddressByCountry(Address address, Place place) {
        Intrinsics.checkNotNullParameter(address, "<this>");
        Intrinsics.checkNotNullParameter(place, "place");
        AddressComponent addressComponentFilter = filter(place, Place.Type.ADMINISTRATIVE_AREA_LEVEL_2);
        String shortName = addressComponentFilter != null ? addressComponentFilter.getShortName() : null;
        AddressComponent addressComponentFilter2 = filter(place, Place.Type.ADMINISTRATIVE_AREA_LEVEL_1);
        String longName = addressComponentFilter2 != null ? addressComponentFilter2.getLongName() : null;
        Address addressCopy$default = Address.copy$default(address, null, null, null, null, null, null, null, 127, null);
        String country = address.getCountry();
        if (country == null) {
            return addressCopy$default;
        }
        int iHashCode = country.hashCode();
        if (iHashCode != 2128) {
            if (iHashCode != 2222) {
                if (iHashCode == 2332) {
                    if (!country.equals("IE") || longName == null) {
                        return addressCopy$default;
                    }
                    addressCopy$default.setAdministrativeArea(longName);
                    return combineDependentLocalityWithLine2(addressCopy$default);
                }
                if (iHashCode != 2347) {
                    if (iHashCode == 2374) {
                        if (!country.equals("JP")) {
                            return addressCopy$default;
                        }
                        addressCopy$default.setAddressLine2(null);
                        return addressCopy$default;
                    }
                    if (iHashCode != 2552) {
                        if (iHashCode != 2686) {
                            if (iHashCode != 2855) {
                                if (iHashCode != 2475) {
                                    if (iHashCode != 2476 || !country.equals("MY")) {
                                        return addressCopy$default;
                                    }
                                } else if (!country.equals("MX")) {
                                    return addressCopy$default;
                                }
                            } else if (!country.equals("ZA")) {
                                return addressCopy$default;
                            }
                        } else if (!country.equals("TR")) {
                            return addressCopy$default;
                        }
                    } else if (!country.equals("PH")) {
                        return addressCopy$default;
                    }
                    return combineDependentLocalityWithLine2(addressCopy$default);
                }
                if (!country.equals("IT")) {
                    return addressCopy$default;
                }
            } else if (!country.equals("ES")) {
                return addressCopy$default;
            }
            if (shortName == null) {
                return addressCopy$default;
            }
            addressCopy$default.setAdministrativeArea(shortName);
            return addressCopy$default;
        }
        if (!country.equals("BR")) {
            return addressCopy$default;
        }
        if (address.getLocality() == null && shortName != null) {
            addressCopy$default.setLocality(shortName);
        }
        return combineDependentLocalityWithLine2(addressCopy$default);
    }

    public static final com.stripe.android.model.Address transformGoogleToStripeAddress(Place place, Context context) {
        Intrinsics.checkNotNullParameter(place, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Address address = new Address(null, null, null, null, null, null, null, 127, null);
        AddressLine1 addressLine1 = new AddressLine1(null, null, null, null, null, 31, null);
        List<AddressComponent> addressComponents = place.getAddressComponents();
        if (addressComponents != null) {
            for (AddressComponent addressComponent : addressComponents) {
                List<String> types = addressComponent.getTypes();
                if (types.contains(Place.Type.STREET_NUMBER.getValue())) {
                    addressLine1.setStreetNumber(addressComponent.getLongName());
                } else if (types.contains(Place.Type.ROUTE.getValue())) {
                    addressLine1.setRoute(addressComponent.getLongName());
                } else if (types.contains(Place.Type.PREMISE.getValue())) {
                    address.setAddressLine2(addressComponent.getLongName());
                } else if (types.contains(Place.Type.SUBLOCALITY_LEVEL_1.getValue())) {
                    if (address.getLocality() == null) {
                        address.setDependentLocality(addressComponent.getLongName());
                    } else {
                        address.setLocality(addressComponent.getLongName());
                    }
                } else if (types.contains(Place.Type.SUBLOCALITY_LEVEL_2.getValue())) {
                    addressLine1.setSubLocalityLevel2(addressComponent.getLongName());
                } else if (types.contains(Place.Type.SUBLOCALITY_LEVEL_3.getValue())) {
                    addressLine1.setSubLocalityLevel3(addressComponent.getLongName());
                } else if (types.contains(Place.Type.SUBLOCALITY_LEVEL_4.getValue())) {
                    addressLine1.setSubLocalityLevel4(addressComponent.getLongName());
                } else if (types.contains(Place.Type.LOCALITY.getValue()) || types.contains(Place.Type.SUBLOCALITY.getValue()) || types.contains(Place.Type.POSTAL_TOWN.getValue())) {
                    address.setLocality(addressComponent.getLongName());
                } else if (types.contains(Place.Type.ADMINISTRATIVE_AREA_LEVEL_1.getValue())) {
                    address.setAdministrativeArea(addressComponent.getShortName());
                } else if (types.contains(Place.Type.ADMINISTRATIVE_AREA_LEVEL_3.getValue())) {
                    if (address.getLocality() == null) {
                        address.setLocality(addressComponent.getLongName());
                    }
                } else if (types.contains(Place.Type.ADMINISTRATIVE_AREA_LEVEL_2.getValue())) {
                    if (address.getAdministrativeArea() == null && address.getDependentLocality() == null) {
                        address.setDependentLocality(addressComponent.getLongName());
                    } else {
                        address.setAdministrativeArea(addressComponent.getShortName());
                    }
                } else if (types.contains(Place.Type.NEIGHBORHOOD.getValue())) {
                    if (address.getLocality() == null) {
                        address.setLocality(addressComponent.getLongName());
                    } else {
                        address.setDependentLocality(addressComponent.getLongName());
                    }
                } else if (types.contains(Place.Type.POSTAL_CODE.getValue())) {
                    address.setPostalCode(addressComponent.getLongName());
                } else if (types.contains(Place.Type.COUNTRY.getValue())) {
                    address.setCountry(addressComponent.getShortName());
                }
            }
        }
        address.setAddressLine1(composeAddressLine1(context, addressLine1, address));
        Address addressModifyStripeAddressByCountry = modifyStripeAddressByCountry(address, place);
        return new Address.Builder().setLine1(addressModifyStripeAddressByCountry.getAddressLine1()).setLine2(addressModifyStripeAddressByCountry.getAddressLine2()).setCity(addressModifyStripeAddressByCountry.getLocality()).setState(addressModifyStripeAddressByCountry.getAdministrativeArea()).setCountry(addressModifyStripeAddressByCountry.getCountry()).setPostalCode(addressModifyStripeAddressByCountry.getPostalCode()).build();
    }
}
