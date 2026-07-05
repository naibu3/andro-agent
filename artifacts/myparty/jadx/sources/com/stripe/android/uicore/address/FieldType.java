package com.stripe.android.uicore.address;

import androidx.autofill.HintConstants;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import com.stripe.android.core.R;
import com.stripe.android.uicore.elements.IdentifierSpec;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TransformAddressToElement.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001bB#\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0018\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/uicore/address/FieldType;", "", "serializedValue", "", "identifierSpec", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "defaultLabel", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V", "getSerializedValue", "()Ljava/lang/String;", "getIdentifierSpec", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getDefaultLabel", "()I", "AddressLine1", "AddressLine2", "Locality", "DependentLocality", "PostalCode", "SortingCode", "AdministrativeArea", "Name", "capitalization", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "capitalization-IUNYP9k", "Companion", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes6.dex */
public class FieldType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FieldType[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int defaultLabel;
    private final IdentifierSpec identifierSpec;
    private final String serializedValue;

    @SerialName("addressLine1")
    public static final FieldType AddressLine1 = new FieldType("AddressLine1", 0, "addressLine1", IdentifierSpec.INSTANCE.getLine1(), R.string.stripe_address_label_address_line1);

    @SerialName("addressLine2")
    public static final FieldType AddressLine2 = new FieldType("AddressLine2", 1, "addressLine2", IdentifierSpec.INSTANCE.getLine2(), com.stripe.android.uicore.R.string.stripe_address_label_address_line2);

    @SerialName("locality")
    public static final FieldType Locality = new FieldType("Locality", 2, "locality", IdentifierSpec.INSTANCE.getCity(), R.string.stripe_address_label_city);

    @SerialName("dependentLocality")
    public static final FieldType DependentLocality = new FieldType("DependentLocality", 3, "dependentLocality", IdentifierSpec.INSTANCE.getDependentLocality(), R.string.stripe_address_label_city);

    @SerialName(HintConstants.AUTOFILL_HINT_POSTAL_CODE)
    public static final FieldType PostalCode = new FieldType("PostalCode", 4) { // from class: com.stripe.android.uicore.address.FieldType.PostalCode
        {
            IdentifierSpec postalCode = IdentifierSpec.INSTANCE.getPostalCode();
            int i = R.string.stripe_address_label_postal_code;
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str = HintConstants.AUTOFILL_HINT_POSTAL_CODE;
        }

        @Override // com.stripe.android.uicore.address.FieldType
        /* renamed from: capitalization-IUNYP9k */
        public int mo8760capitalizationIUNYP9k() {
            return KeyboardCapitalization.INSTANCE.m5813getNoneIUNYP9k();
        }
    };

    @SerialName("sortingCode")
    public static final FieldType SortingCode = new FieldType("SortingCode", 5) { // from class: com.stripe.android.uicore.address.FieldType.SortingCode
        {
            IdentifierSpec sortingCode = IdentifierSpec.INSTANCE.getSortingCode();
            int i = R.string.stripe_address_label_postal_code;
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str = "sortingCode";
        }

        @Override // com.stripe.android.uicore.address.FieldType
        /* renamed from: capitalization-IUNYP9k */
        public int mo8760capitalizationIUNYP9k() {
            return KeyboardCapitalization.INSTANCE.m5813getNoneIUNYP9k();
        }
    };

    @SerialName("administrativeArea")
    public static final FieldType AdministrativeArea = new FieldType("AdministrativeArea", 6, "administrativeArea", IdentifierSpec.INSTANCE.getState(), NameType.State.getStringResId());

    @SerialName("name")
    public static final FieldType Name = new FieldType("Name", 7, "name", IdentifierSpec.INSTANCE.getName(), R.string.stripe_address_label_full_name);

    private static final /* synthetic */ FieldType[] $values() {
        return new FieldType[]{AddressLine1, AddressLine2, Locality, DependentLocality, PostalCode, SortingCode, AdministrativeArea, Name};
    }

    public /* synthetic */ FieldType(String str, int i, String str2, IdentifierSpec identifierSpec, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, identifierSpec, i2);
    }

    public static EnumEntries<FieldType> getEntries() {
        return $ENTRIES;
    }

    private FieldType(String str, int i, String str2, IdentifierSpec identifierSpec, int i2) {
        this.serializedValue = str2;
        this.identifierSpec = identifierSpec;
        this.defaultLabel = i2;
    }

    public final String getSerializedValue() {
        return this.serializedValue;
    }

    public final IdentifierSpec getIdentifierSpec() {
        return this.identifierSpec;
    }

    public final int getDefaultLabel() {
        return this.defaultLabel;
    }

    static {
        FieldType[] fieldTypeArr$values = $values();
        $VALUES = fieldTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(fieldTypeArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.stripe.android.uicore.address.FieldType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FieldType._init_$_anonymous_();
            }
        });
    }

    /* renamed from: capitalization-IUNYP9k, reason: not valid java name */
    public int mo8760capitalizationIUNYP9k() {
        return KeyboardCapitalization.INSTANCE.m5816getWordsIUNYP9k();
    }

    /* compiled from: TransformAddressToElement.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/uicore/address/FieldType$Companion;", "", "<init>", "()V", "from", "Lcom/stripe/android/uicore/address/FieldType;", "value", "", "serializer", "Lkotlinx/serialization/KSerializer;", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) FieldType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<FieldType> serializer() {
            return get$cachedSerializer();
        }

        public final FieldType from(String value) {
            FieldType next;
            Intrinsics.checkNotNullParameter(value, "value");
            Iterator<FieldType> it = FieldType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(next.getSerializedValue(), value)) {
                    break;
                }
            }
            return next;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.stripe.android.uicore.address.FieldType", values(), new String[]{"addressLine1", "addressLine2", "locality", "dependentLocality", HintConstants.AUTOFILL_HINT_POSTAL_CODE, "sortingCode", "administrativeArea", "name"}, new Annotation[][]{null, null, null, null, null, null, null, null}, null);
    }

    public static FieldType valueOf(String str) {
        return (FieldType) Enum.valueOf(FieldType.class, str);
    }

    public static FieldType[] values() {
        return (FieldType[]) $VALUES.clone();
    }
}
