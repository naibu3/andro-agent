package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
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

/* compiled from: SynchronizeSessionResponse.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 /2\u00020\u0001:\u0002./B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tB;\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u000bJ\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u000bHÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000bJ%\u0010'\u001a\u00020#2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\b-R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017¨\u00060"}, d2 = {"Lcom/stripe/android/financialconnections/model/VisualUpdate;", "Landroid/os/Parcelable;", "reducedBranding", "", "reducedManualEntryProminenceInErrors", "merchantLogos", "", "", "<init>", "(ZZLjava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getReducedBranding$annotations", "()V", "getReducedBranding", "()Z", "getReducedManualEntryProminenceInErrors$annotations", "getReducedManualEntryProminenceInErrors", "getMerchantLogos$annotations", "getMerchantLogos", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "describeContents", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class VisualUpdate implements Parcelable {
    private final List<String> merchantLogos;
    private final boolean reducedBranding;
    private final boolean reducedManualEntryProminenceInErrors;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<VisualUpdate> CREATOR = new Creator();
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* compiled from: SynchronizeSessionResponse.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VisualUpdate> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VisualUpdate createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VisualUpdate(parcel.readInt() != 0, parcel.readInt() != 0, parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VisualUpdate[] newArray(int i) {
            return new VisualUpdate[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VisualUpdate copy$default(VisualUpdate visualUpdate, boolean z, boolean z2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = visualUpdate.reducedBranding;
        }
        if ((i & 2) != 0) {
            z2 = visualUpdate.reducedManualEntryProminenceInErrors;
        }
        if ((i & 4) != 0) {
            list = visualUpdate.merchantLogos;
        }
        return visualUpdate.copy(z, z2, list);
    }

    @SerialName("merchant_logo")
    public static /* synthetic */ void getMerchantLogos$annotations() {
    }

    @SerialName("reduced_branding")
    public static /* synthetic */ void getReducedBranding$annotations() {
    }

    @SerialName("reduce_manual_entry_prominence_in_errors")
    public static /* synthetic */ void getReducedManualEntryProminenceInErrors$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getReducedBranding() {
        return this.reducedBranding;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getReducedManualEntryProminenceInErrors() {
        return this.reducedManualEntryProminenceInErrors;
    }

    public final List<String> component3() {
        return this.merchantLogos;
    }

    public final VisualUpdate copy(boolean reducedBranding, boolean reducedManualEntryProminenceInErrors, List<String> merchantLogos) {
        Intrinsics.checkNotNullParameter(merchantLogos, "merchantLogos");
        return new VisualUpdate(reducedBranding, reducedManualEntryProminenceInErrors, merchantLogos);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VisualUpdate)) {
            return false;
        }
        VisualUpdate visualUpdate = (VisualUpdate) other;
        return this.reducedBranding == visualUpdate.reducedBranding && this.reducedManualEntryProminenceInErrors == visualUpdate.reducedManualEntryProminenceInErrors && Intrinsics.areEqual(this.merchantLogos, visualUpdate.merchantLogos);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.reducedBranding) * 31) + Boolean.hashCode(this.reducedManualEntryProminenceInErrors)) * 31) + this.merchantLogos.hashCode();
    }

    public String toString() {
        return "VisualUpdate(reducedBranding=" + this.reducedBranding + ", reducedManualEntryProminenceInErrors=" + this.reducedManualEntryProminenceInErrors + ", merchantLogos=" + this.merchantLogos + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.reducedBranding ? 1 : 0);
        dest.writeInt(this.reducedManualEntryProminenceInErrors ? 1 : 0);
        dest.writeStringList(this.merchantLogos);
    }

    /* compiled from: SynchronizeSessionResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/VisualUpdate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/VisualUpdate;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VisualUpdate> serializer() {
            return VisualUpdate$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VisualUpdate(int i, boolean z, boolean z2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, VisualUpdate$$serializer.INSTANCE.getDescriptor());
        }
        this.reducedBranding = z;
        this.reducedManualEntryProminenceInErrors = z2;
        this.merchantLogos = list;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$financial_connections_release(VisualUpdate self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeBooleanElement(serialDesc, 0, self.reducedBranding);
        output.encodeBooleanElement(serialDesc, 1, self.reducedManualEntryProminenceInErrors);
        output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.merchantLogos);
    }

    public VisualUpdate(boolean z, boolean z2, List<String> merchantLogos) {
        Intrinsics.checkNotNullParameter(merchantLogos, "merchantLogos");
        this.reducedBranding = z;
        this.reducedManualEntryProminenceInErrors = z2;
        this.merchantLogos = merchantLogos;
    }

    public final boolean getReducedBranding() {
        return this.reducedBranding;
    }

    public final boolean getReducedManualEntryProminenceInErrors() {
        return this.reducedManualEntryProminenceInErrors;
    }

    public final List<String> getMerchantLogos() {
        return this.merchantLogos;
    }
}
