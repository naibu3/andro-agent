package com.stripe.android.ui.core.elements;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.uicore.elements.DropdownFieldController;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.IdentifierSpec$$serializer;
import com.stripe.android.uicore.elements.SectionElement;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: DropdownSpec.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000267B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\u001e\u0010\u001a\u001a\u00020\u001b2\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001dJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0006\u0010#\u001a\u00020\fJ\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\fHÖ\u0001J\t\u0010)\u001a\u00020\u001eHÖ\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\fJ%\u0010/\u001a\u00020+2\u0006\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0001¢\u0006\u0002\b5R\u001c\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0019¨\u00068"}, d2 = {"Lcom/stripe/android/ui/core/elements/DropdownSpec;", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "apiPath", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "labelTranslationId", "Lcom/stripe/android/ui/core/elements/TranslationId;", AlertFragment.ARG_ITEMS, "", "Lcom/stripe/android/ui/core/elements/DropdownItemSpec;", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/TranslationId;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/TranslationId;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getApiPath$annotations", "()V", "getApiPath", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getLabelTranslationId$annotations", "getLabelTranslationId", "()Lcom/stripe/android/ui/core/elements/TranslationId;", "getItems$annotations", "getItems", "()Ljava/util/List;", ViewProps.TRANSFORM, "Lcom/stripe/android/uicore/elements/SectionElement;", NamedConstantsKt.INITIAL_VALUES, "", "", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_ui_core_release", "$serializer", "Companion", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class DropdownSpec extends FormItemSpec {
    private final IdentifierSpec apiPath;
    private final List<DropdownItemSpec> items;
    private final TranslationId labelTranslationId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<DropdownSpec> CREATOR = new Creator();
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, TranslationId.INSTANCE.serializer(), new ArrayListSerializer(DropdownItemSpec$$serializer.INSTANCE)};

    /* compiled from: DropdownSpec.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DropdownSpec> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DropdownSpec createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            IdentifierSpec identifierSpec = (IdentifierSpec) parcel.readParcelable(DropdownSpec.class.getClassLoader());
            TranslationId translationIdValueOf = TranslationId.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(DropdownItemSpec.CREATOR.createFromParcel(parcel));
            }
            return new DropdownSpec(identifierSpec, translationIdValueOf, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DropdownSpec[] newArray(int i) {
            return new DropdownSpec[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DropdownSpec copy$default(DropdownSpec dropdownSpec, IdentifierSpec identifierSpec, TranslationId translationId, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            identifierSpec = dropdownSpec.apiPath;
        }
        if ((i & 2) != 0) {
            translationId = dropdownSpec.labelTranslationId;
        }
        if ((i & 4) != 0) {
            list = dropdownSpec.items;
        }
        return dropdownSpec.copy(identifierSpec, translationId, list);
    }

    @SerialName("api_path")
    public static /* synthetic */ void getApiPath$annotations() {
    }

    @SerialName(AlertFragment.ARG_ITEMS)
    public static /* synthetic */ void getItems$annotations() {
    }

    @SerialName("translation_id")
    public static /* synthetic */ void getLabelTranslationId$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    /* renamed from: component2, reason: from getter */
    public final TranslationId getLabelTranslationId() {
        return this.labelTranslationId;
    }

    public final List<DropdownItemSpec> component3() {
        return this.items;
    }

    public final DropdownSpec copy(IdentifierSpec apiPath, TranslationId labelTranslationId, List<DropdownItemSpec> items) {
        Intrinsics.checkNotNullParameter(apiPath, "apiPath");
        Intrinsics.checkNotNullParameter(labelTranslationId, "labelTranslationId");
        Intrinsics.checkNotNullParameter(items, "items");
        return new DropdownSpec(apiPath, labelTranslationId, items);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DropdownSpec)) {
            return false;
        }
        DropdownSpec dropdownSpec = (DropdownSpec) other;
        return Intrinsics.areEqual(this.apiPath, dropdownSpec.apiPath) && this.labelTranslationId == dropdownSpec.labelTranslationId && Intrinsics.areEqual(this.items, dropdownSpec.items);
    }

    public int hashCode() {
        return (((this.apiPath.hashCode() * 31) + this.labelTranslationId.hashCode()) * 31) + this.items.hashCode();
    }

    public String toString() {
        return "DropdownSpec(apiPath=" + this.apiPath + ", labelTranslationId=" + this.labelTranslationId + ", items=" + this.items + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.apiPath, flags);
        dest.writeString(this.labelTranslationId.name());
        List<DropdownItemSpec> list = this.items;
        dest.writeInt(list.size());
        Iterator<DropdownItemSpec> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    /* compiled from: DropdownSpec.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/ui/core/elements/DropdownSpec$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/ui/core/elements/DropdownSpec;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DropdownSpec> serializer() {
            return DropdownSpec$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DropdownSpec(int i, IdentifierSpec identifierSpec, TranslationId translationId, List list, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, DropdownSpec$$serializer.INSTANCE.getDescriptor());
        }
        this.apiPath = identifierSpec;
        this.labelTranslationId = translationId;
        this.items = list;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_ui_core_release(DropdownSpec self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
        output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.labelTranslationId);
        output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.items);
    }

    @Override // com.stripe.android.ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public final TranslationId getLabelTranslationId() {
        return this.labelTranslationId;
    }

    public final List<DropdownItemSpec> getItems() {
        return this.items;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropdownSpec(IdentifierSpec apiPath, TranslationId labelTranslationId, List<DropdownItemSpec> items) {
        super(null);
        Intrinsics.checkNotNullParameter(apiPath, "apiPath");
        Intrinsics.checkNotNullParameter(labelTranslationId, "labelTranslationId");
        Intrinsics.checkNotNullParameter(items, "items");
        this.apiPath = apiPath;
        this.labelTranslationId = labelTranslationId;
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SectionElement transform$default(DropdownSpec dropdownSpec, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = MapsKt.emptyMap();
        }
        return dropdownSpec.transform(map);
    }

    public final SectionElement transform(Map<IdentifierSpec, String> initialValues) {
        Intrinsics.checkNotNullParameter(initialValues, "initialValues");
        return FormItemSpec.createSectionElement$payments_ui_core_release$default(this, new SimpleDropdownElement(getApiPath(), new DropdownFieldController(new SimpleDropdownConfig(ResolvableStringUtilsKt.resolvableString$default(this.labelTranslationId.getResourceId(), new Object[0], null, 4, null), this.items), initialValues.get(getApiPath()))), (ResolvableString) null, 2, (Object) null);
    }
}
