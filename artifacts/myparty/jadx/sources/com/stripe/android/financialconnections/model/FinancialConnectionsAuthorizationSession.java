package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.model.serializers.EnumIgnoreUnknownSerializer;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: FinancialConnectionsAuthorizationSession.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 R2\u00020\u0001:\u0003PQRBw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011B\u007f\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0010\u0010\u0016J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u00106\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u00107\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\bHÂ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010;\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0082\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010=J\u0006\u0010>\u001a\u00020\u0013J\u0013\u0010?\u001a\u00020\b2\b\u0010@\u001a\u0004\u0018\u00010AHÖ\u0003J\t\u0010B\u001a\u00020\u0013HÖ\u0001J\t\u0010C\u001a\u00020\u0003HÖ\u0001J\u0016\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\u0013J%\u0010I\u001a\u00020E2\u0006\u0010J\u001a\u00020\u00002\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020NH\u0001¢\u0006\u0002\bOR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010#\u0012\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\"R \u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010#\u0012\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\"R \u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010#\u0012\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010\"R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010\u001aR\u001e\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010\u001aR\u001a\u0010\r\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\n\n\u0002\u0010#\u0012\u0004\b,\u0010\u0018R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u0018\u001a\u0004\b.\u0010/R\u0011\u00100\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u0006S"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "Landroid/os/Parcelable;", "id", "", "nextPane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "flow", "institutionSkipAccountSelection", "", "showPartnerDisclosure", "skipAccountSelection", "url", "urlQrCode", "_isOAuth", "display", "Lcom/stripe/android/financialconnections/model/Display;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/Display;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/Display;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getNextPane$annotations", "getNextPane", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getFlow$annotations", "getFlow", "getInstitutionSkipAccountSelection$annotations", "getInstitutionSkipAccountSelection", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShowPartnerDisclosure$annotations", "getShowPartnerDisclosure", "getSkipAccountSelection$annotations", "getSkipAccountSelection", "getUrl$annotations", "getUrl", "getUrlQrCode$annotations", "getUrlQrCode", "get_isOAuth$annotations", "getDisplay$annotations", "getDisplay", "()Lcom/stripe/android/financialconnections/model/Display;", "isOAuth", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/Display;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "describeContents", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "Flow", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class FinancialConnectionsAuthorizationSession implements Parcelable {
    private final Boolean _isOAuth;
    private final Display display;
    private final String flow;
    private final String id;
    private final Boolean institutionSkipAccountSelection;
    private final FinancialConnectionsSessionManifest.Pane nextPane;
    private final Boolean showPartnerDisclosure;
    private final Boolean skipAccountSelection;
    private final String url;
    private final String urlQrCode;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<FinancialConnectionsAuthorizationSession> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: FinancialConnectionsAuthorizationSession.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FinancialConnectionsAuthorizationSession> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsAuthorizationSession createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            FinancialConnectionsSessionManifest.Pane paneValueOf = FinancialConnectionsSessionManifest.Pane.valueOf(parcel.readString());
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Boolean bool = boolValueOf2;
            String string3 = parcel.readString();
            Boolean bool2 = boolValueOf3;
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FinancialConnectionsAuthorizationSession(string, paneValueOf, string2, boolValueOf, bool, bool2, string3, string4, boolValueOf4, parcel.readInt() == 0 ? null : Display.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsAuthorizationSession[] newArray(int i) {
            return new FinancialConnectionsAuthorizationSession[i];
        }
    }

    /* renamed from: component9, reason: from getter */
    private final Boolean get_isOAuth() {
        return this._isOAuth;
    }

    public static /* synthetic */ FinancialConnectionsAuthorizationSession copy$default(FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession, String str, FinancialConnectionsSessionManifest.Pane pane, String str2, Boolean bool, Boolean bool2, Boolean bool3, String str3, String str4, Boolean bool4, Display display, int i, Object obj) {
        if ((i & 1) != 0) {
            str = financialConnectionsAuthorizationSession.id;
        }
        if ((i & 2) != 0) {
            pane = financialConnectionsAuthorizationSession.nextPane;
        }
        if ((i & 4) != 0) {
            str2 = financialConnectionsAuthorizationSession.flow;
        }
        if ((i & 8) != 0) {
            bool = financialConnectionsAuthorizationSession.institutionSkipAccountSelection;
        }
        if ((i & 16) != 0) {
            bool2 = financialConnectionsAuthorizationSession.showPartnerDisclosure;
        }
        if ((i & 32) != 0) {
            bool3 = financialConnectionsAuthorizationSession.skipAccountSelection;
        }
        if ((i & 64) != 0) {
            str3 = financialConnectionsAuthorizationSession.url;
        }
        if ((i & 128) != 0) {
            str4 = financialConnectionsAuthorizationSession.urlQrCode;
        }
        if ((i & 256) != 0) {
            bool4 = financialConnectionsAuthorizationSession._isOAuth;
        }
        if ((i & 512) != 0) {
            display = financialConnectionsAuthorizationSession.display;
        }
        Boolean bool5 = bool4;
        Display display2 = display;
        String str5 = str3;
        String str6 = str4;
        Boolean bool6 = bool2;
        Boolean bool7 = bool3;
        return financialConnectionsAuthorizationSession.copy(str, pane, str2, bool, bool6, bool7, str5, str6, bool5, display2);
    }

    @SerialName("display")
    public static /* synthetic */ void getDisplay$annotations() {
    }

    @SerialName("flow")
    public static /* synthetic */ void getFlow$annotations() {
    }

    @SerialName("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName("institution_skip_account_selection")
    public static /* synthetic */ void getInstitutionSkipAccountSelection$annotations() {
    }

    @SerialName("next_pane")
    public static /* synthetic */ void getNextPane$annotations() {
    }

    @SerialName("show_partner_disclosure")
    public static /* synthetic */ void getShowPartnerDisclosure$annotations() {
    }

    @SerialName("skip_account_selection")
    public static /* synthetic */ void getSkipAccountSelection$annotations() {
    }

    @SerialName("url")
    public static /* synthetic */ void getUrl$annotations() {
    }

    @SerialName("url_qr_code")
    public static /* synthetic */ void getUrlQrCode$annotations() {
    }

    @SerialName("is_oauth")
    private static /* synthetic */ void get_isOAuth$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final Display getDisplay() {
        return this.display;
    }

    /* renamed from: component2, reason: from getter */
    public final FinancialConnectionsSessionManifest.Pane getNextPane() {
        return this.nextPane;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFlow() {
        return this.flow;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getInstitutionSkipAccountSelection() {
        return this.institutionSkipAccountSelection;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getShowPartnerDisclosure() {
        return this.showPartnerDisclosure;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getSkipAccountSelection() {
        return this.skipAccountSelection;
    }

    /* renamed from: component7, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component8, reason: from getter */
    public final String getUrlQrCode() {
        return this.urlQrCode;
    }

    public final FinancialConnectionsAuthorizationSession copy(String id, FinancialConnectionsSessionManifest.Pane nextPane, String flow, Boolean institutionSkipAccountSelection, Boolean showPartnerDisclosure, Boolean skipAccountSelection, String url, String urlQrCode, Boolean _isOAuth, Display display) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(nextPane, "nextPane");
        return new FinancialConnectionsAuthorizationSession(id, nextPane, flow, institutionSkipAccountSelection, showPartnerDisclosure, skipAccountSelection, url, urlQrCode, _isOAuth, display);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinancialConnectionsAuthorizationSession)) {
            return false;
        }
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = (FinancialConnectionsAuthorizationSession) other;
        return Intrinsics.areEqual(this.id, financialConnectionsAuthorizationSession.id) && this.nextPane == financialConnectionsAuthorizationSession.nextPane && Intrinsics.areEqual(this.flow, financialConnectionsAuthorizationSession.flow) && Intrinsics.areEqual(this.institutionSkipAccountSelection, financialConnectionsAuthorizationSession.institutionSkipAccountSelection) && Intrinsics.areEqual(this.showPartnerDisclosure, financialConnectionsAuthorizationSession.showPartnerDisclosure) && Intrinsics.areEqual(this.skipAccountSelection, financialConnectionsAuthorizationSession.skipAccountSelection) && Intrinsics.areEqual(this.url, financialConnectionsAuthorizationSession.url) && Intrinsics.areEqual(this.urlQrCode, financialConnectionsAuthorizationSession.urlQrCode) && Intrinsics.areEqual(this._isOAuth, financialConnectionsAuthorizationSession._isOAuth) && Intrinsics.areEqual(this.display, financialConnectionsAuthorizationSession.display);
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.nextPane.hashCode()) * 31;
        String str = this.flow;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.institutionSkipAccountSelection;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showPartnerDisclosure;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.skipAccountSelection;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.url;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.urlQrCode;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool4 = this._isOAuth;
        int iHashCode8 = (iHashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Display display = this.display;
        return iHashCode8 + (display != null ? display.hashCode() : 0);
    }

    public String toString() {
        return "FinancialConnectionsAuthorizationSession(id=" + this.id + ", nextPane=" + this.nextPane + ", flow=" + this.flow + ", institutionSkipAccountSelection=" + this.institutionSkipAccountSelection + ", showPartnerDisclosure=" + this.showPartnerDisclosure + ", skipAccountSelection=" + this.skipAccountSelection + ", url=" + this.url + ", urlQrCode=" + this.urlQrCode + ", _isOAuth=" + this._isOAuth + ", display=" + this.display + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.nextPane.name());
        dest.writeString(this.flow);
        Boolean bool = this.institutionSkipAccountSelection;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.showPartnerDisclosure;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.skipAccountSelection;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.url);
        dest.writeString(this.urlQrCode);
        Boolean bool4 = this._isOAuth;
        if (bool4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Display display = this.display;
        if (display == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            display.writeToParcel(dest, flags);
        }
    }

    /* compiled from: FinancialConnectionsAuthorizationSession.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FinancialConnectionsAuthorizationSession> serializer() {
            return FinancialConnectionsAuthorizationSession$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FinancialConnectionsAuthorizationSession(int i, String str, FinancialConnectionsSessionManifest.Pane pane, String str2, Boolean bool, Boolean bool2, Boolean bool3, String str3, String str4, Boolean bool4, Display display, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, FinancialConnectionsAuthorizationSession$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.nextPane = pane;
        if ((i & 4) == 0) {
            this.flow = null;
        } else {
            this.flow = str2;
        }
        if ((i & 8) == 0) {
            this.institutionSkipAccountSelection = null;
        } else {
            this.institutionSkipAccountSelection = bool;
        }
        if ((i & 16) == 0) {
            this.showPartnerDisclosure = null;
        } else {
            this.showPartnerDisclosure = bool2;
        }
        if ((i & 32) == 0) {
            this.skipAccountSelection = null;
        } else {
            this.skipAccountSelection = bool3;
        }
        if ((i & 64) == 0) {
            this.url = null;
        } else {
            this.url = str3;
        }
        if ((i & 128) == 0) {
            this.urlQrCode = null;
        } else {
            this.urlQrCode = str4;
        }
        if ((i & 256) == 0) {
            this._isOAuth = false;
        } else {
            this._isOAuth = bool4;
        }
        if ((i & 512) == 0) {
            this.display = null;
        } else {
            this.display = display;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$financial_connections_release(FinancialConnectionsAuthorizationSession self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeSerializableElement(serialDesc, 1, FinancialConnectionsSessionManifest.Pane.Serializer.INSTANCE, self.nextPane);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.flow != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.flow);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.institutionSkipAccountSelection != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, BooleanSerializer.INSTANCE, self.institutionSkipAccountSelection);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.showPartnerDisclosure != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, BooleanSerializer.INSTANCE, self.showPartnerDisclosure);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.skipAccountSelection != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, BooleanSerializer.INSTANCE, self.skipAccountSelection);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.url != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.url);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.urlQrCode != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.urlQrCode);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || !Intrinsics.areEqual((Object) self._isOAuth, (Object) false)) {
            output.encodeNullableSerializableElement(serialDesc, 8, BooleanSerializer.INSTANCE, self._isOAuth);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && self.display == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 9, Display$$serializer.INSTANCE, self.display);
    }

    public FinancialConnectionsAuthorizationSession(String id, FinancialConnectionsSessionManifest.Pane nextPane, String str, Boolean bool, Boolean bool2, Boolean bool3, String str2, String str3, Boolean bool4, Display display) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(nextPane, "nextPane");
        this.id = id;
        this.nextPane = nextPane;
        this.flow = str;
        this.institutionSkipAccountSelection = bool;
        this.showPartnerDisclosure = bool2;
        this.skipAccountSelection = bool3;
        this.url = str2;
        this.urlQrCode = str3;
        this._isOAuth = bool4;
        this.display = display;
    }

    public final String getId() {
        return this.id;
    }

    public final FinancialConnectionsSessionManifest.Pane getNextPane() {
        return this.nextPane;
    }

    public final String getFlow() {
        return this.flow;
    }

    public final Boolean getInstitutionSkipAccountSelection() {
        return this.institutionSkipAccountSelection;
    }

    public final Boolean getShowPartnerDisclosure() {
        return this.showPartnerDisclosure;
    }

    public final Boolean getSkipAccountSelection() {
        return this.skipAccountSelection;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getUrlQrCode() {
        return this.urlQrCode;
    }

    public /* synthetic */ FinancialConnectionsAuthorizationSession(String str, FinancialConnectionsSessionManifest.Pane pane, String str2, Boolean bool, Boolean bool2, Boolean bool3, String str3, String str4, Boolean bool4, Display display, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, pane, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? false : bool4, (i & 512) != 0 ? null : display);
    }

    public final Display getDisplay() {
        return this.display;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FinancialConnectionsAuthorizationSession.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0087\u0081\u0002\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u001d\u001eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DIRECT", "DIRECT_WEBVIEW", "FINICITY_CONNECT_V2_FIX", "FINICITY_CONNECT_V2_LITE", "FINICITY_CONNECT_V2_OAUTH", "FINICITY_CONNECT_V2_OAUTH_REDIRECT", "FINICITY_CONNECT_V2_OAUTH_WEBVIEW", "MX_CONNECT", "MX_OAUTH", "MX_OAUTH_APP2APP", "MX_OAUTH_REDIRECT", "MX_OAUTH_WEBVIEW", "TESTMODE", "TESTMODE_OAUTH", "TESTMODE_OAUTH_WEBVIEW", "TRUELAYER_OAUTH", "TRUELAYER_OAUTH_HANDOFF", "TRUELAYER_OAUTH_WEBVIEW", "WELLS_FARGO", "WELLS_FARGO_WEBVIEW", "UNKNOWN", "Serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable(with = Serializer.class)
    public static final class Flow {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Flow[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String value;

        @SerialName("direct")
        public static final Flow DIRECT = new Flow("DIRECT", 0, "direct");

        @SerialName("direct_webview")
        public static final Flow DIRECT_WEBVIEW = new Flow("DIRECT_WEBVIEW", 1, "direct_webview");

        @SerialName("finicity_connect_v2_fix")
        public static final Flow FINICITY_CONNECT_V2_FIX = new Flow("FINICITY_CONNECT_V2_FIX", 2, "finicity_connect_v2_fix");

        @SerialName("finicity_connect_v2_lite")
        public static final Flow FINICITY_CONNECT_V2_LITE = new Flow("FINICITY_CONNECT_V2_LITE", 3, "finicity_connect_v2_lite");

        @SerialName("finicity_connect_v2_oauth")
        public static final Flow FINICITY_CONNECT_V2_OAUTH = new Flow("FINICITY_CONNECT_V2_OAUTH", 4, "finicity_connect_v2_oauth");

        @SerialName("finicity_connect_v2_oauth_redirect")
        public static final Flow FINICITY_CONNECT_V2_OAUTH_REDIRECT = new Flow("FINICITY_CONNECT_V2_OAUTH_REDIRECT", 5, "finicity_connect_v2_oauth_redirect");

        @SerialName("finicity_connect_v2_oauth_webview")
        public static final Flow FINICITY_CONNECT_V2_OAUTH_WEBVIEW = new Flow("FINICITY_CONNECT_V2_OAUTH_WEBVIEW", 6, "finicity_connect_v2_oauth_webview");

        @SerialName("mx_connect")
        public static final Flow MX_CONNECT = new Flow("MX_CONNECT", 7, "mx_connect");

        @SerialName("mx_oauth")
        public static final Flow MX_OAUTH = new Flow("MX_OAUTH", 8, "mx_oauth");

        @SerialName("mx_oauth_app_to_app")
        public static final Flow MX_OAUTH_APP2APP = new Flow("MX_OAUTH_APP2APP", 9, "mx_oauth_app_to_app");

        @SerialName("mx_oauth_redirect")
        public static final Flow MX_OAUTH_REDIRECT = new Flow("MX_OAUTH_REDIRECT", 10, "mx_oauth_redirect");

        @SerialName("mx_oauth_webview")
        public static final Flow MX_OAUTH_WEBVIEW = new Flow("MX_OAUTH_WEBVIEW", 11, "mx_oauth_webview");

        @SerialName("testmode")
        public static final Flow TESTMODE = new Flow("TESTMODE", 12, "testmode");

        @SerialName("testmode_oauth")
        public static final Flow TESTMODE_OAUTH = new Flow("TESTMODE_OAUTH", 13, "testmode_oauth");

        @SerialName("testmode_oauth_webview")
        public static final Flow TESTMODE_OAUTH_WEBVIEW = new Flow("TESTMODE_OAUTH_WEBVIEW", 14, "testmode_oauth_webview");

        @SerialName("truelayer_oauth")
        public static final Flow TRUELAYER_OAUTH = new Flow("TRUELAYER_OAUTH", 15, "truelayer_oauth");

        @SerialName("truelayer_oauth_handoff")
        public static final Flow TRUELAYER_OAUTH_HANDOFF = new Flow("TRUELAYER_OAUTH_HANDOFF", 16, "truelayer_oauth_handoff");

        @SerialName("truelayer_oauth_webview")
        public static final Flow TRUELAYER_OAUTH_WEBVIEW = new Flow("TRUELAYER_OAUTH_WEBVIEW", 17, "truelayer_oauth_webview");

        @SerialName("wells_fargo")
        public static final Flow WELLS_FARGO = new Flow("WELLS_FARGO", 18, "wells_fargo");

        @SerialName("wells_fargo_webview")
        public static final Flow WELLS_FARGO_WEBVIEW = new Flow("WELLS_FARGO_WEBVIEW", 19, "wells_fargo_webview");

        @SerialName("unknown")
        public static final Flow UNKNOWN = new Flow("UNKNOWN", 20, "unknown");

        private static final /* synthetic */ Flow[] $values() {
            return new Flow[]{DIRECT, DIRECT_WEBVIEW, FINICITY_CONNECT_V2_FIX, FINICITY_CONNECT_V2_LITE, FINICITY_CONNECT_V2_OAUTH, FINICITY_CONNECT_V2_OAUTH_REDIRECT, FINICITY_CONNECT_V2_OAUTH_WEBVIEW, MX_CONNECT, MX_OAUTH, MX_OAUTH_APP2APP, MX_OAUTH_REDIRECT, MX_OAUTH_WEBVIEW, TESTMODE, TESTMODE_OAUTH, TESTMODE_OAUTH_WEBVIEW, TRUELAYER_OAUTH, TRUELAYER_OAUTH_HANDOFF, TRUELAYER_OAUTH_WEBVIEW, WELLS_FARGO, WELLS_FARGO_WEBVIEW, UNKNOWN};
        }

        public static EnumEntries<Flow> getEntries() {
            return $ENTRIES;
        }

        /* compiled from: FinancialConnectionsAuthorizationSession.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Flow> serializer() {
                return Serializer.INSTANCE;
            }
        }

        private Flow(String str, int i, String str2) {
            this.value = str2;
        }

        public final String getValue() {
            return this.value;
        }

        static {
            Flow[] flowArr$values = $values();
            $VALUES = flowArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(flowArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: FinancialConnectionsAuthorizationSession.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow$Serializer;", "Lcom/stripe/android/core/model/serializers/EnumIgnoreUnknownSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;", "<init>", "()V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Serializer extends EnumIgnoreUnknownSerializer<Flow> {
            public static final int $stable = 0;
            public static final Serializer INSTANCE = new Serializer();

            private Serializer() {
                super((Enum[]) Flow.getEntries().toArray(new Flow[0]), Flow.UNKNOWN);
            }
        }

        public static Flow valueOf(String str) {
            return (Flow) Enum.valueOf(Flow.class, str);
        }

        public static Flow[] values() {
            return (Flow[]) $VALUES.clone();
        }
    }

    public final boolean isOAuth() {
        Boolean bool = this._isOAuth;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
