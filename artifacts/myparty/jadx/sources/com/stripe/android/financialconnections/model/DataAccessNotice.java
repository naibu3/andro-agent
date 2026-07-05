package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
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
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 C2\u00020\u0001:\u0002BCBO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\r\u0010\u0013J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003JW\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0006\u0010/\u001a\u00020\u0010J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020\u0010HÖ\u0001J\t\u00105\u001a\u00020\u0005HÖ\u0001J\u0016\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0010J%\u0010;\u001a\u0002072\u0006\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0001¢\u0006\u0002\bAR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u001aR\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\"R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0015\u001a\u0004\b$\u0010\u001aR\u001c\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0015\u001a\u0004\b&\u0010\u001a¨\u0006D"}, d2 = {"Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "Landroid/os/Parcelable;", PaymentSheetAppearanceKeys.ICON, "Lcom/stripe/android/financialconnections/model/Image;", "title", "", "subtitle", "body", "Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;", "connectedAccountNotice", "Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;", "disclaimer", SDKConstants.PARAM_GAME_REQUESTS_CTA, "<init>", "(Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getIcon$annotations", "()V", "getIcon", "()Lcom/stripe/android/financialconnections/model/Image;", "getTitle$annotations", "getTitle", "()Ljava/lang/String;", "getSubtitle$annotations", "getSubtitle", "getBody$annotations", "getBody", "()Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;", "getConnectedAccountNotice$annotations", "getConnectedAccountNotice", "()Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;", "getDisclaimer$annotations", "getDisclaimer", "getCta$annotations", "getCta", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class DataAccessNotice implements Parcelable {
    private final DataAccessNoticeBody body;
    private final ConnectedAccessNotice connectedAccountNotice;
    private final String cta;
    private final String disclaimer;
    private final Image icon;
    private final String subtitle;
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<DataAccessNotice> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: TextUpdate.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DataAccessNotice> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DataAccessNotice createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DataAccessNotice(parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), DataAccessNoticeBody.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ConnectedAccessNotice.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DataAccessNotice[] newArray(int i) {
            return new DataAccessNotice[i];
        }
    }

    public static /* synthetic */ DataAccessNotice copy$default(DataAccessNotice dataAccessNotice, Image image, String str, String str2, DataAccessNoticeBody dataAccessNoticeBody, ConnectedAccessNotice connectedAccessNotice, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            image = dataAccessNotice.icon;
        }
        if ((i & 2) != 0) {
            str = dataAccessNotice.title;
        }
        if ((i & 4) != 0) {
            str2 = dataAccessNotice.subtitle;
        }
        if ((i & 8) != 0) {
            dataAccessNoticeBody = dataAccessNotice.body;
        }
        if ((i & 16) != 0) {
            connectedAccessNotice = dataAccessNotice.connectedAccountNotice;
        }
        if ((i & 32) != 0) {
            str3 = dataAccessNotice.disclaimer;
        }
        if ((i & 64) != 0) {
            str4 = dataAccessNotice.cta;
        }
        String str5 = str3;
        String str6 = str4;
        ConnectedAccessNotice connectedAccessNotice2 = connectedAccessNotice;
        String str7 = str2;
        return dataAccessNotice.copy(image, str, str7, dataAccessNoticeBody, connectedAccessNotice2, str5, str6);
    }

    @SerialName("body")
    public static /* synthetic */ void getBody$annotations() {
    }

    @SerialName("connected_account_notice")
    public static /* synthetic */ void getConnectedAccountNotice$annotations() {
    }

    @SerialName(SDKConstants.PARAM_GAME_REQUESTS_CTA)
    @Serializable(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getCta$annotations() {
    }

    @SerialName("disclaimer")
    @Serializable(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getDisclaimer$annotations() {
    }

    @SerialName(PaymentSheetAppearanceKeys.ICON)
    public static /* synthetic */ void getIcon$annotations() {
    }

    @SerialName("subtitle")
    @Serializable(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getSubtitle$annotations() {
    }

    @SerialName("title")
    @Serializable(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getTitle$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final Image getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final DataAccessNoticeBody getBody() {
        return this.body;
    }

    /* renamed from: component5, reason: from getter */
    public final ConnectedAccessNotice getConnectedAccountNotice() {
        return this.connectedAccountNotice;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    public final DataAccessNotice copy(Image icon, String title, String subtitle, DataAccessNoticeBody body, ConnectedAccessNotice connectedAccountNotice, String disclaimer, String cta) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(cta, "cta");
        return new DataAccessNotice(icon, title, subtitle, body, connectedAccountNotice, disclaimer, cta);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataAccessNotice)) {
            return false;
        }
        DataAccessNotice dataAccessNotice = (DataAccessNotice) other;
        return Intrinsics.areEqual(this.icon, dataAccessNotice.icon) && Intrinsics.areEqual(this.title, dataAccessNotice.title) && Intrinsics.areEqual(this.subtitle, dataAccessNotice.subtitle) && Intrinsics.areEqual(this.body, dataAccessNotice.body) && Intrinsics.areEqual(this.connectedAccountNotice, dataAccessNotice.connectedAccountNotice) && Intrinsics.areEqual(this.disclaimer, dataAccessNotice.disclaimer) && Intrinsics.areEqual(this.cta, dataAccessNotice.cta);
    }

    public int hashCode() {
        Image image = this.icon;
        int iHashCode = (((image == null ? 0 : image.hashCode()) * 31) + this.title.hashCode()) * 31;
        String str = this.subtitle;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.body.hashCode()) * 31;
        ConnectedAccessNotice connectedAccessNotice = this.connectedAccountNotice;
        int iHashCode3 = (iHashCode2 + (connectedAccessNotice == null ? 0 : connectedAccessNotice.hashCode())) * 31;
        String str2 = this.disclaimer;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.cta.hashCode();
    }

    public String toString() {
        return "DataAccessNotice(icon=" + this.icon + ", title=" + this.title + ", subtitle=" + this.subtitle + ", body=" + this.body + ", connectedAccountNotice=" + this.connectedAccountNotice + ", disclaimer=" + this.disclaimer + ", cta=" + this.cta + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Image image = this.icon;
        if (image == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            image.writeToParcel(dest, flags);
        }
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        this.body.writeToParcel(dest, flags);
        ConnectedAccessNotice connectedAccessNotice = this.connectedAccountNotice;
        if (connectedAccessNotice == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            connectedAccessNotice.writeToParcel(dest, flags);
        }
        dest.writeString(this.disclaimer);
        dest.writeString(this.cta);
    }

    /* compiled from: TextUpdate.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/DataAccessNotice$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DataAccessNotice> serializer() {
            return DataAccessNotice$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DataAccessNotice(int i, Image image, String str, String str2, DataAccessNoticeBody dataAccessNoticeBody, ConnectedAccessNotice connectedAccessNotice, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (74 != (i & 74)) {
            PluginExceptionsKt.throwMissingFieldException(i, 74, DataAccessNotice$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.icon = null;
        } else {
            this.icon = image;
        }
        this.title = str;
        if ((i & 4) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str2;
        }
        this.body = dataAccessNoticeBody;
        if ((i & 16) == 0) {
            this.connectedAccountNotice = null;
        } else {
            this.connectedAccountNotice = connectedAccessNotice;
        }
        if ((i & 32) == 0) {
            this.disclaimer = null;
        } else {
            this.disclaimer = str3;
        }
        this.cta = str4;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$financial_connections_release(DataAccessNotice self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, Image$$serializer.INSTANCE, self.icon);
        }
        output.encodeSerializableElement(serialDesc, 1, MarkdownToHtmlSerializer.INSTANCE, self.title);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, MarkdownToHtmlSerializer.INSTANCE, self.subtitle);
        }
        output.encodeSerializableElement(serialDesc, 3, DataAccessNoticeBody$$serializer.INSTANCE, self.body);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.connectedAccountNotice != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, ConnectedAccessNotice$$serializer.INSTANCE, self.connectedAccountNotice);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.disclaimer != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, MarkdownToHtmlSerializer.INSTANCE, self.disclaimer);
        }
        output.encodeSerializableElement(serialDesc, 6, MarkdownToHtmlSerializer.INSTANCE, self.cta);
    }

    public DataAccessNotice(Image image, String title, String str, DataAccessNoticeBody body, ConnectedAccessNotice connectedAccessNotice, String str2, String cta) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(cta, "cta");
        this.icon = image;
        this.title = title;
        this.subtitle = str;
        this.body = body;
        this.connectedAccountNotice = connectedAccessNotice;
        this.disclaimer = str2;
        this.cta = cta;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DataAccessNotice(Image image, String str, String str2, DataAccessNoticeBody dataAccessNoticeBody, ConnectedAccessNotice connectedAccessNotice, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        String str6;
        image = (i & 1) != 0 ? null : image;
        str2 = (i & 4) != 0 ? null : str2;
        connectedAccessNotice = (i & 16) != 0 ? null : connectedAccessNotice;
        if ((i & 32) != 0) {
            str5 = str4;
            str6 = null;
        } else {
            str5 = str4;
            str6 = str3;
        }
        this(image, str, str2, dataAccessNoticeBody, connectedAccessNotice, str6, str5);
    }

    public final Image getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final DataAccessNoticeBody getBody() {
        return this.body;
    }

    public final ConnectedAccessNotice getConnectedAccountNotice() {
        return this.connectedAccountNotice;
    }

    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final String getCta() {
        return this.cta;
    }
}
