package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.model.MandateDataParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodOptionsParams;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* compiled from: ConfirmPaymentIntentParams.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 o2\u00020\u0001:\u0003mnoBÉ\u0001\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010C\u001a\u00020\fJ\b\u0010D\u001a\u00020\fH\u0016J\u0010\u0010E\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\fH\u0016J\u0014\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020H0GH\u0016J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010R\u001a\u00020\u0005HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010T\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010)J\t\u0010U\u001a\u00020\fHÂ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0012\u0010\\\u001a\u0004\u0018\u00010\fHÀ\u0003¢\u0006\u0004\b]\u0010)J\u0016\u0010^\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u001aHÀ\u0003¢\u0006\u0002\b_JÐ\u0001\u0010`\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u001aHÆ\u0001¢\u0006\u0002\u0010aJ\u0006\u0010b\u001a\u00020cJ\u0013\u0010d\u001a\u00020\f2\b\u0010e\u001a\u0004\u0018\u00010HHÖ\u0003J\t\u0010f\u001a\u00020cHÖ\u0001J\t\u0010g\u001a\u00020\u0005HÖ\u0001J\u0016\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020cR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0014\u0010\t\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010 \"\u0004\b&\u0010'R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010 \"\u0004\b2\u0010'R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010 \"\u0004\b@\u0010'R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\fX\u0080\u0004¢\u0006\n\n\u0002\u0010,\u001a\u0004\bA\u0010)R\u001c\u0010\u0019\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u001aX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010 R \u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020H0G8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\"\u0010L\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020H\u0018\u00010G8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010K¨\u0006p"}, d2 = {"Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "paymentMethodId", "", "sourceParams", "Lcom/stripe/android/model/SourceParams;", "sourceId", "clientSecret", "returnUrl", "savePaymentMethod", "", "useStripeSdk", "paymentMethodOptions", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "mandateId", "mandateData", "Lcom/stripe/android/model/MandateDataParams;", "setupFutureUsage", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", ConfirmPaymentIntentParams.PARAM_SHIPPING, "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;", "receiptEmail", "setAsDefaultPaymentMethod", "paymentMethodCode", "Lcom/stripe/android/model/PaymentMethodCode;", "<init>", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLcom/stripe/android/model/PaymentMethodOptionsParams;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "getPaymentMethodId", "()Ljava/lang/String;", "getSourceParams", "()Lcom/stripe/android/model/SourceParams;", "getSourceId", "getClientSecret", "getReturnUrl", "setReturnUrl", "(Ljava/lang/String;)V", "getSavePaymentMethod", "()Ljava/lang/Boolean;", "setSavePaymentMethod", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getPaymentMethodOptions", "()Lcom/stripe/android/model/PaymentMethodOptionsParams;", "setPaymentMethodOptions", "(Lcom/stripe/android/model/PaymentMethodOptionsParams;)V", "getMandateId", "setMandateId", "getMandateData", "()Lcom/stripe/android/model/MandateDataParams;", "setMandateData", "(Lcom/stripe/android/model/MandateDataParams;)V", "getSetupFutureUsage", "()Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", "setSetupFutureUsage", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;)V", "getShipping", "()Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;", "setShipping", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)V", "getReceiptEmail", "setReceiptEmail", "getSetAsDefaultPaymentMethod$payments_core_release", "getPaymentMethodCode$payments_core_release", "shouldSavePaymentMethod", "shouldUseStripeSdk", "withShouldUseStripeSdk", "toParamMap", "", "", "paymentMethodParamMap", "getPaymentMethodParamMap", "()Ljava/util/Map;", "mandateDataParams", "getMandateDataParams", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component15$payments_core_release", "component16", "component16$payments_core_release", "copy", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLcom/stripe/android/model/PaymentMethodOptionsParams;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "describeContents", "", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "SetupFutureUsage", "Shipping", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ConfirmPaymentIntentParams implements ConfirmStripeIntentParams {
    private static final String PARAM_PAYMENT_METHOD_OPTIONS = "payment_method_options";
    private static final String PARAM_RECEIPT_EMAIL = "receipt_email";
    private static final String PARAM_SAVE_PAYMENT_METHOD = "save_payment_method";
    private static final String PARAM_SETUP_FUTURE_USAGE = "setup_future_usage";
    private static final String PARAM_SHIPPING = "shipping";
    public static final String PARAM_SOURCE_DATA = "source_data";
    private static final String PARAM_SOURCE_ID = "source";
    private final String clientSecret;
    private MandateDataParams mandateData;
    private String mandateId;
    private final String paymentMethodCode;
    private final PaymentMethodCreateParams paymentMethodCreateParams;
    private final String paymentMethodId;
    private PaymentMethodOptionsParams paymentMethodOptions;
    private String receiptEmail;
    private String returnUrl;
    private Boolean savePaymentMethod;
    private final Boolean setAsDefaultPaymentMethod;
    private SetupFutureUsage setupFutureUsage;
    private Shipping shipping;
    private final String sourceId;
    private final SourceParams sourceParams;
    private final boolean useStripeSdk;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ConfirmPaymentIntentParams> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: ConfirmPaymentIntentParams.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ConfirmPaymentIntentParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfirmPaymentIntentParams createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            boolean z;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            PaymentMethodCreateParams paymentMethodCreateParamsCreateFromParcel = parcel.readInt() == 0 ? null : PaymentMethodCreateParams.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            SourceParams sourceParamsCreateFromParcel = parcel.readInt() == 0 ? null : SourceParams.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z2 = true;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            PaymentMethodOptionsParams paymentMethodOptionsParams = (PaymentMethodOptionsParams) parcel.readParcelable(ConfirmPaymentIntentParams.class.getClassLoader());
            boolean z3 = z;
            String string5 = parcel.readString();
            MandateDataParams mandateDataParamsCreateFromParcel = parcel.readInt() == 0 ? null : MandateDataParams.CREATOR.createFromParcel(parcel);
            SetupFutureUsage setupFutureUsageValueOf = parcel.readInt() == 0 ? null : SetupFutureUsage.valueOf(parcel.readString());
            Shipping shippingCreateFromParcel = parcel.readInt() == 0 ? null : Shipping.CREATOR.createFromParcel(parcel);
            boolean z4 = z3;
            SetupFutureUsage setupFutureUsage = setupFutureUsageValueOf;
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z4 = false;
                }
                boolValueOf2 = Boolean.valueOf(z4);
            }
            return new ConfirmPaymentIntentParams(paymentMethodCreateParamsCreateFromParcel, string, sourceParamsCreateFromParcel, string2, string3, string4, boolValueOf, z2, paymentMethodOptionsParams, string5, mandateDataParamsCreateFromParcel, setupFutureUsage, shippingCreateFromParcel, string6, boolValueOf2, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfirmPaymentIntentParams[] newArray(int i) {
            return new ConfirmPaymentIntentParams[i];
        }
    }

    /* renamed from: component8, reason: from getter */
    private final boolean getUseStripeSdk() {
        return this.useStripeSdk;
    }

    public static /* synthetic */ ConfirmPaymentIntentParams copy$default(ConfirmPaymentIntentParams confirmPaymentIntentParams, PaymentMethodCreateParams paymentMethodCreateParams, String str, SourceParams sourceParams, String str2, String str3, String str4, Boolean bool, boolean z, PaymentMethodOptionsParams paymentMethodOptionsParams, String str5, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping, String str6, Boolean bool2, String str7, int i, Object obj) {
        PaymentMethodCreateParams paymentMethodCreateParams2 = (i & 1) != 0 ? confirmPaymentIntentParams.paymentMethodCreateParams : paymentMethodCreateParams;
        return confirmPaymentIntentParams.copy(paymentMethodCreateParams2, (i & 2) != 0 ? confirmPaymentIntentParams.paymentMethodId : str, (i & 4) != 0 ? confirmPaymentIntentParams.sourceParams : sourceParams, (i & 8) != 0 ? confirmPaymentIntentParams.sourceId : str2, (i & 16) != 0 ? confirmPaymentIntentParams.clientSecret : str3, (i & 32) != 0 ? confirmPaymentIntentParams.returnUrl : str4, (i & 64) != 0 ? confirmPaymentIntentParams.savePaymentMethod : bool, (i & 128) != 0 ? confirmPaymentIntentParams.useStripeSdk : z, (i & 256) != 0 ? confirmPaymentIntentParams.paymentMethodOptions : paymentMethodOptionsParams, (i & 512) != 0 ? confirmPaymentIntentParams.mandateId : str5, (i & 1024) != 0 ? confirmPaymentIntentParams.mandateData : mandateDataParams, (i & 2048) != 0 ? confirmPaymentIntentParams.setupFutureUsage : setupFutureUsage, (i & 4096) != 0 ? confirmPaymentIntentParams.shipping : shipping, (i & 8192) != 0 ? confirmPaymentIntentParams.receiptEmail : str6, (i & 16384) != 0 ? confirmPaymentIntentParams.setAsDefaultPaymentMethod : bool2, (i & 32768) != 0 ? confirmPaymentIntentParams.paymentMethodCode : str7);
    }

    @JvmStatic
    public static final ConfirmPaymentIntentParams create(String str) {
        return INSTANCE.create(str);
    }

    @JvmStatic
    public static final ConfirmPaymentIntentParams create(String str, Shipping shipping) {
        return INSTANCE.create(str, shipping);
    }

    @JvmStatic
    public static final ConfirmPaymentIntentParams create(String str, Shipping shipping, SetupFutureUsage setupFutureUsage) {
        return INSTANCE.create(str, shipping, setupFutureUsage);
    }

    @JvmStatic
    public static final ConfirmPaymentIntentParams create(String str, PaymentMethod.Type type) {
        return INSTANCE.create(str, type);
    }

    @JvmStatic
    public static final ConfirmPaymentIntentParams createAlipay(String str) {
        return INSTANCE.createAlipay(str);
    }

    @JvmStatic
    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str) {
        return INSTANCE.createWithPaymentMethodCreateParams(paymentMethodCreateParams, str);
    }

    @JvmStatic
    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, Boolean bool) {
        return INSTANCE.createWithPaymentMethodCreateParams(paymentMethodCreateParams, str, bool);
    }

    @JvmStatic
    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, Boolean bool, String str2) {
        return INSTANCE.createWithPaymentMethodCreateParams(paymentMethodCreateParams, str, bool, str2);
    }

    @JvmStatic
    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, Boolean bool, String str2, MandateDataParams mandateDataParams) {
        return INSTANCE.createWithPaymentMethodCreateParams(paymentMethodCreateParams, str, bool, str2, mandateDataParams);
    }

    @JvmStatic
    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, Boolean bool, String str2, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage) {
        return INSTANCE.createWithPaymentMethodCreateParams(paymentMethodCreateParams, str, bool, str2, mandateDataParams, setupFutureUsage);
    }

    @JvmStatic
    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, Boolean bool, String str2, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping) {
        return INSTANCE.createWithPaymentMethodCreateParams(paymentMethodCreateParams, str, bool, str2, mandateDataParams, setupFutureUsage, shipping);
    }

    @JvmStatic
    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, Boolean bool, String str2, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping, PaymentMethodOptionsParams paymentMethodOptionsParams) {
        return INSTANCE.createWithPaymentMethodCreateParams(paymentMethodCreateParams, str, bool, str2, mandateDataParams, setupFutureUsage, shipping, paymentMethodOptionsParams);
    }

    @JvmStatic
    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2) {
        return INSTANCE.createWithPaymentMethodId(str, str2);
    }

    @JvmStatic
    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, Boolean bool) {
        return INSTANCE.createWithPaymentMethodId(str, str2, bool);
    }

    @JvmStatic
    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams) {
        return INSTANCE.createWithPaymentMethodId(str, str2, bool, paymentMethodOptionsParams);
    }

    @JvmStatic
    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str3) {
        return INSTANCE.createWithPaymentMethodId(str, str2, bool, paymentMethodOptionsParams, str3);
    }

    @JvmStatic
    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str3, MandateDataParams mandateDataParams) {
        return INSTANCE.createWithPaymentMethodId(str, str2, bool, paymentMethodOptionsParams, str3, mandateDataParams);
    }

    @JvmStatic
    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str3, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage) {
        return INSTANCE.createWithPaymentMethodId(str, str2, bool, paymentMethodOptionsParams, str3, mandateDataParams, setupFutureUsage);
    }

    @JvmStatic
    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str3, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping) {
        return INSTANCE.createWithPaymentMethodId(str, str2, bool, paymentMethodOptionsParams, str3, mandateDataParams, setupFutureUsage, shipping);
    }

    @JvmStatic
    public static final ConfirmPaymentIntentParams createWithSourceId(String str, String str2, String str3) {
        return INSTANCE.createWithSourceId(str, str2, str3);
    }

    @JvmStatic
    public static final ConfirmPaymentIntentParams createWithSourceId(String str, String str2, String str3, Boolean bool) {
        return INSTANCE.createWithSourceId(str, str2, str3, bool);
    }

    @JvmStatic
    public static final ConfirmPaymentIntentParams createWithSourceId(String str, String str2, String str3, Boolean bool, Shipping shipping) {
        return INSTANCE.createWithSourceId(str, str2, str3, bool, shipping);
    }

    @JvmStatic
    public static final ConfirmPaymentIntentParams createWithSourceParams(SourceParams sourceParams, String str, String str2) {
        return INSTANCE.createWithSourceParams(sourceParams, str, str2);
    }

    @JvmStatic
    public static final ConfirmPaymentIntentParams createWithSourceParams(SourceParams sourceParams, String str, String str2, Boolean bool) {
        return INSTANCE.createWithSourceParams(sourceParams, str, str2, bool);
    }

    @JvmStatic
    public static final ConfirmPaymentIntentParams createWithSourceParams(SourceParams sourceParams, String str, String str2, Boolean bool, Shipping shipping) {
        return INSTANCE.createWithSourceParams(sourceParams, str, str2, bool, shipping);
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentMethodCreateParams getPaymentMethodCreateParams() {
        return this.paymentMethodCreateParams;
    }

    /* renamed from: component10, reason: from getter */
    public final String getMandateId() {
        return this.mandateId;
    }

    /* renamed from: component11, reason: from getter */
    public final MandateDataParams getMandateData() {
        return this.mandateData;
    }

    /* renamed from: component12, reason: from getter */
    public final SetupFutureUsage getSetupFutureUsage() {
        return this.setupFutureUsage;
    }

    /* renamed from: component13, reason: from getter */
    public final Shipping getShipping() {
        return this.shipping;
    }

    /* renamed from: component14, reason: from getter */
    public final String getReceiptEmail() {
        return this.receiptEmail;
    }

    /* renamed from: component15$payments_core_release, reason: from getter */
    public final Boolean getSetAsDefaultPaymentMethod() {
        return this.setAsDefaultPaymentMethod;
    }

    /* renamed from: component16$payments_core_release, reason: from getter */
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    /* renamed from: component3, reason: from getter */
    public final SourceParams getSourceParams() {
        return this.sourceParams;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getClientSecret() {
        return this.clientSecret;
    }

    /* renamed from: component6, reason: from getter */
    public final String getReturnUrl() {
        return this.returnUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getSavePaymentMethod() {
        return this.savePaymentMethod;
    }

    /* renamed from: component9, reason: from getter */
    public final PaymentMethodOptionsParams getPaymentMethodOptions() {
        return this.paymentMethodOptions;
    }

    public final ConfirmPaymentIntentParams copy(PaymentMethodCreateParams paymentMethodCreateParams, String paymentMethodId, SourceParams sourceParams, String sourceId, String clientSecret, String returnUrl, Boolean savePaymentMethod, boolean useStripeSdk, PaymentMethodOptionsParams paymentMethodOptions, String mandateId, MandateDataParams mandateData, SetupFutureUsage setupFutureUsage, Shipping shipping, String receiptEmail, Boolean setAsDefaultPaymentMethod, String paymentMethodCode) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        return new ConfirmPaymentIntentParams(paymentMethodCreateParams, paymentMethodId, sourceParams, sourceId, clientSecret, returnUrl, savePaymentMethod, useStripeSdk, paymentMethodOptions, mandateId, mandateData, setupFutureUsage, shipping, receiptEmail, setAsDefaultPaymentMethod, paymentMethodCode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmPaymentIntentParams)) {
            return false;
        }
        ConfirmPaymentIntentParams confirmPaymentIntentParams = (ConfirmPaymentIntentParams) other;
        return Intrinsics.areEqual(this.paymentMethodCreateParams, confirmPaymentIntentParams.paymentMethodCreateParams) && Intrinsics.areEqual(this.paymentMethodId, confirmPaymentIntentParams.paymentMethodId) && Intrinsics.areEqual(this.sourceParams, confirmPaymentIntentParams.sourceParams) && Intrinsics.areEqual(this.sourceId, confirmPaymentIntentParams.sourceId) && Intrinsics.areEqual(this.clientSecret, confirmPaymentIntentParams.clientSecret) && Intrinsics.areEqual(this.returnUrl, confirmPaymentIntentParams.returnUrl) && Intrinsics.areEqual(this.savePaymentMethod, confirmPaymentIntentParams.savePaymentMethod) && this.useStripeSdk == confirmPaymentIntentParams.useStripeSdk && Intrinsics.areEqual(this.paymentMethodOptions, confirmPaymentIntentParams.paymentMethodOptions) && Intrinsics.areEqual(this.mandateId, confirmPaymentIntentParams.mandateId) && Intrinsics.areEqual(this.mandateData, confirmPaymentIntentParams.mandateData) && this.setupFutureUsage == confirmPaymentIntentParams.setupFutureUsage && Intrinsics.areEqual(this.shipping, confirmPaymentIntentParams.shipping) && Intrinsics.areEqual(this.receiptEmail, confirmPaymentIntentParams.receiptEmail) && Intrinsics.areEqual(this.setAsDefaultPaymentMethod, confirmPaymentIntentParams.setAsDefaultPaymentMethod) && Intrinsics.areEqual(this.paymentMethodCode, confirmPaymentIntentParams.paymentMethodCode);
    }

    public int hashCode() {
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        int iHashCode = (paymentMethodCreateParams == null ? 0 : paymentMethodCreateParams.hashCode()) * 31;
        String str = this.paymentMethodId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        SourceParams sourceParams = this.sourceParams;
        int iHashCode3 = (iHashCode2 + (sourceParams == null ? 0 : sourceParams.hashCode())) * 31;
        String str2 = this.sourceId;
        int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.clientSecret.hashCode()) * 31;
        String str3 = this.returnUrl;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.savePaymentMethod;
        int iHashCode6 = (((iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.useStripeSdk)) * 31;
        PaymentMethodOptionsParams paymentMethodOptionsParams = this.paymentMethodOptions;
        int iHashCode7 = (iHashCode6 + (paymentMethodOptionsParams == null ? 0 : paymentMethodOptionsParams.hashCode())) * 31;
        String str4 = this.mandateId;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        MandateDataParams mandateDataParams = this.mandateData;
        int iHashCode9 = (iHashCode8 + (mandateDataParams == null ? 0 : mandateDataParams.hashCode())) * 31;
        SetupFutureUsage setupFutureUsage = this.setupFutureUsage;
        int iHashCode10 = (iHashCode9 + (setupFutureUsage == null ? 0 : setupFutureUsage.hashCode())) * 31;
        Shipping shipping = this.shipping;
        int iHashCode11 = (iHashCode10 + (shipping == null ? 0 : shipping.hashCode())) * 31;
        String str5 = this.receiptEmail;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.setAsDefaultPaymentMethod;
        int iHashCode13 = (iHashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str6 = this.paymentMethodCode;
        return iHashCode13 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "ConfirmPaymentIntentParams(paymentMethodCreateParams=" + this.paymentMethodCreateParams + ", paymentMethodId=" + this.paymentMethodId + ", sourceParams=" + this.sourceParams + ", sourceId=" + this.sourceId + ", clientSecret=" + this.clientSecret + ", returnUrl=" + this.returnUrl + ", savePaymentMethod=" + this.savePaymentMethod + ", useStripeSdk=" + this.useStripeSdk + ", paymentMethodOptions=" + this.paymentMethodOptions + ", mandateId=" + this.mandateId + ", mandateData=" + this.mandateData + ", setupFutureUsage=" + this.setupFutureUsage + ", shipping=" + this.shipping + ", receiptEmail=" + this.receiptEmail + ", setAsDefaultPaymentMethod=" + this.setAsDefaultPaymentMethod + ", paymentMethodCode=" + this.paymentMethodCode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) throws JSONException {
        Intrinsics.checkNotNullParameter(dest, "dest");
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        if (paymentMethodCreateParams == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            paymentMethodCreateParams.writeToParcel(dest, flags);
        }
        dest.writeString(this.paymentMethodId);
        SourceParams sourceParams = this.sourceParams;
        if (sourceParams == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            sourceParams.writeToParcel(dest, flags);
        }
        dest.writeString(this.sourceId);
        dest.writeString(this.clientSecret);
        dest.writeString(this.returnUrl);
        Boolean bool = this.savePaymentMethod;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeInt(this.useStripeSdk ? 1 : 0);
        dest.writeParcelable(this.paymentMethodOptions, flags);
        dest.writeString(this.mandateId);
        MandateDataParams mandateDataParams = this.mandateData;
        if (mandateDataParams == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            mandateDataParams.writeToParcel(dest, flags);
        }
        SetupFutureUsage setupFutureUsage = this.setupFutureUsage;
        if (setupFutureUsage == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(setupFutureUsage.name());
        }
        Shipping shipping = this.shipping;
        if (shipping == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            shipping.writeToParcel(dest, flags);
        }
        dest.writeString(this.receiptEmail);
        Boolean bool2 = this.setAsDefaultPaymentMethod;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.paymentMethodCode);
    }

    public ConfirmPaymentIntentParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, SourceParams sourceParams, String str2, String clientSecret, String str3, Boolean bool, boolean z, PaymentMethodOptionsParams paymentMethodOptionsParams, String str4, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping, String str5, Boolean bool2, String str6) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        this.paymentMethodCreateParams = paymentMethodCreateParams;
        this.paymentMethodId = str;
        this.sourceParams = sourceParams;
        this.sourceId = str2;
        this.clientSecret = clientSecret;
        this.returnUrl = str3;
        this.savePaymentMethod = bool;
        this.useStripeSdk = z;
        this.paymentMethodOptions = paymentMethodOptionsParams;
        this.mandateId = str4;
        this.mandateData = mandateDataParams;
        this.setupFutureUsage = setupFutureUsage;
        this.shipping = shipping;
        this.receiptEmail = str5;
        this.setAsDefaultPaymentMethod = bool2;
        this.paymentMethodCode = str6;
    }

    public final PaymentMethodCreateParams getPaymentMethodCreateParams() {
        return this.paymentMethodCreateParams;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final SourceParams getSourceParams() {
        return this.sourceParams;
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public String getClientSecret() {
        return this.clientSecret;
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public String getReturnUrl() {
        return this.returnUrl;
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public void setReturnUrl(String str) {
        this.returnUrl = str;
    }

    public final Boolean getSavePaymentMethod() {
        return this.savePaymentMethod;
    }

    public final void setSavePaymentMethod(Boolean bool) {
        this.savePaymentMethod = bool;
    }

    public final PaymentMethodOptionsParams getPaymentMethodOptions() {
        return this.paymentMethodOptions;
    }

    public final void setPaymentMethodOptions(PaymentMethodOptionsParams paymentMethodOptionsParams) {
        this.paymentMethodOptions = paymentMethodOptionsParams;
    }

    public final String getMandateId() {
        return this.mandateId;
    }

    public final void setMandateId(String str) {
        this.mandateId = str;
    }

    public final MandateDataParams getMandateData() {
        return this.mandateData;
    }

    public final void setMandateData(MandateDataParams mandateDataParams) {
        this.mandateData = mandateDataParams;
    }

    public final SetupFutureUsage getSetupFutureUsage() {
        return this.setupFutureUsage;
    }

    public final void setSetupFutureUsage(SetupFutureUsage setupFutureUsage) {
        this.setupFutureUsage = setupFutureUsage;
    }

    public final Shipping getShipping() {
        return this.shipping;
    }

    public final void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public final String getReceiptEmail() {
        return this.receiptEmail;
    }

    public final void setReceiptEmail(String str) {
        this.receiptEmail = str;
    }

    public final Boolean getSetAsDefaultPaymentMethod$payments_core_release() {
        return this.setAsDefaultPaymentMethod;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ConfirmPaymentIntentParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, SourceParams sourceParams, String str2, String str3, String str4, Boolean bool, boolean z, PaymentMethodOptionsParams paymentMethodOptionsParams, String str5, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping, String str6, Boolean bool2, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String code$payments_core_release;
        PaymentMethodCreateParams paymentMethodCreateParams2 = (i & 1) != 0 ? null : paymentMethodCreateParams;
        String str8 = (i & 2) != 0 ? null : str;
        SourceParams sourceParams2 = (i & 4) != 0 ? null : sourceParams;
        String str9 = (i & 8) != 0 ? null : str2;
        String str10 = (i & 32) != 0 ? null : str4;
        Boolean bool3 = (i & 64) != 0 ? null : bool;
        boolean z2 = (i & 128) != 0 ? false : z;
        PaymentMethodOptionsParams paymentMethodOptionsParams2 = (i & 256) != 0 ? null : paymentMethodOptionsParams;
        String str11 = (i & 512) != 0 ? null : str5;
        MandateDataParams mandateDataParams2 = (i & 1024) != 0 ? null : mandateDataParams;
        SetupFutureUsage setupFutureUsage2 = (i & 2048) != 0 ? null : setupFutureUsage;
        Shipping shipping2 = (i & 4096) != 0 ? null : shipping;
        String str12 = (i & 8192) != 0 ? null : str6;
        Boolean bool4 = (i & 16384) != 0 ? null : bool2;
        if ((i & 32768) != 0) {
            code$payments_core_release = paymentMethodCreateParams2 != null ? paymentMethodCreateParams2.getCode$payments_core_release() : null;
        } else {
            code$payments_core_release = str7;
        }
        this(paymentMethodCreateParams2, str8, sourceParams2, str9, str3, str10, bool3, z2, paymentMethodOptionsParams2, str11, mandateDataParams2, setupFutureUsage2, shipping2, str12, bool4, code$payments_core_release);
    }

    public final String getPaymentMethodCode$payments_core_release() {
        return this.paymentMethodCode;
    }

    public final boolean shouldSavePaymentMethod() {
        return Intrinsics.areEqual((Object) this.savePaymentMethod, (Object) true);
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public boolean shouldUseStripeSdk() {
        return this.useStripeSdk;
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public ConfirmPaymentIntentParams withShouldUseStripeSdk(boolean shouldUseStripeSdk) {
        return copy$default(this, null, null, null, null, null, null, null, shouldUseStripeSdk, null, null, null, null, null, null, null, null, 65407, null);
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to("client_secret", getClientSecret()), TuplesKt.to("use_stripe_sdk", Boolean.valueOf(this.useStripeSdk)));
        Boolean bool = this.savePaymentMethod;
        Map mapMapOf2 = bool != null ? MapsKt.mapOf(TuplesKt.to(PARAM_SAVE_PAYMENT_METHOD, Boolean.valueOf(bool.booleanValue()))) : null;
        if (mapMapOf2 == null) {
            mapMapOf2 = MapsKt.emptyMap();
        }
        Map mapPlus = MapsKt.plus(mapMapOf, mapMapOf2);
        String str = this.mandateId;
        Map mapMapOf3 = str != null ? MapsKt.mapOf(TuplesKt.to("mandate", str)) : null;
        if (mapMapOf3 == null) {
            mapMapOf3 = MapsKt.emptyMap();
        }
        Map mapPlus2 = MapsKt.plus(mapPlus, mapMapOf3);
        Map<String, Object> mandateDataParams = getMandateDataParams();
        Map mapMapOf4 = mandateDataParams != null ? MapsKt.mapOf(TuplesKt.to("mandate_data", mandateDataParams)) : null;
        if (mapMapOf4 == null) {
            mapMapOf4 = MapsKt.emptyMap();
        }
        Map mapPlus3 = MapsKt.plus(mapPlus2, mapMapOf4);
        String returnUrl = getReturnUrl();
        Map mapMapOf5 = returnUrl != null ? MapsKt.mapOf(TuplesKt.to("return_url", returnUrl)) : null;
        if (mapMapOf5 == null) {
            mapMapOf5 = MapsKt.emptyMap();
        }
        Map mapPlus4 = MapsKt.plus(mapPlus3, mapMapOf5);
        PaymentMethodOptionsParams paymentMethodOptionsParams = this.paymentMethodOptions;
        Map mapMapOf6 = paymentMethodOptionsParams != null ? MapsKt.mapOf(TuplesKt.to(PARAM_PAYMENT_METHOD_OPTIONS, paymentMethodOptionsParams.toParamMap())) : null;
        if (mapMapOf6 == null) {
            mapMapOf6 = MapsKt.emptyMap();
        }
        Map mapPlus5 = MapsKt.plus(mapPlus4, mapMapOf6);
        SetupFutureUsage setupFutureUsage = this.setupFutureUsage;
        Map mapMapOf7 = setupFutureUsage != null ? MapsKt.mapOf(TuplesKt.to("setup_future_usage", setupFutureUsage.getCode())) : null;
        if (mapMapOf7 == null) {
            mapMapOf7 = MapsKt.emptyMap();
        }
        Map mapPlus6 = MapsKt.plus(mapPlus5, mapMapOf7);
        Boolean bool2 = this.setAsDefaultPaymentMethod;
        Map mapMapOf8 = bool2 != null ? MapsKt.mapOf(TuplesKt.to("set_as_default_payment_method", Boolean.valueOf(bool2.booleanValue()))) : null;
        if (mapMapOf8 == null) {
            mapMapOf8 = MapsKt.emptyMap();
        }
        Map mapPlus7 = MapsKt.plus(mapPlus6, mapMapOf8);
        Shipping shipping = this.shipping;
        Map mapMapOf9 = shipping != null ? MapsKt.mapOf(TuplesKt.to(PARAM_SHIPPING, shipping.toParamMap())) : null;
        if (mapMapOf9 == null) {
            mapMapOf9 = MapsKt.emptyMap();
        }
        Map mapPlus8 = MapsKt.plus(MapsKt.plus(mapPlus7, mapMapOf9), getPaymentMethodParamMap());
        String str2 = this.receiptEmail;
        Map mapMapOf10 = str2 != null ? MapsKt.mapOf(TuplesKt.to(PARAM_RECEIPT_EMAIL, str2)) : null;
        if (mapMapOf10 == null) {
            mapMapOf10 = MapsKt.emptyMap();
        }
        return MapsKt.plus(mapPlus8, mapMapOf10);
    }

    private final Map<String, Object> getPaymentMethodParamMap() {
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        if (paymentMethodCreateParams != null) {
            return MapsKt.mapOf(TuplesKt.to("payment_method_data", paymentMethodCreateParams.toParamMap()));
        }
        String str = this.paymentMethodId;
        if (str != null) {
            return MapsKt.mapOf(TuplesKt.to("payment_method", str));
        }
        SourceParams sourceParams = this.sourceParams;
        if (sourceParams != null) {
            return MapsKt.mapOf(TuplesKt.to(PARAM_SOURCE_DATA, sourceParams.toParamMap()));
        }
        String str2 = this.sourceId;
        if (str2 != null) {
            return MapsKt.mapOf(TuplesKt.to("source", str2));
        }
        return MapsKt.emptyMap();
    }

    private final Map<String, Object> getMandateDataParams() {
        Map<String, Object> paramMap;
        MandateDataParams mandateDataParams = this.mandateData;
        if (mandateDataParams != null && (paramMap = mandateDataParams.toParamMap()) != null) {
            return paramMap;
        }
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        if (paymentMethodCreateParams != null && paymentMethodCreateParams.getRequiresMandate$payments_core_release() && this.mandateId == null) {
            return new MandateDataParams(MandateDataParams.Type.Online.INSTANCE.getDEFAULT()).toParamMap();
        }
        return null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ConfirmPaymentIntentParams.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_release", "()Ljava/lang/String;", "OnSession", "OffSession", "Blank", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SetupFutureUsage {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SetupFutureUsage[] $VALUES;
        private final String code;
        public static final SetupFutureUsage OnSession = new SetupFutureUsage("OnSession", 0, PaymentIntent.ON_SESSION);
        public static final SetupFutureUsage OffSession = new SetupFutureUsage("OffSession", 1, PaymentIntent.OFF_SESSION);
        public static final SetupFutureUsage Blank = new SetupFutureUsage("Blank", 2, "");

        private static final /* synthetic */ SetupFutureUsage[] $values() {
            return new SetupFutureUsage[]{OnSession, OffSession, Blank};
        }

        public static EnumEntries<SetupFutureUsage> getEntries() {
            return $ENTRIES;
        }

        private SetupFutureUsage(String str, int i, String str2) {
            this.code = str2;
        }

        /* renamed from: getCode$payments_core_release, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        static {
            SetupFutureUsage[] setupFutureUsageArr$values = $values();
            $VALUES = setupFutureUsageArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(setupFutureUsageArr$values);
        }

        public static SetupFutureUsage valueOf(String str) {
            return (SetupFutureUsage) Enum.valueOf(SetupFutureUsage.class, str);
        }

        public static SetupFutureUsage[] values() {
            return (SetupFutureUsage[]) $VALUES.clone();
        }
    }

    /* compiled from: ConfirmPaymentIntentParams.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B=\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\n\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0007J\b\u0010\u0014\u001a\u00020\u0006H\u0007J\b\u0010\u0015\u001a\u00020\u0004H\u0007J\u0014\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u000e\u0010\u0019\u001a\u00020\u0004HÀ\u0003¢\u0006\u0002\b\u001aJ\u000e\u0010\u001b\u001a\u00020\u0006HÀ\u0003¢\u0006\u0002\b\u001cJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0002\b\u001eJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0002\b J\u0010\u0010!\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0002\b\"JA\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010$\u001a\u00020%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010)\u001a\u00020%HÖ\u0001J\t\u0010*\u001a\u00020\u0006HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020%R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u00061"}, d2 = {"Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "address", "Lcom/stripe/android/model/Address;", "name", "", Shipping.PARAM_CARRIER, "phone", "trackingNumber", "<init>", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress$payments_core_release", "()Lcom/stripe/android/model/Address;", "getName$payments_core_release", "()Ljava/lang/String;", "getCarrier$payments_core_release", "getPhone$payments_core_release", "getTrackingNumber$payments_core_release", "getPhone", "getName", "getAddress", "toParamMap", "", "", "component1", "component1$payments_core_release", "component2", "component2$payments_core_release", "component3", "component3$payments_core_release", "component4", "component4$payments_core_release", "component5", "component5$payments_core_release", "copy", "describeContents", "", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Shipping implements StripeParamsModel, Parcelable {
        public static final int $stable = 0;
        private static final String PARAM_ADDRESS = "address";
        private static final String PARAM_CARRIER = "carrier";
        private static final String PARAM_NAME = "name";
        private static final String PARAM_PHONE = "phone";
        private static final String PARAM_TRACKING_NUMBER = "tracking_number";
        private final Address address;
        private final String carrier;
        private final String name;
        private final String phone;
        private final String trackingNumber;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Shipping> CREATOR = new Creator();

        /* compiled from: ConfirmPaymentIntentParams.kt */
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

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Shipping(Address address, String name) {
            this(address, name, null, null, null, 28, null);
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(name, "name");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Shipping(Address address, String name, String str) {
            this(address, name, str, null, null, 24, null);
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(name, "name");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Shipping(Address address, String name, String str, String str2) {
            this(address, name, str, str2, null, 16, null);
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(name, "name");
        }

        public static /* synthetic */ Shipping copy$default(Shipping shipping, Address address, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                address = shipping.address;
            }
            if ((i & 2) != 0) {
                str = shipping.name;
            }
            if ((i & 4) != 0) {
                str2 = shipping.carrier;
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

        /* renamed from: component1$payments_core_release, reason: from getter */
        public final Address getAddress() {
            return this.address;
        }

        /* renamed from: component2$payments_core_release, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3$payments_core_release, reason: from getter */
        public final String getCarrier() {
            return this.carrier;
        }

        /* renamed from: component4$payments_core_release, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        /* renamed from: component5$payments_core_release, reason: from getter */
        public final String getTrackingNumber() {
            return this.trackingNumber;
        }

        public final Shipping copy(Address address, String name, String carrier, String phone, String trackingNumber) {
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(name, "name");
            return new Shipping(address, name, carrier, phone, trackingNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Shipping)) {
                return false;
            }
            Shipping shipping = (Shipping) other;
            return Intrinsics.areEqual(this.address, shipping.address) && Intrinsics.areEqual(this.name, shipping.name) && Intrinsics.areEqual(this.carrier, shipping.carrier) && Intrinsics.areEqual(this.phone, shipping.phone) && Intrinsics.areEqual(this.trackingNumber, shipping.trackingNumber);
        }

        public int hashCode() {
            int iHashCode = ((this.address.hashCode() * 31) + this.name.hashCode()) * 31;
            String str = this.carrier;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.phone;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.trackingNumber;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "Shipping(address=" + this.address + ", name=" + this.name + ", carrier=" + this.carrier + ", phone=" + this.phone + ", trackingNumber=" + this.trackingNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.address.writeToParcel(dest, flags);
            dest.writeString(this.name);
            dest.writeString(this.carrier);
            dest.writeString(this.phone);
            dest.writeString(this.trackingNumber);
        }

        public Shipping(Address address, String name, String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(name, "name");
            this.address = address;
            this.name = name;
            this.carrier = str;
            this.phone = str2;
            this.trackingNumber = str3;
        }

        public /* synthetic */ Shipping(Address address, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(address, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
        }

        public final Address getAddress$payments_core_release() {
            return this.address;
        }

        public final String getName$payments_core_release() {
            return this.name;
        }

        public final String getCarrier$payments_core_release() {
            return this.carrier;
        }

        public final String getPhone$payments_core_release() {
            return this.phone;
        }

        public final String getTrackingNumber$payments_core_release() {
            return this.trackingNumber;
        }

        public final String getPhone() {
            return this.phone;
        }

        public final String getName() {
            return this.name;
        }

        public final Address getAddress() {
            return this.address;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            List<Pair> listListOf = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("address", this.address.toParamMap()), TuplesKt.to("name", this.name), TuplesKt.to(PARAM_CARRIER, this.carrier), TuplesKt.to("phone", this.phone), TuplesKt.to(PARAM_TRACKING_NUMBER, this.trackingNumber)});
            Map<String, Object> mapEmptyMap = MapsKt.emptyMap();
            for (Pair pair : listListOf) {
                String str = (String) pair.component1();
                Object objComponent2 = pair.component2();
                Map mapMapOf = objComponent2 != null ? MapsKt.mapOf(TuplesKt.to(str, objComponent2)) : null;
                if (mapMapOf == null) {
                    mapMapOf = MapsKt.emptyMap();
                }
                mapEmptyMap = MapsKt.plus(mapEmptyMap, mapMapOf);
            }
            return mapEmptyMap;
        }

        /* compiled from: ConfirmPaymentIntentParams.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping$Companion;", "", "<init>", "()V", "PARAM_ADDRESS", "", "PARAM_NAME", "PARAM_CARRIER", "PARAM_PHONE", "PARAM_TRACKING_NUMBER", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: ConfirmPaymentIntentParams.kt */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J(\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007Je\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0002\u0010\u001eJe\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010\"J=\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0002\u0010&J=\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0002\u0010*J\u0010\u0010+\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0007Jq\u0010,\u001a\u00020\r2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010-\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0004\b.\u0010/J\u007f\u0010,\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00182\n\u00100\u001a\u00060\u0005j\u0002`1H\u0000¢\u0006\u0004\b.\u00102J'\u00103\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0000¢\u0006\u0002\b4R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/stripe/android/model/ConfirmPaymentIntentParams$Companion;", "", "<init>", "()V", "PARAM_PAYMENT_METHOD_OPTIONS", "", "PARAM_RECEIPT_EMAIL", "PARAM_SAVE_PAYMENT_METHOD", "PARAM_SHIPPING", "PARAM_SETUP_FUTURE_USAGE", "PARAM_SOURCE_DATA", "PARAM_SOURCE_ID", "create", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "clientSecret", "paymentMethodType", "Lcom/stripe/android/model/PaymentMethod$Type;", ConfirmPaymentIntentParams.PARAM_SHIPPING, "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;", "setupFutureUsage", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", "createWithPaymentMethodId", "paymentMethodId", "savePaymentMethod", "", "paymentMethodOptions", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "mandateId", "mandateData", "Lcom/stripe/android/model/MandateDataParams;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/model/PaymentMethodOptionsParams;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "createWithPaymentMethodCreateParams", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/PaymentMethodOptionsParams;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "createWithSourceId", "sourceId", "returnUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "createWithSourceParams", "sourceParams", "Lcom/stripe/android/model/SourceParams;", "(Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "createAlipay", "createWithSetAsDefaultPaymentMethod", "setAsDefaultPaymentMethod", "createWithSetAsDefaultPaymentMethod$payments_core_release", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/PaymentMethodOptionsParams;Ljava/lang/Boolean;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "paymentMethodCode", "Lcom/stripe/android/model/PaymentMethodCode;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/PaymentMethodOptionsParams;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "createForDashboard", "createForDashboard$payments_core_release", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ConfirmPaymentIntentParams create(String clientSecret) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return create$default(this, clientSecret, null, null, 6, null);
        }

        @JvmStatic
        public final ConfirmPaymentIntentParams create(String clientSecret, Shipping shipping) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return create$default(this, clientSecret, shipping, null, 4, null);
        }

        @JvmStatic
        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret) {
            Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, clientSecret, null, null, null, null, null, null, 252, null);
        }

        @JvmStatic
        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret, Boolean bool) {
            Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, clientSecret, bool, null, null, null, null, null, 248, null);
        }

        @JvmStatic
        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret, Boolean bool, String str) {
            Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, clientSecret, bool, str, null, null, null, null, 240, null);
        }

        @JvmStatic
        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret, Boolean bool, String str, MandateDataParams mandateDataParams) {
            Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, clientSecret, bool, str, mandateDataParams, null, null, null, 224, null);
        }

        @JvmStatic
        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret, Boolean bool, String str, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage) {
            Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, clientSecret, bool, str, mandateDataParams, setupFutureUsage, null, null, 192, null);
        }

        @JvmStatic
        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret, Boolean bool, String str, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping) {
            Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, clientSecret, bool, str, mandateDataParams, setupFutureUsage, shipping, null, 128, null);
        }

        @JvmStatic
        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String paymentMethodId, String clientSecret) {
            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return createWithPaymentMethodId$default(this, paymentMethodId, clientSecret, null, null, null, null, null, null, 252, null);
        }

        @JvmStatic
        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String paymentMethodId, String clientSecret, Boolean bool) {
            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return createWithPaymentMethodId$default(this, paymentMethodId, clientSecret, bool, null, null, null, null, null, 248, null);
        }

        @JvmStatic
        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String paymentMethodId, String clientSecret, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams) {
            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return createWithPaymentMethodId$default(this, paymentMethodId, clientSecret, bool, paymentMethodOptionsParams, null, null, null, null, 240, null);
        }

        @JvmStatic
        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String paymentMethodId, String clientSecret, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str) {
            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return createWithPaymentMethodId$default(this, paymentMethodId, clientSecret, bool, paymentMethodOptionsParams, str, null, null, null, 224, null);
        }

        @JvmStatic
        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String paymentMethodId, String clientSecret, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str, MandateDataParams mandateDataParams) {
            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return createWithPaymentMethodId$default(this, paymentMethodId, clientSecret, bool, paymentMethodOptionsParams, str, mandateDataParams, null, null, 192, null);
        }

        @JvmStatic
        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String paymentMethodId, String clientSecret, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage) {
            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return createWithPaymentMethodId$default(this, paymentMethodId, clientSecret, bool, paymentMethodOptionsParams, str, mandateDataParams, setupFutureUsage, null, 128, null);
        }

        @JvmStatic
        public final ConfirmPaymentIntentParams createWithSourceId(String sourceId, String clientSecret, String returnUrl) {
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            return createWithSourceId$default(this, sourceId, clientSecret, returnUrl, null, null, 24, null);
        }

        @JvmStatic
        public final ConfirmPaymentIntentParams createWithSourceId(String sourceId, String clientSecret, String returnUrl, Boolean bool) {
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            return createWithSourceId$default(this, sourceId, clientSecret, returnUrl, bool, null, 16, null);
        }

        @JvmStatic
        public final ConfirmPaymentIntentParams createWithSourceParams(SourceParams sourceParams, String clientSecret, String returnUrl) {
            Intrinsics.checkNotNullParameter(sourceParams, "sourceParams");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            return createWithSourceParams$default(this, sourceParams, clientSecret, returnUrl, null, null, 24, null);
        }

        @JvmStatic
        public final ConfirmPaymentIntentParams createWithSourceParams(SourceParams sourceParams, String clientSecret, String returnUrl, Boolean bool) {
            Intrinsics.checkNotNullParameter(sourceParams, "sourceParams");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            return createWithSourceParams$default(this, sourceParams, clientSecret, returnUrl, bool, null, 16, null);
        }

        private Companion() {
        }

        @JvmStatic
        public final ConfirmPaymentIntentParams create(String clientSecret, PaymentMethod.Type paymentMethodType) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(paymentMethodType, "paymentMethodType");
            MandateDataParams mandateDataParams = new MandateDataParams(MandateDataParams.Type.Online.INSTANCE.getDEFAULT());
            if (!paymentMethodType.requiresMandate) {
                mandateDataParams = null;
            }
            return new ConfirmPaymentIntentParams(null, null, null, null, clientSecret, null, null, false, null, null, mandateDataParams, null, null, null, null, paymentMethodType.code, 31727, null);
        }

        public static /* synthetic */ ConfirmPaymentIntentParams create$default(Companion companion, String str, Shipping shipping, SetupFutureUsage setupFutureUsage, int i, Object obj) {
            if ((i & 2) != 0) {
                shipping = null;
            }
            if ((i & 4) != 0) {
                setupFutureUsage = null;
            }
            return companion.create(str, shipping, setupFutureUsage);
        }

        @JvmStatic
        public final ConfirmPaymentIntentParams create(String clientSecret, Shipping shipping, SetupFutureUsage setupFutureUsage) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return new ConfirmPaymentIntentParams(null, null, null, null, clientSecret, null, null, false, null, null, null, setupFutureUsage, shipping, null, null, null, 59375, null);
        }

        public static /* synthetic */ ConfirmPaymentIntentParams createWithPaymentMethodId$default(Companion companion, String str, String str2, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str3, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping, int i, Object obj) {
            if ((i & 4) != 0) {
                bool = null;
            }
            if ((i & 8) != 0) {
                paymentMethodOptionsParams = null;
            }
            if ((i & 16) != 0) {
                str3 = null;
            }
            if ((i & 32) != 0) {
                mandateDataParams = null;
            }
            if ((i & 64) != 0) {
                setupFutureUsage = null;
            }
            if ((i & 128) != 0) {
                shipping = null;
            }
            return companion.createWithPaymentMethodId(str, str2, bool, paymentMethodOptionsParams, str3, mandateDataParams, setupFutureUsage, shipping);
        }

        @JvmStatic
        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String paymentMethodId, String clientSecret, Boolean savePaymentMethod, PaymentMethodOptionsParams paymentMethodOptions, String mandateId, MandateDataParams mandateData, SetupFutureUsage setupFutureUsage, Shipping shipping) {
            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return new ConfirmPaymentIntentParams(null, paymentMethodId, null, null, clientSecret, null, savePaymentMethod, false, paymentMethodOptions, mandateId, mandateData, setupFutureUsage, shipping, null, null, null, 57517, null);
        }

        public static /* synthetic */ ConfirmPaymentIntentParams createWithPaymentMethodCreateParams$default(Companion companion, PaymentMethodCreateParams paymentMethodCreateParams, String str, Boolean bool, String str2, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping, PaymentMethodOptionsParams paymentMethodOptionsParams, int i, Object obj) {
            if ((i & 4) != 0) {
                bool = null;
            }
            if ((i & 8) != 0) {
                str2 = null;
            }
            if ((i & 16) != 0) {
                mandateDataParams = null;
            }
            if ((i & 32) != 0) {
                setupFutureUsage = null;
            }
            if ((i & 64) != 0) {
                shipping = null;
            }
            if ((i & 128) != 0) {
                paymentMethodOptionsParams = null;
            }
            return companion.createWithPaymentMethodCreateParams(paymentMethodCreateParams, str, bool, str2, mandateDataParams, setupFutureUsage, shipping, paymentMethodOptionsParams);
        }

        @JvmStatic
        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret, Boolean savePaymentMethod, String mandateId, MandateDataParams mandateData, SetupFutureUsage setupFutureUsage, Shipping shipping, PaymentMethodOptionsParams paymentMethodOptions) {
            Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return createWithSetAsDefaultPaymentMethod$payments_core_release(paymentMethodCreateParams, clientSecret, savePaymentMethod, mandateId, mandateData, setupFutureUsage, shipping, paymentMethodOptions, null);
        }

        public static /* synthetic */ ConfirmPaymentIntentParams createWithSourceId$default(Companion companion, String str, String str2, String str3, Boolean bool, Shipping shipping, int i, Object obj) {
            if ((i & 8) != 0) {
                bool = null;
            }
            if ((i & 16) != 0) {
                shipping = null;
            }
            return companion.createWithSourceId(str, str2, str3, bool, shipping);
        }

        @JvmStatic
        public final ConfirmPaymentIntentParams createWithSourceId(String sourceId, String clientSecret, String returnUrl, Boolean savePaymentMethod, Shipping shipping) {
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            return new ConfirmPaymentIntentParams(null, null, null, sourceId, clientSecret, returnUrl, savePaymentMethod, false, null, null, null, null, shipping, null, null, null, 61319, null);
        }

        public static /* synthetic */ ConfirmPaymentIntentParams createWithSourceParams$default(Companion companion, SourceParams sourceParams, String str, String str2, Boolean bool, Shipping shipping, int i, Object obj) {
            if ((i & 8) != 0) {
                bool = null;
            }
            if ((i & 16) != 0) {
                shipping = null;
            }
            return companion.createWithSourceParams(sourceParams, str, str2, bool, shipping);
        }

        @JvmStatic
        public final ConfirmPaymentIntentParams createWithSourceParams(SourceParams sourceParams, String clientSecret, String returnUrl, Boolean savePaymentMethod, Shipping shipping) {
            Intrinsics.checkNotNullParameter(sourceParams, "sourceParams");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            return new ConfirmPaymentIntentParams(null, null, sourceParams, null, clientSecret, returnUrl, savePaymentMethod, false, null, null, null, null, shipping, null, null, null, 61323, null);
        }

        @JvmStatic
        public final ConfirmPaymentIntentParams createAlipay(String clientSecret) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return new ConfirmPaymentIntentParams(PaymentMethodCreateParams.Companion.createAlipay$default(PaymentMethodCreateParams.INSTANCE, null, null, 3, null), null, null, null, clientSecret, "stripe://return_url", null, false, null, null, null, null, null, null, null, PaymentMethod.Type.Alipay.code, 32718, null);
        }

        public static /* synthetic */ ConfirmPaymentIntentParams createWithSetAsDefaultPaymentMethod$payments_core_release$default(Companion companion, PaymentMethodCreateParams paymentMethodCreateParams, String str, Boolean bool, String str2, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping, PaymentMethodOptionsParams paymentMethodOptionsParams, Boolean bool2, int i, Object obj) {
            if ((i & 4) != 0) {
                bool = null;
            }
            if ((i & 8) != 0) {
                str2 = null;
            }
            if ((i & 16) != 0) {
                mandateDataParams = null;
            }
            if ((i & 32) != 0) {
                setupFutureUsage = null;
            }
            if ((i & 64) != 0) {
                shipping = null;
            }
            if ((i & 128) != 0) {
                paymentMethodOptionsParams = null;
            }
            return companion.createWithSetAsDefaultPaymentMethod$payments_core_release(paymentMethodCreateParams, str, bool, str2, mandateDataParams, setupFutureUsage, shipping, paymentMethodOptionsParams, bool2);
        }

        public final ConfirmPaymentIntentParams createWithSetAsDefaultPaymentMethod$payments_core_release(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret, Boolean savePaymentMethod, String mandateId, MandateDataParams mandateData, SetupFutureUsage setupFutureUsage, Shipping shipping, PaymentMethodOptionsParams paymentMethodOptions, Boolean setAsDefaultPaymentMethod) {
            Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return new ConfirmPaymentIntentParams(paymentMethodCreateParams, null, null, null, clientSecret, null, savePaymentMethod, false, paymentMethodOptions, mandateId, mandateData, setupFutureUsage, shipping, null, setAsDefaultPaymentMethod, paymentMethodCreateParams.getCode$payments_core_release(), 8366, null);
        }

        public static /* synthetic */ ConfirmPaymentIntentParams createWithSetAsDefaultPaymentMethod$payments_core_release$default(Companion companion, String str, String str2, Boolean bool, String str3, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping, PaymentMethodOptionsParams paymentMethodOptionsParams, Boolean bool2, String str4, int i, Object obj) {
            if ((i & 4) != 0) {
                bool = null;
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            if ((i & 16) != 0) {
                mandateDataParams = null;
            }
            if ((i & 32) != 0) {
                setupFutureUsage = null;
            }
            if ((i & 64) != 0) {
                shipping = null;
            }
            if ((i & 128) != 0) {
                paymentMethodOptionsParams = null;
            }
            if ((i & 256) != 0) {
                bool2 = null;
            }
            return companion.createWithSetAsDefaultPaymentMethod$payments_core_release(str, str2, bool, str3, mandateDataParams, setupFutureUsage, shipping, paymentMethodOptionsParams, bool2, str4);
        }

        public final ConfirmPaymentIntentParams createWithSetAsDefaultPaymentMethod$payments_core_release(String paymentMethodId, String clientSecret, Boolean savePaymentMethod, String mandateId, MandateDataParams mandateData, SetupFutureUsage setupFutureUsage, Shipping shipping, PaymentMethodOptionsParams paymentMethodOptions, Boolean setAsDefaultPaymentMethod, String paymentMethodCode) {
            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            return new ConfirmPaymentIntentParams(null, paymentMethodId, null, null, clientSecret, null, savePaymentMethod, false, paymentMethodOptions, mandateId, mandateData, setupFutureUsage, shipping, null, setAsDefaultPaymentMethod, paymentMethodCode, 8365, null);
        }

        public final ConfirmPaymentIntentParams createForDashboard$payments_core_release(String clientSecret, String paymentMethodId, PaymentMethodOptionsParams paymentMethodOptions) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
            PaymentMethodOptionsParams.Card card = paymentMethodOptions instanceof PaymentMethodOptionsParams.Card ? (PaymentMethodOptionsParams.Card) paymentMethodOptions : null;
            return new ConfirmPaymentIntentParams(null, paymentMethodId, null, null, clientSecret, null, false, true, new PaymentMethodOptionsParams.Card(null, null, card != null ? card.getSetupFutureUsage() : null, true, 3, null), null, null, null, null, null, null, PaymentMethod.Type.Card.code, 32301, null);
        }
    }
}
