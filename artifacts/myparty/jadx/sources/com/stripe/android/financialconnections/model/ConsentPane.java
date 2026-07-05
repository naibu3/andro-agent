package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatDelegate;
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
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 C2\u00020\u0001:\u0002BCBG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\r\u0010\u0013J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003JS\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0006\u0010/\u001a\u00020\u0010J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020\u0010HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001J\u0016\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0010J%\u0010;\u001a\u0002072\u0006\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0001¢\u0006\u0002\bAR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010!R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0015\u001a\u0004\b#\u0010$R\u001c\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0015\u001a\u0004\b&\u0010\u0017¨\u0006D"}, d2 = {"Lcom/stripe/android/financialconnections/model/ConsentPane;", "Landroid/os/Parcelable;", "aboveCta", "", "belowCta", "body", "Lcom/stripe/android/financialconnections/model/ConsentPaneBody;", SDKConstants.PARAM_GAME_REQUESTS_CTA, "dataAccessNotice", "Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "legalDetailsNotice", "Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ConsentPaneBody;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ConsentPaneBody;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAboveCta$annotations", "()V", "getAboveCta", "()Ljava/lang/String;", "getBelowCta$annotations", "getBelowCta", "getBody$annotations", "getBody", "()Lcom/stripe/android/financialconnections/model/ConsentPaneBody;", "getCta$annotations", "getCta", "getDataAccessNotice$annotations", "getDataAccessNotice", "()Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "getLegalDetailsNotice$annotations", "getLegalDetailsNotice", "()Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;", "getTitle$annotations", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class ConsentPane implements Parcelable {
    private final String aboveCta;
    private final String belowCta;
    private final ConsentPaneBody body;
    private final String cta;
    private final DataAccessNotice dataAccessNotice;
    private final LegalDetailsNotice legalDetailsNotice;
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ConsentPane> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: TextUpdate.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ConsentPane> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConsentPane createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConsentPane(parcel.readString(), parcel.readString(), ConsentPaneBody.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : DataAccessNotice.CREATOR.createFromParcel(parcel), LegalDetailsNotice.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConsentPane[] newArray(int i) {
            return new ConsentPane[i];
        }
    }

    public static /* synthetic */ ConsentPane copy$default(ConsentPane consentPane, String str, String str2, ConsentPaneBody consentPaneBody, String str3, DataAccessNotice dataAccessNotice, LegalDetailsNotice legalDetailsNotice, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = consentPane.aboveCta;
        }
        if ((i & 2) != 0) {
            str2 = consentPane.belowCta;
        }
        if ((i & 4) != 0) {
            consentPaneBody = consentPane.body;
        }
        if ((i & 8) != 0) {
            str3 = consentPane.cta;
        }
        if ((i & 16) != 0) {
            dataAccessNotice = consentPane.dataAccessNotice;
        }
        if ((i & 32) != 0) {
            legalDetailsNotice = consentPane.legalDetailsNotice;
        }
        if ((i & 64) != 0) {
            str4 = consentPane.title;
        }
        LegalDetailsNotice legalDetailsNotice2 = legalDetailsNotice;
        String str5 = str4;
        DataAccessNotice dataAccessNotice2 = dataAccessNotice;
        ConsentPaneBody consentPaneBody2 = consentPaneBody;
        return consentPane.copy(str, str2, consentPaneBody2, str3, dataAccessNotice2, legalDetailsNotice2, str5);
    }

    @SerialName("above_cta")
    @Serializable(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getAboveCta$annotations() {
    }

    @SerialName("below_cta")
    @Serializable(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getBelowCta$annotations() {
    }

    @SerialName("body")
    public static /* synthetic */ void getBody$annotations() {
    }

    @SerialName(SDKConstants.PARAM_GAME_REQUESTS_CTA)
    @Serializable(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getCta$annotations() {
    }

    @SerialName("data_access_notice")
    public static /* synthetic */ void getDataAccessNotice$annotations() {
    }

    @SerialName("legal_details_notice")
    public static /* synthetic */ void getLegalDetailsNotice$annotations() {
    }

    @SerialName("title")
    @Serializable(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getTitle$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getAboveCta() {
        return this.aboveCta;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBelowCta() {
        return this.belowCta;
    }

    /* renamed from: component3, reason: from getter */
    public final ConsentPaneBody getBody() {
        return this.body;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    /* renamed from: component5, reason: from getter */
    public final DataAccessNotice getDataAccessNotice() {
        return this.dataAccessNotice;
    }

    /* renamed from: component6, reason: from getter */
    public final LegalDetailsNotice getLegalDetailsNotice() {
        return this.legalDetailsNotice;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final ConsentPane copy(String aboveCta, String belowCta, ConsentPaneBody body, String cta, DataAccessNotice dataAccessNotice, LegalDetailsNotice legalDetailsNotice, String title) {
        Intrinsics.checkNotNullParameter(aboveCta, "aboveCta");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(cta, "cta");
        Intrinsics.checkNotNullParameter(legalDetailsNotice, "legalDetailsNotice");
        Intrinsics.checkNotNullParameter(title, "title");
        return new ConsentPane(aboveCta, belowCta, body, cta, dataAccessNotice, legalDetailsNotice, title);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsentPane)) {
            return false;
        }
        ConsentPane consentPane = (ConsentPane) other;
        return Intrinsics.areEqual(this.aboveCta, consentPane.aboveCta) && Intrinsics.areEqual(this.belowCta, consentPane.belowCta) && Intrinsics.areEqual(this.body, consentPane.body) && Intrinsics.areEqual(this.cta, consentPane.cta) && Intrinsics.areEqual(this.dataAccessNotice, consentPane.dataAccessNotice) && Intrinsics.areEqual(this.legalDetailsNotice, consentPane.legalDetailsNotice) && Intrinsics.areEqual(this.title, consentPane.title);
    }

    public int hashCode() {
        int iHashCode = this.aboveCta.hashCode() * 31;
        String str = this.belowCta;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.body.hashCode()) * 31) + this.cta.hashCode()) * 31;
        DataAccessNotice dataAccessNotice = this.dataAccessNotice;
        return ((((iHashCode2 + (dataAccessNotice != null ? dataAccessNotice.hashCode() : 0)) * 31) + this.legalDetailsNotice.hashCode()) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "ConsentPane(aboveCta=" + this.aboveCta + ", belowCta=" + this.belowCta + ", body=" + this.body + ", cta=" + this.cta + ", dataAccessNotice=" + this.dataAccessNotice + ", legalDetailsNotice=" + this.legalDetailsNotice + ", title=" + this.title + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.aboveCta);
        dest.writeString(this.belowCta);
        this.body.writeToParcel(dest, flags);
        dest.writeString(this.cta);
        DataAccessNotice dataAccessNotice = this.dataAccessNotice;
        if (dataAccessNotice == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dataAccessNotice.writeToParcel(dest, flags);
        }
        this.legalDetailsNotice.writeToParcel(dest, flags);
        dest.writeString(this.title);
    }

    /* compiled from: TextUpdate.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/ConsentPane$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/ConsentPane;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ConsentPane> serializer() {
            return ConsentPane$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ConsentPane(int i, String str, String str2, ConsentPaneBody consentPaneBody, String str3, DataAccessNotice dataAccessNotice, LegalDetailsNotice legalDetailsNotice, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (109 != (i & AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY)) {
            PluginExceptionsKt.throwMissingFieldException(i, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, ConsentPane$$serializer.INSTANCE.getDescriptor());
        }
        this.aboveCta = str;
        if ((i & 2) == 0) {
            this.belowCta = null;
        } else {
            this.belowCta = str2;
        }
        this.body = consentPaneBody;
        this.cta = str3;
        if ((i & 16) == 0) {
            this.dataAccessNotice = null;
        } else {
            this.dataAccessNotice = dataAccessNotice;
        }
        this.legalDetailsNotice = legalDetailsNotice;
        this.title = str4;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$financial_connections_release(ConsentPane self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, MarkdownToHtmlSerializer.INSTANCE, self.aboveCta);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.belowCta != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, MarkdownToHtmlSerializer.INSTANCE, self.belowCta);
        }
        output.encodeSerializableElement(serialDesc, 2, ConsentPaneBody$$serializer.INSTANCE, self.body);
        output.encodeSerializableElement(serialDesc, 3, MarkdownToHtmlSerializer.INSTANCE, self.cta);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.dataAccessNotice != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, DataAccessNotice$$serializer.INSTANCE, self.dataAccessNotice);
        }
        output.encodeSerializableElement(serialDesc, 5, LegalDetailsNotice$$serializer.INSTANCE, self.legalDetailsNotice);
        output.encodeSerializableElement(serialDesc, 6, MarkdownToHtmlSerializer.INSTANCE, self.title);
    }

    public ConsentPane(String aboveCta, String str, ConsentPaneBody body, String cta, DataAccessNotice dataAccessNotice, LegalDetailsNotice legalDetailsNotice, String title) {
        Intrinsics.checkNotNullParameter(aboveCta, "aboveCta");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(cta, "cta");
        Intrinsics.checkNotNullParameter(legalDetailsNotice, "legalDetailsNotice");
        Intrinsics.checkNotNullParameter(title, "title");
        this.aboveCta = aboveCta;
        this.belowCta = str;
        this.body = body;
        this.cta = cta;
        this.dataAccessNotice = dataAccessNotice;
        this.legalDetailsNotice = legalDetailsNotice;
        this.title = title;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ConsentPane(String str, String str2, ConsentPaneBody consentPaneBody, String str3, DataAccessNotice dataAccessNotice, LegalDetailsNotice legalDetailsNotice, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        LegalDetailsNotice legalDetailsNotice2;
        DataAccessNotice dataAccessNotice2;
        str2 = (i & 2) != 0 ? null : str2;
        if ((i & 16) != 0) {
            str5 = str4;
            legalDetailsNotice2 = legalDetailsNotice;
            dataAccessNotice2 = null;
        } else {
            str5 = str4;
            legalDetailsNotice2 = legalDetailsNotice;
            dataAccessNotice2 = dataAccessNotice;
        }
        this(str, str2, consentPaneBody, str3, dataAccessNotice2, legalDetailsNotice2, str5);
    }

    public final String getAboveCta() {
        return this.aboveCta;
    }

    public final String getBelowCta() {
        return this.belowCta;
    }

    public final ConsentPaneBody getBody() {
        return this.body;
    }

    public final String getCta() {
        return this.cta;
    }

    public final DataAccessNotice getDataAccessNotice() {
        return this.dataAccessNotice;
    }

    public final LegalDetailsNotice getLegalDetailsNotice() {
        return this.legalDetailsNotice;
    }

    public final String getTitle() {
        return this.title;
    }
}
