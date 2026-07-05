package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
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
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 G2\u00020\u0001:\u0002FGBK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Ba\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000f\u0010\u0015J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u00100\u001a\u00020\rHÆ\u0003J\t\u00101\u001a\u00020\rHÆ\u0003JU\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001J\u0006\u00103\u001a\u00020\u0012J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u00020\u0012HÖ\u0001J\t\u00109\u001a\u00020\rHÖ\u0001J\u0016\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u0012J%\u0010?\u001a\u00020;2\u0006\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0001¢\u0006\u0002\bER\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\"R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010%R\u001c\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010(R\u001c\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u0017\u001a\u0004\b*\u0010(¨\u0006H"}, d2 = {"Lcom/stripe/android/financialconnections/model/OauthPrepane;", "Landroid/os/Parcelable;", "body", "Lcom/stripe/android/financialconnections/model/Body;", SDKConstants.PARAM_GAME_REQUESTS_CTA, "Lcom/stripe/android/financialconnections/model/Cta;", "institutionIcon", "Lcom/stripe/android/financialconnections/model/Image;", "partnerNotice", "Lcom/stripe/android/financialconnections/model/PartnerNotice;", "dataAccessNotice", "Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "title", "", "subtitle", "<init>", "(Lcom/stripe/android/financialconnections/model/Body;Lcom/stripe/android/financialconnections/model/Cta;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/PartnerNotice;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/stripe/android/financialconnections/model/Body;Lcom/stripe/android/financialconnections/model/Cta;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/PartnerNotice;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getBody$annotations", "()V", "getBody", "()Lcom/stripe/android/financialconnections/model/Body;", "getCta$annotations", "getCta", "()Lcom/stripe/android/financialconnections/model/Cta;", "getInstitutionIcon$annotations", "getInstitutionIcon", "()Lcom/stripe/android/financialconnections/model/Image;", "getPartnerNotice$annotations", "getPartnerNotice", "()Lcom/stripe/android/financialconnections/model/PartnerNotice;", "getDataAccessNotice$annotations", "getDataAccessNotice", "()Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "getTitle$annotations", "getTitle", "()Ljava/lang/String;", "getSubtitle$annotations", "getSubtitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class OauthPrepane implements Parcelable {
    private final Body body;
    private final Cta cta;
    private final DataAccessNotice dataAccessNotice;
    private final Image institutionIcon;
    private final PartnerNotice partnerNotice;
    private final String subtitle;
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<OauthPrepane> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: TextUpdate.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OauthPrepane> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OauthPrepane createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OauthPrepane(Body.CREATOR.createFromParcel(parcel), Cta.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PartnerNotice.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DataAccessNotice.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OauthPrepane[] newArray(int i) {
            return new OauthPrepane[i];
        }
    }

    public static /* synthetic */ OauthPrepane copy$default(OauthPrepane oauthPrepane, Body body, Cta cta, Image image, PartnerNotice partnerNotice, DataAccessNotice dataAccessNotice, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            body = oauthPrepane.body;
        }
        if ((i & 2) != 0) {
            cta = oauthPrepane.cta;
        }
        if ((i & 4) != 0) {
            image = oauthPrepane.institutionIcon;
        }
        if ((i & 8) != 0) {
            partnerNotice = oauthPrepane.partnerNotice;
        }
        if ((i & 16) != 0) {
            dataAccessNotice = oauthPrepane.dataAccessNotice;
        }
        if ((i & 32) != 0) {
            str = oauthPrepane.title;
        }
        if ((i & 64) != 0) {
            str2 = oauthPrepane.subtitle;
        }
        String str3 = str;
        String str4 = str2;
        DataAccessNotice dataAccessNotice2 = dataAccessNotice;
        Image image2 = image;
        return oauthPrepane.copy(body, cta, image2, partnerNotice, dataAccessNotice2, str3, str4);
    }

    @SerialName("body")
    public static /* synthetic */ void getBody$annotations() {
    }

    @SerialName(SDKConstants.PARAM_GAME_REQUESTS_CTA)
    public static /* synthetic */ void getCta$annotations() {
    }

    @SerialName("data_access_notice")
    public static /* synthetic */ void getDataAccessNotice$annotations() {
    }

    @SerialName("institution_icon")
    public static /* synthetic */ void getInstitutionIcon$annotations() {
    }

    @SerialName("partner_notice")
    public static /* synthetic */ void getPartnerNotice$annotations() {
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
    public final Body getBody() {
        return this.body;
    }

    /* renamed from: component2, reason: from getter */
    public final Cta getCta() {
        return this.cta;
    }

    /* renamed from: component3, reason: from getter */
    public final Image getInstitutionIcon() {
        return this.institutionIcon;
    }

    /* renamed from: component4, reason: from getter */
    public final PartnerNotice getPartnerNotice() {
        return this.partnerNotice;
    }

    /* renamed from: component5, reason: from getter */
    public final DataAccessNotice getDataAccessNotice() {
        return this.dataAccessNotice;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final OauthPrepane copy(Body body, Cta cta, Image institutionIcon, PartnerNotice partnerNotice, DataAccessNotice dataAccessNotice, String title, String subtitle) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(cta, "cta");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return new OauthPrepane(body, cta, institutionIcon, partnerNotice, dataAccessNotice, title, subtitle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OauthPrepane)) {
            return false;
        }
        OauthPrepane oauthPrepane = (OauthPrepane) other;
        return Intrinsics.areEqual(this.body, oauthPrepane.body) && Intrinsics.areEqual(this.cta, oauthPrepane.cta) && Intrinsics.areEqual(this.institutionIcon, oauthPrepane.institutionIcon) && Intrinsics.areEqual(this.partnerNotice, oauthPrepane.partnerNotice) && Intrinsics.areEqual(this.dataAccessNotice, oauthPrepane.dataAccessNotice) && Intrinsics.areEqual(this.title, oauthPrepane.title) && Intrinsics.areEqual(this.subtitle, oauthPrepane.subtitle);
    }

    public int hashCode() {
        int iHashCode = ((this.body.hashCode() * 31) + this.cta.hashCode()) * 31;
        Image image = this.institutionIcon;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        PartnerNotice partnerNotice = this.partnerNotice;
        int iHashCode3 = (iHashCode2 + (partnerNotice == null ? 0 : partnerNotice.hashCode())) * 31;
        DataAccessNotice dataAccessNotice = this.dataAccessNotice;
        return ((((iHashCode3 + (dataAccessNotice != null ? dataAccessNotice.hashCode() : 0)) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode();
    }

    public String toString() {
        return "OauthPrepane(body=" + this.body + ", cta=" + this.cta + ", institutionIcon=" + this.institutionIcon + ", partnerNotice=" + this.partnerNotice + ", dataAccessNotice=" + this.dataAccessNotice + ", title=" + this.title + ", subtitle=" + this.subtitle + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.body.writeToParcel(dest, flags);
        this.cta.writeToParcel(dest, flags);
        Image image = this.institutionIcon;
        if (image == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            image.writeToParcel(dest, flags);
        }
        PartnerNotice partnerNotice = this.partnerNotice;
        if (partnerNotice == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            partnerNotice.writeToParcel(dest, flags);
        }
        DataAccessNotice dataAccessNotice = this.dataAccessNotice;
        if (dataAccessNotice == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dataAccessNotice.writeToParcel(dest, flags);
        }
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
    }

    /* compiled from: TextUpdate.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/OauthPrepane$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/OauthPrepane;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OauthPrepane> serializer() {
            return OauthPrepane$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OauthPrepane(int i, Body body, Cta cta, Image image, PartnerNotice partnerNotice, DataAccessNotice dataAccessNotice, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (99 != (i & 99)) {
            PluginExceptionsKt.throwMissingFieldException(i, 99, OauthPrepane$$serializer.INSTANCE.getDescriptor());
        }
        this.body = body;
        this.cta = cta;
        if ((i & 4) == 0) {
            this.institutionIcon = null;
        } else {
            this.institutionIcon = image;
        }
        if ((i & 8) == 0) {
            this.partnerNotice = null;
        } else {
            this.partnerNotice = partnerNotice;
        }
        if ((i & 16) == 0) {
            this.dataAccessNotice = null;
        } else {
            this.dataAccessNotice = dataAccessNotice;
        }
        this.title = str;
        this.subtitle = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$financial_connections_release(OauthPrepane self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, Body$$serializer.INSTANCE, self.body);
        output.encodeSerializableElement(serialDesc, 1, Cta$$serializer.INSTANCE, self.cta);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.institutionIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, Image$$serializer.INSTANCE, self.institutionIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.partnerNotice != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, PartnerNotice$$serializer.INSTANCE, self.partnerNotice);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.dataAccessNotice != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, DataAccessNotice$$serializer.INSTANCE, self.dataAccessNotice);
        }
        output.encodeSerializableElement(serialDesc, 5, MarkdownToHtmlSerializer.INSTANCE, self.title);
        output.encodeSerializableElement(serialDesc, 6, MarkdownToHtmlSerializer.INSTANCE, self.subtitle);
    }

    public OauthPrepane(Body body, Cta cta, Image image, PartnerNotice partnerNotice, DataAccessNotice dataAccessNotice, String title, String subtitle) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(cta, "cta");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.body = body;
        this.cta = cta;
        this.institutionIcon = image;
        this.partnerNotice = partnerNotice;
        this.dataAccessNotice = dataAccessNotice;
        this.title = title;
        this.subtitle = subtitle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OauthPrepane(Body body, Cta cta, Image image, PartnerNotice partnerNotice, DataAccessNotice dataAccessNotice, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str3;
        String str4;
        DataAccessNotice dataAccessNotice2;
        image = (i & 4) != 0 ? null : image;
        partnerNotice = (i & 8) != 0 ? null : partnerNotice;
        if ((i & 16) != 0) {
            str3 = str2;
            str4 = str;
            dataAccessNotice2 = null;
        } else {
            str3 = str2;
            str4 = str;
            dataAccessNotice2 = dataAccessNotice;
        }
        this(body, cta, image, partnerNotice, dataAccessNotice2, str4, str3);
    }

    public final Body getBody() {
        return this.body;
    }

    public final Cta getCta() {
        return this.cta;
    }

    public final Image getInstitutionIcon() {
        return this.institutionIcon;
    }

    public final PartnerNotice getPartnerNotice() {
        return this.partnerNotice;
    }

    public final DataAccessNotice getDataAccessNotice() {
        return this.dataAccessNotice;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }
}
