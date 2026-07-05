package com.stripe.android.stripe3ds2.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.android.stripe3ds2.transaction.TransactionStatus;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ChallengeResponseData.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 x2\u00020\u0001:\u0003vwxBÏ\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b&\u0010'J\u0006\u0010K\u001a\u00020LJ\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010R\u001a\u00020\nHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010W\u001a\u00020\nHÆ\u0003J\u0011\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0011\u0010\\\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0011HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010c\u001a\u00020 HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÙ\u0002\u0010i\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\n2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010j\u001a\u00020kJ\u0013\u0010l\u001a\u00020\n2\b\u0010m\u001a\u0004\u0018\u00010nHÖ\u0003J\t\u0010o\u001a\u00020kHÖ\u0001J\t\u0010p\u001a\u00020\u0003HÖ\u0001J\u0016\u0010q\u001a\u00020r2\u0006\u0010s\u001a\u00020t2\u0006\u0010u\u001a\u00020kR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010)R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010/R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010)R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010)R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010)R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010)R\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b4\u0010/R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010)R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010)R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b;\u00106R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010)R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010)R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010)R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010)R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b@\u0010:R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010)R\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010)R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010)R\u0013\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010)R\u0013\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010)R\u0013\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010)R\u0014\u0010I\u001a\u00020\n8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010/¨\u0006y"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "Landroid/os/Parcelable;", "serverTransId", "", "acsTransId", "acsHtml", "acsHtmlRefresh", "uiType", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "isChallengeCompleted", "", ChallengeResponseData.FIELD_CHALLENGE_INFO_HEADER, ChallengeResponseData.FIELD_CHALLENGE_INFO_LABEL, ChallengeResponseData.FIELD_CHALLENGE_INFO_TEXT, "challengeAdditionalInfoText", "shouldShowChallengeInfoTextIndicator", "challengeSelectOptions", "", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;", ChallengeResponseData.FIELD_EXPAND_INFO_LABEL, ChallengeResponseData.FIELD_EXPAND_INFO_TEXT, ChallengeResponseData.FIELD_ISSUER_IMAGE, "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;", ChallengeRequestData.FIELD_MESSAGE_EXTENSION, "Lcom/stripe/android/stripe3ds2/transactions/MessageExtension;", "messageVersion", "oobAppUrl", ChallengeResponseData.FIELD_OOB_APP_LABEL, ChallengeResponseData.FIELD_OOB_CONTINUE_LABEL, "paymentSystemImage", ChallengeResponseData.FIELD_RESEND_INFORMATION_LABEL, "sdkTransId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", ChallengeResponseData.FIELD_SUBMIT_AUTHENTICATION_LABEL, ChallengeResponseData.FIELD_WHITELISTING_INFO_TEXT, ChallengeResponseData.FIELD_WHY_INFO_LABEL, ChallengeResponseData.FIELD_WHY_INFO_TEXT, ChallengeResponseData.FIELD_TRANS_STATUS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/UiType;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getServerTransId", "()Ljava/lang/String;", "getAcsTransId", "getAcsHtml", "getAcsHtmlRefresh", "getUiType", "()Lcom/stripe/android/stripe3ds2/transactions/UiType;", "()Z", "getChallengeInfoHeader", "getChallengeInfoLabel", "getChallengeInfoText", "getChallengeAdditionalInfoText", "getShouldShowChallengeInfoTextIndicator", "getChallengeSelectOptions", "()Ljava/util/List;", "getExpandInfoLabel", "getExpandInfoText", "getIssuerImage", "()Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;", "getMessageExtensions", "getMessageVersion", "getOobAppUrl", "getOobAppLabel", "getOobContinueLabel", "getPaymentSystemImage", "getResendInformationLabel", "getSdkTransId", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "getSubmitAuthenticationLabel", "getWhitelistingInfoText", "getWhyInfoLabel", "getWhyInfoText", "getTransStatus", "isValidForUi", "isValidForUi$3ds2sdk_release", "toJson", "Lorg/json/JSONObject;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Image", "ChallengeSelectOption", "Companion", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ChallengeResponseData implements Parcelable {
    private static final String FIELD_ACS_HTML = "acsHTML";
    private static final String FIELD_ACS_HTML_REFRESH = "acsHTMLRefresh";
    private static final String FIELD_ACS_TRANS_ID = "acsTransID";
    private static final String FIELD_ACS_UI_TYPE = "acsUiType";
    private static final String FIELD_CHALLENGE_ADDITIONAL_INFO_TEXT = "challengeAddInfo";
    private static final String FIELD_CHALLENGE_COMPLETION_INDICATOR = "challengeCompletionInd";
    private static final String FIELD_CHALLENGE_INFO_HEADER = "challengeInfoHeader";
    private static final String FIELD_CHALLENGE_INFO_LABEL = "challengeInfoLabel";
    private static final String FIELD_CHALLENGE_INFO_TEXT = "challengeInfoText";
    private static final String FIELD_CHALLENGE_INFO_TEXT_INDICATOR = "challengeInfoTextIndicator";
    private static final String FIELD_CHALLENGE_SELECT_INFO = "challengeSelectInfo";
    private static final String FIELD_EXPAND_INFO_LABEL = "expandInfoLabel";
    private static final String FIELD_EXPAND_INFO_TEXT = "expandInfoText";
    private static final String FIELD_ISSUER_IMAGE = "issuerImage";
    private static final String FIELD_MESSAGE_EXTENSION = "messageExtension";
    private static final String FIELD_MESSAGE_TYPE = "messageType";
    private static final String FIELD_MESSAGE_VERSION = "messageVersion";
    private static final String FIELD_OOB_APP_LABEL = "oobAppLabel";
    private static final String FIELD_OOB_APP_URL = "oobAppURL";
    private static final String FIELD_OOB_CONTINUE_LABEL = "oobContinueLabel";
    private static final String FIELD_PAYMENT_SYSTEM_IMAGE = "psImage";
    private static final String FIELD_RESEND_INFORMATION_LABEL = "resendInformationLabel";
    private static final String FIELD_SDK_TRANS_ID = "sdkTransID";
    private static final String FIELD_SERVER_TRANS_ID = "threeDSServerTransID";
    private static final String FIELD_SUBMIT_AUTHENTICATION_LABEL = "submitAuthenticationLabel";
    private static final String FIELD_TRANS_STATUS = "transStatus";
    private static final String FIELD_WHITELISTING_INFO_TEXT = "whitelistingInfoText";
    private static final String FIELD_WHY_INFO_LABEL = "whyInfoLabel";
    private static final String FIELD_WHY_INFO_TEXT = "whyInfoText";
    public static final String MESSAGE_TYPE = "CRes";
    private static final String NO_VALUE = "N";
    private static final int WHITELIST_INFO_TEXT_MAX_LENGTH = 64;
    private static final String YES_VALUE = "Y";
    private final String acsHtml;
    private final String acsHtmlRefresh;
    private final String acsTransId;
    private final String challengeAdditionalInfoText;
    private final String challengeInfoHeader;
    private final String challengeInfoLabel;
    private final String challengeInfoText;
    private final List<ChallengeSelectOption> challengeSelectOptions;
    private final String expandInfoLabel;
    private final String expandInfoText;
    private final boolean isChallengeCompleted;
    private final Image issuerImage;
    private final List<MessageExtension> messageExtensions;
    private final String messageVersion;
    private final String oobAppLabel;
    private final String oobAppUrl;
    private final String oobContinueLabel;
    private final Image paymentSystemImage;
    private final String resendInformationLabel;
    private final SdkTransactionId sdkTransId;
    private final String serverTransId;
    private final boolean shouldShowChallengeInfoTextIndicator;
    private final String submitAuthenticationLabel;
    private final String transStatus;
    private final UiType uiType;
    private final String whitelistingInfoText;
    private final String whyInfoLabel;
    private final String whyInfoText;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ChallengeResponseData> CREATOR = new Creator();
    private static final List<String> YES_NO_VALUES = CollectionsKt.listOf((Object[]) new String[]{"Y", "N"});

    /* compiled from: ChallengeResponseData.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ChallengeResponseData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChallengeResponseData createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            int i;
            ArrayList arrayList;
            Image image;
            ArrayList arrayList2;
            String str;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            UiType uiTypeValueOf = parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString());
            boolean z3 = true;
            if (parcel.readInt() != 0) {
                z = true;
                z2 = false;
            } else {
                z = true;
                z3 = false;
                z2 = false;
            }
            String string5 = parcel.readString();
            boolean z4 = z2;
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            boolean z5 = z4;
            String string8 = parcel.readString();
            if (parcel.readInt() != 0) {
                z5 = z;
                i = z5 ? 1 : 0;
            } else {
                i = z5 ? 1 : 0;
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                while (i != i2) {
                    arrayList.add(ChallengeSelectOption.CREATOR.createFromParcel(parcel));
                    i++;
                }
            }
            ArrayList arrayList3 = arrayList;
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            Image imageCreateFromParcel = parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                image = imageCreateFromParcel;
                str = string;
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                image = imageCreateFromParcel;
                arrayList2 = new ArrayList(i3);
                str = string;
                int i4 = 0;
                while (i4 != i3) {
                    arrayList2.add(MessageExtension.CREATOR.createFromParcel(parcel));
                    i4++;
                    i3 = i3;
                }
            }
            return new ChallengeResponseData(str, string2, string3, string4, uiTypeValueOf, z3, string5, string6, string7, string8, z5, arrayList3, string9, string10, image, arrayList2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readString(), SdkTransactionId.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChallengeResponseData[] newArray(int i) {
            return new ChallengeResponseData[i];
        }
    }

    public static /* synthetic */ ChallengeResponseData copy$default(ChallengeResponseData challengeResponseData, String str, String str2, String str3, String str4, UiType uiType, boolean z, String str5, String str6, String str7, String str8, boolean z2, List list, String str9, String str10, Image image, List list2, String str11, String str12, String str13, String str14, Image image2, String str15, SdkTransactionId sdkTransactionId, String str16, String str17, String str18, String str19, String str20, int i, Object obj) {
        String str21;
        String str22;
        String str23 = (i & 1) != 0 ? challengeResponseData.serverTransId : str;
        String str24 = (i & 2) != 0 ? challengeResponseData.acsTransId : str2;
        String str25 = (i & 4) != 0 ? challengeResponseData.acsHtml : str3;
        String str26 = (i & 8) != 0 ? challengeResponseData.acsHtmlRefresh : str4;
        UiType uiType2 = (i & 16) != 0 ? challengeResponseData.uiType : uiType;
        boolean z3 = (i & 32) != 0 ? challengeResponseData.isChallengeCompleted : z;
        String str27 = (i & 64) != 0 ? challengeResponseData.challengeInfoHeader : str5;
        String str28 = (i & 128) != 0 ? challengeResponseData.challengeInfoLabel : str6;
        String str29 = (i & 256) != 0 ? challengeResponseData.challengeInfoText : str7;
        String str30 = (i & 512) != 0 ? challengeResponseData.challengeAdditionalInfoText : str8;
        boolean z4 = (i & 1024) != 0 ? challengeResponseData.shouldShowChallengeInfoTextIndicator : z2;
        List list3 = (i & 2048) != 0 ? challengeResponseData.challengeSelectOptions : list;
        String str31 = (i & 4096) != 0 ? challengeResponseData.expandInfoLabel : str9;
        String str32 = (i & 8192) != 0 ? challengeResponseData.expandInfoText : str10;
        String str33 = str23;
        Image image3 = (i & 16384) != 0 ? challengeResponseData.issuerImage : image;
        List list4 = (i & 32768) != 0 ? challengeResponseData.messageExtensions : list2;
        String str34 = (i & 65536) != 0 ? challengeResponseData.messageVersion : str11;
        String str35 = (i & 131072) != 0 ? challengeResponseData.oobAppUrl : str12;
        String str36 = (i & 262144) != 0 ? challengeResponseData.oobAppLabel : str13;
        String str37 = (i & 524288) != 0 ? challengeResponseData.oobContinueLabel : str14;
        Image image4 = (i & 1048576) != 0 ? challengeResponseData.paymentSystemImage : image2;
        String str38 = (i & 2097152) != 0 ? challengeResponseData.resendInformationLabel : str15;
        SdkTransactionId sdkTransactionId2 = (i & 4194304) != 0 ? challengeResponseData.sdkTransId : sdkTransactionId;
        String str39 = (i & 8388608) != 0 ? challengeResponseData.submitAuthenticationLabel : str16;
        String str40 = (i & 16777216) != 0 ? challengeResponseData.whitelistingInfoText : str17;
        String str41 = (i & 33554432) != 0 ? challengeResponseData.whyInfoLabel : str18;
        String str42 = (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? challengeResponseData.whyInfoText : str19;
        if ((i & 134217728) != 0) {
            str22 = str42;
            str21 = challengeResponseData.transStatus;
        } else {
            str21 = str20;
            str22 = str42;
        }
        return challengeResponseData.copy(str33, str24, str25, str26, uiType2, z3, str27, str28, str29, str30, z4, list3, str31, str32, image3, list4, str34, str35, str36, str37, image4, str38, sdkTransactionId2, str39, str40, str41, str22, str21);
    }

    /* renamed from: component1, reason: from getter */
    public final String getServerTransId() {
        return this.serverTransId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getChallengeAdditionalInfoText() {
        return this.challengeAdditionalInfoText;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getShouldShowChallengeInfoTextIndicator() {
        return this.shouldShowChallengeInfoTextIndicator;
    }

    public final List<ChallengeSelectOption> component12() {
        return this.challengeSelectOptions;
    }

    /* renamed from: component13, reason: from getter */
    public final String getExpandInfoLabel() {
        return this.expandInfoLabel;
    }

    /* renamed from: component14, reason: from getter */
    public final String getExpandInfoText() {
        return this.expandInfoText;
    }

    /* renamed from: component15, reason: from getter */
    public final Image getIssuerImage() {
        return this.issuerImage;
    }

    public final List<MessageExtension> component16() {
        return this.messageExtensions;
    }

    /* renamed from: component17, reason: from getter */
    public final String getMessageVersion() {
        return this.messageVersion;
    }

    /* renamed from: component18, reason: from getter */
    public final String getOobAppUrl() {
        return this.oobAppUrl;
    }

    /* renamed from: component19, reason: from getter */
    public final String getOobAppLabel() {
        return this.oobAppLabel;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAcsTransId() {
        return this.acsTransId;
    }

    /* renamed from: component20, reason: from getter */
    public final String getOobContinueLabel() {
        return this.oobContinueLabel;
    }

    /* renamed from: component21, reason: from getter */
    public final Image getPaymentSystemImage() {
        return this.paymentSystemImage;
    }

    /* renamed from: component22, reason: from getter */
    public final String getResendInformationLabel() {
        return this.resendInformationLabel;
    }

    /* renamed from: component23, reason: from getter */
    public final SdkTransactionId getSdkTransId() {
        return this.sdkTransId;
    }

    /* renamed from: component24, reason: from getter */
    public final String getSubmitAuthenticationLabel() {
        return this.submitAuthenticationLabel;
    }

    /* renamed from: component25, reason: from getter */
    public final String getWhitelistingInfoText() {
        return this.whitelistingInfoText;
    }

    /* renamed from: component26, reason: from getter */
    public final String getWhyInfoLabel() {
        return this.whyInfoLabel;
    }

    /* renamed from: component27, reason: from getter */
    public final String getWhyInfoText() {
        return this.whyInfoText;
    }

    /* renamed from: component28, reason: from getter */
    public final String getTransStatus() {
        return this.transStatus;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAcsHtml() {
        return this.acsHtml;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAcsHtmlRefresh() {
        return this.acsHtmlRefresh;
    }

    /* renamed from: component5, reason: from getter */
    public final UiType getUiType() {
        return this.uiType;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsChallengeCompleted() {
        return this.isChallengeCompleted;
    }

    /* renamed from: component7, reason: from getter */
    public final String getChallengeInfoHeader() {
        return this.challengeInfoHeader;
    }

    /* renamed from: component8, reason: from getter */
    public final String getChallengeInfoLabel() {
        return this.challengeInfoLabel;
    }

    /* renamed from: component9, reason: from getter */
    public final String getChallengeInfoText() {
        return this.challengeInfoText;
    }

    public final ChallengeResponseData copy(String serverTransId, String acsTransId, String acsHtml, String acsHtmlRefresh, UiType uiType, boolean isChallengeCompleted, String challengeInfoHeader, String challengeInfoLabel, String challengeInfoText, String challengeAdditionalInfoText, boolean shouldShowChallengeInfoTextIndicator, List<ChallengeSelectOption> challengeSelectOptions, String expandInfoLabel, String expandInfoText, Image issuerImage, List<MessageExtension> messageExtensions, String messageVersion, String oobAppUrl, String oobAppLabel, String oobContinueLabel, Image paymentSystemImage, String resendInformationLabel, SdkTransactionId sdkTransId, String submitAuthenticationLabel, String whitelistingInfoText, String whyInfoLabel, String whyInfoText, String transStatus) {
        Intrinsics.checkNotNullParameter(serverTransId, "serverTransId");
        Intrinsics.checkNotNullParameter(acsTransId, "acsTransId");
        Intrinsics.checkNotNullParameter(messageVersion, "messageVersion");
        Intrinsics.checkNotNullParameter(sdkTransId, "sdkTransId");
        return new ChallengeResponseData(serverTransId, acsTransId, acsHtml, acsHtmlRefresh, uiType, isChallengeCompleted, challengeInfoHeader, challengeInfoLabel, challengeInfoText, challengeAdditionalInfoText, shouldShowChallengeInfoTextIndicator, challengeSelectOptions, expandInfoLabel, expandInfoText, issuerImage, messageExtensions, messageVersion, oobAppUrl, oobAppLabel, oobContinueLabel, paymentSystemImage, resendInformationLabel, sdkTransId, submitAuthenticationLabel, whitelistingInfoText, whyInfoLabel, whyInfoText, transStatus);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeResponseData)) {
            return false;
        }
        ChallengeResponseData challengeResponseData = (ChallengeResponseData) other;
        return Intrinsics.areEqual(this.serverTransId, challengeResponseData.serverTransId) && Intrinsics.areEqual(this.acsTransId, challengeResponseData.acsTransId) && Intrinsics.areEqual(this.acsHtml, challengeResponseData.acsHtml) && Intrinsics.areEqual(this.acsHtmlRefresh, challengeResponseData.acsHtmlRefresh) && this.uiType == challengeResponseData.uiType && this.isChallengeCompleted == challengeResponseData.isChallengeCompleted && Intrinsics.areEqual(this.challengeInfoHeader, challengeResponseData.challengeInfoHeader) && Intrinsics.areEqual(this.challengeInfoLabel, challengeResponseData.challengeInfoLabel) && Intrinsics.areEqual(this.challengeInfoText, challengeResponseData.challengeInfoText) && Intrinsics.areEqual(this.challengeAdditionalInfoText, challengeResponseData.challengeAdditionalInfoText) && this.shouldShowChallengeInfoTextIndicator == challengeResponseData.shouldShowChallengeInfoTextIndicator && Intrinsics.areEqual(this.challengeSelectOptions, challengeResponseData.challengeSelectOptions) && Intrinsics.areEqual(this.expandInfoLabel, challengeResponseData.expandInfoLabel) && Intrinsics.areEqual(this.expandInfoText, challengeResponseData.expandInfoText) && Intrinsics.areEqual(this.issuerImage, challengeResponseData.issuerImage) && Intrinsics.areEqual(this.messageExtensions, challengeResponseData.messageExtensions) && Intrinsics.areEqual(this.messageVersion, challengeResponseData.messageVersion) && Intrinsics.areEqual(this.oobAppUrl, challengeResponseData.oobAppUrl) && Intrinsics.areEqual(this.oobAppLabel, challengeResponseData.oobAppLabel) && Intrinsics.areEqual(this.oobContinueLabel, challengeResponseData.oobContinueLabel) && Intrinsics.areEqual(this.paymentSystemImage, challengeResponseData.paymentSystemImage) && Intrinsics.areEqual(this.resendInformationLabel, challengeResponseData.resendInformationLabel) && Intrinsics.areEqual(this.sdkTransId, challengeResponseData.sdkTransId) && Intrinsics.areEqual(this.submitAuthenticationLabel, challengeResponseData.submitAuthenticationLabel) && Intrinsics.areEqual(this.whitelistingInfoText, challengeResponseData.whitelistingInfoText) && Intrinsics.areEqual(this.whyInfoLabel, challengeResponseData.whyInfoLabel) && Intrinsics.areEqual(this.whyInfoText, challengeResponseData.whyInfoText) && Intrinsics.areEqual(this.transStatus, challengeResponseData.transStatus);
    }

    public int hashCode() {
        int iHashCode = ((this.serverTransId.hashCode() * 31) + this.acsTransId.hashCode()) * 31;
        String str = this.acsHtml;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.acsHtmlRefresh;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UiType uiType = this.uiType;
        int iHashCode4 = (((iHashCode3 + (uiType == null ? 0 : uiType.hashCode())) * 31) + Boolean.hashCode(this.isChallengeCompleted)) * 31;
        String str3 = this.challengeInfoHeader;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.challengeInfoLabel;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.challengeInfoText;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.challengeAdditionalInfoText;
        int iHashCode8 = (((iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31) + Boolean.hashCode(this.shouldShowChallengeInfoTextIndicator)) * 31;
        List<ChallengeSelectOption> list = this.challengeSelectOptions;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.expandInfoLabel;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.expandInfoText;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Image image = this.issuerImage;
        int iHashCode12 = (iHashCode11 + (image == null ? 0 : image.hashCode())) * 31;
        List<MessageExtension> list2 = this.messageExtensions;
        int iHashCode13 = (((iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31) + this.messageVersion.hashCode()) * 31;
        String str9 = this.oobAppUrl;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.oobAppLabel;
        int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.oobContinueLabel;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Image image2 = this.paymentSystemImage;
        int iHashCode17 = (iHashCode16 + (image2 == null ? 0 : image2.hashCode())) * 31;
        String str12 = this.resendInformationLabel;
        int iHashCode18 = (((iHashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31) + this.sdkTransId.hashCode()) * 31;
        String str13 = this.submitAuthenticationLabel;
        int iHashCode19 = (iHashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.whitelistingInfoText;
        int iHashCode20 = (iHashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.whyInfoLabel;
        int iHashCode21 = (iHashCode20 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.whyInfoText;
        int iHashCode22 = (iHashCode21 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.transStatus;
        return iHashCode22 + (str17 != null ? str17.hashCode() : 0);
    }

    public String toString() {
        return "ChallengeResponseData(serverTransId=" + this.serverTransId + ", acsTransId=" + this.acsTransId + ", acsHtml=" + this.acsHtml + ", acsHtmlRefresh=" + this.acsHtmlRefresh + ", uiType=" + this.uiType + ", isChallengeCompleted=" + this.isChallengeCompleted + ", challengeInfoHeader=" + this.challengeInfoHeader + ", challengeInfoLabel=" + this.challengeInfoLabel + ", challengeInfoText=" + this.challengeInfoText + ", challengeAdditionalInfoText=" + this.challengeAdditionalInfoText + ", shouldShowChallengeInfoTextIndicator=" + this.shouldShowChallengeInfoTextIndicator + ", challengeSelectOptions=" + this.challengeSelectOptions + ", expandInfoLabel=" + this.expandInfoLabel + ", expandInfoText=" + this.expandInfoText + ", issuerImage=" + this.issuerImage + ", messageExtensions=" + this.messageExtensions + ", messageVersion=" + this.messageVersion + ", oobAppUrl=" + this.oobAppUrl + ", oobAppLabel=" + this.oobAppLabel + ", oobContinueLabel=" + this.oobContinueLabel + ", paymentSystemImage=" + this.paymentSystemImage + ", resendInformationLabel=" + this.resendInformationLabel + ", sdkTransId=" + this.sdkTransId + ", submitAuthenticationLabel=" + this.submitAuthenticationLabel + ", whitelistingInfoText=" + this.whitelistingInfoText + ", whyInfoLabel=" + this.whyInfoLabel + ", whyInfoText=" + this.whyInfoText + ", transStatus=" + this.transStatus + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.serverTransId);
        dest.writeString(this.acsTransId);
        dest.writeString(this.acsHtml);
        dest.writeString(this.acsHtmlRefresh);
        UiType uiType = this.uiType;
        if (uiType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(uiType.name());
        }
        dest.writeInt(this.isChallengeCompleted ? 1 : 0);
        dest.writeString(this.challengeInfoHeader);
        dest.writeString(this.challengeInfoLabel);
        dest.writeString(this.challengeInfoText);
        dest.writeString(this.challengeAdditionalInfoText);
        dest.writeInt(this.shouldShowChallengeInfoTextIndicator ? 1 : 0);
        List<ChallengeSelectOption> list = this.challengeSelectOptions;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<ChallengeSelectOption> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.expandInfoLabel);
        dest.writeString(this.expandInfoText);
        Image image = this.issuerImage;
        if (image == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            image.writeToParcel(dest, flags);
        }
        List<MessageExtension> list2 = this.messageExtensions;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list2.size());
            Iterator<MessageExtension> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.messageVersion);
        dest.writeString(this.oobAppUrl);
        dest.writeString(this.oobAppLabel);
        dest.writeString(this.oobContinueLabel);
        Image image2 = this.paymentSystemImage;
        if (image2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            image2.writeToParcel(dest, flags);
        }
        dest.writeString(this.resendInformationLabel);
        this.sdkTransId.writeToParcel(dest, flags);
        dest.writeString(this.submitAuthenticationLabel);
        dest.writeString(this.whitelistingInfoText);
        dest.writeString(this.whyInfoLabel);
        dest.writeString(this.whyInfoText);
        dest.writeString(this.transStatus);
    }

    public ChallengeResponseData(String serverTransId, String acsTransId, String str, String str2, UiType uiType, boolean z, String str3, String str4, String str5, String str6, boolean z2, List<ChallengeSelectOption> list, String str7, String str8, Image image, List<MessageExtension> list2, String messageVersion, String str9, String str10, String str11, Image image2, String str12, SdkTransactionId sdkTransId, String str13, String str14, String str15, String str16, String str17) {
        Intrinsics.checkNotNullParameter(serverTransId, "serverTransId");
        Intrinsics.checkNotNullParameter(acsTransId, "acsTransId");
        Intrinsics.checkNotNullParameter(messageVersion, "messageVersion");
        Intrinsics.checkNotNullParameter(sdkTransId, "sdkTransId");
        this.serverTransId = serverTransId;
        this.acsTransId = acsTransId;
        this.acsHtml = str;
        this.acsHtmlRefresh = str2;
        this.uiType = uiType;
        this.isChallengeCompleted = z;
        this.challengeInfoHeader = str3;
        this.challengeInfoLabel = str4;
        this.challengeInfoText = str5;
        this.challengeAdditionalInfoText = str6;
        this.shouldShowChallengeInfoTextIndicator = z2;
        this.challengeSelectOptions = list;
        this.expandInfoLabel = str7;
        this.expandInfoText = str8;
        this.issuerImage = image;
        this.messageExtensions = list2;
        this.messageVersion = messageVersion;
        this.oobAppUrl = str9;
        this.oobAppLabel = str10;
        this.oobContinueLabel = str11;
        this.paymentSystemImage = image2;
        this.resendInformationLabel = str12;
        this.sdkTransId = sdkTransId;
        this.submitAuthenticationLabel = str13;
        this.whitelistingInfoText = str14;
        this.whyInfoLabel = str15;
        this.whyInfoText = str16;
        this.transStatus = str17;
    }

    public /* synthetic */ ChallengeResponseData(String str, String str2, String str3, String str4, UiType uiType, boolean z, String str5, String str6, String str7, String str8, boolean z2, List list, String str9, String str10, Image image, List list2, String str11, String str12, String str13, String str14, Image image2, String str15, SdkTransactionId sdkTransactionId, String str16, String str17, String str18, String str19, String str20, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : uiType, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? false : z2, (i & 2048) != 0 ? null : list, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : image, (32768 & i) != 0 ? null : list2, str11, (131072 & i) != 0 ? null : str12, (262144 & i) != 0 ? null : str13, (524288 & i) != 0 ? null : str14, (1048576 & i) != 0 ? null : image2, (2097152 & i) != 0 ? null : str15, sdkTransactionId, (8388608 & i) != 0 ? null : str16, (16777216 & i) != 0 ? null : str17, (33554432 & i) != 0 ? null : str18, (67108864 & i) != 0 ? null : str19, (i & 134217728) != 0 ? null : str20);
    }

    public final String getServerTransId() {
        return this.serverTransId;
    }

    public final String getAcsTransId() {
        return this.acsTransId;
    }

    public final String getAcsHtml() {
        return this.acsHtml;
    }

    public final String getAcsHtmlRefresh() {
        return this.acsHtmlRefresh;
    }

    public final UiType getUiType() {
        return this.uiType;
    }

    public final boolean isChallengeCompleted() {
        return this.isChallengeCompleted;
    }

    public final String getChallengeInfoHeader() {
        return this.challengeInfoHeader;
    }

    public final String getChallengeInfoLabel() {
        return this.challengeInfoLabel;
    }

    public final String getChallengeInfoText() {
        return this.challengeInfoText;
    }

    public final String getChallengeAdditionalInfoText() {
        return this.challengeAdditionalInfoText;
    }

    public final boolean getShouldShowChallengeInfoTextIndicator() {
        return this.shouldShowChallengeInfoTextIndicator;
    }

    public final List<ChallengeSelectOption> getChallengeSelectOptions() {
        return this.challengeSelectOptions;
    }

    public final String getExpandInfoLabel() {
        return this.expandInfoLabel;
    }

    public final String getExpandInfoText() {
        return this.expandInfoText;
    }

    public final Image getIssuerImage() {
        return this.issuerImage;
    }

    public final List<MessageExtension> getMessageExtensions() {
        return this.messageExtensions;
    }

    public final String getMessageVersion() {
        return this.messageVersion;
    }

    public final String getOobAppUrl() {
        return this.oobAppUrl;
    }

    public final String getOobAppLabel() {
        return this.oobAppLabel;
    }

    public final String getOobContinueLabel() {
        return this.oobContinueLabel;
    }

    public final Image getPaymentSystemImage() {
        return this.paymentSystemImage;
    }

    public final String getResendInformationLabel() {
        return this.resendInformationLabel;
    }

    public final SdkTransactionId getSdkTransId() {
        return this.sdkTransId;
    }

    public final String getSubmitAuthenticationLabel() {
        return this.submitAuthenticationLabel;
    }

    public final String getWhitelistingInfoText() {
        return this.whitelistingInfoText;
    }

    public final String getWhyInfoLabel() {
        return this.whyInfoLabel;
    }

    public final String getWhyInfoText() {
        return this.whyInfoText;
    }

    public final String getTransStatus() {
        return this.transStatus;
    }

    public final boolean isValidForUi$3ds2sdk_release() {
        List<ChallengeSelectOption> list;
        String str;
        String str2;
        UiType uiType = this.uiType;
        if (uiType == null) {
            return true;
        }
        if (uiType == UiType.Html) {
            String str3 = this.acsHtml;
            return !(str3 == null || StringsKt.isBlank(str3));
        }
        if (this.uiType == UiType.Text || this.uiType == UiType.SingleSelect || this.uiType == UiType.MultiSelect) {
            Set<String> of = SetsKt.setOf((Object[]) new String[]{this.challengeInfoHeader, this.challengeInfoLabel, this.challengeInfoText});
            if (!(of instanceof Collection) || !of.isEmpty()) {
                for (String str4 : of) {
                    if (str4 == null || StringsKt.isBlank(str4)) {
                        return false;
                    }
                }
            }
        }
        if (this.uiType == UiType.OutOfBand) {
            Set<String> of2 = SetsKt.setOf((Object[]) new String[]{this.challengeInfoHeader, this.challengeInfoText});
            if (!(of2 instanceof Collection) || !of2.isEmpty()) {
                for (String str5 : of2) {
                    if (str5 == null || StringsKt.isBlank(str5)) {
                        return false;
                    }
                }
            }
        }
        String str6 = this.oobContinueLabel;
        if (str6 != null && str6.length() != 0 && (((str = this.challengeInfoHeader) == null || str.length() == 0) && ((str2 = this.challengeInfoText) == null || str2.length() == 0))) {
            return false;
        }
        if (this.uiType == UiType.OutOfBand) {
            Set<String> of3 = SetsKt.setOf((Object[]) new String[]{this.oobAppLabel, this.oobAppUrl, this.oobContinueLabel});
            if ((of3 instanceof Collection) && of3.isEmpty()) {
                return false;
            }
            for (String str7 : of3) {
                if (!(str7 == null || StringsKt.isBlank(str7))) {
                    return true;
                }
            }
            return false;
        }
        if ((this.uiType == UiType.SingleSelect || this.uiType == UiType.MultiSelect) && ((list = this.challengeSelectOptions) == null || list.isEmpty())) {
            return false;
        }
        String str8 = this.submitAuthenticationLabel;
        return !(str8 == null || StringsKt.isBlank(str8));
    }

    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("messageType", MESSAGE_TYPE).put("threeDSServerTransID", this.serverTransId).put("acsTransID", this.acsTransId).put(FIELD_ACS_HTML, this.acsHtml).put(FIELD_ACS_HTML_REFRESH, this.acsHtmlRefresh);
        UiType uiType = this.uiType;
        JSONObject jSONObjectPut2 = jSONObjectPut.put(FIELD_ACS_UI_TYPE, uiType != null ? uiType.getCode() : null).put(FIELD_CHALLENGE_COMPLETION_INDICATOR, this.isChallengeCompleted ? "Y" : "N").put(FIELD_CHALLENGE_INFO_HEADER, this.challengeInfoHeader).put(FIELD_CHALLENGE_INFO_LABEL, this.challengeInfoLabel).put(FIELD_CHALLENGE_INFO_TEXT, this.challengeInfoText).put(FIELD_CHALLENGE_ADDITIONAL_INFO_TEXT, this.challengeAdditionalInfoText).put(FIELD_CHALLENGE_SELECT_INFO, ChallengeSelectOption.INSTANCE.toJsonArray$3ds2sdk_release(this.challengeSelectOptions)).put(FIELD_EXPAND_INFO_LABEL, this.expandInfoLabel).put(FIELD_EXPAND_INFO_TEXT, this.expandInfoText);
        Image image = this.issuerImage;
        JSONObject jSONObjectPut3 = jSONObjectPut2.put(FIELD_ISSUER_IMAGE, image != null ? image.toJson$3ds2sdk_release() : null).put(FIELD_MESSAGE_EXTENSION, MessageExtension.INSTANCE.toJsonArray(this.messageExtensions)).put("messageVersion", this.messageVersion).put(FIELD_OOB_APP_URL, this.oobAppUrl).put(FIELD_OOB_APP_LABEL, this.oobAppLabel).put(FIELD_OOB_CONTINUE_LABEL, this.oobContinueLabel);
        Image image2 = this.paymentSystemImage;
        JSONObject jSONObjectPut4 = jSONObjectPut3.put(FIELD_PAYMENT_SYSTEM_IMAGE, image2 != null ? image2.toJson$3ds2sdk_release() : null).put(FIELD_RESEND_INFORMATION_LABEL, this.resendInformationLabel).put("sdkTransID", this.sdkTransId).put(FIELD_SUBMIT_AUTHENTICATION_LABEL, this.submitAuthenticationLabel).put(FIELD_WHITELISTING_INFO_TEXT, this.whitelistingInfoText).put(FIELD_WHY_INFO_LABEL, this.whyInfoLabel).put(FIELD_WHY_INFO_TEXT, this.whyInfoText).put(FIELD_TRANS_STATUS, this.transStatus);
        if (!this.isChallengeCompleted) {
            jSONObjectPut4.put(FIELD_CHALLENGE_INFO_TEXT_INDICATOR, this.shouldShowChallengeInfoTextIndicator ? "Y" : "N");
        }
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut4, "also(...)");
        return jSONObjectPut4;
    }

    /* compiled from: ChallengeResponseData.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001'B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0010J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b\u0015J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b\u0017J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b\u0019J-\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u0013J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0013HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0013R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\f\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006("}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;", "Landroid/os/Parcelable;", "mediumUrl", "", "highUrl", "extraHighUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMediumUrl$3ds2sdk_release", "()Ljava/lang/String;", "getHighUrl$3ds2sdk_release", "getExtraHighUrl$3ds2sdk_release", "highestFidelityImageUrl", "getHighestFidelityImageUrl", "toJson", "Lorg/json/JSONObject;", "toJson$3ds2sdk_release", "getUrlForDensity", "density", "", "component1", "component1$3ds2sdk_release", "component2", "component2$3ds2sdk_release", "component3", "component3$3ds2sdk_release", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Image implements Parcelable {
        private static final String FIELD_EXTRA_HIGH = "extraHigh";
        private static final String FIELD_HIGH = "high";
        private static final String FIELD_MEDIUM = "medium";
        private final String extraHighUrl;
        private final String highUrl;
        private final String mediumUrl;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Image> CREATOR = new Creator();

        /* compiled from: ChallengeResponseData.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Image> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Image createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Image(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Image[] newArray(int i) {
                return new Image[i];
            }
        }

        public static /* synthetic */ Image copy$default(Image image, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = image.mediumUrl;
            }
            if ((i & 2) != 0) {
                str2 = image.highUrl;
            }
            if ((i & 4) != 0) {
                str3 = image.extraHighUrl;
            }
            return image.copy(str, str2, str3);
        }

        /* renamed from: component1$3ds2sdk_release, reason: from getter */
        public final String getMediumUrl() {
            return this.mediumUrl;
        }

        /* renamed from: component2$3ds2sdk_release, reason: from getter */
        public final String getHighUrl() {
            return this.highUrl;
        }

        /* renamed from: component3$3ds2sdk_release, reason: from getter */
        public final String getExtraHighUrl() {
            return this.extraHighUrl;
        }

        public final Image copy(String mediumUrl, String highUrl, String extraHighUrl) {
            return new Image(mediumUrl, highUrl, extraHighUrl);
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
            return Intrinsics.areEqual(this.mediumUrl, image.mediumUrl) && Intrinsics.areEqual(this.highUrl, image.highUrl) && Intrinsics.areEqual(this.extraHighUrl, image.extraHighUrl);
        }

        public int hashCode() {
            String str = this.mediumUrl;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.highUrl;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.extraHighUrl;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "Image(mediumUrl=" + this.mediumUrl + ", highUrl=" + this.highUrl + ", extraHighUrl=" + this.extraHighUrl + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.mediumUrl);
            dest.writeString(this.highUrl);
            dest.writeString(this.extraHighUrl);
        }

        public Image(String str, String str2, String str3) {
            this.mediumUrl = str;
            this.highUrl = str2;
            this.extraHighUrl = str3;
        }

        public /* synthetic */ Image(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3);
        }

        public final String getMediumUrl$3ds2sdk_release() {
            return this.mediumUrl;
        }

        public final String getHighUrl$3ds2sdk_release() {
            return this.highUrl;
        }

        public final String getExtraHighUrl$3ds2sdk_release() {
            return this.extraHighUrl;
        }

        public final String getHighestFidelityImageUrl() {
            Object next;
            Iterator it = CollectionsKt.listOf((Object[]) new String[]{this.extraHighUrl, this.highUrl, this.mediumUrl}).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String str = (String) next;
                if (!(str == null || StringsKt.isBlank(str))) {
                    break;
                }
            }
            return (String) next;
        }

        public final JSONObject toJson$3ds2sdk_release() throws JSONException {
            JSONObject jSONObjectPut = new JSONObject().put("medium", this.mediumUrl).put(FIELD_HIGH, this.highUrl).put(FIELD_EXTRA_HIGH, this.extraHighUrl);
            Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
            return jSONObjectPut;
        }

        public final String getUrlForDensity(int density) {
            String str;
            if (density <= 160) {
                str = this.mediumUrl;
            } else if (density >= 320) {
                str = this.extraHighUrl;
            } else {
                str = this.highUrl;
            }
            String str2 = str;
            if (str2 == null || StringsKt.isBlank(str2)) {
                str = null;
            }
            return str == null ? getHighestFidelityImageUrl() : str;
        }

        /* compiled from: ChallengeResponseData.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0002\b\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image$Companion;", "", "<init>", "()V", "FIELD_MEDIUM", "", "FIELD_HIGH", "FIELD_EXTRA_HIGH", "fromJson", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;", "imageJson", "Lorg/json/JSONObject;", "fromJson$3ds2sdk_release", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Image fromJson$3ds2sdk_release(JSONObject imageJson) {
                if (imageJson != null) {
                    return new Image(imageJson.optString("medium"), imageJson.optString(Image.FIELD_HIGH), imageJson.optString(Image.FIELD_EXTRA_HIGH));
                }
                return null;
            }
        }
    }

    /* compiled from: ChallengeResponseData.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0002J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;", "Landroid/os/Parcelable;", "name", "", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getText", "toJson", "Lorg/json/JSONObject;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ChallengeSelectOption implements Parcelable {
        private final String name;
        private final String text;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<ChallengeSelectOption> CREATOR = new Creator();

        /* compiled from: ChallengeResponseData.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ChallengeSelectOption> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChallengeSelectOption createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChallengeSelectOption(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChallengeSelectOption[] newArray(int i) {
                return new ChallengeSelectOption[i];
            }
        }

        public static /* synthetic */ ChallengeSelectOption copy$default(ChallengeSelectOption challengeSelectOption, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = challengeSelectOption.name;
            }
            if ((i & 2) != 0) {
                str2 = challengeSelectOption.text;
            }
            return challengeSelectOption.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final ChallengeSelectOption copy(String name, String text) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(text, "text");
            return new ChallengeSelectOption(name, text);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChallengeSelectOption)) {
                return false;
            }
            ChallengeSelectOption challengeSelectOption = (ChallengeSelectOption) other;
            return Intrinsics.areEqual(this.name, challengeSelectOption.name) && Intrinsics.areEqual(this.text, challengeSelectOption.text);
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.text.hashCode();
        }

        public String toString() {
            return "ChallengeSelectOption(name=" + this.name + ", text=" + this.text + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.name);
            dest.writeString(this.text);
        }

        public ChallengeSelectOption(String name, String text) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(text, "text");
            this.name = name;
            this.text = text;
        }

        public final String getName() {
            return this.name;
        }

        public final String getText() {
            return this.text;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final JSONObject toJson() throws JSONException {
            JSONObject jSONObjectPut = new JSONObject().put(this.name, this.text);
            Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
            return jSONObjectPut;
        }

        /* compiled from: ChallengeResponseData.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0002\b\tJ\u001f\u0010\n\u001a\u0004\u0018\u00010\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0000¢\u0006\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption$Companion;", "", "<init>", "()V", "fromJson", "", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;", "challengeSelectOptionsJson", "Lorg/json/JSONArray;", "fromJson$3ds2sdk_release", "toJsonArray", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "toJsonArray$3ds2sdk_release", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final List<ChallengeSelectOption> fromJson$3ds2sdk_release(JSONArray challengeSelectOptionsJson) {
                if (challengeSelectOptionsJson == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                int length = challengeSelectOptionsJson.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObjectOptJSONObject = challengeSelectOptionsJson.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        String next = jSONObjectOptJSONObject.keys().next();
                        String strOptString = jSONObjectOptJSONObject.optString(next);
                        Intrinsics.checkNotNull(next);
                        Intrinsics.checkNotNull(strOptString);
                        arrayList.add(new ChallengeSelectOption(next, strOptString));
                    }
                }
                return arrayList;
            }

            public final JSONArray toJsonArray$3ds2sdk_release(List<ChallengeSelectOption> options) throws JSONException {
                if (options == null) {
                    return null;
                }
                JSONArray jSONArray = new JSONArray();
                Iterator<ChallengeSelectOption> it = options.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().toJson());
                }
                return jSONArray;
            }
        }
    }

    /* compiled from: ChallengeResponseData.kt */
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0000¢\u0006\u0002\b-J\u0015\u0010.\u001a\u00020/2\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\b0J\u0015\u00101\u001a\u0002022\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\b3J%\u00104\u001a\u0002052\u0006\u0010+\u001a\u00020,2\u0006\u00106\u001a\u00020\u00052\u0006\u00107\u001a\u000205H\u0001¢\u0006\u0002\b8J\u0017\u00109\u001a\u0004\u0018\u00010\u00052\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\b:J\u0017\u0010;\u001a\u0004\u0018\u00010<2\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\b=J\u0015\u0010>\u001a\u00020\u00052\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\b?J\u001d\u0010@\u001a\u00020A2\u0006\u0010+\u001a\u00020,2\u0006\u00106\u001a\u00020\u0005H\u0001¢\u0006\u0002\bBJ\u0015\u0010C\u001a\u00020D2\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\bEJ\u001f\u0010F\u001a\u0004\u0018\u00010\u00052\u0006\u0010+\u001a\u00020,2\u0006\u0010G\u001a\u000202H\u0000¢\u0006\u0002\bHJ\u001f\u0010I\u001a\u0004\u0018\u00010\u00052\u0006\u0010+\u001a\u00020,2\u0006\u0010G\u001a\u000202H\u0001¢\u0006\u0002\bJJ\u0014\u0010K\u001a\u0004\u0018\u00010\u00052\b\u0010L\u001a\u0004\u0018\u00010\u0005H\u0002J\u001f\u0010M\u001a\u0004\u0018\u00010\u00052\u0006\u0010+\u001a\u00020,2\u0006\u0010G\u001a\u000202H\u0001¢\u0006\u0002\bNJ\u001d\u0010O\u001a\n\u0012\u0004\u0012\u00020P\u0018\u00010(2\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\bQJ\u001a\u0010R\u001a\u0004\u0018\u00010\u00052\u0006\u0010S\u001a\u00020,2\u0006\u00106\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050(X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006T"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Companion;", "", "<init>", "()V", "FIELD_SERVER_TRANS_ID", "", "FIELD_ACS_TRANS_ID", "FIELD_ACS_HTML", "FIELD_ACS_HTML_REFRESH", "FIELD_ACS_UI_TYPE", "FIELD_CHALLENGE_ADDITIONAL_INFO_TEXT", "FIELD_CHALLENGE_COMPLETION_INDICATOR", "FIELD_CHALLENGE_INFO_HEADER", "FIELD_CHALLENGE_INFO_LABEL", "FIELD_CHALLENGE_INFO_TEXT", "FIELD_CHALLENGE_INFO_TEXT_INDICATOR", "FIELD_CHALLENGE_SELECT_INFO", "FIELD_EXPAND_INFO_LABEL", "FIELD_EXPAND_INFO_TEXT", "FIELD_ISSUER_IMAGE", "FIELD_MESSAGE_EXTENSION", "FIELD_MESSAGE_TYPE", "FIELD_MESSAGE_VERSION", "FIELD_OOB_APP_URL", "FIELD_OOB_APP_LABEL", "FIELD_OOB_CONTINUE_LABEL", "FIELD_PAYMENT_SYSTEM_IMAGE", "FIELD_RESEND_INFORMATION_LABEL", "FIELD_SDK_TRANS_ID", "FIELD_SUBMIT_AUTHENTICATION_LABEL", "FIELD_WHITELISTING_INFO_TEXT", "FIELD_WHY_INFO_LABEL", "FIELD_WHY_INFO_TEXT", "FIELD_TRANS_STATUS", "MESSAGE_TYPE", "YES_VALUE", "NO_VALUE", "WHITELIST_INFO_TEXT_MAX_LENGTH", "", "YES_NO_VALUES", "", "fromJson", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "cresJson", "Lorg/json/JSONObject;", "fromJson$3ds2sdk_release", "checkMessageType", "", "checkMessageType$3ds2sdk_release", "getUiType", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "getUiType$3ds2sdk_release", "getYesNoValue", "", "fieldName", "isRequired", "getYesNoValue$3ds2sdk_release", "getResendInformationLabel", "getResendInformationLabel$3ds2sdk_release", "getChallengeSelectInfoArray", "Lorg/json/JSONArray;", "getChallengeSelectInfoArray$3ds2sdk_release", "getMessageVersion", "getMessageVersion$3ds2sdk_release", "getTransactionId", "Ljava/util/UUID;", "getTransactionId$3ds2sdk_release", "getTransStatus", "Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;", "getTransStatus$3ds2sdk_release", "getSubmitAuthenticationLabel", "uiType", "getSubmitAuthenticationLabel$3ds2sdk_release", "getDecodedAcsHtml", "getDecodedAcsHtml$3ds2sdk_release", "decodeHtml", "encodedHtml", "getOobContinueLabel", "getOobContinueLabel$3ds2sdk_release", "getMessageExtensions", "Lcom/stripe/android/stripe3ds2/transactions/MessageExtension;", "getMessageExtensions$3ds2sdk_release", "getOrNull", "json", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ChallengeResponseData fromJson$3ds2sdk_release(JSONObject cresJson) throws JSONException, ChallengeResponseParseException {
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            checkMessageType$3ds2sdk_release(cresJson);
            boolean yesNoValue$3ds2sdk_release = getYesNoValue$3ds2sdk_release(cresJson, ChallengeResponseData.FIELD_CHALLENGE_COMPLETION_INDICATOR, true);
            SdkTransactionId sdkTransactionId = new SdkTransactionId(getTransactionId$3ds2sdk_release(cresJson, "sdkTransID"));
            String string = getTransactionId$3ds2sdk_release(cresJson, "threeDSServerTransID").toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            String string2 = getTransactionId$3ds2sdk_release(cresJson, "acsTransID").toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            String messageVersion$3ds2sdk_release = getMessageVersion$3ds2sdk_release(cresJson);
            List<MessageExtension> messageExtensions$3ds2sdk_release = getMessageExtensions$3ds2sdk_release(cresJson);
            boolean yesNoValue$3ds2sdk_release2 = getYesNoValue$3ds2sdk_release(cresJson, ChallengeResponseData.FIELD_CHALLENGE_INFO_TEXT_INDICATOR, false);
            String resendInformationLabel$3ds2sdk_release = getResendInformationLabel$3ds2sdk_release(cresJson);
            JSONArray challengeSelectInfoArray$3ds2sdk_release = getChallengeSelectInfoArray$3ds2sdk_release(cresJson);
            UiType uiType$3ds2sdk_release = yesNoValue$3ds2sdk_release ? null : getUiType$3ds2sdk_release(cresJson);
            String submitAuthenticationLabel$3ds2sdk_release = uiType$3ds2sdk_release != null ? ChallengeResponseData.INSTANCE.getSubmitAuthenticationLabel$3ds2sdk_release(cresJson, uiType$3ds2sdk_release) : null;
            String decodedAcsHtml$3ds2sdk_release = uiType$3ds2sdk_release != null ? ChallengeResponseData.INSTANCE.getDecodedAcsHtml$3ds2sdk_release(cresJson, uiType$3ds2sdk_release) : null;
            String oobContinueLabel$3ds2sdk_release = uiType$3ds2sdk_release != null ? ChallengeResponseData.INSTANCE.getOobContinueLabel$3ds2sdk_release(cresJson, uiType$3ds2sdk_release) : null;
            List<ChallengeSelectOption> listFromJson$3ds2sdk_release = ChallengeSelectOption.INSTANCE.fromJson$3ds2sdk_release(challengeSelectInfoArray$3ds2sdk_release);
            ChallengeResponseData challengeResponseData = new ChallengeResponseData(string, string2, decodedAcsHtml$3ds2sdk_release, yesNoValue$3ds2sdk_release ? null : decodeHtml(cresJson.optString(ChallengeResponseData.FIELD_ACS_HTML_REFRESH)), uiType$3ds2sdk_release, yesNoValue$3ds2sdk_release, yesNoValue$3ds2sdk_release ? null : cresJson.optString(ChallengeResponseData.FIELD_CHALLENGE_INFO_HEADER), yesNoValue$3ds2sdk_release ? null : cresJson.optString(ChallengeResponseData.FIELD_CHALLENGE_INFO_LABEL), yesNoValue$3ds2sdk_release ? null : cresJson.optString(ChallengeResponseData.FIELD_CHALLENGE_INFO_TEXT), yesNoValue$3ds2sdk_release ? null : cresJson.optString(ChallengeResponseData.FIELD_CHALLENGE_ADDITIONAL_INFO_TEXT), yesNoValue$3ds2sdk_release2, listFromJson$3ds2sdk_release, yesNoValue$3ds2sdk_release ? null : cresJson.optString(ChallengeResponseData.FIELD_EXPAND_INFO_LABEL), yesNoValue$3ds2sdk_release ? null : cresJson.optString(ChallengeResponseData.FIELD_EXPAND_INFO_TEXT), Image.INSTANCE.fromJson$3ds2sdk_release(cresJson.optJSONObject(ChallengeResponseData.FIELD_ISSUER_IMAGE)), messageExtensions$3ds2sdk_release, messageVersion$3ds2sdk_release, yesNoValue$3ds2sdk_release ? null : cresJson.optString(ChallengeResponseData.FIELD_OOB_APP_URL), yesNoValue$3ds2sdk_release ? null : cresJson.optString(ChallengeResponseData.FIELD_OOB_APP_LABEL), oobContinueLabel$3ds2sdk_release, Image.INSTANCE.fromJson$3ds2sdk_release(cresJson.optJSONObject(ChallengeResponseData.FIELD_PAYMENT_SYSTEM_IMAGE)), resendInformationLabel$3ds2sdk_release, sdkTransactionId, submitAuthenticationLabel$3ds2sdk_release, yesNoValue$3ds2sdk_release ? null : cresJson.optString(ChallengeResponseData.FIELD_WHITELISTING_INFO_TEXT), yesNoValue$3ds2sdk_release ? null : cresJson.optString(ChallengeResponseData.FIELD_WHY_INFO_LABEL), yesNoValue$3ds2sdk_release ? null : cresJson.optString(ChallengeResponseData.FIELD_WHY_INFO_TEXT), yesNoValue$3ds2sdk_release ? getTransStatus$3ds2sdk_release(cresJson).getCode() : "");
            if (!challengeResponseData.isValidForUi$3ds2sdk_release()) {
                throw ChallengeResponseParseException.INSTANCE.createRequiredDataElementMissing("UI fields missing");
            }
            if (challengeResponseData.getWhitelistingInfoText() == null || challengeResponseData.getWhitelistingInfoText().length() <= 64) {
                return challengeResponseData;
            }
            throw ChallengeResponseParseException.INSTANCE.createInvalidDataElementFormat("Whitelisting info text exceeds length.");
        }

        public final void checkMessageType$3ds2sdk_release(JSONObject cresJson) throws ChallengeResponseParseException {
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            if (!Intrinsics.areEqual(ChallengeResponseData.MESSAGE_TYPE, cresJson.optString("messageType"))) {
                throw new ChallengeResponseParseException(ProtocolError.InvalidMessageReceived.getCode(), "Message is not CRes", "Invalid Message Type");
            }
        }

        public final UiType getUiType$3ds2sdk_release(JSONObject cresJson) throws ChallengeResponseParseException {
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            String strOptString = cresJson.optString(ChallengeResponseData.FIELD_ACS_UI_TYPE);
            String str = strOptString;
            if (str == null || StringsKt.isBlank(str)) {
                throw ChallengeResponseParseException.INSTANCE.createRequiredDataElementMissing(ChallengeResponseData.FIELD_ACS_UI_TYPE);
            }
            UiType uiTypeFromCode$3ds2sdk_release = UiType.INSTANCE.fromCode$3ds2sdk_release(strOptString);
            if (uiTypeFromCode$3ds2sdk_release != null) {
                return uiTypeFromCode$3ds2sdk_release;
            }
            throw ChallengeResponseParseException.INSTANCE.createInvalidDataElementFormat(ChallengeResponseData.FIELD_ACS_UI_TYPE);
        }

        public final boolean getYesNoValue$3ds2sdk_release(JSONObject cresJson, String fieldName, boolean isRequired) throws JSONException, ChallengeResponseParseException {
            String orNull;
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            if (isRequired) {
                if (cresJson.has(fieldName)) {
                    orNull = cresJson.getString(fieldName);
                } else {
                    throw ChallengeResponseParseException.INSTANCE.createRequiredDataElementMissing(fieldName);
                }
            } else {
                orNull = getOrNull(cresJson, fieldName);
            }
            if (orNull != null && !ChallengeResponseData.YES_NO_VALUES.contains(orNull)) {
                if (isRequired && StringsKt.isBlank(orNull)) {
                    throw ChallengeResponseParseException.INSTANCE.createRequiredDataElementMissing(fieldName);
                }
                throw ChallengeResponseParseException.INSTANCE.createInvalidDataElementFormat(fieldName);
            }
            return Intrinsics.areEqual("Y", orNull);
        }

        public final String getResendInformationLabel$3ds2sdk_release(JSONObject cresJson) throws ChallengeResponseParseException {
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            String orNull = getOrNull(cresJson, ChallengeResponseData.FIELD_RESEND_INFORMATION_LABEL);
            if (orNull == null || orNull.length() != 0) {
                return orNull;
            }
            throw ChallengeResponseParseException.INSTANCE.createInvalidDataElementFormat(ChallengeResponseData.FIELD_RESEND_INFORMATION_LABEL);
        }

        public final JSONArray getChallengeSelectInfoArray$3ds2sdk_release(JSONObject cresJson) throws ChallengeResponseParseException {
            Object objM9118constructorimpl;
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            if (!cresJson.has(ChallengeResponseData.FIELD_CHALLENGE_SELECT_INFO)) {
                cresJson = null;
            }
            if (cresJson == null) {
                return null;
            }
            Companion companion = ChallengeResponseData.INSTANCE;
            try {
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(cresJson.getJSONArray(ChallengeResponseData.FIELD_CHALLENGE_SELECT_INFO));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl) == null) {
                return (JSONArray) objM9118constructorimpl;
            }
            throw ChallengeResponseParseException.INSTANCE.createInvalidDataElementFormat(ChallengeResponseData.FIELD_CHALLENGE_SELECT_INFO);
        }

        public final String getMessageVersion$3ds2sdk_release(JSONObject cresJson) throws ChallengeResponseParseException {
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            String strOptString = cresJson.optString("messageVersion");
            Intrinsics.checkNotNull(strOptString);
            if (StringsKt.isBlank(strOptString)) {
                strOptString = null;
            }
            if (strOptString != null) {
                return strOptString;
            }
            throw ChallengeResponseParseException.INSTANCE.createRequiredDataElementMissing("messageVersion");
        }

        public final UUID getTransactionId$3ds2sdk_release(JSONObject cresJson, String fieldName) throws ChallengeResponseParseException {
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            String strOptString = cresJson.optString(fieldName);
            String str = strOptString;
            if (str == null || StringsKt.isBlank(str)) {
                throw ChallengeResponseParseException.INSTANCE.createRequiredDataElementMissing(fieldName);
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                Companion companion2 = this;
                UUID uuidFromString = UUID.fromString(strOptString);
                Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
                return uuidFromString;
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                if (Result.m9121exceptionOrNullimpl(Result.m9118constructorimpl(ResultKt.createFailure(th))) == null) {
                    throw new KotlinNothingValueException();
                }
                throw ChallengeResponseParseException.INSTANCE.createInvalidDataElementFormat(fieldName);
            }
        }

        public final TransactionStatus getTransStatus$3ds2sdk_release(JSONObject cresJson) throws ChallengeResponseParseException {
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            String strOptString = cresJson.optString(ChallengeResponseData.FIELD_TRANS_STATUS);
            String str = strOptString;
            if (str == null || StringsKt.isBlank(str)) {
                throw ChallengeResponseParseException.INSTANCE.createRequiredDataElementMissing(ChallengeResponseData.FIELD_TRANS_STATUS);
            }
            TransactionStatus transactionStatusFromCode = TransactionStatus.INSTANCE.fromCode(strOptString);
            if (transactionStatusFromCode != null) {
                return transactionStatusFromCode;
            }
            throw ChallengeResponseParseException.INSTANCE.createInvalidDataElementFormat(ChallengeResponseData.FIELD_TRANS_STATUS);
        }

        public final String getSubmitAuthenticationLabel$3ds2sdk_release(JSONObject cresJson, UiType uiType) throws ChallengeResponseParseException {
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            Intrinsics.checkNotNullParameter(uiType, "uiType");
            String orNull = getOrNull(cresJson, ChallengeResponseData.FIELD_SUBMIT_AUTHENTICATION_LABEL);
            String str = orNull;
            if ((str == null || StringsKt.isBlank(str)) && uiType.getRequiresSubmitButton()) {
                throw ChallengeResponseParseException.INSTANCE.createRequiredDataElementMissing(ChallengeResponseData.FIELD_SUBMIT_AUTHENTICATION_LABEL);
            }
            return orNull;
        }

        public final String getDecodedAcsHtml$3ds2sdk_release(JSONObject cresJson, UiType uiType) throws ChallengeResponseParseException {
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            Intrinsics.checkNotNullParameter(uiType, "uiType");
            String orNull = getOrNull(cresJson, ChallengeResponseData.FIELD_ACS_HTML);
            String str = orNull;
            if ((str == null || StringsKt.isBlank(str)) && uiType == UiType.Html) {
                throw ChallengeResponseParseException.INSTANCE.createRequiredDataElementMissing(ChallengeResponseData.FIELD_ACS_HTML);
            }
            boolean z = orNull == null || StringsKt.contains$default((CharSequence) str, (CharSequence) "\n", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) " ", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "+", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "/", false, 2, (Object) null);
            boolean z2 = orNull != null && StringsKt.endsWith$default(orNull, "=", false, 2, (Object) null);
            if (uiType == UiType.Html && (z || z2)) {
                throw ChallengeResponseParseException.INSTANCE.createInvalidDataElementFormat(ChallengeResponseData.FIELD_ACS_HTML);
            }
            return decodeHtml(orNull);
        }

        private final String decodeHtml(String encodedHtml) {
            Object objM9118constructorimpl;
            if (encodedHtml == null) {
                return null;
            }
            Companion companion = ChallengeResponseData.INSTANCE;
            try {
                Result.Companion companion2 = Result.INSTANCE;
                byte[] bArrDecode = Base64.decode(encodedHtml, 8);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                objM9118constructorimpl = Result.m9118constructorimpl(new String(bArrDecode, Charsets.UTF_8));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            return (String) (Result.m9124isFailureimpl(objM9118constructorimpl) ? null : objM9118constructorimpl);
        }

        public final String getOobContinueLabel$3ds2sdk_release(JSONObject cresJson, UiType uiType) throws ChallengeResponseParseException {
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            Intrinsics.checkNotNullParameter(uiType, "uiType");
            String strOptString = cresJson.optString(ChallengeResponseData.FIELD_OOB_CONTINUE_LABEL);
            String str = strOptString;
            if ((str == null || StringsKt.isBlank(str)) && uiType == UiType.OutOfBand) {
                throw ChallengeResponseParseException.INSTANCE.createRequiredDataElementMissing(ChallengeResponseData.FIELD_OOB_CONTINUE_LABEL);
            }
            return strOptString;
        }

        public final List<MessageExtension> getMessageExtensions$3ds2sdk_release(JSONObject cresJson) throws ChallengeResponseParseException {
            Intrinsics.checkNotNullParameter(cresJson, "cresJson");
            List<MessageExtension> listFromJson = MessageExtension.INSTANCE.fromJson(cresJson.optJSONArray(ChallengeResponseData.FIELD_MESSAGE_EXTENSION));
            if (listFromJson != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listFromJson) {
                    MessageExtension messageExtension = (MessageExtension) obj;
                    if (messageExtension.getCriticalityIndicator() && !messageExtension.isProcessable()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = arrayList;
                if (!arrayList2.isEmpty()) {
                    throw new ChallengeResponseParseException(ProtocolError.UnrecognizedCriticalMessageExtensions, CollectionsKt.joinToString$default(arrayList2, ",", null, null, 0, null, null, 62, null));
                }
            }
            return listFromJson;
        }

        private final String getOrNull(JSONObject json, String fieldName) {
            if (json.has(fieldName)) {
                return json.getString(fieldName);
            }
            return null;
        }
    }
}
