package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import defpackage.FinancialConnectionsGenericInfoScreen;
import defpackage.FinancialConnectionsGenericInfoScreen$$serializer;
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

/* compiled from: TextUpdate.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 ,2\u00020\u0001:\u0002+,B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\tJ\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\tJ%\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0001¢\u0006\u0002\b*R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006-"}, d2 = {"Lcom/stripe/android/financialconnections/model/IDConsentContentPane;", "Landroid/os/Parcelable;", "screen", "LFinancialConnectionsGenericInfoScreen;", "legalDetailsNotice", "Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;", "<init>", "(LFinancialConnectionsGenericInfoScreen;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILFinancialConnectionsGenericInfoScreen;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getScreen$annotations", "()V", "getScreen", "()LFinancialConnectionsGenericInfoScreen;", "getLegalDetailsNotice$annotations", "getLegalDetailsNotice", "()Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class IDConsentContentPane implements Parcelable {
    private final LegalDetailsNotice legalDetailsNotice;
    private final FinancialConnectionsGenericInfoScreen screen;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<IDConsentContentPane> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: TextUpdate.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IDConsentContentPane> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IDConsentContentPane createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IDConsentContentPane(FinancialConnectionsGenericInfoScreen.CREATOR.createFromParcel(parcel), LegalDetailsNotice.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IDConsentContentPane[] newArray(int i) {
            return new IDConsentContentPane[i];
        }
    }

    public static /* synthetic */ IDConsentContentPane copy$default(IDConsentContentPane iDConsentContentPane, FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen, LegalDetailsNotice legalDetailsNotice, int i, Object obj) {
        if ((i & 1) != 0) {
            financialConnectionsGenericInfoScreen = iDConsentContentPane.screen;
        }
        if ((i & 2) != 0) {
            legalDetailsNotice = iDConsentContentPane.legalDetailsNotice;
        }
        return iDConsentContentPane.copy(financialConnectionsGenericInfoScreen, legalDetailsNotice);
    }

    @SerialName("legal_details_notice")
    public static /* synthetic */ void getLegalDetailsNotice$annotations() {
    }

    @SerialName("screen")
    public static /* synthetic */ void getScreen$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final FinancialConnectionsGenericInfoScreen getScreen() {
        return this.screen;
    }

    /* renamed from: component2, reason: from getter */
    public final LegalDetailsNotice getLegalDetailsNotice() {
        return this.legalDetailsNotice;
    }

    public final IDConsentContentPane copy(FinancialConnectionsGenericInfoScreen screen, LegalDetailsNotice legalDetailsNotice) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(legalDetailsNotice, "legalDetailsNotice");
        return new IDConsentContentPane(screen, legalDetailsNotice);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IDConsentContentPane)) {
            return false;
        }
        IDConsentContentPane iDConsentContentPane = (IDConsentContentPane) other;
        return Intrinsics.areEqual(this.screen, iDConsentContentPane.screen) && Intrinsics.areEqual(this.legalDetailsNotice, iDConsentContentPane.legalDetailsNotice);
    }

    public int hashCode() {
        return (this.screen.hashCode() * 31) + this.legalDetailsNotice.hashCode();
    }

    public String toString() {
        return "IDConsentContentPane(screen=" + this.screen + ", legalDetailsNotice=" + this.legalDetailsNotice + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.screen.writeToParcel(dest, flags);
        this.legalDetailsNotice.writeToParcel(dest, flags);
    }

    /* compiled from: TextUpdate.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/IDConsentContentPane$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/IDConsentContentPane;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<IDConsentContentPane> serializer() {
            return IDConsentContentPane$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IDConsentContentPane(int i, FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen, LegalDetailsNotice legalDetailsNotice, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, IDConsentContentPane$$serializer.INSTANCE.getDescriptor());
        }
        this.screen = financialConnectionsGenericInfoScreen;
        this.legalDetailsNotice = legalDetailsNotice;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$financial_connections_release(IDConsentContentPane self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, FinancialConnectionsGenericInfoScreen$$serializer.INSTANCE, self.screen);
        output.encodeSerializableElement(serialDesc, 1, LegalDetailsNotice$$serializer.INSTANCE, self.legalDetailsNotice);
    }

    public IDConsentContentPane(FinancialConnectionsGenericInfoScreen screen, LegalDetailsNotice legalDetailsNotice) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(legalDetailsNotice, "legalDetailsNotice");
        this.screen = screen;
        this.legalDetailsNotice = legalDetailsNotice;
    }

    public final FinancialConnectionsGenericInfoScreen getScreen() {
        return this.screen;
    }

    public final LegalDetailsNotice getLegalDetailsNotice() {
        return this.legalDetailsNotice;
    }
}
