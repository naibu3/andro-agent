package com.stripe.android;

import android.content.Intent;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.Source;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.WeChatPayNextAction;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* compiled from: PaymentController.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001=J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH¦@¢\u0006\u0002\u0010\nJ.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tH¦@¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH¦@¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001cH¦@¢\u0006\u0002\u0010\u001dJ&\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\b\u001a\u00020\tH¦@¢\u0006\u0002\u0010!J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H&J\u001a\u0010(\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H&J\u001a\u0010)\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H&J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010&\u001a\u00020'H¦@¢\u0006\u0004\b+\u0010,J\u001e\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\f2\u0006\u0010&\u001a\u00020'H¦@¢\u0006\u0004\b/\u0010,J\u001e\u00100\u001a\b\u0012\u0004\u0012\u00020 0\f2\u0006\u0010&\u001a\u00020'H¦@¢\u0006\u0004\b1\u0010,J&\u00102\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u00103\u001a\u0002042\u0006\u0010\b\u001a\u00020\tH¦@¢\u0006\u0002\u00105J\u001e\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u0002082\f\u00109\u001a\b\u0012\u0004\u0012\u00020;0:H&J\b\u0010<\u001a\u00020\u0003H&¨\u0006>"}, d2 = {"Lcom/stripe/android/PaymentController;", "", "startConfirmAndAuth", "", "host", "Lcom/stripe/android/view/AuthActivityStarterHost;", "confirmStripeIntentParams", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/ConfirmStripeIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmAndAuthenticateAlipay", "Lkotlin/Result;", "Lcom/stripe/android/PaymentIntentResult;", "confirmPaymentIntentParams", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "authenticator", "Lcom/stripe/android/AlipayAuthenticator;", "confirmAndAuthenticateAlipay-BWLJW6A", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/AlipayAuthenticator;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmWeChatPay", "Lcom/stripe/android/model/WeChatPayNextAction;", "confirmWeChatPay-0E7RQCE", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startAuth", "clientSecret", "", "type", "Lcom/stripe/android/PaymentController$StripeIntentType;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/PaymentController$StripeIntentType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startAuthenticateSource", "source", "Lcom/stripe/android/model/Source;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/Source;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldHandlePaymentResult", "", "requestCode", "", "data", "Landroid/content/Intent;", "shouldHandleSetupResult", "shouldHandleSourceResult", "getPaymentIntentResult", "getPaymentIntentResult-gIAlu-s", "(Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSetupIntentResult", "Lcom/stripe/android/SetupIntentResult;", "getSetupIntentResult-gIAlu-s", "getAuthenticateSourceResult", "getAuthenticateSourceResult-gIAlu-s", "handleNextAction", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerLaunchersWithActivityResultCaller", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "activityResultCallback", "Landroidx/activity/result/ActivityResultCallback;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "unregisterLaunchers", "StripeIntentType", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface PaymentController {
    /* renamed from: confirmAndAuthenticateAlipay-BWLJW6A, reason: not valid java name */
    Object mo7195confirmAndAuthenticateAlipayBWLJW6A(ConfirmPaymentIntentParams confirmPaymentIntentParams, AlipayAuthenticator alipayAuthenticator, ApiRequest.Options options, Continuation<? super Result<PaymentIntentResult>> continuation);

    /* renamed from: confirmWeChatPay-0E7RQCE, reason: not valid java name */
    Object mo7196confirmWeChatPay0E7RQCE(ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiRequest.Options options, Continuation<? super Result<WeChatPayNextAction>> continuation);

    /* renamed from: getAuthenticateSourceResult-gIAlu-s, reason: not valid java name */
    Object mo7197getAuthenticateSourceResultgIAlus(Intent intent, Continuation<? super Result<Source>> continuation);

    /* renamed from: getPaymentIntentResult-gIAlu-s, reason: not valid java name */
    Object mo7198getPaymentIntentResultgIAlus(Intent intent, Continuation<? super Result<PaymentIntentResult>> continuation);

    /* renamed from: getSetupIntentResult-gIAlu-s, reason: not valid java name */
    Object mo7199getSetupIntentResultgIAlus(Intent intent, Continuation<? super Result<SetupIntentResult>> continuation);

    Object handleNextAction(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, Continuation<? super Unit> continuation);

    void registerLaunchersWithActivityResultCaller(ActivityResultCaller activityResultCaller, ActivityResultCallback<PaymentFlowResult.Unvalidated> activityResultCallback);

    boolean shouldHandlePaymentResult(int requestCode, Intent data);

    boolean shouldHandleSetupResult(int requestCode, Intent data);

    boolean shouldHandleSourceResult(int requestCode, Intent data);

    Object startAuth(AuthActivityStarterHost authActivityStarterHost, String str, ApiRequest.Options options, StripeIntentType stripeIntentType, Continuation<? super Unit> continuation);

    Object startAuthenticateSource(AuthActivityStarterHost authActivityStarterHost, Source source, ApiRequest.Options options, Continuation<? super Unit> continuation);

    Object startConfirmAndAuth(AuthActivityStarterHost authActivityStarterHost, ConfirmStripeIntentParams confirmStripeIntentParams, ApiRequest.Options options, Continuation<? super Unit> continuation);

    void unregisterLaunchers();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaymentController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/PaymentController$StripeIntentType;", "", "<init>", "(Ljava/lang/String;I)V", "PaymentIntent", "SetupIntent", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StripeIntentType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StripeIntentType[] $VALUES;
        public static final StripeIntentType PaymentIntent = new StripeIntentType("PaymentIntent", 0);
        public static final StripeIntentType SetupIntent = new StripeIntentType("SetupIntent", 1);

        private static final /* synthetic */ StripeIntentType[] $values() {
            return new StripeIntentType[]{PaymentIntent, SetupIntent};
        }

        public static EnumEntries<StripeIntentType> getEntries() {
            return $ENTRIES;
        }

        private StripeIntentType(String str, int i) {
        }

        static {
            StripeIntentType[] stripeIntentTypeArr$values = $values();
            $VALUES = stripeIntentTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(stripeIntentTypeArr$values);
        }

        public static StripeIntentType valueOf(String str) {
            return (StripeIntentType) Enum.valueOf(StripeIntentType.class, str);
        }

        public static StripeIntentType[] values() {
            return (StripeIntentType[]) $VALUES.clone();
        }
    }
}
