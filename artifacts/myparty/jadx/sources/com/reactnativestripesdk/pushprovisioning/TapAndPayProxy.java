package com.reactnativestripesdk.pushprovisioning;

import android.app.Activity;
import android.util.Log;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.reactnativestripesdk.utils.ErrorsKt;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TapAndPayProxy.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\u001d\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0012Jk\u0010\u0013\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00052S\u0010\u0016\u001aO\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0015\u0012\u0013\u0018\u00010\u001b¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00010\u001b¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00140\u0017j\u0002`\u001dJ&\u0010\u001e\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0005J\u0012\u0010\"\u001a\u00020\u001b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0002J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/reactnativestripesdk/pushprovisioning/TapAndPayProxy;", "", "<init>", "()V", "TAG", "", "tapAndPayClient", "REQUEST_CODE_TOKENIZE", "", "getTapandPayTokens", "Lcom/google/android/gms/tasks/Task;", "", "activity", "Landroid/app/Activity;", "isTokenInWallet", "", "token", "newLastFour", "isTokenInWallet$stripe_stripe_react_native_release", "findExistingToken", "", "newCardLastFour", "callback", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "isCardInWallet", "Lcom/facebook/react/bridge/WritableMap;", "error", "Lcom/reactnativestripesdk/pushprovisioning/TokenCheckHandler;", "tokenize", "tokenReferenceId", "Lcom/facebook/react/bridge/ReadableMap;", "cardDescription", "mapFromTokenInfo", "mapFromTokenState", "status", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TapAndPayProxy {
    public static final int REQUEST_CODE_TOKENIZE = 90909;
    private static final String TAG = "StripeTapAndPay";
    private static Object tapAndPayClient;
    public static final TapAndPayProxy INSTANCE = new TapAndPayProxy();
    public static final int $stable = 8;

    private TapAndPayProxy() {
    }

    private final Task<List<Object>> getTapandPayTokens(Activity activity) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objInvoke = Class.forName("com.google.android.gms.tapandpay.TapAndPayClient").getMethod("listTokens", new Class[0]).invoke(Class.forName("com.google.android.gms.tapandpay.TapAndPay").getMethod("getClient", Activity.class).invoke(null, activity), new Object[0]);
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type com.google.android.gms.tasks.Task<kotlin.collections.List<kotlin.Any>>");
            return (Task) objInvoke;
        } catch (Exception e) {
            Log.e(TAG, "There was a problem listing tokens with Google TapAndPay: " + e.getMessage());
            return null;
        }
    }

    public final boolean isTokenInWallet$stripe_stripe_react_native_release(Object token, String newLastFour) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(newLastFour, "newLastFour");
        try {
            Object objInvoke = Class.forName("com.google.android.gms.tapandpay.issuer.TokenInfo").getMethod("getFpanLastFour", new Class[0]).invoke(token, new Object[0]);
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.String");
            return Intrinsics.areEqual((String) objInvoke, newLastFour);
        } catch (Exception e) {
            Log.e(TAG, "There was a problem getting the FPAN with Google TapAndPay: " + e.getMessage());
            return false;
        }
    }

    public final void findExistingToken(Activity activity, final String newCardLastFour, final Function3<? super Boolean, ? super WritableMap, ? super WritableMap, Unit> callback) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(newCardLastFour, "newCardLastFour");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Task<List<Object>> tapandPayTokens = getTapandPayTokens(activity);
        if (tapandPayTokens == null) {
            callback.invoke(false, null, ErrorsKt.createError(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Google TapAndPay dependency not found."));
        } else {
            tapandPayTokens.addOnCompleteListener(new OnCompleteListener() { // from class: com.reactnativestripesdk.pushprovisioning.TapAndPayProxy$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    TapAndPayProxy.findExistingToken$lambda$0(newCardLastFour, callback, task);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void findExistingToken$lambda$0(String str, Function3 function3, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            for (Object obj : (List) task.getResult()) {
                TapAndPayProxy tapAndPayProxy = INSTANCE;
                if (tapAndPayProxy.isTokenInWallet$stripe_stripe_react_native_release(obj, str)) {
                    function3.invoke(true, tapAndPayProxy.mapFromTokenInfo(obj), null);
                    return;
                }
            }
        } else {
            Log.e(TAG, "Unable to fetch existing tokens from Google TapAndPay.");
        }
        function3.invoke(false, null, null);
    }

    public final void tokenize(Activity activity, String tokenReferenceId, ReadableMap token, String cardDescription) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(tokenReferenceId, "tokenReferenceId");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(cardDescription, "cardDescription");
        try {
            Class.forName("com.google.android.gms.tapandpay.TapAndPayClient").getClass().getMethod("tokenize", Activity.class, String.class, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE).invoke(tapAndPayClient, activity, tokenReferenceId, Integer.valueOf(token.getInt("serviceProvider")), cardDescription, Integer.valueOf(token.getInt("network")), Integer.valueOf(REQUEST_CODE_TOKENIZE));
        } catch (Exception e) {
            Log.e(TAG, "There was a problem tokenizing with Google TapAndPay: " + e.getMessage());
        }
    }

    private final WritableMap mapFromTokenInfo(Object token) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (token != null) {
            try {
                Class<?> cls = Class.forName("com.google.android.gms.tapandpay.issuer.TokenInfo");
                Object objInvoke = cls.getMethod("getIssuerTokenId", new Class[0]).invoke(token, new Object[0]);
                Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.String");
                writableNativeMap.putString("id", (String) objInvoke);
                Object objInvoke2 = cls.getMethod("getFpanLastFour", new Class[0]).invoke(token, new Object[0]);
                Intrinsics.checkNotNull(objInvoke2, "null cannot be cast to non-null type kotlin.String");
                String str = (String) objInvoke2;
                writableNativeMap.putString("cardLastFour", str);
                writableNativeMap.putString("fpanLastFour", str);
                Object objInvoke3 = cls.getMethod("getDpanLastFour", new Class[0]).invoke(token, new Object[0]);
                Intrinsics.checkNotNull(objInvoke3, "null cannot be cast to non-null type kotlin.String");
                writableNativeMap.putString("dpanLastFour", (String) objInvoke3);
                Object objInvoke4 = cls.getMethod("getIssuerName", new Class[0]).invoke(token, new Object[0]);
                Intrinsics.checkNotNull(objInvoke4, "null cannot be cast to non-null type kotlin.String");
                writableNativeMap.putString("issuer", (String) objInvoke4);
                TapAndPayProxy tapAndPayProxy = INSTANCE;
                Object objInvoke5 = cls.getMethod("getTokenState", new Class[0]).invoke(token, new Object[0]);
                Intrinsics.checkNotNull(objInvoke5, "null cannot be cast to non-null type kotlin.Int");
                writableNativeMap.putString("status", tapAndPayProxy.mapFromTokenState(((Integer) objInvoke5).intValue()));
                Object objInvoke6 = cls.getMethod("getNetwork", new Class[0]).invoke(token, new Object[0]);
                Intrinsics.checkNotNull(objInvoke6, "null cannot be cast to non-null type kotlin.Int");
                writableNativeMap.putInt("network", ((Integer) objInvoke6).intValue());
                Object objInvoke7 = cls.getMethod("getTokenServiceProvider", new Class[0]).invoke(token, new Object[0]);
                Intrinsics.checkNotNull(objInvoke7, "null cannot be cast to non-null type kotlin.Int");
                writableNativeMap.putInt("serviceProvider", ((Integer) objInvoke7).intValue());
                Unit unit = Unit.INSTANCE;
            } catch (Exception e) {
                Integer.valueOf(Log.e(TAG, "There was a problem mapping the token information with Google TapAndPay: " + e.getMessage()));
            }
        }
        return writableNativeMap;
    }

    private final String mapFromTokenState(int status) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException {
        try {
            Class<?> cls = Class.forName("com.google.android.gms.tapandpay.TapAndPay");
            Object obj = cls.getField("TOKEN_STATE_NEEDS_IDENTITY_VERIFICATION").get(cls);
            if ((obj instanceof Integer) && status == ((Number) obj).intValue()) {
                return "TOKEN_STATE_NEEDS_IDENTITY_VERIFICATION";
            }
            Object obj2 = cls.getField("TOKEN_STATE_PENDING").get(cls);
            if ((obj2 instanceof Integer) && status == ((Number) obj2).intValue()) {
                return "TOKEN_STATE_PENDING";
            }
            Object obj3 = cls.getField("TOKEN_STATE_SUSPENDED").get(cls);
            if ((obj3 instanceof Integer) && status == ((Number) obj3).intValue()) {
                return "TOKEN_STATE_SUSPENDED";
            }
            Object obj4 = cls.getField("TOKEN_STATE_ACTIVE").get(cls);
            if ((obj4 instanceof Integer) && status == ((Number) obj4).intValue()) {
                return "TOKEN_STATE_ACTIVE";
            }
            Object obj5 = cls.getField("TOKEN_STATE_FELICA_PENDING_PROVISIONING").get(cls);
            if ((obj5 instanceof Integer) && status == ((Number) obj5).intValue()) {
                return "TOKEN_STATE_FELICA_PENDING_PROVISIONING";
            }
            Object obj6 = cls.getField("TOKEN_STATE_UNTOKENIZED").get(cls);
            if (obj6 instanceof Integer) {
                if (status == ((Number) obj6).intValue()) {
                    return "TOKEN_STATE_UNTOKENIZED";
                }
            }
            return "UNKNOWN";
        } catch (Exception e) {
            Log.e(TAG, "There was a problem mapping the token state with Google TapAndPay: " + e.getMessage());
            return "UNKNOWN";
        }
    }
}
