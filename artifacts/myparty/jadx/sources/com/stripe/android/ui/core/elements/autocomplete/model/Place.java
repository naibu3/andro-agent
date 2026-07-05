package com.stripe.android.ui.core.elements.autocomplete.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: Place.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0003 !\"B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\u000bJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\bHÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J%\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0001¢\u0006\u0002\b\u001fR$\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006#"}, d2 = {"Lcom/stripe/android/ui/core/elements/autocomplete/model/Place;", "", "addressComponents", "", "Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;", "<init>", "(Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAddressComponents$annotations", "()V", "getAddressComponents", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_ui_core_release", "Type", "$serializer", "Companion", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class Place {
    private final List<AddressComponent> addressComponents;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(AddressComponent$$serializer.INSTANCE)};

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Place copy$default(Place place, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = place.addressComponents;
        }
        return place.copy(list);
    }

    @SerialName("address_components")
    public static /* synthetic */ void getAddressComponents$annotations() {
    }

    public final List<AddressComponent> component1() {
        return this.addressComponents;
    }

    public final Place copy(List<AddressComponent> addressComponents) {
        return new Place(addressComponents);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Place) && Intrinsics.areEqual(this.addressComponents, ((Place) other).addressComponents);
    }

    public int hashCode() {
        List<AddressComponent> list = this.addressComponents;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "Place(addressComponents=" + this.addressComponents + ")";
    }

    /* compiled from: Place.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/ui/core/elements/autocomplete/model/Place;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Place> serializer() {
            return Place$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Place(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, Place$$serializer.INSTANCE.getDescriptor());
        }
        this.addressComponents = list;
    }

    public Place(List<AddressComponent> list) {
        this.addressComponents = list;
    }

    public final List<AddressComponent> getAddressComponents() {
        return this.addressComponents;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Place.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ADMINISTRATIVE_AREA_LEVEL_1", "ADMINISTRATIVE_AREA_LEVEL_2", "ADMINISTRATIVE_AREA_LEVEL_3", "ADMINISTRATIVE_AREA_LEVEL_4", "COUNTRY", "LOCALITY", "NEIGHBORHOOD", "POSTAL_TOWN", "POSTAL_CODE", "PREMISE", "ROUTE", "STREET_NUMBER", "SUBLOCALITY", "SUBLOCALITY_LEVEL_1", "SUBLOCALITY_LEVEL_2", "SUBLOCALITY_LEVEL_3", "SUBLOCALITY_LEVEL_4", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private final String value;
        public static final Type ADMINISTRATIVE_AREA_LEVEL_1 = new Type("ADMINISTRATIVE_AREA_LEVEL_1", 0, "administrative_area_level_1");
        public static final Type ADMINISTRATIVE_AREA_LEVEL_2 = new Type("ADMINISTRATIVE_AREA_LEVEL_2", 1, "administrative_area_level_2");
        public static final Type ADMINISTRATIVE_AREA_LEVEL_3 = new Type("ADMINISTRATIVE_AREA_LEVEL_3", 2, "administrative_area_level_3");
        public static final Type ADMINISTRATIVE_AREA_LEVEL_4 = new Type("ADMINISTRATIVE_AREA_LEVEL_4", 3, "administrative_area_level_4");
        public static final Type COUNTRY = new Type("COUNTRY", 4, "country");
        public static final Type LOCALITY = new Type("LOCALITY", 5, "locality");
        public static final Type NEIGHBORHOOD = new Type("NEIGHBORHOOD", 6, "neighborhood");
        public static final Type POSTAL_TOWN = new Type("POSTAL_TOWN", 7, "postal_town");
        public static final Type POSTAL_CODE = new Type("POSTAL_CODE", 8, "postal_code");
        public static final Type PREMISE = new Type("PREMISE", 9, "premise");
        public static final Type ROUTE = new Type("ROUTE", 10, "route");
        public static final Type STREET_NUMBER = new Type("STREET_NUMBER", 11, "street_number");
        public static final Type SUBLOCALITY = new Type("SUBLOCALITY", 12, "sublocality");
        public static final Type SUBLOCALITY_LEVEL_1 = new Type("SUBLOCALITY_LEVEL_1", 13, "sublocality_level_1");
        public static final Type SUBLOCALITY_LEVEL_2 = new Type("SUBLOCALITY_LEVEL_2", 14, "sublocality_level_2");
        public static final Type SUBLOCALITY_LEVEL_3 = new Type("SUBLOCALITY_LEVEL_3", 15, "sublocality_level_3");
        public static final Type SUBLOCALITY_LEVEL_4 = new Type("SUBLOCALITY_LEVEL_4", 16, "sublocality_level_4");

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{ADMINISTRATIVE_AREA_LEVEL_1, ADMINISTRATIVE_AREA_LEVEL_2, ADMINISTRATIVE_AREA_LEVEL_3, ADMINISTRATIVE_AREA_LEVEL_4, COUNTRY, LOCALITY, NEIGHBORHOOD, POSTAL_TOWN, POSTAL_CODE, PREMISE, ROUTE, STREET_NUMBER, SUBLOCALITY, SUBLOCALITY_LEVEL_1, SUBLOCALITY_LEVEL_2, SUBLOCALITY_LEVEL_3, SUBLOCALITY_LEVEL_4};
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        private Type(String str, int i, String str2) {
            this.value = str2;
        }

        public final String getValue() {
            return this.value;
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(typeArr$values);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }
}
