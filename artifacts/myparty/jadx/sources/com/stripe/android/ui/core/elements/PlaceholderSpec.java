package com.stripe.android.ui.core.elements;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.stripe.android.ui.core.elements.PlaceholderSpec;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.IdentifierSpec$$serializer;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: PlaceholderSpec.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0003+,-B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\tJ\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\tJ%\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0001¢\u0006\u0002\b*R\u001c\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006."}, d2 = {"Lcom/stripe/android/ui/core/elements/PlaceholderSpec;", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "apiPath", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "field", "Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getApiPath$annotations", "()V", "getApiPath", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getField$annotations", "getField", "()Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_ui_core_release", "PlaceholderField", "$serializer", "Companion", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class PlaceholderSpec extends FormItemSpec {
    private final IdentifierSpec apiPath;
    private final PlaceholderField field;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<PlaceholderSpec> CREATOR = new Creator();
    public static final int $stable = IdentifierSpec.$stable;
    private static final KSerializer<Object>[] $childSerializers = {null, PlaceholderField.INSTANCE.serializer()};

    /* compiled from: PlaceholderSpec.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlaceholderSpec> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlaceholderSpec createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlaceholderSpec((IdentifierSpec) parcel.readParcelable(PlaceholderSpec.class.getClassLoader()), PlaceholderField.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlaceholderSpec[] newArray(int i) {
            return new PlaceholderSpec[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlaceholderSpec() {
        this((IdentifierSpec) null, (PlaceholderField) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ PlaceholderSpec copy$default(PlaceholderSpec placeholderSpec, IdentifierSpec identifierSpec, PlaceholderField placeholderField, int i, Object obj) {
        if ((i & 1) != 0) {
            identifierSpec = placeholderSpec.apiPath;
        }
        if ((i & 2) != 0) {
            placeholderField = placeholderSpec.field;
        }
        return placeholderSpec.copy(identifierSpec, placeholderField);
    }

    @SerialName("api_path")
    public static /* synthetic */ void getApiPath$annotations() {
    }

    @SerialName("for")
    public static /* synthetic */ void getField$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    /* renamed from: component2, reason: from getter */
    public final PlaceholderField getField() {
        return this.field;
    }

    public final PlaceholderSpec copy(IdentifierSpec apiPath, PlaceholderField field) {
        Intrinsics.checkNotNullParameter(apiPath, "apiPath");
        Intrinsics.checkNotNullParameter(field, "field");
        return new PlaceholderSpec(apiPath, field);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaceholderSpec)) {
            return false;
        }
        PlaceholderSpec placeholderSpec = (PlaceholderSpec) other;
        return Intrinsics.areEqual(this.apiPath, placeholderSpec.apiPath) && this.field == placeholderSpec.field;
    }

    public int hashCode() {
        return (this.apiPath.hashCode() * 31) + this.field.hashCode();
    }

    public String toString() {
        return "PlaceholderSpec(apiPath=" + this.apiPath + ", field=" + this.field + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.apiPath, flags);
        dest.writeString(this.field.name());
    }

    /* compiled from: PlaceholderSpec.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/ui/core/elements/PlaceholderSpec$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/ui/core/elements/PlaceholderSpec;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PlaceholderSpec> serializer() {
            return PlaceholderSpec$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PlaceholderSpec(int i, IdentifierSpec identifierSpec, PlaceholderField placeholderField, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        this.apiPath = (i & 1) == 0 ? IdentifierSpec.INSTANCE.Generic(ReactTextInputShadowNode.PROP_PLACEHOLDER) : identifierSpec;
        if ((i & 2) == 0) {
            this.field = PlaceholderField.Unknown;
        } else {
            this.field = placeholderField;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_ui_core_release(PlaceholderSpec self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.getApiPath(), IdentifierSpec.INSTANCE.Generic(ReactTextInputShadowNode.PROP_PLACEHOLDER))) {
            output.encodeSerializableElement(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.field == PlaceholderField.Unknown) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.field);
    }

    @Override // com.stripe.android.ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public /* synthetic */ PlaceholderSpec(IdentifierSpec identifierSpec, PlaceholderField placeholderField, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? IdentifierSpec.INSTANCE.Generic(ReactTextInputShadowNode.PROP_PLACEHOLDER) : identifierSpec, (i & 2) != 0 ? PlaceholderField.Unknown : placeholderField);
    }

    public final PlaceholderField getField() {
        return this.field;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PlaceholderSpec.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;", "", "<init>", "(Ljava/lang/String;I)V", "Name", "Email", "Phone", "BillingAddress", "BillingAddressWithoutCountry", "SepaMandate", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, "Companion", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final class PlaceholderField {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PlaceholderField[] $VALUES;
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;

        @SerialName("name")
        public static final PlaceholderField Name = new PlaceholderField("Name", 0);

        @SerialName("email")
        public static final PlaceholderField Email = new PlaceholderField("Email", 1);

        @SerialName("phone")
        public static final PlaceholderField Phone = new PlaceholderField("Phone", 2);

        @SerialName("billing_address")
        public static final PlaceholderField BillingAddress = new PlaceholderField("BillingAddress", 3);

        @SerialName("billing_address_without_country")
        public static final PlaceholderField BillingAddressWithoutCountry = new PlaceholderField("BillingAddressWithoutCountry", 4);

        @SerialName("sepa_mandate")
        public static final PlaceholderField SepaMandate = new PlaceholderField("SepaMandate", 5);

        @SerialName("unknown")
        public static final PlaceholderField Unknown = new PlaceholderField(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, 6);

        private static final /* synthetic */ PlaceholderField[] $values() {
            return new PlaceholderField[]{Name, Email, Phone, BillingAddress, BillingAddressWithoutCountry, SepaMandate, Unknown};
        }

        public static EnumEntries<PlaceholderField> getEntries() {
            return $ENTRIES;
        }

        /* compiled from: PlaceholderSpec.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) PlaceholderField.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer<PlaceholderField> serializer() {
                return get$cachedSerializer();
            }
        }

        private PlaceholderField(String str, int i) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return EnumsKt.createAnnotatedEnumSerializer("com.stripe.android.ui.core.elements.PlaceholderSpec.PlaceholderField", values(), new String[]{"name", "email", "phone", "billing_address", "billing_address_without_country", "sepa_mandate", "unknown"}, new Annotation[][]{null, null, null, null, null, null, null}, null);
        }

        static {
            PlaceholderField[] placeholderFieldArr$values = $values();
            $VALUES = placeholderFieldArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(placeholderFieldArr$values);
            INSTANCE = new Companion(null);
            $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.stripe.android.ui.core.elements.PlaceholderSpec$PlaceholderField$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PlaceholderSpec.PlaceholderField._init_$_anonymous_();
                }
            });
        }

        public static PlaceholderField valueOf(String str) {
            return (PlaceholderField) Enum.valueOf(PlaceholderField.class, str);
        }

        public static PlaceholderField[] values() {
            return (PlaceholderField[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaceholderSpec(IdentifierSpec apiPath, PlaceholderField field) {
        super(null);
        Intrinsics.checkNotNullParameter(apiPath, "apiPath");
        Intrinsics.checkNotNullParameter(field, "field");
        this.apiPath = apiPath;
        this.field = field;
    }
}
