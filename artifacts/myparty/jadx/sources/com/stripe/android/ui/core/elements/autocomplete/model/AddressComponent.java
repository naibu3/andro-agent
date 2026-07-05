package com.stripe.android.ui.core.elements.autocomplete.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.ui.core.elements.autocomplete.model.Place;
import java.util.List;
import kotlin.Metadata;
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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: Place.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002+,B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bB?\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J/\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00182\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\nHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J%\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0001¢\u0006\u0002\b*R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016¨\u0006-"}, d2 = {"Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;", "", "shortName", "", "longName", "types", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getShortName$annotations", "()V", "getShortName", "()Ljava/lang/String;", "getLongName$annotations", "getLongName", "getTypes$annotations", "getTypes", "()Ljava/util/List;", "contains", "", "type", "Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_ui_core_release", "$serializer", "Companion", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class AddressComponent {
    private final String longName;
    private final String shortName;
    private final List<String> types;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressComponent copy$default(AddressComponent addressComponent, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressComponent.shortName;
        }
        if ((i & 2) != 0) {
            str2 = addressComponent.longName;
        }
        if ((i & 4) != 0) {
            list = addressComponent.types;
        }
        return addressComponent.copy(str, str2, list);
    }

    @SerialName("long_name")
    public static /* synthetic */ void getLongName$annotations() {
    }

    @SerialName("short_name")
    public static /* synthetic */ void getShortName$annotations() {
    }

    @SerialName("types")
    public static /* synthetic */ void getTypes$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getShortName() {
        return this.shortName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLongName() {
        return this.longName;
    }

    public final List<String> component3() {
        return this.types;
    }

    public final AddressComponent copy(String shortName, String longName, List<String> types) {
        Intrinsics.checkNotNullParameter(longName, "longName");
        Intrinsics.checkNotNullParameter(types, "types");
        return new AddressComponent(shortName, longName, types);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressComponent)) {
            return false;
        }
        AddressComponent addressComponent = (AddressComponent) other;
        return Intrinsics.areEqual(this.shortName, addressComponent.shortName) && Intrinsics.areEqual(this.longName, addressComponent.longName) && Intrinsics.areEqual(this.types, addressComponent.types);
    }

    public int hashCode() {
        String str = this.shortName;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.longName.hashCode()) * 31) + this.types.hashCode();
    }

    public String toString() {
        return "AddressComponent(shortName=" + this.shortName + ", longName=" + this.longName + ", types=" + this.types + ")";
    }

    /* compiled from: Place.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddressComponent> serializer() {
            return AddressComponent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddressComponent(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, AddressComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.shortName = str;
        this.longName = str2;
        this.types = list;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_ui_core_release(AddressComponent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.shortName);
        output.encodeStringElement(serialDesc, 1, self.longName);
        output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.types);
    }

    public AddressComponent(String str, String longName, List<String> types) {
        Intrinsics.checkNotNullParameter(longName, "longName");
        Intrinsics.checkNotNullParameter(types, "types");
        this.shortName = str;
        this.longName = longName;
        this.types = types;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public final String getLongName() {
        return this.longName;
    }

    public final List<String> getTypes() {
        return this.types;
    }

    public final boolean contains(Place.Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.types.contains(type.getValue());
    }
}
