package com.stripe.android.stripe3ds2.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.AnalyticsEvents;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ChallengeRequestData.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0002HIB\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010)\u001a\u00020*H\u0000¢\u0006\u0002\b+J\r\u0010,\u001a\u00020\u0000H\u0000¢\u0006\u0002\b-J\t\u0010.\u001a\u00020\u0004HÆ\u0003J\t\u0010/\u001a\u00020\u0004HÆ\u0003J\t\u00100\u001a\u00020\u0004HÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u00106\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010%J\u0010\u00108\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010%J\u0010\u00109\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010%J\u009c\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u0010;J\u0006\u0010<\u001a\u00020=J\u0013\u0010>\u001a\u00020\u00122\b\u0010?\u001a\u0004\u0018\u00010@HÖ\u0003J\t\u0010A\u001a\u00020=HÖ\u0001J\t\u0010B\u001a\u00020\u0004HÖ\u0001J\u0016\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020=R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010&\u001a\u0004\b'\u0010%R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010&\u001a\u0004\b(\u0010%¨\u0006J"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", ChallengeRequestData.FIELD_MESSAGE_VERSION, "", "threeDsServerTransId", "acsTransId", "sdkTransId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", ChallengeRequestData.FIELD_THREE_DS_REQUESTOR_APP_URL, ChallengeRequestData.FIELD_CHALLENGE_DATA_ENTRY, "cancelReason", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;", "challengeHtmlDataEntry", ChallengeRequestData.FIELD_MESSAGE_EXTENSION, "", "Lcom/stripe/android/stripe3ds2/transactions/MessageExtension;", ChallengeRequestData.FIELD_OOB_CONTINUE, "", "shouldResendChallenge", ChallengeRequestData.FIELD_WHITELISTING_DATA_ENTRY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getMessageVersion", "()Ljava/lang/String;", "getThreeDsServerTransId", "getAcsTransId", "getSdkTransId", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "getThreeDSRequestorAppURL", "getChallengeDataEntry", "getCancelReason", "()Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;", "getChallengeHtmlDataEntry", "getMessageExtensions", "()Ljava/util/List;", "getOobContinue", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShouldResendChallenge", "getWhitelistingDataEntry", "toJson", "Lorg/json/JSONObject;", "toJson$3ds2sdk_release", "sanitize", "sanitize$3ds2sdk_release", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "CancelReason", "Companion", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ChallengeRequestData implements Serializable, Parcelable {
    public static final String FIELD_3DS_SERVER_TRANS_ID = "threeDSServerTransID";
    public static final String FIELD_ACS_TRANS_ID = "acsTransID";
    public static final String FIELD_CHALLENGE_CANCEL = "challengeCancel";
    public static final String FIELD_CHALLENGE_DATA_ENTRY = "challengeDataEntry";
    public static final String FIELD_CHALLENGE_HTML_DATA_ENTRY = "challengeHTMLDataEntry";
    public static final String FIELD_CHALLENGE_NO_ENTRY = "challengeNoEntry";
    public static final String FIELD_MESSAGE_EXTENSION = "messageExtensions";
    public static final String FIELD_MESSAGE_TYPE = "messageType";
    public static final String FIELD_MESSAGE_VERSION = "messageVersion";
    public static final String FIELD_OOB_CONTINUE = "oobContinue";
    public static final String FIELD_RESEND_CHALLENGE = "resendChallenge";
    public static final String FIELD_SDK_TRANS_ID = "sdkTransID";
    public static final String FIELD_THREE_DS_REQUESTOR_APP_URL = "threeDSRequestorAppURL";
    public static final String FIELD_WHITELISTING_DATA_ENTRY = "whitelistingDataEntry";
    public static final String MESSAGE_TYPE = "CReq";
    public static final String YES_VALUE = "Y";
    private final String acsTransId;
    private final CancelReason cancelReason;
    private final String challengeDataEntry;
    private final String challengeHtmlDataEntry;
    private final List<MessageExtension> messageExtensions;
    private final String messageVersion;
    private final Boolean oobContinue;
    private final SdkTransactionId sdkTransId;
    private final Boolean shouldResendChallenge;
    private final String threeDSRequestorAppURL;
    private final String threeDsServerTransId;
    private final Boolean whitelistingDataEntry;
    public static final Parcelable.Creator<ChallengeRequestData> CREATOR = new Creator();

    /* compiled from: ChallengeRequestData.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ChallengeRequestData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChallengeRequestData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            SdkTransactionId sdkTransactionIdCreateFromParcel = SdkTransactionId.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            CancelReason cancelReasonValueOf = parcel.readInt() == 0 ? null : CancelReason.valueOf(parcel.readString());
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(MessageExtension.CREATOR.createFromParcel(parcel));
                }
            }
            return new ChallengeRequestData(string, string2, string3, sdkTransactionIdCreateFromParcel, string4, string5, cancelReasonValueOf, string6, arrayList, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChallengeRequestData[] newArray(int i) {
            return new ChallengeRequestData[i];
        }
    }

    public static /* synthetic */ ChallengeRequestData copy$default(ChallengeRequestData challengeRequestData, String str, String str2, String str3, SdkTransactionId sdkTransactionId, String str4, String str5, CancelReason cancelReason, String str6, List list, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = challengeRequestData.messageVersion;
        }
        if ((i & 2) != 0) {
            str2 = challengeRequestData.threeDsServerTransId;
        }
        if ((i & 4) != 0) {
            str3 = challengeRequestData.acsTransId;
        }
        if ((i & 8) != 0) {
            sdkTransactionId = challengeRequestData.sdkTransId;
        }
        if ((i & 16) != 0) {
            str4 = challengeRequestData.threeDSRequestorAppURL;
        }
        if ((i & 32) != 0) {
            str5 = challengeRequestData.challengeDataEntry;
        }
        if ((i & 64) != 0) {
            cancelReason = challengeRequestData.cancelReason;
        }
        if ((i & 128) != 0) {
            str6 = challengeRequestData.challengeHtmlDataEntry;
        }
        if ((i & 256) != 0) {
            list = challengeRequestData.messageExtensions;
        }
        if ((i & 512) != 0) {
            bool = challengeRequestData.oobContinue;
        }
        if ((i & 1024) != 0) {
            bool2 = challengeRequestData.shouldResendChallenge;
        }
        if ((i & 2048) != 0) {
            bool3 = challengeRequestData.whitelistingDataEntry;
        }
        Boolean bool4 = bool2;
        Boolean bool5 = bool3;
        List list2 = list;
        Boolean bool6 = bool;
        CancelReason cancelReason2 = cancelReason;
        String str7 = str6;
        String str8 = str4;
        String str9 = str5;
        return challengeRequestData.copy(str, str2, str3, sdkTransactionId, str8, str9, cancelReason2, str7, list2, bool6, bool4, bool5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMessageVersion() {
        return this.messageVersion;
    }

    /* renamed from: component10, reason: from getter */
    public final Boolean getOobContinue() {
        return this.oobContinue;
    }

    /* renamed from: component11, reason: from getter */
    public final Boolean getShouldResendChallenge() {
        return this.shouldResendChallenge;
    }

    /* renamed from: component12, reason: from getter */
    public final Boolean getWhitelistingDataEntry() {
        return this.whitelistingDataEntry;
    }

    /* renamed from: component2, reason: from getter */
    public final String getThreeDsServerTransId() {
        return this.threeDsServerTransId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAcsTransId() {
        return this.acsTransId;
    }

    /* renamed from: component4, reason: from getter */
    public final SdkTransactionId getSdkTransId() {
        return this.sdkTransId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getThreeDSRequestorAppURL() {
        return this.threeDSRequestorAppURL;
    }

    /* renamed from: component6, reason: from getter */
    public final String getChallengeDataEntry() {
        return this.challengeDataEntry;
    }

    /* renamed from: component7, reason: from getter */
    public final CancelReason getCancelReason() {
        return this.cancelReason;
    }

    /* renamed from: component8, reason: from getter */
    public final String getChallengeHtmlDataEntry() {
        return this.challengeHtmlDataEntry;
    }

    public final List<MessageExtension> component9() {
        return this.messageExtensions;
    }

    public final ChallengeRequestData copy(String messageVersion, String threeDsServerTransId, String acsTransId, SdkTransactionId sdkTransId, String threeDSRequestorAppURL, String challengeDataEntry, CancelReason cancelReason, String challengeHtmlDataEntry, List<MessageExtension> messageExtensions, Boolean oobContinue, Boolean shouldResendChallenge, Boolean whitelistingDataEntry) {
        Intrinsics.checkNotNullParameter(messageVersion, "messageVersion");
        Intrinsics.checkNotNullParameter(threeDsServerTransId, "threeDsServerTransId");
        Intrinsics.checkNotNullParameter(acsTransId, "acsTransId");
        Intrinsics.checkNotNullParameter(sdkTransId, "sdkTransId");
        return new ChallengeRequestData(messageVersion, threeDsServerTransId, acsTransId, sdkTransId, threeDSRequestorAppURL, challengeDataEntry, cancelReason, challengeHtmlDataEntry, messageExtensions, oobContinue, shouldResendChallenge, whitelistingDataEntry);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeRequestData)) {
            return false;
        }
        ChallengeRequestData challengeRequestData = (ChallengeRequestData) other;
        return Intrinsics.areEqual(this.messageVersion, challengeRequestData.messageVersion) && Intrinsics.areEqual(this.threeDsServerTransId, challengeRequestData.threeDsServerTransId) && Intrinsics.areEqual(this.acsTransId, challengeRequestData.acsTransId) && Intrinsics.areEqual(this.sdkTransId, challengeRequestData.sdkTransId) && Intrinsics.areEqual(this.threeDSRequestorAppURL, challengeRequestData.threeDSRequestorAppURL) && Intrinsics.areEqual(this.challengeDataEntry, challengeRequestData.challengeDataEntry) && this.cancelReason == challengeRequestData.cancelReason && Intrinsics.areEqual(this.challengeHtmlDataEntry, challengeRequestData.challengeHtmlDataEntry) && Intrinsics.areEqual(this.messageExtensions, challengeRequestData.messageExtensions) && Intrinsics.areEqual(this.oobContinue, challengeRequestData.oobContinue) && Intrinsics.areEqual(this.shouldResendChallenge, challengeRequestData.shouldResendChallenge) && Intrinsics.areEqual(this.whitelistingDataEntry, challengeRequestData.whitelistingDataEntry);
    }

    public int hashCode() {
        int iHashCode = ((((((this.messageVersion.hashCode() * 31) + this.threeDsServerTransId.hashCode()) * 31) + this.acsTransId.hashCode()) * 31) + this.sdkTransId.hashCode()) * 31;
        String str = this.threeDSRequestorAppURL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.challengeDataEntry;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CancelReason cancelReason = this.cancelReason;
        int iHashCode4 = (iHashCode3 + (cancelReason == null ? 0 : cancelReason.hashCode())) * 31;
        String str3 = this.challengeHtmlDataEntry;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<MessageExtension> list = this.messageExtensions;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.oobContinue;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.shouldResendChallenge;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.whitelistingDataEntry;
        return iHashCode8 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public String toString() {
        return "ChallengeRequestData(messageVersion=" + this.messageVersion + ", threeDsServerTransId=" + this.threeDsServerTransId + ", acsTransId=" + this.acsTransId + ", sdkTransId=" + this.sdkTransId + ", threeDSRequestorAppURL=" + this.threeDSRequestorAppURL + ", challengeDataEntry=" + this.challengeDataEntry + ", cancelReason=" + this.cancelReason + ", challengeHtmlDataEntry=" + this.challengeHtmlDataEntry + ", messageExtensions=" + this.messageExtensions + ", oobContinue=" + this.oobContinue + ", shouldResendChallenge=" + this.shouldResendChallenge + ", whitelistingDataEntry=" + this.whitelistingDataEntry + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.messageVersion);
        dest.writeString(this.threeDsServerTransId);
        dest.writeString(this.acsTransId);
        this.sdkTransId.writeToParcel(dest, flags);
        dest.writeString(this.threeDSRequestorAppURL);
        dest.writeString(this.challengeDataEntry);
        CancelReason cancelReason = this.cancelReason;
        if (cancelReason == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cancelReason.name());
        }
        dest.writeString(this.challengeHtmlDataEntry);
        List<MessageExtension> list = this.messageExtensions;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<MessageExtension> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        Boolean bool = this.oobContinue;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.shouldResendChallenge;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.whitelistingDataEntry;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
    }

    public ChallengeRequestData(String messageVersion, String threeDsServerTransId, String acsTransId, SdkTransactionId sdkTransId, String str, String str2, CancelReason cancelReason, String str3, List<MessageExtension> list, Boolean bool, Boolean bool2, Boolean bool3) {
        Intrinsics.checkNotNullParameter(messageVersion, "messageVersion");
        Intrinsics.checkNotNullParameter(threeDsServerTransId, "threeDsServerTransId");
        Intrinsics.checkNotNullParameter(acsTransId, "acsTransId");
        Intrinsics.checkNotNullParameter(sdkTransId, "sdkTransId");
        this.messageVersion = messageVersion;
        this.threeDsServerTransId = threeDsServerTransId;
        this.acsTransId = acsTransId;
        this.sdkTransId = sdkTransId;
        this.threeDSRequestorAppURL = str;
        this.challengeDataEntry = str2;
        this.cancelReason = cancelReason;
        this.challengeHtmlDataEntry = str3;
        this.messageExtensions = list;
        this.oobContinue = bool;
        this.shouldResendChallenge = bool2;
        this.whitelistingDataEntry = bool3;
    }

    public /* synthetic */ ChallengeRequestData(String str, String str2, String str3, SdkTransactionId sdkTransactionId, String str4, String str5, CancelReason cancelReason, String str6, List list, Boolean bool, Boolean bool2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, sdkTransactionId, str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : cancelReason, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : list, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : bool2, (i & 2048) != 0 ? null : bool3);
    }

    public final String getMessageVersion() {
        return this.messageVersion;
    }

    public final String getThreeDsServerTransId() {
        return this.threeDsServerTransId;
    }

    public final String getAcsTransId() {
        return this.acsTransId;
    }

    public final SdkTransactionId getSdkTransId() {
        return this.sdkTransId;
    }

    public final String getThreeDSRequestorAppURL() {
        return this.threeDSRequestorAppURL;
    }

    public final String getChallengeDataEntry() {
        return this.challengeDataEntry;
    }

    public final CancelReason getCancelReason() {
        return this.cancelReason;
    }

    public final String getChallengeHtmlDataEntry() {
        return this.challengeHtmlDataEntry;
    }

    public final List<MessageExtension> getMessageExtensions() {
        return this.messageExtensions;
    }

    public final Boolean getOobContinue() {
        return this.oobContinue;
    }

    public final Boolean getShouldResendChallenge() {
        return this.shouldResendChallenge;
    }

    public final Boolean getWhitelistingDataEntry() {
        return this.whitelistingDataEntry;
    }

    public final JSONObject toJson$3ds2sdk_release() {
        String str;
        try {
            Result.Companion companion = Result.INSTANCE;
            ChallengeRequestData challengeRequestData = this;
            JSONObject jSONObjectPut = new JSONObject().put(FIELD_MESSAGE_TYPE, MESSAGE_TYPE).put(FIELD_MESSAGE_VERSION, this.messageVersion).put(FIELD_SDK_TRANS_ID, this.sdkTransId.getValue()).put(FIELD_3DS_SERVER_TRANS_ID, this.threeDsServerTransId).put(FIELD_ACS_TRANS_ID, this.acsTransId);
            CancelReason cancelReason = this.cancelReason;
            if (cancelReason != null) {
                jSONObjectPut.put(FIELD_CHALLENGE_CANCEL, cancelReason.getCode());
            }
            String str2 = this.threeDSRequestorAppURL;
            if (str2 != null && str2.length() != 0) {
                jSONObjectPut.put(FIELD_THREE_DS_REQUESTOR_APP_URL, this.threeDSRequestorAppURL);
            }
            String str3 = this.challengeDataEntry;
            if (str3 != null && str3.length() != 0) {
                jSONObjectPut.put(FIELD_CHALLENGE_DATA_ENTRY, this.challengeDataEntry);
            }
            String str4 = this.challengeHtmlDataEntry;
            if (str4 != null && str4.length() != 0) {
                jSONObjectPut.put(FIELD_CHALLENGE_HTML_DATA_ENTRY, this.challengeHtmlDataEntry);
            }
            String str5 = this.challengeDataEntry;
            String str6 = YES_VALUE;
            if ((str5 == null || str5.length() == 0) && (((str = this.challengeHtmlDataEntry) == null || str.length() == 0) && this.cancelReason == null)) {
                jSONObjectPut.put(FIELD_CHALLENGE_NO_ENTRY, YES_VALUE);
            }
            JSONArray jsonArray = MessageExtension.INSTANCE.toJsonArray(this.messageExtensions);
            if (jsonArray != null) {
                jSONObjectPut.put(FIELD_MESSAGE_EXTENSION, jsonArray);
            }
            Boolean bool = this.oobContinue;
            if (bool != null) {
                jSONObjectPut.put(FIELD_OOB_CONTINUE, bool.booleanValue());
            }
            Boolean bool2 = this.shouldResendChallenge;
            if (bool2 != null) {
                jSONObjectPut.put(FIELD_RESEND_CHALLENGE, bool2.booleanValue() ? YES_VALUE : "N");
            }
            Boolean bool3 = this.whitelistingDataEntry;
            if (bool3 != null) {
                if (!bool3.booleanValue()) {
                    str6 = "N";
                }
                jSONObjectPut.put(FIELD_WHITELISTING_DATA_ENTRY, str6);
            }
            Intrinsics.checkNotNull(jSONObjectPut);
            return jSONObjectPut;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(Result.m9118constructorimpl(ResultKt.createFailure(th)));
            if (thM9121exceptionOrNullimpl == null) {
                throw new KotlinNothingValueException();
            }
            throw new SDKRuntimeException(thM9121exceptionOrNullimpl);
        }
    }

    public final ChallengeRequestData sanitize$3ds2sdk_release() {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, 3935, null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChallengeRequestData.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "UserSelected", "Reserved", "TransactionTimedOutDecoupled", "TransactionTimedOutOther", "TransactionTimedOutFirstCreq", "TransactionError", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CancelReason {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CancelReason[] $VALUES;
        private final String code;
        public static final CancelReason UserSelected = new CancelReason("UserSelected", 0, "01");
        public static final CancelReason Reserved = new CancelReason("Reserved", 1, "02");
        public static final CancelReason TransactionTimedOutDecoupled = new CancelReason("TransactionTimedOutDecoupled", 2, "03");
        public static final CancelReason TransactionTimedOutOther = new CancelReason("TransactionTimedOutOther", 3, "04");
        public static final CancelReason TransactionTimedOutFirstCreq = new CancelReason("TransactionTimedOutFirstCreq", 4, "05");
        public static final CancelReason TransactionError = new CancelReason("TransactionError", 5, "06");
        public static final CancelReason Unknown = new CancelReason(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, 6, "07");

        private static final /* synthetic */ CancelReason[] $values() {
            return new CancelReason[]{UserSelected, Reserved, TransactionTimedOutDecoupled, TransactionTimedOutOther, TransactionTimedOutFirstCreq, TransactionError, Unknown};
        }

        public static EnumEntries<CancelReason> getEntries() {
            return $ENTRIES;
        }

        private CancelReason(String str, int i, String str2) {
            this.code = str2;
        }

        public final String getCode() {
            return this.code;
        }

        static {
            CancelReason[] cancelReasonArr$values = $values();
            $VALUES = cancelReasonArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(cancelReasonArr$values);
        }

        public static CancelReason valueOf(String str) {
            return (CancelReason) Enum.valueOf(CancelReason.class, str);
        }

        public static CancelReason[] values() {
            return (CancelReason[]) $VALUES.clone();
        }
    }
}
