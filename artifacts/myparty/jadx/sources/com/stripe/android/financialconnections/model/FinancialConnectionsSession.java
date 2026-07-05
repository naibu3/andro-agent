package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.AnalyticsEvents;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.model.serializers.EnumIgnoreUnknownSerializer;
import com.stripe.android.financialconnections.model.serializer.JsonAsStringSerializer;
import com.stripe.android.financialconnections.model.serializer.PaymentAccountSerializer;
import com.stripe.android.financialconnections.network.NetworkConstants;
import com.stripe.android.model.Token;
import com.stripe.android.model.parsers.TokenJsonParser;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.json.JSONObject;

/* compiled from: FinancialConnectionsSession.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 c2\u00020\u00012\u00020\u0002:\u0004`abcB\u0081\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016B\u0087\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0015\u0010\u001bJ\t\u0010@\u001a\u00020\u0004HÆ\u0003J\t\u0010A\u001a\u00020\u0004HÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u0007HÀ\u0003¢\u0006\u0002\bCJ\u0010\u0010D\u001a\u0004\u0018\u00010\u0007HÀ\u0003¢\u0006\u0002\bEJ\t\u0010F\u001a\u00020\nHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0087\u0001\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001J\u0006\u0010N\u001a\u00020\u0018J\u0013\u0010O\u001a\u00020\n2\b\u0010P\u001a\u0004\u0018\u00010QHÖ\u0003J\t\u0010R\u001a\u00020\u0018HÖ\u0001J\t\u0010S\u001a\u00020\u0004HÖ\u0001J\u0016\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u0018J%\u0010Y\u001a\u00020U2\u0006\u0010Z\u001a\u00020\u00002\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^H\u0001¢\u0006\u0002\b_R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00078\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010$R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010)R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f8GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010,R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u001d\u001a\u0004\b.\u0010\u001fR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00048GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010\u001d\u001a\u0004\b0\u0010\u001fR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010\u001d\u001a\u0004\b2\u00103R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010\u001d\u001a\u0004\b5\u00106R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u0010\u001d\u001a\u0004\b8\u00109R\u0011\u0010:\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b;\u0010$R\u0013\u0010<\u001a\u0004\u0018\u00010=8G¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006d"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "Lcom/stripe/android/core/model/StripeModel;", "Landroid/os/Parcelable;", "clientSecret", "", "id", "accountsOld", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;", "accountsNew", TokenJsonParser.FIELD_LIVEMODE, "", "paymentAccount", "Lcom/stripe/android/financialconnections/model/PaymentAccount;", "returnUrl", "bankAccountToken", "manualEntry", "Lcom/stripe/android/financialconnections/model/ManualEntry;", "status", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;", "statusDetails", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;ZLcom/stripe/android/financialconnections/model/PaymentAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ManualEntry;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;ZLcom/stripe/android/financialconnections/model/PaymentAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ManualEntry;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getClientSecret$annotations", "()V", "getClientSecret", "()Ljava/lang/String;", "getId$annotations", "getId", "getAccountsOld$financial_connections_core_release$annotations", "getAccountsOld$financial_connections_core_release", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;", "getAccountsNew$financial_connections_core_release$annotations", "getAccountsNew$financial_connections_core_release", "getLivemode$annotations", "getLivemode", "()Z", "getPaymentAccount$annotations", "getPaymentAccount", "()Lcom/stripe/android/financialconnections/model/PaymentAccount;", "getReturnUrl$annotations", "getReturnUrl", "getBankAccountToken$annotations", "getBankAccountToken", "getManualEntry$annotations", "getManualEntry", "()Lcom/stripe/android/financialconnections/model/ManualEntry;", "getStatus$annotations", "getStatus", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;", "getStatusDetails$annotations", "getStatusDetails", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;", "accounts", "getAccounts", "parsedToken", "Lcom/stripe/android/model/Token;", "getParsedToken", "()Lcom/stripe/android/model/Token;", "component1", "component2", "component3", "component3$financial_connections_core_release", "component4", "component4$financial_connections_core_release", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_core_release", "Status", "StatusDetails", "$serializer", "Companion", "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class FinancialConnectionsSession implements StripeModel, Parcelable {
    private final FinancialConnectionsAccountList accountsNew;
    private final FinancialConnectionsAccountList accountsOld;
    private final String bankAccountToken;
    private final String clientSecret;
    private final String id;
    private final boolean livemode;
    private final ManualEntry manualEntry;
    private final PaymentAccount paymentAccount;
    private final String returnUrl;
    private final Status status;
    private final StatusDetails statusDetails;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<FinancialConnectionsSession> CREATOR = new Creator();

    /* compiled from: FinancialConnectionsSession.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FinancialConnectionsSession> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsSession createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FinancialConnectionsSession(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : FinancialConnectionsAccountList.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FinancialConnectionsAccountList.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (PaymentAccount) parcel.readParcelable(FinancialConnectionsSession.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ManualEntry.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString()), parcel.readInt() != 0 ? StatusDetails.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsSession[] newArray(int i) {
            return new FinancialConnectionsSession[i];
        }
    }

    public static /* synthetic */ FinancialConnectionsSession copy$default(FinancialConnectionsSession financialConnectionsSession, String str, String str2, FinancialConnectionsAccountList financialConnectionsAccountList, FinancialConnectionsAccountList financialConnectionsAccountList2, boolean z, PaymentAccount paymentAccount, String str3, String str4, ManualEntry manualEntry, Status status, StatusDetails statusDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            str = financialConnectionsSession.clientSecret;
        }
        if ((i & 2) != 0) {
            str2 = financialConnectionsSession.id;
        }
        if ((i & 4) != 0) {
            financialConnectionsAccountList = financialConnectionsSession.accountsOld;
        }
        if ((i & 8) != 0) {
            financialConnectionsAccountList2 = financialConnectionsSession.accountsNew;
        }
        if ((i & 16) != 0) {
            z = financialConnectionsSession.livemode;
        }
        if ((i & 32) != 0) {
            paymentAccount = financialConnectionsSession.paymentAccount;
        }
        if ((i & 64) != 0) {
            str3 = financialConnectionsSession.returnUrl;
        }
        if ((i & 128) != 0) {
            str4 = financialConnectionsSession.bankAccountToken;
        }
        if ((i & 256) != 0) {
            manualEntry = financialConnectionsSession.manualEntry;
        }
        if ((i & 512) != 0) {
            status = financialConnectionsSession.status;
        }
        if ((i & 1024) != 0) {
            statusDetails = financialConnectionsSession.statusDetails;
        }
        Status status2 = status;
        StatusDetails statusDetails2 = statusDetails;
        String str5 = str4;
        ManualEntry manualEntry2 = manualEntry;
        PaymentAccount paymentAccount2 = paymentAccount;
        String str6 = str3;
        boolean z2 = z;
        FinancialConnectionsAccountList financialConnectionsAccountList3 = financialConnectionsAccountList;
        return financialConnectionsSession.copy(str, str2, financialConnectionsAccountList3, financialConnectionsAccountList2, z2, paymentAccount2, str6, str5, manualEntry2, status2, statusDetails2);
    }

    @SerialName("accounts")
    public static /* synthetic */ void getAccountsNew$financial_connections_core_release$annotations() {
    }

    @SerialName(NetworkConstants.PARAM_LINKED_ACCOUNTS)
    public static /* synthetic */ void getAccountsOld$financial_connections_core_release$annotations() {
    }

    @SerialName("bank_account_token")
    @Serializable(with = JsonAsStringSerializer.class)
    public static /* synthetic */ void getBankAccountToken$annotations() {
    }

    @SerialName("client_secret")
    public static /* synthetic */ void getClientSecret$annotations() {
    }

    @SerialName("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName(TokenJsonParser.FIELD_LIVEMODE)
    public static /* synthetic */ void getLivemode$annotations() {
    }

    @SerialName("manual_entry")
    public static /* synthetic */ void getManualEntry$annotations() {
    }

    @SerialName("payment_account")
    public static /* synthetic */ void getPaymentAccount$annotations() {
    }

    @SerialName("return_url")
    public static /* synthetic */ void getReturnUrl$annotations() {
    }

    @SerialName("status")
    public static /* synthetic */ void getStatus$annotations() {
    }

    @SerialName("status_details")
    public static /* synthetic */ void getStatusDetails$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getClientSecret() {
        return this.clientSecret;
    }

    /* renamed from: component10, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component11, reason: from getter */
    public final StatusDetails getStatusDetails() {
        return this.statusDetails;
    }

    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component3$financial_connections_core_release, reason: from getter */
    public final FinancialConnectionsAccountList getAccountsOld() {
        return this.accountsOld;
    }

    /* renamed from: component4$financial_connections_core_release, reason: from getter */
    public final FinancialConnectionsAccountList getAccountsNew() {
        return this.accountsNew;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getLivemode() {
        return this.livemode;
    }

    /* renamed from: component6, reason: from getter */
    public final PaymentAccount getPaymentAccount() {
        return this.paymentAccount;
    }

    /* renamed from: component7, reason: from getter */
    public final String getReturnUrl() {
        return this.returnUrl;
    }

    /* renamed from: component8, reason: from getter */
    public final String getBankAccountToken() {
        return this.bankAccountToken;
    }

    /* renamed from: component9, reason: from getter */
    public final ManualEntry getManualEntry() {
        return this.manualEntry;
    }

    public final FinancialConnectionsSession copy(String clientSecret, String id, FinancialConnectionsAccountList accountsOld, FinancialConnectionsAccountList accountsNew, boolean livemode, PaymentAccount paymentAccount, String returnUrl, String bankAccountToken, ManualEntry manualEntry, Status status, StatusDetails statusDetails) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(id, "id");
        return new FinancialConnectionsSession(clientSecret, id, accountsOld, accountsNew, livemode, paymentAccount, returnUrl, bankAccountToken, manualEntry, status, statusDetails);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinancialConnectionsSession)) {
            return false;
        }
        FinancialConnectionsSession financialConnectionsSession = (FinancialConnectionsSession) other;
        return Intrinsics.areEqual(this.clientSecret, financialConnectionsSession.clientSecret) && Intrinsics.areEqual(this.id, financialConnectionsSession.id) && Intrinsics.areEqual(this.accountsOld, financialConnectionsSession.accountsOld) && Intrinsics.areEqual(this.accountsNew, financialConnectionsSession.accountsNew) && this.livemode == financialConnectionsSession.livemode && Intrinsics.areEqual(this.paymentAccount, financialConnectionsSession.paymentAccount) && Intrinsics.areEqual(this.returnUrl, financialConnectionsSession.returnUrl) && Intrinsics.areEqual(this.bankAccountToken, financialConnectionsSession.bankAccountToken) && Intrinsics.areEqual(this.manualEntry, financialConnectionsSession.manualEntry) && this.status == financialConnectionsSession.status && Intrinsics.areEqual(this.statusDetails, financialConnectionsSession.statusDetails);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int iHashCode = ((this.clientSecret.hashCode() * 31) + this.id.hashCode()) * 31;
        FinancialConnectionsAccountList financialConnectionsAccountList = this.accountsOld;
        int iHashCode2 = (iHashCode + (financialConnectionsAccountList == null ? 0 : financialConnectionsAccountList.hashCode())) * 31;
        FinancialConnectionsAccountList financialConnectionsAccountList2 = this.accountsNew;
        int iHashCode3 = (((iHashCode2 + (financialConnectionsAccountList2 == null ? 0 : financialConnectionsAccountList2.hashCode())) * 31) + Boolean.hashCode(this.livemode)) * 31;
        PaymentAccount paymentAccount = this.paymentAccount;
        int iHashCode4 = (iHashCode3 + (paymentAccount == null ? 0 : paymentAccount.hashCode())) * 31;
        String str = this.returnUrl;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bankAccountToken;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ManualEntry manualEntry = this.manualEntry;
        int iHashCode7 = (iHashCode6 + (manualEntry == null ? 0 : manualEntry.hashCode())) * 31;
        Status status = this.status;
        int iHashCode8 = (iHashCode7 + (status == null ? 0 : status.hashCode())) * 31;
        StatusDetails statusDetails = this.statusDetails;
        return iHashCode8 + (statusDetails != null ? statusDetails.hashCode() : 0);
    }

    public String toString() {
        return "FinancialConnectionsSession(clientSecret=" + this.clientSecret + ", id=" + this.id + ", accountsOld=" + this.accountsOld + ", accountsNew=" + this.accountsNew + ", livemode=" + this.livemode + ", paymentAccount=" + this.paymentAccount + ", returnUrl=" + this.returnUrl + ", bankAccountToken=" + this.bankAccountToken + ", manualEntry=" + this.manualEntry + ", status=" + this.status + ", statusDetails=" + this.statusDetails + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.clientSecret);
        dest.writeString(this.id);
        FinancialConnectionsAccountList financialConnectionsAccountList = this.accountsOld;
        if (financialConnectionsAccountList == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            financialConnectionsAccountList.writeToParcel(dest, flags);
        }
        FinancialConnectionsAccountList financialConnectionsAccountList2 = this.accountsNew;
        if (financialConnectionsAccountList2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            financialConnectionsAccountList2.writeToParcel(dest, flags);
        }
        dest.writeInt(this.livemode ? 1 : 0);
        dest.writeParcelable(this.paymentAccount, flags);
        dest.writeString(this.returnUrl);
        dest.writeString(this.bankAccountToken);
        ManualEntry manualEntry = this.manualEntry;
        if (manualEntry == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            manualEntry.writeToParcel(dest, flags);
        }
        Status status = this.status;
        if (status == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(status.name());
        }
        StatusDetails statusDetails = this.statusDetails;
        if (statusDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            statusDetails.writeToParcel(dest, flags);
        }
    }

    /* compiled from: FinancialConnectionsSession.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FinancialConnectionsSession> serializer() {
            return FinancialConnectionsSession$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FinancialConnectionsSession(int i, String str, String str2, FinancialConnectionsAccountList financialConnectionsAccountList, FinancialConnectionsAccountList financialConnectionsAccountList2, boolean z, PaymentAccount paymentAccount, String str3, String str4, ManualEntry manualEntry, Status status, StatusDetails statusDetails, SerializationConstructorMarker serializationConstructorMarker) {
        if (19 != (i & 19)) {
            PluginExceptionsKt.throwMissingFieldException(i, 19, FinancialConnectionsSession$$serializer.INSTANCE.getDescriptor());
        }
        this.clientSecret = str;
        this.id = str2;
        if ((i & 4) == 0) {
            this.accountsOld = null;
        } else {
            this.accountsOld = financialConnectionsAccountList;
        }
        if ((i & 8) == 0) {
            this.accountsNew = null;
        } else {
            this.accountsNew = financialConnectionsAccountList2;
        }
        this.livemode = z;
        if ((i & 32) == 0) {
            this.paymentAccount = null;
        } else {
            this.paymentAccount = paymentAccount;
        }
        if ((i & 64) == 0) {
            this.returnUrl = null;
        } else {
            this.returnUrl = str3;
        }
        if ((i & 128) == 0) {
            this.bankAccountToken = null;
        } else {
            this.bankAccountToken = str4;
        }
        if ((i & 256) == 0) {
            this.manualEntry = null;
        } else {
            this.manualEntry = manualEntry;
        }
        if ((i & 512) == 0) {
            this.status = null;
        } else {
            this.status = status;
        }
        if ((i & 1024) == 0) {
            this.statusDetails = null;
        } else {
            this.statusDetails = statusDetails;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$financial_connections_core_release(FinancialConnectionsSession self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.clientSecret);
        output.encodeStringElement(serialDesc, 1, self.id);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.accountsOld != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, FinancialConnectionsAccountList$$serializer.INSTANCE, self.accountsOld);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.accountsNew != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, FinancialConnectionsAccountList$$serializer.INSTANCE, self.accountsNew);
        }
        output.encodeBooleanElement(serialDesc, 4, self.livemode);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.paymentAccount != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, PaymentAccountSerializer.INSTANCE, self.paymentAccount);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.returnUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.returnUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.bankAccountToken != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, JsonAsStringSerializer.INSTANCE, self.bankAccountToken);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.manualEntry != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, ManualEntry$$serializer.INSTANCE, self.manualEntry);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.status != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, Status.Serializer.INSTANCE, self.status);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 10) && self.statusDetails == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 10, FinancialConnectionsSession$StatusDetails$$serializer.INSTANCE, self.statusDetails);
    }

    public FinancialConnectionsSession(String clientSecret, String id, FinancialConnectionsAccountList financialConnectionsAccountList, FinancialConnectionsAccountList financialConnectionsAccountList2, boolean z, PaymentAccount paymentAccount, String str, String str2, ManualEntry manualEntry, Status status, StatusDetails statusDetails) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(id, "id");
        this.clientSecret = clientSecret;
        this.id = id;
        this.accountsOld = financialConnectionsAccountList;
        this.accountsNew = financialConnectionsAccountList2;
        this.livemode = z;
        this.paymentAccount = paymentAccount;
        this.returnUrl = str;
        this.bankAccountToken = str2;
        this.manualEntry = manualEntry;
        this.status = status;
        this.statusDetails = statusDetails;
    }

    public /* synthetic */ FinancialConnectionsSession(String str, String str2, FinancialConnectionsAccountList financialConnectionsAccountList, FinancialConnectionsAccountList financialConnectionsAccountList2, boolean z, PaymentAccount paymentAccount, String str3, String str4, ManualEntry manualEntry, Status status, StatusDetails statusDetails, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : financialConnectionsAccountList, (i & 8) != 0 ? null : financialConnectionsAccountList2, z, (i & 32) != 0 ? null : paymentAccount, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : manualEntry, (i & 512) != 0 ? null : status, (i & 1024) != 0 ? null : statusDetails);
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final String getId() {
        return this.id;
    }

    public final FinancialConnectionsAccountList getAccountsOld$financial_connections_core_release() {
        return this.accountsOld;
    }

    public final FinancialConnectionsAccountList getAccountsNew$financial_connections_core_release() {
        return this.accountsNew;
    }

    public final boolean getLivemode() {
        return this.livemode;
    }

    public final PaymentAccount getPaymentAccount() {
        return this.paymentAccount;
    }

    public final String getReturnUrl() {
        return this.returnUrl;
    }

    public final String getBankAccountToken() {
        return this.bankAccountToken;
    }

    public final ManualEntry getManualEntry() {
        return this.manualEntry;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final StatusDetails getStatusDetails() {
        return this.statusDetails;
    }

    public final FinancialConnectionsAccountList getAccounts() {
        FinancialConnectionsAccountList financialConnectionsAccountList = this.accountsNew;
        if (financialConnectionsAccountList != null) {
            return financialConnectionsAccountList;
        }
        FinancialConnectionsAccountList financialConnectionsAccountList2 = this.accountsOld;
        Intrinsics.checkNotNull(financialConnectionsAccountList2);
        return financialConnectionsAccountList2;
    }

    public final Token getParsedToken() {
        String str = this.bankAccountToken;
        if (str != null) {
            return new TokenJsonParser().parse(new JSONObject(str));
        }
        return null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FinancialConnectionsSession.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\r\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PENDING", "SUCCEEDED", "CANCELED", "FAILED", "UNKNOWN", "Serializer", "Companion", "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable(with = Serializer.class)
    public static final class Status {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String value;

        @SerialName("pending")
        public static final Status PENDING = new Status("PENDING", 0, "pending");

        @SerialName("succeeded")
        public static final Status SUCCEEDED = new Status("SUCCEEDED", 1, "succeeded");

        @SerialName("canceled")
        public static final Status CANCELED = new Status("CANCELED", 2, "canceled");

        @SerialName("failed")
        public static final Status FAILED = new Status("FAILED", 3, "failed");

        @SerialName("unknown")
        public static final Status UNKNOWN = new Status("UNKNOWN", 4, "unknown");

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{PENDING, SUCCEEDED, CANCELED, FAILED, UNKNOWN};
        }

        public static EnumEntries<Status> getEntries() {
            return $ENTRIES;
        }

        /* compiled from: FinancialConnectionsSession.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;", "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Status> serializer() {
                return Serializer.INSTANCE;
            }
        }

        private Status(String str, int i, String str2) {
            this.value = str2;
        }

        public final String getValue() {
            return this.value;
        }

        static {
            Status[] statusArr$values = $values();
            $VALUES = statusArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(statusArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: FinancialConnectionsSession.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status$Serializer;", "Lcom/stripe/android/core/model/serializers/EnumIgnoreUnknownSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;", "<init>", "()V", "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Serializer extends EnumIgnoreUnknownSerializer<Status> {
            public static final Serializer INSTANCE = new Serializer();

            private Serializer() {
                super((Enum[]) Status.getEntries().toArray(new Status[0]), Status.UNKNOWN);
            }
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    /* compiled from: FinancialConnectionsSession.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0003%&'B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0007J%\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006("}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;", "Landroid/os/Parcelable;", AnalyticsEvents.PARAMETER_SHARE_OUTCOME_CANCELLED, "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCancelled$annotations", "()V", "getCancelled", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;", "component1", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_core_release", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_CANCELLED, "$serializer", "Companion", "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final /* data */ class StatusDetails implements Parcelable {
        private final Cancelled cancelled;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<StatusDetails> CREATOR = new Creator();

        /* compiled from: FinancialConnectionsSession.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<StatusDetails> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StatusDetails createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StatusDetails(parcel.readInt() == 0 ? null : Cancelled.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StatusDetails[] newArray(int i) {
                return new StatusDetails[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public StatusDetails() {
            this((Cancelled) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ StatusDetails copy$default(StatusDetails statusDetails, Cancelled cancelled, int i, Object obj) {
            if ((i & 1) != 0) {
                cancelled = statusDetails.cancelled;
            }
            return statusDetails.copy(cancelled);
        }

        @SerialName(AnalyticsEvents.PARAMETER_SHARE_OUTCOME_CANCELLED)
        public static /* synthetic */ void getCancelled$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final Cancelled getCancelled() {
            return this.cancelled;
        }

        public final StatusDetails copy(Cancelled cancelled) {
            return new StatusDetails(cancelled);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StatusDetails) && Intrinsics.areEqual(this.cancelled, ((StatusDetails) other).cancelled);
        }

        public int hashCode() {
            Cancelled cancelled = this.cancelled;
            if (cancelled == null) {
                return 0;
            }
            return cancelled.hashCode();
        }

        public String toString() {
            return "StatusDetails(cancelled=" + this.cancelled + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Cancelled cancelled = this.cancelled;
            if (cancelled == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                cancelled.writeToParcel(dest, flags);
            }
        }

        /* compiled from: FinancialConnectionsSession.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;", "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<StatusDetails> serializer() {
                return FinancialConnectionsSession$StatusDetails$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ StatusDetails(int i, Cancelled cancelled, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.cancelled = null;
            } else {
                this.cancelled = cancelled;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$financial_connections_core_release(StatusDetails self, CompositeEncoder output, SerialDescriptor serialDesc) {
            if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.cancelled == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 0, FinancialConnectionsSession$StatusDetails$Cancelled$$serializer.INSTANCE, self.cancelled);
        }

        public StatusDetails(Cancelled cancelled) {
            this.cancelled = cancelled;
        }

        public /* synthetic */ StatusDetails(Cancelled cancelled, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : cancelled);
        }

        /* compiled from: FinancialConnectionsSession.kt */
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0003%&'B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0007J%\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006("}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;", "Landroid/os/Parcelable;", "reason", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason;", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getReason$annotations", "()V", "getReason", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason;", "component1", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_core_release", "Reason", "$serializer", "Companion", "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @Serializable
        public static final /* data */ class Cancelled implements Parcelable {
            private final Reason reason;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final Parcelable.Creator<Cancelled> CREATOR = new Creator();

            /* compiled from: FinancialConnectionsSession.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Cancelled> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Cancelled createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Cancelled(Reason.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Cancelled[] newArray(int i) {
                    return new Cancelled[i];
                }
            }

            public static /* synthetic */ Cancelled copy$default(Cancelled cancelled, Reason reason, int i, Object obj) {
                if ((i & 1) != 0) {
                    reason = cancelled.reason;
                }
                return cancelled.copy(reason);
            }

            @SerialName("reason")
            public static /* synthetic */ void getReason$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final Reason getReason() {
                return this.reason;
            }

            public final Cancelled copy(Reason reason) {
                Intrinsics.checkNotNullParameter(reason, "reason");
                return new Cancelled(reason);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Cancelled) && this.reason == ((Cancelled) other).reason;
            }

            public int hashCode() {
                return this.reason.hashCode();
            }

            public String toString() {
                return "Cancelled(reason=" + this.reason + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.reason.name());
            }

            /* compiled from: FinancialConnectionsSession.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;", "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Cancelled> serializer() {
                    return FinancialConnectionsSession$StatusDetails$Cancelled$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Cancelled(int i, Reason reason, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptionsKt.throwMissingFieldException(i, 1, FinancialConnectionsSession$StatusDetails$Cancelled$$serializer.INSTANCE.getDescriptor());
                }
                this.reason = reason;
            }

            public Cancelled(Reason reason) {
                Intrinsics.checkNotNullParameter(reason, "reason");
                this.reason = reason;
            }

            public final Reason getReason() {
                return this.reason;
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: FinancialConnectionsSession.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000b\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CUSTOM_MANUAL_ENTRY", "OTHER", "UNKNOWN", "Serializer", "Companion", "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            @Serializable(with = Serializer.class)
            public static final class Reason {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ Reason[] $VALUES;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private final String value;

                @SerialName("custom_manual_entry")
                public static final Reason CUSTOM_MANUAL_ENTRY = new Reason("CUSTOM_MANUAL_ENTRY", 0, "custom_manual_entry");

                @SerialName("other")
                public static final Reason OTHER = new Reason("OTHER", 1, "other");

                @SerialName("unknown")
                public static final Reason UNKNOWN = new Reason("UNKNOWN", 2, "unknown");

                private static final /* synthetic */ Reason[] $values() {
                    return new Reason[]{CUSTOM_MANUAL_ENTRY, OTHER, UNKNOWN};
                }

                public static EnumEntries<Reason> getEntries() {
                    return $ENTRIES;
                }

                /* compiled from: FinancialConnectionsSession.kt */
                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason;", "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Reason> serializer() {
                        return Serializer.INSTANCE;
                    }
                }

                private Reason(String str, int i, String str2) {
                    this.value = str2;
                }

                public final String getValue() {
                    return this.value;
                }

                static {
                    Reason[] reasonArr$values = $values();
                    $VALUES = reasonArr$values;
                    $ENTRIES = EnumEntriesKt.enumEntries(reasonArr$values);
                    INSTANCE = new Companion(null);
                }

                /* compiled from: FinancialConnectionsSession.kt */
                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason$Serializer;", "Lcom/stripe/android/core/model/serializers/EnumIgnoreUnknownSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason;", "<init>", "()V", "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class Serializer extends EnumIgnoreUnknownSerializer<Reason> {
                    public static final Serializer INSTANCE = new Serializer();

                    private Serializer() {
                        super((Enum[]) Reason.getEntries().toArray(new Reason[0]), Reason.UNKNOWN);
                    }
                }

                public static Reason valueOf(String str) {
                    return (Reason) Enum.valueOf(Reason.class, str);
                }

                public static Reason[] values() {
                    return (Reason[]) $VALUES.clone();
                }
            }
        }

        public final Cancelled getCancelled() {
            return this.cancelled;
        }
    }
}
