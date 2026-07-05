package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchGroupCollection;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.apache.commons.io.FilenameUtils;

/* compiled from: FinancialConnectionsInstitution.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0002IJBW\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u0010Bg\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0014J\t\u0010-\u001a\u00020\u0004HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u0004HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010'J\u000b\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003Jf\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u00106J\u0006\u00107\u001a\u00020\rJ\u0013\u00108\u001a\u00020\u00042\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010;\u001a\u00020\rHÖ\u0001J\t\u0010<\u001a\u00020\u0006HÖ\u0001J\u0016\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\rJ%\u0010B\u001a\u00020>2\u0006\u0010C\u001a\u00020\u00002\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GH\u0001¢\u0006\u0002\bHR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u001c\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u001bR\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\"R \u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010(\u0012\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010'R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u0016\u001a\u0004\b*\u0010\u001bR\u0011\u0010+\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b,\u0010\u001b¨\u0006K"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "featured", "", "id", "", "mobileHandoffCapable", "name", PaymentSheetAppearanceKeys.ICON, "Lcom/stripe/android/financialconnections/model/Image;", "logo", "featuredOrder", "", "url", "<init>", "(ZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getFeatured$annotations", "()V", "getFeatured", "()Z", "getId$annotations", "getId", "()Ljava/lang/String;", "getMobileHandoffCapable$annotations", "getMobileHandoffCapable", "getName$annotations", "getName", "getIcon$annotations", "getIcon", "()Lcom/stripe/android/financialconnections/model/Image;", "getLogo$annotations", "getLogo", "getFeaturedOrder$annotations", "getFeaturedOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUrl$annotations", "getUrl", "formattedUrl", "getFormattedUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/Integer;Ljava/lang/String;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "describeContents", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class FinancialConnectionsInstitution implements Parcelable, java.io.Serializable {
    public static final int $stable = 0;
    private final boolean featured;
    private final Integer featuredOrder;
    private final Image icon;
    private final String id;
    private final Image logo;
    private final boolean mobileHandoffCapable;
    private final String name;
    private final String url;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<FinancialConnectionsInstitution> CREATOR = new Creator();

    /* compiled from: FinancialConnectionsInstitution.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FinancialConnectionsInstitution> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsInstitution createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z3 = true;
            if (parcel.readInt() != 0) {
                z = true;
                z2 = false;
            } else {
                z = true;
                z3 = false;
                z2 = false;
            }
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = z;
            }
            return new FinancialConnectionsInstitution(z3, string, z2, parcel.readString(), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsInstitution[] newArray(int i) {
            return new FinancialConnectionsInstitution[i];
        }
    }

    public static /* synthetic */ FinancialConnectionsInstitution copy$default(FinancialConnectionsInstitution financialConnectionsInstitution, boolean z, String str, boolean z2, String str2, Image image, Image image2, Integer num, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = financialConnectionsInstitution.featured;
        }
        if ((i & 2) != 0) {
            str = financialConnectionsInstitution.id;
        }
        if ((i & 4) != 0) {
            z2 = financialConnectionsInstitution.mobileHandoffCapable;
        }
        if ((i & 8) != 0) {
            str2 = financialConnectionsInstitution.name;
        }
        if ((i & 16) != 0) {
            image = financialConnectionsInstitution.icon;
        }
        if ((i & 32) != 0) {
            image2 = financialConnectionsInstitution.logo;
        }
        if ((i & 64) != 0) {
            num = financialConnectionsInstitution.featuredOrder;
        }
        if ((i & 128) != 0) {
            str3 = financialConnectionsInstitution.url;
        }
        Integer num2 = num;
        String str4 = str3;
        Image image3 = image;
        Image image4 = image2;
        return financialConnectionsInstitution.copy(z, str, z2, str2, image3, image4, num2, str4);
    }

    @SerialName("featured")
    public static /* synthetic */ void getFeatured$annotations() {
    }

    @SerialName("featured_order")
    public static /* synthetic */ void getFeaturedOrder$annotations() {
    }

    @SerialName(PaymentSheetAppearanceKeys.ICON)
    public static /* synthetic */ void getIcon$annotations() {
    }

    @SerialName("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName("logo")
    public static /* synthetic */ void getLogo$annotations() {
    }

    @SerialName("mobile_handoff_capable")
    public static /* synthetic */ void getMobileHandoffCapable$annotations() {
    }

    @SerialName("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @SerialName("url")
    public static /* synthetic */ void getUrl$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getFeatured() {
        return this.featured;
    }

    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getMobileHandoffCapable() {
        return this.mobileHandoffCapable;
    }

    /* renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component5, reason: from getter */
    public final Image getIcon() {
        return this.icon;
    }

    /* renamed from: component6, reason: from getter */
    public final Image getLogo() {
        return this.logo;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getFeaturedOrder() {
        return this.featuredOrder;
    }

    /* renamed from: component8, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final FinancialConnectionsInstitution copy(boolean featured, String id, boolean mobileHandoffCapable, String name, Image icon, Image logo, Integer featuredOrder, String url) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        return new FinancialConnectionsInstitution(featured, id, mobileHandoffCapable, name, icon, logo, featuredOrder, url);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinancialConnectionsInstitution)) {
            return false;
        }
        FinancialConnectionsInstitution financialConnectionsInstitution = (FinancialConnectionsInstitution) other;
        return this.featured == financialConnectionsInstitution.featured && Intrinsics.areEqual(this.id, financialConnectionsInstitution.id) && this.mobileHandoffCapable == financialConnectionsInstitution.mobileHandoffCapable && Intrinsics.areEqual(this.name, financialConnectionsInstitution.name) && Intrinsics.areEqual(this.icon, financialConnectionsInstitution.icon) && Intrinsics.areEqual(this.logo, financialConnectionsInstitution.logo) && Intrinsics.areEqual(this.featuredOrder, financialConnectionsInstitution.featuredOrder) && Intrinsics.areEqual(this.url, financialConnectionsInstitution.url);
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.featured) * 31) + this.id.hashCode()) * 31) + Boolean.hashCode(this.mobileHandoffCapable)) * 31) + this.name.hashCode()) * 31;
        Image image = this.icon;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.logo;
        int iHashCode3 = (iHashCode2 + (image2 == null ? 0 : image2.hashCode())) * 31;
        Integer num = this.featuredOrder;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.url;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "FinancialConnectionsInstitution(featured=" + this.featured + ", id=" + this.id + ", mobileHandoffCapable=" + this.mobileHandoffCapable + ", name=" + this.name + ", icon=" + this.icon + ", logo=" + this.logo + ", featuredOrder=" + this.featuredOrder + ", url=" + this.url + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.featured ? 1 : 0);
        dest.writeString(this.id);
        dest.writeInt(this.mobileHandoffCapable ? 1 : 0);
        dest.writeString(this.name);
        Image image = this.icon;
        if (image == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            image.writeToParcel(dest, flags);
        }
        Image image2 = this.logo;
        if (image2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            image2.writeToParcel(dest, flags);
        }
        Integer num = this.featuredOrder;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.url);
    }

    /* compiled from: FinancialConnectionsInstitution.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FinancialConnectionsInstitution> serializer() {
            return FinancialConnectionsInstitution$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FinancialConnectionsInstitution(int i, boolean z, String str, boolean z2, String str2, Image image, Image image2, Integer num, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, FinancialConnectionsInstitution$$serializer.INSTANCE.getDescriptor());
        }
        this.featured = z;
        this.id = str;
        this.mobileHandoffCapable = z2;
        this.name = str2;
        if ((i & 16) == 0) {
            this.icon = null;
        } else {
            this.icon = image;
        }
        if ((i & 32) == 0) {
            this.logo = null;
        } else {
            this.logo = image2;
        }
        if ((i & 64) == 0) {
            this.featuredOrder = null;
        } else {
            this.featuredOrder = num;
        }
        if ((i & 128) == 0) {
            this.url = null;
        } else {
            this.url = str3;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$financial_connections_release(FinancialConnectionsInstitution self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.featured);
        output.encodeStringElement(serialDesc, 1, self.id);
        output.encodeBooleanElement(serialDesc, 2, self.mobileHandoffCapable);
        output.encodeStringElement(serialDesc, 3, self.name);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, Image$$serializer.INSTANCE, self.icon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.logo != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, Image$$serializer.INSTANCE, self.logo);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.featuredOrder != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, IntSerializer.INSTANCE, self.featuredOrder);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.url == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.url);
    }

    public FinancialConnectionsInstitution(boolean z, String id, boolean z2, String name, Image image, Image image2, Integer num, String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.featured = z;
        this.id = id;
        this.mobileHandoffCapable = z2;
        this.name = name;
        this.icon = image;
        this.logo = image2;
        this.featuredOrder = num;
        this.url = str;
    }

    public /* synthetic */ FinancialConnectionsInstitution(boolean z, String str, boolean z2, String str2, Image image, Image image2, Integer num, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, z2, str2, (i & 16) != 0 ? null : image, (i & 32) != 0 ? null : image2, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : str3);
    }

    public final boolean getFeatured() {
        return this.featured;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getMobileHandoffCapable() {
        return this.mobileHandoffCapable;
    }

    public final String getName() {
        return this.name;
    }

    public final Image getIcon() {
        return this.icon;
    }

    public final Image getLogo() {
        return this.logo;
    }

    public final Integer getFeaturedOrder() {
        return this.featuredOrder;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getFormattedUrl() {
        MatchResult matchResultFind$default;
        MatchGroupCollection groups;
        MatchGroup matchGroup;
        String value;
        try {
            Result.Companion companion = Result.INSTANCE;
            FinancialConnectionsInstitution financialConnectionsInstitution = this;
            Regex regex = new Regex("^(?:https?://)?(?:www\\.|[^@\\n]+@)?([^:/\\n]+)");
            String str = this.url;
            if (str != null && (matchResultFind$default = Regex.find$default(regex, str, 0, 2, null)) != null && (groups = matchResultFind$default.getGroups()) != null && (matchGroup = groups.get(1)) != null && (value = matchGroup.getValue()) != null) {
                List listSplit$default = StringsKt.split$default((CharSequence) value, new char[]{FilenameUtils.EXTENSION_SEPARATOR}, false, 0, 6, (Object) null);
                int size = listSplit$default.size();
                if (size > 2) {
                    int i = size - 2;
                    if (((String) listSplit$default.get(i)).length() <= 3) {
                        int i2 = size - 1;
                        if (((String) listSplit$default.get(i2)).length() <= 2) {
                            return listSplit$default.get(size - 3) + "." + listSplit$default.get(i) + "." + listSplit$default.get(i2);
                        }
                    }
                }
                return listSplit$default.get(size - 2) + "." + listSplit$default.get(size - 1);
            }
            return "";
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Object objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            String str2 = this.url;
            String str3 = str2 != null ? str2 : "";
            if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
                objM9118constructorimpl = str3;
            }
            return (String) objM9118constructorimpl;
        }
    }
}
