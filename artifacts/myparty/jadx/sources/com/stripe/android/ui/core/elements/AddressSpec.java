package com.stripe.android.ui.core.elements;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.model.CountryUtils;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.ui.core.R;
import com.stripe.android.uicore.elements.AddressElement;
import com.stripe.android.uicore.elements.AddressInputMode;
import com.stripe.android.uicore.elements.AutocompleteAddressElement;
import com.stripe.android.uicore.elements.AutocompleteAddressInteractor;
import com.stripe.android.uicore.elements.CountryConfig;
import com.stripe.android.uicore.elements.CountryElement;
import com.stripe.android.uicore.elements.DropdownFieldController;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.IdentifierSpec$$serializer;
import com.stripe.android.uicore.elements.SameAsShippingController;
import com.stripe.android.uicore.elements.SameAsShippingElement;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: AddressSpec.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0002HIBO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010BM\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000f\u0010\u0015JD\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(2\u0014\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070+2\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010+2\b\u0010-\u001a\u0004\u0018\u00010.J\t\u0010/\u001a\u00020\u0004HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003J\t\u00102\u001a\u00020\u000bHÆ\u0003J\t\u00103\u001a\u00020\rHÆ\u0003J\t\u00104\u001a\u00020\u000bHÆ\u0003JQ\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001J\u0006\u00106\u001a\u00020\u0012J\u0013\u00107\u001a\u00020\u000b2\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020\u0012HÖ\u0001J\t\u0010;\u001a\u00020\u0007HÖ\u0001J\u0016\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u0012J%\u0010A\u001a\u00020=2\u0006\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020FH\u0001¢\u0006\u0002\bGR\u001c\u0010\u0003\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u001cR\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010!R\u001c\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010$R\u001c\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010!¨\u0006J"}, d2 = {"Lcom/stripe/android/ui/core/elements/AddressSpec;", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "Landroid/os/Parcelable;", "apiPath", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "allowedCountryCodes", "", "", "displayFields", "Lcom/stripe/android/ui/core/elements/DisplayField;", "showLabel", "", "type", "Lcom/stripe/android/uicore/elements/AddressInputMode;", "hideCountry", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLcom/stripe/android/uicore/elements/AddressInputMode;Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getApiPath$annotations", "()V", "getApiPath", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getAllowedCountryCodes$annotations", "getAllowedCountryCodes", "()Ljava/util/Set;", "getDisplayFields$annotations", "getDisplayFields", "getShowLabel$annotations", "getShowLabel", "()Z", "getType$annotations", "getType", "()Lcom/stripe/android/uicore/elements/AddressInputMode;", "getHideCountry$annotations", "getHideCountry", ViewProps.TRANSFORM, "", "Lcom/stripe/android/uicore/elements/FormElement;", NamedConstantsKt.INITIAL_VALUES, "", NamedConstantsKt.SHIPPING_VALUES, "autocompleteAddressInteractorFactory", "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_ui_core_release", "$serializer", "Companion", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class AddressSpec extends FormItemSpec implements Parcelable {
    private final Set<String> allowedCountryCodes;
    private final IdentifierSpec apiPath;
    private final Set<DisplayField> displayFields;
    private final boolean hideCountry;
    private final boolean showLabel;
    private final AddressInputMode type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<AddressSpec> CREATOR = new Creator();
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new LinkedHashSetSerializer(StringSerializer.INSTANCE), new LinkedHashSetSerializer(DisplayField.INSTANCE.serializer()), null};

    /* compiled from: AddressSpec.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AddressSpec> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressSpec createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            IdentifierSpec identifierSpec = (IdentifierSpec) parcel.readParcelable(AddressSpec.class.getClassLoader());
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(parcel.readString());
            }
            LinkedHashSet linkedHashSet2 = linkedHashSet;
            int i3 = parcel.readInt();
            LinkedHashSet linkedHashSet3 = new LinkedHashSet(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                linkedHashSet3.add(DisplayField.valueOf(parcel.readString()));
            }
            LinkedHashSet linkedHashSet4 = linkedHashSet3;
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            return new AddressSpec(identifierSpec, linkedHashSet2, linkedHashSet4, z2, (AddressInputMode) parcel.readParcelable(AddressSpec.class.getClassLoader()), parcel.readInt() != 0 ? z : false);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressSpec[] newArray(int i) {
            return new AddressSpec[i];
        }
    }

    public AddressSpec() {
        this(null, null, null, false, null, false, 63, null);
    }

    public static /* synthetic */ AddressSpec copy$default(AddressSpec addressSpec, IdentifierSpec identifierSpec, Set set, Set set2, boolean z, AddressInputMode addressInputMode, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            identifierSpec = addressSpec.apiPath;
        }
        if ((i & 2) != 0) {
            set = addressSpec.allowedCountryCodes;
        }
        if ((i & 4) != 0) {
            set2 = addressSpec.displayFields;
        }
        if ((i & 8) != 0) {
            z = addressSpec.showLabel;
        }
        if ((i & 16) != 0) {
            addressInputMode = addressSpec.type;
        }
        if ((i & 32) != 0) {
            z2 = addressSpec.hideCountry;
        }
        AddressInputMode addressInputMode2 = addressInputMode;
        boolean z3 = z2;
        return addressSpec.copy(identifierSpec, set, set2, z, addressInputMode2, z3);
    }

    @SerialName("allowed_country_codes")
    public static /* synthetic */ void getAllowedCountryCodes$annotations() {
    }

    @SerialName("api_path")
    public static /* synthetic */ void getApiPath$annotations() {
    }

    @SerialName("display_fields")
    public static /* synthetic */ void getDisplayFields$annotations() {
    }

    @Transient
    public static /* synthetic */ void getHideCountry$annotations() {
    }

    @SerialName("show_label")
    public static /* synthetic */ void getShowLabel$annotations() {
    }

    @Transient
    public static /* synthetic */ void getType$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public final Set<String> component2() {
        return this.allowedCountryCodes;
    }

    public final Set<DisplayField> component3() {
        return this.displayFields;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowLabel() {
        return this.showLabel;
    }

    /* renamed from: component5, reason: from getter */
    public final AddressInputMode getType() {
        return this.type;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getHideCountry() {
        return this.hideCountry;
    }

    public final AddressSpec copy(IdentifierSpec apiPath, Set<String> allowedCountryCodes, Set<? extends DisplayField> displayFields, boolean showLabel, AddressInputMode type, boolean hideCountry) {
        Intrinsics.checkNotNullParameter(apiPath, "apiPath");
        Intrinsics.checkNotNullParameter(allowedCountryCodes, "allowedCountryCodes");
        Intrinsics.checkNotNullParameter(displayFields, "displayFields");
        Intrinsics.checkNotNullParameter(type, "type");
        return new AddressSpec(apiPath, allowedCountryCodes, displayFields, showLabel, type, hideCountry);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressSpec)) {
            return false;
        }
        AddressSpec addressSpec = (AddressSpec) other;
        return Intrinsics.areEqual(this.apiPath, addressSpec.apiPath) && Intrinsics.areEqual(this.allowedCountryCodes, addressSpec.allowedCountryCodes) && Intrinsics.areEqual(this.displayFields, addressSpec.displayFields) && this.showLabel == addressSpec.showLabel && Intrinsics.areEqual(this.type, addressSpec.type) && this.hideCountry == addressSpec.hideCountry;
    }

    public int hashCode() {
        return (((((((((this.apiPath.hashCode() * 31) + this.allowedCountryCodes.hashCode()) * 31) + this.displayFields.hashCode()) * 31) + Boolean.hashCode(this.showLabel)) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.hideCountry);
    }

    public String toString() {
        return "AddressSpec(apiPath=" + this.apiPath + ", allowedCountryCodes=" + this.allowedCountryCodes + ", displayFields=" + this.displayFields + ", showLabel=" + this.showLabel + ", type=" + this.type + ", hideCountry=" + this.hideCountry + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.apiPath, flags);
        Set<String> set = this.allowedCountryCodes;
        dest.writeInt(set.size());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            dest.writeString(it.next());
        }
        Set<DisplayField> set2 = this.displayFields;
        dest.writeInt(set2.size());
        Iterator<DisplayField> it2 = set2.iterator();
        while (it2.hasNext()) {
            dest.writeString(it2.next().name());
        }
        dest.writeInt(this.showLabel ? 1 : 0);
        dest.writeParcelable(this.type, flags);
        dest.writeInt(this.hideCountry ? 1 : 0);
    }

    /* compiled from: AddressSpec.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/ui/core/elements/AddressSpec$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/ui/core/elements/AddressSpec;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddressSpec> serializer() {
            return AddressSpec$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddressSpec(int i, IdentifierSpec identifierSpec, Set set, Set set2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        this.apiPath = (i & 1) == 0 ? IdentifierSpec.INSTANCE.Generic("billing_details[address]") : identifierSpec;
        if ((i & 2) == 0) {
            this.allowedCountryCodes = CountryUtils.INSTANCE.getSupportedBillingCountries();
        } else {
            this.allowedCountryCodes = set;
        }
        if ((i & 4) == 0) {
            this.displayFields = SetsKt.emptySet();
        } else {
            this.displayFields = set2;
        }
        if ((i & 8) == 0) {
            this.showLabel = true;
        } else {
            this.showLabel = z;
        }
        this.type = new AddressInputMode.NoAutocomplete(null, null, 3, null);
        this.hideCountry = false;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_ui_core_release(AddressSpec self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.getApiPath(), IdentifierSpec.INSTANCE.Generic("billing_details[address]"))) {
            output.encodeSerializableElement(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual(self.allowedCountryCodes, CountryUtils.INSTANCE.getSupportedBillingCountries())) {
            output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.allowedCountryCodes);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual(self.displayFields, SetsKt.emptySet())) {
            output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.displayFields);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.showLabel) {
            return;
        }
        output.encodeBooleanElement(serialDesc, 3, self.showLabel);
    }

    @Override // com.stripe.android.ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public /* synthetic */ AddressSpec(IdentifierSpec identifierSpec, Set set, Set set2, boolean z, AddressInputMode.NoAutocomplete noAutocomplete, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? IdentifierSpec.INSTANCE.Generic("billing_details[address]") : identifierSpec, (Set<String>) ((i & 2) != 0 ? CountryUtils.INSTANCE.getSupportedBillingCountries() : set), (Set<? extends DisplayField>) ((i & 4) != 0 ? SetsKt.emptySet() : set2), (i & 8) != 0 ? true : z, (i & 16) != 0 ? new AddressInputMode.NoAutocomplete(null, null, 3, null) : noAutocomplete, (i & 32) != 0 ? false : z2);
    }

    public final Set<String> getAllowedCountryCodes() {
        return this.allowedCountryCodes;
    }

    public final Set<DisplayField> getDisplayFields() {
        return this.displayFields;
    }

    public final boolean getShowLabel() {
        return this.showLabel;
    }

    public final AddressInputMode getType() {
        return this.type;
    }

    public final boolean getHideCountry() {
        return this.hideCountry;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AddressSpec(IdentifierSpec apiPath, Set<String> allowedCountryCodes, Set<? extends DisplayField> displayFields, boolean z, AddressInputMode type, boolean z2) {
        super(null);
        Intrinsics.checkNotNullParameter(apiPath, "apiPath");
        Intrinsics.checkNotNullParameter(allowedCountryCodes, "allowedCountryCodes");
        Intrinsics.checkNotNullParameter(displayFields, "displayFields");
        Intrinsics.checkNotNullParameter(type, "type");
        this.apiPath = apiPath;
        this.allowedCountryCodes = allowedCountryCodes;
        this.displayFields = displayFields;
        this.showLabel = z;
        this.type = type;
        this.hideCountry = z2;
    }

    public final List<FormElement> transform(Map<IdentifierSpec, String> initialValues, Map<IdentifierSpec, String> shippingValues, AutocompleteAddressInteractor.Factory autocompleteAddressInteractorFactory) {
        char c;
        SameAsShippingElement sameAsShippingElement;
        AddressElement addressElement;
        String str;
        Boolean booleanStrictOrNull;
        Intrinsics.checkNotNullParameter(initialValues, "initialValues");
        SameAsShippingElement sameAsShippingElement2 = null;
        sameAsShippingElement2 = null;
        sameAsShippingElement2 = null;
        ResolvableString resolvableStringResolvableString$default = this.showLabel ? ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_billing_details, new Object[0], null, 4, null) : null;
        if (this.displayFields.size() == 1 && CollectionsKt.first(this.displayFields) == DisplayField.Country) {
            return CollectionsKt.listOfNotNull(this.hideCountry ? null : createSectionElement$payments_ui_core_release(new CountryElement(IdentifierSpec.INSTANCE.Generic("billing_details[address][country]"), new DropdownFieldController(new CountryConfig(this.allowedCountryCodes, null, null, false, null, null, 62, null), initialValues.get(getApiPath()))), resolvableStringResolvableString$default));
        }
        if (shippingValues != null && (str = shippingValues.get(IdentifierSpec.INSTANCE.getSameAsShipping())) != null && (booleanStrictOrNull = StringsKt.toBooleanStrictOrNull(str)) != null) {
            sameAsShippingElement2 = new SameAsShippingElement(IdentifierSpec.INSTANCE.getSameAsShipping(), new SameAsShippingController(booleanStrictOrNull.booleanValue()));
        }
        SameAsShippingElement sameAsShippingElement3 = sameAsShippingElement2;
        if (autocompleteAddressInteractorFactory != null) {
            sameAsShippingElement = sameAsShippingElement3;
            c = 1;
            addressElement = new AutocompleteAddressElement(getApiPath(), initialValues, this.allowedCountryCodes, null, null, null, sameAsShippingElement, shippingValues, autocompleteAddressInteractorFactory, this.hideCountry, 56, null);
        } else {
            c = 1;
            sameAsShippingElement = sameAsShippingElement3;
            addressElement = new AddressElement(getApiPath(), initialValues, this.type, this.allowedCountryCodes, null, sameAsShippingElement3, shippingValues, false, this.hideCountry, 144, null);
        }
        FormElement[] formElementArr = new FormElement[2];
        formElementArr[0] = createSectionElement$payments_ui_core_release(addressElement, resolvableStringResolvableString$default);
        formElementArr[c] = sameAsShippingElement;
        return CollectionsKt.listOfNotNull((Object[]) formElementArr);
    }
}
