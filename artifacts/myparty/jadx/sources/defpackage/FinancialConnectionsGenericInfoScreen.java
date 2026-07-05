package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.common.util.UriUtil;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.AnalyticsEvents;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.model.Image$$serializer;
import com.stripe.android.financialconnections.model.serializer.BodyEntrySerializer;
import com.stripe.android.financialconnections.model.serializer.MarkdownToHtmlSerializer;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: FinancialConnectionsGenericInfoScreen.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 ;2\u00020\u0001:\u00066789:;B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0012J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003JC\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0006\u0010#\u001a\u00020\u000fJ\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u000fHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u000fJ%\u0010/\u001a\u00020+2\u0006\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0001¢\u0006\u0002\b5R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006<"}, d2 = {"LFinancialConnectionsGenericInfoScreen;", "Landroid/os/Parcelable;", "id", "", "header", "LFinancialConnectionsGenericInfoScreen$Header;", "body", "LFinancialConnectionsGenericInfoScreen$Body;", "footer", "LFinancialConnectionsGenericInfoScreen$Footer;", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "LFinancialConnectionsGenericInfoScreen$Options;", "<init>", "(Ljava/lang/String;LFinancialConnectionsGenericInfoScreen$Header;LFinancialConnectionsGenericInfoScreen$Body;LFinancialConnectionsGenericInfoScreen$Footer;LFinancialConnectionsGenericInfoScreen$Options;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;LFinancialConnectionsGenericInfoScreen$Header;LFinancialConnectionsGenericInfoScreen$Body;LFinancialConnectionsGenericInfoScreen$Footer;LFinancialConnectionsGenericInfoScreen$Options;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getHeader", "()LFinancialConnectionsGenericInfoScreen$Header;", "getBody", "()LFinancialConnectionsGenericInfoScreen$Body;", "getFooter", "()LFinancialConnectionsGenericInfoScreen$Footer;", "getOptions", "()LFinancialConnectionsGenericInfoScreen$Options;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "Header", "Body", "Footer", "Options", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class FinancialConnectionsGenericInfoScreen implements Parcelable {
    private final Body body;
    private final Footer footer;
    private final Header header;
    private final String id;
    private final Options options;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<FinancialConnectionsGenericInfoScreen> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<FinancialConnectionsGenericInfoScreen> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsGenericInfoScreen createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FinancialConnectionsGenericInfoScreen(parcel.readString(), parcel.readInt() == 0 ? null : Header.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Body.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Footer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Options.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsGenericInfoScreen[] newArray(int i) {
            return new FinancialConnectionsGenericInfoScreen[i];
        }
    }

    public static /* synthetic */ FinancialConnectionsGenericInfoScreen copy$default(FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen, String str, Header header, Body body, Footer footer, Options options, int i, Object obj) {
        if ((i & 1) != 0) {
            str = financialConnectionsGenericInfoScreen.id;
        }
        if ((i & 2) != 0) {
            header = financialConnectionsGenericInfoScreen.header;
        }
        if ((i & 4) != 0) {
            body = financialConnectionsGenericInfoScreen.body;
        }
        if ((i & 8) != 0) {
            footer = financialConnectionsGenericInfoScreen.footer;
        }
        if ((i & 16) != 0) {
            options = financialConnectionsGenericInfoScreen.options;
        }
        Options options2 = options;
        Body body2 = body;
        return financialConnectionsGenericInfoScreen.copy(str, header, body2, footer, options2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final Header getHeader() {
        return this.header;
    }

    /* renamed from: component3, reason: from getter */
    public final Body getBody() {
        return this.body;
    }

    /* renamed from: component4, reason: from getter */
    public final Footer getFooter() {
        return this.footer;
    }

    /* renamed from: component5, reason: from getter */
    public final Options getOptions() {
        return this.options;
    }

    public final FinancialConnectionsGenericInfoScreen copy(String id, Header header, Body body, Footer footer, Options options) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new FinancialConnectionsGenericInfoScreen(id, header, body, footer, options);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinancialConnectionsGenericInfoScreen)) {
            return false;
        }
        FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen = (FinancialConnectionsGenericInfoScreen) other;
        return Intrinsics.areEqual(this.id, financialConnectionsGenericInfoScreen.id) && Intrinsics.areEqual(this.header, financialConnectionsGenericInfoScreen.header) && Intrinsics.areEqual(this.body, financialConnectionsGenericInfoScreen.body) && Intrinsics.areEqual(this.footer, financialConnectionsGenericInfoScreen.footer) && Intrinsics.areEqual(this.options, financialConnectionsGenericInfoScreen.options);
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Header header = this.header;
        int iHashCode2 = (iHashCode + (header == null ? 0 : header.hashCode())) * 31;
        Body body = this.body;
        int iHashCode3 = (iHashCode2 + (body == null ? 0 : body.hashCode())) * 31;
        Footer footer = this.footer;
        int iHashCode4 = (iHashCode3 + (footer == null ? 0 : footer.hashCode())) * 31;
        Options options = this.options;
        return iHashCode4 + (options != null ? options.hashCode() : 0);
    }

    public String toString() {
        return "FinancialConnectionsGenericInfoScreen(id=" + this.id + ", header=" + this.header + ", body=" + this.body + ", footer=" + this.footer + ", options=" + this.options + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        Header header = this.header;
        if (header == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            header.writeToParcel(dest, flags);
        }
        Body body = this.body;
        if (body == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            body.writeToParcel(dest, flags);
        }
        Footer footer = this.footer;
        if (footer == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            footer.writeToParcel(dest, flags);
        }
        Options options = this.options;
        if (options == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            options.writeToParcel(dest, flags);
        }
    }

    /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"LFinancialConnectionsGenericInfoScreen$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "LFinancialConnectionsGenericInfoScreen;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FinancialConnectionsGenericInfoScreen> serializer() {
            return FinancialConnectionsGenericInfoScreen$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FinancialConnectionsGenericInfoScreen(int i, String str, Header header, Body body, Footer footer, Options options, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, FinancialConnectionsGenericInfoScreen$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        if ((i & 2) == 0) {
            this.header = null;
        } else {
            this.header = header;
        }
        if ((i & 4) == 0) {
            this.body = null;
        } else {
            this.body = body;
        }
        if ((i & 8) == 0) {
            this.footer = null;
        } else {
            this.footer = footer;
        }
        if ((i & 16) == 0) {
            this.options = null;
        } else {
            this.options = options;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$financial_connections_release(FinancialConnectionsGenericInfoScreen self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.header != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, FinancialConnectionsGenericInfoScreen$Header$$serializer.INSTANCE, self.header);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.body != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, FinancialConnectionsGenericInfoScreen$Body$$serializer.INSTANCE, self.body);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.footer != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, FinancialConnectionsGenericInfoScreen$Footer$$serializer.INSTANCE, self.footer);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.options == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, FinancialConnectionsGenericInfoScreen$Options$$serializer.INSTANCE, self.options);
    }

    public FinancialConnectionsGenericInfoScreen(String id, Header header, Body body, Footer footer, Options options) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.header = header;
        this.body = body;
        this.footer = footer;
        this.options = options;
    }

    public /* synthetic */ FinancialConnectionsGenericInfoScreen(String str, Header header, Body body, Footer footer, Options options, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : header, (i & 4) != 0 ? null : body, (i & 8) != 0 ? null : footer, (i & 16) != 0 ? null : options);
    }

    public final String getId() {
        return this.id;
    }

    public final Header getHeader() {
        return this.header;
    }

    public final Body getBody() {
        return this.body;
    }

    public final Footer getFooter() {
        return this.footer;
    }

    public final Options getOptions() {
        return this.options;
    }

    /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 22\u00020\u0001:\u000212B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\fJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\fHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\fJ%\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0001¢\u0006\u0002\b0R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u00063"}, d2 = {"LFinancialConnectionsGenericInfoScreen$Header;", "Landroid/os/Parcelable;", "title", "", "subtitle", PaymentSheetAppearanceKeys.ICON, "Lcom/stripe/android/financialconnections/model/Image;", "alignment", "LAlignment;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;LAlignment;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;LAlignment;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle$annotations", "()V", "getSubtitle", "getIcon", "()Lcom/stripe/android/financialconnections/model/Image;", "getAlignment", "()LAlignment;", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    /* loaded from: classes5.dex */
    public static final /* data */ class Header implements Parcelable {
        public static final int $stable = 0;
        private final Alignment alignment;
        private final Image icon;
        private final String subtitle;
        private final String title;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Header> CREATOR = new Creator();
        private static final KSerializer<Object>[] $childSerializers = {null, null, null, Alignment.INSTANCE.serializer()};

        /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Header> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Header createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Header(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Alignment.valueOf(parcel.readString()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Header[] newArray(int i) {
                return new Header[i];
            }
        }

        public Header() {
            this((String) null, (String) null, (Image) null, (Alignment) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Header copy$default(Header header, String str, String str2, Image image, Alignment alignment, int i, Object obj) {
            if ((i & 1) != 0) {
                str = header.title;
            }
            if ((i & 2) != 0) {
                str2 = header.subtitle;
            }
            if ((i & 4) != 0) {
                image = header.icon;
            }
            if ((i & 8) != 0) {
                alignment = header.alignment;
            }
            return header.copy(str, str2, image, alignment);
        }

        @Serializable(with = MarkdownToHtmlSerializer.class)
        public static /* synthetic */ void getSubtitle$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final Image getIcon() {
            return this.icon;
        }

        /* renamed from: component4, reason: from getter */
        public final Alignment getAlignment() {
            return this.alignment;
        }

        public final Header copy(String title, String subtitle, Image icon, Alignment alignment) {
            return new Header(title, subtitle, icon, alignment);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return Intrinsics.areEqual(this.title, header.title) && Intrinsics.areEqual(this.subtitle, header.subtitle) && Intrinsics.areEqual(this.icon, header.icon) && this.alignment == header.alignment;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.subtitle;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Image image = this.icon;
            int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
            Alignment alignment = this.alignment;
            return iHashCode3 + (alignment != null ? alignment.hashCode() : 0);
        }

        public String toString() {
            return "Header(title=" + this.title + ", subtitle=" + this.subtitle + ", icon=" + this.icon + ", alignment=" + this.alignment + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
            dest.writeString(this.subtitle);
            Image image = this.icon;
            if (image == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                image.writeToParcel(dest, flags);
            }
            Alignment alignment = this.alignment;
            if (alignment == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(alignment.name());
            }
        }

        /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"LFinancialConnectionsGenericInfoScreen$Header$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "LFinancialConnectionsGenericInfoScreen$Header;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Header> serializer() {
                return FinancialConnectionsGenericInfoScreen$Header$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Header(int i, String str, String str2, Image image, Alignment alignment, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = null;
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.subtitle = null;
            } else {
                this.subtitle = str2;
            }
            if ((i & 4) == 0) {
                this.icon = null;
            } else {
                this.icon = image;
            }
            if ((i & 8) == 0) {
                this.alignment = null;
            } else {
                this.alignment = alignment;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$financial_connections_release(Header self, CompositeEncoder output, SerialDescriptor serialDesc) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.title != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.title);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.subtitle != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, MarkdownToHtmlSerializer.INSTANCE, self.subtitle);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.icon != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, Image$$serializer.INSTANCE, self.icon);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.alignment == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 3, kSerializerArr[3], self.alignment);
        }

        public Header(String str, String str2, Image image, Alignment alignment) {
            this.title = str;
            this.subtitle = str2;
            this.icon = image;
            this.alignment = alignment;
        }

        public /* synthetic */ Header(String str, String str2, Image image, Alignment alignment, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : image, (i & 8) != 0 ? null : alignment);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final Image getIcon() {
            return this.icon;
        }

        public final Alignment getAlignment() {
            return this.alignment;
        }
    }

    /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0003$%&B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\u000bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\bJ\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\bHÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\bJ%\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006'"}, d2 = {"LFinancialConnectionsGenericInfoScreen$Body;", "Landroid/os/Parcelable;", "entries", "", "LFinancialConnectionsGenericInfoScreen$Body$Entry;", "<init>", "(Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getEntries", "()Ljava/util/List;", "component1", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "Entry", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    /* loaded from: classes5.dex */
    public static final /* data */ class Body implements Parcelable {
        private final List<Entry> entries;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Body> CREATOR = new Creator();
        public static final int $stable = 8;
        private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(BodyEntrySerializer.INSTANCE)};

        /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Body> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Body createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(Body.class.getClassLoader()));
                }
                return new Body(arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Body[] newArray(int i) {
                return new Body[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Body copy$default(Body body, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = body.entries;
            }
            return body.copy(list);
        }

        public final List<Entry> component1() {
            return this.entries;
        }

        public final Body copy(List<? extends Entry> entries) {
            Intrinsics.checkNotNullParameter(entries, "entries");
            return new Body(entries);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Body) && Intrinsics.areEqual(this.entries, ((Body) other).entries);
        }

        public int hashCode() {
            return this.entries.hashCode();
        }

        public String toString() {
            return "Body(entries=" + this.entries + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<Entry> list = this.entries;
            dest.writeInt(list.size());
            Iterator<Entry> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }

        /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"LFinancialConnectionsGenericInfoScreen$Body$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "LFinancialConnectionsGenericInfoScreen$Body;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Body> serializer() {
                return FinancialConnectionsGenericInfoScreen$Body$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Body(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, FinancialConnectionsGenericInfoScreen$Body$$serializer.INSTANCE.getDescriptor());
            }
            this.entries = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Body(List<? extends Entry> entries) {
            Intrinsics.checkNotNullParameter(entries, "entries");
            this.entries = entries;
        }

        public final List<Entry> getEntries() {
            return this.entries;
        }

        /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\u0005\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"LFinancialConnectionsGenericInfoScreen$Body$Entry;", "Landroid/os/Parcelable;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "Text", "Image", "Bullets", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, "Companion", "LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets;", "LFinancialConnectionsGenericInfoScreen$Body$Entry$Image;", "LFinancialConnectionsGenericInfoScreen$Body$Entry$Text;", "LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @Serializable(with = BodyEntrySerializer.class)
        public static abstract class Entry implements Parcelable {
            public static final int $stable = 0;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            public /* synthetic */ Entry(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public abstract String getId();

            /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"LFinancialConnectionsGenericInfoScreen$Body$Entry$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "LFinancialConnectionsGenericInfoScreen$Body$Entry;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Entry> serializer() {
                    return BodyEntrySerializer.INSTANCE;
                }
            }

            private Entry() {
            }

            /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
            @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 02\u00020\u0001:\u0002/0B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u001c\u001a\u00020\fJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\fHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\fJ%\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0001¢\u0006\u0002\b.R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u00061"}, d2 = {"LFinancialConnectionsGenericInfoScreen$Body$Entry$Text;", "LFinancialConnectionsGenericInfoScreen$Body$Entry;", "id", "", "text", "alignment", "LAlignment;", "size", "LSize;", "<init>", "(Ljava/lang/String;Ljava/lang/String;LAlignment;LSize;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;LAlignment;LSize;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getText", "getAlignment", "()LAlignment;", "getSize", "()LSize;", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            @Serializable
            public static final /* data */ class Text extends Entry {
                private final Alignment alignment;
                private final String id;
                private final Size size;
                private final String text;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                public static final Parcelable.Creator<Text> CREATOR = new Creator();
                public static final int $stable = 8;
                private static final KSerializer<Object>[] $childSerializers = {null, null, Alignment.INSTANCE.serializer(), Size.INSTANCE.serializer()};

                /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Text> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Text createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Text(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Alignment.valueOf(parcel.readString()), parcel.readInt() != 0 ? Size.valueOf(parcel.readString()) : null);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Text[] newArray(int i) {
                        return new Text[i];
                    }
                }

                public static /* synthetic */ Text copy$default(Text text, String str, String str2, Alignment alignment, Size size, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = text.id;
                    }
                    if ((i & 2) != 0) {
                        str2 = text.text;
                    }
                    if ((i & 4) != 0) {
                        alignment = text.alignment;
                    }
                    if ((i & 8) != 0) {
                        size = text.size;
                    }
                    return text.copy(str, str2, alignment, size);
                }

                /* renamed from: component1, reason: from getter */
                public final String getId() {
                    return this.id;
                }

                /* renamed from: component2, reason: from getter */
                public final String getText() {
                    return this.text;
                }

                /* renamed from: component3, reason: from getter */
                public final Alignment getAlignment() {
                    return this.alignment;
                }

                /* renamed from: component4, reason: from getter */
                public final Size getSize() {
                    return this.size;
                }

                public final Text copy(String id, String text, Alignment alignment, Size size) {
                    Intrinsics.checkNotNullParameter(id, "id");
                    Intrinsics.checkNotNullParameter(text, "text");
                    return new Text(id, text, alignment, size);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Text)) {
                        return false;
                    }
                    Text text = (Text) other;
                    return Intrinsics.areEqual(this.id, text.id) && Intrinsics.areEqual(this.text, text.text) && this.alignment == text.alignment && this.size == text.size;
                }

                public int hashCode() {
                    int iHashCode = ((this.id.hashCode() * 31) + this.text.hashCode()) * 31;
                    Alignment alignment = this.alignment;
                    int iHashCode2 = (iHashCode + (alignment == null ? 0 : alignment.hashCode())) * 31;
                    Size size = this.size;
                    return iHashCode2 + (size != null ? size.hashCode() : 0);
                }

                public String toString() {
                    return "Text(id=" + this.id + ", text=" + this.text + ", alignment=" + this.alignment + ", size=" + this.size + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.id);
                    dest.writeString(this.text);
                    Alignment alignment = this.alignment;
                    if (alignment == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        dest.writeString(alignment.name());
                    }
                    Size size = this.size;
                    if (size == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        dest.writeString(size.name());
                    }
                }

                /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"LFinancialConnectionsGenericInfoScreen$Body$Entry$Text$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "LFinancialConnectionsGenericInfoScreen$Body$Entry$Text;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Text> serializer() {
                        return FinancialConnectionsGenericInfoScreen$Body$Entry$Text$$serializer.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ Text(int i, String str, String str2, Alignment alignment, Size size, SerializationConstructorMarker serializationConstructorMarker) {
                    super(null);
                    if (3 != (i & 3)) {
                        PluginExceptionsKt.throwMissingFieldException(i, 3, FinancialConnectionsGenericInfoScreen$Body$Entry$Text$$serializer.INSTANCE.getDescriptor());
                    }
                    this.id = str;
                    this.text = str2;
                    if ((i & 4) == 0) {
                        this.alignment = null;
                    } else {
                        this.alignment = alignment;
                    }
                    if ((i & 8) == 0) {
                        this.size = null;
                    } else {
                        this.size = size;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$financial_connections_release(Text self, CompositeEncoder output, SerialDescriptor serialDesc) {
                    KSerializer<Object>[] kSerializerArr = $childSerializers;
                    output.encodeStringElement(serialDesc, 0, self.getId());
                    output.encodeStringElement(serialDesc, 1, self.text);
                    if (output.shouldEncodeElementDefault(serialDesc, 2) || self.alignment != null) {
                        output.encodeNullableSerializableElement(serialDesc, 2, kSerializerArr[2], self.alignment);
                    }
                    if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.size == null) {
                        return;
                    }
                    output.encodeNullableSerializableElement(serialDesc, 3, kSerializerArr[3], self.size);
                }

                public /* synthetic */ Text(String str, String str2, Alignment alignment, Size size, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, str2, (i & 4) != 0 ? null : alignment, (i & 8) != 0 ? null : size);
                }

                @Override // FinancialConnectionsGenericInfoScreen.Body.Entry
                public String getId() {
                    return this.id;
                }

                public final String getText() {
                    return this.text;
                }

                public final Alignment getAlignment() {
                    return this.alignment;
                }

                public final Size getSize() {
                    return this.size;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Text(String id, String text, Alignment alignment, Size size) {
                    super(null);
                    Intrinsics.checkNotNullParameter(id, "id");
                    Intrinsics.checkNotNullParameter(text, "text");
                    this.id = id;
                    this.text = text;
                    this.alignment = alignment;
                    this.size = size;
                }
            }

            /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
            @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0002*+B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\nJ\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\nHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\nJ%\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0001¢\u0006\u0002\b)R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006,"}, d2 = {"LFinancialConnectionsGenericInfoScreen$Body$Entry$Image;", "LFinancialConnectionsGenericInfoScreen$Body$Entry;", "id", "", "image", "Lcom/stripe/android/financialconnections/model/Image;", "alt", "<init>", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getImage", "()Lcom/stripe/android/financialconnections/model/Image;", "getAlt", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            @Serializable
            public static final /* data */ class Image extends Entry {
                public static final int $stable = 0;
                private final String alt;
                private final String id;
                private final com.stripe.android.financialconnections.model.Image image;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                public static final Parcelable.Creator<Image> CREATOR = new Creator();

                /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Image> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Image createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Image(parcel.readString(), com.stripe.android.financialconnections.model.Image.CREATOR.createFromParcel(parcel), parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Image[] newArray(int i) {
                        return new Image[i];
                    }
                }

                public static /* synthetic */ Image copy$default(Image image, String str, com.stripe.android.financialconnections.model.Image image2, String str2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = image.id;
                    }
                    if ((i & 2) != 0) {
                        image2 = image.image;
                    }
                    if ((i & 4) != 0) {
                        str2 = image.alt;
                    }
                    return image.copy(str, image2, str2);
                }

                /* renamed from: component1, reason: from getter */
                public final String getId() {
                    return this.id;
                }

                /* renamed from: component2, reason: from getter */
                public final com.stripe.android.financialconnections.model.Image getImage() {
                    return this.image;
                }

                /* renamed from: component3, reason: from getter */
                public final String getAlt() {
                    return this.alt;
                }

                public final Image copy(String id, com.stripe.android.financialconnections.model.Image image, String alt) {
                    Intrinsics.checkNotNullParameter(id, "id");
                    Intrinsics.checkNotNullParameter(image, "image");
                    Intrinsics.checkNotNullParameter(alt, "alt");
                    return new Image(id, image, alt);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Image)) {
                        return false;
                    }
                    Image image = (Image) other;
                    return Intrinsics.areEqual(this.id, image.id) && Intrinsics.areEqual(this.image, image.image) && Intrinsics.areEqual(this.alt, image.alt);
                }

                public int hashCode() {
                    return (((this.id.hashCode() * 31) + this.image.hashCode()) * 31) + this.alt.hashCode();
                }

                public String toString() {
                    return "Image(id=" + this.id + ", image=" + this.image + ", alt=" + this.alt + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.id);
                    this.image.writeToParcel(dest, flags);
                    dest.writeString(this.alt);
                }

                /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"LFinancialConnectionsGenericInfoScreen$Body$Entry$Image$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "LFinancialConnectionsGenericInfoScreen$Body$Entry$Image;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Image> serializer() {
                        return FinancialConnectionsGenericInfoScreen$Body$Entry$Image$$serializer.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ Image(int i, String str, com.stripe.android.financialconnections.model.Image image, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                    super(null);
                    if (7 != (i & 7)) {
                        PluginExceptionsKt.throwMissingFieldException(i, 7, FinancialConnectionsGenericInfoScreen$Body$Entry$Image$$serializer.INSTANCE.getDescriptor());
                    }
                    this.id = str;
                    this.image = image;
                    this.alt = str2;
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$financial_connections_release(Image self, CompositeEncoder output, SerialDescriptor serialDesc) {
                    output.encodeStringElement(serialDesc, 0, self.getId());
                    output.encodeSerializableElement(serialDesc, 1, Image$$serializer.INSTANCE, self.image);
                    output.encodeStringElement(serialDesc, 2, self.alt);
                }

                @Override // FinancialConnectionsGenericInfoScreen.Body.Entry
                public String getId() {
                    return this.id;
                }

                public final com.stripe.android.financialconnections.model.Image getImage() {
                    return this.image;
                }

                public final String getAlt() {
                    return this.alt;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Image(String id, com.stripe.android.financialconnections.model.Image image, String alt) {
                    super(null);
                    Intrinsics.checkNotNullParameter(id, "id");
                    Intrinsics.checkNotNullParameter(image, "image");
                    Intrinsics.checkNotNullParameter(alt, "alt");
                    this.id = id;
                    this.image = image;
                    this.alt = alt;
                }
            }

            /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
            @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 *2\u00020\u0001:\u0003()*B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\nJ\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\nHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\nJ%\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b'R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006+"}, d2 = {"LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets;", "LFinancialConnectionsGenericInfoScreen$Body$Entry;", "id", "", "bullets", "", "LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getBullets", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "GenericBulletPoint", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            @Serializable
            public static final /* data */ class Bullets extends Entry {
                private final List<GenericBulletPoint> bullets;
                private final String id;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                public static final Parcelable.Creator<Bullets> CREATOR = new Creator();
                public static final int $stable = 8;
                private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(FinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint$$serializer.INSTANCE)};

                /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Bullets> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Bullets createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        String string = parcel.readString();
                        int i = parcel.readInt();
                        ArrayList arrayList = new ArrayList(i);
                        for (int i2 = 0; i2 != i; i2++) {
                            arrayList.add(GenericBulletPoint.CREATOR.createFromParcel(parcel));
                        }
                        return new Bullets(string, arrayList);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Bullets[] newArray(int i) {
                        return new Bullets[i];
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ Bullets copy$default(Bullets bullets, String str, List list, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = bullets.id;
                    }
                    if ((i & 2) != 0) {
                        list = bullets.bullets;
                    }
                    return bullets.copy(str, list);
                }

                /* renamed from: component1, reason: from getter */
                public final String getId() {
                    return this.id;
                }

                public final List<GenericBulletPoint> component2() {
                    return this.bullets;
                }

                public final Bullets copy(String id, List<GenericBulletPoint> bullets) {
                    Intrinsics.checkNotNullParameter(id, "id");
                    Intrinsics.checkNotNullParameter(bullets, "bullets");
                    return new Bullets(id, bullets);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Bullets)) {
                        return false;
                    }
                    Bullets bullets = (Bullets) other;
                    return Intrinsics.areEqual(this.id, bullets.id) && Intrinsics.areEqual(this.bullets, bullets.bullets);
                }

                public int hashCode() {
                    return (this.id.hashCode() * 31) + this.bullets.hashCode();
                }

                public String toString() {
                    return "Bullets(id=" + this.id + ", bullets=" + this.bullets + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.id);
                    List<GenericBulletPoint> list = this.bullets;
                    dest.writeInt(list.size());
                    Iterator<GenericBulletPoint> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().writeToParcel(dest, flags);
                    }
                }

                /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Bullets> serializer() {
                        return FinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$$serializer.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ Bullets(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
                    super(null);
                    if (3 != (i & 3)) {
                        PluginExceptionsKt.throwMissingFieldException(i, 3, FinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$$serializer.INSTANCE.getDescriptor());
                    }
                    this.id = str;
                    this.bullets = list;
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$financial_connections_release(Bullets self, CompositeEncoder output, SerialDescriptor serialDesc) {
                    KSerializer<Object>[] kSerializerArr = $childSerializers;
                    output.encodeStringElement(serialDesc, 0, self.getId());
                    output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.bullets);
                }

                @Override // FinancialConnectionsGenericInfoScreen.Body.Entry
                public String getId() {
                    return this.id;
                }

                /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
                @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 02\u00020\u0001:\u0002/0B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u000bJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u000bHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u000bJ%\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0001¢\u0006\u0002\b.R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010¨\u00061"}, d2 = {"LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint;", "Landroid/os/Parcelable;", "id", "", PaymentSheetAppearanceKeys.ICON, "Lcom/stripe/android/financialconnections/model/Image;", "title", UriUtil.LOCAL_CONTENT_SCHEME, "<init>", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getIcon", "()Lcom/stripe/android/financialconnections/model/Image;", "getTitle", "getContent$annotations", "()V", "getContent", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                @Serializable
                public static final /* data */ class GenericBulletPoint implements Parcelable {
                    public static final int $stable = 0;
                    private final String content;
                    private final com.stripe.android.financialconnections.model.Image icon;
                    private final String id;
                    private final String title;

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);
                    public static final Parcelable.Creator<GenericBulletPoint> CREATOR = new Creator();

                    /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<GenericBulletPoint> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final GenericBulletPoint createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new GenericBulletPoint(parcel.readString(), parcel.readInt() == 0 ? null : com.stripe.android.financialconnections.model.Image.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final GenericBulletPoint[] newArray(int i) {
                            return new GenericBulletPoint[i];
                        }
                    }

                    public static /* synthetic */ GenericBulletPoint copy$default(GenericBulletPoint genericBulletPoint, String str, com.stripe.android.financialconnections.model.Image image, String str2, String str3, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = genericBulletPoint.id;
                        }
                        if ((i & 2) != 0) {
                            image = genericBulletPoint.icon;
                        }
                        if ((i & 4) != 0) {
                            str2 = genericBulletPoint.title;
                        }
                        if ((i & 8) != 0) {
                            str3 = genericBulletPoint.content;
                        }
                        return genericBulletPoint.copy(str, image, str2, str3);
                    }

                    @Serializable(with = MarkdownToHtmlSerializer.class)
                    public static /* synthetic */ void getContent$annotations() {
                    }

                    /* renamed from: component1, reason: from getter */
                    public final String getId() {
                        return this.id;
                    }

                    /* renamed from: component2, reason: from getter */
                    public final com.stripe.android.financialconnections.model.Image getIcon() {
                        return this.icon;
                    }

                    /* renamed from: component3, reason: from getter */
                    public final String getTitle() {
                        return this.title;
                    }

                    /* renamed from: component4, reason: from getter */
                    public final String getContent() {
                        return this.content;
                    }

                    public final GenericBulletPoint copy(String id, com.stripe.android.financialconnections.model.Image icon, String title, String content) {
                        Intrinsics.checkNotNullParameter(id, "id");
                        return new GenericBulletPoint(id, icon, title, content);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof GenericBulletPoint)) {
                            return false;
                        }
                        GenericBulletPoint genericBulletPoint = (GenericBulletPoint) other;
                        return Intrinsics.areEqual(this.id, genericBulletPoint.id) && Intrinsics.areEqual(this.icon, genericBulletPoint.icon) && Intrinsics.areEqual(this.title, genericBulletPoint.title) && Intrinsics.areEqual(this.content, genericBulletPoint.content);
                    }

                    public int hashCode() {
                        int iHashCode = this.id.hashCode() * 31;
                        com.stripe.android.financialconnections.model.Image image = this.icon;
                        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
                        String str = this.title;
                        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                        String str2 = this.content;
                        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
                    }

                    public String toString() {
                        return "GenericBulletPoint(id=" + this.id + ", icon=" + this.icon + ", title=" + this.title + ", content=" + this.content + ")";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int flags) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeString(this.id);
                        com.stripe.android.financialconnections.model.Image image = this.icon;
                        if (image == null) {
                            dest.writeInt(0);
                        } else {
                            dest.writeInt(1);
                            image.writeToParcel(dest, flags);
                        }
                        dest.writeString(this.title);
                        dest.writeString(this.content);
                    }

                    /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
                    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                    public static final class Companion {
                        private Companion() {
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final KSerializer<GenericBulletPoint> serializer() {
                            return FinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint$$serializer.INSTANCE;
                        }
                    }

                    public /* synthetic */ GenericBulletPoint(int i, String str, com.stripe.android.financialconnections.model.Image image, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
                        if (1 != (i & 1)) {
                            PluginExceptionsKt.throwMissingFieldException(i, 1, FinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint$$serializer.INSTANCE.getDescriptor());
                        }
                        this.id = str;
                        if ((i & 2) == 0) {
                            this.icon = null;
                        } else {
                            this.icon = image;
                        }
                        if ((i & 4) == 0) {
                            this.title = null;
                        } else {
                            this.title = str2;
                        }
                        if ((i & 8) == 0) {
                            this.content = null;
                        } else {
                            this.content = str3;
                        }
                    }

                    @JvmStatic
                    public static final /* synthetic */ void write$Self$financial_connections_release(GenericBulletPoint self, CompositeEncoder output, SerialDescriptor serialDesc) {
                        output.encodeStringElement(serialDesc, 0, self.id);
                        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.icon != null) {
                            output.encodeNullableSerializableElement(serialDesc, 1, Image$$serializer.INSTANCE, self.icon);
                        }
                        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.title != null) {
                            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.title);
                        }
                        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.content == null) {
                            return;
                        }
                        output.encodeNullableSerializableElement(serialDesc, 3, MarkdownToHtmlSerializer.INSTANCE, self.content);
                    }

                    public GenericBulletPoint(String id, com.stripe.android.financialconnections.model.Image image, String str, String str2) {
                        Intrinsics.checkNotNullParameter(id, "id");
                        this.id = id;
                        this.icon = image;
                        this.title = str;
                        this.content = str2;
                    }

                    public /* synthetic */ GenericBulletPoint(String str, com.stripe.android.financialconnections.model.Image image, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this(str, (i & 2) != 0 ? null : image, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
                    }

                    public final String getId() {
                        return this.id;
                    }

                    public final com.stripe.android.financialconnections.model.Image getIcon() {
                        return this.icon;
                    }

                    public final String getTitle() {
                        return this.title;
                    }

                    public final String getContent() {
                        return this.content;
                    }
                }

                public final List<GenericBulletPoint> getBullets() {
                    return this.bullets;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Bullets(String id, List<GenericBulletPoint> bullets) {
                    super(null);
                    Intrinsics.checkNotNullParameter(id, "id");
                    Intrinsics.checkNotNullParameter(bullets, "bullets");
                    this.id = id;
                    this.bullets = bullets;
                }
            }

            /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
            @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0007J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0007J%\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0001¢\u0006\u0002\b!R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006$"}, d2 = {"LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;", "LFinancialConnectionsGenericInfoScreen$Body$Entry;", "id", "", "<init>", "(Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            @Serializable
            public static final /* data */ class Unknown extends Entry {
                private final String id;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                public static final Parcelable.Creator<Unknown> CREATOR = new Creator();
                public static final int $stable = 8;

                /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Unknown> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Unknown createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Unknown(parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Unknown[] newArray(int i) {
                        return new Unknown[i];
                    }
                }

                public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = unknown.id;
                    }
                    return unknown.copy(str);
                }

                /* renamed from: component1, reason: from getter */
                public final String getId() {
                    return this.id;
                }

                public final Unknown copy(String id) {
                    Intrinsics.checkNotNullParameter(id, "id");
                    return new Unknown(id);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Unknown) && Intrinsics.areEqual(this.id, ((Unknown) other).id);
                }

                public int hashCode() {
                    return this.id.hashCode();
                }

                public String toString() {
                    return "Unknown(id=" + this.id + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.id);
                }

                /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Unknown> serializer() {
                        return FinancialConnectionsGenericInfoScreen$Body$Entry$Unknown$$serializer.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ Unknown(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                    super(null);
                    if (1 != (i & 1)) {
                        PluginExceptionsKt.throwMissingFieldException(i, 1, FinancialConnectionsGenericInfoScreen$Body$Entry$Unknown$$serializer.INSTANCE.getDescriptor());
                    }
                    this.id = str;
                }

                @Override // FinancialConnectionsGenericInfoScreen.Body.Entry
                public String getId() {
                    return this.id;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Unknown(String id) {
                    super(null);
                    Intrinsics.checkNotNullParameter(id, "id");
                    this.id = id;
                }
            }
        }
    }

    /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 42\u00020\u0001:\u0003234B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001f\u001a\u00020\u000bJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u000bHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u000bJ%\u0010+\u001a\u00020'2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0001¢\u0006\u0002\b1R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0015R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012¨\u00065"}, d2 = {"LFinancialConnectionsGenericInfoScreen$Footer;", "Landroid/os/Parcelable;", "disclaimer", "", "primaryCta", "LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;", "secondaryCta", "belowCta", "<init>", "(Ljava/lang/String;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getDisclaimer$annotations", "()V", "getDisclaimer", "()Ljava/lang/String;", "getPrimaryCta$annotations", "getPrimaryCta", "()LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;", "getSecondaryCta$annotations", "getSecondaryCta", "getBelowCta$annotations", "getBelowCta", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "GenericInfoAction", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    /* loaded from: classes5.dex */
    public static final /* data */ class Footer implements Parcelable {
        public static final int $stable = 0;
        private final String belowCta;
        private final String disclaimer;
        private final GenericInfoAction primaryCta;
        private final GenericInfoAction secondaryCta;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Footer> CREATOR = new Creator();

        /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Footer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Footer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Footer(parcel.readString(), parcel.readInt() == 0 ? null : GenericInfoAction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GenericInfoAction.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Footer[] newArray(int i) {
                return new Footer[i];
            }
        }

        public Footer() {
            this((String) null, (GenericInfoAction) null, (GenericInfoAction) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Footer copy$default(Footer footer, String str, GenericInfoAction genericInfoAction, GenericInfoAction genericInfoAction2, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = footer.disclaimer;
            }
            if ((i & 2) != 0) {
                genericInfoAction = footer.primaryCta;
            }
            if ((i & 4) != 0) {
                genericInfoAction2 = footer.secondaryCta;
            }
            if ((i & 8) != 0) {
                str2 = footer.belowCta;
            }
            return footer.copy(str, genericInfoAction, genericInfoAction2, str2);
        }

        @SerialName("below_cta")
        public static /* synthetic */ void getBelowCta$annotations() {
        }

        @Serializable(with = MarkdownToHtmlSerializer.class)
        public static /* synthetic */ void getDisclaimer$annotations() {
        }

        @SerialName("primary_cta")
        public static /* synthetic */ void getPrimaryCta$annotations() {
        }

        @SerialName("secondary_cta")
        public static /* synthetic */ void getSecondaryCta$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getDisclaimer() {
            return this.disclaimer;
        }

        /* renamed from: component2, reason: from getter */
        public final GenericInfoAction getPrimaryCta() {
            return this.primaryCta;
        }

        /* renamed from: component3, reason: from getter */
        public final GenericInfoAction getSecondaryCta() {
            return this.secondaryCta;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBelowCta() {
            return this.belowCta;
        }

        public final Footer copy(String disclaimer, GenericInfoAction primaryCta, GenericInfoAction secondaryCta, String belowCta) {
            return new Footer(disclaimer, primaryCta, secondaryCta, belowCta);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Footer)) {
                return false;
            }
            Footer footer = (Footer) other;
            return Intrinsics.areEqual(this.disclaimer, footer.disclaimer) && Intrinsics.areEqual(this.primaryCta, footer.primaryCta) && Intrinsics.areEqual(this.secondaryCta, footer.secondaryCta) && Intrinsics.areEqual(this.belowCta, footer.belowCta);
        }

        public int hashCode() {
            String str = this.disclaimer;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            GenericInfoAction genericInfoAction = this.primaryCta;
            int iHashCode2 = (iHashCode + (genericInfoAction == null ? 0 : genericInfoAction.hashCode())) * 31;
            GenericInfoAction genericInfoAction2 = this.secondaryCta;
            int iHashCode3 = (iHashCode2 + (genericInfoAction2 == null ? 0 : genericInfoAction2.hashCode())) * 31;
            String str2 = this.belowCta;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Footer(disclaimer=" + this.disclaimer + ", primaryCta=" + this.primaryCta + ", secondaryCta=" + this.secondaryCta + ", belowCta=" + this.belowCta + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.disclaimer);
            GenericInfoAction genericInfoAction = this.primaryCta;
            if (genericInfoAction == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                genericInfoAction.writeToParcel(dest, flags);
            }
            GenericInfoAction genericInfoAction2 = this.secondaryCta;
            if (genericInfoAction2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                genericInfoAction2.writeToParcel(dest, flags);
            }
            dest.writeString(this.belowCta);
        }

        /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"LFinancialConnectionsGenericInfoScreen$Footer$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "LFinancialConnectionsGenericInfoScreen$Footer;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Footer> serializer() {
                return FinancialConnectionsGenericInfoScreen$Footer$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Footer(int i, String str, GenericInfoAction genericInfoAction, GenericInfoAction genericInfoAction2, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.disclaimer = null;
            } else {
                this.disclaimer = str;
            }
            if ((i & 2) == 0) {
                this.primaryCta = null;
            } else {
                this.primaryCta = genericInfoAction;
            }
            if ((i & 4) == 0) {
                this.secondaryCta = null;
            } else {
                this.secondaryCta = genericInfoAction2;
            }
            if ((i & 8) == 0) {
                this.belowCta = null;
            } else {
                this.belowCta = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$financial_connections_release(Footer self, CompositeEncoder output, SerialDescriptor serialDesc) {
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.disclaimer != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, MarkdownToHtmlSerializer.INSTANCE, self.disclaimer);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.primaryCta != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, FinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction$$serializer.INSTANCE, self.primaryCta);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.secondaryCta != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, FinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction$$serializer.INSTANCE, self.secondaryCta);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.belowCta == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.belowCta);
        }

        public Footer(String str, GenericInfoAction genericInfoAction, GenericInfoAction genericInfoAction2, String str2) {
            this.disclaimer = str;
            this.primaryCta = genericInfoAction;
            this.secondaryCta = genericInfoAction2;
            this.belowCta = str2;
        }

        public /* synthetic */ Footer(String str, GenericInfoAction genericInfoAction, GenericInfoAction genericInfoAction2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : genericInfoAction, (i & 4) != 0 ? null : genericInfoAction2, (i & 8) != 0 ? null : str2);
        }

        public final String getDisclaimer() {
            return this.disclaimer;
        }

        public final GenericInfoAction getPrimaryCta() {
            return this.primaryCta;
        }

        public final GenericInfoAction getSecondaryCta() {
            return this.secondaryCta;
        }

        public final String getBelowCta() {
            return this.belowCta;
        }

        /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
        @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0002*+B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\nJ\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\nHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\nJ%\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0001¢\u0006\u0002\b)R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006,"}, d2 = {"LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;", "Landroid/os/Parcelable;", "id", "", "label", PaymentSheetAppearanceKeys.ICON, "Lcom/stripe/android/financialconnections/model/Image;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getLabel", "getIcon", "()Lcom/stripe/android/financialconnections/model/Image;", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @Serializable
        public static final /* data */ class GenericInfoAction implements Parcelable {
            public static final int $stable = 0;
            private final Image icon;
            private final String id;
            private final String label;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final Parcelable.Creator<GenericInfoAction> CREATOR = new Creator();

            /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<GenericInfoAction> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GenericInfoAction createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new GenericInfoAction(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GenericInfoAction[] newArray(int i) {
                    return new GenericInfoAction[i];
                }
            }

            public static /* synthetic */ GenericInfoAction copy$default(GenericInfoAction genericInfoAction, String str, String str2, Image image, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = genericInfoAction.id;
                }
                if ((i & 2) != 0) {
                    str2 = genericInfoAction.label;
                }
                if ((i & 4) != 0) {
                    image = genericInfoAction.icon;
                }
                return genericInfoAction.copy(str, str2, image);
            }

            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* renamed from: component2, reason: from getter */
            public final String getLabel() {
                return this.label;
            }

            /* renamed from: component3, reason: from getter */
            public final Image getIcon() {
                return this.icon;
            }

            public final GenericInfoAction copy(String id, String label, Image icon) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(label, "label");
                return new GenericInfoAction(id, label, icon);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GenericInfoAction)) {
                    return false;
                }
                GenericInfoAction genericInfoAction = (GenericInfoAction) other;
                return Intrinsics.areEqual(this.id, genericInfoAction.id) && Intrinsics.areEqual(this.label, genericInfoAction.label) && Intrinsics.areEqual(this.icon, genericInfoAction.icon);
            }

            public int hashCode() {
                int iHashCode = ((this.id.hashCode() * 31) + this.label.hashCode()) * 31;
                Image image = this.icon;
                return iHashCode + (image == null ? 0 : image.hashCode());
            }

            public String toString() {
                return "GenericInfoAction(id=" + this.id + ", label=" + this.label + ", icon=" + this.icon + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.id);
                dest.writeString(this.label);
                Image image = this.icon;
                if (image == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    image.writeToParcel(dest, flags);
                }
            }

            /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<GenericInfoAction> serializer() {
                    return FinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ GenericInfoAction(int i, String str, String str2, Image image, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptionsKt.throwMissingFieldException(i, 3, FinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction$$serializer.INSTANCE.getDescriptor());
                }
                this.id = str;
                this.label = str2;
                if ((i & 4) == 0) {
                    this.icon = null;
                } else {
                    this.icon = image;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$financial_connections_release(GenericInfoAction self, CompositeEncoder output, SerialDescriptor serialDesc) {
                output.encodeStringElement(serialDesc, 0, self.id);
                output.encodeStringElement(serialDesc, 1, self.label);
                if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.icon == null) {
                    return;
                }
                output.encodeNullableSerializableElement(serialDesc, 2, Image$$serializer.INSTANCE, self.icon);
            }

            public GenericInfoAction(String id, String label, Image image) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(label, "label");
                this.id = id;
                this.label = label;
                this.icon = image;
            }

            public /* synthetic */ GenericInfoAction(String str, String str2, Image image, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i & 4) != 0 ? null : image);
            }

            public final String getId() {
                return this.id;
            }

            public final String getLabel() {
                return this.label;
            }

            public final Image getIcon() {
                return this.icon;
            }
        }
    }

    /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 -2\u00020\u0001:\u0002,-B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\tJ\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\tHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\tJ%\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\b+R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0011\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0014¨\u0006."}, d2 = {"LFinancialConnectionsGenericInfoScreen$Options;", "Landroid/os/Parcelable;", "fullWidthContent", "", "verticalAlignment", "LVerticalAlignment;", "<init>", "(Ljava/lang/Boolean;LVerticalAlignment;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Boolean;LVerticalAlignment;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getFullWidthContent$annotations", "()V", "getFullWidthContent", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getVerticalAlignment$annotations", "getVerticalAlignment", "()LVerticalAlignment;", "component1", "component2", "copy", "(Ljava/lang/Boolean;LVerticalAlignment;)LFinancialConnectionsGenericInfoScreen$Options;", "describeContents", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    /* loaded from: classes5.dex */
    public static final /* data */ class Options implements Parcelable {
        private final Boolean fullWidthContent;
        private final VerticalAlignment verticalAlignment;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Options> CREATOR = new Creator();
        public static final int $stable = 8;
        private static final KSerializer<Object>[] $childSerializers = {null, VerticalAlignment.INSTANCE.serializer()};

        /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Options> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Options createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Options(boolValueOf, parcel.readInt() != 0 ? VerticalAlignment.valueOf(parcel.readString()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Options[] newArray(int i) {
                return new Options[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Options() {
            this((Boolean) null, (VerticalAlignment) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Options copy$default(Options options, Boolean bool, VerticalAlignment verticalAlignment, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = options.fullWidthContent;
            }
            if ((i & 2) != 0) {
                verticalAlignment = options.verticalAlignment;
            }
            return options.copy(bool, verticalAlignment);
        }

        @SerialName("full_width_content")
        public static /* synthetic */ void getFullWidthContent$annotations() {
        }

        @SerialName("vertical_alignment")
        public static /* synthetic */ void getVerticalAlignment$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getFullWidthContent() {
            return this.fullWidthContent;
        }

        /* renamed from: component2, reason: from getter */
        public final VerticalAlignment getVerticalAlignment() {
            return this.verticalAlignment;
        }

        public final Options copy(Boolean fullWidthContent, VerticalAlignment verticalAlignment) {
            return new Options(fullWidthContent, verticalAlignment);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Options)) {
                return false;
            }
            Options options = (Options) other;
            return Intrinsics.areEqual(this.fullWidthContent, options.fullWidthContent) && this.verticalAlignment == options.verticalAlignment;
        }

        public int hashCode() {
            Boolean bool = this.fullWidthContent;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            VerticalAlignment verticalAlignment = this.verticalAlignment;
            return iHashCode + (verticalAlignment != null ? verticalAlignment.hashCode() : 0);
        }

        public String toString() {
            return "Options(fullWidthContent=" + this.fullWidthContent + ", verticalAlignment=" + this.verticalAlignment + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Boolean bool = this.fullWidthContent;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
            VerticalAlignment verticalAlignment = this.verticalAlignment;
            if (verticalAlignment == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(verticalAlignment.name());
            }
        }

        /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"LFinancialConnectionsGenericInfoScreen$Options$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "LFinancialConnectionsGenericInfoScreen$Options;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Options> serializer() {
                return FinancialConnectionsGenericInfoScreen$Options$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Options(int i, Boolean bool, VerticalAlignment verticalAlignment, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.fullWidthContent = null;
            } else {
                this.fullWidthContent = bool;
            }
            if ((i & 2) == 0) {
                this.verticalAlignment = null;
            } else {
                this.verticalAlignment = verticalAlignment;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$financial_connections_release(Options self, CompositeEncoder output, SerialDescriptor serialDesc) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.fullWidthContent != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.fullWidthContent);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.verticalAlignment == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 1, kSerializerArr[1], self.verticalAlignment);
        }

        public Options(Boolean bool, VerticalAlignment verticalAlignment) {
            this.fullWidthContent = bool;
            this.verticalAlignment = verticalAlignment;
        }

        public /* synthetic */ Options(Boolean bool, VerticalAlignment verticalAlignment, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : verticalAlignment);
        }

        public final Boolean getFullWidthContent() {
            return this.fullWidthContent;
        }

        public final VerticalAlignment getVerticalAlignment() {
            return this.verticalAlignment;
        }
    }
}
