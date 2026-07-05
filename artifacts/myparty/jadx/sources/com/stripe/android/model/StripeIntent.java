package com.stripe.android.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.utils.StripeUrlUtils;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeIntent.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u00045678J\b\u00100\u001a\u00020\rH&J\b\u00101\u001a\u00020\rH&J\u0016\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010403H'R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0005R\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001aX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0005R\u0014\u0010\u001f\u001a\u0004\u0018\u00010 X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u0004\u0018\u00010$X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0012\u0010'\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u000eR\u0014\u0010(\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0005R\u0018\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0018R\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0018R\u0016\u0010.\u001a\u0004\u0018\u00010\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0005\u0082\u0001\u00029:¨\u0006;"}, d2 = {"Lcom/stripe/android/model/StripeIntent;", "Lcom/stripe/android/core/model/StripeModel;", "id", "", "getId", "()Ljava/lang/String;", "created", "", "getCreated", "()J", "description", "getDescription", NamedConstantsKt.IS_LIVE_MODE, "", "()Z", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "paymentMethodId", "getPaymentMethodId", "paymentMethodTypes", "", "getPaymentMethodTypes", "()Ljava/util/List;", "nextActionType", "Lcom/stripe/android/model/StripeIntent$NextActionType;", "getNextActionType", "()Lcom/stripe/android/model/StripeIntent$NextActionType;", "clientSecret", "getClientSecret", "status", "Lcom/stripe/android/model/StripeIntent$Status;", "getStatus", "()Lcom/stripe/android/model/StripeIntent$Status;", "nextActionData", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "getNextActionData", "()Lcom/stripe/android/model/StripeIntent$NextActionData;", "isConfirmed", "lastErrorMessage", "getLastErrorMessage", "unactivatedPaymentMethods", "getUnactivatedPaymentMethods", "linkFundingSources", "getLinkFundingSources", "countryCode", "getCountryCode", "requiresAction", "requiresConfirmation", "getPaymentMethodOptions", "", "", "NextActionType", "Status", "Usage", "NextActionData", "Lcom/stripe/android/model/PaymentIntent;", "Lcom/stripe/android/model/SetupIntent;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface StripeIntent extends StripeModel {
    String getClientSecret();

    String getCountryCode();

    long getCreated();

    String getDescription();

    String getId();

    String getLastErrorMessage();

    List<String> getLinkFundingSources();

    NextActionData getNextActionData();

    NextActionType getNextActionType();

    PaymentMethod getPaymentMethod();

    String getPaymentMethodId();

    Map<String, Object> getPaymentMethodOptions();

    List<String> getPaymentMethodTypes();

    Status getStatus();

    List<String> getUnactivatedPaymentMethods();

    boolean isConfirmed();

    boolean isLiveMode();

    boolean requiresAction();

    boolean requiresConfirmation();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StripeIntent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0015\u001a\u00020\u0003H\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionType;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "RedirectToUrl", "UseStripeSdk", "DisplayOxxoDetails", "AlipayRedirect", "BlikAuthorize", "WeChatPayRedirect", "VerifyWithMicrodeposits", "UpiAwaitNotification", "CashAppRedirect", "DisplayBoletoDetails", "DisplayKonbiniDetails", "DisplayMultibancoDetails", "SwishRedirect", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NextActionType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ NextActionType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String code;
        public static final NextActionType RedirectToUrl = new NextActionType("RedirectToUrl", 0, "redirect_to_url");
        public static final NextActionType UseStripeSdk = new NextActionType("UseStripeSdk", 1, "use_stripe_sdk");
        public static final NextActionType DisplayOxxoDetails = new NextActionType("DisplayOxxoDetails", 2, "oxxo_display_details");
        public static final NextActionType AlipayRedirect = new NextActionType("AlipayRedirect", 3, "alipay_handle_redirect");
        public static final NextActionType BlikAuthorize = new NextActionType("BlikAuthorize", 4, "blik_authorize");
        public static final NextActionType WeChatPayRedirect = new NextActionType("WeChatPayRedirect", 5, "wechat_pay_redirect_to_android_app");
        public static final NextActionType VerifyWithMicrodeposits = new NextActionType("VerifyWithMicrodeposits", 6, "verify_with_microdeposits");
        public static final NextActionType UpiAwaitNotification = new NextActionType("UpiAwaitNotification", 7, "upi_await_notification");
        public static final NextActionType CashAppRedirect = new NextActionType("CashAppRedirect", 8, "cashapp_handle_redirect_or_display_qr_code");
        public static final NextActionType DisplayBoletoDetails = new NextActionType("DisplayBoletoDetails", 9, "boleto_display_details");
        public static final NextActionType DisplayKonbiniDetails = new NextActionType("DisplayKonbiniDetails", 10, "konbini_display_details");
        public static final NextActionType DisplayMultibancoDetails = new NextActionType("DisplayMultibancoDetails", 11, "multibanco_display_details");
        public static final NextActionType SwishRedirect = new NextActionType("SwishRedirect", 12, "swish_handle_redirect_or_display_qr_code");

        private static final /* synthetic */ NextActionType[] $values() {
            return new NextActionType[]{RedirectToUrl, UseStripeSdk, DisplayOxxoDetails, AlipayRedirect, BlikAuthorize, WeChatPayRedirect, VerifyWithMicrodeposits, UpiAwaitNotification, CashAppRedirect, DisplayBoletoDetails, DisplayKonbiniDetails, DisplayMultibancoDetails, SwishRedirect};
        }

        public static EnumEntries<NextActionType> getEntries() {
            return $ENTRIES;
        }

        private NextActionType(String str, int i, String str2) {
            this.code = str2;
        }

        public final String getCode() {
            return this.code;
        }

        static {
            NextActionType[] nextActionTypeArr$values = $values();
            $VALUES = nextActionTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(nextActionTypeArr$values);
            INSTANCE = new Companion(null);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }

        /* compiled from: StripeIntent.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionType$Companion;", "", "<init>", "()V", "fromCode", "Lcom/stripe/android/model/StripeIntent$NextActionType;", "code", "", "fromCode$payments_core_release", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final NextActionType fromCode$payments_core_release(String code) {
                NextActionType next;
                Iterator<NextActionType> it = NextActionType.getEntries().iterator();
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

        public static NextActionType valueOf(String str) {
            return (NextActionType) Enum.valueOf(NextActionType.class, str);
        }

        public static NextActionType[] values() {
            return (NextActionType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StripeIntent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000f\u001a\u00020\u0003H\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/model/StripeIntent$Status;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "Canceled", "Processing", "RequiresAction", "RequiresConfirmation", "RequiresPaymentMethod", "Succeeded", "RequiresCapture", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String code;
        public static final Status Canceled = new Status("Canceled", 0, "canceled");
        public static final Status Processing = new Status("Processing", 1, BaseSheetViewModel.SAVE_PROCESSING);
        public static final Status RequiresAction = new Status("RequiresAction", 2, "requires_action");
        public static final Status RequiresConfirmation = new Status("RequiresConfirmation", 3, "requires_confirmation");
        public static final Status RequiresPaymentMethod = new Status("RequiresPaymentMethod", 4, "requires_payment_method");
        public static final Status Succeeded = new Status("Succeeded", 5, "succeeded");
        public static final Status RequiresCapture = new Status("RequiresCapture", 6, "requires_capture");

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{Canceled, Processing, RequiresAction, RequiresConfirmation, RequiresPaymentMethod, Succeeded, RequiresCapture};
        }

        public static EnumEntries<Status> getEntries() {
            return $ENTRIES;
        }

        private Status(String str, int i, String str2) {
            this.code = str2;
        }

        public final String getCode() {
            return this.code;
        }

        static {
            Status[] statusArr$values = $values();
            $VALUES = statusArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(statusArr$values);
            INSTANCE = new Companion(null);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }

        /* compiled from: StripeIntent.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/StripeIntent$Status$Companion;", "", "<init>", "()V", "fromCode", "Lcom/stripe/android/model/StripeIntent$Status;", "code", "", "fromCode$payments_core_release", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Status fromCode$payments_core_release(String code) {
                Status next;
                Iterator<Status> it = Status.getEntries().iterator();
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

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StripeIntent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000b\u001a\u00020\u0003H\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/StripeIntent$Usage;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "OnSession", "OffSession", "OneTime", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Usage {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Usage[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String code;
        public static final Usage OnSession = new Usage("OnSession", 0, PaymentIntent.ON_SESSION);
        public static final Usage OffSession = new Usage("OffSession", 1, PaymentIntent.OFF_SESSION);
        public static final Usage OneTime = new Usage("OneTime", 2, "one_time");

        private static final /* synthetic */ Usage[] $values() {
            return new Usage[]{OnSession, OffSession, OneTime};
        }

        public static EnumEntries<Usage> getEntries() {
            return $ENTRIES;
        }

        private Usage(String str, int i, String str2) {
            this.code = str2;
        }

        public final String getCode() {
            return this.code;
        }

        static {
            Usage[] usageArr$values = $values();
            $VALUES = usageArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(usageArr$values);
            INSTANCE = new Companion(null);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }

        /* compiled from: StripeIntent.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/StripeIntent$Usage$Companion;", "", "<init>", "()V", "fromCode", "Lcom/stripe/android/model/StripeIntent$Usage;", "code", "", "fromCode$payments_core_release", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Usage fromCode$payments_core_release(String code) {
                Usage next;
                Iterator<Usage> it = Usage.getEntries().iterator();
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

        public static Usage valueOf(String str) {
            return (Usage) Enum.valueOf(Usage.class, str);
        }

        public static Usage[] values() {
            return (Usage[]) $VALUES.clone();
        }
    }

    /* compiled from: StripeIntent.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000e\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\r\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData;", "Lcom/stripe/android/core/model/StripeModel;", "<init>", "()V", "DisplayVoucherDetails", "DisplayOxxoDetails", "DisplayBoletoDetails", "DisplayKonbiniDetails", "DisplayMultibancoDetails", "RedirectToUrl", "AlipayRedirect", "SdkData", "BlikAuthorize", "WeChatPayRedirect", "VerifyWithMicrodeposits", "UpiAwaitNotification", "CashAppRedirect", "SwishRedirect", "Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;", "Lcom/stripe/android/model/StripeIntent$NextActionData$BlikAuthorize;", "Lcom/stripe/android/model/StripeIntent$NextActionData$CashAppRedirect;", "Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayBoletoDetails;", "Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayKonbiniDetails;", "Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayMultibancoDetails;", "Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;", "Lcom/stripe/android/model/StripeIntent$NextActionData$RedirectToUrl;", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData;", "Lcom/stripe/android/model/StripeIntent$NextActionData$SwishRedirect;", "Lcom/stripe/android/model/StripeIntent$NextActionData$UpiAwaitNotification;", "Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;", "Lcom/stripe/android/model/StripeIntent$NextActionData$WeChatPayRedirect;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class NextActionData implements StripeModel {
        public static final int $stable = 0;

        /* compiled from: StripeIntent.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayVoucherDetails;", "", "hostedVoucherUrl", "", "getHostedVoucherUrl", "()Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface DisplayVoucherDetails {
            String getHostedVoucherUrl();
        }

        public /* synthetic */ NextActionData(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private NextActionData() {
        }

        /* compiled from: StripeIntent.kt */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0004J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayVoucherDetails;", "expiresAfter", "", "number", "", "hostedVoucherUrl", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getExpiresAfter", "()I", "getNumber", "()Ljava/lang/String;", "getHostedVoucherUrl", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DisplayOxxoDetails extends NextActionData implements DisplayVoucherDetails {
            private final int expiresAfter;
            private final String hostedVoucherUrl;
            private final String number;
            public static final Parcelable.Creator<DisplayOxxoDetails> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: StripeIntent.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<DisplayOxxoDetails> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DisplayOxxoDetails createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DisplayOxxoDetails(parcel.readInt(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DisplayOxxoDetails[] newArray(int i) {
                    return new DisplayOxxoDetails[i];
                }
            }

            public DisplayOxxoDetails() {
                this(0, null, null, 7, null);
            }

            public static /* synthetic */ DisplayOxxoDetails copy$default(DisplayOxxoDetails displayOxxoDetails, int i, String str, String str2, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = displayOxxoDetails.expiresAfter;
                }
                if ((i2 & 2) != 0) {
                    str = displayOxxoDetails.number;
                }
                if ((i2 & 4) != 0) {
                    str2 = displayOxxoDetails.hostedVoucherUrl;
                }
                return displayOxxoDetails.copy(i, str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final int getExpiresAfter() {
                return this.expiresAfter;
            }

            /* renamed from: component2, reason: from getter */
            public final String getNumber() {
                return this.number;
            }

            /* renamed from: component3, reason: from getter */
            public final String getHostedVoucherUrl() {
                return this.hostedVoucherUrl;
            }

            public final DisplayOxxoDetails copy(int expiresAfter, String number, String hostedVoucherUrl) {
                return new DisplayOxxoDetails(expiresAfter, number, hostedVoucherUrl);
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
                if (!(other instanceof DisplayOxxoDetails)) {
                    return false;
                }
                DisplayOxxoDetails displayOxxoDetails = (DisplayOxxoDetails) other;
                return this.expiresAfter == displayOxxoDetails.expiresAfter && Intrinsics.areEqual(this.number, displayOxxoDetails.number) && Intrinsics.areEqual(this.hostedVoucherUrl, displayOxxoDetails.hostedVoucherUrl);
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                int iHashCode = Integer.hashCode(this.expiresAfter) * 31;
                String str = this.number;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.hostedVoucherUrl;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "DisplayOxxoDetails(expiresAfter=" + this.expiresAfter + ", number=" + this.number + ", hostedVoucherUrl=" + this.hostedVoucherUrl + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.expiresAfter);
                dest.writeString(this.number);
                dest.writeString(this.hostedVoucherUrl);
            }

            public /* synthetic */ DisplayOxxoDetails(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2);
            }

            public final int getExpiresAfter() {
                return this.expiresAfter;
            }

            public final String getNumber() {
                return this.number;
            }

            @Override // com.stripe.android.model.StripeIntent.NextActionData.DisplayVoucherDetails
            public String getHostedVoucherUrl() {
                return this.hostedVoucherUrl;
            }

            public DisplayOxxoDetails(int i, String str, String str2) {
                super(null);
                this.expiresAfter = i;
                this.number = str;
                this.hostedVoucherUrl = str2;
            }
        }

        /* compiled from: StripeIntent.kt */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayBoletoDetails;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayVoucherDetails;", "hostedVoucherUrl", "", "<init>", "(Ljava/lang/String;)V", "getHostedVoucherUrl", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DisplayBoletoDetails extends NextActionData implements DisplayVoucherDetails {
            private final String hostedVoucherUrl;
            public static final Parcelable.Creator<DisplayBoletoDetails> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: StripeIntent.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<DisplayBoletoDetails> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DisplayBoletoDetails createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DisplayBoletoDetails(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DisplayBoletoDetails[] newArray(int i) {
                    return new DisplayBoletoDetails[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public DisplayBoletoDetails() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ DisplayBoletoDetails copy$default(DisplayBoletoDetails displayBoletoDetails, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = displayBoletoDetails.hostedVoucherUrl;
                }
                return displayBoletoDetails.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getHostedVoucherUrl() {
                return this.hostedVoucherUrl;
            }

            public final DisplayBoletoDetails copy(String hostedVoucherUrl) {
                return new DisplayBoletoDetails(hostedVoucherUrl);
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
                return (other instanceof DisplayBoletoDetails) && Intrinsics.areEqual(this.hostedVoucherUrl, ((DisplayBoletoDetails) other).hostedVoucherUrl);
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                String str = this.hostedVoucherUrl;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "DisplayBoletoDetails(hostedVoucherUrl=" + this.hostedVoucherUrl + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.hostedVoucherUrl);
            }

            public /* synthetic */ DisplayBoletoDetails(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            @Override // com.stripe.android.model.StripeIntent.NextActionData.DisplayVoucherDetails
            public String getHostedVoucherUrl() {
                return this.hostedVoucherUrl;
            }

            public DisplayBoletoDetails(String str) {
                super(null);
                this.hostedVoucherUrl = str;
            }
        }

        /* compiled from: StripeIntent.kt */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayKonbiniDetails;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayVoucherDetails;", "hostedVoucherUrl", "", "<init>", "(Ljava/lang/String;)V", "getHostedVoucherUrl", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DisplayKonbiniDetails extends NextActionData implements DisplayVoucherDetails {
            private final String hostedVoucherUrl;
            public static final Parcelable.Creator<DisplayKonbiniDetails> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: StripeIntent.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<DisplayKonbiniDetails> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DisplayKonbiniDetails createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DisplayKonbiniDetails(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DisplayKonbiniDetails[] newArray(int i) {
                    return new DisplayKonbiniDetails[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public DisplayKonbiniDetails() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ DisplayKonbiniDetails copy$default(DisplayKonbiniDetails displayKonbiniDetails, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = displayKonbiniDetails.hostedVoucherUrl;
                }
                return displayKonbiniDetails.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getHostedVoucherUrl() {
                return this.hostedVoucherUrl;
            }

            public final DisplayKonbiniDetails copy(String hostedVoucherUrl) {
                return new DisplayKonbiniDetails(hostedVoucherUrl);
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
                return (other instanceof DisplayKonbiniDetails) && Intrinsics.areEqual(this.hostedVoucherUrl, ((DisplayKonbiniDetails) other).hostedVoucherUrl);
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                String str = this.hostedVoucherUrl;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "DisplayKonbiniDetails(hostedVoucherUrl=" + this.hostedVoucherUrl + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.hostedVoucherUrl);
            }

            public /* synthetic */ DisplayKonbiniDetails(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            @Override // com.stripe.android.model.StripeIntent.NextActionData.DisplayVoucherDetails
            public String getHostedVoucherUrl() {
                return this.hostedVoucherUrl;
            }

            public DisplayKonbiniDetails(String str) {
                super(null);
                this.hostedVoucherUrl = str;
            }
        }

        /* compiled from: StripeIntent.kt */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayMultibancoDetails;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayVoucherDetails;", "hostedVoucherUrl", "", "<init>", "(Ljava/lang/String;)V", "getHostedVoucherUrl", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DisplayMultibancoDetails extends NextActionData implements DisplayVoucherDetails {
            private final String hostedVoucherUrl;
            public static final Parcelable.Creator<DisplayMultibancoDetails> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: StripeIntent.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<DisplayMultibancoDetails> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DisplayMultibancoDetails createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DisplayMultibancoDetails(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DisplayMultibancoDetails[] newArray(int i) {
                    return new DisplayMultibancoDetails[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public DisplayMultibancoDetails() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ DisplayMultibancoDetails copy$default(DisplayMultibancoDetails displayMultibancoDetails, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = displayMultibancoDetails.hostedVoucherUrl;
                }
                return displayMultibancoDetails.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getHostedVoucherUrl() {
                return this.hostedVoucherUrl;
            }

            public final DisplayMultibancoDetails copy(String hostedVoucherUrl) {
                return new DisplayMultibancoDetails(hostedVoucherUrl);
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
                return (other instanceof DisplayMultibancoDetails) && Intrinsics.areEqual(this.hostedVoucherUrl, ((DisplayMultibancoDetails) other).hostedVoucherUrl);
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                String str = this.hostedVoucherUrl;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "DisplayMultibancoDetails(hostedVoucherUrl=" + this.hostedVoucherUrl + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.hostedVoucherUrl);
            }

            public /* synthetic */ DisplayMultibancoDetails(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            @Override // com.stripe.android.model.StripeIntent.NextActionData.DisplayVoucherDetails
            public String getHostedVoucherUrl() {
                return this.hostedVoucherUrl;
            }

            public DisplayMultibancoDetails(String str) {
                super(null);
                this.hostedVoucherUrl = str;
            }
        }

        /* compiled from: StripeIntent.kt */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$RedirectToUrl;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "url", "Landroid/net/Uri;", "returnUrl", "", "<init>", "(Landroid/net/Uri;Ljava/lang/String;)V", "getUrl", "()Landroid/net/Uri;", "getReturnUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class RedirectToUrl extends NextActionData {
            private final String returnUrl;
            private final Uri url;
            public static final Parcelable.Creator<RedirectToUrl> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: StripeIntent.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<RedirectToUrl> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RedirectToUrl createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new RedirectToUrl((Uri) parcel.readParcelable(RedirectToUrl.class.getClassLoader()), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RedirectToUrl[] newArray(int i) {
                    return new RedirectToUrl[i];
                }
            }

            public static /* synthetic */ RedirectToUrl copy$default(RedirectToUrl redirectToUrl, Uri uri, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    uri = redirectToUrl.url;
                }
                if ((i & 2) != 0) {
                    str = redirectToUrl.returnUrl;
                }
                return redirectToUrl.copy(uri, str);
            }

            /* renamed from: component1, reason: from getter */
            public final Uri getUrl() {
                return this.url;
            }

            /* renamed from: component2, reason: from getter */
            public final String getReturnUrl() {
                return this.returnUrl;
            }

            public final RedirectToUrl copy(Uri url, String returnUrl) {
                Intrinsics.checkNotNullParameter(url, "url");
                return new RedirectToUrl(url, returnUrl);
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
                if (!(other instanceof RedirectToUrl)) {
                    return false;
                }
                RedirectToUrl redirectToUrl = (RedirectToUrl) other;
                return Intrinsics.areEqual(this.url, redirectToUrl.url) && Intrinsics.areEqual(this.returnUrl, redirectToUrl.returnUrl);
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                int iHashCode = this.url.hashCode() * 31;
                String str = this.returnUrl;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "RedirectToUrl(url=" + this.url + ", returnUrl=" + this.returnUrl + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.url, flags);
                dest.writeString(this.returnUrl);
            }

            public final Uri getUrl() {
                return this.url;
            }

            public final String getReturnUrl() {
                return this.returnUrl;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RedirectToUrl(Uri url, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
                this.returnUrl = str;
            }
        }

        /* compiled from: StripeIntent.kt */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0001#B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tB%\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006$"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "data", "", "authCompleteUrl", "webViewUrl", "Landroid/net/Uri;", "returnUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "getAuthCompleteUrl", "getWebViewUrl", "()Landroid/net/Uri;", "getReturnUrl", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class AlipayRedirect extends NextActionData {
            private final String authCompleteUrl;
            private final String data;
            private final String returnUrl;
            private final Uri webViewUrl;
            private static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<AlipayRedirect> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: StripeIntent.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<AlipayRedirect> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AlipayRedirect createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AlipayRedirect(parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(AlipayRedirect.class.getClassLoader()), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AlipayRedirect[] newArray(int i) {
                    return new AlipayRedirect[i];
                }
            }

            public static /* synthetic */ AlipayRedirect copy$default(AlipayRedirect alipayRedirect, String str, String str2, Uri uri, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = alipayRedirect.data;
                }
                if ((i & 2) != 0) {
                    str2 = alipayRedirect.authCompleteUrl;
                }
                if ((i & 4) != 0) {
                    uri = alipayRedirect.webViewUrl;
                }
                if ((i & 8) != 0) {
                    str3 = alipayRedirect.returnUrl;
                }
                return alipayRedirect.copy(str, str2, uri, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final String getData() {
                return this.data;
            }

            /* renamed from: component2, reason: from getter */
            public final String getAuthCompleteUrl() {
                return this.authCompleteUrl;
            }

            /* renamed from: component3, reason: from getter */
            public final Uri getWebViewUrl() {
                return this.webViewUrl;
            }

            /* renamed from: component4, reason: from getter */
            public final String getReturnUrl() {
                return this.returnUrl;
            }

            public final AlipayRedirect copy(String data, String authCompleteUrl, Uri webViewUrl, String returnUrl) {
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(webViewUrl, "webViewUrl");
                return new AlipayRedirect(data, authCompleteUrl, webViewUrl, returnUrl);
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
                if (!(other instanceof AlipayRedirect)) {
                    return false;
                }
                AlipayRedirect alipayRedirect = (AlipayRedirect) other;
                return Intrinsics.areEqual(this.data, alipayRedirect.data) && Intrinsics.areEqual(this.authCompleteUrl, alipayRedirect.authCompleteUrl) && Intrinsics.areEqual(this.webViewUrl, alipayRedirect.webViewUrl) && Intrinsics.areEqual(this.returnUrl, alipayRedirect.returnUrl);
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                int iHashCode = this.data.hashCode() * 31;
                String str = this.authCompleteUrl;
                int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.webViewUrl.hashCode()) * 31;
                String str2 = this.returnUrl;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "AlipayRedirect(data=" + this.data + ", authCompleteUrl=" + this.authCompleteUrl + ", webViewUrl=" + this.webViewUrl + ", returnUrl=" + this.returnUrl + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.data);
                dest.writeString(this.authCompleteUrl);
                dest.writeParcelable(this.webViewUrl, flags);
                dest.writeString(this.returnUrl);
            }

            public /* synthetic */ AlipayRedirect(String str, String str2, Uri uri, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, uri, (i & 8) != 0 ? null : str3);
            }

            public final String getData() {
                return this.data;
            }

            public final String getAuthCompleteUrl() {
                return this.authCompleteUrl;
            }

            public final Uri getWebViewUrl() {
                return this.webViewUrl;
            }

            public final String getReturnUrl() {
                return this.returnUrl;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AlipayRedirect(String data, String str, Uri webViewUrl, String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(webViewUrl, "webViewUrl");
                this.data = data;
                this.authCompleteUrl = str;
                this.webViewUrl = webViewUrl;
                this.returnUrl = str2;
            }

            public /* synthetic */ AlipayRedirect(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i & 4) != 0 ? null : str3);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public AlipayRedirect(String data, String webViewUrl, String str) {
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(webViewUrl, "webViewUrl");
                String strExtractReturnUrl = Companion.extractReturnUrl(data);
                Uri uri = Uri.parse(webViewUrl);
                Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                this(data, strExtractReturnUrl, uri, str);
            }

            /* compiled from: StripeIntent.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect$Companion;", "", "<init>", "()V", "extractReturnUrl", "", "data", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            private static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final String extractReturnUrl(String data) {
                    Object objM9118constructorimpl;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        Companion companion2 = this;
                        String queryParameter = Uri.parse("alipay://url?" + data).getQueryParameter("return_url");
                        if (queryParameter == null || !StripeUrlUtils.INSTANCE.isStripeUrl$payments_core_release(queryParameter)) {
                            queryParameter = null;
                        }
                        objM9118constructorimpl = Result.m9118constructorimpl(queryParameter);
                    } catch (Throwable th) {
                        Result.Companion companion3 = Result.INSTANCE;
                        objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                    }
                    return (String) (Result.m9124isFailureimpl(objM9118constructorimpl) ? null : objM9118constructorimpl);
                }
            }
        }

        /* compiled from: StripeIntent.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "<init>", "()V", "Use3DS1", "Use3DS2", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS1;", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class SdkData extends NextActionData {
            public static final int $stable = 0;

            public /* synthetic */ SdkData(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private SdkData() {
                super(null);
            }

            /* compiled from: StripeIntent.kt */
            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS1;", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class Use3DS1 extends SdkData {
                private final String url;
                public static final Parcelable.Creator<Use3DS1> CREATOR = new Creator();
                public static final int $stable = 8;

                /* compiled from: StripeIntent.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Use3DS1> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Use3DS1 createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Use3DS1(parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Use3DS1[] newArray(int i) {
                        return new Use3DS1[i];
                    }
                }

                public static /* synthetic */ Use3DS1 copy$default(Use3DS1 use3DS1, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = use3DS1.url;
                    }
                    return use3DS1.copy(str);
                }

                /* renamed from: component1, reason: from getter */
                public final String getUrl() {
                    return this.url;
                }

                public final Use3DS1 copy(String url) {
                    Intrinsics.checkNotNullParameter(url, "url");
                    return new Use3DS1(url);
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
                    return (other instanceof Use3DS1) && Intrinsics.areEqual(this.url, ((Use3DS1) other).url);
                }

                @Override // com.stripe.android.core.model.StripeModel
                public int hashCode() {
                    return this.url.hashCode();
                }

                public String toString() {
                    return "Use3DS1(url=" + this.url + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.url);
                }

                public final String getUrl() {
                    return this.url;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Use3DS1(String url) {
                    super(null);
                    Intrinsics.checkNotNullParameter(url, "url");
                    this.url = url;
                }
            }

            /* compiled from: StripeIntent.kt */
            @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006)"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData;", "source", "", "serverName", "transactionId", "serverEncryption", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2$DirectoryServerEncryption;", "threeDS2IntentId", "publishableKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2$DirectoryServerEncryption;Ljava/lang/String;Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "getServerName", "getTransactionId", "getServerEncryption", "()Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2$DirectoryServerEncryption;", "getThreeDS2IntentId", "getPublishableKey", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "DirectoryServerEncryption", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class Use3DS2 extends SdkData {
                private final String publishableKey;
                private final DirectoryServerEncryption serverEncryption;
                private final String serverName;
                private final String source;
                private final String threeDS2IntentId;
                private final String transactionId;
                public static final Parcelable.Creator<Use3DS2> CREATOR = new Creator();
                public static final int $stable = 8;

                /* compiled from: StripeIntent.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Use3DS2> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Use3DS2 createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Use3DS2(parcel.readString(), parcel.readString(), parcel.readString(), DirectoryServerEncryption.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Use3DS2[] newArray(int i) {
                        return new Use3DS2[i];
                    }
                }

                public static /* synthetic */ Use3DS2 copy$default(Use3DS2 use3DS2, String str, String str2, String str3, DirectoryServerEncryption directoryServerEncryption, String str4, String str5, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = use3DS2.source;
                    }
                    if ((i & 2) != 0) {
                        str2 = use3DS2.serverName;
                    }
                    if ((i & 4) != 0) {
                        str3 = use3DS2.transactionId;
                    }
                    if ((i & 8) != 0) {
                        directoryServerEncryption = use3DS2.serverEncryption;
                    }
                    if ((i & 16) != 0) {
                        str4 = use3DS2.threeDS2IntentId;
                    }
                    if ((i & 32) != 0) {
                        str5 = use3DS2.publishableKey;
                    }
                    String str6 = str4;
                    String str7 = str5;
                    return use3DS2.copy(str, str2, str3, directoryServerEncryption, str6, str7);
                }

                /* renamed from: component1, reason: from getter */
                public final String getSource() {
                    return this.source;
                }

                /* renamed from: component2, reason: from getter */
                public final String getServerName() {
                    return this.serverName;
                }

                /* renamed from: component3, reason: from getter */
                public final String getTransactionId() {
                    return this.transactionId;
                }

                /* renamed from: component4, reason: from getter */
                public final DirectoryServerEncryption getServerEncryption() {
                    return this.serverEncryption;
                }

                /* renamed from: component5, reason: from getter */
                public final String getThreeDS2IntentId() {
                    return this.threeDS2IntentId;
                }

                /* renamed from: component6, reason: from getter */
                public final String getPublishableKey() {
                    return this.publishableKey;
                }

                public final Use3DS2 copy(String source, String serverName, String transactionId, DirectoryServerEncryption serverEncryption, String threeDS2IntentId, String publishableKey) {
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter(serverName, "serverName");
                    Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                    Intrinsics.checkNotNullParameter(serverEncryption, "serverEncryption");
                    return new Use3DS2(source, serverName, transactionId, serverEncryption, threeDS2IntentId, publishableKey);
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
                    if (!(other instanceof Use3DS2)) {
                        return false;
                    }
                    Use3DS2 use3DS2 = (Use3DS2) other;
                    return Intrinsics.areEqual(this.source, use3DS2.source) && Intrinsics.areEqual(this.serverName, use3DS2.serverName) && Intrinsics.areEqual(this.transactionId, use3DS2.transactionId) && Intrinsics.areEqual(this.serverEncryption, use3DS2.serverEncryption) && Intrinsics.areEqual(this.threeDS2IntentId, use3DS2.threeDS2IntentId) && Intrinsics.areEqual(this.publishableKey, use3DS2.publishableKey);
                }

                @Override // com.stripe.android.core.model.StripeModel
                public int hashCode() {
                    int iHashCode = ((((((this.source.hashCode() * 31) + this.serverName.hashCode()) * 31) + this.transactionId.hashCode()) * 31) + this.serverEncryption.hashCode()) * 31;
                    String str = this.threeDS2IntentId;
                    int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.publishableKey;
                    return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                public String toString() {
                    return "Use3DS2(source=" + this.source + ", serverName=" + this.serverName + ", transactionId=" + this.transactionId + ", serverEncryption=" + this.serverEncryption + ", threeDS2IntentId=" + this.threeDS2IntentId + ", publishableKey=" + this.publishableKey + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.source);
                    dest.writeString(this.serverName);
                    dest.writeString(this.transactionId);
                    this.serverEncryption.writeToParcel(dest, flags);
                    dest.writeString(this.threeDS2IntentId);
                    dest.writeString(this.publishableKey);
                }

                public final String getSource() {
                    return this.source;
                }

                public final String getServerName() {
                    return this.serverName;
                }

                public final String getTransactionId() {
                    return this.transactionId;
                }

                public final DirectoryServerEncryption getServerEncryption() {
                    return this.serverEncryption;
                }

                public final String getThreeDS2IntentId() {
                    return this.threeDS2IntentId;
                }

                public final String getPublishableKey() {
                    return this.publishableKey;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Use3DS2(String source, String serverName, String transactionId, DirectoryServerEncryption serverEncryption, String str, String str2) {
                    super(null);
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter(serverName, "serverName");
                    Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                    Intrinsics.checkNotNullParameter(serverEncryption, "serverEncryption");
                    this.source = source;
                    this.serverName = serverName;
                    this.transactionId = transactionId;
                    this.serverEncryption = serverEncryption;
                    this.threeDS2IntentId = str;
                    this.publishableKey = str2;
                }

                /* compiled from: StripeIntent.kt */
                @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\""}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2$DirectoryServerEncryption;", "Landroid/os/Parcelable;", "directoryServerId", "", "dsCertificateData", "rootCertsData", "", "keyId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getDirectoryServerId", "()Ljava/lang/String;", "getDsCertificateData", "getRootCertsData", "()Ljava/util/List;", "getKeyId", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final /* data */ class DirectoryServerEncryption implements Parcelable {
                    private final String directoryServerId;
                    private final String dsCertificateData;
                    private final String keyId;
                    private final List<String> rootCertsData;
                    public static final Parcelable.Creator<DirectoryServerEncryption> CREATOR = new Creator();
                    public static final int $stable = 8;

                    /* compiled from: StripeIntent.kt */
                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<DirectoryServerEncryption> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final DirectoryServerEncryption createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new DirectoryServerEncryption(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final DirectoryServerEncryption[] newArray(int i) {
                            return new DirectoryServerEncryption[i];
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public static /* synthetic */ DirectoryServerEncryption copy$default(DirectoryServerEncryption directoryServerEncryption, String str, String str2, List list, String str3, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = directoryServerEncryption.directoryServerId;
                        }
                        if ((i & 2) != 0) {
                            str2 = directoryServerEncryption.dsCertificateData;
                        }
                        if ((i & 4) != 0) {
                            list = directoryServerEncryption.rootCertsData;
                        }
                        if ((i & 8) != 0) {
                            str3 = directoryServerEncryption.keyId;
                        }
                        return directoryServerEncryption.copy(str, str2, list, str3);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final String getDirectoryServerId() {
                        return this.directoryServerId;
                    }

                    /* renamed from: component2, reason: from getter */
                    public final String getDsCertificateData() {
                        return this.dsCertificateData;
                    }

                    public final List<String> component3() {
                        return this.rootCertsData;
                    }

                    /* renamed from: component4, reason: from getter */
                    public final String getKeyId() {
                        return this.keyId;
                    }

                    public final DirectoryServerEncryption copy(String directoryServerId, String dsCertificateData, List<String> rootCertsData, String keyId) {
                        Intrinsics.checkNotNullParameter(directoryServerId, "directoryServerId");
                        Intrinsics.checkNotNullParameter(dsCertificateData, "dsCertificateData");
                        Intrinsics.checkNotNullParameter(rootCertsData, "rootCertsData");
                        return new DirectoryServerEncryption(directoryServerId, dsCertificateData, rootCertsData, keyId);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof DirectoryServerEncryption)) {
                            return false;
                        }
                        DirectoryServerEncryption directoryServerEncryption = (DirectoryServerEncryption) other;
                        return Intrinsics.areEqual(this.directoryServerId, directoryServerEncryption.directoryServerId) && Intrinsics.areEqual(this.dsCertificateData, directoryServerEncryption.dsCertificateData) && Intrinsics.areEqual(this.rootCertsData, directoryServerEncryption.rootCertsData) && Intrinsics.areEqual(this.keyId, directoryServerEncryption.keyId);
                    }

                    public int hashCode() {
                        int iHashCode = ((((this.directoryServerId.hashCode() * 31) + this.dsCertificateData.hashCode()) * 31) + this.rootCertsData.hashCode()) * 31;
                        String str = this.keyId;
                        return iHashCode + (str == null ? 0 : str.hashCode());
                    }

                    public String toString() {
                        return "DirectoryServerEncryption(directoryServerId=" + this.directoryServerId + ", dsCertificateData=" + this.dsCertificateData + ", rootCertsData=" + this.rootCertsData + ", keyId=" + this.keyId + ")";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int flags) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeString(this.directoryServerId);
                        dest.writeString(this.dsCertificateData);
                        dest.writeStringList(this.rootCertsData);
                        dest.writeString(this.keyId);
                    }

                    public DirectoryServerEncryption(String directoryServerId, String dsCertificateData, List<String> rootCertsData, String str) {
                        Intrinsics.checkNotNullParameter(directoryServerId, "directoryServerId");
                        Intrinsics.checkNotNullParameter(dsCertificateData, "dsCertificateData");
                        Intrinsics.checkNotNullParameter(rootCertsData, "rootCertsData");
                        this.directoryServerId = directoryServerId;
                        this.dsCertificateData = dsCertificateData;
                        this.rootCertsData = rootCertsData;
                        this.keyId = str;
                    }

                    public final String getDirectoryServerId() {
                        return this.directoryServerId;
                    }

                    public final String getDsCertificateData() {
                        return this.dsCertificateData;
                    }

                    public final List<String> getRootCertsData() {
                        return this.rootCertsData;
                    }

                    public final String getKeyId() {
                        return this.keyId;
                    }
                }
            }
        }

        /* compiled from: StripeIntent.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$BlikAuthorize;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BlikAuthorize extends NextActionData {
            public static final BlikAuthorize INSTANCE = new BlikAuthorize();
            public static final Parcelable.Creator<BlikAuthorize> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: StripeIntent.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<BlikAuthorize> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BlikAuthorize createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return BlikAuthorize.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BlikAuthorize[] newArray(int i) {
                    return new BlikAuthorize[i];
                }
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
                if (!(other instanceof BlikAuthorize)) {
                    return false;
                }
                return true;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                return 1031794127;
            }

            public String toString() {
                return "BlikAuthorize";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private BlikAuthorize() {
                super(null);
            }
        }

        /* compiled from: StripeIntent.kt */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$WeChatPayRedirect;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "weChat", "Lcom/stripe/android/model/WeChat;", "<init>", "(Lcom/stripe/android/model/WeChat;)V", "getWeChat", "()Lcom/stripe/android/model/WeChat;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class WeChatPayRedirect extends NextActionData {
            public static final int $stable = 0;
            public static final Parcelable.Creator<WeChatPayRedirect> CREATOR = new Creator();
            private final WeChat weChat;

            /* compiled from: StripeIntent.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<WeChatPayRedirect> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final WeChatPayRedirect createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new WeChatPayRedirect(WeChat.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final WeChatPayRedirect[] newArray(int i) {
                    return new WeChatPayRedirect[i];
                }
            }

            public static /* synthetic */ WeChatPayRedirect copy$default(WeChatPayRedirect weChatPayRedirect, WeChat weChat, int i, Object obj) {
                if ((i & 1) != 0) {
                    weChat = weChatPayRedirect.weChat;
                }
                return weChatPayRedirect.copy(weChat);
            }

            /* renamed from: component1, reason: from getter */
            public final WeChat getWeChat() {
                return this.weChat;
            }

            public final WeChatPayRedirect copy(WeChat weChat) {
                Intrinsics.checkNotNullParameter(weChat, "weChat");
                return new WeChatPayRedirect(weChat);
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
                return (other instanceof WeChatPayRedirect) && Intrinsics.areEqual(this.weChat, ((WeChatPayRedirect) other).weChat);
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                return this.weChat.hashCode();
            }

            public String toString() {
                return "WeChatPayRedirect(weChat=" + this.weChat + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.weChat.writeToParcel(dest, flags);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WeChatPayRedirect(WeChat weChat) {
                super(null);
                Intrinsics.checkNotNullParameter(weChat, "weChat");
                this.weChat = weChat;
            }

            public final WeChat getWeChat() {
                return this.weChat;
            }
        }

        /* compiled from: StripeIntent.kt */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "arrivalDate", "", "hostedVerificationUrl", "", "microdepositType", "Lcom/stripe/android/model/MicrodepositType;", "<init>", "(JLjava/lang/String;Lcom/stripe/android/model/MicrodepositType;)V", "getArrivalDate", "()J", "getHostedVerificationUrl", "()Ljava/lang/String;", "getMicrodepositType", "()Lcom/stripe/android/model/MicrodepositType;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class VerifyWithMicrodeposits extends NextActionData {
            private final long arrivalDate;
            private final String hostedVerificationUrl;
            private final MicrodepositType microdepositType;
            public static final Parcelable.Creator<VerifyWithMicrodeposits> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: StripeIntent.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<VerifyWithMicrodeposits> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final VerifyWithMicrodeposits createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new VerifyWithMicrodeposits(parcel.readLong(), parcel.readString(), MicrodepositType.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final VerifyWithMicrodeposits[] newArray(int i) {
                    return new VerifyWithMicrodeposits[i];
                }
            }

            public static /* synthetic */ VerifyWithMicrodeposits copy$default(VerifyWithMicrodeposits verifyWithMicrodeposits, long j, String str, MicrodepositType microdepositType, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = verifyWithMicrodeposits.arrivalDate;
                }
                if ((i & 2) != 0) {
                    str = verifyWithMicrodeposits.hostedVerificationUrl;
                }
                if ((i & 4) != 0) {
                    microdepositType = verifyWithMicrodeposits.microdepositType;
                }
                return verifyWithMicrodeposits.copy(j, str, microdepositType);
            }

            /* renamed from: component1, reason: from getter */
            public final long getArrivalDate() {
                return this.arrivalDate;
            }

            /* renamed from: component2, reason: from getter */
            public final String getHostedVerificationUrl() {
                return this.hostedVerificationUrl;
            }

            /* renamed from: component3, reason: from getter */
            public final MicrodepositType getMicrodepositType() {
                return this.microdepositType;
            }

            public final VerifyWithMicrodeposits copy(long arrivalDate, String hostedVerificationUrl, MicrodepositType microdepositType) {
                Intrinsics.checkNotNullParameter(hostedVerificationUrl, "hostedVerificationUrl");
                Intrinsics.checkNotNullParameter(microdepositType, "microdepositType");
                return new VerifyWithMicrodeposits(arrivalDate, hostedVerificationUrl, microdepositType);
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
                if (!(other instanceof VerifyWithMicrodeposits)) {
                    return false;
                }
                VerifyWithMicrodeposits verifyWithMicrodeposits = (VerifyWithMicrodeposits) other;
                return this.arrivalDate == verifyWithMicrodeposits.arrivalDate && Intrinsics.areEqual(this.hostedVerificationUrl, verifyWithMicrodeposits.hostedVerificationUrl) && this.microdepositType == verifyWithMicrodeposits.microdepositType;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                return (((Long.hashCode(this.arrivalDate) * 31) + this.hostedVerificationUrl.hashCode()) * 31) + this.microdepositType.hashCode();
            }

            public String toString() {
                return "VerifyWithMicrodeposits(arrivalDate=" + this.arrivalDate + ", hostedVerificationUrl=" + this.hostedVerificationUrl + ", microdepositType=" + this.microdepositType + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeLong(this.arrivalDate);
                dest.writeString(this.hostedVerificationUrl);
                dest.writeString(this.microdepositType.name());
            }

            public final long getArrivalDate() {
                return this.arrivalDate;
            }

            public final String getHostedVerificationUrl() {
                return this.hostedVerificationUrl;
            }

            public final MicrodepositType getMicrodepositType() {
                return this.microdepositType;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VerifyWithMicrodeposits(long j, String hostedVerificationUrl, MicrodepositType microdepositType) {
                super(null);
                Intrinsics.checkNotNullParameter(hostedVerificationUrl, "hostedVerificationUrl");
                Intrinsics.checkNotNullParameter(microdepositType, "microdepositType");
                this.arrivalDate = j;
                this.hostedVerificationUrl = hostedVerificationUrl;
                this.microdepositType = microdepositType;
            }
        }

        /* compiled from: StripeIntent.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$UpiAwaitNotification;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class UpiAwaitNotification extends NextActionData {
            public static final UpiAwaitNotification INSTANCE = new UpiAwaitNotification();
            public static final Parcelable.Creator<UpiAwaitNotification> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: StripeIntent.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<UpiAwaitNotification> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UpiAwaitNotification createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return UpiAwaitNotification.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UpiAwaitNotification[] newArray(int i) {
                    return new UpiAwaitNotification[i];
                }
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
                if (!(other instanceof UpiAwaitNotification)) {
                    return false;
                }
                return true;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                return -1021414879;
            }

            public String toString() {
                return "UpiAwaitNotification";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private UpiAwaitNotification() {
                super(null);
            }
        }

        /* compiled from: StripeIntent.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$CashAppRedirect;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "mobileAuthUrl", "", "<init>", "(Ljava/lang/String;)V", "getMobileAuthUrl", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CashAppRedirect extends NextActionData {
            private final String mobileAuthUrl;
            public static final Parcelable.Creator<CashAppRedirect> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: StripeIntent.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<CashAppRedirect> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CashAppRedirect createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CashAppRedirect(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CashAppRedirect[] newArray(int i) {
                    return new CashAppRedirect[i];
                }
            }

            public static /* synthetic */ CashAppRedirect copy$default(CashAppRedirect cashAppRedirect, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = cashAppRedirect.mobileAuthUrl;
                }
                return cashAppRedirect.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMobileAuthUrl() {
                return this.mobileAuthUrl;
            }

            public final CashAppRedirect copy(String mobileAuthUrl) {
                Intrinsics.checkNotNullParameter(mobileAuthUrl, "mobileAuthUrl");
                return new CashAppRedirect(mobileAuthUrl);
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
                return (other instanceof CashAppRedirect) && Intrinsics.areEqual(this.mobileAuthUrl, ((CashAppRedirect) other).mobileAuthUrl);
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                return this.mobileAuthUrl.hashCode();
            }

            public String toString() {
                return "CashAppRedirect(mobileAuthUrl=" + this.mobileAuthUrl + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.mobileAuthUrl);
            }

            public final String getMobileAuthUrl() {
                return this.mobileAuthUrl;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CashAppRedirect(String mobileAuthUrl) {
                super(null);
                Intrinsics.checkNotNullParameter(mobileAuthUrl, "mobileAuthUrl");
                this.mobileAuthUrl = mobileAuthUrl;
            }
        }

        /* compiled from: StripeIntent.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$SwishRedirect;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "mobileAuthUrl", "", "<init>", "(Ljava/lang/String;)V", "getMobileAuthUrl", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class SwishRedirect extends NextActionData {
            private final String mobileAuthUrl;
            public static final Parcelable.Creator<SwishRedirect> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: StripeIntent.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SwishRedirect> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SwishRedirect createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SwishRedirect(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SwishRedirect[] newArray(int i) {
                    return new SwishRedirect[i];
                }
            }

            public static /* synthetic */ SwishRedirect copy$default(SwishRedirect swishRedirect, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = swishRedirect.mobileAuthUrl;
                }
                return swishRedirect.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMobileAuthUrl() {
                return this.mobileAuthUrl;
            }

            public final SwishRedirect copy(String mobileAuthUrl) {
                Intrinsics.checkNotNullParameter(mobileAuthUrl, "mobileAuthUrl");
                return new SwishRedirect(mobileAuthUrl);
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
                return (other instanceof SwishRedirect) && Intrinsics.areEqual(this.mobileAuthUrl, ((SwishRedirect) other).mobileAuthUrl);
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                return this.mobileAuthUrl.hashCode();
            }

            public String toString() {
                return "SwishRedirect(mobileAuthUrl=" + this.mobileAuthUrl + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.mobileAuthUrl);
            }

            public final String getMobileAuthUrl() {
                return this.mobileAuthUrl;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SwishRedirect(String mobileAuthUrl) {
                super(null);
                Intrinsics.checkNotNullParameter(mobileAuthUrl, "mobileAuthUrl");
                this.mobileAuthUrl = mobileAuthUrl;
            }
        }
    }
}
