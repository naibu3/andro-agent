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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 12\u00020\u0001:\u000201B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u001d\u001a\u00020\nJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\nHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\nJ%\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0001¢\u0006\u0002\b/R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011¨\u00062"}, d2 = {"Lcom/stripe/android/financialconnections/model/LinkLoginPane;", "Landroid/os/Parcelable;", "title", "", "body", "aboveCta", SDKConstants.PARAM_GAME_REQUESTS_CTA, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTitle$annotations", "()V", "getTitle", "()Ljava/lang/String;", "getBody$annotations", "getBody", "getAboveCta$annotations", "getAboveCta", "getCta$annotations", "getCta", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class LinkLoginPane implements Parcelable {
    private final String aboveCta;
    private final String body;
    private final String cta;
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<LinkLoginPane> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: TextUpdate.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkLoginPane> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkLoginPane createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LinkLoginPane(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkLoginPane[] newArray(int i) {
            return new LinkLoginPane[i];
        }
    }

    public static /* synthetic */ LinkLoginPane copy$default(LinkLoginPane linkLoginPane, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkLoginPane.title;
        }
        if ((i & 2) != 0) {
            str2 = linkLoginPane.body;
        }
        if ((i & 4) != 0) {
            str3 = linkLoginPane.aboveCta;
        }
        if ((i & 8) != 0) {
            str4 = linkLoginPane.cta;
        }
        return linkLoginPane.copy(str, str2, str3, str4);
    }

    @SerialName("above_cta")
    @Serializable(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getAboveCta$annotations() {
    }

    @SerialName("body")
    @Serializable(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getBody$annotations() {
    }

    @SerialName(SDKConstants.PARAM_GAME_REQUESTS_CTA)
    @Serializable(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getCta$annotations() {
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
    public final String getBody() {
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

    public final LinkLoginPane copy(String title, String body, String aboveCta, String cta) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(aboveCta, "aboveCta");
        Intrinsics.checkNotNullParameter(cta, "cta");
        return new LinkLoginPane(title, body, aboveCta, cta);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkLoginPane)) {
            return false;
        }
        LinkLoginPane linkLoginPane = (LinkLoginPane) other;
        return Intrinsics.areEqual(this.title, linkLoginPane.title) && Intrinsics.areEqual(this.body, linkLoginPane.body) && Intrinsics.areEqual(this.aboveCta, linkLoginPane.aboveCta) && Intrinsics.areEqual(this.cta, linkLoginPane.cta);
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.body.hashCode()) * 31) + this.aboveCta.hashCode()) * 31) + this.cta.hashCode();
    }

    public String toString() {
        return "LinkLoginPane(title=" + this.title + ", body=" + this.body + ", aboveCta=" + this.aboveCta + ", cta=" + this.cta + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.body);
        dest.writeString(this.aboveCta);
        dest.writeString(this.cta);
    }

    /* compiled from: TextUpdate.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/LinkLoginPane$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/LinkLoginPane;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LinkLoginPane> serializer() {
            return LinkLoginPane$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LinkLoginPane(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, LinkLoginPane$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.body = str2;
        this.aboveCta = str3;
        this.cta = str4;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$financial_connections_release(LinkLoginPane self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, MarkdownToHtmlSerializer.INSTANCE, self.title);
        output.encodeSerializableElement(serialDesc, 1, MarkdownToHtmlSerializer.INSTANCE, self.body);
        output.encodeSerializableElement(serialDesc, 2, MarkdownToHtmlSerializer.INSTANCE, self.aboveCta);
        output.encodeSerializableElement(serialDesc, 3, MarkdownToHtmlSerializer.INSTANCE, self.cta);
    }

    public LinkLoginPane(String title, String body, String aboveCta, String cta) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(aboveCta, "aboveCta");
        Intrinsics.checkNotNullParameter(cta, "cta");
        this.title = title;
        this.body = body;
        this.aboveCta = aboveCta;
        this.cta = cta;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getAboveCta() {
        return this.aboveCta;
    }

    public final String getCta() {
        return this.cta;
    }
}
