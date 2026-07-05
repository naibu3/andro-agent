package com.reactnativestripesdk;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.NativeProtocol;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.Wallet;
import com.reactnativestripesdk.utils.ErrorType;
import com.reactnativestripesdk.utils.ErrorsKt;
import com.reactnativestripesdk.utils.ExtensionsKt;
import com.reactnativestripesdk.utils.MappersKt;
import com.stripe.android.ApiResultCallback;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.Stripe;
import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams;
import com.stripe.android.model.GooglePayResult;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.Token;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GooglePayRequestHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/reactnativestripesdk/GooglePayRequestHelper;", "", "<init>", "()V", "Companion", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GooglePayRequestHelper {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int LOAD_PAYMENT_DATA_REQUEST_CODE = 414243;

    /* compiled from: GooglePayRequestHelper.kt */
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fJ\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J#\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u001aJ7\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0000¢\u0006\u0002\b%J \u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010#\u001a\u00020$H\u0002J\u0018\u0010(\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\b2\u0006\u0010#\u001a\u00020$H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/reactnativestripesdk/GooglePayRequestHelper$Companion;", "", "<init>", "()V", "LOAD_PAYMENT_DATA_REQUEST_CODE", "", "createPaymentRequest", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/wallet/PaymentData;", "activity", "Landroidx/fragment/app/FragmentActivity;", "factory", "Lcom/stripe/android/GooglePayJsonFactory;", "googlePayParams", "Lcom/facebook/react/bridge/ReadableMap;", "createPaymentRequest$stripe_stripe_react_native_release", "buildShippingAddressParameters", "Lcom/stripe/android/GooglePayJsonFactory$ShippingAddressParameters;", NativeProtocol.WEB_DIALOG_PARAMS, "buildBillingAddressParameters", "Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;", "buildTransactionInfo", "Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;", "createPaymentMethod", "", "request", "createPaymentMethod$stripe_stripe_react_native_release", "handleGooglePaymentMethodResult", "resultCode", "data", "Landroid/content/Intent;", "stripe", "Lcom/stripe/android/Stripe;", "forToken", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "handleGooglePaymentMethodResult$stripe_stripe_react_native_release", "resolveWithPaymentMethod", "paymentData", "resolveWithToken", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Task<PaymentData> createPaymentRequest$stripe_stripe_react_native_release(FragmentActivity activity, GooglePayJsonFactory factory, ReadableMap googlePayParams) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(googlePayParams, "googlePayParams");
            GooglePayJsonFactory.TransactionInfo transactionInfoBuildTransactionInfo = buildTransactionInfo(googlePayParams);
            String string = googlePayParams.getString("merchantName");
            if (string == null) {
                string = "";
            }
            JSONObject jSONObjectCreatePaymentDataRequest = factory.createPaymentDataRequest(transactionInfoBuildTransactionInfo, buildBillingAddressParameters(googlePayParams.getMap("billingAddressConfig")), buildShippingAddressParameters(googlePayParams.getMap("shippingAddressConfig")), ExtensionsKt.getBooleanOr(googlePayParams, "isEmailRequired", false), new GooglePayJsonFactory.MerchantInfo(string), Boolean.valueOf(ExtensionsKt.getBooleanOr(googlePayParams, "allowCreditCards", true)));
            Wallet.WalletOptions walletOptionsBuild = new Wallet.WalletOptions.Builder().setEnvironment(googlePayParams.getBoolean("testEnv") ? 3 : 1).build();
            Intrinsics.checkNotNullExpressionValue(walletOptionsBuild, "build(...)");
            Task<PaymentData> taskLoadPaymentData = Wallet.getPaymentsClient((Activity) activity, walletOptionsBuild).loadPaymentData(PaymentDataRequest.fromJson(jSONObjectCreatePaymentDataRequest.toString()));
            Intrinsics.checkNotNullExpressionValue(taskLoadPaymentData, "loadPaymentData(...)");
            return taskLoadPaymentData;
        }

        private final GooglePayJsonFactory.ShippingAddressParameters buildShippingAddressParameters(ReadableMap params) {
            ArrayList<Object> arrayList;
            Set set = null;
            Boolean boolValueOf = params != null ? Boolean.valueOf(ExtensionsKt.getBooleanOr(params, "isPhoneNumberRequired", false)) : null;
            Boolean boolValueOf2 = params != null ? Boolean.valueOf(ExtensionsKt.getBooleanOr(params, "isRequired", false)) : null;
            if (params != null && params.hasKey("allowedCountryCodes")) {
                ReadableArray array = params.getArray("allowedCountryCodes");
                Set set2 = (array == null || (arrayList = array.toArrayList()) == null) ? null : CollectionsKt.toSet(arrayList);
                if (set2 instanceof Set) {
                    set = set2;
                }
            }
            boolean zBooleanValue = boolValueOf2 != null ? boolValueOf2.booleanValue() : false;
            if (set == null) {
                String[] iSOCountries = Locale.getISOCountries();
                Intrinsics.checkNotNullExpressionValue(iSOCountries, "getISOCountries(...)");
                set = ArraysKt.toSet(iSOCountries);
            }
            return new GooglePayJsonFactory.ShippingAddressParameters(zBooleanValue, set, boolValueOf != null ? boolValueOf.booleanValue() : false);
        }

        private final GooglePayJsonFactory.BillingAddressParameters buildBillingAddressParameters(ReadableMap params) {
            GooglePayJsonFactory.BillingAddressParameters.Format format;
            Boolean boolValueOf = params != null ? Boolean.valueOf(ExtensionsKt.getBooleanOr(params, "isRequired", false)) : null;
            Boolean boolValueOf2 = params != null ? Boolean.valueOf(ExtensionsKt.getBooleanOr(params, "isPhoneNumberRequired", false)) : null;
            String string = params != null ? params.getString("format") : null;
            if (string == null) {
                string = "";
            }
            if (Intrinsics.areEqual(string, "FULL")) {
                format = GooglePayJsonFactory.BillingAddressParameters.Format.Full;
            } else {
                format = Intrinsics.areEqual(string, "MIN") ? GooglePayJsonFactory.BillingAddressParameters.Format.Min : GooglePayJsonFactory.BillingAddressParameters.Format.Min;
            }
            return new GooglePayJsonFactory.BillingAddressParameters(boolValueOf != null ? boolValueOf.booleanValue() : false, format, boolValueOf2 != null ? boolValueOf2.booleanValue() : false);
        }

        private final GooglePayJsonFactory.TransactionInfo buildTransactionInfo(ReadableMap params) {
            String string = params.getString("merchantCountryCode");
            if (string == null) {
                string = "";
            }
            String str = string;
            String string2 = params.getString("currencyCode");
            if (string2 == null) {
                string2 = "USD";
            }
            String str2 = string2;
            int i = params.getInt(CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT);
            return new GooglePayJsonFactory.TransactionInfo(str2, GooglePayJsonFactory.TransactionInfo.TotalPriceStatus.Estimated, str, null, Integer.valueOf(i), params.getString("label"), GooglePayJsonFactory.TransactionInfo.CheckoutOption.Default, 8, null);
        }

        public final void createPaymentMethod$stripe_stripe_react_native_release(Task<PaymentData> request, FragmentActivity activity) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(activity, "activity");
            AutoResolveHelper.resolveTask(request, activity, GooglePayRequestHelper.LOAD_PAYMENT_DATA_REQUEST_CODE);
        }

        public final void handleGooglePaymentMethodResult$stripe_stripe_react_native_release(int resultCode, Intent data, Stripe stripe, boolean forToken, Promise promise) throws JSONException {
            PaymentData fromIntent;
            Status statusFromIntent;
            Intrinsics.checkNotNullParameter(stripe, "stripe");
            Intrinsics.checkNotNullParameter(promise, "promise");
            if (resultCode != -1) {
                if (resultCode == 0) {
                    promise.resolve(ErrorsKt.createError(ErrorType.Canceled.toString(), "The payment has been canceled"));
                    return;
                } else {
                    if (resultCode == 1 && (statusFromIntent = AutoResolveHelper.getStatusFromIntent(data)) != null) {
                        promise.resolve(ErrorsKt.createError(ErrorType.Failed.toString(), statusFromIntent.getStatusMessage()));
                        return;
                    }
                    return;
                }
            }
            if (data == null || (fromIntent = PaymentData.getFromIntent(data)) == null) {
                return;
            }
            if (forToken) {
                GooglePayRequestHelper.INSTANCE.resolveWithToken(fromIntent, promise);
            } else {
                GooglePayRequestHelper.INSTANCE.resolveWithPaymentMethod(fromIntent, stripe, promise);
            }
        }

        private final void resolveWithPaymentMethod(PaymentData paymentData, Stripe stripe, final Promise promise) {
            final JSONObject jSONObject = new JSONObject(paymentData.toJson());
            final WritableNativeMap writableNativeMap = new WritableNativeMap();
            Stripe.createPaymentMethod$default(stripe, PaymentMethodCreateParams.INSTANCE.createFromGooglePay(jSONObject), null, null, new ApiResultCallback<PaymentMethod>() { // from class: com.reactnativestripesdk.GooglePayRequestHelper$Companion$resolveWithPaymentMethod$1
                @Override // com.stripe.android.ApiResultCallback
                public void onError(Exception e) {
                    Intrinsics.checkNotNullParameter(e, "e");
                    promise.resolve(ErrorsKt.createError(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, e));
                }

                @Override // com.stripe.android.ApiResultCallback
                public void onSuccess(PaymentMethod result) throws JSONException {
                    Intrinsics.checkNotNullParameter(result, "result");
                    writableNativeMap.putMap("paymentMethod", MappersKt.mapFromPaymentMethod(result));
                    GooglePayResult googlePayResultFromJson = GooglePayResult.INSTANCE.fromJson(jSONObject);
                    WritableNativeMap writableNativeMap2 = writableNativeMap;
                    if (googlePayResultFromJson.getShippingInformation() != null) {
                        writableNativeMap2.putMap("shippingContact", MappersKt.mapFromShippingContact(googlePayResultFromJson));
                    }
                    promise.resolve(writableNativeMap);
                }
            }, 6, null);
        }

        private final void resolveWithToken(PaymentData paymentData, Promise promise) throws JSONException {
            GooglePayResult googlePayResultFromJson = GooglePayResult.INSTANCE.fromJson(new JSONObject(paymentData.toJson()));
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            Token token = googlePayResultFromJson.getToken();
            if (token != null) {
                writableNativeMap.putMap("token", MappersKt.mapFromToken(token));
                if (googlePayResultFromJson.getShippingInformation() != null) {
                    writableNativeMap.putMap("shippingContact", MappersKt.mapFromShippingContact(googlePayResultFromJson));
                }
                promise.resolve(writableNativeMap);
                return;
            }
            promise.resolve(ErrorsKt.createError(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Unexpected response from Google Pay. No token was found."));
        }
    }
}
