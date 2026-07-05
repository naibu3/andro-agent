package com.stripe.android.ui.core.elements;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: DropdownItemSpec.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002()B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\bJ\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\bJ%\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b'R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006*"}, d2 = {"Lcom/stripe/android/ui/core/elements/DropdownItemSpec;", "Landroid/os/Parcelable;", "apiValue", "", "displayText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getApiValue$annotations", "()V", "getApiValue", "()Ljava/lang/String;", "getDisplayText$annotations", "getDisplayText", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_ui_core_release", "$serializer", "Companion", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class DropdownItemSpec implements Parcelable {
    private final String apiValue;
    private final String displayText;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<DropdownItemSpec> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: DropdownItemSpec.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DropdownItemSpec> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DropdownItemSpec createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DropdownItemSpec(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DropdownItemSpec[] newArray(int i) {
            return new DropdownItemSpec[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DropdownItemSpec() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ DropdownItemSpec copy$default(DropdownItemSpec dropdownItemSpec, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dropdownItemSpec.apiValue;
        }
        if ((i & 2) != 0) {
            str2 = dropdownItemSpec.displayText;
        }
        return dropdownItemSpec.copy(str, str2);
    }

    @SerialName("api_value")
    public static /* synthetic */ void getApiValue$annotations() {
    }

    @SerialName("display_text")
    public static /* synthetic */ void getDisplayText$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getApiValue() {
        return this.apiValue;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDisplayText() {
        return this.displayText;
    }

    public final DropdownItemSpec copy(String apiValue, String displayText) {
        Intrinsics.checkNotNullParameter(displayText, "displayText");
        return new DropdownItemSpec(apiValue, displayText);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DropdownItemSpec)) {
            return false;
        }
        DropdownItemSpec dropdownItemSpec = (DropdownItemSpec) other;
        return Intrinsics.areEqual(this.apiValue, dropdownItemSpec.apiValue) && Intrinsics.areEqual(this.displayText, dropdownItemSpec.displayText);
    }

    public int hashCode() {
        String str = this.apiValue;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.displayText.hashCode();
    }

    public String toString() {
        return "DropdownItemSpec(apiValue=" + this.apiValue + ", displayText=" + this.displayText + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.apiValue);
        dest.writeString(this.displayText);
    }

    /* compiled from: DropdownItemSpec.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/ui/core/elements/DropdownItemSpec$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/ui/core/elements/DropdownItemSpec;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DropdownItemSpec> serializer() {
            return DropdownItemSpec$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DropdownItemSpec(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.apiValue = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.displayText = "Other";
        } else {
            this.displayText = str2;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_ui_core_release(DropdownItemSpec self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.apiValue != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.apiValue);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && Intrinsics.areEqual(self.displayText, "Other")) {
            return;
        }
        output.encodeStringElement(serialDesc, 1, self.displayText);
    }

    public DropdownItemSpec(String str, String displayText) {
        Intrinsics.checkNotNullParameter(displayText, "displayText");
        this.apiValue = str;
        this.displayText = displayText;
    }

    public final String getApiValue() {
        return this.apiValue;
    }

    public final String getDisplayText() {
        return this.displayText;
    }

    public /* synthetic */ DropdownItemSpec(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "Other" : str2);
    }
}
