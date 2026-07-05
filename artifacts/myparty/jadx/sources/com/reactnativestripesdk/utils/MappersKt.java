package com.reactnativestripesdk.utils;

import android.os.Bundle;
import android.util.Log;
import androidx.autofill.HintConstants;
import androidx.camera.video.AudioStats;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.hermes.intl.Constants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.ViewProps;
import com.reactcommunity.rndatetimepicker.Common;
import com.stripe.android.PaymentAuthConfig;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.model.Address;
import com.stripe.android.model.BankAccount;
import com.stripe.android.model.BankAccountTokenParams;
import com.stripe.android.model.Card;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.CardFunding;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams;
import com.stripe.android.model.GooglePayResult;
import com.stripe.android.model.MicrodepositType;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.Token;
import com.stripe.android.model.parsers.BankAccountJsonParser;
import com.stripe.android.model.parsers.TokenJsonParser;
import com.stripe.android.paymentsheet.PaymentSheet;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Mappers.kt */
@Metadata(d1 = {"\u0000Ê\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\fH\u0000\u001a\u0012\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0000\u001a\u0012\u0010\u0010\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0000\u001a\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u0000\u001a\u0010\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0016H\u0000\u001a\u0012\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0000\u001a\u0012\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0000\u001a\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u0000\u001a\u0012\u0010\u001e\u001a\u00020\u00012\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0000\u001a\u0012\u0010!\u001a\u00020\u00012\b\u0010\"\u001a\u0004\u0018\u00010#H\u0000\u001a\u0010\u0010$\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020%H\u0000\u001a\u0012\u0010&\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010'H\u0000\u001a\u0012\u0010(\u001a\u00020)2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u0000\u001a\u0012\u0010*\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010+H\u0000\u001a\u0014\u0010,\u001a\u0004\u0018\u00010\u00012\b\u0010-\u001a\u0004\u0018\u00010.H\u0000\u001a\u0012\u0010/\u001a\u0002002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u0000\u001a\u0012\u00101\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u000100H\u0000\u001a\u0012\u00102\u001a\u0002032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u0000\u001a\u0012\u00104\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u000103H\u0000\u001a\u0014\u00105\u001a\u0004\u0018\u00010\u00012\b\u00106\u001a\u0004\u0018\u000107H\u0000\u001a\u0010\u00108\u001a\u00020\u00012\u0006\u0010\n\u001a\u000209H\u0000\u001a\u0010\u0010:\u001a\u00020\u00012\u0006\u0010;\u001a\u00020<H\u0000\u001a\u0010\u0010=\u001a\u00020\u00012\u0006\u0010>\u001a\u00020?H\u0000\u001a\u0010\u0010@\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020AH\u0001\u001a\u001e\u0010B\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010C2\b\u0010D\u001a\u0004\u0018\u00010EH\u0001\u001a\u0014\u0010F\u001a\u0004\u0018\u00010\u00032\b\u0010G\u001a\u0004\u0018\u00010HH\u0000\u001a\u0014\u0010I\u001a\u0004\u0018\u00010\u00032\b\u0010G\u001a\u0004\u0018\u00010JH\u0000\u001a&\u0010K\u001a\u0004\u0018\u00010\u00032\b\u0010L\u001a\u0004\u0018\u00010M2\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0003\u001a\u001c\u0010O\u001a\u00020P2\b\u0010Q\u001a\u0004\u0018\u00010M2\b\u0010R\u001a\u0004\u0018\u00010PH\u0000\u001a\u001e\u0010S\u001a\u0004\u0018\u00010 2\b\u0010T\u001a\u0004\u0018\u00010M2\b\u0010R\u001a\u0004\u0018\u00010PH\u0000\u001a \u0010U\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010V2\b\u0010W\u001a\u0004\u0018\u00010MH\u0000\u001a\u0014\u0010X\u001a\u0004\u0018\u00010Y2\b\u0010Z\u001a\u0004\u0018\u00010MH\u0000\u001a\u001c\u0010[\u001a\u0004\u0018\u00010\u00032\b\u0010L\u001a\u0004\u0018\u00010M2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u001f\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010L\u001a\u0004\u0018\u00010M2\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010^\u001a\u001a\u0010_\u001a\u0004\u0018\u00010M2\b\u0010L\u001a\u0004\u0018\u00010M2\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0018\u0010`\u001a\u00020\b2\b\u0010L\u001a\u0004\u0018\u00010M2\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010a\u001a\u00020\u00032\u0006\u0010b\u001a\u00020cH\u0002\u001a\u000e\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020M\u001a\u0010\u0010g\u001a\u00020\u00012\u0006\u0010h\u001a\u00020iH\u0000\u001a\u0012\u0010j\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010kH\u0000\u001a\u0012\u0010l\u001a\u0004\u0018\u00010m2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u001a\u0010\u0010n\u001a\u00020o2\b\u0010p\u001a\u0004\u0018\u00010M\u001a\u0010\u0010q\u001a\u00020\u00012\u0006\u0010r\u001a\u00020sH\u0000\u001a*\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00190u2\u001a\u0010v\u001a\u0016\u0012\u0004\u0012\u00020]\u0018\u00010wj\n\u0012\u0004\u0012\u00020]\u0018\u0001`xH\u0000\u001a\u0010\u0010y\u001a\u00020\u00012\u0006\u0010z\u001a\u00020{H\u0000\u001a\u0014\u0010|\u001a\u00020}*\n\u0012\u0006\u0012\u0004\u0018\u00010~0uH\u0002\u001a\u001a\u0010\u007f\u001a\u00020M*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010~0VH\u0002\u001a\u001b\u0010\u0080\u0001\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010u2\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010oH\u0001\u001a\u001b\u0010\u0083\u0001\u001a\u00020\u00012\b\u0010\u0084\u0001\u001a\u00030\u0081\u00012\u0006\u0010T\u001a\u00020 H\u0001¨\u0006\u0085\u0001"}, d2 = {"createResult", "Lcom/facebook/react/bridge/WritableMap;", SDKConstants.PARAM_KEY, "", "value", "createCanAddCardResult", "Lcom/facebook/react/bridge/WritableNativeMap;", "canAddCard", "", "status", "token", "mapIntentStatus", "Lcom/stripe/android/model/StripeIntent$Status;", "mapCaptureMethod", "captureMethod", "Lcom/stripe/android/model/PaymentIntent$CaptureMethod;", "mapConfirmationMethod", "Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;", "mapToReturnURL", "urlScheme", "mapIntentShipping", "shipping", "Lcom/stripe/android/model/PaymentIntent$Shipping;", "mapCardBrand", "brand", "Lcom/stripe/android/model/CardBrand;", "mapPaymentMethodType", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "mapToPaymentMethodType", "mapFromBillingDetails", "billingDatails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "mapFromPaymentSheetBillingDetails", "billing", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "mapTokenType", "Lcom/stripe/android/model/Token$Type;", "mapFromBankAccountType", "Lcom/stripe/android/model/BankAccount$Type;", "mapToBankAccountType", "Lcom/stripe/android/model/BankAccountTokenParams$Type;", "mapFromBankAccountStatus", "Lcom/stripe/android/model/BankAccount$Status;", "mapFromBankAccount", "bankAccount", "Lcom/stripe/android/model/BankAccount;", "mapToUSBankAccountHolderType", "Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;", "mapFromUSBankAccountHolderType", "mapToUSBankAccountType", "Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;", "mapFromUSBankAccountType", "mapFromCard", "card", "Lcom/stripe/android/model/Card;", "mapFromToken", "Lcom/stripe/android/model/Token;", "mapFromPaymentMethod", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "mapFromPaymentIntentResult", "paymentIntent", "Lcom/stripe/android/model/PaymentIntent;", "mapFromMicrodepositType", "Lcom/stripe/android/model/MicrodepositType;", "mapNextAction", "Lcom/stripe/android/model/StripeIntent$NextActionType;", "data", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "mapFromPaymentIntentLastErrorType", "errorType", "Lcom/stripe/android/model/PaymentIntent$Error$Type;", "mapFromSetupIntentLastErrorType", "Lcom/stripe/android/model/SetupIntent$Error$Type;", "getValOr", "map", "Lcom/facebook/react/bridge/ReadableMap;", Constants.COLLATION_DEFAULT, "mapToAddress", "Lcom/stripe/android/model/Address;", "addressMap", "cardAddress", "mapToBillingDetails", "billingDetails", "mapToMetadata", "", "metadata", "mapToShippingDetails", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;", "shippingDetails", "getStringOrNull", "getIntOrNull", "", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Ljava/lang/Integer;", "getMapOrNull", "getBooleanOrFalse", "convertToUnixTimestamp", "timestamp", "", "mapToUICustomization", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;", NativeProtocol.WEB_DIALOG_PARAMS, "mapFromSetupIntentResult", "setupIntent", "Lcom/stripe/android/model/SetupIntent;", "mapSetupIntentUsage", "Lcom/stripe/android/model/StripeIntent$Usage;", "mapToPaymentIntentFutureUsage", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", "toBundleObject", "Landroid/os/Bundle;", "readableMap", "mapFromShippingContact", "googlePayResult", "Lcom/stripe/android/model/GooglePayResult;", "mapToPreferredNetworks", "", "networksAsInts", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "mapFromFinancialConnectionsEvent", "event", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;", "toWritableArray", "Lcom/facebook/react/bridge/WritableArray;", "", "toReadableMap", "parseCustomPaymentMethods", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;", "customPaymentMethodConfig", "mapFromCustomPaymentMethod", "customPaymentMethod", "stripe_stripe-react-native_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MappersKt {

    /* compiled from: Mappers.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$10;
        public static final /* synthetic */ int[] $EnumSwitchMapping$11;
        public static final /* synthetic */ int[] $EnumSwitchMapping$12;
        public static final /* synthetic */ int[] $EnumSwitchMapping$13;
        public static final /* synthetic */ int[] $EnumSwitchMapping$14;
        public static final /* synthetic */ int[] $EnumSwitchMapping$15;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;
        public static final /* synthetic */ int[] $EnumSwitchMapping$8;
        public static final /* synthetic */ int[] $EnumSwitchMapping$9;

        static {
            int[] iArr = new int[StripeIntent.Status.values().length];
            try {
                iArr[StripeIntent.Status.Succeeded.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StripeIntent.Status.RequiresPaymentMethod.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StripeIntent.Status.RequiresConfirmation.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StripeIntent.Status.Canceled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StripeIntent.Status.Processing.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StripeIntent.Status.RequiresAction.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StripeIntent.Status.RequiresCapture.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PaymentIntent.CaptureMethod.values().length];
            try {
                iArr2[PaymentIntent.CaptureMethod.Automatic.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[PaymentIntent.CaptureMethod.Manual.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[PaymentIntent.ConfirmationMethod.values().length];
            try {
                iArr3[PaymentIntent.ConfirmationMethod.Automatic.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[PaymentIntent.ConfirmationMethod.Manual.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[CardBrand.values().length];
            try {
                iArr4[CardBrand.AmericanExpress.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[CardBrand.DinersClub.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[CardBrand.Discover.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[CardBrand.JCB.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[CardBrand.MasterCard.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[CardBrand.UnionPay.ordinal()] = 6;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[CardBrand.Visa.ordinal()] = 7;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[CardBrand.Unknown.ordinal()] = 8;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[PaymentMethod.Type.values().length];
            try {
                iArr5[PaymentMethod.Type.AfterpayClearpay.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[PaymentMethod.Type.Alipay.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr5[PaymentMethod.Type.AuBecsDebit.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[PaymentMethod.Type.BacsDebit.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[PaymentMethod.Type.Bancontact.ordinal()] = 5;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[PaymentMethod.Type.Card.ordinal()] = 6;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr5[PaymentMethod.Type.CardPresent.ordinal()] = 7;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr5[PaymentMethod.Type.Eps.ordinal()] = 8;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr5[PaymentMethod.Type.Fpx.ordinal()] = 9;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr5[PaymentMethod.Type.Giropay.ordinal()] = 10;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr5[PaymentMethod.Type.GrabPay.ordinal()] = 11;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr5[PaymentMethod.Type.Ideal.ordinal()] = 12;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr5[PaymentMethod.Type.Netbanking.ordinal()] = 13;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr5[PaymentMethod.Type.Oxxo.ordinal()] = 14;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr5[PaymentMethod.Type.P24.ordinal()] = 15;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr5[PaymentMethod.Type.SepaDebit.ordinal()] = 16;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr5[PaymentMethod.Type.Upi.ordinal()] = 17;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr5[PaymentMethod.Type.WeChatPay.ordinal()] = 18;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr5[PaymentMethod.Type.Klarna.ordinal()] = 19;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr5[PaymentMethod.Type.USBankAccount.ordinal()] = 20;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr5[PaymentMethod.Type.PayPal.ordinal()] = 21;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr5[PaymentMethod.Type.Affirm.ordinal()] = 22;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr5[PaymentMethod.Type.CashAppPay.ordinal()] = 23;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr5[PaymentMethod.Type.RevolutPay.ordinal()] = 24;
            } catch (NoSuchFieldError unused43) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[Token.Type.values().length];
            try {
                iArr6[Token.Type.Account.ordinal()] = 1;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr6[Token.Type.BankAccount.ordinal()] = 2;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr6[Token.Type.Card.ordinal()] = 3;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr6[Token.Type.CvcUpdate.ordinal()] = 4;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr6[Token.Type.Person.ordinal()] = 5;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr6[Token.Type.Pii.ordinal()] = 6;
            } catch (NoSuchFieldError unused49) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[BankAccount.Type.values().length];
            try {
                iArr7[BankAccount.Type.Company.ordinal()] = 1;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr7[BankAccount.Type.Individual.ordinal()] = 2;
            } catch (NoSuchFieldError unused51) {
            }
            $EnumSwitchMapping$6 = iArr7;
            int[] iArr8 = new int[BankAccount.Status.values().length];
            try {
                iArr8[BankAccount.Status.Errored.ordinal()] = 1;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr8[BankAccount.Status.New.ordinal()] = 2;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr8[BankAccount.Status.Validated.ordinal()] = 3;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr8[BankAccount.Status.VerificationFailed.ordinal()] = 4;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr8[BankAccount.Status.Verified.ordinal()] = 5;
            } catch (NoSuchFieldError unused56) {
            }
            $EnumSwitchMapping$7 = iArr8;
            int[] iArr9 = new int[PaymentMethod.USBankAccount.USBankAccountHolderType.values().length];
            try {
                iArr9[PaymentMethod.USBankAccount.USBankAccountHolderType.COMPANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr9[PaymentMethod.USBankAccount.USBankAccountHolderType.INDIVIDUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused58) {
            }
            $EnumSwitchMapping$8 = iArr9;
            int[] iArr10 = new int[PaymentMethod.USBankAccount.USBankAccountType.values().length];
            try {
                iArr10[PaymentMethod.USBankAccount.USBankAccountType.CHECKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr10[PaymentMethod.USBankAccount.USBankAccountType.SAVINGS.ordinal()] = 2;
            } catch (NoSuchFieldError unused60) {
            }
            $EnumSwitchMapping$9 = iArr10;
            int[] iArr11 = new int[MicrodepositType.values().length];
            try {
                iArr11[MicrodepositType.AMOUNTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr11[MicrodepositType.DESCRIPTOR_CODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused62) {
            }
            $EnumSwitchMapping$10 = iArr11;
            int[] iArr12 = new int[StripeIntent.NextActionType.values().length];
            try {
                iArr12[StripeIntent.NextActionType.RedirectToUrl.ordinal()] = 1;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr12[StripeIntent.NextActionType.VerifyWithMicrodeposits.ordinal()] = 2;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr12[StripeIntent.NextActionType.DisplayOxxoDetails.ordinal()] = 3;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr12[StripeIntent.NextActionType.WeChatPayRedirect.ordinal()] = 4;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr12[StripeIntent.NextActionType.AlipayRedirect.ordinal()] = 5;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr12[StripeIntent.NextActionType.CashAppRedirect.ordinal()] = 6;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr12[StripeIntent.NextActionType.BlikAuthorize.ordinal()] = 7;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr12[StripeIntent.NextActionType.UseStripeSdk.ordinal()] = 8;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr12[StripeIntent.NextActionType.UpiAwaitNotification.ordinal()] = 9;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr12[StripeIntent.NextActionType.DisplayBoletoDetails.ordinal()] = 10;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr12[StripeIntent.NextActionType.DisplayKonbiniDetails.ordinal()] = 11;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr12[StripeIntent.NextActionType.SwishRedirect.ordinal()] = 12;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr12[StripeIntent.NextActionType.DisplayMultibancoDetails.ordinal()] = 13;
            } catch (NoSuchFieldError unused75) {
            }
            $EnumSwitchMapping$11 = iArr12;
            int[] iArr13 = new int[PaymentIntent.Error.Type.values().length];
            try {
                iArr13[PaymentIntent.Error.Type.ApiConnectionError.ordinal()] = 1;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr13[PaymentIntent.Error.Type.AuthenticationError.ordinal()] = 2;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr13[PaymentIntent.Error.Type.ApiError.ordinal()] = 3;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr13[PaymentIntent.Error.Type.CardError.ordinal()] = 4;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr13[PaymentIntent.Error.Type.IdempotencyError.ordinal()] = 5;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr13[PaymentIntent.Error.Type.InvalidRequestError.ordinal()] = 6;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr13[PaymentIntent.Error.Type.RateLimitError.ordinal()] = 7;
            } catch (NoSuchFieldError unused82) {
            }
            $EnumSwitchMapping$12 = iArr13;
            int[] iArr14 = new int[SetupIntent.Error.Type.values().length];
            try {
                iArr14[SetupIntent.Error.Type.ApiConnectionError.ordinal()] = 1;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr14[SetupIntent.Error.Type.AuthenticationError.ordinal()] = 2;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr14[SetupIntent.Error.Type.ApiError.ordinal()] = 3;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr14[SetupIntent.Error.Type.CardError.ordinal()] = 4;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr14[SetupIntent.Error.Type.IdempotencyError.ordinal()] = 5;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr14[SetupIntent.Error.Type.InvalidRequestError.ordinal()] = 6;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr14[SetupIntent.Error.Type.RateLimitError.ordinal()] = 7;
            } catch (NoSuchFieldError unused89) {
            }
            $EnumSwitchMapping$13 = iArr14;
            int[] iArr15 = new int[StripeIntent.Usage.values().length];
            try {
                iArr15[StripeIntent.Usage.OffSession.ordinal()] = 1;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr15[StripeIntent.Usage.OnSession.ordinal()] = 2;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr15[StripeIntent.Usage.OneTime.ordinal()] = 3;
            } catch (NoSuchFieldError unused92) {
            }
            $EnumSwitchMapping$14 = iArr15;
            int[] iArr16 = new int[ReadableType.values().length];
            try {
                iArr16[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr16[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr16[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr16[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr16[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr16[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused98) {
            }
            $EnumSwitchMapping$15 = iArr16;
        }
    }

    public static final WritableMap createResult(String key, WritableMap value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap(key, value);
        return writableNativeMap;
    }

    public static /* synthetic */ WritableNativeMap createCanAddCardResult$default(boolean z, String str, WritableMap writableMap, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            writableMap = null;
        }
        return createCanAddCardResult(z, str, writableMap);
    }

    public static final WritableNativeMap createCanAddCardResult(boolean z, String str, WritableMap writableMap) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap.putBoolean("canAddCard", z);
        if (str != null) {
            writableNativeMap2.putString("status", str);
        }
        if (writableMap != null) {
            writableNativeMap2.putMap("token", writableMap);
        }
        writableNativeMap.putMap("details", writableNativeMap2);
        return writableNativeMap;
    }

    public static final String mapIntentStatus(StripeIntent.Status status) {
        switch (status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()]) {
            case 1:
                return "Succeeded";
            case 2:
                return "RequiresPaymentMethod";
            case 3:
                return "RequiresConfirmation";
            case 4:
                return "Canceled";
            case 5:
                return "Processing";
            case 6:
                return "RequiresAction";
            case 7:
                return "RequiresCapture";
            default:
                return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        }
    }

    public static final String mapCaptureMethod(PaymentIntent.CaptureMethod captureMethod) {
        int i = captureMethod == null ? -1 : WhenMappings.$EnumSwitchMapping$1[captureMethod.ordinal()];
        if (i == 1) {
            return "Automatic";
        }
        if (i == 2) {
            return "Manual";
        }
        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public static final String mapConfirmationMethod(PaymentIntent.ConfirmationMethod confirmationMethod) {
        int i = confirmationMethod == null ? -1 : WhenMappings.$EnumSwitchMapping$2[confirmationMethod.ordinal()];
        if (i == 1) {
            return "Automatic";
        }
        if (i == 2) {
            return "Manual";
        }
        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public static final String mapToReturnURL(String str) {
        if (str != null) {
            return str + "://safepay";
        }
        return null;
    }

    public static final WritableMap mapIntentShipping(PaymentIntent.Shipping shipping) {
        Intrinsics.checkNotNullParameter(shipping, "shipping");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putString("city", shipping.getAddress().getCity());
        writableNativeMap2.putString("country", shipping.getAddress().getCountry());
        writableNativeMap2.putString("line1", shipping.getAddress().getLine1());
        writableNativeMap2.putString("line2", shipping.getAddress().getLine2());
        writableNativeMap2.putString(HintConstants.AUTOFILL_HINT_POSTAL_CODE, shipping.getAddress().getPostalCode());
        writableNativeMap2.putString(ServerProtocol.DIALOG_PARAM_STATE, shipping.getAddress().getState());
        writableNativeMap.putMap("address", writableNativeMap2);
        writableNativeMap.putString("name", shipping.getName());
        writableNativeMap.putString("carrier", shipping.getCarrier());
        writableNativeMap.putString("phone", shipping.getPhone());
        writableNativeMap.putString("trackingNumber", shipping.getTrackingNumber());
        return writableNativeMap;
    }

    public static final String mapCardBrand(CardBrand cardBrand) {
        switch (cardBrand == null ? -1 : WhenMappings.$EnumSwitchMapping$3[cardBrand.ordinal()]) {
            case 1:
                return "AmericanExpress";
            case 2:
                return "DinersClub";
            case 3:
                return "Discover";
            case 4:
                return "JCB";
            case 5:
                return "MasterCard";
            case 6:
                return "UnionPay";
            case 7:
                return "Visa";
            case 8:
            default:
                return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        }
    }

    public static final String mapPaymentMethodType(PaymentMethod.Type type) {
        switch (type == null ? -1 : WhenMappings.$EnumSwitchMapping$4[type.ordinal()]) {
            case 1:
                return "AfterpayClearpay";
            case 2:
                return "Alipay";
            case 3:
                return "AuBecsDebit";
            case 4:
                return "BacsDebit";
            case 5:
                return "Bancontact";
            case 6:
                return "Card";
            case 7:
                return "CardPresent";
            case 8:
                return "Eps";
            case 9:
                return "Fpx";
            case 10:
                return "Giropay";
            case 11:
                return "GrabPay";
            case 12:
                return "Ideal";
            case 13:
                return "Netbanking";
            case 14:
                return "Oxxo";
            case 15:
                return "P24";
            case 16:
                return "SepaDebit";
            case 17:
                return "Upi";
            case 18:
                return "WeChatPay";
            case 19:
                return "Klarna";
            case 20:
                return "USBankAccount";
            case 21:
                return "PayPal";
            case 22:
                return "Affirm";
            case 23:
                return "CashApp";
            case 24:
                return "RevolutPay";
            default:
                return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        }
    }

    public static final PaymentMethod.Type mapToPaymentMethodType(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -2075365938:
                if (str.equals("CashApp")) {
                    return PaymentMethod.Type.CashAppPay;
                }
                return null;
            case -2045037915:
                if (str.equals("Klarna")) {
                    return PaymentMethod.Type.Klarna;
                }
                return null;
            case -1911368973:
                if (str.equals("PayPal")) {
                    return PaymentMethod.Type.PayPal;
                }
                return null;
            case -752190179:
                if (str.equals("BacsDebit")) {
                    return PaymentMethod.Type.BacsDebit;
                }
                return null;
            case -600549687:
                if (str.equals("SepaDebit")) {
                    return PaymentMethod.Type.SepaDebit;
                }
                return null;
            case -529183021:
                if (str.equals("USBankAccount")) {
                    return PaymentMethod.Type.USBankAccount;
                }
                return null;
            case -430881083:
                if (str.equals("AuBecsDebit")) {
                    return PaymentMethod.Type.AuBecsDebit;
                }
                return null;
            case -346968055:
                if (str.equals("Netbanking")) {
                    return PaymentMethod.Type.Netbanking;
                }
                return null;
            case -302881593:
                if (str.equals("AfterpayClearpay")) {
                    return PaymentMethod.Type.AfterpayClearpay;
                }
                return null;
            case -295777438:
                if (str.equals("WeChatPay")) {
                    return PaymentMethod.Type.WeChatPay;
                }
                return null;
            case 69896:
                if (str.equals("Eps")) {
                    return PaymentMethod.Type.Eps;
                }
                return null;
            case 70862:
                if (str.equals("Fpx")) {
                    return PaymentMethod.Type.Fpx;
                }
                return null;
            case 78482:
                if (str.equals("P24")) {
                    return PaymentMethod.Type.P24;
                }
                return null;
            case 85262:
                if (str.equals("Upi")) {
                    return PaymentMethod.Type.Upi;
                }
                return null;
            case 2092848:
                if (str.equals("Card")) {
                    return PaymentMethod.Type.Card;
                }
                return null;
            case 2472640:
                if (str.equals("Oxxo")) {
                    return PaymentMethod.Type.Oxxo;
                }
                return null;
            case 70496309:
                if (str.equals("Ideal")) {
                    return PaymentMethod.Type.Ideal;
                }
                return null;
            case 72721745:
                if (str.equals("Bancontact")) {
                    return PaymentMethod.Type.Bancontact;
                }
                return null;
            case 1326873577:
                if (str.equals("RevolutPay")) {
                    return PaymentMethod.Type.RevolutPay;
                }
                return null;
            case 1703011721:
                if (str.equals("Giropay")) {
                    return PaymentMethod.Type.Giropay;
                }
                return null;
            case 1918741355:
                if (str.equals("CardPresent")) {
                    return PaymentMethod.Type.CardPresent;
                }
                return null;
            case 1944556188:
                if (str.equals("GrabPay")) {
                    return PaymentMethod.Type.GrabPay;
                }
                return null;
            case 1958237187:
                if (str.equals("Affirm")) {
                    return PaymentMethod.Type.Affirm;
                }
                return null;
            case 1963873898:
                if (str.equals("Alipay")) {
                    return PaymentMethod.Type.Alipay;
                }
                return null;
            default:
                return null;
        }
    }

    public static final WritableMap mapFromBillingDetails(PaymentMethod.BillingDetails billingDetails) {
        Address address;
        Address address2;
        Address address3;
        Address address4;
        Address address5;
        Address address6;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putString("country", (billingDetails == null || (address6 = billingDetails.address) == null) ? null : address6.getCountry());
        writableNativeMap2.putString("city", (billingDetails == null || (address5 = billingDetails.address) == null) ? null : address5.getCity());
        writableNativeMap2.putString("line1", (billingDetails == null || (address4 = billingDetails.address) == null) ? null : address4.getLine1());
        writableNativeMap2.putString("line2", (billingDetails == null || (address3 = billingDetails.address) == null) ? null : address3.getLine2());
        writableNativeMap2.putString(HintConstants.AUTOFILL_HINT_POSTAL_CODE, (billingDetails == null || (address2 = billingDetails.address) == null) ? null : address2.getPostalCode());
        writableNativeMap2.putString(ServerProtocol.DIALOG_PARAM_STATE, (billingDetails == null || (address = billingDetails.address) == null) ? null : address.getState());
        writableNativeMap.putString("email", billingDetails != null ? billingDetails.email : null);
        writableNativeMap.putString("phone", billingDetails != null ? billingDetails.phone : null);
        writableNativeMap.putString("name", billingDetails != null ? billingDetails.name : null);
        writableNativeMap.putMap("address", writableNativeMap2);
        return writableNativeMap;
    }

    public static final WritableMap mapFromPaymentSheetBillingDetails(PaymentSheet.BillingDetails billingDetails) {
        PaymentSheet.Address address;
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putString("name", billingDetails != null ? billingDetails.getName() : null);
        writableMapCreateMap.putString("email", billingDetails != null ? billingDetails.getEmail() : null);
        writableMapCreateMap.putString("phone", billingDetails != null ? billingDetails.getPhone() : null);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap2, "createMap(...)");
        if (billingDetails != null && (address = billingDetails.getAddress()) != null) {
            writableMapCreateMap2.putString("city", address.getCity());
            writableMapCreateMap2.putString("country", address.getCountry());
            writableMapCreateMap2.putString("line1", address.getLine1());
            writableMapCreateMap2.putString("line2", address.getLine2());
            writableMapCreateMap2.putString(HintConstants.AUTOFILL_HINT_POSTAL_CODE, address.getPostalCode());
            writableMapCreateMap2.putString(ServerProtocol.DIALOG_PARAM_STATE, address.getState());
        }
        writableMapCreateMap.putMap("address", writableMapCreateMap2);
        return writableMapCreateMap;
    }

    public static final String mapTokenType(Token.Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        switch (WhenMappings.$EnumSwitchMapping$5[type.ordinal()]) {
            case 1:
                return "Account";
            case 2:
                return "BankAccount";
            case 3:
                return "Card";
            case 4:
                return "CvcUpdate";
            case 5:
                return "Person";
            case 6:
                return "Pii";
            default:
                return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        }
    }

    public static final String mapFromBankAccountType(BankAccount.Type type) {
        int i = type == null ? -1 : WhenMappings.$EnumSwitchMapping$6[type.ordinal()];
        if (i == 1) {
            return "Company";
        }
        if (i == 2) {
            return "Individual";
        }
        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public static final BankAccountTokenParams.Type mapToBankAccountType(String str) {
        return Intrinsics.areEqual(str, "Company") ? BankAccountTokenParams.Type.Company : Intrinsics.areEqual(str, "Individual") ? BankAccountTokenParams.Type.Individual : BankAccountTokenParams.Type.Individual;
    }

    public static final String mapFromBankAccountStatus(BankAccount.Status status) {
        int i = status == null ? -1 : WhenMappings.$EnumSwitchMapping$7[status.ordinal()];
        if (i == 1) {
            return "Errored";
        }
        if (i == 2) {
            return "New";
        }
        if (i == 3) {
            return "Validated";
        }
        if (i == 4) {
            return "VerificationFailed";
        }
        if (i == 5) {
            return "Verified";
        }
        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public static final WritableMap mapFromBankAccount(BankAccount bankAccount) {
        if (bankAccount == null) {
            return null;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("id", bankAccount.getId());
        writableNativeMap.putString("bankName", bankAccount.getBankName());
        writableNativeMap.putString("accountHolderName", bankAccount.getAccountHolderName());
        writableNativeMap.putString("accountHolderType", mapFromBankAccountType(bankAccount.getAccountHolderType()));
        writableNativeMap.putString("currency", bankAccount.getCurrency());
        writableNativeMap.putString("country", bankAccount.getCountryCode());
        writableNativeMap.putString("routingNumber", bankAccount.getRoutingNumber());
        writableNativeMap.putString("status", mapFromBankAccountStatus(bankAccount.getStatus()));
        writableNativeMap.putString(BankAccountJsonParser.FIELD_FINGERPRINT, bankAccount.getFingerprint());
        writableNativeMap.putString("last4", bankAccount.getLast4());
        return writableNativeMap;
    }

    public static final PaymentMethod.USBankAccount.USBankAccountHolderType mapToUSBankAccountHolderType(String str) {
        return Intrinsics.areEqual(str, "Company") ? PaymentMethod.USBankAccount.USBankAccountHolderType.COMPANY : Intrinsics.areEqual(str, "Individual") ? PaymentMethod.USBankAccount.USBankAccountHolderType.INDIVIDUAL : PaymentMethod.USBankAccount.USBankAccountHolderType.INDIVIDUAL;
    }

    public static final String mapFromUSBankAccountHolderType(PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType) {
        int i = uSBankAccountHolderType == null ? -1 : WhenMappings.$EnumSwitchMapping$8[uSBankAccountHolderType.ordinal()];
        if (i == 1) {
            return "Company";
        }
        if (i == 2) {
            return "Individual";
        }
        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public static final PaymentMethod.USBankAccount.USBankAccountType mapToUSBankAccountType(String str) {
        return Intrinsics.areEqual(str, "Savings") ? PaymentMethod.USBankAccount.USBankAccountType.SAVINGS : Intrinsics.areEqual(str, "Checking") ? PaymentMethod.USBankAccount.USBankAccountType.CHECKING : PaymentMethod.USBankAccount.USBankAccountType.CHECKING;
    }

    public static final String mapFromUSBankAccountType(PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType) {
        int i = uSBankAccountType == null ? -1 : WhenMappings.$EnumSwitchMapping$9[uSBankAccountType.ordinal()];
        if (i == 1) {
            return "Checking";
        }
        if (i == 2) {
            return "Savings";
        }
        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public static final WritableMap mapFromCard(Card card) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (card == null) {
            return null;
        }
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap.putString("country", card.getCountry());
        writableNativeMap.putString("brand", mapCardBrand(card.getBrand()));
        writableNativeMap.putString("currency", card.getCurrency());
        Integer expMonth = card.getExpMonth();
        if (expMonth != null) {
            writableNativeMap.putInt("expMonth", expMonth.intValue());
        } else {
            writableNativeMap.putNull("expMonth");
        }
        Integer expYear = card.getExpYear();
        if (expYear != null) {
            writableNativeMap.putInt("expYear", expYear.intValue());
        } else {
            writableNativeMap.putNull("expYear");
        }
        writableNativeMap.putString("id", card.getId());
        writableNativeMap.putString("last4", card.getLast4());
        CardFunding funding = card.getFunding();
        writableNativeMap.putString("funding", funding != null ? funding.name() : null);
        writableNativeMap.putString("name", card.getName());
        writableNativeMap2.putString("city", card.getAddressCity());
        writableNativeMap2.putString("country", card.getAddressCountry());
        writableNativeMap2.putString("line1", card.getAddressLine1());
        writableNativeMap2.putString("line2", card.getAddressLine2());
        writableNativeMap2.putString(ServerProtocol.DIALOG_PARAM_STATE, card.getAddressState());
        writableNativeMap2.putString(HintConstants.AUTOFILL_HINT_POSTAL_CODE, card.getAddressZip());
        writableNativeMap.putMap("address", writableNativeMap2);
        return writableNativeMap;
    }

    public static final WritableMap mapFromToken(Token token) {
        Intrinsics.checkNotNullParameter(token, "token");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("id", token.getId());
        writableNativeMap.putString("created", String.valueOf(token.getCreated().getTime()));
        writableNativeMap.putString("type", mapTokenType(token.getType()));
        writableNativeMap.putBoolean(TokenJsonParser.FIELD_LIVEMODE, token.getLivemode());
        writableNativeMap.putMap("bankAccount", mapFromBankAccount(token.getBankAccount()));
        writableNativeMap.putMap("card", mapFromCard(token.getCard()));
        writableNativeMap.putBoolean(TokenJsonParser.FIELD_USED, token.getUsed());
        return writableNativeMap;
    }

    public static final WritableMap mapFromPaymentMethod(PaymentMethod paymentMethod) {
        PaymentMethod.USBankAccount.USBankNetworks uSBankNetworks;
        PaymentMethod.USBankAccount.USBankNetworks uSBankNetworks2;
        PaymentMethod.Card.ThreeDSecureUsage threeDSecureUsage;
        PaymentMethod.Card.Networks networks;
        Set<String> available;
        PaymentMethod.Card.Networks networks2;
        Integer num;
        Integer num2;
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("id", paymentMethod.id);
        writableNativeMap.putString("paymentMethodType", mapPaymentMethodType(paymentMethod.type));
        writableNativeMap.putBoolean(TokenJsonParser.FIELD_LIVEMODE, paymentMethod.liveMode);
        writableNativeMap.putString("customerId", paymentMethod.customerId);
        writableNativeMap.putMap("billingDetails", mapFromBillingDetails(paymentMethod.billingDetails));
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        PaymentMethod.Card card = paymentMethod.card;
        writableNativeMap2.putString("brand", mapCardBrand(card != null ? card.brand : null));
        PaymentMethod.Card card2 = paymentMethod.card;
        writableNativeMap2.putString("country", card2 != null ? card2.country : null);
        PaymentMethod.Card card3 = paymentMethod.card;
        if (card3 != null && (num2 = card3.expiryYear) != null) {
            writableNativeMap2.putInt("expYear", num2.intValue());
        }
        PaymentMethod.Card card4 = paymentMethod.card;
        if (card4 != null && (num = card4.expiryMonth) != null) {
            writableNativeMap2.putInt("expMonth", num.intValue());
        }
        PaymentMethod.Card card5 = paymentMethod.card;
        writableNativeMap2.putString("funding", card5 != null ? card5.funding : null);
        PaymentMethod.Card card6 = paymentMethod.card;
        writableNativeMap2.putString("last4", card6 != null ? card6.last4 : null);
        PaymentMethod.Card card7 = paymentMethod.card;
        writableNativeMap2.putString(BankAccountJsonParser.FIELD_FINGERPRINT, card7 != null ? card7.fingerprint : null);
        PaymentMethod.Card card8 = paymentMethod.card;
        writableNativeMap2.putString("preferredNetwork", (card8 == null || (networks2 = card8.networks) == null) ? null : networks2.getPreferred());
        PaymentMethod.Card card9 = paymentMethod.card;
        List list = (card9 == null || (networks = card9.networks) == null || (available = networks.getAvailable()) == null) ? null : CollectionsKt.toList(available);
        writableNativeMap2.putArray("availableNetworks", list instanceof ReadableArray ? (ReadableArray) list : null);
        WritableNativeMap writableNativeMap3 = new WritableNativeMap();
        PaymentMethod.Card card10 = paymentMethod.card;
        writableNativeMap3.putBoolean("isSupported", (card10 == null || (threeDSecureUsage = card10.threeDSecureUsage) == null) ? false : threeDSecureUsage.isSupported);
        Unit unit = Unit.INSTANCE;
        writableNativeMap2.putMap("threeDSecureUsage", writableNativeMap3);
        Unit unit2 = Unit.INSTANCE;
        writableNativeMap.putMap("Card", writableNativeMap2);
        WritableNativeMap writableNativeMap4 = new WritableNativeMap();
        PaymentMethod.SepaDebit sepaDebit = paymentMethod.sepaDebit;
        writableNativeMap4.putString("bankCode", sepaDebit != null ? sepaDebit.bankCode : null);
        PaymentMethod.SepaDebit sepaDebit2 = paymentMethod.sepaDebit;
        writableNativeMap4.putString("country", sepaDebit2 != null ? sepaDebit2.country : null);
        PaymentMethod.SepaDebit sepaDebit3 = paymentMethod.sepaDebit;
        writableNativeMap4.putString(BankAccountJsonParser.FIELD_FINGERPRINT, sepaDebit3 != null ? sepaDebit3.fingerprint : null);
        PaymentMethod.SepaDebit sepaDebit4 = paymentMethod.sepaDebit;
        writableNativeMap4.putString("last4", sepaDebit4 != null ? sepaDebit4.branchCode : null);
        Unit unit3 = Unit.INSTANCE;
        writableNativeMap.putMap("SepaDebit", writableNativeMap4);
        WritableNativeMap writableNativeMap5 = new WritableNativeMap();
        PaymentMethod.BacsDebit bacsDebit = paymentMethod.bacsDebit;
        writableNativeMap5.putString(BankAccountJsonParser.FIELD_FINGERPRINT, bacsDebit != null ? bacsDebit.fingerprint : null);
        PaymentMethod.BacsDebit bacsDebit2 = paymentMethod.bacsDebit;
        writableNativeMap5.putString("last4", bacsDebit2 != null ? bacsDebit2.last4 : null);
        PaymentMethod.BacsDebit bacsDebit3 = paymentMethod.bacsDebit;
        writableNativeMap5.putString("sortCode", bacsDebit3 != null ? bacsDebit3.sortCode : null);
        Unit unit4 = Unit.INSTANCE;
        writableNativeMap.putMap("BacsDebit", writableNativeMap5);
        WritableNativeMap writableNativeMap6 = new WritableNativeMap();
        PaymentMethod.BacsDebit bacsDebit4 = paymentMethod.bacsDebit;
        writableNativeMap6.putString("bsbNumber", bacsDebit4 != null ? bacsDebit4.sortCode : null);
        PaymentMethod.BacsDebit bacsDebit5 = paymentMethod.bacsDebit;
        writableNativeMap6.putString(BankAccountJsonParser.FIELD_FINGERPRINT, bacsDebit5 != null ? bacsDebit5.fingerprint : null);
        PaymentMethod.BacsDebit bacsDebit6 = paymentMethod.bacsDebit;
        writableNativeMap6.putString("last4", bacsDebit6 != null ? bacsDebit6.last4 : null);
        Unit unit5 = Unit.INSTANCE;
        writableNativeMap.putMap("AuBecsDebit", writableNativeMap6);
        WritableNativeMap writableNativeMap7 = new WritableNativeMap();
        PaymentMethod.Ideal ideal = paymentMethod.ideal;
        writableNativeMap7.putString("bankName", ideal != null ? ideal.bank : null);
        PaymentMethod.Ideal ideal2 = paymentMethod.ideal;
        writableNativeMap7.putString("bankIdentifierCode", ideal2 != null ? ideal2.bankIdentifierCode : null);
        Unit unit6 = Unit.INSTANCE;
        writableNativeMap.putMap("Ideal", writableNativeMap7);
        WritableNativeMap writableNativeMap8 = new WritableNativeMap();
        PaymentMethod.Fpx fpx = paymentMethod.fpx;
        writableNativeMap8.putString("accountHolderType", fpx != null ? fpx.accountHolderType : null);
        PaymentMethod.Fpx fpx2 = paymentMethod.fpx;
        writableNativeMap8.putString("bank", fpx2 != null ? fpx2.bank : null);
        Unit unit7 = Unit.INSTANCE;
        writableNativeMap.putMap("Fpx", writableNativeMap8);
        WritableNativeMap writableNativeMap9 = new WritableNativeMap();
        PaymentMethod.Upi upi = paymentMethod.upi;
        writableNativeMap9.putString("vpa", upi != null ? upi.vpa : null);
        Unit unit8 = Unit.INSTANCE;
        writableNativeMap.putMap("Upi", writableNativeMap9);
        WritableNativeMap writableNativeMap10 = new WritableNativeMap();
        PaymentMethod.USBankAccount uSBankAccount = paymentMethod.usBankAccount;
        writableNativeMap10.putString("routingNumber", uSBankAccount != null ? uSBankAccount.routingNumber : null);
        PaymentMethod.USBankAccount uSBankAccount2 = paymentMethod.usBankAccount;
        writableNativeMap10.putString("accountType", mapFromUSBankAccountType(uSBankAccount2 != null ? uSBankAccount2.accountType : null));
        PaymentMethod.USBankAccount uSBankAccount3 = paymentMethod.usBankAccount;
        writableNativeMap10.putString("accountHolderType", mapFromUSBankAccountHolderType(uSBankAccount3 != null ? uSBankAccount3.accountHolderType : null));
        PaymentMethod.USBankAccount uSBankAccount4 = paymentMethod.usBankAccount;
        writableNativeMap10.putString("last4", uSBankAccount4 != null ? uSBankAccount4.last4 : null);
        PaymentMethod.USBankAccount uSBankAccount5 = paymentMethod.usBankAccount;
        writableNativeMap10.putString("bankName", uSBankAccount5 != null ? uSBankAccount5.bankName : null);
        PaymentMethod.USBankAccount uSBankAccount6 = paymentMethod.usBankAccount;
        writableNativeMap10.putString("linkedAccount", uSBankAccount6 != null ? uSBankAccount6.financialConnectionsAccount : null);
        PaymentMethod.USBankAccount uSBankAccount7 = paymentMethod.usBankAccount;
        writableNativeMap10.putString(BankAccountJsonParser.FIELD_FINGERPRINT, uSBankAccount7 != null ? uSBankAccount7.fingerprint : null);
        PaymentMethod.USBankAccount uSBankAccount8 = paymentMethod.usBankAccount;
        writableNativeMap10.putString("preferredNetworks", (uSBankAccount8 == null || (uSBankNetworks2 = uSBankAccount8.networks) == null) ? null : uSBankNetworks2.getPreferred());
        PaymentMethod.USBankAccount uSBankAccount9 = paymentMethod.usBankAccount;
        Object supported = (uSBankAccount9 == null || (uSBankNetworks = uSBankAccount9.networks) == null) ? null : uSBankNetworks.getSupported();
        writableNativeMap10.putArray("supportedNetworks", supported instanceof ReadableArray ? (ReadableArray) supported : null);
        Unit unit9 = Unit.INSTANCE;
        writableNativeMap.putMap("USBankAccount", writableNativeMap10);
        return writableNativeMap;
    }

    public static final WritableMap mapFromPaymentIntentResult(PaymentIntent paymentIntent) {
        WritableMap writableMapMapFromPaymentMethod;
        PaymentMethod paymentMethod;
        Intrinsics.checkNotNullParameter(paymentIntent, "paymentIntent");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("id", paymentIntent.getId());
        writableNativeMap.putString("clientSecret", paymentIntent.getClientSecret());
        writableNativeMap.putBoolean(TokenJsonParser.FIELD_LIVEMODE, paymentIntent.isLiveMode());
        writableNativeMap.putString("paymentMethodId", paymentIntent.getPaymentMethodId());
        PaymentMethod paymentMethod2 = paymentIntent.getPaymentMethod();
        if (paymentMethod2 == null || (writableMapMapFromPaymentMethod = mapFromPaymentMethod(paymentMethod2)) == null) {
            writableMapMapFromPaymentMethod = null;
        }
        writableNativeMap.putMap("paymentMethod", writableMapMapFromPaymentMethod);
        writableNativeMap.putString("receiptEmail", paymentIntent.getReceiptEmail());
        writableNativeMap.putString("currency", paymentIntent.getCurrency());
        writableNativeMap.putString("status", mapIntentStatus(paymentIntent.getStatus()));
        writableNativeMap.putString("description", paymentIntent.getDescription());
        writableNativeMap.putString("receiptEmail", paymentIntent.getReceiptEmail());
        writableNativeMap.putString("created", convertToUnixTimestamp(paymentIntent.getCreated()));
        writableNativeMap.putString("captureMethod", mapCaptureMethod(paymentIntent.getCaptureMethod()));
        writableNativeMap.putString("confirmationMethod", mapConfirmationMethod(paymentIntent.getConfirmationMethod()));
        writableNativeMap.putMap("nextAction", mapNextAction(paymentIntent.getNextActionType(), paymentIntent.getNextActionData()));
        writableNativeMap.putNull("lastPaymentError");
        writableNativeMap.putNull("shipping");
        writableNativeMap.putNull(CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT);
        writableNativeMap.putNull("canceledAt");
        PaymentIntent.Error lastPaymentError = paymentIntent.getLastPaymentError();
        if (lastPaymentError != null) {
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            writableNativeMap2.putString("code", lastPaymentError.getCode());
            writableNativeMap2.putString("message", lastPaymentError.getMessage());
            writableNativeMap2.putString("type", mapFromPaymentIntentLastErrorType(lastPaymentError.getType()));
            writableNativeMap2.putString("declineCode", lastPaymentError.getDeclineCode());
            PaymentIntent.Error lastPaymentError2 = paymentIntent.getLastPaymentError();
            if (lastPaymentError2 != null && (paymentMethod = lastPaymentError2.getPaymentMethod()) != null) {
                writableNativeMap2.putMap("paymentMethod", mapFromPaymentMethod(paymentMethod));
            }
            writableNativeMap.putMap("lastPaymentError", writableNativeMap2);
        }
        PaymentIntent.Shipping shipping = paymentIntent.getShipping();
        if (shipping != null) {
            writableNativeMap.putMap("shipping", mapIntentShipping(shipping));
        }
        if (paymentIntent.getAmount() != null) {
            writableNativeMap.putDouble(CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, r1.longValue());
        }
        writableNativeMap.putString("canceledAt", convertToUnixTimestamp(paymentIntent.getCanceledAt()));
        return writableNativeMap;
    }

    public static final String mapFromMicrodepositType(MicrodepositType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        int i = WhenMappings.$EnumSwitchMapping$10[type.ordinal()];
        if (i == 1) {
            return "amounts";
        }
        if (i == 2) {
            return "descriptorCode";
        }
        return "unknown";
    }

    public static final WritableNativeMap mapNextAction(StripeIntent.NextActionType nextActionType, StripeIntent.NextActionData nextActionData) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        switch (nextActionType == null ? -1 : WhenMappings.$EnumSwitchMapping$11[nextActionType.ordinal()]) {
            case -1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                StripeIntent.NextActionData.RedirectToUrl redirectToUrl = nextActionData instanceof StripeIntent.NextActionData.RedirectToUrl ? (StripeIntent.NextActionData.RedirectToUrl) nextActionData : null;
                if (redirectToUrl != null) {
                    writableNativeMap.putString("type", "urlRedirect");
                    writableNativeMap.putString("redirectUrl", redirectToUrl.getUrl().toString());
                }
                return writableNativeMap;
            case 2:
                StripeIntent.NextActionData.VerifyWithMicrodeposits verifyWithMicrodeposits = nextActionData instanceof StripeIntent.NextActionData.VerifyWithMicrodeposits ? (StripeIntent.NextActionData.VerifyWithMicrodeposits) nextActionData : null;
                if (verifyWithMicrodeposits != null) {
                    writableNativeMap.putString("type", "verifyWithMicrodeposits");
                    writableNativeMap.putString("arrivalDate", String.valueOf(verifyWithMicrodeposits.getArrivalDate()));
                    writableNativeMap.putString("redirectUrl", verifyWithMicrodeposits.getHostedVerificationUrl());
                    writableNativeMap.putString("microdepositType", mapFromMicrodepositType(verifyWithMicrodeposits.getMicrodepositType()));
                    return writableNativeMap;
                }
                return writableNativeMap;
            case 3:
                StripeIntent.NextActionData.DisplayOxxoDetails displayOxxoDetails = nextActionData instanceof StripeIntent.NextActionData.DisplayOxxoDetails ? (StripeIntent.NextActionData.DisplayOxxoDetails) nextActionData : null;
                if (displayOxxoDetails != null) {
                    writableNativeMap.putString("type", "oxxoVoucher");
                    writableNativeMap.putInt("expiration", displayOxxoDetails.getExpiresAfter());
                    writableNativeMap.putString("voucherURL", displayOxxoDetails.getHostedVoucherUrl());
                    writableNativeMap.putString("voucherNumber", displayOxxoDetails.getNumber());
                    return writableNativeMap;
                }
                return writableNativeMap;
            case 4:
                StripeIntent.NextActionData.WeChatPayRedirect weChatPayRedirect = nextActionData instanceof StripeIntent.NextActionData.WeChatPayRedirect ? (StripeIntent.NextActionData.WeChatPayRedirect) nextActionData : null;
                if (weChatPayRedirect != null) {
                    writableNativeMap.putString("type", "weChatRedirect");
                    writableNativeMap.putString("redirectUrl", weChatPayRedirect.getWeChat().getQrCodeUrl());
                    return writableNativeMap;
                }
                return writableNativeMap;
            case 5:
                return null;
            case 10:
                StripeIntent.NextActionData.DisplayBoletoDetails displayBoletoDetails = nextActionData instanceof StripeIntent.NextActionData.DisplayBoletoDetails ? (StripeIntent.NextActionData.DisplayBoletoDetails) nextActionData : null;
                if (displayBoletoDetails != null) {
                    writableNativeMap.putString("type", "boletoVoucher");
                    writableNativeMap.putString("voucherURL", displayBoletoDetails.getHostedVoucherUrl());
                    return writableNativeMap;
                }
                return writableNativeMap;
            case 11:
                StripeIntent.NextActionData.DisplayKonbiniDetails displayKonbiniDetails = nextActionData instanceof StripeIntent.NextActionData.DisplayKonbiniDetails ? (StripeIntent.NextActionData.DisplayKonbiniDetails) nextActionData : null;
                if (displayKonbiniDetails != null) {
                    writableNativeMap.putString("type", "konbiniVoucher");
                    writableNativeMap.putString("voucherURL", displayKonbiniDetails.getHostedVoucherUrl());
                    return writableNativeMap;
                }
                return writableNativeMap;
            case 12:
                StripeIntent.NextActionData.SwishRedirect swishRedirect = nextActionData instanceof StripeIntent.NextActionData.SwishRedirect ? (StripeIntent.NextActionData.SwishRedirect) nextActionData : null;
                if (swishRedirect != null) {
                    writableNativeMap.putString("type", "swishRedirect");
                    writableNativeMap.putString("mobileAuthUrl", swishRedirect.getMobileAuthUrl());
                    return writableNativeMap;
                }
                return writableNativeMap;
            case 13:
                StripeIntent.NextActionData.DisplayMultibancoDetails displayMultibancoDetails = nextActionData instanceof StripeIntent.NextActionData.DisplayMultibancoDetails ? (StripeIntent.NextActionData.DisplayMultibancoDetails) nextActionData : null;
                if (displayMultibancoDetails != null) {
                    writableNativeMap.putString("type", "multibanco");
                    writableNativeMap.putString("voucherURL", displayMultibancoDetails.getHostedVoucherUrl());
                    return writableNativeMap;
                }
                return writableNativeMap;
        }
    }

    public static final String mapFromPaymentIntentLastErrorType(PaymentIntent.Error.Type type) {
        switch (type == null ? -1 : WhenMappings.$EnumSwitchMapping$12[type.ordinal()]) {
            case 1:
                return "api_connection_error";
            case 2:
                return "authentication_error";
            case 3:
                return "api_error";
            case 4:
                return "card_error";
            case 5:
                return "idempotency_error";
            case 6:
                return "invalid_request_error";
            case 7:
                return "rate_limit_error";
            default:
                return null;
        }
    }

    public static final String mapFromSetupIntentLastErrorType(SetupIntent.Error.Type type) {
        switch (type == null ? -1 : WhenMappings.$EnumSwitchMapping$13[type.ordinal()]) {
            case 1:
                return "api_connection_error";
            case 2:
                return "authentication_error";
            case 3:
                return "api_error";
            case 4:
                return "card_error";
            case 5:
                return "idempotency_error";
            case 6:
                return "invalid_request_error";
            case 7:
                return "rate_limit_error";
            default:
                return null;
        }
    }

    public static /* synthetic */ String getValOr$default(ReadableMap readableMap, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        return getValOr(readableMap, str, str2);
    }

    public static final String getValOr(ReadableMap readableMap, String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (readableMap != null) {
            String string = readableMap.hasKey(key) ? readableMap.getString(key) : str;
            if (string != null) {
                return string;
            }
        }
        return str;
    }

    public static final Address mapToAddress(ReadableMap readableMap, Address address) {
        Address.Builder builder = new Address.Builder();
        if (readableMap != null) {
            builder.setPostalCode(getValOr$default(readableMap, HintConstants.AUTOFILL_HINT_POSTAL_CODE, null, 4, null)).setCity(getValOr$default(readableMap, "city", null, 4, null)).setCountry(getValOr$default(readableMap, "country", null, 4, null)).setLine1(getValOr$default(readableMap, "line1", null, 4, null)).setLine2(getValOr$default(readableMap, "line2", null, 4, null)).setState(getValOr$default(readableMap, ServerProtocol.DIALOG_PARAM_STATE, null, 4, null));
        }
        if (address != null) {
            String postalCode = address.getPostalCode();
            if (postalCode != null && postalCode.length() != 0) {
                builder.setPostalCode(address.getPostalCode());
            }
            String country = address.getCountry();
            if (country != null && country.length() != 0) {
                builder.setCountry(address.getCountry());
            }
        }
        return builder.build();
    }

    public static final PaymentMethod.BillingDetails mapToBillingDetails(ReadableMap readableMap, Address address) {
        if (readableMap == null && address == null) {
            return null;
        }
        Address addressMapToAddress = mapToAddress(getMapOrNull(readableMap, "address"), address);
        PaymentMethod.BillingDetails.Builder builder = new PaymentMethod.BillingDetails.Builder();
        if (readableMap != null) {
            builder.setName(getValOr$default(readableMap, "name", null, 4, null)).setPhone(getValOr$default(readableMap, "phone", null, 4, null)).setEmail(getValOr$default(readableMap, "email", null, 4, null));
        }
        builder.setAddress(addressMapToAddress);
        return builder.build();
    }

    public static final Map<String, String> mapToMetadata(ReadableMap readableMap) {
        HashMap<String, Object> hashMap;
        if (readableMap == null || (hashMap = readableMap.toHashMap()) == null) {
            return null;
        }
        HashMap<String, Object> map = hashMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        return linkedHashMap;
    }

    public static final ConfirmPaymentIntentParams.Shipping mapToShippingDetails(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        Address addressMapToAddress = mapToAddress(getMapOrNull(readableMap, "address"), null);
        String valOr$default = getValOr$default(readableMap, "name", null, 4, null);
        if (valOr$default == null) {
            valOr$default = "";
        }
        return new ConfirmPaymentIntentParams.Shipping(addressMapToAddress, valOr$default, null, null, null, 28, null);
    }

    private static final String getStringOrNull(ReadableMap readableMap, String str) {
        if (readableMap == null || !readableMap.hasKey(str)) {
            return null;
        }
        return readableMap.getString(str);
    }

    public static final Integer getIntOrNull(ReadableMap readableMap, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (readableMap == null || !readableMap.hasKey(key)) {
            return null;
        }
        return Integer.valueOf(readableMap.getInt(key));
    }

    public static final ReadableMap getMapOrNull(ReadableMap readableMap, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (readableMap == null || !readableMap.hasKey(key)) {
            return null;
        }
        return readableMap.getMap(key);
    }

    public static final boolean getBooleanOrFalse(ReadableMap readableMap, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (readableMap == null || !readableMap.hasKey(key)) {
            return false;
        }
        return readableMap.getBoolean(key);
    }

    private static final String convertToUnixTimestamp(long j) {
        return String.valueOf(j * 1000);
    }

    public static final PaymentAuthConfig.Stripe3ds2UiCustomization mapToUICustomization(ReadableMap params) throws RuntimeException {
        Intrinsics.checkNotNullParameter(params, "params");
        ReadableMap mapOrNull = getMapOrNull(params, "label");
        ReadableMap map = params.getMap("navigationBar");
        ReadableMap mapOrNull2 = getMapOrNull(params, "textField");
        ReadableMap mapOrNull3 = getMapOrNull(params, "submitButton");
        ReadableMap mapOrNull4 = getMapOrNull(params, "cancelButton");
        ReadableMap mapOrNull5 = getMapOrNull(params, "nextButton");
        ReadableMap mapOrNull6 = getMapOrNull(params, "continueButton");
        ReadableMap mapOrNull7 = getMapOrNull(params, "resendButton");
        PaymentAuthConfig.Stripe3ds2LabelCustomization.Builder builder = new PaymentAuthConfig.Stripe3ds2LabelCustomization.Builder();
        PaymentAuthConfig.Stripe3ds2ToolbarCustomization.Builder builder2 = new PaymentAuthConfig.Stripe3ds2ToolbarCustomization.Builder();
        PaymentAuthConfig.Stripe3ds2TextBoxCustomization.Builder builder3 = new PaymentAuthConfig.Stripe3ds2TextBoxCustomization.Builder();
        PaymentAuthConfig.Stripe3ds2ButtonCustomization.Builder builder4 = new PaymentAuthConfig.Stripe3ds2ButtonCustomization.Builder();
        PaymentAuthConfig.Stripe3ds2ButtonCustomization.Builder builder5 = new PaymentAuthConfig.Stripe3ds2ButtonCustomization.Builder();
        PaymentAuthConfig.Stripe3ds2ButtonCustomization.Builder builder6 = new PaymentAuthConfig.Stripe3ds2ButtonCustomization.Builder();
        PaymentAuthConfig.Stripe3ds2ButtonCustomization.Builder builder7 = new PaymentAuthConfig.Stripe3ds2ButtonCustomization.Builder();
        PaymentAuthConfig.Stripe3ds2ButtonCustomization.Builder builder8 = new PaymentAuthConfig.Stripe3ds2ButtonCustomization.Builder();
        String stringOrNull = getStringOrNull(mapOrNull, "headingTextColor");
        if (stringOrNull != null) {
            builder.setHeadingTextColor(stringOrNull);
        }
        String stringOrNull2 = getStringOrNull(mapOrNull, Common.TEXT_COLOR);
        if (stringOrNull2 != null) {
            builder.setTextColor(stringOrNull2);
        }
        Integer intOrNull = getIntOrNull(mapOrNull, "headingFontSize");
        if (intOrNull != null) {
            builder.setHeadingTextFontSize(intOrNull.intValue());
        }
        Integer intOrNull2 = getIntOrNull(mapOrNull, "textFontSize");
        if (intOrNull2 != null) {
            builder.setTextFontSize(intOrNull2.intValue());
        }
        String stringOrNull3 = getStringOrNull(map, "headerText");
        if (stringOrNull3 != null) {
            builder2.setHeaderText(stringOrNull3);
        }
        String stringOrNull4 = getStringOrNull(map, "buttonText");
        if (stringOrNull4 != null) {
            builder2.setButtonText(stringOrNull4);
        }
        String stringOrNull5 = getStringOrNull(map, Common.TEXT_COLOR);
        if (stringOrNull5 != null) {
            builder2.setTextColor(stringOrNull5);
        }
        String stringOrNull6 = getStringOrNull(map, "statusBarColor");
        if (stringOrNull6 != null) {
            builder2.setStatusBarColor(stringOrNull6);
        }
        String stringOrNull7 = getStringOrNull(map, ViewProps.BACKGROUND_COLOR);
        if (stringOrNull7 != null) {
            builder2.setBackgroundColor(stringOrNull7);
        }
        Integer intOrNull3 = getIntOrNull(map, "textFontSize");
        if (intOrNull3 != null) {
            builder2.setTextFontSize(intOrNull3.intValue());
        }
        String stringOrNull8 = getStringOrNull(mapOrNull2, ViewProps.BORDER_COLOR);
        if (stringOrNull8 != null) {
            builder3.setBorderColor(stringOrNull8);
        }
        String stringOrNull9 = getStringOrNull(mapOrNull2, Common.TEXT_COLOR);
        if (stringOrNull9 != null) {
            builder3.setTextColor(stringOrNull9);
        }
        Integer intOrNull4 = getIntOrNull(mapOrNull2, "borderWidth");
        if (intOrNull4 != null) {
            builder3.setBorderWidth(intOrNull4.intValue());
        }
        Integer intOrNull5 = getIntOrNull(mapOrNull2, "borderRadius");
        if (intOrNull5 != null) {
            builder3.setCornerRadius(intOrNull5.intValue());
        }
        Integer intOrNull6 = getIntOrNull(mapOrNull2, "textFontSize");
        if (intOrNull6 != null) {
            builder3.setTextFontSize(intOrNull6.intValue());
        }
        String stringOrNull10 = getStringOrNull(mapOrNull3, ViewProps.BACKGROUND_COLOR);
        if (stringOrNull10 != null) {
            builder4.setBackgroundColor(stringOrNull10);
        }
        Integer intOrNull7 = getIntOrNull(mapOrNull3, "borderRadius");
        if (intOrNull7 != null) {
            builder4.setCornerRadius(intOrNull7.intValue());
        }
        String stringOrNull11 = getStringOrNull(mapOrNull3, Common.TEXT_COLOR);
        if (stringOrNull11 != null) {
            builder4.setTextColor(stringOrNull11);
        }
        Integer intOrNull8 = getIntOrNull(mapOrNull3, "textFontSize");
        if (intOrNull8 != null) {
            builder4.setTextFontSize(intOrNull8.intValue());
        }
        String stringOrNull12 = getStringOrNull(mapOrNull4, ViewProps.BACKGROUND_COLOR);
        if (stringOrNull12 != null) {
            builder5.setBackgroundColor(stringOrNull12);
        }
        Integer intOrNull9 = getIntOrNull(mapOrNull4, "borderRadius");
        if (intOrNull9 != null) {
            builder5.setCornerRadius(intOrNull9.intValue());
        }
        String stringOrNull13 = getStringOrNull(mapOrNull4, Common.TEXT_COLOR);
        if (stringOrNull13 != null) {
            builder5.setTextColor(stringOrNull13);
        }
        Integer intOrNull10 = getIntOrNull(mapOrNull4, "textFontSize");
        if (intOrNull10 != null) {
            builder5.setTextFontSize(intOrNull10.intValue());
        }
        String stringOrNull14 = getStringOrNull(mapOrNull6, ViewProps.BACKGROUND_COLOR);
        if (stringOrNull14 != null) {
            builder7.setBackgroundColor(stringOrNull14);
        }
        Integer intOrNull11 = getIntOrNull(mapOrNull6, "borderRadius");
        if (intOrNull11 != null) {
            builder7.setCornerRadius(intOrNull11.intValue());
        }
        String stringOrNull15 = getStringOrNull(mapOrNull6, Common.TEXT_COLOR);
        if (stringOrNull15 != null) {
            builder7.setTextColor(stringOrNull15);
        }
        Integer intOrNull12 = getIntOrNull(mapOrNull6, "textFontSize");
        if (intOrNull12 != null) {
            builder7.setTextFontSize(intOrNull12.intValue());
        }
        String stringOrNull16 = getStringOrNull(mapOrNull5, ViewProps.BACKGROUND_COLOR);
        if (stringOrNull16 != null) {
            builder6.setBackgroundColor(stringOrNull16);
        }
        Integer intOrNull13 = getIntOrNull(mapOrNull5, "borderRadius");
        if (intOrNull13 != null) {
            builder6.setCornerRadius(intOrNull13.intValue());
        }
        String stringOrNull17 = getStringOrNull(mapOrNull5, Common.TEXT_COLOR);
        if (stringOrNull17 != null) {
            builder6.setTextColor(stringOrNull17);
        }
        Integer intOrNull14 = getIntOrNull(mapOrNull5, "textFontSize");
        if (intOrNull14 != null) {
            builder6.setTextFontSize(intOrNull14.intValue());
        }
        String stringOrNull18 = getStringOrNull(mapOrNull7, ViewProps.BACKGROUND_COLOR);
        if (stringOrNull18 != null) {
            builder8.setBackgroundColor(stringOrNull18);
        }
        Integer intOrNull15 = getIntOrNull(mapOrNull7, "borderRadius");
        if (intOrNull15 != null) {
            builder8.setCornerRadius(intOrNull15.intValue());
        }
        String stringOrNull19 = getStringOrNull(mapOrNull7, Common.TEXT_COLOR);
        if (stringOrNull19 != null) {
            builder8.setTextColor(stringOrNull19);
        }
        Integer intOrNull16 = getIntOrNull(mapOrNull7, "textFontSize");
        if (intOrNull16 != null) {
            builder8.setTextFontSize(intOrNull16.intValue());
        }
        PaymentAuthConfig.Stripe3ds2UiCustomization.Builder buttonCustomization = new PaymentAuthConfig.Stripe3ds2UiCustomization.Builder().setLabelCustomization(builder.build()).setToolbarCustomization(builder2.build()).setButtonCustomization(builder4.build(), PaymentAuthConfig.Stripe3ds2UiCustomization.ButtonType.SUBMIT).setButtonCustomization(builder7.build(), PaymentAuthConfig.Stripe3ds2UiCustomization.ButtonType.CONTINUE).setButtonCustomization(builder6.build(), PaymentAuthConfig.Stripe3ds2UiCustomization.ButtonType.SELECT).setButtonCustomization(builder5.build(), PaymentAuthConfig.Stripe3ds2UiCustomization.ButtonType.CANCEL).setButtonCustomization(builder8.build(), PaymentAuthConfig.Stripe3ds2UiCustomization.ButtonType.RESEND);
        String stringOrNull20 = getStringOrNull(params, "accentColor");
        if (stringOrNull20 != null) {
            buttonCustomization.setAccentColor(stringOrNull20);
        }
        return buttonCustomization.build();
    }

    public static final WritableMap mapFromSetupIntentResult(SetupIntent setupIntent) {
        WritableMap writableMapMapFromPaymentMethod;
        PaymentMethod paymentMethod;
        Intrinsics.checkNotNullParameter(setupIntent, "setupIntent");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Intrinsics.checkNotNullExpressionValue(writableArrayCreateArray, "createArray(...)");
        writableNativeMap.putString("id", setupIntent.getId());
        writableNativeMap.putString("status", mapIntentStatus(setupIntent.getStatus()));
        writableNativeMap.putString("description", setupIntent.getDescription());
        writableNativeMap.putBoolean(TokenJsonParser.FIELD_LIVEMODE, setupIntent.isLiveMode());
        writableNativeMap.putString("clientSecret", setupIntent.getClientSecret());
        writableNativeMap.putString("paymentMethodId", setupIntent.getPaymentMethodId());
        PaymentMethod paymentMethod2 = setupIntent.getPaymentMethod();
        if (paymentMethod2 == null || (writableMapMapFromPaymentMethod = mapFromPaymentMethod(paymentMethod2)) == null) {
            writableMapMapFromPaymentMethod = null;
        }
        writableNativeMap.putMap("paymentMethod", writableMapMapFromPaymentMethod);
        writableNativeMap.putString("usage", mapSetupIntentUsage(setupIntent.getUsage()));
        writableNativeMap.putString("created", convertToUnixTimestamp(setupIntent.getCreated()));
        writableNativeMap.putMap("nextAction", mapNextAction(setupIntent.getNextActionType(), setupIntent.getNextActionData()));
        SetupIntent.Error lastSetupError = setupIntent.getLastSetupError();
        if (lastSetupError != null) {
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            writableNativeMap2.putString("code", lastSetupError.getCode());
            writableNativeMap2.putString("message", lastSetupError.getMessage());
            writableNativeMap2.putString("type", mapFromSetupIntentLastErrorType(lastSetupError.getType()));
            writableNativeMap2.putString("declineCode", lastSetupError.getDeclineCode());
            SetupIntent.Error lastSetupError2 = setupIntent.getLastSetupError();
            if (lastSetupError2 != null && (paymentMethod = lastSetupError2.getPaymentMethod()) != null) {
                writableNativeMap2.putMap("paymentMethod", mapFromPaymentMethod(paymentMethod));
            }
            writableNativeMap.putMap("lastSetupError", writableNativeMap2);
        }
        Iterator<String> it = setupIntent.getPaymentMethodTypes().iterator();
        while (it.hasNext()) {
            PaymentMethod.Type typeFromCode = PaymentMethod.Type.INSTANCE.fromCode(it.next());
            if (typeFromCode != null) {
                writableArrayCreateArray.pushString(mapPaymentMethodType(typeFromCode));
            }
        }
        writableNativeMap.putArray("paymentMethodTypes", writableArrayCreateArray);
        return writableNativeMap;
    }

    public static final String mapSetupIntentUsage(StripeIntent.Usage usage) {
        int i = usage == null ? -1 : WhenMappings.$EnumSwitchMapping$14[usage.ordinal()];
        if (i == 1) {
            return "OffSession";
        }
        if (i == 2) {
            return "OnSession";
        }
        if (i == 3) {
            return "OneTime";
        }
        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public static final ConfirmPaymentIntentParams.SetupFutureUsage mapToPaymentIntentFutureUsage(String str) {
        if (Intrinsics.areEqual(str, "OffSession")) {
            return ConfirmPaymentIntentParams.SetupFutureUsage.OffSession;
        }
        if (Intrinsics.areEqual(str, "OnSession")) {
            return ConfirmPaymentIntentParams.SetupFutureUsage.OnSession;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Bundle toBundleObject(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        if (readableMap != null) {
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                switch (WhenMappings.$EnumSwitchMapping$15[readableMap.getType(strNextKey).ordinal()]) {
                    case 1:
                        bundle.putString(strNextKey, null);
                        break;
                    case 2:
                        bundle.putBoolean(strNextKey, readableMap.getBoolean(strNextKey));
                        break;
                    case 3:
                        try {
                            int i = readableMap.getInt(strNextKey);
                            double d = readableMap.getDouble(strNextKey);
                            if (d - i != AudioStats.AUDIO_AMPLITUDE_NONE) {
                                bundle.putDouble(strNextKey, d);
                            } else {
                                bundle.putInt(strNextKey, i);
                            }
                            Unit unit = Unit.INSTANCE;
                            break;
                        } catch (Exception unused) {
                            Integer.valueOf(Log.e("toBundleException", "Failed to add number to bundle. Failed on: " + strNextKey + "."));
                            break;
                        }
                    case 4:
                        bundle.putString(strNextKey, readableMap.getString(strNextKey));
                        break;
                    case 5:
                        bundle.putBundle(strNextKey, toBundleObject(readableMap.getMap(strNextKey)));
                        break;
                    case 6:
                        ReadableArray array = readableMap.getArray(strNextKey);
                        ArrayList<Object> arrayList = array != null ? array.toArrayList() : null;
                        if (arrayList == null) {
                            bundle.putString(strNextKey, null);
                            break;
                        } else if (arrayList.isEmpty()) {
                            bundle.putStringArrayList(strNextKey, new ArrayList());
                            break;
                        } else {
                            Object objFirst = CollectionsKt.first((List<? extends Object>) arrayList);
                            if (!(objFirst instanceof String)) {
                                if (!(objFirst instanceof Integer)) {
                                    Log.e("toBundleException", "Cannot put arrays of objects into bundles. Failed on: " + strNextKey + ".");
                                    break;
                                } else {
                                    bundle.putIntegerArrayList(strNextKey, arrayList);
                                    break;
                                }
                            } else {
                                bundle.putStringArrayList(strNextKey, arrayList);
                                break;
                            }
                        }
                    default:
                        Log.e("toBundleException", "Could not convert object with key: " + strNextKey + ".");
                        break;
                }
            }
        }
        return bundle;
    }

    public static final WritableMap mapFromShippingContact(GooglePayResult googlePayResult) {
        Address address;
        Address address2;
        Address address3;
        Address address4;
        Address address5;
        Address address6;
        Address address7;
        String phone;
        Intrinsics.checkNotNullParameter(googlePayResult, "googlePayResult");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, googlePayResult.getEmail());
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        googlePayResult.getName();
        ShippingInformation shippingInformation = googlePayResult.getShippingInformation();
        String country = null;
        writableNativeMap2.putString("givenName", shippingInformation != null ? shippingInformation.getName() : null);
        writableNativeMap.putMap("name", writableNativeMap2);
        ShippingInformation shippingInformation2 = googlePayResult.getShippingInformation();
        if (shippingInformation2 == null || (phone = shippingInformation2.getPhone()) == null) {
            writableNativeMap.putString(HintConstants.AUTOFILL_HINT_PHONE_NUMBER, googlePayResult.getPhoneNumber());
        } else {
            writableNativeMap.putString(HintConstants.AUTOFILL_HINT_PHONE_NUMBER, phone);
        }
        WritableNativeMap writableNativeMap3 = new WritableNativeMap();
        ShippingInformation shippingInformation3 = googlePayResult.getShippingInformation();
        writableNativeMap3.putString("city", (shippingInformation3 == null || (address7 = shippingInformation3.getAddress()) == null) ? null : address7.getCity());
        ShippingInformation shippingInformation4 = googlePayResult.getShippingInformation();
        writableNativeMap3.putString("country", (shippingInformation4 == null || (address6 = shippingInformation4.getAddress()) == null) ? null : address6.getCountry());
        ShippingInformation shippingInformation5 = googlePayResult.getShippingInformation();
        writableNativeMap3.putString(HintConstants.AUTOFILL_HINT_POSTAL_CODE, (shippingInformation5 == null || (address5 = shippingInformation5.getAddress()) == null) ? null : address5.getPostalCode());
        ShippingInformation shippingInformation6 = googlePayResult.getShippingInformation();
        writableNativeMap3.putString(ServerProtocol.DIALOG_PARAM_STATE, (shippingInformation6 == null || (address4 = shippingInformation6.getAddress()) == null) ? null : address4.getState());
        ShippingInformation shippingInformation7 = googlePayResult.getShippingInformation();
        String line1 = (shippingInformation7 == null || (address3 = shippingInformation7.getAddress()) == null) ? null : address3.getLine1();
        ShippingInformation shippingInformation8 = googlePayResult.getShippingInformation();
        String line2 = (shippingInformation8 == null || (address2 = shippingInformation8.getAddress()) == null) ? null : address2.getLine2();
        writableNativeMap3.putString("street", (line1 != null ? String.valueOf(line1) : "") + (line2 != null ? "\n" + line2 : ""));
        ShippingInformation shippingInformation9 = googlePayResult.getShippingInformation();
        if (shippingInformation9 != null && (address = shippingInformation9.getAddress()) != null) {
            country = address.getCountry();
        }
        writableNativeMap3.putString("isoCountryCode", country);
        writableNativeMap.putMap(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS, writableNativeMap3);
        return writableNativeMap;
    }

    public static final List<CardBrand> mapToPreferredNetworks(ArrayList<Integer> arrayList) {
        if (arrayList == null) {
            return CollectionsKt.emptyList();
        }
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to(0, CardBrand.JCB), TuplesKt.to(1, CardBrand.AmericanExpress), TuplesKt.to(2, CardBrand.CartesBancaires), TuplesKt.to(3, CardBrand.DinersClub), TuplesKt.to(4, CardBrand.Discover), TuplesKt.to(5, CardBrand.MasterCard), TuplesKt.to(6, CardBrand.UnionPay), TuplesKt.to(7, CardBrand.Visa), TuplesKt.to(8, CardBrand.Unknown));
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            CardBrand cardBrand = (CardBrand) mapMapOf.get(Integer.valueOf(((Number) it.next()).intValue()));
            if (cardBrand != null) {
                arrayList2.add(cardBrand);
            }
        }
        return arrayList2;
    }

    public static final WritableMap mapFromFinancialConnectionsEvent(FinancialConnectionsEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putString("name", event.getName().getValue());
        writableMapCreateMap.putMap("metadata", toReadableMap(event.getMetadata().toMap()));
        return writableMapCreateMap;
    }

    private static final WritableArray toWritableArray(List<? extends Object> list) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Intrinsics.checkNotNullExpressionValue(writableArrayCreateArray, "createArray(...)");
        for (Object obj : list) {
            if (obj == null) {
                writableArrayCreateArray.pushNull();
            } else if (obj instanceof Boolean) {
                writableArrayCreateArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                writableArrayCreateArray.pushInt(((Number) obj).intValue());
            } else if (obj instanceof Double) {
                writableArrayCreateArray.pushDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                writableArrayCreateArray.pushString((String) obj);
            } else if (obj instanceof Map) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                writableArrayCreateArray.pushMap(toReadableMap((Map) obj));
            } else if (obj instanceof List) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                writableArrayCreateArray.pushArray(toWritableArray((List) obj));
            } else {
                writableArrayCreateArray.pushString(obj.toString());
            }
        }
        return writableArrayCreateArray;
    }

    private static final ReadableMap toReadableMap(Map<String, ? extends Object> map) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                writableMapCreateMap.putNull(key);
            } else if (value instanceof Boolean) {
                writableMapCreateMap.putBoolean(key, ((Boolean) value).booleanValue());
            } else if (value instanceof Integer) {
                writableMapCreateMap.putInt(key, ((Number) value).intValue());
            } else if (value instanceof Double) {
                writableMapCreateMap.putDouble(key, ((Number) value).doubleValue());
            } else if (value instanceof String) {
                writableMapCreateMap.putString(key, (String) value);
            } else if (value instanceof Map) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                writableMapCreateMap.putMap(key, toReadableMap((Map) value));
            } else if (value instanceof List) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                writableMapCreateMap.putArray(key, toWritableArray((List) value));
            } else {
                writableMapCreateMap.putString(key, value.toString());
            }
        }
        return writableMapCreateMap;
    }

    public static final List<PaymentSheet.CustomPaymentMethod> parseCustomPaymentMethods(Bundle bundle) {
        if (bundle == null) {
            return CollectionsKt.emptyList();
        }
        Serializable serializable = bundle.getSerializable("customPaymentMethodConfigurationReadableMap");
        HashMap map = serializable instanceof HashMap ? (HashMap) serializable : null;
        if (map != null) {
            Object obj = map.get("customPaymentMethods");
            List<HashMap> list = obj instanceof List ? (List) obj : null;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (HashMap map2 : list) {
                    Object obj2 = map2.get("id");
                    String str = obj2 instanceof String ? (String) obj2 : null;
                    if (str != null) {
                        Object obj3 = map2.get("subtitle");
                        String str2 = obj3 instanceof String ? (String) obj3 : null;
                        Object obj4 = map2.get("disableBillingDetailCollection");
                        Boolean bool = obj4 instanceof Boolean ? (Boolean) obj4 : null;
                        arrayList.add(new PaymentSheet.CustomPaymentMethod(str, str2, bool != null ? bool.booleanValue() : false));
                    }
                }
                return arrayList;
            }
        }
        return CollectionsKt.emptyList();
    }

    public static final WritableMap mapFromCustomPaymentMethod(PaymentSheet.CustomPaymentMethod customPaymentMethod, PaymentMethod.BillingDetails billingDetails) {
        Intrinsics.checkNotNullParameter(customPaymentMethod, "customPaymentMethod");
        Intrinsics.checkNotNullParameter(billingDetails, "billingDetails");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putString("id", customPaymentMethod.getId());
        Unit unit = Unit.INSTANCE;
        writableNativeMap.putMap("customPaymentMethod", writableNativeMap2);
        writableNativeMap.putMap("billingDetails", mapFromBillingDetails(billingDetails));
        return writableNativeMap;
    }
}
