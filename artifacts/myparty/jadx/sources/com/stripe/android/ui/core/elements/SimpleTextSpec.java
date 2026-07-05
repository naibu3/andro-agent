package com.stripe.android.ui.core.elements;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.IdentifierSpec$$serializer;
import com.stripe.android.uicore.elements.SectionElement;
import com.stripe.android.uicore.elements.SimpleTextElement;
import com.stripe.android.uicore.elements.SimpleTextFieldConfig;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SimpleTextSpec.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002?@B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rBI\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0011J\u001e\u0010\"\u001a\u00020#2\u0016\b\u0002\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010&0%J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J;\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0006\u0010-\u001a\u00020\u0005J\u0013\u0010.\u001a\u00020\u000b2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020\u0005HÖ\u0001J\t\u00102\u001a\u00020&HÖ\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0005J%\u00108\u001a\u0002042\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0001¢\u0006\u0002\b>R\u001c\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010!¨\u0006A"}, d2 = {"Lcom/stripe/android/ui/core/elements/SimpleTextSpec;", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "apiPath", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "label", "", "capitalization", "Lcom/stripe/android/ui/core/elements/Capitalization;", "keyboardType", "Lcom/stripe/android/ui/core/elements/KeyboardType;", "showOptionalLabel", "", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;ILcom/stripe/android/ui/core/elements/Capitalization;Lcom/stripe/android/ui/core/elements/KeyboardType;Z)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/stripe/android/uicore/elements/IdentifierSpec;ILcom/stripe/android/ui/core/elements/Capitalization;Lcom/stripe/android/ui/core/elements/KeyboardType;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getApiPath$annotations", "()V", "getApiPath", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getLabel$annotations", "getLabel", "()I", "getCapitalization$annotations", "getCapitalization", "()Lcom/stripe/android/ui/core/elements/Capitalization;", "getKeyboardType$annotations", "getKeyboardType", "()Lcom/stripe/android/ui/core/elements/KeyboardType;", "getShowOptionalLabel$annotations", "getShowOptionalLabel", "()Z", ViewProps.TRANSFORM, "Lcom/stripe/android/uicore/elements/SectionElement;", NamedConstantsKt.INITIAL_VALUES, "", "", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_ui_core_release", "$serializer", "Companion", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class SimpleTextSpec extends FormItemSpec {
    private final IdentifierSpec apiPath;
    private final Capitalization capitalization;
    private final KeyboardType keyboardType;
    private final int label;
    private final boolean showOptionalLabel;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<SimpleTextSpec> CREATOR = new Creator();
    public static final int $stable = IdentifierSpec.$stable;
    private static final KSerializer<Object>[] $childSerializers = {null, null, Capitalization.INSTANCE.serializer(), KeyboardType.INSTANCE.serializer(), null};

    /* compiled from: SimpleTextSpec.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SimpleTextSpec> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleTextSpec createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SimpleTextSpec((IdentifierSpec) parcel.readParcelable(SimpleTextSpec.class.getClassLoader()), parcel.readInt(), Capitalization.valueOf(parcel.readString()), KeyboardType.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleTextSpec[] newArray(int i) {
            return new SimpleTextSpec[i];
        }
    }

    /* compiled from: SimpleTextSpec.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Capitalization.values().length];
            try {
                iArr[Capitalization.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Capitalization.Characters.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Capitalization.Words.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Capitalization.Sentences.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[KeyboardType.values().length];
            try {
                iArr2[KeyboardType.Text.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[KeyboardType.Ascii.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[KeyboardType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[KeyboardType.Phone.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[KeyboardType.Uri.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[KeyboardType.Email.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[KeyboardType.Password.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[KeyboardType.NumberPassword.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ SimpleTextSpec copy$default(SimpleTextSpec simpleTextSpec, IdentifierSpec identifierSpec, int i, Capitalization capitalization, KeyboardType keyboardType, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            identifierSpec = simpleTextSpec.apiPath;
        }
        if ((i2 & 2) != 0) {
            i = simpleTextSpec.label;
        }
        if ((i2 & 4) != 0) {
            capitalization = simpleTextSpec.capitalization;
        }
        if ((i2 & 8) != 0) {
            keyboardType = simpleTextSpec.keyboardType;
        }
        if ((i2 & 16) != 0) {
            z = simpleTextSpec.showOptionalLabel;
        }
        boolean z2 = z;
        Capitalization capitalization2 = capitalization;
        return simpleTextSpec.copy(identifierSpec, i, capitalization2, keyboardType, z2);
    }

    @SerialName("api_path")
    public static /* synthetic */ void getApiPath$annotations() {
    }

    @SerialName("capitalization")
    public static /* synthetic */ void getCapitalization$annotations() {
    }

    @SerialName("keyboard_type")
    public static /* synthetic */ void getKeyboardType$annotations() {
    }

    @SerialName("label")
    public static /* synthetic */ void getLabel$annotations() {
    }

    @SerialName("show_optional_label")
    public static /* synthetic */ void getShowOptionalLabel$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLabel() {
        return this.label;
    }

    /* renamed from: component3, reason: from getter */
    public final Capitalization getCapitalization() {
        return this.capitalization;
    }

    /* renamed from: component4, reason: from getter */
    public final KeyboardType getKeyboardType() {
        return this.keyboardType;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowOptionalLabel() {
        return this.showOptionalLabel;
    }

    public final SimpleTextSpec copy(IdentifierSpec apiPath, int label, Capitalization capitalization, KeyboardType keyboardType, boolean showOptionalLabel) {
        Intrinsics.checkNotNullParameter(apiPath, "apiPath");
        Intrinsics.checkNotNullParameter(capitalization, "capitalization");
        Intrinsics.checkNotNullParameter(keyboardType, "keyboardType");
        return new SimpleTextSpec(apiPath, label, capitalization, keyboardType, showOptionalLabel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimpleTextSpec)) {
            return false;
        }
        SimpleTextSpec simpleTextSpec = (SimpleTextSpec) other;
        return Intrinsics.areEqual(this.apiPath, simpleTextSpec.apiPath) && this.label == simpleTextSpec.label && this.capitalization == simpleTextSpec.capitalization && this.keyboardType == simpleTextSpec.keyboardType && this.showOptionalLabel == simpleTextSpec.showOptionalLabel;
    }

    public int hashCode() {
        return (((((((this.apiPath.hashCode() * 31) + Integer.hashCode(this.label)) * 31) + this.capitalization.hashCode()) * 31) + this.keyboardType.hashCode()) * 31) + Boolean.hashCode(this.showOptionalLabel);
    }

    public String toString() {
        return "SimpleTextSpec(apiPath=" + this.apiPath + ", label=" + this.label + ", capitalization=" + this.capitalization + ", keyboardType=" + this.keyboardType + ", showOptionalLabel=" + this.showOptionalLabel + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.apiPath, flags);
        dest.writeInt(this.label);
        dest.writeString(this.capitalization.name());
        dest.writeString(this.keyboardType.name());
        dest.writeInt(this.showOptionalLabel ? 1 : 0);
    }

    /* compiled from: SimpleTextSpec.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/ui/core/elements/SimpleTextSpec$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/ui/core/elements/SimpleTextSpec;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SimpleTextSpec> serializer() {
            return SimpleTextSpec$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SimpleTextSpec(int i, IdentifierSpec identifierSpec, int i2, Capitalization capitalization, KeyboardType keyboardType, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, SimpleTextSpec$$serializer.INSTANCE.getDescriptor());
        }
        this.apiPath = identifierSpec;
        this.label = i2;
        if ((i & 4) == 0) {
            this.capitalization = Capitalization.None;
        } else {
            this.capitalization = capitalization;
        }
        if ((i & 8) == 0) {
            this.keyboardType = KeyboardType.Ascii;
        } else {
            this.keyboardType = keyboardType;
        }
        if ((i & 16) == 0) {
            this.showOptionalLabel = false;
        } else {
            this.showOptionalLabel = z;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_ui_core_release(SimpleTextSpec self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
        output.encodeIntElement(serialDesc, 1, self.label);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.capitalization != Capitalization.None) {
            output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.capitalization);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.keyboardType != KeyboardType.Ascii) {
            output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.keyboardType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.showOptionalLabel) {
            output.encodeBooleanElement(serialDesc, 4, self.showOptionalLabel);
        }
    }

    @Override // com.stripe.android.ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public final int getLabel() {
        return this.label;
    }

    public final Capitalization getCapitalization() {
        return this.capitalization;
    }

    public /* synthetic */ SimpleTextSpec(IdentifierSpec identifierSpec, int i, Capitalization capitalization, KeyboardType keyboardType, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(identifierSpec, i, (i2 & 4) != 0 ? Capitalization.None : capitalization, (i2 & 8) != 0 ? KeyboardType.Ascii : keyboardType, (i2 & 16) != 0 ? false : z);
    }

    public final KeyboardType getKeyboardType() {
        return this.keyboardType;
    }

    public final boolean getShowOptionalLabel() {
        return this.showOptionalLabel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleTextSpec(IdentifierSpec apiPath, int i, Capitalization capitalization, KeyboardType keyboardType, boolean z) {
        super(null);
        Intrinsics.checkNotNullParameter(apiPath, "apiPath");
        Intrinsics.checkNotNullParameter(capitalization, "capitalization");
        Intrinsics.checkNotNullParameter(keyboardType, "keyboardType");
        this.apiPath = apiPath;
        this.label = i;
        this.capitalization = capitalization;
        this.keyboardType = keyboardType;
        this.showOptionalLabel = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SectionElement transform$default(SimpleTextSpec simpleTextSpec, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = MapsKt.emptyMap();
        }
        return simpleTextSpec.transform(map);
    }

    public final SectionElement transform(Map<IdentifierSpec, String> initialValues) {
        int iM5813getNoneIUNYP9k;
        int iM5841getTextPjHm6EE;
        Intrinsics.checkNotNullParameter(initialValues, "initialValues");
        SimpleTextSpec simpleTextSpec = this;
        IdentifierSpec apiPath = getApiPath();
        ResolvableString resolvableStringResolvableString$default = ResolvableStringUtilsKt.resolvableString$default(this.label, new Object[0], null, 4, null);
        int i = WhenMappings.$EnumSwitchMapping$0[this.capitalization.ordinal()];
        if (i == 1) {
            iM5813getNoneIUNYP9k = KeyboardCapitalization.INSTANCE.m5813getNoneIUNYP9k();
        } else if (i == 2) {
            iM5813getNoneIUNYP9k = KeyboardCapitalization.INSTANCE.m5812getCharactersIUNYP9k();
        } else if (i == 3) {
            iM5813getNoneIUNYP9k = KeyboardCapitalization.INSTANCE.m5816getWordsIUNYP9k();
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            iM5813getNoneIUNYP9k = KeyboardCapitalization.INSTANCE.m5814getSentencesIUNYP9k();
        }
        switch (WhenMappings.$EnumSwitchMapping$1[this.keyboardType.ordinal()]) {
            case 1:
                iM5841getTextPjHm6EE = androidx.compose.ui.text.input.KeyboardType.INSTANCE.m5841getTextPjHm6EE();
                break;
            case 2:
                iM5841getTextPjHm6EE = androidx.compose.ui.text.input.KeyboardType.INSTANCE.m5834getAsciiPjHm6EE();
                break;
            case 3:
                iM5841getTextPjHm6EE = androidx.compose.ui.text.input.KeyboardType.INSTANCE.m5837getNumberPjHm6EE();
                break;
            case 4:
                iM5841getTextPjHm6EE = androidx.compose.ui.text.input.KeyboardType.INSTANCE.m5840getPhonePjHm6EE();
                break;
            case 5:
                iM5841getTextPjHm6EE = androidx.compose.ui.text.input.KeyboardType.INSTANCE.m5843getUriPjHm6EE();
                break;
            case 6:
                iM5841getTextPjHm6EE = androidx.compose.ui.text.input.KeyboardType.INSTANCE.m5836getEmailPjHm6EE();
                break;
            case 7:
                iM5841getTextPjHm6EE = androidx.compose.ui.text.input.KeyboardType.INSTANCE.m5839getPasswordPjHm6EE();
                break;
            case 8:
                iM5841getTextPjHm6EE = androidx.compose.ui.text.input.KeyboardType.INSTANCE.m5838getNumberPasswordPjHm6EE();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        SimpleTextFieldConfig simpleTextFieldConfig = new SimpleTextFieldConfig(resolvableStringResolvableString$default, iM5813getNoneIUNYP9k, iM5841getTextPjHm6EE, null, 8, null);
        return FormItemSpec.createSectionElement$payments_ui_core_release$default(simpleTextSpec, new SimpleTextElement(apiPath, new SimpleTextFieldController(simpleTextFieldConfig, this.showOptionalLabel, initialValues.get(getApiPath()), null, 8, null)), (ResolvableString) null, 2, (Object) null);
    }
}
