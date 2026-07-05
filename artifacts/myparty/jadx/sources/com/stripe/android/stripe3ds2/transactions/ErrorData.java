package com.stripe.android.stripe3ds2.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ErrorData.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002:;Bo\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u001e\u001a\u00020\u001fH\u0000¢\u0006\u0002\b J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003J~\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÀ\u0001¢\u0006\u0002\b,J\u0006\u0010-\u001a\u00020.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020.HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001J\u0016\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020.R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006<"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "Landroid/os/Parcelable;", "serverTransId", "", "acsTransId", "dsTransId", ErrorData.FIELD_ERROR_CODE, ErrorData.FIELD_ERROR_COMPONENT, "Lcom/stripe/android/stripe3ds2/transactions/ErrorData$ErrorComponent;", ErrorData.FIELD_ERROR_DESCRIPTION, ErrorData.FIELD_ERROR_DETAIL, ErrorData.FIELD_ERROR_MESSAGE_TYPE, "messageVersion", "sdkTransId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ErrorData$ErrorComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;)V", "getServerTransId", "()Ljava/lang/String;", "getAcsTransId", "getDsTransId", "getErrorCode", "getErrorComponent", "()Lcom/stripe/android/stripe3ds2/transactions/ErrorData$ErrorComponent;", "getErrorDescription", "getErrorDetail", "getErrorMessageType", "getMessageVersion", "getSdkTransId", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "toJson", "Lorg/json/JSONObject;", "toJson$3ds2sdk_release", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "copy$3ds2sdk_release", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "ErrorComponent", "Companion", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ErrorData implements Parcelable {
    private static final String FIELD_3DS_SERVER_TRANS_ID = "threeDSServerTransID";
    private static final String FIELD_ACS_TRANS_ID = "acsTransID";
    private static final String FIELD_DS_TRANS_ID = "dsTransID";
    private static final String FIELD_ERROR_CODE = "errorCode";
    private static final String FIELD_ERROR_COMPONENT = "errorComponent";
    private static final String FIELD_ERROR_DESCRIPTION = "errorDescription";
    private static final String FIELD_ERROR_DETAIL = "errorDetail";
    private static final String FIELD_ERROR_MESSAGE_TYPE = "errorMessageType";
    private static final String FIELD_MESSAGE_TYPE = "messageType";
    private static final String FIELD_MESSAGE_VERSION = "messageVersion";
    private static final String FIELD_SDK_TRANS_ID = "sdkTransID";
    private static final String MESSAGE_TYPE = "Erro";
    private final String acsTransId;
    private final String dsTransId;
    private final String errorCode;
    private final ErrorComponent errorComponent;
    private final String errorDescription;
    private final String errorDetail;
    private final String errorMessageType;
    private final String messageVersion;
    private final SdkTransactionId sdkTransId;
    private final String serverTransId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ErrorData> CREATOR = new Creator();

    /* compiled from: ErrorData.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ErrorData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ErrorData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ErrorData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ErrorComponent.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? SdkTransactionId.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ErrorData[] newArray(int i) {
            return new ErrorData[i];
        }
    }

    public static /* synthetic */ ErrorData copy$3ds2sdk_release$default(ErrorData errorData, String str, String str2, String str3, String str4, ErrorComponent errorComponent, String str5, String str6, String str7, String str8, SdkTransactionId sdkTransactionId, int i, Object obj) {
        if ((i & 1) != 0) {
            str = errorData.serverTransId;
        }
        if ((i & 2) != 0) {
            str2 = errorData.acsTransId;
        }
        if ((i & 4) != 0) {
            str3 = errorData.dsTransId;
        }
        if ((i & 8) != 0) {
            str4 = errorData.errorCode;
        }
        if ((i & 16) != 0) {
            errorComponent = errorData.errorComponent;
        }
        if ((i & 32) != 0) {
            str5 = errorData.errorDescription;
        }
        if ((i & 64) != 0) {
            str6 = errorData.errorDetail;
        }
        if ((i & 128) != 0) {
            str7 = errorData.errorMessageType;
        }
        if ((i & 256) != 0) {
            str8 = errorData.messageVersion;
        }
        if ((i & 512) != 0) {
            sdkTransactionId = errorData.sdkTransId;
        }
        String str9 = str8;
        SdkTransactionId sdkTransactionId2 = sdkTransactionId;
        String str10 = str6;
        String str11 = str7;
        ErrorComponent errorComponent2 = errorComponent;
        String str12 = str5;
        return errorData.copy$3ds2sdk_release(str, str2, str3, str4, errorComponent2, str12, str10, str11, str9, sdkTransactionId2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getServerTransId() {
        return this.serverTransId;
    }

    /* renamed from: component10, reason: from getter */
    public final SdkTransactionId getSdkTransId() {
        return this.sdkTransId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAcsTransId() {
        return this.acsTransId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDsTransId() {
        return this.dsTransId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: component5, reason: from getter */
    public final ErrorComponent getErrorComponent() {
        return this.errorComponent;
    }

    /* renamed from: component6, reason: from getter */
    public final String getErrorDescription() {
        return this.errorDescription;
    }

    /* renamed from: component7, reason: from getter */
    public final String getErrorDetail() {
        return this.errorDetail;
    }

    /* renamed from: component8, reason: from getter */
    public final String getErrorMessageType() {
        return this.errorMessageType;
    }

    /* renamed from: component9, reason: from getter */
    public final String getMessageVersion() {
        return this.messageVersion;
    }

    public final ErrorData copy$3ds2sdk_release(String serverTransId, String acsTransId, String dsTransId, String errorCode, ErrorComponent errorComponent, String errorDescription, String errorDetail, String errorMessageType, String messageVersion, SdkTransactionId sdkTransId) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
        Intrinsics.checkNotNullParameter(errorDetail, "errorDetail");
        Intrinsics.checkNotNullParameter(messageVersion, "messageVersion");
        return new ErrorData(serverTransId, acsTransId, dsTransId, errorCode, errorComponent, errorDescription, errorDetail, errorMessageType, messageVersion, sdkTransId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorData)) {
            return false;
        }
        ErrorData errorData = (ErrorData) other;
        return Intrinsics.areEqual(this.serverTransId, errorData.serverTransId) && Intrinsics.areEqual(this.acsTransId, errorData.acsTransId) && Intrinsics.areEqual(this.dsTransId, errorData.dsTransId) && Intrinsics.areEqual(this.errorCode, errorData.errorCode) && this.errorComponent == errorData.errorComponent && Intrinsics.areEqual(this.errorDescription, errorData.errorDescription) && Intrinsics.areEqual(this.errorDetail, errorData.errorDetail) && Intrinsics.areEqual(this.errorMessageType, errorData.errorMessageType) && Intrinsics.areEqual(this.messageVersion, errorData.messageVersion) && Intrinsics.areEqual(this.sdkTransId, errorData.sdkTransId);
    }

    public int hashCode() {
        String str = this.serverTransId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.acsTransId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dsTransId;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.errorCode.hashCode()) * 31;
        ErrorComponent errorComponent = this.errorComponent;
        int iHashCode4 = (((((iHashCode3 + (errorComponent == null ? 0 : errorComponent.hashCode())) * 31) + this.errorDescription.hashCode()) * 31) + this.errorDetail.hashCode()) * 31;
        String str4 = this.errorMessageType;
        int iHashCode5 = (((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.messageVersion.hashCode()) * 31;
        SdkTransactionId sdkTransactionId = this.sdkTransId;
        return iHashCode5 + (sdkTransactionId != null ? sdkTransactionId.hashCode() : 0);
    }

    public String toString() {
        return "ErrorData(serverTransId=" + this.serverTransId + ", acsTransId=" + this.acsTransId + ", dsTransId=" + this.dsTransId + ", errorCode=" + this.errorCode + ", errorComponent=" + this.errorComponent + ", errorDescription=" + this.errorDescription + ", errorDetail=" + this.errorDetail + ", errorMessageType=" + this.errorMessageType + ", messageVersion=" + this.messageVersion + ", sdkTransId=" + this.sdkTransId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.serverTransId);
        dest.writeString(this.acsTransId);
        dest.writeString(this.dsTransId);
        dest.writeString(this.errorCode);
        ErrorComponent errorComponent = this.errorComponent;
        if (errorComponent == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(errorComponent.name());
        }
        dest.writeString(this.errorDescription);
        dest.writeString(this.errorDetail);
        dest.writeString(this.errorMessageType);
        dest.writeString(this.messageVersion);
        SdkTransactionId sdkTransactionId = this.sdkTransId;
        if (sdkTransactionId == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            sdkTransactionId.writeToParcel(dest, flags);
        }
    }

    public ErrorData(String str, String str2, String str3, String errorCode, ErrorComponent errorComponent, String errorDescription, String errorDetail, String str4, String messageVersion, SdkTransactionId sdkTransactionId) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
        Intrinsics.checkNotNullParameter(errorDetail, "errorDetail");
        Intrinsics.checkNotNullParameter(messageVersion, "messageVersion");
        this.serverTransId = str;
        this.acsTransId = str2;
        this.dsTransId = str3;
        this.errorCode = errorCode;
        this.errorComponent = errorComponent;
        this.errorDescription = errorDescription;
        this.errorDetail = errorDetail;
        this.errorMessageType = str4;
        this.messageVersion = messageVersion;
        this.sdkTransId = sdkTransactionId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ErrorData(String str, String str2, String str3, String str4, ErrorComponent errorComponent, String str5, String str6, String str7, String str8, SdkTransactionId sdkTransactionId, int i, DefaultConstructorMarker defaultConstructorMarker) {
        SdkTransactionId sdkTransactionId2;
        String str9;
        String str10;
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        errorComponent = (i & 16) != 0 ? null : errorComponent;
        if ((i & 128) != 0) {
            sdkTransactionId2 = sdkTransactionId;
            str9 = str8;
            str10 = null;
        } else {
            sdkTransactionId2 = sdkTransactionId;
            str9 = str8;
            str10 = str7;
        }
        this(str, str2, str3, str4, errorComponent, str5, str6, str10, str9, sdkTransactionId2);
    }

    public final String getServerTransId() {
        return this.serverTransId;
    }

    public final String getAcsTransId() {
        return this.acsTransId;
    }

    public final String getDsTransId() {
        return this.dsTransId;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final ErrorComponent getErrorComponent() {
        return this.errorComponent;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public final String getErrorDetail() {
        return this.errorDetail;
    }

    public final String getErrorMessageType() {
        return this.errorMessageType;
    }

    public final String getMessageVersion() {
        return this.messageVersion;
    }

    public final SdkTransactionId getSdkTransId() {
        return this.sdkTransId;
    }

    public final JSONObject toJson$3ds2sdk_release() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("messageType", MESSAGE_TYPE).put("messageVersion", this.messageVersion).put("sdkTransID", this.sdkTransId).put(FIELD_ERROR_CODE, this.errorCode).put(FIELD_ERROR_DESCRIPTION, this.errorDescription).put(FIELD_ERROR_DETAIL, this.errorDetail);
        String str = this.serverTransId;
        if (str != null) {
            jSONObjectPut.put("threeDSServerTransID", str);
        }
        String str2 = this.acsTransId;
        if (str2 != null) {
            jSONObjectPut.put("acsTransID", str2);
        }
        String str3 = this.dsTransId;
        if (str3 != null) {
            jSONObjectPut.put(FIELD_DS_TRANS_ID, str3);
        }
        ErrorComponent errorComponent = this.errorComponent;
        if (errorComponent != null) {
            jSONObjectPut.put(FIELD_ERROR_COMPONENT, errorComponent.getCode());
        }
        String str4 = this.errorMessageType;
        if (str4 != null) {
            jSONObjectPut.put(FIELD_ERROR_MESSAGE_TYPE, str4);
        }
        Intrinsics.checkNotNull(jSONObjectPut);
        return jSONObjectPut;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ErrorData.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ErrorData$ErrorComponent;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "ThreeDsSdk", "ThreeDsServer", "DirectoryServer", "Acs", "Companion", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ErrorComponent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ErrorComponent[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String code;
        public static final ErrorComponent ThreeDsSdk = new ErrorComponent("ThreeDsSdk", 0, Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE);
        public static final ErrorComponent ThreeDsServer = new ErrorComponent("ThreeDsServer", 1, ExifInterface.LATITUDE_SOUTH);
        public static final ErrorComponent DirectoryServer = new ErrorComponent("DirectoryServer", 2, "D");
        public static final ErrorComponent Acs = new ErrorComponent("Acs", 3, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);

        private static final /* synthetic */ ErrorComponent[] $values() {
            return new ErrorComponent[]{ThreeDsSdk, ThreeDsServer, DirectoryServer, Acs};
        }

        public static EnumEntries<ErrorComponent> getEntries() {
            return $ENTRIES;
        }

        private ErrorComponent(String str, int i, String str2) {
            this.code = str2;
        }

        public final String getCode() {
            return this.code;
        }

        static {
            ErrorComponent[] errorComponentArr$values = $values();
            $VALUES = errorComponentArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(errorComponentArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: ErrorData.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ErrorData$ErrorComponent$Companion;", "", "<init>", "()V", "fromCode", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData$ErrorComponent;", "code", "", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final ErrorComponent fromCode(String code) {
                ErrorComponent next;
                Iterator<ErrorComponent> it = ErrorComponent.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(next.getCode(), code)) {
                        break;
                    }
                }
                return next;
            }
        }

        public static ErrorComponent valueOf(String str) {
            return (ErrorComponent) Enum.valueOf(ErrorComponent.class, str);
        }

        public static ErrorComponent[] values() {
            return (ErrorComponent[]) $VALUES.clone();
        }
    }

    /* compiled from: ErrorData.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015J\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ErrorData$Companion;", "", "<init>", "()V", "FIELD_3DS_SERVER_TRANS_ID", "", "FIELD_ACS_TRANS_ID", "FIELD_DS_TRANS_ID", "FIELD_ERROR_CODE", "FIELD_ERROR_COMPONENT", "FIELD_ERROR_DESCRIPTION", "FIELD_ERROR_DETAIL", "FIELD_ERROR_MESSAGE_TYPE", "FIELD_MESSAGE_TYPE", "FIELD_MESSAGE_VERSION", "FIELD_SDK_TRANS_ID", "MESSAGE_TYPE", "fromJson", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "payload", "Lorg/json/JSONObject;", "fromJson$3ds2sdk_release", "isErrorMessage", "", "isErrorMessage$3ds2sdk_release", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ErrorData fromJson$3ds2sdk_release(JSONObject payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            String strOptString = payload.optString("threeDSServerTransID");
            String strOptString2 = payload.optString("acsTransID");
            String strOptString3 = payload.optString(ErrorData.FIELD_DS_TRANS_ID);
            String strOptString4 = payload.optString(ErrorData.FIELD_ERROR_CODE);
            Intrinsics.checkNotNullExpressionValue(strOptString4, "optString(...)");
            ErrorComponent errorComponentFromCode = ErrorComponent.INSTANCE.fromCode(payload.optString(ErrorData.FIELD_ERROR_COMPONENT));
            String strOptString5 = payload.optString(ErrorData.FIELD_ERROR_DESCRIPTION);
            Intrinsics.checkNotNullExpressionValue(strOptString5, "optString(...)");
            String strOptString6 = payload.optString(ErrorData.FIELD_ERROR_DETAIL);
            Intrinsics.checkNotNullExpressionValue(strOptString6, "optString(...)");
            String strOptString7 = payload.optString(ErrorData.FIELD_ERROR_MESSAGE_TYPE);
            String strOptString8 = payload.optString("messageVersion");
            Intrinsics.checkNotNullExpressionValue(strOptString8, "optString(...)");
            String strOptString9 = payload.optString("sdkTransID");
            return new ErrorData(strOptString, strOptString2, strOptString3, strOptString4, errorComponentFromCode, strOptString5, strOptString6, strOptString7, strOptString8, strOptString9 != null ? new SdkTransactionId(strOptString9) : null);
        }

        public final boolean isErrorMessage$3ds2sdk_release(JSONObject payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            return Intrinsics.areEqual(ErrorData.MESSAGE_TYPE, payload.optString("messageType"));
        }
    }
}
