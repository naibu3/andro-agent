package com.stripe.android.financialconnections.model;

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

/* compiled from: SynchronizeSessionResponse.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 22\u00020\u0001:\u000212B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J)\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u000bJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u000bHÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u000bJ%\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0001¢\u0006\u0002\b0R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018¨\u00063"}, d2 = {"Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "Landroid/os/Parcelable;", "manifest", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "text", "Lcom/stripe/android/financialconnections/model/TextUpdate;", "visual", "Lcom/stripe/android/financialconnections/model/VisualUpdate;", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/model/TextUpdate;Lcom/stripe/android/financialconnections/model/VisualUpdate;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/model/TextUpdate;Lcom/stripe/android/financialconnections/model/VisualUpdate;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getManifest$annotations", "()V", "getManifest", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "getText$annotations", "getText", "()Lcom/stripe/android/financialconnections/model/TextUpdate;", "getVisual$annotations", "getVisual", "()Lcom/stripe/android/financialconnections/model/VisualUpdate;", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class SynchronizeSessionResponse implements Parcelable {
    private final FinancialConnectionsSessionManifest manifest;
    private final TextUpdate text;
    private final VisualUpdate visual;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<SynchronizeSessionResponse> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: SynchronizeSessionResponse.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SynchronizeSessionResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SynchronizeSessionResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SynchronizeSessionResponse(FinancialConnectionsSessionManifest.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TextUpdate.CREATOR.createFromParcel(parcel), VisualUpdate.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SynchronizeSessionResponse[] newArray(int i) {
            return new SynchronizeSessionResponse[i];
        }
    }

    public static /* synthetic */ SynchronizeSessionResponse copy$default(SynchronizeSessionResponse synchronizeSessionResponse, FinancialConnectionsSessionManifest financialConnectionsSessionManifest, TextUpdate textUpdate, VisualUpdate visualUpdate, int i, Object obj) {
        if ((i & 1) != 0) {
            financialConnectionsSessionManifest = synchronizeSessionResponse.manifest;
        }
        if ((i & 2) != 0) {
            textUpdate = synchronizeSessionResponse.text;
        }
        if ((i & 4) != 0) {
            visualUpdate = synchronizeSessionResponse.visual;
        }
        return synchronizeSessionResponse.copy(financialConnectionsSessionManifest, textUpdate, visualUpdate);
    }

    @SerialName("manifest")
    public static /* synthetic */ void getManifest$annotations() {
    }

    @SerialName("text")
    public static /* synthetic */ void getText$annotations() {
    }

    @SerialName("visual")
    public static /* synthetic */ void getVisual$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final FinancialConnectionsSessionManifest getManifest() {
        return this.manifest;
    }

    /* renamed from: component2, reason: from getter */
    public final TextUpdate getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final VisualUpdate getVisual() {
        return this.visual;
    }

    public final SynchronizeSessionResponse copy(FinancialConnectionsSessionManifest manifest, TextUpdate text, VisualUpdate visual) {
        Intrinsics.checkNotNullParameter(manifest, "manifest");
        Intrinsics.checkNotNullParameter(visual, "visual");
        return new SynchronizeSessionResponse(manifest, text, visual);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SynchronizeSessionResponse)) {
            return false;
        }
        SynchronizeSessionResponse synchronizeSessionResponse = (SynchronizeSessionResponse) other;
        return Intrinsics.areEqual(this.manifest, synchronizeSessionResponse.manifest) && Intrinsics.areEqual(this.text, synchronizeSessionResponse.text) && Intrinsics.areEqual(this.visual, synchronizeSessionResponse.visual);
    }

    public int hashCode() {
        int iHashCode = this.manifest.hashCode() * 31;
        TextUpdate textUpdate = this.text;
        return ((iHashCode + (textUpdate == null ? 0 : textUpdate.hashCode())) * 31) + this.visual.hashCode();
    }

    public String toString() {
        return "SynchronizeSessionResponse(manifest=" + this.manifest + ", text=" + this.text + ", visual=" + this.visual + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.manifest.writeToParcel(dest, flags);
        TextUpdate textUpdate = this.text;
        if (textUpdate == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            textUpdate.writeToParcel(dest, flags);
        }
        this.visual.writeToParcel(dest, flags);
    }

    /* compiled from: SynchronizeSessionResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SynchronizeSessionResponse> serializer() {
            return SynchronizeSessionResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SynchronizeSessionResponse(int i, FinancialConnectionsSessionManifest financialConnectionsSessionManifest, TextUpdate textUpdate, VisualUpdate visualUpdate, SerializationConstructorMarker serializationConstructorMarker) {
        if (5 != (i & 5)) {
            PluginExceptionsKt.throwMissingFieldException(i, 5, SynchronizeSessionResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.manifest = financialConnectionsSessionManifest;
        if ((i & 2) == 0) {
            this.text = null;
        } else {
            this.text = textUpdate;
        }
        this.visual = visualUpdate;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$financial_connections_release(SynchronizeSessionResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, FinancialConnectionsSessionManifest$$serializer.INSTANCE, self.manifest);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.text != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, TextUpdate$$serializer.INSTANCE, self.text);
        }
        output.encodeSerializableElement(serialDesc, 2, VisualUpdate$$serializer.INSTANCE, self.visual);
    }

    public SynchronizeSessionResponse(FinancialConnectionsSessionManifest manifest, TextUpdate textUpdate, VisualUpdate visual) {
        Intrinsics.checkNotNullParameter(manifest, "manifest");
        Intrinsics.checkNotNullParameter(visual, "visual");
        this.manifest = manifest;
        this.text = textUpdate;
        this.visual = visual;
    }

    public /* synthetic */ SynchronizeSessionResponse(FinancialConnectionsSessionManifest financialConnectionsSessionManifest, TextUpdate textUpdate, VisualUpdate visualUpdate, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(financialConnectionsSessionManifest, (i & 2) != 0 ? null : textUpdate, visualUpdate);
    }

    public final FinancialConnectionsSessionManifest getManifest() {
        return this.manifest;
    }

    public final TextUpdate getText() {
        return this.text;
    }

    public final VisualUpdate getVisual() {
        return this.visual;
    }
}
