package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: TextUpdate.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 P2\u00020\u0001:\u0002OPBg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013Bk\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0012\u0010\u0018J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0011HÆ\u0003Ji\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0006\u0010;\u001a\u00020\u0015J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0003J\t\u0010@\u001a\u00020\u0015HÖ\u0001J\t\u0010A\u001a\u00020BHÖ\u0001J\u0016\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u0015J%\u0010H\u001a\u00020D2\u0006\u0010I\u001a\u00020\u00002\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020MH\u0001¢\u0006\u0002\bNR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\"R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010%R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u001a\u001a\u0004\b'\u0010(R\u001e\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u001a\u001a\u0004\b*\u0010+R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u001a\u001a\u0004\b-\u0010.R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010\u001a\u001a\u0004\b0\u00101¨\u0006Q"}, d2 = {"Lcom/stripe/android/financialconnections/model/TextUpdate;", "Landroid/os/Parcelable;", "accountPicker", "Lcom/stripe/android/financialconnections/model/AccountPickerPane;", "consent", "Lcom/stripe/android/financialconnections/model/ConsentPane;", "linkLoginPane", "Lcom/stripe/android/financialconnections/model/LinkLoginPane;", "networkingLinkSignupPane", "Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;", "oauthPrepane", "Lcom/stripe/android/financialconnections/model/OauthPrepane;", "returningNetworkingUserAccountPicker", "Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;", "successPane", "Lcom/stripe/android/financialconnections/model/SuccessPane;", "idConsentContentPane", "Lcom/stripe/android/financialconnections/model/IDConsentContentPane;", "<init>", "(Lcom/stripe/android/financialconnections/model/AccountPickerPane;Lcom/stripe/android/financialconnections/model/ConsentPane;Lcom/stripe/android/financialconnections/model/LinkLoginPane;Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;Lcom/stripe/android/financialconnections/model/OauthPrepane;Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;Lcom/stripe/android/financialconnections/model/SuccessPane;Lcom/stripe/android/financialconnections/model/IDConsentContentPane;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/stripe/android/financialconnections/model/AccountPickerPane;Lcom/stripe/android/financialconnections/model/ConsentPane;Lcom/stripe/android/financialconnections/model/LinkLoginPane;Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;Lcom/stripe/android/financialconnections/model/OauthPrepane;Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;Lcom/stripe/android/financialconnections/model/SuccessPane;Lcom/stripe/android/financialconnections/model/IDConsentContentPane;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAccountPicker$annotations", "()V", "getAccountPicker", "()Lcom/stripe/android/financialconnections/model/AccountPickerPane;", "getConsent$annotations", "getConsent", "()Lcom/stripe/android/financialconnections/model/ConsentPane;", "getLinkLoginPane$annotations", "getLinkLoginPane", "()Lcom/stripe/android/financialconnections/model/LinkLoginPane;", "getNetworkingLinkSignupPane$annotations", "getNetworkingLinkSignupPane", "()Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;", "getOauthPrepane$annotations", "getOauthPrepane", "()Lcom/stripe/android/financialconnections/model/OauthPrepane;", "getReturningNetworkingUserAccountPicker$annotations", "getReturningNetworkingUserAccountPicker", "()Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;", "getSuccessPane$annotations", "getSuccessPane", "()Lcom/stripe/android/financialconnections/model/SuccessPane;", "getIdConsentContentPane$annotations", "getIdConsentContentPane", "()Lcom/stripe/android/financialconnections/model/IDConsentContentPane;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class TextUpdate implements Parcelable {
    private final AccountPickerPane accountPicker;
    private final ConsentPane consent;
    private final IDConsentContentPane idConsentContentPane;
    private final LinkLoginPane linkLoginPane;
    private final NetworkingLinkSignupPane networkingLinkSignupPane;
    private final OauthPrepane oauthPrepane;
    private final ReturningNetworkingUserAccountPicker returningNetworkingUserAccountPicker;
    private final SuccessPane successPane;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<TextUpdate> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: TextUpdate.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TextUpdate> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TextUpdate createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TextUpdate(parcel.readInt() == 0 ? null : AccountPickerPane.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ConsentPane.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LinkLoginPane.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : NetworkingLinkSignupPane.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : OauthPrepane.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ReturningNetworkingUserAccountPicker.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuccessPane.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? IDConsentContentPane.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TextUpdate[] newArray(int i) {
            return new TextUpdate[i];
        }
    }

    public TextUpdate() {
        this((AccountPickerPane) null, (ConsentPane) null, (LinkLoginPane) null, (NetworkingLinkSignupPane) null, (OauthPrepane) null, (ReturningNetworkingUserAccountPicker) null, (SuccessPane) null, (IDConsentContentPane) null, 255, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ TextUpdate copy$default(TextUpdate textUpdate, AccountPickerPane accountPickerPane, ConsentPane consentPane, LinkLoginPane linkLoginPane, NetworkingLinkSignupPane networkingLinkSignupPane, OauthPrepane oauthPrepane, ReturningNetworkingUserAccountPicker returningNetworkingUserAccountPicker, SuccessPane successPane, IDConsentContentPane iDConsentContentPane, int i, Object obj) {
        if ((i & 1) != 0) {
            accountPickerPane = textUpdate.accountPicker;
        }
        if ((i & 2) != 0) {
            consentPane = textUpdate.consent;
        }
        if ((i & 4) != 0) {
            linkLoginPane = textUpdate.linkLoginPane;
        }
        if ((i & 8) != 0) {
            networkingLinkSignupPane = textUpdate.networkingLinkSignupPane;
        }
        if ((i & 16) != 0) {
            oauthPrepane = textUpdate.oauthPrepane;
        }
        if ((i & 32) != 0) {
            returningNetworkingUserAccountPicker = textUpdate.returningNetworkingUserAccountPicker;
        }
        if ((i & 64) != 0) {
            successPane = textUpdate.successPane;
        }
        if ((i & 128) != 0) {
            iDConsentContentPane = textUpdate.idConsentContentPane;
        }
        SuccessPane successPane2 = successPane;
        IDConsentContentPane iDConsentContentPane2 = iDConsentContentPane;
        OauthPrepane oauthPrepane2 = oauthPrepane;
        ReturningNetworkingUserAccountPicker returningNetworkingUserAccountPicker2 = returningNetworkingUserAccountPicker;
        return textUpdate.copy(accountPickerPane, consentPane, linkLoginPane, networkingLinkSignupPane, oauthPrepane2, returningNetworkingUserAccountPicker2, successPane2, iDConsentContentPane2);
    }

    @SerialName("account_picker_pane")
    public static /* synthetic */ void getAccountPicker$annotations() {
    }

    @SerialName("consent_pane")
    public static /* synthetic */ void getConsent$annotations() {
    }

    @SerialName("id_consent_content_pane")
    public static /* synthetic */ void getIdConsentContentPane$annotations() {
    }

    @SerialName("link_login_pane")
    public static /* synthetic */ void getLinkLoginPane$annotations() {
    }

    @SerialName("networking_link_signup_pane")
    public static /* synthetic */ void getNetworkingLinkSignupPane$annotations() {
    }

    @SerialName("oauth_prepane")
    public static /* synthetic */ void getOauthPrepane$annotations() {
    }

    @SerialName("returning_networking_user_account_picker")
    public static /* synthetic */ void getReturningNetworkingUserAccountPicker$annotations() {
    }

    @SerialName("success_pane")
    public static /* synthetic */ void getSuccessPane$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final AccountPickerPane getAccountPicker() {
        return this.accountPicker;
    }

    /* renamed from: component2, reason: from getter */
    public final ConsentPane getConsent() {
        return this.consent;
    }

    /* renamed from: component3, reason: from getter */
    public final LinkLoginPane getLinkLoginPane() {
        return this.linkLoginPane;
    }

    /* renamed from: component4, reason: from getter */
    public final NetworkingLinkSignupPane getNetworkingLinkSignupPane() {
        return this.networkingLinkSignupPane;
    }

    /* renamed from: component5, reason: from getter */
    public final OauthPrepane getOauthPrepane() {
        return this.oauthPrepane;
    }

    /* renamed from: component6, reason: from getter */
    public final ReturningNetworkingUserAccountPicker getReturningNetworkingUserAccountPicker() {
        return this.returningNetworkingUserAccountPicker;
    }

    /* renamed from: component7, reason: from getter */
    public final SuccessPane getSuccessPane() {
        return this.successPane;
    }

    /* renamed from: component8, reason: from getter */
    public final IDConsentContentPane getIdConsentContentPane() {
        return this.idConsentContentPane;
    }

    public final TextUpdate copy(AccountPickerPane accountPicker, ConsentPane consent, LinkLoginPane linkLoginPane, NetworkingLinkSignupPane networkingLinkSignupPane, OauthPrepane oauthPrepane, ReturningNetworkingUserAccountPicker returningNetworkingUserAccountPicker, SuccessPane successPane, IDConsentContentPane idConsentContentPane) {
        return new TextUpdate(accountPicker, consent, linkLoginPane, networkingLinkSignupPane, oauthPrepane, returningNetworkingUserAccountPicker, successPane, idConsentContentPane);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextUpdate)) {
            return false;
        }
        TextUpdate textUpdate = (TextUpdate) other;
        return Intrinsics.areEqual(this.accountPicker, textUpdate.accountPicker) && Intrinsics.areEqual(this.consent, textUpdate.consent) && Intrinsics.areEqual(this.linkLoginPane, textUpdate.linkLoginPane) && Intrinsics.areEqual(this.networkingLinkSignupPane, textUpdate.networkingLinkSignupPane) && Intrinsics.areEqual(this.oauthPrepane, textUpdate.oauthPrepane) && Intrinsics.areEqual(this.returningNetworkingUserAccountPicker, textUpdate.returningNetworkingUserAccountPicker) && Intrinsics.areEqual(this.successPane, textUpdate.successPane) && Intrinsics.areEqual(this.idConsentContentPane, textUpdate.idConsentContentPane);
    }

    public int hashCode() {
        AccountPickerPane accountPickerPane = this.accountPicker;
        int iHashCode = (accountPickerPane == null ? 0 : accountPickerPane.hashCode()) * 31;
        ConsentPane consentPane = this.consent;
        int iHashCode2 = (iHashCode + (consentPane == null ? 0 : consentPane.hashCode())) * 31;
        LinkLoginPane linkLoginPane = this.linkLoginPane;
        int iHashCode3 = (iHashCode2 + (linkLoginPane == null ? 0 : linkLoginPane.hashCode())) * 31;
        NetworkingLinkSignupPane networkingLinkSignupPane = this.networkingLinkSignupPane;
        int iHashCode4 = (iHashCode3 + (networkingLinkSignupPane == null ? 0 : networkingLinkSignupPane.hashCode())) * 31;
        OauthPrepane oauthPrepane = this.oauthPrepane;
        int iHashCode5 = (iHashCode4 + (oauthPrepane == null ? 0 : oauthPrepane.hashCode())) * 31;
        ReturningNetworkingUserAccountPicker returningNetworkingUserAccountPicker = this.returningNetworkingUserAccountPicker;
        int iHashCode6 = (iHashCode5 + (returningNetworkingUserAccountPicker == null ? 0 : returningNetworkingUserAccountPicker.hashCode())) * 31;
        SuccessPane successPane = this.successPane;
        int iHashCode7 = (iHashCode6 + (successPane == null ? 0 : successPane.hashCode())) * 31;
        IDConsentContentPane iDConsentContentPane = this.idConsentContentPane;
        return iHashCode7 + (iDConsentContentPane != null ? iDConsentContentPane.hashCode() : 0);
    }

    public String toString() {
        return "TextUpdate(accountPicker=" + this.accountPicker + ", consent=" + this.consent + ", linkLoginPane=" + this.linkLoginPane + ", networkingLinkSignupPane=" + this.networkingLinkSignupPane + ", oauthPrepane=" + this.oauthPrepane + ", returningNetworkingUserAccountPicker=" + this.returningNetworkingUserAccountPicker + ", successPane=" + this.successPane + ", idConsentContentPane=" + this.idConsentContentPane + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        AccountPickerPane accountPickerPane = this.accountPicker;
        if (accountPickerPane == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            accountPickerPane.writeToParcel(dest, flags);
        }
        ConsentPane consentPane = this.consent;
        if (consentPane == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            consentPane.writeToParcel(dest, flags);
        }
        LinkLoginPane linkLoginPane = this.linkLoginPane;
        if (linkLoginPane == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            linkLoginPane.writeToParcel(dest, flags);
        }
        NetworkingLinkSignupPane networkingLinkSignupPane = this.networkingLinkSignupPane;
        if (networkingLinkSignupPane == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            networkingLinkSignupPane.writeToParcel(dest, flags);
        }
        OauthPrepane oauthPrepane = this.oauthPrepane;
        if (oauthPrepane == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            oauthPrepane.writeToParcel(dest, flags);
        }
        ReturningNetworkingUserAccountPicker returningNetworkingUserAccountPicker = this.returningNetworkingUserAccountPicker;
        if (returningNetworkingUserAccountPicker == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            returningNetworkingUserAccountPicker.writeToParcel(dest, flags);
        }
        SuccessPane successPane = this.successPane;
        if (successPane == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            successPane.writeToParcel(dest, flags);
        }
        IDConsentContentPane iDConsentContentPane = this.idConsentContentPane;
        if (iDConsentContentPane == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            iDConsentContentPane.writeToParcel(dest, flags);
        }
    }

    /* compiled from: TextUpdate.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/TextUpdate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/TextUpdate;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TextUpdate> serializer() {
            return TextUpdate$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TextUpdate(int i, AccountPickerPane accountPickerPane, ConsentPane consentPane, LinkLoginPane linkLoginPane, NetworkingLinkSignupPane networkingLinkSignupPane, OauthPrepane oauthPrepane, ReturningNetworkingUserAccountPicker returningNetworkingUserAccountPicker, SuccessPane successPane, IDConsentContentPane iDConsentContentPane, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.accountPicker = null;
        } else {
            this.accountPicker = accountPickerPane;
        }
        if ((i & 2) == 0) {
            this.consent = null;
        } else {
            this.consent = consentPane;
        }
        if ((i & 4) == 0) {
            this.linkLoginPane = null;
        } else {
            this.linkLoginPane = linkLoginPane;
        }
        if ((i & 8) == 0) {
            this.networkingLinkSignupPane = null;
        } else {
            this.networkingLinkSignupPane = networkingLinkSignupPane;
        }
        if ((i & 16) == 0) {
            this.oauthPrepane = null;
        } else {
            this.oauthPrepane = oauthPrepane;
        }
        if ((i & 32) == 0) {
            this.returningNetworkingUserAccountPicker = null;
        } else {
            this.returningNetworkingUserAccountPicker = returningNetworkingUserAccountPicker;
        }
        if ((i & 64) == 0) {
            this.successPane = null;
        } else {
            this.successPane = successPane;
        }
        if ((i & 128) == 0) {
            this.idConsentContentPane = null;
        } else {
            this.idConsentContentPane = iDConsentContentPane;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$financial_connections_release(TextUpdate self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.accountPicker != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, AccountPickerPane$$serializer.INSTANCE, self.accountPicker);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.consent != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, ConsentPane$$serializer.INSTANCE, self.consent);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.linkLoginPane != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, LinkLoginPane$$serializer.INSTANCE, self.linkLoginPane);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.networkingLinkSignupPane != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, NetworkingLinkSignupPane$$serializer.INSTANCE, self.networkingLinkSignupPane);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.oauthPrepane != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, OauthPrepane$$serializer.INSTANCE, self.oauthPrepane);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.returningNetworkingUserAccountPicker != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, ReturningNetworkingUserAccountPicker$$serializer.INSTANCE, self.returningNetworkingUserAccountPicker);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.successPane != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, SuccessPane$$serializer.INSTANCE, self.successPane);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.idConsentContentPane == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, IDConsentContentPane$$serializer.INSTANCE, self.idConsentContentPane);
    }

    public TextUpdate(AccountPickerPane accountPickerPane, ConsentPane consentPane, LinkLoginPane linkLoginPane, NetworkingLinkSignupPane networkingLinkSignupPane, OauthPrepane oauthPrepane, ReturningNetworkingUserAccountPicker returningNetworkingUserAccountPicker, SuccessPane successPane, IDConsentContentPane iDConsentContentPane) {
        this.accountPicker = accountPickerPane;
        this.consent = consentPane;
        this.linkLoginPane = linkLoginPane;
        this.networkingLinkSignupPane = networkingLinkSignupPane;
        this.oauthPrepane = oauthPrepane;
        this.returningNetworkingUserAccountPicker = returningNetworkingUserAccountPicker;
        this.successPane = successPane;
        this.idConsentContentPane = iDConsentContentPane;
    }

    public /* synthetic */ TextUpdate(AccountPickerPane accountPickerPane, ConsentPane consentPane, LinkLoginPane linkLoginPane, NetworkingLinkSignupPane networkingLinkSignupPane, OauthPrepane oauthPrepane, ReturningNetworkingUserAccountPicker returningNetworkingUserAccountPicker, SuccessPane successPane, IDConsentContentPane iDConsentContentPane, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : accountPickerPane, (i & 2) != 0 ? null : consentPane, (i & 4) != 0 ? null : linkLoginPane, (i & 8) != 0 ? null : networkingLinkSignupPane, (i & 16) != 0 ? null : oauthPrepane, (i & 32) != 0 ? null : returningNetworkingUserAccountPicker, (i & 64) != 0 ? null : successPane, (i & 128) != 0 ? null : iDConsentContentPane);
    }

    public final AccountPickerPane getAccountPicker() {
        return this.accountPicker;
    }

    public final ConsentPane getConsent() {
        return this.consent;
    }

    public final LinkLoginPane getLinkLoginPane() {
        return this.linkLoginPane;
    }

    public final NetworkingLinkSignupPane getNetworkingLinkSignupPane() {
        return this.networkingLinkSignupPane;
    }

    public final OauthPrepane getOauthPrepane() {
        return this.oauthPrepane;
    }

    public final ReturningNetworkingUserAccountPicker getReturningNetworkingUserAccountPicker() {
        return this.returningNetworkingUserAccountPicker;
    }

    public final SuccessPane getSuccessPane() {
        return this.successPane;
    }

    public final IDConsentContentPane getIdConsentContentPane() {
        return this.idConsentContentPane;
    }
}
