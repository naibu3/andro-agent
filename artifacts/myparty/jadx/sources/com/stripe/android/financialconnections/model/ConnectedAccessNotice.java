package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.model.serializer.MarkdownToHtmlSerializer;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0002*+B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\tJ\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\tJ%\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0001¢\u0006\u0002\b)R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006,"}, d2 = {"Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;", "Landroid/os/Parcelable;", "subtitle", "", "body", "Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSubtitle$annotations", "()V", "getSubtitle", "()Ljava/lang/String;", "getBody$annotations", "getBody", "()Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class ConnectedAccessNotice implements Parcelable {
    private final DataAccessNoticeBody body;
    private final String subtitle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ConnectedAccessNotice> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: TextUpdate.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ConnectedAccessNotice> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConnectedAccessNotice createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConnectedAccessNotice(parcel.readString(), DataAccessNoticeBody.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConnectedAccessNotice[] newArray(int i) {
            return new ConnectedAccessNotice[i];
        }
    }

    public static /* synthetic */ ConnectedAccessNotice copy$default(ConnectedAccessNotice connectedAccessNotice, String str, DataAccessNoticeBody dataAccessNoticeBody, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectedAccessNotice.subtitle;
        }
        if ((i & 2) != 0) {
            dataAccessNoticeBody = connectedAccessNotice.body;
        }
        return connectedAccessNotice.copy(str, dataAccessNoticeBody);
    }

    @SerialName("body")
    public static /* synthetic */ void getBody$annotations() {
    }

    @SerialName("subtitle")
    @Serializable(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getSubtitle$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component2, reason: from getter */
    public final DataAccessNoticeBody getBody() {
        return this.body;
    }

    public final ConnectedAccessNotice copy(String subtitle, DataAccessNoticeBody body) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(body, "body");
        return new ConnectedAccessNotice(subtitle, body);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectedAccessNotice)) {
            return false;
        }
        ConnectedAccessNotice connectedAccessNotice = (ConnectedAccessNotice) other;
        return Intrinsics.areEqual(this.subtitle, connectedAccessNotice.subtitle) && Intrinsics.areEqual(this.body, connectedAccessNotice.body);
    }

    public int hashCode() {
        return (this.subtitle.hashCode() * 31) + this.body.hashCode();
    }

    public String toString() {
        return "ConnectedAccessNotice(subtitle=" + this.subtitle + ", body=" + this.body + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.subtitle);
        this.body.writeToParcel(dest, flags);
    }

    /* compiled from: TextUpdate.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ConnectedAccessNotice> serializer() {
            return ConnectedAccessNotice$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ConnectedAccessNotice(int i, String str, DataAccessNoticeBody dataAccessNoticeBody, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ConnectedAccessNotice$$serializer.INSTANCE.getDescriptor());
        }
        this.subtitle = str;
        this.body = dataAccessNoticeBody;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$financial_connections_release(ConnectedAccessNotice self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, MarkdownToHtmlSerializer.INSTANCE, self.subtitle);
        output.encodeSerializableElement(serialDesc, 1, DataAccessNoticeBody$$serializer.INSTANCE, self.body);
    }

    public ConnectedAccessNotice(String subtitle, DataAccessNoticeBody body) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(body, "body");
        this.subtitle = subtitle;
        this.body = body;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final DataAccessNoticeBody getBody() {
        return this.body;
    }
}
