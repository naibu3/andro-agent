package com.reactnativestripesdk.utils;

import com.facebook.internal.AnalyticsEvents;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.exception.CardException;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Errors.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u001aB\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0000\u001a\u001a\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0000\u001a\b\u0010\n\u001a\u00020\u0001H\u0000\u001a\u001a\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0000\u001a\u001a\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\rH\u0000\u001a\u001c\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\u000b\u001a\u00060\u000ej\u0002`\u000fH\u0000\u001a\u0018\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0010H\u0000\u001a\b\u0010\u0011\u001a\u00020\u0001H\u0000¨\u0006\u0012"}, d2 = {"mapError", "Lcom/facebook/react/bridge/WritableMap;", "code", "", "message", "localizedMessage", "declineCode", "type", "stripeErrorCode", "createError", "createMissingActivityError", "error", "Lcom/stripe/android/model/PaymentIntent$Error;", "Lcom/stripe/android/model/SetupIntent$Error;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "createMissingInitError", "stripe_stripe-react-native_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ErrorsKt {
    public static final WritableMap mapError(String code, String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(code, "code");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putString("code", code);
        writableNativeMap2.putString("message", str);
        writableNativeMap2.putString("localizedMessage", str2);
        writableNativeMap2.putString("declineCode", str3);
        writableNativeMap2.putString("type", str4);
        writableNativeMap2.putString("stripeErrorCode", str5);
        writableNativeMap.putMap("error", writableNativeMap2);
        return writableNativeMap;
    }

    public static final WritableMap createError(String code, String str) {
        Intrinsics.checkNotNullParameter(code, "code");
        return mapError(code, str, str, null, null, null);
    }

    public static final WritableMap createMissingActivityError() {
        return mapError(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Activity doesn't exist yet. You can safely retry this method.", null, null, null, null);
    }

    public static final WritableMap createError(String code, PaymentIntent.Error error) {
        PaymentIntent.Error.Type type;
        Intrinsics.checkNotNullParameter(code, "code");
        return mapError(code, error != null ? error.getMessage() : null, error != null ? error.getMessage() : null, error != null ? error.getDeclineCode() : null, (error == null || (type = error.getType()) == null) ? null : type.getCode(), error != null ? error.getCode() : null);
    }

    public static final WritableMap createError(String code, SetupIntent.Error error) {
        SetupIntent.Error.Type type;
        Intrinsics.checkNotNullParameter(code, "code");
        return mapError(code, error != null ? error.getMessage() : null, error != null ? error.getMessage() : null, error != null ? error.getDeclineCode() : null, (error == null || (type = error.getType()) == null) ? null : type.getCode(), error != null ? error.getCode() : null);
    }

    public static final WritableMap createError(String code, Exception error) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(error, "error");
        if (error instanceof CardException) {
            String message = error.getMessage();
            CardException cardException = (CardException) error;
            String localizedMessage = cardException.getLocalizedMessage();
            String declineCode = cardException.getDeclineCode();
            StripeError stripeError = cardException.getStripeError();
            String type = stripeError != null ? stripeError.getType() : null;
            StripeError stripeError2 = cardException.getStripeError();
            return mapError(code, message, localizedMessage, declineCode, type, stripeError2 != null ? stripeError2.getCode() : null);
        }
        if (error instanceof InvalidRequestException) {
            String code2 = null;
            String message2 = error.getMessage();
            InvalidRequestException invalidRequestException = (InvalidRequestException) error;
            String localizedMessage2 = invalidRequestException.getLocalizedMessage();
            StripeError stripeError3 = invalidRequestException.getStripeError();
            String declineCode2 = stripeError3 != null ? stripeError3.getDeclineCode() : null;
            StripeError stripeError4 = invalidRequestException.getStripeError();
            String type2 = stripeError4 != null ? stripeError4.getType() : null;
            StripeError stripeError5 = invalidRequestException.getStripeError();
            if (stripeError5 != null) {
                code2 = stripeError5.getCode();
            }
            return mapError(code, message2, localizedMessage2, declineCode2, type2, code2);
        }
        String code3 = null;
        if (error instanceof AuthenticationException) {
            String message3 = error.getMessage();
            AuthenticationException authenticationException = (AuthenticationException) error;
            String localizedMessage3 = authenticationException.getLocalizedMessage();
            StripeError stripeError6 = authenticationException.getStripeError();
            String declineCode3 = stripeError6 != null ? stripeError6.getDeclineCode() : null;
            StripeError stripeError7 = authenticationException.getStripeError();
            String type3 = stripeError7 != null ? stripeError7.getType() : null;
            StripeError stripeError8 = authenticationException.getStripeError();
            if (stripeError8 != null) {
                code3 = stripeError8.getCode();
            }
            return mapError(code, message3, localizedMessage3, declineCode3, type3, code3);
        }
        if (error instanceof APIException) {
            String message4 = error.getMessage();
            APIException aPIException = (APIException) error;
            String localizedMessage4 = aPIException.getLocalizedMessage();
            StripeError stripeError9 = aPIException.getStripeError();
            String declineCode4 = stripeError9 != null ? stripeError9.getDeclineCode() : null;
            StripeError stripeError10 = aPIException.getStripeError();
            String type4 = stripeError10 != null ? stripeError10.getType() : null;
            StripeError stripeError11 = aPIException.getStripeError();
            if (stripeError11 != null) {
                code3 = stripeError11.getCode();
            }
            return mapError(code, message4, localizedMessage4, declineCode4, type4, code3);
        }
        String message5 = error.getMessage();
        String localizedMessage5 = error.getLocalizedMessage();
        if (localizedMessage5 == null) {
            localizedMessage5 = "";
        }
        return mapError(code, message5, localizedMessage5, null, null, null);
    }

    public static final WritableMap createError(String code, Throwable error) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(error, "error");
        Exception exc = error instanceof Exception ? (Exception) error : null;
        if (exc != null) {
            return createError(code, exc);
        }
        return mapError(code, error.getMessage(), error.getLocalizedMessage(), null, null, null);
    }

    public static final WritableMap createMissingInitError() {
        return createError(ErrorType.Failed.toString(), "Stripe has not been initialized. Initialize Stripe in your app with the StripeProvider component or the initStripe method.");
    }
}
