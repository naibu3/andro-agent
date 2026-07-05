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
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 =2\u00020\u0001:\u0002<=B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003JG\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0006\u0010)\u001a\u00020\u000eJ\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\u000eHÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u000eJ%\u00105\u001a\u0002012\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0001¢\u0006\u0002\b;R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015R\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010!¨\u0006>"}, d2 = {"Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;", "Landroid/os/Parcelable;", "title", "", "body", "Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;", "aboveCta", SDKConstants.PARAM_GAME_REQUESTS_CTA, "skipCta", "legalDetailsNotice", "Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTitle$annotations", "()V", "getTitle", "()Ljava/lang/String;", "getBody$annotations", "getBody", "()Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;", "getAboveCta$annotations", "getAboveCta", "getCta$annotations", "getCta", "getSkipCta$annotations", "getSkipCta", "getLegalDetailsNotice$annotations", "getLegalDetailsNotice", "()Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class NetworkingLinkSignupPane implements Parcelable {
    private final String aboveCta;
    private final NetworkingLinkSignupBody body;
    private final String cta;
    private final LegalDetailsNotice legalDetailsNotice;
    private final String skipCta;
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<NetworkingLinkSignupPane> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: TextUpdate.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NetworkingLinkSignupPane> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NetworkingLinkSignupPane createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NetworkingLinkSignupPane(parcel.readString(), NetworkingLinkSignupBody.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : LegalDetailsNotice.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NetworkingLinkSignupPane[] newArray(int i) {
            return new NetworkingLinkSignupPane[i];
        }
    }

    public static /* synthetic */ NetworkingLinkSignupPane copy$default(NetworkingLinkSignupPane networkingLinkSignupPane, String str, NetworkingLinkSignupBody networkingLinkSignupBody, String str2, String str3, String str4, LegalDetailsNotice legalDetailsNotice, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkingLinkSignupPane.title;
        }
        if ((i & 2) != 0) {
            networkingLinkSignupBody = networkingLinkSignupPane.body;
        }
        if ((i & 4) != 0) {
            str2 = networkingLinkSignupPane.aboveCta;
        }
        if ((i & 8) != 0) {
            str3 = networkingLinkSignupPane.cta;
        }
        if ((i & 16) != 0) {
            str4 = networkingLinkSignupPane.skipCta;
        }
        if ((i & 32) != 0) {
            legalDetailsNotice = networkingLinkSignupPane.legalDetailsNotice;
        }
        String str5 = str4;
        LegalDetailsNotice legalDetailsNotice2 = legalDetailsNotice;
        return networkingLinkSignupPane.copy(str, networkingLinkSignupBody, str2, str3, str5, legalDetailsNotice2);
    }

    @SerialName("above_cta")
    @Serializable(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getAboveCta$annotations() {
    }

    @SerialName("body")
    public static /* synthetic */ void getBody$annotations() {
    }

    @SerialName(SDKConstants.PARAM_GAME_REQUESTS_CTA)
    @Serializable(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getCta$annotations() {
    }

    @SerialName("legal_details_notice")
    public static /* synthetic */ void getLegalDetailsNotice$annotations() {
    }

    @SerialName("skip_cta")
    @Serializable(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getSkipCta$annotations() {
    }

    @SerialName("title")
    @Serializable(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getTitle$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final NetworkingLinkSignupBody getBody() {
        return this.body;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAboveCta() {
        return this.aboveCta;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSkipCta() {
        return this.skipCta;
    }

    /* renamed from: component6, reason: from getter */
    public final LegalDetailsNotice getLegalDetailsNotice() {
        return this.legalDetailsNotice;
    }

    public final NetworkingLinkSignupPane copy(String title, NetworkingLinkSignupBody body, String aboveCta, String cta, String skipCta, LegalDetailsNotice legalDetailsNotice) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(aboveCta, "aboveCta");
        Intrinsics.checkNotNullParameter(cta, "cta");
        Intrinsics.checkNotNullParameter(skipCta, "skipCta");
        return new NetworkingLinkSignupPane(title, body, aboveCta, cta, skipCta, legalDetailsNotice);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkingLinkSignupPane)) {
            return false;
        }
        NetworkingLinkSignupPane networkingLinkSignupPane = (NetworkingLinkSignupPane) other;
        return Intrinsics.areEqual(this.title, networkingLinkSignupPane.title) && Intrinsics.areEqual(this.body, networkingLinkSignupPane.body) && Intrinsics.areEqual(this.aboveCta, networkingLinkSignupPane.aboveCta) && Intrinsics.areEqual(this.cta, networkingLinkSignupPane.cta) && Intrinsics.areEqual(this.skipCta, networkingLinkSignupPane.skipCta) && Intrinsics.areEqual(this.legalDetailsNotice, networkingLinkSignupPane.legalDetailsNotice);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.title.hashCode() * 31) + this.body.hashCode()) * 31) + this.aboveCta.hashCode()) * 31) + this.cta.hashCode()) * 31) + this.skipCta.hashCode()) * 31;
        LegalDetailsNotice legalDetailsNotice = this.legalDetailsNotice;
        return iHashCode + (legalDetailsNotice == null ? 0 : legalDetailsNotice.hashCode());
    }

    public String toString() {
        return "NetworkingLinkSignupPane(title=" + this.title + ", body=" + this.body + ", aboveCta=" + this.aboveCta + ", cta=" + this.cta + ", skipCta=" + this.skipCta + ", legalDetailsNotice=" + this.legalDetailsNotice + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        this.body.writeToParcel(dest, flags);
        dest.writeString(this.aboveCta);
        dest.writeString(this.cta);
        dest.writeString(this.skipCta);
        LegalDetailsNotice legalDetailsNotice = this.legalDetailsNotice;
        if (legalDetailsNotice == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            legalDetailsNotice.writeToParcel(dest, flags);
        }
    }

    /* compiled from: TextUpdate.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NetworkingLinkSignupPane> serializer() {
            return NetworkingLinkSignupPane$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NetworkingLinkSignupPane(int i, String str, NetworkingLinkSignupBody networkingLinkSignupBody, String str2, String str3, String str4, LegalDetailsNotice legalDetailsNotice, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, NetworkingLinkSignupPane$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.body = networkingLinkSignupBody;
        this.aboveCta = str2;
        this.cta = str3;
        this.skipCta = str4;
        if ((i & 32) == 0) {
            this.legalDetailsNotice = null;
        } else {
            this.legalDetailsNotice = legalDetailsNotice;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$financial_connections_release(NetworkingLinkSignupPane self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, MarkdownToHtmlSerializer.INSTANCE, self.title);
        output.encodeSerializableElement(serialDesc, 1, NetworkingLinkSignupBody$$serializer.INSTANCE, self.body);
        output.encodeSerializableElement(serialDesc, 2, MarkdownToHtmlSerializer.INSTANCE, self.aboveCta);
        output.encodeSerializableElement(serialDesc, 3, MarkdownToHtmlSerializer.INSTANCE, self.cta);
        output.encodeSerializableElement(serialDesc, 4, MarkdownToHtmlSerializer.INSTANCE, self.skipCta);
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.legalDetailsNotice == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, LegalDetailsNotice$$serializer.INSTANCE, self.legalDetailsNotice);
    }

    public NetworkingLinkSignupPane(String title, NetworkingLinkSignupBody body, String aboveCta, String cta, String skipCta, LegalDetailsNotice legalDetailsNotice) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(aboveCta, "aboveCta");
        Intrinsics.checkNotNullParameter(cta, "cta");
        Intrinsics.checkNotNullParameter(skipCta, "skipCta");
        this.title = title;
        this.body = body;
        this.aboveCta = aboveCta;
        this.cta = cta;
        this.skipCta = skipCta;
        this.legalDetailsNotice = legalDetailsNotice;
    }

    public /* synthetic */ NetworkingLinkSignupPane(String str, NetworkingLinkSignupBody networkingLinkSignupBody, String str2, String str3, String str4, LegalDetailsNotice legalDetailsNotice, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, networkingLinkSignupBody, str2, str3, str4, (i & 32) != 0 ? null : legalDetailsNotice);
    }

    public final String getTitle() {
        return this.title;
    }

    public final NetworkingLinkSignupBody getBody() {
        return this.body;
    }

    public final String getAboveCta() {
        return this.aboveCta;
    }

    public final String getCta() {
        return this.cta;
    }

    public final String getSkipCta() {
        return this.skipCta;
    }

    public final LegalDetailsNotice getLegalDetailsNotice() {
        return this.legalDetailsNotice;
    }
}
