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
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 =2\u00020\u0001:\u0002<=BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003JK\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010)\u001a\u00020\u000eJ\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\u000eHÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u000eJ%\u00105\u001a\u0002012\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0001¢\u0006\u0002\b;R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0018R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0018¨\u0006>"}, d2 = {"Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;", "Landroid/os/Parcelable;", PaymentSheetAppearanceKeys.ICON, "Lcom/stripe/android/financialconnections/model/Image;", "title", "", "subtitle", "body", "Lcom/stripe/android/financialconnections/model/LegalDetailsBody;", SDKConstants.PARAM_GAME_REQUESTS_CTA, "disclaimer", "<init>", "(Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/LegalDetailsBody;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/LegalDetailsBody;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getIcon$annotations", "()V", "getIcon", "()Lcom/stripe/android/financialconnections/model/Image;", "getTitle$annotations", "getTitle", "()Ljava/lang/String;", "getSubtitle$annotations", "getSubtitle", "getBody$annotations", "getBody", "()Lcom/stripe/android/financialconnections/model/LegalDetailsBody;", "getCta$annotations", "getCta", "getDisclaimer$annotations", "getDisclaimer", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class LegalDetailsNotice implements Parcelable {
    private final LegalDetailsBody body;
    private final String cta;
    private final String disclaimer;
    private final Image icon;
    private final String subtitle;
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<LegalDetailsNotice> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: TextUpdate.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LegalDetailsNotice> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LegalDetailsNotice createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LegalDetailsNotice(parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), LegalDetailsBody.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LegalDetailsNotice[] newArray(int i) {
            return new LegalDetailsNotice[i];
        }
    }

    public static /* synthetic */ LegalDetailsNotice copy$default(LegalDetailsNotice legalDetailsNotice, Image image, String str, String str2, LegalDetailsBody legalDetailsBody, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            image = legalDetailsNotice.icon;
        }
        if ((i & 2) != 0) {
            str = legalDetailsNotice.title;
        }
        if ((i & 4) != 0) {
            str2 = legalDetailsNotice.subtitle;
        }
        if ((i & 8) != 0) {
            legalDetailsBody = legalDetailsNotice.body;
        }
        if ((i & 16) != 0) {
            str3 = legalDetailsNotice.cta;
        }
        if ((i & 32) != 0) {
            str4 = legalDetailsNotice.disclaimer;
        }
        String str5 = str3;
        String str6 = str4;
        return legalDetailsNotice.copy(image, str, str2, legalDetailsBody, str5, str6);
    }

    @SerialName("body")
    public static /* synthetic */ void getBody$annotations() {
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
    public final LegalDetailsBody getBody() {
        return this.body;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final LegalDetailsNotice copy(Image icon, String title, String subtitle, LegalDetailsBody body, String cta, String disclaimer) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(cta, "cta");
        return new LegalDetailsNotice(icon, title, subtitle, body, cta, disclaimer);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegalDetailsNotice)) {
            return false;
        }
        LegalDetailsNotice legalDetailsNotice = (LegalDetailsNotice) other;
        return Intrinsics.areEqual(this.icon, legalDetailsNotice.icon) && Intrinsics.areEqual(this.title, legalDetailsNotice.title) && Intrinsics.areEqual(this.subtitle, legalDetailsNotice.subtitle) && Intrinsics.areEqual(this.body, legalDetailsNotice.body) && Intrinsics.areEqual(this.cta, legalDetailsNotice.cta) && Intrinsics.areEqual(this.disclaimer, legalDetailsNotice.disclaimer);
    }

    public int hashCode() {
        Image image = this.icon;
        int iHashCode = (((image == null ? 0 : image.hashCode()) * 31) + this.title.hashCode()) * 31;
        String str = this.subtitle;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.body.hashCode()) * 31) + this.cta.hashCode()) * 31;
        String str2 = this.disclaimer;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "LegalDetailsNotice(icon=" + this.icon + ", title=" + this.title + ", subtitle=" + this.subtitle + ", body=" + this.body + ", cta=" + this.cta + ", disclaimer=" + this.disclaimer + ")";
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
        dest.writeString(this.cta);
        dest.writeString(this.disclaimer);
    }

    /* compiled from: TextUpdate.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/LegalDetailsNotice$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LegalDetailsNotice> serializer() {
            return LegalDetailsNotice$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LegalDetailsNotice(int i, Image image, String str, String str2, LegalDetailsBody legalDetailsBody, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (26 != (i & 26)) {
            PluginExceptionsKt.throwMissingFieldException(i, 26, LegalDetailsNotice$$serializer.INSTANCE.getDescriptor());
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
        this.body = legalDetailsBody;
        this.cta = str3;
        if ((i & 32) == 0) {
            this.disclaimer = null;
        } else {
            this.disclaimer = str4;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$financial_connections_release(LegalDetailsNotice self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, Image$$serializer.INSTANCE, self.icon);
        }
        output.encodeSerializableElement(serialDesc, 1, MarkdownToHtmlSerializer.INSTANCE, self.title);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, MarkdownToHtmlSerializer.INSTANCE, self.subtitle);
        }
        output.encodeSerializableElement(serialDesc, 3, LegalDetailsBody$$serializer.INSTANCE, self.body);
        output.encodeSerializableElement(serialDesc, 4, MarkdownToHtmlSerializer.INSTANCE, self.cta);
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.disclaimer == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, MarkdownToHtmlSerializer.INSTANCE, self.disclaimer);
    }

    public LegalDetailsNotice(Image image, String title, String str, LegalDetailsBody body, String cta, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(cta, "cta");
        this.icon = image;
        this.title = title;
        this.subtitle = str;
        this.body = body;
        this.cta = cta;
        this.disclaimer = str2;
    }

    public /* synthetic */ LegalDetailsNotice(Image image, String str, String str2, LegalDetailsBody legalDetailsBody, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : image, str, (i & 4) != 0 ? null : str2, legalDetailsBody, str3, (i & 32) != 0 ? null : str4);
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

    public final LegalDetailsBody getBody() {
        return this.body;
    }

    public final String getCta() {
        return this.cta;
    }

    public final String getDisclaimer() {
        return this.disclaimer;
    }
}
