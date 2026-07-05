package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.AnalyticsEvents;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.model.parsers.StripeErrorJsonParser;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.parsers.PaymentIntentJsonParser;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONObject;

/* compiled from: PaymentIntent.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 \u0091\u00012\u00020\u0001:\u000e\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001B\u0099\u0002\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b'\u0010(J\u0016\u0010N\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010P0OH\u0016J\b\u0010\\\u001a\u00020\u0015H\u0016J\b\u0010]\u001a\u00020\u0015H\u0016J\u0014\u0010^\u001a\u00020\u00152\n\u0010_\u001a\u00060\u0003j\u0002``H\u0007J\u0015\u0010a\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0003H\u0000¢\u0006\u0002\bbJ\b\u0010c\u001a\u00020\u0015H\u0002J\u0014\u0010d\u001a\u00020\u00152\n\u0010_\u001a\u00060\u0003j\u0002``H\u0002J\u0014\u0010e\u001a\u00020\u00152\n\u0010_\u001a\u00060\u0003j\u0002``H\u0002J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u0010\u0010h\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010.J\t\u0010i\u001a\u00020\u0007HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010k\u001a\u00020\fHÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010m\u001a\u00020\u000fHÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010o\u001a\u00020\u0007HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010r\u001a\u00020\u0015HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010!HÆ\u0003J\u000f\u0010z\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010{\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010%HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003HÂ\u0003J°\u0002\u0010~\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u007fJ\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001J\u0015\u0010\u0082\u0001\u001a\u00020\u00152\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010PHÖ\u0003J\u000b\u0010\u0084\u0001\u001a\u00030\u0081\u0001HÖ\u0001J\n\u0010\u0085\u0001\u001a\u00020\u0003HÖ\u0001J\u001c\u0010\u0086\u0001\u001a\u00030\u0087\u00012\b\u0010\u0088\u0001\u001a\u00030\u0089\u00012\b\u0010\u008a\u0001\u001a\u00030\u0081\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0016\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010*R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038WX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010*R\u0014\u0010\u0011\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u00101R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010*R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010*R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010=R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010*R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010*R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010,R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010,R\u0016\u0010$\u001a\u0004\u0018\u00010%X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0010\u0010&\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010Q\u001a\u0004\u0018\u00010R8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010=R\u0016\u0010V\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010*R\u0014\u0010X\u001a\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bY\u0010=R\u0011\u0010Z\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b[\u0010=¨\u0006\u0092\u0001"}, d2 = {"Lcom/stripe/android/model/PaymentIntent;", "Lcom/stripe/android/model/StripeIntent;", "id", "", "paymentMethodTypes", "", CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, "", "canceledAt", "cancellationReason", "Lcom/stripe/android/model/PaymentIntent$CancellationReason;", "captureMethod", "Lcom/stripe/android/model/PaymentIntent$CaptureMethod;", "clientSecret", "confirmationMethod", "Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;", "countryCode", "created", "currency", "description", NamedConstantsKt.IS_LIVE_MODE, "", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethodId", "receiptEmail", "status", "Lcom/stripe/android/model/StripeIntent$Status;", "setupFutureUsage", "Lcom/stripe/android/model/StripeIntent$Usage;", "lastPaymentError", "Lcom/stripe/android/model/PaymentIntent$Error;", "shipping", "Lcom/stripe/android/model/PaymentIntent$Shipping;", "unactivatedPaymentMethods", "linkFundingSources", "nextActionData", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "paymentMethodOptionsJsonString", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;JLcom/stripe/android/model/PaymentIntent$CancellationReason;Lcom/stripe/android/model/PaymentIntent$CaptureMethod;Ljava/lang/String;Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/PaymentIntent$Error;Lcom/stripe/android/model/PaymentIntent$Shipping;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/model/StripeIntent$NextActionData;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getPaymentMethodTypes", "()Ljava/util/List;", "getAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCanceledAt", "()J", "getCancellationReason", "()Lcom/stripe/android/model/PaymentIntent$CancellationReason;", "getCaptureMethod", "()Lcom/stripe/android/model/PaymentIntent$CaptureMethod;", "getClientSecret", "getConfirmationMethod", "()Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;", "getCountryCode", "getCreated", "getCurrency", "getDescription", "()Z", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethodId", "getReceiptEmail", "getStatus", "()Lcom/stripe/android/model/StripeIntent$Status;", "getSetupFutureUsage", "()Lcom/stripe/android/model/StripeIntent$Usage;", "getLastPaymentError", "()Lcom/stripe/android/model/PaymentIntent$Error;", "getShipping", "()Lcom/stripe/android/model/PaymentIntent$Shipping;", "getUnactivatedPaymentMethods", "getLinkFundingSources", "getNextActionData", "()Lcom/stripe/android/model/StripeIntent$NextActionData;", "getPaymentMethodOptions", "", "", "nextActionType", "Lcom/stripe/android/model/StripeIntent$NextActionType;", "getNextActionType", "()Lcom/stripe/android/model/StripeIntent$NextActionType;", "isConfirmed", "lastErrorMessage", "getLastErrorMessage", "isRedacted", "isRedacted$payments_core_release", "requireCvcRecollection", "getRequireCvcRecollection", "requiresAction", "requiresConfirmation", "isSetupFutureUsageSet", "code", "Lcom/stripe/android/model/PaymentMethodCode;", "withUnredactedClientSecret", "withUnredactedClientSecret$payments_core_release", "isTopLevelSetupFutureUsageSet", "isPaymentMethodOptionsSetupFutureUsageNone", "isLpmLevelSetupFutureUsageSet", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;JLcom/stripe/android/model/PaymentIntent$CancellationReason;Lcom/stripe/android/model/PaymentIntent$CaptureMethod;Ljava/lang/String;Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/PaymentIntent$Error;Lcom/stripe/android/model/PaymentIntent$Shipping;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/model/StripeIntent$NextActionData;Ljava/lang/String;)Lcom/stripe/android/model/PaymentIntent;", "describeContents", "", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Error", "Shipping", "ClientSecret", "CancellationReason", "CaptureMethod", "ConfirmationMethod", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PaymentIntent implements StripeIntent {
    public static final String CARD = "card";
    public static final String NONE = "none";
    public static final String OFF_SESSION = "off_session";
    public static final String ON_SESSION = "on_session";
    public static final String REQUIRE_CVC_RECOLLECTION = "require_cvc_recollection";
    public static final String SETUP_FUTURE_USAGE = "setup_future_usage";
    public static final String VALUE_REDACTED_CLIENT_SECRET = "redacted_client_secret";
    private final Long amount;
    private final long canceledAt;
    private final CancellationReason cancellationReason;
    private final CaptureMethod captureMethod;
    private final String clientSecret;
    private final ConfirmationMethod confirmationMethod;
    private final String countryCode;
    private final long created;
    private final String currency;
    private final String description;
    private final String id;
    private final boolean isLiveMode;
    private final Error lastPaymentError;
    private final List<String> linkFundingSources;
    private final StripeIntent.NextActionData nextActionData;
    private final PaymentMethod paymentMethod;
    private final String paymentMethodId;
    private final String paymentMethodOptionsJsonString;
    private final List<String> paymentMethodTypes;
    private final String receiptEmail;
    private final StripeIntent.Usage setupFutureUsage;
    private final Shipping shipping;
    private final StripeIntent.Status status;
    private final List<String> unactivatedPaymentMethods;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<PaymentIntent> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: PaymentIntent.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentIntent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentIntent createFromParcel(Parcel parcel) {
            Long l;
            Error errorCreateFromParcel;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            long j = parcel.readLong();
            CancellationReason cancellationReasonValueOf = parcel.readInt() == 0 ? null : CancellationReason.valueOf(parcel.readString());
            CaptureMethod captureMethodValueOf = CaptureMethod.valueOf(parcel.readString());
            String string2 = parcel.readString();
            ConfirmationMethod confirmationMethodValueOf = ConfirmationMethod.valueOf(parcel.readString());
            String string3 = parcel.readString();
            long j2 = parcel.readLong();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            PaymentMethod paymentMethodCreateFromParcel = parcel.readInt() == 0 ? null : PaymentMethod.CREATOR.createFromParcel(parcel);
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            StripeIntent.Status statusValueOf = parcel.readInt() == 0 ? null : StripeIntent.Status.valueOf(parcel.readString());
            StripeIntent.Usage usageValueOf = parcel.readInt() == 0 ? null : StripeIntent.Usage.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                l = lValueOf;
                errorCreateFromParcel = null;
            } else {
                l = lValueOf;
                errorCreateFromParcel = Error.CREATOR.createFromParcel(parcel);
            }
            return new PaymentIntent(string, arrayListCreateStringArrayList, l, j, cancellationReasonValueOf, captureMethodValueOf, string2, confirmationMethodValueOf, string3, j2, string4, string5, z, paymentMethodCreateFromParcel, string6, string7, statusValueOf, usageValueOf, errorCreateFromParcel, parcel.readInt() == 0 ? null : Shipping.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.createStringArrayList(), (StripeIntent.NextActionData) parcel.readParcelable(PaymentIntent.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentIntent[] newArray(int i) {
            return new PaymentIntent[i];
        }
    }

    /* compiled from: PaymentIntent.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StripeIntent.Usage.values().length];
            try {
                iArr[StripeIntent.Usage.OnSession.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StripeIntent.Usage.OffSession.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StripeIntent.Usage.OneTime.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component24, reason: from getter */
    private final String getPaymentMethodOptionsJsonString() {
        return this.paymentMethodOptionsJsonString;
    }

    public static /* synthetic */ PaymentIntent copy$default(PaymentIntent paymentIntent, String str, List list, Long l, long j, CancellationReason cancellationReason, CaptureMethod captureMethod, String str2, ConfirmationMethod confirmationMethod, String str3, long j2, String str4, String str5, boolean z, PaymentMethod paymentMethod, String str6, String str7, StripeIntent.Status status, StripeIntent.Usage usage, Error error, Shipping shipping, List list2, List list3, StripeIntent.NextActionData nextActionData, String str8, int i, Object obj) {
        String str9;
        StripeIntent.NextActionData nextActionData2;
        String str10 = (i & 1) != 0 ? paymentIntent.id : str;
        List list4 = (i & 2) != 0 ? paymentIntent.paymentMethodTypes : list;
        Long l2 = (i & 4) != 0 ? paymentIntent.amount : l;
        long j3 = (i & 8) != 0 ? paymentIntent.canceledAt : j;
        CancellationReason cancellationReason2 = (i & 16) != 0 ? paymentIntent.cancellationReason : cancellationReason;
        CaptureMethod captureMethod2 = (i & 32) != 0 ? paymentIntent.captureMethod : captureMethod;
        String str11 = (i & 64) != 0 ? paymentIntent.clientSecret : str2;
        ConfirmationMethod confirmationMethod2 = (i & 128) != 0 ? paymentIntent.confirmationMethod : confirmationMethod;
        String str12 = (i & 256) != 0 ? paymentIntent.countryCode : str3;
        long j4 = (i & 512) != 0 ? paymentIntent.created : j2;
        String str13 = (i & 1024) != 0 ? paymentIntent.currency : str4;
        String str14 = (i & 2048) != 0 ? paymentIntent.description : str5;
        String str15 = str10;
        boolean z2 = (i & 4096) != 0 ? paymentIntent.isLiveMode : z;
        PaymentMethod paymentMethod2 = (i & 8192) != 0 ? paymentIntent.paymentMethod : paymentMethod;
        String str16 = (i & 16384) != 0 ? paymentIntent.paymentMethodId : str6;
        String str17 = (i & 32768) != 0 ? paymentIntent.receiptEmail : str7;
        StripeIntent.Status status2 = (i & 65536) != 0 ? paymentIntent.status : status;
        StripeIntent.Usage usage2 = (i & 131072) != 0 ? paymentIntent.setupFutureUsage : usage;
        Error error2 = (i & 262144) != 0 ? paymentIntent.lastPaymentError : error;
        Shipping shipping2 = (i & 524288) != 0 ? paymentIntent.shipping : shipping;
        List list5 = (i & 1048576) != 0 ? paymentIntent.unactivatedPaymentMethods : list2;
        List list6 = (i & 2097152) != 0 ? paymentIntent.linkFundingSources : list3;
        StripeIntent.NextActionData nextActionData3 = (i & 4194304) != 0 ? paymentIntent.nextActionData : nextActionData;
        if ((i & 8388608) != 0) {
            nextActionData2 = nextActionData3;
            str9 = paymentIntent.paymentMethodOptionsJsonString;
        } else {
            str9 = str8;
            nextActionData2 = nextActionData3;
        }
        return paymentIntent.copy(str15, list4, l2, j3, cancellationReason2, captureMethod2, str11, confirmationMethod2, str12, j4, str13, str14, z2, paymentMethod2, str16, str17, status2, usage2, error2, shipping2, list5, list6, nextActionData2, str9);
    }

    @JvmStatic
    public static final PaymentIntent fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final long getCreated() {
        return this.created;
    }

    /* renamed from: component11, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component12, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsLiveMode() {
        return this.isLiveMode;
    }

    /* renamed from: component14, reason: from getter */
    public final PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    /* renamed from: component15, reason: from getter */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    /* renamed from: component16, reason: from getter */
    public final String getReceiptEmail() {
        return this.receiptEmail;
    }

    /* renamed from: component17, reason: from getter */
    public final StripeIntent.Status getStatus() {
        return this.status;
    }

    /* renamed from: component18, reason: from getter */
    public final StripeIntent.Usage getSetupFutureUsage() {
        return this.setupFutureUsage;
    }

    /* renamed from: component19, reason: from getter */
    public final Error getLastPaymentError() {
        return this.lastPaymentError;
    }

    public final List<String> component2() {
        return this.paymentMethodTypes;
    }

    /* renamed from: component20, reason: from getter */
    public final Shipping getShipping() {
        return this.shipping;
    }

    public final List<String> component21() {
        return this.unactivatedPaymentMethods;
    }

    public final List<String> component22() {
        return this.linkFundingSources;
    }

    /* renamed from: component23, reason: from getter */
    public final StripeIntent.NextActionData getNextActionData() {
        return this.nextActionData;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getAmount() {
        return this.amount;
    }

    /* renamed from: component4, reason: from getter */
    public final long getCanceledAt() {
        return this.canceledAt;
    }

    /* renamed from: component5, reason: from getter */
    public final CancellationReason getCancellationReason() {
        return this.cancellationReason;
    }

    /* renamed from: component6, reason: from getter */
    public final CaptureMethod getCaptureMethod() {
        return this.captureMethod;
    }

    /* renamed from: component7, reason: from getter */
    public final String getClientSecret() {
        return this.clientSecret;
    }

    /* renamed from: component8, reason: from getter */
    public final ConfirmationMethod getConfirmationMethod() {
        return this.confirmationMethod;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final PaymentIntent copy(String id, List<String> paymentMethodTypes, Long amount, long canceledAt, CancellationReason cancellationReason, CaptureMethod captureMethod, String clientSecret, ConfirmationMethod confirmationMethod, String countryCode, long created, String currency, String description, boolean isLiveMode, PaymentMethod paymentMethod, String paymentMethodId, String receiptEmail, StripeIntent.Status status, StripeIntent.Usage setupFutureUsage, Error lastPaymentError, Shipping shipping, List<String> unactivatedPaymentMethods, List<String> linkFundingSources, StripeIntent.NextActionData nextActionData, String paymentMethodOptionsJsonString) {
        Intrinsics.checkNotNullParameter(paymentMethodTypes, "paymentMethodTypes");
        Intrinsics.checkNotNullParameter(captureMethod, "captureMethod");
        Intrinsics.checkNotNullParameter(confirmationMethod, "confirmationMethod");
        Intrinsics.checkNotNullParameter(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        Intrinsics.checkNotNullParameter(linkFundingSources, "linkFundingSources");
        return new PaymentIntent(id, paymentMethodTypes, amount, canceledAt, cancellationReason, captureMethod, clientSecret, confirmationMethod, countryCode, created, currency, description, isLiveMode, paymentMethod, paymentMethodId, receiptEmail, status, setupFutureUsage, lastPaymentError, shipping, unactivatedPaymentMethods, linkFundingSources, nextActionData, paymentMethodOptionsJsonString);
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
        if (!(other instanceof PaymentIntent)) {
            return false;
        }
        PaymentIntent paymentIntent = (PaymentIntent) other;
        return Intrinsics.areEqual(this.id, paymentIntent.id) && Intrinsics.areEqual(this.paymentMethodTypes, paymentIntent.paymentMethodTypes) && Intrinsics.areEqual(this.amount, paymentIntent.amount) && this.canceledAt == paymentIntent.canceledAt && this.cancellationReason == paymentIntent.cancellationReason && this.captureMethod == paymentIntent.captureMethod && Intrinsics.areEqual(this.clientSecret, paymentIntent.clientSecret) && this.confirmationMethod == paymentIntent.confirmationMethod && Intrinsics.areEqual(this.countryCode, paymentIntent.countryCode) && this.created == paymentIntent.created && Intrinsics.areEqual(this.currency, paymentIntent.currency) && Intrinsics.areEqual(this.description, paymentIntent.description) && this.isLiveMode == paymentIntent.isLiveMode && Intrinsics.areEqual(this.paymentMethod, paymentIntent.paymentMethod) && Intrinsics.areEqual(this.paymentMethodId, paymentIntent.paymentMethodId) && Intrinsics.areEqual(this.receiptEmail, paymentIntent.receiptEmail) && this.status == paymentIntent.status && this.setupFutureUsage == paymentIntent.setupFutureUsage && Intrinsics.areEqual(this.lastPaymentError, paymentIntent.lastPaymentError) && Intrinsics.areEqual(this.shipping, paymentIntent.shipping) && Intrinsics.areEqual(this.unactivatedPaymentMethods, paymentIntent.unactivatedPaymentMethods) && Intrinsics.areEqual(this.linkFundingSources, paymentIntent.linkFundingSources) && Intrinsics.areEqual(this.nextActionData, paymentIntent.nextActionData) && Intrinsics.areEqual(this.paymentMethodOptionsJsonString, paymentIntent.paymentMethodOptionsJsonString);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        String str = this.id;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.paymentMethodTypes.hashCode()) * 31;
        Long l = this.amount;
        int iHashCode2 = (((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + Long.hashCode(this.canceledAt)) * 31;
        CancellationReason cancellationReason = this.cancellationReason;
        int iHashCode3 = (((iHashCode2 + (cancellationReason == null ? 0 : cancellationReason.hashCode())) * 31) + this.captureMethod.hashCode()) * 31;
        String str2 = this.clientSecret;
        int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.confirmationMethod.hashCode()) * 31;
        String str3 = this.countryCode;
        int iHashCode5 = (((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + Long.hashCode(this.created)) * 31;
        String str4 = this.currency;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.description;
        int iHashCode7 = (((iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31) + Boolean.hashCode(this.isLiveMode)) * 31;
        PaymentMethod paymentMethod = this.paymentMethod;
        int iHashCode8 = (iHashCode7 + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
        String str6 = this.paymentMethodId;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.receiptEmail;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        StripeIntent.Status status = this.status;
        int iHashCode11 = (iHashCode10 + (status == null ? 0 : status.hashCode())) * 31;
        StripeIntent.Usage usage = this.setupFutureUsage;
        int iHashCode12 = (iHashCode11 + (usage == null ? 0 : usage.hashCode())) * 31;
        Error error = this.lastPaymentError;
        int iHashCode13 = (iHashCode12 + (error == null ? 0 : error.hashCode())) * 31;
        Shipping shipping = this.shipping;
        int iHashCode14 = (((((iHashCode13 + (shipping == null ? 0 : shipping.hashCode())) * 31) + this.unactivatedPaymentMethods.hashCode()) * 31) + this.linkFundingSources.hashCode()) * 31;
        StripeIntent.NextActionData nextActionData = this.nextActionData;
        int iHashCode15 = (iHashCode14 + (nextActionData == null ? 0 : nextActionData.hashCode())) * 31;
        String str8 = this.paymentMethodOptionsJsonString;
        return iHashCode15 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        return "PaymentIntent(id=" + this.id + ", paymentMethodTypes=" + this.paymentMethodTypes + ", amount=" + this.amount + ", canceledAt=" + this.canceledAt + ", cancellationReason=" + this.cancellationReason + ", captureMethod=" + this.captureMethod + ", clientSecret=" + this.clientSecret + ", confirmationMethod=" + this.confirmationMethod + ", countryCode=" + this.countryCode + ", created=" + this.created + ", currency=" + this.currency + ", description=" + this.description + ", isLiveMode=" + this.isLiveMode + ", paymentMethod=" + this.paymentMethod + ", paymentMethodId=" + this.paymentMethodId + ", receiptEmail=" + this.receiptEmail + ", status=" + this.status + ", setupFutureUsage=" + this.setupFutureUsage + ", lastPaymentError=" + this.lastPaymentError + ", shipping=" + this.shipping + ", unactivatedPaymentMethods=" + this.unactivatedPaymentMethods + ", linkFundingSources=" + this.linkFundingSources + ", nextActionData=" + this.nextActionData + ", paymentMethodOptionsJsonString=" + this.paymentMethodOptionsJsonString + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeStringList(this.paymentMethodTypes);
        Long l = this.amount;
        if (l == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l.longValue());
        }
        dest.writeLong(this.canceledAt);
        CancellationReason cancellationReason = this.cancellationReason;
        if (cancellationReason == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cancellationReason.name());
        }
        dest.writeString(this.captureMethod.name());
        dest.writeString(this.clientSecret);
        dest.writeString(this.confirmationMethod.name());
        dest.writeString(this.countryCode);
        dest.writeLong(this.created);
        dest.writeString(this.currency);
        dest.writeString(this.description);
        dest.writeInt(this.isLiveMode ? 1 : 0);
        PaymentMethod paymentMethod = this.paymentMethod;
        if (paymentMethod == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            paymentMethod.writeToParcel(dest, flags);
        }
        dest.writeString(this.paymentMethodId);
        dest.writeString(this.receiptEmail);
        StripeIntent.Status status = this.status;
        if (status == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(status.name());
        }
        StripeIntent.Usage usage = this.setupFutureUsage;
        if (usage == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(usage.name());
        }
        Error error = this.lastPaymentError;
        if (error == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            error.writeToParcel(dest, flags);
        }
        Shipping shipping = this.shipping;
        if (shipping == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            shipping.writeToParcel(dest, flags);
        }
        dest.writeStringList(this.unactivatedPaymentMethods);
        dest.writeStringList(this.linkFundingSources);
        dest.writeParcelable(this.nextActionData, flags);
        dest.writeString(this.paymentMethodOptionsJsonString);
    }

    public PaymentIntent(String str, List<String> paymentMethodTypes, Long l, long j, CancellationReason cancellationReason, CaptureMethod captureMethod, String str2, ConfirmationMethod confirmationMethod, String str3, long j2, String str4, String str5, boolean z, PaymentMethod paymentMethod, String str6, String str7, StripeIntent.Status status, StripeIntent.Usage usage, Error error, Shipping shipping, List<String> unactivatedPaymentMethods, List<String> linkFundingSources, StripeIntent.NextActionData nextActionData, String str8) {
        Intrinsics.checkNotNullParameter(paymentMethodTypes, "paymentMethodTypes");
        Intrinsics.checkNotNullParameter(captureMethod, "captureMethod");
        Intrinsics.checkNotNullParameter(confirmationMethod, "confirmationMethod");
        Intrinsics.checkNotNullParameter(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        Intrinsics.checkNotNullParameter(linkFundingSources, "linkFundingSources");
        this.id = str;
        this.paymentMethodTypes = paymentMethodTypes;
        this.amount = l;
        this.canceledAt = j;
        this.cancellationReason = cancellationReason;
        this.captureMethod = captureMethod;
        this.clientSecret = str2;
        this.confirmationMethod = confirmationMethod;
        this.countryCode = str3;
        this.created = j2;
        this.currency = str4;
        this.description = str5;
        this.isLiveMode = z;
        this.paymentMethod = paymentMethod;
        this.paymentMethodId = str6;
        this.receiptEmail = str7;
        this.status = status;
        this.setupFutureUsage = usage;
        this.lastPaymentError = error;
        this.shipping = shipping;
        this.unactivatedPaymentMethods = unactivatedPaymentMethods;
        this.linkFundingSources = linkFundingSources;
        this.nextActionData = nextActionData;
        this.paymentMethodOptionsJsonString = str8;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getId() {
        return this.id;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List<String> getPaymentMethodTypes() {
        return this.paymentMethodTypes;
    }

    public final Long getAmount() {
        return this.amount;
    }

    public final long getCanceledAt() {
        return this.canceledAt;
    }

    public final CancellationReason getCancellationReason() {
        return this.cancellationReason;
    }

    public /* synthetic */ PaymentIntent(String str, List list, Long l, long j, CancellationReason cancellationReason, CaptureMethod captureMethod, String str2, ConfirmationMethod confirmationMethod, String str3, long j2, String str4, String str5, boolean z, PaymentMethod paymentMethod, String str6, String str7, StripeIntent.Status status, StripeIntent.Usage usage, Error error, Shipping shipping, List list2, List list3, StripeIntent.NextActionData nextActionData, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, l, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? null : cancellationReason, (i & 32) != 0 ? CaptureMethod.Automatic : captureMethod, str2, (i & 128) != 0 ? ConfirmationMethod.Automatic : confirmationMethod, str3, j2, str4, (i & 2048) != 0 ? null : str5, z, (i & 8192) != 0 ? null : paymentMethod, (i & 16384) != 0 ? null : str6, (32768 & i) != 0 ? null : str7, (65536 & i) != 0 ? null : status, (131072 & i) != 0 ? null : usage, (262144 & i) != 0 ? null : error, (524288 & i) != 0 ? null : shipping, list2, (2097152 & i) != 0 ? CollectionsKt.emptyList() : list3, (4194304 & i) != 0 ? null : nextActionData, (i & 8388608) != 0 ? null : str8);
    }

    public final CaptureMethod getCaptureMethod() {
        return this.captureMethod;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getClientSecret() {
        return this.clientSecret;
    }

    public final ConfirmationMethod getConfirmationMethod() {
        return this.confirmationMethod;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getCountryCode() {
        return this.countryCode;
    }

    @Override // com.stripe.android.model.StripeIntent
    public long getCreated() {
        return this.created;
    }

    public final String getCurrency() {
        return this.currency;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getDescription() {
        return this.description;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean isLiveMode() {
        return this.isLiveMode;
    }

    @Override // com.stripe.android.model.StripeIntent
    public PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final String getReceiptEmail() {
        return this.receiptEmail;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.Status getStatus() {
        return this.status;
    }

    public final StripeIntent.Usage getSetupFutureUsage() {
        return this.setupFutureUsage;
    }

    public final Error getLastPaymentError() {
        return this.lastPaymentError;
    }

    public final Shipping getShipping() {
        return this.shipping;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List<String> getUnactivatedPaymentMethods() {
        return this.unactivatedPaymentMethods;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List<String> getLinkFundingSources() {
        return this.linkFundingSources;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.NextActionData getNextActionData() {
        return this.nextActionData;
    }

    @Override // com.stripe.android.model.StripeIntent
    public Map<String, Object> getPaymentMethodOptions() {
        Map<String, Object> mapJsonObjectToMap;
        String str = this.paymentMethodOptionsJsonString;
        return (str == null || (mapJsonObjectToMap = StripeJsonUtils.INSTANCE.jsonObjectToMap(new JSONObject(str))) == null) ? MapsKt.emptyMap() : mapJsonObjectToMap;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.NextActionType getNextActionType() {
        StripeIntent.NextActionData nextActionData = getNextActionData();
        if (nextActionData instanceof StripeIntent.NextActionData.SdkData) {
            return StripeIntent.NextActionType.UseStripeSdk;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.RedirectToUrl) {
            return StripeIntent.NextActionType.RedirectToUrl;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.DisplayOxxoDetails) {
            return StripeIntent.NextActionType.DisplayOxxoDetails;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.DisplayBoletoDetails) {
            return StripeIntent.NextActionType.DisplayBoletoDetails;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.DisplayKonbiniDetails) {
            return StripeIntent.NextActionType.DisplayKonbiniDetails;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.DisplayMultibancoDetails) {
            return StripeIntent.NextActionType.DisplayMultibancoDetails;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.VerifyWithMicrodeposits) {
            return StripeIntent.NextActionType.VerifyWithMicrodeposits;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.UpiAwaitNotification) {
            return StripeIntent.NextActionType.UpiAwaitNotification;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.CashAppRedirect) {
            return StripeIntent.NextActionType.CashAppRedirect;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.BlikAuthorize) {
            return StripeIntent.NextActionType.BlikAuthorize;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.SwishRedirect) {
            return StripeIntent.NextActionType.SwishRedirect;
        }
        if ((nextActionData instanceof StripeIntent.NextActionData.AlipayRedirect) || (nextActionData instanceof StripeIntent.NextActionData.WeChatPayRedirect) || nextActionData == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean isConfirmed() {
        return CollectionsKt.contains(SetsKt.setOf((Object[]) new StripeIntent.Status[]{StripeIntent.Status.Processing, StripeIntent.Status.RequiresCapture, StripeIntent.Status.Succeeded}), getStatus());
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getLastErrorMessage() {
        Error error = this.lastPaymentError;
        if (error != null) {
            return error.getMessage();
        }
        return null;
    }

    public final boolean isRedacted$payments_core_release() {
        return Intrinsics.areEqual(getClientSecret(), VALUE_REDACTED_CLIENT_SECRET);
    }

    public final boolean getRequireCvcRecollection() {
        JSONObject jSONObjectOptJSONObject;
        String str = this.paymentMethodOptionsJsonString;
        if (str == null || (jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("card")) == null) {
            return false;
        }
        return jSONObjectOptJSONObject.optBoolean("require_cvc_recollection");
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean requiresAction() {
        return getStatus() == StripeIntent.Status.RequiresAction;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean requiresConfirmation() {
        return getStatus() == StripeIntent.Status.RequiresConfirmation;
    }

    public final boolean isSetupFutureUsageSet(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return (isTopLevelSetupFutureUsageSet() || isLpmLevelSetupFutureUsageSet(code)) && !isPaymentMethodOptionsSetupFutureUsageNone(code);
    }

    public final PaymentIntent withUnredactedClientSecret$payments_core_release(String clientSecret) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        return !isRedacted$payments_core_release() ? this : new PaymentIntent(getId(), getPaymentMethodTypes(), this.amount, this.canceledAt, this.cancellationReason, this.captureMethod, clientSecret, this.confirmationMethod, getCountryCode(), getCreated(), this.currency, getDescription(), isLiveMode(), getPaymentMethod(), getPaymentMethodId(), this.receiptEmail, getStatus(), this.setupFutureUsage, this.lastPaymentError, this.shipping, getUnactivatedPaymentMethods(), getLinkFundingSources(), getNextActionData(), this.paymentMethodOptionsJsonString);
    }

    private final boolean isTopLevelSetupFutureUsageSet() {
        StripeIntent.Usage usage = this.setupFutureUsage;
        int i = usage == null ? -1 : WhenMappings.$EnumSwitchMapping$0[usage.ordinal()];
        if (i == -1) {
            return false;
        }
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final boolean isPaymentMethodOptionsSetupFutureUsageNone(String code) {
        String str = this.paymentMethodOptionsJsonString;
        if (str == null) {
            return false;
        }
        JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject(code);
        return Intrinsics.areEqual(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("setup_future_usage") : null, "none");
    }

    private final boolean isLpmLevelSetupFutureUsageSet(String code) {
        JSONObject jSONObjectOptJSONObject;
        String str = this.paymentMethodOptionsJsonString;
        if (str == null || (jSONObjectOptJSONObject = new JSONObject(str).optJSONObject(code)) == null) {
            return false;
        }
        return jSONObjectOptJSONObject.has("setup_future_usage");
    }

    /* compiled from: PaymentIntent.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000212BY\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003Jn\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÀ\u0001¢\u0006\u0002\b#J\u0006\u0010$\u001a\u00020%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020%HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020%R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u00063"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$Error;", "Lcom/stripe/android/core/model/StripeModel;", StripeErrorJsonParser.FIELD_CHARGE, "", "code", "declineCode", "docUrl", "message", StripeErrorJsonParser.FIELD_PARAM, "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "type", "Lcom/stripe/android/model/PaymentIntent$Error$Type;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentIntent$Error$Type;)V", "getCharge", "()Ljava/lang/String;", "getCode", "getDeclineCode", "getDocUrl", "getMessage", "getParam", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "getType", "()Lcom/stripe/android/model/PaymentIntent$Error$Type;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "copy$payments_core_release", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Type", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error implements StripeModel {
        public static final String CODE_AUTHENTICATION_ERROR = "payment_intent_authentication_failure";
        private final String charge;
        private final String code;
        private final String declineCode;
        private final String docUrl;
        private final String message;
        private final String param;
        private final PaymentMethod paymentMethod;
        private final Type type;
        public static final Parcelable.Creator<Error> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentIntent.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Error> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Error(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PaymentMethod.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Type.valueOf(parcel.readString()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i) {
                return new Error[i];
            }
        }

        public static /* synthetic */ Error copy$payments_core_release$default(Error error, String str, String str2, String str3, String str4, String str5, String str6, PaymentMethod paymentMethod, Type type, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.charge;
            }
            if ((i & 2) != 0) {
                str2 = error.code;
            }
            if ((i & 4) != 0) {
                str3 = error.declineCode;
            }
            if ((i & 8) != 0) {
                str4 = error.docUrl;
            }
            if ((i & 16) != 0) {
                str5 = error.message;
            }
            if ((i & 32) != 0) {
                str6 = error.param;
            }
            if ((i & 64) != 0) {
                paymentMethod = error.paymentMethod;
            }
            if ((i & 128) != 0) {
                type = error.type;
            }
            PaymentMethod paymentMethod2 = paymentMethod;
            Type type2 = type;
            String str7 = str5;
            String str8 = str6;
            return error.copy$payments_core_release(str, str2, str3, str4, str7, str8, paymentMethod2, type2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCharge() {
            return this.charge;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDeclineCode() {
            return this.declineCode;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDocUrl() {
            return this.docUrl;
        }

        /* renamed from: component5, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component6, reason: from getter */
        public final String getParam() {
            return this.param;
        }

        /* renamed from: component7, reason: from getter */
        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        /* renamed from: component8, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        public final Error copy$payments_core_release(String charge, String code, String declineCode, String docUrl, String message, String param, PaymentMethod paymentMethod, Type type) {
            return new Error(charge, code, declineCode, docUrl, message, param, paymentMethod, type);
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
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.areEqual(this.charge, error.charge) && Intrinsics.areEqual(this.code, error.code) && Intrinsics.areEqual(this.declineCode, error.declineCode) && Intrinsics.areEqual(this.docUrl, error.docUrl) && Intrinsics.areEqual(this.message, error.message) && Intrinsics.areEqual(this.param, error.param) && Intrinsics.areEqual(this.paymentMethod, error.paymentMethod) && this.type == error.type;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.charge;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.code;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.declineCode;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.docUrl;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.message;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.param;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            PaymentMethod paymentMethod = this.paymentMethod;
            int iHashCode7 = (iHashCode6 + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
            Type type = this.type;
            return iHashCode7 + (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            return "Error(charge=" + this.charge + ", code=" + this.code + ", declineCode=" + this.declineCode + ", docUrl=" + this.docUrl + ", message=" + this.message + ", param=" + this.param + ", paymentMethod=" + this.paymentMethod + ", type=" + this.type + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.charge);
            dest.writeString(this.code);
            dest.writeString(this.declineCode);
            dest.writeString(this.docUrl);
            dest.writeString(this.message);
            dest.writeString(this.param);
            PaymentMethod paymentMethod = this.paymentMethod;
            if (paymentMethod == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                paymentMethod.writeToParcel(dest, flags);
            }
            Type type = this.type;
            if (type == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(type.name());
            }
        }

        public Error(String str, String str2, String str3, String str4, String str5, String str6, PaymentMethod paymentMethod, Type type) {
            this.charge = str;
            this.code = str2;
            this.declineCode = str3;
            this.docUrl = str4;
            this.message = str5;
            this.param = str6;
            this.paymentMethod = paymentMethod;
            this.type = type;
        }

        public final String getCharge() {
            return this.charge;
        }

        public final String getCode() {
            return this.code;
        }

        public final String getDeclineCode() {
            return this.declineCode;
        }

        public final String getDocUrl() {
            return this.docUrl;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getParam() {
            return this.param;
        }

        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final Type getType() {
            return this.type;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: PaymentIntent.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$Error$Type;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "ApiConnectionError", "ApiError", "AuthenticationError", "CardError", "IdempotencyError", "InvalidRequestError", "RateLimitError", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Type {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final String code;
            public static final Type ApiConnectionError = new Type("ApiConnectionError", 0, "api_connection_error");
            public static final Type ApiError = new Type("ApiError", 1, "api_error");
            public static final Type AuthenticationError = new Type("AuthenticationError", 2, "authentication_error");
            public static final Type CardError = new Type("CardError", 3, "card_error");
            public static final Type IdempotencyError = new Type("IdempotencyError", 4, "idempotency_error");
            public static final Type InvalidRequestError = new Type("InvalidRequestError", 5, "invalid_request_error");
            public static final Type RateLimitError = new Type("RateLimitError", 6, "rate_limit_error");

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{ApiConnectionError, ApiError, AuthenticationError, CardError, IdempotencyError, InvalidRequestError, RateLimitError};
            }

            public static EnumEntries<Type> getEntries() {
                return $ENTRIES;
            }

            private Type(String str, int i, String str2) {
                this.code = str2;
            }

            public final String getCode() {
                return this.code;
            }

            static {
                Type[] typeArr$values = $values();
                $VALUES = typeArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(typeArr$values);
                INSTANCE = new Companion(null);
            }

            /* compiled from: PaymentIntent.kt */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$Error$Type$Companion;", "", "<init>", "()V", "fromCode", "Lcom/stripe/android/model/PaymentIntent$Error$Type;", "typeCode", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final Type fromCode(String typeCode) {
                    Type next;
                    Iterator<Type> it = Type.getEntries().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.areEqual(next.getCode(), typeCode)) {
                            break;
                        }
                    }
                    return next;
                }
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: PaymentIntent.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006%"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$Shipping;", "Lcom/stripe/android/core/model/StripeModel;", "address", "Lcom/stripe/android/model/Address;", "carrier", "", "name", "phone", "trackingNumber", "<init>", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Lcom/stripe/android/model/Address;", "getCarrier", "()Ljava/lang/String;", "getName", "getPhone", "getTrackingNumber", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Shipping implements StripeModel {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Shipping> CREATOR = new Creator();
        private final Address address;
        private final String carrier;
        private final String name;
        private final String phone;
        private final String trackingNumber;

        /* compiled from: PaymentIntent.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Shipping> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Shipping createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Shipping(Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Shipping[] newArray(int i) {
                return new Shipping[i];
            }
        }

        public static /* synthetic */ Shipping copy$default(Shipping shipping, Address address, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                address = shipping.address;
            }
            if ((i & 2) != 0) {
                str = shipping.carrier;
            }
            if ((i & 4) != 0) {
                str2 = shipping.name;
            }
            if ((i & 8) != 0) {
                str3 = shipping.phone;
            }
            if ((i & 16) != 0) {
                str4 = shipping.trackingNumber;
            }
            String str5 = str4;
            String str6 = str2;
            return shipping.copy(address, str, str6, str3, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final Address getAddress() {
            return this.address;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCarrier() {
            return this.carrier;
        }

        /* renamed from: component3, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTrackingNumber() {
            return this.trackingNumber;
        }

        public final Shipping copy(Address address, String carrier, String name, String phone, String trackingNumber) {
            Intrinsics.checkNotNullParameter(address, "address");
            return new Shipping(address, carrier, name, phone, trackingNumber);
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
            if (!(other instanceof Shipping)) {
                return false;
            }
            Shipping shipping = (Shipping) other;
            return Intrinsics.areEqual(this.address, shipping.address) && Intrinsics.areEqual(this.carrier, shipping.carrier) && Intrinsics.areEqual(this.name, shipping.name) && Intrinsics.areEqual(this.phone, shipping.phone) && Intrinsics.areEqual(this.trackingNumber, shipping.trackingNumber);
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            int iHashCode = this.address.hashCode() * 31;
            String str = this.carrier;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.trackingNumber;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "Shipping(address=" + this.address + ", carrier=" + this.carrier + ", name=" + this.name + ", phone=" + this.phone + ", trackingNumber=" + this.trackingNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.address.writeToParcel(dest, flags);
            dest.writeString(this.carrier);
            dest.writeString(this.name);
            dest.writeString(this.phone);
            dest.writeString(this.trackingNumber);
        }

        public Shipping(Address address, String str, String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(address, "address");
            this.address = address;
            this.carrier = str;
            this.name = str2;
            this.phone = str3;
            this.trackingNumber = str4;
        }

        public /* synthetic */ Shipping(Address address, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(address, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
        }

        public final Address getAddress() {
            return this.address;
        }

        public final String getCarrier() {
            return this.carrier;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPhone() {
            return this.phone;
        }

        public final String getTrackingNumber() {
            return this.trackingNumber;
        }
    }

    /* compiled from: PaymentIntent.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\n\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u000bJ\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$ClientSecret;", "", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue$payments_core_release", "()Ljava/lang/String;", "paymentIntentId", "getPaymentIntentId$payments_core_release", "component1", "component1$payments_core_release", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ClientSecret {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Pattern PATTERN = Pattern.compile("^pi_[^_]+_(scoped_)?secret_[^_]+$");
        private final String paymentIntentId;
        private final String value;

        public static /* synthetic */ ClientSecret copy$default(ClientSecret clientSecret, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = clientSecret.value;
            }
            return clientSecret.copy(str);
        }

        /* renamed from: component1$payments_core_release, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final ClientSecret copy(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new ClientSecret(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ClientSecret) && Intrinsics.areEqual(this.value, ((ClientSecret) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "ClientSecret(value=" + this.value + ")";
        }

        public ClientSecret(String value) {
            List listEmptyList;
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
            List<String> listSplit = new Regex("_(scoped_)?secret").split(value, 0);
            if (!listSplit.isEmpty()) {
                ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        listEmptyList = CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listEmptyList = CollectionsKt.emptyList();
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            this.paymentIntentId = ((String[]) listEmptyList.toArray(new String[0]))[0];
            if (INSTANCE.isMatch(this.value)) {
                return;
            }
            throw new IllegalArgumentException(("Invalid Payment Intent client secret: " + this.value).toString());
        }

        public final String getValue$payments_core_release() {
            return this.value;
        }

        /* renamed from: getPaymentIntentId$payments_core_release, reason: from getter */
        public final String getPaymentIntentId() {
            return this.paymentIntentId;
        }

        /* compiled from: PaymentIntent.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$ClientSecret$Companion;", "", "<init>", "()V", "PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "Ljava/util/regex/Pattern;", "isMatch", "", "value", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final boolean isMatch(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ClientSecret.PATTERN.matcher(value).matches();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaymentIntent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$CancellationReason;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Duplicate", "Fraudulent", "RequestedByCustomer", "Abandoned", "FailedInvoice", "VoidInvoice", "Automatic", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CancellationReason {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CancellationReason[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String code;
        public static final CancellationReason Duplicate = new CancellationReason("Duplicate", 0, "duplicate");
        public static final CancellationReason Fraudulent = new CancellationReason("Fraudulent", 1, "fraudulent");
        public static final CancellationReason RequestedByCustomer = new CancellationReason("RequestedByCustomer", 2, "requested_by_customer");
        public static final CancellationReason Abandoned = new CancellationReason("Abandoned", 3, "abandoned");
        public static final CancellationReason FailedInvoice = new CancellationReason("FailedInvoice", 4, "failed_invoice");
        public static final CancellationReason VoidInvoice = new CancellationReason("VoidInvoice", 5, "void_invoice");
        public static final CancellationReason Automatic = new CancellationReason("Automatic", 6, AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_AUTOMATIC);

        private static final /* synthetic */ CancellationReason[] $values() {
            return new CancellationReason[]{Duplicate, Fraudulent, RequestedByCustomer, Abandoned, FailedInvoice, VoidInvoice, Automatic};
        }

        public static EnumEntries<CancellationReason> getEntries() {
            return $ENTRIES;
        }

        private CancellationReason(String str, int i, String str2) {
            this.code = str2;
        }

        static {
            CancellationReason[] cancellationReasonArr$values = $values();
            $VALUES = cancellationReasonArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(cancellationReasonArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: PaymentIntent.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$CancellationReason$Companion;", "", "<init>", "()V", "fromCode", "Lcom/stripe/android/model/PaymentIntent$CancellationReason;", "code", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final CancellationReason fromCode(String code) {
                CancellationReason next;
                Iterator<CancellationReason> it = CancellationReason.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(next.code, code)) {
                        break;
                    }
                }
                return next;
            }
        }

        public static CancellationReason valueOf(String str) {
            return (CancellationReason) Enum.valueOf(CancellationReason.class, str);
        }

        public static CancellationReason[] values() {
            return (CancellationReason[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaymentIntent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u00020\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$CaptureMethod;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "Automatic", "AutomaticAsync", "Manual", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CaptureMethod {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CaptureMethod[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String code;
        public static final CaptureMethod Automatic = new CaptureMethod("Automatic", 0, AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_AUTOMATIC);
        public static final CaptureMethod AutomaticAsync = new CaptureMethod("AutomaticAsync", 1, "automatic_async");
        public static final CaptureMethod Manual = new CaptureMethod("Manual", 2, "manual");

        private static final /* synthetic */ CaptureMethod[] $values() {
            return new CaptureMethod[]{Automatic, AutomaticAsync, Manual};
        }

        public static EnumEntries<CaptureMethod> getEntries() {
            return $ENTRIES;
        }

        private CaptureMethod(String str, int i, String str2) {
            this.code = str2;
        }

        public final String getCode() {
            return this.code;
        }

        static {
            CaptureMethod[] captureMethodArr$values = $values();
            $VALUES = captureMethodArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(captureMethodArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: PaymentIntent.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$CaptureMethod$Companion;", "", "<init>", "()V", "fromCode", "Lcom/stripe/android/model/PaymentIntent$CaptureMethod;", "code", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final CaptureMethod fromCode(String code) {
                CaptureMethod next;
                Iterator<CaptureMethod> it = CaptureMethod.getEntries().iterator();
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
                CaptureMethod captureMethod = next;
                return captureMethod == null ? CaptureMethod.Automatic : captureMethod;
            }
        }

        public static CaptureMethod valueOf(String str) {
            return (CaptureMethod) Enum.valueOf(CaptureMethod.class, str);
        }

        public static CaptureMethod[] values() {
            return (CaptureMethod[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaymentIntent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Automatic", "Manual", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ConfirmationMethod {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ConfirmationMethod[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String code;
        public static final ConfirmationMethod Automatic = new ConfirmationMethod("Automatic", 0, AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_AUTOMATIC);
        public static final ConfirmationMethod Manual = new ConfirmationMethod("Manual", 1, "manual");

        private static final /* synthetic */ ConfirmationMethod[] $values() {
            return new ConfirmationMethod[]{Automatic, Manual};
        }

        public static EnumEntries<ConfirmationMethod> getEntries() {
            return $ENTRIES;
        }

        private ConfirmationMethod(String str, int i, String str2) {
            this.code = str2;
        }

        static {
            ConfirmationMethod[] confirmationMethodArr$values = $values();
            $VALUES = confirmationMethodArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(confirmationMethodArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: PaymentIntent.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod$Companion;", "", "<init>", "()V", "fromCode", "Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;", "code", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final ConfirmationMethod fromCode(String code) {
                ConfirmationMethod next;
                Iterator<ConfirmationMethod> it = ConfirmationMethod.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(next.code, code)) {
                        break;
                    }
                }
                ConfirmationMethod confirmationMethod = next;
                return confirmationMethod == null ? ConfirmationMethod.Automatic : confirmationMethod;
            }
        }

        public static ConfirmationMethod valueOf(String str) {
            return (ConfirmationMethod) Enum.valueOf(ConfirmationMethod.class, str);
        }

        public static ConfirmationMethod[] values() {
            return (ConfirmationMethod[]) $VALUES.clone();
        }
    }

    /* compiled from: PaymentIntent.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007R\u000e\u0010\b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$Companion;", "", "<init>", "()V", "fromJson", "Lcom/stripe/android/model/PaymentIntent;", "jsonObject", "Lorg/json/JSONObject;", "CARD", "", "REQUIRE_CVC_RECOLLECTION", "SETUP_FUTURE_USAGE", "NONE", "OFF_SESSION", "ON_SESSION", "VALUE_REDACTED_CLIENT_SECRET", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PaymentIntent fromJson(JSONObject jsonObject) {
            if (jsonObject != null) {
                return new PaymentIntentJsonParser().parse(jsonObject);
            }
            return null;
        }
    }
}
