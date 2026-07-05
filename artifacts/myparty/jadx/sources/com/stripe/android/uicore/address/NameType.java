package com.stripe.android.uicore.address;

import com.facebook.internal.ServerProtocol;
import com.nimbusds.jose.HeaderParameterNames;
import com.stripe.android.uicore.R;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TransformAddressToElement.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\b\u0087\u0081\u0002\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001!B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006\""}, d2 = {"Lcom/stripe/android/uicore/address/NameType;", "", "stringResId", "", "<init>", "(Ljava/lang/String;II)V", "getStringResId", "()I", "Area", "Cedex", "City", "Country", "County", "Department", "District", "DoSi", "Eircode", "Emirate", "Island", "Neighborhood", "Oblast", "Parish", "Pin", "PostTown", "Postal", "Perfecture", "Province", "State", "Suburb", "SuburbOrCity", "Townload", "VillageTownship", "Zip", "Companion", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final class NameType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NameType[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int stringResId;

    @SerialName("area")
    public static final NameType Area = new NameType("Area", 0, R.string.stripe_address_label_hk_area);

    @SerialName("cedex")
    public static final NameType Cedex = new NameType("Cedex", 1, R.string.stripe_address_label_cedex);

    @SerialName("city")
    public static final NameType City = new NameType("City", 2, com.stripe.android.core.R.string.stripe_address_label_city);

    @SerialName("country")
    public static final NameType Country = new NameType("Country", 3, com.stripe.android.core.R.string.stripe_address_label_country_or_region);

    @SerialName("county")
    public static final NameType County = new NameType("County", 4, com.stripe.android.core.R.string.stripe_address_label_county);

    @SerialName("department")
    public static final NameType Department = new NameType("Department", 5, R.string.stripe_address_label_department);

    @SerialName("district")
    public static final NameType District = new NameType("District", 6, R.string.stripe_address_label_district);

    @SerialName("do_si")
    public static final NameType DoSi = new NameType("DoSi", 7, R.string.stripe_address_label_kr_do_si);

    @SerialName("eircode")
    public static final NameType Eircode = new NameType("Eircode", 8, R.string.stripe_address_label_ie_eircode);

    @SerialName("emirate")
    public static final NameType Emirate = new NameType("Emirate", 9, R.string.stripe_address_label_ae_emirate);

    @SerialName("island")
    public static final NameType Island = new NameType("Island", 10, R.string.stripe_address_label_island);

    @SerialName("neighborhood")
    public static final NameType Neighborhood = new NameType("Neighborhood", 11, R.string.stripe_address_label_neighborhood);

    @SerialName("oblast")
    public static final NameType Oblast = new NameType("Oblast", 12, R.string.stripe_address_label_oblast);

    @SerialName("parish")
    public static final NameType Parish = new NameType("Parish", 13, R.string.stripe_address_label_bb_jm_parish);

    @SerialName("pin")
    public static final NameType Pin = new NameType("Pin", 14, R.string.stripe_address_label_in_pin);

    @SerialName("post_town")
    public static final NameType PostTown = new NameType("PostTown", 15, R.string.stripe_address_label_post_town);

    @SerialName("postal")
    public static final NameType Postal = new NameType("Postal", 16, com.stripe.android.core.R.string.stripe_address_label_postal_code);

    @SerialName("prefecture")
    public static final NameType Perfecture = new NameType("Perfecture", 17, R.string.stripe_address_label_jp_prefecture);

    @SerialName("province")
    public static final NameType Province = new NameType("Province", 18, com.stripe.android.core.R.string.stripe_address_label_province);

    @SerialName(ServerProtocol.DIALOG_PARAM_STATE)
    public static final NameType State = new NameType("State", 19, com.stripe.android.core.R.string.stripe_address_label_state);

    @SerialName("suburb")
    public static final NameType Suburb = new NameType("Suburb", 20, R.string.stripe_address_label_suburb);

    @SerialName("suburb_or_city")
    public static final NameType SuburbOrCity = new NameType("SuburbOrCity", 21, R.string.stripe_address_label_au_suburb_or_city);

    @SerialName("townland")
    public static final NameType Townload = new NameType("Townload", 22, R.string.stripe_address_label_ie_townland);

    @SerialName("village_township")
    public static final NameType VillageTownship = new NameType("VillageTownship", 23, R.string.stripe_address_label_village_township);

    @SerialName(HeaderParameterNames.COMPRESSION_ALGORITHM)
    public static final NameType Zip = new NameType("Zip", 24, com.stripe.android.core.R.string.stripe_address_label_zip_code);

    private static final /* synthetic */ NameType[] $values() {
        return new NameType[]{Area, Cedex, City, Country, County, Department, District, DoSi, Eircode, Emirate, Island, Neighborhood, Oblast, Parish, Pin, PostTown, Postal, Perfecture, Province, State, Suburb, SuburbOrCity, Townload, VillageTownship, Zip};
    }

    public static EnumEntries<NameType> getEntries() {
        return $ENTRIES;
    }

    /* compiled from: TransformAddressToElement.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/uicore/address/NameType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/uicore/address/NameType;", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) NameType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<NameType> serializer() {
            return get$cachedSerializer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.stripe.android.uicore.address.NameType", values(), new String[]{"area", "cedex", "city", "country", "county", "department", "district", "do_si", "eircode", "emirate", "island", "neighborhood", "oblast", "parish", "pin", "post_town", "postal", "prefecture", "province", ServerProtocol.DIALOG_PARAM_STATE, "suburb", "suburb_or_city", "townland", "village_township", HeaderParameterNames.COMPRESSION_ALGORITHM}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}, null);
    }

    private NameType(String str, int i, int i2) {
        this.stringResId = i2;
    }

    public final int getStringResId() {
        return this.stringResId;
    }

    static {
        NameType[] nameTypeArr$values = $values();
        $VALUES = nameTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(nameTypeArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.stripe.android.uicore.address.NameType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NameType._init_$_anonymous_();
            }
        });
    }

    public static NameType valueOf(String str) {
        return (NameType) Enum.valueOf(NameType.class, str);
    }

    public static NameType[] values() {
        return (NameType[]) $VALUES.clone();
    }
}
