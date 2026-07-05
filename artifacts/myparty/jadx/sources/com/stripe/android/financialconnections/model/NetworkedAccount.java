package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.share.internal.ShareConstants;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: TextUpdate.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 L2\u00020\u0001:\u0002KLBk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011Bs\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0010\u0010\u0016J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jq\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0006\u00109\u001a\u00020\u0013J\u0013\u0010:\u001a\u00020\u00052\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u00020\u0013HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001J\u0016\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u0013J%\u0010D\u001a\u00020@2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020IH\u0001¢\u0006\u0002\bJR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001aR\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010$R\u001e\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010$R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u0018\u001a\u0004\b(\u0010$R\u001e\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u0018\u001a\u0004\b*\u0010+R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u0018\u001a\u0004\b-\u0010.¨\u0006M"}, d2 = {"Lcom/stripe/android/financialconnections/model/NetworkedAccount;", "Landroid/os/Parcelable;", "id", "", "allowSelection", "", ShareConstants.FEED_CAPTION_PARAM, "selectionCta", PaymentSheetAppearanceKeys.ICON, "Lcom/stripe/android/financialconnections/model/Image;", "selectionCtaIcon", "accountIcon", "dataAccessNotice", "Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "drawerOnSelection", "LFinancialConnectionsGenericInfoScreen;", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/DataAccessNotice;LFinancialConnectionsGenericInfoScreen;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/DataAccessNotice;LFinancialConnectionsGenericInfoScreen;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getAllowSelection$annotations", "getAllowSelection", "()Z", "getCaption$annotations", "getCaption", "getSelectionCta$annotations", "getSelectionCta", "getIcon$annotations", "getIcon", "()Lcom/stripe/android/financialconnections/model/Image;", "getSelectionCtaIcon$annotations", "getSelectionCtaIcon", "getAccountIcon$annotations", "getAccountIcon", "getDataAccessNotice$annotations", "getDataAccessNotice", "()Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "getDrawerOnSelection$annotations", "getDrawerOnSelection", "()LFinancialConnectionsGenericInfoScreen;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class NetworkedAccount implements Parcelable {
    private final Image accountIcon;
    private final boolean allowSelection;
    private final String caption;
    private final DataAccessNotice dataAccessNotice;
    private final FinancialConnectionsGenericInfoScreen drawerOnSelection;
    private final Image icon;
    private final String id;
    private final String selectionCta;
    private final Image selectionCtaIcon;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<NetworkedAccount> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: TextUpdate.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NetworkedAccount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NetworkedAccount createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NetworkedAccount(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DataAccessNotice.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FinancialConnectionsGenericInfoScreen.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NetworkedAccount[] newArray(int i) {
            return new NetworkedAccount[i];
        }
    }

    public static /* synthetic */ NetworkedAccount copy$default(NetworkedAccount networkedAccount, String str, boolean z, String str2, String str3, Image image, Image image2, Image image3, DataAccessNotice dataAccessNotice, FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkedAccount.id;
        }
        if ((i & 2) != 0) {
            z = networkedAccount.allowSelection;
        }
        if ((i & 4) != 0) {
            str2 = networkedAccount.caption;
        }
        if ((i & 8) != 0) {
            str3 = networkedAccount.selectionCta;
        }
        if ((i & 16) != 0) {
            image = networkedAccount.icon;
        }
        if ((i & 32) != 0) {
            image2 = networkedAccount.selectionCtaIcon;
        }
        if ((i & 64) != 0) {
            image3 = networkedAccount.accountIcon;
        }
        if ((i & 128) != 0) {
            dataAccessNotice = networkedAccount.dataAccessNotice;
        }
        if ((i & 256) != 0) {
            financialConnectionsGenericInfoScreen = networkedAccount.drawerOnSelection;
        }
        DataAccessNotice dataAccessNotice2 = dataAccessNotice;
        FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen2 = financialConnectionsGenericInfoScreen;
        Image image4 = image2;
        Image image5 = image3;
        Image image6 = image;
        String str4 = str2;
        return networkedAccount.copy(str, z, str4, str3, image6, image4, image5, dataAccessNotice2, financialConnectionsGenericInfoScreen2);
    }

    @SerialName("account_icon")
    public static /* synthetic */ void getAccountIcon$annotations() {
    }

    @SerialName("allow_selection")
    public static /* synthetic */ void getAllowSelection$annotations() {
    }

    @SerialName(ShareConstants.FEED_CAPTION_PARAM)
    public static /* synthetic */ void getCaption$annotations() {
    }

    @SerialName("data_access_notice")
    public static /* synthetic */ void getDataAccessNotice$annotations() {
    }

    @SerialName("drawer_on_selection")
    public static /* synthetic */ void getDrawerOnSelection$annotations() {
    }

    @SerialName(PaymentSheetAppearanceKeys.ICON)
    public static /* synthetic */ void getIcon$annotations() {
    }

    @SerialName("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName("selection_cta")
    public static /* synthetic */ void getSelectionCta$annotations() {
    }

    @SerialName("selection_cta_icon")
    public static /* synthetic */ void getSelectionCtaIcon$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getAllowSelection() {
        return this.allowSelection;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCaption() {
        return this.caption;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSelectionCta() {
        return this.selectionCta;
    }

    /* renamed from: component5, reason: from getter */
    public final Image getIcon() {
        return this.icon;
    }

    /* renamed from: component6, reason: from getter */
    public final Image getSelectionCtaIcon() {
        return this.selectionCtaIcon;
    }

    /* renamed from: component7, reason: from getter */
    public final Image getAccountIcon() {
        return this.accountIcon;
    }

    /* renamed from: component8, reason: from getter */
    public final DataAccessNotice getDataAccessNotice() {
        return this.dataAccessNotice;
    }

    /* renamed from: component9, reason: from getter */
    public final FinancialConnectionsGenericInfoScreen getDrawerOnSelection() {
        return this.drawerOnSelection;
    }

    public final NetworkedAccount copy(String id, boolean allowSelection, String caption, String selectionCta, Image icon, Image selectionCtaIcon, Image accountIcon, DataAccessNotice dataAccessNotice, FinancialConnectionsGenericInfoScreen drawerOnSelection) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new NetworkedAccount(id, allowSelection, caption, selectionCta, icon, selectionCtaIcon, accountIcon, dataAccessNotice, drawerOnSelection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkedAccount)) {
            return false;
        }
        NetworkedAccount networkedAccount = (NetworkedAccount) other;
        return Intrinsics.areEqual(this.id, networkedAccount.id) && this.allowSelection == networkedAccount.allowSelection && Intrinsics.areEqual(this.caption, networkedAccount.caption) && Intrinsics.areEqual(this.selectionCta, networkedAccount.selectionCta) && Intrinsics.areEqual(this.icon, networkedAccount.icon) && Intrinsics.areEqual(this.selectionCtaIcon, networkedAccount.selectionCtaIcon) && Intrinsics.areEqual(this.accountIcon, networkedAccount.accountIcon) && Intrinsics.areEqual(this.dataAccessNotice, networkedAccount.dataAccessNotice) && Intrinsics.areEqual(this.drawerOnSelection, networkedAccount.drawerOnSelection);
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + Boolean.hashCode(this.allowSelection)) * 31;
        String str = this.caption;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.selectionCta;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.icon;
        int iHashCode4 = (iHashCode3 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.selectionCtaIcon;
        int iHashCode5 = (iHashCode4 + (image2 == null ? 0 : image2.hashCode())) * 31;
        Image image3 = this.accountIcon;
        int iHashCode6 = (iHashCode5 + (image3 == null ? 0 : image3.hashCode())) * 31;
        DataAccessNotice dataAccessNotice = this.dataAccessNotice;
        int iHashCode7 = (iHashCode6 + (dataAccessNotice == null ? 0 : dataAccessNotice.hashCode())) * 31;
        FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen = this.drawerOnSelection;
        return iHashCode7 + (financialConnectionsGenericInfoScreen != null ? financialConnectionsGenericInfoScreen.hashCode() : 0);
    }

    public String toString() {
        return "NetworkedAccount(id=" + this.id + ", allowSelection=" + this.allowSelection + ", caption=" + this.caption + ", selectionCta=" + this.selectionCta + ", icon=" + this.icon + ", selectionCtaIcon=" + this.selectionCtaIcon + ", accountIcon=" + this.accountIcon + ", dataAccessNotice=" + this.dataAccessNotice + ", drawerOnSelection=" + this.drawerOnSelection + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeInt(this.allowSelection ? 1 : 0);
        dest.writeString(this.caption);
        dest.writeString(this.selectionCta);
        Image image = this.icon;
        if (image == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            image.writeToParcel(dest, flags);
        }
        Image image2 = this.selectionCtaIcon;
        if (image2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            image2.writeToParcel(dest, flags);
        }
        Image image3 = this.accountIcon;
        if (image3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            image3.writeToParcel(dest, flags);
        }
        DataAccessNotice dataAccessNotice = this.dataAccessNotice;
        if (dataAccessNotice == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dataAccessNotice.writeToParcel(dest, flags);
        }
        FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen = this.drawerOnSelection;
        if (financialConnectionsGenericInfoScreen == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            financialConnectionsGenericInfoScreen.writeToParcel(dest, flags);
        }
    }

    /* compiled from: TextUpdate.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/NetworkedAccount$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/NetworkedAccount;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NetworkedAccount> serializer() {
            return NetworkedAccount$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NetworkedAccount(int i, String str, boolean z, String str2, String str3, Image image, Image image2, Image image3, DataAccessNotice dataAccessNotice, FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, NetworkedAccount$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.allowSelection = z;
        if ((i & 4) == 0) {
            this.caption = null;
        } else {
            this.caption = str2;
        }
        if ((i & 8) == 0) {
            this.selectionCta = null;
        } else {
            this.selectionCta = str3;
        }
        if ((i & 16) == 0) {
            this.icon = null;
        } else {
            this.icon = image;
        }
        if ((i & 32) == 0) {
            this.selectionCtaIcon = null;
        } else {
            this.selectionCtaIcon = image2;
        }
        if ((i & 64) == 0) {
            this.accountIcon = null;
        } else {
            this.accountIcon = image3;
        }
        if ((i & 128) == 0) {
            this.dataAccessNotice = null;
        } else {
            this.dataAccessNotice = dataAccessNotice;
        }
        if ((i & 256) == 0) {
            this.drawerOnSelection = null;
        } else {
            this.drawerOnSelection = financialConnectionsGenericInfoScreen;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$financial_connections_release(NetworkedAccount self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeBooleanElement(serialDesc, 1, self.allowSelection);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.caption != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.caption);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.selectionCta != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.selectionCta);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, Image$$serializer.INSTANCE, self.icon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.selectionCtaIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, Image$$serializer.INSTANCE, self.selectionCtaIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.accountIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, Image$$serializer.INSTANCE, self.accountIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.dataAccessNotice != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, DataAccessNotice$$serializer.INSTANCE, self.dataAccessNotice);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.drawerOnSelection == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 8, FinancialConnectionsGenericInfoScreen$$serializer.INSTANCE, self.drawerOnSelection);
    }

    public NetworkedAccount(String id, boolean z, String str, String str2, Image image, Image image2, Image image3, DataAccessNotice dataAccessNotice, FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.allowSelection = z;
        this.caption = str;
        this.selectionCta = str2;
        this.icon = image;
        this.selectionCtaIcon = image2;
        this.accountIcon = image3;
        this.dataAccessNotice = dataAccessNotice;
        this.drawerOnSelection = financialConnectionsGenericInfoScreen;
    }

    public /* synthetic */ NetworkedAccount(String str, boolean z, String str2, String str3, Image image, Image image2, Image image3, DataAccessNotice dataAccessNotice, FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : image, (i & 32) != 0 ? null : image2, (i & 64) != 0 ? null : image3, (i & 128) != 0 ? null : dataAccessNotice, (i & 256) != 0 ? null : financialConnectionsGenericInfoScreen);
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getAllowSelection() {
        return this.allowSelection;
    }

    public final String getCaption() {
        return this.caption;
    }

    public final String getSelectionCta() {
        return this.selectionCta;
    }

    public final Image getIcon() {
        return this.icon;
    }

    public final Image getSelectionCtaIcon() {
        return this.selectionCtaIcon;
    }

    public final Image getAccountIcon() {
        return this.accountIcon;
    }

    public final DataAccessNotice getDataAccessNotice() {
        return this.dataAccessNotice;
    }

    public final FinancialConnectionsGenericInfoScreen getDrawerOnSelection() {
        return this.drawerOnSelection;
    }
}
