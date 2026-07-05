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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: ExternalPaymentMethodSpec.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000201B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001d\u001a\u00020\nJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\nHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\nJ%\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0001¢\u0006\u0002\b/R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011¨\u00062"}, d2 = {"Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;", "Landroid/os/Parcelable;", "type", "", "label", "lightImageUrl", "darkImageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getType$annotations", "()V", "getType", "()Ljava/lang/String;", "getLabel$annotations", "getLabel", "getLightImageUrl$annotations", "getLightImageUrl", "getDarkImageUrl$annotations", "getDarkImageUrl", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_ui_core_release", "$serializer", "Companion", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class ExternalPaymentMethodSpec implements Parcelable {
    private final String darkImageUrl;
    private final String label;
    private final String lightImageUrl;
    private final String type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ExternalPaymentMethodSpec> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: ExternalPaymentMethodSpec.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExternalPaymentMethodSpec> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExternalPaymentMethodSpec createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExternalPaymentMethodSpec(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExternalPaymentMethodSpec[] newArray(int i) {
            return new ExternalPaymentMethodSpec[i];
        }
    }

    public static /* synthetic */ ExternalPaymentMethodSpec copy$default(ExternalPaymentMethodSpec externalPaymentMethodSpec, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = externalPaymentMethodSpec.type;
        }
        if ((i & 2) != 0) {
            str2 = externalPaymentMethodSpec.label;
        }
        if ((i & 4) != 0) {
            str3 = externalPaymentMethodSpec.lightImageUrl;
        }
        if ((i & 8) != 0) {
            str4 = externalPaymentMethodSpec.darkImageUrl;
        }
        return externalPaymentMethodSpec.copy(str, str2, str3, str4);
    }

    @SerialName("dark_image_url")
    public static /* synthetic */ void getDarkImageUrl$annotations() {
    }

    @SerialName("label")
    public static /* synthetic */ void getLabel$annotations() {
    }

    @SerialName("light_image_url")
    public static /* synthetic */ void getLightImageUrl$annotations() {
    }

    @SerialName("type")
    public static /* synthetic */ void getType$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLightImageUrl() {
        return this.lightImageUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDarkImageUrl() {
        return this.darkImageUrl;
    }

    public final ExternalPaymentMethodSpec copy(String type, String label, String lightImageUrl, String darkImageUrl) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(lightImageUrl, "lightImageUrl");
        return new ExternalPaymentMethodSpec(type, label, lightImageUrl, darkImageUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalPaymentMethodSpec)) {
            return false;
        }
        ExternalPaymentMethodSpec externalPaymentMethodSpec = (ExternalPaymentMethodSpec) other;
        return Intrinsics.areEqual(this.type, externalPaymentMethodSpec.type) && Intrinsics.areEqual(this.label, externalPaymentMethodSpec.label) && Intrinsics.areEqual(this.lightImageUrl, externalPaymentMethodSpec.lightImageUrl) && Intrinsics.areEqual(this.darkImageUrl, externalPaymentMethodSpec.darkImageUrl);
    }

    public int hashCode() {
        int iHashCode = ((((this.type.hashCode() * 31) + this.label.hashCode()) * 31) + this.lightImageUrl.hashCode()) * 31;
        String str = this.darkImageUrl;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ExternalPaymentMethodSpec(type=" + this.type + ", label=" + this.label + ", lightImageUrl=" + this.lightImageUrl + ", darkImageUrl=" + this.darkImageUrl + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.type);
        dest.writeString(this.label);
        dest.writeString(this.lightImageUrl);
        dest.writeString(this.darkImageUrl);
    }

    /* compiled from: ExternalPaymentMethodSpec.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ExternalPaymentMethodSpec> serializer() {
            return ExternalPaymentMethodSpec$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ExternalPaymentMethodSpec(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, ExternalPaymentMethodSpec$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.label = str2;
        this.lightImageUrl = str3;
        if ((i & 8) == 0) {
            this.darkImageUrl = null;
        } else {
            this.darkImageUrl = str4;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_ui_core_release(ExternalPaymentMethodSpec self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.type);
        output.encodeStringElement(serialDesc, 1, self.label);
        output.encodeStringElement(serialDesc, 2, self.lightImageUrl);
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.darkImageUrl == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.darkImageUrl);
    }

    public ExternalPaymentMethodSpec(String type, String label, String lightImageUrl, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(lightImageUrl, "lightImageUrl");
        this.type = type;
        this.label = label;
        this.lightImageUrl = lightImageUrl;
        this.darkImageUrl = str;
    }

    public /* synthetic */ ExternalPaymentMethodSpec(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4);
    }

    public final String getType() {
        return this.type;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getLightImageUrl() {
        return this.lightImageUrl;
    }

    public final String getDarkImageUrl() {
        return this.darkImageUrl;
    }
}
