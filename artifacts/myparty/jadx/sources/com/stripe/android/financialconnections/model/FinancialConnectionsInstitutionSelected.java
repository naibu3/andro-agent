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

/* compiled from: FinancialConnectionsInstitutionSelected.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 ,2\u00020\u0001:\u0002+,B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\tJ\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\tJ%\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0001¢\u0006\u0002\b*R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006-"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitutionSelected;", "Landroid/os/Parcelable;", "manifest", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "text", "Lcom/stripe/android/financialconnections/model/TextUpdate;", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/model/TextUpdate;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/model/TextUpdate;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getManifest$annotations", "()V", "getManifest", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "getText$annotations", "getText", "()Lcom/stripe/android/financialconnections/model/TextUpdate;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class FinancialConnectionsInstitutionSelected implements Parcelable {
    private final FinancialConnectionsSessionManifest manifest;
    private final TextUpdate text;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<FinancialConnectionsInstitutionSelected> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: FinancialConnectionsInstitutionSelected.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FinancialConnectionsInstitutionSelected> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsInstitutionSelected createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FinancialConnectionsInstitutionSelected(FinancialConnectionsSessionManifest.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TextUpdate.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsInstitutionSelected[] newArray(int i) {
            return new FinancialConnectionsInstitutionSelected[i];
        }
    }

    public static /* synthetic */ FinancialConnectionsInstitutionSelected copy$default(FinancialConnectionsInstitutionSelected financialConnectionsInstitutionSelected, FinancialConnectionsSessionManifest financialConnectionsSessionManifest, TextUpdate textUpdate, int i, Object obj) {
        if ((i & 1) != 0) {
            financialConnectionsSessionManifest = financialConnectionsInstitutionSelected.manifest;
        }
        if ((i & 2) != 0) {
            textUpdate = financialConnectionsInstitutionSelected.text;
        }
        return financialConnectionsInstitutionSelected.copy(financialConnectionsSessionManifest, textUpdate);
    }

    @SerialName("manifest")
    public static /* synthetic */ void getManifest$annotations() {
    }

    @SerialName("text")
    public static /* synthetic */ void getText$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final FinancialConnectionsSessionManifest getManifest() {
        return this.manifest;
    }

    /* renamed from: component2, reason: from getter */
    public final TextUpdate getText() {
        return this.text;
    }

    public final FinancialConnectionsInstitutionSelected copy(FinancialConnectionsSessionManifest manifest, TextUpdate text) {
        Intrinsics.checkNotNullParameter(manifest, "manifest");
        return new FinancialConnectionsInstitutionSelected(manifest, text);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinancialConnectionsInstitutionSelected)) {
            return false;
        }
        FinancialConnectionsInstitutionSelected financialConnectionsInstitutionSelected = (FinancialConnectionsInstitutionSelected) other;
        return Intrinsics.areEqual(this.manifest, financialConnectionsInstitutionSelected.manifest) && Intrinsics.areEqual(this.text, financialConnectionsInstitutionSelected.text);
    }

    public int hashCode() {
        int iHashCode = this.manifest.hashCode() * 31;
        TextUpdate textUpdate = this.text;
        return iHashCode + (textUpdate == null ? 0 : textUpdate.hashCode());
    }

    public String toString() {
        return "FinancialConnectionsInstitutionSelected(manifest=" + this.manifest + ", text=" + this.text + ")";
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
    }

    /* compiled from: FinancialConnectionsInstitutionSelected.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitutionSelected$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitutionSelected;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FinancialConnectionsInstitutionSelected> serializer() {
            return FinancialConnectionsInstitutionSelected$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FinancialConnectionsInstitutionSelected(int i, FinancialConnectionsSessionManifest financialConnectionsSessionManifest, TextUpdate textUpdate, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, FinancialConnectionsInstitutionSelected$$serializer.INSTANCE.getDescriptor());
        }
        this.manifest = financialConnectionsSessionManifest;
        if ((i & 2) == 0) {
            this.text = null;
        } else {
            this.text = textUpdate;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$financial_connections_release(FinancialConnectionsInstitutionSelected self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, FinancialConnectionsSessionManifest$$serializer.INSTANCE, self.manifest);
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.text == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, TextUpdate$$serializer.INSTANCE, self.text);
    }

    public FinancialConnectionsInstitutionSelected(FinancialConnectionsSessionManifest manifest, TextUpdate textUpdate) {
        Intrinsics.checkNotNullParameter(manifest, "manifest");
        this.manifest = manifest;
        this.text = textUpdate;
    }

    public /* synthetic */ FinancialConnectionsInstitutionSelected(FinancialConnectionsSessionManifest financialConnectionsSessionManifest, TextUpdate textUpdate, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(financialConnectionsSessionManifest, (i & 2) != 0 ? null : textUpdate);
    }

    public final FinancialConnectionsSessionManifest getManifest() {
        return this.manifest;
    }

    public final TextUpdate getText() {
        return this.text;
    }
}
