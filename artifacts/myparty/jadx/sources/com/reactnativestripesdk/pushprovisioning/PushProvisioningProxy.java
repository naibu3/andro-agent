package com.reactnativestripesdk.pushprovisioning;

import android.app.Activity;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.util.Log;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.reactnativestripesdk.utils.ErrorsKt;
import com.stripe.android.pushProvisioning.PushProvisioningActivityStarter;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: PushProvisioningProxy.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ0\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\bJk\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052S\u0010\u0019\u001aO\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0015\u0012\u0015\u0012\u0013\u0018\u00010\u001d¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0014\u0012\u0015\u0012\u0013\u0018\u00010\u001d¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u000f0\u001aj\u0002`\u001fJ\u0018\u0010 \u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy;", "", "<init>", "()V", "TAG", "", "description", "tokenRequiringTokenization", "Lcom/facebook/react/bridge/ReadableMap;", "getApiVersion", "isNFCEnabled", "", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "invoke", "", ViewHierarchyConstants.VIEW_KEY, "Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;", "cardDescription", "ephemeralKey", "token", "isCardInWallet", "activity", "Landroid/app/Activity;", "cardLastFour", "callback", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Lcom/facebook/react/bridge/WritableMap;", "error", "Lcom/reactnativestripesdk/pushprovisioning/TokenCheckHandler;", "createActivityEventListener", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PushProvisioningProxy {
    private static final String TAG = "StripePushProvisioning";
    private static ReadableMap tokenRequiringTokenization;
    public static final PushProvisioningProxy INSTANCE = new PushProvisioningProxy();
    private static String description = "Added by Stripe";
    public static final int $stable = 8;

    private PushProvisioningProxy() {
    }

    public final String getApiVersion() throws ClassNotFoundException {
        try {
            Class.forName("com.stripe.android.pushProvisioning.PushProvisioningActivity");
            return "2019-09-09";
        } catch (Exception unused) {
            Log.e(TAG, "PushProvisioning dependency not found");
            return "";
        }
    }

    public final boolean isNFCEnabled(ReactApplicationContext context) {
        NfcAdapter defaultAdapter;
        Intrinsics.checkNotNullParameter(context, "context");
        if (!context.getPackageManager().hasSystemFeature("android.hardware.nfc") || (defaultAdapter = NfcAdapter.getDefaultAdapter(context)) == null) {
            return false;
        }
        return defaultAdapter.isEnabled();
    }

    public final void invoke(ReactApplicationContext context, AddToWalletButtonView view, String cardDescription, String ephemeralKey, ReadableMap token) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(cardDescription, "cardDescription");
        Intrinsics.checkNotNullParameter(ephemeralKey, "ephemeralKey");
        try {
            Class.forName("com.stripe.android.pushProvisioning.PushProvisioningActivityStarter");
            description = cardDescription;
            tokenRequiringTokenization = token;
            createActivityEventListener(context, view);
            Activity currentActivity = context.getCurrentActivity();
            if (currentActivity != null) {
                new DefaultPushProvisioningProxy().beginPushProvisioning(currentActivity, description, new EphemeralKeyProvider(ephemeralKey));
            } else {
                PushProvisioningProxy pushProvisioningProxy = this;
                view.dispatchEvent(ErrorsKt.createError(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Activity doesn't exist yet. You can safely retry."));
            }
        } catch (Exception e) {
            Log.e(TAG, "There was a problem using Stripe Android PushProvisioning: " + e.getMessage());
        }
    }

    public final void isCardInWallet(Activity activity, String cardLastFour, Function3<? super Boolean, ? super WritableMap, ? super WritableMap, Unit> callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(cardLastFour, "cardLastFour");
        Intrinsics.checkNotNullParameter(callback, "callback");
        TapAndPayProxy.INSTANCE.findExistingToken(activity, cardLastFour, callback);
    }

    private final void createActivityEventListener(ReactApplicationContext context, final AddToWalletButtonView view) {
        context.addActivityEventListener(new BaseActivityEventListener() { // from class: com.reactnativestripesdk.pushprovisioning.PushProvisioningProxy$createActivityEventListener$listener$1
            @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
            public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                Intrinsics.checkNotNullParameter(activity, "activity");
                super.onActivityResult(activity, requestCode, resultCode, data);
                if (requestCode != 8000) {
                    if (requestCode != 90909) {
                        return;
                    }
                    view.dispatchEvent(resultCode != -1 ? ErrorsKt.mapError(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Failed to verify identity.", null, null, null, null) : null);
                    return;
                }
                if (resultCode != -1) {
                    if (resultCode == 500 && data != null) {
                        AddToWalletButtonView addToWalletButtonView = view;
                        PushProvisioningActivityStarter.Error errorFromIntent = PushProvisioningActivityStarter.Error.fromIntent(data);
                        Intrinsics.checkNotNullExpressionValue(errorFromIntent, "fromIntent(...)");
                        addToWalletButtonView.dispatchEvent(ErrorsKt.mapError(errorFromIntent.code.toString(), errorFromIntent.message, null, null, null, null));
                        return;
                    }
                    return;
                }
                ReadableMap readableMap = PushProvisioningProxy.tokenRequiringTokenization;
                if (readableMap != null) {
                    AddToWalletButtonView addToWalletButtonView2 = view;
                    String string = readableMap.getString("id");
                    String str = string;
                    if (str == null || StringsKt.isBlank(str)) {
                        addToWalletButtonView2.dispatchEvent(ErrorsKt.mapError(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Token object passed to `<AddToWalletButton />` is missing the `id` field.", null, null, null, null));
                        return;
                    } else {
                        TapAndPayProxy.INSTANCE.tokenize(activity, string, readableMap, PushProvisioningProxy.description);
                        return;
                    }
                }
                view.dispatchEvent(null);
            }
        });
    }
}
